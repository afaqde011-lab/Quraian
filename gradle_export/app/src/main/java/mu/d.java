package mu;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import bv.i2;
import c3.o0;
import c3.o1;
import c3.w2;
import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import com.revenuecat.purchases.common.Constants;
import d0.o2;
import g1.c5;
import g1.f0;
import g1.g2;
import g1.j0;
import g1.l3;
import g1.n5;
import g1.o3;
import g1.t6;
import g1.w6;
import g1.x5;
import g1.z6;
import gz.z0;
import h0.c1;
import h0.n1;
import h0.p1;
import h0.t1;
import h0.v1;
import h0.w1;
import h0.z1;
import i2.s0;
import i2.t0;
import i2.v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l1.g0;
import l1.m1;
import l1.q2;
import l1.r1;
import m3.b0;
import m3.h0;
import m3.r0;
import q0.c0;
import q0.h1;
import q0.i1;
import r3.e0;
import z2.d1;
import z2.w0;

public abstract class d {
    public static final v1.c a = new v1.c(new lu.a(7), 40714940, false);
    public static final v1.c b = new v1.c(new lu.a(8), 399610007, false);
    public static final v1.c c = new v1.c(new b0(16), -1093261333, false);
    public static final v1.c d = new v1.c(new b0(17), -1677512087, false);
    public static final v1.c e = new v1.c(new b0(18), 1865906056, false);

    public static final void A(ju.f page, b2.r rVar, l1.j jVar, int i) {
        kotlin.jvm.internal.m.e(page, "page");
        g0 g0Var = (g0) jVar;
        g0Var.e0(1053048698);
        int i2 = (g0Var.g(page) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            h0.c.a(rVar.V(z1.c), (b2.d) null, false, v1.d.d(-1113749936, new y(page, 1), g0Var), g0Var, 3072, 6);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new z(page, rVar, i, 1);
        }
    }

    public static final int B(zz.a aVar) {
        String str = aVar.a;
        switch (str.hashCode()) {
            case -1062863507:
                return !str.equals("bird_singing") ? 2131231107 : 2131231080;
            case -1017500300:
                str.equals("calm_rain");
                return 2131231107;
            case -1017343512:
                return !str.equals("calm_wind") ? 2131231107 : 2131231430;
            case 617872791:
                return !str.equals("calm_bonfire") ? 2131231107 : 2131231132;
            case 1830521239:
                return !str.equals("wave_effect") ? 2131231107 : 2131231421;
            default:
                return 2131231107;
        }
    }

    public static final int[] C(int i) {
        int iY = ab.a0.y(i, 60, 5999);
        int i2 = iY / 60;
        if (i2 > 99) {
            i2 = 99;
        }
        int i3 = iY % 60;
        return new int[]{i2 / 10, i2 % 10, i3 / 10, i3 % 10};
    }

    public static final int D(int[] iArr) {
        int i = (iArr[0] * 10) + iArr[1];
        int i2 = (iArr[2] * 10) + iArr[3];
        if (i2 > 59) {
            i2 = 59;
        }
        if (i > 99) {
            i = 99;
        }
        int i3 = (i * 60) + i2;
        if (i3 > 5999) {
            return 5999;
        }
        return i3;
    }

    public static final void a(ju.f page, lu.z zVar, jk.a aVar, u00.k onAction, b2.r rVar, l1.j jVar, int i) {
        b2.r rVar2;
        l1.j jVar2;
        kotlin.jvm.internal.m.e(page, "page");
        kotlin.jvm.internal.m.e(onAction, "onAction");
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(294487293);
        int i2 = i | (jVar3.g(page) ? 4 : 2) | (jVar3.g(zVar) ? 32 : 16) | (jVar3.i(aVar) ? 256 : 128) | (jVar3.i(onAction) ? 2048 : 1024);
        if (jVar3.S(i2 & 1, (i2 & 9363) != 9362)) {
            zz.a aVar2 = zVar.h;
            gm.a aVar3 = (gm.a) jVar3.k(dl.e.a);
            rVar2 = rVar;
            b2.r rVarV = rVar2.V(z1.c);
            gm.a aVar4 = gm.a.B;
            b2.o oVar = b2.o.A;
            b2.r rVarV2 = rVarV.V(aVar3 == aVar4 ? z1.q(oVar, 420) : h0.c.E(z1.d(oVar, 1.0f), 24, 0.0f, 2));
            v1.c cVarD = v1.d.d(1510142183, new z0(aVar3, page, zVar, aVar, aVar2, onAction, 2), jVar3);
            jVar2 = jVar3;
            h0.c.a(rVarV2, (b2.d) null, false, cVarD, jVar2, 3072, 6);
        } else {
            rVar2 = rVar;
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new cz.g(page, zVar, aVar, onAction, rVar2, i);
        }
    }

    public static final void b(ju.f fVar, float f, float f2, l1.j jVar, int i) {
        g0 g0Var;
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(1902028573);
        int i2 = i | (g0Var2.g(fVar) ? 4 : 2) | (g0Var2.d(f) ? 32 : 16) | (g0Var2.d(f2) ? 256 : 128);
        if (g0Var2.S(i2 & 1, (i2 & 147) != 146)) {
            gm.a aVar = (gm.a) g0Var2.k(dl.e.a);
            gm.a aVar2 = gm.a.B;
            boolean z = aVar == aVar2;
            float f3 = z ? 24 : 16;
            d1 d1Var = z ? z2.o.c : z2.o.b;
            b2.i iVar = z ? b2.b.B : b2.b.H;
            boolean zE = ((i2 & 112) == 32) | ((i2 & 896) == 256) | g0Var2.e(aVar.ordinal());
            Object objN = g0Var2.N();
            if (zE || objN == l1.i.a) {
                objN = oi.k.t(b5.G(f2, f, aVar == aVar2), g0Var2);
            }
            float f4 = ((y3.f) objN).A;
            h0.a0 a0Var = z1.c;
            b2.r rVarG = h0.c.G(a0Var, 0.0f, f4, 0.0f, 0.0f, 13);
            h0.v vVarA = h0.u.a(h0.i.c, b2.b.N, g0Var2, 54);
            int iHashCode = Long.hashCode(g0Var2.T);
            m1 m1VarM = g0Var2.m();
            b2.r rVarC = b2.a.c(rVarG, g0Var2);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            b3.f fVar2 = b3.h.f;
            l1.q.I(vVarA, g0Var2, fVar2);
            b3.f fVar3 = b3.h.e;
            l1.q.I(m1VarM, g0Var2, fVar3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar4 = b3.h.g;
            l1.q.I(numValueOf, g0Var2, fVar4);
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var2, eVar);
            b3.f fVar5 = b3.h.d;
            l1.q.I(rVarC, g0Var2, fVar5);
            b2.r rVar = b2.o.A;
            float f5 = f3;
            b2.i iVar2 = iVar;
            u(fVar, h0.c.E(rVar, f3, 0.0f, 2), 0L, 0L, 0, 0.0f, g0Var2, i2 & 14, 60);
            h0.c.h(z1.e(rVar, 16), g0Var2);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            b2.r rVarV = h0.c.E(z1.d(new c1(1.0f, true), 1.0f), f5, 0.0f, 2).V(z ? f2.h.d(rVar) : rVar);
            w0 w0VarD = h0.o.d(iVar2, false);
            int iHashCode2 = Long.hashCode(g0Var2.T);
            m1 m1VarM2 = g0Var2.m();
            b2.r rVarC2 = b2.a.c(rVarV, g0Var2);
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            l1.q.I(w0VarD, g0Var2, fVar2);
            l1.q.I(m1VarM2, g0Var2, fVar3);
            a1.b.v(iHashCode2, g0Var2, fVar4, g0Var2, eVar);
            l1.q.I(rVarC2, g0Var2, fVar5);
            z.n.c(y3.R(z ? 2131231688 : 2131231627, g0Var2, 0), (String) null, a0Var, iVar2, d1Var, 0.0f, g0Var2, 440, 96);
            z.n.c(y3.R(z ? 2131231687 : 2131231626, g0Var2, 0), (String) null, a0Var, iVar2, d1Var, 0.0f, g0Var2, 440, 96);
            g0Var = g0Var2;
            g0Var.r(true);
            g0Var.r(true);
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new a0(fVar, f, f2, i, 0);
        }
    }

