package ox;

import android.content.Context;
import android.content.res.Configuration;
import b2.o;
import b2.r;
import c3.o1;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import ct.a0;
import ds.l;
import e1.j0;
import f50.k;
import g1.d7;
import g1.n5;
import g1.o3;
import g1.t6;
import g1.v5;
import g1.v6;
import g1.w6;
import g1.z6;
import h0.c1;
import h0.p1;
import h0.s;
import h0.t1;
import h0.v;
import h0.v1;
import h0.w;
import h0.x1;
import h0.z1;
import i2.b0;
import i2.o0;
import i2.s0;
import i2.t;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.jvm.internal.m;
import l1.f1;
import l1.g0;
import l1.j;
import l1.m1;
import l1.p2;
import l1.q;
import l1.q2;
import l1.r1;
import m3.i0;
import m3.r0;
import m3.z;
import q0.i1;
import q3.u;
import w.c0;
import w.x0;
import w.y0;
import x.y;
import z.n;
import z2.d1;
import z2.p;
import z2.w0;

public abstract class a {
    public static final v1.c a = new v1.c(new ou.a(6), -212952041, false);
    public static final v1.c b = new v1.c(new lu.a(20), 1005464787, false);
    public static final v1.c c = new v1.c(new lu.a(21), -307594358, false);
    public static final v1.c d = new v1.c(new lu.a(22), 1869966055, false);
    public static final v1.c e = new v1.c(new lu.a(23), 1867273488, false);

