package tf;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.protobuf.RuntimeVersion;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Objects;

public final class y1 extends n {

    public final int f14765e;

    public final i2 f14766f;

    public y1(i2 i2Var, p1 p1Var, int i10) {
        super(p1Var);
        this.f14765e = i10;
        switch (i10) {
            case 1:
                Objects.requireNonNull(i2Var);
                this.f14766f = i2Var;
                super(p1Var);
                break;
            case 2:
                Objects.requireNonNull(i2Var);
                this.f14766f = i2Var;
                super(p1Var);
                break;
            case 3:
                this.f14766f = i2Var;
                super(p1Var);
                break;
            default:
                Objects.requireNonNull(i2Var);
                this.f14766f = i2Var;
                break;
        }
    }

    @Override
    public final void a() {
        Pair pair;
        NetworkInfo activeNetworkInfo;
        c3 c3VarJ;
        h1 h1Var;
        e0 e0Var;
        i iVarA;
        Bundle bundle;
        String str;
        Boolean bool;
        int iOrdinal;
        int i10;
        String str2;
        String string;
        h1 h1Var2;
        URL url;
        String strConcat;
        switch (this.f14765e) {
            case 0:
                i2 i2Var = ((h1) this.f14766f.B).M;
                h1.f(i2Var);
                new Thread(new x1(i2Var, 0)).start();
                break;
            case 1:
                this.f14766f.u1();
                break;
            case 2:
                this.f14766f.b1();
                break;
            default:
                i2 i2Var2 = this.f14766f;
                h1 h1Var3 = (h1) i2Var2.B;
                w0 w0Var = h1Var3.E;
                q0 q0Var = h1Var3.F;
                e1 e1Var = h1Var3.G;
                h1.g(e1Var);
                e1Var.V0();
                m2 m2Var = h1Var3.O;
                h1.g(m2Var);
                h1 h1Var4 = (h1) m2Var.B;
                h1.g(m2Var);
                String strB1 = h1Var3.l().b1();
                Boolean boolH1 = h1Var3.D.h1("google_analytics_adid_collection_enabled");
                boolean z10 = false;
                if (boolH1 == null || boolH1.booleanValue()) {
                    h1.e(w0Var);
                    h1 h1Var5 = (h1) w0Var.B;
                    w0Var.V0();
                    if (w0Var.c1().i(s1.AD_STORAGE)) {
                        h1Var5.K.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        String str3 = w0Var.I;
                        if (str3 == null || jElapsedRealtime >= w0Var.K) {
                            w0Var.K = h1Var5.D.c1(strB1, b0.f14548b) + jElapsedRealtime;
                            try {
                                ie.a aVarA = ie.b.a(h1Var5.A);
                                w0Var.I = RuntimeVersion.SUFFIX;
                                String str4 = aVarA.f7617a;
                                if (str4 != null) {
                                    w0Var.I = str4;
                                }
                                w0Var.J = aVarA.f7618b;
                            } catch (Exception e3) {
                                q0 q0Var2 = h1Var5.F;
                                h1.g(q0Var2);
                                q0Var2.N.c(e3, "Unable to get advertising id");
                                w0Var.I = RuntimeVersion.SUFFIX;
                            }
                            pair = new Pair(w0Var.I, Boolean.valueOf(w0Var.J));
                        } else {
                            pair = new Pair(str3, Boolean.valueOf(w0Var.J));
                        }
                    } else {
                        pair = new Pair(RuntimeVersion.SUFFIX, Boolean.FALSE);
                    }
                    if (!((Boolean) pair.second).booleanValue() && !TextUtils.isEmpty((CharSequence) pair.first)) {
                        h1.g(m2Var);
                        m2Var.X0();
                        ConnectivityManager connectivityManager = (ConnectivityManager) h1Var4.A.getSystemService("connectivity");
                        if (connectivityManager != null) {
                            try {
                                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                            } catch (SecurityException unused) {
                                activeNetworkInfo = null;
                            }
                        } else {
                            activeNetworkInfo = null;
                        }
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            StringBuilder sb2 = new StringBuilder();
                            c3 c3VarJ2 = h1Var3.j();
                            c3VarJ2.V0();
                            c3VarJ2.W0();
                            if (!c3VarJ2.c1()) {
                                i2 i2Var3 = h1Var3.M;
                                h1.f(i2Var3);
                                h1 h1Var6 = (h1) i2Var3.B;
                                i2Var3.V0();
                                c3VarJ = h1Var6.j();
                                h1Var = (h1) c3VarJ.B;
                                c3VarJ.V0();
                                c3VarJ.W0();
                                e0Var = c3VarJ.E;
                                if (e0Var == null) {
                                    c3VarJ.b1();
                                    q0 q0Var3 = h1Var.F;
                                    h1.g(q0Var3);
                                    q0Var3.N.b("Failed to get consents; not connected to service yet.");
                                } else {
                                    try {
                                        iVarA = e0Var.A(c3VarJ.l1(false));
                                        c3VarJ.i1();
                                    } catch (RemoteException e10) {
                                        q0 q0Var4 = h1Var.F;
                                        h1.g(q0Var4);
                                        q0Var4.G.c(e10, "Failed to get consents; remote exception");
                                        iVarA = null;
                                    }
                                    if (iVarA != null) {
                                        bundle = iVarA.A;
                                    } else {
                                        bundle = null;
                                    }
                                    if (bundle == null) {
                                        i10 = h1Var3.f14626b0;
                                        h1Var3.f14626b0 = i10 + 1;
                                        z10 = i10 < 10;
                                        h1.g(q0Var);
                                        if (i10 < 10) {
                                            str2 = "Retrying.";
                                        } else {
                                            str2 = "Skipping.";
                                        }
                                        q0Var.N.c(Integer.valueOf(h1Var3.f14626b0), w.c.l(new StringBuilder(str2.length() + 60), "Failed to retrieve DMA consent from the service, ", str2, " retryCount"));
                                    } else {
                                        t1 t1VarB = t1.b(100, bundle);
                                        sb2.append("&gcs=");
                                        sb2.append(t1VarB.f());
                                        o oVarC = o.c(100, bundle);
                                        str = oVarC.f14680d;
                                        sb2.append("&dma=");
                                        Boolean bool2 = oVarC.f14679c;
                                        bool = Boolean.FALSE;
                                        sb2.append(!Objects.equals(bool2, bool) ? 1 : 0);
                                        if (!TextUtils.isEmpty(str)) {
                                            sb2.append("&dma_cps=");
                                            sb2.append(str);
                                        }
                                        iOrdinal = t1.d(bundle.getString("ad_personalization")).ordinal();
                                        if (iOrdinal != 2) {
                                            if (iOrdinal != 3) {
                                                bool = null;
                                            } else {
                                                bool = Boolean.TRUE;
                                            }
                                        }
                                        int i11 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                        sb2.append("&npa=");
                                        sb2.append(i11);
                                        h1.g(q0Var);
                                        q0Var.O.c(sb2, "Consent query parameters to Bow");
                                        e4 e4Var = h1Var3.I;
                                        h1.e(e4Var);
                                        ((h1) h1Var3.l().B).D.a1();
                                        String str5 = (String) pair.first;
                                        long jE = w0Var.V.e() - 1;
                                        string = sb2.toString();
                                        h1Var2 = (h1) e4Var.B;
                                        try {
                                            com.google.android.gms.common.internal.d0.e(str5);
                                            com.google.android.gms.common.internal.d0.e(strB1);
                                            strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v133005." + e4Var.B1()) + "&rdid=" + str5 + "&bundleid=" + strB1 + "&retry=" + jE;
                                            if (strB1.equals(h1Var2.D.Z0("debug.deferred.deeplink"))) {
                                                strConcat = strConcat.concat("&ddl_test=1");
                                            }
                                            if (!string.isEmpty()) {
                                                if (string.charAt(0) != '&') {
                                                    strConcat = strConcat.concat("&");
                                                }
                                                strConcat = strConcat.concat(string);
                                            }
                                            url = new URL(strConcat);
                                        } catch (IllegalArgumentException | MalformedURLException e11) {
                                            q0 q0Var5 = h1Var2.F;
                                            h1.g(q0Var5);
                                            q0Var5.G.c(e11.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                            url = null;
                                        }
                                        if (url != null) {
                                            h1.g(m2Var);
                                            g1 g1Var = new g1(h1Var3);
                                            m2Var.X0();
                                            e1 e1Var2 = h1Var4.G;
                                            h1.g(e1Var2);
                                            e1Var2.h1(new s0(m2Var, strB1, url, (byte[]) null, (HashMap) null, g1Var));
                                        }
                                    }
                                }
                                iVarA = null;
                                if (iVarA != null) {
                                    bundle = iVarA.A;
                                } else {
                                    bundle = null;
                                }
                                if (bundle == null) {
                                    i10 = h1Var3.f14626b0;
                                    h1Var3.f14626b0 = i10 + 1;
                                    if (i10 < 10) {
                                    }
                                    h1.g(q0Var);
                                    if (i10 < 10) {
                                        str2 = "Retrying.";
                                    } else {
                                        str2 = "Skipping.";
                                    }
                                    q0Var.N.c(Integer.valueOf(h1Var3.f14626b0), w.c.l(new StringBuilder(str2.length() + 60), "Failed to retrieve DMA consent from the service, ", str2, " retryCount"));
                                } else {
                                    t1 t1VarB2 = t1.b(100, bundle);
                                    sb2.append("&gcs=");
                                    sb2.append(t1VarB2.f());
                                    o oVarC2 = o.c(100, bundle);
                                    str = oVarC2.f14680d;
                                    sb2.append("&dma=");
                                    Boolean bool3 = oVarC2.f14679c;
                                    bool = Boolean.FALSE;
                                    sb2.append(!Objects.equals(bool3, bool) ? 1 : 0);
                                    if (!TextUtils.isEmpty(str)) {
                                        sb2.append("&dma_cps=");
                                        sb2.append(str);
                                    }
                                    iOrdinal = t1.d(bundle.getString("ad_personalization")).ordinal();
                                    if (iOrdinal != 2) {
                                        if (iOrdinal != 3) {
                                            bool = null;
                                        } else {
                                            bool = Boolean.TRUE;
                                        }
                                    }
                                    int i12 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                    sb2.append("&npa=");
                                    sb2.append(i12);
                                    h1.g(q0Var);
                                    q0Var.O.c(sb2, "Consent query parameters to Bow");
                                    e4 e4Var2 = h1Var3.I;
                                    h1.e(e4Var2);
                                    ((h1) h1Var3.l().B).D.a1();
                                    String str6 = (String) pair.first;
                                    long jE2 = w0Var.V.e() - 1;
                                    string = sb2.toString();
                                    h1Var2 = (h1) e4Var2.B;
                                    com.google.android.gms.common.internal.d0.e(str6);
                                    com.google.android.gms.common.internal.d0.e(strB1);
                                    strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v133005." + e4Var2.B1()) + "&rdid=" + str6 + "&bundleid=" + strB1 + "&retry=" + jE2;
                                    if (strB1.equals(h1Var2.D.Z0("debug.deferred.deeplink"))) {
                                        strConcat = strConcat.concat("&ddl_test=1");
                                    }
                                    if (!string.isEmpty()) {
                                        if (string.charAt(0) != '&') {
                                            strConcat = strConcat.concat("&");
                                        }
                                        strConcat = strConcat.concat(string);
                                    }
                                    url = new URL(strConcat);
                                    if (url != null) {
                                        h1.g(m2Var);
                                        g1 g1Var2 = new g1(h1Var3);
                                        m2Var.X0();
                                        e1 e1Var3 = h1Var4.G;
                                        h1.g(e1Var3);
                                        e1Var3.h1(new s0(m2Var, strB1, url, (byte[]) null, (HashMap) null, g1Var2));
                                    }
                                }
                                break;
                            } else {
                                e4 e4Var3 = ((h1) c3VarJ2.B).I;
                                h1.e(e4Var3);
                                if (e4Var3.B1() >= 234200) {
                                    i2 i2Var4 = h1Var3.M;
                                    h1.f(i2Var4);
                                    h1 h1Var7 = (h1) i2Var4.B;
                                    i2Var4.V0();
                                    c3VarJ = h1Var7.j();
                                    h1Var = (h1) c3VarJ.B;
                                    c3VarJ.V0();
                                    c3VarJ.W0();
                                    e0Var = c3VarJ.E;
                                    if (e0Var == null) {
                                        c3VarJ.b1();
                                        q0 q0Var6 = h1Var.F;
                                        h1.g(q0Var6);
                                        q0Var6.N.b("Failed to get consents; not connected to service yet.");
                                    } else {
                                        iVarA = e0Var.A(c3VarJ.l1(false));
                                        c3VarJ.i1();
                                        if (iVarA != null) {
                                            bundle = iVarA.A;
                                        } else {
                                            bundle = null;
                                        }
                                        if (bundle == null) {
                                            i10 = h1Var3.f14626b0;
                                            h1Var3.f14626b0 = i10 + 1;
                                            if (i10 < 10) {
                                            }
                                            h1.g(q0Var);
                                            if (i10 < 10) {
                                                str2 = "Retrying.";
                                            } else {
                                                str2 = "Skipping.";
                                            }
                                            q0Var.N.c(Integer.valueOf(h1Var3.f14626b0), w.c.l(new StringBuilder(str2.length() + 60), "Failed to retrieve DMA consent from the service, ", str2, " retryCount"));
                                        } else {
                                            t1 t1VarB3 = t1.b(100, bundle);
                                            sb2.append("&gcs=");
                                            sb2.append(t1VarB3.f());
                                            o oVarC3 = o.c(100, bundle);
                                            str = oVarC3.f14680d;
                                            sb2.append("&dma=");
                                            Boolean bool4 = oVarC3.f14679c;
                                            bool = Boolean.FALSE;
                                            sb2.append(!Objects.equals(bool4, bool) ? 1 : 0);
                                            if (!TextUtils.isEmpty(str)) {
                                                sb2.append("&dma_cps=");
                                                sb2.append(str);
                                            }
                                            iOrdinal = t1.d(bundle.getString("ad_personalization")).ordinal();
                                            if (iOrdinal != 2) {
                                                if (iOrdinal != 3) {
                                                    bool = null;
                                                } else {
                                                    bool = Boolean.TRUE;
                                                }
                                            }
                                            int i13 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                            sb2.append("&npa=");
                                            sb2.append(i13);
                                            h1.g(q0Var);
                                            q0Var.O.c(sb2, "Consent query parameters to Bow");
                                            e4 e4Var4 = h1Var3.I;
                                            h1.e(e4Var4);
                                            ((h1) h1Var3.l().B).D.a1();
                                            String str7 = (String) pair.first;
                                            long jE3 = w0Var.V.e() - 1;
                                            string = sb2.toString();
                                            h1Var2 = (h1) e4Var4.B;
                                            com.google.android.gms.common.internal.d0.e(str7);
                                            com.google.android.gms.common.internal.d0.e(strB1);
                                            strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v133005." + e4Var4.B1()) + "&rdid=" + str7 + "&bundleid=" + strB1 + "&retry=" + jE3;
                                            if (strB1.equals(h1Var2.D.Z0("debug.deferred.deeplink"))) {
                                                strConcat = strConcat.concat("&ddl_test=1");
                                            }
                                            if (!string.isEmpty()) {
                                                if (string.charAt(0) != '&') {
                                                    strConcat = strConcat.concat("&");
                                                }
                                                strConcat = strConcat.concat(string);
                                            }
                                            url = new URL(strConcat);
                                            if (url != null) {
                                                h1.g(m2Var);
                                                g1 g1Var3 = new g1(h1Var3);
                                                m2Var.X0();
                                                e1 e1Var4 = h1Var4.G;
                                                h1.g(e1Var4);
                                                e1Var4.h1(new s0(m2Var, strB1, url, (byte[]) null, (HashMap) null, g1Var3));
                                            }
                                        }
                                    }
                                    iVarA = null;
                                    if (iVarA != null) {
                                        bundle = iVarA.A;
                                    } else {
                                        bundle = null;
                                    }
                                    if (bundle == null) {
                                        i10 = h1Var3.f14626b0;
                                        h1Var3.f14626b0 = i10 + 1;
                                        if (i10 < 10) {
                                        }
                                        h1.g(q0Var);
                                        if (i10 < 10) {
                                            str2 = "Retrying.";
                                        } else {
                                            str2 = "Skipping.";
                                        }
                                        q0Var.N.c(Integer.valueOf(h1Var3.f14626b0), w.c.l(new StringBuilder(str2.length() + 60), "Failed to retrieve DMA consent from the service, ", str2, " retryCount"));
                                    } else {
                                        t1 t1VarB4 = t1.b(100, bundle);
                                        sb2.append("&gcs=");
                                        sb2.append(t1VarB4.f());
                                        o oVarC4 = o.c(100, bundle);
                                        str = oVarC4.f14680d;
                                        sb2.append("&dma=");
                                        Boolean bool5 = oVarC4.f14679c;
                                        bool = Boolean.FALSE;
                                        sb2.append(!Objects.equals(bool5, bool) ? 1 : 0);
                                        if (!TextUtils.isEmpty(str)) {
                                            sb2.append("&dma_cps=");
                                            sb2.append(str);
                                        }
                                        iOrdinal = t1.d(bundle.getString("ad_personalization")).ordinal();
                                        if (iOrdinal != 2) {
                                            if (iOrdinal != 3) {
                                                bool = null;
                                            } else {
                                                bool = Boolean.TRUE;
                                            }
                                        }
                                        int i14 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                        sb2.append("&npa=");
                                        sb2.append(i14);
                                        h1.g(q0Var);
                                        q0Var.O.c(sb2, "Consent query parameters to Bow");
                                        e4 e4Var5 = h1Var3.I;
                                        h1.e(e4Var5);
                                        ((h1) h1Var3.l().B).D.a1();
                                        String str8 = (String) pair.first;
                                        long jE4 = w0Var.V.e() - 1;
                                        string = sb2.toString();
                                        h1Var2 = (h1) e4Var5.B;
                                        com.google.android.gms.common.internal.d0.e(str8);
                                        com.google.android.gms.common.internal.d0.e(strB1);
                                        strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v133005." + e4Var5.B1()) + "&rdid=" + str8 + "&bundleid=" + strB1 + "&retry=" + jE4;
                                        if (strB1.equals(h1Var2.D.Z0("debug.deferred.deeplink"))) {
                                            strConcat = strConcat.concat("&ddl_test=1");
                                        }
                                        if (!string.isEmpty()) {
                                            if (string.charAt(0) != '&') {
                                                strConcat = strConcat.concat("&");
                                            }
                                            strConcat = strConcat.concat(string);
                                        }
                                        url = new URL(strConcat);
                                        if (url != null) {
                                            h1.g(m2Var);
                                            g1 g1Var4 = new g1(h1Var3);
                                            m2Var.X0();
                                            e1 e1Var5 = h1Var4.G;
                                            h1.g(e1Var5);
                                            e1Var5.h1(new s0(m2Var, strB1, url, (byte[]) null, (HashMap) null, g1Var4));
                                        }
                                    }
                                } else {
                                    e4 e4Var6 = h1Var3.I;
                                    h1.e(e4Var6);
                                    ((h1) h1Var3.l().B).D.a1();
                                    String str9 = (String) pair.first;
                                    long jE5 = w0Var.V.e() - 1;
                                    string = sb2.toString();
                                    h1Var2 = (h1) e4Var6.B;
                                    com.google.android.gms.common.internal.d0.e(str9);
                                    com.google.android.gms.common.internal.d0.e(strB1);
                                    strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v133005." + e4Var6.B1()) + "&rdid=" + str9 + "&bundleid=" + strB1 + "&retry=" + jE5;
                                    if (strB1.equals(h1Var2.D.Z0("debug.deferred.deeplink"))) {
                                        strConcat = strConcat.concat("&ddl_test=1");
                                    }
                                    if (!string.isEmpty()) {
                                        if (string.charAt(0) != '&') {
                                            strConcat = strConcat.concat("&");
                                        }
                                        strConcat = strConcat.concat(string);
                                    }
                                    url = new URL(strConcat);
                                    if (url != null) {
                                        h1.g(m2Var);
                                        g1 g1Var5 = new g1(h1Var3);
                                        m2Var.X0();
                                        e1 e1Var6 = h1Var4.G;
                                        h1.g(e1Var6);
                                        e1Var6.h1(new s0(m2Var, strB1, url, (byte[]) null, (HashMap) null, g1Var5));
                                    }
                                }
                            }
                        } else {
                            h1.g(q0Var);
                            q0Var.J.b("Network is not available for Deferred Deep Link request. Skipping");
                        }
                    } else {
                        h1.g(q0Var);
                        q0Var.O.b("ADID unavailable to retrieve Deferred Deep Link. Skipping");
                    }
                } else {
                    h1.g(q0Var);
                    q0Var.O.b("ADID collection is disabled from Manifest. Skipping");
                }
                if (z10) {
                    i2Var2.U.b(2000L);
                }
                break;
        }
    }
}
