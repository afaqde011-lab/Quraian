package iv;

import android.content.res.Configuration;
import c3.l2;
import c3.m0;
import c3.o0;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import ct.i0;
import g1.o3;
import h0.a0;
import h0.m2;
import h0.u;
import h0.v;
import h0.z1;
import i2.b0;
import i2.t;
import java.util.WeakHashMap;
import l1.g0;
import l1.m1;
import l1.r1;
import qd.s0;
import z2.w0;

public abstract class n {
    public static final float a = 407;

    public static final void a(u00.a aVar, b2.r rVar, l1.j jVar, int i) {
        int i2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-643535142);
        if ((i & 6) == 0) {
            i2 = (g0Var.i(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.g(rVar) ? 32 : 16;
        }
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            b2.r rVarO = w50.c.o(f2.h.c(z1.m(rVar, 40), p0.f.a), false, null, aVar, 7);
            w0 w0VarD = h0.o.d(b2.b.E, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarO, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD, g0Var, b3.h.f);
            l1.q.I(m1VarM, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC, g0Var, b3.h.d);
            o3.a(y3.R(2131231104, g0Var, 0), z3.U(g0Var, 2131887075), z1.m(b2.o.A, 14), dl.a.i, g0Var, 392, 0);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new i0(aVar, rVar, i, 1, (byte) 0);
        }
    }

