package ca;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import k9.m1;
import qd.o0;
import tf.a1;
import tf.a4;
import tf.b4;
import tf.c3;
import tf.e4;
import tf.f3;
import tf.g4;
import tf.h1;
import tf.i2;
import tf.n1;
import tf.q0;
import tf.s1;
import tf.t0;
import tf.u1;
import tf.w0;
import tf.x3;
import tf.y3;

public final class u implements Runnable {
    public final int A;
    public Object B;
    public Object C;
    public Object D;

    public u() {
        this.A = 16;
    }

    public u(Object obj, Object obj2, Object obj3, int i10) {
        this.A = i10;
        this.B = obj;
        this.C = obj2;
        this.D = obj3;
    }

    public u(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.A = i10;
        this.D = obj;
        this.B = obj2;
        this.C = obj3;
    }

    public u(c3 c3Var, AtomicReference atomicReference, g4 g4Var) {
        this.A = 12;
        this.B = atomicReference;
        this.C = g4Var;
        Objects.requireNonNull(c3Var);
        this.D = c3Var;
    }

    @Override
    public final void run() throws Throwable {
        Object objCall;
        int i10;
        xf.n nVarJ;
        tf.r rVar;
        int i11;
        long j9;
        int i12;
        Cursor cursorQuery;
        a4 a4Var;
        String str;
        int i13;
        y3 y3Var;
        x3 x3Var;
        y3 y3Var2;
        tf.m mVar;
        Long lValueOf;
        ContentValues contentValues;
        q0 q0Var;
        AtomicReference atomicReference;
        e4 e4Var;
        switch (this.A) {
            case 0:
                a40.k kVar = (a40.k) this.B;
                try {
                    a40.c0.C(kVar.E.minusKey(k00.d.A), new a1.g((t) this.C, kVar, (a1.d) this.D, (k00.c) null, 12));
                    return;
                } catch (Throwable th2) {
                    kVar.h(th2);
                    return;
                }
            case 1:
                l9.p pVar = (l9.p) this.D;
                m1 m1Var = (m1) pVar.f10174d;
                Iterator it = ((u.b) m1Var.E.keySet()).iterator();
                while (true) {
                    u.a aVar = (u.a) it;
                    if (!aVar.hasNext()) {
                        return;
                    }
                    l9.l lVar = (l9.l) m1Var.E.get((IBinder) aVar.next());
                    lVar.getClass();
                    pVar.a(lVar, (String) this.B, (Bundle) this.C);
                }
                break;
            case 2:
                oe.a aVar2 = (oe.a) this.C;
                Intent intent = aVar2.A;
                String stringExtra = intent.getStringExtra("google.message_id");
                if (stringExtra == null) {
                    stringExtra = intent.getStringExtra("message_id");
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    nVarJ = Tasks.d(null);
                } else {
                    Bundle bundle = new Bundle();
                    Intent intent2 = aVar2.A;
                    String stringExtra2 = intent2.getStringExtra("google.message_id");
                    if (stringExtra2 == null) {
                        stringExtra2 = intent2.getStringExtra("message_id");
                    }
                    bundle.putString("google.message_id", stringExtra2);
                    Intent intent3 = aVar2.A;
                    Integer numValueOf = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
                    if (numValueOf != null) {
                        bundle.putInt("google.product_id", numValueOf.intValue());
                    }
                    Context context = (Context) this.B;
                    bundle.putBoolean("supports_message_handled", true);
                    oe.o oVarI = oe.o.i(context);
                    synchronized (oVarI) {
                        i10 = oVarI.A;
                        oVarI.A = i10 + 1;
                    }
                    nVarJ = oVarI.j(new oe.n(i10, 2, bundle, 0));
                }
                nVarJ.c(oe.h.B, new oe.i((CountDownLatch) this.D));
                return;
            case 3:
                qd.b bVar = (qd.b) this.B;
                com.revenuecat.purchases.google.usecase.a aVar3 = (com.revenuecat.purchases.google.usecase.a) this.C;
                eh.l lVar2 = (eh.l) this.D;
                qd.h hVar = o0.f12935k;
                bVar.x(24, 4, hVar);
                aVar3.d(hVar, lVar2.B);
                return;
            case 4:
                super/*qd.b*/.f((qd.w) this.C, (com.revenuecat.purchases.google.usecase.c) this.D);
                return;
            case 5:
                super/*qd.b*/.b((com.revenuecat.purchases.google.usecase.a) this.D, (eh.l) this.C);
                return;
            case 6:
                super/*qd.b*/.a((bh.f) this.C, (com.revenuecat.purchases.google.usecase.a) this.D);
                return;
            case 7:
                g4 g4Var = (g4) this.C;
                y3 y3Var3 = ((n1) this.D).f14673e;
                y3Var3.x();
                tf.e eVar = (tf.e) this.B;
                if (eVar.C.a() == null) {
                    y3Var3.X(eVar, g4Var);
                    return;
                } else {
                    y3Var3.W(eVar, g4Var);
                    return;
                }
            case 8:
                tf.s sVar = (tf.s) this.B;
                g4 g4Var2 = (g4) this.C;
                n1 n1Var = (n1) this.D;
                n1Var.getClass();
                y3 y3Var4 = n1Var.f14673e;
                if ("_cmp".equals(sVar.A) && (rVar = sVar.B) != null) {
                    Bundle bundle2 = rVar.A;
                    if (bundle2.size() != 0) {
                        String string = bundle2.getString("_cis");
                        if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                            y3Var4.t().M.c(sVar.toString(), "Event has been filtered ");
                            sVar = new tf.s("_cmpx", rVar, sVar.C, sVar.D);
                        }
                    }
                }
                String str2 = sVar.A;
                a1 a1Var = y3Var4.A;
                t0 t0Var = y3Var4.G;
                y3.R(a1Var);
                String str3 = g4Var2.A;
                com.google.android.gms.internal.measurement.e0 e0Var = TextUtils.isEmpty(str3) ? null : (com.google.android.gms.internal.measurement.e0) a1Var.K.c(str3);
                if (e0Var == null) {
                    y3Var4.t().O.c(g4Var2.A, "EES not loaded for");
                    y3Var4.x();
                    y3Var4.e(sVar, g4Var2);
                    return;
                }
                try {
                    a1.i iVar = e0Var.f3748c;
                    y3.R(t0Var);
                    HashMap mapL1 = t0.L1(sVar.B.e(), true);
                    String strG = u1.g(str2, u1.f14729c, u1.f14727a);
                    if (strG == null) {
                        strG = str2;
                    }
                    if (e0Var.a(new com.google.android.gms.internal.measurement.b(strG, sVar.D, mapL1))) {
                        if (((com.google.android.gms.internal.measurement.b) iVar.C).equals((com.google.android.gms.internal.measurement.b) iVar.B)) {
                            y3Var4.x();
                            y3Var4.e(sVar, g4Var2);
                        } else {
                            y3Var4.t().O.c(str2, "EES edited event");
                            y3.R(t0Var);
                            tf.s sVarZ0 = t0.Z0((com.google.android.gms.internal.measurement.b) iVar.C);
                            y3Var4.x();
                            y3Var4.e(sVarZ0, g4Var2);
                        }
                        if (((ArrayList) iVar.D).isEmpty()) {
                            return;
                        }
                        for (com.google.android.gms.internal.measurement.b bVar2 : (ArrayList) iVar.D) {
                            y3Var4.t().O.c(bVar2.f3670a, "EES logging created event");
                            y3.R(t0Var);
                            tf.s sVarZ1 = t0.Z0(bVar2);
                            y3Var4.x();
                            y3Var4.e(sVarZ1, g4Var2);
                        }
                        return;
                    }
                } catch (zzd unused) {
                    y3Var4.t().G.d("EES error. appId, eventName", g4Var2.B, str2);
                }
                y3Var4.t().O.c(str2, "EES was not applied to event");
                y3Var4.x();
                y3Var4.e(sVar, g4Var2);
                return;
            case 9:
                n1 n1Var2 = (n1) this.D;
                n1Var2.f14673e.x();
                n1Var2.f14673e.c((String) this.C, (tf.s) this.B);
                return;
            case 10:
                g4 g4Var3 = (g4) this.C;
                y3 y3Var5 = ((n1) this.D).f14673e;
                y3Var5.x();
                b4 b4Var = (b4) this.B;
                if (b4Var.a() == null) {
                    y3Var5.U(b4Var.B, g4Var3);
                    return;
                } else {
                    y3Var5.T(b4Var, g4Var3);
                    return;
                }
            case 11:
                n1 n1Var3 = (n1) this.B;
                g4 g4Var4 = (g4) this.C;
                tf.d dVar = (tf.d) this.D;
                y3 y3Var6 = n1Var3.f14673e;
                y3Var6.x();
                String str4 = g4Var4.A;
                com.google.android.gms.common.internal.d0.h(str4);
                HashMap map = y3Var6.f14772e0;
                y3Var6.C().V0();
                y3Var6.j0();
                tf.m mVar2 = y3Var6.C;
                y3.R(mVar2);
                long j10 = dVar.A;
                long j11 = dVar.C;
                mVar2.V0();
                mVar2.W0();
                Cursor cursor = null;
                a4VarW1 = null;
                a4 a4VarW1 = null;
                try {
                    cursorQuery = mVar2.K1().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"}, "rowId=?", new String[]{String.valueOf(j10)}, null, null, null, "1");
                    try {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                String string2 = cursorQuery.getString(1);
                                com.google.android.gms.common.internal.d0.h(string2);
                                j9 = j11;
                                try {
                                    try {
                                        try {
                                            y3Var6 = y3Var6;
                                            i12 = 1;
                                            cursorQuery = cursorQuery;
                                            i11 = 4;
                                            j9 = j9;
                                            try {
                                                a4VarW1 = mVar2.w1(string2, j10, cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                                                cursorQuery.close();
                                            } catch (SQLiteException e3) {
                                                e = e3;
                                                cursorQuery = cursorQuery;
                                                try {
                                                    q0 q0Var2 = ((h1) mVar2.B).F;
                                                    h1.g(q0Var2);
                                                    q0Var2.G.d("Error to querying MeasurementBatch from upload_queue. rowId", Long.valueOf(j10), e);
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    cursor = cursorQuery;
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                    throw th;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                cursor = cursorQuery;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                throw th;
                                            }
                                        } catch (SQLiteException e10) {
                                            e = e10;
                                            i12 = 1;
                                            i11 = 4;
                                            cursorQuery = cursorQuery;
                                            q0 q0Var3 = ((h1) mVar2.B).F;
                                            h1.g(q0Var3);
                                            q0Var3.G.d("Error to querying MeasurementBatch from upload_queue. rowId", Long.valueOf(j10), e);
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            a4Var = a4VarW1;
                                            if (a4Var == null) {
                                                y3Var6.t().J.d("[sgtm] Queued batch doesn't exist. appId, rowId", str4, Long.valueOf(j10));
                                                return;
                                            }
                                            str = a4Var.f14529c;
                                            i13 = dVar.B;
                                            if (i13 == i12) {
                                                y3Var = y3Var6;
                                                if (i13 == 3) {
                                                    x3Var = (x3) map.get(str);
                                                    if (x3Var == null) {
                                                        x3Var = new x3(y3Var);
                                                        map.put(str, x3Var);
                                                    } else {
                                                        x3Var.f14761b += i12;
                                                        x3Var.f14762c = x3Var.a();
                                                    }
                                                    ((ve.b) y3Var.k0()).getClass();
                                                    y3Var.t().O.e("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str4, str, Long.valueOf((x3Var.f14762c - System.currentTimeMillis()) / 1000));
                                                }
                                                tf.m mVar3 = y3Var.C;
                                                y3.R(mVar3);
                                                Long lValueOf2 = Long.valueOf(dVar.A);
                                                mVar3.h1(lValueOf2);
                                                y3Var.t().O.d("[sgtm] increased batch retry count after failed client upload. appId, rowId", str4, lValueOf2);
                                                return;
                                            }
                                            if (map.containsKey(str)) {
                                                map.remove(str);
                                            }
                                            y3Var2 = y3Var6;
                                            tf.m mVar4 = y3Var2.C;
                                            y3.R(mVar4);
                                            Long lValueOf3 = Long.valueOf(j10);
                                            mVar4.c1(lValueOf3);
                                            y3Var2.t().O.d("[sgtm] queued batch deleted after successful client upload. appId, rowId", str4, lValueOf3);
                                            if (j9 > 0) {
                                                mVar = y3Var2.C;
                                                y3.R(mVar);
                                                h1 h1Var = (h1) mVar.B;
                                                mVar.V0();
                                                mVar.W0();
                                                lValueOf = Long.valueOf(j9);
                                                contentValues = new ContentValues();
                                                contentValues.put("upload_type", Integer.valueOf(i12));
                                                ve.b bVar3 = h1Var.K;
                                                q0Var = h1Var.F;
                                                bVar3.getClass();
                                                contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                                                try {
                                                    if (mVar.K1().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j9), str4, String.valueOf(i11)}) != 1) {
                                                        h1.g(q0Var);
                                                        q0Var.J.d("Google Signal pending batch not updated. appId, rowId", str4, lValueOf);
                                                        break;
                                                    }
                                                    y3Var2.t().O.d("[sgtm] queued Google Signal batch updated. appId, signalRowId", str4, Long.valueOf(j9));
                                                    y3Var2.o(str4);
                                                    return;
                                                } catch (SQLiteException e11) {
                                                    h1.g(q0Var);
                                                    q0Var.G.e("Failed to update google Signal pending batch. appid, rowId", str4, Long.valueOf(j9), e11);
                                                    throw e11;
                                                }
                                            }
                                            return;
                                        }
                                    } catch (SQLiteException e12) {
                                        e = e12;
                                        i12 = 1;
                                    }
                                } catch (SQLiteException e13) {
                                    e = e13;
                                    y3Var6 = y3Var6;
                                    i11 = 4;
                                    i12 = 1;
                                    cursorQuery = cursorQuery;
                                    j9 = j9;
                                }
                            } else {
                                y3Var6 = y3Var6;
                                i11 = 4;
                                j9 = j11;
                                i12 = 1;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            cursorQuery = cursorQuery;
                        }
                    } catch (SQLiteException e14) {
                        e = e14;
                        y3Var6 = y3Var6;
                        i11 = 4;
                        j9 = j11;
                        i12 = 1;
                        cursorQuery = cursorQuery;
                    }
                } catch (SQLiteException e15) {
                    e = e15;
                    y3Var6 = y3Var6;
                    i11 = 4;
                    j9 = j11;
                    i12 = 1;
                    cursorQuery = null;
                } catch (Throwable th6) {
                    th = th6;
                }
                a4Var = a4VarW1;
                if (a4Var == null) {
                    y3Var6.t().J.d("[sgtm] Queued batch doesn't exist. appId, rowId", str4, Long.valueOf(j10));
                    return;
                }
                str = a4Var.f14529c;
                i13 = dVar.B;
                if (i13 == i12) {
                    y3Var = y3Var6;
                    if (i13 == 3) {
                        x3Var = (x3) map.get(str);
                        if (x3Var == null) {
                            x3Var = new x3(y3Var);
                            map.put(str, x3Var);
                        } else {
                            x3Var.f14761b += i12;
                            x3Var.f14762c = x3Var.a();
                        }
                        ((ve.b) y3Var.k0()).getClass();
                        y3Var.t().O.e("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str4, str, Long.valueOf((x3Var.f14762c - System.currentTimeMillis()) / 1000));
                    }
                    tf.m mVar5 = y3Var.C;
                    y3.R(mVar5);
                    Long lValueOf4 = Long.valueOf(dVar.A);
                    mVar5.h1(lValueOf4);
                    y3Var.t().O.d("[sgtm] increased batch retry count after failed client upload. appId, rowId", str4, lValueOf4);
                    return;
                }
                if (map.containsKey(str)) {
                    map.remove(str);
                }
                y3Var2 = y3Var6;
                tf.m mVar6 = y3Var2.C;
                y3.R(mVar6);
                Long lValueOf5 = Long.valueOf(j10);
                mVar6.c1(lValueOf5);
                y3Var2.t().O.d("[sgtm] queued batch deleted after successful client upload. appId, rowId", str4, lValueOf5);
                if (j9 > 0) {
                    mVar = y3Var2.C;
                    y3.R(mVar);
                    h1 h1Var2 = (h1) mVar.B;
                    mVar.V0();
                    mVar.W0();
                    lValueOf = Long.valueOf(j9);
                    contentValues = new ContentValues();
                    contentValues.put("upload_type", Integer.valueOf(i12));
                    ve.b bVar4 = h1Var2.K;
                    q0Var = h1Var2.F;
                    bVar4.getClass();
                    contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                    if (mVar.K1().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j9), str4, String.valueOf(i11)}) != 1) {
                        h1.g(q0Var);
                        q0Var.J.d("Google Signal pending batch not updated. appId, rowId", str4, lValueOf);
                        break;
                    }
                    y3Var2.t().O.d("[sgtm] queued Google Signal batch updated. appId, signalRowId", str4, Long.valueOf(j9));
                    y3Var2.o(str4);
                    return;
                }
                return;
            case 12:
                AtomicReference atomicReference2 = (AtomicReference) this.B;
                synchronized (atomicReference2) {
                    try {
                        try {
                            c3 c3Var = (c3) this.D;
                            h1 h1Var3 = (h1) c3Var.B;
                            w0 w0Var = h1Var3.E;
                            h1.e(w0Var);
                            if (w0Var.c1().i(s1.ANALYTICS_STORAGE)) {
                                tf.e0 e0Var2 = c3Var.E;
                                if (e0Var2 != null) {
                                    atomicReference2.set(e0Var2.m0((g4) this.C));
                                    String str5 = (String) atomicReference2.get();
                                    if (str5 != null) {
                                        i2 i2Var = ((h1) c3Var.B).M;
                                        h1.f(i2Var);
                                        i2Var.H.set(str5);
                                        w0 w0Var2 = h1Var3.E;
                                        h1.e(w0Var2);
                                        w0Var2.H.r(str5);
                                    }
                                    c3Var.i1();
                                    atomicReference = (AtomicReference) this.B;
                                    atomicReference.notify();
                                    return;
                                }
                                q0 q0Var4 = h1Var3.F;
                                h1.g(q0Var4);
                                q0Var4.G.b("Failed to get app instance id");
                            } else {
                                q0 q0Var5 = h1Var3.F;
                                h1.g(q0Var5);
                                q0Var5.L.b("Analytics storage consent denied; will not get app instance id");
                                i2 i2Var2 = ((h1) c3Var.B).M;
                                h1.f(i2Var2);
                                i2Var2.H.set(null);
                                w0 w0Var3 = h1Var3.E;
                                h1.e(w0Var3);
                                w0Var3.H.r(null);
                                atomicReference2.set(null);
                            }
                            atomicReference2.notify();
                            return;
                        } catch (RemoteException e16) {
                            q0 q0Var6 = ((h1) ((c3) this.D).B).F;
                            h1.g(q0Var6);
                            q0Var6.G.c(e16, "Failed to get app instance id");
                            atomicReference = (AtomicReference) this.B;
                        }
                    } catch (Throwable th7) {
                        ((AtomicReference) this.B).notify();
                        throw th7;
                    }
                }
                break;
            case 13:
                com.google.android.gms.internal.measurement.l0 l0Var = (com.google.android.gms.internal.measurement.l0) this.C;
                c3 c3Var2 = (c3) this.D;
                String strM0 = null;
                try {
                    try {
                        h1 h1Var4 = (h1) c3Var2.B;
                        w0 w0Var4 = h1Var4.E;
                        q0 q0Var7 = h1Var4.F;
                        h1.e(w0Var4);
                        if (w0Var4.c1().i(s1.ANALYTICS_STORAGE)) {
                            tf.e0 e0Var3 = c3Var2.E;
                            if (e0Var3 != null) {
                                strM0 = e0Var3.m0((g4) this.B);
                                if (strM0 != null) {
                                    i2 i2Var3 = h1Var4.M;
                                    h1.f(i2Var3);
                                    i2Var3.H.set(strM0);
                                    h1.e(w0Var4);
                                    w0Var4.H.r(strM0);
                                }
                                c3Var2.i1();
                                e4Var = ((h1) c3Var2.B).I;
                                h1.e(e4Var);
                                e4Var.D1(strM0, l0Var);
                                return;
                            }
                            h1.g(q0Var7);
                            q0Var7.G.b("Failed to get app instance id");
                        } else {
                            h1.g(q0Var7);
                            q0Var7.L.b("Analytics storage consent denied; will not get app instance id");
                            i2 i2Var4 = h1Var4.M;
                            h1.f(i2Var4);
                            i2Var4.H.set(null);
                            h1.e(w0Var4);
                            w0Var4.H.r(null);
                        }
                        e4Var = h1Var4.I;
                    } catch (Throwable th8) {
                        e4 e4Var2 = ((h1) c3Var2.B).I;
                        h1.e(e4Var2);
                        e4Var2.D1(null, l0Var);
                        throw th8;
                    }
                } catch (RemoteException e17) {
                    q0 q0Var8 = ((h1) c3Var2.B).F;
                    h1.g(q0Var8);
                    q0Var8.G.c(e17, "Failed to get app instance id");
                }
                h1.e(e4Var);
                e4Var.D1(strM0, l0Var);
                return;
            case 14:
                c3 c3Var3 = (c3) this.B;
                g4 g4Var5 = (g4) this.C;
                tf.d dVar2 = (tf.d) this.D;
                h1 h1Var5 = (h1) c3Var3.B;
                tf.e0 e0Var4 = c3Var3.E;
                if (e0Var4 == null) {
                    q0 q0Var9 = h1Var5.F;
                    h1.g(q0Var9);
                    q0Var9.G.b("[sgtm] Discarding data. Failed to update batch upload status.");
                    return;
                }
                try {
                    e0Var4.O1(g4Var5, dVar2);
                    c3Var3.i1();
                    return;
                } catch (RemoteException e18) {
                    q0 q0Var10 = h1Var5.F;
                    h1.g(q0Var10);
                    q0Var10.G.d("[sgtm] Failed to update batch upload status, rowId, exception", Long.valueOf(dVar2.A), e18);
                    return;
                }
            case 15:
                o10.b bVar5 = (o10.b) this.B;
                q0 q0Var11 = (q0) this.C;
                JobParameters jobParameters = (JobParameters) this.D;
                q0Var11.O.b("AppMeasurementJobService processed last upload request.");
                ((f3) ((Service) bVar5.B)).c(jobParameters);
                return;
            case 16:
                try {
                    objCall = ((v4.d) this.B).call();
                    break;
                } catch (Exception unused2) {
                    objCall = null;
                }
                ((Handler) this.D).post(new kh.r((qd.h0) this.C, objCall, 24));
                return;
            default:
                vi.b bVar6 = (vi.b) this.D;
                oi.b bVar7 = (oi.b) this.B;
                bVar6.b(bVar7, (xf.g) this.C);
                ((AtomicInteger) bVar6.f15711i.B).set(0);
                double dMin = Math.min(3600000.0d, Math.pow(bVar6.f15704b, bVar6.a()) * (60000.0d / bVar6.f15703a));
                String str6 = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dMin / 1000.0d)) + " s for report: " + bVar7.f11988b;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str6, null);
                }
                try {
                    Thread.sleep((long) dMin);
                    return;
                } catch (InterruptedException unused3) {
                    return;
                }
        }
    }
}
