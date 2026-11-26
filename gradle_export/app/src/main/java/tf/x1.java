package tf;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

public final class x1 implements Runnable {
    public final int A;
    public final i2 B;

    public x1(i2 i2Var, int i10) {
        this.A = i10;
        this.B = i2Var;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                this.B.s1();
                break;
            case 1:
                g1 g1Var = this.B.S;
                h1 h1Var = g1Var.A;
                e1 e1Var = h1Var.G;
                i2 i2Var = h1Var.M;
                w0 w0Var = h1Var.E;
                h1.g(e1Var);
                e1Var.V0();
                if (g1Var.d()) {
                    if (g1Var.c()) {
                        h1.e(w0Var);
                        w0Var.X.r(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        h1.f(i2Var);
                        i2Var.c1("auto", "_cmpx", bundle);
                    } else {
                        h1.e(w0Var);
                        c7.c cVar = w0Var.X;
                        String strP = cVar.p();
                        if (TextUtils.isEmpty(strP)) {
                            q0 q0Var = h1Var.F;
                            h1.g(q0Var);
                            q0Var.H.b("Cache still valid but referrer not found");
                        } else {
                            long jE = w0Var.Y.e() / 3600000;
                            Uri uri = Uri.parse(strP);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(uri.getPath(), bundle2);
                            for (String str : uri.getQueryParameterNames()) {
                                bundle2.putString(str, uri.getQueryParameter(str));
                            }
                            ((Bundle) pair.second).putLong("_cc", (jE - 1) * 3600000);
                            Object obj = pair.first;
                            String str2 = obj == null ? "app" : (String) obj;
                            h1.f(i2Var);
                            i2Var.c1(str2, "_cmp", (Bundle) pair.second);
                        }
                        cVar.r(null);
                    }
                    h1.e(w0Var);
                    w0Var.Y.f(0L);
                    break;
                }
                break;
            case 2:
                i2 i2Var2 = this.B;
                i2Var2.V0();
                h1 h1Var2 = (h1) i2Var2.B;
                w0 w0Var2 = h1Var2.E;
                q0 q0Var2 = h1Var2.F;
                h1.e(w0Var2);
                v0 v0Var = w0Var2.U;
                if (v0Var.a()) {
                    h1.g(q0Var2);
                    q0Var2.N.b("Deferred Deep Link already retrieved. Not fetching again.");
                } else {
                    i7.m1 m1Var = w0Var2.V;
                    long jE2 = m1Var.e();
                    m1Var.f(1 + jE2);
                    if (jE2 >= 5) {
                        h1.g(q0Var2);
                        q0Var2.J.b("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        v0Var.b(true);
                    } else {
                        if (i2Var2.U == null) {
                            i2Var2.U = new y1(i2Var2, h1Var2, 3);
                        }
                        i2Var2.U.b(0L);
                    }
                }
                break;
            default:
                this.B.s1();
                break;
        }
    }
}
