package kh;

import a1.u0;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewPropertyAnimator;
import ba.f1;
import com.google.android.gms.cloudmessaging.zzt;
import com.google.android.gms.common.api.internal.n0;
import com.google.android.gms.common.internal.r0;
import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.internal.measurement.l0;
import com.google.android.gms.internal.measurement.m8;
import com.google.android.gms.internal.measurement.s0;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.protobuf.RuntimeVersion;
import i7.m1;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import qd.h0;
import qd.o0;
import tf.a3;
import tf.b3;
import tf.c3;
import tf.e0;
import tf.e1;
import tf.e4;
import tf.g1;
import tf.h1;
import tf.i2;
import tf.j0;
import tf.j3;
import tf.n2;
import tf.q0;
import tf.q1;
import tf.q2;
import tf.s1;
import tf.t1;
import tf.u1;
import tf.w0;
import tf.w1;
import tf.x0;
import tf.y1;
import tf.y2;
import tf.y3;

public final class r implements Runnable {
    public final int A;
    public Object B;
    public final Object C;

    public r(int i10, Object obj, Object obj2, boolean z10) {
        this.A = i10;
        this.C = obj;
        this.B = obj2;
    }

    public r(Object obj, Object obj2, int i10) {
        this.A = i10;
        this.B = obj;
        this.C = obj2;
    }

    public r(o10.b bVar, y3 y3Var, Runnable runnable) {
        this.A = 22;
        this.B = y3Var;
        this.C = runnable;
    }

    public r(c3 c3Var, q2 q2Var) {
        this.A = 19;
        this.B = q2Var;
        Objects.requireNonNull(c3Var);
        this.C = c3Var;
    }

    public r(i2 i2Var, l0 l0Var) {
        this.A = 17;
        this.B = l0Var;
        Objects.requireNonNull(i2Var);
        this.C = i2Var;
    }

    public r(x0 x0Var, com.google.android.gms.internal.measurement.c0 c0Var, x0 x0Var2) {
        this.A = 15;
        this.B = c0Var;
        this.C = x0Var;
    }

