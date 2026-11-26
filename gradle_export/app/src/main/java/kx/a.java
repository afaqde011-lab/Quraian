package kx;

import android.content.Context;
import android.content.res.Configuration;
import as.h0;
import b2.o;
import b2.r;
import c3.o0;
import c3.o1;
import com.google.android.gms.internal.measurement.z3;
import ct.a0;
import eu.x;
import g1.j7;
import g1.m3;
import g1.z6;
import h0.c1;
import h0.m2;
import h0.n1;
import h0.t1;
import h0.u;
import h0.v;
import h0.v1;
import h0.x1;
import h0.z1;
import i2.b0;
import i2.t;
import i2.t0;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import jx.s;
import k0.y;
import l1.g0;
import l1.m1;
import l1.p2;
import l1.q;
import l1.r1;
import m3.r0;
import w.b2;
import w.c0;
import w.x0;
import w.y0;
import z2.d0;
import z2.p;
import z2.w0;

public abstract class a {
    public static final v1.c a = new v1.c(new eu.b(25), -269930229, false);
    public static final v1.c b = new v1.c(new eu.b(26), -1177224541, false);
    public static final v1.c c = new v1.c(new eu.b(27), -1344125012, false);
    public static final v1.c d = new v1.c(new jk.c(14), 1333323470, false);
    public static final v1.c e = new v1.c(new jk.c(15), -1295770131, false);
    public static final v1.c f = new v1.c(new eu.b(28), 1103182034, false);
    public static final v1.c g = new v1.c(new eu.b(29), -1055397735, false);

    public static final void a(String photoUrl, float f2, r rVar, l1.j jVar, int i) {
        r rVar2;
        kotlin.jvm.internal.m.e(photoUrl, "photoUrl");
        g0 g0Var = (g0) jVar;
        g0Var.e0(1007993011);
        int i2 = i | (g0Var.g(photoUrl) ? 4 : 2) | (g0Var.d(f2) ? 32 : 16) | 3072;
        if (g0Var.S(i2 & 1, (i2 & 1171) != 1170)) {
            wb.h hVar = new wb.h((Context) g0Var.k(o0.b));
            hVar.c = photoUrl.length() > 0 ? photoUrl : null;
            mb.j jVarI = mb.l.i(w.c.q(hVar, 600), (p) null, g0Var, 0, 62);
            r rVar3 = o.A;
            z.n.c(jVarI, (String) null, rd.a.g0(f2, 0, dl.a.s, f2.h.c(z1.m(rVar3, f2), p0.f.a), !(jVarI.j() instanceof mb.g)), (b2.d) null, z2.o.a, 0.0f, g0Var, 24624, 104);
            rVar2 = rVar3;
        } else {
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new c00.k(photoUrl, f2, rVar2, i, 4);
        }
    }

