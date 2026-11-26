package oo;

import d40.n1;
import h0.z1;
import l1.m1;

public final class t0 implements u00.o {
    public final int A;
    public final z0 B;
    public final u00.k C;

    public t0(z0 z0Var, u00.k kVar, int i) {
        this.A = i;
        this.B = z0Var;
        this.C = kVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        w.d0 AnimatedVisibility = (w.d0) obj;
        switch (this.A) {
            case 0:
                l1.g0 g0Var = (l1.j) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                z0 z0Var = this.B;
                lo.z zVar = z0Var.u;
                n1 n1Var = z0Var.e;
                boolean z = z0Var.d;
                l1.g0 g0Var2 = g0Var;
                u00.k kVar = this.C;
                boolean zG = g0Var2.g(kVar);
                Object objN = g0Var2.N();
                Object obj4 = l1.i.a;
                if (zG || objN == obj4) {
                    objN = new lp.k(12, kVar);
                    g0Var2.n0(objN);
                }
                u00.k kVar2 = (u00.k) objN;
                boolean zG2 = g0Var2.g(kVar);
                Object objN2 = g0Var2.N();
                if (zG2 || objN2 == obj4) {
                    objN2 = new nz.k(12, kVar);
                    g0Var2.n0(objN2);
                }
                po.m.a(zVar, n1Var, z, kVar2, (u00.a) objN2, null, null, null, null, g0Var, 0, 480);
                break;
            default:
                l1.g0 g0Var3 = (l1.j) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                h0.v vVarA = h0.u.a(h0.i.c, b2.b.M, g0Var3, 0);
                l1.g0 g0Var4 = g0Var3;
                int iHashCode = Long.hashCode(g0Var4.T);
                m1 m1VarM = g0Var4.m();
                b2.o oVar = b2.o.A;
                b2.r rVarC = b2.a.c(oVar, g0Var3);
                b3.i.c.getClass();
                b3.g gVar = b3.h.b;
                g0Var4.g0();
                if (g0Var4.S) {
                    g0Var4.l(gVar);
                } else {
                    g0Var4.q0();
                }
                l1.q.I(vVarA, g0Var3, b3.h.f);
                l1.q.I(m1VarM, g0Var3, b3.h.e);
                l1.q.I(Integer.valueOf(iHashCode), g0Var3, b3.h.g);
                l1.q.E(g0Var3, b3.h.h);
                l1.q.I(rVarC, g0Var3, b3.h.d);
                o0.g(this.B, this.C, null, null, false, g0Var3, 0, 28);
                h0.c.h(z1.e(oVar, 20), g0Var3);
                g0Var4.r(true);
                break;
        }
        return g00.b0.a;
    }
}
