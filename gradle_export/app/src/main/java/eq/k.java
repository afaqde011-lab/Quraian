package eq;

import h0.o;
import h0.z1;
import i2.b0;
import i2.t;
import l1.g0;
import l1.m1;
import l1.q;
import l1.r1;
import x.q1;
import x.r;
import x.x;
import z.n;
import z2.w0;

public abstract class k {
    public static final q1 a;
    public static final q1 b;

    static {
        r rVar = x.a;
        a = x.c.w(200, 0, rVar, 2);
        b = x.c.w(200, 0, rVar, 2);
    }

    public static final void a(b2.r rVar, l1.j jVar, int i, int i2) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(1448079799);
        int i3 = (g0Var.e(i) ? 4 : 2) | i2;
        if (g0Var.S(i3 & 1, (i3 & 19) != 18)) {
            b2.r rVarF = n.f(rVar.V(z1.c), t.b(0.82f, dl.a.L), b0.b);
            w0 w0VarD = o.d(b2.b.E, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarF, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(w0VarD, g0Var, b3.h.f);
            q.I(m1VarM, g0Var, b3.h.e);
            q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            q.E(g0Var, b3.h.h);
            q.I(rVarC, g0Var, b3.h.d);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.a;
            if (objN == cVar) {
                objN = new e6.c(2);
                g0Var.n0(objN);
            }
            b2.r rVarE = h0.c.E(b0.p(b2.o.A, (u00.k) objN), 0.0f, 48, 1);
            Integer numValueOf = Integer.valueOf(i);
            Object objN2 = g0Var.N();
            if (objN2 == cVar) {
                objN2 = new e6.c(3);
                g0Var.n0(objN2);
            }
            u00.k kVar = (u00.k) objN2;
            Object objN3 = g0Var.N();
            if (objN3 == cVar) {
                objN3 = new e6.c(4);
                g0Var.n0(objN3);
            }
            w.m.a(numValueOf, rVarE, kVar, (b2.d) null, "reciterEventCountdown", (u00.k) objN3, a.a, g0Var, (i3 & 14) | 1794480, 8);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new bs.h(i, rVar, i2, 4);
        }
    }
}
