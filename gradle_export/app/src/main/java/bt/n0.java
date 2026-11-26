package bt;

import b2.o;
import b2.r;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import g00.b0;
import g1.o3;
import h0.a0;
import h0.u;
import h0.v;
import h0.w;
import h0.z1;
import l1.g0;
import l1.m1;
import l1.q;

public final class n0 implements u00.o {
    public final int A;
    public final u00.k B;
    public final float C;

    public n0(float f, u00.k kVar, int i) {
        this.A = i;
        this.C = f;
        this.B = kVar;
    }

    public n0(u00.k kVar, float f) {
        this.A = 1;
        this.B = kVar;
        this.C = f;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.A) {
            case 0:
                j0.b item = (j0.b) obj;
                l1.g0 g0Var = (l1.j) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(item, "$this$item");
                l1.g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    b2.r rVarE = h0.c.E(h0.c.G(b2.o.A, 0.0f, 16, 0.0f, 0.0f, 13), this.C, 0.0f, 2);
                    u00.k kVar = this.B;
                    boolean zG = g0Var2.g(kVar);
                    Object objN = g0Var2.N();
                    Object obj4 = l1.i.a;
                    if (zG || objN == obj4) {
                        objN = new as.e0(21, kVar);
                        g0Var2.n0(objN);
                    }
                    u00.a aVar = (u00.a) objN;
                    boolean zG2 = g0Var2.g(kVar);
                    Object objN2 = g0Var2.N();
                    if (zG2 || objN2 == obj4) {
                        objN2 = new as.e0(22, kVar);
                        g0Var2.n0(objN2);
                    }
                    wr.k.b(aVar, (u00.a) objN2, rVarE, false, g0Var, 0, 8);
                } else {
                    g0Var2.V();
                }
                break;
            case 1:
                h0.w1 LiquidBottomTabs = (h0.w1) obj;
                l1.g0 g0Var3 = (l1.j) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(LiquidBottomTabs, "$this$LiquidBottomTabs");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= g0Var3.g(LiquidBottomTabs) ? 4 : 2;
                }
                l1.g0 g0Var4 = g0Var3;
                if (g0Var4.S(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    for (final int i = 0; i < 5; i++) {
                        final u00.k kVar2 = this.B;
                        boolean zG3 = g0Var4.g(kVar2) | g0Var4.e(i);
                        Object objN3 = g0Var4.N();
                        if (zG3 || objN3 == l1.i.a) {
                            final int i2 = 0;
                            objN3 = new u00.a() {
                                @Override
                                public final Object invoke() {
                                    switch (i2) {
                                        case 0:
                                            kVar2.invoke(Integer.valueOf(i));
                                            break;
                                        case 1:
                                            kVar2.invoke(Integer.valueOf(i));
                                            break;
                                        default:
                                            kVar2.invoke(Integer.valueOf(i));
                                            break;
                                    }
                                    return b0.a;
                                }
                            };
                            g0Var4.n0(objN3);
                        }
                        u00.a aVar2 = (u00.a) objN3;
                        final float f = this.C;
                        ab.a0.e(LiquidBottomTabs, aVar2, (b2.r) null, v1.d.d(-1925396822, new u00.o() {
                            @Override
                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                w PhoneLiquidBottomTab = (w) obj5;
                                g0 g0Var5 = (l1.j) obj6;
                                int iIntValue3 = ((Integer) obj7).intValue();
                                kotlin.jvm.internal.m.e(PhoneLiquidBottomTab, "$this$PhoneLiquidBottomTab");
                                g0 g0Var6 = g0Var5;
                                if (g0Var6.S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                    a0 a0Var = z1.c;
                                    b2.g gVar = b2.b.N;
                                    h0.b bVar = h0.i.a;
                                    v vVarA = u.a(new h0.f(g.e, false, new du.w(11)), gVar, g0Var5, 54);
                                    int iHashCode = Long.hashCode(g0Var6.T);
                                    m1 m1VarM = g0Var6.m();
                                    r rVarC = b2.a.c(a0Var, g0Var5);
                                    b3.i.c.getClass();
                                    b3.g gVar2 = b3.h.b;
                                    g0Var6.g0();
                                    if (g0Var6.S) {
                                        g0Var6.l(gVar2);
                                    } else {
                                        g0Var6.q0();
                                    }
                                    q.I(vVarA, g0Var5, b3.h.f);
                                    q.I(m1VarM, g0Var5, b3.h.e);
                                    q.I(Integer.valueOf(iHashCode), g0Var5, b3.h.g);
                                    q.E(g0Var5, b3.h.h);
                                    q.I(rVarC, g0Var5, b3.h.d);
                                    float f2 = g.c;
                                    o oVar = o.A;
                                    r rVarM = z1.m(oVar, f2);
                                    int i3 = i;
                                    int i4 = 2131231177;
                                    if (i3 != 0) {
                                        if (i3 == 1) {
                                            i4 = 2131231368;
                                        } else if (i3 == 2) {
                                            i4 = 2131231360;
                                        } else if (i3 == 3) {
                                            i4 = 2131231381;
                                        } else if (i3 == 4) {
                                            i4 = 2131231375;
                                        }
                                    }
                                    m2.b bVarR = y3.R(i4, g0Var5, 0);
                                    long j = dl.a.i;
                                    o3.a(bVarR, (String) null, rVarM, j, g0Var5, 440, 0);
                                    r rVarD = z1.d(h0.c.E(oVar, g.f, 0.0f, 2), 1.0f);
                                    int i5 = 2131886564;
                                    if (i3 != 0) {
                                        if (i3 == 1) {
                                            i5 = 2131887186;
                                        } else if (i3 == 2) {
                                            i5 = 2131887119;
                                        } else if (i3 == 3) {
                                            i5 = 2131887260;
                                        } else if (i3 == 4) {
                                            i5 = 2131887196;
                                        }
                                    }
                                    k00.f.a(z3.U(g0Var5, i5), rVarD, j, g.d, null, null, new x3.k(3), 0, f, null, g0Var5, 3120, 688);
                                    g0Var6.r(true);
                                } else {
                                    g0Var6.V();
                                }
                                return b0.a;
                            }
                        }, g0Var3), g0Var3, (iIntValue2 & 14) | 3072);
                    }
                } else {
                    g0Var4.V();
                }
                break;
            case 2:
                j0.b item2 = (j0.b) obj;
                l1.g0 g0Var5 = (l1.j) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(item2, "$this$item");
                l1.g0 g0Var6 = g0Var5;
                if (g0Var6.S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    b2.r rVarO = kh.o.O(b2.o.A, this.C);
                    String strU = z3.U(g0Var5, 2131886549);
                    String strU2 = z3.U(g0Var5, 2131886547);
                    String strU3 = z3.U(g0Var5, 2131887254);
                    u00.k kVar3 = this.B;
                    boolean zG4 = g0Var6.g(kVar3);
                    Object objN4 = g0Var6.N();
                    if (zG4 || objN4 == l1.i.a) {
                        objN4 = new fy.r(2, kVar3);
                        g0Var6.n0(objN4);
                    }
                    hy.a.a(strU, strU2, rVarO, strU3, (u00.a) objN4, g0Var5, 0, 0);
                } else {
                    g0Var6.V();
                }
                break;
            default:
                j0.b item3 = (j0.b) obj;
                l1.g0 g0Var7 = (l1.j) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(item3, "$this$item");
                l1.g0 g0Var8 = g0Var7;
                if (g0Var8.S(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    b2.r rVarE2 = h0.c.E(b2.o.A, this.C, 0.0f, 2);
                    u00.k kVar4 = this.B;
                    boolean zG5 = g0Var8.g(kVar4);
                    Object objN5 = g0Var8.N();
                    if (zG5 || objN5 == l1.i.a) {
                        objN5 = new gv.a0(17, kVar4);
                        g0Var8.n0(objN5);
                    }
                    rx.a.g((u00.a) objN5, false, false, rVarE2, null, g0Var7, 432, 16);
                } else {
                    g0Var8.V();
                }
                break;
        }
        return g00.b0.a;
    }
}
