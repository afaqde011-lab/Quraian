package jv;

import a1.v2;
import b2.o;
import b2.r;
import c3.o1;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import d0.o2;
import g1.n5;
import g1.o3;
import g1.v6;
import g1.w6;
import g1.z6;
import gv.j0;
import h0.a0;
import h0.c1;
import h0.p1;
import h0.s;
import h0.t1;
import h0.v;
import h0.v1;
import h0.z1;
import i2.b0;
import i2.o0;
import i2.t;
import j0.x;
import java.util.List;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.m1;
import l1.p2;
import l1.q;
import l1.r1;
import l1.z0;
import m3.r0;
import q0.i1;
import q3.u;
import qd.s0;
import u00.p;
import w.b2;
import w.c0;
import w.x0;
import w.y0;
import x.y;
import x3.l;
import z.n;
import z2.w0;

public abstract class a {
    public static final v1.c a = new v1.c(new eu.b(23), -1384377260, false);
    public static final v1.c b = new v1.c(new jk.c(2), -1916241869, false);

    public static final void a(final PlayerItem playerItem, final u00.a onClick, u00.a onToggleFavorites, u00.a onDownloadClicked, u00.a onCancelDownloadingClicked, final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, Float f, l1.j jVar, final int i) {
        g0 g0Var;
        u00.a aVar;
        u00.a aVar2;
        u00.a aVar3;
        int i2;
        float f2;
        long j;
        final Float f3 = f;
        m.e(playerItem, "playerItem");
        m.e(onClick, "onClick");
        m.e(onToggleFavorites, "onToggleFavorites");
        m.e(onDownloadClicked, "onDownloadClicked");
        m.e(onCancelDownloadingClicked, "onCancelDownloadingClicked");
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(-1259089215);
        int i3 = i | (g0Var2.g(playerItem) ? 4 : 2) | (g0Var2.i(onClick) ? 32 : 16) | (g0Var2.i(onToggleFavorites) ? 256 : 128) | (g0Var2.i(onDownloadClicked) ? 2048 : 1024) | (g0Var2.i(onCancelDownloadingClicked) ? 16384 : 8192) | (g0Var2.h(z) ? 131072 : 65536) | (g0Var2.h(z2) ? 1048576 : 524288) | (g0Var2.h(z3) ? 8388608 : 4194304) | (g0Var2.h(z4) ? 67108864 : 33554432) | (g0Var2.h(z5) ? 536870912 : 268435456);
        if (g0Var2.S(i3 & 1, ((i3 & 306783379) == 306783378 && ((g0Var2.g(f3) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            y3.m mVar = (y3.m) g0Var2.k(o1.n);
            gc.j jVarA = f50.k.A(new gc.k(), g0Var2);
            p2 p2VarA = b2.a(z ? t.b(0.06f, dl.a.i) : t.f, (y) null, (String) null, g0Var2, 0, 14);
            g0 g0Var3 = g0Var2;
            o oVar = o.A;
            float f4 = 12;
            float f5 = 4;
            r rVarC = f2.h.c(h0.c.D(z1.d(oVar, 1.0f), f4, f5), p0.f.a(14));
            long j2 = ((t) p2VarA.getValue()).a;
            o0 o0Var = b0.b;
            float f6 = 8;
            r rVarD = h0.c.D(w50.c.n(n.f(rVarC, j2, o0Var), true, onClick), f6, 6);
            b2.h hVar = b2.b.K;
            v1 v1VarA = t1.a(h0.i.g(f6), hVar, g0Var3, 54);
            int iHashCode = Long.hashCode(g0Var3.T);
            m1 m1VarM = g0Var3.m();
            r rVarC2 = b2.a.c(rVarD, g0Var3);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var3.g0();
            if (g0Var3.S) {
                g0Var3.l(gVar);
            } else {
                g0Var3.q0();
            }
            b3.f fVar = b3.h.f;
            q.I(v1VarA, g0Var3, fVar);
            b3.f fVar2 = b3.h.e;
            q.I(m1VarM, g0Var3, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            q.I(numValueOf, g0Var3, fVar3);
            b3.e eVar = b3.h.h;
            q.E(g0Var3, eVar);
            b3.f fVar4 = b3.h.d;
            q.I(rVarC2, g0Var3, fVar4);
            w0 w0VarD = h0.o.d(b2.b.E, false);
            int iHashCode2 = Long.hashCode(g0Var3.T);
            m1 m1VarM2 = g0Var3.m();
            r rVarC3 = b2.a.c(oVar, g0Var3);
            g0Var3.g0();
            if (g0Var3.S) {
                g0Var3.l(gVar);
            } else {
                g0Var3.q0();
            }
            q.I(w0VarD, g0Var3, fVar);
            q.I(m1VarM2, g0Var3, fVar2);
            a1.b.v(iHashCode2, g0Var3, fVar3, g0Var3, eVar);
            q.I(rVarC3, g0Var3, fVar4);
            h0.o.a(n.f(f2.h.c(z1.m(oVar, 42), p0.f.a(f4)), t.b(0.4f, dl.a.J), o0Var), g0Var3, 0);
            if (z2) {
                g0Var3.c0(-1032115275);
                i2 = 16;
                f50.c.g((cc.a) jVarA.getValue(), z1.m(oVar, 16), g0Var3, 1572912);
                g0Var3.r(false);
                f2 = 1.0f;
            } else {
                i2 = 16;
                g0Var3.c0(-1031896105);
                f2 = 1.0f;
                z6.b(String.valueOf(playerItem.getSurahNumber()), (r) null, dl.a.k, kh.o.z(16), u.D, (q3.i) null, 0L, (l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var3, 1597440, 0, 262058);
                g0Var3 = g0Var3;
                g0Var3.r(false);
            }
            g0Var3.r(true);
            if (f2 <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            c1 c1Var = new c1(f2, true);
            v vVarA = h0.u.a(h0.i.c, b2.b.M, g0Var3, 0);
            int iHashCode3 = Long.hashCode(g0Var3.T);
            m1 m1VarM3 = g0Var3.m();
            r rVarC4 = b2.a.c(c1Var, g0Var3);
            g0Var3.g0();
            if (g0Var3.S) {
                g0Var3.l(gVar);
            } else {
                g0Var3.q0();
            }
            q.I(vVarA, g0Var3, fVar);
            q.I(m1VarM3, g0Var3, fVar2);
            a1.b.v(iHashCode3, g0Var3, fVar3, g0Var3, eVar);
            q.I(rVarC4, g0Var3, fVar4);
            v1 v1VarA2 = t1.a(h0.i.g(f6), hVar, g0Var3, 54);
            int iHashCode4 = Long.hashCode(g0Var3.T);
            m1 m1VarM4 = g0Var3.m();
            r rVarC5 = b2.a.c(oVar, g0Var3);
            g0Var3.g0();
            if (g0Var3.S) {
                g0Var3.l(gVar);
            } else {
                g0Var3.q0();
            }
            q.I(v1VarA2, g0Var3, fVar);
            q.I(m1VarM4, g0Var3, fVar2);
            a1.b.v(iHashCode4, g0Var3, fVar3, g0Var3, eVar);
            q.I(rVarC5, g0Var3, fVar4);
            String surahTranscription = playerItem.getSurahTranscription();
            long j3 = dl.a.k;
            long jZ = kh.o.z(i2);
            long jZ2 = kh.o.z(i2);
            u uVar = u.D;
            g0 g0Var4 = g0Var3;
            z6.b(surahTranscription, (r) null, j3, jZ, uVar, (q3.i) null, 0L, (l) null, (x3.k) null, jZ2, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var4, 1597440, 48, 260010);
            g0 g0Var5 = g0Var4;
            if (mVar != y3.m.A || r30.k.L0(playerItem.getSurahOriginalName())) {
                j = j3;
                g0Var5.c0(2147027231);
                g0Var5.r(false);
            } else {
                g0Var5.c0(2146723958);
                String strP = a1.b.p("(", playerItem.getSurahOriginalName(), ")");
                long jB = t.b(0.8f, j3);
                long jZ3 = kh.o.z(i2);
                long jZ4 = kh.o.z(i2);
                j = j3;
                z6.b(strP, (r) null, jB, jZ3, uVar, (q3.i) null, 0L, (l) null, (x3.k) null, jZ4, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var5, 1597440, 48, 260010);
                g0Var5 = g0Var5;
                g0Var5.r(false);
            }
            g0Var5.r(true);
            g0 g0Var6 = g0Var5;
            z6.b(playerItem.getSurahTranslation(), (r) null, t.b(0.7f, j), kh.o.z(12), (u) null, (q3.i) null, 0L, (l) null, (x3.k) null, kh.o.z(12), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var6, 24576, 48, 260074);
            g0Var6.r(true);
            v1 v1VarA3 = t1.a(h0.i.g(f5), hVar, g0Var6, 54);
            int iHashCode5 = Long.hashCode(g0Var6.T);
            m1 m1VarM5 = g0Var6.m();
            r rVarC6 = b2.a.c(oVar, g0Var6);
            g0Var6.g0();
            if (g0Var6.S) {
                g0Var6.l(gVar);
            } else {
                g0Var6.q0();
            }
            q.I(v1VarA3, g0Var6, fVar);
            q.I(m1VarM5, g0Var6, fVar2);
            a1.b.v(iHashCode5, g0Var6, fVar3, g0Var6, eVar);
            q.I(rVarC6, g0Var6, fVar4);
            aVar2 = onDownloadClicked;
            c0.d(!z4 && f == null, (r) null, (x0) null, (y0) null, (String) null, v1.d.d(2128716833, new e1.f(z5, aVar2, 1), g0Var6), g0Var6, 1572870, 30);
            aVar3 = onCancelDownloadingClicked;
            f3 = f;
            c0.d(f != null, (r) null, (x0) null, (y0) null, (String) null, v1.d.d(1238370442, new b(aVar3, f3, 0), g0Var6), g0Var6, 1572870, 30);
            aVar = onToggleFavorites;
            o3.a(y3.R(z3 ? 2131231389 : 2131231388, g0Var6, 0), (String) null, h0.c.C(w50.c.o(z1.m(oVar, 28), false, null, aVar, 7), f5), j, g0Var6, 56, 0);
            g0Var = g0Var6;
            g0Var.r(true);
            g0Var.r(true);
        } else {
            g0Var = g0Var2;
            aVar = onToggleFavorites;
            aVar2 = onDownloadClicked;
            aVar3 = onCancelDownloadingClicked;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            final u00.a aVar4 = aVar2;
            final u00.a aVar5 = aVar3;
            final u00.a aVar6 = aVar;
            r1VarT.d = new u00.n(onClick, aVar6, aVar4, aVar5, z, z2, z3, z4, z5, f3, i) {
                public final u00.a B;
                public final u00.a C;
                public final u00.a D;
                public final u00.a E;
                public final boolean F;
                public final boolean G;
                public final boolean H;
                public final boolean I;
                public final boolean J;
                public final Float K;

                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = q.K(1);
                    a.a(this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, (l1.j) obj, iK);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void b(final bv.o1 uiState, final u00.k onAction, r rVar, l1.j jVar, int i) {
        long jB;
        long jB2;
        z0 z0Var;
        m.e(uiState, "uiState");
        boolean z = uiState.h;
        int i2 = uiState.i;
        m.e(onAction, "onAction");
        g0 g0Var = (g0) jVar;
        g0Var.e0(206077071);
        int i3 = i | (g0Var.g(uiState) ? 4 : 2) | (g0Var.i(onAction) ? 32 : 16);
        if (g0Var.S(i3 & 1, (i3 & 147) != 146)) {
            j0.v vVarA = x.a(0, g0Var, 3);
            Object[] objArr = new Object[0];
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (objN == obj) {
                objN = new h.e(7);
                g0Var.n0(objN);
            }
            z0 z0Var2 = (z0) y1.k.c(objArr, (u00.a) objN, g0Var, 48);
            final p2 p2VarA = b2.a(z ? t.b(0.3f, dl.a.i) : t.b(0.06f, dl.a.i), (y) null, (String) null, g0Var, 0, 14);
            final p2 p2VarA2 = b2.a(z ? dl.a.k : t.b(0.7f, dl.a.k), (y) null, (String) null, g0Var, 0, 14);
            if (i2 != 0) {
                jB = (i2 == 1 || i2 == 2) ? t.b(0.3f, dl.a.i) : t.b(0.06f, dl.a.i);
            } else {
                jB = t.b(0.06f, dl.a.i);
            }
            final p2 p2VarA3 = b2.a(jB, (y) null, (String) null, g0Var, 0, 14);
            if (i2 != 0) {
                jB2 = (i2 == 1 || i2 == 2) ? dl.a.k : t.b(0.7f, dl.a.k);
            } else {
                jB2 = t.b(0.7f, dl.a.k);
            }
            final p2 p2VarA4 = b2.a(jB2, (y) null, (String) null, g0Var, 0, 14);
            boolean zE = g0Var.e(i2);
            Object objN2 = g0Var.N();
            if (zE || objN2 == obj) {
                int i4 = 2131231371;
                if (i2 != 0 && i2 == 1) {
                    i4 = 2131231372;
                }
                objN2 = Integer.valueOf(i4);
                g0Var.n0(objN2);
            }
            final int iIntValue = ((Number) objN2).intValue();
            boolean zG = g0Var.g((String) z0Var2.getValue()) | g0Var.g(uiState.o);
            Object objN3 = g0Var.N();
            if (zG || objN3 == obj) {
                z0Var = z0Var2;
                objN3 = q.r(new d(uiState, z0Var, 0));
                g0Var.n0(objN3);
            } else {
                z0Var = z0Var2;
            }
            final p2 p2Var = (p2) objN3;
            r rVarF = n.f(f2.h.c(rVar, p0.f.a(32)), dl.a.O, b0.b);
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
            a0 a0Var = z1.c;
            h0.f fVarG = h0.i.g(2);
            boolean zG2 = g0Var.g(z0Var) | ((i3 & 112) == 32) | g0Var.g(p2VarA) | g0Var.g(p2VarA2) | g0Var.g(p2VarA3) | g0Var.g(p2VarA4) | g0Var.e(iIntValue) | g0Var.g(p2Var) | ((i3 & 14) == 4);
            Object objN4 = g0Var.N();
            if (zG2 || objN4 == obj) {
                final z0 z0Var3 = z0Var;
                u00.k kVar = new u00.k() {
                    @Override
                    public final Object invoke(Object obj2) {
                        j0.h LazyColumn = (j0.h) obj2;
                        m.e(LazyColumn, "$this$LazyColumn");
                        final z0 z0Var4 = z0Var3;
                        final u00.k kVar2 = onAction;
                        final int i5 = iIntValue;
                        final p2 p2Var2 = p2VarA;
                        final p2 p2Var3 = p2VarA2;
                        final p2 p2Var4 = p2VarA3;
                        final p2 p2Var5 = p2VarA4;
                        v1.c cVar = new v1.c(new p() {
                            @Override
                            public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                                j0.b stickyHeader = (j0.b) obj3;
                                ((Integer) obj4).getClass();
                                g0 g0Var2 = (l1.j) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                m.e(stickyHeader, "$this$stickyHeader");
                                g0 g0Var3 = g0Var2;
                                if (g0Var3.S(iIntValue2 & 1, (iIntValue2 & 129) != 128)) {
                                    r rVarF2 = n.f(z1.d(o.A, 1.0f), dl.a.O, b0.b);
                                    w0 w0VarD2 = h0.o.d(b2.b.A, false);
                                    int iHashCode2 = Long.hashCode(g0Var3.T);
                                    m1 m1VarM2 = g0Var3.m();
                                    r rVarC2 = b2.a.c(rVarF2, g0Var2);
                                    b3.i.c.getClass();
                                    b3.g gVar2 = b3.h.b;
                                    g0Var3.g0();
                                    if (g0Var3.S) {
                                        g0Var3.l(gVar2);
                                    } else {
                                        g0Var3.q0();
                                    }
                                    q.I(w0VarD2, g0Var2, b3.h.f);
                                    q.I(m1VarM2, g0Var2, b3.h.e);
                                    q.I(Integer.valueOf(iHashCode2), g0Var2, b3.h.g);
                                    q.E(g0Var2, b3.h.h);
                                    q.I(rVarC2, g0Var2, b3.h.d);
                                    String strU = z3.U(g0Var2, 2131886367);
                                    z0 z0Var5 = z0Var4;
                                    String str = (String) z0Var5.getValue();
                                    boolean zG3 = g0Var3.g(z0Var5);
                                    Object objN5 = g0Var3.N();
                                    Object obj7 = l1.i.a;
                                    if (zG3 || objN5 == obj7) {
                                        objN5 = new o2(z0Var5, 10);
                                        g0Var3.n0(objN5);
                                    }
                                    u00.k kVar3 = (u00.k) objN5;
                                    u00.k kVar4 = kVar2;
                                    boolean zG4 = g0Var3.g(kVar4);
                                    Object objN6 = g0Var3.N();
                                    if (zG4 || objN6 == obj7) {
                                        objN6 = new gv.a0(26, kVar4);
                                        g0Var3.n0(objN6);
                                    }
                                    u00.a aVar = (u00.a) objN6;
                                    boolean zG5 = g0Var3.g(kVar4);
                                    Object objN7 = g0Var3.N();
                                    if (zG5 || objN7 == obj7) {
                                        objN7 = new gv.a0(27, kVar4);
                                        g0Var3.n0(objN7);
                                    }
                                    a.c(strU, str, kVar3, aVar, (u00.a) objN7, ((t) p2Var2.getValue()).a, ((t) p2Var3.getValue()).a, ((t) p2Var4.getValue()).a, ((t) p2Var5.getValue()).a, i5, g0Var2, 0);
                                    g0Var3.r(true);
                                } else {
                                    g0Var3.V();
                                }
                                return g00.b0.a;
                            }
                        }, 960330952, true);
                        c50.h hVar = LazyColumn.c;
                        u.v vVar = LazyColumn.d;
                        if (vVar == null) {
                            vVar = new u.v();
                            LazyColumn.d = vVar;
                        }
                        vVar.a(hVar.B);
                        LazyColumn.p((Object) null, (String) null, new v1.c(new j0.f(cVar, hVar.B), -1588696110, true));
                        List list = (List) p2Var.getValue();
                        hx.t tVar = new hx.t(18);
                        LazyColumn.r(list.size(), new v2(tVar, list, 20), new as.r0(11, list), new v1.c(new j(list, uiState, kVar2, 0), 802480018, true));
                        j0.h.q(LazyColumn, (Object) null, a.a, 3);
                        return g00.b0.a;
                    }
                };
                g0Var.n0(kVar);
                objN4 = kVar;
            }
            k00.f.d(a0Var, vVarA, null, fVarG, null, null, false, null, (u00.k) objN4, g0Var, 24582, 492);
            g0Var = g0Var;
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new gv.t(uiState, onAction, rVar, i, 1);
        }
    }

    public static final void c(final String title, String searchQuery, u00.k onSearchQueryChange, final u00.a onToggleShuffle, final u00.a onToggleRepeatMode, final long j, final long j2, final long j3, final long j4, final int i, l1.j jVar, final int i2) {
        u00.k kVar;
        g0 g0Var;
        final String str;
        u00.a aVar;
        m.e(title, "title");
        m.e(searchQuery, "searchQuery");
        m.e(onSearchQueryChange, "onSearchQueryChange");
        m.e(onToggleShuffle, "onToggleShuffle");
        m.e(onToggleRepeatMode, "onToggleRepeatMode");
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(1891627847);
        int i3 = i2 | (g0Var2.g(title) ? 4 : 2) | (g0Var2.g(searchQuery) ? 32 : 16) | (g0Var2.i(onSearchQueryChange) ? 256 : 128) | (g0Var2.i(onToggleShuffle) ? 2048 : 1024) | (g0Var2.i(onToggleRepeatMode) ? 16384 : 8192) | (g0Var2.f(j) ? 131072 : 65536) | (g0Var2.f(j2) ? 1048576 : 524288) | (g0Var2.f(j3) ? 8388608 : 4194304) | (g0Var2.f(j4) ? 67108864 : 33554432) | (g0Var2.e(i) ? 536870912 : 268435456);
        if (g0Var2.S(i3 & 1, (i3 & 306783379) != 306783378)) {
            o oVar = o.A;
            float f = 16;
            float f2 = 12;
            r rVarF = h0.c.F(z1.d(oVar, 1.0f), 20, f, f2, 10);
            v vVarA = h0.u.a(h0.i.g(f2), b2.b.M, g0Var2, 6);
            int iHashCode = Long.hashCode(g0Var2.T);
            m1 m1VarM = g0Var2.m();
            r rVarC = b2.a.c(rVarF, g0Var2);
            b3.i.c.getClass();
            u00.a aVar2 = b3.h.b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(aVar2);
            } else {
                g0Var2.q0();
            }
            b3.f fVar = b3.h.f;
            q.I(vVarA, g0Var2, fVar);
            b3.f fVar2 = b3.h.e;
            q.I(m1VarM, g0Var2, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            q.I(numValueOf, g0Var2, fVar3);
            b3.e eVar = b3.h.h;
            q.E(g0Var2, eVar);
            b3.f fVar4 = b3.h.d;
            q.I(rVarC, g0Var2, fVar4);
            r rVarD = z1.d(oVar, 1.0f);
            b2.i iVar = b2.b.A;
            w0 w0VarD = h0.o.d(iVar, false);
            int iHashCode2 = Long.hashCode(g0Var2.T);
            m1 m1VarM2 = g0Var2.m();
            r rVarC2 = b2.a.c(rVarD, g0Var2);
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(aVar2);
            } else {
                g0Var2.q0();
            }
            q.I(w0VarD, g0Var2, fVar);
            q.I(m1VarM2, g0Var2, fVar2);
            a1.b.v(iHashCode2, g0Var2, fVar3, g0Var2, eVar);
            q.I(rVarC2, g0Var2, fVar4);
            long j5 = dl.a.k;
            long jZ = kh.o.z(18);
            long jZ2 = kh.o.z(20);
            u uVar = u.D;
            b2.i iVar2 = b2.b.E;
            s sVar = s.a;
            z6.b(title, z1.d(sVar.a(oVar, iVar2), 1.0f), j5, jZ, uVar, (q3.i) null, 0L, (l) null, new x3.k(3), jZ2, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var2, (i3 & 14) | 1597440, 48, 258984);
            r rVarA = sVar.a(oVar, b2.b.F);
            v1 v1VarA = t1.a(h0.i.a, b2.b.K, g0Var2, 48);
            int iHashCode3 = Long.hashCode(g0Var2.T);
            m1 m1VarM3 = g0Var2.m();
            r rVarC3 = b2.a.c(rVarA, g0Var2);
            g0Var2.g0();
            if (g0Var2.S) {
                aVar = aVar2;
                g0Var2.l(aVar);
            } else {
                aVar = aVar2;
                g0Var2.q0();
            }
            q.I(v1VarA, g0Var2, fVar);
            q.I(m1VarM3, g0Var2, fVar2);
            a1.b.v(iHashCode3, g0Var2, fVar3, g0Var2, eVar);
            q.I(rVarC3, g0Var2, fVar4);
            float f3 = 28;
            r rVarM = z1.m(oVar, f3);
            p0.e eVar2 = p0.f.a;
            r rVarC4 = f2.h.c(rVarM, eVar2);
            o0 o0Var = b0.b;
            r rVarN = w50.c.n(n.f(rVarC4, j, o0Var), true, onToggleShuffle);
            w0 w0VarD2 = h0.o.d(iVar2, false);
            int iHashCode4 = Long.hashCode(g0Var2.T);
            m1 m1VarM4 = g0Var2.m();
            r rVarC5 = b2.a.c(rVarN, g0Var2);
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(aVar);
            } else {
                g0Var2.q0();
            }
            q.I(w0VarD2, g0Var2, fVar);
            q.I(m1VarM4, g0Var2, fVar2);
            a1.b.v(iHashCode4, g0Var2, fVar3, g0Var2, eVar);
            q.I(rVarC5, g0Var2, fVar4);
            o3.a(y3.R(2131231384, g0Var2, 0), (String) null, (r) null, j2, g0Var2, ((i3 >> 9) & 7168) | 56, 4);
            g0Var2.r(true);
            h0.c.h(z1.m(oVar, 8), g0Var2);
            r rVarN2 = w50.c.n(n.f(f2.h.c(z1.m(oVar, f3), eVar2), j3, o0Var), true, onToggleRepeatMode);
            w0 w0VarD3 = h0.o.d(iVar2, false);
            int iHashCode5 = Long.hashCode(g0Var2.T);
            m1 m1VarM5 = g0Var2.m();
            r rVarC6 = b2.a.c(rVarN2, g0Var2);
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(aVar);
            } else {
                g0Var2.q0();
            }
            q.I(w0VarD3, g0Var2, fVar);
            q.I(m1VarM5, g0Var2, fVar2);
            a1.b.v(iHashCode5, g0Var2, fVar3, g0Var2, eVar);
            q.I(rVarC6, g0Var2, fVar4);
            o3.a(y3.R(i, g0Var2, (i3 >> 27) & 14), (String) null, (r) null, j4, g0Var2, 56 | ((i3 >> 15) & 7168), 4);
            x5.z(g0Var2, true, true, true);
            r rVarE = z1.e(z1.d(oVar, 1.0f), 40);
            w0 w0VarD4 = h0.o.d(iVar, false);
            int iHashCode6 = Long.hashCode(g0Var2.T);
            m1 m1VarM6 = g0Var2.m();
            r rVarC7 = b2.a.c(rVarE, g0Var2);
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(aVar);
            } else {
                g0Var2.q0();
            }
            q.I(w0VarD4, g0Var2, fVar);
            q.I(m1VarM6, g0Var2, fVar2);
            a1.b.v(iHashCode6, g0Var2, fVar3, g0Var2, eVar);
            q.I(rVarC7, g0Var2, fVar4);
            str = searchQuery;
            z0.g gVarH = z0.h.h(str, g0Var2, (i3 >> 3) & 14);
            boolean zG = g0Var2.g(gVarH) | ((i3 & 896) == 256);
            Object objN = g0Var2.N();
            if (zG || objN == l1.i.a) {
                kVar = onSearchQueryChange;
                objN = new c00.s(gVarH, kVar, null, 2);
                g0Var2.n0(objN);
            } else {
                kVar = onSearchQueryChange;
            }
            q.i(gVarH, g0Var2, (u00.n) objN);
            r rVarD2 = z1.d(oVar, 1.0f);
            z0.e eVar3 = z0.e.B;
            p1 p1VarE = h0.c.e(f, 0.0f, 2);
            p0.e eVarA = p0.f.a(32);
            long j6 = dl.a.J;
            long jB = t.b(0.22f, j6);
            long jB2 = t.b(0.22f, j6);
            long jB3 = t.b(0.22f, j6);
            long j7 = t.f;
            n5.c(gVarH, rVarD2, false, (r0) null, (w6) null, b, (u00.n) null, (u00.n) null, false, (i1) null, (qp.b) null, eVar3, (z.p1) null, eVarA, v6.a(j5, j5, 0L, jB, jB2, jB3, j7, j7, j7, t.b(0.65f, j5), t.b(0.65f, j5), 0L, g0Var2, 1744816012), p1VarE, g0Var2, 12582960, 100663296, 18612092);
            g0Var = g0Var2;
            g0Var.r(true);
            g0Var.r(true);
        } else {
            kVar = onSearchQueryChange;
            g0Var = g0Var2;
            str = searchQuery;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            final u00.k kVar2 = kVar;
            r1VarT.d = new u00.n(title, str, kVar2, onToggleShuffle, onToggleRepeatMode, j, j2, j3, j4, i, i2) {
                public final String A;
                public final String B;
                public final u00.k C;
                public final u00.a D;
                public final u00.a E;
                public final long F;
                public final long G;
                public final long H;
                public final long I;
                public final int J;

                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = q.K(1);
                    a.c(this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, (l1.j) obj, iK);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void d(bv.o1 uiState, u00.k onAction, l1.j jVar, int i) {
        m.e(uiState, "uiState");
        m.e(onAction, "onAction");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1217302774);
        int i2 = (g0Var.g(uiState) ? 4 : 2) | i | (g0Var.i(onAction) ? 32 : 16);
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object objN = g0Var.N();
            if (z || objN == l1.i.a) {
                objN = new gv.a0(28, onAction);
                g0Var.n0(objN);
            }
            s0.G((u00.a) objN, new c4.v(3, false), v1.d.d(1084363233, new j0(uiState, onAction, 3, (byte) 0), g0Var), g0Var, 432, 0);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new j0(uiState, onAction, i);
        }
    }
}
