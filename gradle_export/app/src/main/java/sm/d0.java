package sm;

import g1.s1;
import h0.z1;
import l1.e1;
import l1.m1;
import l1.r1;
import l1.z0;

public abstract class d0 {
    public static final float a = 8;
    public static final float b = 2;
    public static final float c = 6;

    public static final void a(int i, int i2, u00.k onStepChange, jk.a backdrop, b2.r rVar, l1.j jVar, int i3) {
        kotlin.jvm.internal.m.e(onStepChange, "onStepChange");
        kotlin.jvm.internal.m.e(backdrop, "backdrop");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(2028586494);
        int i4 = i3 | (g0Var.e(i) ? 4 : 2) | (g0Var.e(i2) ? 32 : 16) | (g0Var.i(onStepChange) ? 256 : 128) | (g0Var.i(backdrop) ? 2048 : 1024);
        if (g0Var.S(i4 & 1, (i4 & 9363) != 9362)) {
            z0 z0VarG = l1.q.G(onStepChange, g0Var);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.a;
            if (objN == cVar) {
                e1 e1Var = new e1(i);
                g0Var.n0(e1Var);
                objN = e1Var;
            }
            e1 e1Var2 = (e1) objN;
            Integer numValueOf = Integer.valueOf(i);
            boolean z = (i4 & 14) == 4;
            Object objN2 = g0Var.N();
            if (z || objN2 == cVar) {
                objN2 = new c0(i, e1Var2, null);
                g0Var.n0(objN2);
            }
            l1.q.i(numValueOf, g0Var, (u00.n) objN2);
            Float fValueOf = Float.valueOf(e1Var2.h());
            Object objN3 = g0Var.N();
            if (objN3 == cVar) {
                objN3 = new c0(e1Var2, null);
                g0Var.n0(objN3);
            }
            l1.q.i(fValueOf, g0Var, (u00.n) objN3);
            b2.r rVarD = z1.d(rVar, 1.0f);
            h0.v vVarA = h0.u.a(h0.i.g(6), b2.b.M, g0Var, 6);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarD, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA, g0Var, b3.h.f);
            l1.q.I(m1VarM, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC, g0Var, b3.h.d);
            Object objN4 = g0Var.N();
            if (objN4 == cVar) {
                objN4 = new b0(e1Var2, 0);
                g0Var.n0(objN4);
            }
            u00.a aVar = (u00.a) objN4;
            boolean zG = g0Var.g(z0VarG);
            Object objN5 = g0Var.N();
            if (zG || objN5 == cVar) {
                objN5 = new mu.q(e1Var2, z0VarG, 14);
                g0Var.n0(objN5);
            }
            u00.k kVar = (u00.k) objN5;
            Object objN6 = g0Var.N();
            if (objN6 == cVar) {
                objN6 = new gv.z(e1Var2, 1);
                g0Var.n0(objN6);
            }
            a.a.c(aVar, kVar, (u00.k) objN6, new z00.a(0.0f, i2 - 1), 0.01f, backdrop, (b2.r) null, g0Var, ((i4 << 6) & 458752) | 24966, 64);
            b2.r rVarE = z1.e(z1.d(b2.o.A, 1.0f), c);
            boolean z2 = (i4 & 112) == 32;
            Object objN7 = g0Var.N();
            if (z2 || objN7 == cVar) {
                objN7 = new s1(i2, 14);
                g0Var.n0(objN7);
            }
            z.n.b(6, rVarE, g0Var, (u00.k) objN7);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new ct.a(i, i2, onStepChange, backdrop, rVar, i3);
        }
    }
}
