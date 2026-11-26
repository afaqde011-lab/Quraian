package mu;

import com.google.android.gms.internal.measurement.x5;
import g00.b0;
import h0.c1;
import h0.t1;
import h0.v1;
import h0.z1;
import java.util.List;
import l1.g0;
import l1.m1;

public final class t implements u00.p {
    public final int A;
    public final List B;
    public final List C;
    public final ju.l D;

    public t(List list, List list2, ju.l lVar, int i) {
        this.A = i;
        this.B = list;
        this.C = list2;
        this.D = lVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.A;
        b0 b0Var = b0.a;
        List list = this.C;
        b2.o oVar = b2.o.A;
        List list2 = this.B;
        ju.l lVar = this.D;
        switch (i) {
            case 0:
                j0.b bVar = (j0.b) obj;
                int iIntValue = ((Number) obj2).intValue();
                g0 g0Var = (l1.j) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                float f = lVar.d;
                int i2 = (iIntValue2 & 6) == 0 ? iIntValue2 | (g0Var.g(bVar) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i2 |= g0Var.e(iIntValue) ? 32 : 16;
                }
                g0 g0Var2 = g0Var;
                if (g0Var2.S(i2 & 1, (i2 & 147) != 146)) {
                    List<ju.d> list3 = (List) list2.get(iIntValue);
                    g0Var2.c0(1781874565);
                    b2.r rVarG = h0.c.G(z1.d(oVar, 1.0f), 0.0f, 0.0f, 0.0f, iIntValue < va.a.M(list) ? f : 0, 7);
                    h0.b bVar2 = h0.i.a;
                    v1 v1VarA = t1.a(h0.i.g(f), b2.b.J, g0Var, 0);
                    int iHashCode = Long.hashCode(g0Var2.T);
                    m1 m1VarM = g0Var2.m();
                    b2.r rVarC = b2.a.c(rVarG, g0Var);
                    b3.i.c.getClass();
                    b3.g gVar = b3.h.b;
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar);
                    } else {
                        g0Var2.q0();
                    }
                    l1.q.I(v1VarA, g0Var, b3.h.f);
                    l1.q.I(m1VarM, g0Var, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
                    l1.q.E(g0Var, b3.h.h);
                    l1.q.I(rVarC, g0Var, b3.h.d);
                    g0Var2.c0(869274468);
                    for (ju.d dVar : list3) {
                        if (1.0f <= 0.0d) {
                            i0.a.a("invalid weight; must be greater than zero");
                        }
                        d.q(dVar, lVar, new c1(1.0f, true), g0Var, 0);
                    }
                    x5.z(g0Var2, false, true, false);
                } else {
                    g0Var2.V();
                }
                break;
            default:
                j0.b bVar3 = (j0.b) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                g0 g0Var3 = (l1.j) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i3 = (iIntValue4 & 6) == 0 ? iIntValue4 | (g0Var3.g(bVar3) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i3 |= g0Var3.e(iIntValue3) ? 32 : 16;
                }
                g0 g0Var4 = g0Var3;
                if (g0Var4.S(i3 & 1, (i3 & 147) != 146)) {
                    ju.d dVar2 = (ju.d) list2.get(iIntValue3);
                    g0Var4.c0(2124294991);
                    d.q(dVar2, lVar, h0.c.G(z1.d(oVar, 1.0f), 0.0f, 0.0f, 0.0f, iIntValue3 < va.a.M(list) ? lVar.d : 0, 7), g0Var3, 0);
                    g0Var4.r(false);
                } else {
                    g0Var4.V();
                }
                break;
        }
        return b0Var;
    }
}