    private final void a() {
        j0 j0Var;
        String str;
        String string;
        int i10;
        String str2;
        PackageInfo packageInfo;
        CharSequence applicationLabel;
        int iB;
        List listAsList;
        h1 h1Var;
        Bundle bundleG1;
        Integer numValueOf;
        String[] stringArray;
        n2 n2Var;
        b50.b bVar;
        b50.b bVar2;
        b50.b bVar3;
        b50.b bVar4;
        String strB1;
        int i11;
        AtomicInteger atomicInteger;
        long j9;
        final i2 i2Var;
        int iA1;
        boolean zF1;
        boolean z10;
        h1 h1Var2;
        b50.b bVar5;
        q0 q0Var;
        c7.c cVar;
        t1 t1VarC1;
        q1 q1VarK1;
        h1 h1Var3;
        q1 q1VarK2;
        q1 q1Var;
        s1 s1Var;
        e4 e4Var;
        long j10;
        t1 t1Var;
        boolean z11;
        h1 h1Var4;
        q1 q1VarK3;
        q1 q1VarK4;
        Bundle bundle;
        tf.o oVarC;
        Iterator it;
        Boolean boolH1;
        m1 m1Var;
        long j11;
        g1 g1Var;
        h1 h1Var5;
        e4 e4Var2;
        c7.c cVar2;
        q0 q0Var2;
        boolean zA;
        SharedPreferences sharedPreferences;
        boolean zContains;
        boolean zIsEmpty;
        long jMax;
        b50.b bVar6;
        Context context;
        boolean z12;
        Iterator it2;
        String str3;
        e4 e4Var3;
        String strB;
        h1 h1Var6 = (h1) this.C;
        w1 w1Var = (w1) this.B;
        e1 e1Var = h1Var6.G;
        q0 q0Var3 = h1Var6.F;
        w0 w0Var = h1Var6.E;
        e4 e4Var4 = h1Var6.I;
        h1.g(e1Var);
        e1Var.V0();
        tf.g gVar = h1Var6.D;
        ((h1) gVar.B).getClass();
        tf.p pVar = new tf.p(h1Var6);
        pVar.Y0();
        h1Var6.S = pVar;
        s0 s0Var = w1Var.f14752d;
        j0 j0Var2 = new j0(h1Var6, w1Var.f14751c, s0Var == null ? 0L : s0Var.A);
        j0Var2.X0();
        h1Var6.T = j0Var2;
        tf.l0 l0Var = new tf.l0(h1Var6);
        l0Var.X0();
        h1Var6.Q = l0Var;
        c3 c3Var = new c3(h1Var6);
        c3Var.X0();
        h1Var6.R = c3Var;
        boolean z13 = e4Var4.C;
        h1 h1Var7 = (h1) e4Var4.B;
        if (z13) {
            throw new IllegalStateException("Can't initialize twice");
        }
        e4Var4.V0();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                q0 q0Var4 = ((h1) e4Var4.B).F;
                h1.g(q0Var4);
                q0Var4.J.b("Utils falling back to Random for random id");
            }
        }
        e4Var4.E.set(jNextLong);
        h1Var7.f14627c0.incrementAndGet();
        e4Var4.C = true;
        if (w0Var.C) {
            throw new IllegalStateException("Can't initialize twice");
        }
        SharedPreferences sharedPreferences2 = ((h1) w0Var.B).A.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        w0Var.D = sharedPreferences2;
        boolean z14 = sharedPreferences2.getBoolean("has_been_opened", false);
        w0Var.S = z14;
        if (!z14) {
            oi.k.v(w0Var.D, "has_been_opened", true);
        }
        w0Var.F = new bb.d(w0Var, Math.max(0L, ((Long) tf.b0.f14554d.a(null)).longValue()));
        ((h1) w0Var.B).f14627c0.incrementAndGet();
        w0Var.C = true;
        j0 j0Var3 = h1Var6.T;
        if (j0Var3.C) {
            throw new IllegalStateException("Can't initialize twice");
        }
        h1 h1Var8 = (h1) j0Var3.B;
        q0 q0Var5 = h1Var8.F;
        q0 q0Var6 = h1Var8.F;
        h1.g(q0Var5);
        q0Var5.O.d("sdkVersion bundled with app, dynamiteVersion", Long.valueOf(j0Var3.K), Long.valueOf(j0Var3.J));
        Context context2 = h1Var8.A;
        String packageName = context2.getPackageName();
        PackageManager packageManager = context2.getPackageManager();
        String str4 = RuntimeVersion.SUFFIX;
        String str5 = "Unknown";
        String installerPackageName = "unknown";
        try {
            if (packageManager != null) {
                j0Var = j0Var2;
                str = "Can't initialize twice";
                try {
                    installerPackageName = packageManager.getInstallerPackageName(packageName);
                } catch (IllegalArgumentException unused) {
                    h1.g(q0Var6);
                    q0Var6.G.c(q0.d1(packageName), "Error retrieving app installer package name. appId");
                }
                String str6 = installerPackageName;
                try {
                    if (str6 != null) {
                        if ("com.android.vending".equals(str6)) {
                            installerPackageName = RuntimeVersion.SUFFIX;
                        }
                        packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
                        if (packageInfo != null) {
                            applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                            if (TextUtils.isEmpty(applicationLabel)) {
                                string = "Unknown";
                            } else {
                                string = applicationLabel.toString();
                            }
                            try {
                                str2 = packageInfo.versionName;
                                try {
                                    i10 = packageInfo.versionCode;
                                } catch (PackageManager.NameNotFoundException unused2) {
                                    str5 = str2;
                                    h1.g(q0Var6);
                                    q0Var6.G.d("Error retrieving package info. appId, appName", q0.d1(packageName), string);
                                    i10 = Integer.MIN_VALUE;
                                    str2 = str5;
                                }
                            } catch (PackageManager.NameNotFoundException unused3) {
                            }
                        }
                        String str7 = installerPackageName;
                        j0Var3.D = packageName;
                        j0Var3.G = str7;
                        j0Var3.E = str2;
                        j0Var3.F = i10;
                        j0Var3.H = string;
                        j0Var3.I = 0L;
                        iB = h1Var8.b();
                        if (iB == 0) {
                            h1.g(q0Var6);
                            q0Var6.O.b("App measurement collection enabled");
                        } else if (iB == 1) {
                            h1.g(q0Var6);
                            q0Var6.M.b("App measurement deactivated via the manifest");
                        } else if (iB == 3) {
                            h1.g(q0Var6);
                            q0Var6.M.b("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                        } else if (iB == 4) {
                            h1.g(q0Var6);
                            q0Var6.M.b("App measurement disabled via the manifest");
                        } else if (iB == 6) {
                            h1.g(q0Var6);
                            q0Var6.L.b("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                        } else if (iB == 7) {
                            h1.g(q0Var6);
                            q0Var6.M.b("App measurement disabled via the global data collection setting");
                        } else if (iB != 8) {
                            h1.g(q0Var6);
                            q0Var6.M.b("App measurement disabled");
                            h1.g(q0Var6);
                            q0Var6.H.b("Invalid scion state in identity");
                        } else {
                            h1.g(q0Var6);
                            q0Var6.M.b("App measurement disabled due to denied storage consent");
                        }
                        j0Var3.O = RuntimeVersion.SUFFIX;
                        strB = u1.b(context2, h1Var8.P);
                        if (!TextUtils.isEmpty(strB)) {
                            str4 = strB;
                        }
                        j0Var3.O = str4;
                        if (iB == 0) {
                            h1.g(q0Var6);
                            q0Var6.O.d("App measurement enabled for app package, google app id", j0Var3.D, j0Var3.O);
                        }
                        listAsList = null;
                        j0Var3.L = null;
                        tf.g gVar2 = h1Var8.D;
                        h1Var = (h1) gVar2.B;
                        com.google.android.gms.common.internal.d0.e("analytics.safelisted_events");
                        bundleG1 = gVar2.g1();
                        if (bundleG1 != null) {
                            if (bundleG1.containsKey("analytics.safelisted_events")) {
                                numValueOf = Integer.valueOf(bundleG1.getInt("analytics.safelisted_events"));
                            }
                            if (numValueOf != null) {
                                try {
                                    stringArray = h1Var.A.getResources().getStringArray(numValueOf.intValue());
                                    if (stringArray == null) {
                                        listAsList = Arrays.asList(stringArray);
                                    }
                                } catch (Resources.NotFoundException e3) {
                                    q0 q0Var7 = h1Var.F;
                                    h1.g(q0Var7);
                                    q0Var7.G.c(e3, "Failed to load string array from metadata: resource not found");
                                }
                            }
                            if (listAsList != null) {
                                j0Var3.L = listAsList;
                                break;
                            }
                            if (listAsList.isEmpty()) {
                                it2 = listAsList.iterator();
                                do {
                                    if (it2.hasNext()) {
                                        j0Var3.L = listAsList;
                                        break;
                                    } else {
                                        str3 = (String) it2.next();
                                        e4Var3 = h1Var8.I;
                                        h1.e(e4Var3);
                                    }
                                } while (e4Var3.W1("safelisted event", str3));
                            } else {
                                h1.g(q0Var6);
                                q0Var6.L.b("Safelisted event list is empty. Ignoring");
                            }
                            if (packageManager != null) {
                                j0Var3.N = ta.c0.J(context2) ? 1 : 0;
                            } else {
                                j0Var3.N = 0;
                            }
                            ((h1) j0Var3.B).f14627c0.incrementAndGet();
                            j0Var3.C = true;
                            n2Var = new n2(h1Var6);
                            n2Var.X0();
                            h1Var6.U = n2Var;
                            if (!n2Var.C) {
                                throw new IllegalStateException(str);
                            }
                            n2Var.D = (JobScheduler) ((h1) n2Var.B).A.getSystemService("jobscheduler");
                            ((h1) n2Var.B).f14627c0.incrementAndGet();
                            n2Var.C = true;
                            h1.g(q0Var3);
                            bVar = q0Var3.N;
                            bVar2 = q0Var3.M;
                            bVar3 = q0Var3.O;
                            bVar4 = q0Var3.G;
                            gVar.a1();
                            bVar2.c(133005L, "App measurement initialized, version");
                            h1.g(q0Var3);
                            bVar2.b("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                            strB1 = j0Var.b1();
                            if (e4Var4.v1(strB1, gVar.D)) {
                                h1.g(q0Var3);
                                bVar2.b("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                            } else {
                                h1.g(q0Var3);
                                bVar2.b("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strB1)));
                            }
                            h1.g(q0Var3);
                            bVar.b("Debug-level message logging enabled");
                            i11 = h1Var6.f14625a0;
                            atomicInteger = h1Var6.f14627c0;
                            if (i11 != atomicInteger.get()) {
                                h1.g(q0Var3);
                                bVar4.d("Not all components initialized", Integer.valueOf(h1Var6.f14625a0), Integer.valueOf(atomicInteger.get()));
                            }
                            h1Var6.V = true;
                            j9 = h1Var6.f14628d0;
                            i2Var = h1Var6.M;
                            e1 e1Var2 = h1Var6.G;
                            h1.g(e1Var2);
                            e1Var2.V0();
                            h1.d(h1Var6.U);
                            iA1 = h1Var6.U.a1();
                            m8.a();
                            zF1 = gVar.f1(null, tf.b0.Q0);
                            if (iA1 == 2) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (zF1) {
                                e4Var4.V0();
                                if (e4Var4.q1() == 1) {
                                    e4Var4.V0();
                                    IntentFilter intentFilter = new IntentFilter();
                                    intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                    intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                    z12 = z10;
                                    h1Var2 = h1Var7;
                                    q0Var = q0Var3;
                                    bVar5 = bVar2;
                                    n4.b.f(h1Var2.A, new androidx.mediarouter.app.g(h1Var2), intentFilter, null);
                                    q0 q0Var8 = h1Var2.F;
                                    h1.g(q0Var8);
                                    q0Var8.N.b("Registered app receiver");
                                    if (z12) {
                                        h1.d(h1Var6.U);
                                        h1Var6.U.Z0(((Long) tf.b0.C.a(null)).longValue());
                                    }
                                } else if (z10) {
                                    z10 = true;
                                    e4Var4.V0();
                                    IntentFilter intentFilter2 = new IntentFilter();
                                    intentFilter2.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                    intentFilter2.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                    z12 = z10;
                                    h1Var2 = h1Var7;
                                    q0Var = q0Var3;
                                    bVar5 = bVar2;
                                    n4.b.f(h1Var2.A, new androidx.mediarouter.app.g(h1Var2), intentFilter2, null);
                                    q0 q0Var9 = h1Var2.F;
                                    h1.g(q0Var9);
                                    q0Var9.N.b("Registered app receiver");
                                    if (z12) {
                                        h1.d(h1Var6.U);
                                        h1Var6.U.Z0(((Long) tf.b0.C.a(null)).longValue());
                                    }
                                } else {
                                    h1Var2 = h1Var7;
                                    bVar5 = bVar2;
                                    q0Var = q0Var3;
                                }
                            } else if (z10) {
                                z10 = true;
                                e4Var4.V0();
                                IntentFilter intentFilter3 = new IntentFilter();
                                intentFilter3.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                intentFilter3.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                z12 = z10;
                                h1Var2 = h1Var7;
                                q0Var = q0Var3;
                                bVar5 = bVar2;
                                n4.b.f(h1Var2.A, new androidx.mediarouter.app.g(h1Var2), intentFilter3, null);
                                q0 q0Var10 = h1Var2.F;
                                h1.g(q0Var10);
                                q0Var10.N.b("Registered app receiver");
                                if (z12) {
                                    h1.d(h1Var6.U);
                                    h1Var6.U.Z0(((Long) tf.b0.C.a(null)).longValue());
                                }
                            } else {
                                h1Var2 = h1Var7;
                                bVar5 = bVar2;
                                q0Var = q0Var3;
                            }
                            cVar = w0Var.H;
                            t1VarC1 = w0Var.c1();
                            int i12 = t1VarC1.f14702b;
                            q1VarK1 = gVar.k1("google_analytics_default_allow_ad_storage", false);
                            h1Var3 = h1Var2;
                            q1VarK2 = gVar.k1("google_analytics_default_allow_analytics_storage", false);
                            q1Var = q1.UNINITIALIZED;
                            s1Var = s1.ANALYTICS_STORAGE;
                            if (q1VarK1 == q1Var || q1VarK2 != q1Var) {
                                e4Var = e4Var4;
                                j10 = j9;
                                if (t1.l(-10, w0Var.Z0().getInt("consent_source", 100))) {
                                    EnumMap enumMap = new EnumMap(s1.class);
                                    enumMap.put(s1.AD_STORAGE, q1VarK1);
                                    enumMap.put(s1Var, q1VarK2);
                                    t1Var = new t1(enumMap, -10);
                                    z11 = false;
                                }
                                if (t1Var != null) {
                                    h1.f(i2Var);
                                    i2Var.r1(t1Var, true);
                                } else {
                                    t1Var = t1VarC1;
                                }
                                h1.f(i2Var);
                                h1Var4 = (h1) i2Var.B;
                                i2Var.Z0(t1Var);
                                w0Var.V0();
                                int i13 = tf.o.b(w0Var.Z0().getString("dma_consent_settings", null)).f14677a;
                                q1VarK3 = gVar.k1("google_analytics_default_allow_ad_personalization_signals", true);
                                if (q1VarK3 != q1Var) {
                                    h1.g(q0Var);
                                    bVar3.c(q1VarK3, "Default ad personalization consent from Manifest");
                                }
                                q1VarK4 = gVar.k1("google_analytics_default_allow_ad_user_data", true);
                                if (q1VarK4 == q1Var && t1.l(-10, i13)) {
                                    h1.f(i2Var);
                                    EnumMap enumMap2 = new EnumMap(s1.class);
                                    enumMap2.put(s1.AD_USER_DATA, q1VarK4);
                                    i2Var.q1(new tf.o(enumMap2, -10, (Boolean) null, (String) null), true);
                                } else if (TextUtils.isEmpty(h1Var6.l().c1()) && (i13 == 0 || i13 == 30)) {
                                    h1.f(i2Var);
                                    i2Var.q1(new tf.o((Boolean) null, -10, (Boolean) null, (String) null), true);
                                } else if (TextUtils.isEmpty(h1Var6.l().c1()) && s0Var != null && (bundle = s0Var.D) != null && t1.l(30, i13)) {
                                    oVarC = tf.o.c(30, bundle);
                                    it = oVarC.f14681e.values().iterator();
                                    while (it.hasNext()) {
                                        if (((q1) it.next()) != q1Var) {
                                            h1.f(i2Var);
                                            i2Var.q1(oVarC, true);
                                            break;
                                        }
                                    }
                                }
                                boolH1 = gVar.h1("google_analytics_tcf_data_enabled");
                                if (boolH1 != null || boolH1.booleanValue()) {
                                    h1.g(q0Var);
                                    bVar.b("TCF client enabled.");
                                    h1.f(i2Var);
                                    i2Var.V0();
                                    q0 q0Var11 = h1Var4.F;
                                    h1.g(q0Var11);
                                    q0Var11.N.b("Register tcfPrefChangeListener.");
                                    if (i2Var.V == null) {
                                        i2Var.W = new y1(i2Var, h1Var4, 2);
                                        i2Var.V = new SharedPreferences.OnSharedPreferenceChangeListener() {
                                            @Override
                                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                                i2 i2Var2 = i2Var;
                                                h1 h1Var9 = (h1) i2Var2.B;
                                                g gVar3 = h1Var9.D;
                                                q0 q0Var12 = h1Var9.F;
                                                if (!gVar3.f1(null, b0.Z0)) {
                                                    if (Objects.equals(str8, "IABTCF_TCString")) {
                                                        h1.g(q0Var12);
                                                        q0Var12.O.b("IABTCF_TCString change picked up in listener.");
                                                        y1 y1Var = i2Var2.W;
                                                        com.google.android.gms.common.internal.d0.h(y1Var);
                                                        y1Var.b(500L);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                                    h1.g(q0Var12);
                                                    q0Var12.O.b("IABTCF_TCString change picked up in listener.");
                                                    y1 y1Var2 = i2Var2.W;
                                                    com.google.android.gms.common.internal.d0.h(y1Var2);
                                                    y1Var2.b(500L);
                                                }
                                            }
                                        };
                                    }
                                    w0 w0Var2 = h1Var4.E;
                                    h1.e(w0Var2);
                                    w0Var2.a1().registerOnSharedPreferenceChangeListener(i2Var.V);
                                    h1.f(i2Var);
                                    i2Var.b1();
                                }
                                m1Var = w0Var.G;
                                if (m1Var.e() == 0) {
                                    h1.g(q0Var);
                                    bVar3.c(Long.valueOf(j10), "Persisting first open");
                                    j11 = j10;
                                    m1Var.f(j11);
                                } else {
                                    j11 = j10;
                                }
                                h1.f(i2Var);
                                g1Var = i2Var.S;
                                if (g1Var.d() && g1Var.c()) {
                                    w0 w0Var3 = g1Var.A.E;
                                    h1.e(w0Var3);
                                    w0Var3.X.r(null);
                                }
                                if (h1Var6.c()) {
                                    h1Var5 = h1Var6;
                                    e4Var2 = e4Var;
                                    if (TextUtils.isEmpty(h1Var5.l().c1())) {
                                        cVar2 = cVar;
                                    } else {
                                        String strC1 = h1Var5.l().c1();
                                        w0Var.V0();
                                        String string2 = w0Var.Z0().getString("gmp_app_id", null);
                                        zIsEmpty = TextUtils.isEmpty(strC1);
                                        boolean zIsEmpty2 = TextUtils.isEmpty(string2);
                                        if (!zIsEmpty || zIsEmpty2) {
                                            cVar2 = cVar;
                                        } else {
                                            com.google.android.gms.common.internal.d0.h(strC1);
                                            if (strC1.equals(string2)) {
                                                cVar2 = cVar;
                                            } else {
                                                h1.g(q0Var);
                                                bVar5.b("Rechecking which service to use due to a GMP App Id change");
                                                w0Var.V0();
                                                w0Var.V0();
                                                Boolean boolValueOf = w0Var.Z0().contains("measurement_enabled") ? Boolean.valueOf(w0Var.Z0().getBoolean("measurement_enabled", true)) : null;
                                                SharedPreferences.Editor editorEdit = w0Var.Z0().edit();
                                                editorEdit.clear();
                                                editorEdit.apply();
                                                if (boolValueOf != null) {
                                                    w0Var.V0();
                                                    SharedPreferences.Editor editorEdit2 = w0Var.Z0().edit();
                                                    editorEdit2.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                                                    editorEdit2.apply();
                                                }
                                                h1Var5.i().Z0();
                                                h1Var5.R.d1();
                                                h1Var5.R.b1();
                                                m1Var.f(j11);
                                                cVar2 = cVar;
                                                cVar2.r(null);
                                            }
                                        }
                                        String strC2 = h1Var5.l().c1();
                                        w0Var.V0();
                                        SharedPreferences.Editor editorEdit3 = w0Var.Z0().edit();
                                        editorEdit3.putString("gmp_app_id", strC2);
                                        editorEdit3.apply();
                                    }
                                    if (!w0Var.c1().i(s1Var)) {
                                        cVar2.r(null);
                                    }
                                    h1.f(i2Var);
                                    i2Var.H.set(cVar2.p());
                                    try {
                                        h1Var3.A.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                    } catch (ClassNotFoundException unused4) {
                                        c7.c cVar3 = w0Var.W;
                                        if (!TextUtils.isEmpty(cVar3.p())) {
                                            h1.g(q0Var);
                                            q0Var2 = q0Var;
                                            q0Var2.J.b("Remote config removed with active feature rollouts");
                                            cVar3.r(null);
                                        }
                                        if (!TextUtils.isEmpty(h1Var5.l().c1())) {
                                            zA = h1Var5.a();
                                            sharedPreferences = w0Var.D;
                                            if (sharedPreferences == null) {
                                                zContains = z11;
                                            } else {
                                                zContains = sharedPreferences.contains("deferred_analytics_collection");
                                            }
                                            if (!zContains) {
                                                w0Var.e1(!zA);
                                            }
                                            if (zA) {
                                                h1.f(i2Var);
                                                i2Var.h1();
                                            }
                                            j3 j3Var = h1Var5.H;
                                            h1.f(j3Var);
                                            j3Var.F.Z();
                                            h1Var5.j().Z0(new AtomicReference());
                                            h1Var5.j().a1(w0Var.Z.F());
                                        }
                                        m8.a();
                                        if (gVar.f1(null, tf.b0.Q0)) {
                                            e4Var2.V0();
                                            if (e4Var2.q1() == 1) {
                                                z11 = true;
                                            }
                                            if (z11) {
                                                long jIntValue = ((Integer) tf.b0.f14601x0.a(null)).intValue();
                                                long jNextInt = new Random().nextInt(5000);
                                                h1Var5.K.getClass();
                                                jMax = Math.max(500L, ((jIntValue * 1000) + jNextInt) - SystemClock.elapsedRealtime());
                                                if (jMax > 500) {
                                                    h1.g(q0Var2);
                                                    bVar3.c(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                                }
                                                h1.f(i2Var);
                                                i2Var.V0();
                                                if (i2Var.M == null) {
                                                    i2Var.M = new y1(i2Var, h1Var4, 0);
                                                }
                                                i2Var.M.b(jMax);
                                            }
                                        }
                                        w0Var.P.b(true);
                                    }
                                    q0Var2 = q0Var;
                                    if (!TextUtils.isEmpty(h1Var5.l().c1())) {
                                        zA = h1Var5.a();
                                        sharedPreferences = w0Var.D;
                                        if (sharedPreferences == null) {
                                            zContains = z11;
                                        } else {
                                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                                        }
                                        if (!zContains && !gVar.i1()) {
                                            w0Var.e1(!zA);
                                        }
                                        if (zA) {
                                            h1.f(i2Var);
                                            i2Var.h1();
                                        }
                                        j3 j3Var2 = h1Var5.H;
                                        h1.f(j3Var2);
                                        j3Var2.F.Z();
                                        h1Var5.j().Z0(new AtomicReference());
                                        h1Var5.j().a1(w0Var.Z.F());
                                    }
                                } else {
                                    if (h1Var6.a()) {
                                        e4Var2 = e4Var;
                                        if (e4Var2.s1("android.permission.INTERNET")) {
                                            bVar6 = bVar4;
                                        } else {
                                            h1.g(q0Var);
                                            bVar6 = bVar4;
                                            bVar6.b("App is missing INTERNET permission");
                                        }
                                        if (!e4Var2.s1("android.permission.ACCESS_NETWORK_STATE")) {
                                            h1.g(q0Var);
                                            bVar6.b("App is missing ACCESS_NETWORK_STATE permission");
                                        }
                                        h1Var5 = h1Var6;
                                        context = h1Var5.A;
                                        if (!xe.b.a(context).c() && !gVar.Y0()) {
                                            if (!e4.L1(context)) {
                                                h1.g(q0Var);
                                                bVar6.b("AppMeasurementReceiver not registered/enabled");
                                            }
                                            if (!e4.o1(context)) {
                                                h1.g(q0Var);
                                                bVar6.b("AppMeasurementService not registered/enabled");
                                            }
                                        }
                                        h1.g(q0Var);
                                        bVar6.b("Uploading is not possible. App measurement disabled");
                                    } else {
                                        h1Var5 = h1Var6;
                                        e4Var2 = e4Var;
                                    }
                                    q0Var2 = q0Var;
                                }
                                m8.a();
                                if (gVar.f1(null, tf.b0.Q0)) {
                                    e4Var2.V0();
                                    if (e4Var2.q1() == 1) {
                                        z11 = true;
                                    }
                                    if (z11) {
                                        long jIntValue2 = ((Integer) tf.b0.f14601x0.a(null)).intValue();
                                        long jNextInt2 = new Random().nextInt(5000);
                                        h1Var5.K.getClass();
                                        jMax = Math.max(500L, ((jIntValue2 * 1000) + jNextInt2) - SystemClock.elapsedRealtime());
                                        if (jMax > 500) {
                                            h1.g(q0Var2);
                                            bVar3.c(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                        }
                                        h1.f(i2Var);
                                        i2Var.V0();
                                        if (i2Var.M == null) {
                                            i2Var.M = new y1(i2Var, h1Var4, 0);
                                        }
                                        i2Var.M.b(jMax);
                                    }
                                }
                                w0Var.P.b(true);
                            }
                            j10 = j9;
                            e4Var = e4Var4;
                            if (TextUtils.isEmpty(h1Var6.l().c1()) && (i12 == 0 || i12 == 30 || i12 == 10 || i12 == 40)) {
                                h1.f(i2Var);
                                z11 = false;
                                i2Var.r1(new t1(-10), false);
                            } else {
                                z11 = false;
                            }
                            t1Var = null;
                            if (t1Var != null) {
                                h1.f(i2Var);
                                i2Var.r1(t1Var, true);
                            } else {
                                t1Var = t1VarC1;
                            }
                            h1.f(i2Var);
                            h1Var4 = (h1) i2Var.B;
                            i2Var.Z0(t1Var);
                            w0Var.V0();
                            int i14 = tf.o.b(w0Var.Z0().getString("dma_consent_settings", null)).f14677a;
                            q1VarK3 = gVar.k1("google_analytics_default_allow_ad_personalization_signals", true);
                            if (q1VarK3 != q1Var) {
                                h1.g(q0Var);
                                bVar3.c(q1VarK3, "Default ad personalization consent from Manifest");
                            }
                            q1VarK4 = gVar.k1("google_analytics_default_allow_ad_user_data", true);
                            if (q1VarK4 == q1Var) {
                                if (TextUtils.isEmpty(h1Var6.l().c1())) {
                                    if (TextUtils.isEmpty(h1Var6.l().c1())) {
                                        oVarC = tf.o.c(30, bundle);
                                        it = oVarC.f14681e.values().iterator();
                                        while (it.hasNext()) {
                                            if (((q1) it.next()) != q1Var) {
                                                h1.f(i2Var);
                                                i2Var.q1(oVarC, true);
                                                break;
                                            }
                                        }
                                    }
                                } else if (TextUtils.isEmpty(h1Var6.l().c1())) {
                                    oVarC = tf.o.c(30, bundle);
                                    it = oVarC.f14681e.values().iterator();
                                    while (it.hasNext()) {
                                        if (((q1) it.next()) != q1Var) {
                                            h1.f(i2Var);
                                            i2Var.q1(oVarC, true);
                                            break;
                                        }
                                    }
                                }
                            } else if (TextUtils.isEmpty(h1Var6.l().c1())) {
                                if (TextUtils.isEmpty(h1Var6.l().c1())) {
                                    oVarC = tf.o.c(30, bundle);
                                    it = oVarC.f14681e.values().iterator();
                                    while (it.hasNext()) {
                                        if (((q1) it.next()) != q1Var) {
                                            h1.f(i2Var);
                                            i2Var.q1(oVarC, true);
                                            break;
                                        }
                                    }
                                }
                            } else if (TextUtils.isEmpty(h1Var6.l().c1())) {
                                oVarC = tf.o.c(30, bundle);
                                it = oVarC.f14681e.values().iterator();
                                while (it.hasNext()) {
                                    if (((q1) it.next()) != q1Var) {
                                        h1.f(i2Var);
                                        i2Var.q1(oVarC, true);
                                        break;
                                    }
                                }
                            }
                            boolH1 = gVar.h1("google_analytics_tcf_data_enabled");
                            if (boolH1 != null) {
                                h1.g(q0Var);
                                bVar.b("TCF client enabled.");
                                h1.f(i2Var);
                                i2Var.V0();
                                q0 q0Var12 = h1Var4.F;
                                h1.g(q0Var12);
                                q0Var12.N.b("Register tcfPrefChangeListener.");
                                if (i2Var.V == null) {
                                    i2Var.W = new y1(i2Var, h1Var4, 2);
                                    i2Var.V = new SharedPreferences.OnSharedPreferenceChangeListener() {
                                        @Override
                                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                            i2 i2Var2 = i2Var;
                                            h1 h1Var9 = (h1) i2Var2.B;
                                            g gVar3 = h1Var9.D;
                                            q0 q0Var13 = h1Var9.F;
                                            if (!gVar3.f1(null, b0.Z0)) {
                                                if (Objects.equals(str8, "IABTCF_TCString")) {
                                                    h1.g(q0Var13);
                                                    q0Var13.O.b("IABTCF_TCString change picked up in listener.");
                                                    y1 y1Var = i2Var2.W;
                                                    com.google.android.gms.common.internal.d0.h(y1Var);
                                                    y1Var.b(500L);
                                                    return;
                                                }
                                                return;
                                            }
                                            if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                                h1.g(q0Var13);
                                                q0Var13.O.b("IABTCF_TCString change picked up in listener.");
                                                y1 y1Var2 = i2Var2.W;
                                                com.google.android.gms.common.internal.d0.h(y1Var2);
                                                y1Var2.b(500L);
                                            }
                                        }
                                    };
                                }
                                w0 w0Var4 = h1Var4.E;
                                h1.e(w0Var4);
                                w0Var4.a1().registerOnSharedPreferenceChangeListener(i2Var.V);
                                h1.f(i2Var);
                                i2Var.b1();
                            } else {
                                h1.g(q0Var);
                                bVar.b("TCF client enabled.");
                                h1.f(i2Var);
                                i2Var.V0();
                                q0 q0Var13 = h1Var4.F;
                                h1.g(q0Var13);
                                q0Var13.N.b("Register tcfPrefChangeListener.");
                                if (i2Var.V == null) {
                                    i2Var.W = new y1(i2Var, h1Var4, 2);
                                    i2Var.V = new SharedPreferences.OnSharedPreferenceChangeListener() {
                                        @Override
                                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                            i2 i2Var2 = i2Var;
                                            h1 h1Var9 = (h1) i2Var2.B;
                                            g gVar3 = h1Var9.D;
                                            q0 q0Var14 = h1Var9.F;
                                            if (!gVar3.f1(null, b0.Z0)) {
                                                if (Objects.equals(str8, "IABTCF_TCString")) {
                                                    h1.g(q0Var14);
                                                    q0Var14.O.b("IABTCF_TCString change picked up in listener.");
                                                    y1 y1Var = i2Var2.W;
                                                    com.google.android.gms.common.internal.d0.h(y1Var);
                                                    y1Var.b(500L);
                                                    return;
                                                }
                                                return;
                                            }
                                            if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                                h1.g(q0Var14);
                                                q0Var14.O.b("IABTCF_TCString change picked up in listener.");
                                                y1 y1Var2 = i2Var2.W;
                                                com.google.android.gms.common.internal.d0.h(y1Var2);
                                                y1Var2.b(500L);
                                            }
                                        }
                                    };
                                }
                                w0 w0Var5 = h1Var4.E;
                                h1.e(w0Var5);
                                w0Var5.a1().registerOnSharedPreferenceChangeListener(i2Var.V);
                                h1.f(i2Var);
                                i2Var.b1();
                            }
                            m1Var = w0Var.G;
                            if (m1Var.e() == 0) {
                                h1.g(q0Var);
                                bVar3.c(Long.valueOf(j10), "Persisting first open");
                                j11 = j10;
                                m1Var.f(j11);
                            } else {
                                j11 = j10;
                            }
                            h1.f(i2Var);
                            g1Var = i2Var.S;
                            if (g1Var.d()) {
                                w0 w0Var6 = g1Var.A.E;
                                h1.e(w0Var6);
                                w0Var6.X.r(null);
                            }
                            if (h1Var6.c()) {
                                if (h1Var6.a()) {
                                    e4Var2 = e4Var;
                                    if (e4Var2.s1("android.permission.INTERNET")) {
                                        h1.g(q0Var);
                                        bVar6 = bVar4;
                                        bVar6.b("App is missing INTERNET permission");
                                    } else {
                                        bVar6 = bVar4;
                                    }
                                    if (!e4Var2.s1("android.permission.ACCESS_NETWORK_STATE")) {
                                        h1.g(q0Var);
                                        bVar6.b("App is missing ACCESS_NETWORK_STATE permission");
                                    }
                                    h1Var5 = h1Var6;
                                    context = h1Var5.A;
                                    if (!xe.b.a(context).c()) {
                                        if (!e4.L1(context)) {
                                            h1.g(q0Var);
                                            bVar6.b("AppMeasurementReceiver not registered/enabled");
                                        }
                                        if (!e4.o1(context)) {
                                            h1.g(q0Var);
                                            bVar6.b("AppMeasurementService not registered/enabled");
                                        }
                                    }
                                    h1.g(q0Var);
                                    bVar6.b("Uploading is not possible. App measurement disabled");
                                } else {
                                    h1Var5 = h1Var6;
                                    e4Var2 = e4Var;
                                }
                                q0Var2 = q0Var;
                            } else {
                                h1Var5 = h1Var6;
                                e4Var2 = e4Var;
                                if (TextUtils.isEmpty(h1Var5.l().c1())) {
                                    String strC3 = h1Var5.l().c1();
                                    w0Var.V0();
                                    String string3 = w0Var.Z0().getString("gmp_app_id", null);
                                    zIsEmpty = TextUtils.isEmpty(strC3);
                                    boolean zIsEmpty3 = TextUtils.isEmpty(string3);
                                    if (zIsEmpty) {
                                        cVar2 = cVar;
                                    } else {
                                        cVar2 = cVar;
                                    }
                                    String strC4 = h1Var5.l().c1();
                                    w0Var.V0();
                                    SharedPreferences.Editor editorEdit4 = w0Var.Z0().edit();
                                    editorEdit4.putString("gmp_app_id", strC4);
                                    editorEdit4.apply();
                                } else {
                                    cVar2 = cVar;
                                }
                                if (!w0Var.c1().i(s1Var)) {
                                    cVar2.r(null);
                                }
                                h1.f(i2Var);
                                i2Var.H.set(cVar2.p());
                                h1Var3.A.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                q0Var2 = q0Var;
                                if (!TextUtils.isEmpty(h1Var5.l().c1())) {
                                    zA = h1Var5.a();
                                    sharedPreferences = w0Var.D;
                                    if (sharedPreferences == null) {
                                        zContains = z11;
                                    } else {
                                        zContains = sharedPreferences.contains("deferred_analytics_collection");
                                    }
                                    if (!zContains) {
                                        w0Var.e1(!zA);
                                    }
                                    if (zA) {
                                        h1.f(i2Var);
                                        i2Var.h1();
                                    }
                                    j3 j3Var3 = h1Var5.H;
                                    h1.f(j3Var3);
                                    j3Var3.F.Z();
                                    h1Var5.j().Z0(new AtomicReference());
                                    h1Var5.j().a1(w0Var.Z.F());
                                }
                            }
                            m8.a();
                            if (gVar.f1(null, tf.b0.Q0)) {
                                e4Var2.V0();
                                if (e4Var2.q1() == 1) {
                                    z11 = true;
                                }
                                if (z11) {
                                    long jIntValue3 = ((Integer) tf.b0.f14601x0.a(null)).intValue();
                                    long jNextInt3 = new Random().nextInt(5000);
                                    h1Var5.K.getClass();
                                    jMax = Math.max(500L, ((jIntValue3 * 1000) + jNextInt3) - SystemClock.elapsedRealtime());
                                    if (jMax > 500) {
                                        h1.g(q0Var2);
                                        bVar3.c(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                    }
                                    h1.f(i2Var);
                                    i2Var.V0();
                                    if (i2Var.M == null) {
                                        i2Var.M = new y1(i2Var, h1Var4, 0);
                                    }
                                    i2Var.M.b(jMax);
                                }
                            }
                            w0Var.P.b(true);
                        }
                        q0 q0Var14 = h1Var.F;
                        h1.g(q0Var14);
                        q0Var14.G.b("Failed to load metadata: Metadata bundle is null");
                        numValueOf = null;
                        if (numValueOf != null) {
                            stringArray = h1Var.A.getResources().getStringArray(numValueOf.intValue());
                            if (stringArray == null) {
                                listAsList = Arrays.asList(stringArray);
                            }
                        }
                        if (listAsList != null) {
                            j0Var3.L = listAsList;
                            break;
                        }
                        if (listAsList.isEmpty()) {
                            it2 = listAsList.iterator();
                            do {
                                if (it2.hasNext()) {
                                    j0Var3.L = listAsList;
                                    break;
                                } else {
                                    str3 = (String) it2.next();
                                    e4Var3 = h1Var8.I;
                                    h1.e(e4Var3);
                                }
                            } while (e4Var3.W1("safelisted event", str3));
                        } else {
                            h1.g(q0Var6);
                            q0Var6.L.b("Safelisted event list is empty. Ignoring");
                        }
                        if (packageManager != null) {
                            j0Var3.N = ta.c0.J(context2) ? 1 : 0;
                        } else {
                            j0Var3.N = 0;
                        }
                        ((h1) j0Var3.B).f14627c0.incrementAndGet();
                        j0Var3.C = true;
                        n2Var = new n2(h1Var6);
                        n2Var.X0();
                        h1Var6.U = n2Var;
                        if (!n2Var.C) {
                            throw new IllegalStateException(str);
                        }
                        n2Var.D = (JobScheduler) ((h1) n2Var.B).A.getSystemService("jobscheduler");
                        ((h1) n2Var.B).f14627c0.incrementAndGet();
                        n2Var.C = true;
                        h1.g(q0Var3);
                        bVar = q0Var3.N;
                        bVar2 = q0Var3.M;
                        bVar3 = q0Var3.O;
                        bVar4 = q0Var3.G;
                        gVar.a1();
                        bVar2.c(133005L, "App measurement initialized, version");
                        h1.g(q0Var3);
                        bVar2.b("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                        strB1 = j0Var.b1();
                        if (e4Var4.v1(strB1, gVar.D)) {
                            h1.g(q0Var3);
                            bVar2.b("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                        } else {
                            h1.g(q0Var3);
                            bVar2.b("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strB1)));
                        }
                        h1.g(q0Var3);
                        bVar.b("Debug-level message logging enabled");
                        i11 = h1Var6.f14625a0;
                        atomicInteger = h1Var6.f14627c0;
                        if (i11 != atomicInteger.get()) {
                            h1.g(q0Var3);
                            bVar4.d("Not all components initialized", Integer.valueOf(h1Var6.f14625a0), Integer.valueOf(atomicInteger.get()));
                        }
                        h1Var6.V = true;
                        j9 = h1Var6.f14628d0;
                        i2Var = h1Var6.M;
                        e1 e1Var3 = h1Var6.G;
                        h1.g(e1Var3);
                        e1Var3.V0();
                        h1.d(h1Var6.U);
                        iA1 = h1Var6.U.a1();
                        m8.a();
                        zF1 = gVar.f1(null, tf.b0.Q0);
                        if (iA1 == 2) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (zF1) {
                            e4Var4.V0();
                            if (e4Var4.q1() == 1) {
                                e4Var4.V0();
                                IntentFilter intentFilter4 = new IntentFilter();
                                intentFilter4.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                intentFilter4.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                z12 = z10;
                                h1Var2 = h1Var7;
                                q0Var = q0Var3;
                                bVar5 = bVar2;
                                n4.b.f(h1Var2.A, new androidx.mediarouter.app.g(h1Var2), intentFilter4, null);
                                q0 q0Var15 = h1Var2.F;
                                h1.g(q0Var15);
                                q0Var15.N.b("Registered app receiver");
                                if (z12) {
                                    h1.d(h1Var6.U);
                                    h1Var6.U.Z0(((Long) tf.b0.C.a(null)).longValue());
                                }
                            } else if (z10) {
                                z10 = true;
                                e4Var4.V0();
                                IntentFilter intentFilter5 = new IntentFilter();
                                intentFilter5.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                intentFilter5.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                z12 = z10;
                                h1Var2 = h1Var7;
                                q0Var = q0Var3;
                                bVar5 = bVar2;
                                n4.b.f(h1Var2.A, new androidx.mediarouter.app.g(h1Var2), intentFilter5, null);
                                q0 q0Var16 = h1Var2.F;
                                h1.g(q0Var16);
                                q0Var16.N.b("Registered app receiver");
                                if (z12) {
                                    h1.d(h1Var6.U);
                                    h1Var6.U.Z0(((Long) tf.b0.C.a(null)).longValue());
                                }
                            } else {
                                h1Var2 = h1Var7;
                                bVar5 = bVar2;
                                q0Var = q0Var3;
                            }
                        } else if (z10) {
                            z10 = true;
                            e4Var4.V0();
                            IntentFilter intentFilter6 = new IntentFilter();
                            intentFilter6.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter6.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            z12 = z10;
                            h1Var2 = h1Var7;
                            q0Var = q0Var3;
                            bVar5 = bVar2;
                            n4.b.f(h1Var2.A, new androidx.mediarouter.app.g(h1Var2), intentFilter6, null);
                            q0 q0Var17 = h1Var2.F;
                            h1.g(q0Var17);
                            q0Var17.N.b("Registered app receiver");
                            if (z12) {
                                h1.d(h1Var6.U);
                                h1Var6.U.Z0(((Long) tf.b0.C.a(null)).longValue());
                            }
                        } else {
                            h1Var2 = h1Var7;
                            bVar5 = bVar2;
                            q0Var = q0Var3;
                        }
                        cVar = w0Var.H;
                        t1VarC1 = w0Var.c1();
                        int i15 = t1VarC1.f14702b;
                        q1VarK1 = gVar.k1("google_analytics_default_allow_ad_storage", false);
                        h1Var3 = h1Var2;
                        q1VarK2 = gVar.k1("google_analytics_default_allow_analytics_storage", false);
                        q1Var = q1.UNINITIALIZED;
                        s1Var = s1.ANALYTICS_STORAGE;
                        if (q1VarK1 == q1Var) {
                            e4Var = e4Var4;
                            j10 = j9;
                            if (t1.l(-10, w0Var.Z0().getInt("consent_source", 100))) {
                                EnumMap enumMap3 = new EnumMap(s1.class);
                                enumMap3.put(s1.AD_STORAGE, q1VarK1);
                                enumMap3.put(s1Var, q1VarK2);
                                t1Var = new t1(enumMap3, -10);
                                z11 = false;
                            } else {
                                if (TextUtils.isEmpty(h1Var6.l().c1())) {
                                    z11 = false;
                                } else {
                                    z11 = false;
                                }
                                t1Var = null;
                            }
                        } else {
                            e4Var = e4Var4;
                            j10 = j9;
                            if (t1.l(-10, w0Var.Z0().getInt("consent_source", 100))) {
                                EnumMap enumMap4 = new EnumMap(s1.class);
                                enumMap4.put(s1.AD_STORAGE, q1VarK1);
                                enumMap4.put(s1Var, q1VarK2);
                                t1Var = new t1(enumMap4, -10);
                                z11 = false;
                            } else {
                                if (TextUtils.isEmpty(h1Var6.l().c1())) {
                                    z11 = false;
                                } else {
                                    z11 = false;
                                }
                                t1Var = null;
                            }
                        }
                        if (t1Var != null) {
                            h1.f(i2Var);
                            i2Var.r1(t1Var, true);
                        } else {
                            t1Var = t1VarC1;
                        }
                        h1.f(i2Var);
                        h1Var4 = (h1) i2Var.B;
                        i2Var.Z0(t1Var);
                        w0Var.V0();
                        int i16 = tf.o.b(w0Var.Z0().getString("dma_consent_settings", null)).f14677a;
                        q1VarK3 = gVar.k1("google_analytics_default_allow_ad_personalization_signals", true);
                        if (q1VarK3 != q1Var) {
                            h1.g(q0Var);
                            bVar3.c(q1VarK3, "Default ad personalization consent from Manifest");
                        }
                        q1VarK4 = gVar.k1("google_analytics_default_allow_ad_user_data", true);
                        if (q1VarK4 == q1Var) {
                            if (TextUtils.isEmpty(h1Var6.l().c1())) {
                                if (TextUtils.isEmpty(h1Var6.l().c1())) {
                                    oVarC = tf.o.c(30, bundle);
                                    it = oVarC.f14681e.values().iterator();
                                    while (it.hasNext()) {
                                        if (((q1) it.next()) != q1Var) {
                                            h1.f(i2Var);
                                            i2Var.q1(oVarC, true);
                                            break;
                                        }
                                    }
                                }
                            } else if (TextUtils.isEmpty(h1Var6.l().c1())) {
                                oVarC = tf.o.c(30, bundle);
                                it = oVarC.f14681e.values().iterator();
                                while (it.hasNext()) {
                                    if (((q1) it.next()) != q1Var) {
                                        h1.f(i2Var);
                                        i2Var.q1(oVarC, true);
                                        break;
                                    }
                                }
                            }
                        } else if (TextUtils.isEmpty(h1Var6.l().c1())) {
                            if (TextUtils.isEmpty(h1Var6.l().c1())) {
                                oVarC = tf.o.c(30, bundle);
                                it = oVarC.f14681e.values().iterator();
                                while (it.hasNext()) {
                                    if (((q1) it.next()) != q1Var) {
                                        h1.f(i2Var);
                                        i2Var.q1(oVarC, true);
                                        break;
                                    }
                                }
                            }
                        } else if (TextUtils.isEmpty(h1Var6.l().c1())) {
                            oVarC = tf.o.c(30, bundle);
                            it = oVarC.f14681e.values().iterator();
                            while (it.hasNext()) {
                                if (((q1) it.next()) != q1Var) {
                                    h1.f(i2Var);
                                    i2Var.q1(oVarC, true);
                                    break;
                                }
                            }
                        }
                        boolH1 = gVar.h1("google_analytics_tcf_data_enabled");
                        if (boolH1 != null) {
                            h1.g(q0Var);
                            bVar.b("TCF client enabled.");
                            h1.f(i2Var);
                            i2Var.V0();
                            q0 q0Var18 = h1Var4.F;
                            h1.g(q0Var18);
                            q0Var18.N.b("Register tcfPrefChangeListener.");
                            if (i2Var.V == null) {
                                i2Var.W = new y1(i2Var, h1Var4, 2);
                                i2Var.V = new SharedPreferences.OnSharedPreferenceChangeListener() {
                                    @Override
                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                        i2 i2Var2 = i2Var;
                                        h1 h1Var9 = (h1) i2Var2.B;
                                        g gVar3 = h1Var9.D;
                                        q0 q0Var19 = h1Var9.F;
                                        if (!gVar3.f1(null, b0.Z0)) {
                                            if (Objects.equals(str8, "IABTCF_TCString")) {
                                                h1.g(q0Var19);
                                                q0Var19.O.b("IABTCF_TCString change picked up in listener.");
                                                y1 y1Var = i2Var2.W;
                                                com.google.android.gms.common.internal.d0.h(y1Var);
                                                y1Var.b(500L);
                                                return;
                                            }
                                            return;
                                        }
                                        if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                            h1.g(q0Var19);
                                            q0Var19.O.b("IABTCF_TCString change picked up in listener.");
                                            y1 y1Var2 = i2Var2.W;
                                            com.google.android.gms.common.internal.d0.h(y1Var2);
                                            y1Var2.b(500L);
                                        }
                                    }
                                };
                            }
                            w0 w0Var7 = h1Var4.E;
                            h1.e(w0Var7);
                            w0Var7.a1().registerOnSharedPreferenceChangeListener(i2Var.V);
                            h1.f(i2Var);
                            i2Var.b1();
                        } else {
                            h1.g(q0Var);
                            bVar.b("TCF client enabled.");
                            h1.f(i2Var);
                            i2Var.V0();
                            q0 q0Var19 = h1Var4.F;
                            h1.g(q0Var19);
                            q0Var19.N.b("Register tcfPrefChangeListener.");
                            if (i2Var.V == null) {
                                i2Var.W = new y1(i2Var, h1Var4, 2);
                                i2Var.V = new SharedPreferences.OnSharedPreferenceChangeListener() {
                                    @Override
                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                        i2 i2Var2 = i2Var;
                                        h1 h1Var9 = (h1) i2Var2.B;
                                        g gVar3 = h1Var9.D;
                                        q0 q0Var110 = h1Var9.F;
                                        if (!gVar3.f1(null, b0.Z0)) {
                                            if (Objects.equals(str8, "IABTCF_TCString")) {
                                                h1.g(q0Var110);
                                                q0Var110.O.b("IABTCF_TCString change picked up in listener.");
                                                y1 y1Var = i2Var2.W;
                                                com.google.android.gms.common.internal.d0.h(y1Var);
                                                y1Var.b(500L);
                                                return;
                                            }
                                            return;
                                        }
                                        if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                            h1.g(q0Var110);
                                            q0Var110.O.b("IABTCF_TCString change picked up in listener.");
                                            y1 y1Var2 = i2Var2.W;
                                            com.google.android.gms.common.internal.d0.h(y1Var2);
                                            y1Var2.b(500L);
                                        }
                                    }
                                };
                            }
                            w0 w0Var8 = h1Var4.E;
                            h1.e(w0Var8);
                            w0Var8.a1().registerOnSharedPreferenceChangeListener(i2Var.V);
                            h1.f(i2Var);
                            i2Var.b1();
                        }
                        m1Var = w0Var.G;
                        if (m1Var.e() == 0) {
                            h1.g(q0Var);
                            bVar3.c(Long.valueOf(j10), "Persisting first open");
                            j11 = j10;
                            m1Var.f(j11);
                        } else {
                            j11 = j10;
                        }
                        h1.f(i2Var);
                        g1Var = i2Var.S;
                        if (g1Var.d()) {
                            w0 w0Var9 = g1Var.A.E;
                            h1.e(w0Var9);
                            w0Var9.X.r(null);
                        }
                        if (h1Var6.c()) {
                            if (h1Var6.a()) {
                                e4Var2 = e4Var;
                                if (e4Var2.s1("android.permission.INTERNET")) {
                                    h1.g(q0Var);
                                    bVar6 = bVar4;
                                    bVar6.b("App is missing INTERNET permission");
                                } else {
                                    bVar6 = bVar4;
                                }
                                if (!e4Var2.s1("android.permission.ACCESS_NETWORK_STATE")) {
                                    h1.g(q0Var);
                                    bVar6.b("App is missing ACCESS_NETWORK_STATE permission");
                                }
                                h1Var5 = h1Var6;
                                context = h1Var5.A;
                                if (!xe.b.a(context).c()) {
                                    if (!e4.L1(context)) {
                                        h1.g(q0Var);
                                        bVar6.b("AppMeasurementReceiver not registered/enabled");
                                    }
                                    if (!e4.o1(context)) {
                                        h1.g(q0Var);
                                        bVar6.b("AppMeasurementService not registered/enabled");
                                    }
                                }
                                h1.g(q0Var);
                                bVar6.b("Uploading is not possible. App measurement disabled");
                            } else {
                                h1Var5 = h1Var6;
                                e4Var2 = e4Var;
                            }
                            q0Var2 = q0Var;
                        } else {
                            h1Var5 = h1Var6;
                            e4Var2 = e4Var;
                            if (TextUtils.isEmpty(h1Var5.l().c1())) {
                                String strC5 = h1Var5.l().c1();
                                w0Var.V0();
                                String string4 = w0Var.Z0().getString("gmp_app_id", null);
                                zIsEmpty = TextUtils.isEmpty(strC5);
                                boolean zIsEmpty4 = TextUtils.isEmpty(string4);
                                if (zIsEmpty) {
                                    cVar2 = cVar;
                                } else {
                                    cVar2 = cVar;
                                }
                                String strC6 = h1Var5.l().c1();
                                w0Var.V0();
                                SharedPreferences.Editor editorEdit5 = w0Var.Z0().edit();
                                editorEdit5.putString("gmp_app_id", strC6);
                                editorEdit5.apply();
                            } else {
                                cVar2 = cVar;
                            }
                            if (!w0Var.c1().i(s1Var)) {
                                cVar2.r(null);
                            }
                            h1.f(i2Var);
                            i2Var.H.set(cVar2.p());
                            h1Var3.A.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                            q0Var2 = q0Var;
                            if (!TextUtils.isEmpty(h1Var5.l().c1())) {
                                zA = h1Var5.a();
                                sharedPreferences = w0Var.D;
                                if (sharedPreferences == null) {
                                    zContains = z11;
                                } else {
                                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                                }
                                if (!zContains) {
                                    w0Var.e1(!zA);
                                }
                                if (zA) {
                                    h1.f(i2Var);
                                    i2Var.h1();
                                }
                                j3 j3Var4 = h1Var5.H;
                                h1.f(j3Var4);
                                j3Var4.F.Z();
                                h1Var5.j().Z0(new AtomicReference());
                                h1Var5.j().a1(w0Var.Z.F());
                            }
                        }
                        m8.a();
                        if (gVar.f1(null, tf.b0.Q0)) {
                            e4Var2.V0();
                            if (e4Var2.q1() == 1) {
                                z11 = true;
                            }
                            if (z11) {
                                long jIntValue4 = ((Integer) tf.b0.f14601x0.a(null)).intValue();
                                long jNextInt4 = new Random().nextInt(5000);
                                h1Var5.K.getClass();
                                jMax = Math.max(500L, ((jIntValue4 * 1000) + jNextInt4) - SystemClock.elapsedRealtime());
                                if (jMax > 500) {
                                    h1.g(q0Var2);
                                    bVar3.c(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                }
                                h1.f(i2Var);
                                i2Var.V0();
                                if (i2Var.M == null) {
                                    i2Var.M = new y1(i2Var, h1Var4, 0);
                                }
                                i2Var.M.b(jMax);
                            }
                        }
                        w0Var.P.b(true);
                    }
                    str6 = "manual_install";
                    packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
                    if (packageInfo != null) {
                        applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                        if (TextUtils.isEmpty(applicationLabel)) {
                            string = applicationLabel.toString();
                        } else {
                            string = "Unknown";
                        }
                        str2 = packageInfo.versionName;
                        i10 = packageInfo.versionCode;
                    }
                } catch (PackageManager.NameNotFoundException unused5) {
                    string = "Unknown";
                }
                installerPackageName = str6;
                String str8 = installerPackageName;
                j0Var3.D = packageName;
                j0Var3.G = str8;
                j0Var3.E = str2;
                j0Var3.F = i10;
                j0Var3.H = string;
                j0Var3.I = 0L;
                iB = h1Var8.b();
                if (iB == 0) {
                    h1.g(q0Var6);
                    q0Var6.O.b("App measurement collection enabled");
                } else if (iB == 1) {
                    h1.g(q0Var6);
                    q0Var6.M.b("App measurement deactivated via the manifest");
                } else if (iB == 3) {
                    h1.g(q0Var6);
                    q0Var6.M.b("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                } else if (iB == 4) {
                    h1.g(q0Var6);
                    q0Var6.M.b("App measurement disabled via the manifest");
                } else if (iB == 6) {
                    h1.g(q0Var6);
                    q0Var6.L.b("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                } else if (iB == 7) {
                    h1.g(q0Var6);
                    q0Var6.M.b("App measurement disabled via the global data collection setting");
                } else if (iB != 8) {
                    h1.g(q0Var6);
                    q0Var6.M.b("App measurement disabled");
                    h1.g(q0Var6);
                    q0Var6.H.b("Invalid scion state in identity");
                } else {
                    h1.g(q0Var6);
                    q0Var6.M.b("App measurement disabled due to denied storage consent");
                }
                j0Var3.O = RuntimeVersion.SUFFIX;
                strB = u1.b(context2, h1Var8.P);
                if (!TextUtils.isEmpty(strB)) {
                    str4 = strB;
                }
                j0Var3.O = str4;
                if (iB == 0) {
                    h1.g(q0Var6);
                    q0Var6.O.d("App measurement enabled for app package, google app id", j0Var3.D, j0Var3.O);
                }
                listAsList = null;
                j0Var3.L = null;
                tf.g gVar3 = h1Var8.D;
                h1Var = (h1) gVar3.B;
                com.google.android.gms.common.internal.d0.e("analytics.safelisted_events");
                bundleG1 = gVar3.g1();
                if (bundleG1 != null) {
                    if (bundleG1.containsKey("analytics.safelisted_events")) {
                        numValueOf = Integer.valueOf(bundleG1.getInt("analytics.safelisted_events"));
                    }
                    if (numValueOf != null) {
                        stringArray = h1Var.A.getResources().getStringArray(numValueOf.intValue());
                        if (stringArray == null) {
                            listAsList = Arrays.asList(stringArray);
                        }
                    }
                    if (listAsList != null) {
                        j0Var3.L = listAsList;
                        break;
                    }
                    if (listAsList.isEmpty()) {
                        it2 = listAsList.iterator();
                        do {
                            if (it2.hasNext()) {
                                j0Var3.L = listAsList;
                                break;
                            } else {
                                str3 = (String) it2.next();
                                e4Var3 = h1Var8.I;
                                h1.e(e4Var3);
                            }
                        } while (e4Var3.W1("safelisted event", str3));
                    } else {
                        h1.g(q0Var6);
                        q0Var6.L.b("Safelisted event list is empty. Ignoring");
                    }
                    if (packageManager != null) {
                        j0Var3.N = ta.c0.J(context2) ? 1 : 0;
                    } else {
                        j0Var3.N = 0;
                    }
                    ((h1) j0Var3.B).f14627c0.incrementAndGet();
                    j0Var3.C = true;
                    n2Var = new n2(h1Var6);
                    n2Var.X0();
                    h1Var6.U = n2Var;
                    if (!n2Var.C) {
                        throw new IllegalStateException(str);
                    }
                    n2Var.D = (JobScheduler) ((h1) n2Var.B).A.getSystemService("jobscheduler");
                    ((h1) n2Var.B).f14627c0.incrementAndGet();
                    n2Var.C = true;
                    h1.g(q0Var3);
                    bVar = q0Var3.N;
                    bVar2 = q0Var3.M;
                    bVar3 = q0Var3.O;
                    bVar4 = q0Var3.G;
                    gVar.a1();
                    bVar2.c(133005L, "App measurement initialized, version");
                    h1.g(q0Var3);
                    bVar2.b("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                    strB1 = j0Var.b1();
                    if (e4Var4.v1(strB1, gVar.D)) {
                        h1.g(q0Var3);
                        bVar2.b("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                    } else {
                        h1.g(q0Var3);
                        bVar2.b("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strB1)));
                    }
                    h1.g(q0Var3);
                    bVar.b("Debug-level message logging enabled");
                    i11 = h1Var6.f14625a0;
                    atomicInteger = h1Var6.f14627c0;
                    if (i11 != atomicInteger.get()) {
                        h1.g(q0Var3);
                        bVar4.d("Not all components initialized", Integer.valueOf(h1Var6.f14625a0), Integer.valueOf(atomicInteger.get()));
                    }
                    h1Var6.V = true;
                    j9 = h1Var6.f14628d0;
                    i2Var = h1Var6.M;
                    e1 e1Var4 = h1Var6.G;
                    h1.g(e1Var4);
                    e1Var4.V0();
                    h1.d(h1Var6.U);
                    iA1 = h1Var6.U.a1();
                    m8.a();
                    zF1 = gVar.f1(null, tf.b0.Q0);
                    if (iA1 == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (zF1) {
                        e4Var4.V0();
                        if (e4Var4.q1() == 1) {
                            e4Var4.V0();
                            IntentFilter intentFilter7 = new IntentFilter();
                            intentFilter7.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter7.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            z12 = z10;
                            h1Var2 = h1Var7;
                            q0Var = q0Var3;
                            bVar5 = bVar2;
                            n4.b.f(h1Var2.A, new androidx.mediarouter.app.g(h1Var2), intentFilter7, null);
                            q0 q0Var110 = h1Var2.F;
                            h1.g(q0Var110);
                            q0Var110.N.b("Registered app receiver");
                            if (z12) {
                                h1.d(h1Var6.U);
                                h1Var6.U.Z0(((Long) tf.b0.C.a(null)).longValue());
                            }
                        } else if (z10) {
                            z10 = true;
                            e4Var4.V0();
                            IntentFilter intentFilter8 = new IntentFilter();
                            intentFilter8.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter8.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            z12 = z10;
                            h1Var2 = h1Var7;
                            q0Var = q0Var3;
                            bVar5 = bVar2;
                            n4.b.f(h1Var2.A, new androidx.mediarouter.app.g(h1Var2), intentFilter8, null);
                            q0 q0Var111 = h1Var2.F;
                            h1.g(q0Var111);
                            q0Var111.N.b("Registered app receiver");
                            if (z12) {
                                h1.d(h1Var6.U);
                                h1Var6.U.Z0(((Long) tf.b0.C.a(null)).longValue());
                            }
                        } else {
                            h1Var2 = h1Var7;
                            bVar5 = bVar2;
                            q0Var = q0Var3;
                        }
                    } else if (z10) {
                        z10 = true;
                        e4Var4.V0();
                        IntentFilter intentFilter9 = new IntentFilter();
                        intentFilter9.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter9.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        z12 = z10;
                        h1Var2 = h1Var7;
                        q0Var = q0Var3;
                        bVar5 = bVar2;
                        n4.b.f(h1Var2.A, new androidx.mediarouter.app.g(h1Var2), intentFilter9, null);
                        q0 q0Var112 = h1Var2.F;
                        h1.g(q0Var112);
                        q0Var112.N.b("Registered app receiver");
                        if (z12) {
                            h1.d(h1Var6.U);
                            h1Var6.U.Z0(((Long) tf.b0.C.a(null)).longValue());
                        }
                    } else {
                        h1Var2 = h1Var7;
                        bVar5 = bVar2;
                        q0Var = q0Var3;
                    }
                    cVar = w0Var.H;
                    t1VarC1 = w0Var.c1();
                    int i17 = t1VarC1.f14702b;
                    q1VarK1 = gVar.k1("google_analytics_default_allow_ad_storage", false);
                    h1Var3 = h1Var2;
                    q1VarK2 = gVar.k1("google_analytics_default_allow_analytics_storage", false);
                    q1Var = q1.UNINITIALIZED;
                    s1Var = s1.ANALYTICS_STORAGE;
                    if (q1VarK1 == q1Var) {
                        e4Var = e4Var4;
                        j10 = j9;
                        if (t1.l(-10, w0Var.Z0().getInt("consent_source", 100))) {
                            EnumMap enumMap5 = new EnumMap(s1.class);
                            enumMap5.put(s1.AD_STORAGE, q1VarK1);
                            enumMap5.put(s1Var, q1VarK2);
                            t1Var = new t1(enumMap5, -10);
                            z11 = false;
                        } else {
                            if (TextUtils.isEmpty(h1Var6.l().c1())) {
                                z11 = false;
                            } else {
                                z11 = false;
                            }
                            t1Var = null;
                        }
                    } else {
                        e4Var = e4Var4;
                        j10 = j9;
                        if (t1.l(-10, w0Var.Z0().getInt("consent_source", 100))) {
                            EnumMap enumMap6 = new EnumMap(s1.class);
                            enumMap6.put(s1.AD_STORAGE, q1VarK1);
                            enumMap6.put(s1Var, q1VarK2);
                            t1Var = new t1(enumMap6, -10);
                            z11 = false;
                        } else {
                            if (TextUtils.isEmpty(h1Var6.l().c1())) {
                                z11 = false;
                            } else {
                                z11 = false;
                            }
                            t1Var = null;
                        }
                    }
                    if (t1Var != null) {
                        h1.f(i2Var);
                        i2Var.r1(t1Var, true);
                    } else {
                        t1Var = t1VarC1;
                    }
                    h1.f(i2Var);
                    h1Var4 = (h1) i2Var.B;
                    i2Var.Z0(t1Var);
                    w0Var.V0();
                    int i18 = tf.o.b(w0Var.Z0().getString("dma_consent_settings", null)).f14677a;
                    q1VarK3 = gVar.k1("google_analytics_default_allow_ad_personalization_signals", true);
                    if (q1VarK3 != q1Var) {
                        h1.g(q0Var);
                        bVar3.c(q1VarK3, "Default ad personalization consent from Manifest");
                    }
                    q1VarK4 = gVar.k1("google_analytics_default_allow_ad_user_data", true);
                    if (q1VarK4 == q1Var) {
                        if (TextUtils.isEmpty(h1Var6.l().c1())) {
                            if (TextUtils.isEmpty(h1Var6.l().c1())) {
                                oVarC = tf.o.c(30, bundle);
                                it = oVarC.f14681e.values().iterator();
                                while (it.hasNext()) {
                                    if (((q1) it.next()) != q1Var) {
                                        h1.f(i2Var);
                                        i2Var.q1(oVarC, true);
                                        break;
                                    }
                                }
                            }
                        } else if (TextUtils.isEmpty(h1Var6.l().c1())) {
                            oVarC = tf.o.c(30, bundle);
                            it = oVarC.f14681e.values().iterator();
                            while (it.hasNext()) {
                                if (((q1) it.next()) != q1Var) {
                                    h1.f(i2Var);
                                    i2Var.q1(oVarC, true);
                                    break;
                                }
                            }
                        }
                    } else if (TextUtils.isEmpty(h1Var6.l().c1())) {
                        if (TextUtils.isEmpty(h1Var6.l().c1())) {
                            oVarC = tf.o.c(30, bundle);
                            it = oVarC.f14681e.values().iterator();
                            while (it.hasNext()) {
                                if (((q1) it.next()) != q1Var) {
                                    h1.f(i2Var);
                                    i2Var.q1(oVarC, true);
                                    break;
                                }
                            }
                        }
                    } else if (TextUtils.isEmpty(h1Var6.l().c1())) {
                        oVarC = tf.o.c(30, bundle);
                        it = oVarC.f14681e.values().iterator();
                        while (it.hasNext()) {
                            if (((q1) it.next()) != q1Var) {
                                h1.f(i2Var);
                                i2Var.q1(oVarC, true);
                                break;
                            }
                        }
                    }
                    boolH1 = gVar.h1("google_analytics_tcf_data_enabled");
                    if (boolH1 != null) {
                        h1.g(q0Var);
                        bVar.b("TCF client enabled.");
                        h1.f(i2Var);
                        i2Var.V0();
                        q0 q0Var113 = h1Var4.F;
                        h1.g(q0Var113);
                        q0Var113.N.b("Register tcfPrefChangeListener.");
                        if (i2Var.V == null) {
                            i2Var.W = new y1(i2Var, h1Var4, 2);
                            i2Var.V = new SharedPreferences.OnSharedPreferenceChangeListener() {
                                @Override
                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                    i2 i2Var2 = i2Var;
                                    h1 h1Var9 = (h1) i2Var2.B;
                                    g gVar4 = h1Var9.D;
                                    q0 q0Var114 = h1Var9.F;
                                    if (!gVar4.f1(null, b0.Z0)) {
                                        if (Objects.equals(str9, "IABTCF_TCString")) {
                                            h1.g(q0Var114);
                                            q0Var114.O.b("IABTCF_TCString change picked up in listener.");
                                            y1 y1Var = i2Var2.W;
                                            com.google.android.gms.common.internal.d0.h(y1Var);
                                            y1Var.b(500L);
                                            return;
                                        }
                                        return;
                                    }
                                    if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                        h1.g(q0Var114);
                                        q0Var114.O.b("IABTCF_TCString change picked up in listener.");
                                        y1 y1Var2 = i2Var2.W;
                                        com.google.android.gms.common.internal.d0.h(y1Var2);
                                        y1Var2.b(500L);
                                    }
                                }
                            };
                        }
                        w0 w0Var10 = h1Var4.E;
                        h1.e(w0Var10);
                        w0Var10.a1().registerOnSharedPreferenceChangeListener(i2Var.V);
                        h1.f(i2Var);
                        i2Var.b1();
                    } else {
                        h1.g(q0Var);
                        bVar.b("TCF client enabled.");
                        h1.f(i2Var);
                        i2Var.V0();
                        q0 q0Var114 = h1Var4.F;
                        h1.g(q0Var114);
                        q0Var114.N.b("Register tcfPrefChangeListener.");
                        if (i2Var.V == null) {
                            i2Var.W = new y1(i2Var, h1Var4, 2);
                            i2Var.V = new SharedPreferences.OnSharedPreferenceChangeListener() {
                                @Override
                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                    i2 i2Var2 = i2Var;
                                    h1 h1Var9 = (h1) i2Var2.B;
                                    g gVar4 = h1Var9.D;
                                    q0 q0Var115 = h1Var9.F;
                                    if (!gVar4.f1(null, b0.Z0)) {
                                        if (Objects.equals(str9, "IABTCF_TCString")) {
                                            h1.g(q0Var115);
                                            q0Var115.O.b("IABTCF_TCString change picked up in listener.");
                                            y1 y1Var = i2Var2.W;
                                            com.google.android.gms.common.internal.d0.h(y1Var);
                                            y1Var.b(500L);
                                            return;
                                        }
                                        return;
                                    }
                                    if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                        h1.g(q0Var115);
                                        q0Var115.O.b("IABTCF_TCString change picked up in listener.");
                                        y1 y1Var2 = i2Var2.W;
                                        com.google.android.gms.common.internal.d0.h(y1Var2);
                                        y1Var2.b(500L);
                                    }
                                }
                            };
                        }
                        w0 w0Var11 = h1Var4.E;
                        h1.e(w0Var11);
                        w0Var11.a1().registerOnSharedPreferenceChangeListener(i2Var.V);
                        h1.f(i2Var);
                        i2Var.b1();
                    }
                    m1Var = w0Var.G;
                    if (m1Var.e() == 0) {
                        h1.g(q0Var);
                        bVar3.c(Long.valueOf(j10), "Persisting first open");
                        j11 = j10;
                        m1Var.f(j11);
                    } else {
                        j11 = j10;
                    }
                    h1.f(i2Var);
                    g1Var = i2Var.S;
                    if (g1Var.d()) {
                        w0 w0Var12 = g1Var.A.E;
                        h1.e(w0Var12);
                        w0Var12.X.r(null);
                    }
                    if (h1Var6.c()) {
                        if (h1Var6.a()) {
                            e4Var2 = e4Var;
                            if (e4Var2.s1("android.permission.INTERNET")) {
                                h1.g(q0Var);
                                bVar6 = bVar4;
                                bVar6.b("App is missing INTERNET permission");
                            } else {
                                bVar6 = bVar4;
                            }
                            if (!e4Var2.s1("android.permission.ACCESS_NETWORK_STATE")) {
                                h1.g(q0Var);
                                bVar6.b("App is missing ACCESS_NETWORK_STATE permission");
                            }
                            h1Var5 = h1Var6;
                            context = h1Var5.A;
                            if (!xe.b.a(context).c()) {
                                if (!e4.L1(context)) {
                                    h1.g(q0Var);
                                    bVar6.b("AppMeasurementReceiver not registered/enabled");
                                }
                                if (!e4.o1(context)) {
                                    h1.g(q0Var);
                                    bVar6.b("AppMeasurementService not registered/enabled");
                                }
                            }
                            h1.g(q0Var);
                            bVar6.b("Uploading is not possible. App measurement disabled");
                        } else {
                            h1Var5 = h1Var6;
                            e4Var2 = e4Var;
                        }
                        q0Var2 = q0Var;
                    } else {
                        h1Var5 = h1Var6;
                        e4Var2 = e4Var;
                        if (TextUtils.isEmpty(h1Var5.l().c1())) {
                            String strC7 = h1Var5.l().c1();
                            w0Var.V0();
                            String string5 = w0Var.Z0().getString("gmp_app_id", null);
                            zIsEmpty = TextUtils.isEmpty(strC7);
                            boolean zIsEmpty5 = TextUtils.isEmpty(string5);
                            if (zIsEmpty) {
                                cVar2 = cVar;
                            } else {
                                cVar2 = cVar;
                            }
                            String strC8 = h1Var5.l().c1();
                            w0Var.V0();
                            SharedPreferences.Editor editorEdit6 = w0Var.Z0().edit();
                            editorEdit6.putString("gmp_app_id", strC8);
                            editorEdit6.apply();
                        } else {
                            cVar2 = cVar;
                        }
                        if (!w0Var.c1().i(s1Var)) {
                            cVar2.r(null);
                        }
                        h1.f(i2Var);
                        i2Var.H.set(cVar2.p());
                        h1Var3.A.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                        q0Var2 = q0Var;
                        if (!TextUtils.isEmpty(h1Var5.l().c1())) {
                            zA = h1Var5.a();
                            sharedPreferences = w0Var.D;
                            if (sharedPreferences == null) {
                                zContains = z11;
                            } else {
                                zContains = sharedPreferences.contains("deferred_analytics_collection");
                            }
                            if (!zContains) {
                                w0Var.e1(!zA);
                            }
                            if (zA) {
                                h1.f(i2Var);
                                i2Var.h1();
                            }
                            j3 j3Var5 = h1Var5.H;
                            h1.f(j3Var5);
                            j3Var5.F.Z();
                            h1Var5.j().Z0(new AtomicReference());
                            h1Var5.j().a1(w0Var.Z.F());
                        }
                    }
                    m8.a();
                    if (gVar.f1(null, tf.b0.Q0)) {
                        e4Var2.V0();
                        if (e4Var2.q1() == 1) {
                            z11 = true;
                        }
                        if (z11) {
                            long jIntValue5 = ((Integer) tf.b0.f14601x0.a(null)).intValue();
                            long jNextInt5 = new Random().nextInt(5000);
                            h1Var5.K.getClass();
                            jMax = Math.max(500L, ((jIntValue5 * 1000) + jNextInt5) - SystemClock.elapsedRealtime());
                            if (jMax > 500) {
                                h1.g(q0Var2);
                                bVar3.c(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                            }
                            h1.f(i2Var);
                            i2Var.V0();
                            if (i2Var.M == null) {
                                i2Var.M = new y1(i2Var, h1Var4, 0);
                            }
                            i2Var.M.b(jMax);
                        }
                    }
                    w0Var.P.b(true);
                }
                q0 q0Var115 = h1Var.F;
                h1.g(q0Var115);
                q0Var115.G.b("Failed to load metadata: Metadata bundle is null");
                numValueOf = null;
                if (numValueOf != null) {
                    stringArray = h1Var.A.getResources().getStringArray(numValueOf.intValue());
                    if (stringArray == null) {
                        listAsList = Arrays.asList(stringArray);
                    }
                }
                if (listAsList != null) {
                    j0Var3.L = listAsList;
                    break;
                }
                if (listAsList.isEmpty()) {
                    it2 = listAsList.iterator();
                    do {
                        if (it2.hasNext()) {
                            j0Var3.L = listAsList;
                            break;
                        } else {
                            str3 = (String) it2.next();
                            e4Var3 = h1Var8.I;
                            h1.e(e4Var3);
                        }
                    } while (e4Var3.W1("safelisted event", str3));
                } else {
                    h1.g(q0Var6);
                    q0Var6.L.b("Safelisted event list is empty. Ignoring");
                }
                if (packageManager != null) {
                    j0Var3.N = ta.c0.J(context2) ? 1 : 0;
                } else {
                    j0Var3.N = 0;
                }
                ((h1) j0Var3.B).f14627c0.incrementAndGet();
                j0Var3.C = true;
                n2Var = new n2(h1Var6);
                n2Var.X0();
                h1Var6.U = n2Var;
                if (!n2Var.C) {
                    throw new IllegalStateException(str);
                }
                n2Var.D = (JobScheduler) ((h1) n2Var.B).A.getSystemService("jobscheduler");
                ((h1) n2Var.B).f14627c0.incrementAndGet();
                n2Var.C = true;
                h1.g(q0Var3);
                bVar = q0Var3.N;
                bVar2 = q0Var3.M;
                bVar3 = q0Var3.O;
                bVar4 = q0Var3.G;
                gVar.a1();
                bVar2.c(133005L, "App measurement initialized, version");
                h1.g(q0Var3);
                bVar2.b("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                strB1 = j0Var.b1();
                if (e4Var4.v1(strB1, gVar.D)) {
                    h1.g(q0Var3);
                    bVar2.b("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                } else {
                    h1.g(q0Var3);
                    bVar2.b("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strB1)));
                }
                h1.g(q0Var3);
                bVar.b("Debug-level message logging enabled");
                i11 = h1Var6.f14625a0;
                atomicInteger = h1Var6.f14627c0;
                if (i11 != atomicInteger.get()) {
                    h1.g(q0Var3);
                    bVar4.d("Not all components initialized", Integer.valueOf(h1Var6.f14625a0), Integer.valueOf(atomicInteger.get()));
                }
                h1Var6.V = true;
                j9 = h1Var6.f14628d0;
                i2Var = h1Var6.M;
                e1 e1Var5 = h1Var6.G;
                h1.g(e1Var5);
                e1Var5.V0();
                h1.d(h1Var6.U);
                iA1 = h1Var6.U.a1();
                m8.a();
                zF1 = gVar.f1(null, tf.b0.Q0);
                if (iA1 == 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (zF1) {
                    e4Var4.V0();
                    if (e4Var4.q1() == 1) {
                        e4Var4.V0();
                        IntentFilter intentFilter10 = new IntentFilter();
                        intentFilter10.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter10.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        z12 = z10;
                        h1Var2 = h1Var7;
                        q0Var = q0Var3;
                        bVar5 = bVar2;
                        n4.b.f(h1Var2.A, new androidx.mediarouter.app.g(h1Var2), intentFilter10, null);
                        q0 q0Var116 = h1Var2.F;
                        h1.g(q0Var116);
                        q0Var116.N.b("Registered app receiver");
                        if (z12) {
                            h1.d(h1Var6.U);
                            h1Var6.U.Z0(((Long) tf.b0.C.a(null)).longValue());
                        }
                    } else if (z10) {
                        z10 = true;
                        e4Var4.V0();
                        IntentFilter intentFilter11 = new IntentFilter();
                        intentFilter11.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter11.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        z12 = z10;
                        h1Var2 = h1Var7;
                        q0Var = q0Var3;
                        bVar5 = bVar2;
                        n4.b.f(h1Var2.A, new androidx.mediarouter.app.g(h1Var2), intentFilter11, null);
                        q0 q0Var117 = h1Var2.F;
                        h1.g(q0Var117);
                        q0Var117.N.b("Registered app receiver");
                        if (z12) {
                            h1.d(h1Var6.U);
                            h1Var6.U.Z0(((Long) tf.b0.C.a(null)).longValue());
                        }
                    } else {
                        h1Var2 = h1Var7;
                        bVar5 = bVar2;
                        q0Var = q0Var3;
                    }
                } else if (z10) {
                    z10 = true;
                    e4Var4.V0();
                    IntentFilter intentFilter12 = new IntentFilter();
                    intentFilter12.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intentFilter12.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    z12 = z10;
                    h1Var2 = h1Var7;
                    q0Var = q0Var3;
                    bVar5 = bVar2;
                    n4.b.f(h1Var2.A, new androidx.mediarouter.app.g(h1Var2), intentFilter12, null);
                    q0 q0Var118 = h1Var2.F;
                    h1.g(q0Var118);
                    q0Var118.N.b("Registered app receiver");
                    if (z12) {
                        h1.d(h1Var6.U);
                        h1Var6.U.Z0(((Long) tf.b0.C.a(null)).longValue());
                    }
                } else {
                    h1Var2 = h1Var7;
                    bVar5 = bVar2;
                    q0Var = q0Var3;
                }
                cVar = w0Var.H;
                t1VarC1 = w0Var.c1();
                int i19 = t1VarC1.f14702b;
                q1VarK1 = gVar.k1("google_analytics_default_allow_ad_storage", false);
                h1Var3 = h1Var2;
                q1VarK2 = gVar.k1("google_analytics_default_allow_analytics_storage", false);
                q1Var = q1.UNINITIALIZED;
                s1Var = s1.ANALYTICS_STORAGE;
                if (q1VarK1 == q1Var) {
                    e4Var = e4Var4;
                    j10 = j9;
                    if (t1.l(-10, w0Var.Z0().getInt("consent_source", 100))) {
                        EnumMap enumMap7 = new EnumMap(s1.class);
                        enumMap7.put(s1.AD_STORAGE, q1VarK1);
                        enumMap7.put(s1Var, q1VarK2);
                        t1Var = new t1(enumMap7, -10);
                        z11 = false;
                    } else {
                        if (TextUtils.isEmpty(h1Var6.l().c1())) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        t1Var = null;
                    }
                } else {
                    e4Var = e4Var4;
                    j10 = j9;
                    if (t1.l(-10, w0Var.Z0().getInt("consent_source", 100))) {
                        EnumMap enumMap8 = new EnumMap(s1.class);
                        enumMap8.put(s1.AD_STORAGE, q1VarK1);
                        enumMap8.put(s1Var, q1VarK2);
                        t1Var = new t1(enumMap8, -10);
                        z11 = false;
                    } else {
                        if (TextUtils.isEmpty(h1Var6.l().c1())) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        t1Var = null;
                    }
                }
                if (t1Var != null) {
                    h1.f(i2Var);
                    i2Var.r1(t1Var, true);
                } else {
                    t1Var = t1VarC1;
                }
                h1.f(i2Var);
                h1Var4 = (h1) i2Var.B;
                i2Var.Z0(t1Var);
                w0Var.V0();
                int i110 = tf.o.b(w0Var.Z0().getString("dma_consent_settings", null)).f14677a;
                q1VarK3 = gVar.k1("google_analytics_default_allow_ad_personalization_signals", true);
                if (q1VarK3 != q1Var) {
                    h1.g(q0Var);
                    bVar3.c(q1VarK3, "Default ad personalization consent from Manifest");
                }
                q1VarK4 = gVar.k1("google_analytics_default_allow_ad_user_data", true);
                if (q1VarK4 == q1Var) {
                    if (TextUtils.isEmpty(h1Var6.l().c1())) {
                        if (TextUtils.isEmpty(h1Var6.l().c1())) {
                            oVarC = tf.o.c(30, bundle);
                            it = oVarC.f14681e.values().iterator();
                            while (it.hasNext()) {
                                if (((q1) it.next()) != q1Var) {
                                    h1.f(i2Var);
                                    i2Var.q1(oVarC, true);
                                    break;
                                }
                            }
                        }
                    } else if (TextUtils.isEmpty(h1Var6.l().c1())) {
                        oVarC = tf.o.c(30, bundle);
                        it = oVarC.f14681e.values().iterator();
                        while (it.hasNext()) {
                            if (((q1) it.next()) != q1Var) {
                                h1.f(i2Var);
                                i2Var.q1(oVarC, true);
                                break;
                            }
                        }
                    }
                } else if (TextUtils.isEmpty(h1Var6.l().c1())) {
                    if (TextUtils.isEmpty(h1Var6.l().c1())) {
                        oVarC = tf.o.c(30, bundle);
                        it = oVarC.f14681e.values().iterator();
                        while (it.hasNext()) {
                            if (((q1) it.next()) != q1Var) {
                                h1.f(i2Var);
                                i2Var.q1(oVarC, true);
                                break;
                            }
                        }
                    }
                } else if (TextUtils.isEmpty(h1Var6.l().c1())) {
                    oVarC = tf.o.c(30, bundle);
                    it = oVarC.f14681e.values().iterator();
                    while (it.hasNext()) {
                        if (((q1) it.next()) != q1Var) {
                            h1.f(i2Var);
                            i2Var.q1(oVarC, true);
                            break;
                        }
                    }
                }
                boolH1 = gVar.h1("google_analytics_tcf_data_enabled");
                if (boolH1 != null) {
                    h1.g(q0Var);
                    bVar.b("TCF client enabled.");
                    h1.f(i2Var);
                    i2Var.V0();
                    q0 q0Var119 = h1Var4.F;
                    h1.g(q0Var119);
                    q0Var119.N.b("Register tcfPrefChangeListener.");
                    if (i2Var.V == null) {
                        i2Var.W = new y1(i2Var, h1Var4, 2);
                        i2Var.V = new SharedPreferences.OnSharedPreferenceChangeListener() {
                            @Override
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                i2 i2Var2 = i2Var;
                                h1 h1Var9 = (h1) i2Var2.B;
                                g gVar4 = h1Var9.D;
                                q0 q0Var1110 = h1Var9.F;
                                if (!gVar4.f1(null, b0.Z0)) {
                                    if (Objects.equals(str9, "IABTCF_TCString")) {
                                        h1.g(q0Var1110);
                                        q0Var1110.O.b("IABTCF_TCString change picked up in listener.");
                                        y1 y1Var = i2Var2.W;
                                        com.google.android.gms.common.internal.d0.h(y1Var);
                                        y1Var.b(500L);
                                        return;
                                    }
                                    return;
                                }
                                if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                    h1.g(q0Var1110);
                                    q0Var1110.O.b("IABTCF_TCString change picked up in listener.");
                                    y1 y1Var2 = i2Var2.W;
                                    com.google.android.gms.common.internal.d0.h(y1Var2);
                                    y1Var2.b(500L);
                                }
                            }
                        };
                    }
                    w0 w0Var13 = h1Var4.E;
                    h1.e(w0Var13);
                    w0Var13.a1().registerOnSharedPreferenceChangeListener(i2Var.V);
                    h1.f(i2Var);
                    i2Var.b1();
                } else {
                    h1.g(q0Var);
                    bVar.b("TCF client enabled.");
                    h1.f(i2Var);
                    i2Var.V0();
                    q0 q0Var1110 = h1Var4.F;
                    h1.g(q0Var1110);
                    q0Var1110.N.b("Register tcfPrefChangeListener.");
                    if (i2Var.V == null) {
                        i2Var.W = new y1(i2Var, h1Var4, 2);
                        i2Var.V = new SharedPreferences.OnSharedPreferenceChangeListener() {
                            @Override
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                i2 i2Var2 = i2Var;
                                h1 h1Var9 = (h1) i2Var2.B;
                                g gVar4 = h1Var9.D;
                                q0 q0Var1111 = h1Var9.F;
                                if (!gVar4.f1(null, b0.Z0)) {
                                    if (Objects.equals(str9, "IABTCF_TCString")) {
                                        h1.g(q0Var1111);
                                        q0Var1111.O.b("IABTCF_TCString change picked up in listener.");
                                        y1 y1Var = i2Var2.W;
                                        com.google.android.gms.common.internal.d0.h(y1Var);
                                        y1Var.b(500L);
                                        return;
                                    }
                                    return;
                                }
                                if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                    h1.g(q0Var1111);
                                    q0Var1111.O.b("IABTCF_TCString change picked up in listener.");
                                    y1 y1Var2 = i2Var2.W;
                                    com.google.android.gms.common.internal.d0.h(y1Var2);
                                    y1Var2.b(500L);
                                }
                            }
                        };
                    }
                    w0 w0Var14 = h1Var4.E;
                    h1.e(w0Var14);
                    w0Var14.a1().registerOnSharedPreferenceChangeListener(i2Var.V);
                    h1.f(i2Var);
                    i2Var.b1();
                }
                m1Var = w0Var.G;
                if (m1Var.e() == 0) {
                    h1.g(q0Var);
                    bVar3.c(Long.valueOf(j10), "Persisting first open");
                    j11 = j10;
                    m1Var.f(j11);
                } else {
                    j11 = j10;
                }
                h1.f(i2Var);
                g1Var = i2Var.S;
                if (g1Var.d()) {
                    w0 w0Var15 = g1Var.A.E;
                    h1.e(w0Var15);
                    w0Var15.X.r(null);
                }
                if (h1Var6.c()) {
                    if (h1Var6.a()) {
                        e4Var2 = e4Var;
                        if (e4Var2.s1("android.permission.INTERNET")) {
                            h1.g(q0Var);
                            bVar6 = bVar4;
                            bVar6.b("App is missing INTERNET permission");
                        } else {
                            bVar6 = bVar4;
                        }
                        if (!e4Var2.s1("android.permission.ACCESS_NETWORK_STATE")) {
                            h1.g(q0Var);
                            bVar6.b("App is missing ACCESS_NETWORK_STATE permission");
                        }
                        h1Var5 = h1Var6;
                        context = h1Var5.A;
                        if (!xe.b.a(context).c()) {
                            if (!e4.L1(context)) {
                                h1.g(q0Var);
                                bVar6.b("AppMeasurementReceiver not registered/enabled");
                            }
                            if (!e4.o1(context)) {
                                h1.g(q0Var);
                                bVar6.b("AppMeasurementService not registered/enabled");
                            }
                        }
                        h1.g(q0Var);
                        bVar6.b("Uploading is not possible. App measurement disabled");
                    } else {
                        h1Var5 = h1Var6;
                        e4Var2 = e4Var;
                    }
                    q0Var2 = q0Var;
                } else {
                    h1Var5 = h1Var6;
                    e4Var2 = e4Var;
                    if (TextUtils.isEmpty(h1Var5.l().c1())) {
                        String strC9 = h1Var5.l().c1();
                        w0Var.V0();
                        String string6 = w0Var.Z0().getString("gmp_app_id", null);
                        zIsEmpty = TextUtils.isEmpty(strC9);
                        boolean zIsEmpty6 = TextUtils.isEmpty(string6);
                        if (zIsEmpty) {
                            cVar2 = cVar;
                        } else {
                            cVar2 = cVar;
                        }
                        String strC10 = h1Var5.l().c1();
                        w0Var.V0();
                        SharedPreferences.Editor editorEdit7 = w0Var.Z0().edit();
                        editorEdit7.putString("gmp_app_id", strC10);
                        editorEdit7.apply();
                    } else {
                        cVar2 = cVar;
                    }
                    if (!w0Var.c1().i(s1Var)) {
                        cVar2.r(null);
                    }
                    h1.f(i2Var);
                    i2Var.H.set(cVar2.p());
                    h1Var3.A.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                    q0Var2 = q0Var;
                    if (!TextUtils.isEmpty(h1Var5.l().c1())) {
                        zA = h1Var5.a();
                        sharedPreferences = w0Var.D;
                        if (sharedPreferences == null) {
                            zContains = z11;
                        } else {
                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                        }
                        if (!zContains) {
                            w0Var.e1(!zA);
                        }
                        if (zA) {
                            h1.f(i2Var);
                            i2Var.h1();
                        }
                        j3 j3Var6 = h1Var5.H;
                        h1.f(j3Var6);
                        j3Var6.F.Z();
                        h1Var5.j().Z0(new AtomicReference());
                        h1Var5.j().a1(w0Var.Z.F());
                    }
                }
                m8.a();
                if (gVar.f1(null, tf.b0.Q0)) {
                    e4Var2.V0();
                    if (e4Var2.q1() == 1) {
                        z11 = true;
                    }
                    if (z11) {
                        long jIntValue6 = ((Integer) tf.b0.f14601x0.a(null)).intValue();
                        long jNextInt6 = new Random().nextInt(5000);
                        h1Var5.K.getClass();
                        jMax = Math.max(500L, ((jIntValue6 * 1000) + jNextInt6) - SystemClock.elapsedRealtime());
                        if (jMax > 500) {
                            h1.g(q0Var2);
                            bVar3.c(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                        }
                        h1.f(i2Var);
                        i2Var.V0();
                        if (i2Var.M == null) {
                            i2Var.M = new y1(i2Var, h1Var4, 0);
                        }
                        i2Var.M.b(jMax);
                    }
                }
                w0Var.P.b(true);
            }
            h1.g(q0Var6);
            j0Var = j0Var2;
            str = "Can't initialize twice";
            q0Var6.G.c(q0.d1(packageName), "PackageManager is null, app identity information might be inaccurate. appId");
            strB = u1.b(context2, h1Var8.P);
            if (!TextUtils.isEmpty(strB)) {
                str4 = strB;
            }
            j0Var3.O = str4;
            if (iB == 0) {
                h1.g(q0Var6);
                q0Var6.O.d("App measurement enabled for app package, google app id", j0Var3.D, j0Var3.O);
            }
        } catch (IllegalStateException e10) {
            h1.g(q0Var6);
            q0Var6.G.d("Fetching Google App Id failed with exception. appId", q0.d1(packageName), e10);
        }
        i10 = Integer.MIN_VALUE;
        string = "Unknown";
        str2 = string;
        String str9 = installerPackageName;
        j0Var3.D = packageName;
        j0Var3.G = str9;
        j0Var3.E = str2;
        j0Var3.F = i10;
        j0Var3.H = string;
        j0Var3.I = 0L;
        iB = h1Var8.b();
        if (iB == 0) {
            h1.g(q0Var6);
            q0Var6.O.b("App measurement collection enabled");
        } else if (iB == 1) {
            h1.g(q0Var6);
            q0Var6.M.b("App measurement deactivated via the manifest");
        } else if (iB == 3) {
            h1.g(q0Var6);
            q0Var6.M.b("App measurement disabled by setAnalyticsCollectionEnabled(false)");
        } else if (iB == 4) {
            h1.g(q0Var6);
            q0Var6.M.b("App measurement disabled via the manifest");
        } else if (iB == 6) {
            h1.g(q0Var6);
            q0Var6.L.b("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
        } else if (iB == 7) {
            h1.g(q0Var6);
            q0Var6.M.b("App measurement disabled via the global data collection setting");
        } else if (iB != 8) {
            h1.g(q0Var6);
            q0Var6.M.b("App measurement disabled");
            h1.g(q0Var6);
            q0Var6.H.b("Invalid scion state in identity");
        } else {
            h1.g(q0Var6);
            q0Var6.M.b("App measurement disabled due to denied storage consent");
        }
        j0Var3.O = RuntimeVersion.SUFFIX;
        listAsList = null;
        j0Var3.L = null;
        tf.g gVar4 = h1Var8.D;
        h1Var = (h1) gVar4.B;
        com.google.android.gms.common.internal.d0.e("analytics.safelisted_events");
        bundleG1 = gVar4.g1();
        if (bundleG1 != null) {
            if (bundleG1.containsKey("analytics.safelisted_events")) {
                numValueOf = Integer.valueOf(bundleG1.getInt("analytics.safelisted_events"));
            }
            if (numValueOf != null) {
                stringArray = h1Var.A.getResources().getStringArray(numValueOf.intValue());
                if (stringArray == null) {
                    listAsList = Arrays.asList(stringArray);
                }
            }
            if (listAsList != null) {
                j0Var3.L = listAsList;
                break;
            }
            if (listAsList.isEmpty()) {
                it2 = listAsList.iterator();
                do {
                    if (it2.hasNext()) {
                        j0Var3.L = listAsList;
                        break;
                    } else {
                        str3 = (String) it2.next();
                        e4Var3 = h1Var8.I;
                        h1.e(e4Var3);
                    }
                } while (e4Var3.W1("safelisted event", str3));
            } else {
                h1.g(q0Var6);
                q0Var6.L.b("Safelisted event list is empty. Ignoring");
            }
            if (packageManager != null) {
                j0Var3.N = ta.c0.J(context2) ? 1 : 0;
            } else {
                j0Var3.N = 0;
            }
            ((h1) j0Var3.B).f14627c0.incrementAndGet();
            j0Var3.C = true;
            n2Var = new n2(h1Var6);
            n2Var.X0();
            h1Var6.U = n2Var;
            if (!n2Var.C) {
                throw new IllegalStateException(str);
            }
            n2Var.D = (JobScheduler) ((h1) n2Var.B).A.getSystemService("jobscheduler");
            ((h1) n2Var.B).f14627c0.incrementAndGet();
            n2Var.C = true;
            h1.g(q0Var3);
            bVar = q0Var3.N;
            bVar2 = q0Var3.M;
            bVar3 = q0Var3.O;
            bVar4 = q0Var3.G;
            gVar.a1();
            bVar2.c(133005L, "App measurement initialized, version");
            h1.g(q0Var3);
            bVar2.b("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
            strB1 = j0Var.b1();
            if (e4Var4.v1(strB1, gVar.D)) {
                h1.g(q0Var3);
                bVar2.b("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                h1.g(q0Var3);
                bVar2.b("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strB1)));
            }
            h1.g(q0Var3);
            bVar.b("Debug-level message logging enabled");
            i11 = h1Var6.f14625a0;
            atomicInteger = h1Var6.f14627c0;
            if (i11 != atomicInteger.get()) {
                h1.g(q0Var3);
                bVar4.d("Not all components initialized", Integer.valueOf(h1Var6.f14625a0), Integer.valueOf(atomicInteger.get()));
            }
            h1Var6.V = true;
            j9 = h1Var6.f14628d0;
            i2Var = h1Var6.M;
            e1 e1Var6 = h1Var6.G;
            h1.g(e1Var6);
            e1Var6.V0();
            h1.d(h1Var6.U);
            iA1 = h1Var6.U.a1();
            m8.a();
            zF1 = gVar.f1(null, tf.b0.Q0);
            if (iA1 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (zF1) {
                e4Var4.V0();
                if (e4Var4.q1() == 1) {
                    e4Var4.V0();
                    IntentFilter intentFilter13 = new IntentFilter();
                    intentFilter13.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intentFilter13.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    z12 = z10;
                    h1Var2 = h1Var7;
                    q0Var = q0Var3;
                    bVar5 = bVar2;
                    n4.b.f(h1Var2.A, new androidx.mediarouter.app.g(h1Var2), intentFilter13, null);
                    q0 q0Var1111 = h1Var2.F;
                    h1.g(q0Var1111);
                    q0Var1111.N.b("Registered app receiver");
                    if (z12) {
                        h1.d(h1Var6.U);
                        h1Var6.U.Z0(((Long) tf.b0.C.a(null)).longValue());
                    }
                } else if (z10) {
                    z10 = true;
                    e4Var4.V0();
                    IntentFilter intentFilter14 = new IntentFilter();
                    intentFilter14.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intentFilter14.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    z12 = z10;
                    h1Var2 = h1Var7;
                    q0Var = q0Var3;
                    bVar5 = bVar2;
                    n4.b.f(h1Var2.A, new androidx.mediarouter.app.g(h1Var2), intentFilter14, null);
                    q0 q0Var1112 = h1Var2.F;
                    h1.g(q0Var1112);
                    q0Var1112.N.b("Registered app receiver");
                    if (z12) {
                        h1.d(h1Var6.U);
                        h1Var6.U.Z0(((Long) tf.b0.C.a(null)).longValue());
                    }
                } else {
                    h1Var2 = h1Var7;
                    bVar5 = bVar2;
                    q0Var = q0Var3;
                }
            } else if (z10) {
                z10 = true;
                e4Var4.V0();
                IntentFilter intentFilter15 = new IntentFilter();
                intentFilter15.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter15.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                z12 = z10;
                h1Var2 = h1Var7;
                q0Var = q0Var3;
                bVar5 = bVar2;
                n4.b.f(h1Var2.A, new androidx.mediarouter.app.g(h1Var2), intentFilter15, null);
                q0 q0Var1113 = h1Var2.F;
                h1.g(q0Var1113);
                q0Var1113.N.b("Registered app receiver");
                if (z12) {
                    h1.d(h1Var6.U);
                    h1Var6.U.Z0(((Long) tf.b0.C.a(null)).longValue());
                }
            } else {
                h1Var2 = h1Var7;
                bVar5 = bVar2;
                q0Var = q0Var3;
            }
            cVar = w0Var.H;
            t1VarC1 = w0Var.c1();
            int i111 = t1VarC1.f14702b;
            q1VarK1 = gVar.k1("google_analytics_default_allow_ad_storage", false);
            h1Var3 = h1Var2;
            q1VarK2 = gVar.k1("google_analytics_default_allow_analytics_storage", false);
            q1Var = q1.UNINITIALIZED;
            s1Var = s1.ANALYTICS_STORAGE;
            if (q1VarK1 == q1Var) {
                e4Var = e4Var4;
                j10 = j9;
                if (t1.l(-10, w0Var.Z0().getInt("consent_source", 100))) {
                    EnumMap enumMap9 = new EnumMap(s1.class);
                    enumMap9.put(s1.AD_STORAGE, q1VarK1);
                    enumMap9.put(s1Var, q1VarK2);
                    t1Var = new t1(enumMap9, -10);
                    z11 = false;
                } else {
                    if (TextUtils.isEmpty(h1Var6.l().c1())) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    t1Var = null;
                }
            } else {
                e4Var = e4Var4;
                j10 = j9;
                if (t1.l(-10, w0Var.Z0().getInt("consent_source", 100))) {
                    EnumMap enumMap10 = new EnumMap(s1.class);
                    enumMap10.put(s1.AD_STORAGE, q1VarK1);
                    enumMap10.put(s1Var, q1VarK2);
                    t1Var = new t1(enumMap10, -10);
                    z11 = false;
                } else {
                    if (TextUtils.isEmpty(h1Var6.l().c1())) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    t1Var = null;
                }
            }
            if (t1Var != null) {
                h1.f(i2Var);
                i2Var.r1(t1Var, true);
            } else {
                t1Var = t1VarC1;
            }
            h1.f(i2Var);
            h1Var4 = (h1) i2Var.B;
            i2Var.Z0(t1Var);
            w0Var.V0();
            int i112 = tf.o.b(w0Var.Z0().getString("dma_consent_settings", null)).f14677a;
            q1VarK3 = gVar.k1("google_analytics_default_allow_ad_personalization_signals", true);
            if (q1VarK3 != q1Var) {
                h1.g(q0Var);
                bVar3.c(q1VarK3, "Default ad personalization consent from Manifest");
            }
            q1VarK4 = gVar.k1("google_analytics_default_allow_ad_user_data", true);
            if (q1VarK4 == q1Var) {
                if (TextUtils.isEmpty(h1Var6.l().c1())) {
                    if (TextUtils.isEmpty(h1Var6.l().c1())) {
                        oVarC = tf.o.c(30, bundle);
                        it = oVarC.f14681e.values().iterator();
                        while (it.hasNext()) {
                            if (((q1) it.next()) != q1Var) {
                                h1.f(i2Var);
                                i2Var.q1(oVarC, true);
                                break;
                            }
                        }
                    }
                } else if (TextUtils.isEmpty(h1Var6.l().c1())) {
                    oVarC = tf.o.c(30, bundle);
                    it = oVarC.f14681e.values().iterator();
                    while (it.hasNext()) {
                        if (((q1) it.next()) != q1Var) {
                            h1.f(i2Var);
                            i2Var.q1(oVarC, true);
                            break;
                        }
                    }
                }
            } else if (TextUtils.isEmpty(h1Var6.l().c1())) {
                if (TextUtils.isEmpty(h1Var6.l().c1())) {
                    oVarC = tf.o.c(30, bundle);
                    it = oVarC.f14681e.values().iterator();
                    while (it.hasNext()) {
                        if (((q1) it.next()) != q1Var) {
                            h1.f(i2Var);
                            i2Var.q1(oVarC, true);
                            break;
                        }
                    }
                }
            } else if (TextUtils.isEmpty(h1Var6.l().c1())) {
                oVarC = tf.o.c(30, bundle);
                it = oVarC.f14681e.values().iterator();
                while (it.hasNext()) {
                    if (((q1) it.next()) != q1Var) {
                        h1.f(i2Var);
                        i2Var.q1(oVarC, true);
                        break;
                    }
                }
            }
            boolH1 = gVar.h1("google_analytics_tcf_data_enabled");
            if (boolH1 != null) {
                h1.g(q0Var);
                bVar.b("TCF client enabled.");
                h1.f(i2Var);
                i2Var.V0();
                q0 q0Var1114 = h1Var4.F;
                h1.g(q0Var1114);
                q0Var1114.N.b("Register tcfPrefChangeListener.");
                if (i2Var.V == null) {
                    i2Var.W = new y1(i2Var, h1Var4, 2);
                    i2Var.V = new SharedPreferences.OnSharedPreferenceChangeListener() {
                        @Override
                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str10) {
                            i2 i2Var2 = i2Var;
                            h1 h1Var9 = (h1) i2Var2.B;
                            g gVar5 = h1Var9.D;
                            q0 q0Var1115 = h1Var9.F;
                            if (!gVar5.f1(null, b0.Z0)) {
                                if (Objects.equals(str10, "IABTCF_TCString")) {
                                    h1.g(q0Var1115);
                                    q0Var1115.O.b("IABTCF_TCString change picked up in listener.");
                                    y1 y1Var = i2Var2.W;
                                    com.google.android.gms.common.internal.d0.h(y1Var);
                                    y1Var.b(500L);
                                    return;
                                }
                                return;
                            }
                            if (Objects.equals(str10, "IABTCF_TCString") || Objects.equals(str10, "IABTCF_gdprApplies") || Objects.equals(str10, "IABTCF_EnableAdvertiserConsentMode")) {
                                h1.g(q0Var1115);
                                q0Var1115.O.b("IABTCF_TCString change picked up in listener.");
                                y1 y1Var2 = i2Var2.W;
                                com.google.android.gms.common.internal.d0.h(y1Var2);
                                y1Var2.b(500L);
                            }
                        }
                    };
                }
                w0 w0Var16 = h1Var4.E;
                h1.e(w0Var16);
                w0Var16.a1().registerOnSharedPreferenceChangeListener(i2Var.V);
                h1.f(i2Var);
                i2Var.b1();
            } else {
                h1.g(q0Var);
                bVar.b("TCF client enabled.");
                h1.f(i2Var);
                i2Var.V0();
                q0 q0Var1115 = h1Var4.F;
                h1.g(q0Var1115);
                q0Var1115.N.b("Register tcfPrefChangeListener.");
                if (i2Var.V == null) {
                    i2Var.W = new y1(i2Var, h1Var4, 2);
                    i2Var.V = new SharedPreferences.OnSharedPreferenceChangeListener() {
                        @Override
                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str10) {
                            i2 i2Var2 = i2Var;
                            h1 h1Var9 = (h1) i2Var2.B;
                            g gVar5 = h1Var9.D;
                            q0 q0Var1116 = h1Var9.F;
                            if (!gVar5.f1(null, b0.Z0)) {
                                if (Objects.equals(str10, "IABTCF_TCString")) {
                                    h1.g(q0Var1116);
                                    q0Var1116.O.b("IABTCF_TCString change picked up in listener.");
                                    y1 y1Var = i2Var2.W;
                                    com.google.android.gms.common.internal.d0.h(y1Var);
                                    y1Var.b(500L);
                                    return;
                                }
                                return;
                            }
                            if (Objects.equals(str10, "IABTCF_TCString") || Objects.equals(str10, "IABTCF_gdprApplies") || Objects.equals(str10, "IABTCF_EnableAdvertiserConsentMode")) {
                                h1.g(q0Var1116);
                                q0Var1116.O.b("IABTCF_TCString change picked up in listener.");
                                y1 y1Var2 = i2Var2.W;
                                com.google.android.gms.common.internal.d0.h(y1Var2);
                                y1Var2.b(500L);
                            }
                        }
                    };
                }
                w0 w0Var17 = h1Var4.E;
                h1.e(w0Var17);
                w0Var17.a1().registerOnSharedPreferenceChangeListener(i2Var.V);
                h1.f(i2Var);
                i2Var.b1();
            }
            m1Var = w0Var.G;
            if (m1Var.e() == 0) {
                h1.g(q0Var);
                bVar3.c(Long.valueOf(j10), "Persisting first open");
                j11 = j10;
                m1Var.f(j11);
            } else {
                j11 = j10;
            }
            h1.f(i2Var);
            g1Var = i2Var.S;
            if (g1Var.d()) {
                w0 w0Var18 = g1Var.A.E;
                h1.e(w0Var18);
                w0Var18.X.r(null);
            }
            if (h1Var6.c()) {
                if (h1Var6.a()) {
                    e4Var2 = e4Var;
                    if (e4Var2.s1("android.permission.INTERNET")) {
                        h1.g(q0Var);
                        bVar6 = bVar4;
                        bVar6.b("App is missing INTERNET permission");
                    } else {
                        bVar6 = bVar4;
                    }
                    if (!e4Var2.s1("android.permission.ACCESS_NETWORK_STATE")) {
                        h1.g(q0Var);
                        bVar6.b("App is missing ACCESS_NETWORK_STATE permission");
                    }
                    h1Var5 = h1Var6;
                    context = h1Var5.A;
                    if (!xe.b.a(context).c()) {
                        if (!e4.L1(context)) {
                            h1.g(q0Var);
                            bVar6.b("AppMeasurementReceiver not registered/enabled");
                        }
                        if (!e4.o1(context)) {
                            h1.g(q0Var);
                            bVar6.b("AppMeasurementService not registered/enabled");
                        }
                    }
                    h1.g(q0Var);
                    bVar6.b("Uploading is not possible. App measurement disabled");
                } else {
                    h1Var5 = h1Var6;
                    e4Var2 = e4Var;
                }
                q0Var2 = q0Var;
            } else {
                h1Var5 = h1Var6;
                e4Var2 = e4Var;
                if (TextUtils.isEmpty(h1Var5.l().c1())) {
                    String strC11 = h1Var5.l().c1();
                    w0Var.V0();
                    String string7 = w0Var.Z0().getString("gmp_app_id", null);
                    zIsEmpty = TextUtils.isEmpty(strC11);
                    boolean zIsEmpty7 = TextUtils.isEmpty(string7);
                    if (zIsEmpty) {
                        cVar2 = cVar;
                    } else {
                        cVar2 = cVar;
                    }
                    String strC12 = h1Var5.l().c1();
                    w0Var.V0();
                    SharedPreferences.Editor editorEdit8 = w0Var.Z0().edit();
                    editorEdit8.putString("gmp_app_id", strC12);
                    editorEdit8.apply();
                } else {
                    cVar2 = cVar;
                }
                if (!w0Var.c1().i(s1Var)) {
                    cVar2.r(null);
                }
                h1.f(i2Var);
                i2Var.H.set(cVar2.p());
                h1Var3.A.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                q0Var2 = q0Var;
                if (!TextUtils.isEmpty(h1Var5.l().c1())) {
                    zA = h1Var5.a();
                    sharedPreferences = w0Var.D;
                    if (sharedPreferences == null) {
                        zContains = z11;
                    } else {
                        zContains = sharedPreferences.contains("deferred_analytics_collection");
                    }
                    if (!zContains) {
                        w0Var.e1(!zA);
                    }
                    if (zA) {
                        h1.f(i2Var);
                        i2Var.h1();
                    }
                    j3 j3Var7 = h1Var5.H;
                    h1.f(j3Var7);
                    j3Var7.F.Z();
                    h1Var5.j().Z0(new AtomicReference());
                    h1Var5.j().a1(w0Var.Z.F());
                }
            }
            m8.a();
            if (gVar.f1(null, tf.b0.Q0)) {
                e4Var2.V0();
                if (e4Var2.q1() == 1) {
                    z11 = true;
                }
                if (z11) {
                    long jIntValue7 = ((Integer) tf.b0.f14601x0.a(null)).intValue();
                    long jNextInt7 = new Random().nextInt(5000);
                    h1Var5.K.getClass();
                    jMax = Math.max(500L, ((jIntValue7 * 1000) + jNextInt7) - SystemClock.elapsedRealtime());
                    if (jMax > 500) {
                        h1.g(q0Var2);
                        bVar3.c(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                    }
                    h1.f(i2Var);
                    i2Var.V0();
                    if (i2Var.M == null) {
                        i2Var.M = new y1(i2Var, h1Var4, 0);
                    }
                    i2Var.M.b(jMax);
                }
            }
            w0Var.P.b(true);
        }
        q0 q0Var1116 = h1Var.F;
        h1.g(q0Var1116);
        q0Var1116.G.b("Failed to load metadata: Metadata bundle is null");
        numValueOf = null;
        if (numValueOf != null) {
            stringArray = h1Var.A.getResources().getStringArray(numValueOf.intValue());
            if (stringArray == null) {
                listAsList = Arrays.asList(stringArray);
            }
        }
        if (listAsList != null) {
            j0Var3.L = listAsList;
            break;
        }
        if (listAsList.isEmpty()) {
            it2 = listAsList.iterator();
            do {
                if (it2.hasNext()) {
                    j0Var3.L = listAsList;
                    break;
                } else {
                    str3 = (String) it2.next();
                    e4Var3 = h1Var8.I;
                    h1.e(e4Var3);
                }
            } while (e4Var3.W1("safelisted event", str3));
        } else {
            h1.g(q0Var6);
            q0Var6.L.b("Safelisted event list is empty. Ignoring");
        }
        if (packageManager != null) {
            j0Var3.N = ta.c0.J(context2) ? 1 : 0;
        } else {
            j0Var3.N = 0;
        }
        ((h1) j0Var3.B).f14627c0.incrementAndGet();
        j0Var3.C = true;
        n2Var = new n2(h1Var6);
        n2Var.X0();
        h1Var6.U = n2Var;
        if (!n2Var.C) {
            throw new IllegalStateException(str);
        }
        n2Var.D = (JobScheduler) ((h1) n2Var.B).A.getSystemService("jobscheduler");
        ((h1) n2Var.B).f14627c0.incrementAndGet();
        n2Var.C = true;
        h1.g(q0Var3);
        bVar = q0Var3.N;
        bVar2 = q0Var3.M;
        bVar3 = q0Var3.O;
        bVar4 = q0Var3.G;
        gVar.a1();
        bVar2.c(133005L, "App measurement initialized, version");
        h1.g(q0Var3);
        bVar2.b("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        strB1 = j0Var.b1();
        if (e4Var4.v1(strB1, gVar.D)) {
            h1.g(q0Var3);
            bVar2.b("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
        } else {
            h1.g(q0Var3);
            bVar2.b("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strB1)));
        }
        h1.g(q0Var3);
        bVar.b("Debug-level message logging enabled");
        i11 = h1Var6.f14625a0;
        atomicInteger = h1Var6.f14627c0;
        if (i11 != atomicInteger.get()) {
            h1.g(q0Var3);
            bVar4.d("Not all components initialized", Integer.valueOf(h1Var6.f14625a0), Integer.valueOf(atomicInteger.get()));
        }
        h1Var6.V = true;
        j9 = h1Var6.f14628d0;
        i2Var = h1Var6.M;
        e1 e1Var7 = h1Var6.G;
        h1.g(e1Var7);
        e1Var7.V0();
        h1.d(h1Var6.U);
        iA1 = h1Var6.U.a1();
        m8.a();
        zF1 = gVar.f1(null, tf.b0.Q0);
        if (iA1 == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (zF1) {
            e4Var4.V0();
            if (e4Var4.q1() == 1) {
                e4Var4.V0();
                IntentFilter intentFilter16 = new IntentFilter();
                intentFilter16.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter16.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                z12 = z10;
                h1Var2 = h1Var7;
                q0Var = q0Var3;
                bVar5 = bVar2;
                n4.b.f(h1Var2.A, new androidx.mediarouter.app.g(h1Var2), intentFilter16, null);
                q0 q0Var1117 = h1Var2.F;
                h1.g(q0Var1117);
                q0Var1117.N.b("Registered app receiver");
                if (z12) {
                    h1.d(h1Var6.U);
                    h1Var6.U.Z0(((Long) tf.b0.C.a(null)).longValue());
                }
            } else if (z10) {
                z10 = true;
                e4Var4.V0();
                IntentFilter intentFilter17 = new IntentFilter();
                intentFilter17.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter17.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                z12 = z10;
                h1Var2 = h1Var7;
                q0Var = q0Var3;
                bVar5 = bVar2;
                n4.b.f(h1Var2.A, new androidx.mediarouter.app.g(h1Var2), intentFilter17, null);
                q0 q0Var1118 = h1Var2.F;
                h1.g(q0Var1118);
                q0Var1118.N.b("Registered app receiver");
                if (z12) {
                    h1.d(h1Var6.U);
                    h1Var6.U.Z0(((Long) tf.b0.C.a(null)).longValue());
                }
            } else {
                h1Var2 = h1Var7;
                bVar5 = bVar2;
                q0Var = q0Var3;
            }
        } else if (z10) {
            z10 = true;
            e4Var4.V0();
            IntentFilter intentFilter18 = new IntentFilter();
            intentFilter18.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intentFilter18.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
            z12 = z10;
            h1Var2 = h1Var7;
            q0Var = q0Var3;
            bVar5 = bVar2;
            n4.b.f(h1Var2.A, new androidx.mediarouter.app.g(h1Var2), intentFilter18, null);
            q0 q0Var1119 = h1Var2.F;
            h1.g(q0Var1119);
            q0Var1119.N.b("Registered app receiver");
            if (z12) {
                h1.d(h1Var6.U);
                h1Var6.U.Z0(((Long) tf.b0.C.a(null)).longValue());
            }
        } else {
            h1Var2 = h1Var7;
            bVar5 = bVar2;
            q0Var = q0Var3;
        }
        cVar = w0Var.H;
        t1VarC1 = w0Var.c1();
        int i113 = t1VarC1.f14702b;
        q1VarK1 = gVar.k1("google_analytics_default_allow_ad_storage", false);
        h1Var3 = h1Var2;
        q1VarK2 = gVar.k1("google_analytics_default_allow_analytics_storage", false);
        q1Var = q1.UNINITIALIZED;
        s1Var = s1.ANALYTICS_STORAGE;
        if (q1VarK1 == q1Var) {
            e4Var = e4Var4;
            j10 = j9;
            if (t1.l(-10, w0Var.Z0().getInt("consent_source", 100))) {
                EnumMap enumMap11 = new EnumMap(s1.class);
                enumMap11.put(s1.AD_STORAGE, q1VarK1);
                enumMap11.put(s1Var, q1VarK2);
                t1Var = new t1(enumMap11, -10);
                z11 = false;
            } else {
                if (TextUtils.isEmpty(h1Var6.l().c1())) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                t1Var = null;
            }
        } else {
            e4Var = e4Var4;
            j10 = j9;
            if (t1.l(-10, w0Var.Z0().getInt("consent_source", 100))) {
                EnumMap enumMap12 = new EnumMap(s1.class);
                enumMap12.put(s1.AD_STORAGE, q1VarK1);
                enumMap12.put(s1Var, q1VarK2);
                t1Var = new t1(enumMap12, -10);
                z11 = false;
            } else {
                if (TextUtils.isEmpty(h1Var6.l().c1())) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                t1Var = null;
            }
        }
        if (t1Var != null) {
            h1.f(i2Var);
            i2Var.r1(t1Var, true);
        } else {
            t1Var = t1VarC1;
        }
        h1.f(i2Var);
        h1Var4 = (h1) i2Var.B;
        i2Var.Z0(t1Var);
        w0Var.V0();
        int i114 = tf.o.b(w0Var.Z0().getString("dma_consent_settings", null)).f14677a;
        q1VarK3 = gVar.k1("google_analytics_default_allow_ad_personalization_signals", true);
        if (q1VarK3 != q1Var) {
            h1.g(q0Var);
            bVar3.c(q1VarK3, "Default ad personalization consent from Manifest");
        }
        q1VarK4 = gVar.k1("google_analytics_default_allow_ad_user_data", true);
        if (q1VarK4 == q1Var) {
            if (TextUtils.isEmpty(h1Var6.l().c1())) {
                if (TextUtils.isEmpty(h1Var6.l().c1())) {
                    oVarC = tf.o.c(30, bundle);
                    it = oVarC.f14681e.values().iterator();
                    while (it.hasNext()) {
                        if (((q1) it.next()) != q1Var) {
                            h1.f(i2Var);
                            i2Var.q1(oVarC, true);
                            break;
                        }
                    }
                }
            } else if (TextUtils.isEmpty(h1Var6.l().c1())) {
                oVarC = tf.o.c(30, bundle);
                it = oVarC.f14681e.values().iterator();
                while (it.hasNext()) {
                    if (((q1) it.next()) != q1Var) {
                        h1.f(i2Var);
                        i2Var.q1(oVarC, true);
                        break;
                    }
                }
            }
        } else if (TextUtils.isEmpty(h1Var6.l().c1())) {
            if (TextUtils.isEmpty(h1Var6.l().c1())) {
                oVarC = tf.o.c(30, bundle);
                it = oVarC.f14681e.values().iterator();
                while (it.hasNext()) {
                    if (((q1) it.next()) != q1Var) {
                        h1.f(i2Var);
                        i2Var.q1(oVarC, true);
                        break;
                    }
                }
            }
        } else if (TextUtils.isEmpty(h1Var6.l().c1())) {
            oVarC = tf.o.c(30, bundle);
            it = oVarC.f14681e.values().iterator();
            while (it.hasNext()) {
                if (((q1) it.next()) != q1Var) {
                    h1.f(i2Var);
                    i2Var.q1(oVarC, true);
                    break;
                }
            }
        }
        boolH1 = gVar.h1("google_analytics_tcf_data_enabled");
        if (boolH1 != null) {
            h1.g(q0Var);
            bVar.b("TCF client enabled.");
            h1.f(i2Var);
            i2Var.V0();
            q0 q0Var11110 = h1Var4.F;
            h1.g(q0Var11110);
            q0Var11110.N.b("Register tcfPrefChangeListener.");
            if (i2Var.V == null) {
                i2Var.W = new y1(i2Var, h1Var4, 2);
                i2Var.V = new SharedPreferences.OnSharedPreferenceChangeListener() {
                    @Override
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str10) {
                        i2 i2Var2 = i2Var;
                        h1 h1Var9 = (h1) i2Var2.B;
                        g gVar5 = h1Var9.D;
                        q0 q0Var11111 = h1Var9.F;
                        if (!gVar5.f1(null, b0.Z0)) {
                            if (Objects.equals(str10, "IABTCF_TCString")) {
                                h1.g(q0Var11111);
                                q0Var11111.O.b("IABTCF_TCString change picked up in listener.");
                                y1 y1Var = i2Var2.W;
                                com.google.android.gms.common.internal.d0.h(y1Var);
                                y1Var.b(500L);
                                return;
                            }
                            return;
                        }
                        if (Objects.equals(str10, "IABTCF_TCString") || Objects.equals(str10, "IABTCF_gdprApplies") || Objects.equals(str10, "IABTCF_EnableAdvertiserConsentMode")) {
                            h1.g(q0Var11111);
                            q0Var11111.O.b("IABTCF_TCString change picked up in listener.");
                            y1 y1Var2 = i2Var2.W;
                            com.google.android.gms.common.internal.d0.h(y1Var2);
                            y1Var2.b(500L);
                        }
                    }
                };
            }
            w0 w0Var19 = h1Var4.E;
            h1.e(w0Var19);
            w0Var19.a1().registerOnSharedPreferenceChangeListener(i2Var.V);
            h1.f(i2Var);
            i2Var.b1();
        } else {
            h1.g(q0Var);
            bVar.b("TCF client enabled.");
            h1.f(i2Var);
            i2Var.V0();
            q0 q0Var11111 = h1Var4.F;
            h1.g(q0Var11111);
            q0Var11111.N.b("Register tcfPrefChangeListener.");
            if (i2Var.V == null) {
                i2Var.W = new y1(i2Var, h1Var4, 2);
                i2Var.V = new SharedPreferences.OnSharedPreferenceChangeListener() {
                    @Override
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str10) {
                        i2 i2Var2 = i2Var;
                        h1 h1Var9 = (h1) i2Var2.B;
                        g gVar5 = h1Var9.D;
                        q0 q0Var11112 = h1Var9.F;
                        if (!gVar5.f1(null, b0.Z0)) {
                            if (Objects.equals(str10, "IABTCF_TCString")) {
                                h1.g(q0Var11112);
                                q0Var11112.O.b("IABTCF_TCString change picked up in listener.");
                                y1 y1Var = i2Var2.W;
                                com.google.android.gms.common.internal.d0.h(y1Var);
                                y1Var.b(500L);
                                return;
                            }
                            return;
                        }
                        if (Objects.equals(str10, "IABTCF_TCString") || Objects.equals(str10, "IABTCF_gdprApplies") || Objects.equals(str10, "IABTCF_EnableAdvertiserConsentMode")) {
                            h1.g(q0Var11112);
                            q0Var11112.O.b("IABTCF_TCString change picked up in listener.");
                            y1 y1Var2 = i2Var2.W;
                            com.google.android.gms.common.internal.d0.h(y1Var2);
                            y1Var2.b(500L);
                        }
                    }
                };
            }
            w0 w0Var110 = h1Var4.E;
            h1.e(w0Var110);
            w0Var110.a1().registerOnSharedPreferenceChangeListener(i2Var.V);
            h1.f(i2Var);
            i2Var.b1();
        }
        m1Var = w0Var.G;
        if (m1Var.e() == 0) {
            h1.g(q0Var);
            bVar3.c(Long.valueOf(j10), "Persisting first open");
            j11 = j10;
            m1Var.f(j11);
        } else {
            j11 = j10;
        }
        h1.f(i2Var);
        g1Var = i2Var.S;
        if (g1Var.d()) {
            w0 w0Var111 = g1Var.A.E;
            h1.e(w0Var111);
            w0Var111.X.r(null);
        }
        if (h1Var6.c()) {
            if (h1Var6.a()) {
                e4Var2 = e4Var;
                if (e4Var2.s1("android.permission.INTERNET")) {
                    h1.g(q0Var);
                    bVar6 = bVar4;
                    bVar6.b("App is missing INTERNET permission");
                } else {
                    bVar6 = bVar4;
                }
                if (!e4Var2.s1("android.permission.ACCESS_NETWORK_STATE")) {
                    h1.g(q0Var);
                    bVar6.b("App is missing ACCESS_NETWORK_STATE permission");
                }
                h1Var5 = h1Var6;
                context = h1Var5.A;
                if (!xe.b.a(context).c()) {
                    if (!e4.L1(context)) {
                        h1.g(q0Var);
                        bVar6.b("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!e4.o1(context)) {
                        h1.g(q0Var);
                        bVar6.b("AppMeasurementService not registered/enabled");
                    }
                }
                h1.g(q0Var);
                bVar6.b("Uploading is not possible. App measurement disabled");
            } else {
                h1Var5 = h1Var6;
                e4Var2 = e4Var;
            }
            q0Var2 = q0Var;
        } else {
            h1Var5 = h1Var6;
            e4Var2 = e4Var;
            if (TextUtils.isEmpty(h1Var5.l().c1())) {
                String strC13 = h1Var5.l().c1();
                w0Var.V0();
                String string8 = w0Var.Z0().getString("gmp_app_id", null);
                zIsEmpty = TextUtils.isEmpty(strC13);
                boolean zIsEmpty8 = TextUtils.isEmpty(string8);
                if (zIsEmpty) {
                    cVar2 = cVar;
                } else {
                    cVar2 = cVar;
                }
                String strC14 = h1Var5.l().c1();
                w0Var.V0();
                SharedPreferences.Editor editorEdit9 = w0Var.Z0().edit();
                editorEdit9.putString("gmp_app_id", strC14);
                editorEdit9.apply();
            } else {
                cVar2 = cVar;
            }
            if (!w0Var.c1().i(s1Var)) {
                cVar2.r(null);
            }
            h1.f(i2Var);
            i2Var.H.set(cVar2.p());
            h1Var3.A.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            q0Var2 = q0Var;
            if (!TextUtils.isEmpty(h1Var5.l().c1())) {
                zA = h1Var5.a();
                sharedPreferences = w0Var.D;
                if (sharedPreferences == null) {
                    zContains = z11;
                } else {
                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                }
                if (!zContains) {
                    w0Var.e1(!zA);
                }
                if (zA) {
                    h1.f(i2Var);
                    i2Var.h1();
                }
                j3 j3Var8 = h1Var5.H;
                h1.f(j3Var8);
                j3Var8.F.Z();
                h1Var5.j().Z0(new AtomicReference());
                h1Var5.j().a1(w0Var.Z.F());
            }
        }
        m8.a();
        if (gVar.f1(null, tf.b0.Q0)) {
            e4Var2.V0();
            if (e4Var2.q1() == 1) {
                z11 = true;
            }
            if (z11) {
                long jIntValue8 = ((Integer) tf.b0.f14601x0.a(null)).intValue();
                long jNextInt8 = new Random().nextInt(5000);
                h1Var5.K.getClass();
                jMax = Math.max(500L, ((jIntValue8 * 1000) + jNextInt8) - SystemClock.elapsedRealtime());
                if (jMax > 500) {
                    h1.g(q0Var2);
                    bVar3.c(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                }
                h1.f(i2Var);
                i2Var.V0();
                if (i2Var.M == null) {
                    i2Var.M = new y1(i2Var, h1Var4, 0);
                }
                i2Var.M.b(jMax);
            }
        }
        w0Var.P.b(true);
    }

    private final void b() {
        xf.l lVar = (xf.l) this.C;
        synchronized (lVar.C) {
            try {
                xf.d dVar = (xf.d) lVar.D;
                if (dVar != null) {
                    Exception excJ = ((Task) this.B).j();
                    com.google.android.gms.common.internal.d0.h(excJ);
                    dVar.onFailure(excJ);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        com.google.android.gms.common.internal.m mVar;
        com.google.android.gms.common.internal.m r0Var;
        Long lValueOf;
        int i10 = 0;
        int i11 = 1;
        Throwable th2 = null;
        th2 = null;
        switch (this.A) {
            case 0:
                q qVar = (q) this.C;
                Future future = (Future) this.B;
                if (future instanceof lh.a) {
                    l lVar = (l) ((lh.a) future);
                    if (lVar instanceof g) {
                        Object obj = lVar.A;
                        if (obj instanceof b) {
                            th2 = ((b) obj).f9664a;
                        }
                    } else {
                        lVar.getClass();
                    }
                    if (th2 != null) {
                        qVar.h0(th2);
                        return;
                    }
                }
                try {
                    qVar.onSuccess(b5.u(future));
                    return;
                } catch (ExecutionException e3) {
                    qVar.h0(e3.getCause());
                    return;
                } catch (Throwable th3) {
                    qVar.h0(th3);
                    return;
                }
            case 1:
                a40.k kVar = (a40.k) this.C;
                v vVar = (v) this.B;
                if (vVar.isCancelled()) {
                    kVar.h((Throwable) null);
                    return;
                }
                while (true) {
                    try {
                        try {
                            Object obj2 = vVar.get();
                            if (i10 != 0) {
                                Thread.currentThread().interrupt();
                            }
                            kVar.resumeWith(obj2);
                            return;
                        } catch (ExecutionException e10) {
                            Throwable cause = e10.getCause();
                            kotlin.jvm.internal.m.b(cause);
                            kVar.resumeWith(ri.t1.s(cause));
                            return;
                        }
                    } catch (InterruptedException unused) {
                        i10 = 1;
                    } catch (Throwable th4) {
                        if (i10 == 0) {
                            throw th4;
                        }
                        Thread.currentThread().interrupt();
                        throw th4;
                    }
                }
                break;
            case 2:
                ba.h hVar = (ba.h) this.C;
                ArrayList<ba.f> arrayList = (ArrayList) this.B;
                for (ba.f fVar : arrayList) {
                    ArrayList arrayList2 = hVar.f2307r;
                    long j9 = hVar.f2352f;
                    f1 f1Var = fVar.f2268a;
                    View view = f1Var == null ? null : f1Var.f2275a;
                    f1 f1Var2 = fVar.f2269b;
                    View view2 = f1Var2 != null ? f1Var2.f2275a : null;
                    if (view != null) {
                        ViewPropertyAnimator duration = view.animate().setDuration(j9);
                        arrayList2.add(fVar.f2268a);
                        duration.translationX(fVar.f2272e - fVar.f2270c);
                        duration.translationY(fVar.f2273f - fVar.f2271d);
                        duration.alpha(0.0f).setListener(new ba.e(hVar, fVar, duration, view, 0)).start();
                    }
                    if (view2 != null) {
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                        arrayList2.add(fVar.f2269b);
                        viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(j9).alpha(1.0f).setListener(new ba.e(hVar, fVar, viewPropertyAnimatorAnimate, view2, 1)).start();
                    }
                }
                arrayList.clear();
                hVar.f2303n.remove(arrayList);
                return;
            case 3:
                za.v vVarD = za.v.d();
                String str = bb.a.f2472e;
                StringBuilder sb2 = new StringBuilder("Scheduling work ");
                hb.p pVar = (hb.p) this.B;
                sb2.append(pVar.f7004a);
                vVarD.a(str, sb2.toString());
                ((bb.a) this.C).f2473a.a(pVar);
                return;
            case 4:
                pe.b bVar = (pe.b) this.B;
                a2.o oVar = (a2.o) this.C;
                com.google.android.gms.common.api.internal.h hVar2 = (com.google.android.gms.common.api.internal.h) oVar.F;
                com.google.android.gms.common.api.g gVar = (com.google.android.gms.common.api.g) oVar.A;
                com.google.android.gms.common.api.internal.z zVar = (com.google.android.gms.common.api.internal.z) hVar2.J.get((com.google.android.gms.common.api.internal.a) oVar.B);
                if (zVar == null) {
                    return;
                }
                if (bVar.B != 0) {
                    zVar.o(bVar, null);
                    return;
                }
                oVar.C = true;
                if (gVar.requiresSignIn()) {
                    if (!oVar.C || (mVar = (com.google.android.gms.common.internal.m) oVar.D) == null) {
                        return;
                    }
                    gVar.getRemoteService(mVar, (Set) oVar.E);
                    return;
                }
                try {
                    gVar.getRemoteService(null, gVar.getScopesForConnectionlessNonSignIn());
                    return;
                } catch (SecurityException e11) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e11);
                    gVar.disconnect("Failed to get service from broker.");
                    zVar.o(new pe.b(10, null, null), null);
                    return;
                }
            case 5:
                n0 n0Var = (n0) this.C;
                vf.h hVar3 = (vf.h) this.B;
                n0Var.getClass();
                pe.b bVar2 = hVar3.B;
                if (bVar2.B == 0) {
                    com.google.android.gms.common.internal.x xVar = hVar3.C;
                    com.google.android.gms.common.internal.d0.h(xVar);
                    pe.b bVar3 = xVar.C;
                    if (bVar3.B != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(bVar3)), new Exception());
                        n0Var.f3208k.g(bVar3);
                        n0Var.f3207j.disconnect();
                        return;
                    }
                    a2.o oVar2 = n0Var.f3208k;
                    IBinder iBinder = xVar.B;
                    if (iBinder == null) {
                        r0Var = null;
                    } else {
                        int i12 = com.google.android.gms.common.internal.a.f3258f;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        r0Var = iInterfaceQueryLocalInterface instanceof com.google.android.gms.common.internal.m ? (com.google.android.gms.common.internal.m) iInterfaceQueryLocalInterface : new r0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 4);
                    }
                    Set set = n0Var.f3205h;
                    oVar2.getClass();
                    if (r0Var == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        oVar2.g(new pe.b(4, null, null));
                    } else {
                        oVar2.D = r0Var;
                        oVar2.E = set;
                        if (oVar2.C) {
                            ((com.google.android.gms.common.api.g) oVar2.A).getRemoteService(r0Var, set);
                        }
                    }
                } else {
                    n0Var.f3208k.g(bVar2);
                }
                n0Var.f3207j.disconnect();
                return;
            case 6:
                com.google.android.gms.common.api.internal.v vVar2 = (com.google.android.gms.common.api.internal.v) this.B;
                c50.h hVar4 = (c50.h) this.C;
                if (hVar4.B > 0) {
                    Bundle bundle = (Bundle) hVar4.D;
                    vVar2.b(bundle != null ? bundle.getBundle("ConnectionlessLifecycleHelper") : null);
                }
                if (hVar4.B >= 2) {
                    vVar2.B = true;
                    vVar2.d();
                }
                if (hVar4.B >= 3) {
                    vVar2.d();
                }
                if (hVar4.B >= 4) {
                    vVar2.c();
                    return;
                }
                return;
            case 7:
                f40.f fVar2 = (f40.f) this.C;
                while (true) {
                    try {
                        ((Runnable) this.B).run();
                    } catch (Throwable th5) {
                        a40.c0.t(th5, k00.j.A);
                    }
                    Runnable runnableR0 = fVar2.r0();
                    if (runnableR0 == null) {
                        return;
                    }
                    this.B = runnableR0;
                    i10++;
                    if (i10 >= 16 && f40.a.j(fVar2.D, fVar2)) {
                        f40.a.i(fVar2.D, fVar2, this);
                        return;
                    }
                    break;
                }
                break;
            case 8:
                try {
                    ((Runnable) this.C).run();
                    synchronized (((ca.z) this.B).E) {
                        ((ca.z) this.B).a();
                        break;
                    }
                    return;
                } catch (Throwable th6) {
                    synchronized (((ca.z) this.B).E) {
                        ((ca.z) this.B).a();
                        throw th6;
                    }
                }
            case 9:
                qd.s0.j0((l60.u) this.B).resumeWith(ri.t1.s((Throwable) this.C));
                return;
            case 10:
                IBinder binder = ((Messenger) ((l9.h) this.B).f10149a).getBinder();
                l9.l lVar2 = (l9.l) ((k9.m1) ((l9.h) this.C).f10149a).E.remove(binder);
                if (lVar2 != null) {
                    binder.unlinkToDeath(lVar2, 0);
                    return;
                }
                return;
            case 11:
                oe.m mVar2 = (oe.m) this.B;
                int i13 = ((oe.n) this.C).f11950a;
                synchronized (mVar2) {
                    oe.n nVar = (oe.n) mVar2.E.get(i13);
                    if (nVar != null) {
                        Log.w("MessengerIpcClient", "Timing out request: " + i13);
                        mVar2.E.remove(i13);
                        nVar.b(new zzt("Timed out waiting for response", null));
                        mVar2.c();
                    }
                    break;
                }
                return;
            case 12:
                qd.b bVar4 = (qd.b) this.B;
                qd.h hVar5 = (qd.h) this.C;
                if (((qd.u) bVar4.f12844f.f9188c) != null) {
                    ((qd.u) bVar4.f12844f.f9188c).onPurchasesUpdated(hVar5, null);
                    return;
                } else {
                    com.google.android.gms.internal.play_billing.q.h("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 13:
                qd.b bVar5 = (qd.b) this.B;
                com.revenuecat.purchases.google.usecase.b bVar6 = (com.revenuecat.purchases.google.usecase.b) this.C;
                qd.h hVar6 = o0.f12935k;
                bVar5.x(24, 13, hVar6);
                bVar6.a(hVar6, (qd.d) null);
                return;
            case 14:
                qd.b bVar7 = (qd.b) this.B;
                com.revenuecat.purchases.google.usecase.c cVar = (com.revenuecat.purchases.google.usecase.c) this.C;
                qd.h hVar7 = o0.f12935k;
                bVar7.x(24, 7, hVar7);
                com.google.android.gms.internal.play_billing.o oVar3 = com.google.android.gms.internal.play_billing.r.B;
                com.google.android.gms.internal.play_billing.v vVar3 = com.google.android.gms.internal.play_billing.v.E;
                cVar.b(hVar7, new qd.x(vVar3, vVar3));
                return;
            case 15:
                x0 x0Var = (x0) this.C;
                h1 h1Var = x0Var.B.f14764b;
                e1 e1Var = h1Var.G;
                h1.g(e1Var);
                e1Var.V0();
                Bundle bundle2 = new Bundle();
                bundle2.putString("package_name", x0Var.A);
                try {
                    com.google.android.gms.internal.measurement.a0 a0Var = (com.google.android.gms.internal.measurement.a0) ((com.google.android.gms.internal.measurement.c0) this.B);
                    Parcel parcelI2 = a0Var.i2();
                    com.google.android.gms.internal.measurement.z.b(parcelI2, bundle2);
                    Parcel parcelH2 = a0Var.h2(1, parcelI2);
                    Bundle bundle3 = (Bundle) com.google.android.gms.internal.measurement.z.a(parcelH2, Bundle.CREATOR);
                    parcelH2.recycle();
                    if (bundle3 == null) {
                        q0 q0Var = h1Var.F;
                        h1.g(q0Var);
                        q0Var.G.b("Install Referrer Service returned a null response");
                    }
                    break;
                } catch (Exception e12) {
                    q0 q0Var2 = h1Var.F;
                    h1.g(q0Var2);
                    q0Var2.G.c(e12.getMessage(), "Exception occurred while retrieving the Install Referrer");
                }
                e1 e1Var2 = h1Var.G;
                h1.g(e1Var2);
                e1Var2.V0();
                throw new IllegalStateException("Unexpected call on client side");
            case 16:
                a();
                return;
            case 17:
                l0 l0Var = (l0) this.B;
                i2 i2Var = (i2) this.C;
                h1 h1Var2 = (h1) i2Var.B;
                h1 h1Var3 = (h1) i2Var.B;
                j3 j3Var = h1Var2.H;
                h1.f(j3Var);
                h1 h1Var4 = (h1) j3Var.B;
                w0 w0Var = h1Var4.E;
                h1.e(w0Var);
                if (w0Var.c1().i(s1.ANALYTICS_STORAGE)) {
                    h1.e(w0Var);
                    m1 m1Var = w0Var.R;
                    h1Var4.K.getClass();
                    if (!w0Var.f1(System.currentTimeMillis()) && m1Var.e() != 0) {
                        lValueOf = Long.valueOf(m1Var.e());
                    }
                    if (lValueOf == null) {
                        e4 e4Var = h1Var3.I;
                        h1.e(e4Var);
                        e4Var.E1(l0Var, lValueOf.longValue());
                        return;
                    } else {
                        try {
                            l0Var.q1(null);
                            return;
                        } catch (RemoteException e13) {
                            q0 q0Var3 = h1Var3.F;
                            h1.g(q0Var3);
                            q0Var3.G.c(e13, "getSessionId failed with exception");
                            return;
                        }
                    }
                }
                q0 q0Var4 = h1Var4.F;
                h1.g(q0Var4);
                q0Var4.L.b("Analytics storage consent denied; will not get session id");
                lValueOf = null;
                if (lValueOf == null) {
                    l0Var.q1(null);
                    return;
                }
                e4 e4Var2 = h1Var3.I;
                h1.e(e4Var2);
                e4Var2.E1(l0Var, lValueOf.longValue());
                return;
            case TYPE_SINT64_VALUE:
                i2 i2Var2 = (i2) this.C;
                h1 h1Var5 = (h1) i2Var2.B;
                w0 w0Var2 = h1Var5.E;
                q0 q0Var5 = h1Var5.F;
                h1.e(w0Var2);
                w0Var2.V0();
                w0Var2.V0();
                tf.o oVarB = tf.o.b(w0Var2.Z0().getString("dma_consent_settings", null));
                tf.o oVar4 = (tf.o) this.B;
                int i14 = oVar4.f14677a;
                if (!t1.l(i14, oVarB.f14677a)) {
                    h1.g(q0Var5);
                    q0Var5.M.c(Integer.valueOf(i14), "Lower precedence consent source ignored, proposed source");
                    return;
                }
                SharedPreferences.Editor editorEdit = w0Var2.Z0().edit();
                editorEdit.putString("dma_consent_settings", oVar4.f14678b);
                editorEdit.apply();
                h1.g(q0Var5);
                q0Var5.O.c(oVar4, "Setting DMA consent(FE)");
                h1 h1Var6 = (h1) i2Var2.B;
                if (h1Var6.j().f1()) {
                    c3 c3VarJ = h1Var6.j();
                    c3VarJ.V0();
                    c3VarJ.W0();
                    c3VarJ.j1(new a3(c3VarJ, i11));
                    return;
                }
                c3 c3VarJ2 = h1Var6.j();
                c3VarJ2.V0();
                c3VarJ2.W0();
                if (c3VarJ2.e1()) {
                    c3VarJ2.j1(new y2(c3VarJ2, c3VarJ2.l1(false), 1));
                    return;
                }
                return;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                c3 c3Var = (c3) this.C;
                e0 e0Var = c3Var.E;
                h1 h1Var7 = (h1) c3Var.B;
                if (e0Var == null) {
                    q0 q0Var6 = h1Var7.F;
                    h1.g(q0Var6);
                    q0Var6.G.b("Failed to send current screen to service");
                    return;
                }
                try {
                    q2 q2Var = (q2) this.B;
                    if (q2Var == null) {
                        e0Var.S1(null, null, 0L, h1Var7.A.getPackageName());
                    } else {
                        e0Var.S1(q2Var.f14694a, q2Var.f14695b, q2Var.f14696c, h1Var7.A.getPackageName());
                    }
                    c3Var.i1();
                    return;
                } catch (RemoteException e14) {
                    q0 q0Var7 = h1Var7.F;
                    h1.g(q0Var7);
                    q0Var7.G.c(e14, "Failed to send current screen to the service");
                    return;
                }
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                ((b3) this.C).C.g1((ComponentName) this.B);
                return;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                b3 b3Var = (b3) this.C;
                synchronized (b3Var) {
                    try {
                        b3Var.A = false;
                        c3 c3Var2 = b3Var.C;
                        if (!c3Var2.m1()) {
                            q0 q0Var8 = ((h1) c3Var2.B).F;
                            h1.g(q0Var8);
                            q0Var8.N.b("Connected to remote service");
                            e0 e0Var2 = (e0) this.B;
                            c3Var2.V0();
                            com.google.android.gms.common.internal.d0.h(e0Var2);
                            c3Var2.E = e0Var2;
                            c3Var2.i1();
                            c3Var2.k1();
                        }
                    } catch (Throwable th7) {
                        throw th7;
                    }
                    break;
                }
                c3 c3Var3 = ((b3) this.C).C;
                ScheduledExecutorService scheduledExecutorService = c3Var3.H;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    c3Var3.H = null;
                    return;
                }
                return;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                y3 y3Var = (y3) this.B;
                y3Var.x();
                Runnable runnable = (Runnable) this.C;
                y3Var.C().V0();
                if (y3Var.P == null) {
                    y3Var.P = new ArrayList();
                }
                y3Var.P.add(runnable);
                y3Var.l();
                return;
            case 23:
                a40.k kVar2 = (a40.k) this.B;
                try {
                    kVar2.resumeWith(((k9.v) this.C).get());
                    return;
                } catch (Exception e15) {
                    kVar2.resumeWith(ri.t1.s(e15));
                    return;
                }
            case 24:
                ((h0) this.B).accept(this.C);
                return;
            case 25:
                xf.j jVar = (xf.j) this.C;
                try {
                    Task task = (Task) jVar.C.M((Task) this.B);
                    if (task == null) {
                        jVar.onFailure(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    fi.d dVar = xf.h.f16567b;
                    task.f(dVar, jVar);
                    task.d(dVar, jVar);
                    task.a(dVar, jVar);
                    return;
                } catch (RuntimeExecutionException e16) {
                    if (e16.getCause() instanceof Exception) {
                        jVar.D.s((Exception) e16.getCause());
                        return;
                    } else {
                        jVar.D.s(e16);
                        return;
                    }
                } catch (Exception e17) {
                    jVar.D.s(e17);
                    return;
                }
            case RuntimeVersion.MINOR:
                b();
                return;
            default:
                xf.l lVar3 = (xf.l) this.C;
                try {
                    Task taskK = ((xf.f) lVar3.C).k(((Task) this.B).k());
                    if (taskK == null) {
                        lVar3.onFailure(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    fi.d dVar2 = xf.h.f16567b;
                    taskK.f(dVar2, lVar3);
                    taskK.d(dVar2, lVar3);
                    taskK.a(dVar2, lVar3);
                    return;
                } catch (RuntimeExecutionException e18) {
                    if (e18.getCause() instanceof Exception) {
                        lVar3.onFailure((Exception) e18.getCause());
                        return;
                    } else {
                        lVar3.onFailure(e18);
                        return;
                    }
                } catch (CancellationException unused2) {
                    lVar3.f();
                    return;
                } catch (Exception e19) {
                    lVar3.onFailure(e19);
                    return;
                }
        }
    }

    public String toString() {
        switch (this.A) {
            case 0:
                a1.i iVar = new a1.i(r.class.getSimpleName(), 14);
                q qVar = (q) this.C;
                u0 u0Var = new u0(24, false);
                ((u0) iVar.D).B = u0Var;
                iVar.D = u0Var;
                u0Var.C = qVar;
                return iVar.toString();
            default:
                return super.toString();
        }
    }
}
