package hy;

import b2.o;
import b2.r;
import g00.b0;
import java.util.List;
import l1.g0;
import l1.j;
import u00.k;
import u00.n;
import u00.p;

public final class f implements p {
    public final List A;
    public final float B;
    public final u30.b C;
    public final k D;
    public final k E;
    public final n F;

    public f(u30.b bVar, float f, u30.b bVar2, k kVar, k kVar2, n nVar) {
        this.A = bVar;
        this.B = f;
        this.C = bVar2;
        this.D = kVar;
        this.E = kVar2;
        this.F = nVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        j0.b bVar = (j0.b) obj;
        int iIntValue = ((Number) obj2).intValue();
        g0 g0Var = (j) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (g0Var.g(bVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= g0Var.e(iIntValue) ? 32 : 16;
        }
        g0 g0Var2 = g0Var;
        if (g0Var2.S(i & 1, (i & 147) != 146)) {
            cy.e eVar = (cy.e) this.A.get(iIntValue);
            g0Var2.c0(-2007520353);
            r rVarE = h0.c.E(o.A, this.B, 0.0f, 2);
            int iM = va.a.M(this.C);
            float f = g.a;
            float f2 = iIntValue == 0 ? f : 0;
            if (iIntValue != iM) {
                f = 0;
            }
            g.a(eVar, p0.f.b(f2, f2, f, f), this.D, this.E, this.F, rVarE, g0Var, 8);
            g0Var2.r(false);
        } else {
            g0Var2.V();
        }
        return b0.a;
    }
}
