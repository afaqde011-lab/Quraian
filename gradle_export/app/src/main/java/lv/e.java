package lv;

import android.content.Context;
import b2.o;
import b2.r;
import b3.f;
import b3.g;
import b3.h;
import c3.o0;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import g00.b0;
import g1.o3;
import g1.z6;
import h0.c1;
import h0.i;
import h0.t1;
import h0.u;
import h0.v;
import h0.v1;
import h0.w1;
import h0.z1;
import i2.t;
import i2.t0;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.j;
import l1.m1;
import l1.p2;
import l1.q;
import l1.r1;
import l1.z0;
import m3.r0;
import mb.l;
import uu.w;
import w.b2;
import x.y;
import x3.k;
import z.n;
import z2.p;

public abstract class e {
    public static final long a;
    public static final long b;

    static {
        long j = dl.a.i;
        a = j;
        b = t.b(0.5f, j);
    }

    public static final void a(PlayerItem playerItem, j jVar, int i) {
        PlayerItem playerItem2 = playerItem;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1222877536);
        int i2 = i | (g0Var.g(playerItem2) ? 4 : 2);
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            v1 v1VarA = t1.a(i.g(8), b2.b.K, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            o oVar = o.A;
            r rVarC = b2.a.c(oVar, g0Var);
            b3.i.c.getClass();
            g gVar = h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            f fVar = h.f;
            q.I(v1VarA, g0Var, fVar);
            f fVar2 = h.e;
            q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            f fVar3 = h.g;
            q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = h.h;
            q.E(g0Var, eVar);
            f fVar4 = h.d;
            q.I(rVarC, g0Var, fVar4);
            wb.h hVar = new wb.h((Context) g0Var.k(o0.b));
            hVar.c = playerItem2.getReciterPhotoUrl();
            hVar.c(200);
            mb.j jVarI = l.i(hVar.a(), (p) null, g0Var, 0, 62);
            float f = 12;
            n.c(jVarI, (String) null, rd.a.g0(f, 0, dl.a.s, f2.h.c(z1.m(oVar, 48), p0.f.a(f)), !(jVarI.j() instanceof mb.g)), (b2.d) null, z2.o.a, 0.0f, g0Var, 24624, 104);
            v vVarA = u.a(i.g(0), b2.b.M, g0Var, 6);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            r rVarC2 = b2.a.c(oVar, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(vVarA, g0Var, fVar);
            q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            q.I(rVarC2, g0Var, fVar4);
            playerItem2 = playerItem;
            k00.f.g(playerItem2, kh.o.z(15), kh.o.z(15), g0Var, (i2 & 14) | 432);
            z6.b(playerItem2.getReciterName(), (r) null, dl.a.o, kh.o.z(12), (q3.u) null, (q3.i) null, 0L, (x3.l) null, (k) null, kh.o.z(6), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 24576, 48, 260074);
            g0Var = g0Var;
            g0Var.r(true);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new b(playerItem2, i, 1);
        }
    }

