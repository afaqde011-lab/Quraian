package wr;

import java.util.List;

public final class j implements u00.p {
    public final List A;
    public final boolean B;
    public final to.a C;
    public final u00.k D;
    public final u00.k E;
    public final u00.k F;
    public final u00.k G;

    public j(List list, boolean z, to.a aVar, u00.k kVar, u00.k kVar2, u00.k kVar3, u00.k kVar4) {
        this.A = list;
        this.B = z;
        this.C = aVar;
        this.D = kVar;
        this.E = kVar2;
        this.F = kVar3;
        this.G = kVar4;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        j0.b bVar = (j0.b) obj;
        int iIntValue = ((Number) obj2).intValue();
        l1.g0 g0Var = (l1.j) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (g0Var.g(bVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= g0Var.e(iIntValue) ? 32 : 16;
        }
        boolean z = true;
        l1.g0 g0Var2 = g0Var;
        if (g0Var2.S(i & 1, (i & 147) != 146)) {
            lo.b bVar2 = (lo.b) this.A.get(iIntValue);
            g0Var2.c0(-495847537);
            if (!this.B && !bVar2.h) {
                z = false;
            }
            b2.r rVarK = w00.a.k(b2.o.A, !z);
            u00.k kVar = this.D;
            boolean zG = g0Var2.g(kVar) | g0Var2.g(bVar2);
            Object objN = g0Var2.N();
            Object obj5 = l1.i.a;
            if (zG || objN == obj5) {
                objN = new i(kVar, bVar2, 0);
                g0Var2.n0(objN);
            }
            u00.a aVar = (u00.a) objN;
            if (!z) {
                aVar = null;
            }
            u00.k kVar2 = this.E;
            boolean zG2 = g0Var2.g(kVar2) | g0Var2.g(bVar2);
            Object objN2 = g0Var2.N();
            if (zG2 || objN2 == obj5) {
                objN2 = new i(kVar2, bVar2, 1);
                g0Var2.n0(objN2);
            }
            u00.a aVar2 = z ? (u00.a) objN2 : null;
            u00.k kVar3 = this.F;
            boolean zG3 = g0Var2.g(kVar3) | g0Var2.g(bVar2);
            Object objN3 = g0Var2.N();
            if (zG3 || objN3 == obj5) {
                objN3 = new i(kVar3, bVar2, 2);
                g0Var2.n0(objN3);
            }
            u00.a aVar3 = z ? (u00.a) objN3 : null;
            u00.k kVar4 = this.G;
            boolean zG4 = g0Var2.g(kVar4) | g0Var2.g(bVar2);
            Object objN4 = g0Var2.N();
            if (zG4 || objN4 == obj5) {
                objN4 = new i(kVar4, bVar2, 3);
                g0Var2.n0(objN4);
            }
            to.b.a(bVar2, this.C, rVarK, aVar, aVar2, aVar3, z ? (u00.a) objN4 : null, g0Var, 0, 0);
            g0Var2.r(false);
        } else {
            g0Var2.V();
        }
        return g00.b0.a;
    }
}