    public static final void a(float f, int i, r rVar, j jVar) {
        float f2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-218610592);
        int i2 = (g0Var.d(f) ? 4 : 2) | i | (g0Var.g(rVar) ? 32 : 16);
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            p2 p2VarB = x.d.b(f, (y) null, (String) null, g0Var, i2 & 14, 30);
            f2 = f;
            r rVarM = z1.m(rVar, 24);
            long j = dl.a.i;
            float f3 = 4;
            long jB = t.b(0.2f, j);
            boolean zG = g0Var.g(p2VarB);
            Object objN = g0Var.N();
            if (zG || objN == l1.i.a) {
                objN = new l(p2VarB, 10);
                g0Var.n0(objN);
            }
            v5.b((u00.a) objN, rVarM, j, f3, jB, 0, 0.0f, g0Var, 3072, 96);
            g0Var = g0Var;
        } else {
            f2 = f;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new a0(f2, rVar, i, 4);
        }
    }

    public static final void b(final PlayerItem playerItem, final boolean z, final boolean z2, final boolean z3, final u00.a onClick, final u00.a onToggleFavorites, final u00.a onDeleteClicked, final boolean z4, final boolean z5, r rVar, boolean z6, final u00.a aVar, final u00.a aVar2, final Float f, u00.a aVar3, j jVar, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        g0 g0Var;
        final r rVar2;
        final boolean z7;
        final u00.a aVar4;
        int i7;
        int i8;
        int i9;
        float f2;
        u00.a aVar5;
        boolean z8;
        m.e(playerItem, "playerItem");
        m.e(onClick, "onClick");
        m.e(onToggleFavorites, "onToggleFavorites");
        m.e(onDeleteClicked, "onDeleteClicked");
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(2000003814);
        int i11 = (g0Var2.g(playerItem) ? 4 : 2) | i | (g0Var2.h(z) ? 32 : 16) | (g0Var2.h(z2) ? 256 : 128);
        if ((i & 3072) == 0) {
            i11 |= g0Var2.h(z3) ? 2048 : 1024;
        }
        int i12 = i11 | (g0Var2.i(onClick) ? 16384 : 8192) | (g0Var2.i(onToggleFavorites) ? 131072 : 65536) | (g0Var2.i(onDeleteClicked) ? 1048576 : 524288) | (g0Var2.h(z4) ? 8388608 : 4194304) | (g0Var2.h(z5) ? 67108864 : 33554432);
        int i13 = i3 & 512;
        if (i13 != 0) {
            i4 = i12 | 805306368;
        } else {
            i4 = i12 | (g0Var2.g(rVar) ? 536870912 : 268435456);
        }
        int i14 = i4;
        int i15 = i3 & 1024;
        if (i15 != 0) {
            i5 = 6;
        } else if ((i2 & 6) == 0) {
            i5 = i2 | (g0Var2.h(z6) ? 4 : 2);
        } else {
            i5 = i2;
        }
        int i16 = i5 | (g0Var2.i(aVar) ? 32 : 16) | (g0Var2.i(aVar2) ? 256 : 128) | (g0Var2.g(f) ? 2048 : 1024);
        int i17 = i16 | 24576;
        int i18 = i3 & 32768;
        if (i18 != 0) {
            i6 = i16 | 221184;
        } else {
            i6 = i17 | (g0Var2.i(aVar3) ? 131072 : 65536);
        }
        int i19 = i6;
        if (g0Var2.S(i14 & 1, ((i14 & 306783379) == 306783378 && (i19 & 74899) == 74898) ? false : true)) {
            r rVar3 = o.A;
            r rVar4 = i13 != 0 ? rVar3 : rVar;
            boolean z9 = i15 != 0 ? false : z6;
            u00.a aVar6 = i18 != 0 ? null : aVar3;
            y3.m mVar = (y3.m) g0Var2.k(o1.n);
            gc.j jVarA = k.A(new gc.k(), g0Var2);
            boolean z11 = ((i14 & 234881024) == 67108864) | ((i14 & 29360128) == 8388608);
            Object objN = g0Var2.N();
            if (z11 || objN == l1.i.a) {
                objN = Boolean.valueOf(z5 || z4);
                g0Var2.n0(objN);
            }
            boolean zBooleanValue = ((Boolean) objN).booleanValue();
            p2 p2VarB = x.d.b(zBooleanValue ? 1.0f : 0.4f, (y) null, (String) null, g0Var2, 0, 30);
            g0 g0Var3 = g0Var2;
            r rVarC = f2.h.c(z1.d(rVar4, 1.0f), p0.f.a(20));
            long j = dl.a.i;
            long jB = t.b(0.0f, j);
            o0 o0Var = b0.b;
            r rVarN = w50.c.n(n.f(rVarC, jB, o0Var), zBooleanValue, onClick);
            float f3 = 8;
            r rVarC2 = h0.c.C(rVarN, f3);
            b2.i iVar = b2.b.A;
            r rVar5 = rVar4;
            w0 w0VarD = h0.o.d(iVar, false);
            int iHashCode = Long.hashCode(g0Var3.T);
            m1 m1VarM = g0Var3.m();
            r rVarC3 = b2.a.c(rVarC2, g0Var3);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var3.g0();
            if (g0Var3.S) {
                g0Var3.l(gVar);
            } else {
                g0Var3.q0();
            }
            b3.f fVar = b3.h.f;
            q.I(w0VarD, g0Var3, fVar);
            b3.f fVar2 = b3.h.e;
            q.I(m1VarM, g0Var3, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            q.I(numValueOf, g0Var3, fVar3);
            b3.e eVar = b3.h.h;
            q.E(g0Var3, eVar);
            b3.f fVar4 = b3.h.d;
            q.I(rVarC3, g0Var3, fVar4);
            r rVarD = z1.d(rVar3, 1.0f);
            b2.h hVar = b2.b.K;
            v1 v1VarA = t1.a(h0.i.a, hVar, g0Var3, 48);
            int iHashCode2 = Long.hashCode(g0Var3.T);
            m1 m1VarM2 = g0Var3.m();
            r rVarC4 = b2.a.c(rVarD, g0Var3);
            g0Var3.g0();
            if (g0Var3.S) {
                g0Var3.l(gVar);
            } else {
                g0Var3.q0();
            }
            q.I(v1VarA, g0Var3, fVar);
            q.I(m1VarM2, g0Var3, fVar2);
            a1.b.v(iHashCode2, g0Var3, fVar3, g0Var3, eVar);
            q.I(rVarC4, g0Var3, fVar4);
            x1 x1Var = x1.a;
            r rVarA = x1Var.a(rVar3);
            v1 v1VarA2 = t1.a(h0.i.g(f3), hVar, g0Var3, 54);
            int iHashCode3 = Long.hashCode(g0Var3.T);
            m1 m1VarM3 = g0Var3.m();
            r rVarC5 = b2.a.c(rVarA, g0Var3);
            g0Var3.g0();
            if (g0Var3.S) {
                g0Var3.l(gVar);
            } else {
                g0Var3.q0();
            }
            q.I(v1VarA2, g0Var3, fVar);
            q.I(m1VarM3, g0Var3, fVar2);
            a1.b.v(iHashCode3, g0Var3, fVar3, g0Var3, eVar);
            q.I(rVarC5, g0Var3, fVar4);
            w0 w0VarD2 = h0.o.d(b2.b.E, false);
            int iHashCode4 = Long.hashCode(g0Var3.T);
            m1 m1VarM4 = g0Var3.m();
            r rVarC6 = b2.a.c(rVar3, g0Var3);
            g0Var3.g0();
            if (g0Var3.S) {
                g0Var3.l(gVar);
            } else {
                g0Var3.q0();
            }
            q.I(w0VarD2, g0Var3, fVar);
            q.I(m1VarM4, g0Var3, fVar2);
            a1.b.v(iHashCode4, g0Var3, fVar3, g0Var3, eVar);
            q.I(rVarC6, g0Var3, fVar4);
            h0.o.a(n.f(f2.h.c(z1.m(rVar3, 54), p0.f.a(18)), t.b(0.1f, j), o0Var), g0Var3, 0);
            if (z2) {
                g0Var3.c0(1483090821);
                f50.c.g((cc.a) jVarA.getValue(), z1.m(rVar3, 16), g0Var3, 1572912);
                g0Var3.r(false);
                i7 = 0;
            } else {
                g0Var3.c0(1483418057);
                z6.b(String.valueOf(playerItem.getSurahNumber()), (r) null, t.b(((Number) p2VarB.getValue()).floatValue(), dl.a.k), kh.o.z(18), u.C, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var3, 1597440, 0, 262058);
                g0Var3 = g0Var3;
                i7 = 0;
                g0Var3.r(false);
            }
            g0Var3.r(true);
            v vVarA = h0.u.a(h0.i.c, b2.b.M, g0Var3, i7);
            int iHashCode5 = Long.hashCode(g0Var3.T);
            m1 m1VarM5 = g0Var3.m();
            r rVarC7 = b2.a.c(rVar3, g0Var3);
            g0Var3.g0();
            if (g0Var3.S) {
                g0Var3.l(gVar);
            } else {
                g0Var3.q0();
            }
            q.I(vVarA, g0Var3, fVar);
            q.I(m1VarM5, g0Var3, fVar2);
            a1.b.v(iHashCode5, g0Var3, fVar3, g0Var3, eVar);
            q.I(rVarC7, g0Var3, fVar4);
            v1 v1VarA3 = t1.a(h0.i.g(f3), hVar, g0Var3, 54);
            int iHashCode6 = Long.hashCode(g0Var3.T);
            m1 m1VarM6 = g0Var3.m();
            r rVarC8 = b2.a.c(rVar3, g0Var3);
            g0Var3.g0();
            if (g0Var3.S) {
                g0Var3.l(gVar);
            } else {
                g0Var3.q0();
            }
            q.I(v1VarA3, g0Var3, fVar);
            q.I(m1VarM6, g0Var3, fVar2);
            a1.b.v(iHashCode6, g0Var3, fVar3, g0Var3, eVar);
            q.I(rVarC8, g0Var3, fVar4);
            g0 g0Var4 = g0Var3;
            z6.b(playerItem.getSurahTranscription(), (r) null, t.b(((Number) p2VarB.getValue()).floatValue(), dl.a.k), kh.o.z(16), u.D, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(16), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var4, 1597440, 48, 260010);
            g0 g0Var5 = g0Var4;
            if (mVar != y3.m.A || r30.k.L0(playerItem.getSurahOriginalName())) {
                i8 = 0;
                g0Var5.c0(581876404);
                g0Var5.r(false);
            } else {
                g0Var5.c0(581522756);
                z6.b(a1.b.p("(", playerItem.getSurahOriginalName(), ")"), (r) null, t.b(((Number) p2VarB.getValue()).floatValue(), dl.a.o), kh.o.z(14), (u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(14), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var5, 24576, 48, 260074);
                g0Var5 = g0Var5;
                i8 = 0;
                g0Var5.r(false);
            }
            g0Var5.r(true);
            if (r30.k.L0(playerItem.getSurahOriginalName())) {
                i9 = 4;
                f2 = 4;
            } else {
                i9 = 4;
                f2 = i8;
            }
            g0 g0Var6 = g0Var5;
            z6.b(z9 ? playerItem.getReciterName() : playerItem.getSurahTranslation(), h0.c.G(rVar3, 0.0f, f2, 0.0f, 0.0f, 13), t.b(((Number) p2VarB.getValue()).floatValue(), dl.a.o), kh.o.z(12), (u) null, (q3.i) null, 0L, (x3.l) null, new x3.k(3), kh.o.z(12), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var6, 24576, 48, 259048);
            g0Var6.r(true);
            g0Var6.r(true);
            if (z3) {
                g0Var6.c0(906696225);
                r rVarA2 = x1Var.a(rVar3);
                v1 v1VarA4 = t1.a(h0.i.b, hVar, g0Var6, 54);
                int iHashCode7 = Long.hashCode(g0Var6.T);
                m1 m1VarM7 = g0Var6.m();
                r rVarC9 = b2.a.c(rVarA2, g0Var6);
                g0Var6.g0();
                if (g0Var6.S) {
                    g0Var6.l(gVar);
                } else {
                    g0Var6.q0();
                }
                q.I(v1VarA4, g0Var6, fVar);
                q.I(m1VarM7, g0Var6, fVar2);
                a1.b.v(iHashCode7, g0Var6, fVar3, g0Var6, eVar);
                q.I(rVarC9, g0Var6, fVar4);
                c0.d(!z5 && f == null && zBooleanValue, (r) null, (x0) null, (y0) null, (String) null, v1.d.d(830295655, new e1.f(z4, aVar, 2), g0Var6), g0Var6, 1572870, 30);
                c0.d(f != null, (r) null, (x0) null, (y0) null, (String) null, v1.d.d(-1766370018, new jv.b(aVar2, f, 1), g0Var6), g0Var6, 1572870, 30);
                aVar5 = aVar6;
                wr.k.u(z, onToggleFavorites, h0.c.C(rVar3, i9), 0.0f, 0L, z5, onDeleteClicked, 0, false, aVar5, 0.0f, g0Var6, ((i14 >> 3) & 14) | 384 | ((i14 >> 12) & 112) | ((i14 >> 9) & 458752) | (i14 & 3670016) | ((i19 << 12) & 1879048192), 0, 1432);
                g0Var = g0Var6;
                g0Var.r(true);
                g0Var.r(false);
                z8 = true;
            } else {
                aVar5 = aVar6;
                g0Var6.c0(908800009);
                r rVarA3 = x1Var.a(rVar3);
                w0 w0VarD3 = h0.o.d(iVar, false);
                int iHashCode8 = Long.hashCode(g0Var6.T);
                m1 m1VarM8 = g0Var6.m();
                r rVarC10 = b2.a.c(rVarA3, g0Var6);
                g0Var6.g0();
                if (g0Var6.S) {
                    g0Var6.l(gVar);
                } else {
                    g0Var6.q0();
                }
                q.I(w0VarD3, g0Var6, fVar);
                q.I(m1VarM8, g0Var6, fVar2);
                a1.b.v(iHashCode8, g0Var6, fVar3, g0Var6, eVar);
                q.I(rVarC10, g0Var6, fVar4);
                z8 = true;
                wr.k.u(z, onToggleFavorites, h0.c.C(s.a.a(rVar3, b2.b.F), i9), 0.0f, 0L, z5, onDeleteClicked, 0, false, aVar5, 0.0f, g0Var6, ((i14 >> 3) & 14) | ((i14 >> 12) & 112) | ((i14 >> 9) & 458752) | (i14 & 3670016) | ((i19 << 12) & 1879048192), 0, 1432);
                g0Var = g0Var6;
                g0Var.r(true);
                g0Var.r(false);
            }
            g0Var.r(z8);
            g0Var.r(z8);
            aVar4 = aVar5;
            z7 = z9;
            rVar2 = rVar5;
        } else {
            g0Var = g0Var2;
            g0Var.V();
            rVar2 = rVar;
            z7 = z6;
            aVar4 = aVar3;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = q.K(i | 1);
                    int iK2 = q.K(i2);
                    a.b(playerItem, z, z2, z3, onClick, onToggleFavorites, onDeleteClicked, z4, z5, rVar2, z7, aVar, aVar2, f, aVar4, (j) obj, iK, iK2, i3);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void c(String str, r rVar, j jVar, int i) {
        r rVar2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(99326400);
        int i2 = i | (g0Var.g(str) ? 4 : 2) | 48;
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) g0Var.k(c3.o0.b);
            int i3 = i2 & 14;
            boolean zG = (i3 == 4) | g0Var.g(context);
            Object objN = g0Var.N();
            if (zG || objN == l1.i.a) {
                wb.h hVar = new wb.h(context);
                hVar.c = str.length() > 0 ? str : null;
                hVar.c(600);
                hVar.b();
                objN = hVar.a();
                g0Var.n0(objN);
            }
            mb.j jVarI = mb.l.i((wb.i) objN, (p) null, g0Var, 0, 62);
            mb.j jVarI2 = mb.l.i(str, (p) null, g0Var, i3, 62);
            float f = 250;
            rVar2 = o.A;
            r rVarM = z1.m(rVar2, f);
            b2.i iVar = b2.b.E;
            w0 w0VarD = h0.o.d(iVar, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVarM, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar = b3.h.f;
            q.I(w0VarD, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.h;
            q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.d;
            q.I(rVarC, g0Var, fVar4);
            float f2 = 160;
            r rVarA = f2.h.a(f2.h.b(z1.m(rVar2, f), f2, (o0) null), 0.7f);
            d1 d1Var = z2.o.a;
            n.c(jVarI2, (String) null, rVarA, (b2.d) null, d1Var, 0.0f, g0Var, 24624, 104);
            p0.e eVar2 = p0.f.a;
            long j = dl.a.L;
            r rVarC2 = f2.h.c(z1.m(f2.h.j(h0.c.C(rVar2, 24), 20, eVar2, t.b(0.3f, j), t.b(0.3f, j), 4), f2), eVar2);
            long j2 = dl.a.s;
            r rVarG0 = rd.a.g0(f2, 0, j2, n.f(rVarC2, j2, b0.b), !(jVarI.j() instanceof mb.g));
            w0 w0VarD2 = h0.o.d(iVar, false);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            r rVarC3 = b2.a.c(rVarG0, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(w0VarD2, g0Var, fVar);
            q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            q.I(rVarC3, g0Var, fVar4);
            n.c(jVarI, (String) null, z1.c, (b2.d) null, d1Var, 0.0f, g0Var, 25008, 104);
            g0Var.r(true);
            g0Var.r(true);
        } else {
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new c00.m(str, rVar2, i, 7);
        }
    }

    public static final void d(String str, String str2, r rVar, j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(1959744099);
        int i2 = i | (g0Var.g(str) ? 4 : 2) | (g0Var.g(str2) ? 32 : 16);
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) g0Var.k(c3.o0.b);
            boolean z = (i2 & 14) == 4;
            Object objN = g0Var.N();
            if (z || objN == l1.i.a) {
                objN = new xm.a(context).a(str);
                g0Var.n0(objN);
            }
            String str3 = (String) objN;
            v1 v1VarA = t1.a(h0.i.g(8), b2.b.K, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVar, g0Var);
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
            if (str3 == null || str3.length() == 0) {
                g0Var.c0(-9249565);
                g0Var.r(false);
            } else {
                g0Var.c0(-9678481);
                r rVarC2 = f2.h.c(z1.m(o.A, 16), p0.f.a(2));
                wb.h hVar = new wb.h(context);
                hVar.c = "file:///android_asset/".concat(str3);
                hVar.b();
                mb.l.d(hVar.a(), rVarC2, (v1.c) null, z2.o.b, g0Var, 48, 129016);
                g0Var.r(false);
            }
            z6.b(str2, (r) null, dl.a.i, kh.o.z(16), u.J, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(16), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, ((i2 >> 3) & 14) | 1597440, 48, 260010);
            g0Var = g0Var;
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new iz.q(str, str2, rVar, i, 1);
        }
    }

    public static final void e(bx.c reciter, boolean z, boolean z2, u00.a onPlayClicked, u00.a onShuffleClicked, u00.a onFavoriteClicked, u00.a onInfoClicked, r rVar, j jVar, int i) {
        u00.a aVar;
        u00.a aVar2;
        r rVar2;
        m.e(reciter, "reciter");
        String str = reciter.g;
        String str2 = reciter.i;
        m.e(onPlayClicked, "onPlayClicked");
        m.e(onShuffleClicked, "onShuffleClicked");
        m.e(onFavoriteClicked, "onFavoriteClicked");
        m.e(onInfoClicked, "onInfoClicked");
        g0 g0Var = (g0) jVar;
        g0Var.e0(1221307746);
        int i2 = i | (g0Var.i(reciter) ? 4 : 2) | (g0Var.h(z) ? 32 : 16) | (g0Var.h(z2) ? 256 : 128) | (g0Var.i(onPlayClicked) ? 2048 : 1024) | (g0Var.i(onShuffleClicked) ? 16384 : 8192) | (g0Var.i(onFavoriteClicked) ? 131072 : 65536) | (g0Var.i(onInfoClicked) ? 1048576 : 524288);
        if (g0Var.S(i2 & 1, (4793491 & i2) != 4793490)) {
            p2 p2VarB = x.d.b(z2 ? 1.0f : 0.5f, (y) null, (String) null, g0Var, 0, 30);
            float f = 24;
            r rVarD = z1.d(h0.c.G(rVar, 0.0f, 0.0f, f, 0.0f, 11), 1.0f);
            float f2 = 32;
            v1 v1VarA = t1.a(h0.i.g(f2), b2.b.L, g0Var, 54);
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
            c(reciter.e, null, g0Var, 0);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            c1 c1Var = new c1(1.0f, true);
            v vVarA = h0.u.a(h0.i.c, b2.b.M, g0Var, 0);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            r rVarC2 = b2.a.c(c1Var, g0Var);
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
            r rVar3 = o.A;
            r rVarG = h0.c.G(rVar3, 0.0f, f, 0.0f, 0.0f, 13);
            String str3 = reciter.b;
            long jZ = kh.o.z(32);
            long jZ2 = kh.o.z(36);
            long j = dl.a.i;
            z6.b(str3, rVarG, j, jZ, u.M, (q3.i) null, 0L, (x3.l) null, (x3.k) null, jZ2, 2, false, 2, 0, (u00.k) null, (r0) null, g0Var, 1597488, 25008, 239528);
            if (str2.length() > 0) {
                g0Var.c0(174078498);
                rVar2 = rVar3;
                d(reciter.h, str2, h0.c.G(rVar3, 0.0f, 9, 0.0f, 0.0f, 13), g0Var, 384);
                g0Var.r(false);
            } else {
                rVar2 = rVar3;
                g0Var.c0(174299962);
                g0Var.r(false);
            }
            float f3 = 16;
            r rVarG2 = h0.c.G(z1.d(rVar2, 1.0f), 0.0f, f3, 0.0f, 0.0f, 13);
            h0.f fVarG = h0.i.g(f3);
            b2.h hVar = b2.b.K;
            v1 v1VarA2 = t1.a(fVarG, hVar, g0Var, 54);
            int iHashCode3 = Long.hashCode(g0Var.T);
            m1 m1VarM3 = g0Var.m();
            r rVarC3 = b2.a.c(rVarG2, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(v1VarA2, g0Var, fVar);
            q.I(m1VarM3, g0Var, fVar2);
            a1.b.v(iHashCode3, g0Var, fVar3, g0Var, eVar);
            q.I(rVarC3, g0Var, fVar4);
            float f4 = 44;
            r rVarM = z1.m(rVar2, f4);
            p0.e eVar2 = p0.f.a;
            r rVarC4 = f2.h.c(rVarM, eVar2);
            r rVar4 = rVar2;
            long jB = t.b(0.15f, j);
            o0 o0Var = b0.b;
            r rVarO = w50.c.o(n.f(rVarC4, jB, o0Var), false, null, onShuffleClicked, 7);
            b2.i iVar = b2.b.E;
            w0 w0VarD = h0.o.d(iVar, false);
            int iHashCode4 = Long.hashCode(g0Var.T);
            m1 m1VarM4 = g0Var.m();
            r rVarC5 = b2.a.c(rVarO, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(w0VarD, g0Var, fVar);
            q.I(m1VarM4, g0Var, fVar2);
            a1.b.v(iHashCode4, g0Var, fVar3, g0Var, eVar);
            q.I(rVarC5, g0Var, fVar4);
            float f5 = 20;
            z3.j(y3.R(2131231384, g0Var, 0), (String) null, z1.m(rVar4, f5), t.b(((Number) p2VarB.getValue()).floatValue(), j), g0Var, 440, 0);
            g0Var.r(true);
            r rVarD2 = h0.c.D(w50.c.o(n.f(f2.h.c(rVar4, p0.f.a(f2)), j, o0Var), false, null, onPlayClicked, 7), f5, 12);
            v1 v1VarA3 = t1.a(h0.i.g(8), hVar, g0Var, 54);
            int iHashCode5 = Long.hashCode(g0Var.T);
            m1 m1VarM5 = g0Var.m();
            r rVarC6 = b2.a.c(rVarD2, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(v1VarA3, g0Var, fVar);
            q.I(m1VarM5, g0Var, fVar2);
            a1.b.v(iHashCode5, g0Var, fVar3, g0Var, eVar);
            q.I(rVarC6, g0Var, fVar4);
            r rVarM2 = z1.m(rVar4, 14);
            m2.b bVarR = y3.R(2131231358, g0Var, 0);
            long j2 = dl.a.L;
            z3.j(bVarR, (String) null, rVarM2, j2, g0Var, 440, 0);
            z6.b(z3.U(g0Var, 2131887055), (r) null, j2, kh.o.z(16), u.K, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(16), 2, false, 1, 0, (u00.k) null, (r0) null, g0Var, 1597440, 25008, 239530);
            g0Var = g0Var;
            g0Var.r(true);
            aVar2 = onFavoriteClicked;
            r rVarO2 = w50.c.o(n.f(f2.h.c(z1.m(rVar4, f4), eVar2), t.b(0.15f, j), o0Var), false, null, aVar2, 7);
            w0 w0VarD2 = h0.o.d(iVar, false);
            int iHashCode6 = Long.hashCode(g0Var.T);
            m1 m1VarM6 = g0Var.m();
            r rVarC7 = b2.a.c(rVarO2, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(w0VarD2, g0Var, fVar);
            q.I(m1VarM6, g0Var, fVar2);
            a1.b.v(iHashCode6, g0Var, fVar3, g0Var, eVar);
            q.I(rVarC7, g0Var, fVar4);
            z3.j(y3.R(z ? 2131231389 : 2131231388, g0Var, 0), (String) null, z1.m(rVar4, f5), dl.a.k, g0Var, 440, 0);
            g0Var.r(true);
            g0Var.r(true);
            if (str.length() > 0) {
                g0Var.c0(177373395);
                aVar = onInfoClicked;
                i(str, aVar, h0.c.G(z1.d(rVar4, 1.0f), 0.0f, f, 0.0f, 0.0f, 13), g0Var, ((i2 >> 15) & 112) | 384);
                g0Var.r(false);
            } else {
                aVar = onInfoClicked;
                g0Var.c0(177656890);
                g0Var.r(false);
            }
            g0Var.r(true);
            g0Var.r(true);
        } else {
            aVar = onInfoClicked;
            aVar2 = onFavoriteClicked;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new c(reciter, z, z2, onPlayClicked, onShuffleClicked, aVar2, aVar, rVar, i, 0);
        }
    }

    public static final void f(r rVar, String str, u00.k kVar, int i, j jVar, int i2, int i3) {
        int i4;
        String str2;
        int i5;
        int i6;
        u00.k kVar2;
        int i7;
        int i8;
        int i9;
        int i11;
        boolean z;
        g0 g0Var;
        String str3;
        u00.k kVar3;
        int i12;
        r1 r1VarT;
        int i13;
        Object obj;
        Object objN;
        String str4;
        u00.k kVar4;
        z0.g gVarH;
        boolean zG;
        Object objN2;
        z0.g gVar;
        u00.n nVar;
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(1899004863);
        if ((i2 & 6) == 0) {
            i4 = i2 | (g0Var2.g(rVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i3 & 2) == 0) {
            str2 = str;
            int i14 = g0Var2.g(str2) ? 32 : 16;
            i5 = i4 | i14;
            i6 = i3 & 4;
            if (i6 != 0) {
                i8 = i5 | 384;
                kVar2 = kVar;
            } else {
                kVar2 = kVar;
                if (g0Var2.i(kVar2)) {
                    i7 = 256;
                } else {
                    i7 = 128;
                }
                i8 = i5 | i7;
            }
            if ((i3 & 8) == 0) {
                i9 = i;
                int i15 = g0Var2.e(i9) ? 2048 : 1024;
                i11 = i8 | i15;
                if ((i11 & 1171) != 1170) {
                    z = true;
                } else {
                    z = false;
                }
                if (g0Var2.S(i11 & 1, z)) {
                    g0Var2.X();
                    i13 = i2 & 1;
                    obj = l1.i.a;
                    if (i13 != 0 || g0Var2.A()) {
                        if ((i3 & 2) != 0) {
                            i11 &= -113;
                            str2 = "";
                        }
                        if (i6 != 0) {
                            objN = g0Var2.N();
                            if (objN == obj) {
                                objN = new m3.c0(20);
                                g0Var2.n0(objN);
                            }
                            kVar2 = (u00.k) objN;
                        }
                        if ((i3 & 8) != 0) {
                            i11 &= -7169;
                            i9 = 2131887195;
                        }
                    } else {
                        g0Var2.V();
                        if ((i3 & 2) != 0) {
                            i11 &= -113;
                        }
                        if ((i3 & 8) != 0) {
                            i11 &= -7169;
                        }
                    }
                    int i16 = i11;
                    str4 = str2;
                    kVar4 = kVar2;
                    g0Var2.s();
                    gVarH = z0.h.h(str4, g0Var2, (i16 >> 3) & 14);
                    zG = g0Var2.g(gVarH) | ((i16 & 896) == 256);
                    objN2 = g0Var2.N();
                    if (zG || objN2 == obj) {
                        objN2 = new c00.s(gVarH, kVar4, null, 6);
                        g0Var2.n0(objN2);
                    }
                    q.i(gVarH, g0Var2, (u00.n) objN2);
                    r rVarD = z1.d(rVar, 1.0f);
                    p0.e eVarA = p0.f.a(32);
                    z0.e eVar = z0.e.B;
                    long j = dl.a.i;
                    long jB = t.b(0.085f, j);
                    int i17 = i9;
                    long jB2 = t.b(0.085f, j);
                    long jB3 = t.b(0.085f, j);
                    long j2 = t.f;
                    long j3 = dl.a.k;
                    t6 t6VarA = v6.a(j3, j3, j3, jB, jB2, jB3, j2, j2, j2, t.b(0.3f, j3), t.b(0.3f, j3), t.b(0.3f, j3), g0Var2, 1207945096);
                    p1 p1VarE = h0.c.e(16, 0.0f, 2);
                    if (str4.length() > 0) {
                        g0Var2.c0(-53384435);
                        gVar = gVarH;
                        u00.n nVarD = v1.d.d(1680921364, new c00.p(gVar, 5), g0Var2);
                        g0Var2.r(false);
                        nVar = nVarD;
                    } else {
                        gVar = gVarH;
                        g0Var2.c0(-52679929);
                        g0Var2.r(false);
                        nVar = null;
                    }
                    n5.c(gVar, rVarD, false, (r0) null, (w6) null, v1.d.d(221011640, new c00.j(i17, 3), g0Var2), a, nVar, false, (i1) null, (qp.b) null, eVar, (z.p1) null, eVarA, t6VarA, p1VarE, g0Var2, 113246208, 100663296, 18611324);
                    g0Var = g0Var2;
                    kVar3 = kVar4;
                    i12 = i17;
                    str3 = str4;
                } else {
                    g0Var = g0Var2;
                    g0Var.V();
                    str3 = str2;
                    kVar3 = kVar2;
                    i12 = i9;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.d = new d7(rVar, str3, kVar3, i12, i2, i3, 2);
                }
            }
            i9 = i;
            i11 = i8 | i15;
            if ((i11 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (g0Var2.S(i11 & 1, z)) {
                g0Var2.X();
                i13 = i2 & 1;
                obj = l1.i.a;
                if (i13 != 0) {
                    if ((i3 & 2) != 0) {
                        i11 &= -113;
                        str2 = "";
                    }
                    if (i6 != 0) {
                        objN = g0Var2.N();
                        if (objN == obj) {
                            objN = new m3.c0(20);
                            g0Var2.n0(objN);
                        }
                        kVar2 = (u00.k) objN;
                    }
                    if ((i3 & 8) != 0) {
                        i11 &= -7169;
                        i9 = 2131887195;
                    }
                } else {
                    if ((i3 & 2) != 0) {
                        i11 &= -113;
                        str2 = "";
                    }
                    if (i6 != 0) {
                        objN = g0Var2.N();
                        if (objN == obj) {
                            objN = new m3.c0(20);
                            g0Var2.n0(objN);
                        }
                        kVar2 = (u00.k) objN;
                    }
                    if ((i3 & 8) != 0) {
                        i11 &= -7169;
                        i9 = 2131887195;
                    }
                }
                int i18 = i11;
                str4 = str2;
                kVar4 = kVar2;
                g0Var2.s();
                gVarH = z0.h.h(str4, g0Var2, (i18 >> 3) & 14);
                zG = g0Var2.g(gVarH) | ((i18 & 896) == 256);
                objN2 = g0Var2.N();
                if (zG) {
                    objN2 = new c00.s(gVarH, kVar4, null, 6);
                    g0Var2.n0(objN2);
                } else {
                    objN2 = new c00.s(gVarH, kVar4, null, 6);
                    g0Var2.n0(objN2);
                }
                q.i(gVarH, g0Var2, (u00.n) objN2);
                r rVarD2 = z1.d(rVar, 1.0f);
                p0.e eVarA2 = p0.f.a(32);
                z0.e eVar2 = z0.e.B;
                long j4 = dl.a.i;
                long jB4 = t.b(0.085f, j4);
                int i19 = i9;
                long jB5 = t.b(0.085f, j4);
                long jB6 = t.b(0.085f, j4);
                long j5 = t.f;
                long j6 = dl.a.k;
                t6 t6VarA2 = v6.a(j6, j6, j6, jB4, jB5, jB6, j5, j5, j5, t.b(0.3f, j6), t.b(0.3f, j6), t.b(0.3f, j6), g0Var2, 1207945096);
                p1 p1VarE2 = h0.c.e(16, 0.0f, 2);
                if (str4.length() > 0) {
                    g0Var2.c0(-53384435);
                    gVar = gVarH;
                    u00.n nVarD2 = v1.d.d(1680921364, new c00.p(gVar, 5), g0Var2);
                    g0Var2.r(false);
                    nVar = nVarD2;
                } else {
                    gVar = gVarH;
                    g0Var2.c0(-52679929);
                    g0Var2.r(false);
                    nVar = null;
                }
                n5.c(gVar, rVarD2, false, (r0) null, (w6) null, v1.d.d(221011640, new c00.j(i19, 3), g0Var2), a, nVar, false, (i1) null, (qp.b) null, eVar2, (z.p1) null, eVarA2, t6VarA2, p1VarE2, g0Var2, 113246208, 100663296, 18611324);
                g0Var = g0Var2;
                kVar3 = kVar4;
                i12 = i19;
                str3 = str4;
            } else {
                g0Var = g0Var2;
                g0Var.V();
                str3 = str2;
                kVar3 = kVar2;
                i12 = i9;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new d7(rVar, str3, kVar3, i12, i2, i3, 2);
            }
        }
        str2 = str;
        i5 = i4 | i14;
        i6 = i3 & 4;
        if (i6 != 0) {
            i8 = i5 | 384;
            kVar2 = kVar;
        } else {
            kVar2 = kVar;
            if (g0Var2.i(kVar2)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i8 = i5 | i7;
        }
        if ((i3 & 8) == 0) {
            i9 = i;
            if (g0Var2.e(i9)) {
            }
            i11 = i8 | i15;
            if ((i11 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (g0Var2.S(i11 & 1, z)) {
                g0Var2.X();
                i13 = i2 & 1;
                obj = l1.i.a;
                if (i13 != 0) {
                    if ((i3 & 2) != 0) {
                        i11 &= -113;
                        str2 = "";
                    }
                    if (i6 != 0) {
                        objN = g0Var2.N();
                        if (objN == obj) {
                            objN = new m3.c0(20);
                            g0Var2.n0(objN);
                        }
                        kVar2 = (u00.k) objN;
                    }
                    if ((i3 & 8) != 0) {
                        i11 &= -7169;
                        i9 = 2131887195;
                    }
                } else {
                    if ((i3 & 2) != 0) {
                        i11 &= -113;
                        str2 = "";
                    }
                    if (i6 != 0) {
                        objN = g0Var2.N();
                        if (objN == obj) {
                            objN = new m3.c0(20);
                            g0Var2.n0(objN);
                        }
                        kVar2 = (u00.k) objN;
                    }
                    if ((i3 & 8) != 0) {
                        i11 &= -7169;
                        i9 = 2131887195;
                    }
                }
                int i110 = i11;
                str4 = str2;
                kVar4 = kVar2;
                g0Var2.s();
                gVarH = z0.h.h(str4, g0Var2, (i110 >> 3) & 14);
                zG = g0Var2.g(gVarH) | ((i110 & 896) == 256);
                objN2 = g0Var2.N();
                if (zG) {
                    objN2 = new c00.s(gVarH, kVar4, null, 6);
                    g0Var2.n0(objN2);
                } else {
                    objN2 = new c00.s(gVarH, kVar4, null, 6);
                    g0Var2.n0(objN2);
                }
                q.i(gVarH, g0Var2, (u00.n) objN2);
                r rVarD3 = z1.d(rVar, 1.0f);
                p0.e eVarA3 = p0.f.a(32);
                z0.e eVar3 = z0.e.B;
                long j7 = dl.a.i;
                long jB7 = t.b(0.085f, j7);
                int i111 = i9;
                long jB8 = t.b(0.085f, j7);
                long jB9 = t.b(0.085f, j7);
                long j8 = t.f;
                long j9 = dl.a.k;
                t6 t6VarA3 = v6.a(j9, j9, j9, jB7, jB8, jB9, j8, j8, j8, t.b(0.3f, j9), t.b(0.3f, j9), t.b(0.3f, j9), g0Var2, 1207945096);
                p1 p1VarE3 = h0.c.e(16, 0.0f, 2);
                if (str4.length() > 0) {
                    g0Var2.c0(-53384435);
                    gVar = gVarH;
                    u00.n nVarD3 = v1.d.d(1680921364, new c00.p(gVar, 5), g0Var2);
                    g0Var2.r(false);
                    nVar = nVarD3;
                } else {
                    gVar = gVarH;
                    g0Var2.c0(-52679929);
                    g0Var2.r(false);
                    nVar = null;
                }
                n5.c(gVar, rVarD3, false, (r0) null, (w6) null, v1.d.d(221011640, new c00.j(i111, 3), g0Var2), a, nVar, false, (i1) null, (qp.b) null, eVar3, (z.p1) null, eVarA3, t6VarA3, p1VarE3, g0Var2, 113246208, 100663296, 18611324);
                g0Var = g0Var2;
                kVar3 = kVar4;
                i12 = i111;
                str3 = str4;
            } else {
                g0Var = g0Var2;
                g0Var.V();
                str3 = str2;
                kVar3 = kVar2;
                i12 = i9;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new d7(rVar, str3, kVar3, i12, i2, i3, 2);
            }
        }
        i9 = i;
        i11 = i8 | i15;
        if ((i11 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (g0Var2.S(i11 & 1, z)) {
            g0Var2.X();
            i13 = i2 & 1;
            obj = l1.i.a;
            if (i13 != 0) {
                if ((i3 & 2) != 0) {
                    i11 &= -113;
                    str2 = "";
                }
                if (i6 != 0) {
                    objN = g0Var2.N();
                    if (objN == obj) {
                        objN = new m3.c0(20);
                        g0Var2.n0(objN);
                    }
                    kVar2 = (u00.k) objN;
                }
                if ((i3 & 8) != 0) {
                    i11 &= -7169;
                    i9 = 2131887195;
                }
            } else {
                if ((i3 & 2) != 0) {
                    i11 &= -113;
                    str2 = "";
                }
                if (i6 != 0) {
                    objN = g0Var2.N();
                    if (objN == obj) {
                        objN = new m3.c0(20);
                        g0Var2.n0(objN);
                    }
                    kVar2 = (u00.k) objN;
                }
                if ((i3 & 8) != 0) {
                    i11 &= -7169;
                    i9 = 2131887195;
                }
            }
            int i112 = i11;
            str4 = str2;
            kVar4 = kVar2;
            g0Var2.s();
            gVarH = z0.h.h(str4, g0Var2, (i112 >> 3) & 14);
            zG = g0Var2.g(gVarH) | ((i112 & 896) == 256);
            objN2 = g0Var2.N();
            if (zG) {
                objN2 = new c00.s(gVarH, kVar4, null, 6);
                g0Var2.n0(objN2);
            } else {
                objN2 = new c00.s(gVarH, kVar4, null, 6);
                g0Var2.n0(objN2);
            }
            q.i(gVarH, g0Var2, (u00.n) objN2);
            r rVarD4 = z1.d(rVar, 1.0f);
            p0.e eVarA4 = p0.f.a(32);
            z0.e eVar4 = z0.e.B;
            long j11 = dl.a.i;
            long jB10 = t.b(0.085f, j11);
            int i113 = i9;
            long jB11 = t.b(0.085f, j11);
            long jB12 = t.b(0.085f, j11);
            long j12 = t.f;
            long j13 = dl.a.k;
            t6 t6VarA4 = v6.a(j13, j13, j13, jB10, jB11, jB12, j12, j12, j12, t.b(0.3f, j13), t.b(0.3f, j13), t.b(0.3f, j13), g0Var2, 1207945096);
            p1 p1VarE4 = h0.c.e(16, 0.0f, 2);
            if (str4.length() > 0) {
                g0Var2.c0(-53384435);
                gVar = gVarH;
                u00.n nVarD4 = v1.d.d(1680921364, new c00.p(gVar, 5), g0Var2);
                g0Var2.r(false);
                nVar = nVarD4;
            } else {
                gVar = gVarH;
                g0Var2.c0(-52679929);
                g0Var2.r(false);
                nVar = null;
            }
            n5.c(gVar, rVarD4, false, (r0) null, (w6) null, v1.d.d(221011640, new c00.j(i113, 3), g0Var2), a, nVar, false, (i1) null, (qp.b) null, eVar4, (z.p1) null, eVarA4, t6VarA4, p1VarE4, g0Var2, 113246208, 100663296, 18611324);
            g0Var = g0Var2;
            kVar3 = kVar4;
            i12 = i113;
            str3 = str4;
        } else {
            g0Var = g0Var2;
            g0Var.V();
            str3 = str2;
            kVar3 = kVar2;
            i12 = i9;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new d7(rVar, str3, kVar3, i12, i2, i3, 2);
        }
    }

    public static final void g(final PlayerItem playerItem, final boolean z, final boolean z2, final boolean z3, final u00.a onClick, final u00.a onToggleFavorites, final u00.a onDeleteClicked, boolean z4, final boolean z5, r rVar, final boolean z6, boolean z7, final Float f, final u00.a aVar, final u00.a aVar2, u00.a aVar3, j jVar, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z8;
        boolean z9;
        g0 g0Var;
        final r rVar2;
        final boolean z11;
        final u00.a aVar4;
        r1 r1VarT;
        r rVar3;
        r rVar4;
        boolean z12;
        u00.a aVar5;
        y3.m mVar;
        gc.j jVarA;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objN;
        boolean z16;
        boolean zBooleanValue;
        float f2;
        p2 p2VarB;
        g0 g0Var2;
        long j;
        float f3;
        b2.i iVar;
        b3.g gVar;
        b3.f fVar;
        b3.f fVar2;
        b3.f fVar3;
        b3.e eVar;
        b3.f fVar4;
        b2.h hVar;
        float f4;
        int i9;
        float f5;
        g0 g0Var3;
        boolean z17;
        String surahTranslation;
        g0 g0Var4;
        boolean z18;
        boolean z19;
        boolean z21;
        m.e(playerItem, "playerItem");
        m.e(onClick, "onClick");
        m.e(onToggleFavorites, "onToggleFavorites");
        m.e(onDeleteClicked, "onDeleteClicked");
        g0 g0Var5 = (g0) jVar;
        g0Var5.e0(1575193364);
        int i11 = (g0Var5.g(playerItem) ? 4 : 2) | i | (g0Var5.h(z) ? 32 : 16) | (g0Var5.h(z2) ? 256 : 128);
        if ((i & 3072) == 0) {
            i11 |= g0Var5.h(z3) ? 2048 : 1024;
        }
        int i12 = (g0Var5.i(onClick) ? 16384 : 8192) | i11 | (g0Var5.i(onToggleFavorites) ? 131072 : 65536) | (g0Var5.i(onDeleteClicked) ? 1048576 : 524288) | (g0Var5.h(z4) ? 8388608 : 4194304) | (g0Var5.h(z5) ? 67108864 : 33554432);
        int i13 = i3 & 512;
        if (i13 != 0) {
            i4 = i12 | 805306368;
        } else {
            i4 = i12 | (g0Var5.g(rVar) ? 536870912 : 268435456);
        }
        int i14 = i4;
        int i15 = i2 | (g0Var5.h(z6) ? 4 : 2);
        int i16 = i3 & 2048;
        if (i16 == 0) {
            if ((i2 & 48) == 0) {
                i15 |= g0Var5.h(z7) ? 32 : 16;
            }
            i5 = i15 | (g0Var5.g(f) ? 256 : 128) | (g0Var5.i(aVar) ? 2048 : 1024) | (g0Var5.i(aVar2) ? 16384 : 8192);
            i6 = i3 & 32768;
            if (i6 != 0) {
                i7 = i5 | 196608;
            } else {
                i7 = i5 | (g0Var5.i(aVar3) ? 131072 : 65536);
            }
            i8 = i7;
            if ((i14 & 306783379) == 306783378 || (i8 & 74899) != 74898) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (g0Var5.S(i14 & 1, z8)) {
                rVar3 = o.A;
                if (i13 != 0) {
                    rVar4 = rVar3;
                } else {
                    rVar4 = rVar;
                }
                if (i16 != 0) {
                    z12 = false;
                } else {
                    z12 = z7;
                }
                if (i6 != 0) {
                    aVar5 = null;
                } else {
                    aVar5 = aVar3;
                }
                mVar = (y3.m) g0Var5.k(o1.n);
                jVarA = k.A(new gc.k(), g0Var5);
                if ((i14 & 234881024) == 67108864) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z22 = z13;
                if ((i14 & 29360128) == 8388608) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z22 | z14;
                objN = g0Var5.N();
                if (z15 || objN == l1.i.a) {
                    if (!z5 || z4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objN = Boolean.valueOf(z16);
                    g0Var5.n0(objN);
                }
                zBooleanValue = ((Boolean) objN).booleanValue();
                if (zBooleanValue) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.4f;
                }
                r rVar5 = rVar4;
                p2VarB = x.d.b(f2, (y) null, (String) null, g0Var5, 0, 30);
                g0Var2 = g0Var5;
                r rVarC = f2.h.c(z1.d(rVar5, 1.0f), p0.f.a(20));
                j = dl.a.i;
                if (z6 || !zBooleanValue) {
                    f3 = 0.0f;
                } else {
                    f3 = 0.05f;
                }
                long jB = t.b(f3, j);
                o0 o0Var = b0.b;
                r rVarN = w50.c.n(n.f(rVarC, jB, o0Var), zBooleanValue, onClick);
                float f6 = 8;
                r rVarC2 = h0.c.C(rVarN, f6);
                iVar = b2.b.A;
                w0 w0VarD = h0.o.d(iVar, false);
                int iHashCode = Long.hashCode(g0Var2.T);
                m1 m1VarM = g0Var2.m();
                r rVarC3 = b2.a.c(rVarC2, g0Var2);
                b3.i.c.getClass();
                gVar = b3.h.b;
                g0Var2.g0();
                if (g0Var2.S) {
                    g0Var2.l(gVar);
                } else {
                    g0Var2.q0();
                }
                fVar = b3.h.f;
                q.I(w0VarD, g0Var2, fVar);
                fVar2 = b3.h.e;
                q.I(m1VarM, g0Var2, fVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                fVar3 = b3.h.g;
                q.I(numValueOf, g0Var2, fVar3);
                eVar = b3.h.h;
                q.E(g0Var2, eVar);
                fVar4 = b3.h.d;
                q.I(rVarC3, g0Var2, fVar4);
                r rVarD = z1.d(rVar3, 1.0f);
                hVar = b2.b.K;
                v1 v1VarA = t1.a(h0.i.g(f6), hVar, g0Var2, 54);
                int iHashCode2 = Long.hashCode(g0Var2.T);
                m1 m1VarM2 = g0Var2.m();
                r rVarC4 = b2.a.c(rVarD, g0Var2);
                g0Var2.g0();
                if (g0Var2.S) {
                    g0Var2.l(gVar);
                } else {
                    g0Var2.q0();
                }
                q.I(v1VarA, g0Var2, fVar);
                q.I(m1VarM2, g0Var2, fVar2);
                a1.b.v(iHashCode2, g0Var2, fVar3, g0Var2, eVar);
                q.I(rVarC4, g0Var2, fVar4);
                w0 w0VarD2 = h0.o.d(b2.b.E, false);
                int iHashCode3 = Long.hashCode(g0Var2.T);
                m1 m1VarM3 = g0Var2.m();
                r rVarC5 = b2.a.c(rVar3, g0Var2);
                g0Var2.g0();
                if (g0Var2.S) {
                    g0Var2.l(gVar);
                } else {
                    g0Var2.q0();
                }
                q.I(w0VarD2, g0Var2, fVar);
                q.I(m1VarM3, g0Var2, fVar2);
                a1.b.v(iHashCode3, g0Var2, fVar3, g0Var2, eVar);
                q.I(rVarC5, g0Var2, fVar4);
                f4 = 16;
                i9 = 0;
                h0.o.a(n.f(f2.h.c(z1.m(rVar3, 48), p0.f.a(f4)), t.b(0.1f, j), o0Var), g0Var2, 0);
                if (z2) {
                    g0Var2.c0(1148671255);
                    f50.c.g((cc.a) jVarA.getValue(), z1.m(rVar3, f4), g0Var2, 1572912);
                    g0Var2.r(false);
                } else {
                    g0Var2.c0(1148970870);
                    z6.b(String.valueOf(playerItem.getSurahNumber()), (r) null, t.b(((Number) p2VarB.getValue()).floatValue(), j), kh.o.z(18), u.D, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var2, 1597440, 0, 262058);
                    g0Var2 = g0Var2;
                    i9 = 0;
                    g0Var2.r(false);
                }
                g0Var2.r(true);
                f5 = 4;
                r rVarD2 = z1.d(h0.c.E(rVar3, 0.0f, f5, 1), 0.65f);
                v vVarA = h0.u.a(h0.i.c, b2.b.M, g0Var2, i9);
                int iHashCode4 = Long.hashCode(g0Var2.T);
                m1 m1VarM4 = g0Var2.m();
                r rVarC6 = b2.a.c(rVarD2, g0Var2);
                g0Var2.g0();
                if (g0Var2.S) {
                    g0Var2.l(gVar);
                } else {
                    g0Var2.q0();
                }
                q.I(vVarA, g0Var2, fVar);
                q.I(m1VarM4, g0Var2, fVar2);
                a1.b.v(iHashCode4, g0Var2, fVar3, g0Var2, eVar);
                q.I(rVarC6, g0Var2, fVar4);
                v1 v1VarA2 = t1.a(h0.i.g(f6), hVar, g0Var2, 54);
                int iHashCode5 = Long.hashCode(g0Var2.T);
                m1 m1VarM5 = g0Var2.m();
                r rVarC7 = b2.a.c(rVar3, g0Var2);
                g0Var2.g0();
                if (g0Var2.S) {
                    g0Var2.l(gVar);
                } else {
                    g0Var2.q0();
                }
                q.I(v1VarA2, g0Var2, fVar);
                q.I(m1VarM5, g0Var2, fVar2);
                a1.b.v(iHashCode5, g0Var2, fVar3, g0Var2, eVar);
                q.I(rVarC7, g0Var2, fVar4);
                g0 g0Var6 = g0Var2;
                String surahTranscription = playerItem.getSurahTranscription();
                long jB2 = t.b(((Number) p2VarB.getValue()).floatValue(), j);
                long jZ = kh.o.z(16);
                long jZ2 = kh.o.z(16);
                u uVar = u.D;
                z6.b(surahTranscription, (r) null, jB2, jZ, uVar, (q3.i) null, 0L, (x3.l) null, (x3.k) null, jZ2, 2, false, 1, 0, (u00.k) null, (r0) null, g0Var6, 1597440, 25008, 239530);
                g0Var3 = g0Var6;
                if (mVar == y3.m.A || r30.k.L0(playerItem.getSurahOriginalName())) {
                    z17 = false;
                    g0Var3.c0(-1688061846);
                    g0Var3.r(false);
                } else {
                    g0Var3.c0(-1688526815);
                    z6.b(a1.b.p("(", playerItem.getSurahOriginalName(), ")"), (r) null, t.b(((Number) p2VarB.getValue()).floatValue(), dl.a.o), kh.o.z(16), uVar, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(16), 2, false, 1, 0, (u00.k) null, (r0) null, g0Var3, 1597440, 25008, 239530);
                    g0Var3 = g0Var3;
                    z17 = false;
                    g0Var3.r(false);
                }
                g0Var3.r(true);
                if (z12) {
                    surahTranslation = playerItem.getReciterName();
                } else {
                    surahTranslation = playerItem.getSurahTranslation();
                }
                g0Var4 = g0Var3;
                z6.b(surahTranslation, (r) null, t.b(((Number) p2VarB.getValue()).floatValue(), dl.a.o), kh.o.z(12), (u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(12), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var4, 24576, 48, 260074);
                g0Var4.r(true);
                if (z3) {
                    g0Var4.c0(1083900755);
                    if (1.0f <= 0.0d) {
                        i0.a.a("invalid weight; must be greater than zero");
                    }
                    c1 c1Var = new c1(1.0f, true);
                    v1 v1VarA3 = t1.a(h0.i.b, hVar, g0Var4, 54);
                    int iHashCode6 = Long.hashCode(g0Var4.T);
                    m1 m1VarM6 = g0Var4.m();
                    r rVarC8 = b2.a.c(c1Var, g0Var4);
                    g0Var4.g0();
                    if (g0Var4.S) {
                        g0Var4.l(gVar);
                    } else {
                        g0Var4.q0();
                    }
                    q.I(v1VarA3, g0Var4, fVar);
                    q.I(m1VarM6, g0Var4, fVar2);
                    a1.b.v(iHashCode6, g0Var4, fVar3, g0Var4, eVar);
                    q.I(rVarC8, g0Var4, fVar4);
                    if (z5 && f == null && zBooleanValue) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z9 = z4;
                    c0.d(z19, (r) null, (x0) null, (y0) null, (String) null, v1.d.d(-1049484587, new e1.f(z9, aVar, 3), g0Var4), g0Var4, 1572870, 30);
                    if (f != null) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    c0.d(z21, (r) null, (x0) null, (y0) null, (String) null, v1.d.d(672951116, new jv.b(aVar2, f, 2), g0Var4), g0Var4, 1572870, 30);
                    aVar4 = aVar5;
                    z18 = true;
                    wr.k.u(z, onToggleFavorites, h0.c.C(rVar3, f5), 0.0f, 0L, z5, onDeleteClicked, 0, false, aVar4, 0.0f, g0Var4, ((i14 >> 3) & 14) | 384 | ((i14 >> 12) & 112) | ((i14 >> 9) & 458752) | (i14 & 3670016) | ((i8 << 12) & 1879048192), 0, 1432);
                    g0Var = g0Var4;
                    g0Var.r(true);
                    g0Var.r(false);
                } else {
                    z9 = z4;
                    boolean z23 = z17;
                    u00.a aVar6 = aVar5;
                    g0Var4.c0(1086004539);
                    if (1.0f <= 0.0d) {
                        i0.a.a("invalid weight; must be greater than zero");
                    }
                    c1 c1Var2 = new c1(1.0f, true);
                    w0 w0VarD3 = h0.o.d(iVar, z23);
                    int iHashCode7 = Long.hashCode(g0Var4.T);
                    m1 m1VarM7 = g0Var4.m();
                    r rVarC9 = b2.a.c(c1Var2, g0Var4);
                    g0Var4.g0();
                    if (g0Var4.S) {
                        g0Var4.l(gVar);
                    } else {
                        g0Var4.q0();
                    }
                    q.I(w0VarD3, g0Var4, fVar);
                    q.I(m1VarM7, g0Var4, fVar2);
                    a1.b.v(iHashCode7, g0Var4, fVar3, g0Var4, eVar);
                    q.I(rVarC9, g0Var4, fVar4);
                    aVar4 = aVar6;
                    z18 = true;
                    wr.k.u(z, onToggleFavorites, h0.c.C(s.a.a(rVar3, b2.b.F), f5), 0.0f, 0L, z5, onDeleteClicked, 0, false, aVar4, 0.0f, g0Var4, ((i14 >> 3) & 14) | ((i14 >> 12) & 112) | ((i14 >> 9) & 458752) | (i14 & 3670016) | ((i8 << 12) & 1879048192), 0, 1432);
                    g0Var = g0Var4;
                    g0Var.r(true);
                    g0Var.r(z23);
                }
                g0Var.r(z18);
                g0Var.r(z18);
                z11 = z12;
                rVar2 = rVar5;
            } else {
                z9 = z4;
                g0Var = g0Var5;
                g0Var.V();
                rVar2 = rVar;
                z11 = z7;
                aVar4 = aVar3;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                final boolean z24 = z9;
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iK = q.K(i | 1);
                        int iK2 = q.K(i2);
                        a.g(playerItem, z, z2, z3, onClick, onToggleFavorites, onDeleteClicked, z24, z5, rVar2, z6, z11, f, aVar, aVar2, aVar4, (j) obj, iK, iK2, i3);
                        return g00.b0.a;
                    }
                };
            }
        }
        i15 |= 48;
        i5 = i15 | (g0Var5.g(f) ? 256 : 128) | (g0Var5.i(aVar) ? 2048 : 1024) | (g0Var5.i(aVar2) ? 16384 : 8192);
        i6 = i3 & 32768;
        if (i6 != 0) {
            i7 = i5 | 196608;
        } else {
            i7 = i5 | (g0Var5.i(aVar3) ? 131072 : 65536);
        }
        i8 = i7;
        if ((i14 & 306783379) == 306783378) {
            z8 = true;
        } else {
            z8 = true;
        }
        if (g0Var5.S(i14 & 1, z8)) {
            rVar3 = o.A;
            if (i13 != 0) {
                rVar4 = rVar3;
            } else {
                rVar4 = rVar;
            }
            if (i16 != 0) {
                z12 = false;
            } else {
                z12 = z7;
            }
            if (i6 != 0) {
                aVar5 = null;
            } else {
                aVar5 = aVar3;
            }
            mVar = (y3.m) g0Var5.k(o1.n);
            jVarA = k.A(new gc.k(), g0Var5);
            if ((i14 & 234881024) == 67108864) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z25 = z13;
            if ((i14 & 29360128) == 8388608) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z25 | z14;
            objN = g0Var5.N();
            if (z15) {
                if (z5) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                objN = Boolean.valueOf(z16);
                g0Var5.n0(objN);
            } else {
                if (z5) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                objN = Boolean.valueOf(z16);
                g0Var5.n0(objN);
            }
            zBooleanValue = ((Boolean) objN).booleanValue();
            if (zBooleanValue) {
                f2 = 1.0f;
            } else {
                f2 = 0.4f;
            }
            r rVar6 = rVar4;
            p2VarB = x.d.b(f2, (y) null, (String) null, g0Var5, 0, 30);
            g0Var2 = g0Var5;
            r rVarC10 = f2.h.c(z1.d(rVar6, 1.0f), p0.f.a(20));
            j = dl.a.i;
            if (z6) {
                f3 = 0.0f;
            } else {
                f3 = 0.0f;
            }
            long jB3 = t.b(f3, j);
            o0 o0Var2 = b0.b;
            r rVarN2 = w50.c.n(n.f(rVarC10, jB3, o0Var2), zBooleanValue, onClick);
            float f7 = 8;
            r rVarC11 = h0.c.C(rVarN2, f7);
            iVar = b2.b.A;
            w0 w0VarD4 = h0.o.d(iVar, false);
            int iHashCode8 = Long.hashCode(g0Var2.T);
            m1 m1VarM8 = g0Var2.m();
            r rVarC12 = b2.a.c(rVarC11, g0Var2);
            b3.i.c.getClass();
            gVar = b3.h.b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            fVar = b3.h.f;
            q.I(w0VarD4, g0Var2, fVar);
            fVar2 = b3.h.e;
            q.I(m1VarM8, g0Var2, fVar2);
            Integer numValueOf2 = Integer.valueOf(iHashCode8);
            fVar3 = b3.h.g;
            q.I(numValueOf2, g0Var2, fVar3);
            eVar = b3.h.h;
            q.E(g0Var2, eVar);
            fVar4 = b3.h.d;
            q.I(rVarC12, g0Var2, fVar4);
            r rVarD3 = z1.d(rVar3, 1.0f);
            hVar = b2.b.K;
            v1 v1VarA4 = t1.a(h0.i.g(f7), hVar, g0Var2, 54);
            int iHashCode9 = Long.hashCode(g0Var2.T);
            m1 m1VarM9 = g0Var2.m();
            r rVarC13 = b2.a.c(rVarD3, g0Var2);
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            q.I(v1VarA4, g0Var2, fVar);
            q.I(m1VarM9, g0Var2, fVar2);
            a1.b.v(iHashCode9, g0Var2, fVar3, g0Var2, eVar);
            q.I(rVarC13, g0Var2, fVar4);
            w0 w0VarD5 = h0.o.d(b2.b.E, false);
            int iHashCode10 = Long.hashCode(g0Var2.T);
            m1 m1VarM10 = g0Var2.m();
            r rVarC14 = b2.a.c(rVar3, g0Var2);
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            q.I(w0VarD5, g0Var2, fVar);
            q.I(m1VarM10, g0Var2, fVar2);
            a1.b.v(iHashCode10, g0Var2, fVar3, g0Var2, eVar);
            q.I(rVarC14, g0Var2, fVar4);
            f4 = 16;
            i9 = 0;
            h0.o.a(n.f(f2.h.c(z1.m(rVar3, 48), p0.f.a(f4)), t.b(0.1f, j), o0Var2), g0Var2, 0);
            if (z2) {
                g0Var2.c0(1148671255);
                f50.c.g((cc.a) jVarA.getValue(), z1.m(rVar3, f4), g0Var2, 1572912);
                g0Var2.r(false);
            } else {
                g0Var2.c0(1148970870);
                z6.b(String.valueOf(playerItem.getSurahNumber()), (r) null, t.b(((Number) p2VarB.getValue()).floatValue(), j), kh.o.z(18), u.D, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var2, 1597440, 0, 262058);
                g0Var2 = g0Var2;
                i9 = 0;
                g0Var2.r(false);
            }
            g0Var2.r(true);
            f5 = 4;
            r rVarD4 = z1.d(h0.c.E(rVar3, 0.0f, f5, 1), 0.65f);
            v vVarA2 = h0.u.a(h0.i.c, b2.b.M, g0Var2, i9);
            int iHashCode11 = Long.hashCode(g0Var2.T);
            m1 m1VarM11 = g0Var2.m();
            r rVarC15 = b2.a.c(rVarD4, g0Var2);
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            q.I(vVarA2, g0Var2, fVar);
            q.I(m1VarM11, g0Var2, fVar2);
            a1.b.v(iHashCode11, g0Var2, fVar3, g0Var2, eVar);
            q.I(rVarC15, g0Var2, fVar4);
            v1 v1VarA5 = t1.a(h0.i.g(f7), hVar, g0Var2, 54);
            int iHashCode12 = Long.hashCode(g0Var2.T);
            m1 m1VarM12 = g0Var2.m();
            r rVarC16 = b2.a.c(rVar3, g0Var2);
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            q.I(v1VarA5, g0Var2, fVar);
            q.I(m1VarM12, g0Var2, fVar2);
            a1.b.v(iHashCode12, g0Var2, fVar3, g0Var2, eVar);
            q.I(rVarC16, g0Var2, fVar4);
            g0 g0Var7 = g0Var2;
            String surahTranscription2 = playerItem.getSurahTranscription();
            long jB4 = t.b(((Number) p2VarB.getValue()).floatValue(), j);
            long jZ3 = kh.o.z(16);
            long jZ4 = kh.o.z(16);
            u uVar2 = u.D;
            z6.b(surahTranscription2, (r) null, jB4, jZ3, uVar2, (q3.i) null, 0L, (x3.l) null, (x3.k) null, jZ4, 2, false, 1, 0, (u00.k) null, (r0) null, g0Var7, 1597440, 25008, 239530);
            g0Var3 = g0Var7;
            if (mVar == y3.m.A) {
                z17 = false;
                g0Var3.c0(-1688061846);
                g0Var3.r(false);
            } else {
                z17 = false;
                g0Var3.c0(-1688061846);
                g0Var3.r(false);
            }
            g0Var3.r(true);
            if (z12) {
                surahTranslation = playerItem.getReciterName();
            } else {
                surahTranslation = playerItem.getSurahTranslation();
            }
            g0Var4 = g0Var3;
            z6.b(surahTranslation, (r) null, t.b(((Number) p2VarB.getValue()).floatValue(), dl.a.o), kh.o.z(12), (u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(12), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var4, 24576, 48, 260074);
            g0Var4.r(true);
            if (z3) {
                g0Var4.c0(1083900755);
                if (1.0f <= 0.0d) {
                    i0.a.a("invalid weight; must be greater than zero");
                }
                c1 c1Var3 = new c1(1.0f, true);
                v1 v1VarA6 = t1.a(h0.i.b, hVar, g0Var4, 54);
                int iHashCode13 = Long.hashCode(g0Var4.T);
                m1 m1VarM13 = g0Var4.m();
                r rVarC17 = b2.a.c(c1Var3, g0Var4);
                g0Var4.g0();
                if (g0Var4.S) {
                    g0Var4.l(gVar);
                } else {
                    g0Var4.q0();
                }
                q.I(v1VarA6, g0Var4, fVar);
                q.I(m1VarM13, g0Var4, fVar2);
                a1.b.v(iHashCode13, g0Var4, fVar3, g0Var4, eVar);
                q.I(rVarC17, g0Var4, fVar4);
                if (z5) {
                    z19 = false;
                } else {
                    z19 = false;
                }
                z9 = z4;
                c0.d(z19, (r) null, (x0) null, (y0) null, (String) null, v1.d.d(-1049484587, new e1.f(z9, aVar, 3), g0Var4), g0Var4, 1572870, 30);
                if (f != null) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                c0.d(z21, (r) null, (x0) null, (y0) null, (String) null, v1.d.d(672951116, new jv.b(aVar2, f, 2), g0Var4), g0Var4, 1572870, 30);
                aVar4 = aVar5;
                z18 = true;
                wr.k.u(z, onToggleFavorites, h0.c.C(rVar3, f5), 0.0f, 0L, z5, onDeleteClicked, 0, false, aVar4, 0.0f, g0Var4, ((i14 >> 3) & 14) | 384 | ((i14 >> 12) & 112) | ((i14 >> 9) & 458752) | (i14 & 3670016) | ((i8 << 12) & 1879048192), 0, 1432);
                g0Var = g0Var4;
                g0Var.r(true);
                g0Var.r(false);
            } else {
                z9 = z4;
                boolean z26 = z17;
                u00.a aVar7 = aVar5;
                g0Var4.c0(1086004539);
                if (1.0f <= 0.0d) {
                    i0.a.a("invalid weight; must be greater than zero");
                }
                c1 c1Var4 = new c1(1.0f, true);
                w0 w0VarD6 = h0.o.d(iVar, z26);
                int iHashCode14 = Long.hashCode(g0Var4.T);
                m1 m1VarM14 = g0Var4.m();
                r rVarC18 = b2.a.c(c1Var4, g0Var4);
                g0Var4.g0();
                if (g0Var4.S) {
                    g0Var4.l(gVar);
                } else {
                    g0Var4.q0();
                }
                q.I(w0VarD6, g0Var4, fVar);
                q.I(m1VarM14, g0Var4, fVar2);
                a1.b.v(iHashCode14, g0Var4, fVar3, g0Var4, eVar);
                q.I(rVarC18, g0Var4, fVar4);
                aVar4 = aVar7;
                z18 = true;
                wr.k.u(z, onToggleFavorites, h0.c.C(s.a.a(rVar3, b2.b.F), f5), 0.0f, 0L, z5, onDeleteClicked, 0, false, aVar4, 0.0f, g0Var4, ((i14 >> 3) & 14) | ((i14 >> 12) & 112) | ((i14 >> 9) & 458752) | (i14 & 3670016) | ((i8 << 12) & 1879048192), 0, 1432);
                g0Var = g0Var4;
                g0Var.r(true);
                g0Var.r(z26);
            }
            g0Var.r(z18);
            g0Var.r(z18);
            z11 = z12;
            rVar2 = rVar6;
        } else {
            z9 = z4;
            g0Var = g0Var5;
            g0Var.V();
            rVar2 = rVar;
            z11 = z7;
            aVar4 = aVar3;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            final boolean z27 = z9;
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = q.K(i | 1);
                    int iK2 = q.K(i2);
                    a.g(playerItem, z, z2, z3, onClick, onToggleFavorites, onDeleteClicked, z27, z5, rVar2, z6, z11, f, aVar, aVar2, aVar4, (j) obj, iK, iK2, i3);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void h(bx.c reciter, boolean z, boolean z2, u00.a onPlayClicked, u00.a onShuffleClicked, u00.a onFavoriteClicked, u00.a aVar, r rVar, j jVar, int i) {
        u00.a aVar2;
        r rVar2;
        float f;
        long j;
        long j2;
        String str;
        boolean z3;
        u00.a onInfoClicked = aVar;
        b2.h hVar = b2.b.K;
        m.e(reciter, "reciter");
        String str2 = reciter.g;
        String str3 = reciter.h;
        m.e(onPlayClicked, "onPlayClicked");
        m.e(onShuffleClicked, "onShuffleClicked");
        m.e(onFavoriteClicked, "onFavoriteClicked");
        m.e(onInfoClicked, "onInfoClicked");
        g0 g0Var = (g0) jVar;
        g0Var.e0(2046578224);
        int i2 = i | (g0Var.i(reciter) ? 4 : 2) | (g0Var.h(z) ? 32 : 16) | (g0Var.h(z2) ? 256 : 128) | (g0Var.i(onPlayClicked) ? 2048 : 1024) | (g0Var.i(onShuffleClicked) ? 16384 : 8192) | (g0Var.i(onFavoriteClicked) ? 131072 : 65536) | (g0Var.i(onInfoClicked) ? 1048576 : 524288) | 12582912;
        if (g0Var.S(i2 & 1, (4793491 & i2) != 4793490)) {
            Configuration configuration = (Configuration) g0Var.k(c3.o0.a);
            kk.c cVarD = kk.e.d(g0Var);
            p2 p2VarB = x.d.b(z2 ? 1.0f : 0.5f, (y) null, (String) null, g0Var, 0, 30);
            boolean zE = g0Var.e(configuration.screenHeightDp);
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (zE || objN == obj) {
                objN = q.r(new bs.i(configuration, 2));
                g0Var.n0(objN);
            }
            p2 p2Var = (p2) objN;
            r rVar3 = o.A;
            r rVarD = z1.d(rVar3, 1.0f);
            v vVarA = h0.u.a(h0.i.c, b2.b.M, g0Var, 0);
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
            r rVarD2 = z1.d(rVar3, 1.0f);
            b2.i iVar = b2.b.H;
            w0 w0VarD = h0.o.d(iVar, false);
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
            r rVarE = z1.e(z1.d(rVar3, 1.0f), ((y3.f) p2Var.getValue()).A);
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
            q2 q2Var = c3.o0.b;
            wb.h hVar2 = new wb.h((Context) g0Var.k(q2Var));
            String str4 = reciter.e;
            if (str4.length() <= 0) {
                str4 = null;
            }
            hVar2.c = str4;
            hVar2.q = new xb.e(xb.g.c);
            hVar2.s = null;
            hVar2.t = null;
            hVar2.u = null;
            hVar2.b();
            mb.j jVarI = mb.l.i(hVar2.a(), (p) null, g0Var, 0, 62);
            h0.a0 a0Var = z1.c;
            b2.h hVar3 = hVar;
            n.c(jVarI, (String) null, rd.a.g0(0, 0, dl.a.s, kk.e.a(a0Var, cVarD), !(jVarI.j() instanceof mb.g)), (b2.d) null, z2.o.a, 0.0f, g0Var, 24624, 104);
            bi.b.e(cVarD, dl.a.L, s.a.a(rVar3, iVar).V(a0Var), 1.0f, 32.0f, g0Var, 27648);
            g0Var.r(true);
            float f2 = 32;
            float f3 = 16;
            r rVarG = h0.c.G(h0.c.A(rVar3, 0.0f, f2, 1), f3, 0.0f, f3, f3, 2);
            b2.g gVar2 = b2.b.N;
            float f4 = 8;
            v vVarA2 = h0.u.a(h0.i.g(f4), gVar2, g0Var, 54);
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
            String str5 = reciter.b;
            long j3 = dl.a.i;
            z6.b(str5, (r) null, j3, kh.o.z(28), u.D, (q3.i) null, 0L, (x3.l) null, new x3.k(3), kh.o.z(28), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 48, 258986);
            g0 g0Var2 = g0Var;
            if (reciter.i.length() > 0) {
                g0Var2.c0(159170086);
                Context context = (Context) g0Var2.k(q2Var);
                boolean zG = g0Var2.g(str3);
                f = f4;
                Object objN2 = g0Var2.N();
                if (zG) {
                    j2 = j3;
                } else {
                    j2 = j3;
                    if (objN2 == obj) {
                    }
                    str = (String) objN2;
                    v1 v1VarA = t1.a(h0.i.g(f), hVar3, g0Var2, 54);
                    int iHashCode5 = Long.hashCode(g0Var2.T);
                    m1 m1VarM5 = g0Var2.m();
                    r rVarC5 = b2.a.c(rVar3, g0Var2);
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar);
                    } else {
                        g0Var2.q0();
                    }
                    q.I(v1VarA, g0Var2, fVar);
                    q.I(m1VarM5, g0Var2, fVar2);
                    a1.b.v(iHashCode5, g0Var2, fVar3, g0Var2, eVar);
                    q.I(rVarC5, g0Var2, fVar4);
                    if (str != null || str.length() == 0) {
                        j = j2;
                        z3 = false;
                        g0Var2.c0(868832643);
                        g0Var2.r(false);
                    } else {
                        g0Var2.c0(868234095);
                        r rVarC6 = f2.h.c(z1.m(rVar3, f3), p0.f.a(2));
                        wb.h hVar4 = new wb.h(context);
                        hVar4.c = a1.b.o("file:///android_asset/", str);
                        hVar4.b();
                        j = j2;
                        mb.l.d(hVar4.a(), rVarC6, (v1.c) null, z2.o.b, g0Var2, 48, 129016);
                        g0Var2 = g0Var2;
                        z3 = false;
                        g0Var2.r(false);
                    }
                    g0 g0Var3 = g0Var2;
                    z6.b(reciter.i, (r) null, dl.a.k, kh.o.z(16), u.B, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(16), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var3, 1597440, 48, 260010);
                    g0Var2 = g0Var3;
                    g0Var2.r(true);
                    g0Var2.r(z3);
                }
                objN2 = new xm.a(context).a(str3);
                g0Var2.n0(objN2);
                str = (String) objN2;
                v1 v1VarA2 = t1.a(h0.i.g(f), hVar3, g0Var2, 54);
                int iHashCode6 = Long.hashCode(g0Var2.T);
                m1 m1VarM6 = g0Var2.m();
                r rVarC7 = b2.a.c(rVar3, g0Var2);
                g0Var2.g0();
                if (g0Var2.S) {
                    g0Var2.l(gVar);
                } else {
                    g0Var2.q0();
                }
                q.I(v1VarA2, g0Var2, fVar);
                q.I(m1VarM6, g0Var2, fVar2);
                a1.b.v(iHashCode6, g0Var2, fVar3, g0Var2, eVar);
                q.I(rVarC7, g0Var2, fVar4);
                if (str != null) {
                    j = j2;
                    z3 = false;
                    g0Var2.c0(868832643);
                    g0Var2.r(false);
                } else {
                    j = j2;
                    z3 = false;
                    g0Var2.c0(868832643);
                    g0Var2.r(false);
                }
                g0 g0Var4 = g0Var2;
                z6.b(reciter.i, (r) null, dl.a.k, kh.o.z(16), u.B, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(16), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var4, 1597440, 48, 260010);
                g0Var2 = g0Var4;
                g0Var2.r(true);
                g0Var2.r(z3);
            } else {
                f = f4;
                j = j3;
                hVar3 = hVar3;
                g0Var2.c0(160613508);
                g0Var2.r(false);
            }
            r rVarG2 = h0.c.G(z1.d(rVar3, 1.0f), 0.0f, f, 0.0f, 0.0f, 13);
            v1 v1VarA3 = t1.a(h0.i.h(f3, gVar2), hVar3, g0Var2, 54);
            int iHashCode7 = Long.hashCode(g0Var2.T);
            m1 m1VarM7 = g0Var2.m();
            r rVarC8 = b2.a.c(rVarG2, g0Var2);
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            q.I(v1VarA3, g0Var2, fVar);
            q.I(m1VarM7, g0Var2, fVar2);
            a1.b.v(iHashCode7, g0Var2, fVar3, g0Var2, eVar);
            q.I(rVarC8, g0Var2, fVar4);
            float f5 = 44;
            r rVarM = z1.m(rVar3, f5);
            p0.e eVar2 = p0.f.a;
            r rVarC9 = f2.h.c(rVarM, eVar2);
            b2.h hVar5 = hVar3;
            long j4 = j;
            long jB = t.b(0.18f, j4);
            o0 o0Var = b0.b;
            r rVarO = w50.c.o(n.f(rVarC9, jB, o0Var), false, null, onShuffleClicked, 7);
            b2.i iVar2 = b2.b.E;
            w0 w0VarD3 = h0.o.d(iVar2, false);
            int iHashCode8 = Long.hashCode(g0Var2.T);
            m1 m1VarM8 = g0Var2.m();
            r rVarC10 = b2.a.c(rVarO, g0Var2);
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            q.I(w0VarD3, g0Var2, fVar);
            q.I(m1VarM8, g0Var2, fVar2);
            a1.b.v(iHashCode8, g0Var2, fVar3, g0Var2, eVar);
            q.I(rVarC10, g0Var2, fVar4);
            float f6 = 20;
            g0 g0Var5 = g0Var2;
            z3.j(y3.R(2131231384, g0Var2, 0), (String) null, z1.m(rVar3, f6), t.b(((Number) p2VarB.getValue()).floatValue(), j4), g0Var5, 440, 0);
            g0Var5.r(true);
            r rVarD3 = h0.c.D(w50.c.o(n.f(f2.h.c(rVar3, p0.f.a(f2)), t.c, o0Var), false, null, onPlayClicked, 7), f6, 12);
            v1 v1VarA4 = t1.a(h0.i.g(f), hVar5, g0Var5, 54);
            int iHashCode9 = Long.hashCode(g0Var5.T);
            m1 m1VarM9 = g0Var5.m();
            r rVarC11 = b2.a.c(rVarD3, g0Var5);
            g0Var5.g0();
            if (g0Var5.S) {
                g0Var5.l(gVar);
            } else {
                g0Var5.q0();
            }
            q.I(v1VarA4, g0Var5, fVar);
            q.I(m1VarM9, g0Var5, fVar2);
            a1.b.v(iHashCode9, g0Var5, fVar3, g0Var5, eVar);
            q.I(rVarC11, g0Var5, fVar4);
            r rVarM2 = z1.m(rVar3, 14);
            m2.b bVarR = y3.R(2131231358, g0Var5, 0);
            long j5 = t.b;
            z3.j(bVarR, (String) null, rVarM2, j5, g0Var5, 3512, 0);
            z6.b(z3.U(g0Var5, 2131887055), (r) null, j5, kh.o.z(16), u.K, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(16), 2, false, 1, 0, (u00.k) null, (r0) null, g0Var5, 1597824, 25008, 239530);
            g0Var5.r(true);
            r rVarF = n.f(f2.h.c(z1.m(rVar3, f5), eVar2), t.b(0.18f, j4), o0Var);
            aVar2 = onFavoriteClicked;
            r rVarO2 = w50.c.o(rVarF, false, null, aVar2, 7);
            w0 w0VarD4 = h0.o.d(iVar2, false);
            int iHashCode10 = Long.hashCode(g0Var5.T);
            m1 m1VarM10 = g0Var5.m();
            r rVarC12 = b2.a.c(rVarO2, g0Var5);
            g0Var5.g0();
            if (g0Var5.S) {
                g0Var5.l(gVar);
            } else {
                g0Var5.q0();
            }
            q.I(w0VarD4, g0Var5, fVar);
            q.I(m1VarM10, g0Var5, fVar2);
            a1.b.v(iHashCode10, g0Var5, fVar3, g0Var5, eVar);
            q.I(rVarC12, g0Var5, fVar4);
            z3.j(y3.R(z ? 2131231389 : 2131231388, g0Var5, 0), (String) null, z1.m(rVar3, f6), dl.a.k, g0Var5, 440, 0);
            g0Var = g0Var5;
            g0Var.r(true);
            g0Var.r(true);
            g0Var.r(true);
            g0Var.r(true);
            h0.c.h(z1.e(rVar3, f2), g0Var);
            if (str2.length() > 0) {
                g0Var.c0(340693575);
                onInfoClicked = aVar;
                i(str2, onInfoClicked, h0.c.G(z1.d(rVar3, 1.0f), f3, f, f3, 0.0f, 8), g0Var, (i2 >> 15) & 112);
                g0Var.r(false);
            } else {
                onInfoClicked = aVar;
                g0Var.c0(341063560);
                g0Var.r(false);
            }
            g0Var.r(true);
            rVar2 = rVar3;
        } else {
            aVar2 = onFavoriteClicked;
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new c(reciter, z, z2, onPlayClicked, onShuffleClicked, aVar2, onInfoClicked, rVar2, i, 1);
        }
    }

    public static final void i(String bio, u00.a onMoreClicked, r rVar, j jVar, int i) {
        int i2;
        j jVar2;
        m3.h hVar;
        CharSequence charSequenceSubSequence;
        r rVar2 = rVar;
        m.e(bio, "bio");
        m.e(onMoreClicked, "onMoreClicked");
        j jVar3 = (g0) jVar;
        jVar3.e0(1704725231);
        if ((i & 6) == 0) {
            i2 = (jVar3.g(bio) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= jVar3.i(onMoreClicked) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= jVar3.g(rVar2) ? 256 : 128;
        }
        if (jVar3.S(i2 & 1, (i2 & 147) != 146)) {
            String strU = z3.U(jVar3, 2131886801);
            long jB = t.b(0.5f, dl.a.i);
            r0 r0Var = new r0(jB, kh.o.z(13), (u) null, (q3.i) null, 0L, 0L, 0, 0, kh.o.z(18), (z) null, 16646140);
            boolean z = (i2 & 14) == 4;
            Object objN = jVar3.N();
            Object obj = l1.i.a;
            if (z || objN == obj) {
                Pattern patternCompile = Pattern.compile("\\s+");
                m.d(patternCompile, "compile(...)");
                String strReplaceAll = patternCompile.matcher(bio).replaceAll(" ");
                m.d(strReplaceAll, "replaceAll(...)");
                objN = r30.k.j1(strReplaceAll).toString();
                jVar3.n0(objN);
            }
            String str = (String) objN;
            boolean zG = jVar3.g(str);
            Object objN2 = jVar3.N();
            if (zG || objN2 == obj) {
                objN2 = oi.k.s(-1, jVar3);
            }
            f1 f1Var = (l1.y0) objN2;
            f1 f1Var2 = f1Var;
            boolean zG2 = jVar3.g(str) | jVar3.e(f1Var2.h()) | jVar3.g(strU) | jVar3.f(jB);
            Object objN3 = jVar3.N();
            if (zG2 || objN3 == obj) {
                if (f1Var2.h() >= 0) {
                    String strSubstring = str.substring(0, f1Var2.h());
                    m.d(strSubstring, "substring(...)");
                    int length = strSubstring.length() - 1;
                    if (length < 0) {
                        charSequenceSubSequence = "";
                        break;
                    }
                    while (true) {
                        int i3 = length - 1;
                        if (!z3.J(strSubstring.charAt(length))) {
                            charSequenceSubSequence = strSubstring.subSequence(0, length + 1);
                            break;
                        } else {
                            if (i3 < 0) {
                                charSequenceSubSequence = "";
                                break;
                            }
                            length = i3;
                        }
                    }
                    String string = charSequenceSubSequence.toString();
                    m3.e eVar = new m3.e();
                    int iE = eVar.e(new i0(jB, 0L, (u) null, (q3.o) null, (q3.p) null, (q3.i) null, (String) null, 0L, (x3.a) null, (x3.p) null, (t3.b) null, 0L, (x3.l) null, (s0) null, 65534));
                    try {
                        eVar.b(string);
                        eVar.b("… ");
                        eVar.d(iE);
                        StringBuilder sb = eVar.A;
                        int length2 = sb.length();
                        eVar.b(strU);
                        e eVar2 = new e(0, onMoreClicked);
                        long j = dl.a.m;
                        u uVar = u.K;
                        eVar.a(new m3.m("reciter_info", new m3.o0(new i0(j, 0L, uVar, (q3.o) null, (q3.p) null, (q3.i) null, (String) null, 0L, (x3.a) null, (x3.p) null, (t3.b) null, 0L, (x3.l) null, (s0) null, 65530), (i0) null, (i0) null, (i0) null), eVar2), length2, sb.length());
                        eVar.C.add(new m3.d(new i0(j, 0L, uVar, (q3.o) null, (q3.p) null, (q3.i) null, (String) null, 0L, (x3.a) null, (x3.p) null, (t3.b) null, 0L, (x3.l) null, (s0) null, 65530), length2, sb.length(), 8));
                        hVar = eVar.f();
                    } catch (Throwable th) {
                        eVar.d(iE);
                        throw th;
                    }
                } else {
                    hVar = new m3.h(str);
                }
                objN3 = hVar;
                jVar3.n0(objN3);
            }
            m3.h hVar2 = (m3.h) objN3;
            boolean zG3 = jVar3.g(f1Var) | jVar3.g(strU) | jVar3.g(str);
            Object objN4 = jVar3.N();
            if (zG3 || objN4 == obj) {
                objN4 = new b1.l(strU, str, f1Var, 24);
                jVar3.n0(objN4);
            }
            jVar2 = jVar3;
            rVar2 = rVar;
            z6.c(hVar2, rVar2, 0L, 0L, (u) null, 0L, (x3.k) null, 0L, 2, false, 2, 0, (Map) null, (u00.k) objN4, r0Var, jVar2, (i2 >> 3) & 112, 24960, 110588);
        } else {
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new bs.f(bio, onMoreClicked, rVar2, i);
        }
    }

    public static final void j(nx.i0 uiState, u00.k onAction, j jVar, int i) {
        int i2;
        String str;
        boolean z;
        String strT;
        m.e(uiState, "uiState");
        bx.c cVar = uiState.b;
        Collection collection = uiState.c;
        String str2 = uiState.m;
        m.e(onAction, "onAction");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1098922401);
        if ((i & 6) == 0) {
            i2 = (g0Var.g(uiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.i(onAction) ? 32 : 16;
        }
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            boolean z2 = uiState.l;
            o oVar = o.A;
            Object obj = l1.i.a;
            if (z2) {
                g0Var.c0(-1756309044);
                r rVarQ = z1.q(oVar, 350);
                String strU = z3.U(g0Var, 2131886425);
                if (str2 == null) {
                    strT = oi.k.o(g0Var, -1756136963, 2131886426, g0Var, false);
                } else {
                    g0Var.c0(-1756027254);
                    strT = z3.T(2131886424, new Object[]{str2}, g0Var);
                    g0Var.r(false);
                }
                String str3 = strT;
                z = (i2 & 112) == 32;
                Object objN = g0Var.N();
                if (z || objN == obj) {
                    objN = new oo.y0(10, onAction);
                    g0Var.n0(objN);
                }
                wr.k.H(strU, str3, (u00.a) objN, rVarQ, 0L, null, null, v1.d.d(-735521085, new bs.e(7, onAction), g0Var), g0Var, 12585984, 112);
                g0Var.r(false);
            } else {
                if (uiState.n) {
                    g0Var.c0(-1754769801);
                    r rVarQ2 = z1.q(oVar, 350);
                    String strU2 = z3.U(g0Var, 2131886423);
                    Integer numValueOf = Integer.valueOf(((h00.b) collection).a());
                    str = cVar != null ? cVar.b : null;
                    String strT2 = z3.T(2131886422, new Object[]{numValueOf, str != null ? str : ""}, g0Var);
                    z = (i2 & 112) == 32;
                    Object objN2 = g0Var.N();
                    if (z || objN2 == obj) {
                        objN2 = new oo.y0(12, onAction);
                        g0Var.n0(objN2);
                    }
                    wr.k.H(strU2, strT2, (u00.a) objN2, rVarQ2, 0L, null, null, v1.d.d(1642228090, new bs.e(8, onAction), g0Var), g0Var, 12585984, 112);
                    g0Var.r(false);
                } else if (uiState.k) {
                    g0Var.c0(-1753353783);
                    r rVarQ3 = z1.q(oVar, 350);
                    String strU3 = z3.U(g0Var, 2131886421);
                    Integer numValueOf2 = Integer.valueOf(((h00.b) collection).a());
                    str = cVar != null ? cVar.b : null;
                    String strT3 = z3.T(2131886420, new Object[]{numValueOf2, str != null ? str : ""}, g0Var);
                    z = (i2 & 112) == 32;
                    Object objN3 = g0Var.N();
                    if (z || objN3 == obj) {
                        objN3 = new oo.y0(13, onAction);
                        g0Var.n0(objN3);
                    }
                    wr.k.H(strU3, strT3, (u00.a) objN3, rVarQ3, 0L, null, null, v1.d.d(1651998651, new bs.e(9, onAction), g0Var), g0Var, 12585984, 112);
                    g0Var.r(false);
                } else {
                    g0Var.c0(-1750862685);
                    g0Var.r(false);
                }
            }
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new ct.l(uiState, onAction, i, 12);
        }
    }

    public static final void k(final int i, final int i2, final u30.b downloadingProgress, final u00.a onDownloadAllClicked, final u00.a onCancelAllDownloadingClicked, final u00.a onAllDownloadedClicked, final r rVar, boolean z, int i3, j jVar, final int i4, final int i5) {
        boolean z2;
        int i6;
        int i7;
        int i8;
        boolean z3;
        final boolean z4;
        final int i9;
        r1 r1VarT;
        int i11;
        boolean z5;
        int i12;
        boolean zIsEmpty;
        final boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z11;
        Object objN;
        float f;
        Float f2;
        b3.g gVar;
        b3.f fVar;
        b3.f fVar2;
        b3.f fVar3;
        b3.e eVar;
        b3.f fVar4;
        boolean z12;
        boolean z13;
        float f3;
        o oVar;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        Object obj;
        final boolean z19;
        boolean z21;
        p2 p2VarB;
        boolean zG;
        Object objN2;
        int i13 = i2;
        m.e(downloadingProgress, "downloadingProgress");
        m.e(onDownloadAllClicked, "onDownloadAllClicked");
        m.e(onCancelAllDownloadingClicked, "onCancelAllDownloadingClicked");
        m.e(onAllDownloadedClicked, "onAllDownloadedClicked");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1716664387);
        int i14 = i4 | (g0Var.e(i) ? 4 : 2) | (g0Var.e(i13) ? 32 : 16) | (g0Var.i(downloadingProgress) ? 256 : 128) | (g0Var.i(onDownloadAllClicked) ? 2048 : 1024) | (g0Var.i(onCancelAllDownloadingClicked) ? 16384 : 8192) | (g0Var.i(onAllDownloadedClicked) ? 131072 : 65536) | (g0Var.g(rVar) ? 1048576 : 524288);
        int i15 = i5 & 128;
        if (i15 != 0) {
            i6 = i14 | 12582912;
            z2 = z;
        } else {
            z2 = z;
            i6 = i14 | (g0Var.h(z2) ? 8388608 : 4194304);
        }
        if ((i5 & 256) == 0) {
            i7 = i3;
            int i16 = g0Var.e(i7) ? 67108864 : 33554432;
            i8 = i6 | i16;
            if ((i8 & 38347923) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (g0Var.S(i8 & 1, z3)) {
                g0Var.X();
                if ((i4 & 1) != 0 || g0Var.A()) {
                    if (i15 != 0) {
                        z2 = true;
                    }
                    if ((i5 & 256) != 0) {
                        i11 = i8 & (-234881025);
                        z5 = z2;
                        i12 = i;
                    }
                    g0Var.s();
                    zIsEmpty = downloadingProgress.isEmpty();
                    z6 = !zIsEmpty;
                    if (i12 > 0 || i13 != i12) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    boolean zH = ((((i11 & 234881024) ^ 100663296) <= 67108864 && g0Var.e(i12)) || (i11 & 100663296) == 67108864) | g0Var.h(z6);
                    if ((i11 & 112) == 32) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    boolean z22 = zH | z8;
                    if ((i11 & 896) != 256 || g0Var.g(downloadingProgress)) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z11 = z22 | z9;
                    objN = g0Var.N();
                    l1.c cVar = l1.i.a;
                    if (!z11 || objN == cVar) {
                        if (!zIsEmpty || i12 == 0) {
                            f = 1.0f;
                            objN = null;
                        } else {
                            Iterator<E> it = downloadingProgress.iterator();
                            double dFloatValue = 0.0d;
                            while (it.hasNext()) {
                                dFloatValue += (double) ((yt.a) it.next()).g.floatValue();
                                i13 = i2;
                            }
                            f = 1.0f;
                            objN = Float.valueOf(ab.a0.x((float) ((((double) i13) + dFloatValue) / ((double) i12)), 0.05f, 1.0f));
                        }
                        g0Var.n0(objN);
                    } else {
                        f = 1.0f;
                    }
                    f2 = (Float) objN;
                    r rVarG = h0.c.G(z1.d(rVar, f), 0.0f, 12, 0.0f, 0.0f, 13);
                    v1 v1VarA = t1.a(h0.i.g(8), b2.b.K, g0Var, 54);
                    int iHashCode = Long.hashCode(g0Var.T);
                    m1 m1VarM = g0Var.m();
                    r rVarC = b2.a.c(rVarG, g0Var);
                    b3.i.c.getClass();
                    gVar = b3.h.b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    fVar = b3.h.f;
                    q.I(v1VarA, g0Var, fVar);
                    fVar2 = b3.h.e;
                    q.I(m1VarM, g0Var, fVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    fVar3 = b3.h.g;
                    q.I(numValueOf, g0Var, fVar3);
                    eVar = b3.h.h;
                    q.E(g0Var, eVar);
                    fVar4 = b3.h.d;
                    q.I(rVarC, g0Var, fVar4);
                    z12 = z5;
                    if (1.0f <= 0.0d) {
                        i0.a.a("invalid weight; must be greater than zero");
                    }
                    z6.b(z3.T(2131887326, new Object[]{Integer.valueOf(i)}, g0Var), new c1(1.0f, true), dl.a.n, kh.o.z(20), u.D, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(26), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 48, 260008);
                    if (z12) {
                        g0Var.c0(681610454);
                        f3 = 20;
                        oVar = o.A;
                        r rVarM = z1.m(oVar, f3);
                        boolean zH2 = g0Var.h(z7);
                        z14 = z7;
                        if ((i11 & 458752) == 131072) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        boolean zH3 = z15 | zH2 | g0Var.h(z6);
                        if ((57344 & i11) == 16384) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        boolean z23 = zH3 | z16;
                        if ((i11 & 7168) == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z23 | z17;
                        Object objN3 = g0Var.N();
                        if (!z18 || objN3 == cVar) {
                            z19 = z14;
                            obj = new u00.a() {
                                @Override
                                public final Object invoke() {
                                    if (z19) {
                                        onAllDownloadedClicked.invoke();
                                    } else if (z6) {
                                        onCancelAllDownloadingClicked.invoke();
                                    } else {
                                        onDownloadAllClicked.invoke();
                                    }
                                    return g00.b0.a;
                                }
                            };
                            g0Var.n0(obj);
                        } else {
                            obj = objN3;
                            z19 = z14;
                        }
                        r rVarO = w50.c.o(rVarM, false, null, (u00.a) obj, 7);
                        w0 w0VarD = h0.o.d(b2.b.E, false);
                        int iHashCode2 = Long.hashCode(g0Var.T);
                        m1 m1VarM2 = g0Var.m();
                        r rVarC2 = b2.a.c(rVarO, g0Var);
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
                        if (z19) {
                            g0Var.c0(-623037906);
                            o3.a(y3.R(2131231105, g0Var, 0), (String) null, z1.m(oVar, f3), t.b(0.5f, dl.a.i), g0Var, 440, 0);
                            g0Var = g0Var;
                            g0Var.r(false);
                            z21 = false;
                        } else {
                            g0Var = g0Var;
                            if (f2 != null) {
                                g0Var.c0(-622643152);
                                z21 = false;
                                p2VarB = x.d.b(f2.floatValue(), (y) null, (String) null, g0Var, 0, 30);
                                r rVarM2 = z1.m(oVar, f3);
                                long j = dl.a.m;
                                long jB = t.b(0.2f, j);
                                float f4 = 3;
                                zG = g0Var.g(p2VarB);
                                objN2 = g0Var.N();
                                if (zG || objN2 == cVar) {
                                    objN2 = new l(p2VarB, 11);
                                    g0Var.n0(objN2);
                                }
                                v5.b((u00.a) objN2, rVarM2, j, f4, jB, 0, 0.0f, g0Var, 3120, 96);
                                g0Var.r(false);
                            } else {
                                z21 = false;
                                g0Var.c0(-622092592);
                                o3.a(y3.R(2131231106, g0Var, 0), (String) null, z1.m(oVar, f3), dl.a.m, g0Var, 440, 0);
                                g0Var.r(false);
                            }
                        }
                        z13 = true;
                        g0Var.r(true);
                        g0Var.r(z21);
                    } else {
                        i12 = i12;
                        g0Var = g0Var;
                        z13 = true;
                        g0Var.c0(683412329);
                        g0Var.r(false);
                    }
                    g0Var.r(z13);
                    z4 = z12;
                    i9 = i12;
                } else {
                    g0Var.V();
                    if ((i5 & 256) != 0) {
                        i8 &= -234881025;
                    }
                }
                i11 = i8;
                z5 = z2;
                i12 = i7;
                g0Var.s();
                zIsEmpty = downloadingProgress.isEmpty();
                z6 = !zIsEmpty;
                if (i12 > 0) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                boolean zH4 = ((((i11 & 234881024) ^ 100663296) <= 67108864 && g0Var.e(i12)) || (i11 & 100663296) == 67108864) | g0Var.h(z6);
                if ((i11 & 112) == 32) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean z24 = zH4 | z8;
                if ((i11 & 896) != 256) {
                    z9 = true;
                } else {
                    z9 = true;
                }
                z11 = z24 | z9;
                objN = g0Var.N();
                l1.c cVar2 = l1.i.a;
                if (z11) {
                    if (zIsEmpty) {
                        f = 1.0f;
                        objN = null;
                    } else {
                        f = 1.0f;
                        objN = null;
                    }
                    g0Var.n0(objN);
                } else {
                    if (zIsEmpty) {
                        f = 1.0f;
                        objN = null;
                    } else {
                        f = 1.0f;
                        objN = null;
                    }
                    g0Var.n0(objN);
                }
                f2 = (Float) objN;
                r rVarG2 = h0.c.G(z1.d(rVar, f), 0.0f, 12, 0.0f, 0.0f, 13);
                v1 v1VarA2 = t1.a(h0.i.g(8), b2.b.K, g0Var, 54);
                int iHashCode3 = Long.hashCode(g0Var.T);
                m1 m1VarM3 = g0Var.m();
                r rVarC3 = b2.a.c(rVarG2, g0Var);
                b3.i.c.getClass();
                gVar = b3.h.b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                fVar = b3.h.f;
                q.I(v1VarA2, g0Var, fVar);
                fVar2 = b3.h.e;
                q.I(m1VarM3, g0Var, fVar2);
                Integer numValueOf2 = Integer.valueOf(iHashCode3);
                fVar3 = b3.h.g;
                q.I(numValueOf2, g0Var, fVar3);
                eVar = b3.h.h;
                q.E(g0Var, eVar);
                fVar4 = b3.h.d;
                q.I(rVarC3, g0Var, fVar4);
                z12 = z5;
                if (1.0f <= 0.0d) {
                    i0.a.a("invalid weight; must be greater than zero");
                }
                z6.b(z3.T(2131887326, new Object[]{Integer.valueOf(i)}, g0Var), new c1(1.0f, true), dl.a.n, kh.o.z(20), u.D, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(26), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 48, 260008);
                if (z12) {
                    g0Var.c0(681610454);
                    f3 = 20;
                    oVar = o.A;
                    r rVarM3 = z1.m(oVar, f3);
                    boolean zH5 = g0Var.h(z7);
                    z14 = z7;
                    if ((i11 & 458752) == 131072) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean zH6 = z15 | zH5 | g0Var.h(z6);
                    if ((57344 & i11) == 16384) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean z25 = zH6 | z16;
                    if ((i11 & 7168) == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z25 | z17;
                    Object objN4 = g0Var.N();
                    if (z18) {
                        z19 = z14;
                        obj = new u00.a() {
                            @Override
                            public final Object invoke() {
                                if (z19) {
                                    onAllDownloadedClicked.invoke();
                                } else if (z6) {
                                    onCancelAllDownloadingClicked.invoke();
                                } else {
                                    onDownloadAllClicked.invoke();
                                }
                                return g00.b0.a;
                            }
                        };
                        g0Var.n0(obj);
                    } else {
                        z19 = z14;
                        obj = new u00.a() {
                            @Override
                            public final Object invoke() {
                                if (z19) {
                                    onAllDownloadedClicked.invoke();
                                } else if (z6) {
                                    onCancelAllDownloadingClicked.invoke();
                                } else {
                                    onDownloadAllClicked.invoke();
                                }
                                return g00.b0.a;
                            }
                        };
                        g0Var.n0(obj);
                    }
                    r rVarO2 = w50.c.o(rVarM3, false, null, (u00.a) obj, 7);
                    w0 w0VarD2 = h0.o.d(b2.b.E, false);
                    int iHashCode4 = Long.hashCode(g0Var.T);
                    m1 m1VarM4 = g0Var.m();
                    r rVarC4 = b2.a.c(rVarO2, g0Var);
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    q.I(w0VarD2, g0Var, fVar);
                    q.I(m1VarM4, g0Var, fVar2);
                    a1.b.v(iHashCode4, g0Var, fVar3, g0Var, eVar);
                    q.I(rVarC4, g0Var, fVar4);
                    if (z19) {
                        g0Var.c0(-623037906);
                        o3.a(y3.R(2131231105, g0Var, 0), (String) null, z1.m(oVar, f3), t.b(0.5f, dl.a.i), g0Var, 440, 0);
                        g0Var = g0Var;
                        g0Var.r(false);
                        z21 = false;
                    } else {
                        g0Var = g0Var;
                        if (f2 != null) {
                            g0Var.c0(-622643152);
                            z21 = false;
                            p2VarB = x.d.b(f2.floatValue(), (y) null, (String) null, g0Var, 0, 30);
                            r rVarM4 = z1.m(oVar, f3);
                            long j2 = dl.a.m;
                            long jB2 = t.b(0.2f, j2);
                            float f5 = 3;
                            zG = g0Var.g(p2VarB);
                            objN2 = g0Var.N();
                            if (zG) {
                                objN2 = new l(p2VarB, 11);
                                g0Var.n0(objN2);
                            } else {
                                objN2 = new l(p2VarB, 11);
                                g0Var.n0(objN2);
                            }
                            v5.b((u00.a) objN2, rVarM4, j2, f5, jB2, 0, 0.0f, g0Var, 3120, 96);
                            g0Var.r(false);
                        } else {
                            z21 = false;
                            g0Var.c0(-622092592);
                            o3.a(y3.R(2131231106, g0Var, 0), (String) null, z1.m(oVar, f3), dl.a.m, g0Var, 440, 0);
                            g0Var.r(false);
                        }
                    }
                    z13 = true;
                    g0Var.r(true);
                    g0Var.r(z21);
                } else {
                    i12 = i12;
                    g0Var = g0Var;
                    z13 = true;
                    g0Var.c0(683412329);
                    g0Var.r(false);
                }
                g0Var.r(z13);
                z4 = z12;
                i9 = i12;
            } else {
                g0Var.V();
                z4 = z2;
                i9 = i7;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new u00.n(i, i2, downloadingProgress, onDownloadAllClicked, onCancelAllDownloadingClicked, onAllDownloadedClicked, rVar, z4, i9, i4, i5) {
                    public final int A;
                    public final int B;
                    public final u30.b C;
                    public final u00.a D;
                    public final u00.a E;
                    public final u00.a F;
                    public final r G;
                    public final boolean H;
                    public final int I;
                    public final int J;

                    {
                        this.J = i5;
                    }

                    @Override
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iK = q.K(513);
                        a.k(this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, (j) obj2, iK, this.J);
                        return g00.b0.a;
                    }
                };
            }
        }
        i7 = i3;
        i8 = i6 | i16;
        if ((i8 & 38347923) != 38347922) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (g0Var.S(i8 & 1, z3)) {
            g0Var.X();
            if ((i4 & 1) != 0) {
                if (i15 != 0) {
                    z2 = true;
                }
                if ((i5 & 256) != 0) {
                    i11 = i8 & (-234881025);
                    z5 = z2;
                    i12 = i;
                } else {
                    i11 = i8;
                    z5 = z2;
                    i12 = i7;
                }
            } else {
                if (i15 != 0) {
                    z2 = true;
                }
                if ((i5 & 256) != 0) {
                    i11 = i8 & (-234881025);
                    z5 = z2;
                    i12 = i;
                } else {
                    i11 = i8;
                    z5 = z2;
                    i12 = i7;
                }
            }
            g0Var.s();
            zIsEmpty = downloadingProgress.isEmpty();
            z6 = !zIsEmpty;
            if (i12 > 0) {
                z7 = false;
            } else {
                z7 = false;
            }
            boolean zH7 = ((((i11 & 234881024) ^ 100663296) <= 67108864 && g0Var.e(i12)) || (i11 & 100663296) == 67108864) | g0Var.h(z6);
            if ((i11 & 112) == 32) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z26 = zH7 | z8;
            if ((i11 & 896) != 256) {
                z9 = true;
            } else {
                z9 = true;
            }
            z11 = z26 | z9;
            objN = g0Var.N();
            l1.c cVar3 = l1.i.a;
            if (z11) {
                if (zIsEmpty) {
                    f = 1.0f;
                    objN = null;
                } else {
                    f = 1.0f;
                    objN = null;
                }
                g0Var.n0(objN);
            } else {
                if (zIsEmpty) {
                    f = 1.0f;
                    objN = null;
                } else {
                    f = 1.0f;
                    objN = null;
                }
                g0Var.n0(objN);
            }
            f2 = (Float) objN;
            r rVarG3 = h0.c.G(z1.d(rVar, f), 0.0f, 12, 0.0f, 0.0f, 13);
            v1 v1VarA3 = t1.a(h0.i.g(8), b2.b.K, g0Var, 54);
            int iHashCode5 = Long.hashCode(g0Var.T);
            m1 m1VarM5 = g0Var.m();
            r rVarC5 = b2.a.c(rVarG3, g0Var);
            b3.i.c.getClass();
            gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            fVar = b3.h.f;
            q.I(v1VarA3, g0Var, fVar);
            fVar2 = b3.h.e;
            q.I(m1VarM5, g0Var, fVar2);
            Integer numValueOf3 = Integer.valueOf(iHashCode5);
            fVar3 = b3.h.g;
            q.I(numValueOf3, g0Var, fVar3);
            eVar = b3.h.h;
            q.E(g0Var, eVar);
            fVar4 = b3.h.d;
            q.I(rVarC5, g0Var, fVar4);
            z12 = z5;
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            z6.b(z3.T(2131887326, new Object[]{Integer.valueOf(i)}, g0Var), new c1(1.0f, true), dl.a.n, kh.o.z(20), u.D, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(26), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 48, 260008);
            if (z12) {
                g0Var.c0(681610454);
                f3 = 20;
                oVar = o.A;
                r rVarM5 = z1.m(oVar, f3);
                boolean zH8 = g0Var.h(z7);
                z14 = z7;
                if ((i11 & 458752) == 131072) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean zH9 = z15 | zH8 | g0Var.h(z6);
                if ((57344 & i11) == 16384) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z27 = zH9 | z16;
                if ((i11 & 7168) == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z27 | z17;
                Object objN5 = g0Var.N();
                if (z18) {
                    z19 = z14;
                    obj = new u00.a() {
                        @Override
                        public final Object invoke() {
                            if (z19) {
                                onAllDownloadedClicked.invoke();
                            } else if (z6) {
                                onCancelAllDownloadingClicked.invoke();
                            } else {
                                onDownloadAllClicked.invoke();
                            }
                            return g00.b0.a;
                        }
                    };
                    g0Var.n0(obj);
                } else {
                    z19 = z14;
                    obj = new u00.a() {
                        @Override
                        public final Object invoke() {
                            if (z19) {
                                onAllDownloadedClicked.invoke();
                            } else if (z6) {
                                onCancelAllDownloadingClicked.invoke();
                            } else {
                                onDownloadAllClicked.invoke();
                            }
                            return g00.b0.a;
                        }
                    };
                    g0Var.n0(obj);
                }
                r rVarO3 = w50.c.o(rVarM5, false, null, (u00.a) obj, 7);
                w0 w0VarD3 = h0.o.d(b2.b.E, false);
                int iHashCode6 = Long.hashCode(g0Var.T);
                m1 m1VarM6 = g0Var.m();
                r rVarC6 = b2.a.c(rVarO3, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                q.I(w0VarD3, g0Var, fVar);
                q.I(m1VarM6, g0Var, fVar2);
                a1.b.v(iHashCode6, g0Var, fVar3, g0Var, eVar);
                q.I(rVarC6, g0Var, fVar4);
                if (z19) {
                    g0Var.c0(-623037906);
                    o3.a(y3.R(2131231105, g0Var, 0), (String) null, z1.m(oVar, f3), t.b(0.5f, dl.a.i), g0Var, 440, 0);
                    g0Var = g0Var;
                    g0Var.r(false);
                    z21 = false;
                } else {
                    g0Var = g0Var;
                    if (f2 != null) {
                        g0Var.c0(-622643152);
                        z21 = false;
                        p2VarB = x.d.b(f2.floatValue(), (y) null, (String) null, g0Var, 0, 30);
                        r rVarM6 = z1.m(oVar, f3);
                        long j3 = dl.a.m;
                        long jB3 = t.b(0.2f, j3);
                        float f6 = 3;
                        zG = g0Var.g(p2VarB);
                        objN2 = g0Var.N();
                        if (zG) {
                            objN2 = new l(p2VarB, 11);
                            g0Var.n0(objN2);
                        } else {
                            objN2 = new l(p2VarB, 11);
                            g0Var.n0(objN2);
                        }
                        v5.b((u00.a) objN2, rVarM6, j3, f6, jB3, 0, 0.0f, g0Var, 3120, 96);
                        g0Var.r(false);
                    } else {
                        z21 = false;
                        g0Var.c0(-622092592);
                        o3.a(y3.R(2131231106, g0Var, 0), (String) null, z1.m(oVar, f3), dl.a.m, g0Var, 440, 0);
                        g0Var.r(false);
                    }
                }
                z13 = true;
                g0Var.r(true);
                g0Var.r(z21);
            } else {
                i12 = i12;
                g0Var = g0Var;
                z13 = true;
                g0Var.c0(683412329);
                g0Var.r(false);
            }
            g0Var.r(z13);
            z4 = z12;
            i9 = i12;
        } else {
            g0Var.V();
            z4 = z2;
            i9 = i7;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n(i, i2, downloadingProgress, onDownloadAllClicked, onCancelAllDownloadingClicked, onAllDownloadedClicked, rVar, z4, i9, i4, i5) {
                public final int A;
                public final int B;
                public final u30.b C;
                public final u00.a D;
                public final u00.a E;
                public final u00.a F;
                public final r G;
                public final boolean H;
                public final int I;
                public final int J;

                {
                    this.J = i5;
                }

                @Override
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iK = q.K(513);
                    a.k(this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, (j) obj2, iK, this.J);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void l(r rVar, v1.c cVar, j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1203904866);
        int i2 = (g0Var.g(rVar) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            r rVarC = h0.c.C(n.f(f2.h.c(z1.d(rVar, 1.0f), p0.f.a(24)), t.b(0.1f, dl.a.i), b0.b), 8);
            v vVarA = h0.u.a(h0.i.c, b2.b.M, g0Var, 0);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC2 = b2.a.c(rVarC, g0Var);
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
            q.I(rVarC2, g0Var, b3.h.d);
            cVar.invoke(w.a, g0Var, 54);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new j0(rVar, cVar, i, 3);
        }
    }
}