    public static final void b(jk.a backdrop, u00.a onMiniPlayerClicked, final u00.a onMenuClicked, final u00.k onToggleFavorites, r rVar, j jVar, int i) {
        m.e(backdrop, "backdrop");
        m.e(onMiniPlayerClicked, "onMiniPlayerClicked");
        m.e(onMenuClicked, "onMenuClicked");
        m.e(onToggleFavorites, "onToggleFavorites");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-751698613);
        int i2 = i | (g0Var.i(backdrop) ? 4 : 2) | (g0Var.i(onMiniPlayerClicked) ? 32 : 16) | (g0Var.i(onMenuClicked) ? 256 : 128) | (g0Var.i(onToggleFavorites) ? 2048 : 1024) | (g0Var.g(rVar) ? 16384 : 8192);
        if (g0Var.S(i2 & 1, (i2 & 9363) != 9362)) {
            e60.a aVarA = q50.c.a(g0Var);
            boolean zG = g0Var.g((Object) null) | g0Var.g(aVarA);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.a;
            if (zG || objN == cVar) {
                objN = oi.k.f(a0.a, tq.k.class, aVarA, (b60.a) null, g0Var);
            }
            tq.k kVar = (tq.k) objN;
            e60.a aVarA2 = q50.c.a(g0Var);
            boolean zG2 = g0Var.g((Object) null) | g0Var.g(aVarA2);
            Object objN2 = g0Var.N();
            if (zG2 || objN2 == cVar) {
                objN2 = oi.k.f(a0.a, uu.a.class, aVarA2, (b60.a) null, g0Var);
            }
            final uu.a aVar = (uu.a) objN2;
            w wVar = (w) aVar;
            final z0 z0VarQ = k00.f.q(wVar.C, g0Var, 0);
            final z0 z0VarQ2 = k00.f.q(wVar.G, g0Var, 0);
            z0 z0VarQ3 = k00.f.q(wVar.J, g0Var, 0);
            z0 z0VarQ4 = k00.f.q(wVar.I, g0Var, 0);
            PlayerItem playerItem = (PlayerItem) z0VarQ.getValue();
            final z0 z0VarP = k00.f.p(new tq.h(kVar.c(), playerItem != null ? playerItem.getSurahId() : -1L), Boolean.FALSE, g0Var, 48);
            boolean zBooleanValue = ((Boolean) z0VarQ4.getValue()).booleanValue();
            long j = b;
            long j2 = a;
            final p2 p2VarA = b2.a(zBooleanValue ? j2 : j, (y) null, (String) null, g0Var, 0, 14);
            final p2 p2VarA2 = b2.a(((Number) z0VarQ3.getValue()).intValue() == 0 ? j : j2, (y) null, (String) null, g0Var, 0, 14);
            boolean zE = g0Var.e(((Number) z0VarQ3.getValue()).intValue());
            Object objN3 = g0Var.N();
            if (zE || objN3 == cVar) {
                int iIntValue = ((Number) z0VarQ3.getValue()).intValue();
                int i3 = 2131231371;
                if (iIntValue != 0 && iIntValue == 1) {
                    i3 = 2131231372;
                }
                objN3 = Integer.valueOf(i3);
                g0Var.n0(objN3);
            }
            final int iIntValue2 = ((Number) objN3).intValue();
            ze.d.d(onMiniPlayerClicked, backdrop, z1.r(rVar, 420, 660), false, 0L, dl.a.P, 65, (t0) null, v1.d.d(1082852806, new u00.o() {
                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    uu.a aVar2;
                    w1 LiquidPlayer = (w1) obj;
                    g0 g0Var2 = (j) obj2;
                    int iIntValue3 = ((Integer) obj3).intValue();
                    m.e(LiquidPlayer, "$this$LiquidPlayer");
                    g0 g0Var3 = g0Var2;
                    if (g0Var3.S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                        o oVar = o.A;
                        float f = 16;
                        r rVarD = h0.c.D(z1.d(oVar, 1.0f), f, 6);
                        v1 v1VarA = t1.a(i.g(12), b2.b.K, g0Var2, 54);
                        int iHashCode = Long.hashCode(g0Var3.T);
                        m1 m1VarM = g0Var3.m();
                        r rVarC = b2.a.c(rVarD, g0Var2);
                        b3.i.c.getClass();
                        g gVar = h.b;
                        g0Var3.g0();
                        if (g0Var3.S) {
                            g0Var3.l(gVar);
                        } else {
                            g0Var3.q0();
                        }
                        q.I(v1VarA, g0Var2, h.f);
                        q.I(m1VarM, g0Var2, h.e);
                        q.I(Integer.valueOf(iHashCode), g0Var2, h.g);
                        q.E(g0Var2, h.h);
                        q.I(rVarC, g0Var2, h.d);
                        float f2 = 20;
                        r rVarM = z1.m(oVar, f2);
                        uu.a aVar3 = aVar;
                        boolean zI = g0Var3.i(aVar3);
                        Object objN4 = g0Var3.N();
                        l1.c cVar2 = l1.i.a;
                        if (zI || objN4 == cVar2) {
                            aVar2 = aVar3;
                            objN4 = new av.k(0, aVar2, uu.a.class, "toggleShuffle", "toggleShuffle()V", 0, 23);
                            g0Var3.n0(objN4);
                        } else {
                            aVar2 = aVar3;
                        }
                        uu.a aVar4 = aVar2;
                        o3.a(y3.R(2131231384, g0Var2, 0), (String) null, w50.c.o(rVarM, false, null, (u00.a) ((a10.g) objN4), 7), ((t) p2VarA.getValue()).a, g0Var2, 56, 0);
                        float f3 = 8;
                        float f4 = 30;
                        r rVarM2 = z1.m(h0.c.E(oVar, f3, 0.0f, 2), f4);
                        boolean zI2 = g0Var3.i(aVar4);
                        Object objN5 = g0Var3.N();
                        if (zI2 || objN5 == cVar2) {
                            objN5 = new av.k(0, aVar4, uu.a.class, "seekToPrevious", "seekToPrevious()V", 0, 24);
                            g0Var3.n0(objN5);
                        }
                        r rVarO = w50.c.o(rVarM2, false, null, (u00.a) ((a10.g) objN5), 7);
                        m2.b bVarR = y3.R(2131231079, g0Var2, 0);
                        long j3 = dl.a.j;
                        z3.j(bVarR, (String) null, rVarO, j3, g0Var2, 56, 0);
                        p2 p2Var = z0VarQ2;
                        r rVarM3 = z1.m(h0.c.j(((Boolean) p2Var.getValue()).booleanValue() ? 0 : 3), f4);
                        boolean zI3 = g0Var3.i(aVar4);
                        Object objN6 = g0Var3.N();
                        if (zI3 || objN6 == cVar2) {
                            objN6 = new av.k(0, aVar4, uu.a.class, "playPauseToggle", "playPauseToggle()V", 0, 25);
                            g0Var3.n0(objN6);
                        }
                        o3.a(y3.R(((Boolean) p2Var.getValue()).booleanValue() ? 2131231354 : 2131231358, g0Var2, 0), (String) null, w50.c.o(rVarM3, false, null, (u00.a) ((a10.g) objN6), 7), j3, g0Var2, 56, 0);
                        r rVarM4 = z1.m(h0.c.E(oVar, f3, 0.0f, 2), f4);
                        boolean zI4 = g0Var3.i(aVar4);
                        Object objN7 = g0Var3.N();
                        if (zI4 || objN7 == cVar2) {
                            objN7 = new av.k(0, aVar4, uu.a.class, "seekToNext", "seekToNext()V", 0, 26);
                            g0Var3.n0(objN7);
                        }
                        z3.j(y3.R(2131231135, g0Var2, 0), (String) null, w50.c.o(rVarM4, false, null, (u00.a) ((a10.g) objN7), 7), j3, g0Var2, 56, 0);
                        r rVarM5 = z1.m(h0.c.G(oVar, 0.0f, 0.0f, f, 0.0f, 11), 18);
                        boolean zI5 = g0Var3.i(aVar4);
                        Object objN8 = g0Var3.N();
                        if (zI5 || objN8 == cVar2) {
                            objN8 = new av.k(0, aVar4, uu.a.class, "toggleRepeatMode", "toggleRepeatMode()V", 0, 27);
                            g0Var3.n0(objN8);
                        }
                        o3.a(y3.R(iIntValue2, g0Var2, 0), (String) null, w50.c.o(rVarM5, false, null, (u00.a) ((a10.g) objN8), 7), ((t) p2VarA2.getValue()).a, g0Var2, 56, 0);
                        z0 z0Var = z0VarQ;
                        if (((PlayerItem) z0Var.getValue()) != null) {
                            g0Var3.c0(-704370834);
                            PlayerItem playerItem2 = (PlayerItem) z0Var.getValue();
                            m.b(playerItem2);
                            e.a(playerItem2, g0Var2, 0);
                            g0Var3.r(false);
                        } else {
                            g0Var3.c0(-704261280);
                            g0Var3.r(false);
                        }
                        if (1.0f <= 0.0d) {
                            i0.a.a("invalid weight; must be greater than zero");
                        }
                        h0.c.h(new c1(1.0f, true), g0Var2);
                        float f5 = 26;
                        boolean zBooleanValue2 = ((Boolean) z0VarP.getValue()).booleanValue();
                        u00.k kVar2 = onToggleFavorites;
                        boolean zG3 = g0Var3.g(kVar2) | g0Var3.g(z0Var);
                        Object objN9 = g0Var3.N();
                        if (zG3 || objN9 == cVar2) {
                            objN9 = new iz.i(kVar2, z0Var, 1);
                            g0Var3.n0(objN9);
                        }
                        wr.k.u(zBooleanValue2, (u00.a) objN9, null, f5, j3, false, null, 0, false, null, 0.0f, g0Var2, 3072, 0, 2020);
                        h0.c.h(z1.q(oVar, 4), g0Var2);
                        o3.a(y3.R(2131231206, g0Var2, 0), (String) null, w50.c.o(z1.m(oVar, f2), false, null, onMenuClicked, 7), j3, g0Var2, 56, 0);
                        g0Var3.r(true);
                    } else {
                        g0Var3.V();
                    }
                    return b0.a;
                }
            }, g0Var), g0Var, ((i2 >> 3) & 14) | 819462144 | ((i2 << 3) & 112), 280);
            g0Var = g0Var;
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new cz.g(backdrop, onMiniPlayerClicked, onMenuClicked, onToggleFavorites, rVar, i);
        }
    }
}
