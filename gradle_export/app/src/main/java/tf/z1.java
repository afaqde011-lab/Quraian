package tf;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public final class z1 implements Runnable {
    public final int A = 2;
    public final Object B;
    public final Object C;
    public final boolean D;
    public final Object E;
    public final Object F;

    public z1(bd.c cVar, boolean z10, Uri uri, String str, String str2) {
        this.D = z10;
        this.E = uri;
        this.B = str;
        this.C = str2;
        this.F = cVar;
    }

    public z1(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.l0 l0Var, String str, String str2, boolean z10) {
        this.E = l0Var;
        this.B = str;
        this.C = str2;
        this.D = z10;
        this.F = appMeasurementDynamiteService;
    }

    public z1(c3 c3Var, g4 g4Var, boolean z10, r rVar, Bundle bundle) {
        this.E = g4Var;
        this.D = z10;
        this.B = rVar;
        this.C = bundle;
        Objects.requireNonNull(c3Var);
        this.F = c3Var;
    }

    public z1(i2 i2Var, AtomicReference atomicReference, String str, String str2, boolean z10) {
        this.E = atomicReference;
        this.B = str;
        this.C = str2;
        this.D = z10;
        Objects.requireNonNull(i2Var);
        this.F = i2Var;
    }

    @Override
    public final void run() throws Throwable {
        q0 q0Var;
        Bundle bundleU1;
        String str;
        q0 q0Var2;
        b50.b bVar;
        Bundle bundleU2;
        switch (this.A) {
            case 0:
                c3 c3VarJ = ((AppMeasurementDynamiteService) this.F).f4066e.j();
                com.google.android.gms.internal.measurement.l0 l0Var = (com.google.android.gms.internal.measurement.l0) this.E;
                String str2 = (String) this.B;
                String str3 = (String) this.C;
                c3VarJ.V0();
                c3VarJ.W0();
                c3VarJ.j1(new u2(c3VarJ, str2, str3, c3VarJ.l1(false), this.D, l0Var));
                break;
            case 1:
                String str4 = (String) this.B;
                String str5 = (String) this.C;
                c3 c3VarJ2 = ((h1) ((i2) this.F).B).j();
                AtomicReference atomicReference = (AtomicReference) this.E;
                c3VarJ2.V0();
                c3VarJ2.W0();
                c3VarJ2.j1(new u2(c3VarJ2, atomicReference, str4, str5, c3VarJ2.l1(false), this.D));
                break;
            case 2:
                bd.c cVar = (bd.c) this.F;
                i2 i2Var = (i2) cVar.B;
                i2Var.V0();
                h1 h1Var = (h1) i2Var.B;
                g1 g1Var = i2Var.S;
                String str6 = (String) this.C;
                Uri uri = (Uri) this.E;
                try {
                    e4 e4Var = h1Var.I;
                    q0 q0Var3 = h1Var.F;
                    h1.e(e4Var);
                    try {
                        String str7 = "Activity created with data 'referrer' without required params";
                        if (TextUtils.isEmpty(str6)) {
                            q0Var = q0Var3;
                        } else {
                            try {
                                if (!str6.contains("gclid")) {
                                    q0Var = q0Var3;
                                    if (!str6.contains("gbraid") && !str6.contains("utm_campaign") && !str6.contains("utm_source") && !str6.contains("utm_medium") && !str6.contains("utm_id") && !str6.contains("dclid") && !str6.contains("srsltid") && !str6.contains("sfmc_id")) {
                                        q0 q0Var4 = ((h1) e4Var.B).F;
                                        h1.g(q0Var4);
                                        q0Var4.N.b("Activity created with data 'referrer' without required params");
                                    }
                                    str = (String) this.B;
                                    if (this.D) {
                                        e4 e4Var2 = h1Var.I;
                                        h1.e(e4Var2);
                                        bundleU2 = e4Var2.U1(uri);
                                        if (bundleU2 != null) {
                                            bundleU2.putString("_cis", "intent");
                                            if (bundleU2.containsKey("gclid") && bundleU1 != null && bundleU1.containsKey("gclid")) {
                                                bundleU2.putString("_cer", "gclid=" + bundleU1.getString("gclid"));
                                            }
                                            i2Var.c1(str, "_cmp", bundleU2);
                                            g1Var.a(str, bundleU2);
                                        } else {
                                            str7 = "Activity created with data 'referrer' without required params";
                                        }
                                    } else {
                                        str7 = "Activity created with data 'referrer' without required params";
                                    }
                                    if (!TextUtils.isEmpty(str6)) {
                                        h1.g(q0Var);
                                        q0Var2 = q0Var;
                                        bVar = q0Var2.N;
                                        bVar.c(str6, "Activity created with referrer");
                                        if (h1Var.D.f1(null, b0.G0)) {
                                            if (bundleU1 != null) {
                                                i2Var.c1(str, "_cmp", bundleU1);
                                                g1Var.a(str, bundleU1);
                                            } else {
                                                h1.g(q0Var2);
                                                bVar.c(str6, "Referrer does not contain valid parameters");
                                            }
                                            h1Var.K.getClass();
                                            i2Var.f1("auto", "_ldl", null, true, System.currentTimeMillis());
                                        } else if (str6.contains("gclid") || (!str6.contains("utm_campaign") && !str6.contains("utm_source") && !str6.contains("utm_medium") && !str6.contains("utm_term") && !str6.contains("utm_content"))) {
                                            h1.g(q0Var2);
                                            bVar.b(str7);
                                        } else if (!TextUtils.isEmpty(str6)) {
                                            h1Var.K.getClass();
                                            i2Var.f1("auto", "_ldl", str6, true, System.currentTimeMillis());
                                        }
                                    }
                                } else {
                                    q0Var = q0Var3;
                                }
                                bundleU1 = e4Var.U1(Uri.parse("https://google.com/search?".concat(str6)));
                                if (bundleU1 != null) {
                                    bundleU1.putString("_cis", "referrer");
                                }
                                str = (String) this.B;
                                if (this.D) {
                                    e4 e4Var3 = h1Var.I;
                                    h1.e(e4Var3);
                                    bundleU2 = e4Var3.U1(uri);
                                    if (bundleU2 != null) {
                                        bundleU2.putString("_cis", "intent");
                                        if (bundleU2.containsKey("gclid")) {
                                        }
                                        i2Var.c1(str, "_cmp", bundleU2);
                                        g1Var.a(str, bundleU2);
                                    } else {
                                        str7 = "Activity created with data 'referrer' without required params";
                                    }
                                } else {
                                    str7 = "Activity created with data 'referrer' without required params";
                                }
                                if (!TextUtils.isEmpty(str6)) {
                                    h1.g(q0Var);
                                    q0Var2 = q0Var;
                                    bVar = q0Var2.N;
                                    bVar.c(str6, "Activity created with referrer");
                                    if (h1Var.D.f1(null, b0.G0)) {
                                        if (str6.contains("gclid")) {
                                        }
                                        h1.g(q0Var2);
                                        bVar.b(str7);
                                    } else {
                                        if (bundleU1 != null) {
                                            i2Var.c1(str, "_cmp", bundleU1);
                                            g1Var.a(str, bundleU1);
                                        } else {
                                            h1.g(q0Var2);
                                            bVar.c(str6, "Referrer does not contain valid parameters");
                                        }
                                        h1Var.K.getClass();
                                        i2Var.f1("auto", "_ldl", null, true, System.currentTimeMillis());
                                    }
                                }
                            } catch (RuntimeException e3) {
                                e = e3;
                                cVar = cVar;
                                q0 q0Var5 = ((h1) ((i2) cVar.B).B).F;
                                h1.g(q0Var5);
                                q0Var5.G.c(e, "Throwable caught in handleReferrerForOnActivityCreated");
                                return;
                            }
                        }
                        bundleU1 = null;
                        str = (String) this.B;
                        if (this.D) {
                            e4 e4Var4 = h1Var.I;
                            h1.e(e4Var4);
                            bundleU2 = e4Var4.U1(uri);
                            if (bundleU2 != null) {
                                bundleU2.putString("_cis", "intent");
                                if (bundleU2.containsKey("gclid")) {
                                }
                                i2Var.c1(str, "_cmp", bundleU2);
                                g1Var.a(str, bundleU2);
                            } else {
                                str7 = "Activity created with data 'referrer' without required params";
                            }
                        } else {
                            str7 = "Activity created with data 'referrer' without required params";
                        }
                        if (!TextUtils.isEmpty(str6)) {
                            h1.g(q0Var);
                            q0Var2 = q0Var;
                            bVar = q0Var2.N;
                            bVar.c(str6, "Activity created with referrer");
                            if (h1Var.D.f1(null, b0.G0)) {
                                if (str6.contains("gclid")) {
                                }
                                h1.g(q0Var2);
                                bVar.b(str7);
                            } else {
                                if (bundleU1 != null) {
                                    i2Var.c1(str, "_cmp", bundleU1);
                                    g1Var.a(str, bundleU1);
                                } else {
                                    h1.g(q0Var2);
                                    bVar.c(str6, "Referrer does not contain valid parameters");
                                }
                                h1Var.K.getClass();
                                i2Var.f1("auto", "_ldl", null, true, System.currentTimeMillis());
                            }
                        }
                    } catch (RuntimeException e10) {
                        e = e10;
                        q0 q0Var6 = ((h1) ((i2) cVar.B).B).F;
                        h1.g(q0Var6);
                        q0Var6.G.c(e, "Throwable caught in handleReferrerForOnActivityCreated");
                        return;
                    }
                } catch (RuntimeException e11) {
                    e = e11;
                }
                break;
            default:
                g4 g4Var = (g4) this.E;
                c3 c3Var = (c3) this.F;
                e0 e0Var = c3Var.E;
                h1 h1Var2 = (h1) c3Var.B;
                if (e0Var == null) {
                    q0 q0Var7 = h1Var2.F;
                    h1.g(q0Var7);
                    q0Var7.G.b("Failed to send default event parameters to service");
                } else if (h1Var2.D.f1(null, b0.f14550b1)) {
                    c3Var.n1(e0Var, this.D ? null : (r) this.B, g4Var);
                } else {
                    try {
                        e0Var.R0((Bundle) this.C, g4Var);
                        c3Var.i1();
                    } catch (RemoteException e12) {
                        q0 q0Var8 = h1Var2.F;
                        h1.g(q0Var8);
                        q0Var8.G.c(e12, "Failed to send default event parameters to service");
                    }
                }
                break;
        }
    }
}
