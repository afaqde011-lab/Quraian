package cz;

import b2.r;
import bv.o1;
import bz.p;
import com.google.android.gms.internal.measurement.z3;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import d0.o2;
import d00.x0;
import eu.x;
import g00.b0;
import g1.s;
import g1.x5;
import g1.z6;
import h0.n1;
import h0.p1;
import h0.u;
import h0.z1;
import i2.t;
import j0.v;
import l1.g0;
import l1.m1;
import l1.p2;
import l1.q;
import l1.z0;
import lu.z;
import m3.r0;
import oo.o0;
import z2.d0;
import z2.w0;

public final class g implements u00.n {
    public final int A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;

    public g(r rVar, z0 z0Var, v1.c cVar, x0.c cVar2, u00.a aVar) {
        this.A = 9;
        this.F = rVar;
        this.C = z0Var;
        this.D = cVar;
        this.B = cVar2;
        this.E = aVar;
    }

    public g(o1 o1Var, u00.k kVar, kk.c cVar, x0 x0Var, p2 p2Var) {
        this.A = 1;
        this.C = o1Var;
        this.B = kVar;
        this.D = cVar;
        this.E = x0Var;
        this.F = p2Var;
    }

    public g(Object obj, Object obj2, u00.k kVar, u00.a aVar, Object obj3, int i, int i2) {
        this.A = i2;
        this.C = obj;
        this.D = obj2;
        this.B = kVar;
        this.E = aVar;
        this.F = obj3;
    }

    public g(jk.a aVar, u00.a aVar2, u00.a aVar3, u00.k kVar, r rVar, int i) {
        this.A = 3;
        this.C = aVar;
        this.E = aVar2;
        this.D = aVar3;
        this.B = kVar;
        this.F = rVar;
    }

    public g(ju.f fVar, z zVar, jk.a aVar, u00.k kVar, r rVar, int i) {
        this.A = 4;
        this.C = fVar;
        this.D = zVar;
        this.E = aVar;
        this.B = kVar;
        this.F = rVar;
    }

    public g(ju.f fVar, z zVar, u00.k kVar, u00.k kVar2, u00.a aVar, int i) {
        this.A = 5;
        this.C = fVar;
        this.D = zVar;
        this.B = kVar;
        this.F = kVar2;
        this.E = aVar;
    }

    public g(kk.c cVar, u00.a aVar, u30.b bVar, u00.k kVar, u00.k kVar2) {
        this.A = 7;
        this.C = cVar;
        this.E = aVar;
        this.D = bVar;
        this.B = kVar;
        this.F = kVar2;
    }

    public g(oo.z0 z0Var, u00.k kVar, kk.c cVar, u00.a aVar, r rVar, int i) {
        this.A = 6;
        this.C = z0Var;
        this.B = kVar;
        this.D = cVar;
        this.E = aVar;
        this.F = rVar;
    }

    public g(ot.b bVar, rt.g gVar, u00.a aVar, u00.k kVar, u00.a aVar2) {
        this.A = 8;
        this.C = bVar;
        this.D = gVar;
        this.E = aVar;
        this.B = kVar;
        this.F = aVar2;
    }

