package c00;

import android.content.Context;
import android.content.res.Resources;
import as.d0;
import c3.l2;
import c3.m0;
import c3.o0;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import com.mchutov.core.compose.widgets.lce.ResourceText;
import d0.t0;
import g1.n5;
import g1.o3;
import g1.t6;
import g1.v5;
import g1.v6;
import g1.w6;
import g1.z6;
import h0.a0;
import h0.c1;
import h0.n1;
import h0.p1;
import h0.t1;
import h0.v1;
import h0.z1;
import i2.b0;
import k0.y;
import kotlin.NoWhenBranchMatchedException;
import l1.g0;
import l1.m1;
import l1.q2;
import l1.r1;
import m3.r0;
import q0.i1;
import z.h1;
import z2.w0;

public abstract class a {
    public static final v1.c a = new v1.c(new bw.c(4, 0), 773573234, false);
    public static final v1.c b = new v1.c(new bw.c(5, 0), -71204581, false);
    public static final v1.c c = new v1.c(new bw.c(6, 0), 1274541223, false);
    public static final v1.c d = new v1.c(new bw.c(7, 0), -1970556858, false);
    public static final v1.c e = new v1.c(new ax.a(8), 388771552, false);

    public static final void a(t tVar, u00.k kVar, l1.j jVar, int i) {
        int i2;
        int i3;
        boolean z;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1314102169);
        if ((i & 6) == 0) {
            i2 = i | (g0Var.g(tVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.i(kVar) ? 32 : 16;
        }
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            l2 l2VarU = m0.u(g0Var);
            gm.a aVar = (gm.a) g0Var.k(dl.e.a);
            boolean zE = g0Var.e(aVar.ordinal());
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (zE || objN == obj) {
                int iOrdinal = aVar.ordinal();
                if (iOrdinal == 0) {
                    i3 = 3;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i3 = 5;
                }
                objN = Integer.valueOf(i3);
                g0Var.n0(objN);
            }
            int iIntValue = ((Number) objN).intValue();
            a0 a0Var = z1.c;
            float f = 32;
            b2.r rVarM = h0.c.M(u2.f.a(z.n.f(f2.h.c(a0Var, p0.f.c(f, f, 0.0f, 0.0f, 12)), dl.a.M, b0.b), l2VarU, (u2.d) null), h0.c.g);
            w0 w0VarD = h0.o.d(b2.b.A, false);
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
            float f2 = 16;
            int i4 = i2;
            b2.r rVarE = h0.c.E(a0Var, f2, 0.0f, 2);
            h0.v vVarA = h0.u.a(h0.i.c, b2.b.N, g0Var, 48);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarE, g0Var);
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
            kl.a.a(null, false, g0Var, 0, 3);
            b2.o oVar = b2.o.A;
            h0.c.h(z1.e(oVar, 20), g0Var);
            d(kVar, g0Var, (i4 >> 3) & 14);
            h0.c.h(z1.e(oVar, f2), g0Var);
            String str = tVar.e;
            int i5 = i4 & 112;
            boolean z2 = i5 == 32;
            Object objN2 = g0Var.N();
            if (z2 || objN2 == obj) {
                objN2 = new d0(8, kVar);
                g0Var.n0(objN2);
            }
            g(str, (u00.k) objN2, g0Var, 0);
            h0.c.h(z1.e(oVar, f2), g0Var);
            if (tVar.a) {
                g0Var.c0(1648148681);
                e(iIntValue, g0Var, 6);
                g0Var.r(false);
                z = true;
            } else {
                g0Var.c0(-446871370);
                k0.b bVar = new k0.b(iIntValue);
                b2.r rVarA = u2.f.a(h0.w.a(oVar, 1.0f), l2VarU, (u2.d) null);
                h0.f fVarG = h0.i.g(6);
                h0.f fVarG2 = h0.i.g(12);
                p1 p1VarG = h0.c.g(0.0f, 0.0f, 0.0f, 24, 7);
                boolean z3 = ((i4 & 14) == 4) | (i5 == 32);
                Object objN3 = g0Var.N();
                if (z3 || objN3 == obj) {
                    objN3 = new al.l(tVar, kVar, 4);
                    g0Var.n0(objN3);
                }
                z = true;
                kh.n.i(bVar, rVarA, (y) null, p1VarG, fVarG2, fVarG, (t0) null, false, (h1) null, (u00.k) objN3, g0Var, 1772544, 0, 916);
                g0Var.r(false);
            }
            g0Var.r(z);
            g0Var.r(z);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new i(tVar, kVar, i, 1);
        }
    }

    public static final void b(String str, b2.r rVar, l1.j jVar, int i) {
        l1.j jVar2;
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(21142629);
        int i2 = i | (jVar3.g(str) ? 4 : 2) | (jVar3.g(rVar) ? 32 : 16);
        if (jVar3.S(i2 & 1, (i2 & 19) != 18)) {
            jVar2 = jVar3;
            z6.b(str, h0.c.E(z.n.f(f2.h.c(rVar, p0.f.a(16)), dl.a.D, b0.b), 6, 0.0f, 2), dl.a.k, kh.o.z(11), (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, jVar2, (i2 & 14) | 24576, 0, 262120);
        } else {
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new m(str, rVar, i, 0);
        }
    }

    public static final void c(u00.a aVar, float f, v1.c cVar, l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1700550072);
        int i2 = (g0Var.i(aVar) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            b2.r rVarC = androidx.compose.foundation.b.c((String) null, aVar, z.n.f(f2.h.c(z1.m(b2.o.A, 44), p0.f.a), i2.t.b(f, dl.a.k), b0.b), false, 15);
            w0 w0VarD = h0.o.d(b2.b.E, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarC, g0Var);
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
            l1.q.I(rVarC2, g0Var, b3.h.d);
            cVar.invoke(g0Var, 6);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new k(aVar, f, cVar, i, 0);
        }
    }

    public static final void d(u00.k kVar, l1.j jVar, int i) {
        int i2;
        u00.k kVar2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(464455584);
        if ((i & 6) == 0) {
            i2 = i | (g0Var.i(kVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            b2.r rVarD = z1.d(b2.o.A, 1.0f);
            v1 v1VarA = t1.a(h0.i.a, b2.b.K, g0Var, 48);
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
            l1.q.I(v1VarA, g0Var, b3.h.f);
            l1.q.I(m1VarM, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC, g0Var, b3.h.d);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (z || objN == obj) {
                objN = new bt.t0(7, kVar);
                g0Var.n0(objN);
            }
            c((u00.a) objN, 0.12f, a, g0Var, 432);
            String strU = z3.U(g0Var, 2131887060);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            z6.b(strU, new c1(1.0f, true), dl.a.k, kh.o.z(17), q3.u.M, (q3.i) null, 0L, (x3.l) null, new x3.k(3), 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 0, 261032);
            g0Var = g0Var;
            boolean z2 = i3 == 4;
            Object objN2 = g0Var.N();
            if (z2 || objN2 == obj) {
                kVar2 = kVar;
                objN2 = new bt.t0(8, kVar2);
                g0Var.n0(objN2);
            } else {
                kVar2 = kVar;
            }
            c((u00.a) objN2, 0.9f, b, g0Var, 432);
            g0Var.r(true);
        } else {
            kVar2 = kVar;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new o(i, kVar2);
        }
    }

    public static final void e(int i, l1.j jVar, int i2) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-241764475);
        int i3 = (g0Var.e(i) ? 32 : 16) | i2;
        if (g0Var.S(i3 & 1, (i3 & 19) != 18)) {
            k0.b bVar = new k0.b(i);
            b2.r rVarA = h0.w.a(b2.o.A, 1.0f);
            h0.f fVarG = h0.i.g(6);
            h0.f fVarG2 = h0.i.g(24);
            Object objN = g0Var.N();
            if (objN == l1.i.a) {
                objN = new bw.b(4);
                g0Var.n0(objN);
            }
            kh.n.i(bVar, rVarA, (y) null, (n1) null, fVarG2, fVarG, (t0) null, false, (h1) null, (u00.k) objN, g0Var, 1769472, 6, 924);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new j(i, i2, 0);
        }
    }

    public static final void f(boolean z, u00.a aVar, l1.j jVar, int i) {
        u00.n nVar;
        long jB;
        g0 g0Var = (g0) jVar;
        g0Var.e0(1550323363);
        int i2 = i | (g0Var.h(z) ? 4 : 2) | (g0Var.i(aVar) ? 32 : 16);
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            b2.o oVar = b2.o.A;
            b2.r rVarE = z1.e(z1.d(oVar, 1.0f), 104);
            b2.i iVar = b2.b.A;
            w0 w0VarD = h0.o.d(iVar, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarE, g0Var);
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
            u00.n nVar2 = b3.h.d;
            l1.q.I(rVarC, g0Var, nVar2);
            b2.r rVarE2 = z1.e(z1.d(oVar, 1.0f), 96);
            b2.i iVar2 = b2.b.H;
            h0.s sVar = h0.s.a;
            b2.r rVarC2 = f2.h.c(sVar.a(rVarE2, iVar2), p0.f.a(24));
            if (z) {
                nVar = nVar2;
                jB = i2.t.b(0.1f, dl.a.i);
            } else {
                nVar = nVar2;
                jB = dl.a.M;
            }
            b2.r rVarC3 = h0.c.C(androidx.compose.foundation.b.c((String) null, aVar, z.n.f(rVarC2, jB, b0.b), false, 15), 12);
            w0 w0VarD2 = h0.o.d(iVar, false);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC4 = b2.a.c(rVarC3, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD2, g0Var, fVar);
            l1.q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            u00.n nVar3 = nVar;
            l1.q.I(rVarC4, g0Var, nVar3);
            a0 a0Var = z1.c;
            h0.v vVarA = h0.u.a(h0.i.e, b2.b.N, g0Var, 54);
            int iHashCode3 = Long.hashCode(g0Var.T);
            m1 m1VarM3 = g0Var.m();
            b2.r rVarC5 = b2.a.c(a0Var, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA, g0Var, fVar);
            l1.q.I(m1VarM3, g0Var, fVar2);
            a1.b.v(iHashCode3, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC5, g0Var, nVar3);
            b2.r rVarM = z1.m(oVar, 32);
            m2.b bVarR = y3.R(2131231346, g0Var, 0);
            long j = dl.a.k;
            o3.a(bVarR, (String) null, rVarM, j, g0Var, 440, 0);
            h0.c.h(z1.e(oVar, 8), g0Var);
            z6.b(z3.U(g0Var, 2131887063), (b2.r) null, j, kh.o.z(12), (q3.u) null, (q3.i) null, 0L, (x3.l) null, new x3.k(3), 0L, 0, false, 2, 0, (u00.k) null, (r0) null, g0Var, 24576, 24576, 244714);
            g0Var = g0Var;
            g0Var.r(true);
            if (z) {
                g0Var.c0(1380583380);
                o3.a(y3.R(2131231095, g0Var, 0), (String) null, z1.m(sVar.a(oVar, b2.b.C), 18), j, g0Var, 56, 0);
                g0Var.r(false);
            } else {
                g0Var.c0(1380903827);
                g0Var.r(false);
            }
            g0Var.r(true);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new n(z, aVar, i, 0);
        }
    }

    public static final void g(String str, u00.k kVar, l1.j jVar, int i) {
        l1.j jVar2;
        u00.n nVar;
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(-1519174162);
        int i2 = (jVar3.g(str) ? 4 : 2) | i | (jVar3.i(kVar) ? 32 : 16);
        if (jVar3.S(i2 & 1, (i2 & 19) != 18)) {
            z0.g gVarH = z0.h.h(str, jVar3, i2 & 14);
            boolean zG = jVar3.g(gVarH) | ((i2 & 112) == 32);
            Object objN = jVar3.N();
            if (zG || objN == l1.i.a) {
                objN = new s(gVarH, kVar, null, 0);
                jVar3.n0(objN);
            }
            l1.q.i(gVarH, jVar3, (u00.n) objN);
            b2.r rVarE = z1.e(z1.d(b2.o.A, 1.0f), 40);
            z0.e eVar = z0.e.B;
            p1 p1VarE = h0.c.e(16, 0.0f, 2);
            p0.e eVarA = p0.f.a(32);
            long j = dl.a.i;
            long jB = i2.t.b(0.085f, j);
            long jB2 = i2.t.b(0.085f, j);
            long jB3 = i2.t.b(0.085f, j);
            long j2 = i2.t.f;
            long j3 = dl.a.k;
            t6 t6VarA = v6.a(j3, j3, j3, jB, jB2, jB3, j2, j2, j2, i2.t.b(0.3f, j3), i2.t.b(0.3f, j3), i2.t.b(0.3f, j3), jVar3, 1207945096);
            if (str.length() > 0) {
                jVar3.c0(-1645117527);
                u00.n nVarD = v1.d.d(-1394906621, new p(gVarH, 0), jVar3);
                jVar3.r(false);
                nVar = nVarD;
            } else {
                jVar3.c0(-1644700360);
                jVar3.r(false);
                nVar = null;
            }
            jVar2 = jVar3;
            n5.c(gVarH, rVarE, false, (r0) null, (w6) null, c, d, nVar, false, (i1) null, (qp.b) null, eVar, (z.p1) null, eVarA, t6VarA, p1VarE, jVar2, 113246256, 100663296, 18611324);
        } else {
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new al.i(str, kVar, i, 5);
        }
    }

    public static final void h(t uiState, u00.k onAction, l1.j jVar, int i) {
        int i2;
        kotlin.jvm.internal.m.e(uiState, "uiState");
        kotlin.jvm.internal.m.e(onAction, "onAction");
        g0 g0Var = (g0) jVar;
        g0Var.e0(262755320);
        if ((i & 6) == 0) {
            i2 = (g0Var.g(uiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.i(onAction) ? 32 : 16;
        }
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            a(uiState, onAction, g0Var, i2 & 126);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new i(uiState, onAction, i, 0);
        }
    }

    public static final void i(zz.a aVar, zz.c cVar, boolean z, u00.a aVar2, l1.j jVar, int i) {
        Integer num;
        b2.r rVar;
        h0.s sVar;
        b2.d dVar;
        boolean z2;
        boolean z3;
        ?? r2;
        b2.d dVar2 = b2.b.C;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-92042151);
        int i2 = i | (g0Var.g(aVar) ? 4 : 2) | (g0Var.e(cVar.ordinal()) ? 32 : 16) | (g0Var.h(z) ? 256 : 128) | (g0Var.i(aVar2) ? 2048 : 1024);
        if (g0Var.S(i2 & 1, (i2 & 1171) != 1170)) {
            b2.r rVar2 = b2.o.A;
            b2.r rVarE = z1.e(z1.d(rVar2, 1.0f), 104);
            b2.i iVar = b2.b.A;
            w0 w0VarD = h0.o.d(iVar, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarE, g0Var);
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
            b2.r rVarE2 = z1.e(z1.d(rVar2, 1.0f), 96);
            b2.i iVar2 = b2.b.H;
            h0.s sVar2 = h0.s.a;
            b2.r rVarA = sVar2.a(rVarE2, iVar2);
            w0 w0VarD2 = h0.o.d(iVar, false);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarA, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD2, g0Var, fVar);
            l1.q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC2, g0Var, fVar4);
            a0 a0Var = z1.c;
            b2.r rVarC3 = h0.c.C(androidx.compose.foundation.b.c((String) null, aVar2, z.n.f(f2.h.c(a0Var, p0.f.a(24)), z ? i2.t.b(0.1f, dl.a.i) : dl.a.M, b0.b), false, 15), 12);
            w0 w0VarD3 = h0.o.d(iVar, false);
            int iHashCode3 = Long.hashCode(g0Var.T);
            m1 m1VarM3 = g0Var.m();
            b2.r rVarC4 = b2.a.c(rVarC3, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD3, g0Var, fVar);
            l1.q.I(m1VarM3, g0Var, fVar2);
            a1.b.v(iHashCode3, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC4, g0Var, fVar4);
            h0.v vVarA = h0.u.a(h0.i.e, b2.b.N, g0Var, 54);
            int iHashCode4 = Long.hashCode(g0Var.T);
            m1 m1VarM4 = g0Var.m();
            b2.r rVarC5 = b2.a.c(a0Var, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA, g0Var, fVar);
            l1.q.I(m1VarM4, g0Var, fVar2);
            a1.b.v(iHashCode4, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC5, g0Var, fVar4);
            String str = aVar.a;
            String str2 = aVar.e;
            switch (str) {
                case "bird_singing":
                    num = 2131231080;
                    break;
                case "calm_rain":
                    num = 2131231107;
                    break;
                case "calm_wind":
                    num = 2131231430;
                    break;
                case "calm_bonfire":
                    num = 2131231132;
                    break;
                case "wave_effect":
                    num = 2131231421;
                    break;
                default:
                    num = null;
                    break;
            }
            q2 q2Var = o0.b;
            wb.h hVar = new wb.h((Context) g0Var.k(q2Var));
            hVar.c = str2 == null ? num : str2;
            boolean z4 = false;
            String str3 = null;
            mb.j jVarI = mb.l.i(w.c.q(hVar, 100), (z2.p) null, g0Var, 0, 62);
            if (str2 == null && num == null) {
                g0Var.c0(-1853172305);
                rVar = rVar2;
                o3.a(y3.R(2131231344, g0Var, 0), (String) null, z1.m(rVar, 32), dl.a.k, g0Var, 440, 0);
                g0Var.r(false);
            } else {
                rVar = rVar2;
                g0Var.c0(-1853465007);
                o3.a(jVarI, (String) null, z1.m(rVar, 32), dl.a.k, g0Var, 432, 0);
                z4 = false;
                g0Var.r(false);
            }
            h0.c.h(z1.e(rVar, 8), g0Var);
            ResourceText resourceText = aVar.d;
            if (resourceText == null) {
                g0Var.c0(-1852767601);
                g0Var.r(z4);
            } else {
                g0Var.c0(-1306692686);
                Resources resources = ((Context) g0Var.k(q2Var)).getResources();
                kotlin.jvm.internal.m.d(resources, "getResources(...)");
                String strA = com.mchutov.core.compose.widgets.lce.a.a(resourceText, resources);
                g0Var.r(z4);
                str3 = strA;
            }
            if (str3 == null) {
                str3 = "";
            }
            long j = dl.a.k;
            z6.b(str3, (b2.r) null, j, kh.o.z(12), (q3.u) null, (q3.i) null, 0L, (x3.l) null, new x3.k(3), 0L, 0, false, 2, 0, (u00.k) null, (r0) null, g0Var, 24576, 24576, 244714);
            g0Var = g0Var;
            g0Var.r(true);
            int iOrdinal = cVar.ordinal();
            if (iOrdinal == 0) {
                sVar = sVar2;
                dVar = dVar2;
                z2 = false;
                g0Var.c0(1022871458);
                if (z) {
                    g0Var.c0(1644283808);
                    o3.a(y3.R(2131231095, g0Var, 0), (String) null, z1.m(sVar.a(rVar, dVar), 18), j, g0Var, 56, 0);
                    g0Var.r(false);
                } else {
                    g0Var.c0(1644666007);
                    g0Var.r(false);
                }
                g0Var.r(false);
            } else if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    dVar = dVar2;
                    g0Var.c0(1022860637);
                    sVar = sVar2;
                    z2 = false;
                    v5.a(z1.m(sVar2.a(rVar, dVar), 18), j, 2, 0L, 0, 0.0f, g0Var, 384, 56);
                    g0Var = g0Var;
                    g0Var.r(false);
                } else {
                    if (iOrdinal != 3) {
                        throw oi.k.r(g0Var, 1022858957, false);
                    }
                    g0Var.c0(1645162038);
                    dVar = dVar2;
                    o3.a(y3.R(2131231126, g0Var, 0), (String) null, z1.m(sVar2.a(rVar, dVar), 18), j, g0Var, 56, 0);
                    g0Var.r(false);
                    z3 = true;
                    sVar = sVar2;
                    r2 = 0;
                }
                g0Var.r(z3);
                if (aVar.j) {
                    g0Var.c0(-158116763);
                    b(z3.U(g0Var, 2131887061), h0.c.z(sVar.a(rVar, dVar), 6, -6), g0Var, r2);
                    g0Var.r((boolean) r2);
                } else if (aVar.i) {
                    g0Var.c0(-157715034);
                    b(z3.U(g0Var, 2131887062), h0.c.z(sVar.a(rVar, dVar), 6, -6), g0Var, r2);
                    g0Var.r((boolean) r2);
                } else {
                    g0Var.c0(-157354659);
                    g0Var.r((boolean) r2);
                }
                g0Var.r(true);
                g0Var.r(true);
            } else {
                sVar = sVar2;
                dVar = dVar2;
                z2 = false;
                g0Var.c0(1644740810);
                o3.a(y3.R(2131231121, g0Var, 0), (String) null, z1.m(sVar.a(rVar, dVar), 18), i2.t.b(0.5f, j), g0Var, 56, 0);
                g0Var.r(false);
            }
            z3 = true;
            r2 = z2;
            g0Var.r(z3);
            if (aVar.j) {
                g0Var.c0(-158116763);
                b(z3.U(g0Var, 2131887061), h0.c.z(sVar.a(rVar, dVar), 6, -6), g0Var, r2);
                g0Var.r((boolean) r2);
            } else if (aVar.i) {
                g0Var.c0(-157715034);
                b(z3.U(g0Var, 2131887062), h0.c.z(sVar.a(rVar, dVar), 6, -6), g0Var, r2);
                g0Var.r((boolean) r2);
            } else {
                g0Var.c0(-157354659);
                g0Var.r((boolean) r2);
            }
            g0Var.r(true);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new l(aVar, cVar, z, aVar2, i, 0);
        }
    }
}
