package qd;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.cast.CastStatusCodes;
import com.google.android.gms.internal.play_billing.g1;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.v2;
import com.google.android.gms.internal.play_billing.x2;
import java.util.Objects;
import java.util.concurrent.Callable;
import tf.g4;
import tf.n1;
import tf.s1;
import tf.t1;
import tf.y3;

public final class b0 implements Callable {

    public final int f12863a;

    public final Object f12864b;

    public final Object f12865c;

    public b0(b bVar, com.revenuecat.purchases.google.usecase.b bVar2) {
        this.f12863a = 0;
        this.f12864b = bVar;
        this.f12865c = bVar2;
    }

    public b0(n1 n1Var, Object obj, int i10) {
        this.f12863a = i10;
        this.f12864b = obj;
        this.f12865c = n1Var;
    }

    public b0(y3 y3Var, g4 g4Var) {
        this.f12863a = 3;
        this.f12864b = g4Var;
        Objects.requireNonNull(y3Var);
        this.f12865c = y3Var;
    }

    @Override
    public final Object call() throws Throwable {
        com.google.android.gms.internal.play_billing.c cVar;
        switch (this.f12863a) {
            case 0:
                b bVar = (b) this.f12864b;
                com.revenuecat.purchases.google.usecase.b bVar2 = (com.revenuecat.purchases.google.usecase.b) this.f12865c;
                bVar.getClass();
                try {
                    if (!bVar.M(com.google.android.gms.internal.measurement.y3.f3922d)) {
                        com.google.android.gms.internal.play_billing.q.h("BillingClient", "Service disconnected.");
                        h hVar = o0.f12934j;
                        bVar.x(2, 13, hVar);
                        bVar2.a(hVar, (d) null);
                    } else if (bVar.f12858v) {
                        synchronized (bVar.f12839a) {
                            cVar = bVar.f12847i;
                            break;
                        }
                        if (cVar == null) {
                            bVar.D(bVar2, o0.f12934j, 107, null);
                        } else if (com.google.android.gms.internal.measurement.y3.f3921c && bVar.A) {
                            String str = bVar.f12841c;
                            g1 g1VarM = ca.v.M(bVar.f12845g);
                            v2 v2VarR = x2.r();
                            h3 h3VarR = i3.r();
                            if (!h3VarR.B.h()) {
                                h3VarR.d();
                            }
                            i3.t((i3) h3VarR.B, str);
                            i3 i3Var = (i3) h3VarR.a();
                            if (!v2VarR.B.h()) {
                                v2VarR.d();
                            }
                            x2.s((x2) v2VarR.B).put("PLAY_BILLING_LIBRARY_VERSION", i3Var);
                            h3 h3VarR2 = i3.r();
                            String packageName = bVar.f12845g.getPackageName();
                            if (!h3VarR2.B.h()) {
                                h3VarR2.d();
                            }
                            i3.t((i3) h3VarR2.B, packageName);
                            i3 i3Var2 = (i3) h3VarR2.a();
                            if (!v2VarR.B.h()) {
                                v2VarR.d();
                            }
                            x2.s((x2) v2VarR.B).put("CALLING_PACKAGE", i3Var2);
                            Bundle bundleK = ca.v.K(g1VarM, (x2) v2VarR.a());
                            if (!TextUtils.isEmpty(null)) {
                                bundleK.putString("accountName", null);
                            }
                            e0 e0Var = new e0(bVar2, bVar.f12846h, bVar.m, 1);
                            com.google.android.gms.internal.play_billing.a aVar = (com.google.android.gms.internal.play_billing.a) cVar;
                            Parcel parcelL2 = aVar.l2();
                            int i10 = com.google.android.gms.internal.play_billing.d.f3950a;
                            parcelL2.writeInt(1);
                            bundleK.writeToParcel(parcelL2, 0);
                            parcelL2.writeStrongBinder(e0Var);
                            aVar.o2(CastStatusCodes.INVALID_REQUEST, parcelL2);
                        } else {
                            String packageName2 = bVar.f12845g.getPackageName();
                            String str2 = bVar.f12842d;
                            long jLongValue = bVar.G.longValue();
                            int i11 = com.google.android.gms.internal.play_billing.q.f4028a;
                            Bundle bundle = new Bundle();
                            com.google.android.gms.internal.play_billing.q.b(bundle, str2, jLongValue);
                            if (!TextUtils.isEmpty(null)) {
                                bundle.putString("accountName", null);
                            }
                            ((com.google.android.gms.internal.play_billing.a) cVar).y2(packageName2, bundle, new e0(bVar2, bVar.f12846h, bVar.m, 0));
                        }
                    } else {
                        com.google.android.gms.internal.play_billing.q.h("BillingClient", "Current client doesn't support get billing config.");
                        h hVar2 = o0.f12948z;
                        bVar.x(32, 13, hVar2);
                        bVar2.a(hVar2, (d) null);
                    }
                } catch (DeadObjectException e3) {
                    bVar.D(bVar2, o0.f12934j, 62, e3);
                } catch (Exception e10) {
                    bVar.D(bVar2, o0.f12932h, 62, e10);
                }
                return null;
            case 1:
                n1 n1Var = (n1) this.f12865c;
                n1Var.f14673e.x();
                tf.m mVar = n1Var.f14673e.C;
                y3.R(mVar);
                return mVar.Q1((String) this.f12864b);
            case 2:
                n1 n1Var2 = (n1) this.f12865c;
                n1Var2.f14673e.x();
                return new tf.i(n1Var2.f14673e.o0(((g4) this.f12864b).A));
            default:
                g4 g4Var = (g4) this.f12864b;
                String str3 = g4Var.A;
                com.google.android.gms.common.internal.d0.h(str3);
                y3 y3Var = (y3) this.f12865c;
                t1 t1VarA = y3Var.a(str3);
                s1 s1Var = s1.ANALYTICS_STORAGE;
                if (t1VarA.i(s1Var) && t1.c(100, g4Var.S).i(s1Var)) {
                    return y3Var.Z(g4Var).E();
                }
                y3Var.t().O.b("Analytics storage consent denied. Returning null app instance id");
                return null;
        }
    }
}