    public static final void b(float f2, int i, r rVar, l1.j jVar) {
        r rVar2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(2004495532);
        int i2 = (g0Var.d(f2) ? 4 : 2) | i | 48;
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            rVar2 = o.A;
            float f3 = 8;
            r rVarG = h0.c.G(z1.d(rVar2, 1.0f), 0.0f, 0.0f, 0.0f, f3, 7);
            v vVarA = u.a(h0.i.c, b2.b.N, g0Var, 48);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVarG, g0Var);
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
            ox.g.d(f2 / 2, 0, 0, z1.m(rVar2, f2), g0Var);
            h0.c.h(z1.e(rVar2, f3), g0Var);
            ox.g.d(0.0f, 0, 2, z1.n(rVar2, 0.8f * f2, 16), g0Var);
            h0.c.h(z1.e(rVar2, 6), g0Var);
            ox.g.d(0.0f, 0, 2, z1.n(rVar2, 0.5f * f2, 12), g0Var);
            g0Var.r(true);
        } else {
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new a0(f2, rVar2, i, 2);
        }
    }

    public static final void c(s uiState, u00.k onAction, l1.j jVar, int i) {
        kotlin.jvm.internal.m.e(uiState, "uiState");
        kotlin.jvm.internal.m.e(onAction, "onAction");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-641571193);
        int i2 = (g0Var.g(uiState) ? 4 : 2) | i | (g0Var.i(onAction) ? 32 : 16);
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            kk.c cVarD = kk.e.d(g0Var);
            y yVarA = k0.a0.a(0, g0Var, 3);
            p2 p2VarC = sm.a.c(yVarA, g0Var);
            r rVarF = z.n.f(z1.c, dl.a.L, b0.b);
            w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVarF, g0Var);
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
            o oVar = o.A;
            int i3 = i2 & 14;
            h.a(uiState, onAction, yVarA, kk.e.a(oVar, cVarD), g0Var, i2 & 126);
            sm.a.a(uiState.c, uiState.g ? 1.0f : ((Number) p2VarC.getValue()).floatValue(), h0.s.a.a(oVar, b2.b.B), 0.0f, g0Var, 0);
            p(((i2 << 3) & 896) | i3, uiState, cVarD, g0Var, onAction);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new al.i(uiState, onAction, i, 29);
        }
    }

    public static final void d(r rVar, l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(634937618);
        if (g0Var.S(i & 1, (i & 3) != 2)) {
            float fA = jx.q.a((gm.a) g0Var.k(dl.e.a));
            r rVarD = z1.d(rVar, 1.0f);
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
            o oVar = o.A;
            ox.g.d(0.0f, 6, 2, z1.n(oVar, 110, 20), g0Var);
            float f3 = 24;
            r rVarE = h0.c.E(z.n.e(f2.h.c(z1.d(oVar, 1.0f), p0.f.a(f3)), sg.f.P(va.a.S(new t[]{new t(dl.a.t), new t(dl.a.L)}), 0.0f, 0.0f, 14), (t0) null, 6), 0.0f, f3, 1);
            v vVarA2 = u.a(h0.i.c, b2.b.N, g0Var, 48);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            r rVarC2 = b2.a.c(rVarE, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(vVarA2, g0Var, fVar);
            q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            q.I(rVarC2, g0Var, fVar4);
            ox.g.d(fA / 2, 0, 0, z1.m(oVar, fA), g0Var);
            h0.c.h(z1.e(oVar, f2), g0Var);
            ox.g.d(0.0f, 6, 2, z1.n(oVar, 150, 18), g0Var);
            h0.c.h(z1.e(oVar, 6), g0Var);
            ox.g.d(0.0f, 6, 2, z1.n(oVar, 80, f2), g0Var);
            g0Var.r(true);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new bs.b(rVar, i, 19);
        }
    }

    public static final void e(fx.b bVar, boolean z, u30.b downloadedReciters, u00.a onClick, r rVar, String str, l1.j jVar, int i) {
        u00.n nVar;
        u00.a aVar;
        float f2;
        boolean z2;
        u00.n nVar2;
        u00.n nVar3;
        int i2;
        boolean z3;
        int i3;
        int i4;
        kotlin.jvm.internal.m.e(downloadedReciters, "downloadedReciters");
        kotlin.jvm.internal.m.e(onClick, "onClick");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-658823634);
        int i5 = i | (g0Var.g(bVar) ? 4 : 2) | (g0Var.h(z) ? 32 : 16) | (g0Var.g(downloadedReciters) ? 256 : 128) | (g0Var.i(onClick) ? 2048 : 1024) | (g0Var.g(rVar) ? 16384 : 8192) | (g0Var.g(str) ? 131072 : 65536);
        if (g0Var.S(i5 & 1, (74899 & i5) != 74898)) {
            gm.a aVar2 = (gm.a) g0Var.k(dl.e.a);
            float fA = jx.q.a(aVar2);
            bx.c cVar = bVar.c;
            boolean zR = r(cVar.a, z, downloadedReciters, g0Var, i5 & 1008);
            r rVarD = z1.d(rVar, 1.0f);
            float f3 = 12;
            v vVarA = u.a(h0.i.g(f3), b2.b.M, g0Var, 6);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVarD, g0Var);
            b3.i.c.getClass();
            u00.a aVar3 = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(aVar3);
            } else {
                g0Var.q0();
            }
            u00.n nVar4 = b3.h.f;
            q.I(vVarA, g0Var, nVar4);
            u00.n nVar5 = b3.h.e;
            q.I(m1VarM, g0Var, nVar5);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar = b3.h.g;
            q.I(numValueOf, g0Var, fVar);
            b3.e eVar = b3.h.h;
            q.E(g0Var, eVar);
            u00.n nVar6 = b3.h.d;
            q.I(rVarC, g0Var, nVar6);
            if (str == null || r30.k.L0(str)) {
                nVar = nVar5;
                aVar = aVar3;
                f2 = f3;
                z2 = zR;
                nVar2 = nVar4;
                nVar3 = nVar6;
                i2 = 6;
                z3 = false;
                i3 = 1;
                i4 = 12;
                g0Var.c0(-2124535330);
                g0Var.r(false);
            } else {
                g0Var.c0(-2124721113);
                int i6 = ((i5 >> 15) & 14) | 24576;
                i4 = 12;
                nVar = nVar5;
                f2 = f3;
                i2 = 6;
                nVar2 = nVar4;
                nVar3 = nVar6;
                i3 = 1;
                z3 = false;
                z2 = zR;
                aVar = aVar3;
                z6.b(str, (r) null, t.b(0.5f, dl.a.n), kh.o.z(15), (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(20), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, i6, 48, 260074);
                g0Var = g0Var;
                g0Var.r(false);
            }
            o oVar = o.A;
            float f4 = 24;
            r rVarE = h0.c.E(w00.a.k(w50.c.o(z.n.e(f2.h.c(z1.d(oVar, 1.0f), p0.f.a(f4)), sg.f.P(va.a.S(new t[]{new t(dl.a.t), new t(dl.a.L)}), 0.0f, 0.0f, 14), (t0) null, i2), z2, null, onClick, i2), !z2), 0.0f, f4, i3);
            v vVarA2 = u.a(h0.i.c, b2.b.N, g0Var, 48);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            r rVarC2 = b2.a.c(rVarE, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(aVar);
            } else {
                g0Var.q0();
            }
            q.I(vVarA2, g0Var, nVar2);
            u00.n nVar7 = nVar;
            q.I(m1VarM2, g0Var, nVar7);
            a1.b.v(iHashCode2, g0Var, fVar, g0Var, eVar);
            u00.n nVar8 = nVar3;
            q.I(rVarC2, g0Var, nVar8);
            w0 w0VarD = h0.o.d(b2.b.A, z3);
            int iHashCode3 = Long.hashCode(g0Var.T);
            m1 m1VarM3 = g0Var.m();
            r rVarC3 = b2.a.c(oVar, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(aVar);
            } else {
                g0Var.q0();
            }
            q.I(w0VarD, g0Var, nVar2);
            q.I(m1VarM3, g0Var, nVar7);
            a1.b.v(iHashCode3, g0Var, fVar, g0Var, eVar);
            q.I(rVarC3, g0Var, nVar8);
            a(cVar.e, fA, null, g0Var, 384);
            r rVarG = h0.c.G(h0.s.a.a(oVar, b2.b.H), 0.0f, 0.0f, 0.0f, 4, 7);
            gm.a aVar4 = gm.a.B;
            l(1, h0.c.A(rVarG, 0.0f, aVar2 == aVar4 ? 17 : 14, 1), dl.a.i, dl.a.q, q3.u.E, g0Var, 24582, 0);
            g0Var.r(true);
            h0.c.h(z1.e(oVar, f2), g0Var);
            i(cVar.b, null, g0Var, 0);
            Integer num = bVar.b;
            if (num == null) {
                g0Var.c0(660181159);
                g0Var.r(false);
            } else {
                g0Var.c0(660181160);
                g0 g0Var2 = g0Var;
                z6.b(q(g0Var, num.intValue()), (r) null, t.b(0.5f, dl.a.n), aVar2 == aVar4 ? kh.o.z(15) : kh.o.z(i4), q3.u.B, (q3.i) null, 0L, (x3.l) null, new x3.k(3), aVar2 == aVar4 ? kh.o.z(15) : kh.o.z(i4), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var2, 1572864, 0, 258986);
                g0Var = g0Var2;
                g0Var.r(false);
            }
            g0Var.r(true);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new h0(bVar, z, downloadedReciters, onClick, rVar, str, i);
        }
    }

    public static final void f(String title, r rVar, long j, l1.j jVar, int i) {
        long j2;
        r rVar2;
        String str;
        kotlin.jvm.internal.m.e(title, "title");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1536054960);
        int i2 = (g0Var.g(title) ? 4 : 2) | i | (g0Var.g(rVar) ? 256 : 128) | (g0Var.f(j) ? 2048 : 1024);
        if (g0Var.S(i2 & 1, (i2 & 1171) != 1170)) {
            g0Var.X();
            if ((i & 1) != 0 && !g0Var.A()) {
                g0Var.V();
            }
            g0Var.s();
            g0Var.c0(-2031005121);
            int i3 = i2 & 14;
            int i4 = i2 >> 3;
            n(title, rVar, j, g0Var, i3 | (i4 & 112) | (i4 & 896), 0);
            str = title;
            rVar2 = rVar;
            j2 = j;
            g0Var.r(false);
        } else {
            j2 = j;
            rVar2 = rVar;
            str = title;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new d6.c(str, rVar2, j2, i);
        }
    }

    public static final void g(int i, s uiState, kk.c cVar, l1.j jVar, u00.k onAction) {
        b3.f fVar;
        boolean z;
        boolean z2;
        u00.n nVar;
        kotlin.jvm.internal.m.e(uiState, "uiState");
        kotlin.jvm.internal.m.e(onAction, "onAction");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1765817157);
        int i2 = (g0Var.g(uiState) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= g0Var.i(onAction) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= g0Var.i(cVar) ? 256 : 128;
        }
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            Configuration configuration = (Configuration) g0Var.k(o0.a);
            n1 n1Var = (n1) g0Var.k(dq.l.a);
            WeakHashMap weakHashMap = m2.w;
            h0.t0 t0VarL = h0.c.l(h0.b.e(g0Var).g, g0Var);
            String str = uiState.c;
            float f2 = configuration.screenWidthDp;
            boolean zH = g0Var.h(uiState.g) | g0Var.d(f2) | g0Var.h(uiState.b());
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (zH || objN == obj) {
                objN = q.r(new j(uiState, f2, 0));
                g0Var.n0(objN);
            }
            p2 p2Var = (p2) objN;
            b2.i iVar = b2.b.A;
            w0 w0VarD = h0.o.d(iVar, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            o oVar = o.A;
            r rVarC = b2.a.c(oVar, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar2 = b3.h.f;
            q.I(w0VarD, g0Var, fVar2);
            u00.n nVar2 = b3.h.e;
            q.I(m1VarM, g0Var, nVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.h;
            q.E(g0Var, eVar);
            int i3 = i2;
            u00.n nVar3 = b3.h.d;
            q.I(rVarC, g0Var, nVar3);
            r rVarM = h0.c.M(z1.d(h0.c.E(oVar, 16, 0.0f, 2), 1.0f), h0.c.e);
            w0 w0VarD2 = h0.o.d(iVar, false);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            r rVarC2 = b2.a.c(rVarM, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(w0VarD2, g0Var, fVar2);
            q.I(m1VarM2, g0Var, nVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            q.I(rVarC2, g0Var, nVar3);
            p0.e eVar2 = p0.f.a;
            float f3 = 0;
            float f4 = 44;
            long jB = t.b(0.5f, dl.a.P);
            boolean z3 = (i3 & 112) == 32;
            Object objN2 = g0Var.N();
            if (z3 || objN2 == obj) {
                objN2 = new jz.t(7, onAction);
                g0Var.n0(objN2);
            }
            u00.n nVar4 = nVar2;
            w50.c.f((u00.a) objN2, cVar, null, false, false, 0.0f, new y3.f(f4), 0L, jB, 10.0f, eVar2, f3, b, g0Var, ((i3 >> 3) & 112) | 806879232, 432, 188);
            g0Var = g0Var;
            if (uiState.b()) {
                g0Var.c0(1065801892);
                r rVarD = z1.d(oVar, 1.0f);
                h0.b bVar = h0.i.b;
                b2.h hVar = b2.b.J;
                v1 v1VarA = t1.a(bVar, hVar, g0Var, 6);
                int iHashCode3 = Long.hashCode(g0Var.T);
                m1 m1VarM3 = g0Var.m();
                r rVarC3 = b2.a.c(rVarD, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                q.I(v1VarA, g0Var, fVar2);
                q.I(m1VarM3, g0Var, nVar4);
                a1.b.v(iHashCode3, g0Var, fVar3, g0Var, eVar);
                q.I(rVarC3, g0Var, nVar3);
                z2 = true;
                c0.d(!((Boolean) p2Var.getValue()).booleanValue(), (r) null, (x0) null, (y0) null, (String) null, v1.d.d(2084242616, new k(onAction, cVar, 0), g0Var), g0Var, 1572870, 30);
                g0Var.r(true);
                r rVarD2 = z1.d(oVar, 1.0f);
                v1 v1VarA2 = t1.a(bVar, hVar, g0Var, 6);
                int iHashCode4 = Long.hashCode(g0Var.T);
                m1 m1VarM4 = g0Var.m();
                r rVarC4 = b2.a.c(rVarD2, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                q.I(v1VarA2, g0Var, fVar2);
                nVar4 = nVar4;
                q.I(m1VarM4, g0Var, nVar4);
                fVar = fVar3;
                a1.b.v(iHashCode4, g0Var, fVar, g0Var, eVar);
                nVar = nVar3;
                q.I(rVarC4, g0Var, nVar);
                c0.d(((Boolean) p2Var.getValue()).booleanValue(), (r) null, (x0) null, (y0) null, (String) null, v1.d.d(-1152758303, new az.j(12, uiState, cVar, onAction), g0Var), g0Var, 1572870, 30);
                g0Var.r(true);
                z = false;
                g0Var.r(false);
            } else {
                fVar = fVar3;
                z = false;
                z2 = true;
                nVar = nVar3;
                g0Var.c0(1067845939);
                g0Var.r(false);
            }
            g0Var.r(z2);
            r rVarE = z1.e(z1.d(h0.c.G(oVar, 0.0f, 32, 0.0f, 0.0f, 13), 1.0f), t0VarL.c() + n1Var.c());
            w0 w0VarD3 = h0.o.d(b2.b.H, z);
            int iHashCode5 = Long.hashCode(g0Var.T);
            m1 m1VarM5 = g0Var.m();
            r rVarC5 = b2.a.c(rVarE, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(w0VarD3, g0Var, fVar2);
            q.I(m1VarM5, g0Var, nVar4);
            a1.b.v(iHashCode5, g0Var, fVar, g0Var, eVar);
            q.I(rVarC5, g0Var, nVar);
            j(str, null, g0Var, 384);
            g0Var.r(z2);
            g0Var.r(z2);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new l(uiState, onAction, cVar, i, 0);
        }
    }

    public static final void h(r rVar, String str, u00.k kVar, jk.a aVar, boolean z, u00.k kVar2, l1.j jVar, int i, int i2) {
        int i3;
        String str2;
        u00.k kVar3;
        jk.a aVarD;
        int i4;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int i8;
        u00.k kVar4;
        int i9;
        boolean z3;
        l1.j jVar2;
        boolean z4;
        String str3;
        u00.k kVar5;
        u00.k kVar6;
        jk.a aVar2;
        r1 r1VarT;
        int i11;
        Object obj;
        Object objN;
        u00.k kVar7;
        boolean z5;
        u00.k kVar8;
        Object objN2;
        z0.g gVarH;
        Object objN3;
        g2.t tVar;
        boolean z6;
        int i12;
        boolean z7;
        boolean z8;
        Object objN4;
        boolean z9;
        boolean zG;
        Object objN5;
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(-1583092431);
        if ((i & 6) == 0) {
            i3 = (jVar3.g(rVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                str2 = str;
                int i13 = jVar3.g(str2) ? 32 : 16;
                i3 |= i13;
            } else {
                str2 = str;
            }
            i3 |= i13;
        } else {
            str2 = str;
        }
        int i14 = i2 & 4;
        if (i14 == 0) {
            if ((i & 384) == 0) {
                kVar3 = kVar;
                i3 |= jVar3.i(kVar3) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    aVarD = aVar;
                    int i15 = jVar3.i(aVarD) ? 2048 : 1024;
                    i3 |= i15;
                } else {
                    aVarD = aVar;
                }
                i3 |= i15;
            } else {
                aVarD = aVar;
            }
            i4 = i3 | 24576;
            i5 = i2 & 32;
            if (i5 != 0) {
                if ((196608 & i) == 0) {
                    z2 = z;
                    if (jVar3.h(z2)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i4 |= i6;
                }
                i7 = 1572864 | i4;
                i8 = i2 & 128;
                if (i8 != 0) {
                    if ((12582912 & i) == 0) {
                        kVar4 = kVar2;
                        if (jVar3.i(kVar4)) {
                            i9 = 8388608;
                        } else {
                            i9 = 4194304;
                        }
                        i7 |= i9;
                    }
                    if ((i7 & 4793491) != 4793490) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (jVar3.S(i7 & 1, z3)) {
                        jVar3.X();
                        i11 = i & 1;
                        obj = l1.i.a;
                        if (i11 != 0 || jVar3.A()) {
                            if ((i2 & 2) != 0) {
                                i7 &= -113;
                                str2 = "";
                            }
                            if (i14 != 0) {
                                objN2 = jVar3.N();
                                if (objN2 == obj) {
                                    objN2 = new ks.e(19);
                                    jVar3.n0(objN2);
                                }
                                kVar3 = (u00.k) objN2;
                            }
                            if ((i2 & 8) != 0) {
                                aVarD = kk.e.d(jVar3);
                                i7 &= -7169;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if (i8 != 0) {
                                objN = jVar3.N();
                                if (objN == obj) {
                                    objN = new ks.e(20);
                                    jVar3.n0(objN);
                                }
                                kVar7 = (u00.k) objN;
                                z5 = z2;
                                kVar8 = kVar3;
                            }
                            jVar3.s();
                            gVarH = z0.h.h(str2, jVar3, (i7 >> 3) & 14);
                            objN3 = jVar3.N();
                            if (objN3 == obj) {
                                objN3 = new g2.t();
                                jVar3.n0(objN3);
                            }
                            tVar = (g2.t) objN3;
                            if ((458752 & i7) == 131072) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            i12 = 57344 & i7;
                            if (i12 == 16384) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            z8 = z6 | z7;
                            objN4 = jVar3.N();
                            if (z8 || objN4 == obj) {
                                objN4 = new ix.m(z5, tVar, null, 1);
                                jVar3.n0(objN4);
                            }
                            q.i(g00.b0.a, jVar3, (u00.n) objN4);
                            if (i12 == 16384) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            zG = z9 | jVar3.g(gVarH) | ((i7 & 896) == 256);
                            objN5 = jVar3.N();
                            if (zG || objN5 == obj) {
                                objN5 = new c00.s(gVarH, kVar8, null, 4);
                                jVar3.n0(objN5);
                            }
                            q.h(gVarH, false, (u00.n) objN5, jVar3);
                            jVar3.c0(1130356905);
                            jVar3.r(false);
                            String str4 = str2;
                            jVar2 = jVar3;
                            va.a.e(rVar.V(o.A), aVarD, p0.f.a(32), 4.0f, (b2.d) null, false, 0.0f, 0.0f, new t(t.b(0.7f, dl.a.P)), v1.d.d(1320263573, new bz.o(tVar, kVar7, str4, gVarH, 6), jVar3), jVar2, ((i7 >> 6) & 112) | 805309440, 240);
                            kVar6 = kVar7;
                            z4 = z5;
                            kVar5 = kVar8;
                            str3 = str4;
                        } else {
                            jVar3.V();
                            if ((i2 & 2) != 0) {
                                i7 &= -113;
                            }
                            if ((i2 & 8) != 0) {
                                i7 &= -7169;
                            }
                        }
                        z5 = z2;
                        kVar8 = kVar3;
                        kVar7 = kVar4;
                        jVar3.s();
                        gVarH = z0.h.h(str2, jVar3, (i7 >> 3) & 14);
                        objN3 = jVar3.N();
                        if (objN3 == obj) {
                            objN3 = new g2.t();
                            jVar3.n0(objN3);
                        }
                        tVar = (g2.t) objN3;
                        if ((458752 & i7) == 131072) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        i12 = 57344 & i7;
                        if (i12 == 16384) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        z8 = z6 | z7;
                        objN4 = jVar3.N();
                        if (z8) {
                            objN4 = new ix.m(z5, tVar, null, 1);
                            jVar3.n0(objN4);
                        } else {
                            objN4 = new ix.m(z5, tVar, null, 1);
                            jVar3.n0(objN4);
                        }
                        q.i(g00.b0.a, jVar3, (u00.n) objN4);
                        if (i12 == 16384) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        zG = z9 | jVar3.g(gVarH) | ((i7 & 896) == 256);
                        objN5 = jVar3.N();
                        if (zG) {
                            objN5 = new c00.s(gVarH, kVar8, null, 4);
                            jVar3.n0(objN5);
                        } else {
                            objN5 = new c00.s(gVarH, kVar8, null, 4);
                            jVar3.n0(objN5);
                        }
                        q.h(gVarH, false, (u00.n) objN5, jVar3);
                        jVar3.c0(1130356905);
                        jVar3.r(false);
                        String str5 = str2;
                        jVar2 = jVar3;
                        va.a.e(rVar.V(o.A), aVarD, p0.f.a(32), 4.0f, (b2.d) null, false, 0.0f, 0.0f, new t(t.b(0.7f, dl.a.P)), v1.d.d(1320263573, new bz.o(tVar, kVar7, str5, gVarH, 6), jVar3), jVar2, ((i7 >> 6) & 112) | 805309440, 240);
                        kVar6 = kVar7;
                        z4 = z5;
                        kVar5 = kVar8;
                        str3 = str5;
                    } else {
                        jVar2 = jVar3;
                        jVar2.V();
                        z4 = z2;
                        str3 = str2;
                        kVar5 = kVar3;
                        kVar6 = kVar4;
                    }
                    aVar2 = aVarD;
                    r1VarT = jVar2.t();
                    if (r1VarT != null) {
                        r1VarT.d = new m3(rVar, str3, kVar5, aVar2, z4, kVar6, i, i2);
                    }
                }
                i7 = 14155776 | i4;
                kVar4 = kVar2;
                if ((i7 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (jVar3.S(i7 & 1, z3)) {
                    jVar3.X();
                    i11 = i & 1;
                    obj = l1.i.a;
                    if (i11 != 0) {
                        if ((i2 & 2) != 0) {
                            i7 &= -113;
                            str2 = "";
                        }
                        if (i14 != 0) {
                            objN2 = jVar3.N();
                            if (objN2 == obj) {
                                objN2 = new ks.e(19);
                                jVar3.n0(objN2);
                            }
                            kVar3 = (u00.k) objN2;
                        }
                        if ((i2 & 8) != 0) {
                            aVarD = kk.e.d(jVar3);
                            i7 &= -7169;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if (i8 != 0) {
                            objN = jVar3.N();
                            if (objN == obj) {
                                objN = new ks.e(20);
                                jVar3.n0(objN);
                            }
                            kVar7 = (u00.k) objN;
                            z5 = z2;
                            kVar8 = kVar3;
                        } else {
                            z5 = z2;
                            kVar8 = kVar3;
                            kVar7 = kVar4;
                        }
                    } else {
                        if ((i2 & 2) != 0) {
                            i7 &= -113;
                            str2 = "";
                        }
                        if (i14 != 0) {
                            objN2 = jVar3.N();
                            if (objN2 == obj) {
                                objN2 = new ks.e(19);
                                jVar3.n0(objN2);
                            }
                            kVar3 = (u00.k) objN2;
                        }
                        if ((i2 & 8) != 0) {
                            aVarD = kk.e.d(jVar3);
                            i7 &= -7169;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if (i8 != 0) {
                            objN = jVar3.N();
                            if (objN == obj) {
                                objN = new ks.e(20);
                                jVar3.n0(objN);
                            }
                            kVar7 = (u00.k) objN;
                            z5 = z2;
                            kVar8 = kVar3;
                        } else {
                            z5 = z2;
                            kVar8 = kVar3;
                            kVar7 = kVar4;
                        }
                    }
                    jVar3.s();
                    gVarH = z0.h.h(str2, jVar3, (i7 >> 3) & 14);
                    objN3 = jVar3.N();
                    if (objN3 == obj) {
                        objN3 = new g2.t();
                        jVar3.n0(objN3);
                    }
                    tVar = (g2.t) objN3;
                    if ((458752 & i7) == 131072) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    i12 = 57344 & i7;
                    if (i12 == 16384) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z8 = z6 | z7;
                    objN4 = jVar3.N();
                    if (z8) {
                        objN4 = new ix.m(z5, tVar, null, 1);
                        jVar3.n0(objN4);
                    } else {
                        objN4 = new ix.m(z5, tVar, null, 1);
                        jVar3.n0(objN4);
                    }
                    q.i(g00.b0.a, jVar3, (u00.n) objN4);
                    if (i12 == 16384) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    zG = z9 | jVar3.g(gVarH) | ((i7 & 896) == 256);
                    objN5 = jVar3.N();
                    if (zG) {
                        objN5 = new c00.s(gVarH, kVar8, null, 4);
                        jVar3.n0(objN5);
                    } else {
                        objN5 = new c00.s(gVarH, kVar8, null, 4);
                        jVar3.n0(objN5);
                    }
                    q.h(gVarH, false, (u00.n) objN5, jVar3);
                    jVar3.c0(1130356905);
                    jVar3.r(false);
                    String str6 = str2;
                    jVar2 = jVar3;
                    va.a.e(rVar.V(o.A), aVarD, p0.f.a(32), 4.0f, (b2.d) null, false, 0.0f, 0.0f, new t(t.b(0.7f, dl.a.P)), v1.d.d(1320263573, new bz.o(tVar, kVar7, str6, gVarH, 6), jVar3), jVar2, ((i7 >> 6) & 112) | 805309440, 240);
                    kVar6 = kVar7;
                    z4 = z5;
                    kVar5 = kVar8;
                    str3 = str6;
                } else {
                    jVar2 = jVar3;
                    jVar2.V();
                    z4 = z2;
                    str3 = str2;
                    kVar5 = kVar3;
                    kVar6 = kVar4;
                }
                aVar2 = aVarD;
                r1VarT = jVar2.t();
                if (r1VarT != null) {
                    r1VarT.d = new m3(rVar, str3, kVar5, aVar2, z4, kVar6, i, i2);
                }
            }
            i4 = 221184 | i3;
            z2 = z;
            i7 = 1572864 | i4;
            i8 = i2 & 128;
            if (i8 != 0) {
                if ((12582912 & i) == 0) {
                    kVar4 = kVar2;
                    if (jVar3.i(kVar4)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i7 |= i9;
                }
                if ((i7 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (jVar3.S(i7 & 1, z3)) {
                    jVar3.X();
                    i11 = i & 1;
                    obj = l1.i.a;
                    if (i11 != 0) {
                        if ((i2 & 2) != 0) {
                            i7 &= -113;
                            str2 = "";
                        }
                        if (i14 != 0) {
                            objN2 = jVar3.N();
                            if (objN2 == obj) {
                                objN2 = new ks.e(19);
                                jVar3.n0(objN2);
                            }
                            kVar3 = (u00.k) objN2;
                        }
                        if ((i2 & 8) != 0) {
                            aVarD = kk.e.d(jVar3);
                            i7 &= -7169;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if (i8 != 0) {
                            objN = jVar3.N();
                            if (objN == obj) {
                                objN = new ks.e(20);
                                jVar3.n0(objN);
                            }
                            kVar7 = (u00.k) objN;
                            z5 = z2;
                            kVar8 = kVar3;
                        } else {
                            z5 = z2;
                            kVar8 = kVar3;
                            kVar7 = kVar4;
                        }
                    } else {
                        if ((i2 & 2) != 0) {
                            i7 &= -113;
                            str2 = "";
                        }
                        if (i14 != 0) {
                            objN2 = jVar3.N();
                            if (objN2 == obj) {
                                objN2 = new ks.e(19);
                                jVar3.n0(objN2);
                            }
                            kVar3 = (u00.k) objN2;
                        }
                        if ((i2 & 8) != 0) {
                            aVarD = kk.e.d(jVar3);
                            i7 &= -7169;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if (i8 != 0) {
                            objN = jVar3.N();
                            if (objN == obj) {
                                objN = new ks.e(20);
                                jVar3.n0(objN);
                            }
                            kVar7 = (u00.k) objN;
                            z5 = z2;
                            kVar8 = kVar3;
                        } else {
                            z5 = z2;
                            kVar8 = kVar3;
                            kVar7 = kVar4;
                        }
                    }
                    jVar3.s();
                    gVarH = z0.h.h(str2, jVar3, (i7 >> 3) & 14);
                    objN3 = jVar3.N();
                    if (objN3 == obj) {
                        objN3 = new g2.t();
                        jVar3.n0(objN3);
                    }
                    tVar = (g2.t) objN3;
                    if ((458752 & i7) == 131072) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    i12 = 57344 & i7;
                    if (i12 == 16384) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z8 = z6 | z7;
                    objN4 = jVar3.N();
                    if (z8) {
                        objN4 = new ix.m(z5, tVar, null, 1);
                        jVar3.n0(objN4);
                    } else {
                        objN4 = new ix.m(z5, tVar, null, 1);
                        jVar3.n0(objN4);
                    }
                    q.i(g00.b0.a, jVar3, (u00.n) objN4);
                    if (i12 == 16384) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    zG = z9 | jVar3.g(gVarH) | ((i7 & 896) == 256);
                    objN5 = jVar3.N();
                    if (zG) {
                        objN5 = new c00.s(gVarH, kVar8, null, 4);
                        jVar3.n0(objN5);
                    } else {
                        objN5 = new c00.s(gVarH, kVar8, null, 4);
                        jVar3.n0(objN5);
                    }
                    q.h(gVarH, false, (u00.n) objN5, jVar3);
                    jVar3.c0(1130356905);
                    jVar3.r(false);
                    String str7 = str2;
                    jVar2 = jVar3;
                    va.a.e(rVar.V(o.A), aVarD, p0.f.a(32), 4.0f, (b2.d) null, false, 0.0f, 0.0f, new t(t.b(0.7f, dl.a.P)), v1.d.d(1320263573, new bz.o(tVar, kVar7, str7, gVarH, 6), jVar3), jVar2, ((i7 >> 6) & 112) | 805309440, 240);
                    kVar6 = kVar7;
                    z4 = z5;
                    kVar5 = kVar8;
                    str3 = str7;
                } else {
                    jVar2 = jVar3;
                    jVar2.V();
                    z4 = z2;
                    str3 = str2;
                    kVar5 = kVar3;
                    kVar6 = kVar4;
                }
                aVar2 = aVarD;
                r1VarT = jVar2.t();
                if (r1VarT != null) {
                    r1VarT.d = new m3(rVar, str3, kVar5, aVar2, z4, kVar6, i, i2);
                }
            }
            i7 = 14155776 | i4;
            kVar4 = kVar2;
            if ((i7 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (jVar3.S(i7 & 1, z3)) {
                jVar3.X();
                i11 = i & 1;
                obj = l1.i.a;
                if (i11 != 0) {
                    if ((i2 & 2) != 0) {
                        i7 &= -113;
                        str2 = "";
                    }
                    if (i14 != 0) {
                        objN2 = jVar3.N();
                        if (objN2 == obj) {
                            objN2 = new ks.e(19);
                            jVar3.n0(objN2);
                        }
                        kVar3 = (u00.k) objN2;
                    }
                    if ((i2 & 8) != 0) {
                        aVarD = kk.e.d(jVar3);
                        i7 &= -7169;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if (i8 != 0) {
                        objN = jVar3.N();
                        if (objN == obj) {
                            objN = new ks.e(20);
                            jVar3.n0(objN);
                        }
                        kVar7 = (u00.k) objN;
                        z5 = z2;
                        kVar8 = kVar3;
                    } else {
                        z5 = z2;
                        kVar8 = kVar3;
                        kVar7 = kVar4;
                    }
                } else {
                    if ((i2 & 2) != 0) {
                        i7 &= -113;
                        str2 = "";
                    }
                    if (i14 != 0) {
                        objN2 = jVar3.N();
                        if (objN2 == obj) {
                            objN2 = new ks.e(19);
                            jVar3.n0(objN2);
                        }
                        kVar3 = (u00.k) objN2;
                    }
                    if ((i2 & 8) != 0) {
                        aVarD = kk.e.d(jVar3);
                        i7 &= -7169;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if (i8 != 0) {
                        objN = jVar3.N();
                        if (objN == obj) {
                            objN = new ks.e(20);
                            jVar3.n0(objN);
                        }
                        kVar7 = (u00.k) objN;
                        z5 = z2;
                        kVar8 = kVar3;
                    } else {
                        z5 = z2;
                        kVar8 = kVar3;
                        kVar7 = kVar4;
                    }
                }
                jVar3.s();
                gVarH = z0.h.h(str2, jVar3, (i7 >> 3) & 14);
                objN3 = jVar3.N();
                if (objN3 == obj) {
                    objN3 = new g2.t();
                    jVar3.n0(objN3);
                }
                tVar = (g2.t) objN3;
                if ((458752 & i7) == 131072) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                i12 = 57344 & i7;
                if (i12 == 16384) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = z6 | z7;
                objN4 = jVar3.N();
                if (z8) {
                    objN4 = new ix.m(z5, tVar, null, 1);
                    jVar3.n0(objN4);
                } else {
                    objN4 = new ix.m(z5, tVar, null, 1);
                    jVar3.n0(objN4);
                }
                q.i(g00.b0.a, jVar3, (u00.n) objN4);
                if (i12 == 16384) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                zG = z9 | jVar3.g(gVarH) | ((i7 & 896) == 256);
                objN5 = jVar3.N();
                if (zG) {
                    objN5 = new c00.s(gVarH, kVar8, null, 4);
                    jVar3.n0(objN5);
                } else {
                    objN5 = new c00.s(gVarH, kVar8, null, 4);
                    jVar3.n0(objN5);
                }
                q.h(gVarH, false, (u00.n) objN5, jVar3);
                jVar3.c0(1130356905);
                jVar3.r(false);
                String str8 = str2;
                jVar2 = jVar3;
                va.a.e(rVar.V(o.A), aVarD, p0.f.a(32), 4.0f, (b2.d) null, false, 0.0f, 0.0f, new t(t.b(0.7f, dl.a.P)), v1.d.d(1320263573, new bz.o(tVar, kVar7, str8, gVarH, 6), jVar3), jVar2, ((i7 >> 6) & 112) | 805309440, 240);
                kVar6 = kVar7;
                z4 = z5;
                kVar5 = kVar8;
                str3 = str8;
            } else {
                jVar2 = jVar3;
                jVar2.V();
                z4 = z2;
                str3 = str2;
                kVar5 = kVar3;
                kVar6 = kVar4;
            }
            aVar2 = aVarD;
            r1VarT = jVar2.t();
            if (r1VarT != null) {
                r1VarT.d = new m3(rVar, str3, kVar5, aVar2, z4, kVar6, i, i2);
            }
        }
        i3 |= 384;
        kVar3 = kVar;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                aVarD = aVar;
                if (jVar3.i(aVarD)) {
                }
                i3 |= i15;
            } else {
                aVarD = aVar;
            }
            i3 |= i15;
        } else {
            aVarD = aVar;
        }
        i4 = i3 | 24576;
        i5 = i2 & 32;
        if (i5 != 0) {
            if ((196608 & i) == 0) {
                z2 = z;
                if (jVar3.h(z2)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i4 |= i6;
            }
            i7 = 1572864 | i4;
            i8 = i2 & 128;
            if (i8 != 0) {
                if ((12582912 & i) == 0) {
                    kVar4 = kVar2;
                    if (jVar3.i(kVar4)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i7 |= i9;
                }
                if ((i7 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (jVar3.S(i7 & 1, z3)) {
                    jVar3.X();
                    i11 = i & 1;
                    obj = l1.i.a;
                    if (i11 != 0) {
                        if ((i2 & 2) != 0) {
                            i7 &= -113;
                            str2 = "";
                        }
                        if (i14 != 0) {
                            objN2 = jVar3.N();
                            if (objN2 == obj) {
                                objN2 = new ks.e(19);
                                jVar3.n0(objN2);
                            }
                            kVar3 = (u00.k) objN2;
                        }
                        if ((i2 & 8) != 0) {
                            aVarD = kk.e.d(jVar3);
                            i7 &= -7169;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if (i8 != 0) {
                            objN = jVar3.N();
                            if (objN == obj) {
                                objN = new ks.e(20);
                                jVar3.n0(objN);
                            }
                            kVar7 = (u00.k) objN;
                            z5 = z2;
                            kVar8 = kVar3;
                        } else {
                            z5 = z2;
                            kVar8 = kVar3;
                            kVar7 = kVar4;
                        }
                    } else {
                        if ((i2 & 2) != 0) {
                            i7 &= -113;
                            str2 = "";
                        }
                        if (i14 != 0) {
                            objN2 = jVar3.N();
                            if (objN2 == obj) {
                                objN2 = new ks.e(19);
                                jVar3.n0(objN2);
                            }
                            kVar3 = (u00.k) objN2;
                        }
                        if ((i2 & 8) != 0) {
                            aVarD = kk.e.d(jVar3);
                            i7 &= -7169;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if (i8 != 0) {
                            objN = jVar3.N();
                            if (objN == obj) {
                                objN = new ks.e(20);
                                jVar3.n0(objN);
                            }
                            kVar7 = (u00.k) objN;
                            z5 = z2;
                            kVar8 = kVar3;
                        } else {
                            z5 = z2;
                            kVar8 = kVar3;
                            kVar7 = kVar4;
                        }
                    }
                    jVar3.s();
                    gVarH = z0.h.h(str2, jVar3, (i7 >> 3) & 14);
                    objN3 = jVar3.N();
                    if (objN3 == obj) {
                        objN3 = new g2.t();
                        jVar3.n0(objN3);
                    }
                    tVar = (g2.t) objN3;
                    if ((458752 & i7) == 131072) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    i12 = 57344 & i7;
                    if (i12 == 16384) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z8 = z6 | z7;
                    objN4 = jVar3.N();
                    if (z8) {
                        objN4 = new ix.m(z5, tVar, null, 1);
                        jVar3.n0(objN4);
                    } else {
                        objN4 = new ix.m(z5, tVar, null, 1);
                        jVar3.n0(objN4);
                    }
                    q.i(g00.b0.a, jVar3, (u00.n) objN4);
                    if (i12 == 16384) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    zG = z9 | jVar3.g(gVarH) | ((i7 & 896) == 256);
                    objN5 = jVar3.N();
                    if (zG) {
                        objN5 = new c00.s(gVarH, kVar8, null, 4);
                        jVar3.n0(objN5);
                    } else {
                        objN5 = new c00.s(gVarH, kVar8, null, 4);
                        jVar3.n0(objN5);
                    }
                    q.h(gVarH, false, (u00.n) objN5, jVar3);
                    jVar3.c0(1130356905);
                    jVar3.r(false);
                    String str9 = str2;
                    jVar2 = jVar3;
                    va.a.e(rVar.V(o.A), aVarD, p0.f.a(32), 4.0f, (b2.d) null, false, 0.0f, 0.0f, new t(t.b(0.7f, dl.a.P)), v1.d.d(1320263573, new bz.o(tVar, kVar7, str9, gVarH, 6), jVar3), jVar2, ((i7 >> 6) & 112) | 805309440, 240);
                    kVar6 = kVar7;
                    z4 = z5;
                    kVar5 = kVar8;
                    str3 = str9;
                } else {
                    jVar2 = jVar3;
                    jVar2.V();
                    z4 = z2;
                    str3 = str2;
                    kVar5 = kVar3;
                    kVar6 = kVar4;
                }
                aVar2 = aVarD;
                r1VarT = jVar2.t();
                if (r1VarT != null) {
                    r1VarT.d = new m3(rVar, str3, kVar5, aVar2, z4, kVar6, i, i2);
                }
            }
            i7 = 14155776 | i4;
            kVar4 = kVar2;
            if ((i7 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (jVar3.S(i7 & 1, z3)) {
                jVar3.X();
                i11 = i & 1;
                obj = l1.i.a;
                if (i11 != 0) {
                    if ((i2 & 2) != 0) {
                        i7 &= -113;
                        str2 = "";
                    }
                    if (i14 != 0) {
                        objN2 = jVar3.N();
                        if (objN2 == obj) {
                            objN2 = new ks.e(19);
                            jVar3.n0(objN2);
                        }
                        kVar3 = (u00.k) objN2;
                    }
                    if ((i2 & 8) != 0) {
                        aVarD = kk.e.d(jVar3);
                        i7 &= -7169;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if (i8 != 0) {
                        objN = jVar3.N();
                        if (objN == obj) {
                            objN = new ks.e(20);
                            jVar3.n0(objN);
                        }
                        kVar7 = (u00.k) objN;
                        z5 = z2;
                        kVar8 = kVar3;
                    } else {
                        z5 = z2;
                        kVar8 = kVar3;
                        kVar7 = kVar4;
                    }
                } else {
                    if ((i2 & 2) != 0) {
                        i7 &= -113;
                        str2 = "";
                    }
                    if (i14 != 0) {
                        objN2 = jVar3.N();
                        if (objN2 == obj) {
                            objN2 = new ks.e(19);
                            jVar3.n0(objN2);
                        }
                        kVar3 = (u00.k) objN2;
                    }
                    if ((i2 & 8) != 0) {
                        aVarD = kk.e.d(jVar3);
                        i7 &= -7169;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if (i8 != 0) {
                        objN = jVar3.N();
                        if (objN == obj) {
                            objN = new ks.e(20);
                            jVar3.n0(objN);
                        }
                        kVar7 = (u00.k) objN;
                        z5 = z2;
                        kVar8 = kVar3;
                    } else {
                        z5 = z2;
                        kVar8 = kVar3;
                        kVar7 = kVar4;
                    }
                }
                jVar3.s();
                gVarH = z0.h.h(str2, jVar3, (i7 >> 3) & 14);
                objN3 = jVar3.N();
                if (objN3 == obj) {
                    objN3 = new g2.t();
                    jVar3.n0(objN3);
                }
                tVar = (g2.t) objN3;
                if ((458752 & i7) == 131072) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                i12 = 57344 & i7;
                if (i12 == 16384) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = z6 | z7;
                objN4 = jVar3.N();
                if (z8) {
                    objN4 = new ix.m(z5, tVar, null, 1);
                    jVar3.n0(objN4);
                } else {
                    objN4 = new ix.m(z5, tVar, null, 1);
                    jVar3.n0(objN4);
                }
                q.i(g00.b0.a, jVar3, (u00.n) objN4);
                if (i12 == 16384) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                zG = z9 | jVar3.g(gVarH) | ((i7 & 896) == 256);
                objN5 = jVar3.N();
                if (zG) {
                    objN5 = new c00.s(gVarH, kVar8, null, 4);
                    jVar3.n0(objN5);
                } else {
                    objN5 = new c00.s(gVarH, kVar8, null, 4);
                    jVar3.n0(objN5);
                }
                q.h(gVarH, false, (u00.n) objN5, jVar3);
                jVar3.c0(1130356905);
                jVar3.r(false);
                String str10 = str2;
                jVar2 = jVar3;
                va.a.e(rVar.V(o.A), aVarD, p0.f.a(32), 4.0f, (b2.d) null, false, 0.0f, 0.0f, new t(t.b(0.7f, dl.a.P)), v1.d.d(1320263573, new bz.o(tVar, kVar7, str10, gVarH, 6), jVar3), jVar2, ((i7 >> 6) & 112) | 805309440, 240);
                kVar6 = kVar7;
                z4 = z5;
                kVar5 = kVar8;
                str3 = str10;
            } else {
                jVar2 = jVar3;
                jVar2.V();
                z4 = z2;
                str3 = str2;
                kVar5 = kVar3;
                kVar6 = kVar4;
            }
            aVar2 = aVarD;
            r1VarT = jVar2.t();
            if (r1VarT != null) {
                r1VarT.d = new m3(rVar, str3, kVar5, aVar2, z4, kVar6, i, i2);
            }
        }
        i4 = 221184 | i3;
        z2 = z;
        i7 = 1572864 | i4;
        i8 = i2 & 128;
        if (i8 != 0) {
            if ((12582912 & i) == 0) {
                kVar4 = kVar2;
                if (jVar3.i(kVar4)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i7 |= i9;
            }
            if ((i7 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (jVar3.S(i7 & 1, z3)) {
                jVar3.X();
                i11 = i & 1;
                obj = l1.i.a;
                if (i11 != 0) {
                    if ((i2 & 2) != 0) {
                        i7 &= -113;
                        str2 = "";
                    }
                    if (i14 != 0) {
                        objN2 = jVar3.N();
                        if (objN2 == obj) {
                            objN2 = new ks.e(19);
                            jVar3.n0(objN2);
                        }
                        kVar3 = (u00.k) objN2;
                    }
                    if ((i2 & 8) != 0) {
                        aVarD = kk.e.d(jVar3);
                        i7 &= -7169;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if (i8 != 0) {
                        objN = jVar3.N();
                        if (objN == obj) {
                            objN = new ks.e(20);
                            jVar3.n0(objN);
                        }
                        kVar7 = (u00.k) objN;
                        z5 = z2;
                        kVar8 = kVar3;
                    } else {
                        z5 = z2;
                        kVar8 = kVar3;
                        kVar7 = kVar4;
                    }
                } else {
                    if ((i2 & 2) != 0) {
                        i7 &= -113;
                        str2 = "";
                    }
                    if (i14 != 0) {
                        objN2 = jVar3.N();
                        if (objN2 == obj) {
                            objN2 = new ks.e(19);
                            jVar3.n0(objN2);
                        }
                        kVar3 = (u00.k) objN2;
                    }
                    if ((i2 & 8) != 0) {
                        aVarD = kk.e.d(jVar3);
                        i7 &= -7169;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if (i8 != 0) {
                        objN = jVar3.N();
                        if (objN == obj) {
                            objN = new ks.e(20);
                            jVar3.n0(objN);
                        }
                        kVar7 = (u00.k) objN;
                        z5 = z2;
                        kVar8 = kVar3;
                    } else {
                        z5 = z2;
                        kVar8 = kVar3;
                        kVar7 = kVar4;
                    }
                }
                jVar3.s();
                gVarH = z0.h.h(str2, jVar3, (i7 >> 3) & 14);
                objN3 = jVar3.N();
                if (objN3 == obj) {
                    objN3 = new g2.t();
                    jVar3.n0(objN3);
                }
                tVar = (g2.t) objN3;
                if ((458752 & i7) == 131072) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                i12 = 57344 & i7;
                if (i12 == 16384) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = z6 | z7;
                objN4 = jVar3.N();
                if (z8) {
                    objN4 = new ix.m(z5, tVar, null, 1);
                    jVar3.n0(objN4);
                } else {
                    objN4 = new ix.m(z5, tVar, null, 1);
                    jVar3.n0(objN4);
                }
                q.i(g00.b0.a, jVar3, (u00.n) objN4);
                if (i12 == 16384) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                zG = z9 | jVar3.g(gVarH) | ((i7 & 896) == 256);
                objN5 = jVar3.N();
                if (zG) {
                    objN5 = new c00.s(gVarH, kVar8, null, 4);
                    jVar3.n0(objN5);
                } else {
                    objN5 = new c00.s(gVarH, kVar8, null, 4);
                    jVar3.n0(objN5);
                }
                q.h(gVarH, false, (u00.n) objN5, jVar3);
                jVar3.c0(1130356905);
                jVar3.r(false);
                String str11 = str2;
                jVar2 = jVar3;
                va.a.e(rVar.V(o.A), aVarD, p0.f.a(32), 4.0f, (b2.d) null, false, 0.0f, 0.0f, new t(t.b(0.7f, dl.a.P)), v1.d.d(1320263573, new bz.o(tVar, kVar7, str11, gVarH, 6), jVar3), jVar2, ((i7 >> 6) & 112) | 805309440, 240);
                kVar6 = kVar7;
                z4 = z5;
                kVar5 = kVar8;
                str3 = str11;
            } else {
                jVar2 = jVar3;
                jVar2.V();
                z4 = z2;
                str3 = str2;
                kVar5 = kVar3;
                kVar6 = kVar4;
            }
            aVar2 = aVarD;
            r1VarT = jVar2.t();
            if (r1VarT != null) {
                r1VarT.d = new m3(rVar, str3, kVar5, aVar2, z4, kVar6, i, i2);
            }
        }
        i7 = 14155776 | i4;
        kVar4 = kVar2;
        if ((i7 & 4793491) != 4793490) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (jVar3.S(i7 & 1, z3)) {
            jVar3.X();
            i11 = i & 1;
            obj = l1.i.a;
            if (i11 != 0) {
                if ((i2 & 2) != 0) {
                    i7 &= -113;
                    str2 = "";
                }
                if (i14 != 0) {
                    objN2 = jVar3.N();
                    if (objN2 == obj) {
                        objN2 = new ks.e(19);
                        jVar3.n0(objN2);
                    }
                    kVar3 = (u00.k) objN2;
                }
                if ((i2 & 8) != 0) {
                    aVarD = kk.e.d(jVar3);
                    i7 &= -7169;
                }
                if (i5 != 0) {
                    z2 = true;
                }
                if (i8 != 0) {
                    objN = jVar3.N();
                    if (objN == obj) {
                        objN = new ks.e(20);
                        jVar3.n0(objN);
                    }
                    kVar7 = (u00.k) objN;
                    z5 = z2;
                    kVar8 = kVar3;
                } else {
                    z5 = z2;
                    kVar8 = kVar3;
                    kVar7 = kVar4;
                }
            } else {
                if ((i2 & 2) != 0) {
                    i7 &= -113;
                    str2 = "";
                }
                if (i14 != 0) {
                    objN2 = jVar3.N();
                    if (objN2 == obj) {
                        objN2 = new ks.e(19);
                        jVar3.n0(objN2);
                    }
                    kVar3 = (u00.k) objN2;
                }
                if ((i2 & 8) != 0) {
                    aVarD = kk.e.d(jVar3);
                    i7 &= -7169;
                }
                if (i5 != 0) {
                    z2 = true;
                }
                if (i8 != 0) {
                    objN = jVar3.N();
                    if (objN == obj) {
                        objN = new ks.e(20);
                        jVar3.n0(objN);
                    }
                    kVar7 = (u00.k) objN;
                    z5 = z2;
                    kVar8 = kVar3;
                } else {
                    z5 = z2;
                    kVar8 = kVar3;
                    kVar7 = kVar4;
                }
            }
            jVar3.s();
            gVarH = z0.h.h(str2, jVar3, (i7 >> 3) & 14);
            objN3 = jVar3.N();
            if (objN3 == obj) {
                objN3 = new g2.t();
                jVar3.n0(objN3);
            }
            tVar = (g2.t) objN3;
            if ((458752 & i7) == 131072) {
                z6 = true;
            } else {
                z6 = false;
            }
            i12 = 57344 & i7;
            if (i12 == 16384) {
                z7 = true;
            } else {
                z7 = false;
            }
            z8 = z6 | z7;
            objN4 = jVar3.N();
            if (z8) {
                objN4 = new ix.m(z5, tVar, null, 1);
                jVar3.n0(objN4);
            } else {
                objN4 = new ix.m(z5, tVar, null, 1);
                jVar3.n0(objN4);
            }
            q.i(g00.b0.a, jVar3, (u00.n) objN4);
            if (i12 == 16384) {
                z9 = true;
            } else {
                z9 = false;
            }
            zG = z9 | jVar3.g(gVarH) | ((i7 & 896) == 256);
            objN5 = jVar3.N();
            if (zG) {
                objN5 = new c00.s(gVarH, kVar8, null, 4);
                jVar3.n0(objN5);
            } else {
                objN5 = new c00.s(gVarH, kVar8, null, 4);
                jVar3.n0(objN5);
            }
            q.h(gVarH, false, (u00.n) objN5, jVar3);
            jVar3.c0(1130356905);
            jVar3.r(false);
            String str12 = str2;
            jVar2 = jVar3;
            va.a.e(rVar.V(o.A), aVarD, p0.f.a(32), 4.0f, (b2.d) null, false, 0.0f, 0.0f, new t(t.b(0.7f, dl.a.P)), v1.d.d(1320263573, new bz.o(tVar, kVar7, str12, gVarH, 6), jVar3), jVar2, ((i7 >> 6) & 112) | 805309440, 240);
            kVar6 = kVar7;
            z4 = z5;
            kVar5 = kVar8;
            str3 = str12;
        } else {
            jVar2 = jVar3;
            jVar2.V();
            z4 = z2;
            str3 = str2;
            kVar5 = kVar3;
            kVar6 = kVar4;
        }
        aVar2 = aVarD;
        r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new m3(rVar, str3, kVar5, aVar2, z4, kVar6, i, i2);
        }
    }

    public static final void i(String name, r rVar, l1.j jVar, int i) {
        l1.j jVar2;
        r rVar2;
        kotlin.jvm.internal.m.e(name, "name");
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(1149359536);
        int i2 = i | (jVar3.g(name) ? 4 : 2) | 48;
        if (jVar3.S(i2 & 1, (i2 & 19) != 18)) {
            long jZ = kh.o.z(16);
            long jZ2 = kh.o.z(20);
            q3.u uVar = q3.u.B;
            jVar2 = jVar3;
            rVar2 = o.A;
            z6.b(name, rVar2, dl.a.k, jZ, uVar, (q3.i) null, 0L, (x3.l) null, new x3.k(3), jZ2, 2, false, 1, 0, (u00.k) null, (r0) null, jVar2, (i2 & 14) | 1597488, 25008, 238504);
        } else {
            jVar2 = jVar3;
            jVar2.V();
            rVar2 = rVar;
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new c00.m(name, rVar2, i, 5);
        }
    }

    public static final void j(String title, r rVar, l1.j jVar, int i) {
        r rVar2;
        kotlin.jvm.internal.m.e(title, "title");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1496594215);
        int i2 = i | (g0Var.g(title) ? 4 : 2) | 48;
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            g0Var.c0(1018019960);
            long jZ = kh.o.z(18);
            q3.u uVar = q3.u.C;
            r rVar3 = o.A;
            z6.b(title, rVar3, dl.a.k, jZ, uVar, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, (i2 & 14) | 1597488, 0, 262056);
            rVar2 = rVar3;
            g0Var = g0Var;
            g0Var.r(false);
        } else {
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new c00.m(title, rVar2, i, 6);
        }
    }

    public static final void k(int i, s uiState, kk.c cVar, l1.j jVar, u00.k onAction) {
        u00.k kVar;
        Object obj;
        boolean z;
        Object objN;
        boolean z2;
        Object objN2;
        j7 j7Var = h0.c.e;
        b2.h hVar = b2.b.K;
        b2.g gVar = b2.b.M;
        kotlin.jvm.internal.m.e(uiState, "uiState");
        kotlin.jvm.internal.m.e(onAction, "onAction");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1883493975);
        int i2 = (g0Var.g(uiState) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= g0Var.i(onAction) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= g0Var.i(cVar) ? 256 : 128;
        }
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            y3.c cVar2 = (y3.c) g0Var.k(o1.h);
            int i3 = i2 & 112;
            boolean z3 = i3 == 32;
            Object objN3 = g0Var.N();
            l1.c cVar3 = l1.i.a;
            if (z3 || objN3 == cVar3) {
                objN3 = new m(0, null, onAction);
                g0Var.n0(objN3);
            }
            q.i(g00.b0.a, g0Var, (u00.n) objN3);
            boolean z4 = uiState.g;
            o oVar = o.A;
            if (z4) {
                g0Var.c0(-1715857107);
                r rVarM = h0.c.M(z1.d(oVar, 1.0f), j7Var);
                h0.d dVar = h0.i.c;
                v vVarA = u.a(dVar, gVar, g0Var, 0);
                int iHashCode = Long.hashCode(g0Var.T);
                m1 m1VarM = g0Var.m();
                r rVarC = b2.a.c(rVarM, g0Var);
                b3.i.c.getClass();
                b3.g gVar2 = b3.h.b;
                g0Var.g0();
                int i4 = i2;
                if (g0Var.S) {
                    g0Var.l(gVar2);
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
                r rVarD = z1.d(oVar, 1.0f);
                boolean zG = (i3 == 32) | g0Var.g(cVar2);
                Object objN4 = g0Var.N();
                if (zG || objN4 == cVar3) {
                    objN4 = new jk.i(onAction, cVar2, 2);
                    g0Var.n0(objN4);
                }
                r rVarO = d0.o(rVarD, (u00.k) objN4);
                v vVarA2 = u.a(dVar, gVar, g0Var, 0);
                int iHashCode2 = Long.hashCode(g0Var.T);
                m1 m1VarM2 = g0Var.m();
                r rVarC2 = b2.a.c(rVarO, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar2);
                } else {
                    g0Var.q0();
                }
                q.I(vVarA2, g0Var, fVar);
                q.I(m1VarM2, g0Var, fVar2);
                a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
                q.I(rVarC2, g0Var, fVar4);
                h0.c.h(z1.e(oVar, sm.a.a), g0Var);
                r rVarD2 = z1.d(h0.c.E(oVar, 16, 0.0f, 2), 1.0f);
                v1 v1VarA = t1.a(h0.i.g(8), hVar, g0Var, 54);
                int iHashCode3 = Long.hashCode(g0Var.T);
                m1 m1VarM3 = g0Var.m();
                r rVarC3 = b2.a.c(rVarD2, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar2);
                } else {
                    g0Var.q0();
                }
                q.I(v1VarA, g0Var, fVar);
                q.I(m1VarM3, g0Var, fVar2);
                a1.b.v(iHashCode3, g0Var, fVar3, g0Var, eVar);
                q.I(rVarC3, g0Var, fVar4);
                if (1.0f <= 0.0d) {
                    i0.a.a("invalid weight; must be greater than zero");
                }
                r rVarE = z1.e(new c1(1.0f, true), 40);
                String str = uiState.f;
                boolean z5 = i3 == 32;
                Object objN5 = g0Var.N();
                if (z5) {
                    obj = cVar3;
                } else {
                    obj = cVar3;
                    if (objN5 != obj) {
                        kVar = onAction;
                    }
                    u00.k kVar2 = (u00.k) objN5;
                    if (i3 == 32) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objN = g0Var.N();
                    if (z || objN == obj) {
                        objN = new hv.j(17, kVar);
                        g0Var.n0(objN);
                    }
                    Object obj2 = obj;
                    h(rVarE, str, kVar2, cVar, false, (u00.k) objN, g0Var, (i4 << 3) & 7168, 112);
                    p0.e eVar2 = p0.f.a;
                    float f2 = 0;
                    float f3 = 44;
                    long jB = t.b(0.5f, dl.a.P);
                    if (i3 == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objN2 = g0Var.N();
                    if (z2 || objN2 == obj2) {
                        objN2 = new jz.t(9, kVar);
                        g0Var.n0(objN2);
                    }
                    w50.c.f((u00.a) objN2, cVar, null, false, false, 0.0f, new y3.f(f3), 0L, jB, 10.0f, eVar2, f2, f, g0Var, ((i4 >> 3) & 112) | 806879232, 432, 188);
                    g0Var = g0Var;
                    g0Var.r(true);
                    g0Var.r(true);
                    g0Var.r(true);
                    g0Var.r(false);
                }
                kVar = onAction;
                objN5 = new hv.j(16, kVar);
                g0Var.n0(objN5);
                u00.k kVar3 = (u00.k) objN5;
                if (i3 == 32) {
                    z = true;
                } else {
                    z = false;
                }
                objN = g0Var.N();
                if (z) {
                    objN = new hv.j(17, kVar);
                    g0Var.n0(objN);
                } else {
                    objN = new hv.j(17, kVar);
                    g0Var.n0(objN);
                }
                Object obj3 = obj;
                h(rVarE, str, kVar3, cVar, false, (u00.k) objN, g0Var, (i4 << 3) & 7168, 112);
                p0.e eVar3 = p0.f.a;
                float f4 = 0;
                float f5 = 44;
                long jB2 = t.b(0.5f, dl.a.P);
                if (i3 == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objN2 = g0Var.N();
                if (z2) {
                    objN2 = new jz.t(9, kVar);
                    g0Var.n0(objN2);
                } else {
                    objN2 = new jz.t(9, kVar);
                    g0Var.n0(objN2);
                }
                w50.c.f((u00.a) objN2, cVar, null, false, false, 0.0f, new y3.f(f5), 0L, jB2, 10.0f, eVar3, f4, f, g0Var, ((i4 >> 3) & 112) | 806879232, 432, 188);
                g0Var = g0Var;
                g0Var.r(true);
                g0Var.r(true);
                g0Var.r(true);
                g0Var.r(false);
            } else {
                int i5 = i2;
                g0Var.c0(-1713434736);
                r rVarM2 = h0.c.M(z1.d(h0.c.E(oVar, 16, 0.0f, 2), 1.0f), j7Var);
                v1 v1VarA2 = t1.a(h0.i.g(8), hVar, g0Var, 54);
                int iHashCode4 = Long.hashCode(g0Var.T);
                m1 m1VarM4 = g0Var.m();
                r rVarC4 = b2.a.c(rVarM2, g0Var);
                b3.i.c.getClass();
                b3.g gVar3 = b3.h.b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar3);
                } else {
                    g0Var.q0();
                }
                b3.f fVar5 = b3.h.f;
                q.I(v1VarA2, g0Var, fVar5);
                b3.f fVar6 = b3.h.e;
                q.I(m1VarM4, g0Var, fVar6);
                Integer numValueOf2 = Integer.valueOf(iHashCode4);
                b3.f fVar7 = b3.h.g;
                q.I(numValueOf2, g0Var, fVar7);
                b3.e eVar4 = b3.h.h;
                q.E(g0Var, eVar4);
                b3.f fVar8 = b3.h.d;
                q.I(rVarC4, g0Var, fVar8);
                r rVarD3 = z1.d(oVar, 1.0f);
                v vVarA3 = u.a(h0.i.g(12), gVar, g0Var, 6);
                int iHashCode5 = Long.hashCode(g0Var.T);
                m1 m1VarM5 = g0Var.m();
                r rVarC5 = b2.a.c(rVarD3, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar3);
                } else {
                    g0Var.q0();
                }
                q.I(vVarA3, g0Var, fVar5);
                q.I(m1VarM5, g0Var, fVar6);
                a1.b.v(iHashCode5, g0Var, fVar7, g0Var, eVar4);
                q.I(rVarC5, g0Var, fVar8);
                r rVarD4 = z1.d(oVar, 1.0f);
                w0 w0VarD = h0.o.d(b2.b.E, false);
                int iHashCode6 = Long.hashCode(g0Var.T);
                m1 m1VarM6 = g0Var.m();
                r rVarC6 = b2.a.c(rVarD4, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar3);
                } else {
                    g0Var.q0();
                }
                q.I(w0VarD, g0Var, fVar5);
                q.I(m1VarM6, g0Var, fVar6);
                a1.b.v(iHashCode6, g0Var, fVar7, g0Var, eVar4);
                q.I(rVarC6, g0Var, fVar8);
                r rVarA = h0.s.a.a(oVar, b2.b.D);
                boolean zG2 = g0Var.g(cVar2) | (i3 == 32);
                Object objN6 = g0Var.N();
                if (zG2 || objN6 == cVar3) {
                    kVar = onAction;
                    objN6 = new jk.i(kVar, cVar2, 3);
                    g0Var.n0(objN6);
                } else {
                    kVar = onAction;
                }
                r rVarO2 = d0.o(rVarA, (u00.k) objN6);
                p0.e eVar5 = p0.f.a;
                float f6 = 0;
                float f7 = 44;
                long jB3 = t.b(0.5f, dl.a.P);
                boolean z6 = i3 == 32;
                Object objN7 = g0Var.N();
                if (z6 || objN7 == cVar3) {
                    objN7 = new jz.t(10, kVar);
                    g0Var.n0(objN7);
                }
                w50.c.f((u00.a) objN7, cVar, rVarO2, false, false, 0.0f, new y3.f(f7), 0L, jB3, 10.0f, eVar5, f6, g, g0Var, ((i5 >> 3) & 112) | 806879232, 432, 184);
                g0Var = g0Var;
                g0Var.r(true);
                g0Var.r(true);
                g0Var.r(true);
                g0Var.r(false);
            }
        } else {
            kVar = onAction;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new l(uiState, kVar, cVar, i, 1);
        }
    }

    public static final void l(int i, final r rVar, long j, long j2, q3.u uVar, l1.j jVar, final int i2, final int i3) {
        final int i4;
        int i5;
        long j3;
        long j4;
        q3.u uVar2;
        boolean z;
        final long j5;
        final long j6;
        final q3.u uVar3;
        r1 r1VarT;
        q3.u uVar4;
        b3.g gVar;
        g0 g0Var = (g0) jVar;
        g0Var.e0(1906227862);
        if ((i2 & 6) == 0) {
            i4 = i;
            i5 = (g0Var.e(i4) ? 4 : 2) | i2;
        } else {
            i4 = i;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= g0Var.g(rVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            j3 = j;
            i5 |= ((i3 & 4) == 0 && g0Var.f(j3)) ? 256 : 128;
        } else {
            j3 = j;
        }
        if ((i2 & 3072) == 0) {
            j4 = j2;
            i5 |= ((i3 & 8) == 0 && g0Var.f(j4)) ? 2048 : 1024;
        } else {
            j4 = j2;
        }
        int i6 = i3 & 16;
        if (i6 == 0) {
            if ((i2 & 24576) == 0) {
                uVar2 = uVar;
                i5 |= g0Var.g(uVar2) ? 16384 : 8192;
            }
            if ((i5 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (g0Var.S(i5 & 1, z)) {
                g0Var.X();
                if ((i2 & 1) != 0 || g0Var.A()) {
                    if ((i3 & 4) != 0) {
                        j3 = dl.a.q;
                        i5 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        j4 = dl.a.i;
                        i5 &= -7169;
                    }
                    if (i6 != 0) {
                        uVar4 = q3.u.D;
                    }
                    long j7 = j4;
                    g0Var.s();
                    r rVarF = z.n.f(f2.h.c(z1.m(rVar, 24), p0.f.a(8)), j3, b0.b);
                    w0 w0VarD = h0.o.d(b2.b.E, false);
                    int iHashCode = Long.hashCode(g0Var.T);
                    m1 m1VarM = g0Var.m();
                    r rVarC = b2.a.c(rVarF, g0Var);
                    b3.i.c.getClass();
                    gVar = b3.h.b;
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
                    z6.b(String.valueOf(i4), (r) null, j7, kh.o.z(13), uVar4, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(16), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, ((i5 >> 3) & 896) | 24576 | ((i5 << 6) & 3670016), 48, 260010);
                    g0Var.r(true);
                    j5 = j3;
                    j6 = j7;
                    uVar3 = uVar4;
                } else {
                    g0Var.V();
                    if ((i3 & 4) != 0) {
                        i5 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        i5 &= -7169;
                    }
                }
                uVar4 = uVar2;
                long j8 = j4;
                g0Var.s();
                r rVarF2 = z.n.f(f2.h.c(z1.m(rVar, 24), p0.f.a(8)), j3, b0.b);
                w0 w0VarD2 = h0.o.d(b2.b.E, false);
                int iHashCode2 = Long.hashCode(g0Var.T);
                m1 m1VarM2 = g0Var.m();
                r rVarC2 = b2.a.c(rVarF2, g0Var);
                b3.i.c.getClass();
                gVar = b3.h.b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                q.I(w0VarD2, g0Var, b3.h.f);
                q.I(m1VarM2, g0Var, b3.h.e);
                q.I(Integer.valueOf(iHashCode2), g0Var, b3.h.g);
                q.E(g0Var, b3.h.h);
                q.I(rVarC2, g0Var, b3.h.d);
                z6.b(String.valueOf(i4), (r) null, j8, kh.o.z(13), uVar4, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(16), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, ((i5 >> 3) & 896) | 24576 | ((i5 << 6) & 3670016), 48, 260010);
                g0Var.r(true);
                j5 = j3;
                j6 = j8;
                uVar3 = uVar4;
            } else {
                g0Var.V();
                j5 = j3;
                j6 = j4;
                uVar3 = uVar2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        a.l(i4, rVar, j5, j6, uVar3, (l1.j) obj, q.K(i2 | 1), i3);
                        return g00.b0.a;
                    }
                };
            }
        }
        i5 |= 24576;
        uVar2 = uVar;
        if ((i5 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (g0Var.S(i5 & 1, z)) {
            g0Var.X();
            if ((i2 & 1) != 0) {
                if ((i3 & 4) != 0) {
                    j3 = dl.a.q;
                    i5 &= -897;
                }
                if ((i3 & 8) != 0) {
                    j4 = dl.a.i;
                    i5 &= -7169;
                }
                if (i6 != 0) {
                    uVar4 = q3.u.D;
                } else {
                    uVar4 = uVar2;
                }
            } else {
                if ((i3 & 4) != 0) {
                    j3 = dl.a.q;
                    i5 &= -897;
                }
                if ((i3 & 8) != 0) {
                    j4 = dl.a.i;
                    i5 &= -7169;
                }
                if (i6 != 0) {
                    uVar4 = q3.u.D;
                } else {
                    uVar4 = uVar2;
                }
            }
            long j9 = j4;
            g0Var.s();
            r rVarF3 = z.n.f(f2.h.c(z1.m(rVar, 24), p0.f.a(8)), j3, b0.b);
            w0 w0VarD3 = h0.o.d(b2.b.E, false);
            int iHashCode3 = Long.hashCode(g0Var.T);
            m1 m1VarM3 = g0Var.m();
            r rVarC3 = b2.a.c(rVarF3, g0Var);
            b3.i.c.getClass();
            gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(w0VarD3, g0Var, b3.h.f);
            q.I(m1VarM3, g0Var, b3.h.e);
            q.I(Integer.valueOf(iHashCode3), g0Var, b3.h.g);
            q.E(g0Var, b3.h.h);
            q.I(rVarC3, g0Var, b3.h.d);
            z6.b(String.valueOf(i4), (r) null, j9, kh.o.z(13), uVar4, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(16), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, ((i5 >> 3) & 896) | 24576 | ((i5 << 6) & 3670016), 48, 260010);
            g0Var.r(true);
            j5 = j3;
            j6 = j9;
            uVar3 = uVar4;
        } else {
            g0Var.V();
            j5 = j3;
            j6 = j4;
            uVar3 = uVar2;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a.l(i4, rVar, j5, j6, uVar3, (l1.j) obj, q.K(i2 | 1), i3);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void m(fx.b bVar, int i, boolean z, u30.b downloadedReciters, u00.a onClick, r rVar, y3.f fVar, l1.j jVar, int i2) {
        int i3;
        float f2;
        fx.b bVar2 = bVar;
        kotlin.jvm.internal.m.e(downloadedReciters, "downloadedReciters");
        kotlin.jvm.internal.m.e(onClick, "onClick");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-451854992);
        int i4 = i2 | (g0Var.g(bVar2) ? 4 : 2) | (g0Var.e(i) ? 32 : 16) | (g0Var.h(z) ? 256 : 128) | (g0Var.g(downloadedReciters) ? 2048 : 1024) | (g0Var.i(onClick) ? 16384 : 8192) | (g0Var.g(rVar) ? 131072 : 65536) | (g0Var.g(fVar) ? 1048576 : 524288);
        if (g0Var.S(i4 & 1, (599187 & i4) != 599186)) {
            gm.a aVar = (gm.a) g0Var.k(dl.e.a);
            float fA = fVar != null ? fVar.A : jx.q.a(aVar);
            bx.c cVar = bVar2.c;
            int i5 = i4 >> 3;
            boolean zR = r(cVar.a, z, downloadedReciters, g0Var, i5 & 1008);
            float f3 = 8;
            r rVarG = h0.c.G(w00.a.k(w50.c.o(z1.d(rVar, 1.0f), zR, null, onClick, 6), !zR), 0.0f, 0.0f, 0.0f, f3, 7);
            v vVarA = u.a(h0.i.c, b2.b.N, g0Var, 48);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVarG, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar2 = b3.h.f;
            q.I(vVarA, g0Var, fVar2);
            b3.f fVar3 = b3.h.e;
            q.I(m1VarM, g0Var, fVar3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar4 = b3.h.g;
            q.I(numValueOf, g0Var, fVar4);
            b3.e eVar = b3.h.h;
            q.E(g0Var, eVar);
            b3.f fVar5 = b3.h.d;
            q.I(rVarC, g0Var, fVar5);
            w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            o oVar = o.A;
            r rVarC2 = b2.a.c(oVar, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(w0VarD, g0Var, fVar2);
            q.I(m1VarM2, g0Var, fVar3);
            a1.b.v(iHashCode2, g0Var, fVar4, g0Var, eVar);
            q.I(rVarC2, g0Var, fVar5);
            a(cVar.e, fA, null, g0Var, 384);
            b2.i iVar = b2.b.I;
            h0.s sVar = h0.s.a;
            r rVarA = sVar.a(oVar, iVar);
            gm.a aVar2 = gm.a.B;
            if (aVar == aVar2) {
                f2 = 5;
                i3 = 4;
            } else {
                i3 = 4;
                f2 = 4;
            }
            l(i, h0.c.z(rVarA, f2, aVar == aVar2 ? 5 : i3), 0L, 0L, null, g0Var, i5 & 14, 28);
            if (cVar.f) {
                g0Var.c0(-470618894);
                f50.c.i(sVar.a(oVar, b2.b.C), g0Var, 0);
                g0Var.r(false);
            } else {
                g0Var.c0(-470492042);
                g0Var.r(false);
            }
            g0Var.r(true);
            h0.c.h(z1.e(oVar, f3), g0Var);
            i(cVar.b, null, g0Var, 0);
            bVar2 = bVar;
            Integer num = bVar2.b;
            if (num == null) {
                g0Var.c0(-716629735);
                g0Var.r(false);
            } else {
                g0Var.c0(-716629734);
                k00.f.a(q(g0Var, num.intValue()), null, t.b(0.5f, dl.a.n), aVar == aVar2 ? kh.o.z(15) : kh.o.z(12), new y3.o(aVar == aVar2 ? kh.o.z(15) : kh.o.z(12)), q3.u.B, new x3.k(3), 1, 0.0f, null, g0Var, 12779520, 770);
                g0Var = g0Var;
                g0Var.r(false);
            }
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new c0.h(bVar2, i, z, downloadedReciters, onClick, rVar, fVar, i2);
        }
    }

    public static final void n(String text, r rVar, long j, l1.j jVar, int i, int i2) {
        int i3;
        r rVar2;
        boolean z;
        l1.j jVar2;
        r rVar3;
        r1 r1VarT;
        r rVar4;
        int i4;
        kotlin.jvm.internal.m.e(text, "text");
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(906520364);
        if ((i & 6) == 0) {
            i3 = (jVar3.g(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                rVar2 = rVar;
                i3 |= jVar3.g(rVar2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if (jVar3.f(j)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (jVar3.S(i3 & 1, z)) {
                jVar3.X();
                if ((i & 1) != 0 || jVar3.A()) {
                    if (i5 != 0) {
                        rVar4 = o.A;
                    }
                    jVar3.s();
                    r rVar5 = rVar4;
                    jVar2 = jVar3;
                    z6.b(text, rVar5, j, kh.o.z(32), q3.u.D, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(32), 2, false, 1, 0, (u00.k) null, (r0) null, jVar2, (i3 & 14) | 1597440 | (i3 & 112) | (i3 & 896), 25008, 239528);
                    rVar3 = rVar5;
                } else {
                    jVar3.V();
                }
                rVar4 = rVar2;
                jVar3.s();
                r rVar6 = rVar4;
                jVar2 = jVar3;
                z6.b(text, rVar6, j, kh.o.z(32), q3.u.D, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(32), 2, false, 1, 0, (u00.k) null, (r0) null, jVar2, (i3 & 14) | 1597440 | (i3 & 112) | (i3 & 896), 25008, 239528);
                rVar3 = rVar6;
            } else {
                jVar2 = jVar3;
                jVar2.V();
                rVar3 = rVar2;
            }
            r1VarT = jVar2.t();
            if (r1VarT != null) {
                r1VarT.d = new n(text, rVar3, j, i, i2, 0);
            }
        }
        i3 |= 48;
        rVar2 = rVar;
        if ((i & 384) != 0) {
            if (jVar3.f(j)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (jVar3.S(i3 & 1, z)) {
            jVar3.X();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    rVar4 = o.A;
                } else {
                    rVar4 = rVar2;
                }
            } else if (i5 != 0) {
                rVar4 = o.A;
            } else {
                rVar4 = rVar2;
            }
            jVar3.s();
            r rVar7 = rVar4;
            jVar2 = jVar3;
            z6.b(text, rVar7, j, kh.o.z(32), q3.u.D, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(32), 2, false, 1, 0, (u00.k) null, (r0) null, jVar2, (i3 & 14) | 1597440 | (i3 & 112) | (i3 & 896), 25008, 239528);
            rVar3 = rVar7;
        } else {
            jVar2 = jVar3;
            jVar2.V();
            rVar3 = rVar2;
        }
        r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new n(text, rVar3, j, i, i2, 0);
        }
    }

    public static final void o(int i, r rVar, jk.a aVar, l1.j jVar, u00.a onClick, boolean z) {
        r rVar2;
        jk.a aVar2;
        int i2;
        jk.a aVarD;
        kotlin.jvm.internal.m.e(onClick, "onClick");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-747384750);
        int i3 = i | (g0Var.i(onClick) ? 4 : 2) | (g0Var.h(z) ? 32 : 16) | 8192;
        if (g0Var.S(i3 & 1, (i3 & 9363) != 9362)) {
            g0Var.X();
            if ((i & 1) == 0 || g0Var.A()) {
                i2 = i3 & (-57345);
                aVarD = kk.e.d(g0Var);
            } else {
                g0Var.V();
                i2 = i3 & (-57345);
                aVarD = aVar;
            }
            g0Var.s();
            p2 p2VarA = b2.a(z ? t.f : t.b(0.6f, dl.a.k), (x.y) null, (String) null, g0Var, 0, 14);
            p2 p2VarA2 = b2.a(z ? t.f : t.b(0.1f, dl.a.i), (x.y) null, (String) null, g0Var, 0, 14);
            v1.c cVarD = v1.d.d(-1555474296, new x(p2VarA, 3), g0Var);
            g0Var.c0(-226669118);
            rVar2 = rVar;
            r rVarF = z.n.f(f2.h.c(z1.e(z1.d(rVar2, 1.0f), 40), p0.f.a(32)), ((t) p2VarA2.getValue()).a, b0.b);
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object objN = g0Var.N();
            if (z2 || objN == l1.i.a) {
                objN = new c0.g(z, onClick, 2);
                g0Var.n0(objN);
            }
            r rVarE = h0.c.E(w50.c.n(rVarF, true, (u00.a) objN), 16, 0.0f, 2);
            v1 v1VarA = t1.a(h0.i.g(8), b2.b.K, g0Var, 54);
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
            cVarD.invoke(x1.a, g0Var, 54);
            g0Var.r(true);
            g0Var.r(false);
            aVar2 = aVarD;
        } else {
            rVar2 = rVar;
            g0Var.V();
            aVar2 = aVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new c00.l(onClick, z, rVar2, aVar2, i);
        }
    }

    public static final void p(int i, s uiState, kk.c cVar, l1.j jVar, u00.k onAction) {
        kotlin.jvm.internal.m.e(uiState, "uiState");
        kotlin.jvm.internal.m.e(onAction, "onAction");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1376452059);
        int i2 = (g0Var.g(uiState) ? 4 : 2) | i | (g0Var.i(cVar) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= g0Var.i(onAction) ? 256 : 128;
        }
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            int iOrdinal = ((gm.a) g0Var.k(dl.e.a)).ordinal();
            if (iOrdinal == 0) {
                g0Var.c0(79506910);
                k(((i2 << 3) & 896) | (i2 & 14) | ((i2 >> 3) & 112), uiState, cVar, g0Var, onAction);
                g0Var.r(false);
            } else {
                if (iOrdinal != 1) {
                    throw oi.k.r(g0Var, 79505281, false);
                }
                g0Var.c0(79513087);
                g(((i2 << 3) & 896) | (i2 & 14) | ((i2 >> 3) & 112), uiState, cVar, g0Var, onAction);
                g0Var.r(false);
            }
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new l(uiState, cVar, onAction, i);
        }
    }

    public static final String q(l1.j jVar, int i) {
        String strValueOf;
        if (i >= 1000000) {
            double d2 = ((double) i) / 1000000.0d;
            strValueOf = w.c.j(d2 >= 10.0d ? String.valueOf((long) Math.rint(d2)) : String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d2)}, 1)), "M");
        } else if (i >= 1000) {
            strValueOf = ((long) Math.rint(((double) i) / 1000.0d)) + "k";
        } else {
            strValueOf = String.valueOf(i);
        }
        return z3.T(2131887149, new Object[]{strValueOf}, jVar);
    }

    public static final boolean r(int i, boolean z, u30.b downloadedReciters, l1.j jVar, int i2) {
        kotlin.jvm.internal.m.e(downloadedReciters, "downloadedReciters");
        boolean z2 = ((((i2 & 14) ^ 6) > 4 && ((g0) jVar).e(i)) || (i2 & 6) == 4) | ((((i2 & 896) ^ 384) > 256 && ((g0) jVar).g(downloadedReciters)) || (i2 & 384) == 256) | ((((i2 & 112) ^ 48) > 32 && ((g0) jVar).h(z)) || (i2 & 48) == 32);
        g0 g0Var = (g0) jVar;
        Object objN = g0Var.N();
        if (z2 || objN == l1.i.a) {
            objN = Boolean.valueOf(downloadedReciters.contains(Integer.valueOf(i)) || z);
            g0Var.n0(objN);
        }
        return ((Boolean) objN).booleanValue();
    }
}
