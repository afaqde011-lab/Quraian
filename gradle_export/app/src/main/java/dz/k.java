package dz;

import bv.o1;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import d0.o2;
import d00.x0;
import eu.x;
import g00.b0;
import g1.f6;
import g1.l8;
import g1.q0;
import g1.u3;
import g1.x5;
import h0.n1;
import h0.p1;
import h0.u;
import h0.z1;
import i2.t;
import j0.v;
import k0.y;
import l1.g0;
import l1.m1;
import l1.p2;
import l1.z0;
import lu.z;
import oo.o0;
import ri.t1;
import ta.c0;
import x.b1;
import z2.d0;
import z2.w0;

public final class k implements u00.n {
    public final int A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;

    public k(b2.r rVar, z0 z0Var, v1.c cVar, x0.c cVar2) {
        this.A = 19;
        this.C = rVar;
        this.D = z0Var;
        this.E = cVar;
        this.B = cVar2;
    }

    public k(Object obj, b2.r rVar, Object obj2, g00.e eVar, int i, int i2) {
        this.A = i2;
        this.D = obj;
        this.C = rVar;
        this.E = obj2;
        this.B = eVar;
    }

    public k(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.A = i2;
        this.D = obj;
        this.E = obj2;
        this.B = obj3;
        this.C = obj4;
    }

    public k(Object obj, u00.k kVar, Object obj2, Object obj3, int i, int i2) {
        this.A = i2;
        this.D = obj;
        this.B = kVar;
        this.E = obj2;
        this.C = obj3;
    }

    public k(oo.z0 z0Var, u00.k kVar, b2.r rVar, p1 p1Var, int i) {
        this.A = 11;
        this.D = z0Var;
        this.B = kVar;
        this.C = rVar;
        this.E = p1Var;
    }

