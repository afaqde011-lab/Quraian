package wr;

import g1.j7;
import h0.c1;
import h0.n1;
import h0.t1;
import h0.v1;
import h0.z1;
import l1.m1;
import l1.r1;

public abstract class t {
    public static final float a = 44;
    public static final float b = 16;

    public static final void a(boolean z, u00.a onPremiumClick, u00.a onInsightsClick, jk.a backdrop, b2.r rVar, boolean z2, l1.j jVar, int i, int i2) {
        int i3;
        b2.r rVar2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        boolean z4;
        j7 j7Var = h0.c.e;
        kotlin.jvm.internal.m.e(onPremiumClick, "onPremiumClick");
        kotlin.jvm.internal.m.e(onInsightsClick, "onInsightsClick");
        kotlin.jvm.internal.m.e(backdrop, "backdrop");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1542355387);
        if ((i & 6) == 0) {
            i3 = (g0Var.h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= g0Var.i(onPremiumClick) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= g0Var.i(onInsightsClick) ? 256 : 128;
        }
        int i7 = i3 | (g0Var.i(backdrop) ? 2048 : 1024);
        int i8 = i2 & 16;
        if (i8 != 0) {
            i4 = i7 | 24576;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i4 = i7 | (g0Var.g(rVar2) ? 16384 : 8192);
        }
        int i9 = i2 & 32;
        if (i9 != 0) {
            i5 = i4 | 196608;
            z3 = z2;
        } else {
            z3 = z2;
            i5 = i4 | (g0Var.h(z3) ? 131072 : 65536);
        }
        if (g0Var.S(i5 & 1, (74899 & i5) != 74898)) {
            b2.r rVar3 = b2.o.A;
            if (i8 != 0) {
                rVar2 = rVar3;
            }
            if (i9 != 0) {
                z3 = false;
            }
            gm.a aVar = (gm.a) g0Var.k(dl.e.a);
            n1 n1Var = (n1) g0Var.k(dq.l.a);
            v1.c cVarD = v1.d.d(-117058127, new lv.a(onPremiumClick, backdrop, 2), g0Var);
            v1.c cVarD2 = v1.d.d(2076875879, new lv.a(onInsightsClick, backdrop, 3), g0Var);
            if (aVar == gm.a.B && z3) {
                g0Var.c0(750791129);
                b2.r rVarM = h0.c.M(z1.d(rVar2, 1.0f), j7Var);
                h0.v vVarA = h0.u.a(h0.i.c, b2.b.O, g0Var, 48);
                int iHashCode = Long.hashCode(g0Var.T);
                m1 m1VarM = g0Var.m();
                b2.r rVarC = b2.a.c(rVarM, g0Var);
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
                h0.c.h(z1.e(rVar3, n1Var.c()), g0Var);
                h0.c.h(z1.e(rVar3, b), g0Var);
                cVarD.invoke(g0Var, 6);
                g0Var.r(true);
                g0Var.r(false);
            } else {
                g0Var.c0(751266235);
                b2.r rVarM2 = h0.c.M(z1.d(rVar2, 1.0f), j7Var);
                v1 v1VarA = t1.a(h0.i.g, b2.b.K, g0Var, 54);
                int iHashCode2 = Long.hashCode(g0Var.T);
                m1 m1VarM2 = g0Var.m();
                b2.r rVarC2 = b2.a.c(rVarM2, g0Var);
                b3.i.c.getClass();
                b3.g gVar2 = b3.h.b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar2);
                } else {
                    g0Var.q0();
                }
                l1.q.I(v1VarA, g0Var, b3.h.f);
                l1.q.I(m1VarM2, g0Var, b3.h.e);
                l1.q.I(Integer.valueOf(iHashCode2), g0Var, b3.h.g);
                l1.q.E(g0Var, b3.h.h);
                l1.q.I(rVarC2, g0Var, b3.h.d);
                if (z) {
                    g0Var.c0(-276023650);
                    if (1.0f <= 0.0d) {
                        i0.a.a("invalid weight; must be greater than zero");
                    }
                    i6 = 1;
                    h0.c.h(new c1(1.0f, true), g0Var);
                    z4 = false;
                    g0Var.r(false);
                } else {
                    g0Var.c0(-276254569);
                    int iOrdinal = aVar.ordinal();
                    if (iOrdinal == 0) {
                        z4 = false;
                        g0Var.c0(822374764);
                        cVarD.invoke(g0Var, 6);
                        g0Var.r(false);
                    } else {
                        if (iOrdinal != 1) {
                            throw oi.k.r(g0Var, 822372555, false);
                        }
                        g0Var.c0(822377276);
                        if (1.0f <= 0.0d) {
                            i0.a.a("invalid weight; must be greater than zero");
                        }
                        h0.c.h(new c1(1.0f, true), g0Var);
                        z4 = false;
                        g0Var.r(false);
                    }
                    g0Var.r(z4);
                    i6 = 1;
                }
                int iOrdinal2 = aVar.ordinal();
                if (iOrdinal2 == 0) {
                    g0Var.c0(822385293);
                    cVarD2.invoke(g0Var, 6);
                    g0Var.r(z4);
                } else {
                    if (iOrdinal2 != i6) {
                        throw oi.k.r(g0Var, 822383304, z4);
                    }
                    g0Var.c0(-275781602);
                    if (z) {
                        g0Var.c0(-275666964);
                        g0Var.r(z4);
                    } else {
                        g0Var.c0(-275741922);
                        cVarD.invoke(g0Var, 6);
                        g0Var.r(z4);
                    }
                    g0Var.r(z4);
                }
                g0Var.r(true);
                g0Var.r(z4);
            }
        } else {
            g0Var.V();
        }
        boolean z5 = z3;
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new gv.u(z, onPremiumClick, onInsightsClick, backdrop, rVar2, z5, i, i2);
        }
    }
}
