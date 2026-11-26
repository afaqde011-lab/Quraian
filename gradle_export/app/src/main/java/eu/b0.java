package eu;

import android.content.res.Configuration;
import bt.y0;
import c3.o0;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import g1.z6;
import h0.c1;
import h0.p1;
import h0.t1;
import h0.v1;
import h0.z1;
import i2.t0;
import l1.g0;
import l1.m1;
import l1.r1;
import l1.z0;
import m3.r0;
import qd.s0;
import w.c0;
import w.x0;
import x.q1;
import z2.w0;

public abstract class b0 {
    public static final void a(boolean z, final u00.a onDismissClicked, final u00.a onUpdateClicked, l1.j jVar, int i) {
        l1.j jVar2;
        r1 r1VarT;
        z zVar;
        kotlin.jvm.internal.m.e(onDismissClicked, "onDismissClicked");
        kotlin.jvm.internal.m.e(onUpdateClicked, "onUpdateClicked");
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(1218390814);
        int i2 = (jVar3.h(z) ? 4 : 2) | i | (jVar3.i(onDismissClicked) ? 32 : 16) | (jVar3.i(onUpdateClicked) ? 256 : 128);
        if (jVar3.S(i2 & 1, (i2 & 147) != 146)) {
            if (z) {
                Configuration configuration = (Configuration) jVar3.k(o0.a);
                boolean z2 = configuration.screenWidthDp <= 360 || configuration.screenHeightDp <= 640;
                int i3 = (int) (configuration.screenHeightDp * 0.88f);
                if (i3 < 220) {
                    i3 = 220;
                }
                final float f = i3;
                final float f2 = z2 ? 12 : 16;
                final float f3 = z2 ? 12 : 16;
                final float f4 = z2 ? 16 : 24;
                final float f5 = z2 ? 68 : 80;
                final float f6 = z2 ? 62 : 74;
                jVar2 = jVar3;
                s0.G(onDismissClicked, (c4.v) null, v1.d.d(1827221031, new u00.n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        g0 g0Var = (l1.j) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        boolean z3 = (iIntValue & 3) != 2;
                        g0 g0Var2 = g0Var;
                        a30.x xVar = g0Var2.a;
                        if (g0Var2.S(iIntValue & 1, z3)) {
                            b2.o oVar = b2.o.A;
                            b2.r rVarC = f2.h.c(z1.s(oVar, 0.0f, 360, 1), p0.f.a(28));
                            long j = dl.a.M;
                            i2.o0 o0Var = i2.b0.b;
                            float f7 = 14;
                            b2.r rVarD = h0.c.D(z.n.f(rVarC, j, o0Var), f7, f2);
                            w0 w0VarD = h0.o.d(b2.b.A, false);
                            int iHashCode = Long.hashCode(g0Var2.T);
                            m1 m1VarM = g0Var2.m();
                            b2.r rVarC2 = b2.a.c(rVarD, g0Var);
                            b3.i.c.getClass();
                            b3.g gVar = b3.h.b;
                            g0Var2.g0();
                            if (g0Var2.S) {
                                g0Var2.l(gVar);
                            } else {
                                g0Var2.q0();
                            }
                            b3.f fVar = b3.h.f;
                            l1.q.I(w0VarD, g0Var, fVar);
                            b3.f fVar2 = b3.h.e;
                            l1.q.I(m1VarM, g0Var, fVar2);
                            Integer numValueOf = Integer.valueOf(iHashCode);
                            b3.f fVar3 = b3.h.g;
                            l1.q.I(numValueOf, g0Var, fVar3);
                            b3.e eVar = b3.h.h;
                            l1.q.E(g0Var, eVar);
                            b3.f fVar4 = b3.h.d;
                            l1.q.I(rVarC2, g0Var, fVar4);
                            b2.r rVarP = z.n.p(z1.g(z1.d(oVar, 1.0f), 0.0f, f, 1), z.n.l(g0Var), false, 14);
                            h0.v vVarA = h0.u.a(h0.i.c, b2.b.N, g0Var, 48);
                            int iHashCode2 = Long.hashCode(g0Var2.T);
                            m1 m1VarM2 = g0Var2.m();
                            b2.r rVarC3 = b2.a.c(rVarP, g0Var);
                            g0Var2.g0();
                            if (g0Var2.S) {
                                g0Var2.l(gVar);
                            } else {
                                g0Var2.q0();
                            }
                            l1.q.I(vVarA, g0Var, fVar);
                            l1.q.I(m1VarM2, g0Var, fVar2);
                            x5.u(iHashCode2, g0Var, fVar3, g0Var, eVar);
                            l1.q.I(rVarC3, g0Var, fVar4);
                            b2.r rVarM = z1.m(oVar, f5);
                            w0 w0VarD2 = h0.o.d(b2.b.C, false);
                            int iHashCode3 = Long.hashCode(g0Var2.T);
                            m1 m1VarM3 = g0Var2.m();
                            b2.r rVarC4 = b2.a.c(rVarM, g0Var);
                            g0Var2.g0();
                            if (g0Var2.S) {
                                g0Var2.l(gVar);
                            } else {
                                g0Var2.q0();
                            }
                            l1.q.I(w0VarD2, g0Var, fVar);
                            l1.q.I(m1VarM3, g0Var, fVar2);
                            x5.u(iHashCode3, g0Var, fVar3, g0Var, eVar);
                            l1.q.I(rVarC4, g0Var, fVar4);
                            b2.r rVarC5 = h0.c.C(f2.h.c(oVar, p0.f.a(f7)), 7);
                            w0 w0VarD3 = h0.o.d(b2.b.E, false);
                            int iHashCode4 = Long.hashCode(g0Var2.T);
                            m1 m1VarM4 = g0Var2.m();
                            b2.r rVarC6 = b2.a.c(rVarC5, g0Var);
                            g0Var2.g0();
                            if (g0Var2.S) {
                                g0Var2.l(gVar);
                            } else {
                                g0Var2.q0();
                            }
                            l1.q.I(w0VarD3, g0Var, fVar);
                            l1.q.I(m1VarM4, g0Var, fVar2);
                            x5.u(iHashCode4, g0Var, fVar3, g0Var, eVar);
                            l1.q.I(rVarC6, g0Var, fVar4);
                            z.n.c(y3.R(2131230843, g0Var, 0), (String) null, z1.m(oVar, f6), (b2.d) null, (z2.p) null, 0.0f, g0Var, 56, 120);
                            g0Var2.r(true);
                            String strU = z3.U(g0Var, 2131886555);
                            long j2 = i2.t.c;
                            float f8 = 2;
                            z6.b(strU, h0.c.D(z.n.f(f2.h.c(h0.c.z(oVar, f8, -2), p0.f.a(30)), dl.a.C, o0Var), 8, f8), j2, kh.o.z(9), q3.u.L, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(11), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597824, 48, 260008);
                            g0Var2.r(true);
                            float f9 = 10;
                            h0.c.h(z1.e(oVar, f9), g0Var);
                            z6.b(z3.U(g0Var, 2131887285), z1.d(oVar, 1.0f), j2, kh.o.z(22), q3.u.M, (q3.i) null, 0L, (x3.l) null, new x3.k(3), kh.o.z(28), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597872, 48, 258984);
                            h0.c.h(z1.e(oVar, f3), g0Var);
                            z6.b(z3.U(g0Var, 2131887283), z1.d(oVar, 1.0f), i2.t.b(0.86f, j2), kh.o.z(18), (q3.u) null, (q3.i) null, 0L, (x3.l) null, new x3.k(3), kh.o.z(26), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 25008, 48, 259048);
                            h0.c.h(z1.e(oVar, f4), g0Var);
                            h0.f fVarG = h0.i.g(f9);
                            b2.r rVarD2 = z1.d(oVar, 1.0f);
                            v1 v1VarA = t1.a(fVarG, b2.b.J, g0Var, 6);
                            int iHashCode5 = Long.hashCode(g0Var2.T);
                            m1 m1VarM5 = g0Var2.m();
                            b2.r rVarC7 = b2.a.c(rVarD2, g0Var);
                            g0Var2.g0();
                            if (g0Var2.S) {
                                g0Var2.l(gVar);
                            } else {
                                g0Var2.q0();
                            }
                            l1.q.I(v1VarA, g0Var, fVar);
                            l1.q.I(m1VarM5, g0Var, fVar2);
                            x5.u(iHashCode5, g0Var, fVar3, g0Var, eVar);
                            l1.q.I(rVarC7, g0Var, fVar4);
                            if (1.0f <= 0.0d) {
                                i0.a.a("invalid weight; must be greater than zero");
                            }
                            float f11 = 46;
                            b2.r rVarE = z1.e(new c1(1.0f, true), f11);
                            float f12 = 32;
                            p0.e eVarA = p0.f.a(f12);
                            p1 p1Var = g1.s.a;
                            long j3 = dl.a.u;
                            long j4 = dl.a.i;
                            g1.r rVarA = g1.s.a(j3, j4, 0L, 0L, g0Var, 12);
                            float f13 = 0;
                            g1.x5.a(onDismissClicked, rVarE, false, eVarA, rVarA, (g1.u) null, new p1(f13, f13, f13, f13), (f0.i) null, a.r, g0Var, 817889280, 356);
                            if (1.0f <= 0.0d) {
                                i0.a.a("invalid weight; must be greater than zero");
                            }
                            g1.x5.a(onUpdateClicked, z1.e(new c1(1.0f, true), f11), false, p0.f.a(f12), g1.s.a(j4, dl.a.N, 0L, 0L, g0Var, 12), (g1.u) null, new p1(f13, f13, f13, f13), (f0.i) null, a.s, g0Var, 817889280, 356);
                            x5.z(g0Var2, true, true, true);
                        } else {
                            g0Var2.V();
                        }
                        return g00.b0.a;
                    }
                }, jVar3), jVar2, ((i2 >> 3) & 14) | 384, 2);
            } else {
                r1VarT = jVar3.t();
                if (r1VarT == null) {
                    return;
                } else {
                    zVar = new z(z, onDismissClicked, onUpdateClicked, i, 0);
                }
            }
            r1VarT.d = zVar;
        }
        jVar2 = jVar3;
        jVar2.V();
        r1VarT = jVar2.t();
        if (r1VarT != null) {
            zVar = new z(z, onDismissClicked, onUpdateClicked, i, 1);
            r1VarT.d = zVar;
        }
    }

    public static final void b(u00.a aVar, l1.j jVar, int i) {
        u00.a onContactUsClicked = aVar;
        kotlin.jvm.internal.m.e(onContactUsClicked, "onContactUsClicked");
        g0 g0Var = (g0) jVar;
        g0Var.e0(802388378);
        int i2 = i | (g0Var.i(onContactUsClicked) ? 4 : 2);
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (objN == obj) {
                objN = l1.q.z(Boolean.FALSE);
                g0Var.n0(objN);
            }
            z0 z0Var = (z0) objN;
            Object objN2 = g0Var.N();
            if (objN2 == obj) {
                objN2 = new y0(z0Var, null, 4);
                g0Var.n0(objN2);
            }
            l1.q.i(g00.b0.a, g0Var, (u00.n) objN2);
            Object objN3 = g0Var.N();
            if (objN3 == obj) {
                objN3 = new a2.f(24);
                g0Var.n0(objN3);
            }
            s0.E(true, (u00.a) objN3, g0Var, 54, 0);
            h0.a0 a0Var = z1.c;
            b2.r rVarD = h0.c.D(z.n.e(a0Var, dl.a.b0, (t0) null, 6), 24, 20);
            w0 w0VarD = h0.o.d(b2.b.A, false);
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
            b3.f fVar = b3.h.f;
            l1.q.I(w0VarD, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            l1.q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC, g0Var, fVar4);
            h0.v vVarA = h0.u.a(h0.i.c, b2.b.N, g0Var, 48);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(a0Var, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA, g0Var, fVar);
            l1.q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC2, g0Var, fVar4);
            b2.o oVar = b2.o.A;
            h0.c.h(h0.w.a(oVar, 1.1f), g0Var);
            boolean zBooleanValue = ((Boolean) z0Var.getValue()).booleanValue();
            x.r rVar = x.x.a;
            x0 x0VarC = w.s0.c(x.c.w(900, 0, rVar, 2), 2);
            q1 q1VarW = x.c.w(900, 0, rVar, 2);
            Object objN4 = g0Var.N();
            if (objN4 == obj) {
                objN4 = new e6.c(8);
                g0Var.n0(objN4);
            }
            c0.b(h0.w.a, zBooleanValue, (b2.r) null, x0VarC.a(w.s0.j((u00.k) objN4, q1VarW)), (w.y0) null, (String) null, a.t, g0Var, 1572870, 26);
            h0.c.h(h0.w.a(oVar, 1.0f), g0Var);
            b1.i iVar = h0.i.e;
            b2.h hVar = b2.b.K;
            b2.r rVarD2 = z1.d(oVar, 1.0f);
            v1 v1VarA = t1.a(iVar, hVar, g0Var, 54);
            int iHashCode3 = Long.hashCode(g0Var.T);
            m1 m1VarM3 = g0Var.m();
            b2.r rVarC3 = b2.a.c(rVarD2, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA, g0Var, fVar);
            l1.q.I(m1VarM3, g0Var, fVar2);
            a1.b.v(iHashCode3, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC3, g0Var, fVar4);
            z6.b(z3.U(g0Var, 2131887338), (b2.r) null, i2.t.b(0.7f, dl.a.k), kh.o.z(14), (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 24576, 0, 262122);
            onContactUsClicked = aVar;
            z6.b(z3.U(g0Var, 2131887336), h0.c.G(androidx.compose.foundation.b.c((String) null, aVar, oVar, false, 15), 4, 0.0f, 0.0f, 0.0f, 14), dl.a.G, kh.o.z(14), q3.u.K, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 0, 262056);
            g0Var = g0Var;
            x5.z(g0Var, true, true, true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new d(onContactUsClicked, i, 2);
        }
    }
}
