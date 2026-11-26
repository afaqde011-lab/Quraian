package n0;

import a40.c0;
import b2.q;
import b3.k0;
import b3.m;
import b3.p1;
import b3.x;
import d0.i;
import g00.b0;
import z2.a0;

public final class g extends q implements g3.a, x {
    public i O;
    public boolean P;

    public static final h2.c B1(g gVar, p1 p1Var, k0 k0Var) {
        h2.c cVar;
        if (gVar.N && gVar.P) {
            p1 p1VarX = m.x(gVar);
            if (!p1Var.z1().N) {
                p1Var = null;
            }
            if (p1Var != null && (cVar = (h2.c) k0Var.invoke()) != null) {
                return cVar.j(p1VarX.F(p1Var, false).e());
            }
        }
        return null;
    }

    @Override
    public final void c1(a0 a0Var) {
        this.P = true;
    }

    @Override
    public final boolean q1() {
        return false;
    }

    @Override
    public final Object x0(p1 p1Var, k0 k0Var, m00.c cVar) {
        Object objK = c0.k(new dq.i(this, p1Var, k0Var, new d0.g(this, p1Var, k0Var, 8), (k00.c) null, 3), cVar);
        return objK == l00.a.A ? objK : b0.a;
    }
}