    public k(u00.a aVar, u00.a aVar2, u00.a aVar3, u00.a aVar4) {
        this.A = 3;
        this.D = aVar;
        this.E = aVar2;
        this.B = aVar3;
        this.C = aVar4;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        l1.c cVar = l1.i.a;
        int i2 = 0;
        b0 b0Var = b0.a;
        Object obj3 = this.C;
        Object obj4 = this.B;
        Object obj5 = this.E;
        Object obj6 = this.D;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                m.a((v) obj6, (n) obj5, (u00.k) obj4, (b2.r) obj3, (l1.j) obj, l1.q.K(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                eq.m.a((cq.i) obj6, (kk.c) obj5, (u00.k) obj4, (b2.r) obj3, (l1.j) obj, l1.q.K(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                eu.a.h((u00.a) obj6, (u00.a) obj5, (u00.a) obj4, (b2.r) obj3, (l1.j) obj, l1.q.K(1));
                break;
            case 3:
                final u00.a aVar = (u00.a) obj6;
                final u00.a aVar2 = (u00.a) obj5;
                final u00.a aVar3 = (u00.a) obj4;
                final u00.a aVar4 = (u00.a) obj3;
                g0 g0Var = (l1.j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                g0 g0Var2 = g0Var;
                if (!g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    g0Var2.V();
                } else {
                    h0.v vVarA = u.a(h0.i.g(8), b2.b.M, g0Var, 6);
                    int iHashCode = Long.hashCode(g0Var2.T);
                    m1 m1VarM = g0Var2.m();
                    b2.r rVar = b2.o.A;
                    b2.r rVarC = b2.a.c(rVar, g0Var);
                    b3.i.c.getClass();
                    b3.g gVar = b3.h.b;
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar);
                    } else {
                        g0Var2.q0();
                    }
                    l1.q.I(vVarA, g0Var, b3.h.f);
                    l1.q.I(m1VarM, g0Var, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
                    l1.q.E(g0Var, b3.h.h);
                    l1.q.I(rVarC, g0Var, b3.h.d);
                    g0Var2.c0(-1080722219);
                    int i3 = 0;
                    while (i3 < 3) {
                        Object objN = g0Var2.N();
                        if (objN == cVar) {
                            objN = l1.q.r(new eu.v(i3, i2));
                            g0Var2.n0(objN);
                        }
                        p2 p2Var = (p2) objN;
                        b2.r rVarD = z1.d(z1.e(rVar, 48.0f), 1.0f);
                        p0.e eVarA = p0.f.a(32);
                        p1 p1Var = g1.s.a;
                        b2.r rVar2 = rVar;
                        g1.r rVarA = g1.s.a(t.b(0.2f, dl.a.o), dl.a.k, 0L, 0L, g0Var, 12);
                        boolean zE = g0Var2.e(i3) | g0Var2.g(aVar) | g0Var2.g(aVar2) | g0Var2.g(aVar3) | g0Var2.g(aVar4);
                        Object objN2 = g0Var2.N();
                        if (zE || objN2 == cVar) {
                            final int i4 = i3;
                            objN2 = new u00.a() {
                                @Override
                                public final Object invoke() {
                                    int i5 = i4;
                                    if (i5 == 0) {
                                        aVar.invoke();
                                    } else if (i5 == 1) {
                                        aVar2.invoke();
                                    } else if (i5 == 2) {
                                        aVar3.invoke();
                                    }
                                    aVar4.invoke();
                                    return g00.b0.a;
                                }
                            };
                            g0Var2.n0(objN2);
                        }
                        x5.a((u00.a) objN2, rVarD, false, eVarA, rVarA, (g1.u) null, (n1) null, (f0.i) null, v1.d.d(-1040476124, new x(p2Var, 0), g0Var), g0Var, 805306416, 484);
                        i3++;
                        rVar = rVar2;
                        i2 = 0;
                    }
                    g0Var2.r(i2);
                    g0Var2.r(true);
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                k00.f.k((String) obj6, (b2.r) obj3, (g1.r) obj5, (u00.a) obj4, (l1.j) obj, l1.q.K(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                u3.b((q0) obj6, (f6) obj5, (l8) obj4, (v1.c) obj3, (l1.j) obj, l1.q.K(385));
                break;
            case 6:
                ((Integer) obj2).getClass();
                gv.n1.c((o1) obj6, (u00.k) obj4, (kk.c) obj5, (x0) obj3, (l1.j) obj, l1.q.K(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                gv.z1.a((o1) obj6, (u00.k) obj4, (kk.c) obj5, (b2.r) obj3, (l1.j) obj, l1.q.K(3073));
                break;
            case 8:
                ((Integer) obj2).getClass();
                kx.h.a((jx.s) obj6, (u00.k) obj4, (y) obj5, (b2.r) obj3, (l1.j) obj, l1.q.K(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                mu.d.d((ju.f) obj6, (z) obj5, (u00.k) obj4, (b2.r) obj3, (l1.j) obj, l1.q.K(3073));
                break;
            case 10:
                ((Integer) obj2).getClass();
                nz.a.a((v) obj6, (nz.m) obj5, (u00.k) obj4, (b2.r) obj3, (l1.j) obj, l1.q.K(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                o0.b((oo.z0) obj6, (u00.k) obj4, (b2.r) obj3, (p1) obj5, (l1.j) obj, l1.q.K(3073));
                break;
            case 12:
                ((Integer) obj2).getClass();
                o0.u((oo.z0) obj6, (u00.k) obj4, (kk.c) obj5, (u00.a) obj3, (l1.j) obj, l1.q.K(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                po.h.a((d40.n1) obj6, (Long) obj5, (u00.k) obj4, (b2.r) obj3, (l1.j) obj, l1.q.K(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                t1.a((String) obj6, (u00.k) obj4, (g2.t) obj5, (b2.r) obj3, (l1.j) obj, l1.q.K(385));
                break;
            case 15:
                ((Integer) obj2).getClass();
                w00.a.a((u30.b) obj6, (u30.c) obj5, (u00.k) obj4, (b2.r) obj3, (l1.j) obj, l1.q.K(1));
                break;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                ((Integer) obj2).getClass();
                rx.a.i((qx.o) obj6, (u00.k) obj4, (y) obj5, (b2.r) obj3, (l1.j) obj, l1.q.K(1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                vy.a.a((String) obj6, (String) obj5, (String) obj4, (b2.r) obj3, (l1.j) obj, l1.q.K(1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                c0.e((Boolean) obj6, (b2.r) obj3, (b1) obj5, (v1.c) obj4, (l1.j) obj, l1.q.K(3121));
                break;
            case 19:
                b2.r rVar3 = (b2.r) obj3;
                z0 z0Var = (z0) obj6;
                v1.c cVar2 = (v1.c) obj5;
                x0.c cVar3 = (x0.c) obj4;
                g0 g0Var3 = (l1.j) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                g0 g0Var4 = g0Var3;
                if (!g0Var4.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    g0Var4.V();
                } else {
                    Object objN3 = g0Var4.N();
                    if (objN3 == cVar) {
                        objN3 = new o2(z0Var, 28);
                        g0Var4.n0(objN3);
                    }
                    b2.r rVarN = d0.n(rVar3, (u00.k) objN3);
                    w0 w0VarD = h0.o.d(b2.b.A, true);
                    int iHashCode2 = Long.hashCode(g0Var4.T);
                    m1 m1VarM2 = g0Var4.m();
                    b2.r rVarC2 = b2.a.c(rVarN, g0Var3);
                    b3.i.c.getClass();
                    b3.g gVar2 = b3.h.b;
                    g0Var4.g0();
                    if (g0Var4.S) {
                        g0Var4.l(gVar2);
                    } else {
                        g0Var4.q0();
                    }
                    l1.q.I(w0VarD, g0Var3, b3.h.f);
                    l1.q.I(m1VarM2, g0Var3, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode2), g0Var3, b3.h.g);
                    l1.q.E(g0Var3, b3.h.h);
                    l1.q.I(rVarC2, g0Var3, b3.h.d);
                    cVar2.invoke(g0Var3, 0);
                    Object objN4 = g0Var4.N();
                    if (objN4 == cVar) {
                        objN4 = new x0.d(z0Var, 0);
                        g0Var4.n0(objN4);
                    }
                    cVar3.b((u00.a) objN4, g0Var3, 6);
                    g0Var4.r(true);
                }
                break;
            case 20:
                ((Integer) obj2).getClass();
                xy.a.a((v) obj6, (xy.n) obj5, (u00.k) obj4, (b2.r) obj3, (l1.j) obj, l1.q.K(1));
                break;
            default:
                ((Integer) obj2).getClass();
                yr.a.g((String) obj6, (String) obj5, (u30.b) obj4, (u00.a) obj3, (l1.j) obj, l1.q.K(1));
                break;
        }
        return b0Var;
    }
}