    public g(u00.a aVar, u00.a aVar2, u00.a aVar3, u00.a aVar4, u00.a aVar5) {
        this.A = 2;
        this.E = aVar;
        this.C = aVar2;
        this.D = aVar3;
        this.B = aVar4;
        this.F = aVar5;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        final u00.a aVar;
        int i = this.A;
        int i2 = 32;
        r rVar = b2.o.A;
        l1.c cVar = l1.i.a;
        b0 b0Var = b0.a;
        Object obj3 = this.F;
        Object obj4 = this.E;
        Object obj5 = this.B;
        Object obj6 = this.D;
        Object obj7 = this.C;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                j.a((v) obj7, (p) obj6, (u00.k) obj5, (u00.a) obj4, (r) obj3, (l1.j) obj, q.K(1));
                break;
            case 1:
                o1 o1Var = (o1) obj7;
                u00.k kVar = (u00.k) obj5;
                kk.c cVar2 = (kk.c) obj6;
                x0 x0Var = (x0) obj4;
                p2 p2Var = (p2) obj3;
                g0 g0Var = (l1.j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                g0 g0Var2 = g0Var;
                if (!g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    g0Var2.V();
                } else {
                    r rVarG = h0.c.G(b2.o.A, 0.0f, 16, 0.0f, 0.0f, 13);
                    h0.v vVarA = u.a(h0.i.c, b2.b.N, g0Var, 48);
                    int iHashCode = Long.hashCode(g0Var2.T);
                    m1 m1VarM = g0Var2.m();
                    r rVarC = b2.a.c(rVarG, g0Var);
                    b3.i.c.getClass();
                    b3.g gVar = b3.h.b;
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar);
                    } else {
                        g0Var2.q0();
                    }
                    q.I(vVarA, g0Var, b3.h.f);
                    q.I(m1VarM, g0Var, b3.h.e);
                    q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
                    q.E(g0Var, b3.h.h);
                    q.I(rVarC, g0Var, b3.h.d);
                    iv.k.a(o1Var, kVar, cVar2, ((t) p2Var.getValue()).a, null, iv.k.b, false, g0Var, 196608, 80);
                    gv.p.s(o1Var, kVar, cVar2, x0Var, null, null, null, false, false, o1Var.x, g0Var, 0, 496);
                    g0Var2.r(true);
                }
                break;
            case 2:
                final u00.a aVar2 = (u00.a) obj4;
                final u00.a aVar3 = (u00.a) obj7;
                u00.a aVar4 = (u00.a) obj6;
                final u00.a aVar5 = (u00.a) obj5;
                final u00.a aVar6 = (u00.a) obj3;
                l1.j jVar = (l1.j) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                g0 g0Var3 = (g0) jVar;
                if (!g0Var3.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    g0Var3.V();
                } else {
                    h0.v vVarA2 = u.a(h0.i.g(8), b2.b.M, jVar, 6);
                    int iHashCode2 = Long.hashCode(g0Var3.T);
                    m1 m1VarM2 = g0Var3.m();
                    r rVarC2 = b2.a.c(rVar, jVar);
                    b3.i.c.getClass();
                    b3.g gVar2 = b3.h.b;
                    g0Var3.g0();
                    if (g0Var3.S) {
                        g0Var3.l(gVar2);
                    } else {
                        g0Var3.q0();
                    }
                    q.I(vVarA2, jVar, b3.h.f);
                    q.I(m1VarM2, jVar, b3.h.e);
                    q.I(Integer.valueOf(iHashCode2), jVar, b3.h.g);
                    q.E(jVar, b3.h.h);
                    q.I(rVarC2, jVar, b3.h.d);
                    g0Var3.c0(-809566500);
                    final int i3 = 0;
                    while (i3 < 5) {
                        Object objN = g0Var3.N();
                        if (objN == cVar) {
                            objN = q.r(new eu.v(i3, 1));
                            g0Var3.n0(objN);
                        }
                        p2 p2Var2 = (p2) objN;
                        r rVarD = z1.d(z1.e(rVar, 48.0f), 1.0f);
                        p0.e eVarA = p0.f.a(i2);
                        p1 p1Var = s.a;
                        r rVar2 = rVar;
                        g1.r rVarA = s.a(t.b(0.2f, dl.a.o), dl.a.k, 0L, 0L, jVar, 12);
                        boolean zE = g0Var3.e(i3) | g0Var3.g(aVar2) | g0Var3.g(aVar3) | g0Var3.g(aVar4) | g0Var3.g(aVar5) | g0Var3.g(aVar6);
                        Object objN2 = g0Var3.N();
                        if (zE || objN2 == cVar) {
                            aVar = aVar4;
                            u00.a aVar7 = new u00.a() {
                                @Override
                                public final Object invoke() {
                                    int i4 = i3;
                                    if (i4 == 0) {
                                        aVar2.invoke();
                                    } else if (i4 == 1) {
                                        aVar3.invoke();
                                    } else if (i4 == 2) {
                                        aVar.invoke();
                                    } else if (i4 == 3) {
                                        aVar5.invoke();
                                    }
                                    aVar6.invoke();
                                    return b0.a;
                                }
                            };
                            g0Var3.n0(aVar7);
                            objN2 = aVar7;
                        } else {
                            aVar = aVar4;
                        }
                        l1.j jVar2 = jVar;
                        x5.a((u00.a) objN2, rVarD, false, eVarA, rVarA, (g1.u) null, (n1) null, (f0.i) null, v1.d.d(685910342, new x(p2Var2, 2), jVar), jVar2, 805306416, 484);
                        i3++;
                        aVar4 = aVar;
                        rVar = rVar2;
                        jVar = jVar2;
                        i2 = 32;
                    }
                    g0Var3.r(false);
                    g0Var3.r(true);
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                lv.e.b((jk.a) obj7, (u00.a) obj4, (u00.a) obj6, (u00.k) obj5, (r) obj3, (l1.j) obj, q.K(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                mu.d.a((ju.f) obj7, (z) obj6, (jk.a) obj4, (u00.k) obj5, (r) obj3, (l1.j) obj, q.K(24577));
                break;
            case 5:
                ((Integer) obj2).getClass();
                mu.d.m((ju.f) obj7, (z) obj6, (u00.k) obj5, (u00.k) obj3, (u00.a) obj4, (l1.j) obj, q.K(24577));
                break;
            case 6:
                ((Integer) obj2).getClass();
                o0.e((oo.z0) obj7, (u00.k) obj5, (kk.c) obj6, (u00.a) obj4, (r) obj3, (l1.j) obj, q.K(1));
                break;
            case 7:
                kk.c cVar3 = (kk.c) obj7;
                u00.a aVar8 = (u00.a) obj4;
                u30.b bVar = (u30.b) obj6;
                u00.k kVar2 = (u00.k) obj5;
                u00.k kVar3 = (u00.k) obj3;
                g0 g0Var4 = (l1.j) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                boolean z = (iIntValue3 & 3) != 2;
                g0 g0Var5 = g0Var4;
                a30.x xVar = g0Var5.a;
                if (!g0Var5.S(iIntValue3 & 1, z)) {
                    g0Var5.V();
                } else {
                    r rVarC3 = f2.h.c(z1.c(z1.f(z1.r(h0.c.E(rVar, 0.0f, 44, 1), 500, 550), RCHTTPStatusCodes.BAD_REQUEST, 650), 1.0f), p0.f.a(32));
                    w0 w0VarD = h0.o.d(b2.b.A, false);
                    int iHashCode3 = Long.hashCode(g0Var5.T);
                    m1 m1VarM3 = g0Var5.m();
                    r rVarC4 = b2.a.c(rVarC3, g0Var4);
                    b3.i.c.getClass();
                    b3.g gVar3 = b3.h.b;
                    g0Var5.g0();
                    if (g0Var5.S) {
                        g0Var5.l(gVar3);
                    } else {
                        g0Var5.q0();
                    }
                    b3.f fVar = b3.h.f;
                    q.I(w0VarD, g0Var4, fVar);
                    b3.f fVar2 = b3.h.e;
                    q.I(m1VarM3, g0Var4, fVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode3);
                    b3.f fVar3 = b3.h.g;
                    q.I(numValueOf, g0Var4, fVar3);
                    b3.e eVar = b3.h.h;
                    q.E(g0Var4, eVar);
                    b3.f fVar4 = b3.h.d;
                    q.I(rVarC4, g0Var4, fVar4);
                    r rVarA2 = kk.e.a(z.n.f(z1.c, dl.a.O, i2.b0.b), cVar3);
                    h0.v vVarA3 = u.a(h0.i.c, b2.b.M, g0Var4, 0);
                    int iHashCode4 = Long.hashCode(g0Var5.T);
                    m1 m1VarM4 = g0Var5.m();
                    r rVarC5 = b2.a.c(rVarA2, g0Var4);
                    g0Var5.g0();
                    if (g0Var5.S) {
                        g0Var5.l(gVar3);
                    } else {
                        g0Var5.q0();
                    }
                    q.I(vVarA3, g0Var4, fVar);
                    q.I(m1VarM4, g0Var4, fVar2);
                    com.google.android.gms.internal.measurement.x5.u(iHashCode4, g0Var4, fVar3, g0Var4, eVar);
                    q.I(rVarC5, g0Var4, fVar4);
                    float f = 16;
                    float f2 = 20;
                    r rVarG2 = z1.g(h0.c.F(z1.d(rVar, 1.0f), f2, f, f2, 10), 36, 0.0f, 2);
                    w0 w0VarD2 = h0.o.d(b2.b.E, false);
                    int iHashCode5 = Long.hashCode(g0Var5.T);
                    m1 m1VarM5 = g0Var5.m();
                    r rVarC6 = b2.a.c(rVarG2, g0Var4);
                    g0Var5.g0();
                    if (g0Var5.S) {
                        g0Var5.l(gVar3);
                    } else {
                        g0Var5.q0();
                    }
                    q.I(w0VarD2, g0Var4, fVar);
                    q.I(m1VarM5, g0Var4, fVar2);
                    com.google.android.gms.internal.measurement.x5.u(iHashCode5, g0Var4, fVar3, g0Var4, eVar);
                    q.I(rVarC6, g0Var4, fVar4);
                    z6.b(z3.U(g0Var4, 2131886134), (r) null, dl.a.k, kh.o.z(18), q3.u.D, (q3.i) null, 0L, (x3.l) null, new x3.k(3), kh.o.z(20), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var4, 1597440, 48, 258986);
                    g0Var5.r(true);
                    po.n.i(bVar, kVar2, kVar3, g0Var4, 0);
                    g0Var5.r(true);
                    po.n.h(cVar3, aVar8, h0.c.G(h0.s.a.a(rVar, b2.b.C), 0.0f, f, f, 0.0f, 9), g0Var4, 0);
                    g0Var5.r(true);
                }
                break;
            case 8:
                ot.b bVar2 = (ot.b) obj7;
                rt.g gVar4 = (rt.g) obj6;
                u00.a aVar9 = (u00.a) obj4;
                u00.k kVar4 = (u00.k) obj5;
                u00.a aVar10 = (u00.a) obj3;
                g0 g0Var6 = (l1.j) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                g0 g0Var7 = g0Var6;
                if (!g0Var7.S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    g0Var7.V();
                } else {
                    st.j.j(bVar2.a, gVar4, aVar9, kVar4, aVar10, g0Var6, 0);
                }
                break;
            case 9:
                r rVar3 = (r) obj3;
                z0 z0Var = (z0) obj7;
                v1.c cVar4 = (v1.c) obj6;
                x0.c cVar5 = (x0.c) obj5;
                u00.a aVar11 = (u00.a) obj4;
                g0 g0Var8 = (l1.j) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                g0 g0Var9 = g0Var8;
                if (!g0Var9.S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    g0Var9.V();
                } else {
                    Object objN3 = g0Var9.N();
                    if (objN3 == cVar) {
                        objN3 = new o2(z0Var, 27);
                        g0Var9.n0(objN3);
                    }
                    r rVarN = d0.n(rVar3, (u00.k) objN3);
                    w0 w0VarD3 = h0.o.d(b2.b.A, true);
                    int iHashCode6 = Long.hashCode(g0Var9.T);
                    m1 m1VarM6 = g0Var9.m();
                    r rVarC7 = b2.a.c(rVarN, g0Var8);
                    b3.i.c.getClass();
                    b3.g gVar5 = b3.h.b;
                    g0Var9.g0();
                    if (g0Var9.S) {
                        g0Var9.l(gVar5);
                    } else {
                        g0Var9.q0();
                    }
                    q.I(w0VarD3, g0Var8, b3.h.f);
                    q.I(m1VarM6, g0Var8, b3.h.e);
                    q.I(Integer.valueOf(iHashCode6), g0Var8, b3.h.g);
                    q.E(g0Var8, b3.h.h);
                    q.I(rVarC7, g0Var8, b3.h.d);
                    cVar4.invoke(g0Var8, 0);
                    cVar5.b(aVar11, g0Var8, 6);
                    g0Var9.r(true);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                yr.a.h((u30.b) obj7, (u30.b) obj6, (u00.k) obj5, (u00.a) obj4, (u00.a) obj3, (l1.j) obj, q.K(9));
                break;
        }
        return b0Var;
    }
}
