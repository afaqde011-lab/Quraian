package gz;

import java.util.List;
import l1.p2;

public final class f1 implements u00.p {
    public final List A;
    public final m1 B;
    public final l1.z0 C;
    public final p2 D;

    public f1(n00.b bVar, m1 m1Var, l1.z0 z0Var, p2 p2Var) {
        this.A = bVar;
        this.B = m1Var;
        this.C = z0Var;
        this.D = p2Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        j0.b bVar = (j0.b) obj;
        int iIntValue = ((Number) obj2).intValue();
        l1.g0 g0Var = (l1.j) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (g0Var.g(bVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= g0Var.e(iIntValue) ? 32 : 16;
        }
        l1.g0 g0Var2 = g0Var;
        if (g0Var2.S(i & 1, (i & 147) != 146)) {
            ry.f fVar = (ry.f) this.A.get(iIntValue);
            g0Var2.c0(-1011022714);
            l1.z0 z0Var = this.C;
            boolean z = ((g1) z0Var.getValue()).c;
            xp.a aVar = ((g1) z0Var.getValue()).d;
            boolean z2 = ((g1) z0Var.getValue()).f;
            float f = iIntValue != 0 ? 20 : 0;
            p2 p2Var = this.D;
            b2.r rVarG = h0.c.G(b2.o.A, qd.s0.L(p2Var), f, ((y3.f) p2Var.getValue()).A, 0.0f, 8);
            m1 m1Var = this.B;
            boolean zG = g0Var2.g(m1Var);
            Object objN = g0Var2.N();
            if (zG || objN == l1.i.a) {
                objN = new a20.d(m1Var, 17);
                g0Var2.n0(objN);
            }
            iz.d.m(z, fVar, (u00.k) objN, rVarG, z2, aVar, g0Var, 0);
            g0Var2.r(false);
        } else {
            g0Var2.V();
        }
        return g00.b0.a;
    }
}
