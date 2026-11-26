package oo;

import com.google.android.gms.internal.measurement.x5;
import d40.n1;
import h0.p1;
import h0.t1;
import h0.v1;
import h0.z1;
import l1.m1;

public final class u0 implements u00.o {
    public final int A;
    public final boolean B;
    public final z0 C;
    public final u00.k D;

    public u0(boolean z, z0 z0Var, u00.k kVar, int i) {
        this.A = i;
        this.B = z;
        this.C = z0Var;
        this.D = kVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.A) {
            case 0:
                h0.t BoxWithConstraints = (h0.t) obj;
                l1.g0 g0Var = (l1.j) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= g0Var.g(BoxWithConstraints) ? 4 : 2;
                }
                boolean z = (iIntValue & 19) != 18;
                l1.g0 g0Var2 = g0Var;
                a30.x xVar = g0Var2.a;
                if (g0Var2.S(iIntValue & 1, z)) {
                    boolean z2 = this.B;
                    float fC = z2 ? (BoxWithConstraints.c() / 2) - 30 : 342;
                    float f = z2 ? 20 : 72;
                    h0.a0 a0Var = z1.c;
                    v1 v1VarA = t1.a(h0.i.g(f), b2.b.J, g0Var, 0);
                    int iHashCode = Long.hashCode(g0Var2.T);
                    m1 m1VarM = g0Var2.m();
                    b2.r rVarC = b2.a.c(a0Var, g0Var);
                    b3.i.c.getClass();
                    b3.g gVar = b3.h.b;
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar);
                    } else {
                        g0Var2.q0();
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
                    p1 p1VarE = h0.c.e(0.0f, 20, 1);
                    double d = 1.0f;
                    if (d <= 0.0d) {
                        i0.a.a("invalid weight; must be greater than zero");
                    }
                    b2.r rVarC2 = z1.c(new h0.c1(1.0f, true), 1.0f);
                    z0 z0Var = this.C;
                    u00.k kVar = this.D;
                    o0.b(z0Var, kVar, rVarC2, p1VarE, g0Var, 3072);
                    b2.o oVar = b2.o.A;
                    b2.r rVarC3 = z1.c(z1.q(oVar, fC), 1.0f);
                    h0.v vVarA = h0.u.a(h0.i.c, b2.b.N, g0Var, 48);
                    int iHashCode2 = Long.hashCode(g0Var2.T);
                    m1 m1VarM2 = g0Var2.m();
                    b2.r rVarC4 = b2.a.c(rVarC3, g0Var);
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar);
                    } else {
                        g0Var2.q0();
                    }
                    l1.q.I(vVarA, g0Var, fVar);
                    l1.q.I(m1VarM2, g0Var, fVar2);
                    x5.u(iHashCode2, g0Var, fVar3, g0Var, eVar);
                    l1.q.I(rVarC4, g0Var, fVar4);
                    b2.r rVarG = h0.c.G(oVar, 0.0f, 8, 0.0f, 0.0f, 13);
                    u30.b bVar = z0Var.n;
                    boolean z3 = z0Var.o;
                    String str = z0Var.q;
                    boolean zG = g0Var2.g(kVar);
                    Object objN = g0Var2.N();
                    Object obj4 = l1.i.a;
                    if (zG || objN == obj4) {
                        objN = new nz.k(20, kVar);
                        g0Var2.n0(objN);
                    }
                    u00.a aVar = (u00.a) objN;
                    boolean zG2 = g0Var2.g(kVar);
                    Object objN2 = g0Var2.N();
                    if (zG2 || objN2 == obj4) {
                        objN2 = new nz.k(21, kVar);
                        g0Var2.n0(objN2);
                    }
                    u00.a aVar2 = (u00.a) objN2;
                    boolean zG3 = g0Var2.g(kVar);
                    Object objN3 = g0Var2.N();
                    if (zG3 || objN3 == obj4) {
                        objN3 = new lp.k(16, kVar);
                        g0Var2.n0(objN3);
                    }
                    po.n.b(bVar, z3, str, aVar, aVar2, (u00.k) objN3, rVarG, false, null, g0Var, 1572864, 384);
                    if (d <= 0.0d) {
                        i0.a.a("invalid weight; must be greater than zero");
                    }
                    h0.c.h(z1.g(new h0.c1(1.0f, true), 16, 0.0f, 2), g0Var);
                    o0.o(z0Var, kVar, h1.F, true, z2, null, g0Var, 3456, 32);
                    g0Var2.r(true);
                    g0Var2.r(true);
                } else {
                    g0Var2.V();
                }
                break;
            default:
                h0.w GlassPanel = (h0.w) obj;
                l1.g0 g0Var3 = (l1.j) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(GlassPanel, "$this$GlassPanel");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= g0Var3.g(GlassPanel) ? 4 : 2;
                }
                l1.g0 g0Var4 = g0Var3;
                if (g0Var4.S(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    w.x0 x0VarA = w.s0.b(x.c.w(350, 0, (x.v) null, 6), 14).a(w.s0.c(x.c.w(350, 0, (x.v) null, 6), 2));
                    w.y0 y0VarA = w.s0.h(x.c.w(350, 0, (x.v) null, 6), 14).a(w.s0.d(x.c.w(350, 0, (x.v) null, 6), 2));
                    z0 z0Var2 = this.C;
                    u00.k kVar2 = this.D;
                    w.c0.b(GlassPanel, this.B, (b2.r) null, x0VarA, y0VarA, (String) null, v1.d.d(-778256590, new t0(z0Var2, kVar2, 1), g0Var3), g0Var3, (iIntValue2 & 14) | 1600512, 18);
                    boolean z4 = z0Var2.d;
                    float f2 = z0Var2.g;
                    ru.d dVar = z0Var2.h;
                    boolean z5 = z0Var2.j;
                    boolean z6 = z0Var2.k;
                    boolean zG4 = g0Var4.g(kVar2);
                    Object objN4 = g0Var4.N();
                    Object obj5 = l1.i.a;
                    if (zG4 || objN4 == obj5) {
                        objN4 = new y0(2, kVar2);
                        g0Var4.n0(objN4);
                    }
                    u00.a aVar3 = (u00.a) objN4;
                    boolean zG5 = g0Var4.g(kVar2);
                    Object objN5 = g0Var4.N();
                    if (zG5 || objN5 == obj5) {
                        objN5 = new lp.k(23, kVar2);
                        g0Var4.n0(objN5);
                    }
                    u00.k kVar3 = (u00.k) objN5;
                    boolean zG6 = g0Var4.g(kVar2);
                    Object objN6 = g0Var4.N();
                    if (zG6 || objN6 == obj5) {
                        objN6 = new y0(3, kVar2);
                        g0Var4.n0(objN6);
                    }
                    u00.a aVar4 = (u00.a) objN6;
                    boolean zG7 = g0Var4.g(kVar2);
                    Object objN7 = g0Var4.N();
                    if (zG7 || objN7 == obj5) {
                        objN7 = new y0(4, kVar2);
                        g0Var4.n0(objN7);
                    }
                    u00.a aVar5 = (u00.a) objN7;
                    boolean zG8 = g0Var4.g(kVar2);
                    Object objN8 = g0Var4.N();
                    if (zG8 || objN8 == obj5) {
                        objN8 = new y0(5, kVar2);
                        g0Var4.n0(objN8);
                    }
                    u00.a aVar6 = (u00.a) objN8;
                    boolean zG9 = g0Var4.g(kVar2);
                    Object objN9 = g0Var4.N();
                    if (zG9 || objN9 == obj5) {
                        objN9 = new y0(6, kVar2);
                        g0Var4.n0(objN9);
                    }
                    u00.a aVar7 = (u00.a) objN9;
                    boolean zG10 = g0Var4.g(kVar2);
                    Object objN10 = g0Var4.N();
                    if (zG10 || objN10 == obj5) {
                        objN10 = new lp.k(24, kVar2);
                        g0Var4.n0(objN10);
                    }
                    u00.k kVar4 = (u00.k) objN10;
                    boolean zG11 = g0Var4.g(kVar2);
                    Object objN11 = g0Var4.N();
                    if (zG11 || objN11 == obj5) {
                        objN11 = new y0(8, kVar2);
                        g0Var4.n0(objN11);
                    }
                    po.n.c(z4, f2, dVar, z5, z6, aVar3, kVar3, aVar4, aVar5, aVar6, aVar7, kVar4, (u00.a) objN11, null, false, false, null, null, g0Var3, 0, 0, 253952);
                    h0.c.h(z1.e(b2.o.A, 20), g0Var3);
                    n1 n1Var = z0Var2.e;
                    Long l = z0Var2.f;
                    boolean zG12 = g0Var4.g(kVar2);
                    Object objN12 = g0Var4.N();
                    if (zG12 || objN12 == obj5) {
                        objN12 = new lp.k(25, kVar2);
                        g0Var4.n0(objN12);
                    }
                    po.h.a(n1Var, l, (u00.k) objN12, null, g0Var3, 0);
                } else {
                    g0Var4.V();
                }
                break;
        }
        return g00.b0.a;
    }
}
