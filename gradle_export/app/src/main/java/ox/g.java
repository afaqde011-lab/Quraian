package ox;

import android.content.res.Configuration;
import b2.o;
import b2.r;
import c3.o0;
import h0.a0;
import h0.c1;
import h0.t1;
import h0.u;
import h0.v;
import h0.v1;
import h0.z1;
import i2.t;
import i2.t0;
import l1.g0;
import l1.j;
import l1.m1;
import l1.q;
import l1.r1;
import z.n;
import z2.w0;

public abstract class g {
    public static final float a = 32;
    public static final float b = 44;
    public static final float c = 6;

    public static final void a(j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1654377221);
        if (g0Var.S(i & 1, i != 0)) {
            float f = 24;
            o oVar = o.A;
            r rVarD = z1.d(h0.c.G(oVar, 0.0f, 0.0f, f, 12, 3), 1.0f);
            v1 v1VarA = t1.a(h0.i.g(32), b2.b.L, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVarD, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar = b3.h.f;
            q.I(v1VarA, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.h;
            q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.d;
            q.I(rVarC, g0Var, fVar4);
            r rVarM = z1.m(oVar, 250);
            w0 w0VarD = h0.o.d(b2.b.E, false);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            r rVarC2 = b2.a.c(rVarM, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(w0VarD, g0Var, fVar);
            q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            q.I(rVarC2, g0Var, fVar4);
            d(80, 54, 0, z1.m(oVar, 160), g0Var);
            g0Var.r(true);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            c1 c1Var = new c1(1.0f, true);
            v vVarA = u.a(h0.i.c, b2.b.M, g0Var, 0);
            int iHashCode3 = Long.hashCode(g0Var.T);
            m1 m1VarM3 = g0Var.m();
            r rVarC3 = b2.a.c(c1Var, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(vVarA, g0Var, fVar);
            q.I(m1VarM3, g0Var, fVar2);
            a1.b.v(iHashCode3, g0Var, fVar3, g0Var, eVar);
            q.I(rVarC3, g0Var, fVar4);
            d(0.0f, 6, 2, z1.n(h0.c.G(oVar, 0.0f, f, 0.0f, 0.0f, 13), 280, 36), g0Var);
            d(0.0f, 6, 2, z1.n(h0.c.G(oVar, 0.0f, 9, 0.0f, 0.0f, 13), 120, 20), g0Var);
            h0.c.h(z1.e(h0.c.G(oVar, 0.0f, 16, 0.0f, 0.0f, 13), b), g0Var);
            g0Var.r(true);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new ou.a(i, 8);
        }
    }

    public static final void b(j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1809735681);
        if (g0Var.S(i & 1, i != 0)) {
            float f = ((Configuration) g0Var.k(o0.a)).screenHeightDp / 2;
            o oVar = o.A;
            r rVarD = z1.d(oVar, 1.0f);
            v vVarA = u.a(h0.i.c, b2.b.M, g0Var, 0);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVarD, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar = b3.h.f;
            q.I(vVarA, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.h;
            q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.d;
            q.I(rVarC, g0Var, fVar4);
            r rVarD2 = z1.d(oVar, 1.0f);
            w0 w0VarD = h0.o.d(b2.b.H, false);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            r rVarC2 = b2.a.c(rVarD2, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(w0VarD, g0Var, fVar);
            q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            q.I(rVarC2, g0Var, fVar4);
            r rVarE = z1.e(z1.d(oVar, 1.0f), f);
            w0 w0VarD2 = h0.o.d(b2.b.A, false);
            int iHashCode3 = Long.hashCode(g0Var.T);
            m1 m1VarM3 = g0Var.m();
            r rVarC3 = b2.a.c(rVarE, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(w0VarD2, g0Var, fVar);
            q.I(m1VarM3, g0Var, fVar2);
            a1.b.v(iHashCode3, g0Var, fVar3, g0Var, eVar);
            q.I(rVarC3, g0Var, fVar4);
            a0 a0Var = z1.c;
            h0.o.a(rd.a.g0(0, 6, 0L, a0Var, false), g0Var, 0);
            h0.o.a(n.e(a0Var, sg.f.P(va.a.S(new t[]{new t(t.f), new t(dl.a.L)}), 0.0f, 0.0f, 14), (t0) null, 6), g0Var, 0);
            g0Var.r(true);
            float f2 = a;
            r rVarG = h0.c.G(h0.c.A(oVar, 0.0f, f2, 1), 0.0f, 0.0f, 0.0f, 16, 7);
            float f3 = 8;
            v vVarA2 = u.a(h0.i.g(f3), b2.b.N, g0Var, 54);
            int iHashCode4 = Long.hashCode(g0Var.T);
            m1 m1VarM4 = g0Var.m();
            r rVarC4 = b2.a.c(rVarG, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(vVarA2, g0Var, fVar);
            q.I(m1VarM4, g0Var, fVar2);
            a1.b.v(iHashCode4, g0Var, fVar3, g0Var, eVar);
            q.I(rVarC4, g0Var, fVar4);
            d(0.0f, 6, 2, z1.n(oVar, 220, 28), g0Var);
            d(0.0f, 6, 2, z1.n(oVar, 120, 20), g0Var);
            h0.c.h(z1.e(h0.c.G(oVar, 0.0f, f3, 0.0f, 0.0f, 13), b), g0Var);
            g0Var.r(true);
            g0Var.r(true);
            h0.c.h(z1.e(oVar, f2), g0Var);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new ou.a(i, 7);
        }
    }

    public static final void c(r rVar, j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-467335551);
        int i2 = i | 6;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            boolean z = g0Var.k(dl.e.a) == gm.a.A;
            float f = z ? 16 : 24;
            r rVar2 = o.A;
            r rVarD = z1.d(rVar2, 1.0f);
            float f2 = 12;
            v vVarA = u.a(h0.i.g(f2), b2.b.M, g0Var, 6);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVarD, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(vVarA, g0Var, b3.h.f);
            q.I(m1VarM, g0Var, b3.h.e);
            q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            q.E(g0Var, b3.h.h);
            q.I(rVarC, g0Var, b3.h.d);
            if (z) {
                g0Var.c0(61970531);
                b(g0Var, 0);
            } else {
                g0Var.c0(61971492);
                a(g0Var, 0);
            }
            g0Var.r(false);
            e(f, g0Var, 0);
            if (z) {
                g0Var.c0(1921493431);
                g0Var.r(false);
            } else {
                g0Var.c0(1921244532);
                d(f2, 48, 0, z1.e(z1.d(h0.c.E(rVar2, f, 0.0f, 2), 1.0f), 40), g0Var);
                g0Var.r(false);
            }
            g0Var.r(true);
            rVar = rVar2;
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new bs.b(rVar, i, 27);
        }
    }

    public static final void d(float f, int i, int i2, r rVar, j jVar) {
        int i3;
        r rVar2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(894931013);
        if ((i & 6) == 0) {
            i3 = (g0Var.g(rVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= g0Var.d(f) ? 32 : 16;
        }
        if (g0Var.S(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                f = c;
            }
            float f2 = f;
            rVar2 = rVar;
            h0.o.a(rd.a.g0(f2, 6, 0L, rVar2, false), g0Var, 0);
            f = f2;
        } else {
            rVar2 = rVar;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new ix.j(rVar2, f, i, i2);
        }
    }

    public static final void e(float f, j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(773089133);
        int i2 = (g0Var.d(f) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            o oVar = o.A;
            r rVarE = h0.c.E(z1.d(oVar, 1.0f), f, 0.0f, 2);
            v1 v1VarA = t1.a(h0.i.g, b2.b.J, g0Var, 6);
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
            q.I(v1VarA, g0Var, b3.h.f);
            q.I(m1VarM, g0Var, b3.h.e);
            q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            q.E(g0Var, b3.h.h);
            q.I(rVarC, g0Var, b3.h.d);
            float f2 = 20;
            d(0.0f, 6, 2, z1.n(oVar, 140, f2), g0Var);
            d(0.0f, 6, 2, z1.n(oVar, 90, f2), g0Var);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new f(f, i, 0);
        }
    }

    public static final void f(r rVar, j jVar, int i) {
        r rVar2;
        b2.c cVar = b2.b.M;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1430880442);
        int i2 = i | 6;
        int i3 = 0;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            boolean z = g0Var.k(dl.e.a) == gm.a.A;
            int i4 = 54;
            float f = z ? 48 : 54;
            float f2 = z ? 16 : 18;
            rVar2 = o.A;
            float f3 = 1.0f;
            r rVarD = z1.d(rVar2, 1.0f);
            v vVarA = u.a(h0.i.c, cVar, g0Var, 0);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVarD, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(vVarA, g0Var, b3.h.f);
            q.I(m1VarM, g0Var, b3.h.e);
            q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            q.E(g0Var, b3.h.h);
            q.I(rVarC, g0Var, b3.h.d);
            g0Var.c0(-1840191119);
            int i5 = 0;
            while (i5 < 6) {
                float f4 = 8;
                r rVarC2 = h0.c.C(z1.d(rVar2, f3), f4);
                v1 v1VarA = t1.a(h0.i.g(f4), b2.b.K, g0Var, i4);
                int i6 = i5;
                int iHashCode2 = Long.hashCode(g0Var.T);
                m1 m1VarM2 = g0Var.m();
                r rVarC3 = b2.a.c(rVarC2, g0Var);
                b3.i.c.getClass();
                b3.g gVar2 = b3.h.b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar2);
                } else {
                    g0Var.q0();
                }
                b3.f fVar = b3.h.f;
                q.I(v1VarA, g0Var, fVar);
                b3.f fVar2 = b3.h.e;
                q.I(m1VarM2, g0Var, fVar2);
                Integer numValueOf = Integer.valueOf(iHashCode2);
                b3.f fVar3 = b3.h.g;
                q.I(numValueOf, g0Var, fVar3);
                b3.e eVar = b3.h.h;
                q.E(g0Var, eVar);
                b3.f fVar4 = b3.h.d;
                q.I(rVarC3, g0Var, fVar4);
                d(f2, i3, i3, z1.m(rVar2, f), g0Var);
                v vVarA2 = u.a(h0.i.g(f4), cVar, g0Var, 6);
                int iHashCode3 = Long.hashCode(g0Var.T);
                m1 m1VarM3 = g0Var.m();
                r rVarC4 = b2.a.c(rVar2, g0Var);
                g0Var.g0();
                b2.c cVar2 = cVar;
                if (g0Var.S) {
                    g0Var.l(gVar2);
                } else {
                    g0Var.q0();
                }
                q.I(vVarA2, g0Var, fVar);
                q.I(m1VarM3, g0Var, fVar2);
                a1.b.v(iHashCode3, g0Var, fVar3, g0Var, eVar);
                q.I(rVarC4, g0Var, fVar4);
                d(0.0f, 6, 2, z1.n(rVar2, 170, 16), g0Var);
                d(0.0f, 6, 2, z1.n(rVar2, 110, 14), g0Var);
                g0Var.r(true);
                g0Var.r(true);
                i5 = i6 + 1;
                cVar = cVar2;
                i4 = 54;
                i3 = 0;
                f3 = 1.0f;
            }
            g0Var.r(i3);
            g0Var.r(true);
        } else {
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new bs.b(rVar2, i, 28);
        }
    }
}
