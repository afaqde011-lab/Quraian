package gv;

import com.google.android.gms.internal.measurement.x5;
import h0.m2;
import java.util.WeakHashMap;
import l1.p2;
import w.b2;

public abstract class v1 {
    public static final float a = 16;
    public static final float b = 12;
    public static final float c = 840;
    public static final float d = 32;
    public static final float e = 24;

    public static final void a(bv.o1 o1Var, u00.k kVar, kk.c cVar, d00.x0 x0Var, long j, final o0 o0Var, boolean z, b2.r rVar, l1.j jVar, int i) {
        final int i2;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1026382721);
        int i3 = i | (g0Var.g(o1Var) ? 4 : 2) | (g0Var.i(kVar) ? 32 : 16) | (g0Var.g(cVar) ? 256 : 128) | (g0Var.g(x0Var) ? 2048 : 1024) | (g0Var.f(j) ? 16384 : 8192) | (g0Var.h(z) ? 1048576 : 524288);
        if (g0Var.S(i3 & 1, (4793491 & i3) != 4793490)) {
            b2.g gVar = new b2.g(((Number) x.d.b(z ? -1.0f : 0.0f, p.J(), (String) null, g0Var, 0, 28).getValue()).floatValue());
            h0.b bVar = h0.i.a;
            h0.v vVarA = h0.u.a(h0.i.g(b), gVar, g0Var, 6);
            int iHashCode = Long.hashCode(g0Var.T);
            l1.m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVar, g0Var);
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
            l1.q.I(rVarC, g0Var, fVar4);
            h0.v vVarA2 = h0.u.a(h0.i.c, b2.b.N, g0Var, 48);
            int iHashCode2 = Long.hashCode(g0Var.T);
            l1.m1 m1VarM2 = g0Var.m();
            b2.o oVar = b2.o.A;
            b2.r rVarC2 = b2.a.c(oVar, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar2);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA2, g0Var, fVar);
            l1.q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC2, g0Var, fVar4);
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (objN == obj) {
                i2 = 1;
                objN = new u00.k() {
                    @Override
                    public final Object invoke(Object obj2) {
                        y3.l lVar = (y3.l) obj2;
                        switch (i2) {
                            case 0:
                                o0Var.c.i((int) (lVar.a & 4294967295L));
                                break;
                            case 1:
                                o0Var.a.i((int) (lVar.a & 4294967295L));
                                break;
                            default:
                                o0Var.b.i((int) (lVar.a & 4294967295L));
                                break;
                        }
                        return g00.b0.a;
                    }
                };
                g0Var.n0(objN);
            } else {
                i2 = 1;
            }
            int i4 = i3 & 14;
            int i5 = i3 & 112;
            int i6 = i3 & 896;
            int i7 = i3 >> 3;
            boolean z2 = i2;
            iv.k.a(o1Var, kVar, cVar, j, z2.d0.o(oVar, (u00.k) objN), iv.k.b, false, g0Var, 196608 | i4 | i5 | i6 | (i7 & 7168), 64);
            b2.r rVarQ = h0.z1.q(oVar, av.j.b);
            Object objN2 = g0Var.N();
            if (objN2 == obj) {
                final int i8 = 2;
                objN2 = new u00.k() {
                    @Override
                    public final Object invoke(Object obj2) {
                        y3.l lVar = (y3.l) obj2;
                        switch (i8) {
                            case 0:
                                o0Var.c.i((int) (lVar.a & 4294967295L));
                                break;
                            case 1:
                                o0Var.a.i((int) (lVar.a & 4294967295L));
                                break;
                            default:
                                o0Var.b.i((int) (lVar.a & 4294967295L));
                                break;
                        }
                        return g00.b0.a;
                    }
                };
                g0Var.n0(objN2);
            }
            p.s(o1Var, kVar, cVar, x0Var, rVarQ, z2.d0.o(oVar, (u00.k) objN2), null, false, true, false, g0Var, 100687872 | i4 | i5 | i6 | (i3 & 7168), 704);
            g0Var = g0Var;
            g0Var.r(z2);
            b2.r rVarD = h0.z1.d(oVar, 1.0f);
            Object objN3 = g0Var.N();
            if (objN3 == obj) {
                final int i9 = 0;
                objN3 = new u00.k() {
                    @Override
                    public final Object invoke(Object obj2) {
                        y3.l lVar = (y3.l) obj2;
                        switch (i9) {
                            case 0:
                                o0Var.c.i((int) (lVar.a & 4294967295L));
                                break;
                            case 1:
                                o0Var.a.i((int) (lVar.a & 4294967295L));
                                break;
                            default:
                                o0Var.b.i((int) (lVar.a & 4294967295L));
                                break;
                        }
                        return g00.b0.a;
                    }
                };
                g0Var.n0(objN3);
            }
            v.a(o1Var, kVar, cVar, z2.d0.o(rVarD, (u00.k) objN3), false, z, g0Var, i4 | 24576 | i5 | i6 | (458752 & i7), 0);
            g0Var.r(z2);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new eu.i(o1Var, kVar, cVar, x0Var, j, o0Var, z, rVar, i);
        }
    }

    public static final void b(final bv.o1 o1Var, final u00.k kVar, final kk.c cVar, final d00.x0 x0Var, final v1.c cVar2, l1.j jVar, int i) {
        int i2;
        l1.g0 g0Var;
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(1488723866);
        if ((i & 6) == 0) {
            i2 = i | (g0Var2.g(o1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var2.i(kVar) ? 32 : 16;
        }
        int i3 = i2 | (g0Var2.g(cVar) ? 256 : 128) | (g0Var2.g(x0Var) ? 2048 : 1024);
        if (g0Var2.S(i3 & 1, (i3 & 9363) != 9362)) {
            WeakHashMap weakHashMap = m2.w;
            h0.t0 t0VarL = h0.c.l(h0.b.e(g0Var2).b, g0Var2);
            final h0.t0 t0VarL2 = h0.c.l(h0.b.e(g0Var2).n, g0Var2);
            final y3.m mVar = (y3.m) g0Var2.k(c3.o1.n);
            final y3.c cVar3 = (y3.c) g0Var2.k(c3.o1.h);
            Object objN = g0Var2.N();
            if (objN == l1.i.a) {
                objN = new o0();
                g0Var2.n0(objN);
            }
            final o0 o0Var = (o0) objN;
            final p2 p2VarA = b2.a(o1Var.m == null ? i2.t.b(0.5f, dl.a.P) : i2.t.b(0.1f, dl.a.i), (x.y) null, (String) null, g0Var2, 0, 14);
            h0.c.a(h0.c.B(h0.z1.c, t0VarL), (b2.d) null, false, v1.d.d(-1074306172, new u00.o() {
                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    h0.t BoxWithConstraints = (h0.t) obj;
                    l1.g0 g0Var3 = (l1.j) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    kotlin.jvm.internal.m.e(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= g0Var3.g(BoxWithConstraints) ? 4 : 2;
                    }
                    boolean z = (iIntValue & 19) != 18;
                    l1.g0 g0Var4 = g0Var3;
                    a30.x xVar = g0Var4.a;
                    if (g0Var4.S(iIntValue & 1, z)) {
                        float fC = BoxWithConstraints.c();
                        h0.t0 t0Var = t0VarL2;
                        y3.m mVar2 = mVar;
                        float fO = (fC - h0.c.o(t0Var, mVar2)) - h0.c.n(t0Var, mVar2);
                        bv.o1 o1Var2 = o1Var;
                        boolean z2 = o1Var2.Q;
                        boolean z3 = o1Var2.C;
                        boolean z4 = z3 && !z2;
                        float f = v1.a;
                        float f2 = fO - f;
                        float f3 = av.j.b;
                        float f4 = ab.a0.v(new y3.f(f2 - f3), new y3.f(0)).A;
                        if (y3.f.a(fO, v1.c) >= 0) {
                            f2 = 0.72f * fO;
                        }
                        float f5 = f2;
                        float f6 = z4 ? f3 : fO;
                        float fA = t0Var.a();
                        o0 o0Var2 = o0Var;
                        int iH = o0Var2.c.h();
                        y3.c cVar4 = cVar3;
                        float fH0 = cVar4.h0(o0Var2.a.h()) + cVar4.h0(o0Var2.b.h()) + cVar4.h0(iH) + fA + v1.b + v1.e;
                        boolean z5 = z3 && z2;
                        h0.a0 a0Var = h0.z1.c;
                        u00.k kVar2 = kVar;
                        kk.c cVar5 = cVar;
                        p2 p2Var = p2VarA;
                        p.t(z5, a0Var, null, null, v1.d.d(-1124236256, new t1(o1Var2, fH0, BoxWithConstraints, kVar2, cVar5, p2Var), g0Var3), g0Var3, 24624, 12);
                        b2.r rVarB = h0.c.B(a0Var, t0Var);
                        h0.v1 v1VarA = h0.t1.a(h0.i.g(f), b2.b.L, g0Var3, 54);
                        int iHashCode = Long.hashCode(g0Var4.T);
                        l1.m1 m1VarM = g0Var4.m();
                        b2.r rVarC = b2.a.c(rVarB, g0Var3);
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
                        w50.c.a(o1Var2.x, f6, b2.b.M, null, p.J(), null, v1.d.d(-604277293, new u1(o1Var2, kVar2, cVar5, x0Var, o0Var2, z4, p2Var), g0Var3), g0Var3, 1573248);
                        if (1.0f <= 0.0d) {
                            i0.a.a("invalid weight; must be greater than zero");
                        }
                        h0.c.h(new h0.c1(1.0f, true), g0Var3);
                        g0Var4.r(true);
                        w.c0.c(z3 && !z2, a0Var, w.s0.c((x.y) null, 3), w.s0.d((x.y) null, 3), (String) null, v1.d.d(456796076, new p1(o1Var2, f5, f4, t0Var, kVar2, cVar5, p2Var), g0Var3), g0Var3, 200112, 16);
                        boolean z6 = !o1Var2.x;
                        b2.r rVarB2 = h0.c.B(h0.s.a.a(b2.o.A, b2.b.I), t0Var);
                        w.x0 x0VarC = w.s0.c(p.J(), 2);
                        x.b1 b1VarJ = p.J();
                        Object objN2 = g0Var4.N();
                        l1.c cVar6 = l1.i.a;
                        if (objN2 == cVar6) {
                            objN2 = new e6.c(4);
                            g0Var4.n0(objN2);
                        }
                        w.x0 x0VarA = x0VarC.a(w.s0.j((u00.k) objN2, b1VarJ));
                        w.y0 y0VarD = w.s0.d(p.J(), 2);
                        x.b1 b1VarJ2 = p.J();
                        Object objN3 = g0Var4.N();
                        if (objN3 == cVar6) {
                            objN3 = new e6.c(4);
                            g0Var4.n0(objN3);
                        }
                        p.t(z6, rVarB2, x0VarA, y0VarD.a(w.s0.l((u00.k) objN3, b1VarJ2)), v1.d.d(93201161, new az.j(8, o1Var2, cVar5, kVar2), g0Var3), g0Var3, 24576, 0);
                        b2.r rVarB3 = h0.c.B(a0Var, t0Var);
                        z2.w0 w0VarD = h0.o.d(b2.b.A, false);
                        int iHashCode2 = Long.hashCode(g0Var4.T);
                        l1.m1 m1VarM2 = g0Var4.m();
                        b2.r rVarC2 = b2.a.c(rVarB3, g0Var3);
                        g0Var4.g0();
                        if (g0Var4.S) {
                            g0Var4.l(gVar);
                        } else {
                            g0Var4.q0();
                        }
                        l1.q.I(w0VarD, g0Var3, fVar);
                        l1.q.I(m1VarM2, g0Var3, fVar2);
                        x5.u(iHashCode2, g0Var3, fVar3, g0Var3, eVar);
                        l1.q.I(rVarC2, g0Var3, fVar4);
                        cVar2.invoke(g0Var3, 0);
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
            r1VarT.d = new s1(o1Var, kVar, cVar, x0Var, cVar2, i, 0);
        }
    }

    public static final void c(bv.o1 uiState, u00.k onAction, kk.c cVar, d00.x0 x0Var, l1.j jVar, int i) {
        int i2;
        kotlin.jvm.internal.m.e(uiState, "uiState");
        kotlin.jvm.internal.m.e(onAction, "onAction");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1083784733);
        if ((i & 6) == 0) {
            i2 = (g0Var.g(uiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.i(onAction) ? 32 : 16;
        }
        int i3 = i2 | (g0Var.g(cVar) ? 256 : 128) | (g0Var.g(x0Var) ? 2048 : 1024);
        if (g0Var.S(i3 & 1, (i3 & 1171) != 1170)) {
            b(uiState, onAction, cVar, x0Var, v1.d.d(648866562, new j0(uiState, onAction, 1, (byte) 0), g0Var), g0Var, (i3 & 7168) | (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896));
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new q1(uiState, onAction, cVar, x0Var, i, 0);
        }
    }
}
