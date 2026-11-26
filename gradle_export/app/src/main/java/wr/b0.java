package wr;

import java.util.List;

public final class b0 implements u00.p {
    public final List A;
    public final float B;
    public final u00.k C;

    public b0(List list, float f, u00.k kVar) {
        this.A = list;
        this.B = f;
        this.C = kVar;
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
        l1.g0 g0Var2 = g0Var;
        if (g0Var2.S(i & 1, (i & 147) != 146)) {
            dw.a aVar = (dw.a) this.A.get(iIntValue);
            g0Var2.c0(498072108);
            b2.r rVarA = j0.b.a(bVar);
            u00.k kVar = this.C;
            boolean zG = g0Var2.g(kVar) | g0Var2.i(aVar);
            Object objN = g0Var2.N();
            if (zG || objN == l1.i.a) {
                objN = new iw.d(kVar, aVar, 1);
                g0Var2.n0(objN);
            }
            k.x(aVar, this.B, (u00.a) objN, rVarA, g0Var, 8);
            g0Var2.r(false);
        } else {
            g0Var2.V();
        }
        return g00.b0.a;
    }
}
