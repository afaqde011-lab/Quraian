package gv;

import l1.p2;

public final class x1 implements u00.o {
    public final int A;
    public final bv.o1 B;
    public final u00.k C;
    public final kk.c D;
    public final p2 E;

    public x1(bv.o1 o1Var, u00.k kVar, kk.c cVar, p2 p2Var, int i) {
        this.A = i;
        this.B = o1Var;
        this.C = kVar;
        this.D = cVar;
        this.E = p2Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.A) {
            case 0:
                w.d0 PlayerScreenAnimatedVisibility = (w.d0) obj;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.e(PlayerScreenAnimatedVisibility, "$this$PlayerScreenAnimatedVisibility");
                h0.a0 a0Var = h0.z1.c;
                hv.n.a(this.B, this.C, this.D, ((i2.t) this.E.getValue()).a, a0Var, false, 0.0f, null, 0.0f, 0.0f, 0.0f, (l1.j) obj2, 221184, 1984);
                break;
            default:
                w.d0 AnimatedVisibility = (w.d0) obj;
                l1.g0 g0Var = (l1.j) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                h0.a0 a0Var2 = h0.z1.c;
                b2.r rVarG = h0.c.G(a0Var2, 4, 20, 0.0f, 16, 4);
                z2.w0 w0VarD = h0.o.d(b2.b.A, false);
                l1.g0 g0Var2 = g0Var;
                int iHashCode = Long.hashCode(g0Var2.T);
                l1.m1 m1VarM = g0Var2.m();
                b2.r rVarC = b2.a.c(rVarG, g0Var);
                b3.i.c.getClass();
                b3.g gVar = b3.h.b;
                g0Var2.g0();
                if (g0Var2.S) {
                    g0Var2.l(gVar);
                } else {
                    g0Var2.q0();
                }
                l1.q.I(w0VarD, g0Var, b3.h.f);
                l1.q.I(m1VarM, g0Var, b3.h.e);
                l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
                l1.q.E(g0Var, b3.h.h);
                l1.q.I(rVarC, g0Var, b3.h.d);
                hv.n.a(this.B, this.C, this.D, ((i2.t) this.E.getValue()).a, a0Var2, false, 0.0f, null, 0.0f, 0.0f, 0.0f, g0Var, 24576, 2016);
                g0Var2.r(true);
                break;
        }
        return g00.b0.a;
    }
}
