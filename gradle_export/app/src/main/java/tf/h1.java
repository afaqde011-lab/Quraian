package tf;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.measurement.k4;
import com.google.android.gms.internal.measurement.n4;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class h1 implements p1 {

    public static volatile h1 f14624e0;
    public final Context A;
    public final boolean B;
    public final ru.c C;
    public final g D;
    public final w0 E;
    public final q0 F;
    public final e1 G;
    public final j3 H;
    public final e4 I;
    public final m0 J;
    public final ve.b K;
    public final t2 L;
    public final i2 M;
    public final v N;
    public final m2 O;
    public final String P;
    public l0 Q;
    public c3 R;
    public p S;
    public j0 T;
    public n2 U;
    public Boolean W;
    public long X;
    public volatile Boolean Y;
    public volatile boolean Z;

    public int f14625a0;

    public int f14626b0;

    public final long f14628d0;
    public boolean V = false;

    public final AtomicInteger f14627c0 = new AtomicInteger(0);

    public h1(w1 w1Var) {
        Context context;
        Context context2 = w1Var.f14749a;
        ru.c cVar = new ru.c(2);
        this.C = cVar;
        u1.f14737k = cVar;
        this.A = context2;
        this.B = w1Var.f14753e;
        this.Y = w1Var.f14750b;
        this.P = w1Var.f14755g;
        this.Z = true;
        if (k4.f3793h == null && context2 != null) {
            Object obj = k4.f3792g;
            synchronized (obj) {
                try {
                    if (k4.f3793h == null) {
                        synchronized (obj) {
                            try {
                                com.google.android.gms.internal.measurement.a4 a4Var = k4.f3793h;
                                final Context applicationContext = context2.getApplicationContext();
                                if (applicationContext == null) {
                                    applicationContext = context2;
                                }
                                if (a4Var == null || a4Var.f3665a != applicationContext) {
                                    if (a4Var != null) {
                                        com.google.android.gms.internal.measurement.c4.c();
                                        n4.a();
                                        synchronized (com.google.android.gms.internal.measurement.f4.class) {
                                            try {
                                                com.google.android.gms.internal.measurement.f4 f4Var = com.google.android.gms.internal.measurement.f4.E;
                                                if (f4Var != null && (context = (Context) f4Var.C) != null && ((com.google.android.gms.internal.measurement.e4) f4Var.D) != null && f4Var.B) {
                                                    context.getContentResolver().unregisterContentObserver((com.google.android.gms.internal.measurement.e4) com.google.android.gms.internal.measurement.f4.E.D);
                                                }
                                                com.google.android.gms.internal.measurement.f4.E = null;
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                    }
                                    k4.f3793h = new com.google.android.gms.internal.measurement.a4(applicationContext, a.a.T(new eh.x() {
                                        @Override
                                        public final Object get() {
                                            eh.m uVar;
                                            eh.m uVar2;
                                            char c10;
                                            Object obj2 = k4.f3792g;
                                            Context contextCreateDeviceProtectedStorageContext = applicationContext;
                                            eh.m mVar = g4.f3762a;
                                            if (mVar != null) {
                                                return mVar;
                                            }
                                            synchronized (g4.class) {
                                                try {
                                                    uVar = g4.f3762a;
                                                    if (uVar == null) {
                                                        String str = Build.TYPE;
                                                        String str2 = Build.TAGS;
                                                        u.e eVar = j4.f3784a;
                                                        if (!str.equals("eng") && !str.equals("userdebug")) {
                                                            uVar = eh.a.A;
                                                        } else if (str2.contains("dev-keys") || str2.contains("test-keys")) {
                                                            if (!contextCreateDeviceProtectedStorageContext.isDeviceProtectedStorage()) {
                                                                contextCreateDeviceProtectedStorageContext = contextCreateDeviceProtectedStorageContext.createDeviceProtectedStorageContext();
                                                            }
                                                            Context context3 = contextCreateDeviceProtectedStorageContext;
                                                            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                                            try {
                                                                StrictMode.allowThreadDiskWrites();
                                                                char c11 = 0;
                                                                try {
                                                                    File file = new File(context3.getDir("phenotype_hermetic", 0), "overrides.txt");
                                                                    uVar2 = file.exists() ? new eh.u(file) : eh.a.A;
                                                                } catch (RuntimeException e3) {
                                                                    Log.e("HermeticFileOverrides", "no data dir", e3);
                                                                    uVar2 = eh.a.A;
                                                                }
                                                                if (uVar2.b()) {
                                                                    File file2 = (File) uVar2.a();
                                                                    try {
                                                                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                                                        try {
                                                                            u.s0 s0Var = new u.s0(0);
                                                                            HashMap map = new HashMap();
                                                                            while (true) {
                                                                                String line = bufferedReader.readLine();
                                                                                if (line == null) {
                                                                                    break;
                                                                                }
                                                                                String[] strArrSplit = line.split(" ", 3);
                                                                                if (strArrSplit.length != 3) {
                                                                                    StringBuilder sb2 = new StringBuilder(line.length() + 9);
                                                                                    sb2.append("Invalid: ");
                                                                                    sb2.append(line);
                                                                                    Log.e("HermeticFileOverrides", sb2.toString());
                                                                                } else {
                                                                                    String str3 = new String(strArrSplit[c11]);
                                                                                    String strDecode = Uri.decode(new String(strArrSplit[1]));
                                                                                    String strDecode2 = (String) map.get(strArrSplit[2]);
                                                                                    if (strDecode2 == null) {
                                                                                        String str4 = new String(strArrSplit[2]);
                                                                                        strDecode2 = Uri.decode(str4);
                                                                                        if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                                                            map.put(str4, strDecode2);
                                                                                        }
                                                                                    }
                                                                                    u.s0 s0Var2 = (u.s0) s0Var.get(str3);
                                                                                    if (s0Var2 == null) {
                                                                                        c10 = 0;
                                                                                        s0Var2 = new u.s0(0);
                                                                                        s0Var.put(str3, s0Var2);
                                                                                    } else {
                                                                                        c10 = 0;
                                                                                    }
                                                                                    s0Var2.put(strDecode, strDecode2);
                                                                                    c11 = c10;
                                                                                }
                                                                            }
                                                                            String string = file2.toString();
                                                                            String packageName = context3.getPackageName();
                                                                            StringBuilder sb3 = new StringBuilder(string.length() + 28 + String.valueOf(packageName).length());
                                                                            sb3.append("Parsed ");
                                                                            sb3.append(string);
                                                                            sb3.append(" for Android package ");
                                                                            sb3.append(packageName);
                                                                            Log.w("HermeticFileOverrides", sb3.toString());
                                                                            d4 d4Var = new d4(s0Var);
                                                                            bufferedReader.close();
                                                                            uVar = new eh.u(d4Var);
                                                                        } catch (Throwable th3) {
                                                                            try {
                                                                                bufferedReader.close();
                                                                                throw th3;
                                                                            } catch (Throwable th4) {
                                                                                th3.addSuppressed(th4);
                                                                                throw th3;
                                                                            }
                                                                        }
                                                                    } catch (IOException e10) {
                                                                        throw new RuntimeException(e10);
                                                                    }
                                                                } else {
                                                                    uVar = eh.a.A;
                                                                }
                                                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                                            } catch (Throwable th5) {
                                                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                                                throw th5;
                                                            }
                                                        } else {
                                                            uVar = eh.a.A;
                                                        }
                                                        g4.f3762a = uVar;
                                                    }
                                                } catch (Throwable th6) {
                                                    throw th6;
                                                }
                                            }
                                            return uVar;
                                        }
                                    }));
                                    k4.f3794i.incrementAndGet();
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
        this.K = ve.b.f15619a;
        Long l = w1Var.f14754f;
        this.f14628d0 = l != null ? l.longValue() : System.currentTimeMillis();
        g gVar = new g(this);
        gVar.E = rc.d.B;
        this.D = gVar;
        w0 w0Var = new w0(this);
        w0Var.Y0();
        this.E = w0Var;
        q0 q0Var = new q0(this);
        q0Var.Y0();
        this.F = q0Var;
        e4 e4Var = new e4(this);
        e4Var.Y0();
        this.I = e4Var;
        this.J = new m0(new y0(w1Var, this));
        this.N = new v(this);
        t2 t2Var = new t2(this);
        t2Var.X0();
        this.L = t2Var;
        i2 i2Var = new i2(this);
        i2Var.X0();
        this.M = i2Var;
        j3 j3Var = new j3(this);
        j3Var.X0();
        this.H = j3Var;
        m2 m2Var = new m2(this);
        m2Var.Y0();
        this.O = m2Var;
        e1 e1Var = new e1(this);
        e1Var.Y0();
        this.G = e1Var;
        com.google.android.gms.internal.measurement.s0 s0Var = w1Var.f14752d;
        boolean z10 = s0Var == null || s0Var.B == 0;
        if (context2.getApplicationContext() instanceof Application) {
            f(i2Var);
            if (((h1) i2Var.B).A.getApplicationContext() instanceof Application) {
                Application application = (Application) ((h1) i2Var.B).A.getApplicationContext();
                if (i2Var.D == null) {
                    i2Var.D = new bd.c(i2Var);
                }
                if (z10) {
                    application.unregisterActivityLifecycleCallbacks(i2Var.D);
                    application.registerActivityLifecycleCallbacks(i2Var.D);
                    q0 q0Var2 = ((h1) i2Var.B).F;
                    g(q0Var2);
                    q0Var2.O.b("Registered activity lifecycle callback");
                }
            }
        } else {
            g(q0Var);
            q0Var.J.b("Application context is not an Application");
        }
        e1Var.e1(new kh.r(16, this, w1Var, false));
    }

    public static final void d(z zVar) {
        if (zVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void e(f5.c cVar) {
        if (cVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void f(d0 d0Var) {
        if (d0Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!d0Var.C) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(d0Var.getClass())));
        }
    }

    public static final void g(o1 o1Var) {
        if (o1Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!o1Var.C) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(o1Var.getClass())));
        }
    }

    public static h1 m(Context context, com.google.android.gms.internal.measurement.s0 s0Var, Long l) {
        Bundle bundle;
        if (s0Var != null) {
            Bundle bundle2 = s0Var.D;
            s0Var = new com.google.android.gms.internal.measurement.s0(s0Var.A, s0Var.B, s0Var.C, bundle2, null);
        }
        com.google.android.gms.common.internal.d0.h(context);
        com.google.android.gms.common.internal.d0.h(context.getApplicationContext());
        if (f14624e0 == null) {
            synchronized (h1.class) {
                try {
                    if (f14624e0 == null) {
                        f14624e0 = new h1(new w1(context, s0Var, l));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else if (s0Var != null && (bundle = s0Var.D) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            com.google.android.gms.common.internal.d0.h(f14624e0);
            f14624e0.Y = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        com.google.android.gms.common.internal.d0.h(f14624e0);
        return f14624e0;
    }

    @Override
    public final e1 C() {
        e1 e1Var = this.G;
        g(e1Var);
        return e1Var;
    }

    @Override
    public final ru.c P() {
        return this.C;
    }

    public final boolean a() {
        return b() == 0;
    }

    public final int b() {
        e1 e1Var = this.G;
        g(e1Var);
        e1Var.V0();
        g gVar = this.D;
        if (gVar.i1()) {
            return 1;
        }
        g(e1Var);
        e1Var.V0();
        if (!this.Z) {
            return 8;
        }
        w0 w0Var = this.E;
        e(w0Var);
        w0Var.V0();
        Boolean boolValueOf = w0Var.Z0().contains("measurement_enabled") ? Boolean.valueOf(w0Var.Z0().getBoolean("measurement_enabled", true)) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue() ? 0 : 3;
        }
        ru.c cVar = ((h1) gVar.B).C;
        Boolean boolH1 = gVar.h1("firebase_analytics_collection_enabled");
        if (boolH1 != null) {
            return boolH1.booleanValue() ? 0 : 4;
        }
        return (this.Y == null || this.Y.booleanValue()) ? 0 : 7;
    }

    public final boolean c() {
        e4 e4Var;
        boolean z10;
        Context context;
        if (!this.V) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        e1 e1Var = this.G;
        g(e1Var);
        e1Var.V0();
        Boolean bool = this.W;
        ve.b bVar = this.K;
        if (bool == null || this.X == 0) {
            bVar.getClass();
            this.X = SystemClock.elapsedRealtime();
            e4Var = this.I;
            e(e4Var);
            z10 = false;
            if (e4Var.s1("android.permission.INTERNET") && e4Var.s1("android.permission.ACCESS_NETWORK_STATE")) {
                context = this.A;
                if (xe.b.a(context).c() || this.D.Y0() || (e4.L1(context) && e4.o1(context))) {
                    z10 = true;
                }
            }
            this.W = Boolean.valueOf(z10);
            if (z10) {
                this.W = Boolean.valueOf(e4Var.Z0(l().c1()));
            }
        } else if (!bool.booleanValue()) {
            bVar.getClass();
            if (Math.abs(SystemClock.elapsedRealtime() - this.X) > 1000) {
                bVar.getClass();
                this.X = SystemClock.elapsedRealtime();
                e4Var = this.I;
                e(e4Var);
                z10 = false;
                if (e4Var.s1("android.permission.INTERNET")) {
                    context = this.A;
                    if (xe.b.a(context).c()) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                }
                this.W = Boolean.valueOf(z10);
                if (z10) {
                    this.W = Boolean.valueOf(e4Var.Z0(l().c1()));
                }
            }
        }
        return this.W.booleanValue();
    }

    @Override
    public final Context e0() {
        return this.A;
    }

    public final m0 h() {
        return this.J;
    }

    public final l0 i() {
        f(this.Q);
        return this.Q;
    }

    public final c3 j() {
        f(this.R);
        return this.R;
    }

    public final p k() {
        g(this.S);
        return this.S;
    }

    @Override
    public final ve.a k0() {
        return this.K;
    }

    public final j0 l() {
        f(this.T);
        return this.T;
    }

    @Override
    public final q0 t() {
        q0 q0Var = this.F;
        g(q0Var);
        return q0Var;
    }
}
