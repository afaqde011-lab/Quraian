package gv;

import android.content.res.Configuration;
import com.google.android.gms.internal.measurement.g4;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import g1.p4;
import h0.m2;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import l1.p2;
import w.b2;
import w.d2;
import w.g2;

public abstract class z1 {
    public static final w.x0 a;
    public static final w.y0 b;

    static {
        x.r rVar = x.x.a;
        x.q1 q1VarW = x.c.w(420, 0, rVar, 2);
        e6.c cVar = new e6.c(4);
        x.r1 r1Var = w.s0.a;
        a = new w.x0(new g2((w.z0) null, new d2(new w.r0(2, cVar), q1VarW), (w.i0) null, (w.d1) null, (LinkedHashMap) null, 125)).a(w.s0.c(x.c.w(420, 0, rVar, 2), 2));
        b = new w.y0(new g2((w.z0) null, new d2(new w.r0(4, new e6.c(4)), x.c.w(420, 0, rVar, 2)), (w.i0) null, (w.d1) null, (LinkedHashMap) null, 125)).a(w.s0.d(x.c.w(420, 0, rVar, 2), 2));
    }

    public static final void a(bv.o1 o1Var, final u00.k kVar, final kk.c cVar, b2.r rVar, l1.j jVar, int i) {
        bv.o1 o1Var2;
        int i2;
        Object dVar;
        int i3;
        Object obj;
        boolean z;
        Object obj2;
        b2.r rVarY;
        bv.o1 o1Var3 = o1Var;
        b2.i iVar = b2.b.F;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-462762);
        int i4 = i | (g0Var.g(o1Var3) ? 4 : 2) | (g0Var.i(kVar) ? 32 : 16) | (g0Var.g(cVar) ? 256 : 128);
        if (g0Var.S(i4 & 1, (i4 & 1171) != 1170)) {
            PlayerItem playerItem = o1Var3.f;
            boolean z2 = o1Var3.C;
            int surahNumber = playerItem != null ? playerItem.getSurahNumber() : 1;
            Integer num = o1Var3.F;
            if (num != null) {
                int iIntValue = num.intValue();
                if (iIntValue < 1) {
                    iIntValue = 1;
                }
                i2 = iIntValue;
            } else {
                i2 = 1;
            }
            sg.f fVar = cm.a.A;
            Configuration configuration = (Configuration) g0Var.k(c3.o0.a);
            fVar.getClass();
            boolean z3 = sg.f.J(configuration) == cm.a.C;
            Object objN = g0Var.N();
            Object obj3 = l1.i.a;
            if (objN == obj3) {
                objN = oi.k.s(0, g0Var);
            }
            l1.f1 f1Var = (l1.y0) objN;
            Object objN2 = g0Var.N();
            if (objN2 == obj3) {
                objN2 = oi.k.s(0, g0Var);
            }
            l1.f1 f1Var2 = (l1.y0) objN2;
            l1.f1 f1Var3 = f1Var;
            boolean z4 = f1Var3.h() > 0 && f1Var2.h() > 0;
            int iH = (f1Var3.h() - f1Var2.h()) / 2;
            int i5 = iH < 0 ? 0 : iH;
            Object objN3 = g0Var.N();
            if (objN3 == obj3) {
                objN3 = x.c.a(0.0f, 0.01f);
                g0Var.n0(objN3);
            }
            x.b bVar = (x.b) objN3;
            Object objN4 = g0Var.N();
            if (objN4 == obj3) {
                objN4 = l1.q.z(Boolean.FALSE);
                g0Var.n0(objN4);
            }
            l1.z0 z0Var = (l1.z0) objN4;
            final p2 p2VarA = b2.a(o1Var3.m == null ? i2.t.b(0.5f, dl.a.P) : i2.t.b(0.1f, dl.a.i), (x.y) null, (String) null, g0Var, 0, 14);
            Object[] objArr = {Boolean.valueOf(z2), Boolean.valueOf(z3), Integer.valueOf(i5), Boolean.valueOf(z4)};
            boolean z5 = z4;
            boolean zH = ((i4 & 14) == 4) | g0Var.h(z5) | g0Var.h(z3) | g0Var.e(i5) | g0Var.i(bVar);
            Object objN5 = g0Var.N();
            if (zH || objN5 == obj3) {
                i3 = i4;
                obj = obj3;
                dVar = new fl.d(z5, o1Var3, z3, i5, bVar, z0Var, null);
                z = z5;
                o1Var3 = o1Var3;
                g0Var.n0(dVar);
            } else {
                obj = obj3;
                z = z5;
                i3 = i4;
                dVar = objN5;
            }
            l1.q.j(objArr, (u00.n) dVar, g0Var);
            b2.r rVarG = h0.c.G(h0.z1.d(rVar, 1.0f), 0.0f, 8, 0.0f, 0.0f, 13);
            Object objN6 = g0Var.N();
            if (objN6 == obj) {
                objN6 = new e(f1Var, 4);
                g0Var.n0(objN6);
            }
            b2.r rVarO = z2.d0.o(rVarG, (u00.k) objN6);
            z2.w0 w0VarD = h0.o.d(b2.b.A, false);
            Object obj4 = obj;
            int iHashCode = Long.hashCode(g0Var.T);
            l1.m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarO, g0Var);
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
            h0.s sVar = h0.s.a;
            b2.o oVar = b2.o.A;
            if (z || z2 || z3) {
                g0Var.c0(-1579586310);
                b2.r rVarA = sVar.a(oVar, b2.b.D);
                boolean zI = g0Var.i(bVar);
                Object objN7 = g0Var.N();
                obj2 = obj4;
                if (zI || objN7 == obj2) {
                    objN7 = new p4(bVar, 1);
                    g0Var.n0(objN7);
                }
                rVarY = h0.c.y(rVarA, (u00.k) objN7);
                g0Var.r(false);
            } else {
                g0Var.c0(-1579680798);
                g0Var.r(false);
                rVarY = sVar.a(oVar, b2.b.E);
                obj2 = obj4;
            }
            Object objN8 = g0Var.N();
            if (objN8 == obj2) {
                objN8 = new e(f1Var2, 5);
                g0Var.n0(objN8);
            }
            b2.r rVarO2 = z2.d0.o(rVarY, (u00.k) objN8);
            zz.a aVar = o1Var3.m;
            long j = ((i2.t) p2VarA.getValue()).a;
            boolean z6 = (i3 & 112) == 32;
            Object objN9 = g0Var.N();
            if (z6 || objN9 == obj2) {
                objN9 = new a0(9, kVar);
                g0Var.n0(objN9);
            }
            int i6 = i3;
            p.c(aVar, (u00.a) objN9, cVar, j, rVarO2, g0Var, i3 & 896, 0);
            g0Var = g0Var;
            if (z3) {
                g0Var.c0(-1578812550);
                o1Var2 = o1Var3;
                b(surahNumber, i2, o1Var3.C, cVar, ((i2.t) p2VarA.getValue()).a, kVar, sVar.a(oVar, iVar), g0Var, ((i6 << 3) & 7168) | ((i6 << 12) & 458752));
                g0Var.r(false);
            } else {
                o1Var2 = o1Var3;
                final int i7 = surahNumber;
                final int i8 = i2;
                g0Var.c0(-1578410046);
                w.c0.c(o1Var2.C, sVar.a(oVar, iVar), a, b, (String) null, v1.d.d(-1795114220, new u00.o() {
                    @Override
                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                        w.d0 AnimatedVisibility = (w.d0) obj5;
                        l1.g0 g0Var2 = (l1.j) obj6;
                        ((Integer) obj7).getClass();
                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                        long j2 = ((i2.t) p2VarA.getValue()).a;
                        l1.g0 g0Var3 = g0Var2;
                        u00.k kVar2 = kVar;
                        boolean zG = g0Var3.g(kVar2);
                        Object objN10 = g0Var3.N();
                        Object obj8 = l1.i.a;
                        if (zG || objN10 == obj8) {
                            objN10 = new a0(6, kVar2);
                            g0Var3.n0(objN10);
                        }
                        u00.a aVar2 = (u00.a) objN10;
                        boolean zG2 = g0Var3.g(kVar2);
                        Object objN11 = g0Var3.N();
                        if (zG2 || objN11 == obj8) {
                            objN11 = new a0(7, kVar2);
                            g0Var3.n0(objN11);
                        }
                        g4.h(i7, i8, cVar, aVar2, (u00.a) objN11, j2, (b2.r) null, (h0.e) null, g0Var2, 0, 192);
                        return g00.b0.a;
                    }
                }, g0Var), g0Var, 200064, 16);
                g0Var.r(false);
            }
            g0Var.r(true);
        } else {
            o1Var2 = o1Var3;
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new dz.k((Object) o1Var2, kVar, (Object) cVar, (Object) rVar, i, 7);
        }
    }

    public static final void b(final int i, final int i2, final boolean z, final kk.c cVar, final long j, final u00.k kVar, final b2.r rVar, l1.j jVar, final int i3) {
        int i4;
        int i5;
        l1.g0 g0Var;
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(-2001031327);
        if ((i3 & 6) == 0) {
            i4 = (g0Var2.e(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 = i2;
            i4 |= g0Var2.e(i5) ? 32 : 16;
        } else {
            i5 = i2;
        }
        if ((i3 & 384) == 0) {
            i4 |= g0Var2.h(z) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= g0Var2.g(cVar) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= g0Var2.f(j) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= g0Var2.i(kVar) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= g0Var2.g(rVar) ? 1048576 : 524288;
        }
        int i6 = i4;
        if (g0Var2.S(i6 & 1, (i6 & 599187) != 599186)) {
            h0.v1 v1VarA = h0.t1.a(h0.i.a, b2.b.K, g0Var2, 48);
            int iHashCode = Long.hashCode(g0Var2.T);
            l1.m1 m1VarM = g0Var2.m();
            b2.r rVarC = b2.a.c(rVar, g0Var2);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            l1.q.I(v1VarA, g0Var2, b3.h.f);
            l1.q.I(m1VarM, g0Var2, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var2, b3.h.g);
            l1.q.E(g0Var2, b3.h.h);
            l1.q.I(rVarC, g0Var2, b3.h.d);
            w.c0.d(z, (b2.r) null, a, b, (String) null, v1.d.d(619391901, new g1(i, i5, kVar, j, cVar), g0Var2), g0Var2, 1600518 | ((i6 >> 3) & 112), 18);
            g0Var = g0Var2;
            boolean z2 = (i6 & 458752) == 131072;
            Object objN = g0Var.N();
            if (z2 || objN == l1.i.a) {
                objN = new a0(5, kVar);
                g0Var.n0(objN);
            }
            p.u(cVar, j, (u00.a) objN, null, g0Var, (i6 >> 9) & 126);
            g0Var.r(true);
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    z1.b(i, i2, z, cVar, j, kVar, rVar, (l1.j) obj, l1.q.K(i3 | 1));
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void c(bv.o1 uiState, u00.k onAction, kk.c cVar, d00.x0 x0Var, long j, l1.j jVar, int i) {
        int i2;
        l1.g0 g0Var;
        kotlin.jvm.internal.m.e(uiState, "uiState");
        boolean z = uiState.Q;
        boolean z2 = uiState.x;
        kotlin.jvm.internal.m.e(onAction, "onAction");
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(-838965862);
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
            p2 p2VarA = b2.a(uiState.m == null ? i2.t.b(0.5f, dl.a.P) : i2.t.b(0.1f, dl.a.i), (x.y) null, (String) null, g0Var2, 0, 14);
            WeakHashMap weakHashMap = m2.w;
            wk.d dVarH = w00.a.h(h0.b.e(g0Var2).p, (z && z2) ? false : true, p.J(), g0Var2);
            h0.a0 a0Var = h0.z1.c;
            b2.r rVarB = h0.c.B(h0.c.G(a0Var, 0.0f, 0.0f, 0.0f, 32, 7), dVarH);
            h0.v vVarA = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
            int iHashCode = Long.hashCode(g0Var2.T);
            l1.m1 m1VarM = g0Var2.m();
            b2.r rVarC = b2.a.c(rVarB, g0Var2);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            b3.f fVar = b3.h.f;
            l1.q.I(vVarA, g0Var2, fVar);
            b3.f fVar2 = b3.h.e;
            l1.q.I(m1VarM, g0Var2, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf, g0Var2, fVar3);
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var2, eVar);
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC, g0Var2, fVar4);
            p.n(!z2, null, v1.d.d(-97232942, new b1.n(uiState, onAction, cVar, 9), g0Var2), g0Var2, 384, 2);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            b2.r rVarD = h0.z1.d(new h0.c1(1.0f, true), 1.0f);
            z2.w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode2 = Long.hashCode(g0Var2.T);
            l1.m1 m1VarM2 = g0Var2.m();
            b2.r rVarC2 = b2.a.c(rVarD, g0Var2);
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            l1.q.I(w0VarD, g0Var2, fVar);
            l1.q.I(m1VarM2, g0Var2, fVar2);
            a1.b.v(iHashCode2, g0Var2, fVar3, g0Var2, eVar);
            l1.q.I(rVarC2, g0Var2, fVar4);
            p.t(uiState.v, a0Var, null, null, v1.d.d(1492409914, new i1(uiState, onAction, cVar, j, 2), g0Var2), g0Var2, 24624, 12);
            p.t(uiState.C, a0Var, null, null, v1.d.d(1165154723, new x1(uiState, onAction, cVar, p2VarA, 0), g0Var2), g0Var2, 24624, 12);
            g0Var = g0Var2;
            g0Var.r(true);
            p.n((z && z2) ? false : true, null, v1.d.d(75638395, new cz.g(uiState, onAction, cVar, x0Var, p2VarA), g0Var), g0Var, 384, 2);
            g0Var.r(true);
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new k1(uiState, onAction, cVar, x0Var, j, i, 1);
        }
    }
}
