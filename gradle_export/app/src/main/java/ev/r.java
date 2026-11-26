package ev;

import g1.q7;
import java.util.List;
import l1.g0;

public final class r implements u00.p {
    public final int A;
    public final List B;
    public final boolean C;
    public final Object D;
    public final Object E;

    public r(List list, t tVar, boolean z, u00.k kVar) {
        this.A = 0;
        this.B = list;
        this.E = tVar;
        this.C = z;
        this.D = kVar;
    }

    public r(List list, boolean z, Object obj, Object obj2, int i) {
        this.A = i;
        this.B = list;
        this.C = z;
        this.E = obj;
        this.D = obj2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        switch (this.A) {
            case 0:
                j0.b bVar = (j0.b) obj;
                int iIntValue = ((Number) obj2).intValue();
                g0 g0Var = (l1.j) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                u00.k kVar = (u00.k) this.D;
                t tVar = (t) this.E;
                if ((iIntValue2 & 6) == 0) {
                    i = (g0Var.g(bVar) ? 4 : 2) | iIntValue2;
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= g0Var.e(iIntValue) ? 32 : 16;
                }
                g0 g0Var2 = g0Var;
                if (g0Var2.S(i & 1, (i & 147) != 146)) {
                    bx.c cVar = (bx.c) this.B.get(iIntValue);
                    g0Var2.c0(939520758);
                    int i4 = cVar.a;
                    int i5 = tVar.e;
                    Integer numValueOf = Integer.valueOf(i5);
                    if (i5 == 0) {
                        numValueOf = null;
                    }
                    boolean z = i4 == (numValueOf != null ? numValueOf.intValue() : tVar.d);
                    boolean z2 = !tVar.g.contains(Integer.valueOf(cVar.a));
                    boolean zG = g0Var2.g(kVar) | g0Var2.i(cVar);
                    Object objN = g0Var2.N();
                    if (zG || objN == l1.i.a) {
                        objN = new q(kVar, cVar, 0);
                        g0Var2.n0(objN);
                    }
                    fv.c.b(cVar, z, z2, this.C, (u00.a) objN, null, g0Var, 8);
                    g0Var2.r(false);
                } else {
                    g0Var2.V();
                }
                break;
            case 1:
                j0.b bVar2 = (j0.b) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                g0 g0Var3 = (l1.j) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                u00.k kVar2 = (u00.k) this.D;
                if ((iIntValue4 & 6) == 0) {
                    i2 = (g0Var3.g(bVar2) ? 4 : 2) | iIntValue4;
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= g0Var3.e(iIntValue3) ? 32 : 16;
                }
                g0 g0Var4 = g0Var3;
                if (g0Var4.S(i2 & 1, (i2 & 147) != 146)) {
                    lo.l lVar = (lo.l) this.B.get(iIntValue3);
                    g0Var4.c0(-868952170);
                    boolean z3 = this.C;
                    b2.r rVarE = b2.o.A;
                    if (z3) {
                        rVarE = h0.c.E(rVarE, 8, 0.0f, 2);
                    }
                    int i6 = lVar.a;
                    Integer num = ((qo.t) this.E).d;
                    boolean z4 = num != null && i6 == num.intValue();
                    boolean zG2 = g0Var4.g(kVar2) | g0Var4.g(lVar);
                    Object objN2 = g0Var4.N();
                    Object obj5 = l1.i.a;
                    if (zG2 || objN2 == obj5) {
                        objN2 = new po.c(kVar2, lVar, 2);
                        g0Var4.n0(objN2);
                    }
                    u00.a aVar = (u00.a) objN2;
                    boolean zG3 = g0Var4.g(kVar2) | g0Var4.g(lVar);
                    Object objN3 = g0Var4.N();
                    if (zG3 || objN3 == obj5) {
                        objN3 = new po.c(kVar2, lVar, 3);
                        g0Var4.n0(objN3);
                    }
                    u00.a aVar2 = (u00.a) objN3;
                    boolean zG4 = g0Var4.g(kVar2) | g0Var4.g(lVar);
                    Object objN4 = g0Var4.N();
                    if (zG4 || objN4 == obj5) {
                        objN4 = new po.c(kVar2, lVar, 4);
                        g0Var4.n0(objN4);
                    }
                    u00.a aVar3 = (u00.a) objN4;
                    boolean zG5 = g0Var4.g(kVar2) | g0Var4.g(lVar);
                    Object objN5 = g0Var4.N();
                    if (zG5 || objN5 == obj5) {
                        objN5 = new po.c(kVar2, lVar, 5);
                        g0Var4.n0(objN5);
                    }
                    ro.f.i(lVar, aVar, rVarE, aVar2, aVar3, this.C, null, z4, (u00.a) objN5, g0Var3, 0, 64);
                    g0Var4.r(false);
                } else {
                    g0Var4.V();
                }
                break;
            default:
                k0.k kVar3 = (k0.k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                g0 g0Var5 = (l1.j) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = (g0Var5.g(kVar3) ? 4 : 2) | iIntValue6;
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= g0Var5.e(iIntValue5) ? 32 : 16;
                }
                g0 g0Var6 = g0Var5;
                if (g0Var6.S(i3 & 1, (i3 & 147) != 146)) {
                    bx.c cVar2 = (bx.c) this.B.get(iIntValue5);
                    g0Var6.c0(2072179882);
                    u00.a aVar4 = (u00.a) this.E;
                    gm.a aVar5 = (gm.a) this.D;
                    boolean z5 = this.C;
                    ta.c0.g(3072, (b2.r) null, g0Var5, aVar4, v1.d.d(738399410, new q7(z5, cVar2, aVar5), g0Var5), z5);
                    g0Var6.r(false);
                } else {
                    g0Var6.V();
                }
                break;
        }
        return g00.b0.a;
    }
}
