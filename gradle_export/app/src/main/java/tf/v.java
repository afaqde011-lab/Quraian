package tf;

import android.os.Bundle;
import java.util.Iterator;

public final class v extends z {
    public final u.e C;
    public final u.e D;
    public long E;

    public v(h1 h1Var) {
        super(h1Var);
        this.D = new u.e(0);
        this.C = new u.e(0);
    }

    public final void W0(long j9, String str) {
        h1 h1Var = (h1) this.B;
        if (str == null || str.length() == 0) {
            q0 q0Var = h1Var.F;
            h1.g(q0Var);
            q0Var.G.b("Ad unit id must be a non-empty string");
        } else {
            e1 e1Var = h1Var.G;
            h1.g(e1Var);
            e1Var.e1(new a(this, str, j9, 0));
        }
    }

    public final void X0(long j9, String str) {
        h1 h1Var = (h1) this.B;
        if (str == null || str.length() == 0) {
            q0 q0Var = h1Var.F;
            h1.g(q0Var);
            q0Var.G.b("Ad unit id must be a non-empty string");
        } else {
            e1 e1Var = h1Var.G;
            h1.g(e1Var);
            e1Var.e1(new a(this, str, j9, 1));
        }
    }

    public final void Y0(long j9) {
        t2 t2Var = ((h1) this.B).L;
        h1.f(t2Var);
        q2 q2VarB1 = t2Var.b1(false);
        u.e eVar = this.C;
        for (String str : (u.b) eVar.keySet()) {
            a1(str, j9 - ((Long) eVar.get(str)).longValue(), q2VarB1);
        }
        if (!eVar.isEmpty()) {
            Z0(j9 - this.E, q2VarB1);
        }
        b1(j9);
    }

    public final void Z0(long j9, q2 q2Var) {
        h1 h1Var = (h1) this.B;
        if (q2Var == null) {
            q0 q0Var = h1Var.F;
            h1.g(q0Var);
            q0Var.O.b("Not logging ad exposure. No active activity");
        } else if (j9 < 1000) {
            q0 q0Var2 = h1Var.F;
            h1.g(q0Var2);
            q0Var2.O.c(Long.valueOf(j9), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j9);
            e4.M1(q2Var, bundle, true);
            i2 i2Var = h1Var.M;
            h1.f(i2Var);
            i2Var.c1("am", "_xa", bundle);
        }
    }

    public final void a1(String str, long j9, q2 q2Var) {
        h1 h1Var = (h1) this.B;
        if (q2Var == null) {
            q0 q0Var = h1Var.F;
            h1.g(q0Var);
            q0Var.O.b("Not logging ad unit exposure. No active activity");
        } else {
            if (j9 < 1000) {
                q0 q0Var2 = h1Var.F;
                h1.g(q0Var2);
                q0Var2.O.c(Long.valueOf(j9), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j9);
            e4.M1(q2Var, bundle, true);
            i2 i2Var = h1Var.M;
            h1.f(i2Var);
            i2Var.c1("am", "_xu", bundle);
        }
    }

    public final void b1(long j9) {
        u.e eVar = this.C;
        Iterator it = ((u.b) eVar.keySet()).iterator();
        while (it.hasNext()) {
            eVar.put((String) it.next(), Long.valueOf(j9));
        }
        if (eVar.isEmpty()) {
            return;
        }
        this.E = j9;
    }
}
