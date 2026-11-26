package tf;

import android.app.BroadcastOptions;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.os.SystemClock;
import android.os.UserHandle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.CastStatusCodes;
import com.google.android.gms.cast.CredentialsData;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.internal.measurement.j4;
import com.google.android.gms.internal.measurement.l7;
import com.google.android.gms.internal.measurement.m8;
import com.google.android.gms.internal.measurement.o7;
import com.google.android.gms.internal.measurement.zzmr;
import com.google.protobuf.RuntimeVersion;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;

public final class y3 implements p1 {

    public static volatile y3 f14767k0;
    public final a1 A;
    public final t0 B;
    public m C;
    public qd.u0 D;
    public o3 E;
    public c F;
    public final t0 G;
    public t0 H;
    public e3 I;
    public y0 K;
    public final h1 L;
    public boolean N;
    public long O;
    public ArrayList P;
    public int R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public FileLock W;
    public FileChannel X;
    public ArrayList Y;
    public ArrayList Z;

    public final HashMap f14769b0;

    public final HashMap f14770c0;

    public final HashMap f14771d0;

    public q2 f14773f0;

    public String f14774g0;

    public i3 f14775h0;

    public long f14776i0;
    public final AtomicBoolean M = new AtomicBoolean(false);
    public final LinkedList Q = new LinkedList();

    public final HashMap f14772e0 = new HashMap();

    public final o10.b f14777j0 = new o10.b(this, 20);

    public long f14768a0 = -1;
    public final v3 J = new v3(this);

    public y3(z3 z3Var) {
        this.L = h1.m(z3Var.f14783a, null, null);
        t0 t0Var = new t0(this, 2);
        t0Var.X0();
        this.G = t0Var;
        t0 t0Var2 = new t0(this, 0);
        t0Var2.X0();
        this.B = t0Var2;
        a1 a1Var = new a1(this);
        a1Var.X0();
        this.A = a1Var;
        this.f14769b0 = new HashMap();
        this.f14770c0 = new HashMap();
        this.f14771d0 = new HashMap();
        C().e1(new a50.d(this, z3Var));
    }

    public static final void A(com.google.android.gms.internal.measurement.z2 z2Var, String str) {
        List listH = z2Var.h();
        for (int i10 = 0; i10 < listH.size(); i10++) {
            if (str.equals(((com.google.android.gms.internal.measurement.d3) listH.get(i10)).q())) {
                z2Var.o(i10);
                return;
            }
        }
    }

    public static String J(String str, Map map) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    public static final boolean Q(g4 g4Var) {
        return !TextUtils.isEmpty(g4Var.B);
    }

    public static final void R(t3 t3Var) {
        if (t3Var == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (!t3Var.D) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(t3Var.getClass())));
        }
    }

    public static final Boolean S(g4 g4Var) {
        Boolean bool = g4Var.P;
        String str = g4Var.f14621c0;
        if (!TextUtils.isEmpty(str)) {
            int iOrdinal = ((q1) o9.q.b0(str).B).ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                return null;
            }
            if (iOrdinal == 2) {
                return Boolean.TRUE;
            }
            if (iOrdinal == 3) {
                return Boolean.FALSE;
            }
        }
        return bool;
    }

    public static y3 y(Context context) {
        com.google.android.gms.common.internal.d0.h(context);
        com.google.android.gms.common.internal.d0.h(context.getApplicationContext());
        if (f14767k0 == null) {
            synchronized (y3.class) {
                try {
                    if (f14767k0 == null) {
                        f14767k0 = new y3(new z3(context, 0));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f14767k0;
    }

    public static final void z(com.google.android.gms.internal.measurement.z2 z2Var, int i10, String str) {
        List listH = z2Var.h();
        for (int i11 = 0; i11 < listH.size(); i11++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.d3) listH.get(i11)).q())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.c3 c3VarB = com.google.android.gms.internal.measurement.d3.B();
        c3VarB.h("_err");
        c3VarB.k(i10);
        com.google.android.gms.internal.measurement.d3 d3Var = (com.google.android.gms.internal.measurement.d3) c3VarB.e();
        com.google.android.gms.internal.measurement.c3 c3VarB2 = com.google.android.gms.internal.measurement.d3.B();
        c3VarB2.h("_ev");
        c3VarB2.j(str);
        com.google.android.gms.internal.measurement.d3 d3Var2 = (com.google.android.gms.internal.measurement.d3) c3VarB2.e();
        z2Var.m(d3Var);
        z2Var.m(d3Var2);
    }

    public final int B(String str, o10.b bVar) throws Throwable {
        q1 q1VarZ0;
        a1 a1Var = this.A;
        com.google.android.gms.internal.measurement.z1 z1VarQ1 = a1Var.q1(str);
        s1 s1Var = s1.AD_PERSONALIZATION;
        if (z1VarQ1 == null) {
            bVar.C(s1Var, h.FAILSAFE);
            return 1;
        }
        m mVar = this.C;
        R(mVar);
        u0 u0VarX1 = mVar.X1(str);
        if (u0VarX1 == null || ((q1) o9.q.b0(u0VarX1.s()).B) != q1.POLICY || (q1VarZ0 = a1Var.Z0(str, s1Var)) == q1.UNINITIALIZED) {
            bVar.C(s1Var, h.REMOTE_DEFAULT);
            if (a1Var.p1(str, s1Var)) {
                return 0;
            }
        } else {
            bVar.C(s1Var, h.REMOTE_ENFORCED_DEFAULT);
            if (q1VarZ0 == q1.GRANTED) {
                return 0;
            }
        }
        return 1;
    }

    @Override
    public final e1 C() {
        h1 h1Var = this.L;
        com.google.android.gms.common.internal.d0.h(h1Var);
        e1 e1Var = h1Var.G;
        h1.g(e1Var);
        return e1Var;
    }

    public final HashMap D(com.google.android.gms.internal.measurement.a3 a3Var) {
        Serializable serializableK1;
        HashMap map = new HashMap();
        h0();
        HashMap map2 = new HashMap();
        for (com.google.android.gms.internal.measurement.d3 d3Var : a3Var.p()) {
            if (d3Var.q().startsWith("gad_") && (serializableK1 = t0.k1(d3Var)) != null) {
                map2.put(d3Var.q(), serializableK1);
            }
        }
        for (Map.Entry entry : map2.entrySet()) {
            map.put((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        return map;
    }

    public final void E() {
        C().V0();
        if (this.Q.isEmpty()) {
            return;
        }
        if (this.f14775h0 == null) {
            this.f14775h0 = new i3(this, this.L, 2);
        }
        if (this.f14775h0.f14672c != 0) {
            return;
        }
        ((ve.b) k0()).getClass();
        long jMax = Math.max(0L, ((long) ((Integer) b0.B0.a(null)).intValue()) - (SystemClock.elapsedRealtime() - this.f14776i0));
        t().O.c(Long.valueOf(jMax), "Scheduling notify next app runnable, delay in ms");
        if (this.f14775h0 == null) {
            this.f14775h0 = new i3(this, this.L, 2);
        }
        this.f14775h0.b(jMax);
    }

    public final boolean F(long j9, String str) {
        boolean z10;
        int i10;
        Long l;
        h1 h1Var;
        long j10;
        int i11;
        m mVarD0;
        ArrayList arrayList;
        StringBuilder sb2;
        int i12;
        int iDelete;
        m mVarD1;
        com.google.android.gms.internal.measurement.e2 e2VarH1;
        Long l10;
        long j11;
        long j12;
        long j13;
        int iM1;
        HashMap map;
        long jS;
        Long l11;
        com.google.android.gms.internal.measurement.d3 d3VarD1;
        Long lValueOf;
        String str2;
        com.google.android.gms.internal.measurement.h3 h3Var;
        String str3;
        String str4;
        int i13;
        int i14;
        com.google.android.gms.internal.measurement.d3 d3VarK;
        com.google.android.gms.internal.measurement.z2 z2Var;
        String str5;
        int i15;
        Bundle bundleC1;
        int i16;
        t0 t0VarH0;
        ArrayList arrayList2;
        Iterator it;
        com.google.android.gms.internal.measurement.c3 c3VarB;
        Object obj;
        com.google.android.gms.internal.measurement.d3 d3VarK2;
        String str6;
        int i17;
        com.google.android.gms.internal.measurement.z2 z2Var2;
        ArrayList arrayList3;
        int i18;
        int i19;
        int i20;
        String strS;
        int iCharCount;
        int iCodePointAt;
        com.google.android.gms.internal.measurement.h3 h3Var2;
        y3 y3Var = this;
        String str7 = "1";
        String str8 = "_ai";
        String str9 = "purchase";
        String str10 = "items";
        Long l12 = 1L;
        y3Var.d0().H1();
        try {
            bb.d dVar = new bb.d(y3Var);
            y3Var.d0().D1(str, j9, y3Var.f14768a0, dVar);
            ArrayList arrayList4 = (ArrayList) dVar.D;
            if (arrayList4 == null || arrayList4.isEmpty()) {
                d0().I1();
                z10 = false;
            } else {
                com.google.android.gms.internal.measurement.h3 h3Var3 = (com.google.android.gms.internal.measurement.h3) ((com.google.android.gms.internal.measurement.i3) dVar.B).i();
                h3Var3.b();
                ((com.google.android.gms.internal.measurement.i3) h3Var3.B).a0();
                int i21 = -1;
                int i22 = -1;
                int i23 = 0;
                int i24 = 0;
                boolean z11 = false;
                boolean z12 = false;
                com.google.android.gms.internal.measurement.z2 z2Var3 = null;
                com.google.android.gms.internal.measurement.z2 z2Var4 = null;
                while (true) {
                    int size = ((ArrayList) dVar.D).size();
                    i10 = i24;
                    l = l12;
                    h1Var = y3Var.L;
                    if (i23 >= size) {
                        break;
                    }
                    com.google.android.gms.internal.measurement.z2 z2Var5 = (com.google.android.gms.internal.measurement.z2) ((com.google.android.gms.internal.measurement.a3) ((ArrayList) dVar.D).get(i23)).i();
                    int i25 = i23;
                    String str11 = str10;
                    if (y3Var.c0().k1(((com.google.android.gms.internal.measurement.i3) dVar.B).p(), z2Var5.p())) {
                        y3Var.t().a1().d("Dropping blocked raw event. appId", q0.d1(((com.google.android.gms.internal.measurement.i3) dVar.B).p()), h1Var.h().a(z2Var5.p()));
                        if (!str7.equals(y3Var.c0().V(((com.google.android.gms.internal.measurement.i3) dVar.B).p(), "measurement.upload.blacklist_internal")) && !str7.equals(y3Var.c0().V(((com.google.android.gms.internal.measurement.i3) dVar.B).p(), "measurement.upload.blacklist_public")) && !"_err".equals(z2Var5.p())) {
                            y3Var.i0();
                            e4.l1(y3Var.f14777j0, ((com.google.android.gms.internal.measurement.i3) dVar.B).p(), 11, "_ev", z2Var5.p(), 0);
                        }
                        str4 = str8;
                        str3 = str9;
                        i24 = i10;
                        i15 = i25;
                        str5 = str11;
                    } else {
                        String strP = z2Var5.p();
                        if (strP.equals(str9) || strP.equals("_iap") || strP.equals("ecommerce_purchase")) {
                            com.google.android.gms.internal.measurement.c3 c3VarB2 = com.google.android.gms.internal.measurement.d3.B();
                            c3VarB2.h("_ct");
                            if (z11) {
                                str2 = "returning";
                            } else {
                                String strP2 = ((com.google.android.gms.internal.measurement.i3) dVar.B).p();
                                if (y3Var.O(strP2, str9) && y3Var.O(strP2, "_iap") && y3Var.O(strP2, "ecommerce_purchase")) {
                                    str2 = "new";
                                } else {
                                    str2 = "returning";
                                }
                            }
                            c3VarB2.j(str2);
                            z2Var5.m((com.google.android.gms.internal.measurement.d3) c3VarB2.e());
                            z11 = true;
                        }
                        if (z2Var5.p().equals(u1.g(str8, u1.f14729c, u1.f14727a))) {
                            z2Var5.b();
                            ((com.google.android.gms.internal.measurement.a3) z2Var5.B).F(str8);
                            y3Var.t().c1().b("Renaming ad_impression to _ai");
                            if (Log.isLoggable(y3Var.t().f1(), 5)) {
                                for (int i26 = 0; i26 < z2Var5.j(); i26++) {
                                    if ("ad_platform".equals(z2Var5.k(i26).q()) && !z2Var5.k(i26).s().isEmpty() && "admob".equalsIgnoreCase(z2Var5.k(i26).s())) {
                                        y3Var.t().L.b("AdMob ad impression logged from app. Potentially duplicative.");
                                    }
                                }
                            }
                        }
                        boolean zL1 = y3Var.c0().l1(((com.google.android.gms.internal.measurement.i3) dVar.B).p(), z2Var5.p());
                        if (!zL1) {
                            y3Var.h0();
                            String strP3 = z2Var5.p();
                            com.google.android.gms.common.internal.d0.e(strP3);
                            if (strP3.hashCode() != 95027 || !strP3.equals("_ui")) {
                                str4 = str8;
                                str3 = str9;
                                h3Var = h3Var3;
                                zL1 = false;
                            }
                            if (zL1) {
                                arrayList3 = new ArrayList(z2Var5.h());
                                i19 = -1;
                                i20 = -1;
                                for (i18 = 0; i18 < arrayList3.size(); i18++) {
                                    if ("value".equals(((com.google.android.gms.internal.measurement.d3) arrayList3.get(i18)).q())) {
                                        i19 = i18;
                                    } else if ("currency".equals(((com.google.android.gms.internal.measurement.d3) arrayList3.get(i18)).q())) {
                                        i20 = i18;
                                    }
                                }
                                if (i19 != -1) {
                                    if (!((com.google.android.gms.internal.measurement.d3) arrayList3.get(i19)).t() || ((com.google.android.gms.internal.measurement.d3) arrayList3.get(i19)).x()) {
                                        if (i20 == -1) {
                                            strS = ((com.google.android.gms.internal.measurement.d3) arrayList3.get(i20)).s();
                                            if (strS.length() == 3) {
                                                iCharCount = 0;
                                                while (iCharCount < strS.length()) {
                                                    iCodePointAt = strS.codePointAt(iCharCount);
                                                    if (Character.isLetter(iCodePointAt)) {
                                                        iCharCount += Character.charCount(iCodePointAt);
                                                    }
                                                }
                                            }
                                        }
                                        y3Var.t().L.b("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                        z2Var5.o(i19);
                                        A(z2Var5, "_c");
                                        z(z2Var5, 19, "currency");
                                        break;
                                    }
                                    y3Var.t().L.b("Value must be specified with a numeric type.");
                                    z2Var5.o(i19);
                                    A(z2Var5, "_c");
                                    z(z2Var5, 18, "value");
                                }
                            }
                            if ("_e".equals(z2Var5.p())) {
                                y3Var.h0();
                                if (t0.d1((com.google.android.gms.internal.measurement.a3) z2Var5.e(), "_fr") == null) {
                                    if (z2Var4 != null && Math.abs(z2Var4.q() - z2Var5.q()) <= 1000) {
                                        z2Var2 = (com.google.android.gms.internal.measurement.z2) z2Var4.clone();
                                        if (y3Var.H(z2Var5, z2Var2)) {
                                            h3Var3 = h3Var;
                                            h3Var3.Z(i22, z2Var2);
                                            i21 = i21;
                                            z2Var3 = null;
                                            z2Var4 = null;
                                        }
                                    }
                                    h3Var3 = h3Var;
                                    z2Var3 = z2Var5;
                                    i21 = i10;
                                } else {
                                    h3Var3 = h3Var;
                                    i13 = i21;
                                    i21 = i13;
                                }
                            } else {
                                h3Var3 = h3Var;
                                if ("_vs".equals(z2Var5.p())) {
                                    y3Var.h0();
                                    if (t0.d1((com.google.android.gms.internal.measurement.a3) z2Var5.e(), "_et") == null) {
                                        if (z2Var3 != null && Math.abs(z2Var3.q() - z2Var5.q()) <= 1000) {
                                            z2Var = (com.google.android.gms.internal.measurement.z2) z2Var3.clone();
                                            if (y3Var.H(z2Var, z2Var5)) {
                                                int i27 = i21;
                                                h3Var3.Z(i27, z2Var);
                                                i21 = i27;
                                                z2Var3 = null;
                                                z2Var4 = null;
                                            }
                                        }
                                        i21 = i21;
                                        z2Var4 = z2Var5;
                                        i22 = i10;
                                    } else {
                                        i13 = i21;
                                        i21 = i13;
                                    }
                                } else {
                                    i13 = i21;
                                    if (y3Var.b0().f1(null, b0.f14574j1) && (("_f".equals(z2Var5.p()) || "_v".equals(z2Var5.p())) && ("_f".equals(z2Var5.p()) || "_v".equals(z2Var5.p())))) {
                                        for (i14 = 0; i14 < z2Var5.j(); i14++) {
                                            d3VarK = z2Var5.k(i14);
                                            if ("_elt".equals(d3VarK.q())) {
                                                z2Var5.t(d3VarK.u());
                                                z2Var5.o(i14);
                                                break;
                                            }
                                        }
                                    }
                                    i21 = i13;
                                }
                            }
                            if (z2Var5.j() != 0) {
                                y3Var.h0();
                                bundleC1 = t0.c1(z2Var5.h());
                                i16 = 0;
                                while (i16 < z2Var5.j()) {
                                    d3VarK2 = z2Var5.k(i16);
                                    str6 = str11;
                                    if (d3VarK2.q().equals(str6) || d3VarK2.z().isEmpty()) {
                                        i17 = i16;
                                        if (!d3VarK2.q().equals(str6)) {
                                            y3Var.s(z2Var5.p(), (com.google.android.gms.internal.measurement.c3) d3VarK2.i(), bundleC1, ((com.google.android.gms.internal.measurement.i3) dVar.B).p());
                                        }
                                    } else {
                                        String strP4 = ((com.google.android.gms.internal.measurement.i3) dVar.B).p();
                                        List listZ = d3VarK2.z();
                                        Bundle[] bundleArr = new Bundle[listZ.size()];
                                        int i28 = 0;
                                        while (i28 < listZ.size()) {
                                            com.google.android.gms.internal.measurement.d3 d3Var = (com.google.android.gms.internal.measurement.d3) listZ.get(i28);
                                            y3Var.h0();
                                            Bundle bundleC2 = t0.c1(d3Var.z());
                                            Iterator it2 = d3Var.z().iterator();
                                            while (it2.hasNext()) {
                                                y3Var.s(z2Var5.p(), (com.google.android.gms.internal.measurement.c3) ((com.google.android.gms.internal.measurement.d3) it2.next()).i(), bundleC2, strP4);
                                                i16 = i16;
                                                listZ = listZ;
                                            }
                                            bundleArr[i28] = bundleC2;
                                            i28++;
                                            i16 = i16;
                                            listZ = listZ;
                                        }
                                        i17 = i16;
                                        bundleC1.putParcelableArray(str6, bundleArr);
                                    }
                                    i16 = i17 + 1;
                                    str11 = str6;
                                }
                                str5 = str11;
                                z2Var5.b();
                                ((com.google.android.gms.internal.measurement.a3) z2Var5.B).D();
                                t0VarH0 = y3Var.h0();
                                arrayList2 = new ArrayList();
                                for (String str12 : bundleC1.keySet()) {
                                    c3VarB = com.google.android.gms.internal.measurement.d3.B();
                                    c3VarB.h(str12);
                                    obj = bundleC1.get(str12);
                                    if (obj != null) {
                                        t0VarH0.v1(c3VarB, obj);
                                        arrayList2.add((com.google.android.gms.internal.measurement.d3) c3VarB.e());
                                    }
                                }
                                it = arrayList2.iterator();
                                while (it.hasNext()) {
                                    z2Var5.m((com.google.android.gms.internal.measurement.d3) it.next());
                                }
                            } else {
                                str5 = str11;
                            }
                            i15 = i25;
                            ((ArrayList) dVar.D).set(i15, (com.google.android.gms.internal.measurement.a3) z2Var5.e());
                            h3Var3.a0(z2Var5);
                            i24 = i10 + 1;
                        }
                        str4 = str8;
                        int i29 = 0;
                        boolean z13 = false;
                        boolean z14 = false;
                        while (true) {
                            str3 = str9;
                            if (i29 >= z2Var5.j()) {
                                break;
                            }
                            if ("_c".equals(z2Var5.k(i29).q())) {
                                com.google.android.gms.internal.measurement.c3 c3Var = (com.google.android.gms.internal.measurement.c3) z2Var5.k(i29).i();
                                h3Var2 = h3Var3;
                                c3Var.k(1L);
                                com.google.android.gms.internal.measurement.d3 d3Var2 = (com.google.android.gms.internal.measurement.d3) c3Var.e();
                                z2Var5.b();
                                ((com.google.android.gms.internal.measurement.a3) z2Var5.B).A(i29, d3Var2);
                                z13 = true;
                            } else {
                                h3Var2 = h3Var3;
                                if ("_r".equals(z2Var5.k(i29).q())) {
                                    com.google.android.gms.internal.measurement.c3 c3Var2 = (com.google.android.gms.internal.measurement.c3) z2Var5.k(i29).i();
                                    c3Var2.k(1L);
                                    com.google.android.gms.internal.measurement.d3 d3Var3 = (com.google.android.gms.internal.measurement.d3) c3Var2.e();
                                    z2Var5.b();
                                    ((com.google.android.gms.internal.measurement.a3) z2Var5.B).A(i29, d3Var3);
                                    z14 = true;
                                    z13 = z13;
                                }
                            }
                            i29++;
                            str9 = str3;
                            h3Var3 = h3Var2;
                        }
                        h3Var = h3Var3;
                        if (!z13 && zL1) {
                            y3Var.t().c1().c(h1Var.h().a(z2Var5.p()), "Marking event as conversion");
                            com.google.android.gms.internal.measurement.c3 c3VarB3 = com.google.android.gms.internal.measurement.d3.B();
                            c3VarB3.h("_c");
                            c3VarB3.k(1L);
                            z2Var5.n(c3VarB3);
                        }
                        if (!z14) {
                            y3Var.t().c1().c(h1Var.h().a(z2Var5.p()), "Marking event as real-time");
                            com.google.android.gms.internal.measurement.c3 c3VarB4 = com.google.android.gms.internal.measurement.d3.B();
                            c3VarB4.h("_r");
                            c3VarB4.k(1L);
                            z2Var5.n(c3VarB4);
                        }
                        if (y3Var.d0().Z1(y3Var.b(), ((com.google.android.gms.internal.measurement.i3) dVar.B).p(), false, true, false, false).f14644e > y3Var.b0().d1(((com.google.android.gms.internal.measurement.i3) dVar.B).p(), b0.f14584p)) {
                            A(z2Var5, "_r");
                        } else {
                            z12 = true;
                        }
                        if (e4.T1(z2Var5.p()) && zL1 != 0 && y3Var.d0().Z1(y3Var.b(), ((com.google.android.gms.internal.measurement.i3) dVar.B).p(), true, false, false, false).f14642c > y3Var.b0().d1(((com.google.android.gms.internal.measurement.i3) dVar.B).p(), b0.f14582o)) {
                            y3Var.t().a1().c(q0.d1(((com.google.android.gms.internal.measurement.i3) dVar.B).p()), "Too many conversions. Not logging as conversion. appId");
                            boolean z15 = false;
                            com.google.android.gms.internal.measurement.c3 c3Var3 = null;
                            int i30 = -1;
                            for (int i31 = 0; i31 < z2Var5.j(); i31++) {
                                com.google.android.gms.internal.measurement.d3 d3VarK3 = z2Var5.k(i31);
                                if ("_c".equals(d3VarK3.q())) {
                                    c3Var3 = (com.google.android.gms.internal.measurement.c3) d3VarK3.i();
                                    i30 = i31;
                                } else if ("_err".equals(d3VarK3.q())) {
                                    z15 = true;
                                }
                            }
                            if (z15) {
                                if (c3Var3 != null) {
                                    z2Var5.o(i30);
                                } else {
                                    c3Var3 = null;
                                    if (c3Var3 != null) {
                                        com.google.android.gms.internal.measurement.c3 c3Var4 = (com.google.android.gms.internal.measurement.c3) c3Var3.clone();
                                        c3Var4.h("_err");
                                        c3Var4.k(10L);
                                        com.google.android.gms.internal.measurement.d3 d3Var4 = (com.google.android.gms.internal.measurement.d3) c3Var4.e();
                                        z2Var5.b();
                                        ((com.google.android.gms.internal.measurement.a3) z2Var5.B).A(i30, d3Var4);
                                    } else {
                                        y3Var.t().Z0().c(q0.d1(((com.google.android.gms.internal.measurement.i3) dVar.B).p()), "Did not find conversion parameter. appId");
                                    }
                                }
                            } else if (c3Var3 != null) {
                                com.google.android.gms.internal.measurement.c3 c3Var5 = (com.google.android.gms.internal.measurement.c3) c3Var3.clone();
                                c3Var5.h("_err");
                                c3Var5.k(10L);
                                com.google.android.gms.internal.measurement.d3 d3Var5 = (com.google.android.gms.internal.measurement.d3) c3Var5.e();
                                z2Var5.b();
                                ((com.google.android.gms.internal.measurement.a3) z2Var5.B).A(i30, d3Var5);
                            } else {
                                y3Var.t().Z0().c(q0.d1(((com.google.android.gms.internal.measurement.i3) dVar.B).p()), "Did not find conversion parameter. appId");
                            }
                        }
                        if (zL1) {
                            arrayList3 = new ArrayList(z2Var5.h());
                            i19 = -1;
                            i20 = -1;
                            while (i18 < arrayList3.size()) {
                                if ("value".equals(((com.google.android.gms.internal.measurement.d3) arrayList3.get(i18)).q())) {
                                    i19 = i18;
                                } else if ("currency".equals(((com.google.android.gms.internal.measurement.d3) arrayList3.get(i18)).q())) {
                                    i20 = i18;
                                }
                            }
                            if (i19 != -1) {
                                if (((com.google.android.gms.internal.measurement.d3) arrayList3.get(i19)).t()) {
                                }
                                if (i20 == -1) {
                                    strS = ((com.google.android.gms.internal.measurement.d3) arrayList3.get(i20)).s();
                                    if (strS.length() == 3) {
                                        iCharCount = 0;
                                        while (iCharCount < strS.length()) {
                                            iCodePointAt = strS.codePointAt(iCharCount);
                                            if (Character.isLetter(iCodePointAt)) {
                                                iCharCount += Character.charCount(iCodePointAt);
                                            }
                                        }
                                    }
                                }
                                y3Var.t().L.b("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                z2Var5.o(i19);
                                A(z2Var5, "_c");
                                z(z2Var5, 19, "currency");
                                break;
                            }
                        }
                        if ("_e".equals(z2Var5.p())) {
                            y3Var.h0();
                            if (t0.d1((com.google.android.gms.internal.measurement.a3) z2Var5.e(), "_fr") == null) {
                                if (z2Var4 != null) {
                                    z2Var2 = (com.google.android.gms.internal.measurement.z2) z2Var4.clone();
                                    if (y3Var.H(z2Var5, z2Var2)) {
                                        h3Var3 = h3Var;
                                        h3Var3.Z(i22, z2Var2);
                                        i21 = i21;
                                        z2Var3 = null;
                                        z2Var4 = null;
                                    }
                                }
                                h3Var3 = h3Var;
                                z2Var3 = z2Var5;
                                i21 = i10;
                            } else {
                                h3Var3 = h3Var;
                                i13 = i21;
                                i21 = i13;
                            }
                        } else {
                            h3Var3 = h3Var;
                            if ("_vs".equals(z2Var5.p())) {
                                y3Var.h0();
                                if (t0.d1((com.google.android.gms.internal.measurement.a3) z2Var5.e(), "_et") == null) {
                                    if (z2Var3 != null) {
                                        z2Var = (com.google.android.gms.internal.measurement.z2) z2Var3.clone();
                                        if (y3Var.H(z2Var, z2Var5)) {
                                            int i210 = i21;
                                            h3Var3.Z(i210, z2Var);
                                            i21 = i210;
                                            z2Var3 = null;
                                            z2Var4 = null;
                                        }
                                    }
                                    i21 = i21;
                                    z2Var4 = z2Var5;
                                    i22 = i10;
                                } else {
                                    i13 = i21;
                                    i21 = i13;
                                }
                            } else {
                                i13 = i21;
                                if (y3Var.b0().f1(null, b0.f14574j1)) {
                                    while (i14 < z2Var5.j()) {
                                        d3VarK = z2Var5.k(i14);
                                        if ("_elt".equals(d3VarK.q())) {
                                            z2Var5.t(d3VarK.u());
                                            z2Var5.o(i14);
                                            break;
                                        }
                                    }
                                }
                                i21 = i13;
                            }
                        }
                        if (z2Var5.j() != 0) {
                            y3Var.h0();
                            bundleC1 = t0.c1(z2Var5.h());
                            i16 = 0;
                            while (i16 < z2Var5.j()) {
                                d3VarK2 = z2Var5.k(i16);
                                str6 = str11;
                                if (d3VarK2.q().equals(str6)) {
                                    i17 = i16;
                                    if (!d3VarK2.q().equals(str6)) {
                                        y3Var.s(z2Var5.p(), (com.google.android.gms.internal.measurement.c3) d3VarK2.i(), bundleC1, ((com.google.android.gms.internal.measurement.i3) dVar.B).p());
                                    }
                                } else {
                                    i17 = i16;
                                    if (!d3VarK2.q().equals(str6)) {
                                        y3Var.s(z2Var5.p(), (com.google.android.gms.internal.measurement.c3) d3VarK2.i(), bundleC1, ((com.google.android.gms.internal.measurement.i3) dVar.B).p());
                                    }
                                }
                                i16 = i17 + 1;
                                str11 = str6;
                            }
                            str5 = str11;
                            z2Var5.b();
                            ((com.google.android.gms.internal.measurement.a3) z2Var5.B).D();
                            t0VarH0 = y3Var.h0();
                            arrayList2 = new ArrayList();
                            while (r5.hasNext()) {
                                c3VarB = com.google.android.gms.internal.measurement.d3.B();
                                c3VarB.h(str12);
                                obj = bundleC1.get(str12);
                                if (obj != null) {
                                    t0VarH0.v1(c3VarB, obj);
                                    arrayList2.add((com.google.android.gms.internal.measurement.d3) c3VarB.e());
                                }
                            }
                            it = arrayList2.iterator();
                            while (it.hasNext()) {
                                z2Var5.m((com.google.android.gms.internal.measurement.d3) it.next());
                            }
                        } else {
                            str5 = str11;
                        }
                        i15 = i25;
                        ((ArrayList) dVar.D).set(i15, (com.google.android.gms.internal.measurement.a3) z2Var5.e());
                        h3Var3.a0(z2Var5);
                        i24 = i10 + 1;
                    }
                    i23 = i15 + 1;
                    str10 = str5;
                    l12 = l;
                    str7 = str7;
                    str8 = str4;
                    str9 = str3;
                }
                long j14 = 0;
                long jLongValue = 0;
                int i32 = i10;
                int i33 = 0;
                while (i33 < i32) {
                    com.google.android.gms.internal.measurement.a3 a3VarT1 = ((com.google.android.gms.internal.measurement.i3) h3Var3.B).T1(i33);
                    if ("_e".equals(a3VarT1.s())) {
                        y3Var.h0();
                        if (t0.d1(a3VarT1, "_fr") != null) {
                            h3Var3.b0(i33);
                            i32--;
                            i33--;
                        } else {
                            y3Var.h0();
                            d3VarD1 = t0.d1(a3VarT1, "_et");
                            if (d3VarD1 == null) {
                                if (d3VarD1.t()) {
                                    lValueOf = Long.valueOf(d3VarD1.u());
                                } else {
                                    lValueOf = null;
                                }
                                if (lValueOf == null && lValueOf.longValue() > 0) {
                                    jLongValue += lValueOf.longValue();
                                }
                            }
                        }
                    } else {
                        y3Var.h0();
                        d3VarD1 = t0.d1(a3VarT1, "_et");
                        if (d3VarD1 == null) {
                            if (d3VarD1.t()) {
                                lValueOf = Long.valueOf(d3VarD1.u());
                            } else {
                                lValueOf = null;
                            }
                            if (lValueOf == null) {
                            }
                        }
                    }
                    i33++;
                }
                y3Var.G(h3Var3, jLongValue, false);
                Iterator it3 = h3Var3.X().iterator();
                while (it3.hasNext()) {
                    if ("_s".equals(((com.google.android.gms.internal.measurement.a3) it3.next()).s())) {
                        y3Var.d0().N1(h3Var3.q(), "_se");
                        break;
                    }
                }
                if (t0.J1(h3Var3, "_sid") >= 0) {
                    y3Var.G(h3Var3, jLongValue, true);
                } else {
                    int iJ1 = t0.J1(h3Var3, "_se");
                    if (iJ1 >= 0) {
                        h3Var3.b();
                        ((com.google.android.gms.internal.measurement.i3) h3Var3.B).e0(iJ1);
                        y3Var.t().Z0().c(q0.d1(((com.google.android.gms.internal.measurement.i3) dVar.B).p()), "Session engagement user property is in the bundle without session ID. appId");
                    }
                }
                String strP5 = ((com.google.android.gms.internal.measurement.i3) dVar.B).p();
                y3Var.C().V0();
                y3Var.j0();
                u0 u0VarX1 = y3Var.d0().X1(strP5);
                if (u0VarX1 == null) {
                    y3Var.t().Z0().c(q0.d1(strP5), "Cannot fix consent fields without appInfo. appId");
                } else {
                    y3Var.h(u0VarX1, h3Var3);
                }
                String strP6 = ((com.google.android.gms.internal.measurement.i3) dVar.B).p();
                y3Var.C().V0();
                y3Var.j0();
                u0 u0VarX2 = y3Var.d0().X1(strP6);
                if (u0VarX2 == null) {
                    y3Var.t().a1().c(q0.d1(strP6), "Cannot populate ad_campaign_info without appInfo. appId");
                } else {
                    y3Var.i(u0VarX2, h3Var3);
                }
                h3Var3.b();
                ((com.google.android.gms.internal.measurement.i3) h3Var3.B).h0(Long.MAX_VALUE);
                h3Var3.b();
                ((com.google.android.gms.internal.measurement.i3) h3Var3.B).i0(Long.MIN_VALUE);
                for (int i34 = 0; i34 < h3Var3.Y(); i34++) {
                    com.google.android.gms.internal.measurement.a3 a3VarT2 = ((com.google.android.gms.internal.measurement.i3) h3Var3.B).T1(i34);
                    if (a3VarT2.u() < ((com.google.android.gms.internal.measurement.i3) h3Var3.B).a2()) {
                        long jU = a3VarT2.u();
                        h3Var3.b();
                        ((com.google.android.gms.internal.measurement.i3) h3Var3.B).h0(jU);
                    }
                    if (a3VarT2.u() > ((com.google.android.gms.internal.measurement.i3) h3Var3.B).c2()) {
                        long jU2 = a3VarT2.u();
                        h3Var3.b();
                        ((com.google.android.gms.internal.measurement.i3) h3Var3.B).i0(jU2);
                    }
                }
                h3Var3.P();
                t1 t1Var = t1.f14700c;
                t1 t1VarJ = y3Var.a(((com.google.android.gms.internal.measurement.i3) dVar.B).p()).j(t1.c(100, ((com.google.android.gms.internal.measurement.i3) dVar.B).u0()));
                t1 t1VarA1 = y3Var.d0().A1(((com.google.android.gms.internal.measurement.i3) dVar.B).p());
                y3Var.d0().z1(((com.google.android.gms.internal.measurement.i3) dVar.B).p(), t1VarJ);
                s1 s1Var = s1.ANALYTICS_STORAGE;
                if (!t1VarJ.i(s1Var) && t1VarA1.i(s1Var)) {
                    y3Var.d0().L1(((com.google.android.gms.internal.measurement.i3) dVar.B).p());
                } else if (t1VarJ.i(s1Var) && !t1VarA1.i(s1Var)) {
                    y3Var.d0().M1(((com.google.android.gms.internal.measurement.i3) dVar.B).p());
                }
                s1 s1Var2 = s1.AD_STORAGE;
                if (!t1VarJ.i(s1Var2)) {
                    h3Var3.b();
                    ((com.google.android.gms.internal.measurement.i3) h3Var3.B).z1();
                    h3Var3.b();
                    ((com.google.android.gms.internal.measurement.i3) h3Var3.B).B1();
                    h3Var3.b();
                    ((com.google.android.gms.internal.measurement.i3) h3Var3.B).S0();
                }
                if (!t1VarJ.i(s1Var)) {
                    h3Var3.b();
                    ((com.google.android.gms.internal.measurement.i3) h3Var3.B).D1();
                    h3Var3.b();
                    ((com.google.android.gms.internal.measurement.i3) h3Var3.B).Z0();
                }
                m8.a();
                if (y3Var.b0().f1(((com.google.android.gms.internal.measurement.i3) dVar.B).p(), b0.P0)) {
                    y3Var.i0();
                    if (e4.r1(((com.google.android.gms.internal.measurement.i3) dVar.B).p()) && y3Var.a(((com.google.android.gms.internal.measurement.i3) dVar.B).p()).i(s1Var2) && ((com.google.android.gms.internal.measurement.i3) dVar.B).z0()) {
                        y3Var.r(h3Var3, dVar);
                    }
                }
                h3Var3.b();
                ((com.google.android.gms.internal.measurement.i3) h3Var3.B).L1();
                h3Var3.M(y3Var.g0().Z0(h3Var3.q(), h3Var3.X(), Collections.unmodifiableList(((com.google.android.gms.internal.measurement.i3) h3Var3.B).U1()), Long.valueOf(((com.google.android.gms.internal.measurement.i3) h3Var3.B).a2()), Long.valueOf(((com.google.android.gms.internal.measurement.i3) h3Var3.B).c2()), !t1VarJ.i(s1Var)));
                if (y3Var.b0().X0(((com.google.android.gms.internal.measurement.i3) dVar.B).p())) {
                    HashMap map2 = new HashMap();
                    ArrayList arrayList5 = new ArrayList();
                    SecureRandom secureRandomS1 = y3Var.i0().S1();
                    int i35 = 0;
                    while (i35 < h3Var3.Y()) {
                        com.google.android.gms.internal.measurement.z2 z2Var6 = (com.google.android.gms.internal.measurement.z2) ((com.google.android.gms.internal.measurement.i3) h3Var3.B).T1(i35).i();
                        if (z2Var6.p().equals("_ep")) {
                            y3Var.h0();
                            String str13 = (String) t0.e1((com.google.android.gms.internal.measurement.a3) z2Var6.e(), "_en");
                            q qVarT1 = (q) map2.get(str13);
                            if (qVarT1 == null) {
                                m mVarD2 = y3Var.d0();
                                String strP7 = ((com.google.android.gms.internal.measurement.i3) dVar.B).p();
                                com.google.android.gms.common.internal.d0.h(str13);
                                qVarT1 = mVarD2.t1("events", strP7, str13);
                                if (qVarT1 != null) {
                                    map2.put(str13, qVarT1);
                                }
                            }
                            if (qVarT1 == null || qVarT1.f14691i != null) {
                                l10 = l;
                            } else {
                                Long l13 = qVarT1.f14692j;
                                if (l13 != null && l13.longValue() > 1) {
                                    y3Var.h0();
                                    t0.b1(z2Var6, "_sr", l13);
                                }
                                Boolean bool = qVarT1.f14693k;
                                if (bool == null || !bool.booleanValue()) {
                                    l10 = l;
                                } else {
                                    y3Var.h0();
                                    l10 = l;
                                    t0.b1(z2Var6, "_efs", l10);
                                }
                                arrayList5.add((com.google.android.gms.internal.measurement.a3) z2Var6.e());
                            }
                            h3Var3.Z(i35, z2Var6);
                            j11 = j14;
                        } else {
                            l10 = l;
                            a1 a1VarC0 = y3Var.c0();
                            j11 = j14;
                            String strP8 = ((com.google.android.gms.internal.measurement.i3) dVar.B).p();
                            String strV = a1VarC0.V(strP8, "measurement.account.time_zone_offset_minutes");
                            if (TextUtils.isEmpty(strV)) {
                                j12 = j11;
                            } else {
                                try {
                                    j12 = Long.parseLong(strV);
                                } catch (NumberFormatException e3) {
                                    ((h1) a1VarC0.B).t().a1().d("Unable to parse timezone offset. appId", q0.d1(strP8), e3);
                                    j12 = j11;
                                }
                            }
                            y3Var.i0();
                            long j15 = j12 * 60000;
                            long jQ = (z2Var6.q() + j15) / 86400000;
                            com.google.android.gms.internal.measurement.a3 a3Var = (com.google.android.gms.internal.measurement.a3) z2Var6.e();
                            if (TextUtils.isEmpty("_dbg")) {
                                j13 = j15;
                            } else {
                                Iterator it4 = a3Var.p().iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        com.google.android.gms.internal.measurement.d3 d3Var6 = (com.google.android.gms.internal.measurement.d3) it4.next();
                                        j13 = j15;
                                        if ("_dbg".equals(d3Var6.q())) {
                                            iM1 = !l10.equals(Long.valueOf(d3Var6.u())) ? c0().m1(((com.google.android.gms.internal.measurement.i3) dVar.B).p(), z2Var6.p()) : 1;
                                        } else {
                                            j15 = j13;
                                        }
                                    } else {
                                        j13 = j15;
                                    }
                                }
                            }
                            if (iM1 <= 0) {
                                t().a1().d("Sample rate must be positive. event, rate", z2Var6.p(), Integer.valueOf(iM1));
                                arrayList5.add((com.google.android.gms.internal.measurement.a3) z2Var6.e());
                                h3Var3.Z(i35, z2Var6);
                            } else {
                                q qVarB = (q) map2.get(z2Var6.p());
                                if (qVarB == null && (qVarB = d0().t1("events", ((com.google.android.gms.internal.measurement.i3) dVar.B).p(), z2Var6.p())) == null) {
                                    t().a1().d("Event being bundled has no eventAggregate. appId, eventName", ((com.google.android.gms.internal.measurement.i3) dVar.B).p(), z2Var6.p());
                                    qVarB = new q(((com.google.android.gms.internal.measurement.i3) dVar.B).p(), z2Var6.p(), 1L, 1L, 1L, z2Var6.q(), 0L, null, null, null, null);
                                }
                                h0();
                                Long l14 = (Long) t0.e1((com.google.android.gms.internal.measurement.a3) z2Var6.e(), "_eid");
                                boolean z16 = l14 != null;
                                if (iM1 == 1) {
                                    arrayList5.add((com.google.android.gms.internal.measurement.a3) z2Var6.e());
                                    if (z16 && (qVarB.f14691i != null || qVarB.f14692j != null || qVarB.f14693k != null)) {
                                        map2.put(z2Var6.p(), qVarB.b(null, null, null));
                                    }
                                    h3Var3.Z(i35, z2Var6);
                                } else {
                                    if (secureRandomS1.nextInt(iM1) == 0) {
                                        h0();
                                        HashMap map3 = map2;
                                        Long lValueOf2 = Long.valueOf(iM1);
                                        t0.b1(z2Var6, "_sr", lValueOf2);
                                        arrayList5.add((com.google.android.gms.internal.measurement.a3) z2Var6.e());
                                        if (z16) {
                                            qVarB = qVarB.b(null, lValueOf2, null);
                                        }
                                        map = map3;
                                        map.put(z2Var6.p(), new q(qVarB.f14683a, qVarB.f14684b, qVarB.f14685c, qVarB.f14686d, qVarB.f14687e, qVarB.f14688f, z2Var6.q(), Long.valueOf(jQ), qVarB.f14691i, qVarB.f14692j, qVarB.f14693k));
                                        l11 = l10;
                                    } else {
                                        map = map2;
                                        Long l15 = qVarB.f14690h;
                                        if (l15 != null) {
                                            jS = l15.longValue();
                                        } else {
                                            i0();
                                            jS = (j13 + z2Var6.s()) / 86400000;
                                        }
                                        if (jS != jQ) {
                                            h0();
                                            t0.b1(z2Var6, "_efs", l10);
                                            h0();
                                            l11 = l10;
                                            Long lValueOf3 = Long.valueOf(iM1);
                                            t0.b1(z2Var6, "_sr", lValueOf3);
                                            arrayList5.add((com.google.android.gms.internal.measurement.a3) z2Var6.e());
                                            if (z16) {
                                                qVarB = qVarB.b(null, lValueOf3, Boolean.TRUE);
                                            }
                                            map.put(z2Var6.p(), new q(qVarB.f14683a, qVarB.f14684b, qVarB.f14685c, qVarB.f14686d, qVarB.f14687e, qVarB.f14688f, z2Var6.q(), Long.valueOf(jQ), qVarB.f14691i, qVarB.f14692j, qVarB.f14693k));
                                        } else {
                                            l11 = l10;
                                            if (z16) {
                                                map.put(z2Var6.p(), qVarB.b(l14, null, null));
                                            }
                                        }
                                    }
                                    h3Var3.Z(i35, z2Var6);
                                }
                                i35++;
                                y3Var = this;
                                l = l11;
                                map2 = map;
                                j14 = j11;
                            }
                        }
                        map = map2;
                        l11 = l10;
                        i35++;
                        y3Var = this;
                        l = l11;
                        map2 = map;
                        j14 = j11;
                    }
                    j10 = j14;
                    HashMap map4 = map2;
                    if (arrayList5.size() < h3Var3.Y()) {
                        h3Var3.b();
                        ((com.google.android.gms.internal.measurement.i3) h3Var3.B).a0();
                        h3Var3.b();
                        ((com.google.android.gms.internal.measurement.i3) h3Var3.B).Z(arrayList5);
                    }
                    Iterator it5 = map4.entrySet().iterator();
                    while (it5.hasNext()) {
                        d0().u1("events", (q) ((Map.Entry) it5.next()).getValue());
                    }
                } else {
                    j10 = 0;
                }
                String strP9 = ((com.google.android.gms.internal.measurement.i3) dVar.B).p();
                u0 u0VarX3 = d0().X1(strP9);
                try {
                    if (u0VarX3 == null) {
                        t().Z0().c(q0.d1(((com.google.android.gms.internal.measurement.i3) dVar.B).p()), "Bundling raw events w/o app info. appId");
                    } else {
                        if (h3Var3.Y() > 0) {
                            e1 e1Var = u0VarX3.f14703a.G;
                            h1.g(e1Var);
                            e1Var.V0();
                            long j16 = u0VarX3.f14711i;
                            if (j16 != j10) {
                                h3Var3.h(j16);
                            } else {
                                h3Var3.j();
                            }
                            e1 e1Var2 = u0VarX3.f14703a.G;
                            h1.g(e1Var2);
                            e1Var2.V0();
                            long j17 = u0VarX3.f14710h;
                            if (j17 != j10) {
                                j16 = j17;
                            }
                            if (j16 != j10) {
                                h3Var3.e0(j16);
                            } else {
                                h3Var3.f0();
                            }
                            u0VarX3.h(h3Var3.Y());
                            e1 e1Var3 = u0VarX3.f14703a.G;
                            h1.g(e1Var3);
                            e1Var3.V0();
                            int i36 = (int) u0VarX3.F;
                            h3Var3.b();
                            ((com.google.android.gms.internal.measurement.i3) h3Var3.B).j1(i36);
                            e1 e1Var4 = u0VarX3.f14703a.G;
                            h1.g(e1Var4);
                            e1Var4.V0();
                            h3Var3.A((int) u0VarX3.f14709g);
                            u0VarX3.L(((com.google.android.gms.internal.measurement.i3) h3Var3.B).a2());
                            u0VarX3.M(((com.google.android.gms.internal.measurement.i3) h3Var3.B).c2());
                            String strU = u0VarX3.u();
                            if (strU != null) {
                                h3Var3.I(strU);
                            } else {
                                h3Var3.J();
                            }
                            i11 = 0;
                            d0().Y1(u0VarX3, false);
                        }
                        if (h3Var3.Y() > 0) {
                            h1Var.getClass();
                            e2VarH1 = c0().h1(((com.google.android.gms.internal.measurement.i3) dVar.B).p());
                            if (e2VarH1 == null && e2VarH1.p()) {
                                long jQ2 = e2VarH1.q();
                                h3Var3.b();
                                ((com.google.android.gms.internal.measurement.i3) h3Var3.B).Q0(jQ2);
                            } else if (((com.google.android.gms.internal.measurement.i3) dVar.B).E().isEmpty()) {
                                h3Var3.b();
                                ((com.google.android.gms.internal.measurement.i3) h3Var3.B).Q0(-1L);
                            } else {
                                t().a1().c(q0.d1(((com.google.android.gms.internal.measurement.i3) dVar.B).p()), "Did not find measurement config or missing version info. appId");
                            }
                            d0().c2((com.google.android.gms.internal.measurement.i3) h3Var3.e(), z12);
                        }
                        mVarD0 = d0();
                        arrayList = (ArrayList) dVar.C;
                        com.google.android.gms.common.internal.d0.h(arrayList);
                        mVarD0.V0();
                        mVarD0.W0();
                        sb2 = new StringBuilder("rowid in (");
                        for (i12 = i11; i12 < arrayList.size(); i12++) {
                            if (i12 != 0) {
                                sb2.append(",");
                            }
                            sb2.append(((Long) arrayList.get(i12)).longValue());
                        }
                        sb2.append(")");
                        iDelete = mVarD0.K1().delete("raw_events", sb2.toString(), null);
                        if (iDelete != arrayList.size()) {
                            ((h1) mVarD0.B).t().Z0().d("Deleted fewer rows from raw events table than expected", Integer.valueOf(iDelete), Integer.valueOf(arrayList.size()));
                        }
                        mVarD1 = d0();
                        mVarD1.K1().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{strP9, strP9});
                        d0().I1();
                        z10 = true;
                    }
                    mVarD1.K1().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{strP9, strP9});
                } catch (SQLiteException e10) {
                    ((h1) mVarD1.B).t().Z0().d("Failed to remove unused event metadata. appId", q0.d1(strP9), e10);
                }
                i11 = 0;
                if (h3Var3.Y() > 0) {
                    h1Var.getClass();
                    e2VarH1 = c0().h1(((com.google.android.gms.internal.measurement.i3) dVar.B).p());
                    if (e2VarH1 == null) {
                        if (((com.google.android.gms.internal.measurement.i3) dVar.B).E().isEmpty()) {
                            h3Var3.b();
                            ((com.google.android.gms.internal.measurement.i3) h3Var3.B).Q0(-1L);
                        } else {
                            t().a1().c(q0.d1(((com.google.android.gms.internal.measurement.i3) dVar.B).p()), "Did not find measurement config or missing version info. appId");
                        }
                    } else if (((com.google.android.gms.internal.measurement.i3) dVar.B).E().isEmpty()) {
                        h3Var3.b();
                        ((com.google.android.gms.internal.measurement.i3) h3Var3.B).Q0(-1L);
                    } else {
                        t().a1().c(q0.d1(((com.google.android.gms.internal.measurement.i3) dVar.B).p()), "Did not find measurement config or missing version info. appId");
                    }
                    d0().c2((com.google.android.gms.internal.measurement.i3) h3Var3.e(), z12);
                }
                mVarD0 = d0();
                arrayList = (ArrayList) dVar.C;
                com.google.android.gms.common.internal.d0.h(arrayList);
                mVarD0.V0();
                mVarD0.W0();
                sb2 = new StringBuilder("rowid in (");
                while (i12 < arrayList.size()) {
                    if (i12 != 0) {
                        sb2.append(",");
                    }
                    sb2.append(((Long) arrayList.get(i12)).longValue());
                }
                sb2.append(")");
                iDelete = mVarD0.K1().delete("raw_events", sb2.toString(), null);
                if (iDelete != arrayList.size()) {
                    ((h1) mVarD0.B).t().Z0().d("Deleted fewer rows from raw events table than expected", Integer.valueOf(iDelete), Integer.valueOf(arrayList.size()));
                }
                mVarD1 = d0();
                d0().I1();
                z10 = true;
            }
            d0().J1();
            return z10;
        } catch (Throwable th2) {
            d0().J1();
            throw th2;
        }
    }

    public final void G(com.google.android.gms.internal.measurement.h3 h3Var, long j9, boolean z10) throws Throwable {
        c4 c4Var;
        Object obj;
        String str = true != z10 ? "_lte" : "_se";
        m mVar = this.C;
        R(mVar);
        c4 c4VarP1 = mVar.P1(h3Var.q(), str);
        if (c4VarP1 == null || (obj = c4VarP1.f14612e) == null) {
            String strQ = h3Var.q();
            ((ve.b) k0()).getClass();
            c4Var = new c4(strQ, "auto", str, System.currentTimeMillis(), Long.valueOf(j9));
        } else {
            String strQ2 = h3Var.q();
            ((ve.b) k0()).getClass();
            c4Var = new c4(strQ2, "auto", str, System.currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + j9));
        }
        com.google.android.gms.internal.measurement.q3 q3VarA = com.google.android.gms.internal.measurement.r3.A();
        q3VarA.b();
        ((com.google.android.gms.internal.measurement.r3) q3VarA.B).C(str);
        ((ve.b) k0()).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        q3VarA.b();
        ((com.google.android.gms.internal.measurement.r3) q3VarA.B).B(jCurrentTimeMillis);
        Object obj2 = c4Var.f14612e;
        long jLongValue = ((Long) obj2).longValue();
        q3VarA.b();
        ((com.google.android.gms.internal.measurement.r3) q3VarA.B).F(jLongValue);
        com.google.android.gms.internal.measurement.r3 r3Var = (com.google.android.gms.internal.measurement.r3) q3VarA.e();
        int iJ1 = t0.J1(h3Var, str);
        if (iJ1 >= 0) {
            h3Var.b();
            ((com.google.android.gms.internal.measurement.i3) h3Var.B).c0(iJ1, r3Var);
        } else {
            h3Var.b();
            ((com.google.android.gms.internal.measurement.i3) h3Var.B).d0(r3Var);
        }
        if (j9 > 0) {
            m mVar2 = this.C;
            R(mVar2);
            mVar2.O1(c4Var);
            t().O.d("Updated engagement user property. scope, value", true != z10 ? "lifetime" : "session-scoped", obj2);
        }
    }

    public final boolean H(com.google.android.gms.internal.measurement.z2 z2Var, com.google.android.gms.internal.measurement.z2 z2Var2) {
        com.google.android.gms.common.internal.d0.b("_e".equals(z2Var.p()));
        h0();
        com.google.android.gms.internal.measurement.d3 d3VarD1 = t0.d1((com.google.android.gms.internal.measurement.a3) z2Var.e(), "_sc");
        String strS = d3VarD1 == null ? null : d3VarD1.s();
        h0();
        com.google.android.gms.internal.measurement.d3 d3VarD2 = t0.d1((com.google.android.gms.internal.measurement.a3) z2Var2.e(), "_pc");
        String strS2 = d3VarD2 != null ? d3VarD2.s() : null;
        if (strS2 == null || !strS2.equals(strS)) {
            return false;
        }
        com.google.android.gms.common.internal.d0.b("_e".equals(z2Var.p()));
        h0();
        com.google.android.gms.internal.measurement.d3 d3VarD3 = t0.d1((com.google.android.gms.internal.measurement.a3) z2Var.e(), "_et");
        if (d3VarD3 == null || !d3VarD3.t() || d3VarD3.u() <= 0) {
            return true;
        }
        long jU = d3VarD3.u();
        h0();
        com.google.android.gms.internal.measurement.d3 d3VarD4 = t0.d1((com.google.android.gms.internal.measurement.a3) z2Var2.e(), "_et");
        if (d3VarD4 != null && d3VarD4.u() > 0) {
            jU += d3VarD4.u();
        }
        h0();
        t0.b1(z2Var2, "_et", Long.valueOf(jU));
        h0();
        t0.b1(z2Var, "_fr", 1L);
        return true;
    }

    public final boolean I() {
        C().V0();
        j0();
        m mVar = this.C;
        R(mVar);
        if (mVar.F1("select count(1) > 0 from raw_events", null) != 0) {
            return true;
        }
        m mVar2 = this.C;
        R(mVar2);
        return !TextUtils.isEmpty(mVar2.d1());
    }

    public final void K() {
        boolean z10;
        long jMax;
        long jMax2;
        int i10;
        t0 t0Var;
        qd.u0 u0VarF0;
        y3 y3Var;
        long jE;
        long jMax3;
        long jCurrentTimeMillis;
        o3 o3Var;
        q0 q0Var;
        Context context;
        JobInfo jobInfoBuild;
        JobScheduler jobScheduler;
        Method method;
        int iIntValue;
        t0 t0Var2 = this.G;
        C().V0();
        j0();
        if (this.O > 0) {
            ((ve.b) k0()).getClass();
            long jAbs = 3600000 - Math.abs(SystemClock.elapsedRealtime() - this.O);
            if (jAbs > 0) {
                t().O.c(Long.valueOf(jAbs), "Upload has been suspended. Will update scheduling later in approximately ms");
                f0().b();
                o3 o3Var2 = this.E;
                R(o3Var2);
                o3Var2.Z0();
                return;
            }
            this.O = 0L;
        }
        if (!this.L.c() || !I()) {
            t().O.b("Nothing to upload or uploading impossible");
            f0().b();
            o3 o3Var3 = this.E;
            R(o3Var3);
            o3Var3.Z0();
            return;
        }
        ((ve.b) k0()).getClass();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        b0();
        long jMax4 = Math.max(0L, ((Long) b0.O.a(null)).longValue());
        m mVar = this.C;
        R(mVar);
        if (mVar.F1("select count(1) > 0 from raw_events where realtime = 1", null) != 0) {
            z10 = true;
        } else {
            m mVar2 = this.C;
            R(mVar2);
            if (mVar2.F1("select count(1) > 0 from queue where has_realtime = 1", null) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (z10) {
            String strZ0 = b0().Z0("debug.firebase.analytics.app");
            if (TextUtils.isEmpty(strZ0) || ".none.".equals(strZ0)) {
                b0();
                jMax = Math.max(0L, ((Long) b0.I.a(null)).longValue());
            } else {
                b0();
                jMax = Math.max(0L, ((Long) b0.J.a(null)).longValue());
            }
        } else {
            b0();
            jMax = Math.max(0L, ((Long) b0.H.a(null)).longValue());
        }
        long jE2 = this.I.I.e();
        long jE3 = this.I.J.e();
        m mVar3 = this.C;
        R(mVar3);
        long jG1 = mVar3.G1("select max(bundle_end_timestamp) from queue", null, 0L);
        m mVar4 = this.C;
        R(mVar4);
        long jMax5 = Math.max(jG1, mVar4.G1("select max(timestamp) from raw_events", null, 0L));
        if (jMax5 != 0) {
            long jAbs2 = jCurrentTimeMillis2 - Math.abs(jMax5 - jCurrentTimeMillis2);
            long jAbs3 = jCurrentTimeMillis2 - Math.abs(jE2 - jCurrentTimeMillis2);
            long jAbs4 = jCurrentTimeMillis2 - Math.abs(jE3 - jCurrentTimeMillis2);
            long jMin = jMax4 + jAbs2;
            long jMax6 = Math.max(jAbs3, jAbs4);
            if (z10 && jMax6 > 0) {
                jMin = Math.min(jAbs2, jMax6) + jMax;
            }
            R(t0Var2);
            jMax2 = !t0Var2.F1(jMax6, jMax) ? jMax6 + jMax : jMin;
            if (jAbs4 != 0 && jAbs4 >= jAbs2) {
                int i11 = 0;
                while (true) {
                    b0();
                    i10 = 0;
                    if (i11 >= Math.min(20, Math.max(0, ((Integer) b0.Q.a(null)).intValue()))) {
                        jMax2 = 0;
                        break;
                    }
                    b0();
                    jMax2 += Math.max(0L, ((Long) b0.P.a(null)).longValue()) * (1 << i11);
                    if (jMax2 > jAbs4) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            if (jMax2 == 0) {
                t().O.b("Next upload time is 0");
                f0().b();
                o3 o3Var4 = this.E;
                R(o3Var4);
                o3Var4.Z0();
                return;
            }
            t0Var = this.B;
            R(t0Var);
            if (t0Var.p1()) {
                t().O.b("No network");
                u0VarF0 = f0();
                y3Var = (y3) u0VarF0.f12970d;
                y3Var.j0();
                y3Var.C().V0();
                if (!u0VarF0.f12968b) {
                    y3Var.L.A.registerReceiver(u0VarF0, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    t0 t0Var3 = y3Var.B;
                    R(t0Var3);
                    u0VarF0.f12969c = t0Var3.p1();
                    y3Var.t().O.c(Boolean.valueOf(u0VarF0.f12969c), "Registering connectivity change receiver. Network connected");
                    u0VarF0.f12968b = true;
                }
                o3 o3Var5 = this.E;
                R(o3Var5);
                o3Var5.Z0();
                return;
            }
            jE = this.I.H.e();
            b0();
            jMax3 = Math.max(0L, ((Long) b0.G.a(null)).longValue());
            R(t0Var2);
            if (!t0Var2.F1(jE, jMax3)) {
                jMax2 = Math.max(jMax2, jE + jMax3);
            }
            f0().b();
            ((ve.b) k0()).getClass();
            jCurrentTimeMillis = jMax2 - System.currentTimeMillis();
            if (jCurrentTimeMillis <= 0) {
                b0();
                jCurrentTimeMillis = Math.max(0L, ((Long) b0.K.a(null)).longValue());
                i7.m1 m1Var = this.I.I;
                ((ve.b) k0()).getClass();
                m1Var.f(System.currentTimeMillis());
            }
            t().O.c(Long.valueOf(jCurrentTimeMillis), "Upload scheduled in approximately ms");
            o3Var = this.E;
            R(o3Var);
            o3Var.W0();
            h1 h1Var = (h1) o3Var.B;
            h1Var.getClass();
            q0Var = h1Var.F;
            context = h1Var.A;
            if (!e4.L1(context)) {
                h1.g(q0Var);
                q0Var.N.b("Receiver not registered/enabled");
            }
            if (!e4.o1(context)) {
                h1.g(q0Var);
                q0Var.N.b("Service not registered/enabled");
            }
            o3Var.Z0();
            h1.g(q0Var);
            q0Var.O.c(Long.valueOf(jCurrentTimeMillis), "Scheduling upload, millis");
            h1Var.K.getClass();
            SystemClock.elapsedRealtime();
            if (jCurrentTimeMillis < Math.max(0L, ((Long) b0.L.a(null)).longValue()) && o3Var.a1().f14672c == 0) {
                o3Var.a1().b(jCurrentTimeMillis);
            }
            ComponentName componentName = new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService");
            int iC1 = o3Var.c1();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            jobInfoBuild = new JobInfo.Builder(iC1, componentName).setMinimumLatency(jCurrentTimeMillis).setOverrideDeadline(jCurrentTimeMillis + jCurrentTimeMillis).setExtras(persistableBundle).build();
            Method method2 = com.google.android.gms.internal.measurement.f0.f3756a;
            jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            jobScheduler.getClass();
            method = com.google.android.gms.internal.measurement.f0.f3756a;
            if (method != null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
                jobScheduler.schedule(jobInfoBuild);
            }
            Method method3 = com.google.android.gms.internal.measurement.f0.f3757b;
            if (method3 != null) {
                try {
                    Integer num = (Integer) method3.invoke(UserHandle.class, null);
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = i10;
                    }
                } catch (IllegalAccessException | InvocationTargetException e3) {
                    if (Log.isLoggable("JobSchedulerCompat", 6)) {
                        Log.e("JobSchedulerCompat", "myUserId invocation illegal", e3);
                    }
                }
            } else {
                iIntValue = i10;
            }
            try {
                return;
            } catch (IllegalAccessException | InvocationTargetException e10) {
                Log.e("UploadAlarm", "error calling scheduleAsPackage", e10);
                jobScheduler.schedule(jobInfoBuild);
                return;
            }
        }
        jMax2 = 0;
        i10 = 0;
        if (jMax2 == 0) {
            t().O.b("Next upload time is 0");
            f0().b();
            o3 o3Var6 = this.E;
            R(o3Var6);
            o3Var6.Z0();
            return;
        }
        t0Var = this.B;
        R(t0Var);
        if (t0Var.p1()) {
            t().O.b("No network");
            u0VarF0 = f0();
            y3Var = (y3) u0VarF0.f12970d;
            y3Var.j0();
            y3Var.C().V0();
            if (!u0VarF0.f12968b) {
                y3Var.L.A.registerReceiver(u0VarF0, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                t0 t0Var4 = y3Var.B;
                R(t0Var4);
                u0VarF0.f12969c = t0Var4.p1();
                y3Var.t().O.c(Boolean.valueOf(u0VarF0.f12969c), "Registering connectivity change receiver. Network connected");
                u0VarF0.f12968b = true;
            }
            o3 o3Var7 = this.E;
            R(o3Var7);
            o3Var7.Z0();
            return;
        }
        jE = this.I.H.e();
        b0();
        jMax3 = Math.max(0L, ((Long) b0.G.a(null)).longValue());
        R(t0Var2);
        if (!t0Var2.F1(jE, jMax3)) {
            jMax2 = Math.max(jMax2, jE + jMax3);
        }
        f0().b();
        ((ve.b) k0()).getClass();
        jCurrentTimeMillis = jMax2 - System.currentTimeMillis();
        if (jCurrentTimeMillis <= 0) {
            b0();
            jCurrentTimeMillis = Math.max(0L, ((Long) b0.K.a(null)).longValue());
            i7.m1 m1Var2 = this.I.I;
            ((ve.b) k0()).getClass();
            m1Var2.f(System.currentTimeMillis());
        }
        t().O.c(Long.valueOf(jCurrentTimeMillis), "Upload scheduled in approximately ms");
        o3Var = this.E;
        R(o3Var);
        o3Var.W0();
        h1 h1Var2 = (h1) o3Var.B;
        h1Var2.getClass();
        q0Var = h1Var2.F;
        context = h1Var2.A;
        if (!e4.L1(context)) {
            h1.g(q0Var);
            q0Var.N.b("Receiver not registered/enabled");
        }
        if (!e4.o1(context)) {
            h1.g(q0Var);
            q0Var.N.b("Service not registered/enabled");
        }
        o3Var.Z0();
        h1.g(q0Var);
        q0Var.O.c(Long.valueOf(jCurrentTimeMillis), "Scheduling upload, millis");
        h1Var2.K.getClass();
        SystemClock.elapsedRealtime();
        if (jCurrentTimeMillis < Math.max(0L, ((Long) b0.L.a(null)).longValue())) {
            o3Var.a1().b(jCurrentTimeMillis);
        }
        ComponentName componentName2 = new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iC2 = o3Var.c1();
        PersistableBundle persistableBundle2 = new PersistableBundle();
        persistableBundle2.putString("action", "com.google.android.gms.measurement.UPLOAD");
        jobInfoBuild = new JobInfo.Builder(iC2, componentName2).setMinimumLatency(jCurrentTimeMillis).setOverrideDeadline(jCurrentTimeMillis + jCurrentTimeMillis).setExtras(persistableBundle2).build();
        Method method4 = com.google.android.gms.internal.measurement.f0.f3756a;
        jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        jobScheduler.getClass();
        method = com.google.android.gms.internal.measurement.f0.f3756a;
        if (method != null) {
        }
        jobScheduler.schedule(jobInfoBuild);
    }

    public final void L() {
        C().V0();
        if (this.T || this.U || this.V) {
            t().O.e("Not stopping services. fetch, network, upload", Boolean.valueOf(this.T), Boolean.valueOf(this.U), Boolean.valueOf(this.V));
            return;
        }
        t().O.b("Stopping uploading service(s)");
        ArrayList arrayList = this.P;
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ArrayList arrayList2 = this.P;
        com.google.android.gms.common.internal.d0.h(arrayList2);
        arrayList2.clear();
    }

    public final Boolean M(u0 u0Var) {
        try {
            long jP = u0Var.P();
            h1 h1Var = this.L;
            if (jP != -2147483648L) {
                if (u0Var.P() == xe.b.a(h1Var.A).b(0, u0Var.D()).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = xe.b.a(h1Var.A).b(0, u0Var.D()).versionName;
                String strN = u0Var.N();
                if (strN != null && strN.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final g4 N(String str) {
        m mVar = this.C;
        R(mVar);
        u0 u0VarX1 = mVar.X1(str);
        if (u0VarX1 != null) {
            h1 h1Var = u0VarX1.f14703a;
            if (!TextUtils.isEmpty(u0VarX1.N())) {
                Boolean boolM = M(u0VarX1);
                if (boolM != null && !boolM.booleanValue()) {
                    t().G.c(q0.d1(str), "App version does not match; dropping. appId");
                    return null;
                }
                String strG = u0VarX1.G();
                String strN = u0VarX1.N();
                long jP = u0VarX1.P();
                e1 e1Var = h1Var.G;
                h1.g(e1Var);
                e1Var.V0();
                String str2 = u0VarX1.l;
                e1 e1Var2 = h1Var.G;
                h1.g(e1Var2);
                e1Var2.V0();
                long j9 = u0VarX1.m;
                e1 e1Var3 = h1Var.G;
                h1.g(e1Var3);
                e1Var3.V0();
                long j10 = u0VarX1.f14714n;
                e1 e1Var4 = h1Var.G;
                h1.g(e1Var4);
                e1Var4.V0();
                boolean z10 = u0VarX1.f14715o;
                String strJ = u0VarX1.J();
                e1 e1Var5 = h1Var.G;
                h1.g(e1Var5);
                e1Var5.V0();
                boolean z11 = u0VarX1.f14716p;
                Boolean boolW = u0VarX1.w();
                long jB = u0VarX1.b();
                e1 e1Var6 = h1Var.G;
                h1.g(e1Var6);
                e1Var6.V0();
                ArrayList arrayList = u0VarX1.f14719s;
                String strG2 = a(str).g();
                boolean zY = u0VarX1.y();
                e1 e1Var7 = h1Var.G;
                h1.g(e1Var7);
                e1Var7.V0();
                long j11 = u0VarX1.f14722v;
                int i10 = a(str).f14702b;
                String str3 = n0(str).f14678b;
                e1 e1Var8 = h1Var.G;
                h1.g(e1Var8);
                e1Var8.V0();
                int i11 = u0VarX1.f14724x;
                e1 e1Var9 = h1Var.G;
                h1.g(e1Var9);
                e1Var9.V0();
                return new g4(str, strG, strN, jP, str2, j9, j10, (String) null, z10, false, strJ, 0L, 0, z11, false, boolW, jB, (List) arrayList, strG2, RuntimeVersion.SUFFIX, (String) null, zY, j11, i10, str3, i11, u0VarX1.B, u0VarX1.C(), u0VarX1.s(), 0L, u0VarX1.t());
            }
        }
        t().N.c(str, "No app data available; dropping");
        return null;
    }

    public final boolean O(String str, String str2) throws Throwable {
        m mVar = this.C;
        R(mVar);
        q qVarT1 = mVar.t1("events", str, str2);
        return qVarT1 == null || qVarT1.f14685c < 1;
    }

    @Override
    public final ru.c P() {
        return this.L.C;
    }

    public final void T(b4 b4Var, g4 g4Var) {
        q qVarT1;
        long jLongValue;
        C().V0();
        j0();
        boolean zQ = Q(g4Var);
        String str = g4Var.A;
        if (zQ) {
            if (!g4Var.H) {
                Z(g4Var);
                return;
            }
            e4 e4VarI0 = i0();
            String str2 = b4Var.B;
            int iA2 = e4VarI0.a2(str2);
            o10.b bVar = this.f14777j0;
            if (iA2 != 0) {
                i0();
                b0();
                String strA1 = e4.a1(str2, 24, true);
                int length = str2 != null ? str2.length() : 0;
                i0();
                e4.l1(bVar, g4Var.A, iA2, "_ev", strA1, length);
                return;
            }
            int iI1 = i0().i1(b4Var.a(), str2);
            if (iI1 != 0) {
                i0();
                b0();
                String strA2 = e4.a1(str2, 24, true);
                Object objA = b4Var.a();
                int length2 = (objA == null || !((objA instanceof String) || (objA instanceof CharSequence))) ? 0 : objA.toString().length();
                i0();
                e4.l1(bVar, g4Var.A, iI1, "_ev", strA2, length2);
                return;
            }
            Object objJ1 = i0().j1(b4Var.a(), str2);
            if (objJ1 != null) {
                String str3 = "_sid";
                if ("_sid".equals(str2)) {
                    long j9 = b4Var.C;
                    String str4 = b4Var.F;
                    com.google.android.gms.common.internal.d0.h(str);
                    m mVar = this.C;
                    R(mVar);
                    c4 c4VarP1 = mVar.P1(str, "_sno");
                    if (c4VarP1 != null) {
                        Object obj = c4VarP1.f14612e;
                        if (obj instanceof Long) {
                            jLongValue = ((Long) obj).longValue();
                        } else {
                            if (c4VarP1 != null) {
                                t().J.c(c4VarP1.f14612e, "Retrieved last session number from database does not contain a valid (long) value");
                            }
                            m mVar2 = this.C;
                            R(mVar2);
                            qVarT1 = mVar2.t1("events", str, "_s");
                            if (qVarT1 != null) {
                                b50.b bVar2 = t().O;
                                long j10 = qVarT1.f14685c;
                                bVar2.c(Long.valueOf(j10), "Backfill the session number. Last used session number");
                                jLongValue = j10;
                            } else {
                                jLongValue = 0;
                            }
                        }
                    } else {
                        if (c4VarP1 != null) {
                            t().J.c(c4VarP1.f14612e, "Retrieved last session number from database does not contain a valid (long) value");
                        }
                        m mVar3 = this.C;
                        R(mVar3);
                        qVarT1 = mVar3.t1("events", str, "_s");
                        if (qVarT1 != null) {
                            b50.b bVar3 = t().O;
                            long j11 = qVarT1.f14685c;
                            bVar3.c(Long.valueOf(j11), "Backfill the session number. Last used session number");
                            jLongValue = j11;
                        } else {
                            jLongValue = 0;
                        }
                    }
                    T(new b4(j9, Long.valueOf(jLongValue + 1), "_sno", str4), g4Var);
                } else {
                    str3 = "_sid";
                }
                com.google.android.gms.common.internal.d0.h(str);
                String str5 = b4Var.F;
                com.google.android.gms.common.internal.d0.h(str5);
                c4 c4Var = new c4(str, str5, str2, b4Var.C, objJ1);
                b50.b bVar4 = t().O;
                h1 h1Var = this.L;
                m0 m0Var = h1Var.J;
                String str6 = c4Var.f14610c;
                bVar4.d("Setting user property", m0Var.c(str6), objJ1);
                m mVar4 = this.C;
                R(mVar4);
                mVar4.H1();
                try {
                    boolean zEquals = "_id".equals(str6);
                    Object obj2 = c4Var.f14612e;
                    if (zEquals) {
                        m mVar5 = this.C;
                        R(mVar5);
                        c4 c4VarP2 = mVar5.P1(str, "_id");
                        if (c4VarP2 != null && !obj2.equals(c4VarP2.f14612e)) {
                            m mVar6 = this.C;
                            R(mVar6);
                            mVar6.N1(str, "_lair");
                        }
                    }
                    Z(g4Var);
                    m mVar7 = this.C;
                    R(mVar7);
                    boolean zO1 = mVar7.O1(c4Var);
                    if (str3.equals(str2)) {
                        t0 t0Var = this.G;
                        R(t0Var);
                        String str7 = g4Var.U;
                        long jG1 = TextUtils.isEmpty(str7) ? 0L : t0Var.G1(str7.getBytes(Charset.forName("UTF-8")));
                        m mVar8 = this.C;
                        R(mVar8);
                        u0 u0VarX1 = mVar8.X1(str);
                        if (u0VarX1 != null) {
                            u0VarX1.A(jG1);
                            if (u0VarX1.o()) {
                                m mVar9 = this.C;
                                R(mVar9);
                                mVar9.Y1(u0VarX1, false);
                            }
                        }
                    }
                    m mVar10 = this.C;
                    R(mVar10);
                    mVar10.I1();
                    if (!zO1) {
                        t().G.d("Too many unique user properties are set. Ignoring user property", h1Var.J.c(str6), obj2);
                        i0();
                        e4.l1(bVar, str, 9, null, null, 0);
                    }
                } finally {
                    m mVar11 = this.C;
                    R(mVar11);
                    mVar11.J1();
                }
            }
        }
    }

    public final void U(String str, g4 g4Var) {
        C().V0();
        j0();
        boolean zQ = Q(g4Var);
        String str2 = g4Var.A;
        if (zQ) {
            if (!g4Var.H) {
                Z(g4Var);
                return;
            }
            Boolean boolS = S(g4Var);
            if ("_npa".equals(str) && boolS != null) {
                t().N.b("Falling back to manifest metadata value for ad personalization");
                ((ve.b) k0()).getClass();
                T(new b4(System.currentTimeMillis(), Long.valueOf(true != boolS.booleanValue() ? 0L : 1L), "_npa", "auto"), g4Var);
                return;
            }
            b50.b bVar = t().N;
            h1 h1Var = this.L;
            bVar.c(h1Var.J.c(str), "Removing user property");
            m mVar = this.C;
            R(mVar);
            mVar.H1();
            try {
                Z(g4Var);
                if ("_id".equals(str)) {
                    m mVar2 = this.C;
                    R(mVar2);
                    com.google.android.gms.common.internal.d0.h(str2);
                    mVar2.N1(str2, "_lair");
                }
                m mVar3 = this.C;
                R(mVar3);
                com.google.android.gms.common.internal.d0.h(str2);
                mVar3.N1(str2, str);
                m mVar4 = this.C;
                R(mVar4);
                mVar4.I1();
                t().N.c(h1Var.J.c(str), "User property removed");
            } finally {
                m mVar5 = this.C;
                R(mVar5);
                mVar5.J1();
            }
        }
    }

    public final void V(g4 g4Var) throws Throwable {
        long j9;
        long j10;
        q qVarT1;
        boolean z10;
        long j11;
        y3 y3Var;
        boolean z11;
        long j12;
        y3 y3Var2;
        Bundle bundle;
        long j13;
        y0 y0Var;
        h1 h1Var;
        String str;
        Context context;
        q0 q0Var;
        h1 h1Var2;
        Intent intent;
        String str2;
        PackageManager packageManager;
        List<ResolveInfo> listQueryIntentServices;
        Bundle bundle2;
        long j14;
        String str3;
        long jJ1;
        h1 h1Var3;
        PackageInfo packageInfoB;
        g4 g4Var2;
        ApplicationInfo applicationInfoA;
        long j15;
        long j16;
        boolean z12;
        long j17;
        y3 y3Var3 = g4Var;
        h1 h1Var4 = this.L;
        C().V0();
        j0();
        com.google.android.gms.common.internal.d0.h(y3Var3);
        boolean z13 = y3Var3.O;
        String str4 = y3Var3.A;
        com.google.android.gms.common.internal.d0.e(str4);
        if (!Q(y3Var3)) {
            return;
        }
        m mVar = this.C;
        R(mVar);
        u0 u0VarX1 = mVar.X1(str4);
        if (u0VarX1 != null && TextUtils.isEmpty(u0VarX1.G()) && !TextUtils.isEmpty(y3Var3.B)) {
            u0VarX1.f(0L);
            m mVar2 = this.C;
            R(mVar2);
            mVar2.Y1(u0VarX1, false);
            a1 a1Var = this.A;
            R(a1Var);
            a1Var.V0();
            a1Var.I.remove(str4);
        }
        if (!y3Var3.H) {
            Z(g4Var);
            return;
        }
        long jCurrentTimeMillis = y3Var3.L;
        if (jCurrentTimeMillis == 0) {
            ((ve.b) k0()).getClass();
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        long j18 = jCurrentTimeMillis;
        int i10 = y3Var3.M;
        if (i10 != 0 && i10 != 1) {
            t().J.d("Incorrect app type, assuming installed app. appId, appType", q0.d1(str4), Integer.valueOf(i10));
            i10 = 0;
        }
        m mVar3 = this.C;
        R(mVar3);
        mVar3.H1();
        try {
            m mVar4 = this.C;
            R(mVar4);
            c4 c4VarP1 = mVar4.P1(str4, "_npa");
            Boolean boolS = S(y3Var3);
            try {
                if (c4VarP1 != null) {
                    j9 = 1;
                    if (!"auto".equals(c4VarP1.f14609b)) {
                        j10 = j18;
                    }
                    if (b0().f1(null, b0.f14550b1)) {
                        Y(y3Var3, y3Var3.f14622d0);
                    } else {
                        Y(y3Var3, j10);
                    }
                    Z(g4Var);
                    if (i10 == 0) {
                        m mVar5 = this.C;
                        R(mVar5);
                        qVarT1 = mVar5.t1("events", str4, "_f");
                        z10 = false;
                    } else {
                        m mVar6 = this.C;
                        R(mVar6);
                        qVarT1 = mVar6.t1("events", str4, "_v");
                        z10 = true;
                    }
                    if (qVarT1 == null) {
                        j12 = ((j10 / 3600000) + j9) * 3600000;
                        if (z10) {
                            y3Var2 = this;
                            Long lValueOf = Long.valueOf(j12);
                            long j19 = j10;
                            y3Var2.T(new b4(j19, lValueOf, "_fvt", "auto"), y3Var3);
                            y3Var2.C().V0();
                            y3Var2.j0();
                            bundle = new Bundle();
                            bundle.putLong("_c", 1L);
                            bundle.putLong("_r", 1L);
                            bundle.putLong("_et", 1L);
                            if (z13) {
                                bundle.putLong("_dac", 1L);
                            }
                            if (y3Var2.b0().f1(null, b0.f14574j1)) {
                                ((ve.b) y3Var2.k0()).getClass();
                                bundle.putLong("_elt", System.currentTimeMillis());
                            }
                            y3Var2.d(new s("_v", new r(bundle), "auto", j19), y3Var3);
                            y3Var3 = y3Var2;
                        } else {
                            Long lValueOf2 = Long.valueOf(j12);
                            j13 = j10;
                            T(new b4(j13, lValueOf2, "_fot", "auto"), y3Var3);
                            C().V0();
                            y0Var = this.K;
                            com.google.android.gms.common.internal.d0.h(y0Var);
                            h1Var = y0Var.f14764b;
                            if (str4 != null) {
                                try {
                                    if (str4.isEmpty()) {
                                        h1Var2 = h1Var4;
                                        str = "_elt";
                                        str2 = str4;
                                        q0 q0Var2 = h1Var.F;
                                        h1.g(q0Var2);
                                        q0Var2.K.b("Install Referrer Reporter was called with invalid app package name");
                                    } else {
                                        str = "_elt";
                                        e1 e1Var = h1Var.G;
                                        context = h1Var.A;
                                        q0Var = h1Var.F;
                                        h1.g(e1Var);
                                        e1Var.V0();
                                        if (y0Var.a()) {
                                            h1Var2 = h1Var4;
                                            x0 x0Var = new x0(y0Var, str4);
                                            e1 e1Var2 = h1Var.G;
                                            h1.g(e1Var2);
                                            e1Var2.V0();
                                            str2 = str4;
                                            intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                            intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                            packageManager = context.getPackageManager();
                                            if (packageManager == null) {
                                                h1.g(q0Var);
                                                q0Var.K.b("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                            } else {
                                                listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
                                                if (listQueryIntentServices != null || listQueryIntentServices.isEmpty()) {
                                                    h1.g(q0Var);
                                                    q0Var.M.b("Play Service for fetching Install Referrer is unavailable on device");
                                                } else {
                                                    ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                                                    if (serviceInfo != null) {
                                                        String str5 = serviceInfo.packageName;
                                                        if (serviceInfo.name != null && "com.android.vending".equals(str5) && y0Var.a()) {
                                                            try {
                                                                boolean zA = ue.a.b().a(context, new Intent(intent), x0Var, 1);
                                                                h1.g(q0Var);
                                                                q0Var.O.c(zA ? "available" : "not available", "Install Referrer Service is");
                                                            } catch (RuntimeException e3) {
                                                                q0 q0Var3 = h1Var.F;
                                                                h1.g(q0Var3);
                                                                q0Var3.G.c(e3.getMessage(), "Exception occurred while binding to Install Referrer Service");
                                                            }
                                                        } else {
                                                            h1.g(q0Var);
                                                            q0Var.J.b("Play Store version 8.3.73 or higher required for Install Referrer");
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            h1.g(q0Var);
                                            q0Var.M.b("Install Referrer Reporter is not available");
                                            h1Var2 = h1Var4;
                                            str2 = str4;
                                        }
                                    }
                                    C().V0();
                                    j0();
                                    bundle2 = new Bundle();
                                    j14 = j9;
                                    bundle2.putLong("_c", j14);
                                    bundle2.putLong("_r", j14);
                                    bundle2.putLong("_uwa", 0L);
                                    bundle2.putLong("_pfo", 0L);
                                    bundle2.putLong("_sys", 0L);
                                    bundle2.putLong("_sysu", 0L);
                                    bundle2.putLong("_et", j14);
                                    if (z13) {
                                        bundle2.putLong("_dac", j14);
                                    }
                                    com.google.android.gms.common.internal.d0.h(str2);
                                    y3Var3 = this;
                                    m mVar7 = y3Var3.C;
                                    R(mVar7);
                                    com.google.android.gms.common.internal.d0.e(str2);
                                    mVar7.V0();
                                    mVar7.W0();
                                    str3 = str2;
                                    jJ1 = mVar7.j1(str3);
                                    h1Var3 = h1Var2;
                                    if (h1Var3.A.getPackageManager() == null) {
                                        y3Var3.t().G.c(q0.d1(str3), "PackageManager is null, first open report might be inaccurate. appId");
                                        g4Var2 = g4Var;
                                    } else {
                                        try {
                                            packageInfoB = xe.b.a(h1Var3.A).b(0, str3);
                                        } catch (PackageManager.NameNotFoundException e10) {
                                            y3Var3.t().G.d("Package info is null, first open report might be inaccurate. appId", q0.d1(str3), e10);
                                            packageInfoB = null;
                                        }
                                        if (packageInfoB != null) {
                                            j16 = packageInfoB.firstInstallTime;
                                            if (j16 != 0) {
                                                if (j16 != packageInfoB.lastUpdateTime) {
                                                    if (y3Var3.b0().f1(null, b0.I0)) {
                                                        bundle2.putLong("_uwa", 1L);
                                                    } else if (jJ1 == 0) {
                                                        bundle2.putLong("_uwa", 1L);
                                                        z12 = false;
                                                        jJ1 = 0;
                                                    }
                                                    z12 = false;
                                                } else {
                                                    z12 = true;
                                                }
                                                if (true != z12) {
                                                    j17 = 0;
                                                } else {
                                                    j17 = 1;
                                                }
                                                b4 b4Var = new b4(j13, Long.valueOf(j17), "_fi", "auto");
                                                g4Var2 = g4Var;
                                                y3Var3.T(b4Var, g4Var2);
                                            } else {
                                                g4Var2 = g4Var;
                                            }
                                        } else {
                                            g4Var2 = g4Var;
                                        }
                                        try {
                                            applicationInfoA = xe.b.a(h1Var3.A).a(0, str3);
                                        } catch (PackageManager.NameNotFoundException e11) {
                                            y3Var3.t().G.d("Application info is null, first open report might be inaccurate. appId", q0.d1(str3), e11);
                                            applicationInfoA = null;
                                        }
                                        if (applicationInfoA != null) {
                                            if ((applicationInfoA.flags & 1) != 0) {
                                                j15 = 1;
                                                bundle2.putLong("_sys", 1L);
                                            } else {
                                                j15 = 1;
                                            }
                                            if ((applicationInfoA.flags & Cast.MAX_NAMESPACE_LENGTH) != 0) {
                                                bundle2.putLong("_sysu", j15);
                                            }
                                        }
                                    }
                                    if (jJ1 >= 0) {
                                        bundle2.putLong("_pfo", jJ1);
                                    }
                                    if (y3Var3.b0().f1(null, b0.f14574j1)) {
                                        ((ve.b) y3Var3.k0()).getClass();
                                        bundle2.putLong(str, System.currentTimeMillis());
                                    }
                                    y3Var3.d(new s("_f", new r(bundle2), "auto", j13), g4Var2);
                                    y3Var3 = y3Var3;
                                } catch (Throwable th2) {
                                    th = th2;
                                    y3Var3 = this;
                                    m mVar8 = y3Var3.C;
                                    R(mVar8);
                                    mVar8.J1();
                                    throw th;
                                }
                            } else {
                                h1Var2 = h1Var4;
                                str = "_elt";
                                str2 = str4;
                                q0 q0Var4 = h1Var.F;
                                h1.g(q0Var4);
                                q0Var4.K.b("Install Referrer Reporter was called with invalid app package name");
                                C().V0();
                                j0();
                                bundle2 = new Bundle();
                                j14 = j9;
                                bundle2.putLong("_c", j14);
                                bundle2.putLong("_r", j14);
                                bundle2.putLong("_uwa", 0L);
                                bundle2.putLong("_pfo", 0L);
                                bundle2.putLong("_sys", 0L);
                                bundle2.putLong("_sysu", 0L);
                                bundle2.putLong("_et", j14);
                                if (z13) {
                                    bundle2.putLong("_dac", j14);
                                }
                                com.google.android.gms.common.internal.d0.h(str2);
                                y3Var3 = this;
                                m mVar9 = y3Var3.C;
                                R(mVar9);
                                com.google.android.gms.common.internal.d0.e(str2);
                                mVar9.V0();
                                mVar9.W0();
                                str3 = str2;
                                jJ1 = mVar9.j1(str3);
                                h1Var3 = h1Var2;
                                if (h1Var3.A.getPackageManager() == null) {
                                    y3Var3.t().G.c(q0.d1(str3), "PackageManager is null, first open report might be inaccurate. appId");
                                    g4Var2 = g4Var;
                                } else {
                                    packageInfoB = xe.b.a(h1Var3.A).b(0, str3);
                                    if (packageInfoB != null) {
                                        j16 = packageInfoB.firstInstallTime;
                                        if (j16 != 0) {
                                            if (j16 != packageInfoB.lastUpdateTime) {
                                                if (y3Var3.b0().f1(null, b0.I0)) {
                                                    bundle2.putLong("_uwa", 1L);
                                                } else if (jJ1 == 0) {
                                                    bundle2.putLong("_uwa", 1L);
                                                    z12 = false;
                                                    jJ1 = 0;
                                                }
                                                z12 = false;
                                            } else {
                                                z12 = true;
                                            }
                                            if (true != z12) {
                                                j17 = 0;
                                            } else {
                                                j17 = 1;
                                            }
                                            b4 b4Var2 = new b4(j13, Long.valueOf(j17), "_fi", "auto");
                                            g4Var2 = g4Var;
                                            y3Var3.T(b4Var2, g4Var2);
                                        } else {
                                            g4Var2 = g4Var;
                                        }
                                    } else {
                                        g4Var2 = g4Var;
                                    }
                                    applicationInfoA = xe.b.a(h1Var3.A).a(0, str3);
                                    if (applicationInfoA != null) {
                                        if ((applicationInfoA.flags & 1) != 0) {
                                            j15 = 1;
                                            bundle2.putLong("_sys", 1L);
                                        } else {
                                            j15 = 1;
                                        }
                                        if ((applicationInfoA.flags & Cast.MAX_NAMESPACE_LENGTH) != 0) {
                                            bundle2.putLong("_sysu", j15);
                                        }
                                    }
                                }
                                if (jJ1 >= 0) {
                                    bundle2.putLong("_pfo", jJ1);
                                }
                                if (y3Var3.b0().f1(null, b0.f14574j1)) {
                                    ((ve.b) y3Var3.k0()).getClass();
                                    bundle2.putLong(str, System.currentTimeMillis());
                                }
                                y3Var3.d(new s("_f", new r(bundle2), "auto", j13), g4Var2);
                                y3Var3 = y3Var3;
                            }
                        }
                    } else {
                        j11 = j10;
                        y3Var = this;
                        z11 = y3Var3.I;
                        y3Var3 = y3Var;
                        if (z11) {
                            y3Var.d(new s("_cd", new r(new Bundle()), "auto", j11), y3Var3);
                            y3Var3 = y3Var;
                        }
                    }
                    m mVar10 = y3Var3.C;
                    R(mVar10);
                    mVar10.I1();
                    m mVar11 = y3Var3.C;
                    R(mVar11);
                    mVar11.J1();
                    return;
                }
                j9 = 1;
                if (qVarT1 == null) {
                    j12 = ((j10 / 3600000) + j9) * 3600000;
                    if (z10) {
                        Long lValueOf3 = Long.valueOf(j12);
                        j13 = j10;
                        T(new b4(j13, lValueOf3, "_fot", "auto"), y3Var3);
                        C().V0();
                        y0Var = this.K;
                        com.google.android.gms.common.internal.d0.h(y0Var);
                        h1Var = y0Var.f14764b;
                        if (str4 != null) {
                            if (str4.isEmpty()) {
                                h1Var2 = h1Var4;
                                str = "_elt";
                                str2 = str4;
                                q0 q0Var5 = h1Var.F;
                                h1.g(q0Var5);
                                q0Var5.K.b("Install Referrer Reporter was called with invalid app package name");
                            } else {
                                str = "_elt";
                                e1 e1Var3 = h1Var.G;
                                context = h1Var.A;
                                q0Var = h1Var.F;
                                h1.g(e1Var3);
                                e1Var3.V0();
                                if (y0Var.a()) {
                                    h1.g(q0Var);
                                    q0Var.M.b("Install Referrer Reporter is not available");
                                    h1Var2 = h1Var4;
                                    str2 = str4;
                                } else {
                                    h1Var2 = h1Var4;
                                    x0 x0Var2 = new x0(y0Var, str4);
                                    e1 e1Var4 = h1Var.G;
                                    h1.g(e1Var4);
                                    e1Var4.V0();
                                    str2 = str4;
                                    intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                    intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                    packageManager = context.getPackageManager();
                                    if (packageManager == null) {
                                        h1.g(q0Var);
                                        q0Var.K.b("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                    } else {
                                        listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
                                        if (listQueryIntentServices != null) {
                                            h1.g(q0Var);
                                            q0Var.M.b("Play Service for fetching Install Referrer is unavailable on device");
                                        } else {
                                            h1.g(q0Var);
                                            q0Var.M.b("Play Service for fetching Install Referrer is unavailable on device");
                                        }
                                    }
                                }
                            }
                            C().V0();
                            j0();
                            bundle2 = new Bundle();
                            j14 = j9;
                            bundle2.putLong("_c", j14);
                            bundle2.putLong("_r", j14);
                            bundle2.putLong("_uwa", 0L);
                            bundle2.putLong("_pfo", 0L);
                            bundle2.putLong("_sys", 0L);
                            bundle2.putLong("_sysu", 0L);
                            bundle2.putLong("_et", j14);
                            if (z13) {
                                bundle2.putLong("_dac", j14);
                            }
                            com.google.android.gms.common.internal.d0.h(str2);
                            y3Var3 = this;
                            m mVar12 = y3Var3.C;
                            R(mVar12);
                            com.google.android.gms.common.internal.d0.e(str2);
                            mVar12.V0();
                            mVar12.W0();
                            str3 = str2;
                            jJ1 = mVar12.j1(str3);
                            h1Var3 = h1Var2;
                            if (h1Var3.A.getPackageManager() == null) {
                                y3Var3.t().G.c(q0.d1(str3), "PackageManager is null, first open report might be inaccurate. appId");
                                g4Var2 = g4Var;
                            } else {
                                packageInfoB = xe.b.a(h1Var3.A).b(0, str3);
                                if (packageInfoB != null) {
                                    j16 = packageInfoB.firstInstallTime;
                                    if (j16 != 0) {
                                        if (j16 != packageInfoB.lastUpdateTime) {
                                            if (y3Var3.b0().f1(null, b0.I0)) {
                                                bundle2.putLong("_uwa", 1L);
                                            } else if (jJ1 == 0) {
                                                bundle2.putLong("_uwa", 1L);
                                                z12 = false;
                                                jJ1 = 0;
                                            }
                                            z12 = false;
                                        } else {
                                            z12 = true;
                                        }
                                        if (true != z12) {
                                            j17 = 0;
                                        } else {
                                            j17 = 1;
                                        }
                                        b4 b4Var3 = new b4(j13, Long.valueOf(j17), "_fi", "auto");
                                        g4Var2 = g4Var;
                                        y3Var3.T(b4Var3, g4Var2);
                                    } else {
                                        g4Var2 = g4Var;
                                    }
                                } else {
                                    g4Var2 = g4Var;
                                }
                                applicationInfoA = xe.b.a(h1Var3.A).a(0, str3);
                                if (applicationInfoA != null) {
                                    if ((applicationInfoA.flags & 1) != 0) {
                                        j15 = 1;
                                        bundle2.putLong("_sys", 1L);
                                    } else {
                                        j15 = 1;
                                    }
                                    if ((applicationInfoA.flags & Cast.MAX_NAMESPACE_LENGTH) != 0) {
                                        bundle2.putLong("_sysu", j15);
                                    }
                                }
                            }
                            if (jJ1 >= 0) {
                                bundle2.putLong("_pfo", jJ1);
                            }
                            if (y3Var3.b0().f1(null, b0.f14574j1)) {
                                ((ve.b) y3Var3.k0()).getClass();
                                bundle2.putLong(str, System.currentTimeMillis());
                            }
                            y3Var3.d(new s("_f", new r(bundle2), "auto", j13), g4Var2);
                            y3Var3 = y3Var3;
                        } else {
                            h1Var2 = h1Var4;
                            str = "_elt";
                            str2 = str4;
                            q0 q0Var6 = h1Var.F;
                            h1.g(q0Var6);
                            q0Var6.K.b("Install Referrer Reporter was called with invalid app package name");
                            C().V0();
                            j0();
                            bundle2 = new Bundle();
                            j14 = j9;
                            bundle2.putLong("_c", j14);
                            bundle2.putLong("_r", j14);
                            bundle2.putLong("_uwa", 0L);
                            bundle2.putLong("_pfo", 0L);
                            bundle2.putLong("_sys", 0L);
                            bundle2.putLong("_sysu", 0L);
                            bundle2.putLong("_et", j14);
                            if (z13) {
                                bundle2.putLong("_dac", j14);
                            }
                            com.google.android.gms.common.internal.d0.h(str2);
                            y3Var3 = this;
                            m mVar13 = y3Var3.C;
                            R(mVar13);
                            com.google.android.gms.common.internal.d0.e(str2);
                            mVar13.V0();
                            mVar13.W0();
                            str3 = str2;
                            jJ1 = mVar13.j1(str3);
                            h1Var3 = h1Var2;
                            if (h1Var3.A.getPackageManager() == null) {
                                y3Var3.t().G.c(q0.d1(str3), "PackageManager is null, first open report might be inaccurate. appId");
                                g4Var2 = g4Var;
                            } else {
                                packageInfoB = xe.b.a(h1Var3.A).b(0, str3);
                                if (packageInfoB != null) {
                                    j16 = packageInfoB.firstInstallTime;
                                    if (j16 != 0) {
                                        if (j16 != packageInfoB.lastUpdateTime) {
                                            if (y3Var3.b0().f1(null, b0.I0)) {
                                                bundle2.putLong("_uwa", 1L);
                                            } else if (jJ1 == 0) {
                                                bundle2.putLong("_uwa", 1L);
                                                z12 = false;
                                                jJ1 = 0;
                                            }
                                            z12 = false;
                                        } else {
                                            z12 = true;
                                        }
                                        if (true != z12) {
                                            j17 = 0;
                                        } else {
                                            j17 = 1;
                                        }
                                        b4 b4Var4 = new b4(j13, Long.valueOf(j17), "_fi", "auto");
                                        g4Var2 = g4Var;
                                        y3Var3.T(b4Var4, g4Var2);
                                    } else {
                                        g4Var2 = g4Var;
                                    }
                                } else {
                                    g4Var2 = g4Var;
                                }
                                applicationInfoA = xe.b.a(h1Var3.A).a(0, str3);
                                if (applicationInfoA != null) {
                                    if ((applicationInfoA.flags & 1) != 0) {
                                        j15 = 1;
                                        bundle2.putLong("_sys", 1L);
                                    } else {
                                        j15 = 1;
                                    }
                                    if ((applicationInfoA.flags & Cast.MAX_NAMESPACE_LENGTH) != 0) {
                                        bundle2.putLong("_sysu", j15);
                                    }
                                }
                            }
                            if (jJ1 >= 0) {
                                bundle2.putLong("_pfo", jJ1);
                            }
                            if (y3Var3.b0().f1(null, b0.f14574j1)) {
                                ((ve.b) y3Var3.k0()).getClass();
                                bundle2.putLong(str, System.currentTimeMillis());
                            }
                            y3Var3.d(new s("_f", new r(bundle2), "auto", j13), g4Var2);
                            y3Var3 = y3Var3;
                        }
                    } else {
                        y3Var2 = this;
                        Long lValueOf4 = Long.valueOf(j12);
                        long j110 = j10;
                        y3Var2.T(new b4(j110, lValueOf4, "_fvt", "auto"), y3Var3);
                        y3Var2.C().V0();
                        y3Var2.j0();
                        bundle = new Bundle();
                        bundle.putLong("_c", 1L);
                        bundle.putLong("_r", 1L);
                        bundle.putLong("_et", 1L);
                        if (z13) {
                            bundle.putLong("_dac", 1L);
                        }
                        if (y3Var2.b0().f1(null, b0.f14574j1)) {
                            ((ve.b) y3Var2.k0()).getClass();
                            bundle.putLong("_elt", System.currentTimeMillis());
                        }
                        y3Var2.d(new s("_v", new r(bundle), "auto", j110), y3Var3);
                        y3Var3 = y3Var2;
                    }
                } else {
                    j11 = j10;
                    y3Var = this;
                    z11 = y3Var3.I;
                    y3Var3 = y3Var;
                    if (z11) {
                        y3Var.d(new s("_cd", new r(new Bundle()), "auto", j11), y3Var3);
                        y3Var3 = y3Var;
                    }
                }
                m mVar14 = y3Var3.C;
                R(mVar14);
                mVar14.I1();
                m mVar15 = y3Var3.C;
                R(mVar15);
                mVar15.J1();
                return;
            } catch (Throwable th3) {
                th = th3;
                m mVar16 = y3Var3.C;
                R(mVar16);
                mVar16.J1();
                throw th;
            }
            if (boolS != null) {
                b4 b4Var5 = new b4(j18, Long.valueOf(true != boolS.booleanValue() ? 0L : j9), "_npa", "auto");
                j10 = j18;
                if (c4VarP1 == null || !c4VarP1.f14612e.equals(b4Var5.D)) {
                    T(b4Var5, y3Var3);
                }
            } else {
                j10 = j18;
                if (c4VarP1 != null) {
                    U("_npa", y3Var3);
                }
            }
            if (b0().f1(null, b0.f14550b1)) {
                Y(y3Var3, y3Var3.f14622d0);
            } else {
                Y(y3Var3, j10);
            }
            Z(g4Var);
            if (i10 == 0) {
                m mVar17 = this.C;
                R(mVar17);
                qVarT1 = mVar17.t1("events", str4, "_f");
                z10 = false;
            } else {
                m mVar18 = this.C;
                R(mVar18);
                qVarT1 = mVar18.t1("events", str4, "_v");
                z10 = true;
            }
        } catch (Throwable th4) {
            th = th4;
            y3Var3 = this;
        }
    }

    public final void W(e eVar, g4 g4Var) {
        s sVar;
        com.google.android.gms.common.internal.d0.e(eVar.A);
        com.google.android.gms.common.internal.d0.h(eVar.B);
        com.google.android.gms.common.internal.d0.h(eVar.C);
        com.google.android.gms.common.internal.d0.e(eVar.C.B);
        C().V0();
        j0();
        if (Q(g4Var)) {
            if (!g4Var.H) {
                Z(g4Var);
                return;
            }
            e eVar2 = new e(eVar);
            boolean z10 = false;
            eVar2.E = false;
            m mVar = this.C;
            R(mVar);
            mVar.H1();
            try {
                m mVar2 = this.C;
                R(mVar2);
                String str = eVar2.A;
                com.google.android.gms.common.internal.d0.h(str);
                e eVarT1 = mVar2.T1(str, eVar2.C.B);
                h1 h1Var = this.L;
                if (eVarT1 != null && !eVarT1.B.equals(eVar2.B)) {
                    t().J.e("Updating a conditional user property with different origin. name, origin, origin (from DB)", h1Var.J.c(eVar2.C.B), eVar2.B, eVarT1.B);
                }
                if (eVarT1 != null && eVarT1.E) {
                    eVar2.B = eVarT1.B;
                    eVar2.D = eVarT1.D;
                    eVar2.H = eVarT1.H;
                    eVar2.F = eVarT1.F;
                    eVar2.I = eVarT1.I;
                    eVar2.E = true;
                    b4 b4Var = eVar2.C;
                    eVar2.C = new b4(eVarT1.C.C, b4Var.a(), b4Var.B, eVarT1.C.F);
                } else if (TextUtils.isEmpty(eVar2.F)) {
                    b4 b4Var2 = eVar2.C;
                    eVar2.C = new b4(eVar2.D, b4Var2.a(), b4Var2.B, eVar2.C.F);
                    eVar2.E = true;
                    z10 = true;
                }
                if (eVar2.E) {
                    b4 b4Var3 = eVar2.C;
                    String str2 = eVar2.A;
                    com.google.android.gms.common.internal.d0.h(str2);
                    String str3 = eVar2.B;
                    String str4 = b4Var3.B;
                    long j9 = b4Var3.C;
                    Object objA = b4Var3.a();
                    com.google.android.gms.common.internal.d0.h(objA);
                    c4 c4Var = new c4(str2, str3, str4, j9, objA);
                    Object obj = c4Var.f14612e;
                    String str5 = c4Var.f14610c;
                    m mVar3 = this.C;
                    R(mVar3);
                    if (mVar3.O1(c4Var)) {
                        t().N.e("User property updated immediately", eVar2.A, h1Var.J.c(str5), obj);
                    } else {
                        t().G.e("(2)Too many active user properties, ignoring", q0.d1(eVar2.A), h1Var.J.c(str5), obj);
                    }
                    if (z10 && (sVar = eVar2.I) != null) {
                        g(new s(sVar, eVar2.D), g4Var);
                    }
                }
                m mVar4 = this.C;
                R(mVar4);
                if (mVar4.S1(eVar2)) {
                    t().N.e("Conditional property added", eVar2.A, h1Var.J.c(eVar2.C.B), eVar2.C.a());
                } else {
                    t().G.e("Too many conditional properties, ignoring", q0.d1(eVar2.A), h1Var.J.c(eVar2.C.B), eVar2.C.a());
                }
                m mVar5 = this.C;
                R(mVar5);
                mVar5.I1();
            } finally {
                m mVar6 = this.C;
                R(mVar6);
                mVar6.J1();
            }
        }
    }

    public final void X(e eVar, g4 g4Var) {
        com.google.android.gms.common.internal.d0.e(eVar.A);
        com.google.android.gms.common.internal.d0.h(eVar.C);
        com.google.android.gms.common.internal.d0.e(eVar.C.B);
        C().V0();
        j0();
        if (Q(g4Var)) {
            if (!g4Var.H) {
                Z(g4Var);
                return;
            }
            m mVar = this.C;
            R(mVar);
            mVar.H1();
            try {
                Z(g4Var);
                String str = eVar.A;
                com.google.android.gms.common.internal.d0.h(str);
                m mVar2 = this.C;
                R(mVar2);
                e eVarT1 = mVar2.T1(str, eVar.C.B);
                h1 h1Var = this.L;
                if (eVarT1 != null) {
                    t().N.d("Removing conditional user property", eVar.A, h1Var.J.c(eVar.C.B));
                    m mVar3 = this.C;
                    R(mVar3);
                    mVar3.U1(str, eVar.C.B);
                    if (eVarT1.E) {
                        m mVar4 = this.C;
                        R(mVar4);
                        mVar4.N1(str, eVar.C.B);
                    }
                    s sVar = eVar.K;
                    if (sVar != null) {
                        r rVar = sVar.B;
                        s sVarX1 = i0().x1(sVar.A, rVar != null ? rVar.e() : null, eVarT1.B, sVar.D, true);
                        com.google.android.gms.common.internal.d0.h(sVarX1);
                        g(sVarX1, g4Var);
                    }
                } else {
                    t().J.d("Conditional user property doesn't exist", q0.d1(eVar.A), h1Var.J.c(eVar.C.B));
                }
                m mVar5 = this.C;
                R(mVar5);
                mVar5.I1();
            } finally {
                m mVar6 = this.C;
                R(mVar6);
                mVar6.J1();
            }
        }
    }

    public final void Y(g4 g4Var, long j9) throws Throwable {
        m mVar = this.C;
        R(mVar);
        String str = g4Var.A;
        com.google.android.gms.common.internal.d0.h(str);
        u0 u0VarX1 = mVar.X1(str);
        if (u0VarX1 != null) {
            i0();
            String str2 = g4Var.B;
            String strG = u0VarX1.G();
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            boolean zIsEmpty2 = TextUtils.isEmpty(strG);
            if (!zIsEmpty && !zIsEmpty2) {
                com.google.android.gms.common.internal.d0.h(str2);
                if (!str2.equals(strG)) {
                    t().J.c(q0.d1(u0VarX1.D()), "New GMP App Id passed in. Removing cached database data. appId");
                    m mVar2 = this.C;
                    R(mVar2);
                    h1 h1Var = (h1) mVar2.B;
                    String strD = u0VarX1.D();
                    mVar2.W0();
                    mVar2.V0();
                    com.google.android.gms.common.internal.d0.e(strD);
                    try {
                        SQLiteDatabase sQLiteDatabaseK1 = mVar2.K1();
                        String[] strArr = {strD};
                        int iDelete = sQLiteDatabaseK1.delete("events", "app_id=?", strArr) + sQLiteDatabaseK1.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseK1.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseK1.delete("apps", "app_id=?", strArr) + sQLiteDatabaseK1.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseK1.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseK1.delete("event_filters", "app_id=?", strArr) + sQLiteDatabaseK1.delete("property_filters", "app_id=?", strArr) + sQLiteDatabaseK1.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseK1.delete("consent_settings", "app_id=?", strArr) + sQLiteDatabaseK1.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseK1.delete("trigger_uris", "app_id=?", strArr);
                        if (h1Var.D.f1(null, b0.f14568h1)) {
                            iDelete += sQLiteDatabaseK1.delete("no_data_mode_events", "app_id=?", strArr);
                        }
                        if (iDelete > 0) {
                            q0 q0Var = h1Var.F;
                            h1.g(q0Var);
                            q0Var.O.d("Deleted application data. app, records", strD, Integer.valueOf(iDelete));
                        }
                    } catch (SQLiteException e3) {
                        q0 q0Var2 = h1Var.F;
                        h1.g(q0Var2);
                        q0Var2.G.d("Error deleting application data. appId, error", q0.d1(strD), e3);
                    }
                    u0VarX1 = null;
                }
            }
        }
        if (u0VarX1 != null) {
            boolean z10 = (u0VarX1.P() == -2147483648L || u0VarX1.P() == g4Var.J) ? false : true;
            String strN = u0VarX1.N();
            if (z10 || ((u0VarX1.P() != -2147483648L || strN == null || strN.equals(g4Var.C)) ? false : true)) {
                Bundle bundle = new Bundle();
                bundle.putString("_pv", strN);
                s sVar = new s("_au", new r(bundle), "auto", j9);
                if (b0().f1(null, b0.f14553c1)) {
                    d(sVar, g4Var);
                } else {
                    e(sVar, g4Var);
                }
            }
        }
    }

    public final u0 Z(g4 g4Var) throws Throwable {
        boolean z10;
        h1 h1Var;
        String str;
        long j9;
        String str2;
        String str3;
        String str4;
        boolean z11;
        o7 o7Var;
        boolean z12;
        boolean z13;
        String str5;
        boolean z14;
        String str6;
        boolean z15;
        int i10;
        boolean z16;
        C().V0();
        j0();
        com.google.android.gms.common.internal.d0.h(g4Var);
        boolean z17 = g4Var.N;
        String str7 = g4Var.A;
        com.google.android.gms.common.internal.d0.e(str7);
        String str8 = g4Var.T;
        if (!str8.isEmpty()) {
            this.f14771d0.put(str7, new w3(this, str8));
        }
        m mVar = this.C;
        R(mVar);
        u0 u0VarX1 = mVar.X1(str7);
        t1 t1VarJ = a(str7).j(t1.c(100, g4Var.S));
        s1 s1Var = s1.AD_STORAGE;
        String strA1 = t1VarJ.i(s1Var) ? this.I.a1(str7, z17) : RuntimeVersion.SUFFIX;
        boolean z18 = true;
        s1 s1Var2 = s1.ANALYTICS_STORAGE;
        if (u0VarX1 != null) {
            h1 h1Var2 = u0VarX1.f14703a;
            if (t1VarJ.i(s1Var) && strA1 != null) {
                e1 e1Var = h1Var2.G;
                h1.g(e1Var);
                e1Var.V0();
                if (!strA1.equals(u0VarX1.f14707e)) {
                    e1 e1Var2 = h1Var2.G;
                    h1.g(e1Var2);
                    e1Var2.V0();
                    boolean zIsEmpty = TextUtils.isEmpty(u0VarX1.f14707e);
                    u0VarX1.I(strA1);
                    if (z17) {
                        e3 e3Var = this.I;
                        e3Var.getClass();
                        if (!"00000000-0000-0000-0000-000000000000".equals((t1VarJ.i(s1Var) ? e3Var.Z0(str7) : new Pair(RuntimeVersion.SUFFIX, Boolean.FALSE)).first) && !zIsEmpty) {
                            if (t1VarJ.i(s1Var2)) {
                                u0VarX1.F(j(t1VarJ));
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            m mVar2 = this.C;
                            R(mVar2);
                            if (mVar2.P1(str7, "_id") != null) {
                                m mVar3 = this.C;
                                R(mVar3);
                                if (mVar3.P1(str7, "_lair") == null) {
                                    ((ve.b) k0()).getClass();
                                    c4 c4Var = new c4(str7, "auto", "_lair", System.currentTimeMillis(), 1L);
                                    m mVar4 = this.C;
                                    R(mVar4);
                                    mVar4.O1(c4Var);
                                }
                            }
                        }
                    }
                    if (TextUtils.isEmpty(u0VarX1.E()) && t1VarJ.i(s1Var2)) {
                        u0VarX1.F(j(t1VarJ));
                    }
                } else if (TextUtils.isEmpty(u0VarX1.E())) {
                    u0VarX1.F(j(t1VarJ));
                }
            } else if (TextUtils.isEmpty(u0VarX1.E()) && t1VarJ.i(s1Var2)) {
                u0VarX1.F(j(t1VarJ));
            }
            h1Var = u0VarX1.f14703a;
            u0VarX1.H(g4Var.B);
            str = g4Var.K;
            if (!TextUtils.isEmpty(str)) {
                u0VarX1.K(str);
            }
            j9 = g4Var.E;
            if (j9 != 0) {
                u0VarX1.S(j9);
            }
            str2 = g4Var.C;
            if (!TextUtils.isEmpty(str2)) {
                u0VarX1.O(str2);
            }
            u0VarX1.Q(g4Var.J);
            str3 = g4Var.D;
            if (str3 != null) {
                u0VarX1.R(str3);
            }
            u0VarX1.a(g4Var.F);
            u0VarX1.d(g4Var.H);
            str4 = g4Var.G;
            if (!TextUtils.isEmpty(str4)) {
                u0VarX1.v(str4);
            }
            e1 e1Var3 = h1Var.G;
            h1.g(e1Var3);
            e1Var3.V0();
            boolean z19 = u0VarX1.Q;
            if (u0VarX1.f14716p != z17) {
                z11 = true;
            } else {
                z11 = false;
            }
            u0VarX1.Q = z19 | z11;
            u0VarX1.f14716p = z17;
            Boolean bool = g4Var.P;
            e1 e1Var4 = h1Var.G;
            h1.g(e1Var4);
            e1Var4.V0();
            u0VarX1.Q |= !Objects.equals(u0VarX1.f14717q, bool);
            u0VarX1.f14717q = bool;
            u0VarX1.c(g4Var.Q);
            String str9 = g4Var.U;
            e1 e1Var5 = h1Var.G;
            h1.g(e1Var5);
            e1Var5.V0();
            u0VarX1.Q |= !Objects.equals(u0VarX1.f14720t, str9);
            u0VarX1.f14720t = str9;
            o7Var = o7.B;
            if (b0().f1(null, b0.L0)) {
                u0VarX1.x(g4Var.R);
            } else {
                if (b0().f1(null, b0.K0)) {
                    u0VarX1.x(null);
                }
            }
            z12 = g4Var.V;
            e1 e1Var6 = h1Var.G;
            h1.g(e1Var6);
            e1Var6.V0();
            boolean z20 = u0VarX1.Q;
            if (u0VarX1.f14721u != z12) {
                z13 = true;
            } else {
                z13 = false;
            }
            u0VarX1.Q = z20 | z13;
            u0VarX1.f14721u = z12;
            str5 = g4Var.f14620b0;
            e1 e1Var7 = h1Var.G;
            h1.g(e1Var7);
            e1Var7.V0();
            boolean z21 = u0VarX1.Q;
            if (u0VarX1.C != str5) {
                z14 = true;
            } else {
                z14 = false;
            }
            u0VarX1.Q = z21 | z14;
            u0VarX1.C = str5;
            m8.a();
            if (b0().f1(null, b0.P0)) {
                i10 = g4Var.Z;
                e1 e1Var8 = h1Var.G;
                h1.g(e1Var8);
                e1Var8.V0();
                boolean z22 = u0VarX1.Q;
                if (u0VarX1.f14724x != i10) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                u0VarX1.Q = z22 | z16;
                u0VarX1.f14724x = i10;
            }
            u0VarX1.z(g4Var.W);
            str6 = g4Var.f14621c0;
            e1 e1Var9 = h1Var.G;
            h1.g(e1Var9);
            e1Var9.V0();
            boolean z23 = u0VarX1.Q;
            if (u0VarX1.G != str6) {
                z15 = true;
            } else {
                z15 = false;
            }
            u0VarX1.Q = z23 | z15;
            u0VarX1.G = str6;
            int i11 = g4Var.f14623e0;
            e1 e1Var10 = h1Var.G;
            h1.g(e1Var10);
            e1Var10.V0();
            u0VarX1.Q |= u0VarX1.I != i11;
            u0VarX1.I = i11;
            if (!u0VarX1.o()) {
                z18 = z10;
            } else if (!z10) {
                return u0VarX1;
            }
            m mVar5 = this.C;
            R(mVar5);
            mVar5.Y1(u0VarX1, z18);
            return u0VarX1;
        }
        u0VarX1 = new u0(this.L, str7);
        if (t1VarJ.i(s1Var2)) {
            u0VarX1.F(j(t1VarJ));
        }
        if (t1VarJ.i(s1Var)) {
            u0VarX1.I(strA1);
        }
        z10 = false;
        h1Var = u0VarX1.f14703a;
        u0VarX1.H(g4Var.B);
        str = g4Var.K;
        if (!TextUtils.isEmpty(str)) {
            u0VarX1.K(str);
        }
        j9 = g4Var.E;
        if (j9 != 0) {
            u0VarX1.S(j9);
        }
        str2 = g4Var.C;
        if (!TextUtils.isEmpty(str2)) {
            u0VarX1.O(str2);
        }
        u0VarX1.Q(g4Var.J);
        str3 = g4Var.D;
        if (str3 != null) {
            u0VarX1.R(str3);
        }
        u0VarX1.a(g4Var.F);
        u0VarX1.d(g4Var.H);
        str4 = g4Var.G;
        if (!TextUtils.isEmpty(str4)) {
            u0VarX1.v(str4);
        }
        e1 e1Var11 = h1Var.G;
        h1.g(e1Var11);
        e1Var11.V0();
        boolean z110 = u0VarX1.Q;
        if (u0VarX1.f14716p != z17) {
            z11 = true;
        } else {
            z11 = false;
        }
        u0VarX1.Q = z110 | z11;
        u0VarX1.f14716p = z17;
        Boolean bool2 = g4Var.P;
        e1 e1Var12 = h1Var.G;
        h1.g(e1Var12);
        e1Var12.V0();
        u0VarX1.Q |= !Objects.equals(u0VarX1.f14717q, bool2);
        u0VarX1.f14717q = bool2;
        u0VarX1.c(g4Var.Q);
        String str10 = g4Var.U;
        e1 e1Var13 = h1Var.G;
        h1.g(e1Var13);
        e1Var13.V0();
        u0VarX1.Q |= !Objects.equals(u0VarX1.f14720t, str10);
        u0VarX1.f14720t = str10;
        o7Var = o7.B;
        if (b0().f1(null, b0.L0)) {
            u0VarX1.x(g4Var.R);
        } else {
            if (b0().f1(null, b0.K0)) {
                u0VarX1.x(null);
            }
        }
        z12 = g4Var.V;
        e1 e1Var14 = h1Var.G;
        h1.g(e1Var14);
        e1Var14.V0();
        boolean z24 = u0VarX1.Q;
        if (u0VarX1.f14721u != z12) {
            z13 = true;
        } else {
            z13 = false;
        }
        u0VarX1.Q = z24 | z13;
        u0VarX1.f14721u = z12;
        str5 = g4Var.f14620b0;
        e1 e1Var15 = h1Var.G;
        h1.g(e1Var15);
        e1Var15.V0();
        boolean z25 = u0VarX1.Q;
        if (u0VarX1.C != str5) {
            z14 = true;
        } else {
            z14 = false;
        }
        u0VarX1.Q = z25 | z14;
        u0VarX1.C = str5;
        m8.a();
        if (b0().f1(null, b0.P0)) {
            i10 = g4Var.Z;
            e1 e1Var16 = h1Var.G;
            h1.g(e1Var16);
            e1Var16.V0();
            boolean z26 = u0VarX1.Q;
            if (u0VarX1.f14724x != i10) {
                z16 = true;
            } else {
                z16 = false;
            }
            u0VarX1.Q = z26 | z16;
            u0VarX1.f14724x = i10;
        }
        u0VarX1.z(g4Var.W);
        str6 = g4Var.f14621c0;
        e1 e1Var17 = h1Var.G;
        h1.g(e1Var17);
        e1Var17.V0();
        boolean z27 = u0VarX1.Q;
        if (u0VarX1.G != str6) {
            z15 = true;
        } else {
            z15 = false;
        }
        u0VarX1.Q = z27 | z15;
        u0VarX1.G = str6;
        int i12 = g4Var.f14623e0;
        e1 e1Var18 = h1Var.G;
        h1.g(e1Var18);
        e1Var18.V0();
        u0VarX1.Q |= u0VarX1.I != i12;
        u0VarX1.I = i12;
        if (!u0VarX1.o()) {
            z18 = z10;
        } else if (!z10) {
            return u0VarX1;
        }
        m mVar6 = this.C;
        R(mVar6);
        mVar6.Y1(u0VarX1, z18);
        return u0VarX1;
    }

    public final t1 a(String str) throws Throwable {
        t1 t1Var = t1.f14700c;
        C().V0();
        j0();
        HashMap map = this.f14769b0;
        t1 t1VarO1 = (t1) map.get(str);
        if (t1VarO1 == null) {
            m mVar = this.C;
            R(mVar);
            t1VarO1 = mVar.o1(str);
            if (t1VarO1 == null) {
                t1VarO1 = t1.f14700c;
            }
            C().V0();
            j0();
            map.put(str, t1VarO1);
            m mVar2 = this.C;
            R(mVar2);
            mVar2.q1(str, t1VarO1);
        }
        return t1VarO1;
    }

    public final List a0(Bundle bundle, g4 g4Var) {
        int[] iArr;
        C().V0();
        m8.a();
        g gVarB0 = b0();
        String str = g4Var.A;
        if (!gVarB0.f1(str, b0.P0) || str == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    t().G.b("Uri sources and timestamps do not match");
                } else {
                    int i10 = 0;
                    while (i10 < intArray.length) {
                        m mVar = this.C;
                        R(mVar);
                        h1 h1Var = (h1) mVar.B;
                        int i11 = intArray[i10];
                        long j9 = longArray[i10];
                        com.google.android.gms.common.internal.d0.e(str);
                        mVar.V0();
                        mVar.W0();
                        try {
                            iArr = intArray;
                            try {
                                int iDelete = mVar.K1().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i11), String.valueOf(j9)});
                                q0 q0Var = h1Var.F;
                                h1.g(q0Var);
                                b50.b bVar = q0Var.O;
                                StringBuilder sb2 = new StringBuilder(String.valueOf(iDelete).length() + 46);
                                sb2.append("Pruned ");
                                sb2.append(iDelete);
                                sb2.append(" trigger URIs. appId, source, timestamp");
                                bVar.e(sb2.toString(), str, Integer.valueOf(i11), Long.valueOf(j9));
                            } catch (SQLiteException e3) {
                                e = e3;
                                q0 q0Var2 = h1Var.F;
                                h1.g(q0Var2);
                                q0Var2.G.d("Error pruning trigger URIs. appId", q0.d1(str), e);
                            }
                        } catch (SQLiteException e10) {
                            e = e10;
                            iArr = intArray;
                        }
                        i10++;
                        intArray = iArr;
                    }
                }
            }
        }
        m mVar2 = this.C;
        R(mVar2);
        String str2 = g4Var.A;
        com.google.android.gms.common.internal.d0.e(str2);
        mVar2.V0();
        mVar2.W0();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = mVar2.K1().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str2}, null, null, "rowid", null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string == null) {
                            string = RuntimeVersion.SUFFIX;
                        }
                        arrayList.add(new n3(string, cursorQuery.getLong(1), cursorQuery.getInt(2)));
                    } while (cursorQuery.moveToNext());
                }
            } finally {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        } catch (SQLiteException e11) {
            q0 q0Var3 = ((h1) mVar2.B).F;
            h1.g(q0Var3);
            q0Var3.G.d("Error querying trigger uris. appId", q0.d1(str2), e11);
            arrayList = Collections.EMPTY_LIST;
        }
        return arrayList;
    }

    public final long b() {
        ((ve.b) k0()).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        e3 e3Var = this.I;
        e3Var.W0();
        e3Var.V0();
        i7.m1 m1Var = e3Var.K;
        long jE = m1Var.e();
        if (jE == 0) {
            e4 e4Var = ((h1) e3Var.B).I;
            h1.e(e4Var);
            jE = ((long) e4Var.S1().nextInt(86400000)) + 1;
            m1Var.f(jE);
        }
        return ((((jCurrentTimeMillis + jE) / 1000) / 60) / 60) / 24;
    }

    public final g b0() {
        h1 h1Var = this.L;
        com.google.android.gms.common.internal.d0.h(h1Var);
        return h1Var.D;
    }

    public final void c(String str, s sVar) {
        m mVar = this.C;
        R(mVar);
        u0 u0VarX1 = mVar.X1(str);
        if (u0VarX1 != null) {
            h1 h1Var = u0VarX1.f14703a;
            if (!TextUtils.isEmpty(u0VarX1.N())) {
                Boolean boolM = M(u0VarX1);
                if (boolM == null) {
                    if (!"_ui".equals(sVar.A)) {
                        t().J.c(q0.d1(str), "Could not find package. appId");
                    }
                } else if (!boolM.booleanValue()) {
                    t().G.c(q0.d1(str), "App version does not match; dropping event. appId");
                    return;
                }
                String strG = u0VarX1.G();
                String strN = u0VarX1.N();
                long jP = u0VarX1.P();
                e1 e1Var = h1Var.G;
                h1.g(e1Var);
                e1Var.V0();
                String str2 = u0VarX1.l;
                e1 e1Var2 = h1Var.G;
                h1.g(e1Var2);
                e1Var2.V0();
                long j9 = u0VarX1.m;
                e1 e1Var3 = h1Var.G;
                h1.g(e1Var3);
                e1Var3.V0();
                long j10 = u0VarX1.f14714n;
                e1 e1Var4 = h1Var.G;
                h1.g(e1Var4);
                e1Var4.V0();
                boolean z10 = u0VarX1.f14715o;
                String strJ = u0VarX1.J();
                e1 e1Var5 = h1Var.G;
                h1.g(e1Var5);
                e1Var5.V0();
                boolean z11 = u0VarX1.f14716p;
                Boolean boolW = u0VarX1.w();
                long jB = u0VarX1.b();
                e1 e1Var6 = h1Var.G;
                h1.g(e1Var6);
                e1Var6.V0();
                ArrayList arrayList = u0VarX1.f14719s;
                String strG2 = a(str).g();
                boolean zY = u0VarX1.y();
                e1 e1Var7 = h1Var.G;
                h1.g(e1Var7);
                e1Var7.V0();
                long j11 = u0VarX1.f14722v;
                int i10 = a(str).f14702b;
                String str3 = n0(str).f14678b;
                e1 e1Var8 = h1Var.G;
                h1.g(e1Var8);
                e1Var8.V0();
                int i11 = u0VarX1.f14724x;
                e1 e1Var9 = h1Var.G;
                h1.g(e1Var9);
                e1Var9.V0();
                d(sVar, new g4(str, strG, strN, jP, str2, j9, j10, (String) null, z10, false, strJ, 0L, 0, z11, false, boolW, jB, (List) arrayList, strG2, RuntimeVersion.SUFFIX, (String) null, zY, j11, i10, str3, i11, u0VarX1.B, u0VarX1.C(), u0VarX1.s(), 0L, u0VarX1.t()));
                return;
            }
        }
        t().N.c(str, "No app data available; dropping event");
    }

    public final a1 c0() {
        a1 a1Var = this.A;
        R(a1Var);
        return a1Var;
    }

    public final void d(s sVar, g4 g4Var) throws Throwable {
        Throwable th2;
        Cursor cursorRawQuery;
        Cursor cursor;
        Bundle bundleC1;
        s sVarE;
        r rVar;
        String string;
        String str = g4Var.A;
        com.google.android.gms.common.internal.d0.e(str);
        b50.n nVarC = b50.n.c(sVar);
        Bundle bundle = (Bundle) nVarC.e;
        e4 e4VarI0 = i0();
        m mVar = this.C;
        R(mVar);
        h1 h1Var = (h1) mVar.B;
        mVar.V0();
        mVar.W0();
        Cursor cursor2 = null;
        try {
            try {
                cursorRawQuery = mVar.K1().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        try {
                            com.google.android.gms.internal.measurement.a3 a3Var = (com.google.android.gms.internal.measurement.a3) ((com.google.android.gms.internal.measurement.z2) t0.I1(com.google.android.gms.internal.measurement.a3.z(), cursorRawQuery.getBlob(0))).e();
                            mVar.C.h0();
                            bundleC1 = t0.c1(a3Var.p());
                            cursorRawQuery.close();
                        } catch (IOException e3) {
                            q0 q0Var = h1Var.F;
                            h1.g(q0Var);
                            q0Var.G.d("Failed to retrieve default event parameters. appId", q0.d1(str), e3);
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            bundleC1 = null;
                        }
                        e4VarI0.g1(bundle, bundleC1);
                        e4 e4VarI1 = i0();
                        g gVarB0 = b0();
                        gVarB0.getClass();
                        e4VarI1.e1(nVarC, Math.max(Math.min(gVarB0.d1(str, b0.X), 100), 25));
                        sVarE = nVarC.e();
                        if (!b0().f1(null, b0.f14562f1) && "_cmp".equals(sVarE.A)) {
                            rVar = sVarE.B;
                            if ("referrer API v2".equals(rVar.A.getString("_cis"))) {
                                string = rVar.A.getString("gclid");
                                if (!TextUtils.isEmpty(string)) {
                                    T(new b4(sVarE.D, string, "_lgclid", "auto"), g4Var);
                                }
                            }
                        }
                        e(sVarE, g4Var);
                    }
                    q0 q0Var2 = h1Var.F;
                    h1.g(q0Var2);
                    q0Var2.O.b("Default event parameters not found");
                } catch (SQLiteException e10) {
                    e = e10;
                    q0 q0Var3 = h1Var.F;
                    h1.g(q0Var3);
                    q0Var3.G.c(e, "Error selecting default event parameters");
                }
            } catch (Throwable th3) {
                th2 = th3;
                cursor2 = cursor;
                if (cursor2 != null) {
                    throw th2;
                }
                cursor2.close();
                throw th2;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursorRawQuery = null;
        } catch (Throwable th4) {
            th2 = th4;
            if (cursor2 != null) {
                throw th2;
            }
            cursor2.close();
            throw th2;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        bundleC1 = null;
        e4VarI0.g1(bundle, bundleC1);
        e4 e4VarI2 = i0();
        g gVarB1 = b0();
        gVarB1.getClass();
        e4VarI2.e1(nVarC, Math.max(Math.min(gVarB1.d1(str, b0.X), 100), 25));
        sVarE = nVarC.e();
        if (!b0().f1(null, b0.f14562f1)) {
            rVar = sVarE.B;
            if ("referrer API v2".equals(rVar.A.getString("_cis"))) {
                string = rVar.A.getString("gclid");
                if (!TextUtils.isEmpty(string)) {
                    T(new b4(sVarE.D, string, "_lgclid", "auto"), g4Var);
                }
            }
        }
        e(sVarE, g4Var);
    }

    public final m d0() {
        m mVar = this.C;
        R(mVar);
        return mVar;
    }

    public final void e(s sVar, g4 g4Var) {
        s sVar2;
        List listW1;
        h1 h1Var;
        List listW2;
        List<e> listW3;
        String str;
        com.google.android.gms.common.internal.d0.h(g4Var);
        String str2 = g4Var.A;
        com.google.android.gms.common.internal.d0.e(str2);
        C().V0();
        j0();
        long j9 = sVar.D;
        b50.n nVarC = b50.n.c(sVar);
        C().V0();
        e4.M1((this.f14773f0 == null || (str = this.f14774g0) == null || !str.equals(str2)) ? null : this.f14773f0, (Bundle) nVarC.e, false);
        s sVarE = nVarC.e();
        h0();
        if (TextUtils.isEmpty(g4Var.B)) {
            return;
        }
        if (!g4Var.H) {
            Z(g4Var);
            return;
        }
        List list = g4Var.R;
        if (list != null) {
            String str3 = sVarE.A;
            if (!list.contains(str3)) {
                t().N.e("Dropping non-safelisted event. appId, event name, origin", str2, sVarE.A, sVarE.C);
                return;
            } else {
                Bundle bundleE = sVarE.B.e();
                bundleE.putLong("ga_safelisted", 1L);
                sVar2 = new s(str3, new r(bundleE), sVarE.C, sVarE.D);
            }
        } else {
            sVar2 = sVarE;
        }
        m mVar = this.C;
        R(mVar);
        mVar.H1();
        try {
            String str4 = sVar2.A;
            if ("_s".equals(str4)) {
                m mVar2 = this.C;
                R(mVar2);
                if (!mVar2.k1(str2, "_s") && sVar2.B.A.getLong("_sid") != 0) {
                    m mVar3 = this.C;
                    R(mVar3);
                    if (mVar3.k1(str2, "_f")) {
                        m mVar4 = this.C;
                        R(mVar4);
                        mVar4.n1(str2, null, "_sid", f(str2, sVar2));
                    } else {
                        m mVar5 = this.C;
                        R(mVar5);
                        if (mVar5.k1(str2, "_v")) {
                            m mVar6 = this.C;
                            R(mVar6);
                            mVar6.n1(str2, null, "_sid", f(str2, sVar2));
                        } else {
                            m mVar7 = this.C;
                            R(mVar7);
                            ((ve.b) k0()).getClass();
                            mVar7.n1(str2, Long.valueOf(System.currentTimeMillis() - 15000), "_sid", f(str2, sVar2));
                        }
                    }
                }
            }
            m mVar8 = this.C;
            R(mVar8);
            com.google.android.gms.common.internal.d0.e(str2);
            mVar8.V0();
            mVar8.W0();
            if (j9 < 0) {
                q0 q0Var = ((h1) mVar8.B).F;
                h1.g(q0Var);
                q0Var.J.d("Invalid time querying timed out conditional properties", q0.d1(str2), Long.valueOf(j9));
                listW1 = Collections.EMPTY_LIST;
            } else {
                listW1 = mVar8.W1("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j9)});
            }
            Iterator it = listW1.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                h1Var = this.L;
                if (!zHasNext) {
                    break;
                }
                e eVar = (e) it.next();
                if (eVar != null) {
                    t().O.e("User property timed out", eVar.A, h1Var.J.c(eVar.C.B), eVar.C.a());
                    s sVar3 = eVar.G;
                    if (sVar3 != null) {
                        g(new s(sVar3, j9), g4Var);
                    }
                    m mVar9 = this.C;
                    R(mVar9);
                    mVar9.U1(str2, eVar.C.B);
                }
            }
            m mVar10 = this.C;
            R(mVar10);
            com.google.android.gms.common.internal.d0.e(str2);
            mVar10.V0();
            mVar10.W0();
            if (j9 < 0) {
                q0 q0Var2 = ((h1) mVar10.B).F;
                h1.g(q0Var2);
                q0Var2.J.d("Invalid time querying expired conditional properties", q0.d1(str2), Long.valueOf(j9));
                listW2 = Collections.EMPTY_LIST;
            } else {
                listW2 = mVar10.W1("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j9)});
            }
            ArrayList arrayList = new ArrayList(listW2.size());
            Iterator it2 = listW2.iterator();
            while (it2.hasNext()) {
                e eVar2 = (e) it2.next();
                if (eVar2 != null) {
                    Iterator it3 = it2;
                    t().O.e("User property expired", eVar2.A, h1Var.J.c(eVar2.C.B), eVar2.C.a());
                    m mVar11 = this.C;
                    R(mVar11);
                    mVar11.N1(str2, eVar2.C.B);
                    s sVar4 = eVar2.K;
                    if (sVar4 != null) {
                        arrayList.add(sVar4);
                    }
                    m mVar12 = this.C;
                    R(mVar12);
                    mVar12.U1(str2, eVar2.C.B);
                    it2 = it3;
                }
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                g(new s((s) it4.next(), j9), g4Var);
            }
            m mVar13 = this.C;
            R(mVar13);
            com.google.android.gms.common.internal.d0.e(str2);
            com.google.android.gms.common.internal.d0.e(str4);
            mVar13.V0();
            mVar13.W0();
            if (j9 < 0) {
                h1 h1Var2 = (h1) mVar13.B;
                q0 q0Var3 = h1Var2.F;
                h1.g(q0Var3);
                q0Var3.J.e("Invalid time querying triggered conditional properties", q0.d1(str2), h1Var2.J.a(str4), Long.valueOf(j9));
                listW3 = Collections.EMPTY_LIST;
            } else {
                listW3 = mVar13.W1("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j9)});
            }
            ArrayList arrayList2 = new ArrayList(listW3.size());
            for (e eVar3 : listW3) {
                if (eVar3 != null) {
                    b4 b4Var = eVar3.C;
                    String str5 = eVar3.A;
                    com.google.android.gms.common.internal.d0.h(str5);
                    String str6 = eVar3.B;
                    String str7 = b4Var.B;
                    Object objA = b4Var.a();
                    com.google.android.gms.common.internal.d0.h(objA);
                    c4 c4Var = new c4(str5, str6, str7, j9, objA);
                    Object obj = c4Var.f14612e;
                    String str8 = c4Var.f14610c;
                    m mVar14 = this.C;
                    R(mVar14);
                    if (mVar14.O1(c4Var)) {
                        t().O.e("User property triggered", eVar3.A, h1Var.J.c(str8), obj);
                    } else {
                        t().G.e("Too many active user properties, ignoring", q0.d1(eVar3.A), h1Var.J.c(str8), obj);
                    }
                    s sVar5 = eVar3.I;
                    if (sVar5 != null) {
                        arrayList2.add(sVar5);
                    }
                    eVar3.C = new b4(c4Var);
                    eVar3.E = true;
                    m mVar15 = this.C;
                    R(mVar15);
                    mVar15.S1(eVar3);
                }
            }
            g(sVar2, g4Var);
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                g(new s((s) it5.next(), j9), g4Var);
            }
            m mVar16 = this.C;
            R(mVar16);
            mVar16.I1();
        } finally {
            m mVar17 = this.C;
            R(mVar17);
            mVar17.J1();
        }
    }

    @Override
    public final Context e0() {
        return this.L.A;
    }

    public final Bundle f(String str, s sVar) throws Throwable {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", sVar.B.A.getLong("_sid"));
        m mVar = this.C;
        R(mVar);
        c4 c4VarP1 = mVar.P1(str, "_sno");
        if (c4VarP1 != null) {
            Object obj = c4VarP1.f14612e;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    public final qd.u0 f0() {
        qd.u0 u0Var = this.D;
        if (u0Var != null) {
            return u0Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final void g(s sVar, g4 g4Var) throws Throwable {
        y3 y3Var;
        String str;
        String str2;
        String str3;
        long jRound;
        String str4;
        m mVarD0;
        int iD1;
        c4 c4Var;
        c4 c4Var2;
        o10.b bVar;
        boolean zT1;
        boolean zEquals;
        Iterator<String> it;
        long length;
        Object objA;
        String str5;
        j jVarA2;
        long jIntValue;
        String str6;
        Bundle bundleE;
        m mVarD1;
        long jDelete;
        h1 h1Var;
        l7.k kVar;
        String str7;
        q qVarT1;
        q qVarA;
        l7.k kVar2;
        com.google.android.gms.internal.measurement.h3 h3VarU;
        String str8;
        String str9;
        String str10;
        long j9;
        String str11;
        String str12;
        String str13;
        t1 t1VarJ;
        boolean zF1;
        s1 s1Var;
        long j10;
        com.google.android.gms.internal.measurement.c4 c4VarA;
        Map mapB;
        String str14;
        ArrayList arrayList;
        t1 t1VarJ2;
        u0 u0VarX1;
        int i10;
        List listQ1;
        int i11;
        m mVarD2;
        m mVarD3;
        Iterator<String> it2;
        boolean zL1;
        int i12;
        String str15;
        ContentValues contentValues;
        String str16;
        t0 t0VarH0;
        long jG1;
        u0 u0VarX2;
        long j11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        long jL1;
        g gVarB0;
        a0 a0Var;
        o10.b bVar2;
        Object obj;
        c4 c4VarP1;
        Object obj2;
        long jMax;
        long jIntValue2;
        String str17 = "events";
        com.google.android.gms.common.internal.d0.h(g4Var);
        boolean z18 = g4Var.N;
        long j12 = g4Var.Q;
        long j13 = g4Var.F;
        String str18 = g4Var.S;
        long j14 = g4Var.E;
        long j15 = g4Var.J;
        String str19 = g4Var.U;
        String str20 = g4Var.C;
        String str21 = g4Var.D;
        long j16 = j13;
        boolean z19 = g4Var.H;
        String str22 = g4Var.A;
        com.google.android.gms.common.internal.d0.e(str22);
        long jNanoTime = System.nanoTime();
        C().V0();
        j0();
        h0();
        String str23 = g4Var.B;
        if (TextUtils.isEmpty(str23)) {
            return;
        }
        if (!z19) {
            Z(g4Var);
            return;
        }
        a1 a1VarC0 = c0();
        String str24 = sVar.A;
        boolean zK1 = a1VarC0.k1(str22, str24);
        h1 h1Var2 = this.L;
        o10.b bVar3 = this.f14777j0;
        if (zK1) {
            t().a1().d("Dropping blocked event. appId", q0.d1(str22), h1Var2.h().a(str24));
            if (!"1".equals(c0().V(str22, "measurement.upload.blacklist_internal")) && !"1".equals(c0().V(str22, "measurement.upload.blacklist_public"))) {
                if ("_err".equals(str24)) {
                    return;
                }
                i0();
                e4.l1(bVar3, str22, 11, "_ev", str24, 0);
                return;
            }
            u0 u0VarX3 = d0().X1(str22);
            if (u0VarX3 != null) {
                h1 h1Var3 = u0VarX3.f14703a;
                e1 e1Var = h1Var3.G;
                h1.g(e1Var);
                e1Var.V0();
                long j17 = u0VarX3.S;
                e1 e1Var2 = h1Var3.G;
                h1.g(e1Var2);
                e1Var2.V0();
                long jMax2 = Math.max(j17, u0VarX3.R);
                ((ve.b) k0()).getClass();
                long jAbs = Math.abs(System.currentTimeMillis() - jMax2);
                b0();
                if (jAbs > ((Long) b0.N.a(null)).longValue()) {
                    t().b1().b("Fetching config for blocked app");
                    v(u0VarX3);
                    return;
                }
                return;
            }
            return;
        }
        b50.n nVarC = b50.n.c(sVar);
        e4 e4VarI0 = i0();
        g gVarB1 = b0();
        gVarB1.getClass();
        e4VarI0.e1(nVarC, Math.max(Math.min(gVarB1.d1(str22, b0.X), 100), 25));
        int iMax = Math.max(Math.min(b0().d1(str22, b0.f14564g0), 35), 10);
        Bundle bundle = (Bundle) nVarC.e;
        for (String str25 : new TreeSet(bundle.keySet())) {
            if ("items".equals(str25)) {
                i0().f1(bundle.getParcelableArray(str25), iMax);
            }
        }
        s sVarE = nVarC.e();
        r rVar = sVarE.B;
        String str26 = sVarE.A;
        if (Log.isLoggable(t().f1(), 2)) {
            t().c1().c(h1Var2.h().d(sVarE), "Logging event");
        }
        d0().H1();
        try {
            Z(g4Var);
            boolean z20 = "ecommerce_purchase".equals(str26) || "purchase".equals(str26) || "refund".equals(str26);
            if (!"_iap".equals(str26)) {
                if (z20) {
                    z20 = true;
                } else {
                    str3 = str21;
                    str17 = "events";
                    str = str19;
                    str4 = str22;
                    str2 = str20;
                }
                bVar = bVar3;
                zT1 = e4.T1(str26);
                zEquals = "_err".equals(str26);
                i0();
                if (rVar == null) {
                    length = 0;
                } else {
                    it = rVar.A.keySet().iterator();
                    length = 0;
                    while (it.hasNext()) {
                        objA = rVar.a(it.next());
                        if (objA instanceof Parcelable[]) {
                            length += (long) ((Parcelable[]) objA).length;
                        }
                    }
                }
                str5 = str4;
                jVarA2 = d0().a2(b(), str5, length + 1, true, zT1, false, zEquals, false, false, false);
                long j18 = jVarA2.f14641b;
                b0();
                jIntValue = j18 - ((long) ((Integer) b0.l.a(null)).intValue());
                if (jIntValue <= 0) {
                    if (zT1) {
                        long j19 = jVarA2.f14640a;
                        b0();
                        jIntValue2 = j19 - ((long) ((Integer) b0.f14580n.a(null)).intValue());
                        if (jIntValue2 > 0) {
                            if (jIntValue2 % 1000 == 1) {
                                t().Z0().d("Data loss. Too many public events logged. appId, count", q0.d1(str5), Long.valueOf(jVarA2.f14640a));
                            }
                            i0();
                            e4.l1(bVar, str5, 16, "_ev", sVarE.A, 0);
                            d0().I1();
                        }
                    }
                    str6 = str5;
                    if (zEquals) {
                        jMax = jVarA2.f14643d - ((long) Math.max(0, Math.min(1000000, b0().d1(str6, b0.m))));
                        if (jMax > 0) {
                            if (jMax == 1) {
                                t().Z0().d("Too many error events logged. appId, count", q0.d1(str6), Long.valueOf(jVarA2.f14643d));
                            }
                            d0().I1();
                        }
                    }
                    bundleE = rVar.e();
                    e4 e4VarI1 = i0();
                    String str27 = sVarE.C;
                    e4VarI1.k1(bundleE, "_o", str27);
                    if (i0().v1(str6, g4Var.f14620b0)) {
                        i0().k1(bundleE, "_dbg", 1L);
                        i0().k1(bundleE, "_r", 1L);
                    }
                    if ("_s".equals(str26) && (c4VarP1 = d0().P1(str6, "_sno")) != null) {
                        obj2 = c4VarP1.f14612e;
                        if (obj2 instanceof Long) {
                            i0().k1(bundleE, "_sno", obj2);
                        }
                    }
                    if (b0().f1(null, b0.X0) && Objects.equals(str27, "am") && str26.equals("_ai")) {
                        obj = bundleE.get("value");
                        if (obj instanceof String) {
                            try {
                                double d3 = Double.parseDouble((String) obj);
                                bundleE.remove("value");
                                bundleE.putDouble("value", d3);
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                    mVarD1 = d0();
                    com.google.android.gms.common.internal.d0.e(str6);
                    mVarD1.V0();
                    mVarD1.W0();
                    try {
                        jDelete = mVarD1.K1().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str6, String.valueOf(Math.max(0, Math.min(1000000, ((h1) mVarD1.B).D.d1(str6, b0.f14586q))))});
                    } catch (SQLiteException e3) {
                        ((h1) mVarD1.B).t().Z0().d("Error deleting over the limit events. appId", q0.d1(str6), e3);
                        jDelete = 0;
                    }
                    if (jDelete > 0) {
                        t().a1().d("Data lost. Too many events stored on disk, deleted. appId", q0.d1(str6), Long.valueOf(jDelete));
                    }
                    h1Var = this.L;
                    kVar = new l7.k(h1Var, sVarE.C, str6, sVarE.A, sVarE.D, 0L, bundleE);
                    m mVarD4 = d0();
                    str7 = (String) kVar.f10091e;
                    String str28 = str17;
                    qVarT1 = mVarD4.t1(str28, str6, str7);
                    if (qVarT1 == null) {
                        jL1 = d0().l1(str6);
                        gVarB0 = b0();
                        gVarB0.getClass();
                        a0Var = b0.W;
                        bVar2 = bVar;
                        if (jL1 >= Math.max(Math.min(gVarB0.d1(str6, a0Var), CastStatusCodes.AUTHENTICATION_FAILED), MediaError.DetailedErrorCode.SEGMENT_UNKNOWN) || !zT1) {
                            bVar = bVar2;
                            qVarA = new q(str6, str7, 0L, 0L, 0L, kVar.f10088b, 0L, null, null, null, null);
                            str6 = str6;
                        } else {
                            b50.b bVarZ0 = t().Z0();
                            p0 p0VarD1 = q0.d1(str6);
                            String strA = h1Var.h().a(str7);
                            g gVarB2 = b0();
                            gVarB2.getClass();
                            bVarZ0.e("Too many event names used, ignoring event. appId, name, supported count", p0VarD1, strA, Integer.valueOf(Math.max(Math.min(gVarB2.d1(str6, a0Var), CastStatusCodes.AUTHENTICATION_FAILED), MediaError.DetailedErrorCode.SEGMENT_UNKNOWN)));
                            i0();
                            e4.l1(bVar2, str6, 8, null, null, 0);
                        }
                    } else {
                        kVar = kVar.g(h1Var, qVarT1.f14688f);
                        qVarA = qVarT1.a(kVar.f10088b);
                    }
                    kVar2 = kVar;
                    d0().u1(str28, qVarA);
                    C().V0();
                    j0();
                    String str29 = (String) kVar2.f10090d;
                    com.google.android.gms.common.internal.d0.e(str29);
                    com.google.android.gms.common.internal.d0.b(str29.equals(str6));
                    h3VarU = com.google.android.gms.internal.measurement.i3.U();
                    h3VarU.B();
                    h3VarU.k();
                    if (!TextUtils.isEmpty(str6)) {
                        h3VarU.s(str6);
                    }
                    if (TextUtils.isEmpty(str3)) {
                        str8 = str3;
                    } else {
                        str8 = str3;
                        h3VarU.p(str8);
                    }
                    if (TextUtils.isEmpty(str2)) {
                        str9 = str2;
                    } else {
                        str9 = str2;
                        h3VarU.t(str9);
                    }
                    if (TextUtils.isEmpty(str)) {
                        str10 = str;
                    } else {
                        str10 = str;
                        h3VarU.U(str10);
                    }
                    if (j15 != -2147483648L) {
                        j9 = j15;
                        h3VarU.O((int) j9);
                    } else {
                        j9 = j15;
                    }
                    str11 = str8;
                    h3VarU.u(j14);
                    if (TextUtils.isEmpty(str23)) {
                        str12 = str23;
                    } else {
                        str12 = str23;
                        h3VarU.K(str12);
                    }
                    com.google.android.gms.common.internal.d0.h(str6);
                    str13 = str10;
                    t1VarJ = a(str6).j(t1.c(100, str18));
                    h3VarU.T(t1VarJ.f());
                    m8.a();
                    zF1 = b0().f1(str6, b0.P0);
                    s1Var = s1.AD_STORAGE;
                    if (zF1) {
                        i0();
                        if (e4.r1(str6)) {
                            h3VarU.C(g4Var.Z);
                            j10 = j9;
                            j11 = g4Var.f14619a0;
                            if (!t1VarJ.i(s1Var) && j11 != 0) {
                                j11 = (j11 & (-2)) | 32;
                            }
                            if (j11 == 1) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            h3VarU.W(z10);
                            if (j11 != 0) {
                                com.google.android.gms.internal.measurement.p2 p2VarW = com.google.android.gms.internal.measurement.q2.w();
                                if ((j11 & 1) != 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                p2VarW.h(z11);
                                if ((j11 & 2) != 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                p2VarW.j(z12);
                                if ((j11 & 4) != 0) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                p2VarW.k(z13);
                                if ((j11 & 8) != 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                p2VarW.m(z14);
                                if ((j11 & 16) != 0) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                p2VarW.n(z15);
                                if ((j11 & 32) != 0) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                p2VarW.o(z16);
                                if ((j11 & 64) != 0) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                p2VarW.p(z17);
                                h3VarU.D((com.google.android.gms.internal.measurement.q2) p2VarW.e());
                            }
                        } else {
                            j10 = j9;
                        }
                    } else {
                        j10 = j9;
                    }
                    if (j16 != 0) {
                        h3VarU.z(j16);
                        j16 = j16;
                    }
                    h3VarU.R(j12);
                    t0 t0VarH1 = h0();
                    c4VarA = com.google.android.gms.internal.measurement.c4.a(t0VarH1.C.L.e0().getContentResolver(), j4.a(), com.google.android.gms.common.api.internal.m0.C);
                    if (c4VarA == null) {
                        mapB = Collections.EMPTY_MAP;
                    } else {
                        mapB = c4VarA.b();
                    }
                    if (mapB == null && !mapB.isEmpty()) {
                        arrayList = new ArrayList();
                        int iIntValue = ((Integer) b0.f14561f0.a(null)).intValue();
                        Iterator it3 = mapB.entrySet().iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                str14 = str9;
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it3.next();
                            Iterator it4 = it3;
                            str14 = str9;
                            if (((String) entry.getKey()).startsWith("measurement.id.")) {
                                try {
                                    int i13 = Integer.parseInt((String) entry.getValue());
                                    if (i13 != 0) {
                                        arrayList.add(Integer.valueOf(i13));
                                        if (arrayList.size() >= iIntValue) {
                                            ((h1) t0VarH1.B).t().a1().c(Integer.valueOf(arrayList.size()), "Too many experiment IDs. Number of IDs");
                                            break;
                                        }
                                        continue;
                                    } else {
                                        continue;
                                    }
                                } catch (NumberFormatException e10) {
                                    ((h1) t0VarH1.B).t().a1().c(e10, "Experiment ID NumberFormatException");
                                }
                            }
                            it3 = it4;
                            str9 = str14;
                        }
                        if (!arrayList.isEmpty()) {
                            if (arrayList != null) {
                                h3VarU.Q(arrayList);
                            }
                            if (b0().f1(null, b0.f14547a1)) {
                                h3VarU.G();
                            }
                            t1VarJ2 = a(str6).j(t1.c(100, str18));
                            if (t1VarJ2.i(s1Var) || !z18) {
                                str12 = str12;
                            } else {
                                try {
                                    e3 e3Var = this.I;
                                    e3Var.getClass();
                                    Pair pairZ0 = t1VarJ2.i(s1Var) ? e3Var.Z0(str6) : new Pair(RuntimeVersion.SUFFIX, Boolean.FALSE);
                                    if (TextUtils.isEmpty((CharSequence) pairZ0.first)) {
                                        str12 = str12;
                                    } else {
                                        h3VarU.w((String) pairZ0.first);
                                        Object obj3 = pairZ0.second;
                                        if (obj3 != null) {
                                            h3VarU.x(((Boolean) obj3).booleanValue());
                                        }
                                        if (((String) kVar2.f10091e).equals("_fx") || ((String) pairZ0.first).equals("00000000-0000-0000-0000-000000000000") || (u0VarX2 = d0().X1(str6)) == null) {
                                            str12 = str12;
                                        } else {
                                            e1 e1Var3 = u0VarX2.f14703a.G;
                                            h1.g(e1Var3);
                                            e1Var3.V0();
                                            if (u0VarX2.f14725y) {
                                                p(str6, false, null, null);
                                                Bundle bundle2 = new Bundle();
                                                e1 e1Var4 = u0VarX2.f14703a.G;
                                                h1.g(e1Var4);
                                                e1Var4.V0();
                                                Long l = u0VarX2.f14726z;
                                                if (l != null) {
                                                    bundle2.putLong("_pfo", Math.max(0L, l.longValue()));
                                                }
                                                e1 e1Var5 = u0VarX2.f14703a.G;
                                                h1.g(e1Var5);
                                                e1Var5.V0();
                                                Long l10 = u0VarX2.A;
                                                if (l10 != null) {
                                                    bundle2.putLong("_uwa", l10.longValue());
                                                }
                                                bundle2.putLong("_r", 1L);
                                                bVar.b(str6, "_fx", bundle2);
                                            } else {
                                                str12 = str12;
                                            }
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    y3Var = this;
                                }
                            }
                            h1Var2.k().X0();
                            String str30 = Build.MODEL;
                            h3VarU.m();
                            h1Var2.k().X0();
                            String str31 = Build.VERSION.RELEASE;
                            h3VarU.b();
                            ((com.google.android.gms.internal.measurement.i3) h3VarU.B).o0(str31);
                            h3VarU.o((int) h1Var2.k().Z0());
                            h3VarU.n(h1Var2.k().a1());
                            h3VarU.V(g4Var.W);
                            if (h1Var2.a()) {
                                h3VarU.q();
                                if (!TextUtils.isEmpty(null)) {
                                    h3VarU.b();
                                    ((com.google.android.gms.internal.measurement.i3) h3VarU.B).R0(null);
                                    throw null;
                                }
                            }
                            u0VarX1 = d0().X1(str6);
                            if (u0VarX1 == null) {
                                u0VarX1 = new u0(h1Var2, str6);
                                y3Var = this;
                                try {
                                    u0VarX1.F(y3Var.j(t1VarJ2));
                                    u0VarX1.K(g4Var.K);
                                    u0VarX1.H(str12);
                                    if (t1VarJ2.i(s1Var)) {
                                        u0VarX1.I(y3Var.I.a1(str6, z18));
                                    }
                                    u0VarX1.e(0L);
                                    u0VarX1.L(0L);
                                    u0VarX1.M(0L);
                                    u0VarX1.O(str14);
                                    u0VarX1.Q(j10);
                                    u0VarX1.R(str11);
                                    u0VarX1.S(j14);
                                    u0VarX1.a(j16);
                                    u0VarX1.d(z19);
                                    u0VarX1.c(j12);
                                    i10 = 0;
                                    y3Var.d0().Y1(u0VarX1, false);
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            } else {
                                i10 = 0;
                                y3Var = this;
                            }
                            if (t1VarJ2.i(s1.ANALYTICS_STORAGE) && !TextUtils.isEmpty(u0VarX1.E())) {
                                String strE = u0VarX1.E();
                                com.google.android.gms.common.internal.d0.h(strE);
                                h3VarU.y(strE);
                            }
                            if (!TextUtils.isEmpty(u0VarX1.J())) {
                                String strJ = u0VarX1.J();
                                com.google.android.gms.common.internal.d0.h(strJ);
                                h3VarU.N(strJ);
                            }
                            listQ1 = y3Var.d0().Q1(str6);
                            i11 = i10;
                            while (i11 < listQ1.size()) {
                                com.google.android.gms.internal.measurement.q3 q3VarA = com.google.android.gms.internal.measurement.r3.A();
                                String str32 = ((c4) listQ1.get(i11)).f14610c;
                                q3VarA.b();
                                ((com.google.android.gms.internal.measurement.r3) q3VarA.B).C(str32);
                                long j20 = ((c4) listQ1.get(i11)).f14611d;
                                q3VarA.b();
                                ((com.google.android.gms.internal.measurement.r3) q3VarA.B).B(j20);
                                y3Var.h0().t1(q3VarA, ((c4) listQ1.get(i11)).f14612e);
                                h3VarU.c0(q3VarA);
                                if ("_sid".equals(((c4) listQ1.get(i11)).f14610c)) {
                                    e1 e1Var6 = u0VarX1.f14703a.G;
                                    h1.g(e1Var6);
                                    e1Var6.V0();
                                    if (u0VarX1.f14723w != 0) {
                                        t0VarH0 = y3Var.h0();
                                        if (TextUtils.isEmpty(str13)) {
                                            str16 = str13;
                                            jG1 = 0;
                                        } else {
                                            str16 = str13;
                                            jG1 = t0VarH0.G1(str16.getBytes(Charset.forName("UTF-8")));
                                        }
                                        e1 e1Var7 = u0VarX1.f14703a.G;
                                        h1.g(e1Var7);
                                        e1Var7.V0();
                                        if (jG1 != u0VarX1.f14723w) {
                                            h3VarU.b();
                                            ((com.google.android.gms.internal.measurement.i3) h3VarU.B).Z0();
                                        }
                                    } else {
                                        str16 = str13;
                                    }
                                } else {
                                    str16 = str13;
                                }
                                i11++;
                                str13 = str16;
                            }
                            try {
                                mVarD2 = y3Var.d0();
                                com.google.android.gms.internal.measurement.i3 i3Var = (com.google.android.gms.internal.measurement.i3) h3VarU.e();
                                mVarD2.V0();
                                mVarD2.W0();
                                com.google.android.gms.common.internal.d0.e(i3Var.p());
                                byte[] bArrA = i3Var.a();
                                long jG2 = mVarD2.C.h0().G1(bArrA);
                                ContentValues contentValues2 = new ContentValues();
                                contentValues2.put("app_id", i3Var.p());
                                contentValues2.put("metadata_fingerprint", Long.valueOf(jG2));
                                contentValues2.put("metadata", bArrA);
                                try {
                                    mVarD2.K1().insertWithOnConflict("raw_events_metadata", null, contentValues2, 4);
                                    mVarD3 = y3Var.d0();
                                    r rVar2 = (r) kVar2.f10093g;
                                    Objects.requireNonNull(rVar2);
                                    it2 = rVar2.A.keySet().iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            a1 a1VarC1 = y3Var.c0();
                                            String str33 = (String) kVar2.f10090d;
                                            zL1 = a1VarC1.l1(str33, (String) kVar2.f10091e);
                                            j jVarZ1 = y3Var.d0().Z1(y3Var.b(), str33, false, false, false, false);
                                            if (zL1 || jVarZ1.f14644e >= y3Var.b0().d1(str33, b0.f14584p)) {
                                                i12 = i10;
                                                break;
                                            }
                                        } else if ("_r".equals(it2.next())) {
                                        }
                                        i12 = 1;
                                        break;
                                    }
                                    mVarD3.V0();
                                    mVarD3.W0();
                                    str15 = (String) kVar2.f10090d;
                                    com.google.android.gms.common.internal.d0.e(str15);
                                    byte[] bArrA2 = mVarD3.C.h0().x1(kVar2).a();
                                    contentValues = new ContentValues();
                                    contentValues.put("app_id", str15);
                                    contentValues.put("name", (String) kVar2.f10091e);
                                    contentValues.put("timestamp", Long.valueOf(kVar2.f10088b));
                                    contentValues.put("metadata_fingerprint", Long.valueOf(jG2));
                                    contentValues.put("data", bArrA2);
                                    contentValues.put("realtime", Integer.valueOf(i12));
                                    try {
                                        if (mVarD3.K1().insert("raw_events", null, contentValues) == -1) {
                                            ((h1) mVarD3.B).t().Z0().c(q0.d1(str15), "Failed to insert raw event (got -1). appId");
                                        } else {
                                            y3Var.O = 0L;
                                        }
                                    } catch (SQLiteException e11) {
                                        ((h1) mVarD3.B).t().Z0().d("Error storing raw event. appId", q0.d1((String) kVar2.f10090d), e11);
                                    }
                                    y3Var.d0().I1();
                                    y3Var.d0().J1();
                                    y3Var.K();
                                    y3Var.t().c1().c(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                                    return;
                                } catch (SQLiteException e12) {
                                    ((h1) mVarD2.B).t().Z0().d("Error storing raw event metadata. appId", q0.d1(i3Var.p()), e12);
                                    throw e12;
                                }
                            } catch (IOException e13) {
                                y3Var.t().Z0().d("Data loss. Failed to insert raw event metadata. appId", q0.d1(h3VarU.q()), e13);
                            }
                        }
                        y3Var.d0().J1();
                        throw th;
                    }
                    str14 = str9;
                    arrayList = null;
                    if (arrayList != null) {
                        h3VarU.Q(arrayList);
                    }
                    if (b0().f1(null, b0.f14547a1)) {
                        h3VarU.G();
                    }
                    t1VarJ2 = a(str6).j(t1.c(100, str18));
                    if (t1VarJ2.i(s1Var)) {
                        str12 = str12;
                        h1Var2.k().X0();
                        String str34 = Build.MODEL;
                        h3VarU.m();
                        h1Var2.k().X0();
                        String str35 = Build.VERSION.RELEASE;
                        h3VarU.b();
                        ((com.google.android.gms.internal.measurement.i3) h3VarU.B).o0(str35);
                        h3VarU.o((int) h1Var2.k().Z0());
                        h3VarU.n(h1Var2.k().a1());
                        h3VarU.V(g4Var.W);
                        if (h1Var2.a()) {
                            h3VarU.q();
                            if (!TextUtils.isEmpty(null)) {
                                h3VarU.b();
                                ((com.google.android.gms.internal.measurement.i3) h3VarU.B).R0(null);
                                throw null;
                            }
                        }
                        u0VarX1 = d0().X1(str6);
                        if (u0VarX1 == null) {
                            u0VarX1 = new u0(h1Var2, str6);
                            y3Var = this;
                            u0VarX1.F(y3Var.j(t1VarJ2));
                            u0VarX1.K(g4Var.K);
                            u0VarX1.H(str12);
                            if (t1VarJ2.i(s1Var)) {
                                u0VarX1.I(y3Var.I.a1(str6, z18));
                            }
                            u0VarX1.e(0L);
                            u0VarX1.L(0L);
                            u0VarX1.M(0L);
                            u0VarX1.O(str14);
                            u0VarX1.Q(j10);
                            u0VarX1.R(str11);
                            u0VarX1.S(j14);
                            u0VarX1.a(j16);
                            u0VarX1.d(z19);
                            u0VarX1.c(j12);
                            i10 = 0;
                            y3Var.d0().Y1(u0VarX1, false);
                        } else {
                            i10 = 0;
                            y3Var = this;
                        }
                        if (t1VarJ2.i(s1.ANALYTICS_STORAGE)) {
                            String strE2 = u0VarX1.E();
                            com.google.android.gms.common.internal.d0.h(strE2);
                            h3VarU.y(strE2);
                        }
                        if (!TextUtils.isEmpty(u0VarX1.J())) {
                            String strJ2 = u0VarX1.J();
                            com.google.android.gms.common.internal.d0.h(strJ2);
                            h3VarU.N(strJ2);
                        }
                        listQ1 = y3Var.d0().Q1(str6);
                        i11 = i10;
                        while (i11 < listQ1.size()) {
                            com.google.android.gms.internal.measurement.q3 q3VarA2 = com.google.android.gms.internal.measurement.r3.A();
                            String str36 = ((c4) listQ1.get(i11)).f14610c;
                            q3VarA2.b();
                            ((com.google.android.gms.internal.measurement.r3) q3VarA2.B).C(str36);
                            long j21 = ((c4) listQ1.get(i11)).f14611d;
                            q3VarA2.b();
                            ((com.google.android.gms.internal.measurement.r3) q3VarA2.B).B(j21);
                            y3Var.h0().t1(q3VarA2, ((c4) listQ1.get(i11)).f14612e);
                            h3VarU.c0(q3VarA2);
                            if ("_sid".equals(((c4) listQ1.get(i11)).f14610c)) {
                                e1 e1Var8 = u0VarX1.f14703a.G;
                                h1.g(e1Var8);
                                e1Var8.V0();
                                if (u0VarX1.f14723w != 0) {
                                    t0VarH0 = y3Var.h0();
                                    if (TextUtils.isEmpty(str13)) {
                                        str16 = str13;
                                        jG1 = 0;
                                    } else {
                                        str16 = str13;
                                        jG1 = t0VarH0.G1(str16.getBytes(Charset.forName("UTF-8")));
                                    }
                                    e1 e1Var9 = u0VarX1.f14703a.G;
                                    h1.g(e1Var9);
                                    e1Var9.V0();
                                    if (jG1 != u0VarX1.f14723w) {
                                        h3VarU.b();
                                        ((com.google.android.gms.internal.measurement.i3) h3VarU.B).Z0();
                                    }
                                } else {
                                    str16 = str13;
                                }
                            } else {
                                str16 = str13;
                            }
                            i11++;
                            str13 = str16;
                        }
                        mVarD2 = y3Var.d0();
                        com.google.android.gms.internal.measurement.i3 i3Var2 = (com.google.android.gms.internal.measurement.i3) h3VarU.e();
                        mVarD2.V0();
                        mVarD2.W0();
                        com.google.android.gms.common.internal.d0.e(i3Var2.p());
                        byte[] bArrA3 = i3Var2.a();
                        long jG3 = mVarD2.C.h0().G1(bArrA3);
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("app_id", i3Var2.p());
                        contentValues3.put("metadata_fingerprint", Long.valueOf(jG3));
                        contentValues3.put("metadata", bArrA3);
                        mVarD2.K1().insertWithOnConflict("raw_events_metadata", null, contentValues3, 4);
                        mVarD3 = y3Var.d0();
                        r rVar3 = (r) kVar2.f10093g;
                        Objects.requireNonNull(rVar3);
                        it2 = rVar3.A.keySet().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                a1 a1VarC2 = y3Var.c0();
                                String str37 = (String) kVar2.f10090d;
                                zL1 = a1VarC2.l1(str37, (String) kVar2.f10091e);
                                j jVarZ2 = y3Var.d0().Z1(y3Var.b(), str37, false, false, false, false);
                                if (zL1) {
                                }
                                i12 = i10;
                                break;
                            }
                            if ("_r".equals(it2.next())) {
                            }
                            i12 = 1;
                            break;
                        }
                        mVarD3.V0();
                        mVarD3.W0();
                        str15 = (String) kVar2.f10090d;
                        com.google.android.gms.common.internal.d0.e(str15);
                        byte[] bArrA4 = mVarD3.C.h0().x1(kVar2).a();
                        contentValues = new ContentValues();
                        contentValues.put("app_id", str15);
                        contentValues.put("name", (String) kVar2.f10091e);
                        contentValues.put("timestamp", Long.valueOf(kVar2.f10088b));
                        contentValues.put("metadata_fingerprint", Long.valueOf(jG3));
                        contentValues.put("data", bArrA4);
                        contentValues.put("realtime", Integer.valueOf(i12));
                        if (mVarD3.K1().insert("raw_events", null, contentValues) == -1) {
                            ((h1) mVarD3.B).t().Z0().c(q0.d1(str15), "Failed to insert raw event (got -1). appId");
                        } else {
                            y3Var.O = 0L;
                        }
                        y3Var.d0().I1();
                        y3Var.d0().J1();
                        y3Var.K();
                        y3Var.t().c1().c(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                        return;
                    }
                    str12 = str12;
                    h1Var2.k().X0();
                    String str38 = Build.MODEL;
                    h3VarU.m();
                    h1Var2.k().X0();
                    String str39 = Build.VERSION.RELEASE;
                    h3VarU.b();
                    ((com.google.android.gms.internal.measurement.i3) h3VarU.B).o0(str39);
                    h3VarU.o((int) h1Var2.k().Z0());
                    h3VarU.n(h1Var2.k().a1());
                    h3VarU.V(g4Var.W);
                    if (h1Var2.a()) {
                        h3VarU.q();
                        if (!TextUtils.isEmpty(null)) {
                            h3VarU.b();
                            ((com.google.android.gms.internal.measurement.i3) h3VarU.B).R0(null);
                            throw null;
                        }
                    }
                    u0VarX1 = d0().X1(str6);
                    if (u0VarX1 == null) {
                        u0VarX1 = new u0(h1Var2, str6);
                        y3Var = this;
                        u0VarX1.F(y3Var.j(t1VarJ2));
                        u0VarX1.K(g4Var.K);
                        u0VarX1.H(str12);
                        if (t1VarJ2.i(s1Var)) {
                            u0VarX1.I(y3Var.I.a1(str6, z18));
                        }
                        u0VarX1.e(0L);
                        u0VarX1.L(0L);
                        u0VarX1.M(0L);
                        u0VarX1.O(str14);
                        u0VarX1.Q(j10);
                        u0VarX1.R(str11);
                        u0VarX1.S(j14);
                        u0VarX1.a(j16);
                        u0VarX1.d(z19);
                        u0VarX1.c(j12);
                        i10 = 0;
                        y3Var.d0().Y1(u0VarX1, false);
                    } else {
                        i10 = 0;
                        y3Var = this;
                    }
                    if (t1VarJ2.i(s1.ANALYTICS_STORAGE)) {
                        String strE3 = u0VarX1.E();
                        com.google.android.gms.common.internal.d0.h(strE3);
                        h3VarU.y(strE3);
                    }
                    if (!TextUtils.isEmpty(u0VarX1.J())) {
                        String strJ3 = u0VarX1.J();
                        com.google.android.gms.common.internal.d0.h(strJ3);
                        h3VarU.N(strJ3);
                    }
                    listQ1 = y3Var.d0().Q1(str6);
                    i11 = i10;
                    while (i11 < listQ1.size()) {
                        com.google.android.gms.internal.measurement.q3 q3VarA3 = com.google.android.gms.internal.measurement.r3.A();
                        String str310 = ((c4) listQ1.get(i11)).f14610c;
                        q3VarA3.b();
                        ((com.google.android.gms.internal.measurement.r3) q3VarA3.B).C(str310);
                        long j22 = ((c4) listQ1.get(i11)).f14611d;
                        q3VarA3.b();
                        ((com.google.android.gms.internal.measurement.r3) q3VarA3.B).B(j22);
                        y3Var.h0().t1(q3VarA3, ((c4) listQ1.get(i11)).f14612e);
                        h3VarU.c0(q3VarA3);
                        if ("_sid".equals(((c4) listQ1.get(i11)).f14610c)) {
                            e1 e1Var10 = u0VarX1.f14703a.G;
                            h1.g(e1Var10);
                            e1Var10.V0();
                            if (u0VarX1.f14723w != 0) {
                                t0VarH0 = y3Var.h0();
                                if (TextUtils.isEmpty(str13)) {
                                    str16 = str13;
                                    jG1 = 0;
                                } else {
                                    str16 = str13;
                                    jG1 = t0VarH0.G1(str16.getBytes(Charset.forName("UTF-8")));
                                }
                                e1 e1Var11 = u0VarX1.f14703a.G;
                                h1.g(e1Var11);
                                e1Var11.V0();
                                if (jG1 != u0VarX1.f14723w) {
                                    h3VarU.b();
                                    ((com.google.android.gms.internal.measurement.i3) h3VarU.B).Z0();
                                }
                            } else {
                                str16 = str13;
                            }
                        } else {
                            str16 = str13;
                        }
                        i11++;
                        str13 = str16;
                    }
                    mVarD2 = y3Var.d0();
                    com.google.android.gms.internal.measurement.i3 i3Var3 = (com.google.android.gms.internal.measurement.i3) h3VarU.e();
                    mVarD2.V0();
                    mVarD2.W0();
                    com.google.android.gms.common.internal.d0.e(i3Var3.p());
                    byte[] bArrA5 = i3Var3.a();
                    long jG4 = mVarD2.C.h0().G1(bArrA5);
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("app_id", i3Var3.p());
                    contentValues4.put("metadata_fingerprint", Long.valueOf(jG4));
                    contentValues4.put("metadata", bArrA5);
                    mVarD2.K1().insertWithOnConflict("raw_events_metadata", null, contentValues4, 4);
                    mVarD3 = y3Var.d0();
                    r rVar4 = (r) kVar2.f10093g;
                    Objects.requireNonNull(rVar4);
                    it2 = rVar4.A.keySet().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            a1 a1VarC3 = y3Var.c0();
                            String str311 = (String) kVar2.f10090d;
                            zL1 = a1VarC3.l1(str311, (String) kVar2.f10091e);
                            j jVarZ3 = y3Var.d0().Z1(y3Var.b(), str311, false, false, false, false);
                            if (zL1) {
                            }
                            i12 = i10;
                            break;
                        }
                        if ("_r".equals(it2.next())) {
                        }
                        i12 = 1;
                        break;
                    }
                    mVarD3.V0();
                    mVarD3.W0();
                    str15 = (String) kVar2.f10090d;
                    com.google.android.gms.common.internal.d0.e(str15);
                    byte[] bArrA6 = mVarD3.C.h0().x1(kVar2).a();
                    contentValues = new ContentValues();
                    contentValues.put("app_id", str15);
                    contentValues.put("name", (String) kVar2.f10091e);
                    contentValues.put("timestamp", Long.valueOf(kVar2.f10088b));
                    contentValues.put("metadata_fingerprint", Long.valueOf(jG4));
                    contentValues.put("data", bArrA6);
                    contentValues.put("realtime", Integer.valueOf(i12));
                    if (mVarD3.K1().insert("raw_events", null, contentValues) == -1) {
                        ((h1) mVarD3.B).t().Z0().c(q0.d1(str15), "Failed to insert raw event (got -1). appId");
                    } else {
                        y3Var.O = 0L;
                    }
                    y3Var.d0().I1();
                    y3Var.d0().J1();
                    y3Var.K();
                    y3Var.t().c1().c(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                    return;
                    y3Var.d0().J1();
                    throw th;
                }
                if (jIntValue % 1000 == 1) {
                    t().Z0().d("Data loss. Too many events logged. appId, count", q0.d1(str5), Long.valueOf(jVarA2.f14641b));
                }
                d0().I1();
                d0().J1();
            }
            str = str19;
            str2 = str20;
            String strC = rVar.c();
            str3 = str21;
            Bundle bundle3 = rVar.A;
            if (z20) {
                double dDoubleValue = rVar.b().doubleValue() * 1000000.0d;
                if (dDoubleValue == 0.0d) {
                    dDoubleValue = bundle3.getLong("value") * 1000000.0d;
                }
                if (dDoubleValue > 9.223372036854776E18d || dDoubleValue < -9.223372036854776E18d) {
                    t().a1().d("Data lost. Currency value is too big. appId", q0.d1(str22), Double.valueOf(dDoubleValue));
                    d0().I1();
                } else {
                    jRound = Math.round(dDoubleValue);
                    if ("refund".equals(str26)) {
                        jRound = -jRound;
                    }
                }
                d0().J1();
            }
            str17 = "events";
            jRound = bundle3.getLong("value");
            if (!TextUtils.isEmpty(strC)) {
                String upperCase = strC.toUpperCase(Locale.US);
                if (upperCase.matches("[A-Z]{3}")) {
                    String strConcat = "_ltv_".concat(upperCase);
                    c4 c4VarP2 = d0().P1(str22, strConcat);
                    try {
                        if (c4VarP2 != null) {
                            Object obj4 = c4VarP2.f14612e;
                            if (obj4 instanceof Long) {
                                long jLongValue = ((Long) obj4).longValue();
                                String str40 = sVarE.C;
                                ((ve.b) k0()).getClass();
                                c4Var = new c4(str22, str40, strConcat, System.currentTimeMillis(), Long.valueOf(jLongValue + jRound));
                                str4 = str22;
                            }
                            c4Var2 = c4Var;
                            if (!d0().O1(c4Var2)) {
                                t().Z0().e("Too many unique user properties are set. Ignoring user property. appId", q0.d1(str4), h1Var2.h().c(c4Var2.f14610c), c4Var2.f14612e);
                                i0();
                                e4.l1(bVar3, str4, 9, null, null, 0);
                                bVar = bVar3;
                            }
                            zT1 = e4.T1(str26);
                            zEquals = "_err".equals(str26);
                            i0();
                            if (rVar == null) {
                                length = 0;
                            } else {
                                it = rVar.A.keySet().iterator();
                                length = 0;
                                while (it.hasNext()) {
                                    objA = rVar.a(it.next());
                                    if (objA instanceof Parcelable[]) {
                                        length += (long) ((Parcelable[]) objA).length;
                                    }
                                }
                            }
                            str5 = str4;
                            jVarA2 = d0().a2(b(), str5, length + 1, true, zT1, false, zEquals, false, false, false);
                            long j110 = jVarA2.f14641b;
                            b0();
                            jIntValue = j110 - ((long) ((Integer) b0.l.a(null)).intValue());
                            if (jIntValue <= 0) {
                                if (zT1) {
                                    long j111 = jVarA2.f14640a;
                                    b0();
                                    jIntValue2 = j111 - ((long) ((Integer) b0.f14580n.a(null)).intValue());
                                    if (jIntValue2 > 0) {
                                        if (jIntValue2 % 1000 == 1) {
                                            t().Z0().d("Data loss. Too many public events logged. appId, count", q0.d1(str5), Long.valueOf(jVarA2.f14640a));
                                        }
                                        i0();
                                        e4.l1(bVar, str5, 16, "_ev", sVarE.A, 0);
                                        d0().I1();
                                    }
                                }
                                str6 = str5;
                                if (zEquals) {
                                    jMax = jVarA2.f14643d - ((long) Math.max(0, Math.min(1000000, b0().d1(str6, b0.m))));
                                    if (jMax > 0) {
                                        if (jMax == 1) {
                                            t().Z0().d("Too many error events logged. appId, count", q0.d1(str6), Long.valueOf(jVarA2.f14643d));
                                        }
                                        d0().I1();
                                    }
                                }
                                bundleE = rVar.e();
                                e4 e4VarI2 = i0();
                                String str210 = sVarE.C;
                                e4VarI2.k1(bundleE, "_o", str210);
                                if (i0().v1(str6, g4Var.f14620b0)) {
                                    i0().k1(bundleE, "_dbg", 1L);
                                    i0().k1(bundleE, "_r", 1L);
                                }
                                if ("_s".equals(str26)) {
                                    obj2 = c4VarP1.f14612e;
                                    if (obj2 instanceof Long) {
                                        i0().k1(bundleE, "_sno", obj2);
                                    }
                                }
                                if (b0().f1(null, b0.X0)) {
                                    obj = bundleE.get("value");
                                    if (obj instanceof String) {
                                        double d5 = Double.parseDouble((String) obj);
                                        bundleE.remove("value");
                                        bundleE.putDouble("value", d5);
                                    }
                                }
                                mVarD1 = d0();
                                com.google.android.gms.common.internal.d0.e(str6);
                                mVarD1.V0();
                                mVarD1.W0();
                                jDelete = mVarD1.K1().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str6, String.valueOf(Math.max(0, Math.min(1000000, ((h1) mVarD1.B).D.d1(str6, b0.f14586q))))});
                                if (jDelete > 0) {
                                    t().a1().d("Data lost. Too many events stored on disk, deleted. appId", q0.d1(str6), Long.valueOf(jDelete));
                                }
                                h1Var = this.L;
                                kVar = new l7.k(h1Var, sVarE.C, str6, sVarE.A, sVarE.D, 0L, bundleE);
                                m mVarD5 = d0();
                                str7 = (String) kVar.f10091e;
                                String str211 = str17;
                                qVarT1 = mVarD5.t1(str211, str6, str7);
                                if (qVarT1 == null) {
                                    jL1 = d0().l1(str6);
                                    gVarB0 = b0();
                                    gVarB0.getClass();
                                    a0Var = b0.W;
                                    bVar2 = bVar;
                                    if (jL1 >= Math.max(Math.min(gVarB0.d1(str6, a0Var), CastStatusCodes.AUTHENTICATION_FAILED), MediaError.DetailedErrorCode.SEGMENT_UNKNOWN)) {
                                    }
                                    bVar = bVar2;
                                    qVarA = new q(str6, str7, 0L, 0L, 0L, kVar.f10088b, 0L, null, null, null, null);
                                    str6 = str6;
                                } else {
                                    kVar = kVar.g(h1Var, qVarT1.f14688f);
                                    qVarA = qVarT1.a(kVar.f10088b);
                                }
                                kVar2 = kVar;
                                d0().u1(str211, qVarA);
                                C().V0();
                                j0();
                                String str212 = (String) kVar2.f10090d;
                                com.google.android.gms.common.internal.d0.e(str212);
                                com.google.android.gms.common.internal.d0.b(str212.equals(str6));
                                h3VarU = com.google.android.gms.internal.measurement.i3.U();
                                h3VarU.B();
                                h3VarU.k();
                                if (!TextUtils.isEmpty(str6)) {
                                    h3VarU.s(str6);
                                }
                                if (TextUtils.isEmpty(str3)) {
                                    str8 = str3;
                                    h3VarU.p(str8);
                                } else {
                                    str8 = str3;
                                }
                                if (TextUtils.isEmpty(str2)) {
                                    str9 = str2;
                                    h3VarU.t(str9);
                                } else {
                                    str9 = str2;
                                }
                                if (TextUtils.isEmpty(str)) {
                                    str10 = str;
                                    h3VarU.U(str10);
                                } else {
                                    str10 = str;
                                }
                                if (j15 != -2147483648L) {
                                    j9 = j15;
                                    h3VarU.O((int) j9);
                                } else {
                                    j9 = j15;
                                }
                                str11 = str8;
                                h3VarU.u(j14);
                                if (TextUtils.isEmpty(str23)) {
                                    str12 = str23;
                                    h3VarU.K(str12);
                                } else {
                                    str12 = str23;
                                }
                                com.google.android.gms.common.internal.d0.h(str6);
                                str13 = str10;
                                t1VarJ = a(str6).j(t1.c(100, str18));
                                h3VarU.T(t1VarJ.f());
                                m8.a();
                                zF1 = b0().f1(str6, b0.P0);
                                s1Var = s1.AD_STORAGE;
                                if (zF1) {
                                    i0();
                                    if (e4.r1(str6)) {
                                        h3VarU.C(g4Var.Z);
                                        j10 = j9;
                                        j11 = g4Var.f14619a0;
                                        if (!t1VarJ.i(s1Var)) {
                                            j11 = (j11 & (-2)) | 32;
                                        }
                                        if (j11 == 1) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        h3VarU.W(z10);
                                        if (j11 != 0) {
                                            com.google.android.gms.internal.measurement.p2 p2VarW2 = com.google.android.gms.internal.measurement.q2.w();
                                            if ((j11 & 1) != 0) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            p2VarW2.h(z11);
                                            if ((j11 & 2) != 0) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            p2VarW2.j(z12);
                                            if ((j11 & 4) != 0) {
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                            p2VarW2.k(z13);
                                            if ((j11 & 8) != 0) {
                                                z14 = true;
                                            } else {
                                                z14 = false;
                                            }
                                            p2VarW2.m(z14);
                                            if ((j11 & 16) != 0) {
                                                z15 = true;
                                            } else {
                                                z15 = false;
                                            }
                                            p2VarW2.n(z15);
                                            if ((j11 & 32) != 0) {
                                                z16 = true;
                                            } else {
                                                z16 = false;
                                            }
                                            p2VarW2.o(z16);
                                            if ((j11 & 64) != 0) {
                                                z17 = true;
                                            } else {
                                                z17 = false;
                                            }
                                            p2VarW2.p(z17);
                                            h3VarU.D((com.google.android.gms.internal.measurement.q2) p2VarW2.e());
                                        }
                                    } else {
                                        j10 = j9;
                                    }
                                } else {
                                    j10 = j9;
                                }
                                if (j16 != 0) {
                                    h3VarU.z(j16);
                                    j16 = j16;
                                }
                                h3VarU.R(j12);
                                t0 t0VarH2 = h0();
                                c4VarA = com.google.android.gms.internal.measurement.c4.a(t0VarH2.C.L.e0().getContentResolver(), j4.a(), com.google.android.gms.common.api.internal.m0.C);
                                if (c4VarA == null) {
                                    mapB = Collections.EMPTY_MAP;
                                } else {
                                    mapB = c4VarA.b();
                                }
                                if (mapB == null) {
                                    str14 = str9;
                                    arrayList = null;
                                } else {
                                    str14 = str9;
                                    arrayList = null;
                                }
                                if (arrayList != null) {
                                    h3VarU.Q(arrayList);
                                }
                                if (b0().f1(null, b0.f14547a1)) {
                                    h3VarU.G();
                                }
                                t1VarJ2 = a(str6).j(t1.c(100, str18));
                                if (t1VarJ2.i(s1Var)) {
                                    str12 = str12;
                                    h1Var2.k().X0();
                                    String str312 = Build.MODEL;
                                    h3VarU.m();
                                    h1Var2.k().X0();
                                    String str313 = Build.VERSION.RELEASE;
                                    h3VarU.b();
                                    ((com.google.android.gms.internal.measurement.i3) h3VarU.B).o0(str313);
                                    h3VarU.o((int) h1Var2.k().Z0());
                                    h3VarU.n(h1Var2.k().a1());
                                    h3VarU.V(g4Var.W);
                                    if (h1Var2.a()) {
                                        h3VarU.q();
                                        if (!TextUtils.isEmpty(null)) {
                                            h3VarU.b();
                                            ((com.google.android.gms.internal.measurement.i3) h3VarU.B).R0(null);
                                            throw null;
                                        }
                                    }
                                    u0VarX1 = d0().X1(str6);
                                    if (u0VarX1 == null) {
                                        u0VarX1 = new u0(h1Var2, str6);
                                        y3Var = this;
                                        u0VarX1.F(y3Var.j(t1VarJ2));
                                        u0VarX1.K(g4Var.K);
                                        u0VarX1.H(str12);
                                        if (t1VarJ2.i(s1Var)) {
                                            u0VarX1.I(y3Var.I.a1(str6, z18));
                                        }
                                        u0VarX1.e(0L);
                                        u0VarX1.L(0L);
                                        u0VarX1.M(0L);
                                        u0VarX1.O(str14);
                                        u0VarX1.Q(j10);
                                        u0VarX1.R(str11);
                                        u0VarX1.S(j14);
                                        u0VarX1.a(j16);
                                        u0VarX1.d(z19);
                                        u0VarX1.c(j12);
                                        i10 = 0;
                                        y3Var.d0().Y1(u0VarX1, false);
                                    } else {
                                        i10 = 0;
                                        y3Var = this;
                                    }
                                    if (t1VarJ2.i(s1.ANALYTICS_STORAGE)) {
                                        String strE4 = u0VarX1.E();
                                        com.google.android.gms.common.internal.d0.h(strE4);
                                        h3VarU.y(strE4);
                                    }
                                    if (!TextUtils.isEmpty(u0VarX1.J())) {
                                        String strJ4 = u0VarX1.J();
                                        com.google.android.gms.common.internal.d0.h(strJ4);
                                        h3VarU.N(strJ4);
                                    }
                                    listQ1 = y3Var.d0().Q1(str6);
                                    i11 = i10;
                                    while (i11 < listQ1.size()) {
                                        com.google.android.gms.internal.measurement.q3 q3VarA4 = com.google.android.gms.internal.measurement.r3.A();
                                        String str314 = ((c4) listQ1.get(i11)).f14610c;
                                        q3VarA4.b();
                                        ((com.google.android.gms.internal.measurement.r3) q3VarA4.B).C(str314);
                                        long j23 = ((c4) listQ1.get(i11)).f14611d;
                                        q3VarA4.b();
                                        ((com.google.android.gms.internal.measurement.r3) q3VarA4.B).B(j23);
                                        y3Var.h0().t1(q3VarA4, ((c4) listQ1.get(i11)).f14612e);
                                        h3VarU.c0(q3VarA4);
                                        if ("_sid".equals(((c4) listQ1.get(i11)).f14610c)) {
                                            e1 e1Var12 = u0VarX1.f14703a.G;
                                            h1.g(e1Var12);
                                            e1Var12.V0();
                                            if (u0VarX1.f14723w != 0) {
                                                t0VarH0 = y3Var.h0();
                                                if (TextUtils.isEmpty(str13)) {
                                                    str16 = str13;
                                                    jG1 = 0;
                                                } else {
                                                    str16 = str13;
                                                    jG1 = t0VarH0.G1(str16.getBytes(Charset.forName("UTF-8")));
                                                }
                                                e1 e1Var13 = u0VarX1.f14703a.G;
                                                h1.g(e1Var13);
                                                e1Var13.V0();
                                                if (jG1 != u0VarX1.f14723w) {
                                                    h3VarU.b();
                                                    ((com.google.android.gms.internal.measurement.i3) h3VarU.B).Z0();
                                                }
                                            } else {
                                                str16 = str13;
                                            }
                                        } else {
                                            str16 = str13;
                                        }
                                        i11++;
                                        str13 = str16;
                                    }
                                    mVarD2 = y3Var.d0();
                                    com.google.android.gms.internal.measurement.i3 i3Var4 = (com.google.android.gms.internal.measurement.i3) h3VarU.e();
                                    mVarD2.V0();
                                    mVarD2.W0();
                                    com.google.android.gms.common.internal.d0.e(i3Var4.p());
                                    byte[] bArrA7 = i3Var4.a();
                                    long jG5 = mVarD2.C.h0().G1(bArrA7);
                                    ContentValues contentValues5 = new ContentValues();
                                    contentValues5.put("app_id", i3Var4.p());
                                    contentValues5.put("metadata_fingerprint", Long.valueOf(jG5));
                                    contentValues5.put("metadata", bArrA7);
                                    mVarD2.K1().insertWithOnConflict("raw_events_metadata", null, contentValues5, 4);
                                    mVarD3 = y3Var.d0();
                                    r rVar5 = (r) kVar2.f10093g;
                                    Objects.requireNonNull(rVar5);
                                    it2 = rVar5.A.keySet().iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            a1 a1VarC4 = y3Var.c0();
                                            String str315 = (String) kVar2.f10090d;
                                            zL1 = a1VarC4.l1(str315, (String) kVar2.f10091e);
                                            j jVarZ4 = y3Var.d0().Z1(y3Var.b(), str315, false, false, false, false);
                                            if (zL1) {
                                            }
                                            i12 = i10;
                                            break;
                                        }
                                        if ("_r".equals(it2.next())) {
                                        }
                                        i12 = 1;
                                        break;
                                    }
                                    mVarD3.V0();
                                    mVarD3.W0();
                                    str15 = (String) kVar2.f10090d;
                                    com.google.android.gms.common.internal.d0.e(str15);
                                    byte[] bArrA8 = mVarD3.C.h0().x1(kVar2).a();
                                    contentValues = new ContentValues();
                                    contentValues.put("app_id", str15);
                                    contentValues.put("name", (String) kVar2.f10091e);
                                    contentValues.put("timestamp", Long.valueOf(kVar2.f10088b));
                                    contentValues.put("metadata_fingerprint", Long.valueOf(jG5));
                                    contentValues.put("data", bArrA8);
                                    contentValues.put("realtime", Integer.valueOf(i12));
                                    if (mVarD3.K1().insert("raw_events", null, contentValues) == -1) {
                                        ((h1) mVarD3.B).t().Z0().c(q0.d1(str15), "Failed to insert raw event (got -1). appId");
                                    } else {
                                        y3Var.O = 0L;
                                    }
                                    y3Var.d0().I1();
                                    y3Var.d0().J1();
                                    y3Var.K();
                                    y3Var.t().c1().c(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                                    return;
                                }
                                str12 = str12;
                                h1Var2.k().X0();
                                String str316 = Build.MODEL;
                                h3VarU.m();
                                h1Var2.k().X0();
                                String str317 = Build.VERSION.RELEASE;
                                h3VarU.b();
                                ((com.google.android.gms.internal.measurement.i3) h3VarU.B).o0(str317);
                                h3VarU.o((int) h1Var2.k().Z0());
                                h3VarU.n(h1Var2.k().a1());
                                h3VarU.V(g4Var.W);
                                if (h1Var2.a()) {
                                    h3VarU.q();
                                    if (!TextUtils.isEmpty(null)) {
                                        h3VarU.b();
                                        ((com.google.android.gms.internal.measurement.i3) h3VarU.B).R0(null);
                                        throw null;
                                    }
                                }
                                u0VarX1 = d0().X1(str6);
                                if (u0VarX1 == null) {
                                    u0VarX1 = new u0(h1Var2, str6);
                                    y3Var = this;
                                    u0VarX1.F(y3Var.j(t1VarJ2));
                                    u0VarX1.K(g4Var.K);
                                    u0VarX1.H(str12);
                                    if (t1VarJ2.i(s1Var)) {
                                        u0VarX1.I(y3Var.I.a1(str6, z18));
                                    }
                                    u0VarX1.e(0L);
                                    u0VarX1.L(0L);
                                    u0VarX1.M(0L);
                                    u0VarX1.O(str14);
                                    u0VarX1.Q(j10);
                                    u0VarX1.R(str11);
                                    u0VarX1.S(j14);
                                    u0VarX1.a(j16);
                                    u0VarX1.d(z19);
                                    u0VarX1.c(j12);
                                    i10 = 0;
                                    y3Var.d0().Y1(u0VarX1, false);
                                } else {
                                    i10 = 0;
                                    y3Var = this;
                                }
                                if (t1VarJ2.i(s1.ANALYTICS_STORAGE)) {
                                    String strE5 = u0VarX1.E();
                                    com.google.android.gms.common.internal.d0.h(strE5);
                                    h3VarU.y(strE5);
                                }
                                if (!TextUtils.isEmpty(u0VarX1.J())) {
                                    String strJ5 = u0VarX1.J();
                                    com.google.android.gms.common.internal.d0.h(strJ5);
                                    h3VarU.N(strJ5);
                                }
                                listQ1 = y3Var.d0().Q1(str6);
                                i11 = i10;
                                while (i11 < listQ1.size()) {
                                    com.google.android.gms.internal.measurement.q3 q3VarA5 = com.google.android.gms.internal.measurement.r3.A();
                                    String str318 = ((c4) listQ1.get(i11)).f14610c;
                                    q3VarA5.b();
                                    ((com.google.android.gms.internal.measurement.r3) q3VarA5.B).C(str318);
                                    long j24 = ((c4) listQ1.get(i11)).f14611d;
                                    q3VarA5.b();
                                    ((com.google.android.gms.internal.measurement.r3) q3VarA5.B).B(j24);
                                    y3Var.h0().t1(q3VarA5, ((c4) listQ1.get(i11)).f14612e);
                                    h3VarU.c0(q3VarA5);
                                    if ("_sid".equals(((c4) listQ1.get(i11)).f14610c)) {
                                        e1 e1Var14 = u0VarX1.f14703a.G;
                                        h1.g(e1Var14);
                                        e1Var14.V0();
                                        if (u0VarX1.f14723w != 0) {
                                            t0VarH0 = y3Var.h0();
                                            if (TextUtils.isEmpty(str13)) {
                                                str16 = str13;
                                                jG1 = 0;
                                            } else {
                                                str16 = str13;
                                                jG1 = t0VarH0.G1(str16.getBytes(Charset.forName("UTF-8")));
                                            }
                                            e1 e1Var15 = u0VarX1.f14703a.G;
                                            h1.g(e1Var15);
                                            e1Var15.V0();
                                            if (jG1 != u0VarX1.f14723w) {
                                                h3VarU.b();
                                                ((com.google.android.gms.internal.measurement.i3) h3VarU.B).Z0();
                                            }
                                        } else {
                                            str16 = str13;
                                        }
                                    } else {
                                        str16 = str13;
                                    }
                                    i11++;
                                    str13 = str16;
                                }
                                mVarD2 = y3Var.d0();
                                com.google.android.gms.internal.measurement.i3 i3Var5 = (com.google.android.gms.internal.measurement.i3) h3VarU.e();
                                mVarD2.V0();
                                mVarD2.W0();
                                com.google.android.gms.common.internal.d0.e(i3Var5.p());
                                byte[] bArrA9 = i3Var5.a();
                                long jG6 = mVarD2.C.h0().G1(bArrA9);
                                ContentValues contentValues6 = new ContentValues();
                                contentValues6.put("app_id", i3Var5.p());
                                contentValues6.put("metadata_fingerprint", Long.valueOf(jG6));
                                contentValues6.put("metadata", bArrA9);
                                mVarD2.K1().insertWithOnConflict("raw_events_metadata", null, contentValues6, 4);
                                mVarD3 = y3Var.d0();
                                r rVar6 = (r) kVar2.f10093g;
                                Objects.requireNonNull(rVar6);
                                it2 = rVar6.A.keySet().iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        a1 a1VarC5 = y3Var.c0();
                                        String str319 = (String) kVar2.f10090d;
                                        zL1 = a1VarC5.l1(str319, (String) kVar2.f10091e);
                                        j jVarZ5 = y3Var.d0().Z1(y3Var.b(), str319, false, false, false, false);
                                        if (zL1) {
                                        }
                                        i12 = i10;
                                        break;
                                    }
                                    if ("_r".equals(it2.next())) {
                                    }
                                    i12 = 1;
                                    break;
                                }
                                mVarD3.V0();
                                mVarD3.W0();
                                str15 = (String) kVar2.f10090d;
                                com.google.android.gms.common.internal.d0.e(str15);
                                byte[] bArrA10 = mVarD3.C.h0().x1(kVar2).a();
                                contentValues = new ContentValues();
                                contentValues.put("app_id", str15);
                                contentValues.put("name", (String) kVar2.f10091e);
                                contentValues.put("timestamp", Long.valueOf(kVar2.f10088b));
                                contentValues.put("metadata_fingerprint", Long.valueOf(jG6));
                                contentValues.put("data", bArrA10);
                                contentValues.put("realtime", Integer.valueOf(i12));
                                if (mVarD3.K1().insert("raw_events", null, contentValues) == -1) {
                                    ((h1) mVarD3.B).t().Z0().c(q0.d1(str15), "Failed to insert raw event (got -1). appId");
                                } else {
                                    y3Var.O = 0L;
                                }
                                y3Var.d0().I1();
                                y3Var.d0().J1();
                                y3Var.K();
                                y3Var.t().c1().c(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                                return;
                                y3Var.d0().J1();
                                throw th;
                            }
                            if (jIntValue % 1000 == 1) {
                                t().Z0().d("Data loss. Too many events logged. appId, count", q0.d1(str5), Long.valueOf(jVarA2.f14641b));
                            }
                            d0().I1();
                            d0().J1();
                        }
                        mVarD0.K1().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '!_ltv!_%' escape '!'order by set_timestamp desc limit ?,10);", new String[]{str22, str22, String.valueOf(iD1)});
                    } catch (SQLiteException e14) {
                        ((h1) mVarD0.B).t().Z0().d("Error pruning currencies. appId", q0.d1(str22), e14);
                    }
                    mVarD0 = d0();
                    iD1 = b0().d1(str22, b0.T) - 1;
                    com.google.android.gms.common.internal.d0.e(str22);
                    mVarD0.V0();
                    mVarD0.W0();
                    String str41 = sVarE.C;
                    ((ve.b) k0()).getClass();
                    str4 = str22;
                    c4Var = new c4(str4, str41, strConcat, System.currentTimeMillis(), Long.valueOf(jRound));
                    c4Var2 = c4Var;
                    if (!d0().O1(c4Var2)) {
                        t().Z0().e("Too many unique user properties are set. Ignoring user property. appId", q0.d1(str4), h1Var2.h().c(c4Var2.f14610c), c4Var2.f14612e);
                        i0();
                        e4.l1(bVar3, str4, 9, null, null, 0);
                        bVar = bVar3;
                    }
                    zT1 = e4.T1(str26);
                    zEquals = "_err".equals(str26);
                    i0();
                    if (rVar == null) {
                        length = 0;
                    } else {
                        it = rVar.A.keySet().iterator();
                        length = 0;
                        while (it.hasNext()) {
                            objA = rVar.a(it.next());
                            if (objA instanceof Parcelable[]) {
                                length += (long) ((Parcelable[]) objA).length;
                            }
                        }
                    }
                    str5 = str4;
                    jVarA2 = d0().a2(b(), str5, length + 1, true, zT1, false, zEquals, false, false, false);
                    long j112 = jVarA2.f14641b;
                    b0();
                    jIntValue = j112 - ((long) ((Integer) b0.l.a(null)).intValue());
                    if (jIntValue <= 0) {
                        if (zT1) {
                            long j113 = jVarA2.f14640a;
                            b0();
                            jIntValue2 = j113 - ((long) ((Integer) b0.f14580n.a(null)).intValue());
                            if (jIntValue2 > 0) {
                                if (jIntValue2 % 1000 == 1) {
                                    t().Z0().d("Data loss. Too many public events logged. appId, count", q0.d1(str5), Long.valueOf(jVarA2.f14640a));
                                }
                                i0();
                                e4.l1(bVar, str5, 16, "_ev", sVarE.A, 0);
                                d0().I1();
                            }
                        }
                        str6 = str5;
                        if (zEquals) {
                            jMax = jVarA2.f14643d - ((long) Math.max(0, Math.min(1000000, b0().d1(str6, b0.m))));
                            if (jMax > 0) {
                                if (jMax == 1) {
                                    t().Z0().d("Too many error events logged. appId, count", q0.d1(str6), Long.valueOf(jVarA2.f14643d));
                                }
                                d0().I1();
                            }
                        }
                        bundleE = rVar.e();
                        e4 e4VarI3 = i0();
                        String str213 = sVarE.C;
                        e4VarI3.k1(bundleE, "_o", str213);
                        if (i0().v1(str6, g4Var.f14620b0)) {
                            i0().k1(bundleE, "_dbg", 1L);
                            i0().k1(bundleE, "_r", 1L);
                        }
                        if ("_s".equals(str26)) {
                            obj2 = c4VarP1.f14612e;
                            if (obj2 instanceof Long) {
                                i0().k1(bundleE, "_sno", obj2);
                            }
                        }
                        if (b0().f1(null, b0.X0)) {
                            obj = bundleE.get("value");
                            if (obj instanceof String) {
                                double d10 = Double.parseDouble((String) obj);
                                bundleE.remove("value");
                                bundleE.putDouble("value", d10);
                            }
                        }
                        mVarD1 = d0();
                        com.google.android.gms.common.internal.d0.e(str6);
                        mVarD1.V0();
                        mVarD1.W0();
                        jDelete = mVarD1.K1().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str6, String.valueOf(Math.max(0, Math.min(1000000, ((h1) mVarD1.B).D.d1(str6, b0.f14586q))))});
                        if (jDelete > 0) {
                            t().a1().d("Data lost. Too many events stored on disk, deleted. appId", q0.d1(str6), Long.valueOf(jDelete));
                        }
                        h1Var = this.L;
                        kVar = new l7.k(h1Var, sVarE.C, str6, sVarE.A, sVarE.D, 0L, bundleE);
                        m mVarD6 = d0();
                        str7 = (String) kVar.f10091e;
                        String str214 = str17;
                        qVarT1 = mVarD6.t1(str214, str6, str7);
                        if (qVarT1 == null) {
                            jL1 = d0().l1(str6);
                            gVarB0 = b0();
                            gVarB0.getClass();
                            a0Var = b0.W;
                            bVar2 = bVar;
                            if (jL1 >= Math.max(Math.min(gVarB0.d1(str6, a0Var), CastStatusCodes.AUTHENTICATION_FAILED), MediaError.DetailedErrorCode.SEGMENT_UNKNOWN)) {
                            }
                            bVar = bVar2;
                            qVarA = new q(str6, str7, 0L, 0L, 0L, kVar.f10088b, 0L, null, null, null, null);
                            str6 = str6;
                        } else {
                            kVar = kVar.g(h1Var, qVarT1.f14688f);
                            qVarA = qVarT1.a(kVar.f10088b);
                        }
                        kVar2 = kVar;
                        d0().u1(str214, qVarA);
                        C().V0();
                        j0();
                        String str215 = (String) kVar2.f10090d;
                        com.google.android.gms.common.internal.d0.e(str215);
                        com.google.android.gms.common.internal.d0.b(str215.equals(str6));
                        h3VarU = com.google.android.gms.internal.measurement.i3.U();
                        h3VarU.B();
                        h3VarU.k();
                        if (!TextUtils.isEmpty(str6)) {
                            h3VarU.s(str6);
                        }
                        if (TextUtils.isEmpty(str3)) {
                            str8 = str3;
                            h3VarU.p(str8);
                        } else {
                            str8 = str3;
                        }
                        if (TextUtils.isEmpty(str2)) {
                            str9 = str2;
                            h3VarU.t(str9);
                        } else {
                            str9 = str2;
                        }
                        if (TextUtils.isEmpty(str)) {
                            str10 = str;
                            h3VarU.U(str10);
                        } else {
                            str10 = str;
                        }
                        if (j15 != -2147483648L) {
                            j9 = j15;
                            h3VarU.O((int) j9);
                        } else {
                            j9 = j15;
                        }
                        str11 = str8;
                        h3VarU.u(j14);
                        if (TextUtils.isEmpty(str23)) {
                            str12 = str23;
                            h3VarU.K(str12);
                        } else {
                            str12 = str23;
                        }
                        com.google.android.gms.common.internal.d0.h(str6);
                        str13 = str10;
                        t1VarJ = a(str6).j(t1.c(100, str18));
                        h3VarU.T(t1VarJ.f());
                        m8.a();
                        zF1 = b0().f1(str6, b0.P0);
                        s1Var = s1.AD_STORAGE;
                        if (zF1) {
                            i0();
                            if (e4.r1(str6)) {
                                h3VarU.C(g4Var.Z);
                                j10 = j9;
                                j11 = g4Var.f14619a0;
                                if (!t1VarJ.i(s1Var)) {
                                    j11 = (j11 & (-2)) | 32;
                                }
                                if (j11 == 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                h3VarU.W(z10);
                                if (j11 != 0) {
                                    com.google.android.gms.internal.measurement.p2 p2VarW3 = com.google.android.gms.internal.measurement.q2.w();
                                    if ((j11 & 1) != 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    p2VarW3.h(z11);
                                    if ((j11 & 2) != 0) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    p2VarW3.j(z12);
                                    if ((j11 & 4) != 0) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    p2VarW3.k(z13);
                                    if ((j11 & 8) != 0) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    p2VarW3.m(z14);
                                    if ((j11 & 16) != 0) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    p2VarW3.n(z15);
                                    if ((j11 & 32) != 0) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    p2VarW3.o(z16);
                                    if ((j11 & 64) != 0) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    p2VarW3.p(z17);
                                    h3VarU.D((com.google.android.gms.internal.measurement.q2) p2VarW3.e());
                                }
                            } else {
                                j10 = j9;
                            }
                        } else {
                            j10 = j9;
                        }
                        if (j16 != 0) {
                            h3VarU.z(j16);
                            j16 = j16;
                        }
                        h3VarU.R(j12);
                        t0 t0VarH3 = h0();
                        c4VarA = com.google.android.gms.internal.measurement.c4.a(t0VarH3.C.L.e0().getContentResolver(), j4.a(), com.google.android.gms.common.api.internal.m0.C);
                        if (c4VarA == null) {
                            mapB = Collections.EMPTY_MAP;
                        } else {
                            mapB = c4VarA.b();
                        }
                        if (mapB == null) {
                            str14 = str9;
                            arrayList = null;
                        } else {
                            str14 = str9;
                            arrayList = null;
                        }
                        if (arrayList != null) {
                            h3VarU.Q(arrayList);
                        }
                        if (b0().f1(null, b0.f14547a1)) {
                            h3VarU.G();
                        }
                        t1VarJ2 = a(str6).j(t1.c(100, str18));
                        if (t1VarJ2.i(s1Var)) {
                            str12 = str12;
                            h1Var2.k().X0();
                            String str3110 = Build.MODEL;
                            h3VarU.m();
                            h1Var2.k().X0();
                            String str3111 = Build.VERSION.RELEASE;
                            h3VarU.b();
                            ((com.google.android.gms.internal.measurement.i3) h3VarU.B).o0(str3111);
                            h3VarU.o((int) h1Var2.k().Z0());
                            h3VarU.n(h1Var2.k().a1());
                            h3VarU.V(g4Var.W);
                            if (h1Var2.a()) {
                                h3VarU.q();
                                if (!TextUtils.isEmpty(null)) {
                                    h3VarU.b();
                                    ((com.google.android.gms.internal.measurement.i3) h3VarU.B).R0(null);
                                    throw null;
                                }
                            }
                            u0VarX1 = d0().X1(str6);
                            if (u0VarX1 == null) {
                                u0VarX1 = new u0(h1Var2, str6);
                                y3Var = this;
                                u0VarX1.F(y3Var.j(t1VarJ2));
                                u0VarX1.K(g4Var.K);
                                u0VarX1.H(str12);
                                if (t1VarJ2.i(s1Var)) {
                                    u0VarX1.I(y3Var.I.a1(str6, z18));
                                }
                                u0VarX1.e(0L);
                                u0VarX1.L(0L);
                                u0VarX1.M(0L);
                                u0VarX1.O(str14);
                                u0VarX1.Q(j10);
                                u0VarX1.R(str11);
                                u0VarX1.S(j14);
                                u0VarX1.a(j16);
                                u0VarX1.d(z19);
                                u0VarX1.c(j12);
                                i10 = 0;
                                y3Var.d0().Y1(u0VarX1, false);
                            } else {
                                i10 = 0;
                                y3Var = this;
                            }
                            if (t1VarJ2.i(s1.ANALYTICS_STORAGE)) {
                                String strE6 = u0VarX1.E();
                                com.google.android.gms.common.internal.d0.h(strE6);
                                h3VarU.y(strE6);
                            }
                            if (!TextUtils.isEmpty(u0VarX1.J())) {
                                String strJ6 = u0VarX1.J();
                                com.google.android.gms.common.internal.d0.h(strJ6);
                                h3VarU.N(strJ6);
                            }
                            listQ1 = y3Var.d0().Q1(str6);
                            i11 = i10;
                            while (i11 < listQ1.size()) {
                                com.google.android.gms.internal.measurement.q3 q3VarA6 = com.google.android.gms.internal.measurement.r3.A();
                                String str3112 = ((c4) listQ1.get(i11)).f14610c;
                                q3VarA6.b();
                                ((com.google.android.gms.internal.measurement.r3) q3VarA6.B).C(str3112);
                                long j25 = ((c4) listQ1.get(i11)).f14611d;
                                q3VarA6.b();
                                ((com.google.android.gms.internal.measurement.r3) q3VarA6.B).B(j25);
                                y3Var.h0().t1(q3VarA6, ((c4) listQ1.get(i11)).f14612e);
                                h3VarU.c0(q3VarA6);
                                if ("_sid".equals(((c4) listQ1.get(i11)).f14610c)) {
                                    e1 e1Var16 = u0VarX1.f14703a.G;
                                    h1.g(e1Var16);
                                    e1Var16.V0();
                                    if (u0VarX1.f14723w != 0) {
                                        t0VarH0 = y3Var.h0();
                                        if (TextUtils.isEmpty(str13)) {
                                            str16 = str13;
                                            jG1 = 0;
                                        } else {
                                            str16 = str13;
                                            jG1 = t0VarH0.G1(str16.getBytes(Charset.forName("UTF-8")));
                                        }
                                        e1 e1Var17 = u0VarX1.f14703a.G;
                                        h1.g(e1Var17);
                                        e1Var17.V0();
                                        if (jG1 != u0VarX1.f14723w) {
                                            h3VarU.b();
                                            ((com.google.android.gms.internal.measurement.i3) h3VarU.B).Z0();
                                        }
                                    } else {
                                        str16 = str13;
                                    }
                                } else {
                                    str16 = str13;
                                }
                                i11++;
                                str13 = str16;
                            }
                            mVarD2 = y3Var.d0();
                            com.google.android.gms.internal.measurement.i3 i3Var6 = (com.google.android.gms.internal.measurement.i3) h3VarU.e();
                            mVarD2.V0();
                            mVarD2.W0();
                            com.google.android.gms.common.internal.d0.e(i3Var6.p());
                            byte[] bArrA11 = i3Var6.a();
                            long jG7 = mVarD2.C.h0().G1(bArrA11);
                            ContentValues contentValues7 = new ContentValues();
                            contentValues7.put("app_id", i3Var6.p());
                            contentValues7.put("metadata_fingerprint", Long.valueOf(jG7));
                            contentValues7.put("metadata", bArrA11);
                            mVarD2.K1().insertWithOnConflict("raw_events_metadata", null, contentValues7, 4);
                            mVarD3 = y3Var.d0();
                            r rVar7 = (r) kVar2.f10093g;
                            Objects.requireNonNull(rVar7);
                            it2 = rVar7.A.keySet().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    a1 a1VarC6 = y3Var.c0();
                                    String str3113 = (String) kVar2.f10090d;
                                    zL1 = a1VarC6.l1(str3113, (String) kVar2.f10091e);
                                    j jVarZ6 = y3Var.d0().Z1(y3Var.b(), str3113, false, false, false, false);
                                    if (zL1) {
                                    }
                                    i12 = i10;
                                    break;
                                }
                                if ("_r".equals(it2.next())) {
                                }
                                i12 = 1;
                                break;
                            }
                            mVarD3.V0();
                            mVarD3.W0();
                            str15 = (String) kVar2.f10090d;
                            com.google.android.gms.common.internal.d0.e(str15);
                            byte[] bArrA12 = mVarD3.C.h0().x1(kVar2).a();
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str15);
                            contentValues.put("name", (String) kVar2.f10091e);
                            contentValues.put("timestamp", Long.valueOf(kVar2.f10088b));
                            contentValues.put("metadata_fingerprint", Long.valueOf(jG7));
                            contentValues.put("data", bArrA12);
                            contentValues.put("realtime", Integer.valueOf(i12));
                            if (mVarD3.K1().insert("raw_events", null, contentValues) == -1) {
                                ((h1) mVarD3.B).t().Z0().c(q0.d1(str15), "Failed to insert raw event (got -1). appId");
                            } else {
                                y3Var.O = 0L;
                            }
                            y3Var.d0().I1();
                            y3Var.d0().J1();
                            y3Var.K();
                            y3Var.t().c1().c(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                            return;
                        }
                        str12 = str12;
                        h1Var2.k().X0();
                        String str3114 = Build.MODEL;
                        h3VarU.m();
                        h1Var2.k().X0();
                        String str3115 = Build.VERSION.RELEASE;
                        h3VarU.b();
                        ((com.google.android.gms.internal.measurement.i3) h3VarU.B).o0(str3115);
                        h3VarU.o((int) h1Var2.k().Z0());
                        h3VarU.n(h1Var2.k().a1());
                        h3VarU.V(g4Var.W);
                        if (h1Var2.a()) {
                            h3VarU.q();
                            if (!TextUtils.isEmpty(null)) {
                                h3VarU.b();
                                ((com.google.android.gms.internal.measurement.i3) h3VarU.B).R0(null);
                                throw null;
                            }
                        }
                        u0VarX1 = d0().X1(str6);
                        if (u0VarX1 == null) {
                            u0VarX1 = new u0(h1Var2, str6);
                            y3Var = this;
                            u0VarX1.F(y3Var.j(t1VarJ2));
                            u0VarX1.K(g4Var.K);
                            u0VarX1.H(str12);
                            if (t1VarJ2.i(s1Var)) {
                                u0VarX1.I(y3Var.I.a1(str6, z18));
                            }
                            u0VarX1.e(0L);
                            u0VarX1.L(0L);
                            u0VarX1.M(0L);
                            u0VarX1.O(str14);
                            u0VarX1.Q(j10);
                            u0VarX1.R(str11);
                            u0VarX1.S(j14);
                            u0VarX1.a(j16);
                            u0VarX1.d(z19);
                            u0VarX1.c(j12);
                            i10 = 0;
                            y3Var.d0().Y1(u0VarX1, false);
                        } else {
                            i10 = 0;
                            y3Var = this;
                        }
                        if (t1VarJ2.i(s1.ANALYTICS_STORAGE)) {
                            String strE7 = u0VarX1.E();
                            com.google.android.gms.common.internal.d0.h(strE7);
                            h3VarU.y(strE7);
                        }
                        if (!TextUtils.isEmpty(u0VarX1.J())) {
                            String strJ7 = u0VarX1.J();
                            com.google.android.gms.common.internal.d0.h(strJ7);
                            h3VarU.N(strJ7);
                        }
                        listQ1 = y3Var.d0().Q1(str6);
                        i11 = i10;
                        while (i11 < listQ1.size()) {
                            com.google.android.gms.internal.measurement.q3 q3VarA7 = com.google.android.gms.internal.measurement.r3.A();
                            String str3116 = ((c4) listQ1.get(i11)).f14610c;
                            q3VarA7.b();
                            ((com.google.android.gms.internal.measurement.r3) q3VarA7.B).C(str3116);
                            long j26 = ((c4) listQ1.get(i11)).f14611d;
                            q3VarA7.b();
                            ((com.google.android.gms.internal.measurement.r3) q3VarA7.B).B(j26);
                            y3Var.h0().t1(q3VarA7, ((c4) listQ1.get(i11)).f14612e);
                            h3VarU.c0(q3VarA7);
                            if ("_sid".equals(((c4) listQ1.get(i11)).f14610c)) {
                                e1 e1Var18 = u0VarX1.f14703a.G;
                                h1.g(e1Var18);
                                e1Var18.V0();
                                if (u0VarX1.f14723w != 0) {
                                    t0VarH0 = y3Var.h0();
                                    if (TextUtils.isEmpty(str13)) {
                                        str16 = str13;
                                        jG1 = 0;
                                    } else {
                                        str16 = str13;
                                        jG1 = t0VarH0.G1(str16.getBytes(Charset.forName("UTF-8")));
                                    }
                                    e1 e1Var19 = u0VarX1.f14703a.G;
                                    h1.g(e1Var19);
                                    e1Var19.V0();
                                    if (jG1 != u0VarX1.f14723w) {
                                        h3VarU.b();
                                        ((com.google.android.gms.internal.measurement.i3) h3VarU.B).Z0();
                                    }
                                } else {
                                    str16 = str13;
                                }
                            } else {
                                str16 = str13;
                            }
                            i11++;
                            str13 = str16;
                        }
                        mVarD2 = y3Var.d0();
                        com.google.android.gms.internal.measurement.i3 i3Var7 = (com.google.android.gms.internal.measurement.i3) h3VarU.e();
                        mVarD2.V0();
                        mVarD2.W0();
                        com.google.android.gms.common.internal.d0.e(i3Var7.p());
                        byte[] bArrA13 = i3Var7.a();
                        long jG8 = mVarD2.C.h0().G1(bArrA13);
                        ContentValues contentValues8 = new ContentValues();
                        contentValues8.put("app_id", i3Var7.p());
                        contentValues8.put("metadata_fingerprint", Long.valueOf(jG8));
                        contentValues8.put("metadata", bArrA13);
                        mVarD2.K1().insertWithOnConflict("raw_events_metadata", null, contentValues8, 4);
                        mVarD3 = y3Var.d0();
                        r rVar8 = (r) kVar2.f10093g;
                        Objects.requireNonNull(rVar8);
                        it2 = rVar8.A.keySet().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                a1 a1VarC7 = y3Var.c0();
                                String str3117 = (String) kVar2.f10090d;
                                zL1 = a1VarC7.l1(str3117, (String) kVar2.f10091e);
                                j jVarZ7 = y3Var.d0().Z1(y3Var.b(), str3117, false, false, false, false);
                                if (zL1) {
                                }
                                i12 = i10;
                                break;
                            }
                            if ("_r".equals(it2.next())) {
                            }
                            i12 = 1;
                            break;
                        }
                        mVarD3.V0();
                        mVarD3.W0();
                        str15 = (String) kVar2.f10090d;
                        com.google.android.gms.common.internal.d0.e(str15);
                        byte[] bArrA14 = mVarD3.C.h0().x1(kVar2).a();
                        contentValues = new ContentValues();
                        contentValues.put("app_id", str15);
                        contentValues.put("name", (String) kVar2.f10091e);
                        contentValues.put("timestamp", Long.valueOf(kVar2.f10088b));
                        contentValues.put("metadata_fingerprint", Long.valueOf(jG8));
                        contentValues.put("data", bArrA14);
                        contentValues.put("realtime", Integer.valueOf(i12));
                        if (mVarD3.K1().insert("raw_events", null, contentValues) == -1) {
                            ((h1) mVarD3.B).t().Z0().c(q0.d1(str15), "Failed to insert raw event (got -1). appId");
                        } else {
                            y3Var.O = 0L;
                        }
                        y3Var.d0().I1();
                        y3Var.d0().J1();
                        y3Var.K();
                        y3Var.t().c1().c(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                        return;
                        y3Var.d0().J1();
                        throw th;
                    }
                    if (jIntValue % 1000 == 1) {
                        t().Z0().d("Data loss. Too many events logged. appId, count", q0.d1(str5), Long.valueOf(jVarA2.f14641b));
                    }
                    d0().I1();
                    d0().J1();
                }
                bVar = bVar3;
                zT1 = e4.T1(str26);
                zEquals = "_err".equals(str26);
                i0();
                if (rVar == null) {
                    length = 0;
                } else {
                    it = rVar.A.keySet().iterator();
                    length = 0;
                    while (it.hasNext()) {
                        objA = rVar.a(it.next());
                        if (objA instanceof Parcelable[]) {
                            length += (long) ((Parcelable[]) objA).length;
                        }
                    }
                }
                str5 = str4;
                jVarA2 = d0().a2(b(), str5, length + 1, true, zT1, false, zEquals, false, false, false);
                long j114 = jVarA2.f14641b;
                b0();
                jIntValue = j114 - ((long) ((Integer) b0.l.a(null)).intValue());
                if (jIntValue <= 0) {
                    if (zT1) {
                        long j115 = jVarA2.f14640a;
                        b0();
                        jIntValue2 = j115 - ((long) ((Integer) b0.f14580n.a(null)).intValue());
                        if (jIntValue2 > 0) {
                            if (jIntValue2 % 1000 == 1) {
                                t().Z0().d("Data loss. Too many public events logged. appId, count", q0.d1(str5), Long.valueOf(jVarA2.f14640a));
                            }
                            i0();
                            e4.l1(bVar, str5, 16, "_ev", sVarE.A, 0);
                            d0().I1();
                        }
                    }
                    str6 = str5;
                    if (zEquals) {
                        jMax = jVarA2.f14643d - ((long) Math.max(0, Math.min(1000000, b0().d1(str6, b0.m))));
                        if (jMax > 0) {
                            if (jMax == 1) {
                                t().Z0().d("Too many error events logged. appId, count", q0.d1(str6), Long.valueOf(jVarA2.f14643d));
                            }
                            d0().I1();
                        }
                    }
                    bundleE = rVar.e();
                    e4 e4VarI4 = i0();
                    String str216 = sVarE.C;
                    e4VarI4.k1(bundleE, "_o", str216);
                    if (i0().v1(str6, g4Var.f14620b0)) {
                        i0().k1(bundleE, "_dbg", 1L);
                        i0().k1(bundleE, "_r", 1L);
                    }
                    if ("_s".equals(str26)) {
                        obj2 = c4VarP1.f14612e;
                        if (obj2 instanceof Long) {
                            i0().k1(bundleE, "_sno", obj2);
                        }
                    }
                    if (b0().f1(null, b0.X0)) {
                        obj = bundleE.get("value");
                        if (obj instanceof String) {
                            double d11 = Double.parseDouble((String) obj);
                            bundleE.remove("value");
                            bundleE.putDouble("value", d11);
                        }
                    }
                    mVarD1 = d0();
                    com.google.android.gms.common.internal.d0.e(str6);
                    mVarD1.V0();
                    mVarD1.W0();
                    jDelete = mVarD1.K1().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str6, String.valueOf(Math.max(0, Math.min(1000000, ((h1) mVarD1.B).D.d1(str6, b0.f14586q))))});
                    if (jDelete > 0) {
                        t().a1().d("Data lost. Too many events stored on disk, deleted. appId", q0.d1(str6), Long.valueOf(jDelete));
                    }
                    h1Var = this.L;
                    kVar = new l7.k(h1Var, sVarE.C, str6, sVarE.A, sVarE.D, 0L, bundleE);
                    m mVarD7 = d0();
                    str7 = (String) kVar.f10091e;
                    String str217 = str17;
                    qVarT1 = mVarD7.t1(str217, str6, str7);
                    if (qVarT1 == null) {
                        jL1 = d0().l1(str6);
                        gVarB0 = b0();
                        gVarB0.getClass();
                        a0Var = b0.W;
                        bVar2 = bVar;
                        if (jL1 >= Math.max(Math.min(gVarB0.d1(str6, a0Var), CastStatusCodes.AUTHENTICATION_FAILED), MediaError.DetailedErrorCode.SEGMENT_UNKNOWN)) {
                        }
                        bVar = bVar2;
                        qVarA = new q(str6, str7, 0L, 0L, 0L, kVar.f10088b, 0L, null, null, null, null);
                        str6 = str6;
                    } else {
                        kVar = kVar.g(h1Var, qVarT1.f14688f);
                        qVarA = qVarT1.a(kVar.f10088b);
                    }
                    kVar2 = kVar;
                    d0().u1(str217, qVarA);
                    C().V0();
                    j0();
                    String str218 = (String) kVar2.f10090d;
                    com.google.android.gms.common.internal.d0.e(str218);
                    com.google.android.gms.common.internal.d0.b(str218.equals(str6));
                    h3VarU = com.google.android.gms.internal.measurement.i3.U();
                    h3VarU.B();
                    h3VarU.k();
                    if (!TextUtils.isEmpty(str6)) {
                        h3VarU.s(str6);
                    }
                    if (TextUtils.isEmpty(str3)) {
                        str8 = str3;
                        h3VarU.p(str8);
                    } else {
                        str8 = str3;
                    }
                    if (TextUtils.isEmpty(str2)) {
                        str9 = str2;
                        h3VarU.t(str9);
                    } else {
                        str9 = str2;
                    }
                    if (TextUtils.isEmpty(str)) {
                        str10 = str;
                        h3VarU.U(str10);
                    } else {
                        str10 = str;
                    }
                    if (j15 != -2147483648L) {
                        j9 = j15;
                        h3VarU.O((int) j9);
                    } else {
                        j9 = j15;
                    }
                    str11 = str8;
                    h3VarU.u(j14);
                    if (TextUtils.isEmpty(str23)) {
                        str12 = str23;
                        h3VarU.K(str12);
                    } else {
                        str12 = str23;
                    }
                    com.google.android.gms.common.internal.d0.h(str6);
                    str13 = str10;
                    t1VarJ = a(str6).j(t1.c(100, str18));
                    h3VarU.T(t1VarJ.f());
                    m8.a();
                    zF1 = b0().f1(str6, b0.P0);
                    s1Var = s1.AD_STORAGE;
                    if (zF1) {
                        i0();
                        if (e4.r1(str6)) {
                            h3VarU.C(g4Var.Z);
                            j10 = j9;
                            j11 = g4Var.f14619a0;
                            if (!t1VarJ.i(s1Var)) {
                                j11 = (j11 & (-2)) | 32;
                            }
                            if (j11 == 1) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            h3VarU.W(z10);
                            if (j11 != 0) {
                                com.google.android.gms.internal.measurement.p2 p2VarW4 = com.google.android.gms.internal.measurement.q2.w();
                                if ((j11 & 1) != 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                p2VarW4.h(z11);
                                if ((j11 & 2) != 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                p2VarW4.j(z12);
                                if ((j11 & 4) != 0) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                p2VarW4.k(z13);
                                if ((j11 & 8) != 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                p2VarW4.m(z14);
                                if ((j11 & 16) != 0) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                p2VarW4.n(z15);
                                if ((j11 & 32) != 0) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                p2VarW4.o(z16);
                                if ((j11 & 64) != 0) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                p2VarW4.p(z17);
                                h3VarU.D((com.google.android.gms.internal.measurement.q2) p2VarW4.e());
                            }
                        } else {
                            j10 = j9;
                        }
                    } else {
                        j10 = j9;
                    }
                    if (j16 != 0) {
                        h3VarU.z(j16);
                        j16 = j16;
                    }
                    h3VarU.R(j12);
                    t0 t0VarH4 = h0();
                    c4VarA = com.google.android.gms.internal.measurement.c4.a(t0VarH4.C.L.e0().getContentResolver(), j4.a(), com.google.android.gms.common.api.internal.m0.C);
                    if (c4VarA == null) {
                        mapB = Collections.EMPTY_MAP;
                    } else {
                        mapB = c4VarA.b();
                    }
                    if (mapB == null) {
                        str14 = str9;
                        arrayList = null;
                    } else {
                        str14 = str9;
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        h3VarU.Q(arrayList);
                    }
                    if (b0().f1(null, b0.f14547a1)) {
                        h3VarU.G();
                    }
                    t1VarJ2 = a(str6).j(t1.c(100, str18));
                    if (t1VarJ2.i(s1Var)) {
                        str12 = str12;
                        h1Var2.k().X0();
                        String str3118 = Build.MODEL;
                        h3VarU.m();
                        h1Var2.k().X0();
                        String str3119 = Build.VERSION.RELEASE;
                        h3VarU.b();
                        ((com.google.android.gms.internal.measurement.i3) h3VarU.B).o0(str3119);
                        h3VarU.o((int) h1Var2.k().Z0());
                        h3VarU.n(h1Var2.k().a1());
                        h3VarU.V(g4Var.W);
                        if (h1Var2.a()) {
                            h3VarU.q();
                            if (!TextUtils.isEmpty(null)) {
                                h3VarU.b();
                                ((com.google.android.gms.internal.measurement.i3) h3VarU.B).R0(null);
                                throw null;
                            }
                        }
                        u0VarX1 = d0().X1(str6);
                        if (u0VarX1 == null) {
                            u0VarX1 = new u0(h1Var2, str6);
                            y3Var = this;
                            u0VarX1.F(y3Var.j(t1VarJ2));
                            u0VarX1.K(g4Var.K);
                            u0VarX1.H(str12);
                            if (t1VarJ2.i(s1Var)) {
                                u0VarX1.I(y3Var.I.a1(str6, z18));
                            }
                            u0VarX1.e(0L);
                            u0VarX1.L(0L);
                            u0VarX1.M(0L);
                            u0VarX1.O(str14);
                            u0VarX1.Q(j10);
                            u0VarX1.R(str11);
                            u0VarX1.S(j14);
                            u0VarX1.a(j16);
                            u0VarX1.d(z19);
                            u0VarX1.c(j12);
                            i10 = 0;
                            y3Var.d0().Y1(u0VarX1, false);
                        } else {
                            i10 = 0;
                            y3Var = this;
                        }
                        if (t1VarJ2.i(s1.ANALYTICS_STORAGE)) {
                            String strE8 = u0VarX1.E();
                            com.google.android.gms.common.internal.d0.h(strE8);
                            h3VarU.y(strE8);
                        }
                        if (!TextUtils.isEmpty(u0VarX1.J())) {
                            String strJ8 = u0VarX1.J();
                            com.google.android.gms.common.internal.d0.h(strJ8);
                            h3VarU.N(strJ8);
                        }
                        listQ1 = y3Var.d0().Q1(str6);
                        i11 = i10;
                        while (i11 < listQ1.size()) {
                            com.google.android.gms.internal.measurement.q3 q3VarA8 = com.google.android.gms.internal.measurement.r3.A();
                            String str31110 = ((c4) listQ1.get(i11)).f14610c;
                            q3VarA8.b();
                            ((com.google.android.gms.internal.measurement.r3) q3VarA8.B).C(str31110);
                            long j27 = ((c4) listQ1.get(i11)).f14611d;
                            q3VarA8.b();
                            ((com.google.android.gms.internal.measurement.r3) q3VarA8.B).B(j27);
                            y3Var.h0().t1(q3VarA8, ((c4) listQ1.get(i11)).f14612e);
                            h3VarU.c0(q3VarA8);
                            if ("_sid".equals(((c4) listQ1.get(i11)).f14610c)) {
                                e1 e1Var110 = u0VarX1.f14703a.G;
                                h1.g(e1Var110);
                                e1Var110.V0();
                                if (u0VarX1.f14723w != 0) {
                                    t0VarH0 = y3Var.h0();
                                    if (TextUtils.isEmpty(str13)) {
                                        str16 = str13;
                                        jG1 = 0;
                                    } else {
                                        str16 = str13;
                                        jG1 = t0VarH0.G1(str16.getBytes(Charset.forName("UTF-8")));
                                    }
                                    e1 e1Var111 = u0VarX1.f14703a.G;
                                    h1.g(e1Var111);
                                    e1Var111.V0();
                                    if (jG1 != u0VarX1.f14723w) {
                                        h3VarU.b();
                                        ((com.google.android.gms.internal.measurement.i3) h3VarU.B).Z0();
                                    }
                                } else {
                                    str16 = str13;
                                }
                            } else {
                                str16 = str13;
                            }
                            i11++;
                            str13 = str16;
                        }
                        mVarD2 = y3Var.d0();
                        com.google.android.gms.internal.measurement.i3 i3Var8 = (com.google.android.gms.internal.measurement.i3) h3VarU.e();
                        mVarD2.V0();
                        mVarD2.W0();
                        com.google.android.gms.common.internal.d0.e(i3Var8.p());
                        byte[] bArrA15 = i3Var8.a();
                        long jG9 = mVarD2.C.h0().G1(bArrA15);
                        ContentValues contentValues9 = new ContentValues();
                        contentValues9.put("app_id", i3Var8.p());
                        contentValues9.put("metadata_fingerprint", Long.valueOf(jG9));
                        contentValues9.put("metadata", bArrA15);
                        mVarD2.K1().insertWithOnConflict("raw_events_metadata", null, contentValues9, 4);
                        mVarD3 = y3Var.d0();
                        r rVar9 = (r) kVar2.f10093g;
                        Objects.requireNonNull(rVar9);
                        it2 = rVar9.A.keySet().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                a1 a1VarC8 = y3Var.c0();
                                String str31111 = (String) kVar2.f10090d;
                                zL1 = a1VarC8.l1(str31111, (String) kVar2.f10091e);
                                j jVarZ8 = y3Var.d0().Z1(y3Var.b(), str31111, false, false, false, false);
                                if (zL1) {
                                }
                                i12 = i10;
                                break;
                            }
                            if ("_r".equals(it2.next())) {
                            }
                            i12 = 1;
                            break;
                        }
                        mVarD3.V0();
                        mVarD3.W0();
                        str15 = (String) kVar2.f10090d;
                        com.google.android.gms.common.internal.d0.e(str15);
                        byte[] bArrA16 = mVarD3.C.h0().x1(kVar2).a();
                        contentValues = new ContentValues();
                        contentValues.put("app_id", str15);
                        contentValues.put("name", (String) kVar2.f10091e);
                        contentValues.put("timestamp", Long.valueOf(kVar2.f10088b));
                        contentValues.put("metadata_fingerprint", Long.valueOf(jG9));
                        contentValues.put("data", bArrA16);
                        contentValues.put("realtime", Integer.valueOf(i12));
                        if (mVarD3.K1().insert("raw_events", null, contentValues) == -1) {
                            ((h1) mVarD3.B).t().Z0().c(q0.d1(str15), "Failed to insert raw event (got -1). appId");
                        } else {
                            y3Var.O = 0L;
                        }
                        y3Var.d0().I1();
                        y3Var.d0().J1();
                        y3Var.K();
                        y3Var.t().c1().c(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                        return;
                    }
                    str12 = str12;
                    h1Var2.k().X0();
                    String str31112 = Build.MODEL;
                    h3VarU.m();
                    h1Var2.k().X0();
                    String str31113 = Build.VERSION.RELEASE;
                    h3VarU.b();
                    ((com.google.android.gms.internal.measurement.i3) h3VarU.B).o0(str31113);
                    h3VarU.o((int) h1Var2.k().Z0());
                    h3VarU.n(h1Var2.k().a1());
                    h3VarU.V(g4Var.W);
                    if (h1Var2.a()) {
                        h3VarU.q();
                        if (!TextUtils.isEmpty(null)) {
                            h3VarU.b();
                            ((com.google.android.gms.internal.measurement.i3) h3VarU.B).R0(null);
                            throw null;
                        }
                    }
                    u0VarX1 = d0().X1(str6);
                    if (u0VarX1 == null) {
                        u0VarX1 = new u0(h1Var2, str6);
                        y3Var = this;
                        u0VarX1.F(y3Var.j(t1VarJ2));
                        u0VarX1.K(g4Var.K);
                        u0VarX1.H(str12);
                        if (t1VarJ2.i(s1Var)) {
                            u0VarX1.I(y3Var.I.a1(str6, z18));
                        }
                        u0VarX1.e(0L);
                        u0VarX1.L(0L);
                        u0VarX1.M(0L);
                        u0VarX1.O(str14);
                        u0VarX1.Q(j10);
                        u0VarX1.R(str11);
                        u0VarX1.S(j14);
                        u0VarX1.a(j16);
                        u0VarX1.d(z19);
                        u0VarX1.c(j12);
                        i10 = 0;
                        y3Var.d0().Y1(u0VarX1, false);
                    } else {
                        i10 = 0;
                        y3Var = this;
                    }
                    if (t1VarJ2.i(s1.ANALYTICS_STORAGE)) {
                        String strE9 = u0VarX1.E();
                        com.google.android.gms.common.internal.d0.h(strE9);
                        h3VarU.y(strE9);
                    }
                    if (!TextUtils.isEmpty(u0VarX1.J())) {
                        String strJ9 = u0VarX1.J();
                        com.google.android.gms.common.internal.d0.h(strJ9);
                        h3VarU.N(strJ9);
                    }
                    listQ1 = y3Var.d0().Q1(str6);
                    i11 = i10;
                    while (i11 < listQ1.size()) {
                        com.google.android.gms.internal.measurement.q3 q3VarA9 = com.google.android.gms.internal.measurement.r3.A();
                        String str31114 = ((c4) listQ1.get(i11)).f14610c;
                        q3VarA9.b();
                        ((com.google.android.gms.internal.measurement.r3) q3VarA9.B).C(str31114);
                        long j28 = ((c4) listQ1.get(i11)).f14611d;
                        q3VarA9.b();
                        ((com.google.android.gms.internal.measurement.r3) q3VarA9.B).B(j28);
                        y3Var.h0().t1(q3VarA9, ((c4) listQ1.get(i11)).f14612e);
                        h3VarU.c0(q3VarA9);
                        if ("_sid".equals(((c4) listQ1.get(i11)).f14610c)) {
                            e1 e1Var112 = u0VarX1.f14703a.G;
                            h1.g(e1Var112);
                            e1Var112.V0();
                            if (u0VarX1.f14723w != 0) {
                                t0VarH0 = y3Var.h0();
                                if (TextUtils.isEmpty(str13)) {
                                    str16 = str13;
                                    jG1 = 0;
                                } else {
                                    str16 = str13;
                                    jG1 = t0VarH0.G1(str16.getBytes(Charset.forName("UTF-8")));
                                }
                                e1 e1Var113 = u0VarX1.f14703a.G;
                                h1.g(e1Var113);
                                e1Var113.V0();
                                if (jG1 != u0VarX1.f14723w) {
                                    h3VarU.b();
                                    ((com.google.android.gms.internal.measurement.i3) h3VarU.B).Z0();
                                }
                            } else {
                                str16 = str13;
                            }
                        } else {
                            str16 = str13;
                        }
                        i11++;
                        str13 = str16;
                    }
                    mVarD2 = y3Var.d0();
                    com.google.android.gms.internal.measurement.i3 i3Var9 = (com.google.android.gms.internal.measurement.i3) h3VarU.e();
                    mVarD2.V0();
                    mVarD2.W0();
                    com.google.android.gms.common.internal.d0.e(i3Var9.p());
                    byte[] bArrA17 = i3Var9.a();
                    long jG10 = mVarD2.C.h0().G1(bArrA17);
                    ContentValues contentValues10 = new ContentValues();
                    contentValues10.put("app_id", i3Var9.p());
                    contentValues10.put("metadata_fingerprint", Long.valueOf(jG10));
                    contentValues10.put("metadata", bArrA17);
                    mVarD2.K1().insertWithOnConflict("raw_events_metadata", null, contentValues10, 4);
                    mVarD3 = y3Var.d0();
                    r rVar10 = (r) kVar2.f10093g;
                    Objects.requireNonNull(rVar10);
                    it2 = rVar10.A.keySet().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            a1 a1VarC9 = y3Var.c0();
                            String str31115 = (String) kVar2.f10090d;
                            zL1 = a1VarC9.l1(str31115, (String) kVar2.f10091e);
                            j jVarZ9 = y3Var.d0().Z1(y3Var.b(), str31115, false, false, false, false);
                            if (zL1) {
                            }
                            i12 = i10;
                            break;
                        }
                        if ("_r".equals(it2.next())) {
                        }
                        i12 = 1;
                        break;
                    }
                    mVarD3.V0();
                    mVarD3.W0();
                    str15 = (String) kVar2.f10090d;
                    com.google.android.gms.common.internal.d0.e(str15);
                    byte[] bArrA18 = mVarD3.C.h0().x1(kVar2).a();
                    contentValues = new ContentValues();
                    contentValues.put("app_id", str15);
                    contentValues.put("name", (String) kVar2.f10091e);
                    contentValues.put("timestamp", Long.valueOf(kVar2.f10088b));
                    contentValues.put("metadata_fingerprint", Long.valueOf(jG10));
                    contentValues.put("data", bArrA18);
                    contentValues.put("realtime", Integer.valueOf(i12));
                    if (mVarD3.K1().insert("raw_events", null, contentValues) == -1) {
                        ((h1) mVarD3.B).t().Z0().c(q0.d1(str15), "Failed to insert raw event (got -1). appId");
                    } else {
                        y3Var.O = 0L;
                    }
                    y3Var.d0().I1();
                    y3Var.d0().J1();
                    y3Var.K();
                    y3Var.t().c1().c(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                    return;
                    y3Var.d0().J1();
                    throw th;
                }
                if (jIntValue % 1000 == 1) {
                    t().Z0().d("Data loss. Too many events logged. appId, count", q0.d1(str5), Long.valueOf(jVarA2.f14641b));
                }
                d0().I1();
                d0().J1();
            }
            str4 = str22;
            bVar = bVar3;
            zT1 = e4.T1(str26);
            zEquals = "_err".equals(str26);
            i0();
            if (rVar == null) {
                length = 0;
            } else {
                it = rVar.A.keySet().iterator();
                length = 0;
                while (it.hasNext()) {
                    objA = rVar.a(it.next());
                    if (objA instanceof Parcelable[]) {
                        length += (long) ((Parcelable[]) objA).length;
                    }
                }
            }
            str5 = str4;
            jVarA2 = d0().a2(b(), str5, length + 1, true, zT1, false, zEquals, false, false, false);
            long j116 = jVarA2.f14641b;
            b0();
            jIntValue = j116 - ((long) ((Integer) b0.l.a(null)).intValue());
            if (jIntValue <= 0) {
                if (zT1) {
                    long j117 = jVarA2.f14640a;
                    b0();
                    jIntValue2 = j117 - ((long) ((Integer) b0.f14580n.a(null)).intValue());
                    if (jIntValue2 > 0) {
                        if (jIntValue2 % 1000 == 1) {
                            t().Z0().d("Data loss. Too many public events logged. appId, count", q0.d1(str5), Long.valueOf(jVarA2.f14640a));
                        }
                        i0();
                        e4.l1(bVar, str5, 16, "_ev", sVarE.A, 0);
                        d0().I1();
                    }
                }
                str6 = str5;
                if (zEquals) {
                    jMax = jVarA2.f14643d - ((long) Math.max(0, Math.min(1000000, b0().d1(str6, b0.m))));
                    if (jMax > 0) {
                        if (jMax == 1) {
                            t().Z0().d("Too many error events logged. appId, count", q0.d1(str6), Long.valueOf(jVarA2.f14643d));
                        }
                        d0().I1();
                    }
                }
                bundleE = rVar.e();
                e4 e4VarI5 = i0();
                String str219 = sVarE.C;
                e4VarI5.k1(bundleE, "_o", str219);
                if (i0().v1(str6, g4Var.f14620b0)) {
                    i0().k1(bundleE, "_dbg", 1L);
                    i0().k1(bundleE, "_r", 1L);
                }
                if ("_s".equals(str26)) {
                    obj2 = c4VarP1.f14612e;
                    if (obj2 instanceof Long) {
                        i0().k1(bundleE, "_sno", obj2);
                    }
                }
                if (b0().f1(null, b0.X0)) {
                    obj = bundleE.get("value");
                    if (obj instanceof String) {
                        double d12 = Double.parseDouble((String) obj);
                        bundleE.remove("value");
                        bundleE.putDouble("value", d12);
                    }
                }
                mVarD1 = d0();
                com.google.android.gms.common.internal.d0.e(str6);
                mVarD1.V0();
                mVarD1.W0();
                jDelete = mVarD1.K1().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str6, String.valueOf(Math.max(0, Math.min(1000000, ((h1) mVarD1.B).D.d1(str6, b0.f14586q))))});
                if (jDelete > 0) {
                    t().a1().d("Data lost. Too many events stored on disk, deleted. appId", q0.d1(str6), Long.valueOf(jDelete));
                }
                h1Var = this.L;
                kVar = new l7.k(h1Var, sVarE.C, str6, sVarE.A, sVarE.D, 0L, bundleE);
                m mVarD8 = d0();
                str7 = (String) kVar.f10091e;
                String str2110 = str17;
                qVarT1 = mVarD8.t1(str2110, str6, str7);
                if (qVarT1 == null) {
                    jL1 = d0().l1(str6);
                    gVarB0 = b0();
                    gVarB0.getClass();
                    a0Var = b0.W;
                    bVar2 = bVar;
                    if (jL1 >= Math.max(Math.min(gVarB0.d1(str6, a0Var), CastStatusCodes.AUTHENTICATION_FAILED), MediaError.DetailedErrorCode.SEGMENT_UNKNOWN)) {
                    }
                    bVar = bVar2;
                    qVarA = new q(str6, str7, 0L, 0L, 0L, kVar.f10088b, 0L, null, null, null, null);
                    str6 = str6;
                } else {
                    kVar = kVar.g(h1Var, qVarT1.f14688f);
                    qVarA = qVarT1.a(kVar.f10088b);
                }
                kVar2 = kVar;
                d0().u1(str2110, qVarA);
                C().V0();
                j0();
                String str2111 = (String) kVar2.f10090d;
                com.google.android.gms.common.internal.d0.e(str2111);
                com.google.android.gms.common.internal.d0.b(str2111.equals(str6));
                h3VarU = com.google.android.gms.internal.measurement.i3.U();
                h3VarU.B();
                h3VarU.k();
                if (!TextUtils.isEmpty(str6)) {
                    h3VarU.s(str6);
                }
                if (TextUtils.isEmpty(str3)) {
                    str8 = str3;
                    h3VarU.p(str8);
                } else {
                    str8 = str3;
                }
                if (TextUtils.isEmpty(str2)) {
                    str9 = str2;
                    h3VarU.t(str9);
                } else {
                    str9 = str2;
                }
                if (TextUtils.isEmpty(str)) {
                    str10 = str;
                    h3VarU.U(str10);
                } else {
                    str10 = str;
                }
                if (j15 != -2147483648L) {
                    j9 = j15;
                    h3VarU.O((int) j9);
                } else {
                    j9 = j15;
                }
                str11 = str8;
                h3VarU.u(j14);
                if (TextUtils.isEmpty(str23)) {
                    str12 = str23;
                    h3VarU.K(str12);
                } else {
                    str12 = str23;
                }
                com.google.android.gms.common.internal.d0.h(str6);
                str13 = str10;
                t1VarJ = a(str6).j(t1.c(100, str18));
                h3VarU.T(t1VarJ.f());
                m8.a();
                zF1 = b0().f1(str6, b0.P0);
                s1Var = s1.AD_STORAGE;
                if (zF1) {
                    i0();
                    if (e4.r1(str6)) {
                        h3VarU.C(g4Var.Z);
                        j10 = j9;
                        j11 = g4Var.f14619a0;
                        if (!t1VarJ.i(s1Var)) {
                            j11 = (j11 & (-2)) | 32;
                        }
                        if (j11 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        h3VarU.W(z10);
                        if (j11 != 0) {
                            com.google.android.gms.internal.measurement.p2 p2VarW5 = com.google.android.gms.internal.measurement.q2.w();
                            if ((j11 & 1) != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            p2VarW5.h(z11);
                            if ((j11 & 2) != 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            p2VarW5.j(z12);
                            if ((j11 & 4) != 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            p2VarW5.k(z13);
                            if ((j11 & 8) != 0) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            p2VarW5.m(z14);
                            if ((j11 & 16) != 0) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            p2VarW5.n(z15);
                            if ((j11 & 32) != 0) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            p2VarW5.o(z16);
                            if ((j11 & 64) != 0) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            p2VarW5.p(z17);
                            h3VarU.D((com.google.android.gms.internal.measurement.q2) p2VarW5.e());
                        }
                    } else {
                        j10 = j9;
                    }
                } else {
                    j10 = j9;
                }
                if (j16 != 0) {
                    h3VarU.z(j16);
                    j16 = j16;
                }
                h3VarU.R(j12);
                t0 t0VarH5 = h0();
                c4VarA = com.google.android.gms.internal.measurement.c4.a(t0VarH5.C.L.e0().getContentResolver(), j4.a(), com.google.android.gms.common.api.internal.m0.C);
                if (c4VarA == null) {
                    mapB = Collections.EMPTY_MAP;
                } else {
                    mapB = c4VarA.b();
                }
                if (mapB == null) {
                    str14 = str9;
                    arrayList = null;
                } else {
                    str14 = str9;
                    arrayList = null;
                }
                if (arrayList != null) {
                    h3VarU.Q(arrayList);
                }
                if (b0().f1(null, b0.f14547a1)) {
                    h3VarU.G();
                }
                t1VarJ2 = a(str6).j(t1.c(100, str18));
                if (t1VarJ2.i(s1Var)) {
                    str12 = str12;
                    h1Var2.k().X0();
                    String str31116 = Build.MODEL;
                    h3VarU.m();
                    h1Var2.k().X0();
                    String str31117 = Build.VERSION.RELEASE;
                    h3VarU.b();
                    ((com.google.android.gms.internal.measurement.i3) h3VarU.B).o0(str31117);
                    h3VarU.o((int) h1Var2.k().Z0());
                    h3VarU.n(h1Var2.k().a1());
                    h3VarU.V(g4Var.W);
                    if (h1Var2.a()) {
                        h3VarU.q();
                        if (!TextUtils.isEmpty(null)) {
                            h3VarU.b();
                            ((com.google.android.gms.internal.measurement.i3) h3VarU.B).R0(null);
                            throw null;
                        }
                    }
                    u0VarX1 = d0().X1(str6);
                    if (u0VarX1 == null) {
                        u0VarX1 = new u0(h1Var2, str6);
                        y3Var = this;
                        u0VarX1.F(y3Var.j(t1VarJ2));
                        u0VarX1.K(g4Var.K);
                        u0VarX1.H(str12);
                        if (t1VarJ2.i(s1Var)) {
                            u0VarX1.I(y3Var.I.a1(str6, z18));
                        }
                        u0VarX1.e(0L);
                        u0VarX1.L(0L);
                        u0VarX1.M(0L);
                        u0VarX1.O(str14);
                        u0VarX1.Q(j10);
                        u0VarX1.R(str11);
                        u0VarX1.S(j14);
                        u0VarX1.a(j16);
                        u0VarX1.d(z19);
                        u0VarX1.c(j12);
                        i10 = 0;
                        y3Var.d0().Y1(u0VarX1, false);
                    } else {
                        i10 = 0;
                        y3Var = this;
                    }
                    if (t1VarJ2.i(s1.ANALYTICS_STORAGE)) {
                        String strE10 = u0VarX1.E();
                        com.google.android.gms.common.internal.d0.h(strE10);
                        h3VarU.y(strE10);
                    }
                    if (!TextUtils.isEmpty(u0VarX1.J())) {
                        String strJ10 = u0VarX1.J();
                        com.google.android.gms.common.internal.d0.h(strJ10);
                        h3VarU.N(strJ10);
                    }
                    listQ1 = y3Var.d0().Q1(str6);
                    i11 = i10;
                    while (i11 < listQ1.size()) {
                        com.google.android.gms.internal.measurement.q3 q3VarA10 = com.google.android.gms.internal.measurement.r3.A();
                        String str31118 = ((c4) listQ1.get(i11)).f14610c;
                        q3VarA10.b();
                        ((com.google.android.gms.internal.measurement.r3) q3VarA10.B).C(str31118);
                        long j29 = ((c4) listQ1.get(i11)).f14611d;
                        q3VarA10.b();
                        ((com.google.android.gms.internal.measurement.r3) q3VarA10.B).B(j29);
                        y3Var.h0().t1(q3VarA10, ((c4) listQ1.get(i11)).f14612e);
                        h3VarU.c0(q3VarA10);
                        if ("_sid".equals(((c4) listQ1.get(i11)).f14610c)) {
                            e1 e1Var114 = u0VarX1.f14703a.G;
                            h1.g(e1Var114);
                            e1Var114.V0();
                            if (u0VarX1.f14723w != 0) {
                                t0VarH0 = y3Var.h0();
                                if (TextUtils.isEmpty(str13)) {
                                    str16 = str13;
                                    jG1 = 0;
                                } else {
                                    str16 = str13;
                                    jG1 = t0VarH0.G1(str16.getBytes(Charset.forName("UTF-8")));
                                }
                                e1 e1Var115 = u0VarX1.f14703a.G;
                                h1.g(e1Var115);
                                e1Var115.V0();
                                if (jG1 != u0VarX1.f14723w) {
                                    h3VarU.b();
                                    ((com.google.android.gms.internal.measurement.i3) h3VarU.B).Z0();
                                }
                            } else {
                                str16 = str13;
                            }
                        } else {
                            str16 = str13;
                        }
                        i11++;
                        str13 = str16;
                    }
                    mVarD2 = y3Var.d0();
                    com.google.android.gms.internal.measurement.i3 i3Var10 = (com.google.android.gms.internal.measurement.i3) h3VarU.e();
                    mVarD2.V0();
                    mVarD2.W0();
                    com.google.android.gms.common.internal.d0.e(i3Var10.p());
                    byte[] bArrA19 = i3Var10.a();
                    long jG11 = mVarD2.C.h0().G1(bArrA19);
                    ContentValues contentValues11 = new ContentValues();
                    contentValues11.put("app_id", i3Var10.p());
                    contentValues11.put("metadata_fingerprint", Long.valueOf(jG11));
                    contentValues11.put("metadata", bArrA19);
                    mVarD2.K1().insertWithOnConflict("raw_events_metadata", null, contentValues11, 4);
                    mVarD3 = y3Var.d0();
                    r rVar11 = (r) kVar2.f10093g;
                    Objects.requireNonNull(rVar11);
                    it2 = rVar11.A.keySet().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            a1 a1VarC10 = y3Var.c0();
                            String str31119 = (String) kVar2.f10090d;
                            zL1 = a1VarC10.l1(str31119, (String) kVar2.f10091e);
                            j jVarZ10 = y3Var.d0().Z1(y3Var.b(), str31119, false, false, false, false);
                            if (zL1) {
                            }
                            i12 = i10;
                            break;
                        }
                        if ("_r".equals(it2.next())) {
                        }
                        i12 = 1;
                        break;
                    }
                    mVarD3.V0();
                    mVarD3.W0();
                    str15 = (String) kVar2.f10090d;
                    com.google.android.gms.common.internal.d0.e(str15);
                    byte[] bArrA110 = mVarD3.C.h0().x1(kVar2).a();
                    contentValues = new ContentValues();
                    contentValues.put("app_id", str15);
                    contentValues.put("name", (String) kVar2.f10091e);
                    contentValues.put("timestamp", Long.valueOf(kVar2.f10088b));
                    contentValues.put("metadata_fingerprint", Long.valueOf(jG11));
                    contentValues.put("data", bArrA110);
                    contentValues.put("realtime", Integer.valueOf(i12));
                    if (mVarD3.K1().insert("raw_events", null, contentValues) == -1) {
                        ((h1) mVarD3.B).t().Z0().c(q0.d1(str15), "Failed to insert raw event (got -1). appId");
                    } else {
                        y3Var.O = 0L;
                    }
                    y3Var.d0().I1();
                    y3Var.d0().J1();
                    y3Var.K();
                    y3Var.t().c1().c(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                    return;
                }
                str12 = str12;
                h1Var2.k().X0();
                String str311110 = Build.MODEL;
                h3VarU.m();
                h1Var2.k().X0();
                String str311111 = Build.VERSION.RELEASE;
                h3VarU.b();
                ((com.google.android.gms.internal.measurement.i3) h3VarU.B).o0(str311111);
                h3VarU.o((int) h1Var2.k().Z0());
                h3VarU.n(h1Var2.k().a1());
                h3VarU.V(g4Var.W);
                if (h1Var2.a()) {
                    h3VarU.q();
                    if (!TextUtils.isEmpty(null)) {
                        h3VarU.b();
                        ((com.google.android.gms.internal.measurement.i3) h3VarU.B).R0(null);
                        throw null;
                    }
                }
                u0VarX1 = d0().X1(str6);
                if (u0VarX1 == null) {
                    u0VarX1 = new u0(h1Var2, str6);
                    y3Var = this;
                    u0VarX1.F(y3Var.j(t1VarJ2));
                    u0VarX1.K(g4Var.K);
                    u0VarX1.H(str12);
                    if (t1VarJ2.i(s1Var)) {
                        u0VarX1.I(y3Var.I.a1(str6, z18));
                    }
                    u0VarX1.e(0L);
                    u0VarX1.L(0L);
                    u0VarX1.M(0L);
                    u0VarX1.O(str14);
                    u0VarX1.Q(j10);
                    u0VarX1.R(str11);
                    u0VarX1.S(j14);
                    u0VarX1.a(j16);
                    u0VarX1.d(z19);
                    u0VarX1.c(j12);
                    i10 = 0;
                    y3Var.d0().Y1(u0VarX1, false);
                } else {
                    i10 = 0;
                    y3Var = this;
                }
                if (t1VarJ2.i(s1.ANALYTICS_STORAGE)) {
                    String strE11 = u0VarX1.E();
                    com.google.android.gms.common.internal.d0.h(strE11);
                    h3VarU.y(strE11);
                }
                if (!TextUtils.isEmpty(u0VarX1.J())) {
                    String strJ11 = u0VarX1.J();
                    com.google.android.gms.common.internal.d0.h(strJ11);
                    h3VarU.N(strJ11);
                }
                listQ1 = y3Var.d0().Q1(str6);
                i11 = i10;
                while (i11 < listQ1.size()) {
                    com.google.android.gms.internal.measurement.q3 q3VarA11 = com.google.android.gms.internal.measurement.r3.A();
                    String str311112 = ((c4) listQ1.get(i11)).f14610c;
                    q3VarA11.b();
                    ((com.google.android.gms.internal.measurement.r3) q3VarA11.B).C(str311112);
                    long j210 = ((c4) listQ1.get(i11)).f14611d;
                    q3VarA11.b();
                    ((com.google.android.gms.internal.measurement.r3) q3VarA11.B).B(j210);
                    y3Var.h0().t1(q3VarA11, ((c4) listQ1.get(i11)).f14612e);
                    h3VarU.c0(q3VarA11);
                    if ("_sid".equals(((c4) listQ1.get(i11)).f14610c)) {
                        e1 e1Var116 = u0VarX1.f14703a.G;
                        h1.g(e1Var116);
                        e1Var116.V0();
                        if (u0VarX1.f14723w != 0) {
                            t0VarH0 = y3Var.h0();
                            if (TextUtils.isEmpty(str13)) {
                                str16 = str13;
                                jG1 = 0;
                            } else {
                                str16 = str13;
                                jG1 = t0VarH0.G1(str16.getBytes(Charset.forName("UTF-8")));
                            }
                            e1 e1Var117 = u0VarX1.f14703a.G;
                            h1.g(e1Var117);
                            e1Var117.V0();
                            if (jG1 != u0VarX1.f14723w) {
                                h3VarU.b();
                                ((com.google.android.gms.internal.measurement.i3) h3VarU.B).Z0();
                            }
                        } else {
                            str16 = str13;
                        }
                    } else {
                        str16 = str13;
                    }
                    i11++;
                    str13 = str16;
                }
                mVarD2 = y3Var.d0();
                com.google.android.gms.internal.measurement.i3 i3Var11 = (com.google.android.gms.internal.measurement.i3) h3VarU.e();
                mVarD2.V0();
                mVarD2.W0();
                com.google.android.gms.common.internal.d0.e(i3Var11.p());
                byte[] bArrA111 = i3Var11.a();
                long jG12 = mVarD2.C.h0().G1(bArrA111);
                ContentValues contentValues12 = new ContentValues();
                contentValues12.put("app_id", i3Var11.p());
                contentValues12.put("metadata_fingerprint", Long.valueOf(jG12));
                contentValues12.put("metadata", bArrA111);
                mVarD2.K1().insertWithOnConflict("raw_events_metadata", null, contentValues12, 4);
                mVarD3 = y3Var.d0();
                r rVar12 = (r) kVar2.f10093g;
                Objects.requireNonNull(rVar12);
                it2 = rVar12.A.keySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        a1 a1VarC11 = y3Var.c0();
                        String str311113 = (String) kVar2.f10090d;
                        zL1 = a1VarC11.l1(str311113, (String) kVar2.f10091e);
                        j jVarZ11 = y3Var.d0().Z1(y3Var.b(), str311113, false, false, false, false);
                        if (zL1) {
                        }
                        i12 = i10;
                        break;
                    }
                    if ("_r".equals(it2.next())) {
                    }
                    i12 = 1;
                    break;
                }
                mVarD3.V0();
                mVarD3.W0();
                str15 = (String) kVar2.f10090d;
                com.google.android.gms.common.internal.d0.e(str15);
                byte[] bArrA112 = mVarD3.C.h0().x1(kVar2).a();
                contentValues = new ContentValues();
                contentValues.put("app_id", str15);
                contentValues.put("name", (String) kVar2.f10091e);
                contentValues.put("timestamp", Long.valueOf(kVar2.f10088b));
                contentValues.put("metadata_fingerprint", Long.valueOf(jG12));
                contentValues.put("data", bArrA112);
                contentValues.put("realtime", Integer.valueOf(i12));
                if (mVarD3.K1().insert("raw_events", null, contentValues) == -1) {
                    ((h1) mVarD3.B).t().Z0().c(q0.d1(str15), "Failed to insert raw event (got -1). appId");
                } else {
                    y3Var.O = 0L;
                }
                y3Var.d0().I1();
                y3Var.d0().J1();
                y3Var.K();
                y3Var.t().c1().c(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                return;
                y3Var.d0().J1();
                throw th;
            }
            if (jIntValue % 1000 == 1) {
                t().Z0().d("Data loss. Too many events logged. appId, count", q0.d1(str5), Long.valueOf(jVarA2.f14641b));
            }
            d0().I1();
            d0().J1();
        } catch (Throwable th4) {
            th = th4;
            y3Var = this;
        }
    }

    public final c g0() {
        c cVar = this.F;
        R(cVar);
        return cVar;
    }

    public final void h(u0 u0Var, com.google.android.gms.internal.measurement.h3 h3Var) throws Throwable {
        o10.b bVar;
        com.google.android.gms.internal.measurement.r3 r3Var;
        h hVar;
        C().V0();
        j0();
        String strB0 = ((com.google.android.gms.internal.measurement.i3) h3Var.B).B0();
        EnumMap enumMap = new EnumMap(s1.class);
        int length = strB0.length();
        int length2 = s1.values().length;
        h hVar2 = h.UNSET;
        int i10 = 0;
        if (length < length2 || strB0.charAt(0) != '1') {
            bVar = new o10.b(17);
        } else {
            s1[] s1VarArrValues = s1.values();
            int length3 = s1VarArrValues.length;
            int i11 = 0;
            int i12 = 1;
            while (i11 < length3) {
                s1 s1Var = s1VarArrValues[i11];
                int i13 = i12 + 1;
                char cCharAt = strB0.charAt(i12);
                h[] hVarArrValues = h.values();
                int length4 = hVarArrValues.length;
                int i14 = i10;
                while (true) {
                    if (i14 >= length4) {
                        hVar = hVar2;
                        break;
                    }
                    hVar = hVarArrValues[i14];
                    if (hVar.A == cCharAt) {
                        break;
                    } else {
                        i14++;
                    }
                }
                enumMap.put(s1Var, hVar);
                i11++;
                i12 = i13;
                i10 = 0;
            }
            bVar = new o10.b(enumMap);
        }
        String strD = u0Var.D();
        C().V0();
        j0();
        t1 t1VarA = a(strD);
        EnumMap enumMap2 = t1VarA.f14701a;
        s1 s1Var2 = s1.AD_STORAGE;
        q1 q1Var = (q1) enumMap2.get(s1Var2);
        q1 q1Var2 = q1.UNINITIALIZED;
        if (q1Var == null) {
            q1Var = q1Var2;
        }
        int i15 = t1VarA.f14702b;
        int iOrdinal = q1Var.ordinal();
        h hVar3 = h.REMOTE_ENFORCED_DEFAULT;
        h hVar4 = h.FAILSAFE;
        if (iOrdinal == 1) {
            bVar.C(s1Var2, hVar3);
        } else if (iOrdinal == 2 || iOrdinal == 3) {
            bVar.B(s1Var2, i15);
        } else {
            bVar.C(s1Var2, hVar4);
        }
        s1 s1Var3 = s1.ANALYTICS_STORAGE;
        q1 q1Var3 = (q1) enumMap2.get(s1Var3);
        if (q1Var3 != null) {
            q1Var2 = q1Var3;
        }
        int iOrdinal2 = q1Var2.ordinal();
        if (iOrdinal2 == 1) {
            bVar.C(s1Var3, hVar3);
        } else if (iOrdinal2 == 2 || iOrdinal2 == 3) {
            bVar.B(s1Var3, i15);
        } else {
            bVar.C(s1Var3, hVar4);
        }
        String strD2 = u0Var.D();
        C().V0();
        j0();
        o oVarP0 = p0(strD2, n0(strD2), a(strD2), bVar);
        String str = oVarP0.f14680d;
        Boolean bool = oVarP0.f14679c;
        com.google.android.gms.common.internal.d0.h(bool);
        boolean zBooleanValue = bool.booleanValue();
        h3Var.b();
        ((com.google.android.gms.internal.measurement.i3) h3Var.B).f1(zBooleanValue);
        if (!TextUtils.isEmpty(str)) {
            h3Var.b();
            ((com.google.android.gms.internal.measurement.i3) h3Var.B).g1(str);
        }
        C().V0();
        j0();
        Iterator it = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.i3) h3Var.B).U1()).iterator();
        do {
            if (!it.hasNext()) {
                r3Var = null;
                break;
            }
            r3Var = (com.google.android.gms.internal.measurement.r3) it.next();
        } while (!"_npa".equals(r3Var.r()));
        if (r3Var != null) {
            EnumMap enumMap3 = (EnumMap) bVar.B;
            s1 s1Var4 = s1.AD_PERSONALIZATION;
            h hVar5 = (h) enumMap3.get(s1Var4);
            if (hVar5 == null) {
                hVar5 = hVar2;
            }
            if (hVar5 == hVar2) {
                m mVar = this.C;
                R(mVar);
                c4 c4VarP1 = mVar.P1(u0Var.D(), "_npa");
                h hVar6 = h.MANIFEST;
                h hVar7 = h.API;
                if (c4VarP1 != null) {
                    String str2 = c4VarP1.f14609b;
                    if ("tcf".equals(str2)) {
                        bVar.C(s1Var4, h.TCF);
                    } else if ("app".equals(str2)) {
                        bVar.C(s1Var4, hVar7);
                    } else {
                        bVar.C(s1Var4, hVar6);
                    }
                } else {
                    Boolean boolW = u0Var.w();
                    if (boolW == null || ((boolW.booleanValue() && r3Var.v() != 1) || !(boolW.booleanValue() || r3Var.v() == 0))) {
                        bVar.C(s1Var4, hVar7);
                    } else {
                        bVar.C(s1Var4, hVar6);
                    }
                }
            }
        } else {
            int iB = B(u0Var.D(), bVar);
            com.google.android.gms.internal.measurement.q3 q3VarA = com.google.android.gms.internal.measurement.r3.A();
            q3VarA.b();
            ((com.google.android.gms.internal.measurement.r3) q3VarA.B).C("_npa");
            ((ve.b) k0()).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            q3VarA.b();
            ((com.google.android.gms.internal.measurement.r3) q3VarA.B).B(jCurrentTimeMillis);
            q3VarA.b();
            ((com.google.android.gms.internal.measurement.r3) q3VarA.B).F(iB);
            com.google.android.gms.internal.measurement.r3 r3Var2 = (com.google.android.gms.internal.measurement.r3) q3VarA.e();
            h3Var.b();
            ((com.google.android.gms.internal.measurement.i3) h3Var.B).d0(r3Var2);
            t().O.d("Setting user property", "non_personalized_ads(_npa)", Integer.valueOf(iB));
        }
        String string = bVar.toString();
        h3Var.b();
        ((com.google.android.gms.internal.measurement.i3) h3Var.B).e1(string);
        String strD3 = u0Var.D();
        a1 a1Var = this.A;
        a1Var.V0();
        a1Var.b1(strD3);
        com.google.android.gms.internal.measurement.z1 z1VarQ1 = a1Var.q1(strD3);
        boolean z10 = z1VarQ1 == null || !z1VarQ1.s() || z1VarQ1.t();
        List listX = h3Var.X();
        for (int i16 = 0; i16 < listX.size(); i16++) {
            if ("_tcf".equals(((com.google.android.gms.internal.measurement.a3) listX.get(i16)).s())) {
                com.google.android.gms.internal.measurement.z2 z2Var = (com.google.android.gms.internal.measurement.z2) ((com.google.android.gms.internal.measurement.a3) listX.get(i16)).i();
                List listH = z2Var.h();
                for (int i17 = 0; i17 < listH.size(); i17++) {
                    if ("_tcfd".equals(((com.google.android.gms.internal.measurement.d3) listH.get(i17)).q())) {
                        String strS = ((com.google.android.gms.internal.measurement.d3) listH.get(i17)).s();
                        if (z10 && strS.length() > 4) {
                            char[] charArray = strS.toCharArray();
                            int i18 = 1;
                            while (true) {
                                if (i18 >= 64) {
                                    i18 = 0;
                                    break;
                                } else if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i18)) {
                                    break;
                                } else {
                                    i18++;
                                }
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i18 | 1);
                            strS = String.valueOf(charArray);
                        }
                        com.google.android.gms.internal.measurement.c3 c3VarB = com.google.android.gms.internal.measurement.d3.B();
                        c3VarB.h("_tcfd");
                        c3VarB.j(strS);
                        z2Var.b();
                        ((com.google.android.gms.internal.measurement.a3) z2Var.B).A(i17, (com.google.android.gms.internal.measurement.d3) c3VarB.e());
                        break;
                    }
                }
                h3Var.Z(i16, z2Var);
                return;
            }
        }
    }

    public final t0 h0() {
        t0 t0Var = this.G;
        R(t0Var);
        return t0Var;
    }

    public final void i(u0 u0Var, com.google.android.gms.internal.measurement.h3 h3Var) {
        Serializable serializableK1;
        C().V0();
        j0();
        com.google.android.gms.internal.measurement.k2 k2VarO = com.google.android.gms.internal.measurement.n2.O();
        h1 h1Var = u0Var.f14703a;
        e1 e1Var = h1Var.G;
        h1.g(e1Var);
        e1Var.V0();
        byte[] bArr = u0Var.H;
        if (bArr != null) {
            try {
                k2VarO = (com.google.android.gms.internal.measurement.k2) t0.I1(k2VarO, bArr);
            } catch (zzmr unused) {
                t().J.c(q0.d1(u0Var.D()), "Failed to parse locally stored ad campaign info. appId");
            }
        }
        Iterator it = h3Var.X().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.google.android.gms.internal.measurement.a3 a3Var = (com.google.android.gms.internal.measurement.a3) it.next();
            if (a3Var.s().equals("_cmp")) {
                com.google.android.gms.internal.measurement.d3 d3VarD1 = t0.d1(a3Var, "gclid");
                Serializable serializableK2 = d3VarD1 == null ? null : t0.k1(d3VarD1);
                Serializable serializable = RuntimeVersion.SUFFIX;
                if (serializableK2 == null) {
                    serializableK2 = RuntimeVersion.SUFFIX;
                }
                String str = (String) serializableK2;
                com.google.android.gms.internal.measurement.d3 d3VarD2 = t0.d1(a3Var, "gbraid");
                Serializable serializableK3 = d3VarD2 == null ? null : t0.k1(d3VarD2);
                if (serializableK3 == null) {
                    serializableK3 = RuntimeVersion.SUFFIX;
                }
                String str2 = (String) serializableK3;
                com.google.android.gms.internal.measurement.d3 d3VarD3 = t0.d1(a3Var, "gad_source");
                Serializable serializableK4 = d3VarD3 == null ? null : t0.k1(d3VarD3);
                if (serializableK4 != null) {
                    serializable = serializableK4;
                }
                String str3 = (String) serializable;
                String[] strArrSplit = ((String) b0.f14565g1.a(null)).split(",");
                h0();
                HashMap map = new HashMap();
                for (com.google.android.gms.internal.measurement.d3 d3Var : a3Var.p()) {
                    if (Arrays.asList(strArrSplit).contains(d3Var.q()) && (serializableK1 = t0.k1(d3Var)) != null) {
                        map.put(d3Var.q(), serializableK1);
                    }
                }
                if (!map.isEmpty()) {
                    com.google.android.gms.internal.measurement.d3 d3VarD4 = t0.d1(a3Var, "click_timestamp");
                    Serializable serializableK5 = d3VarD4 == null ? null : t0.k1(d3VarD4);
                    long jLongValue = ((Long) (serializableK5 != null ? serializableK5 : 0L)).longValue();
                    if (jLongValue <= 0) {
                        jLongValue = a3Var.u();
                    }
                    com.google.android.gms.internal.measurement.d3 d3VarD5 = t0.d1(a3Var, "_cis");
                    if ("referrer API v2".equals(d3VarD5 != null ? t0.k1(d3VarD5) : null)) {
                        if (jLongValue > ((com.google.android.gms.internal.measurement.n2) k2VarO.B).N()) {
                            if (str.isEmpty()) {
                                k2VarO.b();
                                ((com.google.android.gms.internal.measurement.n2) k2VarO.B).q();
                            } else {
                                k2VarO.b();
                                ((com.google.android.gms.internal.measurement.n2) k2VarO.B).p(str);
                            }
                            if (str2.isEmpty()) {
                                k2VarO.b();
                                ((com.google.android.gms.internal.measurement.n2) k2VarO.B).s();
                            } else {
                                k2VarO.b();
                                ((com.google.android.gms.internal.measurement.n2) k2VarO.B).r(str2);
                            }
                            if (str3.isEmpty()) {
                                k2VarO.b();
                                ((com.google.android.gms.internal.measurement.n2) k2VarO.B).u();
                            } else {
                                k2VarO.b();
                                ((com.google.android.gms.internal.measurement.n2) k2VarO.B).t(str3);
                            }
                            k2VarO.b();
                            ((com.google.android.gms.internal.measurement.n2) k2VarO.B).v(jLongValue);
                            k2VarO.b();
                            ((com.google.android.gms.internal.measurement.n2) k2VarO.B).x().clear();
                            HashMap mapD = D(a3Var);
                            k2VarO.b();
                            ((com.google.android.gms.internal.measurement.n2) k2VarO.B).x().putAll(mapD);
                        }
                    } else if (jLongValue > ((com.google.android.gms.internal.measurement.n2) k2VarO.B).F()) {
                        if (str.isEmpty()) {
                            k2VarO.b();
                            ((com.google.android.gms.internal.measurement.n2) k2VarO.B).R();
                        } else {
                            k2VarO.b();
                            ((com.google.android.gms.internal.measurement.n2) k2VarO.B).Q(str);
                        }
                        if (str2.isEmpty()) {
                            k2VarO.b();
                            ((com.google.android.gms.internal.measurement.n2) k2VarO.B).T();
                        } else {
                            k2VarO.b();
                            ((com.google.android.gms.internal.measurement.n2) k2VarO.B).S(str2);
                        }
                        if (str3.isEmpty()) {
                            k2VarO.b();
                            ((com.google.android.gms.internal.measurement.n2) k2VarO.B).V();
                        } else {
                            k2VarO.b();
                            ((com.google.android.gms.internal.measurement.n2) k2VarO.B).U(str3);
                        }
                        k2VarO.b();
                        ((com.google.android.gms.internal.measurement.n2) k2VarO.B).W(jLongValue);
                        k2VarO.b();
                        ((com.google.android.gms.internal.measurement.n2) k2VarO.B).w().clear();
                        HashMap mapD2 = D(a3Var);
                        k2VarO.b();
                        ((com.google.android.gms.internal.measurement.n2) k2VarO.B).w().putAll(mapD2);
                    }
                }
            }
        }
        if (!((com.google.android.gms.internal.measurement.n2) k2VarO.e()).equals(com.google.android.gms.internal.measurement.n2.P())) {
            com.google.android.gms.internal.measurement.n2 n2Var = (com.google.android.gms.internal.measurement.n2) k2VarO.e();
            h3Var.b();
            ((com.google.android.gms.internal.measurement.i3) h3Var.B).k1(n2Var);
        }
        byte[] bArrA = ((com.google.android.gms.internal.measurement.n2) k2VarO.e()).a();
        e1 e1Var2 = h1Var.G;
        h1.g(e1Var2);
        e1Var2.V0();
        u0Var.Q |= u0Var.H != bArrA;
        u0Var.H = bArrA;
        if (u0Var.o()) {
            m mVar = this.C;
            R(mVar);
            mVar.Y1(u0Var, false);
        }
        if (b0().f1(null, b0.f14562f1)) {
            m mVar2 = this.C;
            R(mVar2);
            mVar2.N1(u0Var.D(), "_lgclid");
        }
    }

    public final e4 i0() {
        h1 h1Var = this.L;
        com.google.android.gms.common.internal.d0.h(h1Var);
        e4 e4Var = h1Var.I;
        h1.e(e4Var);
        return e4Var;
    }

    public final String j(t1 t1Var) {
        if (!t1Var.i(s1.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        i0().S1().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final void j0() {
        if (!this.M.get()) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    public final void k(ArrayList arrayList) {
        com.google.android.gms.common.internal.d0.b(!arrayList.isEmpty());
        if (this.Y != null) {
            t().G.b("Set uploading progress before finishing the previous upload");
        } else {
            this.Y = new ArrayList(arrayList);
        }
    }

    @Override
    public final ve.a k0() {
        h1 h1Var = this.L;
        com.google.android.gms.common.internal.d0.h(h1Var);
        return h1Var.K;
    }

    public final void l() {
        SQLiteException e3;
        u0 u0VarX1;
        C().V0();
        j0();
        this.V = true;
        try {
            h1 h1Var = this.L;
            h1Var.getClass();
            Boolean bool = h1Var.j().F;
            if (bool == null) {
                t().J.b("Upload data called on the client side before use of service was decided");
            } else if (bool.booleanValue()) {
                t().G.b("Upload called in the client side when service should be used");
            } else if (this.O > 0) {
                K();
            } else {
                C().V0();
                if (this.Y != null) {
                    t().O.b("Uploading requested multiple times");
                } else {
                    t0 t0Var = this.B;
                    R(t0Var);
                    if (t0Var.p1()) {
                        ((ve.b) k0()).getClass();
                        ?? CurrentTimeMillis = System.currentTimeMillis();
                        ?? r7 = 0;
                        cursorRawQuery = null;
                        Cursor cursorRawQuery = null;
                        string = null;
                        string = null;
                        String string = null;
                        int iD1 = b0().d1(null, b0.f14570i0);
                        b0();
                        long jLongValue = CurrentTimeMillis - ((Long) b0.f14557e.a(null)).longValue();
                        for (int i10 = 0; i10 < iD1 && F(jLongValue, null); i10++) {
                        }
                        m8.a();
                        C().V0();
                        E();
                        long jE = this.I.I.e();
                        if (jE != 0) {
                            t().N.c(Long.valueOf(Math.abs(CurrentTimeMillis - jE)), "Uploading events. Elapsed time since last upload attempt (ms)");
                        }
                        m mVar = this.C;
                        R(mVar);
                        String strD1 = mVar.d1();
                        long j9 = -1;
                        if (TextUtils.isEmpty(strD1)) {
                            try {
                                this.f14768a0 = -1L;
                                m mVar2 = this.C;
                                R(mVar2);
                                b0();
                                long jLongValue2 = CurrentTimeMillis - ((Long) b0.f14557e.a(null)).longValue();
                                mVar2.V0();
                                mVar2.W0();
                                try {
                                    CurrentTimeMillis = mVar2.K1().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(jLongValue2)});
                                    try {
                                        if (CurrentTimeMillis.moveToFirst()) {
                                            string = CurrentTimeMillis.getString(0);
                                        } else {
                                            q0 q0Var = ((h1) mVar2.B).F;
                                            h1.g(q0Var);
                                            q0Var.O.b("No expired configs for apps with pending events");
                                        }
                                    } catch (SQLiteException e10) {
                                        e3 = e10;
                                        q0 q0Var2 = ((h1) mVar2.B).F;
                                        h1.g(q0Var2);
                                        q0Var2.G.c(e3, "Error selecting expired configs");
                                        if (CurrentTimeMillis != 0) {
                                        }
                                        if (!TextUtils.isEmpty(string)) {
                                            m mVar3 = this.C;
                                            R(mVar3);
                                            u0VarX1 = mVar3.X1(string);
                                            if (u0VarX1 != null) {
                                                v(u0VarX1);
                                            }
                                        }
                                        this.V = false;
                                        L();
                                    }
                                } catch (SQLiteException e11) {
                                    e3 = e11;
                                    CurrentTimeMillis = 0;
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (r7 != 0) {
                                        r7.close();
                                    }
                                    throw th;
                                }
                                CurrentTimeMillis.close();
                                if (!TextUtils.isEmpty(string)) {
                                    m mVar4 = this.C;
                                    R(mVar4);
                                    u0VarX1 = mVar4.X1(string);
                                    if (u0VarX1 != null) {
                                        v(u0VarX1);
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                r7 = CurrentTimeMillis;
                            }
                        } else {
                            if (this.f14768a0 == -1) {
                                m mVar5 = this.C;
                                R(mVar5);
                                try {
                                    try {
                                        cursorRawQuery = mVar5.K1().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                        if (cursorRawQuery.moveToFirst()) {
                                            j9 = cursorRawQuery.getLong(0);
                                        }
                                    } catch (SQLiteException e12) {
                                        q0 q0Var3 = ((h1) mVar5.B).F;
                                        h1.g(q0Var3);
                                        q0Var3.G.c(e12, "Error querying raw events");
                                        if (cursorRawQuery != null) {
                                        }
                                        this.f14768a0 = j9;
                                        m(CurrentTimeMillis, strD1);
                                        this.V = false;
                                        L();
                                    }
                                    cursorRawQuery.close();
                                    this.f14768a0 = j9;
                                } catch (Throwable th4) {
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    throw th4;
                                }
                            }
                            m(CurrentTimeMillis, strD1);
                        }
                    } else {
                        t().O.b("Network not connected, ignoring upload request");
                        K();
                    }
                }
            }
            this.V = false;
            L();
        } catch (Throwable th5) {
            this.V = false;
            L();
            throw th5;
        }
    }

    public final void l0(g4 g4Var) throws Throwable {
        C().V0();
        j0();
        String str = g4Var.A;
        com.google.android.gms.common.internal.d0.e(str);
        t1 t1VarC = t1.c(g4Var.X, g4Var.S);
        a(str);
        t().O.d("Setting storage consent for package", str, t1VarC);
        C().V0();
        j0();
        this.f14769b0.put(str, t1VarC);
        m mVar = this.C;
        R(mVar);
        mVar.q1(str, t1VarC);
    }

    public final void m(long j9, String str) throws Throwable {
        ?? r14;
        long j10;
        Cursor cursorQuery;
        ?? r22;
        List list;
        ?? r23;
        List<Pair> list2;
        l7 l7Var;
        a0 a0Var;
        boolean zF1;
        s1 s1Var;
        int i10;
        List list3;
        t1 t1VarA;
        s1 s1Var2;
        int i11;
        List listSubList;
        com.google.android.gms.internal.measurement.f3 f3VarW;
        int size;
        ArrayList arrayList;
        int i12;
        boolean zI;
        boolean zI2;
        boolean zF2;
        v3 v3Var;
        u3 u3VarW0;
        List list4;
        h1 h1Var;
        com.google.android.gms.internal.measurement.g3 g3Var;
        ArrayList arrayList2;
        p2 p2Var;
        boolean z10;
        Iterator it;
        String string;
        com.google.android.gms.internal.measurement.f3 f3VarX;
        String strI1;
        ArrayList arrayList3;
        Iterator it2;
        String strH;
        com.google.android.gms.internal.measurement.g3 g3Var2;
        String str2;
        com.google.android.gms.internal.measurement.f3 f3Var;
        int i13;
        Intent intent;
        Context contextE0;
        com.google.android.gms.internal.measurement.f3 f3VarW2;
        String strI2;
        boolean zIsEmpty;
        p2 p2Var2;
        p2 p2Var3;
        u3 u3Var;
        t0 t0Var;
        String strY1;
        com.google.android.gms.internal.measurement.h3 h3Var;
        String strV;
        int i14;
        ArrayList arrayList4;
        Iterator it3;
        int i15;
        Long lValueOf;
        Long lValueOf2;
        boolean z11;
        boolean z12;
        boolean z13;
        List list5;
        boolean z14;
        com.google.android.gms.internal.measurement.a3 a3Var;
        com.google.android.gms.internal.measurement.d3 d3VarD1;
        com.google.android.gms.internal.measurement.d3 d3VarD2;
        com.google.android.gms.internal.measurement.p3 p3VarB;
        Iterator it4;
        String strV2;
        int i16;
        com.google.android.gms.internal.measurement.i3 i3Var;
        com.google.android.gms.internal.measurement.i3 i3Var2;
        List list6;
        boolean zIsEmpty2;
        ArrayList arrayList5;
        h1 h1Var2;
        ArrayList arrayList6;
        ?? r15;
        h1 h1Var3;
        Cursor cursorQuery2;
        List list7;
        Iterator it5;
        boolean z15;
        com.google.android.gms.internal.measurement.h3 h3Var2;
        com.google.android.gms.internal.measurement.z1 z1VarQ1;
        ArrayList arrayList7;
        Iterator it6;
        int iP;
        Iterator it7;
        int i17;
        int i18;
        int iR;
        SQLiteDatabase sQLiteDatabaseK1;
        long jCurrentTimeMillis;
        ?? r24;
        ?? r25;
        long jV;
        long jV2;
        String str3 = str;
        int iD1 = b0().d1(str3, b0.f14566h);
        int i19 = 0;
        int iMax = Math.max(0, b0().d1(str3, b0.f14569i));
        m mVarD0 = d0();
        h1 h1Var4 = (h1) mVarD0.B;
        mVarD0.V0();
        mVarD0.W0();
        int i20 = 1;
        com.google.android.gms.common.internal.d0.b(iD1 > 0);
        ?? r11 = iMax > 0 ? 1 : 0;
        com.google.android.gms.common.internal.d0.b(r11);
        com.google.android.gms.common.internal.d0.e(str3);
        try {
            try {
                try {
                    j10 = -1;
                    try {
                        r22 = "rowid";
                        cursorQuery = mVarD0.K1().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str3}, null, null, "rowid", String.valueOf(iD1));
                        try {
                            if (cursorQuery.moveToFirst()) {
                                ArrayList arrayList8 = new ArrayList();
                                int length = 0;
                                ?? r10 = mVarD0;
                                while (true) {
                                    long j11 = cursorQuery.getLong(i19);
                                    try {
                                        byte[] blob = cursorQuery.getBlob(i20);
                                        t0 t0VarH0 = r10.C.h0();
                                        try {
                                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
                                            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                            byte[] bArr = new byte[1024];
                                            r22 = r10;
                                            while (true) {
                                                try {
                                                    int i21 = gZIPInputStream.read(bArr);
                                                    if (i21 <= 0) {
                                                        break;
                                                    }
                                                    h1Var4 = h1Var4;
                                                    try {
                                                        byteArrayOutputStream.write(bArr, 0, i21);
                                                        h1Var4 = h1Var4;
                                                    } catch (IOException e3) {
                                                        e = e3;
                                                    }
                                                } catch (IOException e10) {
                                                    e = e10;
                                                    h1Var4 = h1Var4;
                                                }
                                                try {
                                                    ((h1) t0VarH0.B).t().Z0().c(e, "Failed to ungzip content");
                                                    throw e;
                                                } catch (IOException e11) {
                                                    e = e11;
                                                    h1Var4.t().Z0().d("Failed to unzip queued bundle. appId", q0.d1(str3), e);
                                                    r22 = r22;
                                                    try {
                                                        if (cursorQuery.moveToNext()) {
                                                            break;
                                                        } else {
                                                            break;
                                                        }
                                                        cursorQuery.close();
                                                        list2 = arrayList8;
                                                        r23 = r22;
                                                    } catch (SQLiteException e12) {
                                                        e = e12;
                                                        h1Var4.t().Z0().d("Error querying bundles. appId", q0.d1(str3), e);
                                                        list = Collections.EMPTY_LIST;
                                                        r25 = r22;
                                                        r24 = r22;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                            r24 = r25;
                                                        }
                                                        list2 = list;
                                                        r23 = r24;
                                                    }
                                                    if (list2.isEmpty()) {
                                                        return;
                                                    }
                                                    l7Var = l7.B;
                                                    g gVarB0 = b0();
                                                    a0Var = b0.f14568h1;
                                                    zF1 = gVarB0.f1(null, a0Var);
                                                    s1Var = s1.ANALYTICS_STORAGE;
                                                    if (zF1) {
                                                        if (!b0().f1(null, a0Var)) {
                                                            i10 = 34;
                                                            list6 = list2;
                                                        } else if (a(str3).i(s1Var)) {
                                                            i10 = 34;
                                                            arrayList5 = new ArrayList(list2.size());
                                                            m mVarD1 = d0();
                                                            h1Var2 = (h1) mVarD1.B;
                                                            com.google.android.gms.common.internal.d0.e(str3);
                                                            mVarD1.V0();
                                                            mVarD1.W0();
                                                            arrayList6 = new ArrayList();
                                                            sQLiteDatabaseK1 = mVarD1.K1();
                                                            ((ve.b) h1Var2.k0()).getClass();
                                                            jCurrentTimeMillis = System.currentTimeMillis();
                                                            cursorQuery2 = sQLiteDatabaseK1.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)}, null, null, "rowid", null);
                                                            if (cursorQuery2.moveToFirst()) {
                                                                h1Var3 = h1Var2;
                                                                while (true) {
                                                                    arrayList6.add((com.google.android.gms.internal.measurement.a3) ((com.google.android.gms.internal.measurement.z2) t0.I1(com.google.android.gms.internal.measurement.a3.z(), cursorQuery2.getBlob(0))).e());
                                                                    if (!cursorQuery2.moveToNext()) {
                                                                        break;
                                                                        break;
                                                                    } else {
                                                                        cursorQuery2 = cursorQuery2;
                                                                        arrayList6 = arrayList6;
                                                                    }
                                                                }
                                                                cursorQuery2.close();
                                                                int iDelete = sQLiteDatabaseK1.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)});
                                                                b50.b bVarC1 = h1Var3.t().c1();
                                                                StringBuilder sb2 = new StringBuilder(String.valueOf(iDelete).length() + 34);
                                                                sb2.append("Pruned ");
                                                                sb2.append(iDelete);
                                                                sb2.append(" NO_DATA mode events. appId");
                                                                bVarC1.c(str3, sb2.toString());
                                                            } else {
                                                                arrayList6 = arrayList6;
                                                                cursorQuery2.close();
                                                            }
                                                            list7 = arrayList6;
                                                            it5 = list2.iterator();
                                                            z15 = true;
                                                            while (it5.hasNext()) {
                                                                Pair pair = (Pair) it5.next();
                                                                h3Var2 = (com.google.android.gms.internal.measurement.h3) ((com.google.android.gms.internal.measurement.i3) pair.first).i();
                                                                if (z15) {
                                                                    List listX = h3Var2.X();
                                                                    h3Var2.b();
                                                                    ((com.google.android.gms.internal.measurement.i3) h3Var2.B).a0();
                                                                    h3Var2.b();
                                                                    ((com.google.android.gms.internal.measurement.i3) h3Var2.B).Z(list7);
                                                                    h3Var2.b();
                                                                    ((com.google.android.gms.internal.measurement.i3) h3Var2.B).Z(listX);
                                                                    z15 = false;
                                                                }
                                                                com.google.android.gms.internal.measurement.t2 t2VarQ = com.google.android.gms.internal.measurement.w2.q();
                                                                z1VarQ1 = c0().q1(str3);
                                                                arrayList7 = new ArrayList();
                                                                if (z1VarQ1 != null) {
                                                                    it6 = z1VarQ1.p().iterator();
                                                                    while (it6.hasNext()) {
                                                                        com.google.android.gms.internal.measurement.w1 w1Var = (com.google.android.gms.internal.measurement.w1) it6.next();
                                                                        Iterator it8 = it5;
                                                                        com.google.android.gms.internal.measurement.u2 u2VarP = com.google.android.gms.internal.measurement.v2.p();
                                                                        boolean z16 = z15;
                                                                        iP = w1Var.p() - 1;
                                                                        List list8 = list7;
                                                                        if (iP != 1) {
                                                                            it7 = it6;
                                                                            i17 = 3;
                                                                            i18 = 2;
                                                                        } else if (iP != 2) {
                                                                            it7 = it6;
                                                                            i17 = 3;
                                                                            if (iP != 3) {
                                                                                i18 = 4;
                                                                            } else if (iP != 4) {
                                                                                i18 = 1;
                                                                            } else {
                                                                                i18 = 5;
                                                                            }
                                                                        } else {
                                                                            it7 = it6;
                                                                            i17 = 3;
                                                                            i18 = 3;
                                                                        }
                                                                        u2VarP.h(i18);
                                                                        iR = w1Var.r() - 1;
                                                                        if (iR != 1) {
                                                                            i17 = 2;
                                                                        } else if (iR != 2) {
                                                                            i17 = 1;
                                                                        }
                                                                        u2VarP.j(i17);
                                                                        arrayList7.add((com.google.android.gms.internal.measurement.v2) u2VarP.e());
                                                                        it5 = it8;
                                                                        list7 = list8;
                                                                        z15 = z16;
                                                                        it6 = it7;
                                                                    }
                                                                }
                                                                Iterator it9 = it5;
                                                                boolean z17 = z15;
                                                                List list9 = list7;
                                                                t2VarQ.h(arrayList7);
                                                                h3Var2.H(t2VarQ);
                                                                arrayList5.add(Pair.create((com.google.android.gms.internal.measurement.i3) h3Var2.e(), (Long) pair.second));
                                                                it5 = it9;
                                                                list7 = list9;
                                                                z15 = z17;
                                                            }
                                                            list6 = arrayList5;
                                                        } else {
                                                            i10 = 34;
                                                            arrayList5 = new ArrayList(list2.size());
                                                            m mVarD2 = d0();
                                                            h1Var2 = (h1) mVarD2.B;
                                                            com.google.android.gms.common.internal.d0.e(str3);
                                                            mVarD2.V0();
                                                            mVarD2.W0();
                                                            arrayList6 = new ArrayList();
                                                            try {
                                                                try {
                                                                    try {
                                                                        sQLiteDatabaseK1 = mVarD2.K1();
                                                                        ((ve.b) h1Var2.k0()).getClass();
                                                                        jCurrentTimeMillis = System.currentTimeMillis();
                                                                        cursorQuery2 = sQLiteDatabaseK1.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)}, null, null, "rowid", null);
                                                                        try {
                                                                            try {
                                                                                if (cursorQuery2.moveToFirst()) {
                                                                                    h1Var3 = h1Var2;
                                                                                    while (true) {
                                                                                        try {
                                                                                            try {
                                                                                                arrayList6.add((com.google.android.gms.internal.measurement.a3) ((com.google.android.gms.internal.measurement.z2) t0.I1(com.google.android.gms.internal.measurement.a3.z(), cursorQuery2.getBlob(0))).e());
                                                                                            } catch (SQLiteException e13) {
                                                                                                e = e13;
                                                                                                cursorQuery2 = cursorQuery2;
                                                                                                h1Var3.t().Z0().d("Error flushing NO_DATA mode events. appId", q0.d1(str3), e);
                                                                                                list7 = Collections.EMPTY_LIST;
                                                                                                if (cursorQuery2 != null) {
                                                                                                    cursorQuery2.close();
                                                                                                }
                                                                                                it5 = list2.iterator();
                                                                                                z15 = true;
                                                                                                while (it5.hasNext()) {
                                                                                                    Pair pair2 = (Pair) it5.next();
                                                                                                    h3Var2 = (com.google.android.gms.internal.measurement.h3) ((com.google.android.gms.internal.measurement.i3) pair2.first).i();
                                                                                                    if (z15) {
                                                                                                        List listX2 = h3Var2.X();
                                                                                                        h3Var2.b();
                                                                                                        ((com.google.android.gms.internal.measurement.i3) h3Var2.B).a0();
                                                                                                        h3Var2.b();
                                                                                                        ((com.google.android.gms.internal.measurement.i3) h3Var2.B).Z(list7);
                                                                                                        h3Var2.b();
                                                                                                        ((com.google.android.gms.internal.measurement.i3) h3Var2.B).Z(listX2);
                                                                                                        z15 = false;
                                                                                                    }
                                                                                                    com.google.android.gms.internal.measurement.t2 t2VarQ2 = com.google.android.gms.internal.measurement.w2.q();
                                                                                                    z1VarQ1 = c0().q1(str3);
                                                                                                    arrayList7 = new ArrayList();
                                                                                                    if (z1VarQ1 != null) {
                                                                                                        it6 = z1VarQ1.p().iterator();
                                                                                                        while (it6.hasNext()) {
                                                                                                            com.google.android.gms.internal.measurement.w1 w1Var2 = (com.google.android.gms.internal.measurement.w1) it6.next();
                                                                                                            Iterator it10 = it5;
                                                                                                            com.google.android.gms.internal.measurement.u2 u2VarP2 = com.google.android.gms.internal.measurement.v2.p();
                                                                                                            boolean z18 = z15;
                                                                                                            iP = w1Var2.p() - 1;
                                                                                                            List list10 = list7;
                                                                                                            if (iP != 1) {
                                                                                                                it7 = it6;
                                                                                                                i17 = 3;
                                                                                                                i18 = 2;
                                                                                                            } else if (iP != 2) {
                                                                                                                it7 = it6;
                                                                                                                i17 = 3;
                                                                                                                if (iP != 3) {
                                                                                                                    i18 = 4;
                                                                                                                } else if (iP != 4) {
                                                                                                                    i18 = 1;
                                                                                                                } else {
                                                                                                                    i18 = 5;
                                                                                                                }
                                                                                                            } else {
                                                                                                                it7 = it6;
                                                                                                                i17 = 3;
                                                                                                                i18 = 3;
                                                                                                            }
                                                                                                            u2VarP2.h(i18);
                                                                                                            iR = w1Var2.r() - 1;
                                                                                                            if (iR != 1) {
                                                                                                                i17 = 2;
                                                                                                            } else if (iR != 2) {
                                                                                                                i17 = 1;
                                                                                                            }
                                                                                                            u2VarP2.j(i17);
                                                                                                            arrayList7.add((com.google.android.gms.internal.measurement.v2) u2VarP2.e());
                                                                                                            it5 = it10;
                                                                                                            list7 = list10;
                                                                                                            z15 = z18;
                                                                                                            it6 = it7;
                                                                                                        }
                                                                                                    }
                                                                                                    Iterator it11 = it5;
                                                                                                    boolean z19 = z15;
                                                                                                    List list11 = list7;
                                                                                                    t2VarQ2.h(arrayList7);
                                                                                                    h3Var2.H(t2VarQ2);
                                                                                                    arrayList5.add(Pair.create((com.google.android.gms.internal.measurement.i3) h3Var2.e(), (Long) pair2.second));
                                                                                                    it5 = it11;
                                                                                                    list7 = list11;
                                                                                                    z15 = z19;
                                                                                                }
                                                                                                list6 = arrayList5;
                                                                                                zIsEmpty2 = list6.isEmpty();
                                                                                                list3 = list6;
                                                                                                if (zIsEmpty2) {
                                                                                                    return;
                                                                                                }
                                                                                                t1VarA = a(str3);
                                                                                                s1Var2 = s1.AD_STORAGE;
                                                                                                if (t1VarA.i(s1Var2)) {
                                                                                                    i11 = 0;
                                                                                                    listSubList = list3;
                                                                                                    break;
                                                                                                }
                                                                                                it4 = list3.iterator();
                                                                                                while (true) {
                                                                                                    if (it4.hasNext()) {
                                                                                                        strV2 = null;
                                                                                                        break;
                                                                                                    }
                                                                                                    i3Var2 = (com.google.android.gms.internal.measurement.i3) ((Pair) it4.next()).first;
                                                                                                    if (!i3Var2.v().isEmpty()) {
                                                                                                        strV2 = i3Var2.v();
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                if (strV2 != null) {
                                                                                                    i11 = 0;
                                                                                                    listSubList = list3;
                                                                                                    break;
                                                                                                }
                                                                                                i16 = 0;
                                                                                                while (true) {
                                                                                                    if (i16 < list3.size()) {
                                                                                                        i11 = 0;
                                                                                                        listSubList = list3;
                                                                                                        break;
                                                                                                    }
                                                                                                    i3Var = (com.google.android.gms.internal.measurement.i3) ((Pair) list3.get(i16)).first;
                                                                                                    if (!i3Var.v().isEmpty()) {
                                                                                                        i11 = 0;
                                                                                                        listSubList = list3.subList(0, i16);
                                                                                                        break;
                                                                                                    }
                                                                                                    i16++;
                                                                                                }
                                                                                                f3VarW = com.google.android.gms.internal.measurement.g3.w();
                                                                                                size = listSubList.size();
                                                                                                arrayList = new ArrayList(listSubList.size());
                                                                                                if (b0().W0(str3)) {
                                                                                                    i12 = i11;
                                                                                                } else {
                                                                                                    i12 = i11;
                                                                                                }
                                                                                                zI = a(str3).i(s1Var2);
                                                                                                zI2 = a(str3).i(s1Var);
                                                                                                zF2 = b0().f1(str3, b0.M0);
                                                                                                v3Var = this.J;
                                                                                                u3VarW0 = v3Var.W0(str3);
                                                                                                list4 = listSubList;
                                                                                                while (true) {
                                                                                                    h1Var = this.L;
                                                                                                    if (i11 < size) {
                                                                                                        break;
                                                                                                    }
                                                                                                    h3Var = (com.google.android.gms.internal.measurement.h3) ((com.google.android.gms.internal.measurement.i3) ((Pair) list4.get(i11)).first).i();
                                                                                                    int i22 = size;
                                                                                                    arrayList.add((Long) ((Pair) list4.get(i11)).second);
                                                                                                    b0().a1();
                                                                                                    h3Var.v();
                                                                                                    h3Var.b();
                                                                                                    ((com.google.android.gms.internal.measurement.i3) h3Var.B).f0(j9);
                                                                                                    h1Var.getClass();
                                                                                                    h3Var.L();
                                                                                                    if (i12 == 0) {
                                                                                                        h3Var.b();
                                                                                                        ((com.google.android.gms.internal.measurement.i3) h3Var.B).S0();
                                                                                                    }
                                                                                                    if (!zI) {
                                                                                                        h3Var.b();
                                                                                                        ((com.google.android.gms.internal.measurement.i3) h3Var.B).z1();
                                                                                                        h3Var.b();
                                                                                                        ((com.google.android.gms.internal.measurement.i3) h3Var.B).B1();
                                                                                                    }
                                                                                                    if (!zI2) {
                                                                                                        h3Var.b();
                                                                                                        ((com.google.android.gms.internal.measurement.i3) h3Var.B).D1();
                                                                                                    }
                                                                                                    q(h3Var, str3);
                                                                                                    if (!zF2) {
                                                                                                        h3Var.b();
                                                                                                        ((com.google.android.gms.internal.measurement.i3) h3Var.B).Z0();
                                                                                                    }
                                                                                                    if (!zI2) {
                                                                                                        h3Var.b();
                                                                                                        ((com.google.android.gms.internal.measurement.i3) h3Var.B).L1();
                                                                                                    }
                                                                                                    strV = ((com.google.android.gms.internal.measurement.i3) h3Var.B).v();
                                                                                                    if (TextUtils.isEmpty(strV)) {
                                                                                                        i14 = i12;
                                                                                                    } else {
                                                                                                        i14 = i12;
                                                                                                        if (strV.equals("00000000-0000-0000-0000-000000000000")) {
                                                                                                            i15 = i11;
                                                                                                            z13 = zI2;
                                                                                                            list5 = list4;
                                                                                                            z14 = zF2;
                                                                                                        }
                                                                                                        if (h3Var.Y() != 0) {
                                                                                                            if (b0().f1(str3, b0.C0)) {
                                                                                                                h3Var.S(h0().G1(((com.google.android.gms.internal.measurement.i3) h3Var.e()).a()));
                                                                                                            }
                                                                                                            p3VarB = u3VarW0.b();
                                                                                                            if (p3VarB != null) {
                                                                                                                h3Var.E(p3VarB);
                                                                                                            }
                                                                                                            f3VarW.b();
                                                                                                            ((com.google.android.gms.internal.measurement.g3) f3VarW.B).z((com.google.android.gms.internal.measurement.i3) h3Var.e());
                                                                                                        }
                                                                                                        i11 = i15 + 1;
                                                                                                        i12 = i14;
                                                                                                        size = i22;
                                                                                                        list4 = list5;
                                                                                                        zI2 = z13;
                                                                                                        zF2 = z14;
                                                                                                    }
                                                                                                    arrayList4 = new ArrayList(h3Var.X());
                                                                                                    it3 = arrayList4.iterator();
                                                                                                    i15 = i11;
                                                                                                    lValueOf = null;
                                                                                                    lValueOf2 = null;
                                                                                                    z11 = false;
                                                                                                    z12 = false;
                                                                                                    while (it3.hasNext()) {
                                                                                                        zI2 = zI2;
                                                                                                        a3Var = (com.google.android.gms.internal.measurement.a3) it3.next();
                                                                                                        list4 = list4;
                                                                                                        zF2 = zF2;
                                                                                                        if ("_fx".equals(a3Var.s())) {
                                                                                                            it3.remove();
                                                                                                            z11 = true;
                                                                                                        } else if ("_f".equals(a3Var.s())) {
                                                                                                            h0();
                                                                                                            d3VarD1 = t0.d1(a3Var, "_pfo");
                                                                                                            if (d3VarD1 != null) {
                                                                                                                lValueOf = Long.valueOf(d3VarD1.u());
                                                                                                            }
                                                                                                            h0();
                                                                                                            d3VarD2 = t0.d1(a3Var, "_uwa");
                                                                                                            if (d3VarD2 != null) {
                                                                                                                lValueOf2 = Long.valueOf(d3VarD2.u());
                                                                                                            }
                                                                                                        } else {
                                                                                                            list4 = list4;
                                                                                                            zI2 = zI2;
                                                                                                            zF2 = zF2;
                                                                                                        }
                                                                                                        z12 = true;
                                                                                                    }
                                                                                                    z13 = zI2;
                                                                                                    list5 = list4;
                                                                                                    z14 = zF2;
                                                                                                    if (z11) {
                                                                                                        h3Var.b();
                                                                                                        ((com.google.android.gms.internal.measurement.i3) h3Var.B).a0();
                                                                                                        h3Var.b();
                                                                                                        ((com.google.android.gms.internal.measurement.i3) h3Var.B).Z(arrayList4);
                                                                                                    }
                                                                                                    if (z12) {
                                                                                                        p(h3Var.q(), true, lValueOf, lValueOf2);
                                                                                                    }
                                                                                                    if (h3Var.Y() != 0) {
                                                                                                        if (b0().f1(str3, b0.C0)) {
                                                                                                            h3Var.S(h0().G1(((com.google.android.gms.internal.measurement.i3) h3Var.e()).a()));
                                                                                                        }
                                                                                                        p3VarB = u3VarW0.b();
                                                                                                        if (p3VarB != null) {
                                                                                                            h3Var.E(p3VarB);
                                                                                                        }
                                                                                                        f3VarW.b();
                                                                                                        ((com.google.android.gms.internal.measurement.g3) f3VarW.B).z((com.google.android.gms.internal.measurement.i3) h3Var.e());
                                                                                                    }
                                                                                                    i11 = i15 + 1;
                                                                                                    i12 = i14;
                                                                                                    size = i22;
                                                                                                    list4 = list5;
                                                                                                    zI2 = z13;
                                                                                                    zF2 = z14;
                                                                                                }
                                                                                                if (((com.google.android.gms.internal.measurement.g3) f3VarW.B).q() == 0) {
                                                                                                    k(arrayList);
                                                                                                    u(false, 204, null, null, str3, Collections.EMPTY_LIST);
                                                                                                    return;
                                                                                                }
                                                                                                g3Var = (com.google.android.gms.internal.measurement.g3) f3VarW.e();
                                                                                                arrayList2 = new ArrayList();
                                                                                                p2Var = u3VarW0.f14740c;
                                                                                                if (p2Var == p2.SGTM_CLIENT) {
                                                                                                    z10 = true;
                                                                                                } else {
                                                                                                    z10 = false;
                                                                                                }
                                                                                                if (p2Var == p2.SGTM) {
                                                                                                    it = ((com.google.android.gms.internal.measurement.g3) f3VarW.e()).p().iterator();
                                                                                                    while (true) {
                                                                                                        if (it.hasNext()) {
                                                                                                            if (((com.google.android.gms.internal.measurement.i3) it.next()).N()) {
                                                                                                                string = UUID.randomUUID().toString();
                                                                                                                break;
                                                                                                            }
                                                                                                        } else {
                                                                                                            string = null;
                                                                                                            break;
                                                                                                        }
                                                                                                    }
                                                                                                    com.google.android.gms.internal.measurement.g3 g3Var3 = (com.google.android.gms.internal.measurement.g3) f3VarW.e();
                                                                                                    C().V0();
                                                                                                    j0();
                                                                                                    f3VarX = com.google.android.gms.internal.measurement.g3.x(g3Var3);
                                                                                                    if (!TextUtils.isEmpty(string)) {
                                                                                                        f3VarX.b();
                                                                                                        ((com.google.android.gms.internal.measurement.g3) f3VarX.B).C(string);
                                                                                                    }
                                                                                                    strI1 = c0().i1(str3);
                                                                                                    if (!TextUtils.isEmpty(strI1)) {
                                                                                                        f3VarX.j(strI1);
                                                                                                    }
                                                                                                    arrayList3 = new ArrayList();
                                                                                                    it2 = g3Var3.p().iterator();
                                                                                                    while (it2.hasNext()) {
                                                                                                        com.google.android.gms.internal.measurement.h3 h3VarV = com.google.android.gms.internal.measurement.i3.V((com.google.android.gms.internal.measurement.i3) it2.next());
                                                                                                        h3VarV.b();
                                                                                                        ((com.google.android.gms.internal.measurement.i3) h3VarV.B).S0();
                                                                                                        arrayList3.add((com.google.android.gms.internal.measurement.i3) h3VarV.e());
                                                                                                    }
                                                                                                    f3VarX.b();
                                                                                                    ((com.google.android.gms.internal.measurement.g3) f3VarX.B).B();
                                                                                                    f3VarX.b();
                                                                                                    ((com.google.android.gms.internal.measurement.g3) f3VarX.B).A(arrayList3);
                                                                                                    b50.b bVarC2 = t().c1();
                                                                                                    if (TextUtils.isEmpty(string)) {
                                                                                                        strH = "null";
                                                                                                    } else {
                                                                                                        strH = f3VarX.h();
                                                                                                    }
                                                                                                    bVarC2.c(strH, "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
                                                                                                    g3Var2 = (com.google.android.gms.internal.measurement.g3) f3VarX.e();
                                                                                                    if (TextUtils.isEmpty(string)) {
                                                                                                        str2 = null;
                                                                                                    } else {
                                                                                                        com.google.android.gms.internal.measurement.g3 g3Var4 = (com.google.android.gms.internal.measurement.g3) f3VarW.e();
                                                                                                        C().V0();
                                                                                                        j0();
                                                                                                        f3VarW2 = com.google.android.gms.internal.measurement.g3.w();
                                                                                                        t().c1().c(string, "[sgtm] Processing Google Signal, sgtmJoinId:");
                                                                                                        f3VarW2.b();
                                                                                                        ((com.google.android.gms.internal.measurement.g3) f3VarW2.B).C(string);
                                                                                                        for (com.google.android.gms.internal.measurement.i3 i3Var3 : g3Var4.p()) {
                                                                                                            com.google.android.gms.internal.measurement.h3 h3VarU = com.google.android.gms.internal.measurement.i3.U();
                                                                                                            String strO = i3Var3.O();
                                                                                                            h3VarU.b();
                                                                                                            ((com.google.android.gms.internal.measurement.i3) h3VarU.B).R0(strO);
                                                                                                            int iK0 = i3Var3.K0();
                                                                                                            h3VarU.b();
                                                                                                            ((com.google.android.gms.internal.measurement.i3) h3VarU.B).j1(iK0);
                                                                                                            f3VarW2.b();
                                                                                                            ((com.google.android.gms.internal.measurement.g3) f3VarW2.B).z((com.google.android.gms.internal.measurement.i3) h3VarU.e());
                                                                                                        }
                                                                                                        com.google.android.gms.internal.measurement.g3 g3Var5 = (com.google.android.gms.internal.measurement.g3) f3VarW2.e();
                                                                                                        strI2 = v3Var.C.c0().i1(str3);
                                                                                                        zIsEmpty = TextUtils.isEmpty(strI2);
                                                                                                        p2Var2 = p2.GOOGLE_SIGNAL;
                                                                                                        p2Var3 = p2.GOOGLE_SIGNAL_PENDING;
                                                                                                        if (zIsEmpty) {
                                                                                                            str2 = null;
                                                                                                            String str4 = (String) b0.f14590s.a(null);
                                                                                                            if (z10) {
                                                                                                                p2Var2 = p2Var3;
                                                                                                            }
                                                                                                            u3Var = new u3(str4, Collections.EMPTY_MAP, p2Var2, null);
                                                                                                        } else {
                                                                                                            Uri uri = Uri.parse((String) b0.f14590s.a(null));
                                                                                                            Uri.Builder builderBuildUpon = uri.buildUpon();
                                                                                                            String authority = uri.getAuthority();
                                                                                                            StringBuilder sb3 = new StringBuilder(String.valueOf(strI2).length() + 1 + String.valueOf(authority).length());
                                                                                                            sb3.append(strI2);
                                                                                                            sb3.append(".");
                                                                                                            sb3.append(authority);
                                                                                                            builderBuildUpon.authority(sb3.toString());
                                                                                                            String string2 = builderBuildUpon.build().toString();
                                                                                                            if (z10) {
                                                                                                                p2Var2 = p2Var3;
                                                                                                            }
                                                                                                            str2 = null;
                                                                                                            u3Var = new u3(string2, Collections.EMPTY_MAP, p2Var2, null);
                                                                                                        }
                                                                                                        arrayList2.add(Pair.create(g3Var5, u3Var));
                                                                                                    }
                                                                                                    if (z10) {
                                                                                                        f3Var = (com.google.android.gms.internal.measurement.f3) g3Var2.i();
                                                                                                        for (i13 = 0; i13 < g3Var2.q(); i13++) {
                                                                                                            com.google.android.gms.internal.measurement.h3 h3Var3 = (com.google.android.gms.internal.measurement.h3) g3Var2.r(i13).i();
                                                                                                            h3Var3.d0();
                                                                                                            h3Var3.F(j9);
                                                                                                            f3Var.b();
                                                                                                            ((com.google.android.gms.internal.measurement.g3) f3Var.B).y(i13, (com.google.android.gms.internal.measurement.i3) h3Var3.e());
                                                                                                        }
                                                                                                        arrayList2.add(Pair.create((com.google.android.gms.internal.measurement.g3) f3Var.e(), u3VarW0));
                                                                                                        k(arrayList);
                                                                                                        u(false, 204, null, null, str, arrayList2);
                                                                                                        if (n(str, u3VarW0.a())) {
                                                                                                            t().c1().c(str, "[sgtm] Sending sgtm batches available notification to app");
                                                                                                            intent = new Intent();
                                                                                                            intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                                                                                            intent.setPackage(str);
                                                                                                            contextE0 = h1Var.e0();
                                                                                                            if (Build.VERSION.SDK_INT < i10) {
                                                                                                                contextE0.sendBroadcast(intent);
                                                                                                                return;
                                                                                                            } else {
                                                                                                                contextE0.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                                                                                                return;
                                                                                                            }
                                                                                                        }
                                                                                                        return;
                                                                                                    }
                                                                                                    str3 = str;
                                                                                                    g3Var = g3Var2;
                                                                                                } else if (z10) {
                                                                                                    z10 = true;
                                                                                                    it = ((com.google.android.gms.internal.measurement.g3) f3VarW.e()).p().iterator();
                                                                                                    while (true) {
                                                                                                        if (it.hasNext()) {
                                                                                                            if (((com.google.android.gms.internal.measurement.i3) it.next()).N()) {
                                                                                                                string = UUID.randomUUID().toString();
                                                                                                                break;
                                                                                                            }
                                                                                                        } else {
                                                                                                            string = null;
                                                                                                            break;
                                                                                                        }
                                                                                                    }
                                                                                                    com.google.android.gms.internal.measurement.g3 g3Var6 = (com.google.android.gms.internal.measurement.g3) f3VarW.e();
                                                                                                    C().V0();
                                                                                                    j0();
                                                                                                    f3VarX = com.google.android.gms.internal.measurement.g3.x(g3Var6);
                                                                                                    if (!TextUtils.isEmpty(string)) {
                                                                                                        f3VarX.b();
                                                                                                        ((com.google.android.gms.internal.measurement.g3) f3VarX.B).C(string);
                                                                                                    }
                                                                                                    strI1 = c0().i1(str3);
                                                                                                    if (!TextUtils.isEmpty(strI1)) {
                                                                                                        f3VarX.j(strI1);
                                                                                                    }
                                                                                                    arrayList3 = new ArrayList();
                                                                                                    it2 = g3Var6.p().iterator();
                                                                                                    while (it2.hasNext()) {
                                                                                                        com.google.android.gms.internal.measurement.h3 h3VarV2 = com.google.android.gms.internal.measurement.i3.V((com.google.android.gms.internal.measurement.i3) it2.next());
                                                                                                        h3VarV2.b();
                                                                                                        ((com.google.android.gms.internal.measurement.i3) h3VarV2.B).S0();
                                                                                                        arrayList3.add((com.google.android.gms.internal.measurement.i3) h3VarV2.e());
                                                                                                    }
                                                                                                    f3VarX.b();
                                                                                                    ((com.google.android.gms.internal.measurement.g3) f3VarX.B).B();
                                                                                                    f3VarX.b();
                                                                                                    ((com.google.android.gms.internal.measurement.g3) f3VarX.B).A(arrayList3);
                                                                                                    b50.b bVarC3 = t().c1();
                                                                                                    if (TextUtils.isEmpty(string)) {
                                                                                                        strH = "null";
                                                                                                    } else {
                                                                                                        strH = f3VarX.h();
                                                                                                    }
                                                                                                    bVarC3.c(strH, "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
                                                                                                    g3Var2 = (com.google.android.gms.internal.measurement.g3) f3VarX.e();
                                                                                                    if (TextUtils.isEmpty(string)) {
                                                                                                        com.google.android.gms.internal.measurement.g3 g3Var7 = (com.google.android.gms.internal.measurement.g3) f3VarW.e();
                                                                                                        C().V0();
                                                                                                        j0();
                                                                                                        f3VarW2 = com.google.android.gms.internal.measurement.g3.w();
                                                                                                        t().c1().c(string, "[sgtm] Processing Google Signal, sgtmJoinId:");
                                                                                                        f3VarW2.b();
                                                                                                        ((com.google.android.gms.internal.measurement.g3) f3VarW2.B).C(string);
                                                                                                        while (r0.hasNext()) {
                                                                                                            com.google.android.gms.internal.measurement.h3 h3VarU2 = com.google.android.gms.internal.measurement.i3.U();
                                                                                                            String strO2 = i3Var3.O();
                                                                                                            h3VarU2.b();
                                                                                                            ((com.google.android.gms.internal.measurement.i3) h3VarU2.B).R0(strO2);
                                                                                                            int iK1 = i3Var3.K0();
                                                                                                            h3VarU2.b();
                                                                                                            ((com.google.android.gms.internal.measurement.i3) h3VarU2.B).j1(iK1);
                                                                                                            f3VarW2.b();
                                                                                                            ((com.google.android.gms.internal.measurement.g3) f3VarW2.B).z((com.google.android.gms.internal.measurement.i3) h3VarU2.e());
                                                                                                        }
                                                                                                        com.google.android.gms.internal.measurement.g3 g3Var8 = (com.google.android.gms.internal.measurement.g3) f3VarW2.e();
                                                                                                        strI2 = v3Var.C.c0().i1(str3);
                                                                                                        zIsEmpty = TextUtils.isEmpty(strI2);
                                                                                                        p2Var2 = p2.GOOGLE_SIGNAL;
                                                                                                        p2Var3 = p2.GOOGLE_SIGNAL_PENDING;
                                                                                                        if (zIsEmpty) {
                                                                                                            Uri uri2 = Uri.parse((String) b0.f14590s.a(null));
                                                                                                            Uri.Builder builderBuildUpon2 = uri2.buildUpon();
                                                                                                            String authority2 = uri2.getAuthority();
                                                                                                            StringBuilder sb4 = new StringBuilder(String.valueOf(strI2).length() + 1 + String.valueOf(authority2).length());
                                                                                                            sb4.append(strI2);
                                                                                                            sb4.append(".");
                                                                                                            sb4.append(authority2);
                                                                                                            builderBuildUpon2.authority(sb4.toString());
                                                                                                            String string3 = builderBuildUpon2.build().toString();
                                                                                                            if (z10) {
                                                                                                                p2Var2 = p2Var3;
                                                                                                            }
                                                                                                            str2 = null;
                                                                                                            u3Var = new u3(string3, Collections.EMPTY_MAP, p2Var2, null);
                                                                                                        } else {
                                                                                                            str2 = null;
                                                                                                            String str5 = (String) b0.f14590s.a(null);
                                                                                                            if (z10) {
                                                                                                                p2Var2 = p2Var3;
                                                                                                            }
                                                                                                            u3Var = new u3(str5, Collections.EMPTY_MAP, p2Var2, null);
                                                                                                        }
                                                                                                        arrayList2.add(Pair.create(g3Var8, u3Var));
                                                                                                    } else {
                                                                                                        str2 = null;
                                                                                                    }
                                                                                                    if (z10) {
                                                                                                        f3Var = (com.google.android.gms.internal.measurement.f3) g3Var2.i();
                                                                                                        while (i13 < g3Var2.q()) {
                                                                                                            com.google.android.gms.internal.measurement.h3 h3Var4 = (com.google.android.gms.internal.measurement.h3) g3Var2.r(i13).i();
                                                                                                            h3Var4.d0();
                                                                                                            h3Var4.F(j9);
                                                                                                            f3Var.b();
                                                                                                            ((com.google.android.gms.internal.measurement.g3) f3Var.B).y(i13, (com.google.android.gms.internal.measurement.i3) h3Var4.e());
                                                                                                        }
                                                                                                        arrayList2.add(Pair.create((com.google.android.gms.internal.measurement.g3) f3Var.e(), u3VarW0));
                                                                                                        k(arrayList);
                                                                                                        u(false, 204, null, null, str, arrayList2);
                                                                                                        if (n(str, u3VarW0.a())) {
                                                                                                            t().c1().c(str, "[sgtm] Sending sgtm batches available notification to app");
                                                                                                            intent = new Intent();
                                                                                                            intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                                                                                            intent.setPackage(str);
                                                                                                            contextE0 = h1Var.e0();
                                                                                                            if (Build.VERSION.SDK_INT < i10) {
                                                                                                                contextE0.sendBroadcast(intent);
                                                                                                                return;
                                                                                                            } else {
                                                                                                                contextE0.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                                                                                                return;
                                                                                                            }
                                                                                                        }
                                                                                                        return;
                                                                                                    }
                                                                                                    str3 = str;
                                                                                                    g3Var = g3Var2;
                                                                                                } else {
                                                                                                    str2 = null;
                                                                                                }
                                                                                                t0Var = this.B;
                                                                                                R(t0Var);
                                                                                                if (t0Var.p1()) {
                                                                                                    if (Log.isLoggable(t().f1(), 2)) {
                                                                                                        strY1 = h0().y1(g3Var);
                                                                                                    } else {
                                                                                                        strY1 = str2;
                                                                                                    }
                                                                                                    h0();
                                                                                                    byte[] bArrA = g3Var.a();
                                                                                                    k(arrayList);
                                                                                                    this.I.J.f(j9);
                                                                                                    t().c1().e("Uploading data. app, uncompressed size, data", str3, Integer.valueOf(bArrA.length), strY1);
                                                                                                    this.U = true;
                                                                                                    R(t0Var);
                                                                                                    t0Var.u1(str3, u3VarW0, g3Var, new sd.p1((y3) this, str3, (Object) arrayList2, 6));
                                                                                                }
                                                                                            }
                                                                                        } catch (zzmr e14) {
                                                                                            h1Var3.t().L.d("Failed to parse stored NO_DATA mode event, appId", q0.d1(str3), e14);
                                                                                        }
                                                                                        try {
                                                                                            if (!cursorQuery2.moveToNext()) {
                                                                                                break;
                                                                                            }
                                                                                            cursorQuery2 = cursorQuery2;
                                                                                            arrayList6 = arrayList6;
                                                                                        } catch (SQLiteException e15) {
                                                                                            e = e15;
                                                                                            h1Var3.t().Z0().d("Error flushing NO_DATA mode events. appId", q0.d1(str3), e);
                                                                                            list7 = Collections.EMPTY_LIST;
                                                                                            if (cursorQuery2 != null) {
                                                                                                cursorQuery2.close();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    cursorQuery2.close();
                                                                                    try {
                                                                                        int iDelete2 = sQLiteDatabaseK1.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)});
                                                                                        b50.b bVarC4 = h1Var3.t().c1();
                                                                                        StringBuilder sb5 = new StringBuilder(String.valueOf(iDelete2).length() + 34);
                                                                                        sb5.append("Pruned ");
                                                                                        sb5.append(iDelete2);
                                                                                        sb5.append(" NO_DATA mode events. appId");
                                                                                        bVarC4.c(str3, sb5.toString());
                                                                                    } catch (SQLiteException e16) {
                                                                                        e = e16;
                                                                                        cursorQuery2 = null;
                                                                                        h1Var3.t().Z0().d("Error flushing NO_DATA mode events. appId", q0.d1(str3), e);
                                                                                        list7 = Collections.EMPTY_LIST;
                                                                                        if (cursorQuery2 != null) {
                                                                                            cursorQuery2.close();
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    arrayList6 = arrayList6;
                                                                                    cursorQuery2.close();
                                                                                }
                                                                                list7 = arrayList6;
                                                                            } catch (Throwable th2) {
                                                                                th = th2;
                                                                                r23 = cursorQuery2;
                                                                                r15 = r23;
                                                                                if (r15 != 0) {
                                                                                    r15.close();
                                                                                }
                                                                                throw th;
                                                                            }
                                                                        } catch (SQLiteException e17) {
                                                                            e = e17;
                                                                            cursorQuery2 = cursorQuery2;
                                                                            h1Var3 = h1Var2;
                                                                        }
                                                                    } catch (Throwable th3) {
                                                                        th = th3;
                                                                        r15 = 0;
                                                                        if (r15 != 0) {
                                                                            r15.close();
                                                                        }
                                                                        throw th;
                                                                    }
                                                                } catch (SQLiteException e18) {
                                                                    e = e18;
                                                                    h1Var3 = h1Var2;
                                                                }
                                                                it5 = list2.iterator();
                                                                z15 = true;
                                                                while (it5.hasNext()) {
                                                                    Pair pair3 = (Pair) it5.next();
                                                                    h3Var2 = (com.google.android.gms.internal.measurement.h3) ((com.google.android.gms.internal.measurement.i3) pair3.first).i();
                                                                    if (z15) {
                                                                        List listX3 = h3Var2.X();
                                                                        h3Var2.b();
                                                                        ((com.google.android.gms.internal.measurement.i3) h3Var2.B).a0();
                                                                        h3Var2.b();
                                                                        ((com.google.android.gms.internal.measurement.i3) h3Var2.B).Z(list7);
                                                                        h3Var2.b();
                                                                        ((com.google.android.gms.internal.measurement.i3) h3Var2.B).Z(listX3);
                                                                        z15 = false;
                                                                    }
                                                                    com.google.android.gms.internal.measurement.t2 t2VarQ3 = com.google.android.gms.internal.measurement.w2.q();
                                                                    z1VarQ1 = c0().q1(str3);
                                                                    arrayList7 = new ArrayList();
                                                                    if (z1VarQ1 != null) {
                                                                        it6 = z1VarQ1.p().iterator();
                                                                        while (it6.hasNext()) {
                                                                            com.google.android.gms.internal.measurement.w1 w1Var3 = (com.google.android.gms.internal.measurement.w1) it6.next();
                                                                            Iterator it12 = it5;
                                                                            com.google.android.gms.internal.measurement.u2 u2VarP3 = com.google.android.gms.internal.measurement.v2.p();
                                                                            boolean z110 = z15;
                                                                            iP = w1Var3.p() - 1;
                                                                            List list12 = list7;
                                                                            if (iP != 1) {
                                                                                it7 = it6;
                                                                                i17 = 3;
                                                                                i18 = 2;
                                                                            } else if (iP != 2) {
                                                                                it7 = it6;
                                                                                i17 = 3;
                                                                                if (iP != 3) {
                                                                                    i18 = 4;
                                                                                } else if (iP != 4) {
                                                                                    i18 = 1;
                                                                                } else {
                                                                                    i18 = 5;
                                                                                }
                                                                            } else {
                                                                                it7 = it6;
                                                                                i17 = 3;
                                                                                i18 = 3;
                                                                            }
                                                                            u2VarP3.h(i18);
                                                                            iR = w1Var3.r() - 1;
                                                                            if (iR != 1) {
                                                                                i17 = 2;
                                                                            } else if (iR != 2) {
                                                                                i17 = 1;
                                                                            }
                                                                            u2VarP3.j(i17);
                                                                            arrayList7.add((com.google.android.gms.internal.measurement.v2) u2VarP3.e());
                                                                            it5 = it12;
                                                                            list7 = list12;
                                                                            z15 = z110;
                                                                            it6 = it7;
                                                                        }
                                                                    }
                                                                    Iterator it13 = it5;
                                                                    boolean z111 = z15;
                                                                    List list13 = list7;
                                                                    t2VarQ3.h(arrayList7);
                                                                    h3Var2.H(t2VarQ3);
                                                                    arrayList5.add(Pair.create((com.google.android.gms.internal.measurement.i3) h3Var2.e(), (Long) pair3.second));
                                                                    it5 = it13;
                                                                    list7 = list13;
                                                                    z15 = z111;
                                                                }
                                                                list6 = arrayList5;
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                            }
                                                        }
                                                        zIsEmpty2 = list6.isEmpty();
                                                        list3 = list6;
                                                        if (zIsEmpty2) {
                                                            return;
                                                        }
                                                    } else {
                                                        i10 = 34;
                                                        list3 = list2;
                                                    }
                                                    t1VarA = a(str3);
                                                    s1Var2 = s1.AD_STORAGE;
                                                    if (t1VarA.i(s1Var2)) {
                                                        i11 = 0;
                                                        listSubList = list3;
                                                        break;
                                                    }
                                                    it4 = list3.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            strV2 = null;
                                                            break;
                                                        }
                                                        i3Var2 = (com.google.android.gms.internal.measurement.i3) ((Pair) it4.next()).first;
                                                        if (!i3Var2.v().isEmpty()) {
                                                            strV2 = i3Var2.v();
                                                            break;
                                                        }
                                                    }
                                                    if (strV2 != null) {
                                                        i11 = 0;
                                                        listSubList = list3;
                                                        break;
                                                    }
                                                    i16 = 0;
                                                    while (true) {
                                                        if (i16 < list3.size()) {
                                                            i11 = 0;
                                                            listSubList = list3;
                                                            break;
                                                        }
                                                        i3Var = (com.google.android.gms.internal.measurement.i3) ((Pair) list3.get(i16)).first;
                                                        if (!i3Var.v().isEmpty()) {
                                                            i11 = 0;
                                                            listSubList = list3.subList(0, i16);
                                                            break;
                                                        }
                                                        i16++;
                                                    }
                                                    f3VarW = com.google.android.gms.internal.measurement.g3.w();
                                                    size = listSubList.size();
                                                    arrayList = new ArrayList(listSubList.size());
                                                    if (b0().W0(str3)) {
                                                        i12 = i11;
                                                    } else {
                                                        i12 = i11;
                                                    }
                                                    zI = a(str3).i(s1Var2);
                                                    zI2 = a(str3).i(s1Var);
                                                    zF2 = b0().f1(str3, b0.M0);
                                                    v3Var = this.J;
                                                    u3VarW0 = v3Var.W0(str3);
                                                    list4 = listSubList;
                                                    while (true) {
                                                        h1Var = this.L;
                                                        if (i11 < size) {
                                                            break;
                                                            break;
                                                        }
                                                        h3Var = (com.google.android.gms.internal.measurement.h3) ((com.google.android.gms.internal.measurement.i3) ((Pair) list4.get(i11)).first).i();
                                                        int i23 = size;
                                                        arrayList.add((Long) ((Pair) list4.get(i11)).second);
                                                        b0().a1();
                                                        h3Var.v();
                                                        h3Var.b();
                                                        ((com.google.android.gms.internal.measurement.i3) h3Var.B).f0(j9);
                                                        h1Var.getClass();
                                                        h3Var.L();
                                                        if (i12 == 0) {
                                                            h3Var.b();
                                                            ((com.google.android.gms.internal.measurement.i3) h3Var.B).S0();
                                                        }
                                                        if (!zI) {
                                                            h3Var.b();
                                                            ((com.google.android.gms.internal.measurement.i3) h3Var.B).z1();
                                                            h3Var.b();
                                                            ((com.google.android.gms.internal.measurement.i3) h3Var.B).B1();
                                                        }
                                                        if (!zI2) {
                                                            h3Var.b();
                                                            ((com.google.android.gms.internal.measurement.i3) h3Var.B).D1();
                                                        }
                                                        q(h3Var, str3);
                                                        if (!zF2) {
                                                            h3Var.b();
                                                            ((com.google.android.gms.internal.measurement.i3) h3Var.B).Z0();
                                                        }
                                                        if (!zI2) {
                                                            h3Var.b();
                                                            ((com.google.android.gms.internal.measurement.i3) h3Var.B).L1();
                                                        }
                                                        strV = ((com.google.android.gms.internal.measurement.i3) h3Var.B).v();
                                                        if (TextUtils.isEmpty(strV)) {
                                                            i14 = i12;
                                                            if (strV.equals("00000000-0000-0000-0000-000000000000")) {
                                                                i15 = i11;
                                                                z13 = zI2;
                                                                list5 = list4;
                                                                z14 = zF2;
                                                            }
                                                            if (h3Var.Y() != 0) {
                                                                if (b0().f1(str3, b0.C0)) {
                                                                    h3Var.S(h0().G1(((com.google.android.gms.internal.measurement.i3) h3Var.e()).a()));
                                                                }
                                                                p3VarB = u3VarW0.b();
                                                                if (p3VarB != null) {
                                                                    h3Var.E(p3VarB);
                                                                }
                                                                f3VarW.b();
                                                                ((com.google.android.gms.internal.measurement.g3) f3VarW.B).z((com.google.android.gms.internal.measurement.i3) h3Var.e());
                                                            }
                                                            i11 = i15 + 1;
                                                            i12 = i14;
                                                            size = i23;
                                                            list4 = list5;
                                                            zI2 = z13;
                                                            zF2 = z14;
                                                        } else {
                                                            i14 = i12;
                                                        }
                                                        arrayList4 = new ArrayList(h3Var.X());
                                                        it3 = arrayList4.iterator();
                                                        i15 = i11;
                                                        lValueOf = null;
                                                        lValueOf2 = null;
                                                        z11 = false;
                                                        z12 = false;
                                                        while (it3.hasNext()) {
                                                            zI2 = zI2;
                                                            a3Var = (com.google.android.gms.internal.measurement.a3) it3.next();
                                                            list4 = list4;
                                                            zF2 = zF2;
                                                            if ("_fx".equals(a3Var.s())) {
                                                                it3.remove();
                                                                z11 = true;
                                                            } else if ("_f".equals(a3Var.s())) {
                                                                h0();
                                                                d3VarD1 = t0.d1(a3Var, "_pfo");
                                                                if (d3VarD1 != null) {
                                                                    lValueOf = Long.valueOf(d3VarD1.u());
                                                                }
                                                                h0();
                                                                d3VarD2 = t0.d1(a3Var, "_uwa");
                                                                if (d3VarD2 != null) {
                                                                    lValueOf2 = Long.valueOf(d3VarD2.u());
                                                                }
                                                            } else {
                                                                list4 = list4;
                                                                zI2 = zI2;
                                                                zF2 = zF2;
                                                            }
                                                            z12 = true;
                                                        }
                                                        z13 = zI2;
                                                        list5 = list4;
                                                        z14 = zF2;
                                                        if (z11) {
                                                            h3Var.b();
                                                            ((com.google.android.gms.internal.measurement.i3) h3Var.B).a0();
                                                            h3Var.b();
                                                            ((com.google.android.gms.internal.measurement.i3) h3Var.B).Z(arrayList4);
                                                        }
                                                        if (z12) {
                                                            p(h3Var.q(), true, lValueOf, lValueOf2);
                                                        }
                                                        if (h3Var.Y() != 0) {
                                                            if (b0().f1(str3, b0.C0)) {
                                                                h3Var.S(h0().G1(((com.google.android.gms.internal.measurement.i3) h3Var.e()).a()));
                                                            }
                                                            p3VarB = u3VarW0.b();
                                                            if (p3VarB != null) {
                                                                h3Var.E(p3VarB);
                                                            }
                                                            f3VarW.b();
                                                            ((com.google.android.gms.internal.measurement.g3) f3VarW.B).z((com.google.android.gms.internal.measurement.i3) h3Var.e());
                                                        }
                                                        i11 = i15 + 1;
                                                        i12 = i14;
                                                        size = i23;
                                                        list4 = list5;
                                                        zI2 = z13;
                                                        zF2 = z14;
                                                    }
                                                    if (((com.google.android.gms.internal.measurement.g3) f3VarW.B).q() == 0) {
                                                        k(arrayList);
                                                        u(false, 204, null, null, str3, Collections.EMPTY_LIST);
                                                        return;
                                                    }
                                                    g3Var = (com.google.android.gms.internal.measurement.g3) f3VarW.e();
                                                    arrayList2 = new ArrayList();
                                                    p2Var = u3VarW0.f14740c;
                                                    if (p2Var == p2.SGTM_CLIENT) {
                                                        z10 = true;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    if (p2Var == p2.SGTM) {
                                                        it = ((com.google.android.gms.internal.measurement.g3) f3VarW.e()).p().iterator();
                                                        while (true) {
                                                            if (it.hasNext()) {
                                                                if (((com.google.android.gms.internal.measurement.i3) it.next()).N()) {
                                                                    string = UUID.randomUUID().toString();
                                                                    break;
                                                                }
                                                            } else {
                                                                string = null;
                                                                break;
                                                            }
                                                        }
                                                        com.google.android.gms.internal.measurement.g3 g3Var9 = (com.google.android.gms.internal.measurement.g3) f3VarW.e();
                                                        C().V0();
                                                        j0();
                                                        f3VarX = com.google.android.gms.internal.measurement.g3.x(g3Var9);
                                                        if (!TextUtils.isEmpty(string)) {
                                                            f3VarX.b();
                                                            ((com.google.android.gms.internal.measurement.g3) f3VarX.B).C(string);
                                                        }
                                                        strI1 = c0().i1(str3);
                                                        if (!TextUtils.isEmpty(strI1)) {
                                                            f3VarX.j(strI1);
                                                        }
                                                        arrayList3 = new ArrayList();
                                                        it2 = g3Var9.p().iterator();
                                                        while (it2.hasNext()) {
                                                            com.google.android.gms.internal.measurement.h3 h3VarV3 = com.google.android.gms.internal.measurement.i3.V((com.google.android.gms.internal.measurement.i3) it2.next());
                                                            h3VarV3.b();
                                                            ((com.google.android.gms.internal.measurement.i3) h3VarV3.B).S0();
                                                            arrayList3.add((com.google.android.gms.internal.measurement.i3) h3VarV3.e());
                                                        }
                                                        f3VarX.b();
                                                        ((com.google.android.gms.internal.measurement.g3) f3VarX.B).B();
                                                        f3VarX.b();
                                                        ((com.google.android.gms.internal.measurement.g3) f3VarX.B).A(arrayList3);
                                                        b50.b bVarC5 = t().c1();
                                                        if (TextUtils.isEmpty(string)) {
                                                            strH = "null";
                                                        } else {
                                                            strH = f3VarX.h();
                                                        }
                                                        bVarC5.c(strH, "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
                                                        g3Var2 = (com.google.android.gms.internal.measurement.g3) f3VarX.e();
                                                        if (TextUtils.isEmpty(string)) {
                                                            com.google.android.gms.internal.measurement.g3 g3Var10 = (com.google.android.gms.internal.measurement.g3) f3VarW.e();
                                                            C().V0();
                                                            j0();
                                                            f3VarW2 = com.google.android.gms.internal.measurement.g3.w();
                                                            t().c1().c(string, "[sgtm] Processing Google Signal, sgtmJoinId:");
                                                            f3VarW2.b();
                                                            ((com.google.android.gms.internal.measurement.g3) f3VarW2.B).C(string);
                                                            while (r0.hasNext()) {
                                                                com.google.android.gms.internal.measurement.h3 h3VarU3 = com.google.android.gms.internal.measurement.i3.U();
                                                                String strO3 = i3Var3.O();
                                                                h3VarU3.b();
                                                                ((com.google.android.gms.internal.measurement.i3) h3VarU3.B).R0(strO3);
                                                                int iK2 = i3Var3.K0();
                                                                h3VarU3.b();
                                                                ((com.google.android.gms.internal.measurement.i3) h3VarU3.B).j1(iK2);
                                                                f3VarW2.b();
                                                                ((com.google.android.gms.internal.measurement.g3) f3VarW2.B).z((com.google.android.gms.internal.measurement.i3) h3VarU3.e());
                                                            }
                                                            com.google.android.gms.internal.measurement.g3 g3Var11 = (com.google.android.gms.internal.measurement.g3) f3VarW2.e();
                                                            strI2 = v3Var.C.c0().i1(str3);
                                                            zIsEmpty = TextUtils.isEmpty(strI2);
                                                            p2Var2 = p2.GOOGLE_SIGNAL;
                                                            p2Var3 = p2.GOOGLE_SIGNAL_PENDING;
                                                            if (zIsEmpty) {
                                                                Uri uri3 = Uri.parse((String) b0.f14590s.a(null));
                                                                Uri.Builder builderBuildUpon3 = uri3.buildUpon();
                                                                String authority3 = uri3.getAuthority();
                                                                StringBuilder sb6 = new StringBuilder(String.valueOf(strI2).length() + 1 + String.valueOf(authority3).length());
                                                                sb6.append(strI2);
                                                                sb6.append(".");
                                                                sb6.append(authority3);
                                                                builderBuildUpon3.authority(sb6.toString());
                                                                String string4 = builderBuildUpon3.build().toString();
                                                                if (z10) {
                                                                    p2Var2 = p2Var3;
                                                                }
                                                                str2 = null;
                                                                u3Var = new u3(string4, Collections.EMPTY_MAP, p2Var2, null);
                                                            } else {
                                                                str2 = null;
                                                                String str6 = (String) b0.f14590s.a(null);
                                                                if (z10) {
                                                                    p2Var2 = p2Var3;
                                                                }
                                                                u3Var = new u3(str6, Collections.EMPTY_MAP, p2Var2, null);
                                                            }
                                                            arrayList2.add(Pair.create(g3Var11, u3Var));
                                                        } else {
                                                            str2 = null;
                                                        }
                                                        if (z10) {
                                                            f3Var = (com.google.android.gms.internal.measurement.f3) g3Var2.i();
                                                            while (i13 < g3Var2.q()) {
                                                                com.google.android.gms.internal.measurement.h3 h3Var5 = (com.google.android.gms.internal.measurement.h3) g3Var2.r(i13).i();
                                                                h3Var5.d0();
                                                                h3Var5.F(j9);
                                                                f3Var.b();
                                                                ((com.google.android.gms.internal.measurement.g3) f3Var.B).y(i13, (com.google.android.gms.internal.measurement.i3) h3Var5.e());
                                                            }
                                                            arrayList2.add(Pair.create((com.google.android.gms.internal.measurement.g3) f3Var.e(), u3VarW0));
                                                            k(arrayList);
                                                            u(false, 204, null, null, str, arrayList2);
                                                            if (n(str, u3VarW0.a())) {
                                                                t().c1().c(str, "[sgtm] Sending sgtm batches available notification to app");
                                                                intent = new Intent();
                                                                intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                                                intent.setPackage(str);
                                                                contextE0 = h1Var.e0();
                                                                if (Build.VERSION.SDK_INT < i10) {
                                                                    contextE0.sendBroadcast(intent);
                                                                    return;
                                                                } else {
                                                                    contextE0.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                                                    return;
                                                                }
                                                            }
                                                            return;
                                                        }
                                                        str3 = str;
                                                        g3Var = g3Var2;
                                                    } else if (z10) {
                                                        z10 = true;
                                                        it = ((com.google.android.gms.internal.measurement.g3) f3VarW.e()).p().iterator();
                                                        while (true) {
                                                            if (it.hasNext()) {
                                                                if (((com.google.android.gms.internal.measurement.i3) it.next()).N()) {
                                                                    string = UUID.randomUUID().toString();
                                                                    break;
                                                                }
                                                            } else {
                                                                string = null;
                                                                break;
                                                            }
                                                        }
                                                        com.google.android.gms.internal.measurement.g3 g3Var12 = (com.google.android.gms.internal.measurement.g3) f3VarW.e();
                                                        C().V0();
                                                        j0();
                                                        f3VarX = com.google.android.gms.internal.measurement.g3.x(g3Var12);
                                                        if (!TextUtils.isEmpty(string)) {
                                                            f3VarX.b();
                                                            ((com.google.android.gms.internal.measurement.g3) f3VarX.B).C(string);
                                                        }
                                                        strI1 = c0().i1(str3);
                                                        if (!TextUtils.isEmpty(strI1)) {
                                                            f3VarX.j(strI1);
                                                        }
                                                        arrayList3 = new ArrayList();
                                                        it2 = g3Var12.p().iterator();
                                                        while (it2.hasNext()) {
                                                            com.google.android.gms.internal.measurement.h3 h3VarV4 = com.google.android.gms.internal.measurement.i3.V((com.google.android.gms.internal.measurement.i3) it2.next());
                                                            h3VarV4.b();
                                                            ((com.google.android.gms.internal.measurement.i3) h3VarV4.B).S0();
                                                            arrayList3.add((com.google.android.gms.internal.measurement.i3) h3VarV4.e());
                                                        }
                                                        f3VarX.b();
                                                        ((com.google.android.gms.internal.measurement.g3) f3VarX.B).B();
                                                        f3VarX.b();
                                                        ((com.google.android.gms.internal.measurement.g3) f3VarX.B).A(arrayList3);
                                                        b50.b bVarC6 = t().c1();
                                                        if (TextUtils.isEmpty(string)) {
                                                            strH = "null";
                                                        } else {
                                                            strH = f3VarX.h();
                                                        }
                                                        bVarC6.c(strH, "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
                                                        g3Var2 = (com.google.android.gms.internal.measurement.g3) f3VarX.e();
                                                        if (TextUtils.isEmpty(string)) {
                                                            com.google.android.gms.internal.measurement.g3 g3Var13 = (com.google.android.gms.internal.measurement.g3) f3VarW.e();
                                                            C().V0();
                                                            j0();
                                                            f3VarW2 = com.google.android.gms.internal.measurement.g3.w();
                                                            t().c1().c(string, "[sgtm] Processing Google Signal, sgtmJoinId:");
                                                            f3VarW2.b();
                                                            ((com.google.android.gms.internal.measurement.g3) f3VarW2.B).C(string);
                                                            while (r0.hasNext()) {
                                                                com.google.android.gms.internal.measurement.h3 h3VarU4 = com.google.android.gms.internal.measurement.i3.U();
                                                                String strO4 = i3Var3.O();
                                                                h3VarU4.b();
                                                                ((com.google.android.gms.internal.measurement.i3) h3VarU4.B).R0(strO4);
                                                                int iK3 = i3Var3.K0();
                                                                h3VarU4.b();
                                                                ((com.google.android.gms.internal.measurement.i3) h3VarU4.B).j1(iK3);
                                                                f3VarW2.b();
                                                                ((com.google.android.gms.internal.measurement.g3) f3VarW2.B).z((com.google.android.gms.internal.measurement.i3) h3VarU4.e());
                                                            }
                                                            com.google.android.gms.internal.measurement.g3 g3Var14 = (com.google.android.gms.internal.measurement.g3) f3VarW2.e();
                                                            strI2 = v3Var.C.c0().i1(str3);
                                                            zIsEmpty = TextUtils.isEmpty(strI2);
                                                            p2Var2 = p2.GOOGLE_SIGNAL;
                                                            p2Var3 = p2.GOOGLE_SIGNAL_PENDING;
                                                            if (zIsEmpty) {
                                                                Uri uri4 = Uri.parse((String) b0.f14590s.a(null));
                                                                Uri.Builder builderBuildUpon4 = uri4.buildUpon();
                                                                String authority4 = uri4.getAuthority();
                                                                StringBuilder sb7 = new StringBuilder(String.valueOf(strI2).length() + 1 + String.valueOf(authority4).length());
                                                                sb7.append(strI2);
                                                                sb7.append(".");
                                                                sb7.append(authority4);
                                                                builderBuildUpon4.authority(sb7.toString());
                                                                String string5 = builderBuildUpon4.build().toString();
                                                                if (z10) {
                                                                    p2Var2 = p2Var3;
                                                                }
                                                                str2 = null;
                                                                u3Var = new u3(string5, Collections.EMPTY_MAP, p2Var2, null);
                                                            } else {
                                                                str2 = null;
                                                                String str7 = (String) b0.f14590s.a(null);
                                                                if (z10) {
                                                                    p2Var2 = p2Var3;
                                                                }
                                                                u3Var = new u3(str7, Collections.EMPTY_MAP, p2Var2, null);
                                                            }
                                                            arrayList2.add(Pair.create(g3Var14, u3Var));
                                                        } else {
                                                            str2 = null;
                                                        }
                                                        if (z10) {
                                                            f3Var = (com.google.android.gms.internal.measurement.f3) g3Var2.i();
                                                            while (i13 < g3Var2.q()) {
                                                                com.google.android.gms.internal.measurement.h3 h3Var6 = (com.google.android.gms.internal.measurement.h3) g3Var2.r(i13).i();
                                                                h3Var6.d0();
                                                                h3Var6.F(j9);
                                                                f3Var.b();
                                                                ((com.google.android.gms.internal.measurement.g3) f3Var.B).y(i13, (com.google.android.gms.internal.measurement.i3) h3Var6.e());
                                                            }
                                                            arrayList2.add(Pair.create((com.google.android.gms.internal.measurement.g3) f3Var.e(), u3VarW0));
                                                            k(arrayList);
                                                            u(false, 204, null, null, str, arrayList2);
                                                            if (n(str, u3VarW0.a())) {
                                                                t().c1().c(str, "[sgtm] Sending sgtm batches available notification to app");
                                                                intent = new Intent();
                                                                intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                                                intent.setPackage(str);
                                                                contextE0 = h1Var.e0();
                                                                if (Build.VERSION.SDK_INT < i10) {
                                                                    contextE0.sendBroadcast(intent);
                                                                    return;
                                                                } else {
                                                                    contextE0.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                                                    return;
                                                                }
                                                            }
                                                            return;
                                                        }
                                                        str3 = str;
                                                        g3Var = g3Var2;
                                                    } else {
                                                        str2 = null;
                                                    }
                                                    t0Var = this.B;
                                                    R(t0Var);
                                                    if (t0Var.p1()) {
                                                        if (Log.isLoggable(t().f1(), 2)) {
                                                            strY1 = h0().y1(g3Var);
                                                        } else {
                                                            strY1 = str2;
                                                        }
                                                        h0();
                                                        byte[] bArrA2 = g3Var.a();
                                                        k(arrayList);
                                                        this.I.J.f(j9);
                                                        t().c1().e("Uploading data. app, uncompressed size, data", str3, Integer.valueOf(bArrA2.length), strY1);
                                                        this.U = true;
                                                        R(t0Var);
                                                        t0Var.u1(str3, u3VarW0, g3Var, new sd.p1((y3) this, str3, (Object) arrayList2, 6));
                                                    }
                                                }
                                            }
                                            gZIPInputStream.close();
                                            byteArrayInputStream.close();
                                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                                            if (!arrayList8.isEmpty() && byteArray.length + length > iMax) {
                                                break;
                                            }
                                            try {
                                                com.google.android.gms.internal.measurement.h3 h3Var7 = (com.google.android.gms.internal.measurement.h3) t0.I1(com.google.android.gms.internal.measurement.i3.U(), byteArray);
                                                if (!arrayList8.isEmpty()) {
                                                    com.google.android.gms.internal.measurement.i3 i3Var4 = (com.google.android.gms.internal.measurement.i3) ((Pair) arrayList8.get(0)).first;
                                                    com.google.android.gms.internal.measurement.i3 i3Var5 = (com.google.android.gms.internal.measurement.i3) h3Var7.e();
                                                    if (!i3Var4.u0().equals(i3Var5.u0()) || !i3Var4.B0().equals(i3Var5.B0()) || i3Var4.D0() != i3Var5.D0() || !i3Var4.F0().equals(i3Var5.F0())) {
                                                        break;
                                                    }
                                                    Iterator it14 = i3Var4.U1().iterator();
                                                    while (true) {
                                                        if (!it14.hasNext()) {
                                                            jV = -1;
                                                            break;
                                                        }
                                                        com.google.android.gms.internal.measurement.r3 r3Var = (com.google.android.gms.internal.measurement.r3) it14.next();
                                                        Iterator it15 = it14;
                                                        if ("_npa".equals(r3Var.r())) {
                                                            jV = r3Var.v();
                                                            break;
                                                        }
                                                        it14 = it15;
                                                    }
                                                    Iterator it16 = i3Var5.U1().iterator();
                                                    while (true) {
                                                        if (!it16.hasNext()) {
                                                            jV2 = -1;
                                                            break;
                                                        }
                                                        com.google.android.gms.internal.measurement.r3 r3Var2 = (com.google.android.gms.internal.measurement.r3) it16.next();
                                                        if ("_npa".equals(r3Var2.r())) {
                                                            jV2 = r3Var2.v();
                                                            break;
                                                        }
                                                    }
                                                    if (jV != jV2) {
                                                        break;
                                                    }
                                                }
                                                if (!cursorQuery.isNull(2)) {
                                                    int i24 = cursorQuery.getInt(2);
                                                    h3Var7.b();
                                                    ((com.google.android.gms.internal.measurement.i3) h3Var7.B).T0(i24);
                                                }
                                                length += byteArray.length;
                                                arrayList8.add(Pair.create((com.google.android.gms.internal.measurement.i3) h3Var7.e(), Long.valueOf(j11)));
                                            } catch (IOException e19) {
                                                h1Var4.t().Z0().d("Failed to merge queued bundle. appId", q0.d1(str3), e19);
                                            }
                                            h1Var4 = h1Var4;
                                            r22 = r22;
                                            if (cursorQuery.moveToNext() || length > iMax) {
                                                break;
                                                break;
                                            }
                                            r10 = r22;
                                            h1Var4 = h1Var4;
                                            i19 = 0;
                                            i20 = 1;
                                        } catch (IOException e20) {
                                            e = e20;
                                            r22 = r10;
                                        }
                                    } catch (IOException e21) {
                                        e = e21;
                                        r22 = r10;
                                        h1Var4 = h1Var4;
                                    }
                                }
                                cursorQuery.close();
                                list2 = arrayList8;
                                r23 = r22;
                            } else {
                                list = Collections.EMPTY_LIST;
                                r25 = "rowid";
                                cursorQuery.close();
                                r24 = r25;
                                list2 = list;
                                r23 = r24;
                            }
                        } catch (SQLiteException e22) {
                            e = e22;
                            h1Var4 = h1Var4;
                        }
                    } catch (SQLiteException e23) {
                        e = e23;
                        cursorQuery = null;
                        h1Var4.t().Z0().d("Error querying bundles. appId", q0.d1(str3), e);
                        list = Collections.EMPTY_LIST;
                        r25 = r22;
                        r24 = r22;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                            r24 = r25;
                        }
                        list2 = list;
                        r23 = r24;
                        if (list2.isEmpty()) {
                            return;
                        }
                        l7Var = l7.B;
                        g gVarB1 = b0();
                        a0Var = b0.f14568h1;
                        zF1 = gVarB1.f1(null, a0Var);
                        s1Var = s1.ANALYTICS_STORAGE;
                        if (zF1) {
                            if (!b0().f1(null, a0Var)) {
                                i10 = 34;
                                list6 = list2;
                            } else if (a(str3).i(s1Var)) {
                                i10 = 34;
                                arrayList5 = new ArrayList(list2.size());
                                m mVarD3 = d0();
                                h1Var2 = (h1) mVarD3.B;
                                com.google.android.gms.common.internal.d0.e(str3);
                                mVarD3.V0();
                                mVarD3.W0();
                                arrayList6 = new ArrayList();
                                sQLiteDatabaseK1 = mVarD3.K1();
                                ((ve.b) h1Var2.k0()).getClass();
                                jCurrentTimeMillis = System.currentTimeMillis();
                                cursorQuery2 = sQLiteDatabaseK1.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)}, null, null, "rowid", null);
                                if (cursorQuery2.moveToFirst()) {
                                    h1Var3 = h1Var2;
                                    while (true) {
                                        arrayList6.add((com.google.android.gms.internal.measurement.a3) ((com.google.android.gms.internal.measurement.z2) t0.I1(com.google.android.gms.internal.measurement.a3.z(), cursorQuery2.getBlob(0))).e());
                                        if (!cursorQuery2.moveToNext()) {
                                            break;
                                            break;
                                        } else {
                                            cursorQuery2 = cursorQuery2;
                                            arrayList6 = arrayList6;
                                        }
                                    }
                                    cursorQuery2.close();
                                    int iDelete3 = sQLiteDatabaseK1.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)});
                                    b50.b bVarC7 = h1Var3.t().c1();
                                    StringBuilder sb8 = new StringBuilder(String.valueOf(iDelete3).length() + 34);
                                    sb8.append("Pruned ");
                                    sb8.append(iDelete3);
                                    sb8.append(" NO_DATA mode events. appId");
                                    bVarC7.c(str3, sb8.toString());
                                } else {
                                    arrayList6 = arrayList6;
                                    cursorQuery2.close();
                                }
                                list7 = arrayList6;
                                it5 = list2.iterator();
                                z15 = true;
                                while (it5.hasNext()) {
                                    Pair pair4 = (Pair) it5.next();
                                    h3Var2 = (com.google.android.gms.internal.measurement.h3) ((com.google.android.gms.internal.measurement.i3) pair4.first).i();
                                    if (z15) {
                                        List listX4 = h3Var2.X();
                                        h3Var2.b();
                                        ((com.google.android.gms.internal.measurement.i3) h3Var2.B).a0();
                                        h3Var2.b();
                                        ((com.google.android.gms.internal.measurement.i3) h3Var2.B).Z(list7);
                                        h3Var2.b();
                                        ((com.google.android.gms.internal.measurement.i3) h3Var2.B).Z(listX4);
                                        z15 = false;
                                    }
                                    com.google.android.gms.internal.measurement.t2 t2VarQ4 = com.google.android.gms.internal.measurement.w2.q();
                                    z1VarQ1 = c0().q1(str3);
                                    arrayList7 = new ArrayList();
                                    if (z1VarQ1 != null) {
                                        it6 = z1VarQ1.p().iterator();
                                        while (it6.hasNext()) {
                                            com.google.android.gms.internal.measurement.w1 w1Var4 = (com.google.android.gms.internal.measurement.w1) it6.next();
                                            Iterator it17 = it5;
                                            com.google.android.gms.internal.measurement.u2 u2VarP4 = com.google.android.gms.internal.measurement.v2.p();
                                            boolean z112 = z15;
                                            iP = w1Var4.p() - 1;
                                            List list14 = list7;
                                            if (iP != 1) {
                                                it7 = it6;
                                                i17 = 3;
                                                i18 = 2;
                                            } else if (iP != 2) {
                                                it7 = it6;
                                                i17 = 3;
                                                if (iP != 3) {
                                                    i18 = 4;
                                                } else if (iP != 4) {
                                                    i18 = 1;
                                                } else {
                                                    i18 = 5;
                                                }
                                            } else {
                                                it7 = it6;
                                                i17 = 3;
                                                i18 = 3;
                                            }
                                            u2VarP4.h(i18);
                                            iR = w1Var4.r() - 1;
                                            if (iR != 1) {
                                                i17 = 2;
                                            } else if (iR != 2) {
                                                i17 = 1;
                                            }
                                            u2VarP4.j(i17);
                                            arrayList7.add((com.google.android.gms.internal.measurement.v2) u2VarP4.e());
                                            it5 = it17;
                                            list7 = list14;
                                            z15 = z112;
                                            it6 = it7;
                                        }
                                    }
                                    Iterator it18 = it5;
                                    boolean z113 = z15;
                                    List list15 = list7;
                                    t2VarQ4.h(arrayList7);
                                    h3Var2.H(t2VarQ4);
                                    arrayList5.add(Pair.create((com.google.android.gms.internal.measurement.i3) h3Var2.e(), (Long) pair4.second));
                                    it5 = it18;
                                    list7 = list15;
                                    z15 = z113;
                                }
                                list6 = arrayList5;
                            } else {
                                i10 = 34;
                                arrayList5 = new ArrayList(list2.size());
                                m mVarD4 = d0();
                                h1Var2 = (h1) mVarD4.B;
                                com.google.android.gms.common.internal.d0.e(str3);
                                mVarD4.V0();
                                mVarD4.W0();
                                arrayList6 = new ArrayList();
                                sQLiteDatabaseK1 = mVarD4.K1();
                                ((ve.b) h1Var2.k0()).getClass();
                                jCurrentTimeMillis = System.currentTimeMillis();
                                cursorQuery2 = sQLiteDatabaseK1.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)}, null, null, "rowid", null);
                                if (cursorQuery2.moveToFirst()) {
                                    h1Var3 = h1Var2;
                                    while (true) {
                                        arrayList6.add((com.google.android.gms.internal.measurement.a3) ((com.google.android.gms.internal.measurement.z2) t0.I1(com.google.android.gms.internal.measurement.a3.z(), cursorQuery2.getBlob(0))).e());
                                        if (!cursorQuery2.moveToNext()) {
                                            break;
                                            break;
                                        } else {
                                            cursorQuery2 = cursorQuery2;
                                            arrayList6 = arrayList6;
                                        }
                                    }
                                    cursorQuery2.close();
                                    int iDelete4 = sQLiteDatabaseK1.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)});
                                    b50.b bVarC8 = h1Var3.t().c1();
                                    StringBuilder sb9 = new StringBuilder(String.valueOf(iDelete4).length() + 34);
                                    sb9.append("Pruned ");
                                    sb9.append(iDelete4);
                                    sb9.append(" NO_DATA mode events. appId");
                                    bVarC8.c(str3, sb9.toString());
                                } else {
                                    arrayList6 = arrayList6;
                                    cursorQuery2.close();
                                }
                                list7 = arrayList6;
                                it5 = list2.iterator();
                                z15 = true;
                                while (it5.hasNext()) {
                                    Pair pair5 = (Pair) it5.next();
                                    h3Var2 = (com.google.android.gms.internal.measurement.h3) ((com.google.android.gms.internal.measurement.i3) pair5.first).i();
                                    if (z15) {
                                        List listX5 = h3Var2.X();
                                        h3Var2.b();
                                        ((com.google.android.gms.internal.measurement.i3) h3Var2.B).a0();
                                        h3Var2.b();
                                        ((com.google.android.gms.internal.measurement.i3) h3Var2.B).Z(list7);
                                        h3Var2.b();
                                        ((com.google.android.gms.internal.measurement.i3) h3Var2.B).Z(listX5);
                                        z15 = false;
                                    }
                                    com.google.android.gms.internal.measurement.t2 t2VarQ5 = com.google.android.gms.internal.measurement.w2.q();
                                    z1VarQ1 = c0().q1(str3);
                                    arrayList7 = new ArrayList();
                                    if (z1VarQ1 != null) {
                                        it6 = z1VarQ1.p().iterator();
                                        while (it6.hasNext()) {
                                            com.google.android.gms.internal.measurement.w1 w1Var5 = (com.google.android.gms.internal.measurement.w1) it6.next();
                                            Iterator it19 = it5;
                                            com.google.android.gms.internal.measurement.u2 u2VarP5 = com.google.android.gms.internal.measurement.v2.p();
                                            boolean z114 = z15;
                                            iP = w1Var5.p() - 1;
                                            List list16 = list7;
                                            if (iP != 1) {
                                                it7 = it6;
                                                i17 = 3;
                                                i18 = 2;
                                            } else if (iP != 2) {
                                                it7 = it6;
                                                i17 = 3;
                                                if (iP != 3) {
                                                    i18 = 4;
                                                } else if (iP != 4) {
                                                    i18 = 1;
                                                } else {
                                                    i18 = 5;
                                                }
                                            } else {
                                                it7 = it6;
                                                i17 = 3;
                                                i18 = 3;
                                            }
                                            u2VarP5.h(i18);
                                            iR = w1Var5.r() - 1;
                                            if (iR != 1) {
                                                i17 = 2;
                                            } else if (iR != 2) {
                                                i17 = 1;
                                            }
                                            u2VarP5.j(i17);
                                            arrayList7.add((com.google.android.gms.internal.measurement.v2) u2VarP5.e());
                                            it5 = it19;
                                            list7 = list16;
                                            z15 = z114;
                                            it6 = it7;
                                        }
                                    }
                                    Iterator it110 = it5;
                                    boolean z115 = z15;
                                    List list17 = list7;
                                    t2VarQ5.h(arrayList7);
                                    h3Var2.H(t2VarQ5);
                                    arrayList5.add(Pair.create((com.google.android.gms.internal.measurement.i3) h3Var2.e(), (Long) pair5.second));
                                    it5 = it110;
                                    list7 = list17;
                                    z15 = z115;
                                }
                                list6 = arrayList5;
                            }
                            zIsEmpty2 = list6.isEmpty();
                            list3 = list6;
                            if (zIsEmpty2) {
                                return;
                            }
                        } else {
                            i10 = 34;
                            list3 = list2;
                        }
                        t1VarA = a(str3);
                        s1Var2 = s1.AD_STORAGE;
                        if (t1VarA.i(s1Var2)) {
                            i11 = 0;
                            listSubList = list3;
                            break;
                        }
                        it4 = list3.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                strV2 = null;
                                break;
                            }
                            i3Var2 = (com.google.android.gms.internal.measurement.i3) ((Pair) it4.next()).first;
                            if (!i3Var2.v().isEmpty()) {
                                strV2 = i3Var2.v();
                                break;
                            }
                        }
                        if (strV2 != null) {
                            i11 = 0;
                            listSubList = list3;
                            break;
                        }
                        i16 = 0;
                        while (true) {
                            if (i16 < list3.size()) {
                                i11 = 0;
                                listSubList = list3;
                                break;
                            }
                            i3Var = (com.google.android.gms.internal.measurement.i3) ((Pair) list3.get(i16)).first;
                            if (!i3Var.v().isEmpty()) {
                                i11 = 0;
                                listSubList = list3.subList(0, i16);
                                break;
                            }
                            i16++;
                        }
                        f3VarW = com.google.android.gms.internal.measurement.g3.w();
                        size = listSubList.size();
                        arrayList = new ArrayList(listSubList.size());
                        if (b0().W0(str3)) {
                            i12 = i11;
                        } else {
                            i12 = i11;
                        }
                        zI = a(str3).i(s1Var2);
                        zI2 = a(str3).i(s1Var);
                        zF2 = b0().f1(str3, b0.M0);
                        v3Var = this.J;
                        u3VarW0 = v3Var.W0(str3);
                        list4 = listSubList;
                        while (true) {
                            h1Var = this.L;
                            if (i11 < size) {
                                break;
                                break;
                            }
                            h3Var = (com.google.android.gms.internal.measurement.h3) ((com.google.android.gms.internal.measurement.i3) ((Pair) list4.get(i11)).first).i();
                            int i25 = size;
                            arrayList.add((Long) ((Pair) list4.get(i11)).second);
                            b0().a1();
                            h3Var.v();
                            h3Var.b();
                            ((com.google.android.gms.internal.measurement.i3) h3Var.B).f0(j9);
                            h1Var.getClass();
                            h3Var.L();
                            if (i12 == 0) {
                                h3Var.b();
                                ((com.google.android.gms.internal.measurement.i3) h3Var.B).S0();
                            }
                            if (!zI) {
                                h3Var.b();
                                ((com.google.android.gms.internal.measurement.i3) h3Var.B).z1();
                                h3Var.b();
                                ((com.google.android.gms.internal.measurement.i3) h3Var.B).B1();
                            }
                            if (!zI2) {
                                h3Var.b();
                                ((com.google.android.gms.internal.measurement.i3) h3Var.B).D1();
                            }
                            q(h3Var, str3);
                            if (!zF2) {
                                h3Var.b();
                                ((com.google.android.gms.internal.measurement.i3) h3Var.B).Z0();
                            }
                            if (!zI2) {
                                h3Var.b();
                                ((com.google.android.gms.internal.measurement.i3) h3Var.B).L1();
                            }
                            strV = ((com.google.android.gms.internal.measurement.i3) h3Var.B).v();
                            if (TextUtils.isEmpty(strV)) {
                                i14 = i12;
                                if (strV.equals("00000000-0000-0000-0000-000000000000")) {
                                    i15 = i11;
                                    z13 = zI2;
                                    list5 = list4;
                                    z14 = zF2;
                                }
                                if (h3Var.Y() != 0) {
                                    if (b0().f1(str3, b0.C0)) {
                                        h3Var.S(h0().G1(((com.google.android.gms.internal.measurement.i3) h3Var.e()).a()));
                                    }
                                    p3VarB = u3VarW0.b();
                                    if (p3VarB != null) {
                                        h3Var.E(p3VarB);
                                    }
                                    f3VarW.b();
                                    ((com.google.android.gms.internal.measurement.g3) f3VarW.B).z((com.google.android.gms.internal.measurement.i3) h3Var.e());
                                }
                                i11 = i15 + 1;
                                i12 = i14;
                                size = i25;
                                list4 = list5;
                                zI2 = z13;
                                zF2 = z14;
                            } else {
                                i14 = i12;
                            }
                            arrayList4 = new ArrayList(h3Var.X());
                            it3 = arrayList4.iterator();
                            i15 = i11;
                            lValueOf = null;
                            lValueOf2 = null;
                            z11 = false;
                            z12 = false;
                            while (it3.hasNext()) {
                                zI2 = zI2;
                                a3Var = (com.google.android.gms.internal.measurement.a3) it3.next();
                                list4 = list4;
                                zF2 = zF2;
                                if ("_fx".equals(a3Var.s())) {
                                    it3.remove();
                                    z11 = true;
                                } else if ("_f".equals(a3Var.s())) {
                                    h0();
                                    d3VarD1 = t0.d1(a3Var, "_pfo");
                                    if (d3VarD1 != null) {
                                        lValueOf = Long.valueOf(d3VarD1.u());
                                    }
                                    h0();
                                    d3VarD2 = t0.d1(a3Var, "_uwa");
                                    if (d3VarD2 != null) {
                                        lValueOf2 = Long.valueOf(d3VarD2.u());
                                    }
                                } else {
                                    list4 = list4;
                                    zI2 = zI2;
                                    zF2 = zF2;
                                }
                                z12 = true;
                            }
                            z13 = zI2;
                            list5 = list4;
                            z14 = zF2;
                            if (z11) {
                                h3Var.b();
                                ((com.google.android.gms.internal.measurement.i3) h3Var.B).a0();
                                h3Var.b();
                                ((com.google.android.gms.internal.measurement.i3) h3Var.B).Z(arrayList4);
                            }
                            if (z12) {
                                p(h3Var.q(), true, lValueOf, lValueOf2);
                            }
                            if (h3Var.Y() != 0) {
                                if (b0().f1(str3, b0.C0)) {
                                    h3Var.S(h0().G1(((com.google.android.gms.internal.measurement.i3) h3Var.e()).a()));
                                }
                                p3VarB = u3VarW0.b();
                                if (p3VarB != null) {
                                    h3Var.E(p3VarB);
                                }
                                f3VarW.b();
                                ((com.google.android.gms.internal.measurement.g3) f3VarW.B).z((com.google.android.gms.internal.measurement.i3) h3Var.e());
                            }
                            i11 = i15 + 1;
                            i12 = i14;
                            size = i25;
                            list4 = list5;
                            zI2 = z13;
                            zF2 = z14;
                        }
                        if (((com.google.android.gms.internal.measurement.g3) f3VarW.B).q() == 0) {
                            k(arrayList);
                            u(false, 204, null, null, str3, Collections.EMPTY_LIST);
                            return;
                        }
                        g3Var = (com.google.android.gms.internal.measurement.g3) f3VarW.e();
                        arrayList2 = new ArrayList();
                        p2Var = u3VarW0.f14740c;
                        if (p2Var == p2.SGTM_CLIENT) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (p2Var == p2.SGTM) {
                            it = ((com.google.android.gms.internal.measurement.g3) f3VarW.e()).p().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((com.google.android.gms.internal.measurement.i3) it.next()).N()) {
                                        string = UUID.randomUUID().toString();
                                        break;
                                    }
                                } else {
                                    string = null;
                                    break;
                                }
                            }
                            com.google.android.gms.internal.measurement.g3 g3Var15 = (com.google.android.gms.internal.measurement.g3) f3VarW.e();
                            C().V0();
                            j0();
                            f3VarX = com.google.android.gms.internal.measurement.g3.x(g3Var15);
                            if (!TextUtils.isEmpty(string)) {
                                f3VarX.b();
                                ((com.google.android.gms.internal.measurement.g3) f3VarX.B).C(string);
                            }
                            strI1 = c0().i1(str3);
                            if (!TextUtils.isEmpty(strI1)) {
                                f3VarX.j(strI1);
                            }
                            arrayList3 = new ArrayList();
                            it2 = g3Var15.p().iterator();
                            while (it2.hasNext()) {
                                com.google.android.gms.internal.measurement.h3 h3VarV5 = com.google.android.gms.internal.measurement.i3.V((com.google.android.gms.internal.measurement.i3) it2.next());
                                h3VarV5.b();
                                ((com.google.android.gms.internal.measurement.i3) h3VarV5.B).S0();
                                arrayList3.add((com.google.android.gms.internal.measurement.i3) h3VarV5.e());
                            }
                            f3VarX.b();
                            ((com.google.android.gms.internal.measurement.g3) f3VarX.B).B();
                            f3VarX.b();
                            ((com.google.android.gms.internal.measurement.g3) f3VarX.B).A(arrayList3);
                            b50.b bVarC9 = t().c1();
                            if (TextUtils.isEmpty(string)) {
                                strH = "null";
                            } else {
                                strH = f3VarX.h();
                            }
                            bVarC9.c(strH, "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
                            g3Var2 = (com.google.android.gms.internal.measurement.g3) f3VarX.e();
                            if (TextUtils.isEmpty(string)) {
                                com.google.android.gms.internal.measurement.g3 g3Var16 = (com.google.android.gms.internal.measurement.g3) f3VarW.e();
                                C().V0();
                                j0();
                                f3VarW2 = com.google.android.gms.internal.measurement.g3.w();
                                t().c1().c(string, "[sgtm] Processing Google Signal, sgtmJoinId:");
                                f3VarW2.b();
                                ((com.google.android.gms.internal.measurement.g3) f3VarW2.B).C(string);
                                while (r0.hasNext()) {
                                    com.google.android.gms.internal.measurement.h3 h3VarU5 = com.google.android.gms.internal.measurement.i3.U();
                                    String strO5 = i3Var3.O();
                                    h3VarU5.b();
                                    ((com.google.android.gms.internal.measurement.i3) h3VarU5.B).R0(strO5);
                                    int iK4 = i3Var3.K0();
                                    h3VarU5.b();
                                    ((com.google.android.gms.internal.measurement.i3) h3VarU5.B).j1(iK4);
                                    f3VarW2.b();
                                    ((com.google.android.gms.internal.measurement.g3) f3VarW2.B).z((com.google.android.gms.internal.measurement.i3) h3VarU5.e());
                                }
                                com.google.android.gms.internal.measurement.g3 g3Var17 = (com.google.android.gms.internal.measurement.g3) f3VarW2.e();
                                strI2 = v3Var.C.c0().i1(str3);
                                zIsEmpty = TextUtils.isEmpty(strI2);
                                p2Var2 = p2.GOOGLE_SIGNAL;
                                p2Var3 = p2.GOOGLE_SIGNAL_PENDING;
                                if (zIsEmpty) {
                                    Uri uri5 = Uri.parse((String) b0.f14590s.a(null));
                                    Uri.Builder builderBuildUpon5 = uri5.buildUpon();
                                    String authority5 = uri5.getAuthority();
                                    StringBuilder sb10 = new StringBuilder(String.valueOf(strI2).length() + 1 + String.valueOf(authority5).length());
                                    sb10.append(strI2);
                                    sb10.append(".");
                                    sb10.append(authority5);
                                    builderBuildUpon5.authority(sb10.toString());
                                    String string6 = builderBuildUpon5.build().toString();
                                    if (z10) {
                                        p2Var2 = p2Var3;
                                    }
                                    str2 = null;
                                    u3Var = new u3(string6, Collections.EMPTY_MAP, p2Var2, null);
                                } else {
                                    str2 = null;
                                    String str8 = (String) b0.f14590s.a(null);
                                    if (z10) {
                                        p2Var2 = p2Var3;
                                    }
                                    u3Var = new u3(str8, Collections.EMPTY_MAP, p2Var2, null);
                                }
                                arrayList2.add(Pair.create(g3Var17, u3Var));
                            } else {
                                str2 = null;
                            }
                            if (z10) {
                                f3Var = (com.google.android.gms.internal.measurement.f3) g3Var2.i();
                                while (i13 < g3Var2.q()) {
                                    com.google.android.gms.internal.measurement.h3 h3Var8 = (com.google.android.gms.internal.measurement.h3) g3Var2.r(i13).i();
                                    h3Var8.d0();
                                    h3Var8.F(j9);
                                    f3Var.b();
                                    ((com.google.android.gms.internal.measurement.g3) f3Var.B).y(i13, (com.google.android.gms.internal.measurement.i3) h3Var8.e());
                                }
                                arrayList2.add(Pair.create((com.google.android.gms.internal.measurement.g3) f3Var.e(), u3VarW0));
                                k(arrayList);
                                u(false, 204, null, null, str, arrayList2);
                                if (n(str, u3VarW0.a())) {
                                    t().c1().c(str, "[sgtm] Sending sgtm batches available notification to app");
                                    intent = new Intent();
                                    intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                    intent.setPackage(str);
                                    contextE0 = h1Var.e0();
                                    if (Build.VERSION.SDK_INT < i10) {
                                        contextE0.sendBroadcast(intent);
                                        return;
                                    } else {
                                        contextE0.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                        return;
                                    }
                                }
                                return;
                            }
                            str3 = str;
                            g3Var = g3Var2;
                        } else if (z10) {
                            z10 = true;
                            it = ((com.google.android.gms.internal.measurement.g3) f3VarW.e()).p().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((com.google.android.gms.internal.measurement.i3) it.next()).N()) {
                                        string = UUID.randomUUID().toString();
                                        break;
                                    }
                                } else {
                                    string = null;
                                    break;
                                }
                            }
                            com.google.android.gms.internal.measurement.g3 g3Var18 = (com.google.android.gms.internal.measurement.g3) f3VarW.e();
                            C().V0();
                            j0();
                            f3VarX = com.google.android.gms.internal.measurement.g3.x(g3Var18);
                            if (!TextUtils.isEmpty(string)) {
                                f3VarX.b();
                                ((com.google.android.gms.internal.measurement.g3) f3VarX.B).C(string);
                            }
                            strI1 = c0().i1(str3);
                            if (!TextUtils.isEmpty(strI1)) {
                                f3VarX.j(strI1);
                            }
                            arrayList3 = new ArrayList();
                            it2 = g3Var18.p().iterator();
                            while (it2.hasNext()) {
                                com.google.android.gms.internal.measurement.h3 h3VarV6 = com.google.android.gms.internal.measurement.i3.V((com.google.android.gms.internal.measurement.i3) it2.next());
                                h3VarV6.b();
                                ((com.google.android.gms.internal.measurement.i3) h3VarV6.B).S0();
                                arrayList3.add((com.google.android.gms.internal.measurement.i3) h3VarV6.e());
                            }
                            f3VarX.b();
                            ((com.google.android.gms.internal.measurement.g3) f3VarX.B).B();
                            f3VarX.b();
                            ((com.google.android.gms.internal.measurement.g3) f3VarX.B).A(arrayList3);
                            b50.b bVarC10 = t().c1();
                            if (TextUtils.isEmpty(string)) {
                                strH = "null";
                            } else {
                                strH = f3VarX.h();
                            }
                            bVarC10.c(strH, "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
                            g3Var2 = (com.google.android.gms.internal.measurement.g3) f3VarX.e();
                            if (TextUtils.isEmpty(string)) {
                                com.google.android.gms.internal.measurement.g3 g3Var19 = (com.google.android.gms.internal.measurement.g3) f3VarW.e();
                                C().V0();
                                j0();
                                f3VarW2 = com.google.android.gms.internal.measurement.g3.w();
                                t().c1().c(string, "[sgtm] Processing Google Signal, sgtmJoinId:");
                                f3VarW2.b();
                                ((com.google.android.gms.internal.measurement.g3) f3VarW2.B).C(string);
                                while (r0.hasNext()) {
                                    com.google.android.gms.internal.measurement.h3 h3VarU6 = com.google.android.gms.internal.measurement.i3.U();
                                    String strO6 = i3Var3.O();
                                    h3VarU6.b();
                                    ((com.google.android.gms.internal.measurement.i3) h3VarU6.B).R0(strO6);
                                    int iK5 = i3Var3.K0();
                                    h3VarU6.b();
                                    ((com.google.android.gms.internal.measurement.i3) h3VarU6.B).j1(iK5);
                                    f3VarW2.b();
                                    ((com.google.android.gms.internal.measurement.g3) f3VarW2.B).z((com.google.android.gms.internal.measurement.i3) h3VarU6.e());
                                }
                                com.google.android.gms.internal.measurement.g3 g3Var110 = (com.google.android.gms.internal.measurement.g3) f3VarW2.e();
                                strI2 = v3Var.C.c0().i1(str3);
                                zIsEmpty = TextUtils.isEmpty(strI2);
                                p2Var2 = p2.GOOGLE_SIGNAL;
                                p2Var3 = p2.GOOGLE_SIGNAL_PENDING;
                                if (zIsEmpty) {
                                    Uri uri6 = Uri.parse((String) b0.f14590s.a(null));
                                    Uri.Builder builderBuildUpon6 = uri6.buildUpon();
                                    String authority6 = uri6.getAuthority();
                                    StringBuilder sb11 = new StringBuilder(String.valueOf(strI2).length() + 1 + String.valueOf(authority6).length());
                                    sb11.append(strI2);
                                    sb11.append(".");
                                    sb11.append(authority6);
                                    builderBuildUpon6.authority(sb11.toString());
                                    String string7 = builderBuildUpon6.build().toString();
                                    if (z10) {
                                        p2Var2 = p2Var3;
                                    }
                                    str2 = null;
                                    u3Var = new u3(string7, Collections.EMPTY_MAP, p2Var2, null);
                                } else {
                                    str2 = null;
                                    String str9 = (String) b0.f14590s.a(null);
                                    if (z10) {
                                        p2Var2 = p2Var3;
                                    }
                                    u3Var = new u3(str9, Collections.EMPTY_MAP, p2Var2, null);
                                }
                                arrayList2.add(Pair.create(g3Var110, u3Var));
                            } else {
                                str2 = null;
                            }
                            if (z10) {
                                f3Var = (com.google.android.gms.internal.measurement.f3) g3Var2.i();
                                while (i13 < g3Var2.q()) {
                                    com.google.android.gms.internal.measurement.h3 h3Var9 = (com.google.android.gms.internal.measurement.h3) g3Var2.r(i13).i();
                                    h3Var9.d0();
                                    h3Var9.F(j9);
                                    f3Var.b();
                                    ((com.google.android.gms.internal.measurement.g3) f3Var.B).y(i13, (com.google.android.gms.internal.measurement.i3) h3Var9.e());
                                }
                                arrayList2.add(Pair.create((com.google.android.gms.internal.measurement.g3) f3Var.e(), u3VarW0));
                                k(arrayList);
                                u(false, 204, null, null, str, arrayList2);
                                if (n(str, u3VarW0.a())) {
                                    t().c1().c(str, "[sgtm] Sending sgtm batches available notification to app");
                                    intent = new Intent();
                                    intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                    intent.setPackage(str);
                                    contextE0 = h1Var.e0();
                                    if (Build.VERSION.SDK_INT < i10) {
                                        contextE0.sendBroadcast(intent);
                                        return;
                                    } else {
                                        contextE0.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                        return;
                                    }
                                }
                                return;
                            }
                            str3 = str;
                            g3Var = g3Var2;
                        } else {
                            str2 = null;
                        }
                        t0Var = this.B;
                        R(t0Var);
                        if (t0Var.p1()) {
                            if (Log.isLoggable(t().f1(), 2)) {
                                strY1 = h0().y1(g3Var);
                            } else {
                                strY1 = str2;
                            }
                            h0();
                            byte[] bArrA3 = g3Var.a();
                            k(arrayList);
                            this.I.J.f(j9);
                            t().c1().e("Uploading data. app, uncompressed size, data", str3, Integer.valueOf(bArrA3.length), strY1);
                            this.U = true;
                            R(t0Var);
                            t0Var.u1(str3, u3VarW0, g3Var, new sd.p1((y3) this, str3, (Object) arrayList2, 6));
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    r14 = 0;
                    if (r14 != 0) {
                        r14.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e24) {
                e = e24;
                j10 = -1;
            }
            if (list2.isEmpty()) {
                return;
            }
            l7Var = l7.B;
            g gVarB2 = b0();
            a0Var = b0.f14568h1;
            zF1 = gVarB2.f1(null, a0Var);
            s1Var = s1.ANALYTICS_STORAGE;
            if (zF1) {
                if (!b0().f1(null, a0Var)) {
                    i10 = 34;
                    list6 = list2;
                } else if (a(str3).i(s1Var) || !c0().a1(str3)) {
                    i10 = 34;
                    arrayList5 = new ArrayList(list2.size());
                    m mVarD5 = d0();
                    h1Var2 = (h1) mVarD5.B;
                    com.google.android.gms.common.internal.d0.e(str3);
                    mVarD5.V0();
                    mVarD5.W0();
                    arrayList6 = new ArrayList();
                    sQLiteDatabaseK1 = mVarD5.K1();
                    ((ve.b) h1Var2.k0()).getClass();
                    jCurrentTimeMillis = System.currentTimeMillis();
                    cursorQuery2 = sQLiteDatabaseK1.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)}, null, null, "rowid", null);
                    if (cursorQuery2.moveToFirst()) {
                        h1Var3 = h1Var2;
                        while (true) {
                            arrayList6.add((com.google.android.gms.internal.measurement.a3) ((com.google.android.gms.internal.measurement.z2) t0.I1(com.google.android.gms.internal.measurement.a3.z(), cursorQuery2.getBlob(0))).e());
                            if (!cursorQuery2.moveToNext()) {
                                break;
                                break;
                            } else {
                                cursorQuery2 = cursorQuery2;
                                arrayList6 = arrayList6;
                            }
                        }
                        cursorQuery2.close();
                        int iDelete5 = sQLiteDatabaseK1.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)});
                        b50.b bVarC11 = h1Var3.t().c1();
                        StringBuilder sb12 = new StringBuilder(String.valueOf(iDelete5).length() + 34);
                        sb12.append("Pruned ");
                        sb12.append(iDelete5);
                        sb12.append(" NO_DATA mode events. appId");
                        bVarC11.c(str3, sb12.toString());
                    } else {
                        arrayList6 = arrayList6;
                        cursorQuery2.close();
                    }
                    list7 = arrayList6;
                    it5 = list2.iterator();
                    z15 = true;
                    while (it5.hasNext()) {
                        Pair pair6 = (Pair) it5.next();
                        h3Var2 = (com.google.android.gms.internal.measurement.h3) ((com.google.android.gms.internal.measurement.i3) pair6.first).i();
                        if (z15 && !list7.isEmpty()) {
                            List listX6 = h3Var2.X();
                            h3Var2.b();
                            ((com.google.android.gms.internal.measurement.i3) h3Var2.B).a0();
                            h3Var2.b();
                            ((com.google.android.gms.internal.measurement.i3) h3Var2.B).Z(list7);
                            h3Var2.b();
                            ((com.google.android.gms.internal.measurement.i3) h3Var2.B).Z(listX6);
                            z15 = false;
                        }
                        com.google.android.gms.internal.measurement.t2 t2VarQ6 = com.google.android.gms.internal.measurement.w2.q();
                        z1VarQ1 = c0().q1(str3);
                        arrayList7 = new ArrayList();
                        if (z1VarQ1 != null) {
                            it6 = z1VarQ1.p().iterator();
                            while (it6.hasNext()) {
                                com.google.android.gms.internal.measurement.w1 w1Var6 = (com.google.android.gms.internal.measurement.w1) it6.next();
                                Iterator it111 = it5;
                                com.google.android.gms.internal.measurement.u2 u2VarP6 = com.google.android.gms.internal.measurement.v2.p();
                                boolean z116 = z15;
                                iP = w1Var6.p() - 1;
                                List list18 = list7;
                                if (iP != 1) {
                                    it7 = it6;
                                    i17 = 3;
                                    i18 = 2;
                                } else if (iP != 2) {
                                    it7 = it6;
                                    i17 = 3;
                                    if (iP != 3) {
                                        i18 = 4;
                                    } else if (iP != 4) {
                                        i18 = 1;
                                    } else {
                                        i18 = 5;
                                    }
                                } else {
                                    it7 = it6;
                                    i17 = 3;
                                    i18 = 3;
                                }
                                u2VarP6.h(i18);
                                iR = w1Var6.r() - 1;
                                if (iR != 1) {
                                    i17 = 2;
                                } else if (iR != 2) {
                                    i17 = 1;
                                }
                                u2VarP6.j(i17);
                                arrayList7.add((com.google.android.gms.internal.measurement.v2) u2VarP6.e());
                                it5 = it111;
                                list7 = list18;
                                z15 = z116;
                                it6 = it7;
                            }
                        }
                        Iterator it112 = it5;
                        boolean z117 = z15;
                        List list19 = list7;
                        t2VarQ6.h(arrayList7);
                        h3Var2.H(t2VarQ6);
                        arrayList5.add(Pair.create((com.google.android.gms.internal.measurement.i3) h3Var2.e(), (Long) pair6.second));
                        it5 = it112;
                        list7 = list19;
                        z15 = z117;
                    }
                    list6 = arrayList5;
                } else {
                    List listAsList = Arrays.asList(((String) b0.f14571i1.a(null)).split(","));
                    for (Pair pair7 : list2) {
                        try {
                            d0().e1(((Long) pair7.second).longValue());
                            for (com.google.android.gms.internal.measurement.a3 a3Var2 : ((com.google.android.gms.internal.measurement.i3) pair7.first).P1()) {
                                if (listAsList.contains(a3Var2.s())) {
                                    if (a3Var2.s().equals("_f") || a3Var2.s().equals("_v")) {
                                        com.google.android.gms.internal.measurement.z2 z2Var = (com.google.android.gms.internal.measurement.z2) a3Var2.i();
                                        h0();
                                        t0.b1(z2Var, "_dac", 1L);
                                        a3Var2 = (com.google.android.gms.internal.measurement.a3) z2Var.e();
                                    }
                                    m mVarD6 = d0();
                                    mVarD6.V0();
                                    mVarD6.W0();
                                    com.google.android.gms.common.internal.d0.e(str3);
                                    h1 h1Var5 = (h1) mVarD6.B;
                                    try {
                                        h1Var5.t().c1().c(a3Var2, "Caching events in NO_DATA mode");
                                        ContentValues contentValues = new ContentValues();
                                        contentValues.put("app_id", str3);
                                        com.google.android.gms.internal.measurement.a3 a3Var3 = a3Var2;
                                        contentValues.put("name", a3Var3.s());
                                        contentValues.put("data", a3Var3.a());
                                        contentValues.put("timestamp_millis", Long.valueOf(a3Var3.u()));
                                        try {
                                            if (mVarD6.K1().insert("no_data_mode_events", null, contentValues) == j10) {
                                                h1Var5.t().Z0().c(q0.d1(str3), "Failed to insert NO_DATA mode event (got -1). appId");
                                            }
                                        } catch (SQLiteException e25) {
                                            ((h1) mVarD6.B).t().Z0().d("Error storing NO_DATA mode event. appId", q0.d1(str3), e25);
                                        }
                                    } catch (SQLiteException unused) {
                                        t().L.c(str3, "Failed handling NO_DATA mode bundles. appId");
                                    }
                                }
                            }
                        } catch (SQLiteException unused2) {
                        }
                    }
                    i10 = 34;
                    list6 = Collections.EMPTY_LIST;
                }
                zIsEmpty2 = list6.isEmpty();
                list3 = list6;
                if (zIsEmpty2) {
                    return;
                }
            } else {
                i10 = 34;
                list3 = list2;
            }
            t1VarA = a(str3);
            s1Var2 = s1.AD_STORAGE;
            if (t1VarA.i(s1Var2)) {
                i11 = 0;
                listSubList = list3;
                break;
            }
            it4 = list3.iterator();
            while (true) {
                if (it4.hasNext()) {
                    strV2 = null;
                    break;
                }
                i3Var2 = (com.google.android.gms.internal.measurement.i3) ((Pair) it4.next()).first;
                if (!i3Var2.v().isEmpty()) {
                    strV2 = i3Var2.v();
                    break;
                }
            }
            if (strV2 != null) {
                i11 = 0;
                listSubList = list3;
                break;
            }
            i16 = 0;
            while (true) {
                if (i16 < list3.size()) {
                    i11 = 0;
                    listSubList = list3;
                    break;
                }
                i3Var = (com.google.android.gms.internal.measurement.i3) ((Pair) list3.get(i16)).first;
                if (!i3Var.v().isEmpty() && !i3Var.v().equals(strV2)) {
                    i11 = 0;
                    listSubList = list3.subList(0, i16);
                    break;
                }
                i16++;
            }
            f3VarW = com.google.android.gms.internal.measurement.g3.w();
            size = listSubList.size();
            arrayList = new ArrayList(listSubList.size());
            if (b0().W0(str3) || !a(str3).i(s1Var2)) {
                i12 = i11;
            } else {
                i12 = 1;
            }
            zI = a(str3).i(s1Var2);
            zI2 = a(str3).i(s1Var);
            zF2 = b0().f1(str3, b0.M0);
            v3Var = this.J;
            u3VarW0 = v3Var.W0(str3);
            list4 = listSubList;
            while (true) {
                h1Var = this.L;
                if (i11 < size) {
                    break;
                    break;
                }
                h3Var = (com.google.android.gms.internal.measurement.h3) ((com.google.android.gms.internal.measurement.i3) ((Pair) list4.get(i11)).first).i();
                int i26 = size;
                arrayList.add((Long) ((Pair) list4.get(i11)).second);
                b0().a1();
                h3Var.v();
                h3Var.b();
                ((com.google.android.gms.internal.measurement.i3) h3Var.B).f0(j9);
                h1Var.getClass();
                h3Var.L();
                if (i12 == 0) {
                    h3Var.b();
                    ((com.google.android.gms.internal.measurement.i3) h3Var.B).S0();
                }
                if (!zI) {
                    h3Var.b();
                    ((com.google.android.gms.internal.measurement.i3) h3Var.B).z1();
                    h3Var.b();
                    ((com.google.android.gms.internal.measurement.i3) h3Var.B).B1();
                }
                if (!zI2) {
                    h3Var.b();
                    ((com.google.android.gms.internal.measurement.i3) h3Var.B).D1();
                }
                q(h3Var, str3);
                if (!zF2) {
                    h3Var.b();
                    ((com.google.android.gms.internal.measurement.i3) h3Var.B).Z0();
                }
                if (!zI2) {
                    h3Var.b();
                    ((com.google.android.gms.internal.measurement.i3) h3Var.B).L1();
                }
                strV = ((com.google.android.gms.internal.measurement.i3) h3Var.B).v();
                if (TextUtils.isEmpty(strV)) {
                    i14 = i12;
                    if (strV.equals("00000000-0000-0000-0000-000000000000")) {
                        i15 = i11;
                        z13 = zI2;
                        list5 = list4;
                        z14 = zF2;
                    }
                    if (h3Var.Y() != 0) {
                        if (b0().f1(str3, b0.C0)) {
                            h3Var.S(h0().G1(((com.google.android.gms.internal.measurement.i3) h3Var.e()).a()));
                        }
                        p3VarB = u3VarW0.b();
                        if (p3VarB != null) {
                            h3Var.E(p3VarB);
                        }
                        f3VarW.b();
                        ((com.google.android.gms.internal.measurement.g3) f3VarW.B).z((com.google.android.gms.internal.measurement.i3) h3Var.e());
                    }
                    i11 = i15 + 1;
                    i12 = i14;
                    size = i26;
                    list4 = list5;
                    zI2 = z13;
                    zF2 = z14;
                } else {
                    i14 = i12;
                }
                arrayList4 = new ArrayList(h3Var.X());
                it3 = arrayList4.iterator();
                i15 = i11;
                lValueOf = null;
                lValueOf2 = null;
                z11 = false;
                z12 = false;
                while (it3.hasNext()) {
                    zI2 = zI2;
                    a3Var = (com.google.android.gms.internal.measurement.a3) it3.next();
                    list4 = list4;
                    zF2 = zF2;
                    if ("_fx".equals(a3Var.s())) {
                        it3.remove();
                        z11 = true;
                    } else if ("_f".equals(a3Var.s())) {
                        h0();
                        d3VarD1 = t0.d1(a3Var, "_pfo");
                        if (d3VarD1 != null) {
                            lValueOf = Long.valueOf(d3VarD1.u());
                        }
                        h0();
                        d3VarD2 = t0.d1(a3Var, "_uwa");
                        if (d3VarD2 != null) {
                            lValueOf2 = Long.valueOf(d3VarD2.u());
                        }
                    } else {
                        list4 = list4;
                        zI2 = zI2;
                        zF2 = zF2;
                    }
                    z12 = true;
                }
                z13 = zI2;
                list5 = list4;
                z14 = zF2;
                if (z11) {
                    h3Var.b();
                    ((com.google.android.gms.internal.measurement.i3) h3Var.B).a0();
                    h3Var.b();
                    ((com.google.android.gms.internal.measurement.i3) h3Var.B).Z(arrayList4);
                }
                if (z12) {
                    p(h3Var.q(), true, lValueOf, lValueOf2);
                }
                if (h3Var.Y() != 0) {
                    if (b0().f1(str3, b0.C0)) {
                        h3Var.S(h0().G1(((com.google.android.gms.internal.measurement.i3) h3Var.e()).a()));
                    }
                    p3VarB = u3VarW0.b();
                    if (p3VarB != null) {
                        h3Var.E(p3VarB);
                    }
                    f3VarW.b();
                    ((com.google.android.gms.internal.measurement.g3) f3VarW.B).z((com.google.android.gms.internal.measurement.i3) h3Var.e());
                }
                i11 = i15 + 1;
                i12 = i14;
                size = i26;
                list4 = list5;
                zI2 = z13;
                zF2 = z14;
            }
            if (((com.google.android.gms.internal.measurement.g3) f3VarW.B).q() == 0) {
                k(arrayList);
                u(false, 204, null, null, str3, Collections.EMPTY_LIST);
                return;
            }
            g3Var = (com.google.android.gms.internal.measurement.g3) f3VarW.e();
            arrayList2 = new ArrayList();
            p2Var = u3VarW0.f14740c;
            if (p2Var == p2.SGTM_CLIENT) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (p2Var == p2.SGTM) {
                it = ((com.google.android.gms.internal.measurement.g3) f3VarW.e()).p().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((com.google.android.gms.internal.measurement.i3) it.next()).N()) {
                            string = UUID.randomUUID().toString();
                            break;
                        }
                    } else {
                        string = null;
                        break;
                    }
                }
                com.google.android.gms.internal.measurement.g3 g3Var111 = (com.google.android.gms.internal.measurement.g3) f3VarW.e();
                C().V0();
                j0();
                f3VarX = com.google.android.gms.internal.measurement.g3.x(g3Var111);
                if (!TextUtils.isEmpty(string)) {
                    f3VarX.b();
                    ((com.google.android.gms.internal.measurement.g3) f3VarX.B).C(string);
                }
                strI1 = c0().i1(str3);
                if (!TextUtils.isEmpty(strI1)) {
                    f3VarX.j(strI1);
                }
                arrayList3 = new ArrayList();
                it2 = g3Var111.p().iterator();
                while (it2.hasNext()) {
                    com.google.android.gms.internal.measurement.h3 h3VarV7 = com.google.android.gms.internal.measurement.i3.V((com.google.android.gms.internal.measurement.i3) it2.next());
                    h3VarV7.b();
                    ((com.google.android.gms.internal.measurement.i3) h3VarV7.B).S0();
                    arrayList3.add((com.google.android.gms.internal.measurement.i3) h3VarV7.e());
                }
                f3VarX.b();
                ((com.google.android.gms.internal.measurement.g3) f3VarX.B).B();
                f3VarX.b();
                ((com.google.android.gms.internal.measurement.g3) f3VarX.B).A(arrayList3);
                b50.b bVarC12 = t().c1();
                if (TextUtils.isEmpty(string)) {
                    strH = "null";
                } else {
                    strH = f3VarX.h();
                }
                bVarC12.c(strH, "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
                g3Var2 = (com.google.android.gms.internal.measurement.g3) f3VarX.e();
                if (TextUtils.isEmpty(string)) {
                    com.google.android.gms.internal.measurement.g3 g3Var112 = (com.google.android.gms.internal.measurement.g3) f3VarW.e();
                    C().V0();
                    j0();
                    f3VarW2 = com.google.android.gms.internal.measurement.g3.w();
                    t().c1().c(string, "[sgtm] Processing Google Signal, sgtmJoinId:");
                    f3VarW2.b();
                    ((com.google.android.gms.internal.measurement.g3) f3VarW2.B).C(string);
                    while (r0.hasNext()) {
                        com.google.android.gms.internal.measurement.h3 h3VarU7 = com.google.android.gms.internal.measurement.i3.U();
                        String strO7 = i3Var3.O();
                        h3VarU7.b();
                        ((com.google.android.gms.internal.measurement.i3) h3VarU7.B).R0(strO7);
                        int iK6 = i3Var3.K0();
                        h3VarU7.b();
                        ((com.google.android.gms.internal.measurement.i3) h3VarU7.B).j1(iK6);
                        f3VarW2.b();
                        ((com.google.android.gms.internal.measurement.g3) f3VarW2.B).z((com.google.android.gms.internal.measurement.i3) h3VarU7.e());
                    }
                    com.google.android.gms.internal.measurement.g3 g3Var113 = (com.google.android.gms.internal.measurement.g3) f3VarW2.e();
                    strI2 = v3Var.C.c0().i1(str3);
                    zIsEmpty = TextUtils.isEmpty(strI2);
                    p2Var2 = p2.GOOGLE_SIGNAL;
                    p2Var3 = p2.GOOGLE_SIGNAL_PENDING;
                    if (zIsEmpty) {
                        Uri uri7 = Uri.parse((String) b0.f14590s.a(null));
                        Uri.Builder builderBuildUpon7 = uri7.buildUpon();
                        String authority7 = uri7.getAuthority();
                        StringBuilder sb13 = new StringBuilder(String.valueOf(strI2).length() + 1 + String.valueOf(authority7).length());
                        sb13.append(strI2);
                        sb13.append(".");
                        sb13.append(authority7);
                        builderBuildUpon7.authority(sb13.toString());
                        String string8 = builderBuildUpon7.build().toString();
                        if (z10) {
                            p2Var2 = p2Var3;
                        }
                        str2 = null;
                        u3Var = new u3(string8, Collections.EMPTY_MAP, p2Var2, null);
                    } else {
                        str2 = null;
                        String str10 = (String) b0.f14590s.a(null);
                        if (z10) {
                            p2Var2 = p2Var3;
                        }
                        u3Var = new u3(str10, Collections.EMPTY_MAP, p2Var2, null);
                    }
                    arrayList2.add(Pair.create(g3Var113, u3Var));
                } else {
                    str2 = null;
                }
                if (z10) {
                    f3Var = (com.google.android.gms.internal.measurement.f3) g3Var2.i();
                    while (i13 < g3Var2.q()) {
                        com.google.android.gms.internal.measurement.h3 h3Var10 = (com.google.android.gms.internal.measurement.h3) g3Var2.r(i13).i();
                        h3Var10.d0();
                        h3Var10.F(j9);
                        f3Var.b();
                        ((com.google.android.gms.internal.measurement.g3) f3Var.B).y(i13, (com.google.android.gms.internal.measurement.i3) h3Var10.e());
                    }
                    arrayList2.add(Pair.create((com.google.android.gms.internal.measurement.g3) f3Var.e(), u3VarW0));
                    k(arrayList);
                    u(false, 204, null, null, str, arrayList2);
                    if (n(str, u3VarW0.a())) {
                        t().c1().c(str, "[sgtm] Sending sgtm batches available notification to app");
                        intent = new Intent();
                        intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        intent.setPackage(str);
                        contextE0 = h1Var.e0();
                        if (Build.VERSION.SDK_INT < i10) {
                            contextE0.sendBroadcast(intent);
                            return;
                        } else {
                            contextE0.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                            return;
                        }
                    }
                    return;
                }
                str3 = str;
                g3Var = g3Var2;
            } else if (z10) {
                z10 = true;
                it = ((com.google.android.gms.internal.measurement.g3) f3VarW.e()).p().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((com.google.android.gms.internal.measurement.i3) it.next()).N()) {
                            string = UUID.randomUUID().toString();
                            break;
                        }
                    } else {
                        string = null;
                        break;
                    }
                }
                com.google.android.gms.internal.measurement.g3 g3Var114 = (com.google.android.gms.internal.measurement.g3) f3VarW.e();
                C().V0();
                j0();
                f3VarX = com.google.android.gms.internal.measurement.g3.x(g3Var114);
                if (!TextUtils.isEmpty(string)) {
                    f3VarX.b();
                    ((com.google.android.gms.internal.measurement.g3) f3VarX.B).C(string);
                }
                strI1 = c0().i1(str3);
                if (!TextUtils.isEmpty(strI1)) {
                    f3VarX.j(strI1);
                }
                arrayList3 = new ArrayList();
                it2 = g3Var114.p().iterator();
                while (it2.hasNext()) {
                    com.google.android.gms.internal.measurement.h3 h3VarV8 = com.google.android.gms.internal.measurement.i3.V((com.google.android.gms.internal.measurement.i3) it2.next());
                    h3VarV8.b();
                    ((com.google.android.gms.internal.measurement.i3) h3VarV8.B).S0();
                    arrayList3.add((com.google.android.gms.internal.measurement.i3) h3VarV8.e());
                }
                f3VarX.b();
                ((com.google.android.gms.internal.measurement.g3) f3VarX.B).B();
                f3VarX.b();
                ((com.google.android.gms.internal.measurement.g3) f3VarX.B).A(arrayList3);
                b50.b bVarC13 = t().c1();
                if (TextUtils.isEmpty(string)) {
                    strH = "null";
                } else {
                    strH = f3VarX.h();
                }
                bVarC13.c(strH, "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
                g3Var2 = (com.google.android.gms.internal.measurement.g3) f3VarX.e();
                if (TextUtils.isEmpty(string)) {
                    com.google.android.gms.internal.measurement.g3 g3Var115 = (com.google.android.gms.internal.measurement.g3) f3VarW.e();
                    C().V0();
                    j0();
                    f3VarW2 = com.google.android.gms.internal.measurement.g3.w();
                    t().c1().c(string, "[sgtm] Processing Google Signal, sgtmJoinId:");
                    f3VarW2.b();
                    ((com.google.android.gms.internal.measurement.g3) f3VarW2.B).C(string);
                    while (r0.hasNext()) {
                        com.google.android.gms.internal.measurement.h3 h3VarU8 = com.google.android.gms.internal.measurement.i3.U();
                        String strO8 = i3Var3.O();
                        h3VarU8.b();
                        ((com.google.android.gms.internal.measurement.i3) h3VarU8.B).R0(strO8);
                        int iK7 = i3Var3.K0();
                        h3VarU8.b();
                        ((com.google.android.gms.internal.measurement.i3) h3VarU8.B).j1(iK7);
                        f3VarW2.b();
                        ((com.google.android.gms.internal.measurement.g3) f3VarW2.B).z((com.google.android.gms.internal.measurement.i3) h3VarU8.e());
                    }
                    com.google.android.gms.internal.measurement.g3 g3Var116 = (com.google.android.gms.internal.measurement.g3) f3VarW2.e();
                    strI2 = v3Var.C.c0().i1(str3);
                    zIsEmpty = TextUtils.isEmpty(strI2);
                    p2Var2 = p2.GOOGLE_SIGNAL;
                    p2Var3 = p2.GOOGLE_SIGNAL_PENDING;
                    if (zIsEmpty) {
                        Uri uri8 = Uri.parse((String) b0.f14590s.a(null));
                        Uri.Builder builderBuildUpon8 = uri8.buildUpon();
                        String authority8 = uri8.getAuthority();
                        StringBuilder sb14 = new StringBuilder(String.valueOf(strI2).length() + 1 + String.valueOf(authority8).length());
                        sb14.append(strI2);
                        sb14.append(".");
                        sb14.append(authority8);
                        builderBuildUpon8.authority(sb14.toString());
                        String string9 = builderBuildUpon8.build().toString();
                        if (z10) {
                            p2Var2 = p2Var3;
                        }
                        str2 = null;
                        u3Var = new u3(string9, Collections.EMPTY_MAP, p2Var2, null);
                    } else {
                        str2 = null;
                        String str11 = (String) b0.f14590s.a(null);
                        if (z10) {
                            p2Var2 = p2Var3;
                        }
                        u3Var = new u3(str11, Collections.EMPTY_MAP, p2Var2, null);
                    }
                    arrayList2.add(Pair.create(g3Var116, u3Var));
                } else {
                    str2 = null;
                }
                if (z10) {
                    f3Var = (com.google.android.gms.internal.measurement.f3) g3Var2.i();
                    while (i13 < g3Var2.q()) {
                        com.google.android.gms.internal.measurement.h3 h3Var11 = (com.google.android.gms.internal.measurement.h3) g3Var2.r(i13).i();
                        h3Var11.d0();
                        h3Var11.F(j9);
                        f3Var.b();
                        ((com.google.android.gms.internal.measurement.g3) f3Var.B).y(i13, (com.google.android.gms.internal.measurement.i3) h3Var11.e());
                    }
                    arrayList2.add(Pair.create((com.google.android.gms.internal.measurement.g3) f3Var.e(), u3VarW0));
                    k(arrayList);
                    u(false, 204, null, null, str, arrayList2);
                    if (n(str, u3VarW0.a())) {
                        t().c1().c(str, "[sgtm] Sending sgtm batches available notification to app");
                        intent = new Intent();
                        intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        intent.setPackage(str);
                        contextE0 = h1Var.e0();
                        if (Build.VERSION.SDK_INT < i10) {
                            contextE0.sendBroadcast(intent);
                            return;
                        } else {
                            contextE0.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                            return;
                        }
                    }
                    return;
                }
                str3 = str;
                g3Var = g3Var2;
            } else {
                str2 = null;
            }
            t0Var = this.B;
            R(t0Var);
            if (t0Var.p1()) {
                if (Log.isLoggable(t().f1(), 2)) {
                    strY1 = h0().y1(g3Var);
                } else {
                    strY1 = str2;
                }
                h0();
                byte[] bArrA4 = g3Var.a();
                k(arrayList);
                this.I.J.f(j9);
                t().c1().e("Uploading data. app, uncompressed size, data", str3, Integer.valueOf(bArrA4.length), strY1);
                this.U = true;
                R(t0Var);
                t0Var.u1(str3, u3VarW0, g3Var, new sd.p1((y3) this, str3, (Object) arrayList2, 6));
            }
        } catch (Throwable th6) {
            th = th6;
            r14 = r11;
        }
    }

    public final void m0(g4 g4Var) throws Throwable {
        C().V0();
        j0();
        String str = g4Var.A;
        com.google.android.gms.common.internal.d0.e(str);
        o oVarB = o.b(g4Var.Y);
        t().O.d("Setting DMA consent for package", str, oVarB);
        C().V0();
        j0();
        q1 q1VarA = o.c(100, o0(str)).a();
        this.f14770c0.put(str, oVarB);
        m mVar = this.C;
        R(mVar);
        com.google.android.gms.common.internal.d0.h(str);
        com.google.android.gms.common.internal.d0.h(oVarB);
        mVar.V0();
        mVar.W0();
        t1 t1VarO1 = mVar.o1(str);
        t1 t1Var = t1.f14700c;
        if (t1VarO1 == t1Var) {
            mVar.q1(str, t1Var);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", oVarB.f14678b);
        mVar.s1(contentValues);
        q1 q1VarA2 = o.c(100, o0(str)).a();
        C().V0();
        j0();
        q1 q1Var = q1.GRANTED;
        q1 q1Var2 = q1.DENIED;
        boolean z10 = q1VarA == q1Var2 && q1VarA2 == q1Var;
        boolean z11 = q1VarA == q1Var && q1VarA2 == q1Var2;
        if (z10 || z11) {
            t().O.c(str, "Generated _dcu event for");
            Bundle bundle = new Bundle();
            m mVar2 = this.C;
            R(mVar2);
            if (mVar2.Z1(b(), str, false, false, false, false).f14645f < b0().d1(str, b0.f14579m0)) {
                bundle.putLong("_r", 1L);
                m mVar3 = this.C;
                R(mVar3);
                t().O.d("_dcu realtime event count", str, Long.valueOf(mVar3.Z1(b(), str, false, false, true, false).f14645f));
            }
            this.f14777j0.b(str, "_dcu", bundle);
        }
    }

    public final boolean n(String str, String str2) throws Throwable {
        m mVar = this.C;
        R(mVar);
        u0 u0VarX1 = mVar.X1(str);
        HashMap map = this.f14772e0;
        if (u0VarX1 != null && i0().v1(str, u0VarX1.C())) {
            map.remove(str2);
            return true;
        }
        x3 x3Var = (x3) map.get(str2);
        if (x3Var != null) {
            ((ve.b) x3Var.f14760a.k0()).getClass();
            if (System.currentTimeMillis() < x3Var.f14762c) {
                return false;
            }
        }
        return true;
    }

    public final o n0(String str) {
        C().V0();
        j0();
        HashMap map = this.f14770c0;
        o oVar = (o) map.get(str);
        if (oVar != null) {
            return oVar;
        }
        m mVar = this.C;
        R(mVar);
        com.google.android.gms.common.internal.d0.h(str);
        mVar.V0();
        mVar.W0();
        o oVarB = o.b(mVar.r1("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}));
        map.put(str, oVarB);
        return oVarB;
    }

    public final void o(String str) {
        C().V0();
        j0();
        this.V = true;
        try {
            h1 h1Var = this.L;
            h1Var.getClass();
            Boolean bool = h1Var.j().F;
            if (bool == null) {
                t().J.b("Upload data called on the client side before use of service was decided");
            } else if (bool.booleanValue()) {
                t().G.b("Upload called in the client side when service should be used");
            } else if (this.O > 0) {
                K();
            } else {
                t0 t0Var = this.B;
                R(t0Var);
                if (t0Var.p1()) {
                    m mVar = this.C;
                    R(mVar);
                    if (mVar.b1(str)) {
                        m mVar2 = this.C;
                        R(mVar2);
                        com.google.android.gms.common.internal.d0.e(str);
                        mVar2.V0();
                        mVar2.W0();
                        List listA1 = mVar2.a1(str, r3.a(p2.GOOGLE_SIGNAL), 1);
                        a4 a4Var = listA1.isEmpty() ? null : (a4) listA1.get(0);
                        if (a4Var != null) {
                            com.google.android.gms.internal.measurement.g3 g3Var = a4Var.f14528b;
                            t().O.e("[sgtm] Uploading data from upload queue. appId, type, url", str, a4Var.f14531e, a4Var.f14529c);
                            byte[] bArrA = g3Var.a();
                            if (Log.isLoggable(t().f1(), 2)) {
                                t0 t0Var2 = this.G;
                                R(t0Var2);
                                t().O.e("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(bArrA.length), t0Var2.y1(g3Var));
                            }
                            u3 u3Var = new u3(a4Var.f14529c, a4Var.f14530d, a4Var.f14531e, null);
                            this.U = true;
                            t0 t0Var3 = this.B;
                            R(t0Var3);
                            t0Var3.u1(str, u3Var, g3Var, new sd.p1(this, str, (Object) a4Var, 7));
                        }
                    } else {
                        t().O.c(str, "[sgtm] Upload queue has no batches for appId");
                    }
                } else {
                    t().O.b("Network not connected, ignoring upload request");
                    K();
                }
            }
        } finally {
            this.V = false;
            L();
        }
    }

    public final Bundle o0(String str) throws Throwable {
        C().V0();
        j0();
        a1 a1Var = this.A;
        R(a1Var);
        if (a1Var.q1(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        t1 t1VarA = a(str);
        Bundle bundle2 = new Bundle();
        Iterator it = t1VarA.f14701a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int iOrdinal = ((q1) entry.getValue()).ordinal();
            String str2 = iOrdinal != 2 ? iOrdinal != 3 ? null : "granted" : "denied";
            if (str2 != null) {
                bundle2.putString(((s1) entry.getKey()).A, str2);
            }
        }
        bundle.putAll(bundle2);
        o oVarP0 = p0(str, n0(str), t1VarA, new o10.b(17));
        Bundle bundle3 = new Bundle();
        for (Map.Entry entry2 : oVarP0.f14681e.entrySet()) {
            int iOrdinal2 = ((q1) entry2.getValue()).ordinal();
            String str3 = iOrdinal2 != 2 ? iOrdinal2 != 3 ? null : "granted" : "denied";
            if (str3 != null) {
                bundle3.putString(((s1) entry2.getKey()).A, str3);
            }
        }
        Boolean bool = oVarP0.f14679c;
        if (bool != null) {
            bundle3.putString("is_dma_region", bool.toString());
        }
        String str4 = oVarP0.f14680d;
        if (str4 != null) {
            bundle3.putString("cps_display_str", str4);
        }
        bundle.putAll(bundle3);
        m mVar = this.C;
        R(mVar);
        c4 c4VarP1 = mVar.P1(str, "_npa");
        bundle.putString("ad_personalization", 1 != (c4VarP1 != null ? c4VarP1.f14612e.equals(1L) : B(str, new o10.b(17))) ? "granted" : "denied");
        return bundle;
    }

    public final void p(String str, boolean z10, Long l, Long l10) throws Throwable {
        m mVar = this.C;
        R(mVar);
        u0 u0VarX1 = mVar.X1(str);
        if (u0VarX1 != null) {
            h1 h1Var = u0VarX1.f14703a;
            e1 e1Var = h1Var.G;
            h1.g(e1Var);
            e1Var.V0();
            u0VarX1.Q |= u0VarX1.f14725y != z10;
            u0VarX1.f14725y = z10;
            e1 e1Var2 = h1Var.G;
            h1.g(e1Var2);
            e1Var2.V0();
            u0VarX1.Q |= !Objects.equals(u0VarX1.f14726z, l);
            u0VarX1.f14726z = l;
            e1 e1Var3 = h1Var.G;
            h1.g(e1Var3);
            e1Var3.V0();
            u0VarX1.Q |= !Objects.equals(u0VarX1.A, l10);
            u0VarX1.A = l10;
            if (u0VarX1.o()) {
                m mVar2 = this.C;
                R(mVar2);
                mVar2.Y1(u0VarX1, false);
            }
        }
    }

    public final o p0(String str, o oVar, t1 t1Var, o10.b bVar) {
        s1 s1VarG1;
        q1 q1VarZ0;
        a1 a1Var = this.A;
        R(a1Var);
        com.google.android.gms.internal.measurement.z1 z1VarQ1 = a1Var.q1(str);
        int i10 = 90;
        q1 q1Var = q1.DENIED;
        s1 s1Var = s1.AD_USER_DATA;
        if (z1VarQ1 == null) {
            if (oVar.a() == q1Var) {
                i10 = oVar.f14677a;
                bVar.B(s1Var, i10);
            } else {
                bVar.C(s1Var, h.FAILSAFE);
            }
            return new o(Boolean.FALSE, i10, Boolean.TRUE, "-");
        }
        q1 q1VarA = oVar.a();
        q1 q1Var2 = q1.GRANTED;
        if (q1VarA == q1Var2 || q1VarA == q1Var) {
            i10 = oVar.f14677a;
            bVar.B(s1Var, i10);
        } else {
            q1 q1Var3 = q1.POLICY;
            q1 q1Var4 = q1.UNINITIALIZED;
            if (q1VarA != q1Var3 || (q1VarZ0 = a1Var.Z0(str, s1Var)) == q1Var4) {
                a1Var.V0();
                a1Var.b1(str);
                com.google.android.gms.internal.measurement.z1 z1VarQ2 = a1Var.q1(str);
                if (z1VarQ2 != null) {
                    Iterator it = z1VarQ2.q().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            s1VarG1 = null;
                            break;
                        }
                        com.google.android.gms.internal.measurement.x1 x1Var = (com.google.android.gms.internal.measurement.x1) it.next();
                        if (s1Var == a1.g1(x1Var.p())) {
                            s1VarG1 = a1.g1(x1Var.q());
                            break;
                        }
                    }
                } else {
                    s1VarG1 = null;
                    break;
                }
                EnumMap enumMap = t1Var.f14701a;
                s1 s1Var2 = s1.AD_STORAGE;
                q1 q1Var5 = (q1) enumMap.get(s1Var2);
                if (q1Var5 != null) {
                    q1Var4 = q1Var5;
                }
                boolean z10 = q1Var4 == q1Var2 || q1Var4 == q1Var;
                if (s1VarG1 == s1Var2 && z10) {
                    bVar.C(s1Var, h.REMOTE_DELEGATION);
                    q1VarA = q1Var4;
                } else {
                    bVar.C(s1Var, h.REMOTE_DEFAULT);
                    q1VarA = true != a1Var.p1(str, s1Var) ? q1Var : q1Var2;
                }
            } else {
                bVar.C(s1Var, h.REMOTE_ENFORCED_DEFAULT);
                q1VarA = q1VarZ0;
            }
        }
        a1Var.V0();
        a1Var.b1(str);
        com.google.android.gms.internal.measurement.z1 z1VarQ3 = a1Var.q1(str);
        boolean z11 = z1VarQ3 == null || !z1VarQ3.s() || z1VarQ3.t();
        R(a1Var);
        a1Var.V0();
        a1Var.b1(str);
        TreeSet treeSet = new TreeSet();
        com.google.android.gms.internal.measurement.z1 z1VarQ4 = a1Var.q1(str);
        if (z1VarQ4 != null) {
            Iterator it2 = z1VarQ4.r().iterator();
            while (it2.hasNext()) {
                treeSet.add(((com.google.android.gms.internal.measurement.y1) it2.next()).p());
            }
        }
        if (q1VarA == q1Var || treeSet.isEmpty()) {
            return new o(Boolean.FALSE, i10, Boolean.valueOf(z11), "-");
        }
        Boolean bool = Boolean.TRUE;
        Boolean boolValueOf = Boolean.valueOf(z11);
        String strJoin = RuntimeVersion.SUFFIX;
        if (z11) {
            strJoin = TextUtils.join(RuntimeVersion.SUFFIX, treeSet);
        }
        return new o(bool, i10, boolValueOf, strJoin);
    }

    public final void q(com.google.android.gms.internal.measurement.h3 h3Var, String str) {
        int iJ1;
        int iIndexOf;
        a1 a1Var = this.A;
        R(a1Var);
        a1Var.V0();
        a1Var.b1(str);
        u.e eVar = a1Var.F;
        Set set = (Set) eVar.get(str);
        if (set != null) {
            h3Var.b();
            ((com.google.android.gms.internal.measurement.i3) h3Var.B).a1(set);
        }
        R(a1Var);
        a1Var.V0();
        a1Var.b1(str);
        if (eVar.get(str) != null && (((Set) eVar.get(str)).contains("device_model") || ((Set) eVar.get(str)).contains("device_info"))) {
            h3Var.b();
            ((com.google.android.gms.internal.measurement.i3) h3Var.B).q1();
        }
        R(a1Var);
        if (a1Var.n1(str)) {
            String strI2 = ((com.google.android.gms.internal.measurement.i3) h3Var.B).i2();
            if (!TextUtils.isEmpty(strI2) && (iIndexOf = strI2.indexOf(".")) != -1) {
                String strSubstring = strI2.substring(0, iIndexOf);
                h3Var.b();
                ((com.google.android.gms.internal.measurement.i3) h3Var.B).o0(strSubstring);
            }
        }
        R(a1Var);
        a1Var.V0();
        a1Var.b1(str);
        if (eVar.get(str) != null && ((Set) eVar.get(str)).contains("user_id") && (iJ1 = t0.J1(h3Var, "_id")) != -1) {
            h3Var.b();
            ((com.google.android.gms.internal.measurement.i3) h3Var.B).e0(iJ1);
        }
        R(a1Var);
        a1Var.V0();
        a1Var.b1(str);
        if (eVar.get(str) != null && ((Set) eVar.get(str)).contains("google_signals")) {
            h3Var.b();
            ((com.google.android.gms.internal.measurement.i3) h3Var.B).S0();
        }
        R(a1Var);
        if (a1Var.o1(str)) {
            h3Var.b();
            ((com.google.android.gms.internal.measurement.i3) h3Var.B).D1();
            if (a(str).i(s1.ANALYTICS_STORAGE)) {
                HashMap map = this.f14771d0;
                w3 w3Var = (w3) map.get(str);
                if (w3Var != null) {
                    long jC1 = b0().c1(str, b0.f14576k0) + w3Var.f14759b;
                    ((ve.b) k0()).getClass();
                    if (jC1 < SystemClock.elapsedRealtime()) {
                        w3Var = new w3(this, i0().N1());
                        map.put(str, w3Var);
                    }
                } else {
                    w3Var = new w3(this, i0().N1());
                    map.put(str, w3Var);
                }
                String str2 = w3Var.f14758a;
                h3Var.b();
                ((com.google.android.gms.internal.measurement.i3) h3Var.B).b1(str2);
            }
        }
        R(a1Var);
        a1Var.V0();
        a1Var.b1(str);
        if (eVar.get(str) == null || !((Set) eVar.get(str)).contains("enhanced_user_id")) {
            return;
        }
        h3Var.b();
        ((com.google.android.gms.internal.measurement.i3) h3Var.B).Z0();
    }

    public final void r(com.google.android.gms.internal.measurement.h3 h3Var, bb.d dVar) {
        String strN1;
        String strN2;
        for (int i10 = 0; i10 < h3Var.Y(); i10++) {
            com.google.android.gms.internal.measurement.z2 z2Var = (com.google.android.gms.internal.measurement.z2) ((com.google.android.gms.internal.measurement.i3) h3Var.B).T1(i10).i();
            Iterator it = z2Var.h().iterator();
            while (it.hasNext()) {
                if ("_c".equals(((com.google.android.gms.internal.measurement.d3) it.next()).q())) {
                    if (((com.google.android.gms.internal.measurement.i3) dVar.B).G0() >= b0().d1(((com.google.android.gms.internal.measurement.i3) dVar.B).p(), b0.f14578l0)) {
                        int iD1 = b0().d1(((com.google.android.gms.internal.measurement.i3) dVar.B).p(), b0.f14603y0);
                        LinkedList linkedList = this.Q;
                        t0 t0Var = this.G;
                        if (iD1 > 0) {
                            m mVar = this.C;
                            R(mVar);
                            if (mVar.Z1(b(), ((com.google.android.gms.internal.measurement.i3) dVar.B).p(), false, false, false, true).f14646g > iD1) {
                                com.google.android.gms.internal.measurement.c3 c3VarB = com.google.android.gms.internal.measurement.d3.B();
                                c3VarB.h("_tnr");
                                c3VarB.k(1L);
                                z2Var.m((com.google.android.gms.internal.measurement.d3) c3VarB.e());
                            } else {
                                if (b0().f1(((com.google.android.gms.internal.measurement.i3) dVar.B).p(), b0.R0)) {
                                    strN2 = i0().N1();
                                    com.google.android.gms.internal.measurement.c3 c3VarB2 = com.google.android.gms.internal.measurement.d3.B();
                                    c3VarB2.h("_tu");
                                    c3VarB2.j(strN2);
                                    z2Var.m((com.google.android.gms.internal.measurement.d3) c3VarB2.e());
                                } else {
                                    strN2 = null;
                                }
                                com.google.android.gms.internal.measurement.c3 c3VarB3 = com.google.android.gms.internal.measurement.d3.B();
                                c3VarB3.h("_tr");
                                c3VarB3.k(1L);
                                z2Var.m((com.google.android.gms.internal.measurement.d3) c3VarB3.e());
                                R(t0Var);
                                n3 n3VarW1 = t0Var.w1(((com.google.android.gms.internal.measurement.i3) dVar.B).p(), h3Var, z2Var, strN2);
                                if (n3VarW1 != null) {
                                    t().O.d("Generated trigger URI. appId, uri", ((com.google.android.gms.internal.measurement.i3) dVar.B).p(), n3VarW1.A);
                                    m mVar2 = this.C;
                                    R(mVar2);
                                    mVar2.p1(((com.google.android.gms.internal.measurement.i3) dVar.B).p(), n3VarW1);
                                    if (!linkedList.contains(((com.google.android.gms.internal.measurement.i3) dVar.B).p())) {
                                        linkedList.add(((com.google.android.gms.internal.measurement.i3) dVar.B).p());
                                    }
                                }
                            }
                        } else {
                            if (b0().f1(((com.google.android.gms.internal.measurement.i3) dVar.B).p(), b0.R0)) {
                                strN1 = i0().N1();
                                com.google.android.gms.internal.measurement.c3 c3VarB4 = com.google.android.gms.internal.measurement.d3.B();
                                c3VarB4.h("_tu");
                                c3VarB4.j(strN1);
                                z2Var.m((com.google.android.gms.internal.measurement.d3) c3VarB4.e());
                            } else {
                                strN1 = null;
                            }
                            com.google.android.gms.internal.measurement.c3 c3VarB5 = com.google.android.gms.internal.measurement.d3.B();
                            c3VarB5.h("_tr");
                            c3VarB5.k(1L);
                            z2Var.m((com.google.android.gms.internal.measurement.d3) c3VarB5.e());
                            R(t0Var);
                            n3 n3VarW2 = t0Var.w1(((com.google.android.gms.internal.measurement.i3) dVar.B).p(), h3Var, z2Var, strN1);
                            if (n3VarW2 != null) {
                                t().O.d("Generated trigger URI. appId, uri", ((com.google.android.gms.internal.measurement.i3) dVar.B).p(), n3VarW2.A);
                                m mVar3 = this.C;
                                R(mVar3);
                                mVar3.p1(((com.google.android.gms.internal.measurement.i3) dVar.B).p(), n3VarW2);
                                if (!linkedList.contains(((com.google.android.gms.internal.measurement.i3) dVar.B).p())) {
                                    linkedList.add(((com.google.android.gms.internal.measurement.i3) dVar.B).p());
                                }
                            }
                        }
                    }
                    com.google.android.gms.internal.measurement.a3 a3Var = (com.google.android.gms.internal.measurement.a3) z2Var.e();
                    h3Var.b();
                    ((com.google.android.gms.internal.measurement.i3) h3Var.B).X(i10, a3Var);
                    break;
                }
            }
        }
    }

    public final void s(String str, com.google.android.gms.internal.measurement.c3 c3Var, Bundle bundle, String str2) {
        int iMax;
        List listUnmodifiableList = Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si"));
        if (e4.t1(((com.google.android.gms.internal.measurement.d3) c3Var.B).q()) || e4.t1(str)) {
            g gVarB0 = b0();
            gVarB0.getClass();
            iMax = Math.max(Math.max(Math.min(gVarB0.d1(str2, b0.f14567h0), MediaError.DetailedErrorCode.SEGMENT_UNKNOWN), 100), 256);
        } else {
            g gVarB1 = b0();
            gVarB1.getClass();
            iMax = Math.max(Math.min(gVarB1.d1(str2, b0.f14567h0), MediaError.DetailedErrorCode.SEGMENT_UNKNOWN), 100);
        }
        long j9 = iMax;
        long jCodePointCount = ((com.google.android.gms.internal.measurement.d3) c3Var.B).s().codePointCount(0, ((com.google.android.gms.internal.measurement.d3) c3Var.B).s().length());
        i0();
        String strQ = ((com.google.android.gms.internal.measurement.d3) c3Var.B).q();
        b0();
        String strA1 = e4.a1(strQ, 40, true);
        if (jCodePointCount <= j9 || listUnmodifiableList.contains(((com.google.android.gms.internal.measurement.d3) c3Var.B).q())) {
            return;
        }
        if ("_ev".equals(((com.google.android.gms.internal.measurement.d3) c3Var.B).q())) {
            i0();
            String strS = ((com.google.android.gms.internal.measurement.d3) c3Var.B).s();
            g gVarB2 = b0();
            gVarB2.getClass();
            bundle.putString("_ev", e4.a1(strS, Math.max(Math.max(Math.min(gVarB2.d1(str2, b0.f14567h0), MediaError.DetailedErrorCode.SEGMENT_UNKNOWN), 100), 256), true));
            return;
        }
        t().L.d("Param value is too long; discarded. Name, value length", strA1, Long.valueOf(jCodePointCount));
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", 4L);
            if (bundle.getString("_ev") == null) {
                bundle.putString("_ev", strA1);
                bundle.putLong("_el", jCodePointCount);
            }
        }
        bundle.remove(((com.google.android.gms.internal.measurement.d3) c3Var.B).q());
    }

    @Override
    public final q0 t() {
        h1 h1Var = this.L;
        com.google.android.gms.common.internal.d0.h(h1Var);
        q0 q0Var = h1Var.F;
        h1.g(q0Var);
        return q0Var;
    }

    public final void u(boolean z10, int i10, Throwable th2, byte[] bArr, String str, List list) {
        byte[] bArr2;
        Integer numValueOf;
        HashMap map;
        Iterator it;
        boolean zHasNext;
        p2 p2Var;
        Iterator it2;
        List listA1;
        m mVar;
        long j9;
        com.google.android.gms.internal.measurement.g3 g3Var;
        u3 u3Var;
        Map map2;
        com.google.android.gms.internal.measurement.g3 g3Var2;
        u3 u3Var2;
        p2 p2Var2;
        p2 p2Var3;
        Map map3;
        long jZ0;
        int i11 = i10;
        t0 t0Var = this.B;
        C().V0();
        j0();
        if (bArr == null) {
            try {
                bArr2 = new byte[0];
            } catch (Throwable th3) {
                this.U = false;
                L();
                throw th3;
            }
        } else {
            bArr2 = bArr;
        }
        ArrayList<Long> arrayList = this.Y;
        com.google.android.gms.common.internal.d0.h(arrayList);
        this.Y = null;
        if (z10) {
            if (i11 == 200) {
                if (th2 != null) {
                    b50.b bVar = t().O;
                    numValueOf = Integer.valueOf(i11);
                    bVar.d("Network upload successful with code, uploadAttempted", numValueOf, Boolean.valueOf(z10));
                    if (z10) {
                        i7.m1 m1Var = this.I.I;
                        ((ve.b) k0()).getClass();
                        m1Var.f(System.currentTimeMillis());
                    }
                    this.I.J.f(0L);
                    K();
                    if (z10) {
                        t().O.d("Successful upload. Got network response. code, size", numValueOf, Integer.valueOf(bArr2.length));
                    } else {
                        t().O.b("Purged empty bundles");
                    }
                    m mVar2 = this.C;
                    R(mVar2);
                    mVar2.H1();
                    map = new HashMap();
                    it = list.iterator();
                    while (true) {
                        zHasNext = it.hasNext();
                        p2Var = p2.SGTM_CLIENT;
                        if (!zHasNext) {
                            break;
                            break;
                        }
                        Pair pair = (Pair) it.next();
                        g3Var2 = (com.google.android.gms.internal.measurement.g3) pair.first;
                        u3Var2 = (u3) pair.second;
                        p2Var2 = u3Var2.f14740c;
                        p2Var3 = u3Var2.f14740c;
                        if (p2Var2 != p2Var) {
                            m mVar3 = this.C;
                            R(mVar3);
                            String str2 = u3Var2.f14738a;
                            map3 = u3Var2.f14739b;
                            if (map3 == null) {
                                map3 = Collections.EMPTY_MAP;
                            }
                            jZ0 = mVar3.Z0(str, g3Var2, str2, map3, p2Var3, null);
                            if (p2Var3 == p2.GOOGLE_SIGNAL_PENDING) {
                                map.put(g3Var2.t(), Long.valueOf(jZ0));
                            }
                        }
                    }
                    it2 = list.iterator();
                    while (it2.hasNext()) {
                        Pair pair2 = (Pair) it2.next();
                        g3Var = (com.google.android.gms.internal.measurement.g3) pair2.first;
                        u3Var = (u3) pair2.second;
                        if (u3Var.f14740c == p2Var) {
                            Long l = (Long) map.get(g3Var.t());
                            m mVar4 = this.C;
                            R(mVar4);
                            p2 p2Var4 = p2Var;
                            String str3 = u3Var.f14738a;
                            map2 = u3Var.f14739b;
                            if (map2 == null) {
                                map2 = Collections.EMPTY_MAP;
                            }
                            mVar4.Z0(str, g3Var, str3, map2, u3Var.f14740c, l);
                            p2Var = p2Var4;
                        }
                    }
                    m mVar5 = this.C;
                    R(mVar5);
                    listA1 = mVar5.a1(str, r3.a(p2Var), 1);
                    if (!listA1.isEmpty()) {
                        j9 = ((a4) listA1.get(0)).f14532f;
                        ((ve.b) k0()).getClass();
                        if (System.currentTimeMillis() > ((Long) b0.F.a(null)).longValue() + j9) {
                            t().J.d("[sgtm] client batches are queued too long. appId, creationTime", str, Long.valueOf(j9));
                        }
                    }
                    for (Long l10 : arrayList) {
                        m mVar6 = this.C;
                        R(mVar6);
                        mVar6.e1(l10.longValue());
                    }
                    m mVar7 = this.C;
                    R(mVar7);
                    mVar7.I1();
                    m mVar8 = this.C;
                    R(mVar8);
                    mVar8.J1();
                    this.Z = null;
                    R(t0Var);
                    if (t0Var.p1()) {
                        mVar = this.C;
                        R(mVar);
                        if (mVar.b1(str)) {
                            o(str);
                        } else {
                            R(t0Var);
                            if (t0Var.p1()) {
                                this.f14768a0 = -1L;
                                K();
                            } else {
                                this.f14768a0 = -1L;
                                K();
                            }
                        }
                    } else {
                        R(t0Var);
                        if (t0Var.p1()) {
                            this.f14768a0 = -1L;
                            K();
                        } else {
                            this.f14768a0 = -1L;
                            K();
                        }
                    }
                    this.O = 0L;
                }
            } else if (i11 == 204) {
                i11 = 204;
                if (th2 != null) {
                    b50.b bVar2 = t().O;
                    numValueOf = Integer.valueOf(i11);
                    bVar2.d("Network upload successful with code, uploadAttempted", numValueOf, Boolean.valueOf(z10));
                    if (z10) {
                        i7.m1 m1Var2 = this.I.I;
                        ((ve.b) k0()).getClass();
                        m1Var2.f(System.currentTimeMillis());
                    }
                    this.I.J.f(0L);
                    K();
                    if (z10) {
                        t().O.d("Successful upload. Got network response. code, size", numValueOf, Integer.valueOf(bArr2.length));
                    } else {
                        t().O.b("Purged empty bundles");
                    }
                    m mVar9 = this.C;
                    R(mVar9);
                    mVar9.H1();
                    map = new HashMap();
                    it = list.iterator();
                    while (true) {
                        zHasNext = it.hasNext();
                        p2Var = p2.SGTM_CLIENT;
                        if (!zHasNext) {
                            break;
                            break;
                        }
                        Pair pair3 = (Pair) it.next();
                        g3Var2 = (com.google.android.gms.internal.measurement.g3) pair3.first;
                        u3Var2 = (u3) pair3.second;
                        p2Var2 = u3Var2.f14740c;
                        p2Var3 = u3Var2.f14740c;
                        if (p2Var2 != p2Var) {
                            m mVar10 = this.C;
                            R(mVar10);
                            String str4 = u3Var2.f14738a;
                            map3 = u3Var2.f14739b;
                            if (map3 == null) {
                                map3 = Collections.EMPTY_MAP;
                            }
                            jZ0 = mVar10.Z0(str, g3Var2, str4, map3, p2Var3, null);
                            if (p2Var3 == p2.GOOGLE_SIGNAL_PENDING) {
                                map.put(g3Var2.t(), Long.valueOf(jZ0));
                            }
                        }
                    }
                    it2 = list.iterator();
                    while (it2.hasNext()) {
                        Pair pair4 = (Pair) it2.next();
                        g3Var = (com.google.android.gms.internal.measurement.g3) pair4.first;
                        u3Var = (u3) pair4.second;
                        if (u3Var.f14740c == p2Var) {
                            Long l11 = (Long) map.get(g3Var.t());
                            m mVar11 = this.C;
                            R(mVar11);
                            p2 p2Var5 = p2Var;
                            String str5 = u3Var.f14738a;
                            map2 = u3Var.f14739b;
                            if (map2 == null) {
                                map2 = Collections.EMPTY_MAP;
                            }
                            mVar11.Z0(str, g3Var, str5, map2, u3Var.f14740c, l11);
                            p2Var = p2Var5;
                        }
                    }
                    m mVar12 = this.C;
                    R(mVar12);
                    listA1 = mVar12.a1(str, r3.a(p2Var), 1);
                    if (!listA1.isEmpty()) {
                        j9 = ((a4) listA1.get(0)).f14532f;
                        ((ve.b) k0()).getClass();
                        if (System.currentTimeMillis() > ((Long) b0.F.a(null)).longValue() + j9) {
                            t().J.d("[sgtm] client batches are queued too long. appId, creationTime", str, Long.valueOf(j9));
                        }
                    }
                    while (r2.hasNext()) {
                        m mVar13 = this.C;
                        R(mVar13);
                        mVar13.e1(l10.longValue());
                    }
                    m mVar14 = this.C;
                    R(mVar14);
                    mVar14.I1();
                    m mVar15 = this.C;
                    R(mVar15);
                    mVar15.J1();
                    this.Z = null;
                    R(t0Var);
                    if (t0Var.p1()) {
                        mVar = this.C;
                        R(mVar);
                        if (mVar.b1(str)) {
                            o(str);
                        } else {
                            R(t0Var);
                            if (t0Var.p1()) {
                                this.f14768a0 = -1L;
                                K();
                            } else {
                                this.f14768a0 = -1L;
                                K();
                            }
                        }
                    } else {
                        R(t0Var);
                        if (t0Var.p1()) {
                            this.f14768a0 = -1L;
                            K();
                        } else {
                            this.f14768a0 = -1L;
                            K();
                        }
                    }
                    this.O = 0L;
                }
            }
            String str6 = new String(bArr2, StandardCharsets.UTF_8);
            t().L.e("Network upload failed. Will retry later. code, error", Integer.valueOf(i11), th2, str6.substring(0, Math.min(32, str6.length())));
            i7.m1 m1Var3 = this.I.J;
            ((ve.b) k0()).getClass();
            m1Var3.f(System.currentTimeMillis());
            if (i11 == 503 || i11 == 429) {
                i7.m1 m1Var4 = this.I.H;
                ((ve.b) k0()).getClass();
                m1Var4.f(System.currentTimeMillis());
            }
            m mVar16 = this.C;
            R(mVar16);
            mVar16.g1(arrayList);
            K();
        } else {
            b50.b bVar3 = t().O;
            numValueOf = Integer.valueOf(i11);
            bVar3.d("Network upload successful with code, uploadAttempted", numValueOf, Boolean.valueOf(z10));
            if (z10) {
                try {
                    i7.m1 m1Var5 = this.I.I;
                    ((ve.b) k0()).getClass();
                    m1Var5.f(System.currentTimeMillis());
                } catch (SQLiteException e3) {
                    t().G.c(e3, "Database error while trying to delete uploaded bundles");
                    ((ve.b) k0()).getClass();
                    this.O = SystemClock.elapsedRealtime();
                    t().O.c(Long.valueOf(this.O), "Disable upload, time");
                }
            }
            this.I.J.f(0L);
            K();
            if (z10) {
                t().O.d("Successful upload. Got network response. code, size", numValueOf, Integer.valueOf(bArr2.length));
            } else {
                t().O.b("Purged empty bundles");
            }
            m mVar17 = this.C;
            R(mVar17);
            mVar17.H1();
            try {
                map = new HashMap();
                it = list.iterator();
                while (true) {
                    zHasNext = it.hasNext();
                    p2Var = p2.SGTM_CLIENT;
                    if (!zHasNext) {
                        break;
                    }
                    Pair pair5 = (Pair) it.next();
                    g3Var2 = (com.google.android.gms.internal.measurement.g3) pair5.first;
                    u3Var2 = (u3) pair5.second;
                    p2Var2 = u3Var2.f14740c;
                    p2Var3 = u3Var2.f14740c;
                    if (p2Var2 != p2Var) {
                        m mVar18 = this.C;
                        R(mVar18);
                        String str7 = u3Var2.f14738a;
                        map3 = u3Var2.f14739b;
                        if (map3 == null) {
                            map3 = Collections.EMPTY_MAP;
                        }
                        jZ0 = mVar18.Z0(str, g3Var2, str7, map3, p2Var3, null);
                        if (p2Var3 == p2.GOOGLE_SIGNAL_PENDING && jZ0 != -1 && !g3Var2.t().isEmpty()) {
                            map.put(g3Var2.t(), Long.valueOf(jZ0));
                        }
                    }
                }
                it2 = list.iterator();
                while (it2.hasNext()) {
                    Pair pair6 = (Pair) it2.next();
                    g3Var = (com.google.android.gms.internal.measurement.g3) pair6.first;
                    u3Var = (u3) pair6.second;
                    if (u3Var.f14740c == p2Var) {
                        Long l12 = (Long) map.get(g3Var.t());
                        m mVar19 = this.C;
                        R(mVar19);
                        p2 p2Var6 = p2Var;
                        String str8 = u3Var.f14738a;
                        map2 = u3Var.f14739b;
                        if (map2 == null) {
                            map2 = Collections.EMPTY_MAP;
                        }
                        mVar19.Z0(str, g3Var, str8, map2, u3Var.f14740c, l12);
                        p2Var = p2Var6;
                    }
                }
                m mVar110 = this.C;
                R(mVar110);
                listA1 = mVar110.a1(str, r3.a(p2Var), 1);
                if (!listA1.isEmpty()) {
                    j9 = ((a4) listA1.get(0)).f14532f;
                    ((ve.b) k0()).getClass();
                    if (System.currentTimeMillis() > ((Long) b0.F.a(null)).longValue() + j9) {
                        t().J.d("[sgtm] client batches are queued too long. appId, creationTime", str, Long.valueOf(j9));
                    }
                }
                while (r2.hasNext()) {
                    try {
                        m mVar111 = this.C;
                        R(mVar111);
                        mVar111.e1(l10.longValue());
                    } catch (SQLiteException e10) {
                        ArrayList arrayList2 = this.Z;
                        if (arrayList2 == null || !arrayList2.contains(l10)) {
                            throw e10;
                        }
                    }
                }
                m mVar112 = this.C;
                R(mVar112);
                mVar112.I1();
                m mVar113 = this.C;
                R(mVar113);
                mVar113.J1();
                this.Z = null;
                R(t0Var);
                if (t0Var.p1()) {
                    mVar = this.C;
                    R(mVar);
                    if (mVar.b1(str)) {
                        o(str);
                    } else {
                        R(t0Var);
                        if (t0Var.p1() || !I()) {
                            this.f14768a0 = -1L;
                            K();
                        } else {
                            l();
                        }
                    }
                } else {
                    R(t0Var);
                    if (t0Var.p1()) {
                        this.f14768a0 = -1L;
                        K();
                    } else {
                        this.f14768a0 = -1L;
                        K();
                    }
                }
                this.O = 0L;
            } catch (Throwable th4) {
                m mVar20 = this.C;
                R(mVar20);
                mVar20.J1();
                throw th4;
            }
        }
        this.U = false;
        L();
    }

    public final void v(u0 u0Var) {
        u.e eVar;
        u.e eVar2;
        C().V0();
        if (TextUtils.isEmpty(u0Var.G())) {
            String strD = u0Var.D();
            com.google.android.gms.common.internal.d0.h(strD);
            w(strD, 204, null, null, null);
            return;
        }
        String strD2 = u0Var.D();
        com.google.android.gms.common.internal.d0.h(strD2);
        t().O.c(strD2, "Fetching remote configuration");
        a1 a1Var = this.A;
        R(a1Var);
        com.google.android.gms.internal.measurement.e2 e2VarH1 = a1Var.h1(strD2);
        R(a1Var);
        a1Var.V0();
        String str = (String) a1Var.N.get(strD2);
        if (e2VarH1 != null) {
            if (TextUtils.isEmpty(str)) {
                eVar2 = null;
            } else {
                eVar2 = new u.e(0);
                eVar2.put("If-Modified-Since", str);
            }
            R(a1Var);
            a1Var.V0();
            String str2 = (String) a1Var.O.get(strD2);
            if (!TextUtils.isEmpty(str2)) {
                if (eVar2 == null) {
                    eVar2 = new u.e(0);
                }
                eVar2.put("If-None-Match", str2);
            }
            eVar = eVar2;
        } else {
            eVar = null;
        }
        this.T = true;
        t0 t0Var = this.B;
        R(t0Var);
        o9.q qVar = new o9.q(this, 21);
        h1 h1Var = (h1) t0Var.B;
        t0Var.V0();
        t0Var.W0();
        v3 v3Var = t0Var.C.J;
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder builderAppendQueryParameter = builder.scheme((String) b0.f14560f.a(null)).encodedAuthority((String) b0.f14563g.a(null)).path("config/app/".concat(String.valueOf(u0Var.G()))).appendQueryParameter("platform", CredentialsData.CREDENTIALS_TYPE_ANDROID);
        ((h1) v3Var.B).D.a1();
        builderAppendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(133005L)).appendQueryParameter("runtime_version", "0");
        String string = builder.build().toString();
        try {
            URL url = new URI(string).toURL();
            e1 e1Var = h1Var.G;
            h1.g(e1Var);
            e1Var.h1(new s0(t0Var, u0Var.D(), url, (byte[]) null, eVar, qVar));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            q0 q0Var = h1Var.F;
            h1.g(q0Var);
            q0Var.G.d("Failed to parse config URL. Not fetching. appId", q0.d1(u0Var.D()), string);
        }
    }

    public final void w(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        boolean z10;
        t0 t0Var = this.B;
        C().V0();
        j0();
        com.google.android.gms.common.internal.d0.e(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th3) {
                this.T = false;
                L();
                throw th3;
            }
        }
        b50.b bVar = t().O;
        Integer numValueOf = Integer.valueOf(bArr.length);
        bVar.c(numValueOf, "onConfigFetched. Response size");
        m mVar = this.C;
        R(mVar);
        mVar.H1();
        try {
            m mVar2 = this.C;
            R(mVar2);
            u0 u0VarX1 = mVar2.X1(str);
            if (i10 == 200 || i10 == 204) {
                if (th2 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else if (i10 == 304) {
                i10 = 304;
                if (th2 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (u0VarX1 == null) {
                t().J.c(q0.d1(str), "App does not exist in onConfigFetched. appId");
            } else {
                a1 a1Var = this.A;
                if (z10 || i10 == 404) {
                    String strJ = J("Last-Modified", map);
                    String strJ2 = J("ETag", map);
                    if (i10 == 404 || i10 == 304) {
                        R(a1Var);
                        if (a1Var.h1(str) == null) {
                            R(a1Var);
                            a1Var.j1(str, null, null, null);
                        }
                    } else {
                        R(a1Var);
                        a1Var.j1(str, strJ, strJ2, bArr);
                    }
                    ((ve.b) k0()).getClass();
                    u0VarX1.f(System.currentTimeMillis());
                    m mVar3 = this.C;
                    R(mVar3);
                    mVar3.Y1(u0VarX1, false);
                    if (i10 == 404) {
                        t().L.c(str, "Config not found. Using empty config. appId");
                    } else {
                        t().O.d("Successfully fetched config. Got network response. code, size", Integer.valueOf(i10), numValueOf);
                    }
                    R(t0Var);
                    if (t0Var.p1() && I()) {
                        l();
                    } else {
                        R(t0Var);
                        if (t0Var.p1()) {
                            m mVar4 = this.C;
                            R(mVar4);
                            if (mVar4.b1(u0VarX1.D())) {
                                o(u0VarX1.D());
                            } else {
                                K();
                            }
                        } else {
                            K();
                        }
                    }
                } else {
                    ((ve.b) k0()).getClass();
                    u0VarX1.g(System.currentTimeMillis());
                    m mVar5 = this.C;
                    R(mVar5);
                    mVar5.Y1(u0VarX1, false);
                    t().O.d("Fetching config failed. code, error", Integer.valueOf(i10), th2);
                    R(a1Var);
                    a1Var.V0();
                    a1Var.N.put(str, null);
                    i7.m1 m1Var = this.I.J;
                    ((ve.b) k0()).getClass();
                    m1Var.f(System.currentTimeMillis());
                    if (i10 == 503 || i10 == 429) {
                        i7.m1 m1Var2 = this.I.H;
                        ((ve.b) k0()).getClass();
                        m1Var2.f(System.currentTimeMillis());
                    }
                    K();
                }
            }
            m mVar6 = this.C;
            R(mVar6);
            mVar6.I1();
            m mVar7 = this.C;
            R(mVar7);
            mVar7.J1();
            this.T = false;
            L();
        } catch (Throwable th4) {
            m mVar8 = this.C;
            R(mVar8);
            mVar8.J1();
            throw th4;
        }
    }

    public final void x() {
        C().V0();
        j0();
        if (this.N) {
            return;
        }
        this.N = true;
        C().V0();
        FileLock fileLock = this.W;
        h1 h1Var = this.L;
        if (fileLock == null || !fileLock.isValid()) {
            ((h1) this.C.B).getClass();
            try {
                FileChannel channel = new RandomAccessFile(new File(new File(h1Var.A.getFilesDir(), "google_app_measurement.db").getPath()), "rw").getChannel();
                this.X = channel;
                FileLock fileLockTryLock = channel.tryLock();
                this.W = fileLockTryLock;
                if (fileLockTryLock == null) {
                    t().G.b("Storage concurrent data access panic");
                    return;
                }
                t().O.b("Storage concurrent access okay");
            } catch (FileNotFoundException e3) {
                t().G.c(e3, "Failed to acquire storage lock");
                return;
            } catch (IOException e10) {
                t().G.c(e10, "Failed to access storage lock file");
                return;
            } catch (OverlappingFileLockException e11) {
                t().J.c(e11, "Storage lock already acquired");
                return;
            }
        } else {
            t().O.b("Storage concurrent access okay");
        }
        FileChannel fileChannel = this.X;
        C().V0();
        int i10 = 0;
        if (fileChannel == null || !fileChannel.isOpen()) {
            t().G.b("Bad channel to read from");
        } else {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            try {
                fileChannel.position(0L);
                int i11 = fileChannel.read(byteBufferAllocate);
                if (i11 == 4) {
                    byteBufferAllocate.flip();
                    i10 = byteBufferAllocate.getInt();
                } else if (i11 != -1) {
                    t().J.c(Integer.valueOf(i11), "Unexpected data length. Bytes read");
                }
            } catch (IOException e12) {
                t().G.c(e12, "Failed to read from channel");
            }
        }
        j0 j0VarL = h1Var.l();
        j0VarL.W0();
        int i12 = j0VarL.F;
        C().V0();
        if (i10 > i12) {
            t().G.d("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i10), Integer.valueOf(i12));
            return;
        }
        if (i10 < i12) {
            FileChannel fileChannel2 = this.X;
            C().V0();
            if (fileChannel2 == null || !fileChannel2.isOpen()) {
                t().G.b("Bad channel to read from");
            } else {
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                byteBufferAllocate2.putInt(i12);
                byteBufferAllocate2.flip();
                try {
                    fileChannel2.truncate(0L);
                    fileChannel2.write(byteBufferAllocate2);
                    fileChannel2.force(true);
                    if (fileChannel2.size() != 4) {
                        t().G.c(Long.valueOf(fileChannel2.size()), "Error writing to channel. Bytes written");
                    }
                    t().O.d("Storage version upgraded. Previous, current version", Integer.valueOf(i10), Integer.valueOf(i12));
                    return;
                } catch (IOException e13) {
                    t().G.c(e13, "Failed to write to channel");
                }
            }
            t().G.d("Storage version upgrade failed. Previous, current version", Integer.valueOf(i10), Integer.valueOf(i12));
        }
    }
}
