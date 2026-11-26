package tf;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

public final class c3 extends d0 {
    public final b3 D;
    public e0 E;
    public volatile Boolean F;
    public final z2 G;
    public ScheduledExecutorService H;
    public final a8.i0 I;
    public final ArrayList J;
    public final z2 K;

    public c3(h1 h1Var) {
        super(h1Var);
        this.J = new ArrayList();
        this.I = new a8.i0(h1Var.K);
        this.D = new b3(this);
        this.G = new z2(this, h1Var, 0);
        this.K = new z2(this, h1Var, 1);
    }

    @Override
    public final boolean Y0() {
        return false;
    }

    public final void Z0(AtomicReference atomicReference) {
        V0();
        W0();
        j1(new ca.u(this, atomicReference, l1(false)));
    }

    public final void a1(Bundle bundle) {
        boolean z10;
        boolean zC1;
        V0();
        W0();
        r rVar = new r(bundle);
        h1();
        h1 h1Var = (h1) this.B;
        if (h1Var.D.f1(null, b0.f14550b1)) {
            l0 l0VarI = h1Var.i();
            h1 h1Var2 = (h1) l0VarI.B;
            e4 e4Var = h1Var2.I;
            q0 q0Var = h1Var2.F;
            h1.e(e4Var);
            byte[] bArrZ1 = e4.z1(rVar);
            if (bArrZ1 == null) {
                h1.g(q0Var);
                q0Var.H.b("Null default event parameters; not writing to database");
            } else {
                if (bArrZ1.length > 131072) {
                    h1.g(q0Var);
                    q0Var.H.b("Default event parameters too long for local database. Sending directly to service");
                } else {
                    zC1 = l0VarI.c1(4, bArrZ1);
                }
                if (zC1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            zC1 = false;
            if (zC1) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        j1(new z1(this, l1(false), z10, rVar, bundle));
    }

    public final void b1() {
        V0();
        W0();
        if (m1()) {
            return;
        }
        if (c1()) {
            b3 b3Var = this.D;
            c3 c3Var = b3Var.C;
            c3Var.V0();
            Context context = ((h1) c3Var.B).A;
            synchronized (b3Var) {
                try {
                    if (b3Var.A) {
                        q0 q0Var = ((h1) b3Var.C.B).F;
                        h1.g(q0Var);
                        q0Var.O.b("Connection attempt already in progress");
                        return;
                    } else {
                        if (b3Var.B != null && (b3Var.B.isConnecting() || b3Var.B.isConnected())) {
                            q0 q0Var2 = ((h1) b3Var.C.B).F;
                            h1.g(q0Var2);
                            q0Var2.O.b("Already awaiting connection attempt");
                            return;
                        }
                        b3Var.B = new n0(context, Looper.getMainLooper(), com.google.android.gms.common.internal.l.a(context), pe.f.f12493b, 93, b3Var, b3Var, null);
                        q0 q0Var3 = ((h1) b3Var.C.B).F;
                        h1.g(q0Var3);
                        q0Var3.O.b("Connecting to remote service");
                        b3Var.A = true;
                        com.google.android.gms.common.internal.d0.h(b3Var.B);
                        b3Var.B.checkAvailabilityAndConnect();
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        h1 h1Var = (h1) this.B;
        if (h1Var.D.Y0()) {
            return;
        }
        List<ResolveInfo> listQueryIntentServices = h1Var.A.getPackageManager().queryIntentServices(new Intent().setClassName(h1Var.A, "com.google.android.gms.measurement.AppMeasurementService"), Cast.MAX_MESSAGE_LENGTH);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            q0 q0Var4 = h1Var.F;
            h1.g(q0Var4);
            q0Var4.G.b("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(h1Var.A, "com.google.android.gms.measurement.AppMeasurementService"));
        b3 b3Var2 = this.D;
        c3 c3Var2 = b3Var2.C;
        c3Var2.V0();
        Context context2 = ((h1) c3Var2.B).A;
        ue.a aVarB = ue.a.b();
        synchronized (b3Var2) {
            try {
                if (b3Var2.A) {
                    q0 q0Var5 = ((h1) b3Var2.C.B).F;
                    h1.g(q0Var5);
                    q0Var5.O.b("Connection attempt already in progress");
                } else {
                    c3 c3Var3 = b3Var2.C;
                    q0 q0Var6 = ((h1) c3Var3.B).F;
                    h1.g(q0Var6);
                    q0Var6.O.b("Using local app measurement service");
                    b3Var2.A = true;
                    aVarB.a(context2, intent, c3Var3.D, 129);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final boolean c1() {
        V0();
        W0();
        if (this.F == null) {
            V0();
            W0();
            h1 h1Var = (h1) this.B;
            w0 w0Var = h1Var.E;
            h1.e(w0Var);
            w0Var.V0();
            boolean z10 = false;
            Boolean boolValueOf = !w0Var.Z0().contains("use_service") ? null : Boolean.valueOf(w0Var.Z0().getBoolean("use_service", false));
            boolean z11 = true;
            if (boolValueOf == null || !boolValueOf.booleanValue()) {
                j0 j0VarL = ((h1) this.B).l();
                j0VarL.W0();
                if (j0VarL.N == 1) {
                    z10 = true;
                } else {
                    q0 q0Var = h1Var.F;
                    h1.g(q0Var);
                    q0Var.O.b("Checking service availability");
                    e4 e4Var = h1Var.I;
                    h1.e(e4Var);
                    int iB = pe.f.f12493b.b(((h1) e4Var.B).A, 12451000);
                    if (iB == 0) {
                        q0 q0Var2 = h1Var.F;
                        h1.g(q0Var2);
                        q0Var2.O.b("Service available");
                    } else if (iB == 1) {
                        q0 q0Var3 = h1Var.F;
                        h1.g(q0Var3);
                        q0Var3.O.b("Service missing");
                    } else if (iB != 2) {
                        if (iB == 3) {
                            q0 q0Var4 = h1Var.F;
                            h1.g(q0Var4);
                            q0Var4.J.b("Service disabled");
                        } else if (iB == 9) {
                            q0 q0Var5 = h1Var.F;
                            h1.g(q0Var5);
                            q0Var5.J.b("Service invalid");
                        } else if (iB != 18) {
                            q0 q0Var6 = h1Var.F;
                            h1.g(q0Var6);
                            q0Var6.J.c(Integer.valueOf(iB), "Unexpected service status");
                        } else {
                            q0 q0Var7 = h1Var.F;
                            h1.g(q0Var7);
                            q0Var7.J.b("Service updating");
                        }
                        z11 = false;
                    } else {
                        q0 q0Var8 = h1Var.F;
                        h1.g(q0Var8);
                        q0Var8.N.b("Service container out of date");
                        e4 e4Var2 = h1Var.I;
                        h1.e(e4Var2);
                        if (e4Var2.B1() >= 17443) {
                            z10 = boolValueOf == null;
                            z11 = false;
                        }
                    }
                    z10 = true;
                }
                if (!z10 && h1Var.D.Y0()) {
                    q0 q0Var9 = h1Var.F;
                    h1.g(q0Var9);
                    q0Var9.G.b("No way to upload. Consider using the full version of Analytics");
                } else if (z11) {
                    w0 w0Var2 = h1Var.E;
                    h1.e(w0Var2);
                    w0Var2.V0();
                    SharedPreferences.Editor editorEdit = w0Var2.Z0().edit();
                    editorEdit.putBoolean("use_service", z10);
                    editorEdit.apply();
                }
                z11 = z10;
            }
            this.F = Boolean.valueOf(z11);
        }
        return this.F.booleanValue();
    }

    public final void d1() {
        V0();
        W0();
        b3 b3Var = this.D;
        if (b3Var.B != null && (b3Var.B.isConnected() || b3Var.B.isConnecting())) {
            b3Var.B.disconnect();
        }
        b3Var.B = null;
        try {
            ue.a.b().c(((h1) this.B).A, b3Var);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.E = null;
    }

    public final boolean e1() {
        V0();
        W0();
        if (!c1()) {
            return true;
        }
        e4 e4Var = ((h1) this.B).I;
        h1.e(e4Var);
        return e4Var.B1() >= ((Integer) b0.J0.a(null)).intValue();
    }

    public final boolean f1() {
        V0();
        W0();
        if (!c1()) {
            return true;
        }
        e4 e4Var = ((h1) this.B).I;
        h1.e(e4Var);
        return e4Var.B1() >= 241200;
    }

    public final void g1(ComponentName componentName) {
        V0();
        if (this.E != null) {
            this.E = null;
            q0 q0Var = ((h1) this.B).F;
            h1.g(q0Var);
            q0Var.O.c(componentName, "Disconnected from device MeasurementService");
            V0();
            b1();
        }
    }

    public final void h1() {
        ((h1) this.B).getClass();
    }

    public final void i1() {
        V0();
        a8.i0 i0Var = this.I;
        ((ve.b) ((ve.a) i0Var.C)).getClass();
        i0Var.B = SystemClock.elapsedRealtime();
        ((h1) this.B).getClass();
        this.G.b(((Long) b0.Y.a(null)).longValue());
    }

    public final void j1(Runnable runnable) {
        V0();
        if (m1()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.J;
        long size = arrayList.size();
        h1 h1Var = (h1) this.B;
        h1Var.getClass();
        if (size >= 1000) {
            q0 q0Var = h1Var.F;
            h1.g(q0Var);
            q0Var.G.b("Discarding data. Max runnable queue size reached");
        } else {
            arrayList.add(runnable);
            this.K.b(60000L);
            b1();
        }
    }

    public final void k1() {
        V0();
        h1 h1Var = (h1) this.B;
        q0 q0Var = h1Var.F;
        h1.g(q0Var);
        b50.b bVar = q0Var.O;
        ArrayList arrayList = this.J;
        bVar.c(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e3) {
                q0 q0Var2 = h1Var.F;
                h1.g(q0Var2);
                q0Var2.G.c(e3, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.K.c();
    }

    public final g4 l1(boolean z10) {
        long jAbs;
        Pair pair;
        h1 h1Var = (h1) this.B;
        h1Var.getClass();
        j0 j0VarL = h1Var.l();
        String strL = null;
        if (z10) {
            q0 q0Var = h1Var.F;
            h1.g(q0Var);
            h1 h1Var2 = (h1) q0Var.B;
            w0 w0Var = h1Var2.E;
            h1.e(w0Var);
            if (w0Var.F != null) {
                w0 w0Var2 = h1Var2.E;
                h1.e(w0Var2);
                bb.d dVar = w0Var2.F;
                w0 w0Var3 = (w0) dVar.E;
                w0Var3.V0();
                w0Var3.V0();
                long j9 = ((w0) dVar.E).Z0().getLong((String) dVar.B, 0L);
                if (j9 == 0) {
                    dVar.A();
                    jAbs = 0;
                } else {
                    ((h1) w0Var3.B).K.getClass();
                    jAbs = Math.abs(j9 - System.currentTimeMillis());
                }
                long j10 = dVar.A;
                if (jAbs < j10) {
                    pair = null;
                } else if (jAbs > j10 + j10) {
                    dVar.A();
                    pair = null;
                } else {
                    String string = w0Var3.Z0().getString((String) dVar.D, null);
                    long j11 = w0Var3.Z0().getLong((String) dVar.C, 0L);
                    dVar.A();
                    pair = (string == null || j11 <= 0) ? w0.f14748a0 : new Pair(string, Long.valueOf(j11));
                }
                if (pair != null && pair != w0.f14748a0) {
                    String strValueOf = String.valueOf(pair.second);
                    String str = (String) pair.first;
                    strL = w.c.l(new StringBuilder(strValueOf.length() + 1 + String.valueOf(str).length()), strValueOf, ":", str);
                }
            }
        }
        return j0VarL.Z0(strL);
    }

    public final boolean m1() {
        V0();
        W0();
        return this.E != null;
    }

    public final void n1(e0 e0Var, re.a aVar, g4 g4Var) throws Throwable {
        ArrayList arrayList;
        h1 h1Var;
        Context context;
        q0 q0Var;
        int i10;
        SQLiteDatabase sQLiteDatabaseB1;
        int i11;
        int i12;
        Cursor cursor;
        Cursor cursorQuery;
        Cursor cursorQuery2;
        long j9;
        String str;
        String[] strArr;
        int i13;
        long j10;
        String string;
        r rVarCreateFromParcel;
        int i14;
        e eVarCreateFromParcel;
        b4 b4VarCreateFromParcel;
        int size;
        String str2;
        boolean zF1;
        int size2;
        int i15;
        k0 k0Var;
        re.a aVar2;
        a0 a0Var;
        h1 h1Var2;
        Context context2;
        q0 q0Var2;
        boolean z10;
        String str3;
        long jElapsedRealtime;
        long j11;
        long jCurrentTimeMillis;
        String str4;
        V0();
        W0();
        h1();
        h1 h1Var3 = (h1) this.B;
        h1Var3.getClass();
        Context context3 = h1Var3.A;
        q0 q0Var3 = h1Var3.F;
        ve.b bVar = h1Var3.K;
        g gVar = h1Var3.D;
        g4 g4Var2 = g4Var;
        int i16 = 100;
        int i17 = 0;
        for (int i18 = 100; i17 < 1001 && i16 == i18; i18 = 100) {
            ArrayList arrayList2 = new ArrayList();
            l0 l0VarI = h1Var3.i();
            String str5 = "entry";
            int i19 = i18;
            String str6 = "type";
            String str7 = "rowid";
            ve.b bVar2 = bVar;
            h1 h1Var4 = (h1) l0VarI.B;
            l0VarI.V0();
            int i20 = i17;
            if (l0VarI.E) {
                h1Var = h1Var3;
                context = context3;
                q0Var = q0Var3;
            } else {
                arrayList = new ArrayList();
                h1Var = h1Var3;
                if (((h1) l0VarI.B).A.getDatabasePath("google_app_measurement_local.db").exists()) {
                    int i21 = 5;
                    context = context3;
                    q0Var = q0Var3;
                    int i22 = 0;
                    int i23 = 5;
                    while (true) {
                        if (i22 < i21) {
                            try {
                                sQLiteDatabaseB1 = l0VarI.b1();
                                if (sQLiteDatabaseB1 == null) {
                                    try {
                                        try {
                                            l0VarI.E = true;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            sQLiteDatabaseB1 = sQLiteDatabaseB1;
                                            cursor = null;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabaseB1 != null) {
                                                sQLiteDatabaseB1.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteDatabaseLockedException unused) {
                                        i11 = i22;
                                        str7 = str7;
                                        i12 = 5;
                                        str6 = str6;
                                        cursorQuery = null;
                                        try {
                                            SystemClock.sleep(i23);
                                            i23 += 20;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            if (sQLiteDatabaseB1 != null) {
                                                sQLiteDatabaseB1.close();
                                            }
                                            i22 = i11 + 1;
                                            i21 = i12;
                                            str6 = str6;
                                            str5 = str5;
                                            str7 = str7;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            cursor = cursorQuery;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabaseB1 != null) {
                                                sQLiteDatabaseB1.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteFullException e3) {
                                        e = e3;
                                        i11 = i22;
                                        str7 = str7;
                                        i12 = 5;
                                        str6 = str6;
                                        cursorQuery = null;
                                        q0 q0Var4 = h1Var4.F;
                                        h1.g(q0Var4);
                                        q0Var4.G.c(e, "Error reading entries from local database");
                                        l0VarI.E = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseB1 != null) {
                                            sQLiteDatabaseB1.close();
                                        }
                                        i22 = i11 + 1;
                                        i21 = i12;
                                        str6 = str6;
                                        str5 = str5;
                                        str7 = str7;
                                    } catch (SQLiteException e10) {
                                        e = e10;
                                        i11 = i22;
                                        str7 = str7;
                                        i12 = 5;
                                        str6 = str6;
                                        cursorQuery = null;
                                        if (sQLiteDatabaseB1 != null) {
                                            sQLiteDatabaseB1.endTransaction();
                                        }
                                        q0 q0Var5 = h1Var4.F;
                                        h1.g(q0Var5);
                                        q0Var5.G.c(e, "Error reading entries from local database");
                                        l0VarI.E = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseB1 != null) {
                                            sQLiteDatabaseB1.close();
                                        }
                                        i22 = i11 + 1;
                                        i21 = i12;
                                        str6 = str6;
                                        str5 = str5;
                                        str7 = str7;
                                    }
                                } else {
                                    sQLiteDatabaseB1.beginTransaction();
                                    try {
                                        cursorQuery2 = sQLiteDatabaseB1.query("messages", new String[]{str7}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                                        try {
                                            long j12 = -1;
                                            if (cursorQuery2.moveToFirst()) {
                                                i11 = i22;
                                                try {
                                                    j9 = cursorQuery2.getLong(0);
                                                    try {
                                                        cursorQuery2.close();
                                                    } catch (SQLiteDatabaseLockedException unused2) {
                                                        str7 = str7;
                                                        i12 = 5;
                                                        str6 = str6;
                                                        cursorQuery = null;
                                                        SystemClock.sleep(i23);
                                                        i23 += 20;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseB1 != null) {
                                                            sQLiteDatabaseB1.close();
                                                        }
                                                        i22 = i11 + 1;
                                                        i21 = i12;
                                                        str6 = str6;
                                                        str5 = str5;
                                                        str7 = str7;
                                                    } catch (SQLiteFullException e11) {
                                                        e = e11;
                                                        str7 = str7;
                                                        i12 = 5;
                                                        str6 = str6;
                                                        cursorQuery = null;
                                                        q0 q0Var6 = h1Var4.F;
                                                        h1.g(q0Var6);
                                                        q0Var6.G.c(e, "Error reading entries from local database");
                                                        l0VarI.E = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseB1 != null) {
                                                            sQLiteDatabaseB1.close();
                                                        }
                                                        i22 = i11 + 1;
                                                        i21 = i12;
                                                        str6 = str6;
                                                        str5 = str5;
                                                        str7 = str7;
                                                    } catch (SQLiteException e12) {
                                                        e = e12;
                                                        str7 = str7;
                                                        i12 = 5;
                                                        str6 = str6;
                                                        cursorQuery = null;
                                                        if (sQLiteDatabaseB1 != null && sQLiteDatabaseB1.inTransaction()) {
                                                            sQLiteDatabaseB1.endTransaction();
                                                        }
                                                        q0 q0Var7 = h1Var4.F;
                                                        h1.g(q0Var7);
                                                        q0Var7.G.c(e, "Error reading entries from local database");
                                                        l0VarI.E = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseB1 != null) {
                                                            sQLiteDatabaseB1.close();
                                                        }
                                                        i22 = i11 + 1;
                                                        i21 = i12;
                                                        str6 = str6;
                                                        str5 = str5;
                                                        str7 = str7;
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    i12 = 5;
                                                    if (cursorQuery2 != null) {
                                                        try {
                                                            cursorQuery2.close();
                                                        } catch (SQLiteDatabaseLockedException unused3) {
                                                            cursorQuery = null;
                                                            SystemClock.sleep(i23);
                                                            i23 += 20;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseB1 != null) {
                                                                sQLiteDatabaseB1.close();
                                                            }
                                                            i22 = i11 + 1;
                                                            i21 = i12;
                                                            str6 = str6;
                                                            str5 = str5;
                                                            str7 = str7;
                                                        } catch (SQLiteFullException e13) {
                                                            e = e13;
                                                            cursorQuery = null;
                                                            q0 q0Var8 = h1Var4.F;
                                                            h1.g(q0Var8);
                                                            q0Var8.G.c(e, "Error reading entries from local database");
                                                            l0VarI.E = true;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseB1 != null) {
                                                                sQLiteDatabaseB1.close();
                                                            }
                                                            i22 = i11 + 1;
                                                            i21 = i12;
                                                            str6 = str6;
                                                            str5 = str5;
                                                            str7 = str7;
                                                        } catch (SQLiteException e14) {
                                                            e = e14;
                                                            cursorQuery = null;
                                                            if (sQLiteDatabaseB1 != null) {
                                                                sQLiteDatabaseB1.endTransaction();
                                                            }
                                                            q0 q0Var9 = h1Var4.F;
                                                            h1.g(q0Var9);
                                                            q0Var9.G.c(e, "Error reading entries from local database");
                                                            l0VarI.E = true;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseB1 != null) {
                                                                sQLiteDatabaseB1.close();
                                                            }
                                                            i22 = i11 + 1;
                                                            i21 = i12;
                                                            str6 = str6;
                                                            str5 = str5;
                                                            str7 = str7;
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            cursor = null;
                                                            if (cursor != null) {
                                                                cursor.close();
                                                            }
                                                            if (sQLiteDatabaseB1 != null) {
                                                                sQLiteDatabaseB1.close();
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                    throw th;
                                                }
                                            } else {
                                                i11 = i22;
                                                cursorQuery2.close();
                                                j9 = -1;
                                            }
                                            if (j9 != -1) {
                                                str = "rowid<?";
                                                strArr = new String[]{String.valueOf(j9)};
                                            } else {
                                                str = null;
                                                strArr = null;
                                            }
                                            try {
                                                String[] strArr2 = {str7, str6, str5};
                                                g gVar2 = h1Var4.D;
                                                a0 a0Var2 = b0.f14550b1;
                                                str7 = str7;
                                                try {
                                                    try {
                                                        int i24 = 4;
                                                        int i25 = 3;
                                                        if (gVar2.f1(null, a0Var2)) {
                                                            i13 = 5;
                                                            try {
                                                                strArr2 = new String[]{str7, str6, str5, "app_version", "app_version_int"};
                                                            } catch (SQLiteDatabaseLockedException unused4) {
                                                                i12 = 5;
                                                                str6 = str6;
                                                                cursorQuery = null;
                                                                SystemClock.sleep(i23);
                                                                i23 += 20;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseB1 != null) {
                                                                    sQLiteDatabaseB1.close();
                                                                }
                                                                i22 = i11 + 1;
                                                                i21 = i12;
                                                                str6 = str6;
                                                                str5 = str5;
                                                                str7 = str7;
                                                            } catch (SQLiteFullException e15) {
                                                                e = e15;
                                                                i12 = 5;
                                                                str6 = str6;
                                                                cursorQuery = null;
                                                                q0 q0Var10 = h1Var4.F;
                                                                h1.g(q0Var10);
                                                                q0Var10.G.c(e, "Error reading entries from local database");
                                                                l0VarI.E = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseB1 != null) {
                                                                    sQLiteDatabaseB1.close();
                                                                }
                                                                i22 = i11 + 1;
                                                                i21 = i12;
                                                                str6 = str6;
                                                                str5 = str5;
                                                                str7 = str7;
                                                            } catch (SQLiteException e16) {
                                                                e = e16;
                                                                i12 = 5;
                                                                str6 = str6;
                                                                cursorQuery = null;
                                                                if (sQLiteDatabaseB1 != null) {
                                                                    sQLiteDatabaseB1.endTransaction();
                                                                }
                                                                q0 q0Var11 = h1Var4.F;
                                                                h1.g(q0Var11);
                                                                q0Var11.G.c(e, "Error reading entries from local database");
                                                                l0VarI.E = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseB1 != null) {
                                                                    sQLiteDatabaseB1.close();
                                                                }
                                                                i22 = i11 + 1;
                                                                i21 = i12;
                                                                str6 = str6;
                                                                str5 = str5;
                                                                str7 = str7;
                                                            }
                                                        } else {
                                                            i13 = 5;
                                                        }
                                                        try {
                                                            cursorQuery = sQLiteDatabaseB1.query("messages", strArr2, str, strArr, null, null, "rowid asc", Integer.toString(i19));
                                                            while (cursorQuery.moveToNext()) {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            j12 = cursorQuery.getLong(0);
                                                                            try {
                                                                                int i26 = cursorQuery.getInt(1);
                                                                                str6 = str6;
                                                                                try {
                                                                                    byte[] blob = cursorQuery.getBlob(2);
                                                                                    str5 = str5;
                                                                                    try {
                                                                                        if (h1Var4.D.f1(null, a0Var2)) {
                                                                                            try {
                                                                                                string = cursorQuery.getString(i25);
                                                                                                j10 = cursorQuery.getLong(i24);
                                                                                            } catch (SQLiteDatabaseLockedException unused5) {
                                                                                                cursorQuery = cursorQuery;
                                                                                                sQLiteDatabaseB1 = sQLiteDatabaseB1;
                                                                                                i12 = 5;
                                                                                                SystemClock.sleep(i23);
                                                                                                i23 += 20;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseB1 != null) {
                                                                                                    sQLiteDatabaseB1.close();
                                                                                                }
                                                                                                i22 = i11 + 1;
                                                                                                i21 = i12;
                                                                                                str6 = str6;
                                                                                                str5 = str5;
                                                                                                str7 = str7;
                                                                                            } catch (SQLiteFullException e17) {
                                                                                                e = e17;
                                                                                                cursorQuery = cursorQuery;
                                                                                                sQLiteDatabaseB1 = sQLiteDatabaseB1;
                                                                                                i12 = 5;
                                                                                                q0 q0Var12 = h1Var4.F;
                                                                                                h1.g(q0Var12);
                                                                                                q0Var12.G.c(e, "Error reading entries from local database");
                                                                                                l0VarI.E = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseB1 != null) {
                                                                                                    sQLiteDatabaseB1.close();
                                                                                                }
                                                                                                i22 = i11 + 1;
                                                                                                i21 = i12;
                                                                                                str6 = str6;
                                                                                                str5 = str5;
                                                                                                str7 = str7;
                                                                                            } catch (SQLiteException e18) {
                                                                                                e = e18;
                                                                                                cursorQuery = cursorQuery;
                                                                                                sQLiteDatabaseB1 = sQLiteDatabaseB1;
                                                                                                i12 = 5;
                                                                                                if (sQLiteDatabaseB1 != null) {
                                                                                                    sQLiteDatabaseB1.endTransaction();
                                                                                                }
                                                                                                q0 q0Var13 = h1Var4.F;
                                                                                                h1.g(q0Var13);
                                                                                                q0Var13.G.c(e, "Error reading entries from local database");
                                                                                                l0VarI.E = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseB1 != null) {
                                                                                                    sQLiteDatabaseB1.close();
                                                                                                }
                                                                                                i22 = i11 + 1;
                                                                                                i21 = i12;
                                                                                                str6 = str6;
                                                                                                str5 = str5;
                                                                                                str7 = str7;
                                                                                            }
                                                                                        } else {
                                                                                            j10 = 0;
                                                                                            string = null;
                                                                                        }
                                                                                        if (i26 == 0) {
                                                                                            cursorQuery = cursorQuery;
                                                                                            try {
                                                                                                try {
                                                                                                    Parcel parcelObtain = Parcel.obtain();
                                                                                                    try {
                                                                                                        try {
                                                                                                            parcelObtain.unmarshall(blob, 0, blob.length);
                                                                                                            parcelObtain.setDataPosition(0);
                                                                                                            s sVarCreateFromParcel = s.CREATOR.createFromParcel(parcelObtain);
                                                                                                            parcelObtain.recycle();
                                                                                                            if (sVarCreateFromParcel != null) {
                                                                                                                arrayList.add(new k0(sVarCreateFromParcel, string, j10));
                                                                                                            }
                                                                                                        } catch (SafeParcelReader$ParseException unused6) {
                                                                                                            q0 q0Var14 = h1Var4.F;
                                                                                                            h1.g(q0Var14);
                                                                                                            q0Var14.G.b("Failed to load event from local database");
                                                                                                            parcelObtain.recycle();
                                                                                                        }
                                                                                                    } catch (Throwable th6) {
                                                                                                        parcelObtain.recycle();
                                                                                                        throw th6;
                                                                                                    }
                                                                                                } catch (Throwable th7) {
                                                                                                    th = th7;
                                                                                                    sQLiteDatabaseB1 = sQLiteDatabaseB1;
                                                                                                    cursor = cursorQuery;
                                                                                                    if (cursor != null) {
                                                                                                        cursor.close();
                                                                                                    }
                                                                                                    if (sQLiteDatabaseB1 != null) {
                                                                                                        sQLiteDatabaseB1.close();
                                                                                                    }
                                                                                                    throw th;
                                                                                                }
                                                                                            } catch (SQLiteDatabaseLockedException unused7) {
                                                                                                sQLiteDatabaseB1 = sQLiteDatabaseB1;
                                                                                                i12 = 5;
                                                                                                SystemClock.sleep(i23);
                                                                                                i23 += 20;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseB1 != null) {
                                                                                                    sQLiteDatabaseB1.close();
                                                                                                }
                                                                                                i22 = i11 + 1;
                                                                                                i21 = i12;
                                                                                                str6 = str6;
                                                                                                str5 = str5;
                                                                                                str7 = str7;
                                                                                            } catch (SQLiteFullException e19) {
                                                                                                e = e19;
                                                                                                sQLiteDatabaseB1 = sQLiteDatabaseB1;
                                                                                                i12 = 5;
                                                                                                q0 q0Var15 = h1Var4.F;
                                                                                                h1.g(q0Var15);
                                                                                                q0Var15.G.c(e, "Error reading entries from local database");
                                                                                                l0VarI.E = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseB1 != null) {
                                                                                                    sQLiteDatabaseB1.close();
                                                                                                }
                                                                                                i22 = i11 + 1;
                                                                                                i21 = i12;
                                                                                                str6 = str6;
                                                                                                str5 = str5;
                                                                                                str7 = str7;
                                                                                            } catch (SQLiteException e20) {
                                                                                                e = e20;
                                                                                                sQLiteDatabaseB1 = sQLiteDatabaseB1;
                                                                                                i12 = 5;
                                                                                                if (sQLiteDatabaseB1 != null) {
                                                                                                    sQLiteDatabaseB1.endTransaction();
                                                                                                }
                                                                                                q0 q0Var16 = h1Var4.F;
                                                                                                h1.g(q0Var16);
                                                                                                q0Var16.G.c(e, "Error reading entries from local database");
                                                                                                l0VarI.E = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseB1 != null) {
                                                                                                    sQLiteDatabaseB1.close();
                                                                                                }
                                                                                                i22 = i11 + 1;
                                                                                                i21 = i12;
                                                                                                str6 = str6;
                                                                                                str5 = str5;
                                                                                                str7 = str7;
                                                                                            }
                                                                                        } else {
                                                                                            cursorQuery = cursorQuery;
                                                                                            if (i26 == 1) {
                                                                                                Parcel parcelObtain2 = Parcel.obtain();
                                                                                                try {
                                                                                                    try {
                                                                                                        parcelObtain2.unmarshall(blob, 0, blob.length);
                                                                                                        parcelObtain2.setDataPosition(0);
                                                                                                        b4VarCreateFromParcel = b4.CREATOR.createFromParcel(parcelObtain2);
                                                                                                        parcelObtain2.recycle();
                                                                                                    } catch (Throwable th8) {
                                                                                                        parcelObtain2.recycle();
                                                                                                        throw th8;
                                                                                                    }
                                                                                                } catch (SafeParcelReader$ParseException unused8) {
                                                                                                    q0 q0Var17 = h1Var4.F;
                                                                                                    h1.g(q0Var17);
                                                                                                    q0Var17.G.b("Failed to load user property from local database");
                                                                                                    parcelObtain2.recycle();
                                                                                                    b4VarCreateFromParcel = null;
                                                                                                }
                                                                                                if (b4VarCreateFromParcel != null) {
                                                                                                    arrayList.add(new k0(b4VarCreateFromParcel, string, j10));
                                                                                                }
                                                                                            } else {
                                                                                                if (i26 == 2) {
                                                                                                    Parcel parcelObtain3 = Parcel.obtain();
                                                                                                    try {
                                                                                                        try {
                                                                                                            parcelObtain3.unmarshall(blob, 0, blob.length);
                                                                                                            parcelObtain3.setDataPosition(0);
                                                                                                            eVarCreateFromParcel = e.CREATOR.createFromParcel(parcelObtain3);
                                                                                                            parcelObtain3.recycle();
                                                                                                        } catch (SafeParcelReader$ParseException unused9) {
                                                                                                            q0 q0Var18 = h1Var4.F;
                                                                                                            h1.g(q0Var18);
                                                                                                            q0Var18.G.b("Failed to load conditional user property from local database");
                                                                                                            parcelObtain3.recycle();
                                                                                                            eVarCreateFromParcel = null;
                                                                                                        }
                                                                                                        if (eVarCreateFromParcel != null) {
                                                                                                            arrayList.add(new k0(eVarCreateFromParcel, string, j10));
                                                                                                        }
                                                                                                    } catch (Throwable th9) {
                                                                                                        parcelObtain3.recycle();
                                                                                                        throw th9;
                                                                                                    }
                                                                                                } else if (i26 == 4) {
                                                                                                    try {
                                                                                                        Parcel parcelObtain4 = Parcel.obtain();
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    parcelObtain4.unmarshall(blob, 0, blob.length);
                                                                                                                    parcelObtain4.setDataPosition(0);
                                                                                                                    rVarCreateFromParcel = r.CREATOR.createFromParcel(parcelObtain4);
                                                                                                                    try {
                                                                                                                        parcelObtain4.recycle();
                                                                                                                        if (rVarCreateFromParcel != null) {
                                                                                                                            arrayList.add(new k0(rVarCreateFromParcel, string, j10));
                                                                                                                        }
                                                                                                                        i14 = 3;
                                                                                                                    } catch (SQLiteDatabaseLockedException unused10) {
                                                                                                                        sQLiteDatabaseB1 = sQLiteDatabaseB1;
                                                                                                                        i12 = 5;
                                                                                                                        SystemClock.sleep(i23);
                                                                                                                        i23 += 20;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseB1 != null) {
                                                                                                                            sQLiteDatabaseB1.close();
                                                                                                                        }
                                                                                                                        i22 = i11 + 1;
                                                                                                                        i21 = i12;
                                                                                                                        str6 = str6;
                                                                                                                        str5 = str5;
                                                                                                                        str7 = str7;
                                                                                                                    } catch (SQLiteFullException e21) {
                                                                                                                        e = e21;
                                                                                                                        sQLiteDatabaseB1 = sQLiteDatabaseB1;
                                                                                                                        i12 = 5;
                                                                                                                        q0 q0Var19 = h1Var4.F;
                                                                                                                        h1.g(q0Var19);
                                                                                                                        q0Var19.G.c(e, "Error reading entries from local database");
                                                                                                                        l0VarI.E = true;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseB1 != null) {
                                                                                                                            sQLiteDatabaseB1.close();
                                                                                                                        }
                                                                                                                        i22 = i11 + 1;
                                                                                                                        i21 = i12;
                                                                                                                        str6 = str6;
                                                                                                                        str5 = str5;
                                                                                                                        str7 = str7;
                                                                                                                    } catch (SQLiteException e22) {
                                                                                                                        e = e22;
                                                                                                                        sQLiteDatabaseB1 = sQLiteDatabaseB1;
                                                                                                                        i12 = 5;
                                                                                                                        if (sQLiteDatabaseB1 != null) {
                                                                                                                            sQLiteDatabaseB1.endTransaction();
                                                                                                                        }
                                                                                                                        q0 q0Var110 = h1Var4.F;
                                                                                                                        h1.g(q0Var110);
                                                                                                                        q0Var110.G.c(e, "Error reading entries from local database");
                                                                                                                        l0VarI.E = true;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseB1 != null) {
                                                                                                                            sQLiteDatabaseB1.close();
                                                                                                                        }
                                                                                                                        i22 = i11 + 1;
                                                                                                                        i21 = i12;
                                                                                                                        str6 = str6;
                                                                                                                        str5 = str5;
                                                                                                                        str7 = str7;
                                                                                                                    }
                                                                                                                } catch (Throwable th10) {
                                                                                                                    th = th10;
                                                                                                                    parcelObtain4.recycle();
                                                                                                                    throw th;
                                                                                                                }
                                                                                                            } catch (SafeParcelReader$ParseException unused11) {
                                                                                                                q0 q0Var20 = h1Var4.F;
                                                                                                                h1.g(q0Var20);
                                                                                                                q0Var20.G.b("Failed to load default event parameters from local database");
                                                                                                                parcelObtain4.recycle();
                                                                                                                rVarCreateFromParcel = null;
                                                                                                            }
                                                                                                        } catch (SafeParcelReader$ParseException unused12) {
                                                                                                        } catch (Throwable th11) {
                                                                                                            th = th11;
                                                                                                        }
                                                                                                    } catch (SQLiteDatabaseLockedException unused13) {
                                                                                                        sQLiteDatabaseB1 = sQLiteDatabaseB1;
                                                                                                        i12 = 5;
                                                                                                        SystemClock.sleep(i23);
                                                                                                        i23 += 20;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseB1 != null) {
                                                                                                            sQLiteDatabaseB1.close();
                                                                                                        }
                                                                                                        i22 = i11 + 1;
                                                                                                        i21 = i12;
                                                                                                        str6 = str6;
                                                                                                        str5 = str5;
                                                                                                        str7 = str7;
                                                                                                    } catch (SQLiteFullException e23) {
                                                                                                        e = e23;
                                                                                                        sQLiteDatabaseB1 = sQLiteDatabaseB1;
                                                                                                        i12 = 5;
                                                                                                        q0 q0Var111 = h1Var4.F;
                                                                                                        h1.g(q0Var111);
                                                                                                        q0Var111.G.c(e, "Error reading entries from local database");
                                                                                                        l0VarI.E = true;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseB1 != null) {
                                                                                                            sQLiteDatabaseB1.close();
                                                                                                        }
                                                                                                        i22 = i11 + 1;
                                                                                                        i21 = i12;
                                                                                                        str6 = str6;
                                                                                                        str5 = str5;
                                                                                                        str7 = str7;
                                                                                                    } catch (SQLiteException e24) {
                                                                                                        e = e24;
                                                                                                        sQLiteDatabaseB1 = sQLiteDatabaseB1;
                                                                                                        i12 = 5;
                                                                                                        if (sQLiteDatabaseB1 != null) {
                                                                                                            sQLiteDatabaseB1.endTransaction();
                                                                                                        }
                                                                                                        q0 q0Var112 = h1Var4.F;
                                                                                                        h1.g(q0Var112);
                                                                                                        q0Var112.G.c(e, "Error reading entries from local database");
                                                                                                        l0VarI.E = true;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseB1 != null) {
                                                                                                            sQLiteDatabaseB1.close();
                                                                                                        }
                                                                                                        i22 = i11 + 1;
                                                                                                        i21 = i12;
                                                                                                        str6 = str6;
                                                                                                        str5 = str5;
                                                                                                        str7 = str7;
                                                                                                    }
                                                                                                } else {
                                                                                                    i14 = 3;
                                                                                                    if (i26 == 3) {
                                                                                                        q0 q0Var21 = h1Var4.F;
                                                                                                        h1.g(q0Var21);
                                                                                                        q0Var21.O.b("Skipping app launch break");
                                                                                                    } else {
                                                                                                        q0 q0Var22 = h1Var4.F;
                                                                                                        h1.g(q0Var22);
                                                                                                        q0Var22.G.b("Unknown record type in local database");
                                                                                                    }
                                                                                                }
                                                                                                i25 = i14;
                                                                                                str6 = str6;
                                                                                                str5 = str5;
                                                                                                a0Var2 = a0Var2;
                                                                                                cursorQuery = cursorQuery;
                                                                                                i24 = 4;
                                                                                            }
                                                                                        }
                                                                                        i14 = 3;
                                                                                        i25 = i14;
                                                                                        str6 = str6;
                                                                                        str5 = str5;
                                                                                        a0Var2 = a0Var2;
                                                                                        cursorQuery = cursorQuery;
                                                                                        i24 = 4;
                                                                                    } catch (SQLiteDatabaseLockedException unused14) {
                                                                                        cursorQuery = cursorQuery;
                                                                                    } catch (SQLiteFullException e25) {
                                                                                        e = e25;
                                                                                        cursorQuery = cursorQuery;
                                                                                    } catch (SQLiteException e26) {
                                                                                        e = e26;
                                                                                        cursorQuery = cursorQuery;
                                                                                    }
                                                                                } catch (SQLiteDatabaseLockedException unused15) {
                                                                                    str5 = str5;
                                                                                    sQLiteDatabaseB1 = sQLiteDatabaseB1;
                                                                                    i12 = 5;
                                                                                    SystemClock.sleep(i23);
                                                                                    i23 += 20;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseB1 != null) {
                                                                                        sQLiteDatabaseB1.close();
                                                                                    }
                                                                                    i22 = i11 + 1;
                                                                                    i21 = i12;
                                                                                    str6 = str6;
                                                                                    str5 = str5;
                                                                                    str7 = str7;
                                                                                } catch (SQLiteFullException e27) {
                                                                                    e = e27;
                                                                                    str5 = str5;
                                                                                    sQLiteDatabaseB1 = sQLiteDatabaseB1;
                                                                                    i12 = 5;
                                                                                    q0 q0Var113 = h1Var4.F;
                                                                                    h1.g(q0Var113);
                                                                                    q0Var113.G.c(e, "Error reading entries from local database");
                                                                                    l0VarI.E = true;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseB1 != null) {
                                                                                        sQLiteDatabaseB1.close();
                                                                                    }
                                                                                    i22 = i11 + 1;
                                                                                    i21 = i12;
                                                                                    str6 = str6;
                                                                                    str5 = str5;
                                                                                    str7 = str7;
                                                                                } catch (SQLiteException e28) {
                                                                                    e = e28;
                                                                                    str5 = str5;
                                                                                    sQLiteDatabaseB1 = sQLiteDatabaseB1;
                                                                                    i12 = 5;
                                                                                    if (sQLiteDatabaseB1 != null) {
                                                                                        sQLiteDatabaseB1.endTransaction();
                                                                                    }
                                                                                    q0 q0Var114 = h1Var4.F;
                                                                                    h1.g(q0Var114);
                                                                                    q0Var114.G.c(e, "Error reading entries from local database");
                                                                                    l0VarI.E = true;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseB1 != null) {
                                                                                        sQLiteDatabaseB1.close();
                                                                                    }
                                                                                    i22 = i11 + 1;
                                                                                    i21 = i12;
                                                                                    str6 = str6;
                                                                                    str5 = str5;
                                                                                    str7 = str7;
                                                                                }
                                                                            } catch (SQLiteDatabaseLockedException unused16) {
                                                                                str6 = str6;
                                                                            } catch (SQLiteFullException e29) {
                                                                                e = e29;
                                                                                str6 = str6;
                                                                            } catch (SQLiteException e30) {
                                                                                e = e30;
                                                                                str6 = str6;
                                                                            }
                                                                        } catch (SQLiteDatabaseLockedException unused17) {
                                                                            cursorQuery = cursorQuery;
                                                                            str6 = str6;
                                                                            str5 = str5;
                                                                        } catch (SQLiteFullException e31) {
                                                                            e = e31;
                                                                            cursorQuery = cursorQuery;
                                                                            str6 = str6;
                                                                            str5 = str5;
                                                                        } catch (SQLiteException e32) {
                                                                            e = e32;
                                                                            cursorQuery = cursorQuery;
                                                                            str6 = str6;
                                                                            str5 = str5;
                                                                        }
                                                                    } catch (Throwable th12) {
                                                                        th = th12;
                                                                        cursorQuery = cursorQuery;
                                                                    }
                                                                } catch (SQLiteDatabaseLockedException unused18) {
                                                                    cursorQuery = cursorQuery;
                                                                    str6 = str6;
                                                                    str5 = str5;
                                                                } catch (SQLiteFullException e33) {
                                                                    e = e33;
                                                                    cursorQuery = cursorQuery;
                                                                    str6 = str6;
                                                                    str5 = str5;
                                                                } catch (SQLiteException e34) {
                                                                    e = e34;
                                                                    cursorQuery = cursorQuery;
                                                                    str6 = str6;
                                                                    str5 = str5;
                                                                }
                                                            }
                                                            cursorQuery = cursorQuery;
                                                            str6 = str6;
                                                            str5 = str5;
                                                            i10 = 0;
                                                            sQLiteDatabaseB1 = sQLiteDatabaseB1;
                                                            try {
                                                                if (sQLiteDatabaseB1.delete("messages", "rowid <= ?", new String[]{Long.toString(j12)}) < arrayList.size()) {
                                                                    q0 q0Var23 = h1Var4.F;
                                                                    h1.g(q0Var23);
                                                                    q0Var23.G.b("Fewer entries removed from local database than expected");
                                                                }
                                                                sQLiteDatabaseB1.setTransactionSuccessful();
                                                                sQLiteDatabaseB1.endTransaction();
                                                                cursorQuery.close();
                                                                sQLiteDatabaseB1.close();
                                                            } catch (SQLiteDatabaseLockedException unused19) {
                                                                i12 = 5;
                                                                SystemClock.sleep(i23);
                                                                i23 += 20;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseB1 != null) {
                                                                    sQLiteDatabaseB1.close();
                                                                }
                                                                i22 = i11 + 1;
                                                                i21 = i12;
                                                                str6 = str6;
                                                                str5 = str5;
                                                                str7 = str7;
                                                            } catch (SQLiteFullException e35) {
                                                                e = e35;
                                                                i12 = 5;
                                                                q0 q0Var115 = h1Var4.F;
                                                                h1.g(q0Var115);
                                                                q0Var115.G.c(e, "Error reading entries from local database");
                                                                l0VarI.E = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseB1 != null) {
                                                                    sQLiteDatabaseB1.close();
                                                                }
                                                                i22 = i11 + 1;
                                                                i21 = i12;
                                                                str6 = str6;
                                                                str5 = str5;
                                                                str7 = str7;
                                                            } catch (SQLiteException e36) {
                                                                e = e36;
                                                                i12 = 5;
                                                                if (sQLiteDatabaseB1 != null) {
                                                                    sQLiteDatabaseB1.endTransaction();
                                                                }
                                                                q0 q0Var116 = h1Var4.F;
                                                                h1.g(q0Var116);
                                                                q0Var116.G.c(e, "Error reading entries from local database");
                                                                l0VarI.E = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseB1 != null) {
                                                                    sQLiteDatabaseB1.close();
                                                                }
                                                                i22 = i11 + 1;
                                                                i21 = i12;
                                                                str6 = str6;
                                                                str5 = str5;
                                                                str7 = str7;
                                                            }
                                                        } catch (SQLiteDatabaseLockedException unused20) {
                                                            str5 = str5;
                                                            sQLiteDatabaseB1 = sQLiteDatabaseB1;
                                                            str6 = str6;
                                                            i12 = i13;
                                                            cursorQuery = null;
                                                            SystemClock.sleep(i23);
                                                            i23 += 20;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseB1 != null) {
                                                                sQLiteDatabaseB1.close();
                                                            }
                                                            i22 = i11 + 1;
                                                            i21 = i12;
                                                            str6 = str6;
                                                            str5 = str5;
                                                            str7 = str7;
                                                        }
                                                    } catch (SQLiteDatabaseLockedException unused21) {
                                                        str5 = str5;
                                                        sQLiteDatabaseB1 = sQLiteDatabaseB1;
                                                        str6 = str6;
                                                        i12 = 5;
                                                        cursorQuery = null;
                                                        SystemClock.sleep(i23);
                                                        i23 += 20;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseB1 != null) {
                                                            sQLiteDatabaseB1.close();
                                                        }
                                                        i22 = i11 + 1;
                                                        i21 = i12;
                                                        str6 = str6;
                                                        str5 = str5;
                                                        str7 = str7;
                                                    }
                                                } catch (SQLiteFullException e37) {
                                                    e = e37;
                                                    str5 = str5;
                                                    sQLiteDatabaseB1 = sQLiteDatabaseB1;
                                                    str6 = str6;
                                                    i12 = 5;
                                                    cursorQuery = null;
                                                    q0 q0Var117 = h1Var4.F;
                                                    h1.g(q0Var117);
                                                    q0Var117.G.c(e, "Error reading entries from local database");
                                                    l0VarI.E = true;
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    if (sQLiteDatabaseB1 != null) {
                                                        sQLiteDatabaseB1.close();
                                                    }
                                                    i22 = i11 + 1;
                                                    i21 = i12;
                                                    str6 = str6;
                                                    str5 = str5;
                                                    str7 = str7;
                                                } catch (SQLiteException e38) {
                                                    e = e38;
                                                    str5 = str5;
                                                    sQLiteDatabaseB1 = sQLiteDatabaseB1;
                                                    str6 = str6;
                                                    i12 = 5;
                                                    cursorQuery = null;
                                                    if (sQLiteDatabaseB1 != null) {
                                                        sQLiteDatabaseB1.endTransaction();
                                                    }
                                                    q0 q0Var118 = h1Var4.F;
                                                    h1.g(q0Var118);
                                                    q0Var118.G.c(e, "Error reading entries from local database");
                                                    l0VarI.E = true;
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    if (sQLiteDatabaseB1 != null) {
                                                        sQLiteDatabaseB1.close();
                                                    }
                                                    i22 = i11 + 1;
                                                    i21 = i12;
                                                    str6 = str6;
                                                    str5 = str5;
                                                    str7 = str7;
                                                }
                                            } catch (SQLiteDatabaseLockedException unused22) {
                                                str7 = str7;
                                            } catch (SQLiteFullException e39) {
                                                e = e39;
                                                str7 = str7;
                                            } catch (SQLiteException e40) {
                                                e = e40;
                                                str7 = str7;
                                            }
                                        } catch (Throwable th13) {
                                            th = th13;
                                            i11 = i22;
                                        }
                                    } catch (Throwable th14) {
                                        th = th14;
                                        i11 = i22;
                                        i12 = 5;
                                        cursorQuery2 = null;
                                    }
                                }
                            } catch (SQLiteDatabaseLockedException unused23) {
                                i11 = i22;
                                str7 = str7;
                                str6 = str6;
                                str5 = str5;
                                i12 = 5;
                                sQLiteDatabaseB1 = null;
                            } catch (SQLiteFullException e41) {
                                e = e41;
                                i11 = i22;
                                str7 = str7;
                                str6 = str6;
                                str5 = str5;
                                i12 = 5;
                                sQLiteDatabaseB1 = null;
                            } catch (SQLiteException e42) {
                                e = e42;
                                i11 = i22;
                                str7 = str7;
                                str6 = str6;
                                str5 = str5;
                                i12 = 5;
                                sQLiteDatabaseB1 = null;
                            } catch (Throwable th15) {
                                th = th15;
                                sQLiteDatabaseB1 = null;
                            }
                        } else {
                            i10 = 0;
                            q0 q0Var24 = h1Var4.F;
                            h1.g(q0Var24);
                            q0Var24.J.b("Failed to read events from database in reasonable time");
                            arrayList = null;
                        }
                        i22 = i11 + 1;
                        i21 = i12;
                        str6 = str6;
                        str5 = str5;
                        str7 = str7;
                    }
                } else {
                    context = context3;
                    q0Var = q0Var3;
                    i10 = 0;
                }
                if (arrayList != null) {
                    arrayList2.addAll(arrayList);
                    size = arrayList.size();
                } else {
                    size = i10;
                }
                if (aVar != null && size < i19) {
                    arrayList2.add(new k0(aVar, g4Var2.C, g4Var2.J));
                }
                str2 = null;
                zF1 = gVar.f1(null, b0.O0);
                size2 = arrayList2.size();
                i15 = i10;
                while (i15 < size2) {
                    k0Var = (k0) arrayList2.get(i15);
                    aVar2 = k0Var.f14651a;
                    a0Var = b0.f14550b1;
                    if (gVar.f1(str2, a0Var)) {
                        str4 = k0Var.f14652b;
                        if (!TextUtils.isEmpty(str4)) {
                            g4Var2 = new g4(g4Var2.A, g4Var2.B, str4, k0Var.f14653c, g4Var2.D, g4Var2.E, g4Var2.F, g4Var2.G, g4Var2.H, g4Var2.I, g4Var2.K, g4Var2.L, g4Var2.M, g4Var2.N, g4Var2.O, g4Var2.P, g4Var2.Q, g4Var2.R, g4Var2.S, g4Var2.T, g4Var2.U, g4Var2.V, g4Var2.W, g4Var2.X, g4Var2.Y, g4Var2.Z, g4Var2.f14619a0, g4Var2.f14620b0, g4Var2.f14621c0, g4Var2.f14622d0, g4Var2.f14623e0);
                        }
                    }
                    if (aVar2 instanceof s) {
                        if (zF1) {
                            try {
                                bVar2.getClass();
                                jCurrentTimeMillis = System.currentTimeMillis();
                                try {
                                    bVar2.getClass();
                                    j11 = jCurrentTimeMillis;
                                    jElapsedRealtime = SystemClock.elapsedRealtime();
                                } catch (RemoteException e43) {
                                    e = e43;
                                    j11 = jCurrentTimeMillis;
                                    jElapsedRealtime = 0;
                                    h1Var2 = h1Var;
                                    context2 = context;
                                    q0Var2 = q0Var;
                                    z10 = zF1;
                                    h1.g(q0Var2);
                                    q0Var2.G.c(e, "Failed to send event to the service");
                                    if (z10) {
                                        if (sd.p1.E == null) {
                                            sd.p1.E = new sd.p1(context2, h1Var2);
                                        }
                                        sd.p1 p1Var = sd.p1.E;
                                        bVar2.getClass();
                                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                                        bVar2.getClass();
                                        p1Var.M(j11, 13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), jCurrentTimeMillis2);
                                    }
                                    str3 = null;
                                    i15++;
                                    h1Var = h1Var2;
                                    context = context2;
                                    size2 = size2;
                                    size = size;
                                    str2 = str3;
                                    zF1 = z10;
                                    q0Var = q0Var2;
                                }
                            } catch (RemoteException e44) {
                                e = e44;
                                jElapsedRealtime = 0;
                                j11 = 0;
                            }
                        } else {
                            jElapsedRealtime = 0;
                            j11 = 0;
                        }
                        try {
                            try {
                                e0Var.J((s) aVar2, g4Var2);
                                if (zF1) {
                                    h1.g(q0Var);
                                    q0Var2 = q0Var;
                                    try {
                                        q0Var2.O.b("Logging telemetry for logEvent from database");
                                        if (sd.p1.E == null) {
                                            try {
                                                h1Var2 = h1Var;
                                                context2 = context;
                                                try {
                                                    sd.p1.E = new sd.p1(context2, h1Var2);
                                                } catch (RemoteException e45) {
                                                    e = e45;
                                                    z10 = zF1;
                                                    size2 = size2;
                                                    h1.g(q0Var2);
                                                    q0Var2.G.c(e, "Failed to send event to the service");
                                                    if (z10) {
                                                        if (sd.p1.E == null) {
                                                            sd.p1.E = new sd.p1(context2, h1Var2);
                                                        }
                                                        sd.p1 p1Var2 = sd.p1.E;
                                                        bVar2.getClass();
                                                        long jCurrentTimeMillis3 = System.currentTimeMillis();
                                                        bVar2.getClass();
                                                        p1Var2.M(j11, 13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), jCurrentTimeMillis3);
                                                    }
                                                    str3 = null;
                                                    i15++;
                                                    h1Var = h1Var2;
                                                    context = context2;
                                                    size2 = size2;
                                                    size = size;
                                                    str2 = str3;
                                                    zF1 = z10;
                                                    q0Var = q0Var2;
                                                }
                                            } catch (RemoteException e46) {
                                                e = e46;
                                                h1Var2 = h1Var;
                                                context2 = context;
                                            }
                                        } else {
                                            h1Var2 = h1Var;
                                            context2 = context;
                                        }
                                        sd.p1 p1Var3 = sd.p1.E;
                                        bVar2.getClass();
                                        long jCurrentTimeMillis4 = System.currentTimeMillis();
                                        bVar2.getClass();
                                        z10 = zF1;
                                        size2 = size2;
                                        try {
                                            p1Var3.M(j11, 0, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), jCurrentTimeMillis4);
                                        } catch (RemoteException e47) {
                                            e = e47;
                                            h1.g(q0Var2);
                                            q0Var2.G.c(e, "Failed to send event to the service");
                                            if (z10 && j11 != 0) {
                                                if (sd.p1.E == null) {
                                                    sd.p1.E = new sd.p1(context2, h1Var2);
                                                }
                                                sd.p1 p1Var4 = sd.p1.E;
                                                bVar2.getClass();
                                                long jCurrentTimeMillis5 = System.currentTimeMillis();
                                                bVar2.getClass();
                                                p1Var4.M(j11, 13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), jCurrentTimeMillis5);
                                            }
                                        }
                                    } catch (RemoteException e48) {
                                        e = e48;
                                        z10 = zF1;
                                        size2 = size2;
                                        h1Var2 = h1Var;
                                        context2 = context;
                                    }
                                } else {
                                    size2 = size2;
                                    h1Var2 = h1Var;
                                    context2 = context;
                                    q0Var2 = q0Var;
                                    z10 = zF1;
                                }
                            } catch (RemoteException e49) {
                                e = e49;
                                h1Var2 = h1Var;
                                context2 = context;
                                q0Var2 = q0Var;
                                z10 = zF1;
                                h1.g(q0Var2);
                                q0Var2.G.c(e, "Failed to send event to the service");
                                if (z10) {
                                    if (sd.p1.E == null) {
                                        sd.p1.E = new sd.p1(context2, h1Var2);
                                    }
                                    sd.p1 p1Var5 = sd.p1.E;
                                    bVar2.getClass();
                                    long jCurrentTimeMillis6 = System.currentTimeMillis();
                                    bVar2.getClass();
                                    p1Var5.M(j11, 13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), jCurrentTimeMillis6);
                                }
                                str3 = null;
                                i15++;
                                h1Var = h1Var2;
                                context = context2;
                                size2 = size2;
                                size = size;
                                str2 = str3;
                                zF1 = z10;
                                q0Var = q0Var2;
                            }
                        } catch (RemoteException e50) {
                            e = e50;
                        }
                    } else {
                        size2 = size2;
                        h1Var2 = h1Var;
                        context2 = context;
                        q0Var2 = q0Var;
                        z10 = zF1;
                        if (aVar2 instanceof b4) {
                            try {
                                e0Var.U0((b4) aVar2, g4Var2);
                            } catch (RemoteException e51) {
                                h1.g(q0Var2);
                                q0Var2.G.c(e51, "Failed to send user property to the service");
                            }
                        } else {
                            if (aVar2 instanceof e) {
                                try {
                                    e0Var.C((e) aVar2, g4Var2);
                                } catch (RemoteException e52) {
                                    h1.g(q0Var2);
                                    q0Var2.G.c(e52, "Failed to send conditional user property to the service");
                                }
                            } else {
                                str3 = null;
                                if (gVar.f1(null, a0Var) || !(aVar2 instanceof r)) {
                                    h1.g(q0Var2);
                                    q0Var2.G.b("Discarding data. Unrecognized parcel type.");
                                } else {
                                    try {
                                        e0Var.R0(((r) aVar2).e(), g4Var2);
                                    } catch (RemoteException e53) {
                                        h1.g(q0Var2);
                                        q0Var2.G.c(e53, "Failed to send default event parameters to the service");
                                    }
                                }
                            }
                            i15++;
                            h1Var = h1Var2;
                            context = context2;
                            size2 = size2;
                            size = size;
                            str2 = str3;
                            zF1 = z10;
                            q0Var = q0Var2;
                        }
                    }
                    str3 = null;
                    i15++;
                    h1Var = h1Var2;
                    context = context2;
                    size2 = size2;
                    size = size;
                    str2 = str3;
                    zF1 = z10;
                    q0Var = q0Var2;
                }
                i17 = i20 + 1;
                q0Var3 = q0Var;
                h1Var3 = h1Var;
                context3 = context;
                bVar = bVar2;
                i16 = size;
            }
            i10 = 0;
            arrayList = null;
            if (arrayList != null) {
                arrayList2.addAll(arrayList);
                size = arrayList.size();
            } else {
                size = i10;
            }
            if (aVar != null) {
                arrayList2.add(new k0(aVar, g4Var2.C, g4Var2.J));
            }
            str2 = null;
            zF1 = gVar.f1(null, b0.O0);
            size2 = arrayList2.size();
            i15 = i10;
            while (i15 < size2) {
                k0Var = (k0) arrayList2.get(i15);
                aVar2 = k0Var.f14651a;
                a0Var = b0.f14550b1;
                if (gVar.f1(str2, a0Var)) {
                    str4 = k0Var.f14652b;
                    if (!TextUtils.isEmpty(str4)) {
                        g4Var2 = new g4(g4Var2.A, g4Var2.B, str4, k0Var.f14653c, g4Var2.D, g4Var2.E, g4Var2.F, g4Var2.G, g4Var2.H, g4Var2.I, g4Var2.K, g4Var2.L, g4Var2.M, g4Var2.N, g4Var2.O, g4Var2.P, g4Var2.Q, g4Var2.R, g4Var2.S, g4Var2.T, g4Var2.U, g4Var2.V, g4Var2.W, g4Var2.X, g4Var2.Y, g4Var2.Z, g4Var2.f14619a0, g4Var2.f14620b0, g4Var2.f14621c0, g4Var2.f14622d0, g4Var2.f14623e0);
                    }
                }
                if (aVar2 instanceof s) {
                    if (zF1) {
                        bVar2.getClass();
                        jCurrentTimeMillis = System.currentTimeMillis();
                        bVar2.getClass();
                        j11 = jCurrentTimeMillis;
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                    } else {
                        jElapsedRealtime = 0;
                        j11 = 0;
                    }
                    e0Var.J((s) aVar2, g4Var2);
                    if (zF1) {
                        h1.g(q0Var);
                        q0Var2 = q0Var;
                        q0Var2.O.b("Logging telemetry for logEvent from database");
                        if (sd.p1.E == null) {
                            h1Var2 = h1Var;
                            context2 = context;
                            sd.p1.E = new sd.p1(context2, h1Var2);
                        } else {
                            h1Var2 = h1Var;
                            context2 = context;
                        }
                        sd.p1 p1Var6 = sd.p1.E;
                        bVar2.getClass();
                        long jCurrentTimeMillis7 = System.currentTimeMillis();
                        bVar2.getClass();
                        z10 = zF1;
                        size2 = size2;
                        p1Var6.M(j11, 0, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), jCurrentTimeMillis7);
                    } else {
                        size2 = size2;
                        h1Var2 = h1Var;
                        context2 = context;
                        q0Var2 = q0Var;
                        z10 = zF1;
                    }
                } else {
                    size2 = size2;
                    h1Var2 = h1Var;
                    context2 = context;
                    q0Var2 = q0Var;
                    z10 = zF1;
                    if (aVar2 instanceof b4) {
                        e0Var.U0((b4) aVar2, g4Var2);
                    } else {
                        if (aVar2 instanceof e) {
                            e0Var.C((e) aVar2, g4Var2);
                        } else {
                            str3 = null;
                            if (gVar.f1(null, a0Var)) {
                                h1.g(q0Var2);
                                q0Var2.G.b("Discarding data. Unrecognized parcel type.");
                            } else {
                                h1.g(q0Var2);
                                q0Var2.G.b("Discarding data. Unrecognized parcel type.");
                            }
                        }
                        i15++;
                        h1Var = h1Var2;
                        context = context2;
                        size2 = size2;
                        size = size;
                        str2 = str3;
                        zF1 = z10;
                        q0Var = q0Var2;
                    }
                }
                str3 = null;
                i15++;
                h1Var = h1Var2;
                context = context2;
                size2 = size2;
                size = size;
                str2 = str3;
                zF1 = z10;
                q0Var = q0Var2;
            }
            i17 = i20 + 1;
            q0Var3 = q0Var;
            h1Var3 = h1Var;
            context3 = context;
            bVar = bVar2;
            i16 = size;
        }
    }

    public final void o1(e eVar) {
        boolean zC1;
        V0();
        W0();
        h1 h1Var = (h1) this.B;
        h1Var.getClass();
        l0 l0VarI = h1Var.i();
        h1 h1Var2 = (h1) l0VarI.B;
        h1.e(h1Var2.I);
        byte[] bArrZ1 = e4.z1(eVar);
        if (bArrZ1.length > 131072) {
            q0 q0Var = h1Var2.F;
            h1.g(q0Var);
            q0Var.H.b("Conditional user property too long for local database. Sending directly to service");
            zC1 = false;
        } else {
            zC1 = l0VarI.c1(2, bArrZ1);
        }
        j1(new oe.j(this, l1(true), zC1, new e(eVar)));
    }
}