    public static final void b(yu.a draft, boolean z, u00.k onAction, u00.a onClose, l1.j jVar, int i) {
        kotlin.jvm.internal.m.e(draft, "draft");
        kotlin.jvm.internal.m.e(onAction, "onAction");
        kotlin.jvm.internal.m.e(onClose, "onClose");
        g0 g0Var = (g0) jVar;
        g0Var.e0(982614623);
        int i2 = i | (g0Var.g(draft) ? 4 : 2) | (g0Var.h(z) ? 32 : 16) | (g0Var.i(onAction) ? 256 : 128);
        if (g0Var.S(i2 & 1, (i2 & 1171) != 1170)) {
            m mVarD = d(onAction, onClose, g0Var, (i2 >> 6) & 126);
            boolean z2 = ((Configuration) g0Var.k(o0.a)).orientation == 2;
            l2 l2VarU = m0.u(g0Var);
            i2.o0 o0Var = b0.b;
            b2.o oVar = b2.o.A;
            if (z2) {
                g0Var.c0(-1424312435);
                a0 a0Var = z1.c;
                b2.r rVarA = u2.f.a(z.n.f(a0Var, dl.a.q, o0Var), l2VarU, (u2.d) null);
                WeakHashMap weakHashMap = m2.w;
                b2.r rVarL = h0.c.L(rVarA, h0.b.e(g0Var).l);
                w0 w0VarD = h0.o.d(b2.b.A, false);
                int iHashCode = Long.hashCode(g0Var.T);
                m1 m1VarM = g0Var.m();
                b2.r rVarC = b2.a.c(rVarL, g0Var);
                b3.i.c.getClass();
                b3.g gVar = b3.h.b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(w0VarD, g0Var, b3.h.f);
                l1.q.I(m1VarM, g0Var, b3.h.e);
                l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
                l1.q.E(g0Var, b3.h.h);
                l1.q.I(rVarC, g0Var, b3.h.d);
                float f = 16;
                a.e(draft, z, mVarD, h0.c.F(z.n.p(a0Var, z.n.l(g0Var), false, 14), f, 56, f, 24), true, g0Var, (i2 & 14) | 24576 | (i2 & 112), 0);
                float f2 = 8;
                a(onClose, h0.c.G(oVar, f2, f2, 0.0f, 0.0f, 12), g0Var, 54);
                g0Var.r(true);
                g0Var.r(false);
            } else {
                g0Var.c0(-1423402182);
                a0 a0Var2 = z1.c;
                w0 w0VarD2 = h0.o.d(b2.b.H, false);
                int iHashCode2 = Long.hashCode(g0Var.T);
                m1 m1VarM2 = g0Var.m();
                b2.r rVarC2 = b2.a.c(a0Var2, g0Var);
                b3.i.c.getClass();
                b3.g gVar2 = b3.h.b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar2);
                } else {
                    g0Var.q0();
                }
                b3.f fVar = b3.h.f;
                l1.q.I(w0VarD2, g0Var, fVar);
                b3.f fVar2 = b3.h.e;
                l1.q.I(m1VarM2, g0Var, fVar2);
                Integer numValueOf = Integer.valueOf(iHashCode2);
                b3.f fVar3 = b3.h.g;
                l1.q.I(numValueOf, g0Var, fVar3);
                b3.e eVar = b3.h.h;
                l1.q.E(g0Var, eVar);
                b3.f fVar4 = b3.h.d;
                l1.q.I(rVarC2, g0Var, fVar4);
                h0.o.a(w50.c.o(a0Var2, false, null, onClose, 7), g0Var, 0);
                float f3 = 32;
                b2.r rVarA2 = u2.f.a(z.n.f(f2.h.c(z1.d(oVar, 1.0f), p0.f.c(f3, f3, 0.0f, 0.0f, 12)), dl.a.q, o0Var), l2VarU, (u2.d) null);
                Object objN = g0Var.N();
                if (objN == l1.i.a) {
                    objN = new h.e(1);
                    g0Var.n0(objN);
                }
                b2.r rVarO = w50.c.o(rVarA2, false, null, (u00.a) objN, 7);
                v vVarA = u.a(h0.i.c, b2.b.N, g0Var, 48);
                int iHashCode3 = Long.hashCode(g0Var.T);
                m1 m1VarM3 = g0Var.m();
                b2.r rVarC3 = b2.a.c(rVarO, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar2);
                } else {
                    g0Var.q0();
                }
                l1.q.I(vVarA, g0Var, fVar);
                l1.q.I(m1VarM3, g0Var, fVar2);
                a1.b.v(iHashCode3, g0Var, fVar3, g0Var, eVar);
                l1.q.I(rVarC3, g0Var, fVar4);
                h0.o.a(z.n.f(f2.h.c(z1.n(h0.c.G(oVar, 0.0f, 8, 0.0f, 0.0f, 13), 36, 5), p0.f.a), t.b(0.3f, dl.a.i), o0Var), g0Var, 0);
                float f4 = 16;
                WeakHashMap weakHashMap2 = m2.w;
                a.e(draft, z, mVarD, h0.c.F(z1.d(oVar, 1.0f), f4, 27, f4, h0.c.l(h0.b.e(g0Var).e, g0Var).a() + f4), false, g0Var, i2 & 126, 16);
                x5.z(g0Var, true, true, false);
            }
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new c00.l(draft, z, onAction, onClose, i, 3);
        }
    }

    public static final void c(yu.a draft, boolean z, u00.k onAction, l1.j jVar, int i) {
        int i2;
        kotlin.jvm.internal.m.e(draft, "draft");
        kotlin.jvm.internal.m.e(onAction, "onAction");
        g0 g0Var = (g0) jVar;
        g0Var.e0(622531135);
        if ((i & 6) == 0) {
            i2 = (g0Var.g(draft) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= g0Var.i(onAction) ? 256 : 128;
        }
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 896) == 256;
            Object objN = g0Var.N();
            if (z2 || objN == l1.i.a) {
                objN = new gv.a0(21, onAction);
                g0Var.n0(objN);
            }
            u00.a aVar = (u00.a) objN;
            s0.G(aVar, new c4.v(3, false), v1.d.d(-707557752, new dn.i(draft, z, d(onAction, aVar, g0Var, (i2 >> 6) & 14)), g0Var), g0Var, 432, 0);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new ct.h(draft, z, onAction, i, 5);
        }
    }

    public static final m d(u00.k kVar, u00.a aVar, l1.j jVar, int i) {
        boolean z = ((((i & 14) ^ 6) > 4 && ((g0) jVar).g(kVar)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && ((g0) jVar).g(aVar)) || (i & 48) == 32);
        g0 g0Var = (g0) jVar;
        Object objN = g0Var.N();
        if (z || objN == l1.i.a) {
            m mVar = new m(new hv.j(6, kVar), new hv.j(7, kVar), new hv.j(8, kVar), new hv.j(9, kVar), aVar);
            g0Var.n0(mVar);
            objN = mVar;
        }
        return (m) objN;
    }
}
