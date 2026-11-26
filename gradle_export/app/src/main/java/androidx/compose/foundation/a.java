package androidx.compose.foundation;

import b2.r;
import j3.k;
import l1.g0;
import l1.i;
import l1.j;
import u00.o;
import w.c;
import z.s0;
import z.v0;

public final class a implements o {
    public final v0 A;
    public final boolean B;
    public final k C;
    public final u00.a D;

    public a(v0 v0Var, boolean z10, k kVar, u00.a aVar) {
        this.A = v0Var;
        this.B = z10;
        this.C = kVar;
        this.D = aVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        g0 g0Var = (g0) ((j) obj2);
        g0Var.c0(-1525724089);
        Object objN = g0Var.N();
        if (objN == i.f9868a) {
            objN = c.g(g0Var);
        }
        f0.i iVar = (f0.i) objN;
        r rVarV = s0.a(b2.o.A, iVar, this.A).V(new ClickableElement(iVar, null, false, this.B, null, this.C, this.D));
        g0Var.r(false);
        return rVarV;
    }
}
