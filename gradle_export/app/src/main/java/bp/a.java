package bp;

import a1.a0;
import a40.m0;
import a40.z;
import k00.i;
import u00.k;
import u00.n;
import vp.x;
import wo.c0;

public final class a {
    public final c0 a;
    public final x b;
    public final z c;

    public a(c0 c0Var, x xVar) {
        h40.e eVar = m0.a;
        f40.c cVarC = a40.c0.c(h40.d.C);
        this.a = c0Var;
        this.b = xVar;
        this.c = cVarC;
    }

    public final void a() {
        c0 c0Var = this.a;
        c0Var.a.cleanTokenData();
        c0Var.a();
        c0Var.a.clearSession();
        c0Var.a();
        c0Var.b.clearUserProperties();
        ta.c0.M(this.c, (i) null, (n) null, (k) null, new a0(this, (k00.c) null, 5), 31);
    }
}
