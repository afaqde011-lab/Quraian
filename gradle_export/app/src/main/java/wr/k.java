package wr;

import android.content.Context;
import android.content.res.Configuration;
import c3.o0;
import c3.o1;
import c3.w2;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import g1.o3;
import g1.q4;
import g1.w3;
import g1.z6;
import gv.a2;
import h0.c1;
import h0.m2;
import h0.n1;
import h0.p1;
import h0.t1;
import h0.v1;
import h0.x1;
import h0.z1;
import i2.t0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import l1.m1;
import l1.p2;
import l1.r1;
import l1.z0;
import m3.r0;
import oo.i0;
import q0.f2;
import qd.s0;
import ur.d1;
import ur.h1;
import w.b2;
import z2.w0;

public abstract class k {
    public static final v1.c a = new v1.c(new pz.m(15), -2018271711, false);
    public static final v1.c b = new v1.c(new pz.m(16), -294587075, false);
    public static final v1.c c = new v1.c(new pz.m(17), 868445787, false);
    public static final v1.c d = new v1.c(new pz.m(18), -144359567, false);
    public static final v1.c e = new v1.c(new sw.a(18), 1901292424, false);
    public static final v1.c f = new v1.c(new sw.a(19), 1477239797, false);
    public static final v1.c g = new v1.c(new sw.a(20), 305382061, false);
    public static final v1.c h = new v1.c(new sw.a(21), 2012240591, false);

