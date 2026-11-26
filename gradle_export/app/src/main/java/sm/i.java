package sm;

import bv.k1;
import c3.o1;
import com.google.android.gms.internal.measurement.b5;
import g1.g2;
import h0.t1;
import h0.v1;
import h0.x1;
import h0.z1;
import i2.t0;
import l1.m1;
import l1.p2;
import l1.q1;
import l1.q2;
import l1.y0;
import z2.l1;
import z2.v0;

public final class i implements u00.o {
    public final u00.o A;
    public final u00.a B;
    public final jk.a C;
    public final i2.t D;
    public final float E;
    public final kk.c F;
    public final float G;
    public final float H;
    public final u00.k I;
    public final v1.c J;
    public final long K;

    public i(u00.o oVar, u00.a aVar, jk.a aVar2, i2.t tVar, float f, kk.c cVar, float f2, float f3, u00.k kVar, v1.c cVar2, long j) {
        this.A = oVar;
        this.B = aVar;
        this.C = aVar2;
        this.D = tVar;
        this.E = f;
        this.F = cVar;
        this.G = f2;
        this.H = f3;
        this.I = kVar;
        this.J = cVar2;
        this.K = j;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        final boolean z;
        Object eVar;
        a40.z zVar;
        boolean z2;
        h0.t BoxWithConstraints = (h0.t) obj;
        l1.g0 g0Var = (l1.j) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        kotlin.jvm.internal.m.e(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((iIntValue & 6) == 0) {
            iIntValue |= g0Var.g(BoxWithConstraints) ? 4 : 2;
        }
        l1.g0 g0Var2 = g0Var;
        if (g0Var2.S(iIntValue & 1, (iIntValue & 19) != 18)) {
            y3.c cVar = (y3.c) g0Var2.k(o1.h);
            float fH = y3.a.h(BoxWithConstraints.b) - cVar.A0(8.0f);
            final float f = this.H;
            final float fA0 = (fH - cVar.A0(f)) / 5;
            final u00.o oVar = this.A;
            int i = oVar != null ? 5 : 4;
            Object objN = g0Var2.N();
            Object obj4 = l1.i.a;
            if (objN == obj4) {
                objN = x.c.a(0.0f, 0.01f);
                g0Var2.n0(objN);
            }
            final x.b bVar = (x.b) objN;
            boolean zG = g0Var2.g(cVar);
            Object objN2 = g0Var2.N();
            if (zG || objN2 == obj4) {
                objN2 = l1.q.r(new d0.g(bVar, BoxWithConstraints, cVar, 12));
                g0Var2.n0(objN2);
            }
            final p2 p2Var = (p2) objN2;
            boolean z3 = g0Var2.k(o1.n) == y3.m.A;
            Object objN3 = g0Var2.N();
            if (objN3 == obj4) {
                objN3 = l1.q.o(g0Var);
                g0Var2.n0(objN3);
            }
            final a40.z zVar2 = (a40.z) objN3;
            u00.a aVar = this.B;
            boolean zG2 = g0Var2.g(aVar);
            Object objN4 = g0Var2.N();
            if (zG2 || objN4 == obj4) {
                objN4 = oi.k.s(((Number) aVar.invoke()).intValue(), g0Var2);
            }
            y0 y0Var = (y0) objN4;
            boolean zG3 = g0Var2.g(zVar2);
            Object objN5 = g0Var2.N();
            if (zG3 || objN5 == obj4) {
                final boolean z4 = z3;
                final int i2 = i;
                z = z4;
                eVar = new tm.e(zVar2, ((Number) aVar.invoke()).intValue(), new z00.a(0.0f, i), 0.001f, 1.3928572f, new qs.c(22), new g2(i2, this.I, zVar2, y0Var, bVar, 4), new u00.o() {
                    @Override
                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                        tm.e DampedDragAnimation = (tm.e) obj5;
                        h2.b bVar2 = (h2.b) obj7;
                        kotlin.jvm.internal.m.e(DampedDragAnimation, "$this$DampedDragAnimation");
                        float fIntBitsToFloat = ((Float.intBitsToFloat((int) (bVar2.a >> 32)) / fA0) * (z4 ? 1.0f : -1.0f)) + DampedDragAnimation.d();
                        float f2 = i2;
                        if (fIntBitsToFloat < 0.0f) {
                            fIntBitsToFloat = 0.0f;
                        }
                        if (fIntBitsToFloat <= f2) {
                            f2 = fIntBitsToFloat;
                        }
                        DampedDragAnimation.g(f2);
                        ta.c0.M(zVar2, (k00.i) null, (u00.n) null, (u00.k) null, new rm.c(bVar, bVar2, null, 5), 31);
                        return g00.b0.a;
                    }
                });
                zVar = zVar2;
                g0Var2.n0(eVar);
            } else {
                zVar = zVar2;
                eVar = objN5;
                z = z3;
            }
            final tm.e eVar2 = (tm.e) eVar;
            boolean zG4 = g0Var2.g(aVar) | g0Var2.g(y0Var);
            Object objN6 = g0Var2.N();
            u00.k kVar = null;
            if (zG4 || objN6 == obj4) {
                objN6 = new rm.c(aVar, y0Var, null, 3);
                g0Var2.n0(objN6);
            }
            l1.q.i(aVar, g0Var, (u00.n) objN6);
            boolean zG5 = g0Var2.g(y0Var) | g0Var2.i(eVar2);
            Object objN7 = g0Var2.N();
            if (zG5 || objN7 == obj4) {
                objN7 = new rm.c(y0Var, eVar2, null, 4);
                g0Var2.n0(objN7);
            }
            l1.q.i(eVar2, g0Var, (u00.n) objN7);
            boolean zG6 = g0Var2.g(zVar);
            Object objN8 = g0Var2.N();
            if (zG6 || objN8 == obj4) {
                objN8 = new tm.i(zVar, new u00.n() {
                    @Override
                    public final Object invoke(Object obj5, Object obj6) {
                        float fIntBitsToFloat;
                        float fFloatValue;
                        h2.e eVar3 = (h2.e) obj5;
                        boolean z5 = z;
                        tm.e eVar4 = eVar2;
                        float f2 = fA0;
                        p2 p2Var2 = p2Var;
                        if (z5) {
                            fIntBitsToFloat = (eVar4.e() + 0.5f) * f2;
                            fFloatValue = ((Number) p2Var2.getValue()).floatValue();
                        } else {
                            fIntBitsToFloat = Float.intBitsToFloat((int) (eVar3.a >> 32)) - ((eVar4.e() + 0.5f) * f2);
                            fFloatValue = ((Number) p2Var2.getValue()).floatValue();
                        }
                        float f3 = fFloatValue + fIntBitsToFloat;
                        return new h2.b((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (eVar3.a & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
                    }
                });
                g0Var2.n0(objN8);
            }
            final tm.i iVar = (tm.i) objN8;
            boolean zG7 = g0Var2.g(p2Var);
            Object objN9 = g0Var2.N();
            if (zG7 || objN9 == obj4) {
                objN9 = new k1(p2Var, 7);
                g0Var2.n0(objN9);
            }
            b2.o oVar2 = b2.o.A;
            b2.r rVarP = i2.b0.p(oVar2, (u00.k) objN9);
            Object objN10 = g0Var2.N();
            if (objN10 == obj4) {
                objN10 = new q50.b(16);
                g0Var2.n0(objN10);
            }
            u00.a aVar2 = (u00.a) objN10;
            Object objN11 = g0Var2.N();
            if (objN11 == obj4) {
                objN11 = new r9.e(10);
                g0Var2.n0(objN11);
            }
            u00.k kVar2 = (u00.k) objN11;
            boolean zI = g0Var2.i(eVar2);
            Object objN12 = g0Var2.N();
            if (zI || objN12 == obj4) {
                objN12 = new e(eVar2, 3);
                g0Var2.n0(objN12);
            }
            u00.k kVar3 = (u00.k) objN12;
            final i2.t tVar = this.D;
            if (tVar == null) {
                g0Var2.c0(-18499292);
                g0Var2.r(false);
            } else {
                g0Var2.c0(-18499291);
                long j = tVar.a;
                boolean zF = g0Var2.f(j);
                Object objN13 = g0Var2.N();
                if (zF || objN13 == obj4) {
                    objN13 = new gj.h(j, 6);
                    g0Var2.n0(objN13);
                }
                kVar = (u00.k) objN13;
                g0Var2.r(false);
            }
            u00.k kVar4 = kVar;
            final jk.a aVar3 = this.C;
            b2.r rVarC = h0.c.C(z1.d(z1.e(jk.d.b(rVarP, aVar3, aVar2, kVar2, (u00.a) null, (u00.a) null, (u00.a) null, kVar3, kVar4, 3000).V(iVar.i), this.E), 1.0f), 4.0f);
            v1 v1VarA = t1.a(h0.i.a, b2.b.K, g0Var, 48);
            boolean z5 = z;
            int iHashCode = Long.hashCode(g0Var2.T);
            m1 m1VarM = g0Var2.m();
            b2.r rVarC2 = b2.a.c(rVarC, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            l1.q.I(v1VarA, g0Var, b3.h.f);
            l1.q.I(m1VarM, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC2, g0Var, b3.h.d);
            final v1.c cVar2 = this.J;
            x1 x1Var = x1.a;
            cVar2.invoke(x1Var, g0Var, 6);
            if (oVar == null) {
                g0Var2.c0(-2030687124);
                z2 = false;
            } else {
                z2 = false;
                g0Var2.c0(1319967285);
                oVar.invoke(x1Var, g0Var, 6);
            }
            g0Var2.r(z2);
            g0Var2.r(true);
            q2 q2Var = k0.a;
            boolean zI2 = g0Var2.i(eVar2);
            Object objN14 = g0Var2.N();
            if (zI2 || objN14 == obj4) {
                objN14 = new b(eVar2, 0);
                g0Var2.n0(objN14);
            }
            q1 q1VarA = q2Var.a((u00.a) objN14);
            final kk.c cVar3 = this.F;
            final float f2 = this.G;
            final long j2 = this.K;
            l1.q.a(q1VarA, v1.d.d(350596645, new u00.n() {
                @Override
                public final Object invoke(Object obj5, Object obj6) {
                    u00.k kVar5;
                    l1.g0 g0Var3 = (l1.j) obj5;
                    int iIntValue2 = ((Integer) obj6).intValue();
                    l1.g0 g0Var4 = g0Var3;
                    if (g0Var4.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                        Object objN15 = g0Var4.N();
                        Object obj7 = l1.i.a;
                        if (objN15 == obj7) {
                            objN15 = new r9.e(9);
                            g0Var4.n0(objN15);
                        }
                        b2.r rVarA = kk.e.a(f2.h.a(j3.q.b(b2.o.A, (u00.k) objN15), 0.0f), cVar3);
                        p2 p2Var2 = p2Var;
                        boolean zG8 = g0Var4.g(p2Var2);
                        Object objN16 = g0Var4.N();
                        if (zG8 || objN16 == obj7) {
                            objN16 = new k1(p2Var2, 8);
                            g0Var4.n0(objN16);
                        }
                        b2.r rVarP2 = i2.b0.p(rVarA, (u00.k) objN16);
                        Object objN17 = g0Var4.N();
                        if (objN17 == obj7) {
                            objN17 = new q50.b(17);
                            g0Var4.n0(objN17);
                        }
                        u00.a aVar4 = (u00.a) objN17;
                        tm.e eVar3 = eVar2;
                        boolean zI3 = g0Var4.i(eVar3);
                        Object objN18 = g0Var4.N();
                        if (zI3 || objN18 == obj7) {
                            objN18 = new e(eVar3, 4);
                            g0Var4.n0(objN18);
                        }
                        u00.k kVar6 = (u00.k) objN18;
                        boolean zI4 = g0Var4.i(eVar3);
                        Object objN19 = g0Var4.N();
                        if (zI4 || objN19 == obj7) {
                            objN19 = new b(eVar3, 4);
                            g0Var4.n0(objN19);
                        }
                        u00.a aVar5 = (u00.a) objN19;
                        i2.t tVar2 = tVar;
                        if (tVar2 == null) {
                            g0Var4.c0(-734726684);
                            g0Var4.r(false);
                            kVar5 = null;
                        } else {
                            g0Var4.c0(-734726683);
                            long j3 = tVar2.a;
                            boolean zF2 = g0Var4.f(j3);
                            Object objN20 = g0Var4.N();
                            if (zF2 || objN20 == obj7) {
                                objN20 = new gj.h(j3, 7);
                                g0Var4.n0(objN20);
                            }
                            kVar5 = (u00.k) objN20;
                            g0Var4.r(false);
                        }
                        b2.r rVarR = i2.b0.r(h0.c.E(z1.d(z1.e(jk.d.b(rVarP2, aVar3, aVar4, kVar6, aVar5, (u00.a) null, (u00.a) null, (u00.k) null, kVar5, 3056).V(iVar.i), f2), 1.0f), 4.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 0.0f, (t0) null, new i2.m(j2, 5), 262143);
                        v1 v1VarA2 = t1.a(h0.i.a, b2.b.K, g0Var3, 48);
                        int iHashCode2 = Long.hashCode(g0Var4.T);
                        m1 m1VarM2 = g0Var4.m();
                        b2.r rVarC3 = b2.a.c(rVarR, g0Var3);
                        b3.i.c.getClass();
                        b3.g gVar2 = b3.h.b;
                        g0Var4.g0();
                        if (g0Var4.S) {
                            g0Var4.l(gVar2);
                        } else {
                            g0Var4.q0();
                        }
                        l1.q.I(v1VarA2, g0Var3, b3.h.f);
                        l1.q.I(m1VarM2, g0Var3, b3.h.e);
                        l1.q.I(Integer.valueOf(iHashCode2), g0Var3, b3.h.g);
                        l1.q.E(g0Var3, b3.h.h);
                        l1.q.I(rVarC3, g0Var3, b3.h.d);
                        v1.c cVar4 = cVar2;
                        x1 x1Var2 = x1.a;
                        cVar4.invoke(x1Var2, g0Var3, 6);
                        u00.o oVar3 = oVar;
                        if (oVar3 == null) {
                            g0Var4.c0(-1911602260);
                        } else {
                            g0Var4.c0(-2139874571);
                            oVar3.invoke(x1Var2, g0Var3, 6);
                        }
                        g0Var4.r(false);
                        g0Var4.r(true);
                    } else {
                        g0Var4.V();
                    }
                    return g00.b0.a;
                }
            }, g0Var), g0Var, 56);
            b2.r rVarE = h0.c.E(oVar2, 4.0f, 0.0f, 2);
            boolean zH = g0Var2.h(z5) | g0Var2.i(eVar2) | g0Var2.d(fA0) | g0Var2.g(p2Var);
            Object objN15 = g0Var2.N();
            if (zH || objN15 == obj4) {
                d dVar = new d(z5, eVar2, fA0, p2Var, 0);
                fA0 = fA0;
                g0Var2.n0(dVar);
                objN15 = dVar;
            }
            b2.r rVarV = i2.b0.p(rVarE, (u00.k) objN15).V(iVar.j).V(eVar2.t);
            kk.b bVarC = kk.e.c(aVar3, cVar3, g0Var, 0);
            Object objN16 = g0Var2.N();
            if (objN16 == obj4) {
                objN16 = new q50.b(15);
                g0Var2.n0(objN16);
            }
            u00.a aVar4 = (u00.a) objN16;
            boolean zI3 = g0Var2.i(eVar2);
            Object objN17 = g0Var2.N();
            if (zI3 || objN17 == obj4) {
                objN17 = new e(eVar2, 0);
                g0Var2.n0(objN17);
            }
            u00.k kVar5 = (u00.k) objN17;
            boolean zI4 = g0Var2.i(eVar2);
            Object objN18 = g0Var2.N();
            if (zI4 || objN18 == obj4) {
                objN18 = new b(eVar2, 1);
                g0Var2.n0(objN18);
            }
            u00.a aVar5 = (u00.a) objN18;
            boolean zI5 = g0Var2.i(eVar2);
            Object objN19 = g0Var2.N();
            if (zI5 || objN19 == obj4) {
                objN19 = new b(eVar2, 2);
                g0Var2.n0(objN19);
            }
            u00.a aVar6 = (u00.a) objN19;
            boolean zI6 = g0Var2.i(eVar2);
            Object objN20 = g0Var2.N();
            if (zI6 || objN20 == obj4) {
                objN20 = new b(eVar2, 3);
                g0Var2.n0(objN20);
            }
            u00.a aVar7 = (u00.a) objN20;
            boolean zI7 = g0Var2.i(eVar2);
            Object objN21 = g0Var2.N();
            if (zI7 || objN21 == obj4) {
                objN21 = new e(eVar2, 1);
                g0Var2.n0(objN21);
            }
            u00.k kVar6 = (u00.k) objN21;
            boolean zI8 = g0Var2.i(eVar2);
            Object objN22 = g0Var2.N();
            if (zI8 || objN22 == obj4) {
                objN22 = new e(eVar2, 2);
                g0Var2.n0(objN22);
            }
            b2.r rVarE2 = z1.e(jk.d.b(rVarV, bVarC, aVar4, kVar5, aVar5, aVar6, aVar7, kVar6, (u00.k) objN22, 2944), f2);
            boolean zI9 = g0Var2.i(eVar2) | g0Var2.e(5) | g0Var2.d(fA0) | g0Var2.d(f);
            Object objN23 = g0Var2.N();
            if (zI9 || objN23 == obj4) {
                objN23 = new u00.o() {
                    @Override
                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                        z2.y0 layout = (z2.y0) obj5;
                        v0 measurable = (v0) obj6;
                        y3.a aVar8 = (y3.a) obj7;
                        kotlin.jvm.internal.m.e(layout, "$this$layout");
                        kotlin.jvm.internal.m.e(measurable, "measurable");
                        float fE = eVar2.e() - 4;
                        if (fE < 0.0f) {
                            fE = 0.0f;
                        }
                        if (fE > 1.0f) {
                            fE = 1.0f;
                        }
                        int iRound = Math.round(b5.A(fA0, layout.A0(f), fE));
                        l1 l1VarO = measurable.O(y3.a.a(aVar8.a, iRound, iRound, 0, 0, 12));
                        return layout.o0(l1VarO.A, l1VarO.B, h00.y.A, new a1.q2(l1VarO, 20));
                    }
                };
                g0Var2.n0(objN23);
            }
            h0.o.a(z2.d0.l(rVarE2, (u00.o) objN23), g0Var, 0);
        } else {
            g0Var2.V();
        }
        return g00.b0.a;
    }
}
