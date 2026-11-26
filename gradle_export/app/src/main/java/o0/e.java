package o0;

import b2.r;
import j3.k;
import l1.g0;
import l1.i;
import l1.j;
import u00.o;
import z.s0;
import z.v0;

public final class e implements o {
    public final v0 A;
    public final l3.a B;
    public final boolean C;
    public final k D;
    public final u00.a E;

    public e(v0 v0Var, l3.a aVar, boolean z10, k kVar, u00.a aVar2) {
        this.A = v0Var;
        this.B = aVar;
        this.C = z10;
        this.D = kVar;
        this.E = aVar2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        g0 g0Var = (g0) ((j) obj2);
        g0Var.c0(-1525724089);
        Object objN = g0Var.N();
        if (objN == i.f9868a) {
            objN = w.c.g(g0Var);
        }
        f0.i iVar = (f0.i) objN;
        r rVarV = s0.a(b2.o.A, iVar, this.A).V(new f(this.B, iVar, null, this.C, this.D, this.E));
        g0Var.r(false);
        return rVarV;
    }
}