    public static final void A(boolean z, float f2, l1.j jVar, int i) {
        int i2;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1906149942);
        if ((i & 6) == 0) {
            i2 = i | (g0Var.h(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.d(f2) ? 32 : 16;
        }
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            float f3 = z ? 171 : 250;
            b2.o oVar = b2.o.A;
            b2.r rVarD = z1.d(oVar, 1.0f);
            h0.v vVarA = h0.u.a(h0.i.g(16), b2.b.M, g0Var, 6);
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
            l1.q.I(vVarA, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            l1.q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC, g0Var, fVar4);
            O(z ? 120 : 140, 0, 0, h0.c.E(oVar, f2, 0.0f, 2), g0Var);
            b2.r rVarM = z.n.m(z1.d(oVar, 1.0f), z.n.l(g0Var), true, false);
            v1 v1VarA = t1.a(h0.i.g(12), b2.b.J, g0Var, 6);
            float f4 = f3;
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarM, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA, g0Var, fVar);
            l1.q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC2, g0Var, fVar4);
            h0.c.h(z1.q(oVar, f2), g0Var);
            g0Var.c0(1921007734);
            int i3 = 0;
            while (i3 < 4) {
                float f5 = f4;
                P(f5, null, new y3.f(f5), 10, g0Var, 3072, 2);
                i3++;
                f4 = f5;
            }
            g0Var.r(false);
            h0.c.h(z1.q(oVar, f2), g0Var);
            g0Var.r(true);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new l(z, f2, i, 0);
        }
    }

    public static final void B(u00.k onPlayListClicked, u30.b playlists, boolean z, b2.r rVar, l1.j jVar, int i) {
        l1.j jVar2;
        b2.r rVar2;
        int i2;
        kotlin.jvm.internal.m.e(onPlayListClicked, "onPlayListClicked");
        kotlin.jvm.internal.m.e(playlists, "playlists");
        l1.j jVar3 = (l1.g0) jVar;
        jVar3.e0(1187824646);
        int i3 = 16;
        int i4 = i | (jVar3.i(onPlayListClicked) ? 4 : 2) | (jVar3.i(playlists) ? 32 : 16) | (jVar3.h(z) ? 256 : 128) | 3072;
        if (jVar3.S(i4 & 1, (i4 & 1171) != 1170)) {
            gm.a aVar = (gm.a) jVar3.k(dl.e.a);
            boolean zE = jVar3.e(aVar.ordinal());
            Object objN = jVar3.N();
            l1.c cVar = l1.i.a;
            if (zE || objN == cVar) {
                int iOrdinal = aVar.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i3 = 24;
                }
                objN = oi.k.t(i3, jVar3);
            }
            float f2 = ((y3.f) objN).A;
            boolean zE2 = jVar3.e(aVar.ordinal());
            Object objN2 = jVar3.N();
            if (zE2 || objN2 == cVar) {
                int iOrdinal2 = aVar.ordinal();
                if (iOrdinal2 == 0) {
                    i2 = 171;
                } else {
                    if (iOrdinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = 250;
                }
                objN2 = oi.k.t(i2, jVar3);
            }
            float f3 = ((y3.f) objN2).A;
            boolean zE3 = ((i4 & 112) == 32 || jVar3.g(playlists)) | jVar3.e(aVar.ordinal());
            Object objN3 = jVar3.N();
            if (zE3 || objN3 == cVar) {
                int iOrdinal3 = aVar.ordinal();
                if (iOrdinal3 == 0) {
                    objN3 = h00.q.j1(playlists, 4);
                } else {
                    if (iOrdinal3 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    objN3 = playlists;
                }
                jVar3.n0(objN3);
            }
            List list = (List) objN3;
            b2.r rVar3 = b2.o.A;
            b2.r rVarD = z1.d(rVar3, 1.0f);
            h0.f fVarG = h0.i.g(12);
            p1 p1VarE = h0.c.e(f2, 0.0f, 2);
            boolean zD = ((i4 & 896) == 256) | jVar3.d(f3) | jVar3.i(list) | ((i4 & 14) == 4);
            Object objN4 = jVar3.N();
            if (zD || objN4 == cVar) {
                sm.d dVar = new sm.d(z, list, f3, onPlayListClicked, 1);
                jVar3.n0(dVar);
                objN4 = dVar;
            }
            jVar2 = jVar3;
            k00.f.e(rVarD, null, p1VarE, fVarG, null, null, false, null, (u00.k) objN4, jVar2, 24576, 490);
            rVar2 = rVar3;
        } else {
            jVar2 = jVar3;
            jVar2.V();
            rVar2 = rVar;
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new c00.l(onPlayListClicked, playlists, z, rVar2, i, 7);
        }
    }

    public static final void C(float f2, l1.j jVar, int i) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-484542064);
        int i2 = (g0Var.d(f2) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            b2.o oVar = b2.o.A;
            P(32, h0.c.E(oVar, f2, 0.0f, 2), new y3.f(180), 0.0f, g0Var, 390, 8);
            E(h0.c.E(oVar, f2, 0.0f, 2), g0Var, 0);
            int i3 = (i2 << 3) & 112;
            int i4 = i3 | 390;
            L(true, f2, 160, g0Var, i4);
            int i5 = i3 | 6;
            A(true, f2, g0Var, i5);
            L(true, f2, 150, g0Var, i4);
            U(true, f2, g0Var, i5);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new ox.f(f2, i, 3);
        }
    }

    public static final void D(String title, b2.r rVar, u00.a aVar, boolean z, boolean z2, l1.j jVar, int i, int i2) {
        b2.r rVar2;
        int i3;
        u00.a aVar2;
        b2.r rVar3;
        kotlin.jvm.internal.m.e(title, "title");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(707399284);
        int i4 = i | (g0Var.g(title) ? 4 : 2);
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i3 = i4 | (g0Var.g(rVar2) ? 32 : 16);
        }
        int i6 = i3 | 384;
        if (g0Var.S(i6 & 1, (i6 & 9363) != 9362)) {
            b2.r rVar4 = b2.o.A;
            b2.r rVar5 = i5 != 0 ? rVar4 : rVar2;
            Object objN = g0Var.N();
            if (objN == l1.i.a) {
                objN = new a2.f(24);
                g0Var.n0(objN);
            }
            u00.a aVar3 = (u00.a) objN;
            b2.r rVarN = w50.c.n(f2.h.c(rVar5, p0.f.a(4)), z, aVar3);
            v1 v1VarA = t1.a(h0.i.a, b2.b.K, g0Var, 48);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarN, g0Var);
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
            b2.r rVar6 = rVar5;
            z6.b(title, (b2.r) null, dl.a.n, kh.o.z(22), q3.u.D, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 2, false, 1, 0, (u00.k) null, (r0) null, g0Var, (i6 & 14) | 1597440, 24960, 241578);
            g0Var = g0Var;
            if (z2) {
                g0Var.c0(-1162403740);
                z3.k(g4.h0(2131231098, g0Var, 6), (String) null, z1.m(rVar4, 30), dl.a.o, g0Var, 432);
                g0Var.r(false);
            } else {
                g0Var.c0(-1162165102);
                g0Var.r(false);
            }
            g0Var.r(true);
            aVar2 = aVar3;
            rVar3 = rVar6;
        } else {
            g0Var.V();
            aVar2 = aVar;
            rVar3 = rVar2;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new mu.k(title, rVar3, aVar2, z, z2, i, i2);
        }
    }

    public static final void E(b2.r rVar, l1.j jVar, int i) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(2092008671);
        int i2 = (g0Var.g(rVar) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            b2.r rVarD = z1.d(rVar, 1.0f);
            float f2 = 16;
            v1 v1VarA = t1.a(h0.i.g(f2), b2.b.K, g0Var, 54);
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
            l1.q.I(v1VarA, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            l1.q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC, g0Var, fVar4);
            float f3 = 120;
            Q(f3, 6, null, g0Var);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            c1 c1Var = new c1(1.0f, true);
            h0.f fVarG = h0.i.g(f2);
            b2.g gVar2 = b2.b.M;
            h0.v vVarA = h0.u.a(fVarG, gVar2, g0Var, 6);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(c1Var, g0Var);
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
            h0.v vVarA2 = h0.u.a(h0.i.g(6), gVar2, g0Var, 6);
            int iHashCode3 = Long.hashCode(g0Var.T);
            m1 m1VarM3 = g0Var.m();
            b2.r rVarC3 = b2.a.c(b2.o.A, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA2, g0Var, fVar);
            l1.q.I(m1VarM3, g0Var, fVar2);
            a1.b.v(iHashCode3, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC3, g0Var, fVar4);
            P(f2, null, new y3.f(f3), 0.0f, g0Var, 390, 10);
            P(24, null, new y3.f(180), 0.0f, g0Var, 390, 10);
            g0Var.r(true);
            P(36, null, new y3.f(f3), 32, g0Var, 3462, 2);
            g0Var.r(true);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new ro.e(rVar, i, 7);
        }
    }

    public static final void F(bx.c cVar, boolean z, u00.a onContinuePlayingClicked, b2.r rVar, l1.j jVar, int i) {
        kotlin.jvm.internal.m.e(onContinuePlayingClicked, "onContinuePlayingClicked");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1439578637);
        int i2 = i | (g0Var.i(cVar) ? 4 : 2) | (g0Var.h(z) ? 32 : 16) | (g0Var.i(onContinuePlayingClicked) ? 256 : 128) | (g0Var.g(rVar) ? 2048 : 1024);
        if (g0Var.S(i2 & 1, (i2 & 1171) != 1170)) {
            b2.r rVarD = z1.d(rVar, 1.0f);
            b2.h hVar = b2.b.K;
            float f2 = 16;
            v1 v1VarA = t1.a(h0.i.g(f2), hVar, g0Var, 54);
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
            l1.q.I(v1VarA, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            l1.q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC, g0Var, fVar4);
            wb.h hVar2 = new wb.h((Context) g0Var.k(o0.b));
            String str = cVar != null ? cVar.e : null;
            if (str == null || str.length() == 0) {
                str = null;
            }
            hVar2.c = str;
            mb.j jVarI = mb.l.i(w.c.q(hVar2, 600), (z2.p) null, g0Var, 0, 62);
            float f3 = 120;
            b2.o oVar = b2.o.A;
            z.n.c(jVarI, (String) null, rd.a.g0(f3, 0, dl.a.s, f2.h.c(z1.m(oVar, f3), p0.f.a), !(jVarI.j() instanceof mb.g)), (b2.d) null, z2.o.a, 0.0f, g0Var, 24624, 104);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            c1 c1Var = new c1(1.0f, true);
            h0.f fVarG = h0.i.g(f2);
            b2.g gVar2 = b2.b.M;
            h0.v vVarA = h0.u.a(fVarG, gVar2, g0Var, 6);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(c1Var, g0Var);
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
            h0.v vVarA2 = h0.u.a(h0.i.c, gVar2, g0Var, 0);
            int iHashCode3 = Long.hashCode(g0Var.T);
            m1 m1VarM3 = g0Var.m();
            b2.r rVarC3 = b2.a.c(oVar, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA2, g0Var, fVar);
            l1.q.I(m1VarM3, g0Var, fVar2);
            a1.b.v(iHashCode3, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC3, g0Var, fVar4);
            z6.b(z3.U(g0Var, z ? 2131887145 : 2131886527), (b2.r) null, i2.t.b(0.5f, dl.a.k), kh.o.z(16), (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(16), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 24576, 48, 260074);
            String str2 = cVar != null ? cVar.b : null;
            if (str2 == null) {
                str2 = "";
            }
            long jZ = kh.o.z(20);
            q3.u uVar = q3.u.D;
            z6.b(str2, (b2.r) null, dl.a.n, jZ, uVar, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 1, 0, (u00.k) null, (r0) null, g0Var, 1597440, 24576, 245674);
            g0Var.r(true);
            b2.r rVarD2 = h0.c.D(w50.c.n(z.n.f(f2.h.c(oVar, p0.f.a(32)), dl.a.i, i2.b0.b), true, onContinuePlayingClicked), f2, 8);
            v1 v1VarA2 = t1.a(h0.i.g(6), hVar, g0Var, 54);
            int iHashCode4 = Long.hashCode(g0Var.T);
            m1 m1VarM4 = g0Var.m();
            b2.r rVarC4 = b2.a.c(rVarD2, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA2, g0Var, fVar);
            l1.q.I(m1VarM4, g0Var, fVar2);
            a1.b.v(iHashCode4, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC4, g0Var, fVar4);
            b2.r rVarM = z1.m(oVar, 10);
            m2.b bVarR = y3.R(2131231358, g0Var, 0);
            long j = dl.a.L;
            z3.j(bVarR, (String) null, rVarM, j, g0Var, 440, 0);
            z6.b(z3.U(g0Var, 2131886366), (b2.r) null, j, kh.o.z(12), uVar, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 0, 262058);
            g0Var = g0Var;
            x5.z(g0Var, true, true, true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new c00.l(cVar, z, onContinuePlayingClicked, rVar, i, 8);
        }
    }

    public static final void G(l1.j jVar, int i) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-754932107);
        if (g0Var.S(i & 1, i != 0)) {
            b2.o oVar = b2.o.A;
            float f2 = 16;
            b2.r rVarC = h0.c.C(z.n.f(f2.h.c(z1.d(oVar, 1.0f), p0.f.a(24)), i2.t.b(0.08f, dl.a.i), i2.b0.b), f2);
            h0.v vVarA = h0.u.a(h0.i.g(f2), b2.b.N, g0Var, 54);
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
            l1.q.I(vVarA, g0Var, b3.h.f);
            l1.q.I(m1VarM, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC2, g0Var, b3.h.d);
            b0(g0Var, 0);
            Q(120, 6, null, g0Var);
            f0(g0Var, 0);
            P(42, z1.d(oVar, 1.0f), null, 32, g0Var, 3126, 4);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new sw.a(i, 23);
        }
    }

    public static final void H(final String str, final String str2, final u00.a onDismiss, b2.r rVar, long j, r0 r0Var, r0 r0Var2, u00.n nVar, l1.j jVar, final int i, final int i2) {
        int i3;
        String str3;
        b2.r rVar2;
        long j2;
        int i4;
        u00.n nVar2;
        int i5;
        boolean z;
        final b2.r rVar3;
        final long j3;
        final u00.n nVar3;
        final r0 r0Var3;
        final r0 r0Var4;
        r1 r1VarT;
        b2.r rVar4;
        long j4;
        r0 r0Var5;
        r0 r0Var6;
        int i6;
        long j5;
        u00.n nVar4;
        r0 r0Var7;
        r0 r0Var8;
        b2.r rVar5;
        kotlin.jvm.internal.m.e(onDismiss, "onDismiss");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1882437751);
        if ((i & 6) == 0) {
            i3 = (g0Var.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            str3 = str2;
            i3 |= g0Var.g(str3) ? 32 : 16;
        } else {
            str3 = str2;
        }
        if ((i & 384) == 0) {
            i3 |= g0Var.i(onDismiss) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 == 0) {
            if ((i & 3072) == 0) {
                rVar2 = rVar;
                i3 |= g0Var.g(rVar2) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    j2 = j;
                    int i8 = g0Var.f(j2) ? 16384 : 8192;
                    i3 |= i8;
                } else {
                    j2 = j;
                }
                i3 |= i8;
            } else {
                j2 = j;
            }
            if ((196608 & i) == 0) {
                i3 |= 65536;
            }
            if ((1572864 & i) == 0) {
                i3 |= 524288;
            }
            i4 = i2 & 128;
            if (i4 != 0) {
                if ((12582912 & i) == 0) {
                    nVar2 = nVar;
                    if (g0Var.i(nVar2)) {
                        i5 = 8388608;
                    } else {
                        i5 = 4194304;
                    }
                    i3 |= i5;
                }
                if ((4793491 & i3) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (g0Var.S(i3 & 1, z)) {
                    g0Var.X();
                    if ((i & 1) != 0 || g0Var.A()) {
                        if (i7 != 0) {
                            rVar4 = b2.o.A;
                        } else {
                            rVar4 = rVar2;
                        }
                        if ((i2 & 16) != 0) {
                            j4 = dl.a.N;
                            i3 &= -57345;
                        } else {
                            j4 = j2;
                        }
                        r0Var5 = new r0(dl.a.i, kh.o.z(18), q3.u.C, (q3.i) null, 0L, 0L, 0, 0, kh.o.z(18), (m3.z) null, 16646136);
                        r0Var6 = new r0(i2.t.b(0.8f, dl.a.k), kh.o.z(14), q3.u.B, (q3.i) null, 0L, 0L, 0, 0, kh.o.z(16), (m3.z) null, 16646136);
                        i6 = i3 & (-4128769);
                        if (i4 != 0) {
                            nVar4 = h;
                            rVar5 = rVar4;
                            j5 = j4;
                            r0Var7 = r0Var5;
                            r0Var8 = r0Var6;
                        } else {
                            j5 = j4;
                            nVar4 = nVar2;
                            r0Var7 = r0Var5;
                            r0Var8 = r0Var6;
                            rVar5 = rVar4;
                        }
                    } else {
                        g0Var.V();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        i6 = i3 & (-4128769);
                        r0Var7 = r0Var;
                        r0Var8 = r0Var2;
                        j5 = j2;
                        nVar4 = nVar2;
                        rVar5 = rVar2;
                    }
                    g0Var.s();
                    s0.G(onDismiss, (c4.v) null, v1.d.d(508007776, new g1.z1(rVar5, j5, str, str3, nVar4, r0Var7, r0Var8), g0Var), g0Var, ((i6 >> 6) & 14) | 384, 2);
                    rVar3 = rVar5;
                    j3 = j5;
                    nVar3 = nVar4;
                    r0Var3 = r0Var7;
                    r0Var4 = r0Var8;
                } else {
                    g0Var.V();
                    rVar3 = rVar2;
                    j3 = j2;
                    nVar3 = nVar2;
                    r0Var3 = r0Var;
                    r0Var4 = r0Var2;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.d = new u00.n() {
                        @Override
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            k.H(str, str2, onDismiss, rVar3, j3, r0Var3, r0Var4, nVar3, (l1.j) obj, l1.q.K(i | 1), i2);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i3 |= 12582912;
            nVar2 = nVar;
            if ((4793491 & i3) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (g0Var.S(i3 & 1, z)) {
                g0Var.X();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        rVar4 = b2.o.A;
                    } else {
                        rVar4 = rVar2;
                    }
                    if ((i2 & 16) != 0) {
                        j4 = dl.a.N;
                        i3 &= -57345;
                    } else {
                        j4 = j2;
                    }
                    r0Var5 = new r0(dl.a.i, kh.o.z(18), q3.u.C, (q3.i) null, 0L, 0L, 0, 0, kh.o.z(18), (m3.z) null, 16646136);
                    r0Var6 = new r0(i2.t.b(0.8f, dl.a.k), kh.o.z(14), q3.u.B, (q3.i) null, 0L, 0L, 0, 0, kh.o.z(16), (m3.z) null, 16646136);
                    i6 = i3 & (-4128769);
                    if (i4 != 0) {
                        nVar4 = h;
                        rVar5 = rVar4;
                        j5 = j4;
                        r0Var7 = r0Var5;
                        r0Var8 = r0Var6;
                    } else {
                        j5 = j4;
                        nVar4 = nVar2;
                        r0Var7 = r0Var5;
                        r0Var8 = r0Var6;
                        rVar5 = rVar4;
                    }
                } else {
                    if (i7 != 0) {
                        rVar4 = b2.o.A;
                    } else {
                        rVar4 = rVar2;
                    }
                    if ((i2 & 16) != 0) {
                        j4 = dl.a.N;
                        i3 &= -57345;
                    } else {
                        j4 = j2;
                    }
                    r0Var5 = new r0(dl.a.i, kh.o.z(18), q3.u.C, (q3.i) null, 0L, 0L, 0, 0, kh.o.z(18), (m3.z) null, 16646136);
                    r0Var6 = new r0(i2.t.b(0.8f, dl.a.k), kh.o.z(14), q3.u.B, (q3.i) null, 0L, 0L, 0, 0, kh.o.z(16), (m3.z) null, 16646136);
                    i6 = i3 & (-4128769);
                    if (i4 != 0) {
                        nVar4 = h;
                        rVar5 = rVar4;
                        j5 = j4;
                        r0Var7 = r0Var5;
                        r0Var8 = r0Var6;
                    } else {
                        j5 = j4;
                        nVar4 = nVar2;
                        r0Var7 = r0Var5;
                        r0Var8 = r0Var6;
                        rVar5 = rVar4;
                    }
                }
                g0Var.s();
                s0.G(onDismiss, (c4.v) null, v1.d.d(508007776, new g1.z1(rVar5, j5, str, str3, nVar4, r0Var7, r0Var8), g0Var), g0Var, ((i6 >> 6) & 14) | 384, 2);
                rVar3 = rVar5;
                j3 = j5;
                nVar3 = nVar4;
                r0Var3 = r0Var7;
                r0Var4 = r0Var8;
            } else {
                g0Var.V();
                rVar3 = rVar2;
                j3 = j2;
                nVar3 = nVar2;
                r0Var3 = r0Var;
                r0Var4 = r0Var2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        k.H(str, str2, onDismiss, rVar3, j3, r0Var3, r0Var4, nVar3, (l1.j) obj, l1.q.K(i | 1), i2);
                        return g00.b0.a;
                    }
                };
            }
        }
        i3 |= 3072;
        rVar2 = rVar;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                j2 = j;
                if (g0Var.f(j2)) {
                }
                i3 |= i8;
            } else {
                j2 = j;
            }
            i3 |= i8;
        } else {
            j2 = j;
        }
        if ((196608 & i) == 0) {
            i3 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= 524288;
        }
        i4 = i2 & 128;
        if (i4 != 0) {
            if ((12582912 & i) == 0) {
                nVar2 = nVar;
                if (g0Var.i(nVar2)) {
                    i5 = 8388608;
                } else {
                    i5 = 4194304;
                }
                i3 |= i5;
            }
            if ((4793491 & i3) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (g0Var.S(i3 & 1, z)) {
                g0Var.X();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        rVar4 = b2.o.A;
                    } else {
                        rVar4 = rVar2;
                    }
                    if ((i2 & 16) != 0) {
                        j4 = dl.a.N;
                        i3 &= -57345;
                    } else {
                        j4 = j2;
                    }
                    r0Var5 = new r0(dl.a.i, kh.o.z(18), q3.u.C, (q3.i) null, 0L, 0L, 0, 0, kh.o.z(18), (m3.z) null, 16646136);
                    r0Var6 = new r0(i2.t.b(0.8f, dl.a.k), kh.o.z(14), q3.u.B, (q3.i) null, 0L, 0L, 0, 0, kh.o.z(16), (m3.z) null, 16646136);
                    i6 = i3 & (-4128769);
                    if (i4 != 0) {
                        nVar4 = h;
                        rVar5 = rVar4;
                        j5 = j4;
                        r0Var7 = r0Var5;
                        r0Var8 = r0Var6;
                    } else {
                        j5 = j4;
                        nVar4 = nVar2;
                        r0Var7 = r0Var5;
                        r0Var8 = r0Var6;
                        rVar5 = rVar4;
                    }
                } else {
                    if (i7 != 0) {
                        rVar4 = b2.o.A;
                    } else {
                        rVar4 = rVar2;
                    }
                    if ((i2 & 16) != 0) {
                        j4 = dl.a.N;
                        i3 &= -57345;
                    } else {
                        j4 = j2;
                    }
                    r0Var5 = new r0(dl.a.i, kh.o.z(18), q3.u.C, (q3.i) null, 0L, 0L, 0, 0, kh.o.z(18), (m3.z) null, 16646136);
                    r0Var6 = new r0(i2.t.b(0.8f, dl.a.k), kh.o.z(14), q3.u.B, (q3.i) null, 0L, 0L, 0, 0, kh.o.z(16), (m3.z) null, 16646136);
                    i6 = i3 & (-4128769);
                    if (i4 != 0) {
                        nVar4 = h;
                        rVar5 = rVar4;
                        j5 = j4;
                        r0Var7 = r0Var5;
                        r0Var8 = r0Var6;
                    } else {
                        j5 = j4;
                        nVar4 = nVar2;
                        r0Var7 = r0Var5;
                        r0Var8 = r0Var6;
                        rVar5 = rVar4;
                    }
                }
                g0Var.s();
                s0.G(onDismiss, (c4.v) null, v1.d.d(508007776, new g1.z1(rVar5, j5, str, str3, nVar4, r0Var7, r0Var8), g0Var), g0Var, ((i6 >> 6) & 14) | 384, 2);
                rVar3 = rVar5;
                j3 = j5;
                nVar3 = nVar4;
                r0Var3 = r0Var7;
                r0Var4 = r0Var8;
            } else {
                g0Var.V();
                rVar3 = rVar2;
                j3 = j2;
                nVar3 = nVar2;
                r0Var3 = r0Var;
                r0Var4 = r0Var2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        k.H(str, str2, onDismiss, rVar3, j3, r0Var3, r0Var4, nVar3, (l1.j) obj, l1.q.K(i | 1), i2);
                        return g00.b0.a;
                    }
                };
            }
        }
        i3 |= 12582912;
        nVar2 = nVar;
        if ((4793491 & i3) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (g0Var.S(i3 & 1, z)) {
            g0Var.X();
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    rVar4 = b2.o.A;
                } else {
                    rVar4 = rVar2;
                }
                if ((i2 & 16) != 0) {
                    j4 = dl.a.N;
                    i3 &= -57345;
                } else {
                    j4 = j2;
                }
                r0Var5 = new r0(dl.a.i, kh.o.z(18), q3.u.C, (q3.i) null, 0L, 0L, 0, 0, kh.o.z(18), (m3.z) null, 16646136);
                r0Var6 = new r0(i2.t.b(0.8f, dl.a.k), kh.o.z(14), q3.u.B, (q3.i) null, 0L, 0L, 0, 0, kh.o.z(16), (m3.z) null, 16646136);
                i6 = i3 & (-4128769);
                if (i4 != 0) {
                    nVar4 = h;
                    rVar5 = rVar4;
                    j5 = j4;
                    r0Var7 = r0Var5;
                    r0Var8 = r0Var6;
                } else {
                    j5 = j4;
                    nVar4 = nVar2;
                    r0Var7 = r0Var5;
                    r0Var8 = r0Var6;
                    rVar5 = rVar4;
                }
            } else {
                if (i7 != 0) {
                    rVar4 = b2.o.A;
                } else {
                    rVar4 = rVar2;
                }
                if ((i2 & 16) != 0) {
                    j4 = dl.a.N;
                    i3 &= -57345;
                } else {
                    j4 = j2;
                }
                r0Var5 = new r0(dl.a.i, kh.o.z(18), q3.u.C, (q3.i) null, 0L, 0L, 0, 0, kh.o.z(18), (m3.z) null, 16646136);
                r0Var6 = new r0(i2.t.b(0.8f, dl.a.k), kh.o.z(14), q3.u.B, (q3.i) null, 0L, 0L, 0, 0, kh.o.z(16), (m3.z) null, 16646136);
                i6 = i3 & (-4128769);
                if (i4 != 0) {
                    nVar4 = h;
                    rVar5 = rVar4;
                    j5 = j4;
                    r0Var7 = r0Var5;
                    r0Var8 = r0Var6;
                } else {
                    j5 = j4;
                    nVar4 = nVar2;
                    r0Var7 = r0Var5;
                    r0Var8 = r0Var6;
                    rVar5 = rVar4;
                }
            }
            g0Var.s();
            s0.G(onDismiss, (c4.v) null, v1.d.d(508007776, new g1.z1(rVar5, j5, str, str3, nVar4, r0Var7, r0Var8), g0Var), g0Var, ((i6 >> 6) & 14) | 384, 2);
            rVar3 = rVar5;
            j3 = j5;
            nVar3 = nVar4;
            r0Var3 = r0Var7;
            r0Var4 = r0Var8;
        } else {
            g0Var.V();
            rVar3 = rVar2;
            j3 = j2;
            nVar3 = nVar2;
            r0Var3 = r0Var;
            r0Var4 = r0Var2;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    k.H(str, str2, onDismiss, rVar3, j3, r0Var3, r0Var4, nVar3, (l1.j) obj, l1.q.K(i | 1), i2);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void I(h1 uiState, u00.k onAction, b2.r rVar, l1.j jVar, int i) {
        int i2;
        kotlin.jvm.internal.m.e(uiState, "uiState");
        kotlin.jvm.internal.m.e(onAction, "onAction");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(914312296);
        if ((i & 6) == 0) {
            i2 = (g0Var.g(uiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= g0Var.i(onAction) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= g0Var.g(rVar) ? 256 : 128;
        }
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            gm.a aVar = (gm.a) g0Var.k(dl.e.a);
            boolean zE = g0Var.e(aVar.ordinal());
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (zE || objN == obj) {
                int iOrdinal = aVar.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i3 = 24;
                }
                objN = oi.k.t(i3, g0Var);
            }
            float f2 = ((y3.f) objN).A;
            h0.v vVarA = h0.u.a(h0.i.g(8), b2.b.M, g0Var, 6);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVar, g0Var);
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
            int iOrdinal2 = aVar.ordinal();
            b2.o oVar = b2.o.A;
            if (iOrdinal2 == 0) {
                g0Var.c0(-604464510);
                g0Var.r(false);
            } else {
                if (iOrdinal2 != 1) {
                    throw oi.k.r(g0Var, -604466212, false);
                }
                g0Var.c0(-1558477025);
                b2.r rVarE = h0.c.E(oVar, f2, 0.0f, 2);
                boolean z = (i2 & 112) == 32;
                Object objN2 = g0Var.N();
                if (z || objN2 == obj) {
                    objN2 = new d1(15, onAction);
                    g0Var.n0(objN2);
                }
                s((u00.a) objN2, rVarE, g0Var, 0);
                g0Var.r(false);
            }
            int iOrdinal3 = aVar.ordinal();
            if (iOrdinal3 == 0) {
                g0Var.c0(-1558194987);
                b2.r rVarE2 = h0.c.E(oVar, f2, 0.0f, 2);
                bx.c cVar = uiState.d;
                boolean z2 = uiState.e;
                boolean z3 = (i2 & 112) == 32;
                Object objN3 = g0Var.N();
                if (z3 || objN3 == obj) {
                    objN3 = new d1(16, onAction);
                    g0Var.n0(objN3);
                }
                F(cVar, z2, (u00.a) objN3, rVarE2, g0Var, 8);
                g0Var.r(false);
            } else {
                if (iOrdinal3 != 1) {
                    throw oi.k.r(g0Var, -604455413, false);
                }
                g0Var.c0(-1557824165);
                q(uiState, onAction, z1.d(oVar, 1.0f), g0Var, (i2 & 14) | 384 | (i2 & 112), 0);
                g0Var.r(false);
            }
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new d0(uiState, onAction, rVar, i, 0);
        }
    }

    public static final void J(bx.c cVar, PlayerItem playerItem, int i, u00.a aVar, b2.r rVar, l1.j jVar, int i2) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1240468766);
        int i3 = i2 | (g0Var.i(cVar) ? 4 : 2) | (g0Var.g(playerItem) ? 32 : 16) | (g0Var.e(i) ? 256 : 128) | (g0Var.i(aVar) ? 2048 : 1024);
        if (g0Var.S(i3 & 1, (i3 & 9363) != 9362)) {
            wb.h hVar = new wb.h((Context) g0Var.k(o0.b));
            String str = cVar.e;
            if (str.length() <= 0) {
                str = null;
            }
            hVar.c = str;
            mb.j jVarI = mb.l.i(w.c.q(hVar, 600), (z2.p) null, g0Var, 0, 62);
            b2.r rVarC = z1.c(z1.q(rVar, 350), 1.0f);
            b2.g gVar = b2.b.N;
            float f2 = 12;
            h0.v vVarA = h0.u.a(h0.i.g(f2), gVar, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarC, g0Var);
            b3.i.c.getClass();
            b3.g gVar2 = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar2);
            } else {
                g0Var.q0();
            }
            b3.f fVar = b3.h.f;
            l1.q.I(vVarA, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            l1.q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC2, g0Var, fVar4);
            b2.o oVar = b2.o.A;
            z.n.c(jVarI, (String) null, rd.a.g0(f2, 0, dl.a.s, f2.h.c(z1.m(oVar, 150), p0.f.a), !(jVarI.j() instanceof mb.g)), (b2.d) null, z2.o.a, 0.0f, g0Var, 24624, 104);
            float f3 = 4;
            h0.v vVarA2 = h0.u.a(h0.i.g(f3), gVar, g0Var, 54);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC3 = b2.a.c(oVar, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar2);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA2, g0Var, fVar);
            l1.q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC3, g0Var, fVar4);
            v1 v1VarA = t1.a(h0.i.g(f3), b2.b.K, g0Var, 54);
            int iHashCode3 = Long.hashCode(g0Var.T);
            m1 m1VarM3 = g0Var.m();
            b2.r rVarC4 = b2.a.c(oVar, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar2);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA, g0Var, fVar);
            l1.q.I(m1VarM3, g0Var, fVar2);
            a1.b.v(iHashCode3, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC4, g0Var, fVar4);
            b2.r rVarD = h0.c.D(z.n.f(f2.h.c(oVar, p0.f.a(f2)), dl.a.w, i2.b0.b), 8, f3);
            w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode4 = Long.hashCode(g0Var.T);
            m1 m1VarM4 = g0Var.m();
            b2.r rVarC5 = b2.a.c(rVarD, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar2);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD, g0Var, fVar);
            l1.q.I(m1VarM4, g0Var, fVar2);
            a1.b.v(iHashCode4, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC5, g0Var, fVar4);
            String strValueOf = String.valueOf(i);
            long j = dl.a.i;
            z6.b(strValueOf, (b2.r) null, j, kh.o.z(14), q3.u.D, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(14), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 48, 260010);
            g0Var.r(true);
            String surahTranscription = playerItem != null ? playerItem.getSurahTranscription() : null;
            if (surahTranscription == null) {
                surahTranscription = "";
            }
            z6.b(surahTranscription, (b2.r) null, dl.a.n, kh.o.z(22), q3.u.E, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 0, 262058);
            g0Var.r(true);
            z6.b(cVar.b, (b2.r) null, i2.t.b(0.6f, j), kh.o.z(16), q3.u.B, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 0, 262058);
            g0Var.r(true);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            h0.c.h(new c1(1.0f, true), g0Var);
            kh.n.l(z3.U(g0Var, 2131886366), aVar, z1.q(oVar, 250), 32, 42, false, false, gl.d.Secondary, false, e, g0Var, ((i3 >> 6) & 112) | 100691328, 48, 5856);
            g0Var = g0Var;
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new g1.a(cVar, playerItem, i, aVar, rVar, i2);
        }
    }

    public static final void K(String str, u30.b reciters, u00.k kVar, boolean z, u30.b bVar, b2.r rVar, o2.f fVar, u00.a aVar, l1.j jVar, int i) {
        b2.r rVar2;
        float f2;
        boolean z2;
        float f3;
        boolean z3;
        u00.k onReciterClicked = kVar;
        boolean z4 = z;
        u30.b downloadedReciters = bVar;
        kotlin.jvm.internal.m.e(reciters, "reciters");
        kotlin.jvm.internal.m.e(onReciterClicked, "onReciterClicked");
        kotlin.jvm.internal.m.e(downloadedReciters, "downloadedReciters");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1809756647);
        int i2 = i | (g0Var.g(str) ? 4 : 2) | (g0Var.i(reciters) ? 32 : 16) | (g0Var.i(onReciterClicked) ? 256 : 128) | (g0Var.h(z4) ? 2048 : 1024) | (g0Var.g(downloadedReciters) ? 16384 : 8192) | 196608 | (g0Var.g(fVar) ? 1048576 : 524288) | (g0Var.i(aVar) ? 8388608 : 4194304);
        if (g0Var.S(i2 & 1, (i2 & 4793491) != 4793490)) {
            gm.a aVar2 = (gm.a) g0Var.k(dl.e.a);
            boolean zE = g0Var.e(aVar2.ordinal());
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (zE || objN == obj) {
                int iOrdinal = aVar2.ordinal();
                if (iOrdinal == 0) {
                    f2 = 16;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f2 = 24;
                }
                objN = oi.k.t(f2, g0Var);
            }
            float f4 = ((y3.f) objN).A;
            b2.o oVar = b2.o.A;
            b2.r rVarD = z1.d(oVar, 1.0f);
            h0.v vVarA = h0.u.a(h0.i.g(16), b2.b.M, g0Var, 6);
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
            b3.f fVar2 = b3.h.f;
            l1.q.I(vVarA, g0Var, fVar2);
            b3.f fVar3 = b3.h.e;
            l1.q.I(m1VarM, g0Var, fVar3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar4 = b3.h.g;
            l1.q.I(numValueOf, g0Var, fVar4);
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var, eVar);
            b3.f fVar5 = b3.h.d;
            l1.q.I(rVarC, g0Var, fVar5);
            b2.r rVarE = h0.c.E(z1.d(oVar, 1.0f), f4, 0.0f, 2);
            v1 v1VarA = t1.a(h0.i.g(4), b2.b.K, g0Var, 54);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarE, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA, g0Var, fVar2);
            l1.q.I(m1VarM2, g0Var, fVar3);
            a1.b.v(iHashCode2, g0Var, fVar4, g0Var, eVar);
            l1.q.I(rVarC2, g0Var, fVar5);
            if (fVar != null) {
                g0Var.c0(1435121010);
                z2 = false;
                f3 = 1.0f;
                z3 = true;
                h(null, 0.0f, 0.0f, 0L, g0Var, 0, 15);
                g0Var.r(false);
            } else {
                z2 = false;
                f3 = 1.0f;
                z3 = true;
                g0Var.c0(1435168099);
                g0Var.r(false);
            }
            if (f3 <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            z6.b(str, new c1(f3, z3), dl.a.n, kh.o.z(22), q3.u.E, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 1, 0, (u00.k) null, (r0) null, g0Var, (i2 & 14) | 1597440, 24576, 245672);
            l1.g0 g0Var2 = g0Var;
            if (aVar != null) {
                g0Var2.c0(1435497443);
                z6.b(z3.U(g0Var2, 2131887202), w50.c.o(oVar, z2, null, aVar, 7), dl.a.m, kh.o.z(15), (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var2, 24576, 0, 262120);
                g0Var2 = g0Var2;
                g0Var2.r(z2);
            } else {
                g0Var2.c0(1435757347);
                g0Var2.r(z2);
            }
            g0Var2.r(z3);
            b2.r rVarD2 = z1.d(r24, f3);
            p1 p1VarE = h0.c.e(f4, 0.0f, 2);
            h0.f fVarG = h0.i.g(12);
            boolean z5 = ((i2 & 896) == 256 ? z3 : z2) | (((i2 & 112) == 32 || g0Var2.i(reciters)) ? z3 : z2) | ((i2 & 7168) == 2048 ? z3 : z2) | ((i2 & 57344) == 16384 ? z3 : z2);
            Object objN2 = g0Var2.N();
            if (z5 || objN2 == obj) {
                onReciterClicked = kVar;
                z4 = z;
                downloadedReciters = bVar;
                objN2 = new ix.q(reciters, onReciterClicked, z4, downloadedReciters);
                g0Var2.n0(objN2);
            } else {
                onReciterClicked = kVar;
                z4 = z;
                downloadedReciters = bVar;
            }
            l1.g0 g0Var3 = g0Var2;
            k00.f.e(rVarD2, null, p1VarE, fVarG, null, null, false, null, (u00.k) objN2, g0Var3, 24582, 490);
            g0Var = g0Var3;
            g0Var.r(z3);
            rVar2 = r24;
        } else {
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new g1.v1(str, reciters, onReciterClicked, z4, downloadedReciters, rVar2, fVar, aVar, i);
        }
    }

    public static final void L(final boolean z, final float f2, final float f3, l1.j jVar, final int i) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-134579510);
        int i2 = (i & 6) == 0 ? (g0Var.h(z) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= g0Var.d(f2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= g0Var.d(f3) ? 256 : 128;
        }
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            float f4 = z ? 110 : 160;
            float f5 = z ? 80 : 100;
            float f6 = z ? 18 : 20;
            b2.o oVar = b2.o.A;
            b2.r rVarD = z1.d(oVar, 1.0f);
            h0.v vVarA = h0.u.a(h0.i.g(16), b2.b.M, g0Var, 6);
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
            l1.q.I(vVarA, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            l1.q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var, eVar);
            int i3 = i2;
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC, g0Var, fVar4);
            O(f3, (i3 >> 6) & 14, 0, h0.c.E(oVar, f2, 0.0f, 2), g0Var);
            b2.r rVarM = z.n.m(z1.d(oVar, 1.0f), z.n.l(g0Var), true, false);
            v1 v1VarA = t1.a(h0.i.g(12), b2.b.J, g0Var, 6);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarM, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA, g0Var, fVar);
            l1.q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC2, g0Var, fVar4);
            h0.c.h(z1.q(oVar, f2), g0Var);
            g0Var.c0(-1386776603);
            int i4 = 0;
            for (int i5 = 6; i4 < i5; i5 = i5) {
                h0.v vVarA2 = h0.u.a(h0.i.g(8), b2.b.N, g0Var, 54);
                int iHashCode3 = Long.hashCode(g0Var.T);
                m1 m1VarM3 = g0Var.m();
                b2.r rVarC3 = b2.a.c(oVar, g0Var);
                b3.i.c.getClass();
                b3.g gVar2 = b3.h.b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar2);
                } else {
                    g0Var.q0();
                }
                l1.q.I(vVarA2, g0Var, b3.h.f);
                l1.q.I(m1VarM3, g0Var, b3.h.e);
                l1.q.I(Integer.valueOf(iHashCode3), g0Var, b3.h.g);
                l1.q.E(g0Var, b3.h.h);
                l1.q.I(rVarC3, g0Var, b3.h.d);
                Q(f4, 0, null, g0Var);
                P(f6, null, new y3.f(f5), 0.0f, g0Var, 0, 10);
                g0Var.r(true);
                i4++;
            }
            g0Var.r(false);
            h0.c.h(z1.q(oVar, f2), g0Var);
            g0Var.r(true);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = l1.q.K(i | 1);
                    k.L(z, f2, f3, (l1.j) obj, iK);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void M(int i, long j, long j2, b2.r rVar, String str, l1.j jVar) {
        l1.j jVar2;
        l1.j jVar3 = (l1.g0) jVar;
        jVar3.e0(-795664434);
        int i2 = i | (jVar3.g(str) ? 32 : 16);
        if (jVar3.S(i2 & 1, (i2 & 9363) != 9362)) {
            jVar2 = jVar3;
            z6.b(str, h0.s.a.a(rVar, b2.b.G), dl.a.k, j, q3.u.L, (q3.i) null, 0L, (x3.l) null, (x3.k) null, j2, 2, false, 2, 0, (u00.k) null, (r0) null, jVar2, ((i2 >> 3) & 14) | 1597440, 25008, 239528);
        } else {
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new iw.c(str, j, j2, rVar, i, 2);
        }
    }

    public static final void N(final float f2, final b2.r rVar, float f3, long j, long j2, l1.j jVar, final int i) {
        final float f4;
        final long j3;
        final long j4;
        long j5;
        long j6;
        int i2;
        float f5;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(846288197);
        int i3 = i | (g0Var.d(f2) ? 4 : 2) | (g0Var.g(rVar) ? 32 : 16) | 9600;
        if (g0Var.S(i3 & 1, (i3 & 9363) != 9362)) {
            g0Var.X();
            if ((i & 1) == 0 || g0Var.A()) {
                j5 = dl.a.F;
                j6 = dl.a.L;
                i2 = i3 & (-64513);
                f5 = 400.0f;
            } else {
                g0Var.V();
                i2 = i3 & (-64513);
                f5 = f3;
                j5 = j;
                j6 = j2;
            }
            g0Var.s();
            boolean z = (i2 & 14) == 4;
            Object objN = g0Var.N();
            if (z || objN == l1.i.a) {
                objN = l1.q.r(new i0(f2, 2));
                g0Var.n0(objN);
            }
            h0.o.a(z.n.e(z1.e(z1.d(rVar, 1.0f), f5), sg.f.Q(new g00.k[]{new g00.k(Float.valueOf(0.0f), new i2.t(j5)), new g00.k(Float.valueOf(((Number) ((p2) objN).getValue()).floatValue()), new i2.t(j6)), new g00.k(Float.valueOf(1.0f), new i2.t(j6))}), (t0) null, 6), g0Var, 0);
            f4 = f5;
            j3 = j5;
            j4 = j6;
        } else {
            g0Var.V();
            f4 = f3;
            j3 = j;
            j4 = j2;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n(f2, rVar, f4, j3, j4, i) {
                public final float A;
                public final b2.r B;
                public final float C;
                public final long D;
                public final long E;

                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = l1.q.K(1);
                    k.N(this.A, this.B, this.C, this.D, this.E, (l1.j) obj, iK);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void O(float f2, int i, int i2, b2.r rVar, l1.j jVar) {
        int i3;
        b2.r rVar2;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1785192527);
        if ((i & 6) == 0) {
            i3 = (g0Var.d(f2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= g0Var.g(rVar) ? 32 : 16;
        }
        if (g0Var.S(i3 & 1, (i3 & 19) != 18)) {
            b2.r rVar3 = i4 != 0 ? b2.o.A : rVar;
            b2.r rVarD = z1.d(rVar3, 1.0f);
            v1 v1VarA = t1.a(h0.i.g, b2.b.K, g0Var, 54);
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
            P(22, null, new y3.f(f2), 0.0f, g0Var, ((i3 << 6) & 896) | 6, 10);
            P(15, null, new y3.f(52), 0.0f, g0Var, 390, 10);
            g0Var.r(true);
            rVar2 = rVar3;
        } else {
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new ix.j(f2, rVar2, i, i2, 2);
        }
    }

    public static final void P(final float f2, b2.r rVar, y3.f fVar, float f3, l1.j jVar, final int i, final int i2) {
        int i3;
        b2.r rVar2;
        int i4;
        y3.f fVar2;
        int i5;
        int i6;
        float f4;
        int i7;
        boolean z;
        final b2.r rVar3;
        final y3.f fVar3;
        final float f5;
        r1 r1VarT;
        b2.r rVar4;
        float f6;
        b2.r rVarE;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1120544624);
        if ((i & 6) == 0) {
            i3 = (g0Var.d(f2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                rVar2 = rVar;
                i3 |= g0Var.g(rVar2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    fVar2 = fVar;
                    if (g0Var.g(fVar2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        f4 = f3;
                        if (g0Var.d(f4)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    if ((i3 & 1171) != 1170) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (g0Var.S(i3 & 1, z)) {
                        rVar4 = b2.o.A;
                        if (i8 != 0) {
                            rVar2 = rVar4;
                        }
                        if (i4 != 0) {
                            fVar3 = null;
                        } else {
                            fVar3 = fVar2;
                        }
                        if (i6 != 0) {
                            f6 = 6;
                        } else {
                            f6 = f4;
                        }
                        if (fVar3 != null) {
                            rVarE = z1.n(rVar4, fVar3.A, f2);
                        } else {
                            rVarE = z1.e(rVar4, f2);
                        }
                        h0.o.a(rd.a.g0(f6, 0, dl.a.s, rVar2.V(rVarE), true), g0Var, 0);
                        rVar3 = rVar2;
                        f5 = f6;
                    } else {
                        g0Var.V();
                        rVar3 = rVar2;
                        fVar3 = fVar2;
                        f5 = f4;
                    }
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        r1VarT.d = new u00.n() {
                            @Override
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                k.P(f2, rVar3, fVar3, f5, (l1.j) obj, l1.q.K(i | 1), i2);
                                return g00.b0.a;
                            }
                        };
                    }
                }
                i3 |= 3072;
                f4 = f3;
                if ((i3 & 1171) != 1170) {
                    z = true;
                } else {
                    z = false;
                }
                if (g0Var.S(i3 & 1, z)) {
                    rVar4 = b2.o.A;
                    if (i8 != 0) {
                        rVar2 = rVar4;
                    }
                    if (i4 != 0) {
                        fVar3 = null;
                    } else {
                        fVar3 = fVar2;
                    }
                    if (i6 != 0) {
                        f6 = 6;
                    } else {
                        f6 = f4;
                    }
                    if (fVar3 != null) {
                        rVarE = z1.n(rVar4, fVar3.A, f2);
                    } else {
                        rVarE = z1.e(rVar4, f2);
                    }
                    h0.o.a(rd.a.g0(f6, 0, dl.a.s, rVar2.V(rVarE), true), g0Var, 0);
                    rVar3 = rVar2;
                    f5 = f6;
                } else {
                    g0Var.V();
                    rVar3 = rVar2;
                    fVar3 = fVar2;
                    f5 = f4;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.d = new u00.n() {
                        @Override
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            k.P(f2, rVar3, fVar3, f5, (l1.j) obj, l1.q.K(i | 1), i2);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i3 |= 384;
            fVar2 = fVar;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    f4 = f3;
                    if (g0Var.d(f4)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i3 & 1171) != 1170) {
                    z = true;
                } else {
                    z = false;
                }
                if (g0Var.S(i3 & 1, z)) {
                    rVar4 = b2.o.A;
                    if (i8 != 0) {
                        rVar2 = rVar4;
                    }
                    if (i4 != 0) {
                        fVar3 = null;
                    } else {
                        fVar3 = fVar2;
                    }
                    if (i6 != 0) {
                        f6 = 6;
                    } else {
                        f6 = f4;
                    }
                    if (fVar3 != null) {
                        rVarE = z1.n(rVar4, fVar3.A, f2);
                    } else {
                        rVarE = z1.e(rVar4, f2);
                    }
                    h0.o.a(rd.a.g0(f6, 0, dl.a.s, rVar2.V(rVarE), true), g0Var, 0);
                    rVar3 = rVar2;
                    f5 = f6;
                } else {
                    g0Var.V();
                    rVar3 = rVar2;
                    fVar3 = fVar2;
                    f5 = f4;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.d = new u00.n() {
                        @Override
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            k.P(f2, rVar3, fVar3, f5, (l1.j) obj, l1.q.K(i | 1), i2);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i3 |= 3072;
            f4 = f3;
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (g0Var.S(i3 & 1, z)) {
                rVar4 = b2.o.A;
                if (i8 != 0) {
                    rVar2 = rVar4;
                }
                if (i4 != 0) {
                    fVar3 = null;
                } else {
                    fVar3 = fVar2;
                }
                if (i6 != 0) {
                    f6 = 6;
                } else {
                    f6 = f4;
                }
                if (fVar3 != null) {
                    rVarE = z1.n(rVar4, fVar3.A, f2);
                } else {
                    rVarE = z1.e(rVar4, f2);
                }
                h0.o.a(rd.a.g0(f6, 0, dl.a.s, rVar2.V(rVarE), true), g0Var, 0);
                rVar3 = rVar2;
                f5 = f6;
            } else {
                g0Var.V();
                rVar3 = rVar2;
                fVar3 = fVar2;
                f5 = f4;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        k.P(f2, rVar3, fVar3, f5, (l1.j) obj, l1.q.K(i | 1), i2);
                        return g00.b0.a;
                    }
                };
            }
        }
        i3 |= 48;
        rVar2 = rVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                fVar2 = fVar;
                if (g0Var.g(fVar2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    f4 = f3;
                    if (g0Var.d(f4)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i3 & 1171) != 1170) {
                    z = true;
                } else {
                    z = false;
                }
                if (g0Var.S(i3 & 1, z)) {
                    rVar4 = b2.o.A;
                    if (i8 != 0) {
                        rVar2 = rVar4;
                    }
                    if (i4 != 0) {
                        fVar3 = null;
                    } else {
                        fVar3 = fVar2;
                    }
                    if (i6 != 0) {
                        f6 = 6;
                    } else {
                        f6 = f4;
                    }
                    if (fVar3 != null) {
                        rVarE = z1.n(rVar4, fVar3.A, f2);
                    } else {
                        rVarE = z1.e(rVar4, f2);
                    }
                    h0.o.a(rd.a.g0(f6, 0, dl.a.s, rVar2.V(rVarE), true), g0Var, 0);
                    rVar3 = rVar2;
                    f5 = f6;
                } else {
                    g0Var.V();
                    rVar3 = rVar2;
                    fVar3 = fVar2;
                    f5 = f4;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.d = new u00.n() {
                        @Override
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            k.P(f2, rVar3, fVar3, f5, (l1.j) obj, l1.q.K(i | 1), i2);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i3 |= 3072;
            f4 = f3;
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (g0Var.S(i3 & 1, z)) {
                rVar4 = b2.o.A;
                if (i8 != 0) {
                    rVar2 = rVar4;
                }
                if (i4 != 0) {
                    fVar3 = null;
                } else {
                    fVar3 = fVar2;
                }
                if (i6 != 0) {
                    f6 = 6;
                } else {
                    f6 = f4;
                }
                if (fVar3 != null) {
                    rVarE = z1.n(rVar4, fVar3.A, f2);
                } else {
                    rVarE = z1.e(rVar4, f2);
                }
                h0.o.a(rd.a.g0(f6, 0, dl.a.s, rVar2.V(rVarE), true), g0Var, 0);
                rVar3 = rVar2;
                f5 = f6;
            } else {
                g0Var.V();
                rVar3 = rVar2;
                fVar3 = fVar2;
                f5 = f4;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        k.P(f2, rVar3, fVar3, f5, (l1.j) obj, l1.q.K(i | 1), i2);
                        return g00.b0.a;
                    }
                };
            }
        }
        i3 |= 384;
        fVar2 = fVar;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                f4 = f3;
                if (g0Var.d(f4)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (g0Var.S(i3 & 1, z)) {
                rVar4 = b2.o.A;
                if (i8 != 0) {
                    rVar2 = rVar4;
                }
                if (i4 != 0) {
                    fVar3 = null;
                } else {
                    fVar3 = fVar2;
                }
                if (i6 != 0) {
                    f6 = 6;
                } else {
                    f6 = f4;
                }
                if (fVar3 != null) {
                    rVarE = z1.n(rVar4, fVar3.A, f2);
                } else {
                    rVarE = z1.e(rVar4, f2);
                }
                h0.o.a(rd.a.g0(f6, 0, dl.a.s, rVar2.V(rVarE), true), g0Var, 0);
                rVar3 = rVar2;
                f5 = f6;
            } else {
                g0Var.V();
                rVar3 = rVar2;
                fVar3 = fVar2;
                f5 = f4;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        k.P(f2, rVar3, fVar3, f5, (l1.j) obj, l1.q.K(i | 1), i2);
                        return g00.b0.a;
                    }
                };
            }
        }
        i3 |= 3072;
        f4 = f3;
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (g0Var.S(i3 & 1, z)) {
            rVar4 = b2.o.A;
            if (i8 != 0) {
                rVar2 = rVar4;
            }
            if (i4 != 0) {
                fVar3 = null;
            } else {
                fVar3 = fVar2;
            }
            if (i6 != 0) {
                f6 = 6;
            } else {
                f6 = f4;
            }
            if (fVar3 != null) {
                rVarE = z1.n(rVar4, fVar3.A, f2);
            } else {
                rVarE = z1.e(rVar4, f2);
            }
            h0.o.a(rd.a.g0(f6, 0, dl.a.s, rVar2.V(rVarE), true), g0Var, 0);
            rVar3 = rVar2;
            f5 = f6;
        } else {
            g0Var.V();
            rVar3 = rVar2;
            fVar3 = fVar2;
            f5 = f4;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    k.P(f2, rVar3, fVar3, f5, (l1.j) obj, l1.q.K(i | 1), i2);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void Q(float f2, int i, b2.r rVar, l1.j jVar) {
        int i2;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1633671179);
        if ((i & 6) == 0) {
            i2 = (g0Var.d(f2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (g0Var.S(i3 & 1, (i3 & 19) != 18)) {
            rVar = b2.o.A;
            h0.o.a(rd.a.g0(f2 / 2, 0, dl.a.s, z1.m(rVar, f2), true), g0Var, 0);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new kz.d(f2, rVar, i);
        }
    }

    public static final void R(dw.a aVar, long j, long j2, b2.r rVar, l1.j jVar, int i) {
        int i2;
        dw.a aVar2;
        boolean z;
        b2.r rVar2;
        b3.e eVar;
        boolean z2;
        b2.c cVar;
        u00.n nVar;
        long j3;
        long jZ;
        int i3;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-69136020);
        if ((i & 48) == 0) {
            i2 = ((i & 64) == 0 ? g0Var.g(aVar) : g0Var.i(aVar) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= g0Var.f(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= g0Var.f(j2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= g0Var.g(rVar) ? 16384 : 8192;
        }
        if (g0Var.S(i2 & 1, (i2 & 9361) != 9360)) {
            gm.a aVar3 = (gm.a) g0Var.k(dl.e.a);
            Object objN = g0Var.N();
            l1.c cVar2 = l1.i.a;
            if (objN == cVar2) {
                int iOrdinal = aVar3.ordinal();
                if (iOrdinal == 0) {
                    i3 = 58;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i3 = 92;
                }
                objN = oi.k.t(i3, g0Var);
            }
            float f2 = ((y3.f) objN).A;
            Object objN2 = g0Var.N();
            if (objN2 == cVar2) {
                int iOrdinal2 = aVar3.ordinal();
                if (iOrdinal2 == 0) {
                    jZ = kh.o.z(12);
                } else {
                    if (iOrdinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jZ = kh.o.z(16);
                }
                objN2 = new y3.o(jZ);
                g0Var.n0(objN2);
            }
            long j4 = ((y3.o) objN2).a;
            b2.r rVarV = rVar.V(z1.c);
            h0.d dVar = h0.i.c;
            b2.c cVar3 = b2.b.M;
            h0.v vVarA = h0.u.a(dVar, cVar3, g0Var, 0);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarV, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            u00.n nVar2 = b3.h.f;
            l1.q.I(vVarA, g0Var, nVar2);
            b3.f fVar = b3.h.e;
            l1.q.I(m1VarM, g0Var, fVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar2 = b3.h.g;
            l1.q.I(numValueOf, g0Var, fVar2);
            b3.e eVar2 = b3.h.h;
            l1.q.E(g0Var, eVar2);
            b3.f fVar3 = b3.h.d;
            l1.q.I(rVarC, g0Var, fVar3);
            String strB = aVar.b();
            b2.r rVar3 = b2.o.A;
            if (strB == null) {
                g0Var.c0(-1195790668);
                g0Var.r(false);
                rVar2 = rVar3;
                z = false;
                eVar = eVar2;
                cVar = cVar3;
                z2 = true;
                nVar = nVar2;
                j3 = j4;
            } else {
                g0Var.c0(-1195790667);
                wb.h hVar = new wb.h((Context) g0Var.k(o0.b));
                hVar.c = strB;
                z = false;
                rVar2 = rVar3;
                eVar = eVar2;
                z2 = true;
                cVar = cVar3;
                nVar = nVar2;
                j3 = j4;
                z.n.c(mb.l.i(w.c.q(hVar, 600), (z2.p) null, g0Var, 0, 62), (String) null, f2.h.c(z1.m(rVar3, f2), p0.f.a), (b2.d) null, z2.o.a, 0.0f, g0Var, 24624, 104);
                g0Var.r(false);
            }
            b2.r rVarD = z1.d(rVar2, 1.0f);
            if (!(((double) 1.0f) > 0.0d ? z2 : z)) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            b2.r rVarV2 = rVarD.V(new c1(1.0f, z2));
            h0.v vVarA2 = h0.u.a(h0.i.d, cVar, g0Var, 6);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarV2, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA2, g0Var, nVar);
            l1.q.I(m1VarM2, g0Var, fVar);
            a1.b.v(iHashCode2, g0Var, fVar2, g0Var, eVar);
            l1.q.I(rVarC2, g0Var, fVar3);
            z6.b(z3.U(g0Var, 2131886987), (b2.r) null, dl.a.p, j3, (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(16), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 24576, 48, 260074);
            String strA = aVar.a();
            aVar2 = aVar;
            if (strA == null) {
                strA = aVar2.c;
            }
            z6.b(strA, (b2.r) null, dl.a.k, j, q3.u.M, (q3.i) null, 0L, (x3.l) null, (x3.k) null, j2, 2, false, 2, 0, (u00.k) null, (r0) null, g0Var, ((i2 << 6) & 57344) | 1572864, ((i2 >> 6) & 112) | 24960, 239530);
            g0Var = g0Var;
            g0Var.r(z2);
            g0Var.r(z2);
        } else {
            aVar2 = aVar;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new iw.b(aVar2, j, j2, rVar, i, 1);
        }
    }

    public static final void S(boolean z, u00.a aVar, l1.j jVar, int i) {
        boolean z2;
        boolean z3;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1592491003);
        int i2 = (g0Var.h(z) ? 4 : 2) | i | (g0Var.i(aVar) ? 32 : 16);
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            b2.o oVar = b2.o.A;
            b2.r rVarD = z1.d(oVar, 1.0f);
            b2.h hVar = b2.b.K;
            v1 v1VarA = t1.a(h0.i.a, hVar, g0Var, 48);
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
            l1.q.I(v1VarA, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            l1.q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC, g0Var, fVar4);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            c1 c1Var = new c1(1.0f, true);
            v1 v1VarA2 = t1.a(h0.i.g(8), hVar, g0Var, 54);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(c1Var, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA2, g0Var, fVar);
            l1.q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC2, g0Var, fVar4);
            D(z3.U(g0Var, 2131886606), null, null, false, false, g0Var, 27648, 6);
            if (z) {
                g0Var.c0(-790939853);
                z2 = false;
                z3 = true;
                ct.h0.a(null, g0Var, 0, 1);
            } else {
                z2 = false;
                z3 = true;
                g0Var.c0(1250699087);
            }
            g0Var.r(z2);
            g0Var.r(z3);
            z6.b(z3.U(g0Var, 2131887203), w50.c.o(oVar, z2, null, aVar, 7), dl.a.m, kh.o.z(15), (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 24576, 0, 262120);
            g0Var = g0Var;
            g0Var.r(z3);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new c00.n(z, aVar, i, 7);
        }
    }

    public static final void T(h1 h1Var, u00.k kVar, l1.j jVar, int i) {
        int i2;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1202113552);
        if ((i & 6) == 0) {
            i2 = (g0Var.g(h1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.i(kVar) ? 32 : 16;
        }
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            b2.o oVar = b2.o.A;
            float f2 = 16;
            b2.r rVarG = h0.c.G(z.n.f(f2.h.c(z1.d(oVar, 1.0f), p0.f.a(24)), i2.t.b(0.08f, dl.a.i), i2.b0.b), 0.0f, 0.0f, 0.0f, f2, 7);
            h0.v vVarA = h0.u.a(h0.i.c, b2.b.N, g0Var, 48);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarG, g0Var);
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
            c0(h1Var, h0.c.C(oVar, f2), g0Var, (i2 & 14) | 48, 0);
            int i3 = i2;
            mr.g gVar2 = h1Var.u;
            int i4 = h1Var.q;
            int i5 = i3 & 112;
            boolean z = i5 == 32;
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (z || objN == obj) {
                objN = new d1(28, kVar);
                g0Var.n0(objN);
            }
            u00.a aVar = (u00.a) objN;
            boolean z2 = i5 == 32;
            Object objN2 = g0Var.N();
            if (z2 || objN2 == obj) {
                objN2 = new d1(17, kVar);
                g0Var.n0(objN2);
            }
            Y(gVar2, i4, aVar, (u00.a) objN2, f2, g0Var, 24576);
            g0Var = g0Var;
            u30.b bVar = h1Var.v;
            boolean z3 = i5 == 32;
            Object objN3 = g0Var.N();
            if (z3 || objN3 == obj) {
                objN3 = new d1(18, kVar);
                g0Var.n0(objN3);
            }
            h0.d(bVar, (u00.a) objN3, null, g0Var, 0);
            b2.r rVarE = h0.c.E(z1.d(oVar, 1.0f), f2, 0.0f, 2);
            boolean z4 = h1Var.j != null;
            boolean z5 = i5 == 32;
            Object objN4 = g0Var.N();
            if (z5 || objN4 == obj) {
                objN4 = new d1(19, kVar);
                g0Var.n0(objN4);
            }
            u00.a aVar2 = (u00.a) objN4;
            boolean z6 = i5 == 32;
            Object objN5 = g0Var.N();
            if (z6 || objN5 == obj) {
                objN5 = new d1(20, kVar);
                g0Var.n0(objN5);
            }
            X(z4, aVar2, (u00.a) objN5, rVarE, g0Var, 3072);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new f0(h1Var, kVar, i, 0);
        }
    }

    public static final void U(boolean z, float f2, l1.j jVar, int i) {
        int i2;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-772917728);
        if ((i & 6) == 0) {
            i2 = (g0Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.d(f2) ? 32 : 16;
        }
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            b2.r rVarE = h0.c.E(z1.d(b2.o.A, 1.0f), f2, 0.0f, 2);
            h0.v vVarA = h0.u.a(h0.i.g(16), b2.b.M, g0Var, 6);
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
            l1.q.I(vVarA, g0Var, b3.h.f);
            l1.q.I(m1VarM, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC, g0Var, b3.h.d);
            O(100, 6, 2, null, g0Var);
            if (z) {
                g0Var.c0(-1136840872);
                G(g0Var, 0);
                g0Var.r(false);
            } else {
                g0Var.c0(-1136783305);
                r(g0Var, 0);
                g0Var.r(false);
            }
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new l(z, f2, i, 1);
        }
    }

    public static final void V(h1 h1Var, u00.k kVar, l1.j jVar, int i) {
        int i2;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-2073900672);
        if ((i & 6) == 0) {
            i2 = i | (g0Var.g(h1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.i(kVar) ? 32 : 16;
        }
        int i3 = i2;
        if (g0Var.S(i3 & 1, (i3 & 19) != 18)) {
            y3.c cVar = (y3.c) g0Var.k(o1.h);
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (objN == obj) {
                objN = x5.s(0, g0Var);
            }
            z0 z0Var = (z0) objN;
            b2.o oVar = b2.o.A;
            b2.r rVarD = z1.d(oVar, 1.0f);
            v1 v1VarA = t1.a(h0.i.g(32), b2.b.K, g0Var, 54);
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
            l1.q.I(v1VarA, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            l1.q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC, g0Var, fVar4);
            b2.r rVarQ = z1.q(oVar, 350);
            boolean zG = g0Var.g(cVar);
            Object objN2 = g0Var.N();
            if (zG || objN2 == obj) {
                objN2 = new as.f0(cVar, z0Var, 20);
                g0Var.n0(objN2);
            }
            b2.r rVarO = z2.d0.o(rVarQ, (u00.k) objN2);
            b2.g gVar2 = b2.b.N;
            float f2 = 16;
            h0.v vVarA = h0.u.a(h0.i.g(f2), gVar2, g0Var, 54);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarO, g0Var);
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
            mr.g gVar3 = h1Var.u;
            int i4 = h1Var.q;
            float f3 = 0;
            int i5 = i3 & 112;
            boolean z = i5 == 32;
            Object objN3 = g0Var.N();
            if (z || objN3 == obj) {
                objN3 = new d1(21, kVar);
                g0Var.n0(objN3);
            }
            u00.a aVar = (u00.a) objN3;
            boolean z2 = i5 == 32;
            Object objN4 = g0Var.N();
            if (z2 || objN4 == obj) {
                objN4 = new d1(24, kVar);
                g0Var.n0(objN4);
            }
            Y(gVar3, i4, aVar, (u00.a) objN4, f3, g0Var, 24576);
            g0Var = g0Var;
            b2.r rVarD2 = z1.d(oVar, 1.0f);
            boolean z3 = h1Var.j != null;
            boolean z4 = i5 == 32;
            Object objN5 = g0Var.N();
            if (z4 || objN5 == obj) {
                objN5 = new d1(25, kVar);
                g0Var.n0(objN5);
            }
            u00.a aVar2 = (u00.a) objN5;
            boolean z5 = i5 == 32;
            Object objN6 = g0Var.N();
            if (z5 || objN6 == obj) {
                objN6 = new d1(26, kVar);
                g0Var.n0(objN6);
            }
            X(z3, aVar2, (u00.a) objN6, rVarD2, g0Var, 3072);
            g0Var.r(true);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            b2.r rVarC3 = h0.c.C(z.n.f(f2.h.c(z1.e(new c1(1.0f, true), ((y3.f) z0Var.getValue()).A), p0.f.a(20)), i2.t.b(0.08f, dl.a.i), i2.b0.b), f2);
            h0.v vVarA2 = h0.u.a(h0.i.g(12), gVar2, g0Var, 54);
            int iHashCode3 = Long.hashCode(g0Var.T);
            m1 m1VarM3 = g0Var.m();
            b2.r rVarC4 = b2.a.c(rVarC3, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA2, g0Var, fVar);
            l1.q.I(m1VarM3, g0Var, fVar2);
            a1.b.v(iHashCode3, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC4, g0Var, fVar4);
            c0(h1Var, null, g0Var, i3 & 14, 2);
            u30.b bVar = h1Var.v;
            boolean z6 = i5 == 32;
            Object objN7 = g0Var.N();
            if (z6 || objN7 == obj) {
                objN7 = new d1(27, kVar);
                g0Var.n0(objN7);
            }
            h0.d(bVar, (u00.a) objN7, null, g0Var, 0);
            g0Var.r(true);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new f0(h1Var, kVar, i, 1);
        }
    }

    public static final void W(h1 uiState, u00.k onAction, b2.r rVar, l1.j jVar, int i) {
        int i2;
        l1.j jVar2;
        b2.r rVar2;
        float f2;
        kotlin.jvm.internal.m.e(uiState, "uiState");
        kotlin.jvm.internal.m.e(onAction, "onAction");
        l1.j jVar3 = (l1.g0) jVar;
        jVar3.e0(565489606);
        if ((i & 6) == 0) {
            i2 = i | (jVar3.g(uiState) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= jVar3.i(onAction) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (jVar3.S(i3 & 1, (i3 & 147) != 146)) {
            gm.a aVar = (gm.a) jVar3.k(dl.e.a);
            Configuration configuration = (Configuration) jVar3.k(o0.a);
            boolean zE = jVar3.e(aVar.ordinal());
            Object objN = jVar3.N();
            Object obj = l1.i.a;
            if (zE || objN == obj) {
                int iOrdinal = aVar.ordinal();
                if (iOrdinal == 0) {
                    f2 = 16;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f2 = 24;
                }
                objN = oi.k.t(f2, jVar3);
            }
            float f3 = ((y3.f) objN).A;
            b2.r rVar3 = b2.o.A;
            b2.r rVarE = h0.c.E(z1.d(rVar3, 1.0f), f3, 0.0f, 2);
            h0.v vVarA = h0.u.a(h0.i.g(16), b2.b.M, jVar3, 6);
            int iHashCode = Long.hashCode(((l1.g0) jVar3).T);
            m1 m1VarM = jVar3.m();
            b2.r rVarC = b2.a.c(rVarE, jVar3);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            jVar3.g0();
            if (((l1.g0) jVar3).S) {
                jVar3.l(gVar);
            } else {
                jVar3.q0();
            }
            l1.q.I(vVarA, jVar3, b3.h.f);
            l1.q.I(m1VarM, jVar3, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), jVar3, b3.h.g);
            l1.q.E(jVar3, b3.h.h);
            l1.q.I(rVarC, jVar3, b3.h.d);
            boolean z = uiState.z;
            int i4 = i3 & 112;
            boolean z2 = i4 == 32;
            Object objN2 = jVar3.N();
            if (z2 || objN2 == obj) {
                objN2 = new d1(22, onAction);
                jVar3.n0(objN2);
            }
            S(z, (u00.a) objN2, jVar3, 0);
            int iOrdinal2 = aVar.ordinal();
            if (iOrdinal2 == 0) {
                jVar3.c0(-1371363927);
                T(uiState, onAction, jVar3, i3 & 126);
                jVar3.r(false);
            } else {
                if (iOrdinal2 != 1) {
                    throw oi.k.r(jVar3, -1371365361, false);
                }
                jVar3.c0(437554998);
                if (y3.f.a(configuration.screenWidthDp - 350, RCHTTPStatusCodes.UNSUCCESSFUL) >= 0) {
                    jVar3.c0(437642232);
                    V(uiState, onAction, jVar3, i3 & 126);
                    jVar3.r(false);
                } else {
                    jVar3.c0(437820761);
                    T(uiState, onAction, jVar3, i3 & 126);
                    jVar3.r(false);
                }
                jVar3.r(false);
            }
            jVar3.r(true);
            String strU = z3.U(jVar3, 2131887343);
            String strU2 = z3.U(jVar3, 2131887341);
            String strU3 = z3.U(jVar3, 2131887342);
            boolean z3 = uiState.o;
            int i5 = uiState.q;
            boolean z4 = uiState.p;
            boolean z5 = i4 == 32;
            Object objN3 = jVar3.N();
            if (z5 || objN3 == obj) {
                objN3 = new d1(23, onAction);
                jVar3.n0(objN3);
            }
            u00.a aVar2 = (u00.a) objN3;
            boolean z6 = i4 == 32;
            Object objN4 = jVar3.N();
            if (z6 || objN4 == obj) {
                objN4 = new rx.c(15, onAction);
                jVar3.n0(objN4);
            }
            jVar2 = jVar3;
            el.a.a(z3, i5, strU, strU3, strU2, aVar2, null, 0, 0.0f, 0, 0.0f, 0L, 0L, false, false, null, (u00.k) objN4, z4, false, jVar2, 0, 100663296, 65472);
            rVar2 = rVar3;
        } else {
            jVar2 = jVar3;
            jVar2.V();
            rVar2 = rVar;
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new d0(uiState, onAction, rVar2, i, 1);
        }
    }

    public static final void X(boolean z, u00.a onContinueListening, u00.a onExploreSurahs, b2.r rVar, l1.j jVar, int i) {
        int i2;
        kotlin.jvm.internal.m.e(onContinueListening, "onContinueListening");
        kotlin.jvm.internal.m.e(onExploreSurahs, "onExploreSurahs");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1168048584);
        if ((i & 6) == 0) {
            i2 = (g0Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.i(onContinueListening) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= g0Var.i(onExploreSurahs) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= g0Var.g(rVar) ? 2048 : 1024;
        }
        if (g0Var.S(i2 & 1, (i2 & 1171) != 1170)) {
            i2.o0 o0Var = i2.b0.b;
            if (z) {
                g0Var.c0(489880522);
                b2.r rVarE = h0.c.E(w50.c.o(z.n.f(f2.h.c(rVar, p0.f.a(32)), i2.t.b(0.2f, dl.a.i), o0Var), false, null, onContinueListening, 7), 0.0f, 16, 1);
                v1 v1VarA = t1.a(h0.i.e, b2.b.K, g0Var, 54);
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
                l1.q.I(v1VarA, g0Var, b3.h.f);
                l1.q.I(m1VarM, g0Var, b3.h.e);
                l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
                l1.q.E(g0Var, b3.h.h);
                l1.q.I(rVarC, g0Var, b3.h.d);
                b2.o oVar = b2.o.A;
                b2.r rVarM = z1.m(oVar, 10);
                m2.b bVarR = y3.R(2131231358, g0Var, 0);
                long j = dl.a.n;
                z3.j(bVarR, (String) null, rVarM, j, g0Var, 440, 0);
                h0.c.h(z1.q(oVar, 6), g0Var);
                z6.b(z3.U(g0Var, 2131886366), (b2.r) null, j, kh.o.z(16), q3.u.C, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 0, 262058);
                g0Var = g0Var;
                g0Var.r(true);
                g0Var.r(false);
            } else {
                g0Var.c0(490804601);
                z6.b(z3.U(g0Var, 2131886501), h0.c.E(w50.c.o(z.n.f(f2.h.c(z1.d(rVar, 1.0f), p0.f.a(32)), i2.t.b(0.2f, dl.a.i), o0Var), false, null, onExploreSurahs, 7), 0.0f, 12, 1), dl.a.n, kh.o.z(16), q3.u.C, (q3.i) null, 0L, (x3.l) null, new x3.k(3), 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 0, 261032);
                g0Var = g0Var;
                g0Var.r(false);
            }
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new eu.g(z, onContinueListening, onExploreSurahs, rVar, i);
        }
    }

    public static final void Y(mr.g timerState, int i, u00.a onSelectDailyGoal, u00.a onStatisticsClicked, float f2, l1.j jVar, int i2) {
        int i3;
        String strY;
        kotlin.jvm.internal.m.e(timerState, "timerState");
        kotlin.jvm.internal.m.e(onSelectDailyGoal, "onSelectDailyGoal");
        kotlin.jvm.internal.m.e(onStatisticsClicked, "onStatisticsClicked");
        l1.j jVar2 = (l1.g0) jVar;
        jVar2.e0(1486044852);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? jVar2.g(timerState) : jVar2.i(timerState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= jVar2.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= jVar2.i(onSelectDailyGoal) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= jVar2.i(onStatisticsClicked) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= jVar2.d(f2) ? 16384 : 8192;
        }
        int i4 = i3 | 196608;
        if (jVar2.S(i4 & 1, (74899 & i4) != 74898)) {
            gm.a aVar = (gm.a) jVar2.k(dl.e.a);
            int i5 = i4 & 14;
            int i6 = 458752 & i4;
            boolean z = (i5 == 4 || ((i4 & 8) != 0 && jVar2.g(timerState))) | (i6 == 131072);
            Object objN = jVar2.N();
            Object obj = l1.i.a;
            if (z || objN == obj) {
                float fX = 0.0f;
                if (timerState instanceof mr.f) {
                    mr.f fVar = (mr.f) timerState;
                    fX = ab.a0.x(fVar.a / fVar.b, 0.0f, 1.0f);
                } else if (!(timerState instanceof mr.e)) {
                    if (!(timerState instanceof mr.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fX = 1.0f;
                }
                objN = Float.valueOf(fX);
                jVar2.n0(objN);
            }
            float fFloatValue = ((Number) objN).floatValue();
            boolean z2 = i5 == 4 || ((i4 & 8) != 0 && jVar2.g(timerState));
            Object objN2 = jVar2.N();
            if (z2 || objN2 == obj) {
                if (timerState instanceof mr.f) {
                    strY = f50.c.y(((mr.f) timerState).a);
                } else {
                    strY = timerState instanceof mr.e ? "0:00" : "";
                }
                objN2 = strY;
                jVar2.n0(objN2);
            }
            String str = (String) objN2;
            p2 p2VarB = x.d.b(fFloatValue, x.c.w(200, 0, (x.v) null, 6), (String) null, jVar2, 48, 28);
            boolean z3 = (i6 == 131072) | (i5 == 4 || ((i4 & 8) != 0 && jVar2.g(timerState)));
            Object objN3 = jVar2.N();
            if (z3 || objN3 == obj) {
                objN3 = Boolean.valueOf(timerState instanceof mr.d);
                jVar2.n0(objN3);
            }
            boolean zBooleanValue = ((Boolean) objN3).booleanValue();
            b2.o oVar = b2.o.A;
            b2.r rVarG = h0.c.G(z1.d(oVar, 1.0f).V(w50.c.o(oVar, false, null, onStatisticsClicked, 7)), 0.0f, 8, 0.0f, 0.0f, 13);
            b2.i iVar = b2.b.H;
            v1.c cVarD = v1.d.d(-152943714, new hx.r(f2, aVar, p2VarB, zBooleanValue, onSelectDailyGoal, str, i), jVar2);
            jVar2 = jVar2;
            h0.c.a(rVarG, iVar, false, cVarD, jVar2, 3120, 4);
        } else {
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new qo.q(timerState, i, onSelectDailyGoal, onStatisticsClicked, f2, i2);
        }
    }

    public static final void Z(o2.f fVar, long j, String str, String str2, b2.r rVar, l1.j jVar, int i) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1825596218);
        int i2 = i | (g0Var.g(fVar) ? 4 : 2) | (g0Var.f(j) ? 32 : 16) | (g0Var.g(str) ? 256 : 128) | (g0Var.g(str2) ? 2048 : 1024) | (g0Var.g(rVar) ? 16384 : 8192);
        if (g0Var.S(i2 & 1, (i2 & 9363) != 9362)) {
            b2.g gVar = b2.b.N;
            h0.v vVarA = h0.u.a(h0.i.g(4), gVar, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVar, g0Var);
            b3.i.c.getClass();
            b3.g gVar2 = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar2);
            } else {
                g0Var.q0();
            }
            b3.f fVar2 = b3.h.f;
            l1.q.I(vVarA, g0Var, fVar2);
            b3.f fVar3 = b3.h.e;
            l1.q.I(m1VarM, g0Var, fVar3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar4 = b3.h.g;
            l1.q.I(numValueOf, g0Var, fVar4);
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var, eVar);
            b3.f fVar5 = b3.h.d;
            l1.q.I(rVarC, g0Var, fVar5);
            b2.o oVar = b2.o.A;
            z3.k(fVar, (String) null, z1.m(oVar, 16), j, g0Var, (i2 & 14) | 432 | ((i2 << 6) & 7168));
            h0.v vVarA2 = h0.u.a(h0.i.g(2), gVar, g0Var, 54);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(oVar, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar2);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA2, g0Var, fVar2);
            l1.q.I(m1VarM2, g0Var, fVar3);
            a1.b.v(iHashCode2, g0Var, fVar4, g0Var, eVar);
            l1.q.I(rVarC2, g0Var, fVar5);
            z6.b(str, (b2.r) null, i2.t.b(0.5f, dl.a.k), kh.o.z(13), (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(13), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, ((i2 >> 6) & 14) | 24576, 48, 260074);
            z6.b(str2, (b2.r) null, dl.a.n, kh.o.z(15), q3.u.D, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(15), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, ((i2 >> 9) & 14) | 1597440, 48, 260010);
            g0Var = g0Var;
            g0Var.r(true);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new ct.n(fVar, j, str, str2, rVar, i, 1);
        }
    }

    public static final void a(final qr.g gVar, final float f2, final boolean z, final u00.k onStoryClicked, final u00.k onPlayClicked, final u00.k onDownloadClicked, final u00.k onShareClicked, b2.r rVar, l1.j jVar, final int i) {
        l1.g0 g0Var;
        b2.r rVar2;
        kotlin.jvm.internal.m.e(onStoryClicked, "onStoryClicked");
        kotlin.jvm.internal.m.e(onPlayClicked, "onPlayClicked");
        kotlin.jvm.internal.m.e(onDownloadClicked, "onDownloadClicked");
        kotlin.jvm.internal.m.e(onShareClicked, "onShareClicked");
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(-477725656);
        int i2 = i | (g0Var2.g(gVar) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= g0Var2.d(f2) ? 32 : 16;
        }
        int i3 = i2 | (g0Var2.h(z) ? 256 : 128) | (g0Var2.i(onStoryClicked) ? 2048 : 1024) | (g0Var2.i(onPlayClicked) ? 16384 : 8192) | (g0Var2.i(onDownloadClicked) ? 131072 : 65536) | (g0Var2.i(onShareClicked) ? 1048576 : 524288) | 12582912;
        if (g0Var2.S(i3 & 1, (4793491 & i3) != 4793490)) {
            to.a aVarC = to.b.c(g0Var2);
            b2.r rVar3 = b2.o.A;
            b2.r rVarD = z1.d(rVar3, 1.0f);
            float f3 = 16;
            h0.v vVarA = h0.u.a(h0.i.g(f3), b2.b.M, g0Var2, 6);
            int iHashCode = Long.hashCode(g0Var2.T);
            m1 m1VarM = g0Var2.m();
            b2.r rVarC = b2.a.c(rVarD, g0Var2);
            b3.i.c.getClass();
            b3.g gVar2 = b3.h.b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar2);
            } else {
                g0Var2.q0();
            }
            l1.q.I(vVarA, g0Var2, b3.h.f);
            l1.q.I(m1VarM, g0Var2, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var2, b3.h.g);
            l1.q.E(g0Var2, b3.h.h);
            l1.q.I(rVarC, g0Var2, b3.h.d);
            rVar2 = rVar3;
            z6.b(z3.U(g0Var2, 2131886148), h0.c.E(rVar3, f2, 0.0f, 2), dl.a.n, kh.o.z(22), q3.u.E, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 1, 0, (u00.k) null, (r0) null, g0Var2, 1597440, 24576, 245672);
            b2.r rVarD2 = z1.d(rVar2, 1.0f);
            p1 p1VarE = h0.c.e(f2, 0.0f, 2);
            h0.f fVarG = h0.i.g(f3);
            boolean z2 = !gVar.c;
            boolean zG = ((i3 & 14) == 4) | g0Var2.g(aVarC) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048) | ((57344 & i3) == 16384) | ((458752 & i3) == 131072) | ((i3 & 3670016) == 1048576);
            Object objN = g0Var2.N();
            if (zG || objN == l1.i.a) {
                q4 q4Var = new q4(gVar, aVarC, z, onStoryClicked, onPlayClicked, onDownloadClicked, onShareClicked);
                g0Var2.n0(q4Var);
                objN = q4Var;
            }
            k00.f.e(rVarD2, null, p1VarE, fVarG, null, null, z2, null, (u00.k) objN, g0Var2, 24582, 362);
            g0Var = g0Var2;
            g0Var.r(true);
        } else {
            g0Var = g0Var2;
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            final b2.r rVar4 = rVar2;
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    k.a(gVar, f2, z, onStoryClicked, onPlayClicked, onDownloadClicked, onShareClicked, rVar4, (l1.j) obj, l1.q.K(i | 1));
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void a0(l1.j jVar, int i) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(873775029);
        if (g0Var.S(i & 1, i != 0)) {
            h0.o.a(z.n.f(z1.e(z1.q(b2.o.A, 1), 28), i2.t.b(0.1f, dl.a.i), i2.b0.b), g0Var, 0);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new sw.a(i, 29);
        }
    }

    public static final void b(u00.a onClick, u00.a onDismiss, b2.r rVar, boolean z, l1.j jVar, int i, int i2) {
        boolean z2;
        boolean z3;
        u00.a aVar;
        boolean z4;
        r1 r1VarT;
        boolean z5;
        gm.a aVar2;
        boolean zE;
        Object objN;
        int iOrdinal;
        float f2;
        int iOrdinal2;
        int i3;
        int iOrdinal3;
        float f3;
        long jB;
        b3.g gVar;
        int iOrdinal4;
        long jZ;
        kotlin.jvm.internal.m.e(onClick, "onClick");
        kotlin.jvm.internal.m.e(onDismiss, "onDismiss");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1205638691);
        int i4 = (g0Var.i(onClick) ? 4 : 2) | i | (g0Var.i(onDismiss) ? 32 : 16) | (g0Var.g(rVar) ? 256 : 128);
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i4 |= g0Var.h(z2) ? 2048 : 1024;
            }
            if ((i4 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (g0Var.S(i4 & 1, z3)) {
                if (i5 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                aVar2 = (gm.a) g0Var.k(dl.e.a);
                zE = g0Var.e(aVar2.ordinal());
                objN = g0Var.N();
                if (zE || objN == l1.i.a) {
                    iOrdinal = aVar2.ordinal();
                    if (iOrdinal == 0) {
                        f2 = 20;
                    } else {
                        if (iOrdinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f2 = 24;
                    }
                    objN = oi.k.t(f2, g0Var);
                }
                float f4 = ((y3.f) objN).A;
                iOrdinal2 = aVar2.ordinal();
                if (iOrdinal2 != 0) {
                    i3 = 44;
                } else {
                    if (iOrdinal2 == 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i3 = 50;
                }
                float f5 = i3;
                iOrdinal3 = aVar2.ordinal();
                if (iOrdinal3 != 0) {
                    f3 = 20;
                } else {
                    if (iOrdinal3 == 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f3 = 24;
                }
                b2.r rVarC = f2.h.c(z1.d(rVar, 1.0f), p0.f.a(f4));
                if (z5) {
                    jB = dl.a.B;
                } else {
                    jB = i2.t.b(0.08f, dl.a.i);
                }
                long j = jB;
                i2.o0 o0Var = i2.b0.b;
                b2.r rVarC2 = h0.c.C(w50.c.n(z.n.f(rVarC, j, o0Var), true, onClick), 16);
                w0 w0VarD = h0.o.d(b2.b.A, false);
                int iHashCode = Long.hashCode(g0Var.T);
                m1 m1VarM = g0Var.m();
                b2.r rVarC3 = b2.a.c(rVarC2, g0Var);
                b3.i.c.getClass();
                gVar = b3.h.b;
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
                l1.q.I(rVarC3, g0Var, fVar4);
                b2.o oVar = b2.o.A;
                boolean z6 = z5;
                b2.r rVarD = z1.d(oVar, 1.0f);
                v1 v1VarA = t1.a(h0.i.g(12), b2.b.K, g0Var, 54);
                int iHashCode2 = Long.hashCode(g0Var.T);
                m1 m1VarM2 = g0Var.m();
                b2.r rVarC4 = b2.a.c(rVarD, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(v1VarA, g0Var, fVar);
                l1.q.I(m1VarM2, g0Var, fVar2);
                a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
                l1.q.I(rVarC4, g0Var, fVar4);
                b2.r rVarC5 = f2.h.c(z1.m(oVar, f5), p0.f.a);
                long j2 = dl.a.i;
                b2.r rVarF = z.n.f(rVarC5, i2.t.b(0.12f, j2), o0Var);
                w0 w0VarD2 = h0.o.d(b2.b.E, false);
                int iHashCode3 = Long.hashCode(g0Var.T);
                m1 m1VarM3 = g0Var.m();
                b2.r rVarC6 = b2.a.c(rVarF, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(w0VarD2, g0Var, fVar);
                l1.q.I(m1VarM3, g0Var, fVar2);
                a1.b.v(iHashCode3, g0Var, fVar3, g0Var, eVar);
                l1.q.I(rVarC6, g0Var, fVar4);
                o3.a(y3.R(2131231356, g0Var, 0), (String) null, z1.m(oVar, f3), j2, g0Var, 56, 0);
                g0Var.r(true);
                if (1.0f <= 0.0d) {
                    i0.a.a("invalid weight; must be greater than zero");
                }
                b2.r rVarG = h0.c.G(new c1(1.0f, true), 0.0f, 0.0f, 24, 0.0f, 11);
                h0.v vVarA = h0.u.a(h0.i.g(4), b2.b.M, g0Var, 6);
                int iHashCode4 = Long.hashCode(g0Var.T);
                m1 m1VarM4 = g0Var.m();
                b2.r rVarC7 = b2.a.c(rVarG, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(vVarA, g0Var, fVar);
                l1.q.I(m1VarM4, g0Var, fVar2);
                a1.b.v(iHashCode4, g0Var, fVar3, g0Var, eVar);
                l1.q.I(rVarC7, g0Var, fVar4);
                String strU = z3.U(g0Var, 2131886562);
                q3.u uVar = q3.u.E;
                long jZ2 = kh.o.z(16);
                long jZ3 = kh.o.z(20);
                long j3 = dl.a.k;
                z6.b(strU, (b2.r) null, j3, jZ2, uVar, (q3.i) null, 0L, (x3.l) null, (x3.k) null, jZ3, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 48, 260010);
                String strU2 = z3.U(g0Var, 2131886561);
                q3.u uVar2 = q3.u.B;
                iOrdinal4 = aVar2.ordinal();
                if (iOrdinal4 != 0) {
                    jZ = kh.o.z(13);
                } else {
                    if (iOrdinal4 == 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jZ = kh.o.z(15);
                }
                z6.b(strU2, (b2.r) null, i2.t.b(0.5f, j3), jZ, uVar2, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(18), 2, false, 2, 0, (u00.k) null, (r0) null, g0Var, 1572864, 25008, 239530);
                g0Var = g0Var;
                g0Var.r(true);
                g0Var.r(true);
                aVar = onDismiss;
                o3.a(y3.R(2131231104, g0Var, 0), (String) null, w50.c.o(z1.m(h0.c.G(h0.s.a.a(oVar, b2.b.C), 8, 0.0f, 0.0f, 0.0f, 14), 14), false, null, aVar, 7), dl.a.p, g0Var, 56, 0);
                g0Var.r(true);
                z4 = z6;
            } else {
                aVar = onDismiss;
                g0Var.V();
                z4 = z2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new gv.y(onClick, aVar, rVar, z4, i, i2);
            }
        }
        i4 |= 3072;
        z2 = z;
        if ((i4 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (g0Var.S(i4 & 1, z3)) {
            if (i5 != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            aVar2 = (gm.a) g0Var.k(dl.e.a);
            zE = g0Var.e(aVar2.ordinal());
            objN = g0Var.N();
            if (zE) {
                iOrdinal = aVar2.ordinal();
                if (iOrdinal == 0) {
                    f2 = 20;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f2 = 24;
                }
                objN = oi.k.t(f2, g0Var);
            } else {
                iOrdinal = aVar2.ordinal();
                if (iOrdinal == 0) {
                    f2 = 20;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f2 = 24;
                }
                objN = oi.k.t(f2, g0Var);
            }
            float f6 = ((y3.f) objN).A;
            iOrdinal2 = aVar2.ordinal();
            if (iOrdinal2 != 0) {
                i3 = 44;
            } else {
                if (iOrdinal2 == 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = 50;
            }
            float f7 = i3;
            iOrdinal3 = aVar2.ordinal();
            if (iOrdinal3 != 0) {
                f3 = 20;
            } else {
                if (iOrdinal3 == 1) {
                    throw new NoWhenBranchMatchedException();
                }
                f3 = 24;
            }
            b2.r rVarC8 = f2.h.c(z1.d(rVar, 1.0f), p0.f.a(f6));
            if (z5) {
                jB = dl.a.B;
            } else {
                jB = i2.t.b(0.08f, dl.a.i);
            }
            long j4 = jB;
            i2.o0 o0Var2 = i2.b0.b;
            b2.r rVarC9 = h0.c.C(w50.c.n(z.n.f(rVarC8, j4, o0Var2), true, onClick), 16);
            w0 w0VarD3 = h0.o.d(b2.b.A, false);
            int iHashCode5 = Long.hashCode(g0Var.T);
            m1 m1VarM5 = g0Var.m();
            b2.r rVarC10 = b2.a.c(rVarC9, g0Var);
            b3.i.c.getClass();
            gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar5 = b3.h.f;
            l1.q.I(w0VarD3, g0Var, fVar5);
            b3.f fVar6 = b3.h.e;
            l1.q.I(m1VarM5, g0Var, fVar6);
            Integer numValueOf2 = Integer.valueOf(iHashCode5);
            b3.f fVar7 = b3.h.g;
            l1.q.I(numValueOf2, g0Var, fVar7);
            b3.e eVar2 = b3.h.h;
            l1.q.E(g0Var, eVar2);
            b3.f fVar8 = b3.h.d;
            l1.q.I(rVarC10, g0Var, fVar8);
            b2.o oVar2 = b2.o.A;
            boolean z7 = z5;
            b2.r rVarD2 = z1.d(oVar2, 1.0f);
            v1 v1VarA2 = t1.a(h0.i.g(12), b2.b.K, g0Var, 54);
            int iHashCode6 = Long.hashCode(g0Var.T);
            m1 m1VarM6 = g0Var.m();
            b2.r rVarC11 = b2.a.c(rVarD2, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA2, g0Var, fVar5);
            l1.q.I(m1VarM6, g0Var, fVar6);
            a1.b.v(iHashCode6, g0Var, fVar7, g0Var, eVar2);
            l1.q.I(rVarC11, g0Var, fVar8);
            b2.r rVarC12 = f2.h.c(z1.m(oVar2, f7), p0.f.a);
            long j5 = dl.a.i;
            b2.r rVarF2 = z.n.f(rVarC12, i2.t.b(0.12f, j5), o0Var2);
            w0 w0VarD4 = h0.o.d(b2.b.E, false);
            int iHashCode7 = Long.hashCode(g0Var.T);
            m1 m1VarM7 = g0Var.m();
            b2.r rVarC13 = b2.a.c(rVarF2, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD4, g0Var, fVar5);
            l1.q.I(m1VarM7, g0Var, fVar6);
            a1.b.v(iHashCode7, g0Var, fVar7, g0Var, eVar2);
            l1.q.I(rVarC13, g0Var, fVar8);
            o3.a(y3.R(2131231356, g0Var, 0), (String) null, z1.m(oVar2, f3), j5, g0Var, 56, 0);
            g0Var.r(true);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            b2.r rVarG2 = h0.c.G(new c1(1.0f, true), 0.0f, 0.0f, 24, 0.0f, 11);
            h0.v vVarA2 = h0.u.a(h0.i.g(4), b2.b.M, g0Var, 6);
            int iHashCode8 = Long.hashCode(g0Var.T);
            m1 m1VarM8 = g0Var.m();
            b2.r rVarC14 = b2.a.c(rVarG2, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA2, g0Var, fVar5);
            l1.q.I(m1VarM8, g0Var, fVar6);
            a1.b.v(iHashCode8, g0Var, fVar7, g0Var, eVar2);
            l1.q.I(rVarC14, g0Var, fVar8);
            String strU3 = z3.U(g0Var, 2131886562);
            q3.u uVar3 = q3.u.E;
            long jZ4 = kh.o.z(16);
            long jZ5 = kh.o.z(20);
            long j6 = dl.a.k;
            z6.b(strU3, (b2.r) null, j6, jZ4, uVar3, (q3.i) null, 0L, (x3.l) null, (x3.k) null, jZ5, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 48, 260010);
            String strU4 = z3.U(g0Var, 2131886561);
            q3.u uVar4 = q3.u.B;
            iOrdinal4 = aVar2.ordinal();
            if (iOrdinal4 != 0) {
                jZ = kh.o.z(13);
            } else {
                if (iOrdinal4 == 1) {
                    throw new NoWhenBranchMatchedException();
                }
                jZ = kh.o.z(15);
            }
            z6.b(strU4, (b2.r) null, i2.t.b(0.5f, j6), jZ, uVar4, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(18), 2, false, 2, 0, (u00.k) null, (r0) null, g0Var, 1572864, 25008, 239530);
            g0Var = g0Var;
            g0Var.r(true);
            g0Var.r(true);
            aVar = onDismiss;
            o3.a(y3.R(2131231104, g0Var, 0), (String) null, w50.c.o(z1.m(h0.c.G(h0.s.a.a(oVar2, b2.b.C), 8, 0.0f, 0.0f, 0.0f, 14), 14), false, null, aVar, 7), dl.a.p, g0Var, 56, 0);
            g0Var.r(true);
            z4 = z7;
        } else {
            aVar = onDismiss;
            g0Var.V();
            z4 = z2;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new gv.y(onClick, aVar, rVar, z4, i, i2);
        }
    }

    public static final void b0(l1.j jVar, int i) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1093628731);
        if (g0Var.S(i & 1, i != 0)) {
            b2.r rVarD = z1.d(b2.o.A, 1.0f);
            v1 v1VarA = t1.a(h0.i.f, b2.b.K, g0Var, 54);
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
            g0Var.c0(-1822091063);
            for (int i2 = 0; i2 < 3; i2++) {
                if (1.0f <= 0.0d) {
                    i0.a.a("invalid weight; must be greater than zero");
                }
                c1 c1Var = new c1(1.0f, true);
                h0.v vVarA = h0.u.a(h0.i.g(8), b2.b.N, g0Var, 54);
                int iHashCode2 = Long.hashCode(g0Var.T);
                m1 m1VarM2 = g0Var.m();
                b2.r rVarC2 = b2.a.c(c1Var, g0Var);
                b3.i.c.getClass();
                b3.g gVar2 = b3.h.b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar2);
                } else {
                    g0Var.q0();
                }
                l1.q.I(vVarA, g0Var, b3.h.f);
                l1.q.I(m1VarM2, g0Var, b3.h.e);
                l1.q.I(Integer.valueOf(iHashCode2), g0Var, b3.h.g);
                l1.q.E(g0Var, b3.h.h);
                l1.q.I(rVarC2, g0Var, b3.h.d);
                Q(16, 6, null, g0Var);
                P(18, null, new y3.f(48), 0.0f, g0Var, 390, 10);
                P(12, null, new y3.f(36), 0.0f, g0Var, 390, 10);
                g0Var.r(true);
            }
            g0Var.r(false);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new sw.a(i, 26);
        }
    }

    public static final void c(int i, b2.r rVar, PlayerItem playerItem, l1.j jVar, u00.k kVar, u00.k kVar2, u00.k kVar3, u30.b bVar, u30.b bVar2, u30.b bVar3, boolean z, boolean z2) {
        l1.g0 g0Var;
        b2.r rVar2;
        PlayerItem playerItem2 = playerItem;
        u30.b bVar4 = bVar2;
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(277436216);
        int i2 = i | (g0Var2.g(bVar) ? 4 : 2) | (g0Var2.g(bVar4) ? 32 : 16) | (g0Var2.g(playerItem2) ? 256 : 128) | (g0Var2.h(z) ? 2048 : 1024) | (g0Var2.i(kVar) ? 16384 : 8192) | (g0Var2.i(kVar2) ? 131072 : 65536) | (g0Var2.i(kVar3) ? 1048576 : 524288) | (g0Var2.h(z2) ? 8388608 : 4194304) | (g0Var2.g(bVar3) ? 67108864 : 33554432) | 805306368;
        if (g0Var2.S(i2 & 1, (i2 & 306783379) != 306783378)) {
            h0.v vVarA = h0.u.a(h0.i.g(8), b2.b.M, g0Var2, 6);
            int iHashCode = Long.hashCode(g0Var2.T);
            m1 m1VarM = g0Var2.m();
            b2.r rVar3 = b2.o.A;
            b2.r rVarC = b2.a.c(rVar3, g0Var2);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            l1.q.I(vVarA, g0Var2, b3.h.f);
            l1.q.I(m1VarM, g0Var2, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var2, b3.h.g);
            l1.q.E(g0Var2, b3.h.h);
            l1.q.I(rVarC, g0Var2, b3.h.d);
            g0Var2.c0(1023130700);
            Iterator it = bVar.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    va.a.k0();
                    throw null;
                }
                PlayerItem playerItem3 = (PlayerItem) next;
                boolean zContains = bVar4.contains(Long.valueOf(playerItem3.getSurahId()));
                boolean z3 = playerItem2 != null && playerItem2.getSurahId() == playerItem3.getSurahId() && z;
                b2.r rVar4 = rVar3;
                boolean z4 = !z2;
                boolean zG = ((i2 & 57344) == 16384) | g0Var2.g(playerItem3);
                Object objN = g0Var2.N();
                Iterator it2 = it;
                Object obj = l1.i.a;
                if (zG || objN == obj) {
                    objN = new as.g0(kVar, playerItem3, 18);
                    g0Var2.n0(objN);
                }
                u00.a aVar = (u00.a) objN;
                boolean zG2 = ((i2 & 458752) == 131072) | g0Var2.g(playerItem3);
                Object objN2 = g0Var2.N();
                if (zG2 || objN2 == obj) {
                    objN2 = new as.g0(kVar2, playerItem3, 19);
                    g0Var2.n0(objN2);
                }
                u00.a aVar2 = (u00.a) objN2;
                boolean zG3 = ((i2 & 3670016) == 1048576) | g0Var2.g(playerItem3);
                Object objN3 = g0Var2.N();
                if (zG3 || objN3 == obj) {
                    objN3 = new as.g0(kVar3, playerItem3, 20);
                    g0Var2.n0(objN3);
                }
                l1.g0 g0Var3 = g0Var2;
                e0(playerItem3, zContains, z3, z4, aVar, aVar2, (u00.a) objN3, bVar3, g0Var3, (i2 >> 3) & 29360128);
                it = it2;
                playerItem2 = playerItem;
                bVar4 = bVar2;
                g0Var2 = g0Var3;
                i3 = i4;
                rVar3 = rVar4;
            }
            g0Var = g0Var2;
            g0Var.r(false);
            g0Var.r(true);
            rVar2 = rVar3;
        } else {
            g0Var = g0Var2;
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new v(bVar, bVar2, playerItem, z, kVar, kVar2, kVar3, z2, bVar3, rVar2, i, 0);
        }
    }

    public static final void c0(h1 h1Var, b2.r rVar, l1.j jVar, int i, int i2) {
        int i3;
        b2.r rVar2;
        boolean z;
        b2.r rVar3;
        r1 r1VarT;
        b2.r rVar4;
        b2.r rVar5;
        b3.g gVar;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1772319780);
        if ((i & 6) == 0) {
            i3 = i | (g0Var.g(h1Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                rVar2 = rVar;
                i3 |= g0Var.g(rVar2) ? 32 : 16;
            }
            if ((i3 & 19) != 18) {
                z = true;
            } else {
                z = false;
            }
            if (g0Var.S(i3 & 1, z)) {
                rVar4 = b2.o.A;
                if (i4 != 0) {
                    rVar5 = rVar4;
                } else {
                    rVar5 = rVar2;
                }
                int i5 = h1Var.w;
                b2.r rVarE = h0.c.E(z.n.f(f2.h.c(z1.d(rVar5, 1.0f), p0.f.a(16)), i2.t.b(0.02f, dl.a.i), i2.b0.b), 0.0f, 12, 1);
                v1 v1VarA = t1.a(h0.i.a, b2.b.K, g0Var, 48);
                int iHashCode = Long.hashCode(g0Var.T);
                m1 m1VarM = g0Var.m();
                b2.r rVarC = b2.a.c(rVarE, g0Var);
                b3.i.c.getClass();
                gVar = b3.h.b;
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
                x1 x1Var = x1.a;
                Z(g4.h0(2131231132, g0Var, 6), dl.a.Q, z3.U(g0Var, 2131887309), g0(g0Var, h1Var.x), x1Var.a(rVar4), g0Var, 0);
                a0(g0Var, 0);
                b2.r rVarA = x1Var.a(rVar4);
                o2.f fVarH0 = g4.h0(2131231084, g0Var, 6);
                long j = dl.a.k;
                Z(fVarH0, i2.t.b(0.5f, j), z3.U(g0Var, 2131887310), String.format(Locale.ENGLISH, z3.U(g0Var, 2131887311), Arrays.copyOf(new Object[]{Integer.valueOf(i5)}, 1)), rVarA, g0Var, 0);
                a0(g0Var, 0);
                Z(g4.h0(2131231194, g0Var, 6), i2.t.b(0.5f, j), z3.U(g0Var, 2131887308), g0(g0Var, h1Var.y), x1Var.a(rVar4), g0Var, 0);
                g0Var.r(true);
                rVar3 = rVar5;
            } else {
                g0Var.V();
                rVar3 = rVar2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new iv.l(h1Var, rVar3, i, i2, 5);
            }
        }
        i3 |= 48;
        rVar2 = rVar;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (g0Var.S(i3 & 1, z)) {
            rVar4 = b2.o.A;
            if (i4 != 0) {
                rVar5 = rVar4;
            } else {
                rVar5 = rVar2;
            }
            int i6 = h1Var.w;
            b2.r rVarE2 = h0.c.E(z.n.f(f2.h.c(z1.d(rVar5, 1.0f), p0.f.a(16)), i2.t.b(0.02f, dl.a.i), i2.b0.b), 0.0f, 12, 1);
            v1 v1VarA2 = t1.a(h0.i.a, b2.b.K, g0Var, 48);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarE2, g0Var);
            b3.i.c.getClass();
            gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA2, g0Var, b3.h.f);
            l1.q.I(m1VarM2, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode2), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC2, g0Var, b3.h.d);
            x1 x1Var2 = x1.a;
            Z(g4.h0(2131231132, g0Var, 6), dl.a.Q, z3.U(g0Var, 2131887309), g0(g0Var, h1Var.x), x1Var2.a(rVar4), g0Var, 0);
            a0(g0Var, 0);
            b2.r rVarA2 = x1Var2.a(rVar4);
            o2.f fVarH1 = g4.h0(2131231084, g0Var, 6);
            long j2 = dl.a.k;
            Z(fVarH1, i2.t.b(0.5f, j2), z3.U(g0Var, 2131887310), String.format(Locale.ENGLISH, z3.U(g0Var, 2131887311), Arrays.copyOf(new Object[]{Integer.valueOf(i6)}, 1)), rVarA2, g0Var, 0);
            a0(g0Var, 0);
            Z(g4.h0(2131231194, g0Var, 6), i2.t.b(0.5f, j2), z3.U(g0Var, 2131887308), g0(g0Var, h1Var.y), x1Var2.a(rVar4), g0Var, 0);
            g0Var.r(true);
            rVar3 = rVar5;
        } else {
            g0Var.V();
            rVar3 = rVar2;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new iv.l(h1Var, rVar3, i, i2, 5);
        }
    }

    public static final void d(boolean z, u00.a onReloadClicked, l1.j jVar, int i) {
        kotlin.jvm.internal.m.e(onReloadClicked, "onReloadClicked");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-233869518);
        int i2 = (g0Var.h(z) ? 4 : 2) | i | (g0Var.i(onReloadClicked) ? 32 : 16);
        if (!g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            g0Var.V();
        } else if (z) {
            g0Var.c0(-769736406);
            m(null, g0Var, 0);
            g0Var.r(false);
        } else {
            g0Var.c0(-769691580);
            f(onReloadClicked, g0Var, (i2 >> 3) & 14);
            g0Var.r(false);
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new c00.n(z, onReloadClicked, i, 6);
        }
    }

    public static final void d0(l1.j jVar, int i) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1187360176);
        if (g0Var.S(i & 1, i != 0)) {
            b2.o oVar = b2.o.A;
            float f2 = 54;
            b2.r rVarE = z1.e(z1.q(oVar, 220), f2);
            v1 v1VarA = t1.a(h0.i.g(8), b2.b.K, g0Var, 54);
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
            l1.q.I(v1VarA, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            l1.q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC, g0Var, fVar4);
            P(f2, null, new y3.f(f2), 18, g0Var, 3462, 2);
            h0.v vVarA = h0.u.a(h0.i.g(6), b2.b.M, g0Var, 6);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(oVar, g0Var);
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
            P(16, null, new y3.f(110), 0.0f, g0Var, 390, 10);
            P(12, null, new y3.f(80), 0.0f, g0Var, 390, 10);
            g0Var.r(true);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new sw.a(i, 24);
        }
    }

    public static final void e(l1.j jVar, int i) {
        float fMax;
        float f2;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-496391036);
        if (g0Var.S(i & 1, i != 0)) {
            boolean z = ((gm.a) g0Var.k(dl.e.a)) == gm.a.A;
            WeakHashMap weakHashMap = m2.w;
            h0.t0 t0VarL = h0.c.l(h0.b.e(g0Var).g, g0Var);
            n1 n1Var = (n1) g0Var.k(dq.l.a);
            float f3 = z ? 16 : 24;
            if (z) {
                fMax = 48;
                f2 = 12;
            } else {
                fMax = Math.max(48, n1Var.c());
                f2 = 32;
            }
            b2.r rVarB = h0.c.B(z.n.p(z1.c, z.n.l(g0Var), false, 14), h0.c.g(0.0f, t0VarL.c() + fMax + f2, 0.0f, t0VarL.a() + n1Var.a() + 32, 5));
            h0.v vVarA = h0.u.a(h0.i.g(24), b2.b.M, g0Var, 6);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarB, g0Var);
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
            if (z) {
                g0Var.c0(2074416789);
                C(f3, g0Var, 0);
                g0Var.r(false);
            } else {
                g0Var.c0(2074505108);
                n(f3, g0Var, 0);
                g0Var.r(false);
            }
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new sw.a(i, 22);
        }
    }

    public static final void e0(final PlayerItem playerItem, final boolean z, final boolean z2, final boolean z3, final u00.a aVar, final u00.a aVar2, final u00.a aVar3, final u30.b bVar, l1.j jVar, final int i) {
        int i2;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-40515336);
        if ((i & 6) == 0) {
            i2 = (g0Var.g(playerItem) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= g0Var.h(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= g0Var.h(z3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= g0Var.i(aVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= g0Var.i(aVar2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= g0Var.i(aVar3) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= g0Var.g(bVar) ? 8388608 : 4194304;
        }
        if (g0Var.S(i2 & 1, (4793491 & i2) != 4793490)) {
            y3.m mVar = (y3.m) g0Var.k(o1.n);
            gc.j jVarA = f50.k.A(new gc.k(), g0Var);
            int i3 = 29360128 & i2;
            boolean z4 = ((i2 & 7168) == 2048) | (i3 == 8388608);
            Object objN = g0Var.N();
            int i4 = i2;
            Object obj = l1.i.a;
            if (z4 || objN == obj) {
                objN = l1.q.r(new gl.a(bVar, playerItem, z3, 6));
                g0Var.n0(objN);
            }
            p2 p2Var = (p2) objN;
            boolean z5 = i3 == 8388608;
            Object objN2 = g0Var.N();
            if (z5 || objN2 == obj) {
                objN2 = Boolean.valueOf(bVar.contains(Long.valueOf(playerItem.getSurahId())));
                g0Var.n0(objN2);
            }
            boolean zBooleanValue = ((Boolean) objN2).booleanValue();
            float f2 = 54;
            b2.o oVar = b2.o.A;
            b2.r rVarK = w00.a.k(w50.c.o(b2.a.a(z1.e(oVar, f2), new pz.m(19)), ((Boolean) p2Var.getValue()).booleanValue(), null, aVar, 6), !((Boolean) p2Var.getValue()).booleanValue());
            float f3 = 8;
            h0.f fVarG = h0.i.g(f3);
            b2.h hVar = b2.b.K;
            v1 v1VarA = t1.a(fVarG, hVar, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarK, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar = b3.h.f;
            l1.q.I(v1VarA, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            l1.q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC, g0Var, fVar4);
            w0 w0VarD = h0.o.d(b2.b.E, false);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(oVar, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD, g0Var, fVar);
            l1.q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC2, g0Var, fVar4);
            h0.o.a(z.n.f(f2.h.c(z1.m(oVar, f2), p0.f.a(18)), dl.a.w, i2.b0.b), g0Var, 0);
            if (z2) {
                g0Var.c0(1652981873);
                f50.c.g((cc.a) jVarA.getValue(), z1.m(oVar, 16), g0Var, 1572912);
                g0Var.r(false);
            } else {
                g0Var.c0(1653225037);
                z6.b(String.valueOf(playerItem.getSurahNumber()), (b2.r) null, dl.a.k, kh.o.z(18), q3.u.E, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 0, 262058);
                g0Var.r(false);
            }
            g0Var.r(true);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            b2.r rVarC3 = z1.c(new c1(1.0f, true), 1.0f);
            v1 v1VarA2 = t1.a(h0.i.a, hVar, g0Var, 48);
            int iHashCode3 = Long.hashCode(g0Var.T);
            m1 m1VarM3 = g0Var.m();
            b2.r rVarC4 = b2.a.c(rVarC3, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA2, g0Var, fVar);
            l1.q.I(m1VarM3, g0Var, fVar2);
            a1.b.v(iHashCode3, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC4, g0Var, fVar4);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            c1 c1Var = new c1(1.0f, true);
            h0.v vVarA = h0.u.a(h0.i.c, b2.b.M, g0Var, 0);
            int iHashCode4 = Long.hashCode(g0Var.T);
            m1 m1VarM4 = g0Var.m();
            b2.r rVarC5 = b2.a.c(c1Var, g0Var);
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
            v1 v1VarA3 = t1.a(h0.i.g(f3), hVar, g0Var, 54);
            int iHashCode5 = Long.hashCode(g0Var.T);
            m1 m1VarM5 = g0Var.m();
            b2.r rVarC6 = b2.a.c(oVar, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA3, g0Var, fVar);
            l1.q.I(m1VarM5, g0Var, fVar2);
            a1.b.v(iHashCode5, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC6, g0Var, fVar4);
            z6.b(playerItem.getSurahTranscription(), (b2.r) null, dl.a.k, kh.o.z(16), q3.u.E, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(16), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 48, 260010);
            if (mVar != y3.m.A || r30.k.L0(playerItem.getSurahOriginalName())) {
                g0Var.c0(2027301928);
                g0Var.r(false);
            } else {
                g0Var.c0(2027025160);
                z6.b(a1.b.p("(", playerItem.getSurahOriginalName(), ")"), (b2.r) null, dl.a.o, kh.o.z(16), (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(16), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 24576, 48, 260074);
                g0Var.r(false);
            }
            g0Var.r(true);
            z6.b(playerItem.getSurahTranslation(), (b2.r) null, dl.a.o, kh.o.z(12), (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(12), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 24576, 48, 260074);
            g0Var.r(true);
            u(z, aVar2, null, 0.0f, 0L, zBooleanValue, aVar3, 0, false, null, 0.0f, g0Var, ((i4 >> 3) & 14) | ((i4 >> 12) & 112) | (i4 & 3670016), 0, 1948);
            g0Var.r(true);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    k.e0(playerItem, z, z2, z3, aVar, aVar2, aVar3, bVar, (l1.j) obj2, l1.q.K(i | 1));
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void f(u00.a aVar, l1.j jVar, int i) {
        int i2;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-2040665381);
        if ((i & 6) == 0) {
            i2 = (g0Var.i(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            h0.a0 a0Var = z1.c;
            h0.v vVarA = h0.u.a(h0.i.e, b2.b.N, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(a0Var, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar = b3.h.f;
            l1.q.I(vVarA, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            l1.q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC, g0Var, fVar4);
            b2.o oVar = b2.o.A;
            z3.j(y3.R(2131231419, g0Var, 0), (String) null, z1.m(oVar, 100), dl.a.J, g0Var, 440, 0);
            h0.c.h(z1.e(oVar, 12), g0Var);
            b2.r rVarE = h0.c.E(w50.c.n(z.n.e(f2.h.c(z1.e(oVar, 44), p0.f.a(32)), new i2.g0(va.a.S(new i2.t[]{new i2.t(dl.a.d), new i2.t(dl.a.e)}), (ArrayList) null, 0L, 9187343241974906880L), (t0) null, 6), true, aVar), 16, 0.0f, 2);
            w0 w0VarD = h0.o.d(b2.b.E, false);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarE, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD, g0Var, fVar);
            l1.q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC2, g0Var, fVar4);
            z6.b(z3.U(g0Var, 2131886563), (b2.r) null, dl.a.i, kh.o.z(16), q3.u.D, (q3.i) null, 0L, (x3.l) null, new x3.k(3), 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 0, 261034);
            g0Var = g0Var;
            g0Var.r(true);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new po.i(aVar, i, 2);
        }
    }

    public static final void f0(l1.j jVar, int i) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-340091277);
        if (g0Var.S(i & 1, i != 0)) {
            b2.r rVarD = z1.d(b2.o.A, 1.0f);
            v1 v1VarA = t1.a(h0.i.f, b2.b.J, g0Var, 6);
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
            g0Var.c0(-23654237);
            for (int i2 = 0; i2 < 7; i2++) {
                Q(28, 6, null, g0Var);
            }
            g0Var.r(false);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new sw.a(i, 27);
        }
    }

    public static final void g(b2.r rVar, l1.j jVar, int i) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-911557729);
        int i2 = i | 6;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            b2.r rVarF = z.n.f(z1.c, dl.a.q, i2.b0.b);
            w0 w0VarD = h0.o.d(b2.b.E, false);
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
            l1.q.I(w0VarD, g0Var, b3.h.f);
            l1.q.I(m1VarM, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC, g0Var, b3.h.d);
            h(null, 84, 0.0f, dl.a.h, g0Var, 48, 5);
            g0Var.r(true);
            rVar = b2.o.A;
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new ro.e(rVar, i, 9);
        }
    }

    public static final String g0(l1.j jVar, int i) {
        if (i == 1) {
            l1.g0 g0Var = (l1.g0) jVar;
            g0Var.c0(-38310319);
            String strU = z3.U(jVar, 2131887307);
            g0Var.r(false);
            return strU;
        }
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.c0(-38247110);
        String str = String.format(Locale.ENGLISH, z3.U(jVar, 2131887301), Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        g0Var2.r(false);
        return str;
    }

    public static final void h(b2.r rVar, float f2, float f3, long j, l1.j jVar, final int i, final int i2) {
        float f4;
        float f5;
        long j2;
        int i3;
        int i4;
        boolean z;
        final b2.r rVar2;
        final float f6;
        final float f7;
        final long j3;
        r1 r1VarT;
        int i5;
        b2.r rVar3;
        float f8;
        float f9;
        int i6;
        b2.r rVar4;
        Object objN;
        Object obj;
        b3.g gVar;
        Object objN2;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-69066478);
        int i7 = i | 6;
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                f4 = f2;
                i7 |= g0Var.d(f4) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    f5 = f3;
                    int i9 = g0Var.d(f5) ? 256 : 128;
                    i7 |= i9;
                } else {
                    f5 = f3;
                }
                i7 |= i9;
            } else {
                f5 = f3;
            }
            j2 = j;
            if ((i2 & 8) == 0 || !g0Var.f(j2)) {
                i3 = 1024;
            } else {
                i3 = 2048;
            }
            i4 = i7 | i3;
            if ((i4 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (g0Var.S(i4 & 1, z)) {
                g0Var.X();
                i5 = i & 1;
                rVar3 = b2.o.A;
                if (i5 != 0 || g0Var.A()) {
                    if (i8 != 0) {
                        f8 = 16;
                    } else {
                        f8 = f4;
                    }
                    if ((i2 & 4) != 0) {
                        f9 = f8 / 2;
                        i4 &= -897;
                    } else {
                        f9 = f5;
                    }
                    if ((i2 & 8) != 0) {
                        i4 &= -7169;
                        j2 = dl.a.g;
                    }
                    i6 = i4;
                    rVar4 = rVar3;
                } else {
                    g0Var.V();
                    if ((i2 & 4) != 0) {
                        i4 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i4 &= -7169;
                    }
                    f8 = f4;
                    f9 = f5;
                    i6 = i4;
                    rVar4 = rVar;
                }
                g0Var.s();
                o2.f fVarH0 = g4.h0(2131231389, g0Var, 6);
                b2.r rVarM = z1.m(rVar4, f8);
                objN = g0Var.N();
                obj = l1.i.a;
                if (objN == obj) {
                    objN = new wp.a(3);
                    g0Var.n0(objN);
                }
                b2.r rVarP = i2.b0.p(rVarM, (u00.k) objN);
                w0 w0VarD = h0.o.d(b2.b.E, false);
                int iHashCode = Long.hashCode(g0Var.T);
                m1 m1VarM = g0Var.m();
                b2.r rVarC = b2.a.c(rVarP, g0Var);
                b3.i.c.getClass();
                gVar = b3.h.b;
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
                b2.r rVarB = f2.h.b(z1.m(rVar3, f8), f9, (i2.o0) null);
                objN2 = g0Var.N();
                if (objN2 == obj) {
                    objN2 = new wp.a(4);
                    g0Var.n0(objN2);
                }
                long j4 = j2;
                z3.k(fVarH0, (String) null, i2.b0.p(rVarB, (u00.k) objN2), j4, g0Var, (i6 & 7168) | 48);
                z3.k(fVarH0, (String) null, z1.m(rVar3, f8), dl.a.i, g0Var, 48);
                g0Var.r(true);
                j3 = j4;
                f7 = f9;
                f6 = f8;
                rVar2 = rVar4;
            } else {
                g0Var.V();
                rVar2 = rVar;
                f6 = f4;
                f7 = f5;
                j3 = j2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        k.h(rVar2, f6, f7, j3, (l1.j) obj2, l1.q.K(i | 1), i2);
                        return g00.b0.a;
                    }
                };
            }
        }
        i7 = i | 54;
        f4 = f2;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                f5 = f3;
                if (g0Var.d(f5)) {
                }
                i7 |= i9;
            } else {
                f5 = f3;
            }
            i7 |= i9;
        } else {
            f5 = f3;
        }
        j2 = j;
        if ((i2 & 8) == 0) {
            i3 = 1024;
        } else {
            i3 = 1024;
        }
        i4 = i7 | i3;
        if ((i4 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (g0Var.S(i4 & 1, z)) {
            g0Var.X();
            i5 = i & 1;
            rVar3 = b2.o.A;
            if (i5 != 0) {
                if (i8 != 0) {
                    f8 = 16;
                } else {
                    f8 = f4;
                }
                if ((i2 & 4) != 0) {
                    f9 = f8 / 2;
                    i4 &= -897;
                } else {
                    f9 = f5;
                }
                if ((i2 & 8) != 0) {
                    i4 &= -7169;
                    j2 = dl.a.g;
                }
                i6 = i4;
                rVar4 = rVar3;
            } else {
                if (i8 != 0) {
                    f8 = 16;
                } else {
                    f8 = f4;
                }
                if ((i2 & 4) != 0) {
                    f9 = f8 / 2;
                    i4 &= -897;
                } else {
                    f9 = f5;
                }
                if ((i2 & 8) != 0) {
                    i4 &= -7169;
                    j2 = dl.a.g;
                }
                i6 = i4;
                rVar4 = rVar3;
            }
            g0Var.s();
            o2.f fVarH1 = g4.h0(2131231389, g0Var, 6);
            b2.r rVarM2 = z1.m(rVar4, f8);
            objN = g0Var.N();
            obj = l1.i.a;
            if (objN == obj) {
                objN = new wp.a(3);
                g0Var.n0(objN);
            }
            b2.r rVarP2 = i2.b0.p(rVarM2, (u00.k) objN);
            w0 w0VarD2 = h0.o.d(b2.b.E, false);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarP2, g0Var);
            b3.i.c.getClass();
            gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD2, g0Var, b3.h.f);
            l1.q.I(m1VarM2, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode2), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC2, g0Var, b3.h.d);
            b2.r rVarB2 = f2.h.b(z1.m(rVar3, f8), f9, (i2.o0) null);
            objN2 = g0Var.N();
            if (objN2 == obj) {
                objN2 = new wp.a(4);
                g0Var.n0(objN2);
            }
            long j5 = j2;
            z3.k(fVarH1, (String) null, i2.b0.p(rVarB2, (u00.k) objN2), j5, g0Var, (i6 & 7168) | 48);
            z3.k(fVarH1, (String) null, z1.m(rVar3, f8), dl.a.i, g0Var, 48);
            g0Var.r(true);
            j3 = j5;
            f7 = f9;
            f6 = f8;
            rVar2 = rVar4;
        } else {
            g0Var.V();
            rVar2 = rVar;
            f6 = f4;
            f7 = f5;
            j3 = j2;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    k.h(rVar2, f6, f7, j3, (l1.j) obj2, l1.q.K(i | 1), i2);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final b2.r h0(b2.r rVar, l1.j jVar, int i) {
        kotlin.jvm.internal.m.e(rVar, "<this>");
        return c7.i.H(rVar, false, p0.f.a(6));
    }

    public static final void i(final int i, final b2.r rVar, final PlayerItem playerItem, l1.j jVar, final u00.k kVar, final u00.k kVar2, final u00.k kVar3, final u30.b bVar, final u30.b bVar2, final u30.b bVar3, final boolean z, final boolean z2) {
        int i2;
        u00.k kVar4;
        u00.k kVar5;
        l1.j jVar2;
        l1.j jVar3 = (l1.g0) jVar;
        jVar3.e0(-343445335);
        if ((i & 6) == 0) {
            i2 = (jVar3.g(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= jVar3.g(playerItem) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= jVar3.g(bVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= jVar3.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            kVar4 = kVar;
            i2 |= jVar3.i(kVar4) ? 16384 : 8192;
        } else {
            kVar4 = kVar;
        }
        if ((196608 & i) == 0) {
            kVar5 = kVar2;
            i2 |= jVar3.i(kVar5) ? 131072 : 65536;
        } else {
            kVar5 = kVar2;
        }
        if ((i & 1572864) == 0) {
            i2 |= jVar3.i(kVar3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= jVar3.h(z2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= jVar3.g(bVar3) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= jVar3.g(rVar) ? 536870912 : 268435456;
        }
        if (jVar3.S(i2 & 1, (i2 & 306783379) != 306783378)) {
            boolean z3 = (i2 & 14) == 4;
            Object objN = jVar3.N();
            l1.c cVar = l1.i.a;
            if (z3 || objN == cVar) {
                objN = l1.q.r(new f2(bVar, 15));
                jVar3.n0(objN);
            }
            final p2 p2Var = (p2) objN;
            b2.r rVarD = z1.d(rVar, 1.0f);
            h0.f fVarG = h0.i.g(12);
            p1 p1VarG = h0.c.g(16, 0.0f, 24, 0.0f, 10);
            boolean zG = jVar3.g(p2Var) | ((i2 & 896) == 256) | ((i2 & 112) == 32) | ((i2 & 7168) == 2048) | ((57344 & i2) == 16384) | ((458752 & i2) == 131072) | ((3670016 & i2) == 1048576) | ((29360128 & i2) == 8388608) | ((i2 & 234881024) == 67108864);
            Object objN2 = jVar3.N();
            if (zG || objN2 == cVar) {
                final u00.k kVar6 = kVar4;
                final u00.k kVar7 = kVar5;
                u00.k kVar8 = new u00.k() {
                    @Override
                    public final Object invoke(Object obj) {
                        j0.h LazyRow = (j0.h) obj;
                        kotlin.jvm.internal.m.e(LazyRow, "$this$LazyRow");
                        u30.b bVar4 = (u30.b) p2Var.getValue();
                        LazyRow.r(((h00.b) bVar4).a(), new q0.w0(new wp.a(6), bVar4, 9), new as.r0(25, bVar4), new v1.c(new a0(bVar4, bVar2, playerItem, z, kVar6, kVar7, kVar3, z2, bVar3), 802480018, true));
                        return g00.b0.a;
                    }
                };
                jVar3.n0(kVar8);
                objN2 = kVar8;
            }
            jVar2 = jVar3;
            k00.f.e(rVarD, null, p1VarG, fVarG, null, null, false, null, (u00.k) objN2, jVar2, 24960, 490);
        } else {
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    k.i(l1.q.K(i | 1), rVar, playerItem, (l1.j) obj, kVar, kVar2, kVar3, bVar, bVar2, bVar3, z, z2);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void j(qr.b bVar, l1.j jVar, int i) {
        int i2;
        l1.j jVar2;
        b3.g gVar;
        int i3;
        l1.j jVar3 = (l1.g0) jVar;
        jVar3.e0(61286263);
        if ((i & 6) == 0) {
            i2 = (jVar3.e(bVar.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (jVar3.S(i2 & 1, (i2 & 3) != 2)) {
            int iOrdinal = bVar.ordinal();
            b2.o oVar = b2.o.A;
            if (iOrdinal == 0) {
                jVar3.c0(418494613);
                b2.r rVarC = f2.h.c(z1.m(oVar, 44), p0.f.a);
                long j = dl.a.i;
                b2.r rVarF = z.n.f(rVarC, i2.t.b(0.1f, j), i2.b0.b);
                w0 w0VarD = h0.o.d(b2.b.E, false);
                int iHashCode = Long.hashCode(((l1.g0) jVar3).T);
                m1 m1VarM = jVar3.m();
                b2.r rVarC2 = b2.a.c(rVarF, jVar3);
                b3.i.c.getClass();
                gVar = b3.h.b;
                jVar3.g0();
                if (((l1.g0) jVar3).S) {
                    jVar3.l(gVar);
                } else {
                    jVar3.q0();
                }
                l1.q.I(w0VarD, jVar3, b3.h.f);
                l1.q.I(m1VarM, jVar3, b3.h.e);
                l1.q.I(Integer.valueOf(iHashCode), jVar3, b3.h.g);
                l1.q.E(jVar3, b3.h.h);
                l1.q.I(rVarC2, jVar3, b3.h.d);
                if (bVar == qr.b.A) {
                    i3 = 2131231356;
                } else {
                    i3 = 2131231187;
                }
                o3.a(y3.R(i3, jVar3, 0), (String) null, z1.m(oVar, 20), j, jVar3, 440, 0);
                jVar2 = jVar3;
                jVar2.r(true);
                jVar2.r(false);
            } else if (iOrdinal == 1 || iOrdinal == 2) {
                jVar3.c0(418166168);
                jVar2 = jVar3;
                z.n.c(y3.R(2131231081, jVar3, 0), (String) null, z1.m(oVar, 44), (b2.d) null, (z2.p) null, 0.0f, jVar2, 440, 120);
                jVar2.r(false);
            } else {
                if (iOrdinal != 3) {
                    throw oi.k.r(jVar3, -1233439921, false);
                }
                jVar3.c0(418494613);
                b2.r rVarC3 = f2.h.c(z1.m(oVar, 44), p0.f.a);
                long j2 = dl.a.i;
                b2.r rVarF2 = z.n.f(rVarC3, i2.t.b(0.1f, j2), i2.b0.b);
                w0 w0VarD2 = h0.o.d(b2.b.E, false);
                int iHashCode2 = Long.hashCode(((l1.g0) jVar3).T);
                m1 m1VarM2 = jVar3.m();
                b2.r rVarC4 = b2.a.c(rVarF2, jVar3);
                b3.i.c.getClass();
                gVar = b3.h.b;
                jVar3.g0();
                if (((l1.g0) jVar3).S) {
                    jVar3.l(gVar);
                } else {
                    jVar3.q0();
                }
                l1.q.I(w0VarD2, jVar3, b3.h.f);
                l1.q.I(m1VarM2, jVar3, b3.h.e);
                l1.q.I(Integer.valueOf(iHashCode2), jVar3, b3.h.g);
                l1.q.E(jVar3, b3.h.h);
                l1.q.I(rVarC4, jVar3, b3.h.d);
                if (bVar == qr.b.A) {
                    i3 = 2131231356;
                } else {
                    i3 = 2131231187;
                }
                o3.a(y3.R(i3, jVar3, 0), (String) null, z1.m(oVar, 20), j2, jVar3, 440, 0);
                jVar2 = jVar3;
                jVar2.r(true);
                jVar2.r(false);
            }
        } else {
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new androidx.media3.cast.e(bVar, i, 9);
        }
    }

    public static final void k(qr.b bVar, String title, String subtitle, u00.a onClick, b2.r rVar, u00.a aVar, l1.j jVar, int i) {
        u00.a aVar2;
        kotlin.jvm.internal.m.e(title, "title");
        kotlin.jvm.internal.m.e(subtitle, "subtitle");
        kotlin.jvm.internal.m.e(onClick, "onClick");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1426208965);
        int i2 = i | (g0Var.e(bVar.ordinal()) ? 4 : 2) | (g0Var.g(title) ? 32 : 16) | (g0Var.g(subtitle) ? 256 : 128) | (g0Var.i(onClick) ? 2048 : 1024) | (g0Var.g(rVar) ? 16384 : 8192) | (g0Var.i(aVar) ? 131072 : 65536);
        if (g0Var.S(i2 & 1, (i2 & 74899) != 74898)) {
            boolean z = bVar == qr.b.A || bVar == qr.b.D;
            float f2 = 24;
            b2.r rVarC = h0.c.C(w50.c.o(z.n.f(f2.h.c(z1.d(rVar, 1.0f), p0.f.a(f2)), i2.t.b(0.08f, dl.a.i), i2.b0.b), false, null, onClick, 7), 16);
            w0 w0VarD = h0.o.d(b2.b.A, false);
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
            b2.o oVar = b2.o.A;
            b2.r rVarD = z1.d(oVar, 1.0f);
            v1 v1VarA = t1.a(h0.i.g(12), b2.b.J, g0Var, 54);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC3 = b2.a.c(rVarD, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA, g0Var, fVar);
            l1.q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC3, g0Var, fVar4);
            j(bVar, g0Var, i2 & 14);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            b2.r rVarG = h0.c.G(new c1(1.0f, true), 0.0f, 0.0f, f2, 0.0f, 11);
            h0.v vVarA = h0.u.a(h0.i.c, b2.b.M, g0Var, 0);
            int iHashCode3 = Long.hashCode(g0Var.T);
            m1 m1VarM3 = g0Var.m();
            b2.r rVarC4 = b2.a.c(rVarG, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA, g0Var, fVar);
            l1.q.I(m1VarM3, g0Var, fVar2);
            a1.b.v(iHashCode3, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC4, g0Var, fVar4);
            aVar2 = aVar;
            z6.b(title, (b2.r) null, dl.a.k, kh.o.z(16), q3.u.L, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 2, false, 1, 0, (u00.k) null, (r0) null, g0Var, ((i2 >> 3) & 14) | 1597440, 24960, 241578);
            long j = dl.a.p;
            z6.b(subtitle, (b2.r) null, j, kh.o.z(13), (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(18), 0, false, 2, 0, (u00.k) null, (r0) null, g0Var, ((i2 >> 6) & 14) | 24576, 24624, 243690);
            g0Var = g0Var;
            g0Var.r(true);
            g0Var.r(true);
            h0.s sVar = h0.s.a;
            if (z && aVar2 != null) {
                g0Var.c0(404954424);
                b2.r rVarO = w50.c.o(z1.m(sVar.a(oVar, b2.b.C), 32), false, null, aVar2, 7);
                w0 w0VarD2 = h0.o.d(b2.b.E, false);
                int iHashCode4 = Long.hashCode(g0Var.T);
                m1 m1VarM4 = g0Var.m();
                b2.r rVarC5 = b2.a.c(rVarO, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(w0VarD2, g0Var, fVar);
                l1.q.I(m1VarM4, g0Var, fVar2);
                a1.b.v(iHashCode4, g0Var, fVar3, g0Var, eVar);
                l1.q.I(rVarC5, g0Var, fVar4);
                o3.a(y3.R(2131231104, g0Var, 0), (String) null, z1.m(oVar, 14), j, g0Var, 440, 0);
                g0Var.r(true);
                g0Var.r(false);
            } else if (z) {
                g0Var.c0(405814829);
                g0Var.r(false);
            } else {
                g0Var.c0(405515648);
                o3.b(g4.h0(2131231099, g0Var, 6), (String) null, z1.m(sVar.a(oVar, b2.b.F), 14), j, g0Var, 48, 0);
                g0Var.r(false);
            }
            g0Var.r(true);
        } else {
            aVar2 = aVar;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new a2(bVar, title, subtitle, onClick, rVar, aVar2, i);
        }
    }

    public static final void l(final u30.b banners, final String upcomingTitle, final String upcomingSubtitle, final String publishedTitle, final String publishedSubtitle, final u00.a onUpcomingReciterClicked, final u00.a onPublishedReciterClicked, final u00.a onChangeLogClicked, final u00.a onChangeLogDismissed, final u00.a onSignInClicked, final u00.a onSignInDismissed, b2.r rVar, final float f2, l1.j jVar, final int i) {
        float f3;
        l1.j jVar2;
        final b2.r rVar2;
        kotlin.jvm.internal.m.e(banners, "banners");
        kotlin.jvm.internal.m.e(upcomingTitle, "upcomingTitle");
        kotlin.jvm.internal.m.e(upcomingSubtitle, "upcomingSubtitle");
        kotlin.jvm.internal.m.e(publishedTitle, "publishedTitle");
        kotlin.jvm.internal.m.e(publishedSubtitle, "publishedSubtitle");
        kotlin.jvm.internal.m.e(onUpcomingReciterClicked, "onUpcomingReciterClicked");
        kotlin.jvm.internal.m.e(onPublishedReciterClicked, "onPublishedReciterClicked");
        kotlin.jvm.internal.m.e(onChangeLogClicked, "onChangeLogClicked");
        kotlin.jvm.internal.m.e(onChangeLogDismissed, "onChangeLogDismissed");
        kotlin.jvm.internal.m.e(onSignInClicked, "onSignInClicked");
        kotlin.jvm.internal.m.e(onSignInDismissed, "onSignInDismissed");
        l1.j jVar3 = (l1.g0) jVar;
        jVar3.e0(1618949325);
        int i2 = i | (jVar3.g(banners) ? 4 : 2) | (jVar3.g(upcomingTitle) ? 32 : 16) | (jVar3.g(upcomingSubtitle) ? 256 : 128) | (jVar3.g(publishedTitle) ? 2048 : 1024) | (jVar3.g(publishedSubtitle) ? 16384 : 8192) | (jVar3.i(onUpcomingReciterClicked) ? 131072 : 65536) | (jVar3.i(onPublishedReciterClicked) ? 1048576 : 524288) | (jVar3.i(onChangeLogClicked) ? 8388608 : 4194304) | (jVar3.i(onChangeLogDismissed) ? 67108864 : 33554432) | (jVar3.i(onSignInClicked) ? 536870912 : 268435456);
        int i3 = (jVar3.i(onSignInDismissed) ? (char) 4 : (char) 2) | '0' | (jVar3.d(f2) ? (char) 256 : (char) 128);
        if (!jVar3.S(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 147) == 146) ? false : true)) {
            f3 = f2;
            jVar2 = jVar3;
            jVar2.V();
            rVar2 = rVar;
        } else {
            if (((h00.b) banners).isEmpty()) {
                r1 r1VarT = jVar3.t();
                if (r1VarT != null) {
                    r1VarT.d = new u00.n(upcomingTitle, upcomingSubtitle, publishedTitle, publishedSubtitle, onUpcomingReciterClicked, onPublishedReciterClicked, onChangeLogClicked, onChangeLogDismissed, onSignInClicked, onSignInDismissed, f2, i) {
                        public final String B;
                        public final String C;
                        public final String D;
                        public final String E;
                        public final u00.a F;
                        public final u00.a G;
                        public final u00.a H;
                        public final u00.a I;
                        public final u00.a J;
                        public final u00.a K;
                        public final float L;

                        @Override
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iK = l1.q.K(1);
                            k.l(this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, b2.o.A, this.L, (l1.j) obj, iK);
                            return g00.b0.a;
                        }
                    };
                    return;
                }
                return;
            }
            f3 = f2;
            j0.v vVarA = j0.x.a(0, jVar3, 3);
            e0.h hVarI = ri.t1.I(vVarA, jVar3);
            b2.r rVar3 = b2.o.A;
            b2.r rVarD = z1.d(rVar3, 1.0f);
            p1 p1VarE = h0.c.e(f3, 0.0f, 2);
            h0.f fVarG = h0.i.g(12);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 7168) == 2048) | ((i2 & 896) == 256) | ((57344 & i2) == 16384) | ((1879048192 & i2) == 536870912) | ((458752 & i2) == 131072) | ((3670016 & i2) == 1048576) | ((29360128 & i2) == 8388608) | ((i3 & 14) == 4) | ((i2 & 234881024) == 67108864);
            Object objN = jVar3.N();
            if (z || objN == l1.i.a) {
                u00.k kVar = new u00.k() {
                    @Override
                    public final Object invoke(Object obj) {
                        j0.h LazyRow = (j0.h) obj;
                        kotlin.jvm.internal.m.e(LazyRow, "$this$LazyRow");
                        wp.a aVar = new wp.a(5);
                        u30.b bVar = banners;
                        LazyRow.r(((h00.b) bVar).a(), new q0.w0(aVar, bVar, 8), new as.r0(24, bVar), new v1.c(new s(bVar, upcomingTitle, publishedTitle, upcomingSubtitle, publishedSubtitle, onSignInClicked, onUpcomingReciterClicked, onPublishedReciterClicked, onChangeLogClicked, onSignInDismissed, onChangeLogDismissed), 802480018, true));
                        return g00.b0.a;
                    }
                };
                jVar3.n0(kVar);
                objN = kVar;
            }
            jVar2 = jVar3;
            k00.f.e(rVarD, vVarA, p1VarE, fVarG, null, hVarI, false, null, (u00.k) objN, jVar2, 24576, 424);
            rVar2 = rVar3;
        }
        r1 r1VarT2 = jVar2.t();
        if (r1VarT2 != null) {
            final float f4 = f3;
            r1VarT2.d = new u00.n(upcomingTitle, upcomingSubtitle, publishedTitle, publishedSubtitle, onUpcomingReciterClicked, onPublishedReciterClicked, onChangeLogClicked, onChangeLogDismissed, onSignInClicked, onSignInDismissed, rVar2, f4, i) {
                public final String B;
                public final String C;
                public final String D;
                public final String E;
                public final u00.a F;
                public final u00.a G;
                public final u00.a H;
                public final u00.a I;
                public final u00.a J;
                public final u00.a K;
                public final b2.r L;
                public final float M;

                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = l1.q.K(1);
                    k.l(this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, (l1.j) obj, iK);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void m(b2.r rVar, l1.j jVar, int i) {
        b2.r rVar2;
        boolean z;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1561975797);
        int i2 = i | 6;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) g0Var.k(o0.b);
            w2 w2Var = (w2) g0Var.k(o1.s);
            gm.a aVar = (gm.a) g0Var.k(dl.e.a);
            gm.a aVar2 = gm.a.B;
            b2.r rVar3 = b2.o.A;
            b2.r rVarE = h0.c.E(z1.c(aVar == aVar2 ? z1.q(rVar3, RCHTTPStatusCodes.UNSUCCESSFUL) : z1.d(rVar3, 1.0f), 1.0f), 32, 0.0f, 2);
            h0.v vVarA = h0.u.a(h0.i.e, b2.b.N, g0Var, 54);
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
            l1.q.I(vVarA, g0Var, b3.h.f);
            l1.q.I(m1VarM, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC, g0Var, b3.h.d);
            z.n.c(y3.R(2131231349, g0Var, 0), (String) null, z1.m(rVar3, 64), (b2.d) null, (z2.p) null, 0.0f, g0Var, 440, 120);
            h0.c.h(z1.e(rVar3, 20), g0Var);
            rVar2 = rVar3;
            z6.b(z3.U(g0Var, 2131886932), (b2.r) null, i2.t.b(0.92f, dl.a.k), kh.o.z(16), q3.u.J, (q3.i) null, 0L, (x3.l) null, new x3.k(3), kh.o.z(22), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 48, 258986);
            h0.c.h(z1.e(rVar2, 24), g0Var);
            b2.r rVarE2 = z1.e(rVar2, 40);
            p0.e eVar = p0.f.a;
            p1 p1Var = g1.s.a;
            g1.r rVarA = g1.s.a(i2.t.b(0.92f, dl.a.s), dl.a.H, 0L, 0L, g0Var, 12);
            boolean zI = g0Var.i(w2Var) | g0Var.i(context);
            Object objN = g0Var.N();
            if (zI || objN == l1.i.a) {
                z = true;
                objN = new mu.p(w2Var, context, 1);
                g0Var.n0(objN);
            } else {
                z = true;
            }
            g1.x5.a((u00.a) objN, rVarE2, false, eVar, rVarA, (g1.u) null, (n1) null, (f0.i) null, d, g0Var, 805306416, 484);
            g0Var = g0Var;
            g0Var.r(z);
        } else {
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new ro.e(rVar2, i, 8);
        }
    }

    public static final void n(float f2, l1.j jVar, int i) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-384199284);
        int i2 = (g0Var.d(f2) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            p(g0Var, 0);
            int i3 = (i2 << 3) & 112;
            int i4 = i3 | 390;
            L(false, f2, 180, g0Var, i4);
            int i5 = i3 | 6;
            A(false, f2, g0Var, i5);
            L(false, f2, 170, g0Var, i4);
            U(false, f2, g0Var, i5);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new ox.f(f2, i, 2);
        }
    }

    public static final void o(String title, b2.r rVar, u00.a aVar, boolean z, boolean z2, l1.j jVar, int i, int i2) {
        b2.r rVar2;
        int i3;
        boolean z3;
        boolean z4;
        u00.a aVar2;
        boolean z5;
        b2.r rVar3;
        r1 r1VarT;
        b2.r rVar4;
        b2.r rVar5;
        Object objN;
        b3.g gVar;
        kotlin.jvm.internal.m.e(title, "title");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1902645458);
        int i4 = (g0Var.g(title) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i3 = i4 | (g0Var.g(rVar2) ? 32 : 16);
        }
        int i6 = i3 | 384;
        int i7 = i2 & 8;
        if (i7 == 0) {
            if ((i & 3072) == 0) {
                z3 = z;
                i6 |= g0Var.h(z3) ? 2048 : 1024;
            }
            if ((i6 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (g0Var.S(i6 & 1, z4)) {
                rVar4 = b2.o.A;
                if (i5 != 0) {
                    rVar5 = rVar4;
                } else {
                    rVar5 = rVar2;
                }
                objN = g0Var.N();
                if (objN == l1.i.a) {
                    objN = new a2.f(24);
                    g0Var.n0(objN);
                }
                u00.a aVar3 = (u00.a) objN;
                if (i7 != 0) {
                    z3 = true;
                }
                float f2 = 4;
                b2.r rVarN = w50.c.n(f2.h.c(rVar5, p0.f.a(f2)), z3, aVar3);
                v1 v1VarA = t1.a(h0.i.g(f2), b2.b.K, g0Var, 54);
                int iHashCode = Long.hashCode(g0Var.T);
                m1 m1VarM = g0Var.m();
                b2.r rVarC = b2.a.c(rVarN, g0Var);
                b3.i.c.getClass();
                gVar = b3.h.b;
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
                boolean z6 = z3;
                b2.r rVar6 = rVar5;
                z6.b(title, (b2.r) null, dl.a.n, kh.o.z(22), q3.u.D, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 2, false, 1, 0, (u00.k) null, (r0) null, g0Var, (i6 & 14) | 1597440, 24960, 241578);
                g0Var = g0Var;
                if (z2) {
                    g0Var.c0(-855699386);
                    z3.k(g4.h0(2131231098, g0Var, 6), (String) null, z1.m(rVar4, 30), dl.a.o, g0Var, 432);
                    g0Var.r(false);
                } else {
                    g0Var.c0(-855460748);
                    g0Var.r(false);
                }
                g0Var.r(true);
                rVar3 = rVar6;
                z5 = z6;
                aVar2 = aVar3;
            } else {
                g0Var.V();
                aVar2 = aVar;
                z5 = z3;
                rVar3 = rVar2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new g1.h0(title, rVar3, aVar2, z5, z2, i, i2);
            }
        }
        i6 = i3 | 3456;
        z3 = z;
        if ((i6 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (g0Var.S(i6 & 1, z4)) {
            rVar4 = b2.o.A;
            if (i5 != 0) {
                rVar5 = rVar4;
            } else {
                rVar5 = rVar2;
            }
            objN = g0Var.N();
            if (objN == l1.i.a) {
                objN = new a2.f(24);
                g0Var.n0(objN);
            }
            u00.a aVar4 = (u00.a) objN;
            if (i7 != 0) {
                z3 = true;
            }
            float f3 = 4;
            b2.r rVarN2 = w50.c.n(f2.h.c(rVar5, p0.f.a(f3)), z3, aVar4);
            v1 v1VarA2 = t1.a(h0.i.g(f3), b2.b.K, g0Var, 54);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarN2, g0Var);
            b3.i.c.getClass();
            gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA2, g0Var, b3.h.f);
            l1.q.I(m1VarM2, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode2), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC2, g0Var, b3.h.d);
            boolean z7 = z3;
            b2.r rVar7 = rVar5;
            z6.b(title, (b2.r) null, dl.a.n, kh.o.z(22), q3.u.D, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 2, false, 1, 0, (u00.k) null, (r0) null, g0Var, (i6 & 14) | 1597440, 24960, 241578);
            g0Var = g0Var;
            if (z2) {
                g0Var.c0(-855699386);
                z3.k(g4.h0(2131231098, g0Var, 6), (String) null, z1.m(rVar4, 30), dl.a.o, g0Var, 432);
                g0Var.r(false);
            } else {
                g0Var.c0(-855460748);
                g0Var.r(false);
            }
            g0Var.r(true);
            rVar3 = rVar7;
            z5 = z7;
            aVar2 = aVar4;
        } else {
            g0Var.V();
            aVar2 = aVar;
            z5 = z3;
            rVar3 = rVar2;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new g1.h0(title, rVar3, aVar2, z5, z2, i, i2);
        }
    }

    public static final void p(l1.j jVar, int i) {
        b2.c cVar = b2.b.M;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(596465772);
        if (g0Var.S(i & 1, i != 0)) {
            b2.o oVar = b2.o.A;
            b2.r rVarD = z1.d(oVar, 1.0f);
            float f2 = 8;
            h0.v vVarA = h0.u.a(h0.i.g(f2), cVar, g0Var, 6);
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
            l1.q.I(vVarA, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            l1.q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC, g0Var, fVar4);
            float f3 = 24;
            O(140, 54, 0, h0.c.E(oVar, f3, 0.0f, 2), g0Var);
            b2.r rVarE = z1.e(z1.d(oVar, 1.0f), RCHTTPStatusCodes.UNSUCCESSFUL);
            v1 v1VarA = t1.a(h0.i.a, b2.b.K, g0Var, 48);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarE, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA, g0Var, fVar);
            l1.q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC2, g0Var, fVar4);
            b2.r rVarC3 = z1.c(z1.q(h0.c.G(oVar, f3, 0.0f, 0.0f, 0.0f, 14), 350), 1.0f);
            b2.g gVar2 = b2.b.N;
            float f4 = 12;
            h0.v vVarA2 = h0.u.a(h0.i.g(f4), gVar2, g0Var, 54);
            int iHashCode3 = Long.hashCode(g0Var.T);
            m1 m1VarM3 = g0Var.m();
            b2.r rVarC4 = b2.a.c(rVarC3, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA2, g0Var, fVar);
            l1.q.I(m1VarM3, g0Var, fVar2);
            a1.b.v(iHashCode3, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC4, g0Var, fVar4);
            Q(150, 6, null, g0Var);
            h0.v vVarA3 = h0.u.a(h0.i.g(4), gVar2, g0Var, 54);
            int iHashCode4 = Long.hashCode(g0Var.T);
            m1 m1VarM4 = g0Var.m();
            b2.r rVarC5 = b2.a.c(oVar, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA3, g0Var, fVar);
            l1.q.I(m1VarM4, g0Var, fVar2);
            a1.b.v(iHashCode4, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC5, g0Var, fVar4);
            b2.c cVar2 = cVar;
            P(22, null, new y3.f(160), 0.0f, g0Var, 390, 10);
            float f5 = 16;
            P(f5, null, new y3.f(120), 0.0f, g0Var, 390, 10);
            g0Var.r(true);
            double d2 = 1.0f;
            if (d2 <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            h0.c.h(new c1(1.0f, true), g0Var);
            P(42, null, new y3.f(250), 32, g0Var, 3462, 2);
            g0Var.r(true);
            if (d2 <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            b2.r rVarG = h0.c.G(z.n.m(new c1(1.0f, true), z.n.l(g0Var), true, false), f5, 0.0f, f3, 0.0f, 10);
            v1 v1VarA2 = t1.a(h0.i.g(f4), b2.b.J, g0Var, 6);
            int iHashCode5 = Long.hashCode(g0Var.T);
            m1 m1VarM5 = g0Var.m();
            b2.r rVarC6 = b2.a.c(rVarG, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA2, g0Var, fVar);
            l1.q.I(m1VarM5, g0Var, fVar2);
            a1.b.v(iHashCode5, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC6, g0Var, fVar4);
            g0Var.c0(-1659065469);
            int i2 = 0;
            while (i2 < 3) {
                b2.c cVar3 = cVar2;
                h0.v vVarA4 = h0.u.a(h0.i.g(f2), cVar3, g0Var, 6);
                int iHashCode6 = Long.hashCode(g0Var.T);
                m1 m1VarM6 = g0Var.m();
                b2.r rVarC7 = b2.a.c(oVar, g0Var);
                b3.i.c.getClass();
                b3.g gVar3 = b3.h.b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar3);
                } else {
                    g0Var.q0();
                }
                l1.q.I(vVarA4, g0Var, b3.h.f);
                l1.q.I(m1VarM6, g0Var, b3.h.e);
                l1.q.I(Integer.valueOf(iHashCode6), g0Var, b3.h.g);
                l1.q.E(g0Var, b3.h.h);
                l1.q.I(rVarC7, g0Var, b3.h.d);
                g0Var.c0(1089144012);
                for (int i3 = 0; i3 < 5; i3++) {
                    d0(g0Var, 0);
                }
                g0Var.r(false);
                g0Var.r(true);
                i2++;
                cVar2 = cVar3;
            }
            g0Var.r(false);
            g0Var.r(true);
            g0Var.r(true);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new sw.a(i, 28);
        }
    }

    public static final void q(h1 uiState, u00.k onAction, b2.r rVar, l1.j jVar, int i, int i2) {
        int i3;
        b2.r rVar2;
        boolean z;
        h1 h1Var;
        b2.r rVar3;
        r1 r1VarT;
        b2.r rVar4;
        y3.c cVar;
        Object objN;
        l1.c cVar2;
        z0 z0Var;
        b3.g gVar;
        u00.n nVar;
        bx.c cVar3;
        int i4;
        boolean z2;
        Object objN2;
        u00.n nVar2;
        float f2;
        y3.c cVar4;
        boolean zG;
        Object objN3;
        Object obj;
        z0 z0Var2;
        int i5;
        boolean z3;
        Object objN4;
        u00.k kVar;
        boolean z4;
        Object objN5;
        boolean z5;
        Object objN6;
        kotlin.jvm.internal.m.e(uiState, "uiState");
        kotlin.jvm.internal.m.e(onAction, "onAction");
        l1.j jVar2 = (l1.g0) jVar;
        jVar2.e0(-797063874);
        if ((i & 6) == 0) {
            i3 = (jVar2.g(uiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= jVar2.i(onAction) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                rVar2 = rVar;
                i3 |= jVar2.g(rVar2) ? 256 : 128;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (jVar2.S(i3 & 1, z)) {
                rVar4 = b2.o.A;
                if (i6 != 0) {
                    rVar3 = rVar4;
                } else {
                    rVar3 = rVar2;
                }
                kk.c cVarD = kk.e.d(jVar2);
                cVar = (y3.c) jVar2.k(o1.h);
                objN = jVar2.N();
                cVar2 = l1.i.a;
                if (objN == cVar2) {
                    objN = x5.s(0, jVar2);
                }
                z0Var = (z0) objN;
                b2.r rVarE = z1.e(z1.d(rVar3, 1.0f), RCHTTPStatusCodes.UNSUCCESSFUL);
                v1 v1VarA = t1.a(h0.i.a, b2.b.K, jVar2, 48);
                int iHashCode = Long.hashCode(((l1.g0) jVar2).T);
                m1 m1VarM = jVar2.m();
                b2.r rVarC = b2.a.c(rVarE, jVar2);
                b3.i.c.getClass();
                gVar = b3.h.b;
                jVar2.g0();
                if (((l1.g0) jVar2).S) {
                    jVar2.l(gVar);
                } else {
                    jVar2.q0();
                }
                b3.f fVar = b3.h.f;
                l1.q.I(v1VarA, jVar2, fVar);
                b3.f fVar2 = b3.h.e;
                l1.q.I(m1VarM, jVar2, fVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                b3.f fVar3 = b3.h.g;
                l1.q.I(numValueOf, jVar2, fVar3);
                b3.e eVar = b3.h.h;
                l1.q.E(jVar2, eVar);
                nVar = b3.h.d;
                l1.q.I(rVarC, jVar2, nVar);
                cVar3 = uiState.d;
                if (cVar3 == null) {
                    jVar2.c0(-435815779);
                    jVar2.r(false);
                    i4 = i3;
                    cVar4 = cVar;
                    nVar2 = nVar;
                    f2 = 1.0f;
                } else {
                    i4 = i3;
                    jVar2.c0(-435815778);
                    b2.r rVarG = h0.c.G(rVar4, 24, 0.0f, 0.0f, 0.0f, 14);
                    PlayerItem playerItem = uiState.j;
                    int iA = ((h00.b) uiState.i).a();
                    if ((i4 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objN2 = jVar2.N();
                    if (z2 || objN2 == cVar2) {
                        objN2 = new d1(14, onAction);
                        jVar2.n0(objN2);
                    }
                    u00.a aVar = (u00.a) objN2;
                    nVar2 = nVar;
                    f2 = 1.0f;
                    cVar4 = cVar;
                    J(cVar3, playerItem, iA, aVar, rVarG, jVar2, 24584);
                    jVar2.r(false);
                }
                if (f2 <= 0.0d) {
                    i0.a.a("invalid weight; must be greater than zero");
                }
                c1 c1Var = new c1(f2, true);
                w0 w0VarD = h0.o.d(b2.b.A, false);
                int iHashCode2 = Long.hashCode(((l1.g0) jVar2).T);
                m1 m1VarM2 = jVar2.m();
                b2.r rVarC2 = b2.a.c(c1Var, jVar2);
                jVar2.g0();
                if (((l1.g0) jVar2).S) {
                    jVar2.l(gVar);
                } else {
                    jVar2.q0();
                }
                l1.q.I(w0VarD, jVar2, fVar);
                l1.q.I(m1VarM2, jVar2, fVar2);
                a1.b.v(iHashCode2, jVar2, fVar3, jVar2, eVar);
                l1.q.I(rVarC2, jVar2, nVar2);
                b2.r rVarA = kk.e.a(z1.d(rVar4, f2), cVarD);
                zG = jVar2.g(cVar4);
                objN3 = jVar2.N();
                if (zG) {
                    obj = cVar2;
                } else {
                    obj = cVar2;
                    if (objN3 == obj) {
                        z0Var2 = z0Var;
                    }
                    b2.r rVarO = z2.d0.o(rVarA, (u00.k) objN3);
                    h1Var = uiState;
                    u30.b bVar = h1Var.m;
                    u30.b bVar2 = h1Var.i;
                    PlayerItem playerItem2 = h1Var.j;
                    boolean z6 = h1Var.k;
                    boolean z7 = !h1Var.A;
                    u30.b bVar3 = h1Var.s;
                    i5 = i4 & 112;
                    if (i5 == 32) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objN4 = jVar2.N();
                    if (!z3 || objN4 == obj) {
                        kVar = onAction;
                        objN4 = new rx.c(12, kVar);
                        jVar2.n0(objN4);
                    } else {
                        kVar = onAction;
                    }
                    u00.k kVar2 = (u00.k) objN4;
                    if (i5 == 32) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objN5 = jVar2.N();
                    if (z4 || objN5 == obj) {
                        objN5 = new rx.c(13, kVar);
                        jVar2.n0(objN5);
                    }
                    u00.k kVar3 = (u00.k) objN5;
                    if (i5 == 32) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    objN6 = jVar2.N();
                    if (z5 || objN6 == obj) {
                        objN6 = new rx.c(14, kVar);
                        jVar2.n0(objN6);
                    }
                    v(0, rVarO, playerItem2, jVar2, kVar2, kVar3, (u00.k) objN6, bVar, bVar2, bVar3, z6, z7);
                    jVar2 = jVar2;
                    h0.o.a(z.n.e(z1.e(z1.q(rVar4, 16), ((y3.f) z0Var2.getValue()).A), sg.f.L(va.a.S(new i2.t[]{new i2.t(dl.a.L), new i2.t(i2.t.f)}), 0.0f, 0.0f, 14), (t0) null, 6), jVar2, 0);
                    jVar2.r(true);
                    jVar2.r(true);
                }
                z0Var2 = z0Var;
                objN3 = new as.f0(cVar4, z0Var2, 19);
                jVar2.n0(objN3);
                b2.r rVarO2 = z2.d0.o(rVarA, (u00.k) objN3);
                h1Var = uiState;
                u30.b bVar4 = h1Var.m;
                u30.b bVar5 = h1Var.i;
                PlayerItem playerItem3 = h1Var.j;
                boolean z8 = h1Var.k;
                boolean z9 = !h1Var.A;
                u30.b bVar6 = h1Var.s;
                i5 = i4 & 112;
                if (i5 == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objN4 = jVar2.N();
                if (z3) {
                    kVar = onAction;
                    objN4 = new rx.c(12, kVar);
                    jVar2.n0(objN4);
                } else {
                    kVar = onAction;
                    objN4 = new rx.c(12, kVar);
                    jVar2.n0(objN4);
                }
                u00.k kVar4 = (u00.k) objN4;
                if (i5 == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objN5 = jVar2.N();
                if (z4) {
                    objN5 = new rx.c(13, kVar);
                    jVar2.n0(objN5);
                } else {
                    objN5 = new rx.c(13, kVar);
                    jVar2.n0(objN5);
                }
                u00.k kVar5 = (u00.k) objN5;
                if (i5 == 32) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objN6 = jVar2.N();
                if (z5) {
                    objN6 = new rx.c(14, kVar);
                    jVar2.n0(objN6);
                } else {
                    objN6 = new rx.c(14, kVar);
                    jVar2.n0(objN6);
                }
                v(0, rVarO2, playerItem3, jVar2, kVar4, kVar5, (u00.k) objN6, bVar4, bVar5, bVar6, z8, z9);
                jVar2 = jVar2;
                h0.o.a(z.n.e(z1.e(z1.q(rVar4, 16), ((y3.f) z0Var2.getValue()).A), sg.f.L(va.a.S(new i2.t[]{new i2.t(dl.a.L), new i2.t(i2.t.f)}), 0.0f, 0.0f, 14), (t0) null, 6), jVar2, 0);
                jVar2.r(true);
                jVar2.r(true);
            } else {
                h1Var = uiState;
                jVar2.V();
                rVar3 = rVar2;
            }
            r1VarT = jVar2.t();
            if (r1VarT != null) {
                r1VarT.d = new ct.a(h1Var, onAction, rVar3, i, i2);
            }
        }
        i3 |= 384;
        rVar2 = rVar;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (jVar2.S(i3 & 1, z)) {
            rVar4 = b2.o.A;
            if (i6 != 0) {
                rVar3 = rVar4;
            } else {
                rVar3 = rVar2;
            }
            kk.c cVarD2 = kk.e.d(jVar2);
            cVar = (y3.c) jVar2.k(o1.h);
            objN = jVar2.N();
            cVar2 = l1.i.a;
            if (objN == cVar2) {
                objN = x5.s(0, jVar2);
            }
            z0Var = (z0) objN;
            b2.r rVarE2 = z1.e(z1.d(rVar3, 1.0f), RCHTTPStatusCodes.UNSUCCESSFUL);
            v1 v1VarA2 = t1.a(h0.i.a, b2.b.K, jVar2, 48);
            int iHashCode3 = Long.hashCode(((l1.g0) jVar2).T);
            m1 m1VarM3 = jVar2.m();
            b2.r rVarC3 = b2.a.c(rVarE2, jVar2);
            b3.i.c.getClass();
            gVar = b3.h.b;
            jVar2.g0();
            if (((l1.g0) jVar2).S) {
                jVar2.l(gVar);
            } else {
                jVar2.q0();
            }
            b3.f fVar4 = b3.h.f;
            l1.q.I(v1VarA2, jVar2, fVar4);
            b3.f fVar5 = b3.h.e;
            l1.q.I(m1VarM3, jVar2, fVar5);
            Integer numValueOf2 = Integer.valueOf(iHashCode3);
            b3.f fVar6 = b3.h.g;
            l1.q.I(numValueOf2, jVar2, fVar6);
            b3.e eVar2 = b3.h.h;
            l1.q.E(jVar2, eVar2);
            nVar = b3.h.d;
            l1.q.I(rVarC3, jVar2, nVar);
            cVar3 = uiState.d;
            if (cVar3 == null) {
                jVar2.c0(-435815779);
                jVar2.r(false);
                i4 = i3;
                cVar4 = cVar;
                nVar2 = nVar;
                f2 = 1.0f;
            } else {
                i4 = i3;
                jVar2.c0(-435815778);
                b2.r rVarG2 = h0.c.G(rVar4, 24, 0.0f, 0.0f, 0.0f, 14);
                PlayerItem playerItem4 = uiState.j;
                int iA2 = ((h00.b) uiState.i).a();
                if ((i4 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objN2 = jVar2.N();
                if (z2) {
                    objN2 = new d1(14, onAction);
                    jVar2.n0(objN2);
                } else {
                    objN2 = new d1(14, onAction);
                    jVar2.n0(objN2);
                }
                u00.a aVar2 = (u00.a) objN2;
                nVar2 = nVar;
                f2 = 1.0f;
                cVar4 = cVar;
                J(cVar3, playerItem4, iA2, aVar2, rVarG2, jVar2, 24584);
                jVar2.r(false);
            }
            if (f2 <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            c1 c1Var2 = new c1(f2, true);
            w0 w0VarD2 = h0.o.d(b2.b.A, false);
            int iHashCode4 = Long.hashCode(((l1.g0) jVar2).T);
            m1 m1VarM4 = jVar2.m();
            b2.r rVarC4 = b2.a.c(c1Var2, jVar2);
            jVar2.g0();
            if (((l1.g0) jVar2).S) {
                jVar2.l(gVar);
            } else {
                jVar2.q0();
            }
            l1.q.I(w0VarD2, jVar2, fVar4);
            l1.q.I(m1VarM4, jVar2, fVar5);
            a1.b.v(iHashCode4, jVar2, fVar6, jVar2, eVar2);
            l1.q.I(rVarC4, jVar2, nVar2);
            b2.r rVarA2 = kk.e.a(z1.d(rVar4, f2), cVarD2);
            zG = jVar2.g(cVar4);
            objN3 = jVar2.N();
            if (zG) {
                obj = cVar2;
                if (objN3 == obj) {
                    z0Var2 = z0Var;
                }
                b2.r rVarO3 = z2.d0.o(rVarA2, (u00.k) objN3);
                h1Var = uiState;
                u30.b bVar7 = h1Var.m;
                u30.b bVar8 = h1Var.i;
                PlayerItem playerItem5 = h1Var.j;
                boolean z11 = h1Var.k;
                boolean z12 = !h1Var.A;
                u30.b bVar9 = h1Var.s;
                i5 = i4 & 112;
                if (i5 == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objN4 = jVar2.N();
                if (z3) {
                    kVar = onAction;
                    objN4 = new rx.c(12, kVar);
                    jVar2.n0(objN4);
                } else {
                    kVar = onAction;
                    objN4 = new rx.c(12, kVar);
                    jVar2.n0(objN4);
                }
                u00.k kVar6 = (u00.k) objN4;
                if (i5 == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objN5 = jVar2.N();
                if (z4) {
                    objN5 = new rx.c(13, kVar);
                    jVar2.n0(objN5);
                } else {
                    objN5 = new rx.c(13, kVar);
                    jVar2.n0(objN5);
                }
                u00.k kVar7 = (u00.k) objN5;
                if (i5 == 32) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objN6 = jVar2.N();
                if (z5) {
                    objN6 = new rx.c(14, kVar);
                    jVar2.n0(objN6);
                } else {
                    objN6 = new rx.c(14, kVar);
                    jVar2.n0(objN6);
                }
                v(0, rVarO3, playerItem5, jVar2, kVar6, kVar7, (u00.k) objN6, bVar7, bVar8, bVar9, z11, z12);
                jVar2 = jVar2;
                h0.o.a(z.n.e(z1.e(z1.q(rVar4, 16), ((y3.f) z0Var2.getValue()).A), sg.f.L(va.a.S(new i2.t[]{new i2.t(dl.a.L), new i2.t(i2.t.f)}), 0.0f, 0.0f, 14), (t0) null, 6), jVar2, 0);
                jVar2.r(true);
                jVar2.r(true);
            } else {
                obj = cVar2;
            }
            z0Var2 = z0Var;
            objN3 = new as.f0(cVar4, z0Var2, 19);
            jVar2.n0(objN3);
            b2.r rVarO4 = z2.d0.o(rVarA2, (u00.k) objN3);
            h1Var = uiState;
            u30.b bVar10 = h1Var.m;
            u30.b bVar11 = h1Var.i;
            PlayerItem playerItem6 = h1Var.j;
            boolean z13 = h1Var.k;
            boolean z14 = !h1Var.A;
            u30.b bVar12 = h1Var.s;
            i5 = i4 & 112;
            if (i5 == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            objN4 = jVar2.N();
            if (z3) {
                kVar = onAction;
                objN4 = new rx.c(12, kVar);
                jVar2.n0(objN4);
            } else {
                kVar = onAction;
                objN4 = new rx.c(12, kVar);
                jVar2.n0(objN4);
            }
            u00.k kVar8 = (u00.k) objN4;
            if (i5 == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            objN5 = jVar2.N();
            if (z4) {
                objN5 = new rx.c(13, kVar);
                jVar2.n0(objN5);
            } else {
                objN5 = new rx.c(13, kVar);
                jVar2.n0(objN5);
            }
            u00.k kVar9 = (u00.k) objN5;
            if (i5 == 32) {
                z5 = true;
            } else {
                z5 = false;
            }
            objN6 = jVar2.N();
            if (z5) {
                objN6 = new rx.c(14, kVar);
                jVar2.n0(objN6);
            } else {
                objN6 = new rx.c(14, kVar);
                jVar2.n0(objN6);
            }
            v(0, rVarO4, playerItem6, jVar2, kVar8, kVar9, (u00.k) objN6, bVar10, bVar11, bVar12, z13, z14);
            jVar2 = jVar2;
            h0.o.a(z.n.e(z1.e(z1.q(rVar4, 16), ((y3.f) z0Var2.getValue()).A), sg.f.L(va.a.S(new i2.t[]{new i2.t(dl.a.L), new i2.t(i2.t.f)}), 0.0f, 0.0f, 14), (t0) null, 6), jVar2, 0);
            jVar2.r(true);
            jVar2.r(true);
        } else {
            h1Var = uiState;
            jVar2.V();
            rVar3 = rVar2;
        }
        r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new ct.a(h1Var, onAction, rVar3, i, i2);
        }
    }

    public static final void r(l1.j jVar, int i) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-304782223);
        if (g0Var.S(i & 1, i != 0)) {
            b2.o oVar = b2.o.A;
            b2.r rVarD = z1.d(oVar, 1.0f);
            float f2 = 32;
            v1 v1VarA = t1.a(h0.i.g(f2), b2.b.K, g0Var, 54);
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
            l1.q.I(v1VarA, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            l1.q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC, g0Var, fVar4);
            b2.r rVarQ = z1.q(oVar, 350);
            b2.g gVar2 = b2.b.N;
            float f3 = 16;
            h0.v vVarA = h0.u.a(h0.i.g(f3), gVar2, g0Var, 54);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarQ, g0Var);
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
            Q(140, 6, null, g0Var);
            P(42, z1.d(oVar, 1.0f), null, f2, g0Var, 3126, 4);
            g0Var.r(true);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            b2.r rVarC3 = h0.c.C(z.n.f(f2.h.c(new c1(1.0f, true), p0.f.a(20)), i2.t.b(0.08f, dl.a.i), i2.b0.b), f3);
            h0.v vVarA2 = h0.u.a(h0.i.g(12), gVar2, g0Var, 54);
            int iHashCode3 = Long.hashCode(g0Var.T);
            m1 m1VarM3 = g0Var.m();
            b2.r rVarC4 = b2.a.c(rVarC3, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA2, g0Var, fVar);
            l1.q.I(m1VarM3, g0Var, fVar2);
            a1.b.v(iHashCode3, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC4, g0Var, fVar4);
            b0(g0Var, 0);
            f0(g0Var, 0);
            g0Var.r(true);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new sw.a(i, 25);
        }
    }

    public static final void s(u00.a aVar, b2.r rVar, l1.j jVar, int i) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1875639739);
        int i2 = (g0Var.i(aVar) ? 4 : 2) | i | (g0Var.g(rVar) ? 32 : 16);
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            b2.r rVarD = z1.d(rVar, 1.0f);
            v1 v1VarA = t1.a(h0.i.g, b2.b.J, g0Var, 6);
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
            o(z3.U(g0Var, 2131887185), null, null, false, false, g0Var, 24576, 14);
            z6.b(z3.U(g0Var, 2131887202), w50.c.o(b2.o.A, false, null, aVar, 7), dl.a.m, kh.o.z(15), (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(15), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 24576, 48, 260072);
            g0Var = g0Var;
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new ev.m(aVar, rVar, i, 11);
        }
    }

    public static final void t(int i, b2.r rVar, l1.j jVar, boolean z) {
        l1.j jVar2;
        l1.j jVar3 = (l1.g0) jVar;
        jVar3.e0(1774572909);
        int i2 = (jVar3.g(rVar) ? 4 : 2) | i | (jVar3.h(z) ? 32 : 16);
        if (jVar3.S(i2 & 1, (i2 & 19) != 18)) {
            p2 p2VarA = b2.a(z ? i2.t.f : dl.a.n, (x.y) null, (String) null, jVar3, 0, 14);
            jVar2 = jVar3;
            z6.b(z3.U(jVar3, 2131887184), rVar, ((i2.t) p2VarA.getValue()).a, kh.o.z(32), q3.u.D, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(32), 2, false, 1, 0, (u00.k) null, (r0) null, jVar2, ((i2 << 3) & 112) | 1597440, 25008, 239528);
        } else {
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new ix.f(rVar, z, i);
        }
    }

    public static final void u(final boolean z, final u00.a onToggleFavorites, b2.r rVar, float f2, long j, boolean z2, u00.a aVar, int i, boolean z3, u00.a aVar2, float f3, l1.j jVar, final int i2, final int i3, final int i4) {
        int i5;
        b2.r rVar2;
        int i6;
        float f4;
        int i7;
        long j2;
        int i8;
        final boolean z4;
        int i9;
        int i11;
        u00.a aVar3;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z5;
        final int i21;
        final b2.r rVar3;
        final long j3;
        final u00.a aVar4;
        final float f5;
        final u00.a aVar5;
        final float f6;
        final boolean z6;
        r1 r1VarT;
        int i22;
        b2.r rVar4;
        Object obj;
        float f7;
        long j4;
        boolean z7;
        int i23;
        int i24;
        Object objN;
        Object objN2;
        final z0 z0Var;
        b3.g gVar;
        Object objN3;
        Object objN4;
        kotlin.jvm.internal.m.e(onToggleFavorites, "onToggleFavorites");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1335045411);
        if ((i2 & 6) == 0) {
            i5 = (g0Var.h(z) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= g0Var.i(onToggleFavorites) ? 32 : 16;
        }
        int i25 = i4 & 4;
        if (i25 == 0) {
            if ((i2 & 384) == 0) {
                rVar2 = rVar;
                i5 |= g0Var.g(rVar2) ? 256 : 128;
            }
            i6 = i4 & 8;
            if (i6 != 0) {
                if ((i2 & 3072) == 0) {
                    f4 = f2;
                    if (g0Var.d(f4)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i5 |= i7;
                }
                if ((i2 & 24576) == 0) {
                    if ((i4 & 16) == 0) {
                        j2 = j;
                        int i26 = g0Var.f(j2) ? 16384 : 8192;
                        i5 |= i26;
                    } else {
                        j2 = j;
                    }
                    i5 |= i26;
                } else {
                    j2 = j;
                }
                i8 = i4 & 32;
                if (i8 != 0) {
                    i5 |= 196608;
                    z4 = z2;
                } else {
                    z4 = z2;
                    if ((i2 & 196608) == 0) {
                        if (g0Var.h(z4)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i5 |= i9;
                    }
                }
                i11 = i4 & 64;
                if (i11 != 0) {
                    i5 |= 1572864;
                    aVar3 = aVar;
                } else {
                    aVar3 = aVar;
                    if ((i2 & 1572864) == 0) {
                        if (g0Var.i(aVar3)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                        i5 |= i12;
                    }
                }
                if ((i2 & 12582912) == 0) {
                    i5 |= 4194304;
                }
                i13 = i4 & 256;
                if (i13 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (g0Var.h(z3)) {
                        i14 = 67108864;
                    } else {
                        i14 = 33554432;
                    }
                    i5 |= i14;
                }
                i15 = i4 & 512;
                if (i15 != 0) {
                    if ((i2 & 805306368) == 0) {
                        if (g0Var.i(aVar2)) {
                            i16 = 536870912;
                        } else {
                            i16 = 268435456;
                        }
                        i5 |= i16;
                    }
                    i17 = i4 & 1024;
                    if (i17 != 0) {
                        i18 = 6;
                    } else if ((i3 & 6) == 0) {
                        if (g0Var.d(f3)) {
                            i19 = 4;
                        } else {
                            i19 = 2;
                        }
                        i18 = i3 | i19;
                    } else {
                        i18 = i3;
                    }
                    if ((i5 & 306783379) == 306783378 || (i18 & 3) != 2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (g0Var.S(i5 & 1, z5)) {
                        g0Var.X();
                        i22 = i2 & 1;
                        rVar4 = b2.o.A;
                        obj = l1.i.a;
                        if (i22 != 0 || g0Var.A()) {
                            if (i25 != 0) {
                                rVar2 = rVar4;
                            }
                            if (i6 != 0) {
                                f7 = 24;
                            } else {
                                f7 = f4;
                            }
                            if ((i4 & 16) != 0) {
                                j4 = dl.a.i;
                                i5 &= -57345;
                            } else {
                                j4 = j2;
                            }
                            if (i8 != 0) {
                                z4 = false;
                            }
                            if (i11 != 0) {
                                objN = g0Var.N();
                                if (objN == obj) {
                                    objN = new a2.f(24);
                                    g0Var.n0(objN);
                                }
                                aVar3 = (u00.a) objN;
                            }
                            int i27 = i5 & (-29360129);
                            if (i13 != 0) {
                                z7 = true;
                            } else {
                                z7 = z3;
                            }
                            if (i15 != 0) {
                                aVar4 = null;
                            } else {
                                aVar4 = aVar2;
                            }
                            if (i17 != 0) {
                                f5 = 0;
                            } else {
                                f5 = f3;
                            }
                            i23 = i27;
                            i24 = 2131231396;
                        } else {
                            g0Var.V();
                            if ((i4 & 16) != 0) {
                                i5 &= -57345;
                            }
                            int i28 = i5 & (-29360129);
                            i24 = i;
                            z7 = z3;
                            i23 = i28;
                            f7 = f4;
                            j4 = j2;
                            aVar4 = aVar2;
                            f5 = f3;
                        }
                        g0Var.s();
                        final u00.a aVar6 = aVar3;
                        objN2 = g0Var.N();
                        if (objN2 == obj) {
                            objN2 = l1.q.z(Boolean.FALSE);
                            g0Var.n0(objN2);
                        }
                        z0Var = (z0) objN2;
                        final boolean z8 = z7;
                        final boolean z9 = z4;
                        w0 w0VarD = h0.o.d(b2.b.A, false);
                        long j5 = j4;
                        int iHashCode = Long.hashCode(g0Var.T);
                        m1 m1VarM = g0Var.m();
                        b2.r rVarC = b2.a.c(rVar2, g0Var);
                        b3.i.c.getClass();
                        gVar = b3.h.b;
                        g0Var.g0();
                        b2.r rVar5 = rVar2;
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
                        b2.r rVarC2 = f2.h.c(h0.c.C(z1.m(rVar4, f7), 4), p0.f.a);
                        objN3 = g0Var.N();
                        if (objN3 == obj) {
                            objN3 = new ct.k(z0Var, 28);
                            g0Var.n0(objN3);
                        }
                        z3.j(y3.R(i24, g0Var, 0), (String) null, h0.c.C(w50.c.n(rVarC2, true, (u00.a) objN3), f5), j5, g0Var, ((i23 >> 3) & 7168) | 56, 0);
                        boolean zBooleanValue = ((Boolean) z0Var.getValue()).booleanValue();
                        long j6 = dl.a.K;
                        p0.e eVarA = p0.f.a(16);
                        objN4 = g0Var.N();
                        if (objN4 == obj) {
                            objN4 = new ct.k(z0Var, 29);
                            g0Var.n0(objN4);
                        }
                        final u00.a aVar7 = aVar4;
                        z4 = z9;
                        jl.c.b(zBooleanValue, (u00.a) objN4, j6, eVarA, null, 0L, false, null, v1.d.d(-1418247478, new u00.o() {
                            @Override
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                h0.w DropdownMenuNoPaddingVertical = (h0.w) obj2;
                                l1.g0 g0Var2 = (l1.j) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                kotlin.jvm.internal.m.e(DropdownMenuNoPaddingVertical, "$this$DropdownMenuNoPaddingVertical");
                                l1.g0 g0Var3 = g0Var2;
                                if (g0Var3.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    b2.o oVar = b2.o.A;
                                    u00.a aVar8 = aVar7;
                                    z0 z0Var2 = z0Var;
                                    Object obj5 = l1.i.a;
                                    if (aVar8 != null) {
                                        g0Var3.c0(-1417225222);
                                        b2.r rVarC3 = h0.c.C(oVar, 0);
                                        v1.c cVar = k.f;
                                        boolean zG = g0Var3.g(aVar8);
                                        Object objN5 = g0Var3.N();
                                        if (zG || objN5 == obj5) {
                                            objN5 = new fz.d(aVar8, z0Var2, 1);
                                            g0Var3.n0(objN5);
                                        }
                                        g1.m.b(cVar, (u00.a) objN5, rVarC3, (u00.n) null, false, (w3) null, (n1) null, g0Var2, 390, 504);
                                        g0Var3.r(false);
                                    } else {
                                        g0Var3.c0(-1415921672);
                                        g0Var3.r(false);
                                    }
                                    if (z8) {
                                        g0Var3.c0(-1415810072);
                                        b2.r rVarC4 = h0.c.C(oVar, 0);
                                        v1.c cVarD = v1.d.d(254697068, new iv.p(z), g0Var2);
                                        u00.a aVar9 = onToggleFavorites;
                                        boolean zG2 = g0Var3.g(aVar9);
                                        Object objN6 = g0Var3.N();
                                        if (zG2 || objN6 == obj5) {
                                            objN6 = new fz.d(aVar9, z0Var2, 2);
                                            g0Var3.n0(objN6);
                                        }
                                        g1.m.b(cVarD, (u00.a) objN6, rVarC4, (u00.n) null, false, (w3) null, (n1) null, g0Var2, 390, 504);
                                        g0Var3.r(false);
                                    } else {
                                        g0Var3.c0(-1414027944);
                                        g0Var3.r(false);
                                    }
                                    if (z9) {
                                        g0Var3.c0(-1413921924);
                                        b2.r rVarC5 = h0.c.C(oVar, 0);
                                        v1.c cVar2 = k.g;
                                        u00.a aVar10 = aVar6;
                                        boolean zG3 = g0Var3.g(aVar10);
                                        Object objN7 = g0Var3.N();
                                        if (zG3 || objN7 == obj5) {
                                            objN7 = new fz.d(aVar10, z0Var2, 3);
                                            g0Var3.n0(objN7);
                                        }
                                        g1.m.b(cVar2, (u00.a) objN7, rVarC5, (u00.n) null, false, (w3) null, (n1) null, g0Var2, 390, 504);
                                        g0Var3.r(false);
                                    } else {
                                        g0Var3.c0(-1412128264);
                                        g0Var3.r(false);
                                    }
                                } else {
                                    g0Var3.V();
                                }
                                return g00.b0.a;
                            }
                        }, g0Var), g0Var, 100663344, 240);
                        g0Var.r(true);
                        aVar5 = aVar6;
                        rVar3 = rVar5;
                        f6 = f7;
                        i21 = i24;
                        z6 = z8;
                        j3 = j5;
                    } else {
                        g0Var.V();
                        i21 = i;
                        rVar3 = rVar2;
                        j3 = j2;
                        aVar4 = aVar2;
                        f5 = f3;
                        aVar5 = aVar3;
                        f6 = f4;
                        z6 = z3;
                    }
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        r1VarT.d = new u00.n() {
                            @Override
                            public final Object invoke(Object obj2, Object obj3) {
                                ((Integer) obj3).getClass();
                                int iK = l1.q.K(i2 | 1);
                                int iK2 = l1.q.K(i3);
                                k.u(z, onToggleFavorites, rVar3, f6, j3, z4, aVar5, i21, z6, aVar4, f5, (l1.j) obj2, iK, iK2, i4);
                                return g00.b0.a;
                            }
                        };
                    }
                }
                i5 |= 805306368;
                i17 = i4 & 1024;
                if (i17 != 0) {
                    i18 = 6;
                } else if ((i3 & 6) == 0) {
                    if (g0Var.d(f3)) {
                        i19 = 4;
                    } else {
                        i19 = 2;
                    }
                    i18 = i3 | i19;
                } else {
                    i18 = i3;
                }
                if ((i5 & 306783379) == 306783378) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                if (g0Var.S(i5 & 1, z5)) {
                    g0Var.X();
                    i22 = i2 & 1;
                    rVar4 = b2.o.A;
                    obj = l1.i.a;
                    if (i22 != 0) {
                        if (i25 != 0) {
                            rVar2 = rVar4;
                        }
                        if (i6 != 0) {
                            f7 = 24;
                        } else {
                            f7 = f4;
                        }
                        if ((i4 & 16) != 0) {
                            j4 = dl.a.i;
                            i5 &= -57345;
                        } else {
                            j4 = j2;
                        }
                        if (i8 != 0) {
                            z4 = false;
                        }
                        if (i11 != 0) {
                            objN = g0Var.N();
                            if (objN == obj) {
                                objN = new a2.f(24);
                                g0Var.n0(objN);
                            }
                            aVar3 = (u00.a) objN;
                        }
                        int i29 = i5 & (-29360129);
                        if (i13 != 0) {
                            z7 = true;
                        } else {
                            z7 = z3;
                        }
                        if (i15 != 0) {
                            aVar4 = null;
                        } else {
                            aVar4 = aVar2;
                        }
                        if (i17 != 0) {
                            f5 = 0;
                        } else {
                            f5 = f3;
                        }
                        i23 = i29;
                        i24 = 2131231396;
                    } else {
                        if (i25 != 0) {
                            rVar2 = rVar4;
                        }
                        if (i6 != 0) {
                            f7 = 24;
                        } else {
                            f7 = f4;
                        }
                        if ((i4 & 16) != 0) {
                            j4 = dl.a.i;
                            i5 &= -57345;
                        } else {
                            j4 = j2;
                        }
                        if (i8 != 0) {
                            z4 = false;
                        }
                        if (i11 != 0) {
                            objN = g0Var.N();
                            if (objN == obj) {
                                objN = new a2.f(24);
                                g0Var.n0(objN);
                            }
                            aVar3 = (u00.a) objN;
                        }
                        int i210 = i5 & (-29360129);
                        if (i13 != 0) {
                            z7 = true;
                        } else {
                            z7 = z3;
                        }
                        if (i15 != 0) {
                            aVar4 = null;
                        } else {
                            aVar4 = aVar2;
                        }
                        if (i17 != 0) {
                            f5 = 0;
                        } else {
                            f5 = f3;
                        }
                        i23 = i210;
                        i24 = 2131231396;
                    }
                    g0Var.s();
                    final u00.a aVar8 = aVar3;
                    objN2 = g0Var.N();
                    if (objN2 == obj) {
                        objN2 = l1.q.z(Boolean.FALSE);
                        g0Var.n0(objN2);
                    }
                    z0Var = (z0) objN2;
                    final boolean z11 = z7;
                    final boolean z12 = z4;
                    w0 w0VarD2 = h0.o.d(b2.b.A, false);
                    long j7 = j4;
                    int iHashCode2 = Long.hashCode(g0Var.T);
                    m1 m1VarM2 = g0Var.m();
                    b2.r rVarC3 = b2.a.c(rVar2, g0Var);
                    b3.i.c.getClass();
                    gVar = b3.h.b;
                    g0Var.g0();
                    b2.r rVar6 = rVar2;
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(w0VarD2, g0Var, b3.h.f);
                    l1.q.I(m1VarM2, g0Var, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode2), g0Var, b3.h.g);
                    l1.q.E(g0Var, b3.h.h);
                    l1.q.I(rVarC3, g0Var, b3.h.d);
                    b2.r rVarC4 = f2.h.c(h0.c.C(z1.m(rVar4, f7), 4), p0.f.a);
                    objN3 = g0Var.N();
                    if (objN3 == obj) {
                        objN3 = new ct.k(z0Var, 28);
                        g0Var.n0(objN3);
                    }
                    z3.j(y3.R(i24, g0Var, 0), (String) null, h0.c.C(w50.c.n(rVarC4, true, (u00.a) objN3), f5), j7, g0Var, ((i23 >> 3) & 7168) | 56, 0);
                    boolean zBooleanValue2 = ((Boolean) z0Var.getValue()).booleanValue();
                    long j8 = dl.a.K;
                    p0.e eVarA2 = p0.f.a(16);
                    objN4 = g0Var.N();
                    if (objN4 == obj) {
                        objN4 = new ct.k(z0Var, 29);
                        g0Var.n0(objN4);
                    }
                    final u00.a aVar9 = aVar4;
                    z4 = z12;
                    jl.c.b(zBooleanValue2, (u00.a) objN4, j8, eVarA2, null, 0L, false, null, v1.d.d(-1418247478, new u00.o() {
                        @Override
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            h0.w DropdownMenuNoPaddingVertical = (h0.w) obj2;
                            l1.g0 g0Var2 = (l1.j) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            kotlin.jvm.internal.m.e(DropdownMenuNoPaddingVertical, "$this$DropdownMenuNoPaddingVertical");
                            l1.g0 g0Var3 = g0Var2;
                            if (g0Var3.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                b2.o oVar = b2.o.A;
                                u00.a aVar10 = aVar9;
                                z0 z0Var2 = z0Var;
                                Object obj5 = l1.i.a;
                                if (aVar10 != null) {
                                    g0Var3.c0(-1417225222);
                                    b2.r rVarC5 = h0.c.C(oVar, 0);
                                    v1.c cVar = k.f;
                                    boolean zG = g0Var3.g(aVar10);
                                    Object objN5 = g0Var3.N();
                                    if (zG || objN5 == obj5) {
                                        objN5 = new fz.d(aVar10, z0Var2, 1);
                                        g0Var3.n0(objN5);
                                    }
                                    g1.m.b(cVar, (u00.a) objN5, rVarC5, (u00.n) null, false, (w3) null, (n1) null, g0Var2, 390, 504);
                                    g0Var3.r(false);
                                } else {
                                    g0Var3.c0(-1415921672);
                                    g0Var3.r(false);
                                }
                                if (z11) {
                                    g0Var3.c0(-1415810072);
                                    b2.r rVarC6 = h0.c.C(oVar, 0);
                                    v1.c cVarD = v1.d.d(254697068, new iv.p(z), g0Var2);
                                    u00.a aVar11 = onToggleFavorites;
                                    boolean zG2 = g0Var3.g(aVar11);
                                    Object objN6 = g0Var3.N();
                                    if (zG2 || objN6 == obj5) {
                                        objN6 = new fz.d(aVar11, z0Var2, 2);
                                        g0Var3.n0(objN6);
                                    }
                                    g1.m.b(cVarD, (u00.a) objN6, rVarC6, (u00.n) null, false, (w3) null, (n1) null, g0Var2, 390, 504);
                                    g0Var3.r(false);
                                } else {
                                    g0Var3.c0(-1414027944);
                                    g0Var3.r(false);
                                }
                                if (z12) {
                                    g0Var3.c0(-1413921924);
                                    b2.r rVarC7 = h0.c.C(oVar, 0);
                                    v1.c cVar2 = k.g;
                                    u00.a aVar12 = aVar8;
                                    boolean zG3 = g0Var3.g(aVar12);
                                    Object objN7 = g0Var3.N();
                                    if (zG3 || objN7 == obj5) {
                                        objN7 = new fz.d(aVar12, z0Var2, 3);
                                        g0Var3.n0(objN7);
                                    }
                                    g1.m.b(cVar2, (u00.a) objN7, rVarC7, (u00.n) null, false, (w3) null, (n1) null, g0Var2, 390, 504);
                                    g0Var3.r(false);
                                } else {
                                    g0Var3.c0(-1412128264);
                                    g0Var3.r(false);
                                }
                            } else {
                                g0Var3.V();
                            }
                            return g00.b0.a;
                        }
                    }, g0Var), g0Var, 100663344, 240);
                    g0Var.r(true);
                    aVar5 = aVar8;
                    rVar3 = rVar6;
                    f6 = f7;
                    i21 = i24;
                    z6 = z11;
                    j3 = j7;
                } else {
                    g0Var.V();
                    i21 = i;
                    rVar3 = rVar2;
                    j3 = j2;
                    aVar4 = aVar2;
                    f5 = f3;
                    aVar5 = aVar3;
                    f6 = f4;
                    z6 = z3;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.d = new u00.n() {
                        @Override
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            int iK = l1.q.K(i2 | 1);
                            int iK2 = l1.q.K(i3);
                            k.u(z, onToggleFavorites, rVar3, f6, j3, z4, aVar5, i21, z6, aVar4, f5, (l1.j) obj2, iK, iK2, i4);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i5 |= 3072;
            f4 = f2;
            if ((i2 & 24576) == 0) {
                if ((i4 & 16) == 0) {
                    j2 = j;
                    if (g0Var.f(j2)) {
                    }
                    i5 |= i26;
                } else {
                    j2 = j;
                }
                i5 |= i26;
            } else {
                j2 = j;
            }
            i8 = i4 & 32;
            if (i8 != 0) {
                i5 |= 196608;
                z4 = z2;
            } else {
                z4 = z2;
                if ((i2 & 196608) == 0) {
                    if (g0Var.h(z4)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i5 |= i9;
                }
            }
            i11 = i4 & 64;
            if (i11 != 0) {
                i5 |= 1572864;
                aVar3 = aVar;
            } else {
                aVar3 = aVar;
                if ((i2 & 1572864) == 0) {
                    if (g0Var.i(aVar3)) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                    i5 |= i12;
                }
            }
            if ((i2 & 12582912) == 0) {
                i5 |= 4194304;
            }
            i13 = i4 & 256;
            if (i13 != 0) {
                i5 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (g0Var.h(z3)) {
                    i14 = 67108864;
                } else {
                    i14 = 33554432;
                }
                i5 |= i14;
            }
            i15 = i4 & 512;
            if (i15 != 0) {
                if ((i2 & 805306368) == 0) {
                    if (g0Var.i(aVar2)) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i5 |= i16;
                }
                i17 = i4 & 1024;
                if (i17 != 0) {
                    i18 = 6;
                } else if ((i3 & 6) == 0) {
                    if (g0Var.d(f3)) {
                        i19 = 4;
                    } else {
                        i19 = 2;
                    }
                    i18 = i3 | i19;
                } else {
                    i18 = i3;
                }
                if ((i5 & 306783379) == 306783378) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                if (g0Var.S(i5 & 1, z5)) {
                    g0Var.X();
                    i22 = i2 & 1;
                    rVar4 = b2.o.A;
                    obj = l1.i.a;
                    if (i22 != 0) {
                        if (i25 != 0) {
                            rVar2 = rVar4;
                        }
                        if (i6 != 0) {
                            f7 = 24;
                        } else {
                            f7 = f4;
                        }
                        if ((i4 & 16) != 0) {
                            j4 = dl.a.i;
                            i5 &= -57345;
                        } else {
                            j4 = j2;
                        }
                        if (i8 != 0) {
                            z4 = false;
                        }
                        if (i11 != 0) {
                            objN = g0Var.N();
                            if (objN == obj) {
                                objN = new a2.f(24);
                                g0Var.n0(objN);
                            }
                            aVar3 = (u00.a) objN;
                        }
                        int i211 = i5 & (-29360129);
                        if (i13 != 0) {
                            z7 = true;
                        } else {
                            z7 = z3;
                        }
                        if (i15 != 0) {
                            aVar4 = null;
                        } else {
                            aVar4 = aVar2;
                        }
                        if (i17 != 0) {
                            f5 = 0;
                        } else {
                            f5 = f3;
                        }
                        i23 = i211;
                        i24 = 2131231396;
                    } else {
                        if (i25 != 0) {
                            rVar2 = rVar4;
                        }
                        if (i6 != 0) {
                            f7 = 24;
                        } else {
                            f7 = f4;
                        }
                        if ((i4 & 16) != 0) {
                            j4 = dl.a.i;
                            i5 &= -57345;
                        } else {
                            j4 = j2;
                        }
                        if (i8 != 0) {
                            z4 = false;
                        }
                        if (i11 != 0) {
                            objN = g0Var.N();
                            if (objN == obj) {
                                objN = new a2.f(24);
                                g0Var.n0(objN);
                            }
                            aVar3 = (u00.a) objN;
                        }
                        int i212 = i5 & (-29360129);
                        if (i13 != 0) {
                            z7 = true;
                        } else {
                            z7 = z3;
                        }
                        if (i15 != 0) {
                            aVar4 = null;
                        } else {
                            aVar4 = aVar2;
                        }
                        if (i17 != 0) {
                            f5 = 0;
                        } else {
                            f5 = f3;
                        }
                        i23 = i212;
                        i24 = 2131231396;
                    }
                    g0Var.s();
                    final u00.a aVar10 = aVar3;
                    objN2 = g0Var.N();
                    if (objN2 == obj) {
                        objN2 = l1.q.z(Boolean.FALSE);
                        g0Var.n0(objN2);
                    }
                    z0Var = (z0) objN2;
                    final boolean z13 = z7;
                    final boolean z14 = z4;
                    w0 w0VarD3 = h0.o.d(b2.b.A, false);
                    long j9 = j4;
                    int iHashCode3 = Long.hashCode(g0Var.T);
                    m1 m1VarM3 = g0Var.m();
                    b2.r rVarC5 = b2.a.c(rVar2, g0Var);
                    b3.i.c.getClass();
                    gVar = b3.h.b;
                    g0Var.g0();
                    b2.r rVar7 = rVar2;
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(w0VarD3, g0Var, b3.h.f);
                    l1.q.I(m1VarM3, g0Var, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode3), g0Var, b3.h.g);
                    l1.q.E(g0Var, b3.h.h);
                    l1.q.I(rVarC5, g0Var, b3.h.d);
                    b2.r rVarC6 = f2.h.c(h0.c.C(z1.m(rVar4, f7), 4), p0.f.a);
                    objN3 = g0Var.N();
                    if (objN3 == obj) {
                        objN3 = new ct.k(z0Var, 28);
                        g0Var.n0(objN3);
                    }
                    z3.j(y3.R(i24, g0Var, 0), (String) null, h0.c.C(w50.c.n(rVarC6, true, (u00.a) objN3), f5), j9, g0Var, ((i23 >> 3) & 7168) | 56, 0);
                    boolean zBooleanValue3 = ((Boolean) z0Var.getValue()).booleanValue();
                    long j11 = dl.a.K;
                    p0.e eVarA3 = p0.f.a(16);
                    objN4 = g0Var.N();
                    if (objN4 == obj) {
                        objN4 = new ct.k(z0Var, 29);
                        g0Var.n0(objN4);
                    }
                    final u00.a aVar11 = aVar4;
                    z4 = z14;
                    jl.c.b(zBooleanValue3, (u00.a) objN4, j11, eVarA3, null, 0L, false, null, v1.d.d(-1418247478, new u00.o() {
                        @Override
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            h0.w DropdownMenuNoPaddingVertical = (h0.w) obj2;
                            l1.g0 g0Var2 = (l1.j) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            kotlin.jvm.internal.m.e(DropdownMenuNoPaddingVertical, "$this$DropdownMenuNoPaddingVertical");
                            l1.g0 g0Var3 = g0Var2;
                            if (g0Var3.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                b2.o oVar = b2.o.A;
                                u00.a aVar12 = aVar11;
                                z0 z0Var2 = z0Var;
                                Object obj5 = l1.i.a;
                                if (aVar12 != null) {
                                    g0Var3.c0(-1417225222);
                                    b2.r rVarC7 = h0.c.C(oVar, 0);
                                    v1.c cVar = k.f;
                                    boolean zG = g0Var3.g(aVar12);
                                    Object objN5 = g0Var3.N();
                                    if (zG || objN5 == obj5) {
                                        objN5 = new fz.d(aVar12, z0Var2, 1);
                                        g0Var3.n0(objN5);
                                    }
                                    g1.m.b(cVar, (u00.a) objN5, rVarC7, (u00.n) null, false, (w3) null, (n1) null, g0Var2, 390, 504);
                                    g0Var3.r(false);
                                } else {
                                    g0Var3.c0(-1415921672);
                                    g0Var3.r(false);
                                }
                                if (z13) {
                                    g0Var3.c0(-1415810072);
                                    b2.r rVarC8 = h0.c.C(oVar, 0);
                                    v1.c cVarD = v1.d.d(254697068, new iv.p(z), g0Var2);
                                    u00.a aVar13 = onToggleFavorites;
                                    boolean zG2 = g0Var3.g(aVar13);
                                    Object objN6 = g0Var3.N();
                                    if (zG2 || objN6 == obj5) {
                                        objN6 = new fz.d(aVar13, z0Var2, 2);
                                        g0Var3.n0(objN6);
                                    }
                                    g1.m.b(cVarD, (u00.a) objN6, rVarC8, (u00.n) null, false, (w3) null, (n1) null, g0Var2, 390, 504);
                                    g0Var3.r(false);
                                } else {
                                    g0Var3.c0(-1414027944);
                                    g0Var3.r(false);
                                }
                                if (z14) {
                                    g0Var3.c0(-1413921924);
                                    b2.r rVarC9 = h0.c.C(oVar, 0);
                                    v1.c cVar2 = k.g;
                                    u00.a aVar14 = aVar10;
                                    boolean zG3 = g0Var3.g(aVar14);
                                    Object objN7 = g0Var3.N();
                                    if (zG3 || objN7 == obj5) {
                                        objN7 = new fz.d(aVar14, z0Var2, 3);
                                        g0Var3.n0(objN7);
                                    }
                                    g1.m.b(cVar2, (u00.a) objN7, rVarC9, (u00.n) null, false, (w3) null, (n1) null, g0Var2, 390, 504);
                                    g0Var3.r(false);
                                } else {
                                    g0Var3.c0(-1412128264);
                                    g0Var3.r(false);
                                }
                            } else {
                                g0Var3.V();
                            }
                            return g00.b0.a;
                        }
                    }, g0Var), g0Var, 100663344, 240);
                    g0Var.r(true);
                    aVar5 = aVar10;
                    rVar3 = rVar7;
                    f6 = f7;
                    i21 = i24;
                    z6 = z13;
                    j3 = j9;
                } else {
                    g0Var.V();
                    i21 = i;
                    rVar3 = rVar2;
                    j3 = j2;
                    aVar4 = aVar2;
                    f5 = f3;
                    aVar5 = aVar3;
                    f6 = f4;
                    z6 = z3;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.d = new u00.n() {
                        @Override
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            int iK = l1.q.K(i2 | 1);
                            int iK2 = l1.q.K(i3);
                            k.u(z, onToggleFavorites, rVar3, f6, j3, z4, aVar5, i21, z6, aVar4, f5, (l1.j) obj2, iK, iK2, i4);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i5 |= 805306368;
            i17 = i4 & 1024;
            if (i17 != 0) {
                i18 = 6;
            } else if ((i3 & 6) == 0) {
                if (g0Var.d(f3)) {
                    i19 = 4;
                } else {
                    i19 = 2;
                }
                i18 = i3 | i19;
            } else {
                i18 = i3;
            }
            if ((i5 & 306783379) == 306783378) {
                z5 = true;
            } else {
                z5 = true;
            }
            if (g0Var.S(i5 & 1, z5)) {
                g0Var.X();
                i22 = i2 & 1;
                rVar4 = b2.o.A;
                obj = l1.i.a;
                if (i22 != 0) {
                    if (i25 != 0) {
                        rVar2 = rVar4;
                    }
                    if (i6 != 0) {
                        f7 = 24;
                    } else {
                        f7 = f4;
                    }
                    if ((i4 & 16) != 0) {
                        j4 = dl.a.i;
                        i5 &= -57345;
                    } else {
                        j4 = j2;
                    }
                    if (i8 != 0) {
                        z4 = false;
                    }
                    if (i11 != 0) {
                        objN = g0Var.N();
                        if (objN == obj) {
                            objN = new a2.f(24);
                            g0Var.n0(objN);
                        }
                        aVar3 = (u00.a) objN;
                    }
                    int i213 = i5 & (-29360129);
                    if (i13 != 0) {
                        z7 = true;
                    } else {
                        z7 = z3;
                    }
                    if (i15 != 0) {
                        aVar4 = null;
                    } else {
                        aVar4 = aVar2;
                    }
                    if (i17 != 0) {
                        f5 = 0;
                    } else {
                        f5 = f3;
                    }
                    i23 = i213;
                    i24 = 2131231396;
                } else {
                    if (i25 != 0) {
                        rVar2 = rVar4;
                    }
                    if (i6 != 0) {
                        f7 = 24;
                    } else {
                        f7 = f4;
                    }
                    if ((i4 & 16) != 0) {
                        j4 = dl.a.i;
                        i5 &= -57345;
                    } else {
                        j4 = j2;
                    }
                    if (i8 != 0) {
                        z4 = false;
                    }
                    if (i11 != 0) {
                        objN = g0Var.N();
                        if (objN == obj) {
                            objN = new a2.f(24);
                            g0Var.n0(objN);
                        }
                        aVar3 = (u00.a) objN;
                    }
                    int i214 = i5 & (-29360129);
                    if (i13 != 0) {
                        z7 = true;
                    } else {
                        z7 = z3;
                    }
                    if (i15 != 0) {
                        aVar4 = null;
                    } else {
                        aVar4 = aVar2;
                    }
                    if (i17 != 0) {
                        f5 = 0;
                    } else {
                        f5 = f3;
                    }
                    i23 = i214;
                    i24 = 2131231396;
                }
                g0Var.s();
                final u00.a aVar12 = aVar3;
                objN2 = g0Var.N();
                if (objN2 == obj) {
                    objN2 = l1.q.z(Boolean.FALSE);
                    g0Var.n0(objN2);
                }
                z0Var = (z0) objN2;
                final boolean z15 = z7;
                final boolean z16 = z4;
                w0 w0VarD4 = h0.o.d(b2.b.A, false);
                long j12 = j4;
                int iHashCode4 = Long.hashCode(g0Var.T);
                m1 m1VarM4 = g0Var.m();
                b2.r rVarC7 = b2.a.c(rVar2, g0Var);
                b3.i.c.getClass();
                gVar = b3.h.b;
                g0Var.g0();
                b2.r rVar8 = rVar2;
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(w0VarD4, g0Var, b3.h.f);
                l1.q.I(m1VarM4, g0Var, b3.h.e);
                l1.q.I(Integer.valueOf(iHashCode4), g0Var, b3.h.g);
                l1.q.E(g0Var, b3.h.h);
                l1.q.I(rVarC7, g0Var, b3.h.d);
                b2.r rVarC8 = f2.h.c(h0.c.C(z1.m(rVar4, f7), 4), p0.f.a);
                objN3 = g0Var.N();
                if (objN3 == obj) {
                    objN3 = new ct.k(z0Var, 28);
                    g0Var.n0(objN3);
                }
                z3.j(y3.R(i24, g0Var, 0), (String) null, h0.c.C(w50.c.n(rVarC8, true, (u00.a) objN3), f5), j12, g0Var, ((i23 >> 3) & 7168) | 56, 0);
                boolean zBooleanValue4 = ((Boolean) z0Var.getValue()).booleanValue();
                long j13 = dl.a.K;
                p0.e eVarA4 = p0.f.a(16);
                objN4 = g0Var.N();
                if (objN4 == obj) {
                    objN4 = new ct.k(z0Var, 29);
                    g0Var.n0(objN4);
                }
                final u00.a aVar13 = aVar4;
                z4 = z16;
                jl.c.b(zBooleanValue4, (u00.a) objN4, j13, eVarA4, null, 0L, false, null, v1.d.d(-1418247478, new u00.o() {
                    @Override
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        h0.w DropdownMenuNoPaddingVertical = (h0.w) obj2;
                        l1.g0 g0Var2 = (l1.j) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        kotlin.jvm.internal.m.e(DropdownMenuNoPaddingVertical, "$this$DropdownMenuNoPaddingVertical");
                        l1.g0 g0Var3 = g0Var2;
                        if (g0Var3.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                            b2.o oVar = b2.o.A;
                            u00.a aVar14 = aVar13;
                            z0 z0Var2 = z0Var;
                            Object obj5 = l1.i.a;
                            if (aVar14 != null) {
                                g0Var3.c0(-1417225222);
                                b2.r rVarC9 = h0.c.C(oVar, 0);
                                v1.c cVar = k.f;
                                boolean zG = g0Var3.g(aVar14);
                                Object objN5 = g0Var3.N();
                                if (zG || objN5 == obj5) {
                                    objN5 = new fz.d(aVar14, z0Var2, 1);
                                    g0Var3.n0(objN5);
                                }
                                g1.m.b(cVar, (u00.a) objN5, rVarC9, (u00.n) null, false, (w3) null, (n1) null, g0Var2, 390, 504);
                                g0Var3.r(false);
                            } else {
                                g0Var3.c0(-1415921672);
                                g0Var3.r(false);
                            }
                            if (z15) {
                                g0Var3.c0(-1415810072);
                                b2.r rVarC10 = h0.c.C(oVar, 0);
                                v1.c cVarD = v1.d.d(254697068, new iv.p(z), g0Var2);
                                u00.a aVar15 = onToggleFavorites;
                                boolean zG2 = g0Var3.g(aVar15);
                                Object objN6 = g0Var3.N();
                                if (zG2 || objN6 == obj5) {
                                    objN6 = new fz.d(aVar15, z0Var2, 2);
                                    g0Var3.n0(objN6);
                                }
                                g1.m.b(cVarD, (u00.a) objN6, rVarC10, (u00.n) null, false, (w3) null, (n1) null, g0Var2, 390, 504);
                                g0Var3.r(false);
                            } else {
                                g0Var3.c0(-1414027944);
                                g0Var3.r(false);
                            }
                            if (z16) {
                                g0Var3.c0(-1413921924);
                                b2.r rVarC11 = h0.c.C(oVar, 0);
                                v1.c cVar2 = k.g;
                                u00.a aVar16 = aVar12;
                                boolean zG3 = g0Var3.g(aVar16);
                                Object objN7 = g0Var3.N();
                                if (zG3 || objN7 == obj5) {
                                    objN7 = new fz.d(aVar16, z0Var2, 3);
                                    g0Var3.n0(objN7);
                                }
                                g1.m.b(cVar2, (u00.a) objN7, rVarC11, (u00.n) null, false, (w3) null, (n1) null, g0Var2, 390, 504);
                                g0Var3.r(false);
                            } else {
                                g0Var3.c0(-1412128264);
                                g0Var3.r(false);
                            }
                        } else {
                            g0Var3.V();
                        }
                        return g00.b0.a;
                    }
                }, g0Var), g0Var, 100663344, 240);
                g0Var.r(true);
                aVar5 = aVar12;
                rVar3 = rVar8;
                f6 = f7;
                i21 = i24;
                z6 = z15;
                j3 = j12;
            } else {
                g0Var.V();
                i21 = i;
                rVar3 = rVar2;
                j3 = j2;
                aVar4 = aVar2;
                f5 = f3;
                aVar5 = aVar3;
                f6 = f4;
                z6 = z3;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iK = l1.q.K(i2 | 1);
                        int iK2 = l1.q.K(i3);
                        k.u(z, onToggleFavorites, rVar3, f6, j3, z4, aVar5, i21, z6, aVar4, f5, (l1.j) obj2, iK, iK2, i4);
                        return g00.b0.a;
                    }
                };
            }
        }
        i5 |= 384;
        rVar2 = rVar;
        i6 = i4 & 8;
        if (i6 != 0) {
            if ((i2 & 3072) == 0) {
                f4 = f2;
                if (g0Var.d(f4)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i5 |= i7;
            }
            if ((i2 & 24576) == 0) {
                if ((i4 & 16) == 0) {
                    j2 = j;
                    if (g0Var.f(j2)) {
                    }
                    i5 |= i26;
                } else {
                    j2 = j;
                }
                i5 |= i26;
            } else {
                j2 = j;
            }
            i8 = i4 & 32;
            if (i8 != 0) {
                i5 |= 196608;
                z4 = z2;
            } else {
                z4 = z2;
                if ((i2 & 196608) == 0) {
                    if (g0Var.h(z4)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i5 |= i9;
                }
            }
            i11 = i4 & 64;
            if (i11 != 0) {
                i5 |= 1572864;
                aVar3 = aVar;
            } else {
                aVar3 = aVar;
                if ((i2 & 1572864) == 0) {
                    if (g0Var.i(aVar3)) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                    i5 |= i12;
                }
            }
            if ((i2 & 12582912) == 0) {
                i5 |= 4194304;
            }
            i13 = i4 & 256;
            if (i13 != 0) {
                i5 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (g0Var.h(z3)) {
                    i14 = 67108864;
                } else {
                    i14 = 33554432;
                }
                i5 |= i14;
            }
            i15 = i4 & 512;
            if (i15 != 0) {
                if ((i2 & 805306368) == 0) {
                    if (g0Var.i(aVar2)) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i5 |= i16;
                }
                i17 = i4 & 1024;
                if (i17 != 0) {
                    i18 = 6;
                } else if ((i3 & 6) == 0) {
                    if (g0Var.d(f3)) {
                        i19 = 4;
                    } else {
                        i19 = 2;
                    }
                    i18 = i3 | i19;
                } else {
                    i18 = i3;
                }
                if ((i5 & 306783379) == 306783378) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                if (g0Var.S(i5 & 1, z5)) {
                    g0Var.X();
                    i22 = i2 & 1;
                    rVar4 = b2.o.A;
                    obj = l1.i.a;
                    if (i22 != 0) {
                        if (i25 != 0) {
                            rVar2 = rVar4;
                        }
                        if (i6 != 0) {
                            f7 = 24;
                        } else {
                            f7 = f4;
                        }
                        if ((i4 & 16) != 0) {
                            j4 = dl.a.i;
                            i5 &= -57345;
                        } else {
                            j4 = j2;
                        }
                        if (i8 != 0) {
                            z4 = false;
                        }
                        if (i11 != 0) {
                            objN = g0Var.N();
                            if (objN == obj) {
                                objN = new a2.f(24);
                                g0Var.n0(objN);
                            }
                            aVar3 = (u00.a) objN;
                        }
                        int i215 = i5 & (-29360129);
                        if (i13 != 0) {
                            z7 = true;
                        } else {
                            z7 = z3;
                        }
                        if (i15 != 0) {
                            aVar4 = null;
                        } else {
                            aVar4 = aVar2;
                        }
                        if (i17 != 0) {
                            f5 = 0;
                        } else {
                            f5 = f3;
                        }
                        i23 = i215;
                        i24 = 2131231396;
                    } else {
                        if (i25 != 0) {
                            rVar2 = rVar4;
                        }
                        if (i6 != 0) {
                            f7 = 24;
                        } else {
                            f7 = f4;
                        }
                        if ((i4 & 16) != 0) {
                            j4 = dl.a.i;
                            i5 &= -57345;
                        } else {
                            j4 = j2;
                        }
                        if (i8 != 0) {
                            z4 = false;
                        }
                        if (i11 != 0) {
                            objN = g0Var.N();
                            if (objN == obj) {
                                objN = new a2.f(24);
                                g0Var.n0(objN);
                            }
                            aVar3 = (u00.a) objN;
                        }
                        int i216 = i5 & (-29360129);
                        if (i13 != 0) {
                            z7 = true;
                        } else {
                            z7 = z3;
                        }
                        if (i15 != 0) {
                            aVar4 = null;
                        } else {
                            aVar4 = aVar2;
                        }
                        if (i17 != 0) {
                            f5 = 0;
                        } else {
                            f5 = f3;
                        }
                        i23 = i216;
                        i24 = 2131231396;
                    }
                    g0Var.s();
                    final u00.a aVar14 = aVar3;
                    objN2 = g0Var.N();
                    if (objN2 == obj) {
                        objN2 = l1.q.z(Boolean.FALSE);
                        g0Var.n0(objN2);
                    }
                    z0Var = (z0) objN2;
                    final boolean z17 = z7;
                    final boolean z18 = z4;
                    w0 w0VarD5 = h0.o.d(b2.b.A, false);
                    long j14 = j4;
                    int iHashCode5 = Long.hashCode(g0Var.T);
                    m1 m1VarM5 = g0Var.m();
                    b2.r rVarC9 = b2.a.c(rVar2, g0Var);
                    b3.i.c.getClass();
                    gVar = b3.h.b;
                    g0Var.g0();
                    b2.r rVar9 = rVar2;
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(w0VarD5, g0Var, b3.h.f);
                    l1.q.I(m1VarM5, g0Var, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode5), g0Var, b3.h.g);
                    l1.q.E(g0Var, b3.h.h);
                    l1.q.I(rVarC9, g0Var, b3.h.d);
                    b2.r rVarC10 = f2.h.c(h0.c.C(z1.m(rVar4, f7), 4), p0.f.a);
                    objN3 = g0Var.N();
                    if (objN3 == obj) {
                        objN3 = new ct.k(z0Var, 28);
                        g0Var.n0(objN3);
                    }
                    z3.j(y3.R(i24, g0Var, 0), (String) null, h0.c.C(w50.c.n(rVarC10, true, (u00.a) objN3), f5), j14, g0Var, ((i23 >> 3) & 7168) | 56, 0);
                    boolean zBooleanValue5 = ((Boolean) z0Var.getValue()).booleanValue();
                    long j15 = dl.a.K;
                    p0.e eVarA5 = p0.f.a(16);
                    objN4 = g0Var.N();
                    if (objN4 == obj) {
                        objN4 = new ct.k(z0Var, 29);
                        g0Var.n0(objN4);
                    }
                    final u00.a aVar15 = aVar4;
                    z4 = z18;
                    jl.c.b(zBooleanValue5, (u00.a) objN4, j15, eVarA5, null, 0L, false, null, v1.d.d(-1418247478, new u00.o() {
                        @Override
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            h0.w DropdownMenuNoPaddingVertical = (h0.w) obj2;
                            l1.g0 g0Var2 = (l1.j) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            kotlin.jvm.internal.m.e(DropdownMenuNoPaddingVertical, "$this$DropdownMenuNoPaddingVertical");
                            l1.g0 g0Var3 = g0Var2;
                            if (g0Var3.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                b2.o oVar = b2.o.A;
                                u00.a aVar16 = aVar15;
                                z0 z0Var2 = z0Var;
                                Object obj5 = l1.i.a;
                                if (aVar16 != null) {
                                    g0Var3.c0(-1417225222);
                                    b2.r rVarC11 = h0.c.C(oVar, 0);
                                    v1.c cVar = k.f;
                                    boolean zG = g0Var3.g(aVar16);
                                    Object objN5 = g0Var3.N();
                                    if (zG || objN5 == obj5) {
                                        objN5 = new fz.d(aVar16, z0Var2, 1);
                                        g0Var3.n0(objN5);
                                    }
                                    g1.m.b(cVar, (u00.a) objN5, rVarC11, (u00.n) null, false, (w3) null, (n1) null, g0Var2, 390, 504);
                                    g0Var3.r(false);
                                } else {
                                    g0Var3.c0(-1415921672);
                                    g0Var3.r(false);
                                }
                                if (z17) {
                                    g0Var3.c0(-1415810072);
                                    b2.r rVarC12 = h0.c.C(oVar, 0);
                                    v1.c cVarD = v1.d.d(254697068, new iv.p(z), g0Var2);
                                    u00.a aVar17 = onToggleFavorites;
                                    boolean zG2 = g0Var3.g(aVar17);
                                    Object objN6 = g0Var3.N();
                                    if (zG2 || objN6 == obj5) {
                                        objN6 = new fz.d(aVar17, z0Var2, 2);
                                        g0Var3.n0(objN6);
                                    }
                                    g1.m.b(cVarD, (u00.a) objN6, rVarC12, (u00.n) null, false, (w3) null, (n1) null, g0Var2, 390, 504);
                                    g0Var3.r(false);
                                } else {
                                    g0Var3.c0(-1414027944);
                                    g0Var3.r(false);
                                }
                                if (z18) {
                                    g0Var3.c0(-1413921924);
                                    b2.r rVarC13 = h0.c.C(oVar, 0);
                                    v1.c cVar2 = k.g;
                                    u00.a aVar18 = aVar14;
                                    boolean zG3 = g0Var3.g(aVar18);
                                    Object objN7 = g0Var3.N();
                                    if (zG3 || objN7 == obj5) {
                                        objN7 = new fz.d(aVar18, z0Var2, 3);
                                        g0Var3.n0(objN7);
                                    }
                                    g1.m.b(cVar2, (u00.a) objN7, rVarC13, (u00.n) null, false, (w3) null, (n1) null, g0Var2, 390, 504);
                                    g0Var3.r(false);
                                } else {
                                    g0Var3.c0(-1412128264);
                                    g0Var3.r(false);
                                }
                            } else {
                                g0Var3.V();
                            }
                            return g00.b0.a;
                        }
                    }, g0Var), g0Var, 100663344, 240);
                    g0Var.r(true);
                    aVar5 = aVar14;
                    rVar3 = rVar9;
                    f6 = f7;
                    i21 = i24;
                    z6 = z17;
                    j3 = j14;
                } else {
                    g0Var.V();
                    i21 = i;
                    rVar3 = rVar2;
                    j3 = j2;
                    aVar4 = aVar2;
                    f5 = f3;
                    aVar5 = aVar3;
                    f6 = f4;
                    z6 = z3;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.d = new u00.n() {
                        @Override
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            int iK = l1.q.K(i2 | 1);
                            int iK2 = l1.q.K(i3);
                            k.u(z, onToggleFavorites, rVar3, f6, j3, z4, aVar5, i21, z6, aVar4, f5, (l1.j) obj2, iK, iK2, i4);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i5 |= 805306368;
            i17 = i4 & 1024;
            if (i17 != 0) {
                i18 = 6;
            } else if ((i3 & 6) == 0) {
                if (g0Var.d(f3)) {
                    i19 = 4;
                } else {
                    i19 = 2;
                }
                i18 = i3 | i19;
            } else {
                i18 = i3;
            }
            if ((i5 & 306783379) == 306783378) {
                z5 = true;
            } else {
                z5 = true;
            }
            if (g0Var.S(i5 & 1, z5)) {
                g0Var.X();
                i22 = i2 & 1;
                rVar4 = b2.o.A;
                obj = l1.i.a;
                if (i22 != 0) {
                    if (i25 != 0) {
                        rVar2 = rVar4;
                    }
                    if (i6 != 0) {
                        f7 = 24;
                    } else {
                        f7 = f4;
                    }
                    if ((i4 & 16) != 0) {
                        j4 = dl.a.i;
                        i5 &= -57345;
                    } else {
                        j4 = j2;
                    }
                    if (i8 != 0) {
                        z4 = false;
                    }
                    if (i11 != 0) {
                        objN = g0Var.N();
                        if (objN == obj) {
                            objN = new a2.f(24);
                            g0Var.n0(objN);
                        }
                        aVar3 = (u00.a) objN;
                    }
                    int i217 = i5 & (-29360129);
                    if (i13 != 0) {
                        z7 = true;
                    } else {
                        z7 = z3;
                    }
                    if (i15 != 0) {
                        aVar4 = null;
                    } else {
                        aVar4 = aVar2;
                    }
                    if (i17 != 0) {
                        f5 = 0;
                    } else {
                        f5 = f3;
                    }
                    i23 = i217;
                    i24 = 2131231396;
                } else {
                    if (i25 != 0) {
                        rVar2 = rVar4;
                    }
                    if (i6 != 0) {
                        f7 = 24;
                    } else {
                        f7 = f4;
                    }
                    if ((i4 & 16) != 0) {
                        j4 = dl.a.i;
                        i5 &= -57345;
                    } else {
                        j4 = j2;
                    }
                    if (i8 != 0) {
                        z4 = false;
                    }
                    if (i11 != 0) {
                        objN = g0Var.N();
                        if (objN == obj) {
                            objN = new a2.f(24);
                            g0Var.n0(objN);
                        }
                        aVar3 = (u00.a) objN;
                    }
                    int i218 = i5 & (-29360129);
                    if (i13 != 0) {
                        z7 = true;
                    } else {
                        z7 = z3;
                    }
                    if (i15 != 0) {
                        aVar4 = null;
                    } else {
                        aVar4 = aVar2;
                    }
                    if (i17 != 0) {
                        f5 = 0;
                    } else {
                        f5 = f3;
                    }
                    i23 = i218;
                    i24 = 2131231396;
                }
                g0Var.s();
                final u00.a aVar16 = aVar3;
                objN2 = g0Var.N();
                if (objN2 == obj) {
                    objN2 = l1.q.z(Boolean.FALSE);
                    g0Var.n0(objN2);
                }
                z0Var = (z0) objN2;
                final boolean z19 = z7;
                final boolean z110 = z4;
                w0 w0VarD6 = h0.o.d(b2.b.A, false);
                long j16 = j4;
                int iHashCode6 = Long.hashCode(g0Var.T);
                m1 m1VarM6 = g0Var.m();
                b2.r rVarC11 = b2.a.c(rVar2, g0Var);
                b3.i.c.getClass();
                gVar = b3.h.b;
                g0Var.g0();
                b2.r rVar10 = rVar2;
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(w0VarD6, g0Var, b3.h.f);
                l1.q.I(m1VarM6, g0Var, b3.h.e);
                l1.q.I(Integer.valueOf(iHashCode6), g0Var, b3.h.g);
                l1.q.E(g0Var, b3.h.h);
                l1.q.I(rVarC11, g0Var, b3.h.d);
                b2.r rVarC12 = f2.h.c(h0.c.C(z1.m(rVar4, f7), 4), p0.f.a);
                objN3 = g0Var.N();
                if (objN3 == obj) {
                    objN3 = new ct.k(z0Var, 28);
                    g0Var.n0(objN3);
                }
                z3.j(y3.R(i24, g0Var, 0), (String) null, h0.c.C(w50.c.n(rVarC12, true, (u00.a) objN3), f5), j16, g0Var, ((i23 >> 3) & 7168) | 56, 0);
                boolean zBooleanValue6 = ((Boolean) z0Var.getValue()).booleanValue();
                long j17 = dl.a.K;
                p0.e eVarA6 = p0.f.a(16);
                objN4 = g0Var.N();
                if (objN4 == obj) {
                    objN4 = new ct.k(z0Var, 29);
                    g0Var.n0(objN4);
                }
                final u00.a aVar17 = aVar4;
                z4 = z110;
                jl.c.b(zBooleanValue6, (u00.a) objN4, j17, eVarA6, null, 0L, false, null, v1.d.d(-1418247478, new u00.o() {
                    @Override
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        h0.w DropdownMenuNoPaddingVertical = (h0.w) obj2;
                        l1.g0 g0Var2 = (l1.j) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        kotlin.jvm.internal.m.e(DropdownMenuNoPaddingVertical, "$this$DropdownMenuNoPaddingVertical");
                        l1.g0 g0Var3 = g0Var2;
                        if (g0Var3.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                            b2.o oVar = b2.o.A;
                            u00.a aVar18 = aVar17;
                            z0 z0Var2 = z0Var;
                            Object obj5 = l1.i.a;
                            if (aVar18 != null) {
                                g0Var3.c0(-1417225222);
                                b2.r rVarC13 = h0.c.C(oVar, 0);
                                v1.c cVar = k.f;
                                boolean zG = g0Var3.g(aVar18);
                                Object objN5 = g0Var3.N();
                                if (zG || objN5 == obj5) {
                                    objN5 = new fz.d(aVar18, z0Var2, 1);
                                    g0Var3.n0(objN5);
                                }
                                g1.m.b(cVar, (u00.a) objN5, rVarC13, (u00.n) null, false, (w3) null, (n1) null, g0Var2, 390, 504);
                                g0Var3.r(false);
                            } else {
                                g0Var3.c0(-1415921672);
                                g0Var3.r(false);
                            }
                            if (z19) {
                                g0Var3.c0(-1415810072);
                                b2.r rVarC14 = h0.c.C(oVar, 0);
                                v1.c cVarD = v1.d.d(254697068, new iv.p(z), g0Var2);
                                u00.a aVar19 = onToggleFavorites;
                                boolean zG2 = g0Var3.g(aVar19);
                                Object objN6 = g0Var3.N();
                                if (zG2 || objN6 == obj5) {
                                    objN6 = new fz.d(aVar19, z0Var2, 2);
                                    g0Var3.n0(objN6);
                                }
                                g1.m.b(cVarD, (u00.a) objN6, rVarC14, (u00.n) null, false, (w3) null, (n1) null, g0Var2, 390, 504);
                                g0Var3.r(false);
                            } else {
                                g0Var3.c0(-1414027944);
                                g0Var3.r(false);
                            }
                            if (z110) {
                                g0Var3.c0(-1413921924);
                                b2.r rVarC15 = h0.c.C(oVar, 0);
                                v1.c cVar2 = k.g;
                                u00.a aVar110 = aVar16;
                                boolean zG3 = g0Var3.g(aVar110);
                                Object objN7 = g0Var3.N();
                                if (zG3 || objN7 == obj5) {
                                    objN7 = new fz.d(aVar110, z0Var2, 3);
                                    g0Var3.n0(objN7);
                                }
                                g1.m.b(cVar2, (u00.a) objN7, rVarC15, (u00.n) null, false, (w3) null, (n1) null, g0Var2, 390, 504);
                                g0Var3.r(false);
                            } else {
                                g0Var3.c0(-1412128264);
                                g0Var3.r(false);
                            }
                        } else {
                            g0Var3.V();
                        }
                        return g00.b0.a;
                    }
                }, g0Var), g0Var, 100663344, 240);
                g0Var.r(true);
                aVar5 = aVar16;
                rVar3 = rVar10;
                f6 = f7;
                i21 = i24;
                z6 = z19;
                j3 = j16;
            } else {
                g0Var.V();
                i21 = i;
                rVar3 = rVar2;
                j3 = j2;
                aVar4 = aVar2;
                f5 = f3;
                aVar5 = aVar3;
                f6 = f4;
                z6 = z3;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iK = l1.q.K(i2 | 1);
                        int iK2 = l1.q.K(i3);
                        k.u(z, onToggleFavorites, rVar3, f6, j3, z4, aVar5, i21, z6, aVar4, f5, (l1.j) obj2, iK, iK2, i4);
                        return g00.b0.a;
                    }
                };
            }
        }
        i5 |= 3072;
        f4 = f2;
        if ((i2 & 24576) == 0) {
            if ((i4 & 16) == 0) {
                j2 = j;
                if (g0Var.f(j2)) {
                }
                i5 |= i26;
            } else {
                j2 = j;
            }
            i5 |= i26;
        } else {
            j2 = j;
        }
        i8 = i4 & 32;
        if (i8 != 0) {
            i5 |= 196608;
            z4 = z2;
        } else {
            z4 = z2;
            if ((i2 & 196608) == 0) {
                if (g0Var.h(z4)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i5 |= i9;
            }
        }
        i11 = i4 & 64;
        if (i11 != 0) {
            i5 |= 1572864;
            aVar3 = aVar;
        } else {
            aVar3 = aVar;
            if ((i2 & 1572864) == 0) {
                if (g0Var.i(aVar3)) {
                    i12 = 1048576;
                } else {
                    i12 = 524288;
                }
                i5 |= i12;
            }
        }
        if ((i2 & 12582912) == 0) {
            i5 |= 4194304;
        }
        i13 = i4 & 256;
        if (i13 != 0) {
            i5 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            if (g0Var.h(z3)) {
                i14 = 67108864;
            } else {
                i14 = 33554432;
            }
            i5 |= i14;
        }
        i15 = i4 & 512;
        if (i15 != 0) {
            if ((i2 & 805306368) == 0) {
                if (g0Var.i(aVar2)) {
                    i16 = 536870912;
                } else {
                    i16 = 268435456;
                }
                i5 |= i16;
            }
            i17 = i4 & 1024;
            if (i17 != 0) {
                i18 = 6;
            } else if ((i3 & 6) == 0) {
                if (g0Var.d(f3)) {
                    i19 = 4;
                } else {
                    i19 = 2;
                }
                i18 = i3 | i19;
            } else {
                i18 = i3;
            }
            if ((i5 & 306783379) == 306783378) {
                z5 = true;
            } else {
                z5 = true;
            }
            if (g0Var.S(i5 & 1, z5)) {
                g0Var.X();
                i22 = i2 & 1;
                rVar4 = b2.o.A;
                obj = l1.i.a;
                if (i22 != 0) {
                    if (i25 != 0) {
                        rVar2 = rVar4;
                    }
                    if (i6 != 0) {
                        f7 = 24;
                    } else {
                        f7 = f4;
                    }
                    if ((i4 & 16) != 0) {
                        j4 = dl.a.i;
                        i5 &= -57345;
                    } else {
                        j4 = j2;
                    }
                    if (i8 != 0) {
                        z4 = false;
                    }
                    if (i11 != 0) {
                        objN = g0Var.N();
                        if (objN == obj) {
                            objN = new a2.f(24);
                            g0Var.n0(objN);
                        }
                        aVar3 = (u00.a) objN;
                    }
                    int i219 = i5 & (-29360129);
                    if (i13 != 0) {
                        z7 = true;
                    } else {
                        z7 = z3;
                    }
                    if (i15 != 0) {
                        aVar4 = null;
                    } else {
                        aVar4 = aVar2;
                    }
                    if (i17 != 0) {
                        f5 = 0;
                    } else {
                        f5 = f3;
                    }
                    i23 = i219;
                    i24 = 2131231396;
                } else {
                    if (i25 != 0) {
                        rVar2 = rVar4;
                    }
                    if (i6 != 0) {
                        f7 = 24;
                    } else {
                        f7 = f4;
                    }
                    if ((i4 & 16) != 0) {
                        j4 = dl.a.i;
                        i5 &= -57345;
                    } else {
                        j4 = j2;
                    }
                    if (i8 != 0) {
                        z4 = false;
                    }
                    if (i11 != 0) {
                        objN = g0Var.N();
                        if (objN == obj) {
                            objN = new a2.f(24);
                            g0Var.n0(objN);
                        }
                        aVar3 = (u00.a) objN;
                    }
                    int i2110 = i5 & (-29360129);
                    if (i13 != 0) {
                        z7 = true;
                    } else {
                        z7 = z3;
                    }
                    if (i15 != 0) {
                        aVar4 = null;
                    } else {
                        aVar4 = aVar2;
                    }
                    if (i17 != 0) {
                        f5 = 0;
                    } else {
                        f5 = f3;
                    }
                    i23 = i2110;
                    i24 = 2131231396;
                }
                g0Var.s();
                final u00.a aVar18 = aVar3;
                objN2 = g0Var.N();
                if (objN2 == obj) {
                    objN2 = l1.q.z(Boolean.FALSE);
                    g0Var.n0(objN2);
                }
                z0Var = (z0) objN2;
                final boolean z111 = z7;
                final boolean z112 = z4;
                w0 w0VarD7 = h0.o.d(b2.b.A, false);
                long j18 = j4;
                int iHashCode7 = Long.hashCode(g0Var.T);
                m1 m1VarM7 = g0Var.m();
                b2.r rVarC13 = b2.a.c(rVar2, g0Var);
                b3.i.c.getClass();
                gVar = b3.h.b;
                g0Var.g0();
                b2.r rVar11 = rVar2;
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(w0VarD7, g0Var, b3.h.f);
                l1.q.I(m1VarM7, g0Var, b3.h.e);
                l1.q.I(Integer.valueOf(iHashCode7), g0Var, b3.h.g);
                l1.q.E(g0Var, b3.h.h);
                l1.q.I(rVarC13, g0Var, b3.h.d);
                b2.r rVarC14 = f2.h.c(h0.c.C(z1.m(rVar4, f7), 4), p0.f.a);
                objN3 = g0Var.N();
                if (objN3 == obj) {
                    objN3 = new ct.k(z0Var, 28);
                    g0Var.n0(objN3);
                }
                z3.j(y3.R(i24, g0Var, 0), (String) null, h0.c.C(w50.c.n(rVarC14, true, (u00.a) objN3), f5), j18, g0Var, ((i23 >> 3) & 7168) | 56, 0);
                boolean zBooleanValue7 = ((Boolean) z0Var.getValue()).booleanValue();
                long j19 = dl.a.K;
                p0.e eVarA7 = p0.f.a(16);
                objN4 = g0Var.N();
                if (objN4 == obj) {
                    objN4 = new ct.k(z0Var, 29);
                    g0Var.n0(objN4);
                }
                final u00.a aVar19 = aVar4;
                z4 = z112;
                jl.c.b(zBooleanValue7, (u00.a) objN4, j19, eVarA7, null, 0L, false, null, v1.d.d(-1418247478, new u00.o() {
                    @Override
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        h0.w DropdownMenuNoPaddingVertical = (h0.w) obj2;
                        l1.g0 g0Var2 = (l1.j) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        kotlin.jvm.internal.m.e(DropdownMenuNoPaddingVertical, "$this$DropdownMenuNoPaddingVertical");
                        l1.g0 g0Var3 = g0Var2;
                        if (g0Var3.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                            b2.o oVar = b2.o.A;
                            u00.a aVar110 = aVar19;
                            z0 z0Var2 = z0Var;
                            Object obj5 = l1.i.a;
                            if (aVar110 != null) {
                                g0Var3.c0(-1417225222);
                                b2.r rVarC15 = h0.c.C(oVar, 0);
                                v1.c cVar = k.f;
                                boolean zG = g0Var3.g(aVar110);
                                Object objN5 = g0Var3.N();
                                if (zG || objN5 == obj5) {
                                    objN5 = new fz.d(aVar110, z0Var2, 1);
                                    g0Var3.n0(objN5);
                                }
                                g1.m.b(cVar, (u00.a) objN5, rVarC15, (u00.n) null, false, (w3) null, (n1) null, g0Var2, 390, 504);
                                g0Var3.r(false);
                            } else {
                                g0Var3.c0(-1415921672);
                                g0Var3.r(false);
                            }
                            if (z111) {
                                g0Var3.c0(-1415810072);
                                b2.r rVarC16 = h0.c.C(oVar, 0);
                                v1.c cVarD = v1.d.d(254697068, new iv.p(z), g0Var2);
                                u00.a aVar111 = onToggleFavorites;
                                boolean zG2 = g0Var3.g(aVar111);
                                Object objN6 = g0Var3.N();
                                if (zG2 || objN6 == obj5) {
                                    objN6 = new fz.d(aVar111, z0Var2, 2);
                                    g0Var3.n0(objN6);
                                }
                                g1.m.b(cVarD, (u00.a) objN6, rVarC16, (u00.n) null, false, (w3) null, (n1) null, g0Var2, 390, 504);
                                g0Var3.r(false);
                            } else {
                                g0Var3.c0(-1414027944);
                                g0Var3.r(false);
                            }
                            if (z112) {
                                g0Var3.c0(-1413921924);
                                b2.r rVarC17 = h0.c.C(oVar, 0);
                                v1.c cVar2 = k.g;
                                u00.a aVar112 = aVar18;
                                boolean zG3 = g0Var3.g(aVar112);
                                Object objN7 = g0Var3.N();
                                if (zG3 || objN7 == obj5) {
                                    objN7 = new fz.d(aVar112, z0Var2, 3);
                                    g0Var3.n0(objN7);
                                }
                                g1.m.b(cVar2, (u00.a) objN7, rVarC17, (u00.n) null, false, (w3) null, (n1) null, g0Var2, 390, 504);
                                g0Var3.r(false);
                            } else {
                                g0Var3.c0(-1412128264);
                                g0Var3.r(false);
                            }
                        } else {
                            g0Var3.V();
                        }
                        return g00.b0.a;
                    }
                }, g0Var), g0Var, 100663344, 240);
                g0Var.r(true);
                aVar5 = aVar18;
                rVar3 = rVar11;
                f6 = f7;
                i21 = i24;
                z6 = z111;
                j3 = j18;
            } else {
                g0Var.V();
                i21 = i;
                rVar3 = rVar2;
                j3 = j2;
                aVar4 = aVar2;
                f5 = f3;
                aVar5 = aVar3;
                f6 = f4;
                z6 = z3;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iK = l1.q.K(i2 | 1);
                        int iK2 = l1.q.K(i3);
                        k.u(z, onToggleFavorites, rVar3, f6, j3, z4, aVar5, i21, z6, aVar4, f5, (l1.j) obj2, iK, iK2, i4);
                        return g00.b0.a;
                    }
                };
            }
        }
        i5 |= 805306368;
        i17 = i4 & 1024;
        if (i17 != 0) {
            i18 = 6;
        } else if ((i3 & 6) == 0) {
            if (g0Var.d(f3)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i18 = i3 | i19;
        } else {
            i18 = i3;
        }
        if ((i5 & 306783379) == 306783378) {
            z5 = true;
        } else {
            z5 = true;
        }
        if (g0Var.S(i5 & 1, z5)) {
            g0Var.X();
            i22 = i2 & 1;
            rVar4 = b2.o.A;
            obj = l1.i.a;
            if (i22 != 0) {
                if (i25 != 0) {
                    rVar2 = rVar4;
                }
                if (i6 != 0) {
                    f7 = 24;
                } else {
                    f7 = f4;
                }
                if ((i4 & 16) != 0) {
                    j4 = dl.a.i;
                    i5 &= -57345;
                } else {
                    j4 = j2;
                }
                if (i8 != 0) {
                    z4 = false;
                }
                if (i11 != 0) {
                    objN = g0Var.N();
                    if (objN == obj) {
                        objN = new a2.f(24);
                        g0Var.n0(objN);
                    }
                    aVar3 = (u00.a) objN;
                }
                int i2111 = i5 & (-29360129);
                if (i13 != 0) {
                    z7 = true;
                } else {
                    z7 = z3;
                }
                if (i15 != 0) {
                    aVar4 = null;
                } else {
                    aVar4 = aVar2;
                }
                if (i17 != 0) {
                    f5 = 0;
                } else {
                    f5 = f3;
                }
                i23 = i2111;
                i24 = 2131231396;
            } else {
                if (i25 != 0) {
                    rVar2 = rVar4;
                }
                if (i6 != 0) {
                    f7 = 24;
                } else {
                    f7 = f4;
                }
                if ((i4 & 16) != 0) {
                    j4 = dl.a.i;
                    i5 &= -57345;
                } else {
                    j4 = j2;
                }
                if (i8 != 0) {
                    z4 = false;
                }
                if (i11 != 0) {
                    objN = g0Var.N();
                    if (objN == obj) {
                        objN = new a2.f(24);
                        g0Var.n0(objN);
                    }
                    aVar3 = (u00.a) objN;
                }
                int i2112 = i5 & (-29360129);
                if (i13 != 0) {
                    z7 = true;
                } else {
                    z7 = z3;
                }
                if (i15 != 0) {
                    aVar4 = null;
                } else {
                    aVar4 = aVar2;
                }
                if (i17 != 0) {
                    f5 = 0;
                } else {
                    f5 = f3;
                }
                i23 = i2112;
                i24 = 2131231396;
            }
            g0Var.s();
            final u00.a aVar110 = aVar3;
            objN2 = g0Var.N();
            if (objN2 == obj) {
                objN2 = l1.q.z(Boolean.FALSE);
                g0Var.n0(objN2);
            }
            z0Var = (z0) objN2;
            final boolean z113 = z7;
            final boolean z114 = z4;
            w0 w0VarD8 = h0.o.d(b2.b.A, false);
            long j110 = j4;
            int iHashCode8 = Long.hashCode(g0Var.T);
            m1 m1VarM8 = g0Var.m();
            b2.r rVarC15 = b2.a.c(rVar2, g0Var);
            b3.i.c.getClass();
            gVar = b3.h.b;
            g0Var.g0();
            b2.r rVar12 = rVar2;
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD8, g0Var, b3.h.f);
            l1.q.I(m1VarM8, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode8), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC15, g0Var, b3.h.d);
            b2.r rVarC16 = f2.h.c(h0.c.C(z1.m(rVar4, f7), 4), p0.f.a);
            objN3 = g0Var.N();
            if (objN3 == obj) {
                objN3 = new ct.k(z0Var, 28);
                g0Var.n0(objN3);
            }
            z3.j(y3.R(i24, g0Var, 0), (String) null, h0.c.C(w50.c.n(rVarC16, true, (u00.a) objN3), f5), j110, g0Var, ((i23 >> 3) & 7168) | 56, 0);
            boolean zBooleanValue8 = ((Boolean) z0Var.getValue()).booleanValue();
            long j111 = dl.a.K;
            p0.e eVarA8 = p0.f.a(16);
            objN4 = g0Var.N();
            if (objN4 == obj) {
                objN4 = new ct.k(z0Var, 29);
                g0Var.n0(objN4);
            }
            final u00.a aVar111 = aVar4;
            z4 = z114;
            jl.c.b(zBooleanValue8, (u00.a) objN4, j111, eVarA8, null, 0L, false, null, v1.d.d(-1418247478, new u00.o() {
                @Override
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    h0.w DropdownMenuNoPaddingVertical = (h0.w) obj2;
                    l1.g0 g0Var2 = (l1.j) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    kotlin.jvm.internal.m.e(DropdownMenuNoPaddingVertical, "$this$DropdownMenuNoPaddingVertical");
                    l1.g0 g0Var3 = g0Var2;
                    if (g0Var3.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                        b2.o oVar = b2.o.A;
                        u00.a aVar112 = aVar111;
                        z0 z0Var2 = z0Var;
                        Object obj5 = l1.i.a;
                        if (aVar112 != null) {
                            g0Var3.c0(-1417225222);
                            b2.r rVarC17 = h0.c.C(oVar, 0);
                            v1.c cVar = k.f;
                            boolean zG = g0Var3.g(aVar112);
                            Object objN5 = g0Var3.N();
                            if (zG || objN5 == obj5) {
                                objN5 = new fz.d(aVar112, z0Var2, 1);
                                g0Var3.n0(objN5);
                            }
                            g1.m.b(cVar, (u00.a) objN5, rVarC17, (u00.n) null, false, (w3) null, (n1) null, g0Var2, 390, 504);
                            g0Var3.r(false);
                        } else {
                            g0Var3.c0(-1415921672);
                            g0Var3.r(false);
                        }
                        if (z113) {
                            g0Var3.c0(-1415810072);
                            b2.r rVarC18 = h0.c.C(oVar, 0);
                            v1.c cVarD = v1.d.d(254697068, new iv.p(z), g0Var2);
                            u00.a aVar113 = onToggleFavorites;
                            boolean zG2 = g0Var3.g(aVar113);
                            Object objN6 = g0Var3.N();
                            if (zG2 || objN6 == obj5) {
                                objN6 = new fz.d(aVar113, z0Var2, 2);
                                g0Var3.n0(objN6);
                            }
                            g1.m.b(cVarD, (u00.a) objN6, rVarC18, (u00.n) null, false, (w3) null, (n1) null, g0Var2, 390, 504);
                            g0Var3.r(false);
                        } else {
                            g0Var3.c0(-1414027944);
                            g0Var3.r(false);
                        }
                        if (z114) {
                            g0Var3.c0(-1413921924);
                            b2.r rVarC19 = h0.c.C(oVar, 0);
                            v1.c cVar2 = k.g;
                            u00.a aVar114 = aVar110;
                            boolean zG3 = g0Var3.g(aVar114);
                            Object objN7 = g0Var3.N();
                            if (zG3 || objN7 == obj5) {
                                objN7 = new fz.d(aVar114, z0Var2, 3);
                                g0Var3.n0(objN7);
                            }
                            g1.m.b(cVar2, (u00.a) objN7, rVarC19, (u00.n) null, false, (w3) null, (n1) null, g0Var2, 390, 504);
                            g0Var3.r(false);
                        } else {
                            g0Var3.c0(-1412128264);
                            g0Var3.r(false);
                        }
                    } else {
                        g0Var3.V();
                    }
                    return g00.b0.a;
                }
            }, g0Var), g0Var, 100663344, 240);
            g0Var.r(true);
            aVar5 = aVar110;
            rVar3 = rVar12;
            f6 = f7;
            i21 = i24;
            z6 = z113;
            j3 = j110;
        } else {
            g0Var.V();
            i21 = i;
            rVar3 = rVar2;
            j3 = j2;
            aVar4 = aVar2;
            f5 = f3;
            aVar5 = aVar3;
            f6 = f4;
            z6 = z3;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iK = l1.q.K(i2 | 1);
                    int iK2 = l1.q.K(i3);
                    k.u(z, onToggleFavorites, rVar3, f6, j3, z4, aVar5, i21, z6, aVar4, f5, (l1.j) obj2, iK, iK2, i4);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void v(int i, b2.r rVar, PlayerItem playerItem, l1.j jVar, u00.k onPlayerItemClicked, u00.k onToggleFavorites, u00.k onDeleteClicked, u30.b favoriteIds, u30.b playerItems, u30.b downloadedSurahIds, boolean z, boolean z2) {
        kotlin.jvm.internal.m.e(favoriteIds, "favoriteIds");
        kotlin.jvm.internal.m.e(playerItems, "playerItems");
        kotlin.jvm.internal.m.e(onPlayerItemClicked, "onPlayerItemClicked");
        kotlin.jvm.internal.m.e(onToggleFavorites, "onToggleFavorites");
        kotlin.jvm.internal.m.e(onDeleteClicked, "onDeleteClicked");
        kotlin.jvm.internal.m.e(downloadedSurahIds, "downloadedSurahIds");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1646062686);
        int i2 = (g0Var.g(favoriteIds) ? 4 : 2) | i | (g0Var.g(playerItems) ? 32 : 16) | (g0Var.g(playerItem) ? 256 : 128) | (g0Var.h(z) ? 2048 : 1024) | (g0Var.i(onPlayerItemClicked) ? 16384 : 8192) | (g0Var.i(onToggleFavorites) ? 131072 : 65536) | (g0Var.i(onDeleteClicked) ? 1048576 : 524288) | (g0Var.h(z2) ? 8388608 : 4194304) | (g0Var.g(downloadedSurahIds) ? 67108864 : 33554432) | (g0Var.g(rVar) ? 536870912 : 268435456);
        if (g0Var.S(i2 & 1, (306783379 & i2) != 306783378)) {
            i((i2 & 1879048192) | ((i2 >> 3) & 126) | ((i2 << 6) & 896) | (i2 & 7168) | (57344 & i2) | (458752 & i2) | (3670016 & i2) | (29360128 & i2) | (234881024 & i2), rVar, playerItem, g0Var, onPlayerItemClicked, onToggleFavorites, onDeleteClicked, playerItems, favoriteIds, downloadedSurahIds, z, z2);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new v(favoriteIds, playerItems, playerItem, z, onPlayerItemClicked, onToggleFavorites, onDeleteClicked, z2, downloadedSurahIds, rVar, i, 1);
        }
    }

    public static final void w(String str, b2.r rVar, l1.j jVar, int i) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1656921437);
        int i2 = (g0Var.g(str) ? 4 : 2) | i | 48;
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            wb.h hVar = new wb.h((Context) g0Var.k(o0.b));
            hVar.c = str;
            mb.j jVarI = mb.l.i(w.c.q(hVar, 600), (z2.p) null, g0Var, 0, 62);
            z.n.c(jVarI, (String) null, rd.a.g0(10, 0, dl.a.s, z1.c, !(jVarI.j() instanceof mb.g)), (b2.d) null, z2.o.a, 0.0f, g0Var, 24624, 104);
            rVar = b2.o.A;
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new c00.m(str, rVar, i, 8);
        }
    }

    public static final void x(dw.a aVar, float f2, u00.a aVar2, b2.r rVar, l1.j jVar, int i) {
        dw.a aVar3;
        long jZ;
        long jZ2;
        float f3;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1286903919);
        int i2 = i | (g0Var.i(aVar) ? 4 : 2) | (g0Var.d(f2) ? 32 : 16) | (g0Var.i(aVar2) ? 256 : 128) | (g0Var.g(rVar) ? 2048 : 1024);
        if (g0Var.S(i2 & 1, (i2 & 1171) != 1170)) {
            gm.a aVar4 = (gm.a) g0Var.k(dl.e.a);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.a;
            if (objN == cVar) {
                int iOrdinal = aVar4.ordinal();
                if (iOrdinal == 0) {
                    f3 = 8;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f3 = 16;
                }
                objN = oi.k.t(f3, g0Var);
            }
            float f4 = ((y3.f) objN).A;
            Object objN2 = g0Var.N();
            if (objN2 == cVar) {
                int iOrdinal2 = aVar4.ordinal();
                if (iOrdinal2 == 0) {
                    jZ2 = kh.o.z(16);
                } else {
                    if (iOrdinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jZ2 = kh.o.z(22);
                }
                objN2 = new y3.o(jZ2);
                g0Var.n0(objN2);
            }
            long j = ((y3.o) objN2).a;
            Object objN3 = g0Var.N();
            if (objN3 == cVar) {
                int iOrdinal3 = aVar4.ordinal();
                if (iOrdinal3 == 0) {
                    jZ = kh.o.z(16);
                } else {
                    if (iOrdinal3 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jZ = kh.o.z(24);
                }
                objN3 = new y3.o(jZ);
                g0Var.n0(objN3);
            }
            long j2 = ((y3.o) objN3).a;
            b2.r rVarN = w50.c.n(f2.h.c(h0.c.m(z1.q(rVar, f2), 1.0f), p0.f.a(10)), true, aVar2);
            w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarN, g0Var);
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
            boolean zC = aVar.c();
            String str = aVar.f;
            if (zC) {
                g0Var.c0(-282399166);
                g(null, g0Var, 0);
                g0Var.r(false);
            } else if (r30.k.L0(str)) {
                g0Var.c0(-282394658);
                y(null, g0Var, 0);
                g0Var.r(false);
            } else {
                g0Var.c0(-282396839);
                w(str, null, g0Var, 0);
                g0Var.r(false);
            }
            boolean z = aVar.g;
            b2.o oVar = b2.o.A;
            if (z) {
                g0Var.c0(-164214616);
                R(aVar, j, j2, h0.c.C(oVar, f4), g0Var, 28102 | ((i2 << 3) & 112));
                aVar3 = aVar;
                g0Var.r(false);
            } else {
                aVar3 = aVar;
                g0Var.c0(-163945691);
                M(28038, j, j2, h0.c.C(oVar, f4), aVar3.c, g0Var);
                g0Var = g0Var;
                g0Var.r(false);
            }
            g0Var.r(true);
        } else {
            aVar3 = aVar;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new bs.g(aVar3, f2, aVar2, rVar, i);
        }
    }

    public static final void y(b2.r rVar, l1.j jVar, int i) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(598905253);
        int i2 = i | 6;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            h0.o.a(z.n.f(z1.c, dl.a.q, i2.b0.b), g0Var, 0);
            rVar = b2.o.A;
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new ro.e(rVar, i, 10);
        }
    }

    public static final void z(float f2, int i, b2.r rVar, l1.j jVar) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(810548994);
        int i2 = (g0Var.d(f2) ? 4 : 2) | i | (g0Var.g(rVar) ? 32 : 16);
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            float f3 = 10;
            h0.o.a(rd.a.g0(f3, 0, dl.a.s, f2.h.c(h0.c.m(z1.q(rVar, f2), 1.0f), p0.f.a(f3)), true), g0Var, 0);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new ct.a0(f2, rVar, i, 7);
        }
    }
}