    public static final void c(ju.f fVar, float f, float f2, l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(329313919);
        int i2 = i | (g0Var.g(fVar) ? 4 : 2) | (g0Var.d(f) ? 32 : 16) | (g0Var.d(f2) ? 256 : 128);
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            gm.a aVar = (gm.a) g0Var.k(dl.e.a);
            boolean z = aVar == gm.a.B;
            u30.b bVar = ju.n.a;
            boolean zE = g0Var.e(aVar.ordinal()) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objN = g0Var.N();
            if (zE || objN == l1.i.a) {
                objN = oi.k.t(b5.G(f2, f, z), g0Var);
            }
            b2.r rVarG = h0.c.G(z1.c, 0.0f, ((y3.f) objN).A, 0.0f, 0.0f, 13);
            h0.v vVarA = h0.u.a(h0.i.c, b2.b.N, g0Var, 54);
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
            float f3 = z ? 24 : 12;
            b2.o oVar = b2.o.A;
            boolean z2 = z;
            u(fVar, h0.c.E(oVar, f3, 0.0f, 2), 0L, 0L, 0, 0.0f, g0Var, i2 & 14, 60);
            h0.c.h(z1.e(oVar, z2 ? 16 : 40), g0Var);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            b2.r rVarD = f2.h.d(z1.d(new c1(1.0f, true), 1.0f));
            w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarD, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD, g0Var, fVar2);
            l1.q.I(m1VarM2, g0Var, fVar3);
            a1.b.v(iHashCode2, g0Var, fVar4, g0Var, eVar);
            l1.q.I(rVarC2, g0Var, fVar5);
            z(bVar, g0Var, 0);
            g0Var.r(true);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new a0(fVar, f, f2, i, 1);
        }
    }

    public static final void d(ju.f page, lu.z zVar, u00.k onDailyMinimumChanged, b2.r rVar, l1.j jVar, int i) {
        l1.j jVar2;
        kotlin.jvm.internal.m.e(page, "page");
        kotlin.jvm.internal.m.e(onDailyMinimumChanged, "onDailyMinimumChanged");
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(315817509);
        int i2 = (jVar3.g(page) ? 4 : 2) | i | (jVar3.g(zVar) ? 32 : 16) | (jVar3.i(onDailyMinimumChanged) ? 256 : 128);
        if (jVar3.S(i2 & 1, (i2 & 1171) != 1170)) {
            jVar2 = jVar3;
            h0.c.a(rVar.V(z1.c), (b2.d) null, false, v1.d.d(-1907761029, new bz.o((gm.a) jVar3.k(dl.e.a), page, zVar, onDailyMinimumChanged, 7), jVar3), jVar2, 3072, 6);
        } else {
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new dz.k(page, zVar, onDailyMinimumChanged, rVar, i, 9);
        }
    }

    public static final void e(final int i, final u00.k kVar, long j, long j2, final float f, l1.j jVar, int i2) {
        l1.z0 z0Var;
        Object i2Var;
        l1.c cVar;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-228317832);
        int i3 = i2 | (g0Var.e(i) ? 4 : 2) | (g0Var.i(kVar) ? 32 : 16) | (g0Var.f(j) ? 256 : 128) | (g0Var.f(j2) ? 2048 : 1024) | (g0Var.d(f) ? 16384 : 8192);
        if (g0Var.S(i3 & 1, (i3 & 9363) != 9362)) {
            Object objN = g0Var.N();
            l1.c cVar2 = l1.i.a;
            if (objN == cVar2) {
                objN = l1.q.z("");
                g0Var.n0(objN);
            }
            final l1.z0 z0Var2 = (l1.z0) objN;
            Object objN2 = g0Var.N();
            if (objN2 == cVar2) {
                objN2 = l1.q.z(C(i));
                g0Var.n0(objN2);
            }
            final l1.z0 z0Var3 = (l1.z0) objN2;
            Object objN3 = g0Var.N();
            if (objN3 == cVar2) {
                objN3 = l1.q.z(Boolean.FALSE);
                g0Var.n0(objN3);
            }
            l1.z0 z0Var4 = (l1.z0) objN3;
            final int i4 = i / 60;
            final boolean z = i4 <= 99;
            Integer numValueOf = Integer.valueOf(i);
            Boolean boolValueOf = Boolean.valueOf(z);
            Boolean boolValueOf2 = Boolean.valueOf(g(z0Var4));
            boolean zH = g0Var.h(z) | ((i3 & 14) == 4);
            Object objN4 = g0Var.N();
            if (zH || objN4 == cVar2) {
                z0Var = z0Var4;
                cVar = cVar2;
                i2Var = new i2(z, i, z0Var, z0Var3, (k00.c) null);
                g0Var.n0(i2Var);
            } else {
                cVar = cVar2;
                z0Var = z0Var4;
                i2Var = objN4;
            }
            l1.q.g(numValueOf, boolValueOf, boolValueOf2, (u00.n) i2Var, g0Var);
            Object objN5 = g0Var.N();
            if (objN5 == cVar) {
                objN5 = new g2.t();
                g0Var.n0(objN5);
            }
            final g2.t tVar = (g2.t) objN5;
            boolean z2 = ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
            Object objN6 = g0Var.N();
            if (z2 || objN6 == cVar) {
                r0 r0Var = new r0(dl.a.i, j, q3.u.M, q3.i.D, 0L, 0L, 3, 0, j2, (m3.z) null, 16613336);
                g0Var.n0(r0Var);
                objN6 = r0Var;
            }
            final r0 r0Var2 = (r0) objN6;
            final l1.z0 z0Var5 = z0Var;
            l1.q.a(o1.n.a(y3.m.A), v1.d.d(-351684040, new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    u00.k kVar2;
                    l1.z0 z0Var6;
                    l1.z0 z0Var7;
                    l1.z0 z0Var8;
                    u00.k kVar3;
                    boolean z3;
                    int i5;
                    u00.k kVar4;
                    l1.z0 z0Var9;
                    l1.z0 z0Var10;
                    g0 g0Var2 = (l1.j) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    g0 g0Var3 = g0Var2;
                    if (g0Var3.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                        b2.o oVar = b2.o.A;
                        boolean z4 = z;
                        int i6 = i;
                        u00.k kVar5 = kVar;
                        r0 r0Var3 = r0Var2;
                        float f2 = f;
                        l1.z0 z0Var11 = z0Var5;
                        l1.z0 z0Var12 = z0Var3;
                        l1.z0 z0Var13 = z0Var2;
                        l1.c cVar3 = l1.i.a;
                        if (z4) {
                            g0Var3.c0(-1592667973);
                            String str = (String) z0Var13.getValue();
                            int length = ((String) z0Var13.getValue()).length();
                            r3.w wVar = new r3.w(str, h0.b(length, length), 4);
                            b2.r rVarJ = g2.d.j(z1.g(z1.d(oVar, 1.0f), 56, 0.0f, 2), tVar);
                            boolean zE = g0Var3.e(i6) | g0Var3.g(kVar5);
                            Object objN7 = g0Var3.N();
                            if (zE || objN7 == cVar3) {
                                objN7 = new g2(i6, kVar5, z0Var11, z0Var12, z0Var13, 3);
                                kVar2 = kVar5;
                                z0Var6 = z0Var13;
                                g0Var3.n0(objN7);
                            } else {
                                kVar2 = kVar5;
                                z0Var6 = z0Var13;
                            }
                            b2.r rVarS = g2.d.s(rVarJ, (u00.k) objN7);
                            long j3 = i2.t.f;
                            r0 r0VarA = r0.a(r0Var3, j3, 0L, (q3.u) null, (q3.i) null, 0L, (s0) null, 0, 0L, (m3.z) null, (x3.i) null, 16777214);
                            l1.z0 z0Var14 = z0Var11;
                            i1 i1Var = new i1(0, 3, 0, 123);
                            v0 v0Var = new v0(j3);
                            boolean zG = g0Var3.g(kVar2);
                            Object objN8 = g0Var3.N();
                            if (zG || objN8 == cVar3) {
                                u00.k kVar6 = kVar2;
                                l1.z0 z0Var15 = z0Var6;
                                objN8 = new az.k(kVar6, (Object) z0Var15, z0Var14, r20, 9);
                                z0Var7 = z0Var15;
                                z0Var8 = r20;
                                z0Var14 = z0Var14;
                                kVar3 = kVar6;
                                g0Var3.n0(objN8);
                            } else {
                                kVar3 = kVar2;
                                z0Var8 = z0Var12;
                                z0Var7 = z0Var6;
                            }
                            c0.b(wVar, (u00.k) objN8, rVarS, false, r0VarA, i1Var, (h1) null, true, 0, 0, (e0) null, (u00.k) null, (f0.i) null, v0Var, v1.d.d(-340707943, new h(f2, z4, i6, kVar3, z0Var14, z0Var8, z0Var7, r0Var3), g0Var2), g0Var2, 102236160, 221184, 16024);
                            g0Var3.r(false);
                        } else {
                            g0Var3.c0(-1593923783);
                            b2.r rVarG = z1.g(z1.d(oVar, 1.0f), 56, 0.0f, 2);
                            v1 v1VarA = t1.a(h0.i.h, b2.b.K, g0Var2, 54);
                            int iHashCode = Long.hashCode(g0Var3.T);
                            m1 m1VarM = g0Var3.m();
                            b2.r rVarC = b2.a.c(rVarG, g0Var2);
                            b3.i.c.getClass();
                            b3.g gVar = b3.h.b;
                            g0Var3.g0();
                            if (g0Var3.S) {
                                g0Var3.l(gVar);
                            } else {
                                g0Var3.q0();
                            }
                            l1.q.I(v1VarA, g0Var2, b3.h.f);
                            l1.q.I(m1VarM, g0Var2, b3.h.e);
                            l1.q.I(Integer.valueOf(iHashCode), g0Var2, b3.h.g);
                            l1.q.E(g0Var2, b3.h.h);
                            l1.q.I(rVarC, g0Var2, b3.h.d);
                            long j4 = dl.a.i;
                            long j5 = dl.a.r;
                            boolean zH2 = g0Var3.h(z4) | g0Var3.e(i6) | g0Var3.g(kVar5);
                            Object objN9 = g0Var3.N();
                            if (zH2 || objN9 == cVar3) {
                                z3 = z4;
                                i5 = i6;
                                kVar4 = kVar5;
                                objN9 = new e(z3, i5, kVar4, z0Var11, z0Var12, z0Var13, 0);
                                z0Var9 = z0Var11;
                                z0Var10 = z0Var12;
                                g0Var3.n0(objN9);
                            } else {
                                z3 = z4;
                                i5 = i6;
                                kVar4 = kVar5;
                                z0Var9 = z0Var11;
                                z0Var10 = z0Var12;
                            }
                            d.t(2131231207, j4, j5, f2, (u00.a) objN9, g0Var2, 0);
                            boolean z5 = z3;
                            int i7 = i5;
                            u00.k kVar7 = kVar4;
                            z6.b(i4 + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + r30.k.P0(2, String.valueOf(i5 % 60)), (b2.r) null, 0L, 0L, (q3.u) null, (q3.i) null, 0L, (x3.l) null, new x3.k(3), 0L, 0, false, 0, 0, (u00.k) null, r0Var3, g0Var2, 0, 0, 130046);
                            long j6 = dl.a.L;
                            boolean zH3 = g0Var3.h(z5) | g0Var3.e(i7) | g0Var3.g(kVar7);
                            Object objN10 = g0Var3.N();
                            if (zH3 || objN10 == cVar3) {
                                objN10 = new e(z5, i7, kVar7, z0Var9, z0Var10, z0Var13, 1);
                                g0Var3.n0(objN10);
                            }
                            d.t(2131231361, j6, j4, f2, (u00.a) objN10, g0Var2, 0);
                            g0Var3.r(true);
                            g0Var3.r(false);
                        }
                    } else {
                        g0Var3.V();
                    }
                    return g00.b0.a;
                }
            }, g0Var), g0Var, 56);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new g(i, kVar, j, j2, f, i2);
        }
    }

    public static final void f(boolean z, int i, u00.k kVar, l1.z0 z0Var, l1.z0 z0Var2, l1.z0 z0Var3, int i2) {
        if (z && g(z0Var)) {
            i = D((int[]) z0Var2.getValue());
        }
        int iY = ab.a0.y(i + i2, 60, 5999);
        z0Var2.setValue(C(iY));
        z0Var3.setValue("");
        kVar.invoke(Integer.valueOf(iY));
    }

    public static final boolean g(l1.z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    public static final void h(ju.f page, jk.a aVar, b2.r rVar, l1.j jVar, int i) {
        kotlin.jvm.internal.m.e(page, "page");
        g0 g0Var = (g0) jVar;
        g0Var.e0(483836424);
        int i2 = (g0Var.g(page) ? 4 : 2) | i | (g0Var.i(aVar) ? 32 : 16);
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            h0.c.a(h0.c.M(rVar.V(z1.c), h0.c.g), (b2.d) null, false, v1.d.d(2032555506, new az.j((gm.a) g0Var.k(dl.e.a), page, aVar, 14), g0Var), g0Var, 3072, 6);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new b1.n(i, 17, page, aVar, rVar);
        }
    }

    public static final void i(zz.a aVar, ExoPlayer videoPlayer, b2.r rVar, l1.j jVar, int i) {
        kotlin.jvm.internal.m.e(videoPlayer, "videoPlayer");
        g0 g0Var = (g0) jVar;
        g0Var.e0(217946387);
        int i2 = (g0Var.g(aVar) ? 4 : 2) | i | (g0Var.i(videoPlayer) ? 32 : 16);
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            h0.a0 a0Var = z1.c;
            b2.r rVarV = rVar.V(a0Var);
            w0 w0VarD = h0.o.d(b2.b.A, false);
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
            l1.q.I(w0VarD, g0Var, b3.h.f);
            l1.q.I(m1VarM, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC, g0Var, b3.h.d);
            boolean zI = g0Var.i(videoPlayer);
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (zI || objN == obj) {
                objN = new kz.b(videoPlayer, 1);
                g0Var.n0(objN);
            }
            u00.k kVar = (u00.k) objN;
            boolean zI2 = g0Var.i(videoPlayer);
            Object objN2 = g0Var.N();
            if (zI2 || objN2 == obj) {
                objN2 = new kz.b(videoPlayer, 2);
                g0Var.n0(objN2);
            }
            b4.l.a(kVar, a0Var, (u00.k) objN2, g0Var, 48);
            if (aVar == null) {
                g0Var.c0(-520128245);
                h0.o.a(z.n.e(a0Var, dl.a.b0, (t0) null, 6), g0Var, 0);
                g0Var.r(false);
            } else {
                g0Var.c0(-519964875);
                g0Var.r(false);
            }
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new b1.n(i, 18, aVar, videoPlayer, rVar);
        }
    }

    public static final void j(String message, u00.a onRetry, b2.r rVar, String str, l1.j jVar, int i, int i2) {
        String str2;
        int i3;
        String str3;
        kotlin.jvm.internal.m.e(message, "message");
        kotlin.jvm.internal.m.e(onRetry, "onRetry");
        l1.j jVar2 = (g0) jVar;
        jVar2.e0(879112550);
        int i4 = i | (jVar2.g(message) ? 4 : 2) | (jVar2.i(onRetry) ? 32 : 16);
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 = i4 | 3072;
            str2 = str;
        } else {
            str2 = str;
            i3 = i4 | (jVar2.g(str2) ? 2048 : 1024);
        }
        if (jVar2.S(i3 & 1, (i3 & 1171) != 1170)) {
            String str4 = i5 != 0 ? null : str2;
            float f = 24;
            b2.r rVarD = h0.c.D(z.n.f(z1.d(rVar, 1.0f), i2.t.b(0.1f, dl.a.i), p0.f.a(f)), f, 30);
            h0.v vVarA = h0.u.a(h0.i.c, b2.b.N, jVar2, 48);
            int iHashCode = Long.hashCode(((g0) jVar2).T);
            m1 m1VarM = jVar2.m();
            b2.r rVarC = b2.a.c(rVarD, jVar2);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            jVar2.g0();
            if (((g0) jVar2).S) {
                jVar2.l(gVar);
            } else {
                jVar2.q0();
            }
            l1.q.I(vVarA, jVar2, b3.h.f);
            l1.q.I(m1VarM, jVar2, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), jVar2, b3.h.g);
            l1.q.E(jVar2, b3.h.h);
            l1.q.I(rVarC, jVar2, b3.h.d);
            m2.b bVarR = y3.R(2131231349, jVar2, 0);
            b2.o oVar = b2.o.A;
            z.n.c(bVarR, (String) null, z1.m(oVar, 44), (b2.d) null, (z2.p) null, 0.0f, jVar2, 440, 120);
            h0.c.h(z1.e(oVar, 18), jVar2);
            int i6 = i3;
            String str5 = str4;
            z6.b(message, (b2.r) null, i2.t.b(0.92f, dl.a.k), kh.o.z(16), q3.u.J, (q3.i) null, 0L, (x3.l) null, new x3.k(3), kh.o.z(22), 0, false, 0, 0, (u00.k) null, (r0) null, jVar2, (i6 & 14) | 1597440, 48, 258986);
            h0.c.h(z1.e(oVar, 22), jVar2);
            b2.r rVarE = z1.e(oVar, 40);
            p0.e eVar = p0.f.a;
            p1 p1Var = g1.s.a;
            g1.r rVarA = g1.s.a(i2.t.b(0.92f, dl.a.s), dl.a.H, 0L, 0L, jVar2, 12);
            jVar2 = jVar2;
            x5.a(onRetry, rVarE, false, eVar, rVarA, (g1.u) null, (n1) null, (f0.i) null, v1.d.d(601449408, new fv.a(str5, 7), jVar2), jVar2, ((i6 >> 3) & 14) | 805306416, 484);
            jVar2.r(true);
            str3 = str5;
        } else {
            jVar2.V();
            str3 = str2;
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new g1.a(i, i2, rVar, message, str3, onRetry);
        }
    }

    public static final void k(int i, b2.r rVar, String text, l1.j jVar, u00.a onClick, boolean z) {
        kotlin.jvm.internal.m.e(text, "text");
        kotlin.jvm.internal.m.e(onClick, "onClick");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1363581365);
        int i2 = i | (g0Var.g(text) ? 4 : 2) | (g0Var.i(onClick) ? 32 : 16) | (g0Var.g(rVar) ? 256 : 128) | (g0Var.h(z) ? 2048 : 1024) | 221184;
        if (g0Var.S(i2 & 1, (74899 & i2) != 74898)) {
            b2.r rVarD = h0.c.D(w50.c.n(z.n.f(f2.h.c(z1.e(rVar, 54), p0.f.a(32)), z ? dl.a.i : dl.a.o, i2.b0.b), z, onClick), 8, 4);
            w0 w0VarD = h0.o.d(b2.b.E, false);
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
            l1.q.I(w0VarD, g0Var, b3.h.f);
            l1.q.I(m1VarM, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC, g0Var, b3.h.d);
            g0Var.c0(484159344);
            z6.b(text, (b2.r) null, dl.a.L, kh.o.z(16), q3.u.D, (q3.i) null, 0L, (x3.l) null, new x3.k(3), 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 0, 261034);
            g0Var = g0Var;
            g0Var.r(false);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new i(text, onClick, rVar, z, i);
        }
    }

    public static final void l(ju.h reciter, u00.k onReciterToggle, b2.r rVar, long j, l1.j jVar, int i) {
        b2.r rVar2;
        kotlin.jvm.internal.m.e(reciter, "reciter");
        kotlin.jvm.internal.m.e(onReciterToggle, "onReciterToggle");
        g0 g0Var = (g0) jVar;
        g0Var.e0(900442460);
        int i2 = i | (g0Var.g(reciter) ? 4 : 2) | (g0Var.i(onReciterToggle) ? 32 : 16) | 384 | (g0Var.f(j) ? 2048 : 1024);
        if (g0Var.S(i2 & 1, (i2 & 1171) != 1170)) {
            b2.r rVar3 = b2.o.A;
            b2.r rVarD = z1.d(rVar3, 1.0f);
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z = (i3 == 32) | (i4 == 4);
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (z || objN == obj) {
                objN = new o(onReciterToggle, reciter, 0);
                g0Var.n0(objN);
            }
            b2.r rVarN = w50.c.n(rVarD, true, (u00.a) objN);
            float f = 12;
            v1 v1VarA = t1.a(h0.i.g(f), b2.b.K, g0Var, 54);
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
            wb.h hVar = new wb.h((Context) g0Var.k(o0.b));
            String str = reciter.c;
            if (str.length() <= 0) {
                str = null;
            }
            hVar.c = str;
            mb.j jVarI = mb.l.i(w.c.q(hVar, 600), (z2.p) null, g0Var, 0, 62);
            boolean z2 = reciter.d;
            boolean z3 = (i3 == 32) | (i4 == 4);
            Object objN2 = g0Var.N();
            if (z3 || objN2 == obj) {
                objN2 = new q(onReciterToggle, reciter, 0);
                g0Var.n0(objN2);
            }
            float f2 = f0.a;
            long j2 = dl.a.i;
            j0.a(z2, (u00.k) objN2, (b2.r) null, false, f0.a(j2, i2.t.b(0.2f, j2), dl.a.L, g0Var), g0Var, 0, 44);
            z.n.c(jVarI, (String) null, rd.a.g0(f, 0, dl.a.s, f2.h.c(z1.m(rVar3, 44), p0.f.a), !(jVarI.j() instanceof mb.g)), (b2.d) null, z2.o.a, 0.0f, g0Var, 24624, 104);
            z6.b(reciter.b, (b2.r) null, dl.a.k, j, (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 2, 0, (u00.k) null, (r0) null, g0Var, (i2 << 3) & 57344, 24576, 245738);
            g0Var = g0Var;
            g0Var.r(true);
            rVar2 = rVar3;
        } else {
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new d6.b(reciter, onReciterToggle, rVar2, j, i);
        }
    }

    public static final void m(final ju.f page, final lu.z zVar, final u00.k onSearchChanged, final u00.k onReciterToggle, final u00.a aVar, l1.j jVar, int i) {
        l1.j jVar2;
        kotlin.jvm.internal.m.e(page, "page");
        kotlin.jvm.internal.m.e(onSearchChanged, "onSearchChanged");
        kotlin.jvm.internal.m.e(onReciterToggle, "onReciterToggle");
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(-1657656326);
        int i2 = i | (jVar3.g(page) ? 4 : 2) | (jVar3.g(zVar) ? 32 : 16) | (jVar3.i(onSearchChanged) ? 256 : 128) | (jVar3.i(onReciterToggle) ? 2048 : 1024) | (jVar3.i(aVar) ? 131072 : 65536);
        if (jVar3.S(i2 & 1, (74899 & i2) != 74898)) {
            gm.a aVar2 = (gm.a) jVar3.k(dl.e.a);
            final Context context = (Context) jVar3.k(o0.b);
            final w2 w2Var = (w2) jVar3.k(o1.s);
            u30.b bVar = zVar.d;
            final ArrayList arrayList = new ArrayList();
            for (Object obj : bVar) {
                if (((ju.h) obj).d) {
                    arrayList.add(obj);
                }
            }
            gm.a aVar3 = gm.a.B;
            boolean z = aVar2 == aVar3;
            b2.o oVar = b2.o.A;
            b2.r rVarV = z1.c(oVar, 1.0f).V(aVar2 == aVar3 ? z1.q(oVar, 420) : z1.d(oVar, 1.0f));
            final boolean z2 = z;
            v1.c cVarD = v1.d.d(1667906896, new u00.o() {
                @Override
                public final java.lang.Object invoke(java.lang.Object r52, java.lang.Object r53, java.lang.Object r54) {
                    throw new UnsupportedOperationException("Method not decompiled: mu.r.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, jVar3);
            jVar2 = jVar3;
            h0.c.a(rVarV, (b2.d) null, false, cVarD, jVar2, 3072, 6);
        } else {
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new cz.g(page, zVar, onSearchChanged, onReciterToggle, aVar, i);
        }
    }

    public static final void n(b2.r rVar, String str, u00.k kVar, boolean z, l1.j jVar, int i, int i2) {
        b2.r rVar2;
        int i3;
        String str2;
        int i4;
        int i5;
        u00.k kVar2;
        int i6;
        int i7;
        int i8;
        boolean z2;
        int i9;
        int i11;
        boolean z3;
        l1.j jVar2;
        String str3;
        u00.k kVar3;
        boolean z4;
        r1 r1VarT;
        int i12;
        Object obj;
        b2.r rVar3;
        String str4;
        int i13;
        u00.k kVar4;
        boolean z5;
        Object objN;
        z0.g gVarH;
        boolean zG;
        Object objN2;
        k00.c cVar;
        String str5;
        z0.g gVar;
        u00.n nVar;
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(405784880);
        int i14 = i2 & 1;
        if (i14 != 0) {
            i3 = i | 6;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i3 = i | (jVar3.g(rVar2) ? 4 : 2);
        }
        if ((i2 & 2) == 0) {
            str2 = str;
            int i15 = jVar3.g(str2) ? 32 : 16;
            i4 = i3 | i15;
            i5 = i2 & 4;
            if (i5 != 0) {
                i7 = i4 | 384;
                kVar2 = kVar;
            } else {
                kVar2 = kVar;
                if (jVar3.i(kVar2)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i7 = i4 | i6;
            }
            i8 = i2 & 8;
            if (i8 != 0) {
                i11 = i7 | 3072;
                z2 = z;
            } else {
                z2 = z;
                if (jVar3.h(z2)) {
                    i9 = 2048;
                } else {
                    i9 = 1024;
                }
                i11 = i7 | i9;
            }
            if ((i11 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (jVar3.S(i11 & 1, z3)) {
                jVar3.X();
                i12 = i & 1;
                obj = l1.i.a;
                if (i12 != 0 || jVar3.A()) {
                    if (i14 != 0) {
                        rVar3 = b2.o.A;
                    } else {
                        rVar3 = rVar2;
                    }
                    if ((i2 & 2) != 0) {
                        i11 &= -113;
                        str4 = "";
                    } else {
                        str4 = str2;
                    }
                    if (i5 != 0) {
                        objN = jVar3.N();
                        if (objN == obj) {
                            objN = new m3.c0(9);
                            jVar3.n0(objN);
                        }
                        kVar2 = (u00.k) objN;
                    }
                    i13 = i11;
                    kVar4 = kVar2;
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                } else {
                    jVar3.V();
                    if ((i2 & 2) != 0) {
                        i11 &= -113;
                    }
                    rVar3 = rVar2;
                    str4 = str2;
                    z5 = z2;
                    i13 = i11;
                    kVar4 = kVar2;
                }
                jVar3.s();
                int i16 = i13 >> 3;
                gVarH = z0.h.h(str4, jVar3, i16 & 14);
                zG = jVar3.g(gVarH) | ((i13 & 896) == 256);
                objN2 = jVar3.N();
                cVar = null;
                if (zG || objN2 == obj) {
                    objN2 = new c00.s(gVarH, kVar4, cVar, 5);
                    jVar3.n0(objN2);
                }
                l1.q.i(gVarH, jVar3, (u00.n) objN2);
                b2.r rVarE = z1.e(z1.d(rVar3, 1.0f), 40);
                p0.e eVarA = p0.f.a(32);
                z0.e eVar = z0.e.B;
                c5 c5Var = c5.a;
                long j = dl.a.i;
                long jB = i2.t.b(0.16f, j);
                long jB2 = i2.t.b(0.08f, j);
                long jB3 = i2.t.b(0.08f, j);
                long jB4 = i2.t.b(0.16f, j);
                long jB5 = i2.t.b(0.08f, j);
                long jB6 = i2.t.b(0.08f, j);
                b2.r rVar4 = rVar3;
                long j2 = dl.a.k;
                str5 = str4;
                u00.k kVar5 = kVar4;
                t6 t6VarC = c5.c(j2, j2, j2, 0L, jB, jB2, jB3, 0L, 0L, jB4, jB5, jB6, 0L, i2.t.b(0.6f, j2), i2.t.b(0.6f, j2), i2.t.b(0.6f, j2), jVar3, 1207945096);
                p1 p1VarE = h0.c.e(16, 0.0f, 2);
                if (str5.length() > 0) {
                    jVar3.c0(-1593460889);
                    gVar = gVarH;
                    u00.n nVarD = v1.d.d(1500872133, new c00.p(gVar, 4), jVar3);
                    jVar3.r(false);
                    nVar = nVarD;
                } else {
                    gVar = gVarH;
                    jVar3.c0(-1593012970);
                    jVar3.r(false);
                    nVar = null;
                }
                jVar2 = jVar3;
                z0.g gVar2 = gVar;
                boolean z6 = z5;
                n5.c(gVar2, rVarE, z6, (r0) null, (w6) null, d, e, nVar, false, (i1) null, (qp.b) null, eVar, (z.p1) null, eVarA, t6VarC, p1VarE, jVar2, (i16 & 896) | 113246208, 100663296, 18611320);
                z4 = z6;
                str3 = str5;
                rVar2 = rVar4;
                kVar3 = kVar5;
            } else {
                jVar2 = jVar3;
                jVar2.V();
                str3 = str2;
                kVar3 = kVar2;
                z4 = z2;
            }
            r1VarT = jVar2.t();
            if (r1VarT != null) {
                r1VarT.d = new kv.b(rVar2, str3, kVar3, z4, i, i2);
            }
        }
        str2 = str;
        i4 = i3 | i15;
        i5 = i2 & 4;
        if (i5 != 0) {
            i7 = i4 | 384;
            kVar2 = kVar;
        } else {
            kVar2 = kVar;
            if (jVar3.i(kVar2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i7 = i4 | i6;
        }
        i8 = i2 & 8;
        if (i8 != 0) {
            i11 = i7 | 3072;
            z2 = z;
        } else {
            z2 = z;
            if (jVar3.h(z2)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i11 = i7 | i9;
        }
        if ((i11 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (jVar3.S(i11 & 1, z3)) {
            jVar3.X();
            i12 = i & 1;
            obj = l1.i.a;
            if (i12 != 0) {
                if (i14 != 0) {
                    rVar3 = b2.o.A;
                } else {
                    rVar3 = rVar2;
                }
                if ((i2 & 2) != 0) {
                    i11 &= -113;
                    str4 = "";
                } else {
                    str4 = str2;
                }
                if (i5 != 0) {
                    objN = jVar3.N();
                    if (objN == obj) {
                        objN = new m3.c0(9);
                        jVar3.n0(objN);
                    }
                    kVar2 = (u00.k) objN;
                }
                i13 = i11;
                kVar4 = kVar2;
                if (i8 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
            } else {
                if (i14 != 0) {
                    rVar3 = b2.o.A;
                } else {
                    rVar3 = rVar2;
                }
                if ((i2 & 2) != 0) {
                    i11 &= -113;
                    str4 = "";
                } else {
                    str4 = str2;
                }
                if (i5 != 0) {
                    objN = jVar3.N();
                    if (objN == obj) {
                        objN = new m3.c0(9);
                        jVar3.n0(objN);
                    }
                    kVar2 = (u00.k) objN;
                }
                i13 = i11;
                kVar4 = kVar2;
                if (i8 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
            }
            jVar3.s();
            int i17 = i13 >> 3;
            gVarH = z0.h.h(str4, jVar3, i17 & 14);
            zG = jVar3.g(gVarH) | ((i13 & 896) == 256);
            objN2 = jVar3.N();
            cVar = null;
            if (zG) {
                objN2 = new c00.s(gVarH, kVar4, cVar, 5);
                jVar3.n0(objN2);
            } else {
                objN2 = new c00.s(gVarH, kVar4, cVar, 5);
                jVar3.n0(objN2);
            }
            l1.q.i(gVarH, jVar3, (u00.n) objN2);
            b2.r rVarE2 = z1.e(z1.d(rVar3, 1.0f), 40);
            p0.e eVarA2 = p0.f.a(32);
            z0.e eVar2 = z0.e.B;
            c5 c5Var2 = c5.a;
            long j3 = dl.a.i;
            long jB7 = i2.t.b(0.16f, j3);
            long jB8 = i2.t.b(0.08f, j3);
            long jB9 = i2.t.b(0.08f, j3);
            long jB10 = i2.t.b(0.16f, j3);
            long jB11 = i2.t.b(0.08f, j3);
            long jB12 = i2.t.b(0.08f, j3);
            b2.r rVar5 = rVar3;
            long j4 = dl.a.k;
            str5 = str4;
            u00.k kVar6 = kVar4;
            t6 t6VarC2 = c5.c(j4, j4, j4, 0L, jB7, jB8, jB9, 0L, 0L, jB10, jB11, jB12, 0L, i2.t.b(0.6f, j4), i2.t.b(0.6f, j4), i2.t.b(0.6f, j4), jVar3, 1207945096);
            p1 p1VarE2 = h0.c.e(16, 0.0f, 2);
            if (str5.length() > 0) {
                jVar3.c0(-1593460889);
                gVar = gVarH;
                u00.n nVarD2 = v1.d.d(1500872133, new c00.p(gVar, 4), jVar3);
                jVar3.r(false);
                nVar = nVarD2;
            } else {
                gVar = gVarH;
                jVar3.c0(-1593012970);
                jVar3.r(false);
                nVar = null;
            }
            jVar2 = jVar3;
            z0.g gVar3 = gVar;
            boolean z7 = z5;
            n5.c(gVar3, rVarE2, z7, (r0) null, (w6) null, d, e, nVar, false, (i1) null, (qp.b) null, eVar2, (z.p1) null, eVarA2, t6VarC2, p1VarE2, jVar2, (i17 & 896) | 113246208, 100663296, 18611320);
            z4 = z7;
            str3 = str5;
            rVar2 = rVar5;
            kVar3 = kVar6;
        } else {
            jVar2 = jVar3;
            jVar2.V();
            str3 = str2;
            kVar3 = kVar2;
            z4 = z2;
        }
        r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new kv.b(rVar2, str3, kVar3, z4, i, i2);
        }
    }

    public static final void o(ju.h reciter, u00.k onReciterToggle, b2.r rVar, l1.j jVar, int i) {
        kotlin.jvm.internal.m.e(reciter, "reciter");
        kotlin.jvm.internal.m.e(onReciterToggle, "onReciterToggle");
        g0 g0Var = (g0) jVar;
        g0Var.e0(2126687441);
        int i2 = i | (g0Var.g(reciter) ? 4 : 2) | (g0Var.i(onReciterToggle) ? 32 : 16) | (g0Var.g(rVar) ? 256 : 128);
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            wb.h hVar = new wb.h((Context) g0Var.k(o0.b));
            String str = reciter.c;
            if (str.length() <= 0) {
                str = null;
            }
            hVar.c = str;
            mb.j jVarI = mb.l.i(w.c.q(hVar, 600), (z2.p) null, g0Var, 0, 62);
            b2.r rVarE = z1.e(z1.q(rVar, 75), 125);
            h0.v vVarA = h0.u.a(h0.i.g(6), b2.b.N, g0Var, 54);
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
            w0 w0VarD = h0.o.d(b2.b.E, false);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.o oVar = b2.o.A;
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
            z.n.c(jVarI, (String) null, rd.a.g0(12, 0, dl.a.s, f2.h.c(z1.m(oVar, 64), p0.f.a), !(jVarI.j() instanceof mb.g)), (b2.d) null, z2.o.a, 0.0f, g0Var, 24624, 104);
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object objN = g0Var.N();
            if (z || objN == l1.i.a) {
                objN = new o(onReciterToggle, reciter, 1);
                g0Var.n0(objN);
            }
            x5.d((u00.a) objN, h0.c.z(oVar, 24, -22), false, (l3) null, (t0) null, c, g0Var, 1572912, 60);
            g0Var.r(true);
            z6.b(r30.k.e1(r30.k.j1(reciter.b).toString(), " "), (b2.r) null, dl.a.k, 0L, (q3.u) null, (q3.i) null, 0L, (x3.l) null, new x3.k(3), 0L, 2, false, 2, 0, (u00.k) null, (r0) null, g0Var, 0, 24960, 240634);
            g0Var = g0Var;
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new b1.n(i, 19, reciter, onReciterToggle, rVar);
        }
    }

    public static final void p(final String str, final float f, final long j, final long j2, l1.j jVar, final int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1558021816);
        int i2 = i | (g0Var.g(str) ? 4 : 2) | (g0Var.d(f) ? 32 : 16) | (g0Var.f(j) ? 256 : 128) | (g0Var.f(j2) ? 2048 : 1024);
        if (g0Var.S(i2 & 1, (i2 & 1171) != 1170)) {
            v1 v1VarA = t1.a(h0.i.a, b2.b.K, g0Var, 48);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.o oVar = b2.o.A;
            b2.r rVarC = b2.a.c(oVar, g0Var);
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
            m2.b bVarR = y3.R(2131231365, g0Var, 0);
            long j3 = dl.a.f;
            z3.j(bVarR, (String) null, z1.m(oVar, f), j3, g0Var, 56, 0);
            h0.v vVarA = h0.u.a(h0.i.c, b2.b.N, g0Var, 48);
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
            z6.b(str.concat("⭐"), (b2.r) null, dl.a.i, j, q3.u.E, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.F(y3.o.c(j) * 1.2f, 4294967296L), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, ((i2 << 6) & 57344) | 1572864, 0, 260010);
            z6.b(z3.U(g0Var, 2131886947), (b2.r) null, i2.t.b(0.5f, dl.a.k), j2, (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, (i2 << 3) & 57344, 0, 262122);
            g0Var = g0Var;
            g0Var.r(true);
            z3.j(y3.R(2131231366, g0Var, 0), (String) null, z1.m(oVar, f), j3, g0Var, 56, 0);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n(str, f, j, j2, i) {
                public final String A;
                public final float B;
                public final long C;
                public final long D;

                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = l1.q.K(1);
                    d.p(this.A, this.B, this.C, this.D, (l1.j) obj, iK);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void q(ju.d dVar, ju.l lVar, b2.r rVar, l1.j jVar, int i) {
        ju.d review = dVar;
        ju.l lVar2 = lVar;
        kotlin.jvm.internal.m.e(review, "review");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1399869767);
        int i2 = i | (g0Var.g(review) ? 4 : 2) | (g0Var.g(lVar2) ? 32 : 16) | (g0Var.g(rVar) ? 256 : 128);
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            wb.h hVar = new wb.h((Context) g0Var.k(o0.b));
            hVar.c = Integer.valueOf(review.a);
            mb.j jVarI = mb.l.i(w.c.q(hVar, 600), (z2.p) null, g0Var, 0, 62);
            b2.r rVarC = f2.h.c(rVar, p0.f.a(lVar2.h));
            long j = dl.a.i;
            b2.r rVarD = h0.c.D(z.n.f(rVarC, i2.t.b(0.08f, j), i2.b0.b), lVar2.i, lVar2.j);
            h0.f fVarG = h0.i.g(8);
            b2.g gVar = b2.b.M;
            h0.v vVarA = h0.u.a(fVarG, gVar, g0Var, 6);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarD, g0Var);
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
            b2.r rVarD2 = z1.d(oVar, 1.0f);
            v1 v1VarA = t1.a(h0.i.g, b2.b.J, g0Var, 54);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC3 = b2.a.c(rVarD2, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar2);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA, g0Var, fVar);
            l1.q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC3, g0Var, fVar4);
            v1 v1VarA2 = t1.a(h0.i.g(10), b2.b.K, g0Var, 54);
            int iHashCode3 = Long.hashCode(g0Var.T);
            m1 m1VarM3 = g0Var.m();
            b2.r rVarC4 = b2.a.c(oVar, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar2);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA2, g0Var, fVar);
            l1.q.I(m1VarM3, g0Var, fVar2);
            a1.b.v(iHashCode3, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC4, g0Var, fVar4);
            z.n.c(jVarI, (String) null, f2.h.c(z1.m(oVar, lVar2.f), p0.f.a), (b2.d) null, z2.o.a, 0.0f, g0Var, 24624, 104);
            h0.v vVarA2 = h0.u.a(h0.i.g(-4), gVar, g0Var, 6);
            int iHashCode4 = Long.hashCode(g0Var.T);
            m1 m1VarM4 = g0Var.m();
            b2.r rVarC5 = b2.a.c(oVar, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar2);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA2, g0Var, fVar);
            l1.q.I(m1VarM4, g0Var, fVar2);
            a1.b.v(iHashCode4, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC5, g0Var, fVar4);
            review = dVar;
            lVar2 = lVar;
            z6.b(z3.U(g0Var, review.b), (b2.r) null, j, lVar2.o, q3.u.D, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1572864, 0, 262058);
            z6.b(z3.U(g0Var, review.c), (b2.r) null, i2.t.b(0.5f, dl.a.k), lVar2.p, (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 0, 0, 262122);
            g0Var.r(true);
            g0Var.r(true);
            z6.b(z3.U(g0Var, 2131887295), (b2.r) null, dl.a.f, lVar2.q, (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 0, 0, 262122);
            g0Var.r(true);
            z6.b(z3.U(g0Var, review.d), (b2.r) null, i2.t.b(0.9f, j), lVar2.r, (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, lVar2.s, 2, false, 5, 0, (u00.k) null, (r0) null, g0Var, 0, 24960, 239594);
            g0Var = g0Var;
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new b1.n(i, 20, review, lVar2, rVar);
        }
    }

    public static final void r(final String str, final u30.b avatars, final float f, final long j, l1.j jVar, final int i) {
        kotlin.jvm.internal.m.e(avatars, "avatars");
        g0 g0Var = (g0) jVar;
        g0Var.e0(1746210227);
        int i2 = i | (g0Var.g(str) ? 4 : 2) | (g0Var.g(avatars) ? 32 : 16) | (g0Var.d(f) ? 256 : 128) | (g0Var.f(j) ? 2048 : 1024);
        if (g0Var.S(i2 & 1, (i2 & 1171) != 1170)) {
            h0.v vVarA = h0.u.a(h0.i.g(2), b2.b.N, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVar = b2.o.A;
            b2.r rVarC = b2.a.c(rVar, g0Var);
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
            v1 v1VarA = t1.a(h0.i.g(ab.a0.v(new y3.f((-0.18f) * f), new y3.f(-10)).A), b2.b.J, g0Var, 0);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVar, g0Var);
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
            g0Var.c0(1937337127);
            Iterator<E> it = avatars.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                wb.h hVar = new wb.h((Context) g0Var.k(o0.b));
                hVar.c = Integer.valueOf(iIntValue);
                z.n.c(mb.l.i(w.c.q(hVar, 600), (z2.p) null, g0Var, 0, 62), (String) null, f2.h.c(z1.m(rVar, f), p0.f.a), (b2.d) null, z2.o.a, 0.0f, g0Var, 24624, 104);
                rVar = rVar;
            }
            g0Var.r(false);
            g0Var.r(true);
            z6.b(str, (b2.r) null, i2.t.b(0.5f, dl.a.k), j, (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, (i2 & 14) | ((i2 << 3) & 57344), 0, 262122);
            g0Var = g0Var;
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n(str, avatars, f, j, i) {
                public final String A;
                public final u30.b B;
                public final float C;
                public final long D;

                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = l1.q.K(1);
                    d.r(this.A, this.B, this.C, this.D, (l1.j) obj, iK);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void s(final jk.a aVar, final int i, final boolean z, final float f, final float f2, final u00.a aVar2, b2.r rVar, l1.j jVar, final int i2) {
        l1.j jVar2;
        final b2.r rVar2;
        long j;
        float f3;
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(1023035909);
        int i3 = i2 | (jVar3.i(aVar) ? 4 : 2) | (jVar3.e(i) ? 32 : 16) | (jVar3.h(z) ? 256 : 128) | (jVar3.d(f) ? 2048 : 1024) | (jVar3.d(f2) ? 16384 : 8192) | (jVar3.i(aVar2) ? 131072 : 65536) | 1572864;
        if (jVar3.S(i3 & 1, (599187 & i3) != 599186)) {
            float f4 = 18;
            p0.e eVar = p0.f.a;
            if (z) {
                j = dl.a.i;
                f3 = 0.85f;
            } else {
                j = dl.a.P;
                f3 = 0.5f;
            }
            long jB = i2.t.b(f3, j);
            y3.f fVar = new y3.f(f);
            b2.r rVar3 = b2.o.A;
            jVar2 = jVar3;
            w50.c.f(aVar2, aVar, rVar3, false, false, 0.0f, fVar, 0L, jB, f4, eVar, 0, v1.d.d(19870097, new u00.o() {
                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    w1 LiquidButton = (w1) obj;
                    g0 g0Var = (l1.j) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    kotlin.jvm.internal.m.e(LiquidButton, "$this$LiquidButton");
                    g0 g0Var2 = g0Var;
                    if (g0Var2.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                        z3.j(y3.R(i, g0Var, 0), (String) null, z1.m(b2.o.A, f2), z ? dl.a.M : dl.a.i, g0Var, 56, 0);
                    } else {
                        g0Var2.V();
                    }
                    return g00.b0.a;
                }
            }, jVar3), jVar2, ((i3 >> 15) & 14) | 805306368 | ((i3 << 3) & 112) | 384 | ((i3 << 9) & 3670016), 432, 184);
            rVar2 = rVar3;
        } else {
            jVar2 = jVar3;
            jVar2.V();
            rVar2 = rVar;
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n(aVar, i, z, f, f2, aVar2, rVar2, i2) {
                public final jk.a A;
                public final int B;
                public final boolean C;
                public final float D;
                public final float E;
                public final u00.a F;
                public final b2.r G;

                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = l1.q.K(1);
                    d.s(this.A, this.B, this.C, this.D, this.E, this.F, this.G, (l1.j) obj, iK);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void t(int i, long j, long j2, float f, u00.a aVar, l1.j jVar, int i2) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-944961345);
        int i3 = i2 | (g0Var.e(i) ? 4 : 2) | (g0Var.f(j) ? 32 : 16) | (g0Var.f(j2) ? 256 : 128) | (g0Var.d(f) ? 2048 : 1024) | (g0Var.i(aVar) ? 16384 : 8192);
        if (g0Var.S(i3 & 1, (i3 & 9363) != 9362)) {
            b2.r rVarN = w50.c.n(z.n.f(f2.h.c(z1.m(b2.o.A, f), p0.f.a), j2, i2.b0.b), true, aVar);
            w0 w0VarD = h0.o.d(b2.b.E, false);
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
            o3.a(y3.R(i, g0Var, i3 & 14), (String) null, (b2.r) null, j, g0Var, 56 | ((i3 << 6) & 7168), 4);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new g(i, j, j2, f, aVar, i2);
        }
    }

    public static final void u(final ju.f page, b2.r rVar, long j, long j2, int i, float f, l1.j jVar, final int i2, final int i3) {
        int i4;
        b2.r rVar2;
        int i5;
        long j3;
        int i6;
        int i7;
        long j4;
        int i8;
        int i9;
        int i11;
        int i12;
        int i13;
        boolean z;
        final int i14;
        final float f2;
        final b2.r rVar3;
        final long j5;
        final long j6;
        r1 r1VarT;
        long jZ;
        long jZ2;
        int i15;
        float f3;
        String strU;
        long j7;
        long j8;
        long jF;
        boolean z2;
        Object objN;
        l1.c cVar;
        l1.z0 z0Var;
        Object objN2;
        l1.z0 z0Var2;
        Object objN3;
        boolean zG;
        Object objN4;
        long j9;
        kotlin.jvm.internal.m.e(page, "page");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-2035429139);
        if ((i2 & 6) == 0) {
            i4 = (g0Var.g(page) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i16 = i3 & 2;
        if (i16 == 0) {
            if ((i2 & 48) == 0) {
                rVar2 = rVar;
                i4 |= g0Var.g(rVar2) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                i4 |= 384;
                j3 = j;
            } else {
                j3 = j;
                if ((i2 & 384) == 0) {
                    if (g0Var.f(j3)) {
                        i6 = 256;
                    } else {
                        i6 = 128;
                    }
                    i4 |= i6;
                }
            }
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & 3072) == 0) {
                    j4 = j2;
                    if (g0Var.f(j4)) {
                        i8 = 2048;
                    } else {
                        i8 = 1024;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((i2 & 24576) == 0) {
                        if (g0Var.e(i)) {
                            i11 = 16384;
                        } else {
                            i11 = 8192;
                        }
                        i4 |= i11;
                    }
                    i12 = i3 & 32;
                    if (i12 != 0) {
                        i4 |= 196608;
                    } else if ((i2 & 196608) == 0) {
                        if (g0Var.d(f)) {
                            i13 = 131072;
                        } else {
                            i13 = 65536;
                        }
                        i4 |= i13;
                    }
                    if ((i4 & 74899) != 74898) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (g0Var.S(i4 & 1, z)) {
                        if (i16 != 0) {
                            rVar2 = b2.o.A;
                        }
                        if (i5 != 0) {
                            jZ = kh.o.z(36);
                        } else {
                            jZ = j3;
                        }
                        if (i7 != 0) {
                            jZ2 = kh.o.z(34);
                        } else {
                            jZ2 = j4;
                        }
                        if (i9 != 0) {
                            i15 = 2;
                        } else {
                            i15 = i;
                        }
                        if (i12 != 0) {
                            f3 = 1.0f;
                        } else {
                            f3 = f;
                        }
                        strU = z3.U(g0Var, page.b);
                        if (f3 >= 1.0f) {
                            g0Var.c0(-1120895528);
                            z6.b(strU, z1.d(rVar2, 1.0f), dl.a.i, jZ, q3.u.M, (q3.i) null, 0L, (x3.l) null, new x3.k(3), jZ2, 2, false, i15, 0, (u00.k) null, (r0) null, g0Var, ((i4 << 6) & 57344) | 1572864, ((i4 >> 6) & 112) | 384 | (i4 & 57344), 238504);
                            j8 = jZ2;
                            g0Var.r(false);
                            j9 = jZ;
                        } else {
                            j7 = jZ;
                            j8 = jZ2;
                            g0Var.c0(-1120515158);
                            jF = kh.o.F(ab.a0.x(f3, 0.1f, 1.0f) * y3.o.c(j7), 4294967296L);
                            z2 = (i4 & 896) == 256;
                            objN = g0Var.N();
                            cVar = l1.i.a;
                            if (z2 || objN == cVar) {
                                objN = l1.q.z(new y3.o(j7));
                                g0Var.n0(objN);
                            }
                            z0Var = (l1.z0) objN;
                            objN2 = g0Var.N();
                            if (objN2 == cVar) {
                                objN2 = l1.q.z(Boolean.FALSE);
                                g0Var.n0(objN2);
                            }
                            z0Var2 = (l1.z0) objN2;
                            long j11 = dl.a.i;
                            long j12 = ((y3.o) z0Var.getValue()).a;
                            q3.u uVar = q3.u.M;
                            int i17 = i4;
                            long jF2 = kh.o.F((y3.o.c(j8) / y3.o.c(j7)) * y3.o.c(((y3.o) z0Var.getValue()).a), 4294967296L);
                            b2.r rVarD = z1.d(rVar2, 1.0f);
                            objN3 = g0Var.N();
                            if (objN3 == cVar) {
                                objN3 = new o2(z0Var2, 12);
                                g0Var.n0(objN3);
                            }
                            b2.r rVarG = f2.h.g(rVarD, (u00.k) objN3);
                            x3.k kVar = new x3.k(3);
                            zG = g0Var.g(z0Var) | g0Var.f(jF);
                            objN4 = g0Var.N();
                            if (zG || objN4 == cVar) {
                                objN4 = new w(jF, z0Var, z0Var2, 0);
                                g0Var.n0(objN4);
                            }
                            j9 = j7;
                            z6.b(strU, rVarG, j11, j12, uVar, (q3.i) null, 0L, (x3.l) null, kVar, jF2, 1, false, i15, 0, (u00.k) objN4, (r0) null, g0Var, 1572864, (i17 & 57344) | 384, 172968);
                            g0Var.r(false);
                        }
                        rVar3 = rVar2;
                        j5 = j9;
                        i14 = i15;
                        j6 = j8;
                        f2 = f3;
                    } else {
                        g0Var.V();
                        i14 = i;
                        f2 = f;
                        rVar3 = rVar2;
                        j5 = j3;
                        j6 = j4;
                    }
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        r1VarT.d = new u00.n() {
                            @Override
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                d.u(page, rVar3, j5, j6, i14, f2, (l1.j) obj, l1.q.K(i2 | 1), i3);
                                return g00.b0.a;
                            }
                        };
                    }
                }
                i4 |= 24576;
                i12 = i3 & 32;
                if (i12 != 0) {
                    i4 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    if (g0Var.d(f)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i4 |= i13;
                }
                if ((i4 & 74899) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (g0Var.S(i4 & 1, z)) {
                    if (i16 != 0) {
                        rVar2 = b2.o.A;
                    }
                    if (i5 != 0) {
                        jZ = kh.o.z(36);
                    } else {
                        jZ = j3;
                    }
                    if (i7 != 0) {
                        jZ2 = kh.o.z(34);
                    } else {
                        jZ2 = j4;
                    }
                    if (i9 != 0) {
                        i15 = 2;
                    } else {
                        i15 = i;
                    }
                    if (i12 != 0) {
                        f3 = 1.0f;
                    } else {
                        f3 = f;
                    }
                    strU = z3.U(g0Var, page.b);
                    if (f3 >= 1.0f) {
                        g0Var.c0(-1120895528);
                        z6.b(strU, z1.d(rVar2, 1.0f), dl.a.i, jZ, q3.u.M, (q3.i) null, 0L, (x3.l) null, new x3.k(3), jZ2, 2, false, i15, 0, (u00.k) null, (r0) null, g0Var, ((i4 << 6) & 57344) | 1572864, ((i4 >> 6) & 112) | 384 | (i4 & 57344), 238504);
                        j8 = jZ2;
                        g0Var.r(false);
                        j9 = jZ;
                    } else {
                        j7 = jZ;
                        j8 = jZ2;
                        g0Var.c0(-1120515158);
                        jF = kh.o.F(ab.a0.x(f3, 0.1f, 1.0f) * y3.o.c(j7), 4294967296L);
                        if ((i4 & 896) == 256) {
                        }
                        objN = g0Var.N();
                        cVar = l1.i.a;
                        if (z2) {
                            objN = l1.q.z(new y3.o(j7));
                            g0Var.n0(objN);
                        } else {
                            objN = l1.q.z(new y3.o(j7));
                            g0Var.n0(objN);
                        }
                        z0Var = (l1.z0) objN;
                        objN2 = g0Var.N();
                        if (objN2 == cVar) {
                            objN2 = l1.q.z(Boolean.FALSE);
                            g0Var.n0(objN2);
                        }
                        z0Var2 = (l1.z0) objN2;
                        long j13 = dl.a.i;
                        long j14 = ((y3.o) z0Var.getValue()).a;
                        q3.u uVar2 = q3.u.M;
                        int i18 = i4;
                        long jF3 = kh.o.F((y3.o.c(j8) / y3.o.c(j7)) * y3.o.c(((y3.o) z0Var.getValue()).a), 4294967296L);
                        b2.r rVarD2 = z1.d(rVar2, 1.0f);
                        objN3 = g0Var.N();
                        if (objN3 == cVar) {
                            objN3 = new o2(z0Var2, 12);
                            g0Var.n0(objN3);
                        }
                        b2.r rVarG2 = f2.h.g(rVarD2, (u00.k) objN3);
                        x3.k kVar2 = new x3.k(3);
                        zG = g0Var.g(z0Var) | g0Var.f(jF);
                        objN4 = g0Var.N();
                        if (zG) {
                            objN4 = new w(jF, z0Var, z0Var2, 0);
                            g0Var.n0(objN4);
                        } else {
                            objN4 = new w(jF, z0Var, z0Var2, 0);
                            g0Var.n0(objN4);
                        }
                        j9 = j7;
                        z6.b(strU, rVarG2, j13, j14, uVar2, (q3.i) null, 0L, (x3.l) null, kVar2, jF3, 1, false, i15, 0, (u00.k) objN4, (r0) null, g0Var, 1572864, (i18 & 57344) | 384, 172968);
                        g0Var.r(false);
                    }
                    rVar3 = rVar2;
                    j5 = j9;
                    i14 = i15;
                    j6 = j8;
                    f2 = f3;
                } else {
                    g0Var.V();
                    i14 = i;
                    f2 = f;
                    rVar3 = rVar2;
                    j5 = j3;
                    j6 = j4;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.d = new u00.n() {
                        @Override
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            d.u(page, rVar3, j5, j6, i14, f2, (l1.j) obj, l1.q.K(i2 | 1), i3);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i4 |= 3072;
            j4 = j2;
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((i2 & 24576) == 0) {
                    if (g0Var.e(i)) {
                        i11 = 16384;
                    } else {
                        i11 = 8192;
                    }
                    i4 |= i11;
                }
                i12 = i3 & 32;
                if (i12 != 0) {
                    i4 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    if (g0Var.d(f)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i4 |= i13;
                }
                if ((i4 & 74899) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (g0Var.S(i4 & 1, z)) {
                    if (i16 != 0) {
                        rVar2 = b2.o.A;
                    }
                    if (i5 != 0) {
                        jZ = kh.o.z(36);
                    } else {
                        jZ = j3;
                    }
                    if (i7 != 0) {
                        jZ2 = kh.o.z(34);
                    } else {
                        jZ2 = j4;
                    }
                    if (i9 != 0) {
                        i15 = 2;
                    } else {
                        i15 = i;
                    }
                    if (i12 != 0) {
                        f3 = 1.0f;
                    } else {
                        f3 = f;
                    }
                    strU = z3.U(g0Var, page.b);
                    if (f3 >= 1.0f) {
                        g0Var.c0(-1120895528);
                        z6.b(strU, z1.d(rVar2, 1.0f), dl.a.i, jZ, q3.u.M, (q3.i) null, 0L, (x3.l) null, new x3.k(3), jZ2, 2, false, i15, 0, (u00.k) null, (r0) null, g0Var, ((i4 << 6) & 57344) | 1572864, ((i4 >> 6) & 112) | 384 | (i4 & 57344), 238504);
                        j8 = jZ2;
                        g0Var.r(false);
                        j9 = jZ;
                    } else {
                        j7 = jZ;
                        j8 = jZ2;
                        g0Var.c0(-1120515158);
                        jF = kh.o.F(ab.a0.x(f3, 0.1f, 1.0f) * y3.o.c(j7), 4294967296L);
                        if ((i4 & 896) == 256) {
                        }
                        objN = g0Var.N();
                        cVar = l1.i.a;
                        if (z2) {
                            objN = l1.q.z(new y3.o(j7));
                            g0Var.n0(objN);
                        } else {
                            objN = l1.q.z(new y3.o(j7));
                            g0Var.n0(objN);
                        }
                        z0Var = (l1.z0) objN;
                        objN2 = g0Var.N();
                        if (objN2 == cVar) {
                            objN2 = l1.q.z(Boolean.FALSE);
                            g0Var.n0(objN2);
                        }
                        z0Var2 = (l1.z0) objN2;
                        long j15 = dl.a.i;
                        long j16 = ((y3.o) z0Var.getValue()).a;
                        q3.u uVar3 = q3.u.M;
                        int i19 = i4;
                        long jF4 = kh.o.F((y3.o.c(j8) / y3.o.c(j7)) * y3.o.c(((y3.o) z0Var.getValue()).a), 4294967296L);
                        b2.r rVarD3 = z1.d(rVar2, 1.0f);
                        objN3 = g0Var.N();
                        if (objN3 == cVar) {
                            objN3 = new o2(z0Var2, 12);
                            g0Var.n0(objN3);
                        }
                        b2.r rVarG3 = f2.h.g(rVarD3, (u00.k) objN3);
                        x3.k kVar3 = new x3.k(3);
                        zG = g0Var.g(z0Var) | g0Var.f(jF);
                        objN4 = g0Var.N();
                        if (zG) {
                            objN4 = new w(jF, z0Var, z0Var2, 0);
                            g0Var.n0(objN4);
                        } else {
                            objN4 = new w(jF, z0Var, z0Var2, 0);
                            g0Var.n0(objN4);
                        }
                        j9 = j7;
                        z6.b(strU, rVarG3, j15, j16, uVar3, (q3.i) null, 0L, (x3.l) null, kVar3, jF4, 1, false, i15, 0, (u00.k) objN4, (r0) null, g0Var, 1572864, (i19 & 57344) | 384, 172968);
                        g0Var.r(false);
                    }
                    rVar3 = rVar2;
                    j5 = j9;
                    i14 = i15;
                    j6 = j8;
                    f2 = f3;
                } else {
                    g0Var.V();
                    i14 = i;
                    f2 = f;
                    rVar3 = rVar2;
                    j5 = j3;
                    j6 = j4;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.d = new u00.n() {
                        @Override
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            d.u(page, rVar3, j5, j6, i14, f2, (l1.j) obj, l1.q.K(i2 | 1), i3);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i4 |= 24576;
            i12 = i3 & 32;
            if (i12 != 0) {
                i4 |= 196608;
            } else if ((i2 & 196608) == 0) {
                if (g0Var.d(f)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i4 |= i13;
            }
            if ((i4 & 74899) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (g0Var.S(i4 & 1, z)) {
                if (i16 != 0) {
                    rVar2 = b2.o.A;
                }
                if (i5 != 0) {
                    jZ = kh.o.z(36);
                } else {
                    jZ = j3;
                }
                if (i7 != 0) {
                    jZ2 = kh.o.z(34);
                } else {
                    jZ2 = j4;
                }
                if (i9 != 0) {
                    i15 = 2;
                } else {
                    i15 = i;
                }
                if (i12 != 0) {
                    f3 = 1.0f;
                } else {
                    f3 = f;
                }
                strU = z3.U(g0Var, page.b);
                if (f3 >= 1.0f) {
                    g0Var.c0(-1120895528);
                    z6.b(strU, z1.d(rVar2, 1.0f), dl.a.i, jZ, q3.u.M, (q3.i) null, 0L, (x3.l) null, new x3.k(3), jZ2, 2, false, i15, 0, (u00.k) null, (r0) null, g0Var, ((i4 << 6) & 57344) | 1572864, ((i4 >> 6) & 112) | 384 | (i4 & 57344), 238504);
                    j8 = jZ2;
                    g0Var.r(false);
                    j9 = jZ;
                } else {
                    j7 = jZ;
                    j8 = jZ2;
                    g0Var.c0(-1120515158);
                    jF = kh.o.F(ab.a0.x(f3, 0.1f, 1.0f) * y3.o.c(j7), 4294967296L);
                    if ((i4 & 896) == 256) {
                    }
                    objN = g0Var.N();
                    cVar = l1.i.a;
                    if (z2) {
                        objN = l1.q.z(new y3.o(j7));
                        g0Var.n0(objN);
                    } else {
                        objN = l1.q.z(new y3.o(j7));
                        g0Var.n0(objN);
                    }
                    z0Var = (l1.z0) objN;
                    objN2 = g0Var.N();
                    if (objN2 == cVar) {
                        objN2 = l1.q.z(Boolean.FALSE);
                        g0Var.n0(objN2);
                    }
                    z0Var2 = (l1.z0) objN2;
                    long j17 = dl.a.i;
                    long j18 = ((y3.o) z0Var.getValue()).a;
                    q3.u uVar4 = q3.u.M;
                    int i110 = i4;
                    long jF5 = kh.o.F((y3.o.c(j8) / y3.o.c(j7)) * y3.o.c(((y3.o) z0Var.getValue()).a), 4294967296L);
                    b2.r rVarD4 = z1.d(rVar2, 1.0f);
                    objN3 = g0Var.N();
                    if (objN3 == cVar) {
                        objN3 = new o2(z0Var2, 12);
                        g0Var.n0(objN3);
                    }
                    b2.r rVarG4 = f2.h.g(rVarD4, (u00.k) objN3);
                    x3.k kVar4 = new x3.k(3);
                    zG = g0Var.g(z0Var) | g0Var.f(jF);
                    objN4 = g0Var.N();
                    if (zG) {
                        objN4 = new w(jF, z0Var, z0Var2, 0);
                        g0Var.n0(objN4);
                    } else {
                        objN4 = new w(jF, z0Var, z0Var2, 0);
                        g0Var.n0(objN4);
                    }
                    j9 = j7;
                    z6.b(strU, rVarG4, j17, j18, uVar4, (q3.i) null, 0L, (x3.l) null, kVar4, jF5, 1, false, i15, 0, (u00.k) objN4, (r0) null, g0Var, 1572864, (i110 & 57344) | 384, 172968);
                    g0Var.r(false);
                }
                rVar3 = rVar2;
                j5 = j9;
                i14 = i15;
                j6 = j8;
                f2 = f3;
            } else {
                g0Var.V();
                i14 = i;
                f2 = f;
                rVar3 = rVar2;
                j5 = j3;
                j6 = j4;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        d.u(page, rVar3, j5, j6, i14, f2, (l1.j) obj, l1.q.K(i2 | 1), i3);
                        return g00.b0.a;
                    }
                };
            }
        }
        i4 |= 48;
        rVar2 = rVar;
        i5 = i3 & 4;
        if (i5 != 0) {
            i4 |= 384;
            j3 = j;
        } else {
            j3 = j;
            if ((i2 & 384) == 0) {
                if (g0Var.f(j3)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i4 |= i6;
            }
        }
        i7 = i3 & 8;
        if (i7 != 0) {
            if ((i2 & 3072) == 0) {
                j4 = j2;
                if (g0Var.f(j4)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i4 |= i8;
            }
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((i2 & 24576) == 0) {
                    if (g0Var.e(i)) {
                        i11 = 16384;
                    } else {
                        i11 = 8192;
                    }
                    i4 |= i11;
                }
                i12 = i3 & 32;
                if (i12 != 0) {
                    i4 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    if (g0Var.d(f)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i4 |= i13;
                }
                if ((i4 & 74899) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (g0Var.S(i4 & 1, z)) {
                    if (i16 != 0) {
                        rVar2 = b2.o.A;
                    }
                    if (i5 != 0) {
                        jZ = kh.o.z(36);
                    } else {
                        jZ = j3;
                    }
                    if (i7 != 0) {
                        jZ2 = kh.o.z(34);
                    } else {
                        jZ2 = j4;
                    }
                    if (i9 != 0) {
                        i15 = 2;
                    } else {
                        i15 = i;
                    }
                    if (i12 != 0) {
                        f3 = 1.0f;
                    } else {
                        f3 = f;
                    }
                    strU = z3.U(g0Var, page.b);
                    if (f3 >= 1.0f) {
                        g0Var.c0(-1120895528);
                        z6.b(strU, z1.d(rVar2, 1.0f), dl.a.i, jZ, q3.u.M, (q3.i) null, 0L, (x3.l) null, new x3.k(3), jZ2, 2, false, i15, 0, (u00.k) null, (r0) null, g0Var, ((i4 << 6) & 57344) | 1572864, ((i4 >> 6) & 112) | 384 | (i4 & 57344), 238504);
                        j8 = jZ2;
                        g0Var.r(false);
                        j9 = jZ;
                    } else {
                        j7 = jZ;
                        j8 = jZ2;
                        g0Var.c0(-1120515158);
                        jF = kh.o.F(ab.a0.x(f3, 0.1f, 1.0f) * y3.o.c(j7), 4294967296L);
                        if ((i4 & 896) == 256) {
                        }
                        objN = g0Var.N();
                        cVar = l1.i.a;
                        if (z2) {
                            objN = l1.q.z(new y3.o(j7));
                            g0Var.n0(objN);
                        } else {
                            objN = l1.q.z(new y3.o(j7));
                            g0Var.n0(objN);
                        }
                        z0Var = (l1.z0) objN;
                        objN2 = g0Var.N();
                        if (objN2 == cVar) {
                            objN2 = l1.q.z(Boolean.FALSE);
                            g0Var.n0(objN2);
                        }
                        z0Var2 = (l1.z0) objN2;
                        long j19 = dl.a.i;
                        long j110 = ((y3.o) z0Var.getValue()).a;
                        q3.u uVar5 = q3.u.M;
                        int i111 = i4;
                        long jF6 = kh.o.F((y3.o.c(j8) / y3.o.c(j7)) * y3.o.c(((y3.o) z0Var.getValue()).a), 4294967296L);
                        b2.r rVarD5 = z1.d(rVar2, 1.0f);
                        objN3 = g0Var.N();
                        if (objN3 == cVar) {
                            objN3 = new o2(z0Var2, 12);
                            g0Var.n0(objN3);
                        }
                        b2.r rVarG5 = f2.h.g(rVarD5, (u00.k) objN3);
                        x3.k kVar5 = new x3.k(3);
                        zG = g0Var.g(z0Var) | g0Var.f(jF);
                        objN4 = g0Var.N();
                        if (zG) {
                            objN4 = new w(jF, z0Var, z0Var2, 0);
                            g0Var.n0(objN4);
                        } else {
                            objN4 = new w(jF, z0Var, z0Var2, 0);
                            g0Var.n0(objN4);
                        }
                        j9 = j7;
                        z6.b(strU, rVarG5, j19, j110, uVar5, (q3.i) null, 0L, (x3.l) null, kVar5, jF6, 1, false, i15, 0, (u00.k) objN4, (r0) null, g0Var, 1572864, (i111 & 57344) | 384, 172968);
                        g0Var.r(false);
                    }
                    rVar3 = rVar2;
                    j5 = j9;
                    i14 = i15;
                    j6 = j8;
                    f2 = f3;
                } else {
                    g0Var.V();
                    i14 = i;
                    f2 = f;
                    rVar3 = rVar2;
                    j5 = j3;
                    j6 = j4;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.d = new u00.n() {
                        @Override
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            d.u(page, rVar3, j5, j6, i14, f2, (l1.j) obj, l1.q.K(i2 | 1), i3);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i4 |= 24576;
            i12 = i3 & 32;
            if (i12 != 0) {
                i4 |= 196608;
            } else if ((i2 & 196608) == 0) {
                if (g0Var.d(f)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i4 |= i13;
            }
            if ((i4 & 74899) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (g0Var.S(i4 & 1, z)) {
                if (i16 != 0) {
                    rVar2 = b2.o.A;
                }
                if (i5 != 0) {
                    jZ = kh.o.z(36);
                } else {
                    jZ = j3;
                }
                if (i7 != 0) {
                    jZ2 = kh.o.z(34);
                } else {
                    jZ2 = j4;
                }
                if (i9 != 0) {
                    i15 = 2;
                } else {
                    i15 = i;
                }
                if (i12 != 0) {
                    f3 = 1.0f;
                } else {
                    f3 = f;
                }
                strU = z3.U(g0Var, page.b);
                if (f3 >= 1.0f) {
                    g0Var.c0(-1120895528);
                    z6.b(strU, z1.d(rVar2, 1.0f), dl.a.i, jZ, q3.u.M, (q3.i) null, 0L, (x3.l) null, new x3.k(3), jZ2, 2, false, i15, 0, (u00.k) null, (r0) null, g0Var, ((i4 << 6) & 57344) | 1572864, ((i4 >> 6) & 112) | 384 | (i4 & 57344), 238504);
                    j8 = jZ2;
                    g0Var.r(false);
                    j9 = jZ;
                } else {
                    j7 = jZ;
                    j8 = jZ2;
                    g0Var.c0(-1120515158);
                    jF = kh.o.F(ab.a0.x(f3, 0.1f, 1.0f) * y3.o.c(j7), 4294967296L);
                    if ((i4 & 896) == 256) {
                    }
                    objN = g0Var.N();
                    cVar = l1.i.a;
                    if (z2) {
                        objN = l1.q.z(new y3.o(j7));
                        g0Var.n0(objN);
                    } else {
                        objN = l1.q.z(new y3.o(j7));
                        g0Var.n0(objN);
                    }
                    z0Var = (l1.z0) objN;
                    objN2 = g0Var.N();
                    if (objN2 == cVar) {
                        objN2 = l1.q.z(Boolean.FALSE);
                        g0Var.n0(objN2);
                    }
                    z0Var2 = (l1.z0) objN2;
                    long j111 = dl.a.i;
                    long j112 = ((y3.o) z0Var.getValue()).a;
                    q3.u uVar6 = q3.u.M;
                    int i112 = i4;
                    long jF7 = kh.o.F((y3.o.c(j8) / y3.o.c(j7)) * y3.o.c(((y3.o) z0Var.getValue()).a), 4294967296L);
                    b2.r rVarD6 = z1.d(rVar2, 1.0f);
                    objN3 = g0Var.N();
                    if (objN3 == cVar) {
                        objN3 = new o2(z0Var2, 12);
                        g0Var.n0(objN3);
                    }
                    b2.r rVarG6 = f2.h.g(rVarD6, (u00.k) objN3);
                    x3.k kVar6 = new x3.k(3);
                    zG = g0Var.g(z0Var) | g0Var.f(jF);
                    objN4 = g0Var.N();
                    if (zG) {
                        objN4 = new w(jF, z0Var, z0Var2, 0);
                        g0Var.n0(objN4);
                    } else {
                        objN4 = new w(jF, z0Var, z0Var2, 0);
                        g0Var.n0(objN4);
                    }
                    j9 = j7;
                    z6.b(strU, rVarG6, j111, j112, uVar6, (q3.i) null, 0L, (x3.l) null, kVar6, jF7, 1, false, i15, 0, (u00.k) objN4, (r0) null, g0Var, 1572864, (i112 & 57344) | 384, 172968);
                    g0Var.r(false);
                }
                rVar3 = rVar2;
                j5 = j9;
                i14 = i15;
                j6 = j8;
                f2 = f3;
            } else {
                g0Var.V();
                i14 = i;
                f2 = f;
                rVar3 = rVar2;
                j5 = j3;
                j6 = j4;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        d.u(page, rVar3, j5, j6, i14, f2, (l1.j) obj, l1.q.K(i2 | 1), i3);
                        return g00.b0.a;
                    }
                };
            }
        }
        i4 |= 3072;
        j4 = j2;
        i9 = i3 & 16;
        if (i9 != 0) {
            if ((i2 & 24576) == 0) {
                if (g0Var.e(i)) {
                    i11 = 16384;
                } else {
                    i11 = 8192;
                }
                i4 |= i11;
            }
            i12 = i3 & 32;
            if (i12 != 0) {
                i4 |= 196608;
            } else if ((i2 & 196608) == 0) {
                if (g0Var.d(f)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i4 |= i13;
            }
            if ((i4 & 74899) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (g0Var.S(i4 & 1, z)) {
                if (i16 != 0) {
                    rVar2 = b2.o.A;
                }
                if (i5 != 0) {
                    jZ = kh.o.z(36);
                } else {
                    jZ = j3;
                }
                if (i7 != 0) {
                    jZ2 = kh.o.z(34);
                } else {
                    jZ2 = j4;
                }
                if (i9 != 0) {
                    i15 = 2;
                } else {
                    i15 = i;
                }
                if (i12 != 0) {
                    f3 = 1.0f;
                } else {
                    f3 = f;
                }
                strU = z3.U(g0Var, page.b);
                if (f3 >= 1.0f) {
                    g0Var.c0(-1120895528);
                    z6.b(strU, z1.d(rVar2, 1.0f), dl.a.i, jZ, q3.u.M, (q3.i) null, 0L, (x3.l) null, new x3.k(3), jZ2, 2, false, i15, 0, (u00.k) null, (r0) null, g0Var, ((i4 << 6) & 57344) | 1572864, ((i4 >> 6) & 112) | 384 | (i4 & 57344), 238504);
                    j8 = jZ2;
                    g0Var.r(false);
                    j9 = jZ;
                } else {
                    j7 = jZ;
                    j8 = jZ2;
                    g0Var.c0(-1120515158);
                    jF = kh.o.F(ab.a0.x(f3, 0.1f, 1.0f) * y3.o.c(j7), 4294967296L);
                    if ((i4 & 896) == 256) {
                    }
                    objN = g0Var.N();
                    cVar = l1.i.a;
                    if (z2) {
                        objN = l1.q.z(new y3.o(j7));
                        g0Var.n0(objN);
                    } else {
                        objN = l1.q.z(new y3.o(j7));
                        g0Var.n0(objN);
                    }
                    z0Var = (l1.z0) objN;
                    objN2 = g0Var.N();
                    if (objN2 == cVar) {
                        objN2 = l1.q.z(Boolean.FALSE);
                        g0Var.n0(objN2);
                    }
                    z0Var2 = (l1.z0) objN2;
                    long j113 = dl.a.i;
                    long j114 = ((y3.o) z0Var.getValue()).a;
                    q3.u uVar7 = q3.u.M;
                    int i113 = i4;
                    long jF8 = kh.o.F((y3.o.c(j8) / y3.o.c(j7)) * y3.o.c(((y3.o) z0Var.getValue()).a), 4294967296L);
                    b2.r rVarD7 = z1.d(rVar2, 1.0f);
                    objN3 = g0Var.N();
                    if (objN3 == cVar) {
                        objN3 = new o2(z0Var2, 12);
                        g0Var.n0(objN3);
                    }
                    b2.r rVarG7 = f2.h.g(rVarD7, (u00.k) objN3);
                    x3.k kVar7 = new x3.k(3);
                    zG = g0Var.g(z0Var) | g0Var.f(jF);
                    objN4 = g0Var.N();
                    if (zG) {
                        objN4 = new w(jF, z0Var, z0Var2, 0);
                        g0Var.n0(objN4);
                    } else {
                        objN4 = new w(jF, z0Var, z0Var2, 0);
                        g0Var.n0(objN4);
                    }
                    j9 = j7;
                    z6.b(strU, rVarG7, j113, j114, uVar7, (q3.i) null, 0L, (x3.l) null, kVar7, jF8, 1, false, i15, 0, (u00.k) objN4, (r0) null, g0Var, 1572864, (i113 & 57344) | 384, 172968);
                    g0Var.r(false);
                }
                rVar3 = rVar2;
                j5 = j9;
                i14 = i15;
                j6 = j8;
                f2 = f3;
            } else {
                g0Var.V();
                i14 = i;
                f2 = f;
                rVar3 = rVar2;
                j5 = j3;
                j6 = j4;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        d.u(page, rVar3, j5, j6, i14, f2, (l1.j) obj, l1.q.K(i2 | 1), i3);
                        return g00.b0.a;
                    }
                };
            }
        }
        i4 |= 24576;
        i12 = i3 & 32;
        if (i12 != 0) {
            i4 |= 196608;
        } else if ((i2 & 196608) == 0) {
            if (g0Var.d(f)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i4 |= i13;
        }
        if ((i4 & 74899) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (g0Var.S(i4 & 1, z)) {
            if (i16 != 0) {
                rVar2 = b2.o.A;
            }
            if (i5 != 0) {
                jZ = kh.o.z(36);
            } else {
                jZ = j3;
            }
            if (i7 != 0) {
                jZ2 = kh.o.z(34);
            } else {
                jZ2 = j4;
            }
            if (i9 != 0) {
                i15 = 2;
            } else {
                i15 = i;
            }
            if (i12 != 0) {
                f3 = 1.0f;
            } else {
                f3 = f;
            }
            strU = z3.U(g0Var, page.b);
            if (f3 >= 1.0f) {
                g0Var.c0(-1120895528);
                z6.b(strU, z1.d(rVar2, 1.0f), dl.a.i, jZ, q3.u.M, (q3.i) null, 0L, (x3.l) null, new x3.k(3), jZ2, 2, false, i15, 0, (u00.k) null, (r0) null, g0Var, ((i4 << 6) & 57344) | 1572864, ((i4 >> 6) & 112) | 384 | (i4 & 57344), 238504);
                j8 = jZ2;
                g0Var.r(false);
                j9 = jZ;
            } else {
                j7 = jZ;
                j8 = jZ2;
                g0Var.c0(-1120515158);
                jF = kh.o.F(ab.a0.x(f3, 0.1f, 1.0f) * y3.o.c(j7), 4294967296L);
                if ((i4 & 896) == 256) {
                }
                objN = g0Var.N();
                cVar = l1.i.a;
                if (z2) {
                    objN = l1.q.z(new y3.o(j7));
                    g0Var.n0(objN);
                } else {
                    objN = l1.q.z(new y3.o(j7));
                    g0Var.n0(objN);
                }
                z0Var = (l1.z0) objN;
                objN2 = g0Var.N();
                if (objN2 == cVar) {
                    objN2 = l1.q.z(Boolean.FALSE);
                    g0Var.n0(objN2);
                }
                z0Var2 = (l1.z0) objN2;
                long j115 = dl.a.i;
                long j116 = ((y3.o) z0Var.getValue()).a;
                q3.u uVar8 = q3.u.M;
                int i114 = i4;
                long jF9 = kh.o.F((y3.o.c(j8) / y3.o.c(j7)) * y3.o.c(((y3.o) z0Var.getValue()).a), 4294967296L);
                b2.r rVarD8 = z1.d(rVar2, 1.0f);
                objN3 = g0Var.N();
                if (objN3 == cVar) {
                    objN3 = new o2(z0Var2, 12);
                    g0Var.n0(objN3);
                }
                b2.r rVarG8 = f2.h.g(rVarD8, (u00.k) objN3);
                x3.k kVar8 = new x3.k(3);
                zG = g0Var.g(z0Var) | g0Var.f(jF);
                objN4 = g0Var.N();
                if (zG) {
                    objN4 = new w(jF, z0Var, z0Var2, 0);
                    g0Var.n0(objN4);
                } else {
                    objN4 = new w(jF, z0Var, z0Var2, 0);
                    g0Var.n0(objN4);
                }
                j9 = j7;
                z6.b(strU, rVarG8, j115, j116, uVar8, (q3.i) null, 0L, (x3.l) null, kVar8, jF9, 1, false, i15, 0, (u00.k) objN4, (r0) null, g0Var, 1572864, (i114 & 57344) | 384, 172968);
                g0Var.r(false);
            }
            rVar3 = rVar2;
            j5 = j9;
            i14 = i15;
            j6 = j8;
            f2 = f3;
        } else {
            g0Var.V();
            i14 = i;
            f2 = f;
            rVar3 = rVar2;
            j5 = j3;
            j6 = j4;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    d.u(page, rVar3, j5, j6, i14, f2, (l1.j) obj, l1.q.K(i2 | 1), i3);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void v(b2.r rVar, l1.j jVar, int i) {
        b2.r rVar2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(926399142);
        int i2 = i | 6;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            boolean z = ((gm.a) g0Var.k(dl.e.a)) == gm.a.B;
            float f = z ? 24 : 16;
            b2.r rVarG = h0.c.G(z1.c, 0.0f, 0.0f, 0.0f, 70, 7);
            b2.i iVar = b2.b.H;
            w0 w0VarD = h0.o.d(iVar, false);
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
            b2.r rVar3 = b2.o.A;
            b2.r rVarE = z1.e(rVar3, 120);
            w0 w0VarD2 = h0.o.d(b2.b.A, false);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarE, g0Var);
            g0Var.g0();
            boolean z2 = z;
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD2, g0Var, fVar);
            l1.q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC2, g0Var, fVar4);
            h0.s sVar = h0.s.a;
            float f2 = 18;
            b2.r rVarB = f2.h.b(sVar.b(), f2, i2.b0.b);
            i2.t tVar = new i2.t(i2.t.f);
            long j = dl.a.L;
            h0.o.a(z.n.e(rVarB, sg.f.P(va.a.S(new i2.t[]{tVar, new i2.t(i2.t.b(0.65f, j)), new i2.t(i2.t.b(0.9f, j))}), 0.0f, 0.0f, 14), (t0) null, 6), g0Var, 0);
            z6.b(z3.U(g0Var, 2131886985), h0.c.G(h0.c.E(h0.c.E(sVar.a(z1.d(rVar3, 1.0f), iVar), f, 0.0f, 2), 0.0f, 10, 1), 0.0f, 0.0f, 0.0f, f2, 7), dl.a.i, ju.e.a(z2), (q3.u) null, (q3.i) null, 0L, (x3.l) null, new x3.k(3), ju.e.b(z2), 2, false, 2, 0, (u00.k) null, (r0) null, g0Var, 0, 24960, 238568);
            g0Var = g0Var;
            g0Var.r(true);
            g0Var.r(true);
            rVar2 = rVar3;
        } else {
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new bs.b(rVar2, i, 22);
        }
    }

    public static final void w(ju.f page, b2.r rVar, l1.j jVar, int i) {
        kotlin.jvm.internal.m.e(page, "page");
        g0 g0Var = (g0) jVar;
        g0Var.e0(267145778);
        int i2 = (g0Var.g(page) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            h0.c.a(rVar.V(z1.c), (b2.d) null, false, v1.d.d(-268018296, new y(page, 0), g0Var), g0Var, 3072, 6);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new z(page, rVar, i, 0);
        }
    }

    public static final void x(ju.j jVar, b2.r rVar, l1.j jVar2, int i) {
        u00.n nVar;
        boolean z;
        boolean z2;
        ju.j card = jVar;
        kotlin.jvm.internal.m.e(card, "card");
        Integer num = card.c;
        g0 g0Var = (g0) jVar2;
        g0Var.e0(1923219868);
        int i2 = i | (g0Var.g(card) ? 4 : 2) | (g0Var.g(rVar) ? 32 : 16);
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            gm.a aVar = (gm.a) g0Var.k(dl.e.a);
            gm.a aVar2 = gm.a.B;
            float f = aVar == aVar2 ? 16 : 12;
            float f2 = aVar == aVar2 ? 260 : 171;
            q2 q2Var = o0.b;
            wb.h hVar = new wb.h((Context) g0Var.k(q2Var));
            hVar.c = Integer.valueOf(card.b);
            mb.j jVarI = mb.l.i(w.c.q(hVar, 600), (z2.p) null, g0Var, 0, 62);
            wb.h hVar2 = new wb.h((Context) g0Var.k(q2Var));
            hVar2.c = num;
            mb.j jVarI2 = mb.l.i(w.c.q(hVar2, 600), (z2.p) null, g0Var, 0, 62);
            b2.r rVarM = h0.c.m(z1.q(rVar, f2), 1.0f);
            float f3 = 10;
            b2.r rVarC = f2.h.c(rVarM, p0.f.a(f3));
            b2.i iVar = b2.b.A;
            w0 w0VarD = h0.o.d(iVar, false);
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
            u00.n nVar2 = b3.h.d;
            l1.q.I(rVarC2, g0Var, nVar2);
            b2.r rVarG0 = rd.a.g0(f3, 0, dl.a.s, z1.c, !(jVarI.j() instanceof mb.g));
            d1 d1Var = z2.o.a;
            z.n.c(jVarI, (String) null, rVarG0, (b2.d) null, d1Var, 0.0f, g0Var, 24624, 104);
            h0.s sVar = h0.s.a;
            b2.o oVar = b2.o.A;
            if (num == null) {
                g0Var.c0(-1943651701);
                g0Var.r(false);
                nVar = nVar2;
                z = true;
            } else {
                g0Var.c0(-1943651700);
                b2.r rVarC3 = f2.h.c(z1.m(sVar.a(h0.c.G(oVar, f, f, 0.0f, 0.0f, 12), iVar), 58), p0.f.a);
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
                nVar = nVar2;
                l1.q.I(rVarC4, g0Var, nVar);
                z.n.c(jVarI2, (String) null, (b2.r) null, (b2.d) null, d1Var, 0.0f, g0Var, 24624, 108);
                z = true;
                g0Var.r(true);
                g0Var.r(false);
            }
            b2.r rVarG = h0.c.G(sVar.a(oVar, b2.b.G), f, 0.0f, 0.0f, f, 6);
            h0.v vVarA = h0.u.a(h0.i.g(2), b2.b.M, g0Var, 54);
            int iHashCode3 = Long.hashCode(g0Var.T);
            m1 m1VarM3 = g0Var.m();
            b2.r rVarC5 = b2.a.c(rVarG, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA, g0Var, fVar);
            l1.q.I(m1VarM3, g0Var, fVar2);
            a1.b.v(iHashCode3, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC5, g0Var, nVar);
            if (num == null) {
                g0Var.c0(-1121459922);
                g0Var.r(false);
                z2 = z;
            } else {
                g0Var.c0(-1121459921);
                z2 = z;
                z6.b(z3.U(g0Var, 2131886987), (b2.r) null, i2.t.b(0.5f, dl.a.i), kh.o.z(12), (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(16), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 24576, 48, 260074);
                g0Var = g0Var;
                g0Var.r(false);
            }
            card = jVar;
            g0 g0Var2 = g0Var;
            z6.b(z3.U(g0Var, card.a), (b2.r) null, dl.a.i, aVar == aVar2 ? kh.o.z(24) : kh.o.z(20), q3.u.M, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(20), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var2, 1572864, 48, 260010);
            g0Var = g0Var2;
            g0Var.r(z2);
            g0Var.r(z2);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new l0.g0(card, rVar, i, 7);
        }
    }

    public static final void y(b2.r rVar, l1.j jVar, int i) {
        b2.r rVar2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(791490054);
        int i2 = i | 6;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            boolean z = ((gm.a) g0Var.k(dl.e.a)) == gm.a.B;
            float f = z ? 140 : 180;
            float f2 = z ? 24 : 48;
            b2.r rVarG = h0.c.G(z1.c, 0.0f, 0.0f, 0.0f, 70, 7);
            b2.i iVar = b2.b.H;
            w0 w0VarD = h0.o.d(iVar, false);
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
            b2.r rVar3 = b2.o.A;
            b2.r rVarE = z1.e(rVar3, f);
            w0 w0VarD2 = h0.o.d(b2.b.A, false);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarE, g0Var);
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
            h0.s sVar = h0.s.a;
            b2.r rVarB = f2.h.b(sVar.b(), f2, i2.b0.b);
            g00.k kVar = new g00.k(Float.valueOf(0.0f), new i2.t(i2.t.f));
            Float fValueOf = Float.valueOf(0.25f);
            long j = dl.a.L;
            h0.o.a(z.n.e(rVarB, sg.f.Q(new g00.k[]{kVar, new g00.k(fValueOf, new i2.t(i2.t.b(0.25f, j))), new g00.k(Float.valueOf(0.5f), new i2.t(i2.t.b(0.65f, j))), new g00.k(Float.valueOf(0.75f), new i2.t(i2.t.b(0.89f, j))), new g00.k(Float.valueOf(1.0f), new i2.t(i2.t.b(0.95f, j)))}), (t0) null, 6), g0Var, 0);
            float f3 = 18;
            boolean z2 = z;
            z6.b(z3.U(g0Var, 2131886991), h0.c.G(h0.c.D(sVar.a(z1.d(rVar3, 1.0f), iVar), f3, 10), 0.0f, 0.0f, 0.0f, f3, 7), dl.a.i, ju.e.a(z2), (q3.u) null, (q3.i) null, 0L, (x3.l) null, new x3.k(3), ju.e.b(z2), 2, false, 2, 0, (u00.k) null, (r0) null, g0Var, 0, 24960, 238568);
            g0Var = g0Var;
            g0Var.r(true);
            g0Var.r(true);
            rVar2 = rVar3;
        } else {
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new bs.b(rVar2, i, 23);
        }
    }

    public static final void z(u30.b cards, l1.j jVar, int i) {
        b2.h hVar = b2.b.J;
        kotlin.jvm.internal.m.e(cards, "cards");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-2070323615);
        int i2 = (g0Var.g(cards) ? 4 : 2) | i;
        int i3 = 0;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            gm.a aVar = (gm.a) g0Var.k(dl.e.a);
            gm.a aVar2 = gm.a.B;
            float f = aVar == aVar2 ? 24 : 16;
            int i4 = aVar != aVar2 ? 2 : 4;
            b2.o oVar = b2.o.A;
            b2.r rVarE = h0.c.E(z1.t(z1.d(oVar, 1.0f), hVar, true), f, 0.0f, 2);
            h0.v vVarA = h0.u.a(h0.i.g(f), b2.b.N, g0Var, 48);
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
            g0Var.c0(-1435217491);
            for (List<ju.j> list : h00.q.E0(cards, i4)) {
                b2.r rVarD = z1.d(oVar, 1.0f);
                v1 v1VarA = t1.a(h0.i.g(f), hVar, g0Var, i3);
                int iHashCode2 = Long.hashCode(g0Var.T);
                m1 m1VarM2 = g0Var.m();
                b2.r rVarC2 = b2.a.c(rVarD, g0Var);
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
                g0Var.c0(360492163);
                for (ju.j jVar2 : list) {
                    if (1.0f <= 0.0d) {
                        i0.a.a("invalid weight; must be greater than zero");
                    }
                    x(jVar2, new c1(1.0f, true), g0Var, 0);
                }
                g0Var.r(false);
                g0Var.r(true);
                i3 = 0;
            }
            g0Var.r(i3);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new m3.a(cards, i, 2);
        }
    }
}
