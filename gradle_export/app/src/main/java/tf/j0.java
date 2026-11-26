package tf;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.ext.SdkExtensions;
import com.google.android.gms.internal.measurement.m8;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
import java.util.Locale;

public final class j0 extends d0 {
    public String D;
    public String E;
    public int F;
    public String G;
    public String H;
    public long I;
    public final long J;
    public final long K;
    public List L;
    public String M;
    public int N;
    public String O;
    public String P;
    public long Q;
    public String R;

    public j0(h1 h1Var, long j9, long j10) {
        super(h1Var);
        this.Q = 0L;
        this.R = null;
        this.J = j9;
        this.K = j10;
    }

    @Override
    public final boolean Y0() {
        return true;
    }

    public final g4 Z0(String str) {
        String str2;
        long j9;
        boolean z10;
        long j10;
        boolean zA;
        boolean z11;
        boolean z12;
        String str3;
        Class<?> clsLoadClass;
        Object objInvoke;
        long jMin;
        long jE;
        Boolean boolH1;
        boolean z13;
        boolean z14;
        boolean z15;
        String str4;
        Boolean boolH2;
        boolean zBooleanValue;
        h1 h1Var;
        String strB1;
        long j11;
        int i10;
        int i11;
        long j12;
        ApplicationInfo applicationInfoA;
        int i12;
        a0 a0Var;
        int i13;
        V0();
        String strB2 = b1();
        String strC1 = c1();
        W0();
        String str5 = this.E;
        W0();
        long j13 = this.F;
        W0();
        com.google.android.gms.common.internal.d0.h(this.G);
        String str6 = this.G;
        h1 h1Var2 = (h1) this.B;
        g gVar = h1Var2.D;
        q0 q0Var = h1Var2.F;
        g gVar2 = h1Var2.D;
        Context context = h1Var2.A;
        e4 e4Var = h1Var2.I;
        w0 w0Var = h1Var2.E;
        gVar.a1();
        W0();
        V0();
        long j14 = this.I;
        long jQ1 = 0;
        if (j14 == 0) {
            h1.e(e4Var);
            h1 h1Var3 = (h1) e4Var.B;
            String packageName = context.getPackageName();
            e4Var.V0();
            com.google.android.gms.common.internal.d0.e(packageName);
            PackageManager packageManager = context.getPackageManager();
            z10 = false;
            MessageDigest messageDigestM1 = e4.m1();
            long jN1 = -1;
            if (messageDigestM1 == null) {
                q0 q0Var2 = h1Var3.F;
                h1.g(q0Var2);
                q0Var2.G.b("Could not get MD5 instance");
                str2 = str5;
                j9 = j13;
            } else {
                if (packageManager != null) {
                    try {
                        if (e4Var.y1(context, packageName)) {
                            str2 = str5;
                            j9 = j13;
                            jN1 = 0;
                        } else {
                            str2 = str5;
                            try {
                                j9 = j13;
                                try {
                                    Signature[] signatureArr = xe.b.a(context).b(64, h1Var3.A.getPackageName()).signatures;
                                    if (signatureArr == null || signatureArr.length <= 0) {
                                        q0 q0Var3 = h1Var3.F;
                                        h1.g(q0Var3);
                                        q0Var3.J.b("Could not get signatures");
                                    } else {
                                        jN1 = e4.n1(messageDigestM1.digest(signatureArr[0].toByteArray()));
                                    }
                                } catch (PackageManager.NameNotFoundException e3) {
                                    e = e3;
                                    q0 q0Var4 = h1Var3.F;
                                    h1.g(q0Var4);
                                    q0Var4.G.c(e, "Package name not found");
                                    j10 = 0;
                                }
                            } catch (PackageManager.NameNotFoundException e10) {
                                e = e10;
                                j9 = j13;
                                q0 q0Var5 = h1Var3.F;
                                h1.g(q0Var5);
                                q0Var5.G.c(e, "Package name not found");
                                j10 = 0;
                                this.I = j10;
                                zA = h1Var2.a();
                                h1.e(w0Var);
                                z11 = !w0Var.S;
                                V0();
                                if (h1Var2.a()) {
                                    if (gVar2.f1(null, b0.H0)) {
                                        h1.g(q0Var);
                                        q0Var.O.b("Disabled IID for tests.");
                                        z12 = zA;
                                        str3 = null;
                                    } else {
                                        try {
                                            clsLoadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                                            if (clsLoadClass == null) {
                                                z12 = zA;
                                            } else {
                                                z12 = zA;
                                                try {
                                                    Object[] objArr = {context};
                                                    str3 = null;
                                                    objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, objArr);
                                                    if (objInvoke != null) {
                                                        try {
                                                            str3 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                                                        } catch (Exception unused) {
                                                            h1.g(q0Var);
                                                            q0Var.L.b("Failed to retrieve Firebase Instance Id");
                                                            str3 = null;
                                                        }
                                                    }
                                                } catch (Exception unused2) {
                                                    h1.g(q0Var);
                                                    q0Var.K.b("Failed to obtain Firebase Analytics instance");
                                                }
                                            }
                                        } catch (ClassNotFoundException unused3) {
                                        }
                                        str3 = null;
                                    }
                                } else {
                                    z12 = zA;
                                    str3 = null;
                                }
                                jMin = h1Var2.f14628d0;
                                h1.e(w0Var);
                                long j15 = j10;
                                jE = w0Var.G.e();
                                if (jE != 0) {
                                    jMin = Math.min(jMin, jE);
                                }
                                W0();
                                int i14 = this.N;
                                boolH1 = gVar2.h1("google_analytics_adid_collection_enabled");
                                if (boolH1 != null) {
                                    z13 = true;
                                } else {
                                    z13 = true;
                                }
                                h1.e(w0Var);
                                w0Var.V0();
                                boolean z16 = z13;
                                boolean z17 = w0Var.Z0().getBoolean("deferred_analytics_collection", z10);
                                if (gVar2.k1("google_analytics_default_allow_ad_personalization_signals", true) != q1.GRANTED) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                Boolean boolValueOf = Boolean.valueOf(z14);
                                List list = this.L;
                                String strG = w0Var.c1().g();
                                if (this.M == null) {
                                    h1.e(e4Var);
                                    this.M = e4Var.N1();
                                }
                                String str7 = this.M;
                                if (w0Var.c1().i(s1.ANALYTICS_STORAGE)) {
                                    V0();
                                    if (this.Q == 0) {
                                        z15 = z11;
                                    } else {
                                        h1Var2.K.getClass();
                                        long jCurrentTimeMillis = System.currentTimeMillis() - this.Q;
                                        z15 = z11;
                                        if (this.P != null) {
                                            a1();
                                        }
                                    }
                                    if (this.P == null) {
                                        a1();
                                    }
                                    str4 = this.P;
                                } else {
                                    z15 = z11;
                                    str4 = null;
                                }
                                boolH2 = gVar2.h1("google_analytics_sgtm_upload_enabled");
                                if (boolH2 == null) {
                                    zBooleanValue = false;
                                } else {
                                    zBooleanValue = boolH2.booleanValue();
                                }
                                h1.e(e4Var);
                                h1Var = (h1) e4Var.B;
                                String str8 = str4;
                                strB1 = b1();
                                boolean z18 = zBooleanValue;
                                if (h1Var.A.getPackageManager() == null) {
                                    j11 = jMin;
                                    j12 = 0;
                                } else {
                                    try {
                                        j11 = jMin;
                                        i10 = 0;
                                        try {
                                            applicationInfoA = xe.b.a(h1Var.A).a(0, strB1);
                                            if (applicationInfoA != null) {
                                                i11 = applicationInfoA.targetSdkVersion;
                                            } else {
                                                i11 = i10;
                                            }
                                        } catch (PackageManager.NameNotFoundException unused4) {
                                            q0 q0Var6 = h1Var.F;
                                            h1.g(q0Var6);
                                            q0Var6.M.c(strB1, "PackageManager failed to find running app: app_id");
                                        }
                                    } catch (PackageManager.NameNotFoundException unused5) {
                                        j11 = jMin;
                                        i10 = 0;
                                    }
                                    j12 = i11;
                                }
                                h1.e(w0Var);
                                i12 = w0Var.c1().f14702b;
                                h1.e(w0Var);
                                w0Var.V0();
                                String str9 = o.b(w0Var.Z0().getString("dma_consent_settings", null)).f14678b;
                                m8.a();
                                a0Var = b0.Q0;
                                if (gVar2.f1(null, a0Var)) {
                                    h1.e(e4Var);
                                    i13 = i12;
                                    int extensionVersion = SdkExtensions.getExtensionVersion(30) > 3 ? SdkExtensions.getExtensionVersion(1000000) : 0;
                                    m8.a();
                                    if (gVar2.f1(null, a0Var)) {
                                        h1.e(e4Var);
                                        jQ1 = e4Var.q1();
                                    }
                                    String str10 = gVar2.D;
                                    String strValueOf = String.valueOf(t1.h(gVar2.k1("google_analytics_default_allow_ad_personalization_signals", true)));
                                    long j16 = h1Var2.f14628d0;
                                    h1.d(h1Var2.U);
                                    return new g4(strB2, strC1, str2, j9, str6, 133005L, j15, str, z12, z15, str3, j11, i14, z16, z17, boolValueOf, this.J, list, strG, str7, str8, z18, j12, i13, str9, extensionVersion, jQ1, str10, strValueOf, j16, a1.b.c(h1Var2.U.a1()));
                                }
                                i13 = i12;
                                m8.a();
                                if (gVar2.f1(null, a0Var)) {
                                    h1.e(e4Var);
                                    jQ1 = e4Var.q1();
                                }
                                String str11 = gVar2.D;
                                String strValueOf2 = String.valueOf(t1.h(gVar2.k1("google_analytics_default_allow_ad_personalization_signals", true)));
                                long j17 = h1Var2.f14628d0;
                                h1.d(h1Var2.U);
                                return new g4(strB2, strC1, str2, j9, str6, 133005L, j15, str, z12, z15, str3, j11, i14, z16, z17, boolValueOf, this.J, list, strG, str7, str8, z18, j12, i13, str9, extensionVersion, jQ1, str11, strValueOf2, j17, a1.b.c(h1Var2.U.a1()));
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e11) {
                        e = e11;
                        str2 = str5;
                    }
                } else {
                    str2 = str5;
                    j9 = j13;
                }
                j10 = 0;
                this.I = j10;
            }
            j10 = jN1;
            this.I = j10;
        } else {
            str2 = str5;
            j9 = j13;
            z10 = false;
            j10 = j14;
        }
        zA = h1Var2.a();
        h1.e(w0Var);
        z11 = !w0Var.S;
        V0();
        if (h1Var2.a()) {
            z12 = zA;
            str3 = null;
        } else {
            if (gVar2.f1(null, b0.H0)) {
                h1.g(q0Var);
                q0Var.O.b("Disabled IID for tests.");
                z12 = zA;
                str3 = null;
            } else {
                clsLoadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                if (clsLoadClass == null) {
                    z12 = zA;
                } else {
                    z12 = zA;
                    Object[] objArr2 = {context};
                    str3 = null;
                    objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, objArr2);
                    if (objInvoke != null) {
                        str3 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                    }
                }
                str3 = null;
            }
        }
        jMin = h1Var2.f14628d0;
        h1.e(w0Var);
        long j18 = j10;
        jE = w0Var.G.e();
        if (jE != 0) {
            jMin = Math.min(jMin, jE);
        }
        W0();
        int i15 = this.N;
        boolH1 = gVar2.h1("google_analytics_adid_collection_enabled");
        if (boolH1 != null || boolH1.booleanValue()) {
            z13 = true;
        } else {
            z13 = z10;
        }
        h1.e(w0Var);
        w0Var.V0();
        boolean z19 = z13;
        boolean z110 = w0Var.Z0().getBoolean("deferred_analytics_collection", z10);
        if (gVar2.k1("google_analytics_default_allow_ad_personalization_signals", true) != q1.GRANTED) {
            z14 = true;
        } else {
            z14 = false;
        }
        Boolean boolValueOf2 = Boolean.valueOf(z14);
        List list2 = this.L;
        String strG2 = w0Var.c1().g();
        if (this.M == null) {
            h1.e(e4Var);
            this.M = e4Var.N1();
        }
        String str12 = this.M;
        if (w0Var.c1().i(s1.ANALYTICS_STORAGE)) {
            z15 = z11;
            str4 = null;
        } else {
            V0();
            if (this.Q == 0) {
                z15 = z11;
            } else {
                h1Var2.K.getClass();
                long jCurrentTimeMillis2 = System.currentTimeMillis() - this.Q;
                z15 = z11;
                if (this.P != null && jCurrentTimeMillis2 > 86400000 && this.R == null) {
                    a1();
                }
            }
            if (this.P == null) {
                a1();
            }
            str4 = this.P;
        }
        boolH2 = gVar2.h1("google_analytics_sgtm_upload_enabled");
        if (boolH2 == null) {
            zBooleanValue = false;
        } else {
            zBooleanValue = boolH2.booleanValue();
        }
        h1.e(e4Var);
        h1Var = (h1) e4Var.B;
        String str13 = str4;
        strB1 = b1();
        boolean z111 = zBooleanValue;
        if (h1Var.A.getPackageManager() == null) {
            j11 = jMin;
            j12 = 0;
        } else {
            j11 = jMin;
            i10 = 0;
            applicationInfoA = xe.b.a(h1Var.A).a(0, strB1);
            if (applicationInfoA != null) {
                i11 = applicationInfoA.targetSdkVersion;
            } else {
                i11 = i10;
            }
            j12 = i11;
        }
        h1.e(w0Var);
        i12 = w0Var.c1().f14702b;
        h1.e(w0Var);
        w0Var.V0();
        String str14 = o.b(w0Var.Z0().getString("dma_consent_settings", null)).f14678b;
        m8.a();
        a0Var = b0.Q0;
        if (gVar2.f1(null, a0Var)) {
            h1.e(e4Var);
            i13 = i12;
            if (SdkExtensions.getExtensionVersion(30) > 3) {
            }
            m8.a();
            if (gVar2.f1(null, a0Var)) {
                h1.e(e4Var);
                jQ1 = e4Var.q1();
            }
            String str15 = gVar2.D;
            String strValueOf3 = String.valueOf(t1.h(gVar2.k1("google_analytics_default_allow_ad_personalization_signals", true)));
            long j19 = h1Var2.f14628d0;
            h1.d(h1Var2.U);
            return new g4(strB2, strC1, str2, j9, str6, 133005L, j18, str, z12, z15, str3, j11, i15, z19, z110, boolValueOf2, this.J, list2, strG2, str12, str13, z111, j12, i13, str14, extensionVersion, jQ1, str15, strValueOf3, j19, a1.b.c(h1Var2.U.a1()));
        }
        i13 = i12;
        m8.a();
        if (gVar2.f1(null, a0Var)) {
            h1.e(e4Var);
            jQ1 = e4Var.q1();
        }
        String str16 = gVar2.D;
        String strValueOf4 = String.valueOf(t1.h(gVar2.k1("google_analytics_default_allow_ad_personalization_signals", true)));
        long j110 = h1Var2.f14628d0;
        h1.d(h1Var2.U);
        return new g4(strB2, strC1, str2, j9, str6, 133005L, j18, str, z12, z15, str3, j11, i15, z19, z110, boolValueOf2, this.J, list2, strG2, str12, str13, z111, j12, i13, str14, extensionVersion, jQ1, str16, strValueOf4, j110, a1.b.c(h1Var2.U.a1()));
    }

    public final void a1() {
        String str;
        V0();
        h1 h1Var = (h1) this.B;
        w0 w0Var = h1Var.E;
        q0 q0Var = h1Var.F;
        h1.e(w0Var);
        if (w0Var.c1().i(s1.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            e4 e4Var = h1Var.I;
            h1.e(e4Var);
            e4Var.S1().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            h1.g(q0Var);
            q0Var.N.b("Analytics Storage consent is not granted");
            str = null;
        }
        h1.g(q0Var);
        q0Var.N.b("Resetting session stitching token to ".concat(str == null ? "null" : "not null"));
        this.P = str;
        h1Var.K.getClass();
        this.Q = System.currentTimeMillis();
    }

    public final String b1() {
        W0();
        com.google.android.gms.common.internal.d0.h(this.D);
        return this.D;
    }

    public final String c1() {
        V0();
        W0();
        com.google.android.gms.common.internal.d0.h(this.O);
        return this.O;
    }
}
