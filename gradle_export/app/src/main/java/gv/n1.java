package gv;

import com.google.android.gms.internal.measurement.x5;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import h0.m2;
import java.util.WeakHashMap;
import l1.p2;
import w.b2;

public abstract class n1 {
    public static final float a;
    public static final float b;
    public static final float c = 32;
    public static final float d;

    static {
        float f = 16;
        a = f;
        b = 36 + f;
        float f2 = 38;
        float f3 = 8;
        d = f2 + f3 + f2 + f3;
    }

    public static final void a(bv.o1 o1Var, u00.k kVar, kk.c cVar, long j, b2.r rVar, l1.j jVar, int i) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-254972419);
        int i2 = i | (g0Var.g(o1Var) ? 4 : 2) | (g0Var.i(kVar) ? 32 : 16) | (g0Var.g(cVar) ? 256 : 128) | (g0Var.f(j) ? 2048 : 1024) | (g0Var.g(rVar) ? 16384 : 8192);
        if (g0Var.S(i2 & 1, (i2 & 9363) != 9362)) {
            h0.c.a(rVar, (b2.d) null, false, v1.d.d(1943625447, new i1(o1Var, kVar, cVar, j, 0), g0Var), g0Var, ((i2 >> 12) & 14) | 3072, 6);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new ct.n(o1Var, kVar, cVar, j, rVar, i);
        }
    }

    public static final void b(bv.o1 o1Var, u00.k kVar, kk.c cVar, final d00.x0 x0Var, final long j, final long j2, l1.j jVar, final int i) {
        int i2;
        final bv.o1 o1Var2 = o1Var;
        final u00.k kVar2 = kVar;
        final kk.c cVar2 = cVar;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1410084543);
        int i3 = i | (g0Var.g(o1Var2) ? 4 : 2) | (g0Var.i(kVar2) ? 32 : 16) | (g0Var.g(cVar2) ? 256 : 128) | (g0Var.g(x0Var) ? 2048 : 1024) | (g0Var.f(j) ? 16384 : 8192) | (g0Var.f(j2) ? 131072 : 65536);
        if (g0Var.S(i3 & 1, (74899 & i3) != 74898)) {
            PlayerItem playerItem = o1Var2.f;
            int surahNumber = playerItem != null ? playerItem.getSurahNumber() : 1;
            Integer num = o1Var2.F;
            if (num != null) {
                int iIntValue = num.intValue();
                if (iIntValue < 1) {
                    iIntValue = 1;
                }
                i2 = iIntValue;
            } else {
                i2 = 1;
            }
            b2.o oVar = b2.o.A;
            b2.r rVarC = h0.z1.c(oVar, 1.0f);
            WeakHashMap weakHashMap = m2.w;
            b2.r rVarE = h0.c.E(h0.c.L(rVarC, h0.b.e(g0Var).p), 12, 0.0f, 2);
            z2.w0 w0VarD = h0.o.d(b2.b.C, false);
            int iHashCode = Long.hashCode(g0Var.T);
            l1.m1 m1VarM = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarE, g0Var);
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
            h0.a0 a0Var = h0.z1.c;
            h0.v1 v1VarA = h0.t1.a(h0.i.a, b2.b.J, g0Var, 0);
            int iHashCode2 = Long.hashCode(g0Var.T);
            l1.m1 m1VarM2 = g0Var.m();
            b2.r rVarC3 = b2.a.c(a0Var, g0Var);
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
            p.t(o1Var2.v, h0.z1.c(h0.z1.d(oVar, 1.0f), 1.0f), null, null, v1.d.d(-956003405, new i1(o1Var2, kVar, cVar, j, 1), g0Var), g0Var, 24624, 12);
            boolean z = o1Var2.C && !o1Var2.x;
            cVar2 = cVar;
            kVar2 = kVar;
            o1Var2 = o1Var;
            p.t(z, a0Var, w.s0.c(p.J(), 2), w.s0.d(p.J(), 2), v1.d.d(1928955484, new g1(surahNumber, i2, cVar2, kVar, j2), g0Var), g0Var, 24624, 0);
            g0Var.r(true);
            p.t(o1Var2.w, a0Var, null, null, v1.d.d(1286190487, new az.j(x0Var, cVar2, kVar2, 7), g0Var), g0Var, 24624, 12);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n(kVar2, cVar2, x0Var, j, j2, i) {
                public final u00.k B;
                public final kk.c C;
                public final d00.x0 D;
                public final long E;
                public final long F;

                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = l1.q.K(1);
                    n1.b(this.A, this.B, this.C, this.D, this.E, this.F, (l1.j) obj, iK);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void c(bv.o1 o1Var, u00.k kVar, kk.c cVar, d00.x0 x0Var, l1.j jVar, int i) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1737170856);
        int i2 = i | (g0Var.g(o1Var) ? 4 : 2) | (g0Var.i(kVar) ? 32 : 16) | (g0Var.g(cVar) ? 256 : 128) | (g0Var.g(x0Var) ? 2048 : 1024);
        if (g0Var.S(i2 & 1, (i2 & 1171) != 1170)) {
            p2 p2VarA = b2.a(o1Var.m == null ? i2.t.b(0.5f, dl.a.P) : i2.t.b(0.1f, dl.a.i), (x.y) null, (String) null, g0Var, 0, 14);
            float f = av.j.b;
            b2.o oVar = b2.o.A;
            b2.r rVarC = h0.z1.c(h0.z1.q(oVar, f), 1.0f);
            h0.v vVarA = h0.u.a(h0.i.g(12), b2.b.M, g0Var, 6);
            int iHashCode = Long.hashCode(g0Var.T);
            l1.m1 m1VarM = g0Var.m();
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
            b2.r rVarD = h0.z1.d(oVar, 1.0f);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            a(o1Var, kVar, cVar, ((i2.t) p2VarA.getValue()).a, rVarD.V(new h0.c1(1.0f, true)), g0Var, i2 & 1022);
            p.s(o1Var, kVar, cVar, x0Var, null, null, null, false, false, false, g0Var, 12582912 | (i2 & 14) | (i2 & 112) | (i2 & 896) | (i2 & 7168), 880);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new dz.k((Object) o1Var, kVar, (Object) cVar, (Object) x0Var, i, 6);
        }
    }

    public static final void d(final bv.o1 uiState, final u00.k onAction, final kk.c cVar, final d00.x0 x0Var, final long j, l1.j jVar, int i) {
        int i2;
        l1.g0 g0Var;
        kotlin.jvm.internal.m.e(uiState, "uiState");
        kotlin.jvm.internal.m.e(onAction, "onAction");
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(956893814);
        if ((i & 6) == 0) {
            i2 = i | (g0Var2.g(uiState) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var2.i(onAction) ? 32 : 16;
        }
        int i3 = i2 | (g0Var2.g(cVar) ? 256 : 128) | (g0Var2.g(x0Var) ? 2048 : 1024) | (g0Var2.f(j) ? 16384 : 8192);
        if (g0Var2.S(i3 & 1, (i3 & 9363) != 9362)) {
            WeakHashMap weakHashMap = m2.w;
            h0.t0 t0VarL = h0.c.l(h0.b.e(g0Var2).b, g0Var2);
            boolean z = uiState.v || uiState.C || uiState.w;
            final p2 p2VarA = b2.a(uiState.m == null ? i2.t.b(0.5f, dl.a.P) : i2.t.b(0.1f, dl.a.i), (x.y) null, (String) null, g0Var2, 0, 14);
            final boolean z2 = z;
            h0.c.a(h0.c.B(h0.z1.c, t0VarL), (b2.d) null, false, v1.d.d(1567681632, new u00.o() {
                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    h0.t BoxWithConstraints = (h0.t) obj;
                    l1.g0 g0Var3 = (l1.j) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    kotlin.jvm.internal.m.e(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= g0Var3.g(BoxWithConstraints) ? 4 : 2;
                    }
                    boolean z3 = (iIntValue & 19) != 18;
                    l1.g0 g0Var4 = g0Var3;
                    a30.x xVar = g0Var4.a;
                    if (g0Var4.S(iIntValue & 1, z3)) {
                        float fC = BoxWithConstraints.c();
                        float f = n1.a;
                        float f2 = (fC - f) / 2;
                        float fC2 = (BoxWithConstraints.c() - f) - f2;
                        float fC3 = BoxWithConstraints.c();
                        final bv.o1 o1Var = uiState;
                        boolean z4 = o1Var.C;
                        h0.a0 a0Var = h0.z1.c;
                        final u00.k kVar = onAction;
                        final kk.c cVar2 = cVar;
                        final p2 p2Var = p2VarA;
                        p.t(z4, a0Var, null, null, v1.d.d(-429645572, new l1(o1Var, fC3, fC2, kVar, cVar2, p2Var), g0Var3), g0Var3, 24624, 12);
                        h0.v1 v1VarA = h0.t1.a(h0.i.g(f), b2.b.J, g0Var3, 6);
                        int iHashCode = Long.hashCode(g0Var4.T);
                        l1.m1 m1VarM = g0Var4.m();
                        b2.r rVarC = b2.a.c(a0Var, g0Var3);
                        b3.i.c.getClass();
                        b3.g gVar = b3.h.b;
                        g0Var4.g0();
                        if (g0Var4.S) {
                            g0Var4.l(gVar);
                        } else {
                            g0Var4.q0();
                        }
                        b3.f fVar = b3.h.f;
                        l1.q.I(v1VarA, g0Var3, fVar);
                        b3.f fVar2 = b3.h.e;
                        l1.q.I(m1VarM, g0Var3, fVar2);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        b3.f fVar3 = b3.h.g;
                        l1.q.I(numValueOf, g0Var3, fVar3);
                        b3.e eVar = b3.h.h;
                        l1.q.E(g0Var3, eVar);
                        b3.f fVar4 = b3.h.d;
                        l1.q.I(rVarC, g0Var3, fVar4);
                        if (1.0f <= 0.0d) {
                            i0.a.a("invalid weight; must be greater than zero");
                        }
                        b2.r rVarC2 = h0.z1.c(new h0.c1(1.0f, true), 1.0f);
                        z2.w0 w0VarD = h0.o.d(b2.b.A, false);
                        int iHashCode2 = Long.hashCode(g0Var4.T);
                        l1.m1 m1VarM2 = g0Var4.m();
                        b2.r rVarC3 = b2.a.c(rVarC2, g0Var3);
                        g0Var4.g0();
                        if (g0Var4.S) {
                            g0Var4.l(gVar);
                        } else {
                            g0Var4.q0();
                        }
                        l1.q.I(w0VarD, g0Var3, fVar);
                        l1.q.I(m1VarM2, g0Var3, fVar2);
                        x5.u(iHashCode2, g0Var3, fVar3, g0Var3, eVar);
                        l1.q.I(rVarC3, g0Var3, fVar4);
                        final d00.x0 x0Var2 = x0Var;
                        final long j2 = j;
                        w.c0.d(z2, a0Var, (w.x0) null, (w.y0) null, (String) null, v1.d.d(-1227901090, new u00.o() {
                            @Override
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                w.d0 AnimatedVisibility = (w.d0) obj4;
                                ((Integer) obj6).getClass();
                                kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                long j3 = ((i2.t) p2Var.getValue()).a;
                                n1.b(o1Var, kVar, cVar2, x0Var2, j2, j3, (l1.j) obj5, 0);
                                return g00.b0.a;
                            }
                        }, g0Var3), g0Var3, 1573254, 28);
                        g0Var4.r(true);
                        w50.c.a(o1Var.x, f2, b2.b.O, null, p.J(), null, v1.d.d(30030767, new bz.o((Object) o1Var, kVar, cVar2, (Object) x0Var2, 2), g0Var3), g0Var3, 1573248);
                        g0Var4.r(true);
                    } else {
                        g0Var4.V();
                    }
                    return g00.b0.a;
                }
            }, g0Var2), g0Var2, 3072, 6);
            g0Var = g0Var2;
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new k1(uiState, onAction, cVar, x0Var, j, i, 0);
        }
    }
}
