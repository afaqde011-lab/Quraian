package eu;

import com.google.android.gms.internal.measurement.z3;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import g1.x5;
import gv.c0;
import h0.m2;
import h0.n1;
import h0.p1;
import h0.z1;
import h1.x0;
import i2.t0;
import java.util.WeakHashMap;
import l1.g0;
import l1.m1;
import qd.s0;

public final class d implements u00.n {
    public final int A;
    public final u00.a B;

    public d(int i, u00.a aVar) {
        this.A = i;
        this.B = aVar;
    }

    public d(u00.a aVar, int i, int i2) {
        this.A = i2;
        this.B = aVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        b2.o oVar = b2.o.A;
        u00.a aVar = this.B;
        g00.b0 b0Var = g00.b0.a;
        switch (i) {
            case 0:
                g0 g0Var = (l1.j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                g0 g0Var2 = g0Var;
                if (!g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    g0Var2.V();
                } else {
                    b2.r rVarE = z1.e(z1.d(oVar, 1.0f), 48);
                    p0.e eVarA = p0.f.a(32);
                    p1 p1Var = g1.s.a;
                    x5.a(this.B, rVarE, false, eVarA, g1.s.a(i2.t.b(0.2f, dl.a.o), dl.a.k, 0L, 0L, g0Var, 12), (g1.u) null, (n1) null, (f0.i) null, a.a, g0Var, 805306416, 484);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                a.b(aVar, (l1.j) obj, l1.q.K(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                b0.b(aVar, (l1.j) obj, l1.q.K(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ez.a.a(aVar, (l1.j) obj, l1.q.K(1));
                break;
            case 4:
                g0 g0Var3 = (l1.j) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                g0 g0Var4 = g0Var3;
                if (!g0Var4.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    g0Var4.V();
                } else {
                    s0.G(this.B, new c4.v(false, false, false, false, 231), ez.a.a, g0Var3, 432, 0);
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                ez.a.d(aVar, (l1.j) obj, l1.q.K(1));
                break;
            case 6:
                g0 g0Var5 = (l1.j) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                g0 g0Var6 = g0Var5;
                if (!g0Var6.S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    g0Var6.V();
                } else {
                    String strU = z3.U(g0Var5, 2131887080);
                    p1 p1Var2 = g1.s.a;
                    k00.f.k(strU, null, g1.s.a(dl.a.i, dl.a.M, 0L, 0L, g0Var5, 12), this.B, g0Var5, 0);
                }
                break;
            case 7:
                g0 g0Var7 = (l1.j) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                g0 g0Var8 = g0Var7;
                if (!g0Var8.S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    g0Var8.V();
                } else {
                    gv.p.d(aVar, g0Var7, 0);
                }
                break;
            case 8:
                ((Integer) obj2).getClass();
                gv.p.e(aVar, (l1.j) obj, l1.q.K(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                gv.p.d(aVar, (l1.j) obj, l1.q.K(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                c0.c(aVar, (l1.j) obj, l1.q.K(1));
                break;
            case 11:
                g0 g0Var9 = (l1.j) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                g0 g0Var10 = g0Var9;
                if (!g0Var10.S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    g0Var10.V();
                } else {
                    gv.p.v(aVar, g0Var9, 0);
                }
                break;
            case 12:
                ((Integer) obj2).getClass();
                gv.p.w(aVar, (l1.j) obj, l1.q.K(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                gv.p.v(aVar, (l1.j) obj, l1.q.K(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                lz.a.a(aVar, (l1.j) obj, l1.q.K(1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                po.n.l(aVar, (l1.j) obj, l1.q.K(1));
                break;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                g0 g0Var11 = (l1.j) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                g0 g0Var12 = g0Var11;
                if (!g0Var12.S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    g0Var12.V();
                } else {
                    p1 p1Var3 = g1.s.a;
                    x5.h(this.B, (b2.r) null, false, (t0) null, g1.s.a(dl.a.i, dl.a.l, 0L, 0L, g0Var11, 12), (n1) null, pp.c.b, g0Var11, 805306368, 494);
                }
                break;
            case 17:
                g0 g0Var13 = (l1.j) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                g0 g0Var14 = g0Var13;
                if (!g0Var14.S(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    g0Var14.V();
                } else {
                    up.i.a(aVar, g0Var13, 0);
                }
                break;
            case 18:
                ((Integer) obj2).getClass();
                rd.a.a(aVar, (l1.j) obj, l1.q.K(1));
                break;
            case 19:
                g0 g0Var15 = (l1.j) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                g0 g0Var16 = g0Var15;
                if (!g0Var16.S(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    g0Var16.V();
                } else {
                    float f = 24;
                    b2.r rVarG = h0.c.G(h0.c.E(z1.d(oVar, 1.0f), f, 0.0f, 2), 0.0f, 0.0f, 0.0f, f, 7);
                    h0.v vVarA = h0.u.a(h0.i.c, b2.b.N, g0Var15, 48);
                    int iHashCode = Long.hashCode(g0Var16.T);
                    m1 m1VarM = g0Var16.m();
                    b2.r rVarC = b2.a.c(rVarG, g0Var15);
                    b3.i.c.getClass();
                    b3.g gVar = b3.h.b;
                    g0Var16.g0();
                    if (g0Var16.S) {
                        g0Var16.l(gVar);
                    } else {
                        g0Var16.q0();
                    }
                    l1.q.I(vVarA, g0Var15, b3.h.f);
                    l1.q.I(m1VarM, g0Var15, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode), g0Var15, b3.h.g);
                    l1.q.E(g0Var15, b3.h.h);
                    l1.q.I(rVarC, g0Var15, b3.h.d);
                    rd.a.a(aVar, g0Var15, 0);
                    g0Var16.r(true);
                }
                break;
            case 20:
                g0 g0Var17 = (l1.j) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                g0 g0Var18 = g0Var17;
                if (!g0Var18.S(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    g0Var18.V();
                } else {
                    s0.G(this.B, new c4.v(false, false, false, false, 231), tp.i.a, g0Var17, 432, 0);
                }
                break;
            case 21:
                g0 g0Var19 = (l1.j) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                g0 g0Var20 = g0Var19;
                if (!g0Var20.S(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    g0Var20.V();
                } else {
                    c4.v vVar = new c4.v(false, false, false, false, 231);
                    u00.a aVar2 = this.B;
                    s0.G(aVar2, vVar, v1.d.d(-1001875077, new d(22, aVar2), g0Var19), g0Var19, 432, 0);
                }
                break;
            case 22:
                g0 g0Var21 = (l1.j) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                g0 g0Var22 = g0Var21;
                if (!g0Var22.S(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    g0Var22.V();
                } else {
                    tp.h.c(g0Var21, 0);
                    h0.a0 a0Var = z1.c;
                    WeakHashMap weakHashMap = m2.w;
                    h0.c.a(h0.c.C(h0.c.L(a0Var, h0.b.e(g0Var21).g), tp.h.f), (b2.d) null, false, v1.d.d(-752214831, new x0(4, aVar), g0Var21), g0Var21, 3072, 6);
                }
                break;
            case 23:
                ((Integer) obj2).getClass();
                up.i.a(aVar, (l1.j) obj, l1.q.K(1));
                break;
            case 24:
                g0 g0Var23 = (l1.j) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                g0 g0Var24 = g0Var23;
                if (!g0Var24.S(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    g0Var24.V();
                } else {
                    s0.G(this.B, new c4.v(false, false, false, false, 231), wy.q.a, g0Var23, 432, 0);
                }
                break;
            case 25:
                ((Integer) obj2).getClass();
                wy.q.c(aVar, (l1.j) obj, l1.q.K(1));
                break;
            default:
                ((Integer) obj2).getClass();
                yr.a.d(aVar, (l1.j) obj, l1.q.K(1));
                break;
        }
        return b0Var;
    }
}
