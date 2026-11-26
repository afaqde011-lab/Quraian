package wr;

import android.content.Context;
import as.p0;
import c3.g3;
import c3.o0;
import c3.o1;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.z3;
import g1.m6;
import g1.t4;
import g1.u4;
import g1.z6;
import gv.t1;
import h0.m2;
import h0.p1;
import h0.z1;
import i2.t0;
import java.util.WeakHashMap;
import l1.m1;
import l1.r1;
import l1.z0;
import m3.r0;
import qd.s0;
import z2.d1;
import z2.w0;

public abstract class g {
    public static final long a = i2.b0.d(4279834905L);
    public static final int b = 0;

    public static final void a(u30.b cards, u00.a onTryClicked, u00.a onDismiss, l1.j jVar, int i) {
        kotlin.jvm.internal.m.e(cards, "cards");
        kotlin.jvm.internal.m.e(onTryClicked, "onTryClicked");
        kotlin.jvm.internal.m.e(onDismiss, "onDismiss");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1447843414);
        int i2 = (g0Var.g(cards) ? 4 : 2) | i | (g0Var.i(onTryClicked) ? 32 : 16) | (g0Var.i(onDismiss) ? 256 : 128);
        if (!g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            g0Var.V();
        } else if (g0Var.k(dl.e.a) == gm.a.B) {
            g0Var.c0(-1653198746);
            j(cards, onTryClicked, onDismiss, g0Var, i2 & 1022);
            g0Var.r(false);
        } else {
            g0Var.c0(-1653091672);
            b(cards, onTryClicked, onDismiss, g0Var, i2 & 1022);
            g0Var.r(false);
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new b(cards, onTryClicked, onDismiss, i, 1);
        }
    }

    public static final void b(u30.b bVar, u00.a aVar, u00.a aVar2, l1.j jVar, int i) {
        l1.j jVar2;
        l1.j jVar3 = (l1.g0) jVar;
        jVar3.e0(1388758347);
        int i2 = i | (jVar3.g(bVar) ? 4 : 2) | (jVar3.i(aVar) ? 32 : 16) | (jVar3.i(aVar2) ? 256 : 128);
        if (jVar3.S(i2 & 1, (i2 & 147) != 146)) {
            m6 m6VarF = t4.f(true, (u00.k) null, jVar3, 6, 2);
            Object objN = jVar3.N();
            if (objN == l1.i.a) {
                objN = l1.q.o(jVar3);
                jVar3.n0(objN);
            }
            y3.c cVar = (y3.c) jVar3.k(o1.h);
            jVar3.c0(-1138042382);
            float fH0 = cVar.h0((int) (((g3) jVar3.k(o1.u)).a() & 4294967295L));
            WeakHashMap weakHashMap = m2.w;
            float fH1 = (fH0 - cVar.h0(h0.b.e(jVar3).f.e().b)) - 10;
            jVar3.r(false);
            float f = 28;
            jVar2 = jVar3;
            t4.a(aVar2, (b2.r) null, m6VarF, 0.0f, false, p0.f.c(f, f, 0.0f, 0.0f, 12), dl.a.L, 0L, 0.0f, 0L, (u00.n) null, new sw.a(17), (u4) null, v1.d.d(-864366551, new t1(bVar, aVar, (a40.z) objN, m6VarF, aVar2, fH1), jVar3), jVar2, (i2 >> 6) & 14, 3078, 5018);
        } else {
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new b(bVar, aVar, aVar2, i, 0);
        }
    }

    public static final void c(final u30.b bVar, final boolean z, l1.j jVar, int i) {
        int i2;
        l1.j jVar2;
        r1 r1VarT;
        ct.g gVar;
        l1.j jVar3 = (l1.g0) jVar;
        jVar3.e0(-1996393710);
        if ((i & 6) == 0) {
            i2 = (jVar3.g(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= jVar3.h(z) ? 32 : 16;
        }
        if (jVar3.S(i2 & 1, (i2 & 19) != 18)) {
            h00.b bVar2 = (h00.b) bVar;
            if (bVar2.isEmpty()) {
                r1VarT = jVar3.t();
                if (r1VarT == null) {
                    return;
                } else {
                    gVar = new ct.g(bVar, z, i, 1);
                }
            } else {
                final to.a aVarC = to.b.c(jVar3);
                final float f = z ? 197 / aVarC.c : 0.6856555f;
                final j0.v vVarA = j0.x.a(0, jVar3, 3);
                final y3.c cVar = (y3.c) jVar3.k(o1.h);
                final boolean z2 = bVar2.a() > 1;
                final int iA = z2 ? bVar2.a() * 1000 : bVar2.a();
                jVar2 = jVar3;
                h0.c.a(z1.d(b2.o.A, 1.0f), (b2.d) null, false, v1.d.d(1809441640, new u00.o() {
                    @Override
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        j0.v vVar;
                        int i3;
                        h0.t BoxWithConstraints = (h0.t) obj;
                        l1.g0 g0Var = (l1.j) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        kotlin.jvm.internal.m.e(BoxWithConstraints, "$this$BoxWithConstraints");
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= g0Var.g(BoxWithConstraints) ? 4 : 2;
                        }
                        l1.g0 g0Var2 = g0Var;
                        if (g0Var2.S(iIntValue & 1, (iIntValue & 19) != 18)) {
                            final to.a aVar = aVarC;
                            float f2 = aVar.a;
                            final float f3 = f;
                            float f4 = f2 * f3;
                            float f5 = 2;
                            float f6 = p30.f.i0(new y3.f(16), new y3.f((BoxWithConstraints.c() - f4) / f5)).A;
                            boolean z3 = z2;
                            final u30.b bVar3 = bVar;
                            j0.v vVar2 = vVarA;
                            Object obj4 = l1.i.a;
                            if (z3) {
                                g0Var2.c0(-1058450993);
                                h00.b bVar4 = (h00.b) bVar3;
                                int iA2 = (bVar4.a() * 500) + (z ? ((h00.b) bVar3).a() / 2 : 1);
                                float fC = (18 + f4) - ((BoxWithConstraints.c() - f4) / f5);
                                y3.c cVar2 = cVar;
                                float fA0 = cVar2.A0(fC);
                                float fA1 = cVar2.A0(24);
                                Integer numValueOf = Integer.valueOf(bVar4.a());
                                Float fValueOf = Float.valueOf(fA0);
                                Float fValueOf2 = Float.valueOf(fA1);
                                boolean zG = g0Var2.g(vVar2) | g0Var2.e(iA2) | g0Var2.d(fA0) | g0Var2.d(fA1);
                                Object objN = g0Var2.N();
                                if (zG || objN == obj4) {
                                    vVar = vVar2;
                                    f fVar = new f(vVar, iA2, fA0, fA1, null);
                                    g0Var2.n0(fVar);
                                    objN = fVar;
                                } else {
                                    vVar = vVar2;
                                }
                                l1.q.g(numValueOf, fValueOf, fValueOf2, (u00.n) objN, g0Var);
                                i3 = 0;
                                g0Var2.r(false);
                            } else {
                                vVar = vVar2;
                                i3 = 0;
                                g0Var2.c0(-1057579366);
                                g0Var2.r(false);
                            }
                            b2.r rVarD = z1.d(b2.o.A, 1.0f);
                            if (z3) {
                                f6 = i3;
                            }
                            p1 p1VarE = h0.c.e(f6, 0.0f, 2);
                            h0.f fVarG = h0.i.g(18);
                            final int i4 = iA;
                            boolean zE = g0Var2.e(i4) | g0Var2.g(bVar3) | g0Var2.g(aVar) | g0Var2.d(f3);
                            Object objN2 = g0Var2.N();
                            if (zE || objN2 == obj4) {
                                objN2 = new u00.k() {
                                    @Override
                                    public final Object invoke(Object obj5) {
                                        j0.h LazyRow = (j0.h) obj5;
                                        kotlin.jvm.internal.m.e(LazyRow, "$this$LazyRow");
                                        e6.c cVar3 = new e6.c(4);
                                        final u30.b bVar5 = bVar3;
                                        final to.a aVar2 = aVar;
                                        final float f7 = f3;
                                        j0.h.s(LazyRow, i4, cVar3, new v1.c(new u00.p() {
                                            @Override
                                            public final Object invoke(Object obj6, Object obj7, Object obj8, Object obj9) {
                                                j0.b items = (j0.b) obj6;
                                                int iIntValue2 = ((Integer) obj7).intValue();
                                                l1.g0 g0Var3 = (l1.j) obj8;
                                                int iIntValue3 = ((Integer) obj9).intValue();
                                                kotlin.jvm.internal.m.e(items, "$this$items");
                                                if ((iIntValue3 & 48) == 0) {
                                                    iIntValue3 |= g0Var3.e(iIntValue2) ? 32 : 16;
                                                }
                                                l1.g0 g0Var4 = g0Var3;
                                                if (g0Var4.S(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                                                    u30.b bVar6 = bVar5;
                                                    g.i((lo.b) bVar6.get(iIntValue2 % ((h00.b) bVar6).a()), aVar2, f7, g0Var3, 0);
                                                } else {
                                                    g0Var4.V();
                                                }
                                                return g00.b0.a;
                                            }
                                        }, 146457660, true), 4);
                                        return g00.b0.a;
                                    }
                                };
                                g0Var2.n0(objN2);
                            }
                            k00.f.e(rVarD, vVar, p1VarE, fVarG, null, null, false, null, (u00.k) objN2, g0Var, 12607494, 360);
                        } else {
                            g0Var2.V();
                        }
                        return g00.b0.a;
                    }
                }, jVar3), jVar2, 3078, 6);
            }
            r1VarT.d = gVar;
        }
        jVar2 = jVar3;
        jVar2.V();
        r1VarT = jVar2.t();
        if (r1VarT != null) {
            gVar = new ct.g(bVar, z, i, 2);
            r1VarT.d = gVar;
        }
    }

    public static final void d(kk.c cVar, u00.a aVar, b2.r rVar, l1.j jVar, int i) {
        kk.c cVar2;
        int i2;
        b2.r rVar2;
        l1.j jVar2;
        l1.j jVar3 = (l1.g0) jVar;
        jVar3.e0(-1107953619);
        if ((i & 6) == 0) {
            cVar2 = cVar;
            i2 = (jVar3.i(cVar2) ? 4 : 2) | i;
        } else {
            cVar2 = cVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= jVar3.i(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            rVar2 = rVar;
            i2 |= jVar3.g(rVar2) ? 256 : 128;
        } else {
            rVar2 = rVar;
        }
        if (jVar3.S(i2 & 1, (i2 & 147) != 146)) {
            jVar2 = jVar3;
            w50.c.f(aVar, cVar2, rVar2, false, false, 0.0f, null, 0L, i2.t.b(0.5f, dl.a.P), 10.0f, p0.f.a, 0.0f, k.a, jVar2, ((i2 >> 3) & 14) | 805306368 | ((i2 << 3) & 112) | (i2 & 896), 384, 2296);
        } else {
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new ro.c(cVar, aVar, rVar, i, 1);
        }
    }

    public static final void e(u30.b bVar, boolean z, u00.a aVar, u00.a aVar2, b2.r rVar, l1.j jVar, int i) {
        u00.a aVar3;
        u00.a aVar4;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1533347716);
        int i2 = i | (g0Var.g(bVar) ? 4 : 2) | (g0Var.i(aVar) ? 256 : 128) | (g0Var.i(aVar2) ? 2048 : 1024) | (g0Var.g(rVar) ? 16384 : 8192);
        if (g0Var.S(i2 & 1, (i2 & 9363) != 9362)) {
            long j = z ? a : dl.a.L;
            kk.c cVarD = kk.e.d(g0Var);
            y3.c cVar = (y3.c) g0Var.k(o1.h);
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (objN == obj) {
                objN = x5.s(0, g0Var);
            }
            z0 z0Var = (z0) objN;
            WeakHashMap weakHashMap = m2.w;
            float fA = h0.c.l(h0.b.e(g0Var).e, g0Var).a();
            b2.r rVarD = z1.d(rVar, 1.0f);
            w0 w0VarD = h0.o.d(b2.b.A, false);
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
            float f = 16;
            float f2 = 24;
            b2.r rVarG = h0.c.G(z.n.p(kk.e.a(z1.c, cVarD), z.n.l(g0Var), false, 14), 0.0f, 0.0f, 0.0f, ((y3.f) z0Var.getValue()).A + f + f2 + fA, 7);
            h0.v vVarA = h0.u.a(h0.i.c, b2.b.M, g0Var, 0);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarG, g0Var);
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
            f(48, j, g0Var, z);
            float f3 = z ? 5 : f2;
            b2.o oVar = b2.o.A;
            h0.c.h(z1.e(oVar, f3), g0Var);
            c(bVar, z, g0Var, i2 & 126);
            g0Var.r(true);
            int i3 = z ? 16 : 14;
            b2.r rVarS = z1.s(h0.c.G(h0.c.M(h0.s.a.a(oVar, b2.b.H), h0.c.g), 0.0f, 0.0f, 0.0f, f2, 7), 0.0f, z ? 540 : Float.NaN, 1);
            boolean zG = g0Var.g(cVar);
            Object objN2 = g0Var.N();
            if (zG || objN2 == obj) {
                objN2 = new as.f0(cVar, z0Var, 18);
                g0Var.n0(objN2);
            }
            aVar3 = aVar;
            h(i3, (i2 >> 3) & 112, z2.d0.o(rVarS, (u00.k) objN2), g0Var, aVar3);
            if (z) {
                g0Var.c0(1142735229);
                h0.o.a(z.n.e(z1.e(z1.d(oVar, 1.0f), 76), sg.f.P(va.a.S(new i2.t[]{new i2.t(i2.t.b(0.55f, i2.t.b)), new i2.t(i2.t.f)}), 0.0f, 0.0f, 14), (t0) null, 6), g0Var, 6);
                g0Var.r(false);
            } else {
                g0Var.c0(1143045632);
                g0Var.r(false);
            }
            aVar4 = aVar2;
            d(cVarD, aVar4, h0.c.G(oVar, f, z ? f : f2, 0.0f, 0.0f, 12), g0Var, (i2 >> 6) & 112);
            g0Var.r(true);
        } else {
            aVar3 = aVar;
            aVar4 = aVar2;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new b1.k(bVar, z, aVar3, aVar4, rVar, i, 5);
        }
    }

    public static final void f(int i, long j, l1.j jVar, boolean z) {
        int i2;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(488288546);
        if ((i & 6) == 0) {
            i2 = i | (g0Var.f(j) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.h(z) ? 32 : 16;
        }
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            i2.q qVarP = sg.f.P(va.a.S(new i2.t[]{new i2.t(i2.t.b(0.0f, j)), new i2.t(j)}), 0.0f, 0.0f, 14);
            i2.q qVarQ = sg.f.Q(new g00.k[]{new g00.k(Float.valueOf(0.0f), new i2.t(i2.t.b(0.0f, j))), new g00.k(Float.valueOf(0.6f), new i2.t(j))});
            int i3 = z ? 2131231686 : 2131231685;
            b2.o oVar = b2.o.A;
            b2.r rVarD = f2.h.d(z.n.f(z1.e(z1.d(oVar, 1.0f), 379), j, i2.b0.b));
            b2.i iVar = b2.b.B;
            w0 w0VarD = h0.o.d(iVar, false);
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
            b2.r rVarE = z1.e(z1.d(oVar, 1.0f), z ? 308 : 254);
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
            d1 d1Var = z2.o.a;
            z.n.c(k(i3, d1Var, g0Var), (String) null, z1.c, iVar, d1Var, 0.0f, g0Var, 28080, 96);
            h0.o.a(z.n.e(z1.e(z1.d(h0.s.a.a(oVar, b2.b.H), 1.0f), z ? 230 : 176), qVarP, (t0) null, 6), g0Var, 0);
            g0Var.r(true);
            d1 d1Var2 = z2.o.f;
            z.n.c(k(2131231684, d1Var2, g0Var), (String) null, z1.j(h0.c.z(oVar, -17, 60), 448, 299), (b2.d) null, d1Var2, 0.0f, g0Var, 25008, 104);
            h0.o.a(z.n.e(z1.e(z1.d(h0.c.A(oVar, 0.0f, z ? 198 : 245, 1), 1.0f), 142), z ? qVarQ : qVarP, (t0) null, 6), g0Var, 0);
            float f = 16;
            g(z1.s(h0.c.G(oVar, f, 260, f, 0.0f, 8), 0.0f, 357, 1), g0Var, 0);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new cl.a(i, j, z);
        }
    }

    public static final void g(b2.r rVar, l1.j jVar, int i) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1724135465);
        int i2 = (g0Var.g(rVar) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            b2.r rVarE = h0.c.E(rVar, 0.0f, 8, 1);
            h0.v vVarA = h0.u.a(h0.i.g(16), b2.b.N, g0Var, 54);
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
            String strU = z3.U(g0Var, 2131886148);
            long jZ = kh.o.z(34);
            long jZ2 = kh.o.z(40);
            q3.u uVar = q3.u.M;
            long j = dl.a.n;
            k00.f.a(strU, null, j, jZ, new y3.o(jZ2), uVar, new x3.k(3), 1, 0.6f, null, g0Var, 113470464, 514);
            k00.f.a(z3.U(g0Var, 2131886143), null, j, kh.o.z(15), new y3.o(kh.o.z(20)), null, new x3.k(3), 2, 0.0f, null, g0Var, 12610560, 802);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new ro.e(rVar, i, 6);
        }
    }

    public static final void h(int i, int i2, b2.r rVar, l1.j jVar, u00.a aVar) {
        int i3;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(730691073);
        if ((i2 & 6) == 0) {
            i3 = (g0Var.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g0Var.i(aVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g0Var.g(rVar) ? 256 : 128;
        }
        if (g0Var.S(i3 & 1, (i3 & 147) != 146)) {
            b2.r rVarG = z1.g(z1.d(h0.c.E(rVar, 16, 0.0f, 2), 1.0f), 52, 0.0f, 2);
            p0.e eVar = p0.f.a;
            float f = 8;
            long jB = i2.t.b(0.5f, i2.t.c);
            float f2 = 0;
            if (jB == 16) {
                jB = i2.t.b;
            }
            b2.r rVarD = h0.c.D(w50.c.n(z.n.f(f2.h.c(rVarG.V(new f2.p(eVar, new n2.d(f, f2, 1.0f, jB))), eVar), dl.a.n, i2.b0.b), true, aVar), 20, f);
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
            z6.b(z3.U(g0Var, 2131886144), (b2.r) null, dl.a.L, kh.o.z(i), q3.u.K, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 2, false, 1, 0, (u00.k) null, (r0) null, g0Var, 1572864, 24960, 241578);
            g0Var = g0Var;
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new vy.b(i, aVar, rVar, i2);
        }
    }

    public static final void i(lo.b bVar, to.a aVar, float f, l1.j jVar, int i) {
        lo.b bVar2;
        to.a aVar2;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1496915430);
        int i2 = (g0Var.g(bVar) ? 4 : 2) | i | (g0Var.g(aVar) ? 32 : 16) | (g0Var.d(f) ? 256 : 128);
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 896) == 256;
            Object objN = g0Var.N();
            if (z || objN == l1.i.a) {
                objN = new p0(f, 12);
                g0Var.n0(objN);
            }
            bVar2 = bVar;
            aVar2 = aVar;
            to.b.a(bVar2, aVar2, z2.d0.l(b2.o.A, (u00.o) objN), null, null, null, null, g0Var, i2 & 126, 120);
        } else {
            bVar2 = bVar;
            aVar2 = aVar;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new c00.k(bVar2, aVar2, f, i);
        }
    }

    public static final void j(final u30.b bVar, final u00.a aVar, final u00.a aVar2, l1.j jVar, int i) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1236282256);
        int i2 = i | (g0Var.g(bVar) ? 4 : 2) | (g0Var.i(aVar) ? 32 : 16) | (g0Var.i(aVar2) ? 256 : 128);
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            long jA = ((g3) g0Var.k(o1.u)).a();
            y3.c cVar = (y3.c) g0Var.k(o1.h);
            y3.f fVarJ0 = p30.f.j0(new y3.f(cVar.h0((int) (jA >> 32)) - 32), new y3.f(720));
            y3.f fVarJ1 = p30.f.j0(new y3.f(cVar.h0((int) (jA & 4294967295L)) - 64), new y3.f(680));
            final float f = fVarJ0.A;
            final float f2 = fVarJ1.A;
            s0.G(aVar2, new c4.v(3, false), v1.d.d(-567587065, new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    l1.g0 g0Var2 = (l1.j) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    l1.g0 g0Var3 = g0Var2;
                    if (g0Var3.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                        g.e(bVar, true, aVar, aVar2, z.n.f(f2.h.c(z1.j(b2.o.A, f, f2), p0.f.a(24)), g.a, i2.b0.b), g0Var2, 48);
                    } else {
                        g0Var3.V();
                    }
                    return g00.b0.a;
                }
            }, g0Var), g0Var, ((i2 >> 6) & 14) | 432, 0);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new b(bVar, aVar, aVar2, i, 2);
        }
    }

    public static final mb.j k(int i, z2.p pVar, l1.j jVar) {
        wb.h hVar = new wb.h((Context) ((l1.g0) jVar).k(o0.b));
        hVar.c = Integer.valueOf(i);
        return mb.l.i(hVar.a(), pVar, jVar, 3072, 54);
    }
}
