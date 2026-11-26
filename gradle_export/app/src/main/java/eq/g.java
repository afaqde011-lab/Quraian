package eq;

import ab.a0;
import b2.r;
import bt.n0;
import c3.o1;
import h0.z1;
import i2.t;
import kh.o;
import l1.g0;
import l1.m1;
import l1.q;
import l1.r1;
import l1.y0;
import ri.t1;
import u00.n;
import z2.w0;

public abstract class g {
    public static final float a = 63;
    public static final float b = 72;
    public static final float c = 26;
    public static final long d = o.z(11);
    public static final float e = 2;
    public static final float f = 4;

    public static final void a(cq.i selectedTab, kk.c layerBackdrop, u00.k onTabSelected, l1.j jVar, int i) {
        kotlin.jvm.internal.m.e(selectedTab, "selectedTab");
        kotlin.jvm.internal.m.e(layerBackdrop, "layerBackdrop");
        kotlin.jvm.internal.m.e(onTabSelected, "onTabSelected");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-2006075375);
        int i2 = i | (g0Var.g(selectedTab) ? 4 : 2) | (g0Var.g(layerBackdrop) ? 32 : 16) | (g0Var.i(onTabSelected) ? 256 : 128);
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (objN == obj) {
                objN = oi.k.s(b(selectedTab), g0Var);
            }
            y0 y0Var = (y0) objN;
            boolean z = (i2 & 14) == 4;
            Object objN2 = g0Var.N();
            if (z || objN2 == obj) {
                objN2 = new f(selectedTab, y0Var, null, 0);
                g0Var.n0(objN2);
            }
            q.i(selectedTab, g0Var, (n) objN2);
            float fT0 = ((y3.c) g0Var.k(o1.h)).t0();
            if (fT0 < 1.0f) {
                fT0 = 1.0f;
            }
            float fX = a0.x(0.65f / fT0, 0.5f, 0.85f);
            r rVarE = z1.e(z1.d(h0.c.E(b2.o.A, 16, 0.0f, 2), 1.0f), 80);
            w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVarE, g0Var);
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
            h0.a0 a0Var = z1.c;
            long j = dl.a.P;
            Object objN3 = g0Var.N();
            if (objN3 == obj) {
                objN3 = new c(y0Var, 0);
                g0Var.n0(objN3);
            }
            t1.d((u00.a) objN3, onTabSelected, layerBackdrop, a0Var, 0L, new t(j), b, a, 0.0f, (u00.o) null, v1.d.d(-1867655943, new n0(onTabSelected, fX), g0Var), g0Var, ((i2 >> 3) & 112) | 113273862 | ((i2 << 3) & 896), 48, 1568);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new b1.n(i, 5, selectedTab, layerBackdrop, onTabSelected);
        }
    }

    public static final int b(cq.i iVar) {
        if (kotlin.jvm.internal.m.a(iVar, cq.c.b)) {
            return 0;
        }
        if (kotlin.jvm.internal.m.a(iVar, cq.f.b)) {
            return 1;
        }
        if (kotlin.jvm.internal.m.a(iVar, cq.e.b)) {
            return 2;
        }
        if (kotlin.jvm.internal.m.a(iVar, cq.h.b)) {
            return 3;
        }
        return kotlin.jvm.internal.m.a(iVar, cq.g.b) ? 4 : 0;
    }
}
