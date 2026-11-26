package bs;

import as.e0;
import b2.o;
import b2.r;
import g00.b0;
import g1.s;
import g1.u;
import g1.x5;
import h0.c1;
import h0.n1;
import h0.p1;
import h0.t1;
import h0.v1;
import h0.z1;
import i2.t;
import l1.g0;
import l1.m1;
import l1.q;
import oo.y0;
import u00.k;
import u00.n;

public final class e implements n {
    public final int A;
    public final k B;

    public e(int i, k kVar) {
        this.A = i;
        this.B = kVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        o oVar = o.A;
        Object obj3 = l1.i.a;
        b0 b0Var = b0.a;
        k kVar = this.B;
        switch (i) {
            case 0:
                g0 g0Var = (l1.j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    r rVarE = z1.e(z1.d(oVar, 1.0f), 48.0f);
                    p0.e eVarA = p0.f.a(32);
                    p1 p1Var = s.a;
                    g1.r rVarA = s.a(t.b(0.2f, dl.a.o), dl.a.k, 0L, 0L, g0Var, 12);
                    boolean zG = g0Var2.g(kVar);
                    Object objN = g0Var2.N();
                    if (zG || objN == obj3) {
                        objN = new e0(14, kVar);
                        g0Var2.n0(objN);
                    }
                    x5.a((u00.a) objN, rVarE, false, eVarA, rVarA, (u) null, (n1) null, (f0.i) null, a.a, g0Var, 805306416, 484);
                } else {
                    g0Var2.V();
                }
                return b0Var;
            case 1:
                g0 g0Var3 = (l1.j) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                g0 g0Var4 = g0Var3;
                if (g0Var4.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    r rVarE2 = z1.e(z1.d(oVar, 1.0f), 48.0f);
                    p0.e eVarA2 = p0.f.a(32);
                    p1 p1Var2 = s.a;
                    g1.r rVarA2 = s.a(t.b(0.2f, dl.a.o), dl.a.k, 0L, 0L, g0Var3, 12);
                    boolean zG2 = g0Var4.g(kVar);
                    Object objN2 = g0Var4.N();
                    if (zG2 || objN2 == obj3) {
                        objN2 = new e0(15, kVar);
                        g0Var4.n0(objN2);
                    }
                    x5.a((u00.a) objN2, rVarE2, false, eVarA2, rVarA2, (u) null, (n1) null, (f0.i) null, a.b, g0Var3, 805306416, 484);
                } else {
                    g0Var4.V();
                }
                return b0Var;
            case 2:
                g0 g0Var5 = (l1.j) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                g0 g0Var6 = g0Var5;
                if (g0Var6.S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    r rVarD = z1.d(oVar, 1.0f);
                    v1 v1VarA = t1.a(h0.i.g(8), b2.b.J, g0Var5, 6);
                    int iHashCode = Long.hashCode(g0Var6.T);
                    m1 m1VarM = g0Var6.m();
                    r rVarC = b2.a.c(rVarD, g0Var5);
                    b3.i.c.getClass();
                    b3.g gVar = b3.h.b;
                    g0Var6.g0();
                    if (g0Var6.S) {
                        g0Var6.l(gVar);
                    } else {
                        g0Var6.q0();
                    }
                    q.I(v1VarA, g0Var5, b3.h.f);
                    q.I(m1VarM, g0Var5, b3.h.e);
                    q.I(Integer.valueOf(iHashCode), g0Var5, b3.h.g);
                    q.E(g0Var5, b3.h.h);
                    q.I(rVarC, g0Var5, b3.h.d);
                    if (1.0f <= 0.0d) {
                        i0.a.a("invalid weight; must be greater than zero");
                    }
                    r rVarE3 = z1.e(new c1(1.0f, true), 48.0f);
                    float f = 32;
                    p0.e eVarA3 = p0.f.a(f);
                    p1 p1Var3 = s.a;
                    long j = dl.a.o;
                    long jB = t.b(0.2f, j);
                    long j2 = dl.a.k;
                    g1.r rVarA3 = s.a(jB, j2, 0L, 0L, g0Var5, 12);
                    boolean zG3 = g0Var6.g(kVar);
                    Object objN3 = g0Var6.N();
                    if (zG3 || objN3 == obj3) {
                        objN3 = new e0(16, kVar);
                        g0Var6.n0(objN3);
                    }
                    x5.a((u00.a) objN3, rVarE3, false, eVarA3, rVarA3, (u) null, (n1) null, (f0.i) null, a.c, g0Var5, 805306368, 484);
                    if (1.0f <= 0.0d) {
                        i0.a.a("invalid weight; must be greater than zero");
                    }
                    r rVarE4 = z1.e(new c1(1.0f, true), 48.0f);
                    p0.e eVarA4 = p0.f.a(f);
                    g1.r rVarA4 = s.a(t.b(0.2f, j), j2, 0L, 0L, g0Var5, 12);
                    boolean zG4 = g0Var6.g(kVar);
                    Object objN4 = g0Var6.N();
                    if (zG4 || objN4 == obj3) {
                        objN4 = new e0(11, kVar);
                        g0Var6.n0(objN4);
                    }
                    x5.a((u00.a) objN4, rVarE4, false, eVarA4, rVarA4, (u) null, (n1) null, (f0.i) null, a.d, g0Var5, 805306368, 484);
                    g0Var6.r(true);
                } else {
                    g0Var6.V();
                }
                return b0Var;
            case 3:
                kVar.invoke(new fy.g(((Integer) obj).intValue(), (Integer) obj2));
                return b0Var;
            case 4:
                kVar.invoke(new fy.j(((Integer) obj).intValue(), (Integer) obj2));
                return b0Var;
            case 5:
                ((Integer) obj2).intValue();
                return (k0.d) kVar.invoke((k0.u) obj);
            case 6:
                kVar.invoke(obj);
                return b0Var;
            case 7:
                g0 g0Var7 = (l1.j) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                g0 g0Var8 = g0Var7;
                if (g0Var8.S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    r rVarE5 = z1.e(z1.d(oVar, 1.0f), 48.0f);
                    p0.e eVarA5 = p0.f.a(32);
                    p1 p1Var4 = s.a;
                    g1.r rVarA5 = s.a(t.b(0.2f, dl.a.o), dl.a.k, 0L, 0L, g0Var7, 12);
                    boolean zG5 = g0Var8.g(kVar);
                    Object objN5 = g0Var8.N();
                    if (zG5 || objN5 == obj3) {
                        objN5 = new y0(16, kVar);
                        g0Var8.n0(objN5);
                    }
                    x5.a((u00.a) objN5, rVarE5, false, eVarA5, rVarA5, (u) null, (n1) null, (f0.i) null, ox.a.b, g0Var7, 805306416, 484);
                } else {
                    g0Var8.V();
                }
                return b0Var;
            case 8:
                g0 g0Var9 = (l1.j) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                g0 g0Var10 = g0Var9;
                if (g0Var10.S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    r rVarE6 = z1.e(z1.d(oVar, 1.0f), 48.0f);
                    p0.e eVarA6 = p0.f.a(32);
                    p1 p1Var5 = s.a;
                    g1.r rVarA6 = s.a(t.b(0.2f, dl.a.o), dl.a.k, 0L, 0L, g0Var9, 12);
                    boolean zG6 = g0Var10.g(kVar);
                    Object objN6 = g0Var10.N();
                    if (zG6 || objN6 == obj3) {
                        objN6 = new y0(11, kVar);
                        g0Var10.n0(objN6);
                    }
                    x5.a((u00.a) objN6, rVarE6, false, eVarA6, rVarA6, (u) null, (n1) null, (f0.i) null, ox.a.c, g0Var9, 805306416, 484);
                } else {
                    g0Var10.V();
                }
                return b0Var;
            case 9:
                g0 g0Var11 = (l1.j) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                g0 g0Var12 = g0Var11;
                if (g0Var12.S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    r rVarD2 = z1.d(oVar, 1.0f);
                    v1 v1VarA2 = t1.a(h0.i.g(8), b2.b.J, g0Var11, 6);
                    int iHashCode2 = Long.hashCode(g0Var12.T);
                    m1 m1VarM2 = g0Var12.m();
                    r rVarC2 = b2.a.c(rVarD2, g0Var11);
                    b3.i.c.getClass();
                    b3.g gVar2 = b3.h.b;
                    g0Var12.g0();
                    if (g0Var12.S) {
                        g0Var12.l(gVar2);
                    } else {
                        g0Var12.q0();
                    }
                    q.I(v1VarA2, g0Var11, b3.h.f);
                    q.I(m1VarM2, g0Var11, b3.h.e);
                    q.I(Integer.valueOf(iHashCode2), g0Var11, b3.h.g);
                    q.E(g0Var11, b3.h.h);
                    q.I(rVarC2, g0Var11, b3.h.d);
                    if (1.0f <= 0.0d) {
                        i0.a.a("invalid weight; must be greater than zero");
                    }
                    r rVarE7 = z1.e(new c1(1.0f, true), 48.0f);
                    float f2 = 32;
                    p0.e eVarA7 = p0.f.a(f2);
                    p1 p1Var6 = s.a;
                    long j3 = dl.a.o;
                    long jB2 = t.b(0.2f, j3);
                    long j4 = dl.a.k;
                    g1.r rVarA7 = s.a(jB2, j4, 0L, 0L, g0Var11, 12);
                    boolean zG7 = g0Var12.g(kVar);
                    Object objN7 = g0Var12.N();
                    if (zG7 || objN7 == obj3) {
                        objN7 = new y0(14, kVar);
                        g0Var12.n0(objN7);
                    }
                    x5.a((u00.a) objN7, rVarE7, false, eVarA7, rVarA7, (u) null, (n1) null, (f0.i) null, ox.a.d, g0Var11, 805306368, 484);
                    if (1.0f <= 0.0d) {
                        i0.a.a("invalid weight; must be greater than zero");
                    }
                    r rVarE8 = z1.e(new c1(1.0f, true), 48.0f);
                    p0.e eVarA8 = p0.f.a(f2);
                    g1.r rVarA8 = s.a(t.b(0.2f, j3), j4, 0L, 0L, g0Var11, 12);
                    boolean zG8 = g0Var12.g(kVar);
                    Object objN8 = g0Var12.N();
                    if (zG8 || objN8 == obj3) {
                        objN8 = new y0(15, kVar);
                        g0Var12.n0(objN8);
                    }
                    x5.a((u00.a) objN8, rVarE8, false, eVarA8, rVarA8, (u) null, (n1) null, (f0.i) null, ox.a.e, g0Var11, 805306368, 484);
                    g0Var12.r(true);
                } else {
                    g0Var12.V();
                }
                return b0Var;
            default:
                g0 g0Var13 = (l1.j) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                g0 g0Var14 = g0Var13;
                if (g0Var14.S(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    boolean zG9 = g0Var14.g(kVar);
                    Object objN9 = g0Var14.N();
                    if (zG9 || objN9 == obj3) {
                        objN9 = new qt.h(14, kVar);
                        g0Var14.n0(objN9);
                    }
                    up.i.a((u00.a) objN9, g0Var13, 0);
                } else {
                    g0Var14.V();
                }
                return b0Var;
        }
    }
}
