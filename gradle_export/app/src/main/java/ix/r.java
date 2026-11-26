package ix;

import g00.b0;
import java.util.List;
import l1.g0;

public final class r implements u00.p {
    public final int A = 1;
    public final List B;
    public final u00.k C;
    public final boolean D;
    public final u30.b E;

    public r(List list, u00.k kVar, boolean z, u30.b bVar) {
        this.B = list;
        this.C = kVar;
        this.D = z;
        this.E = bVar;
    }

    public r(List list, u30.b bVar, u00.k kVar, boolean z) {
        this.B = list;
        this.E = bVar;
        this.C = kVar;
        this.D = z;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        switch (this.A) {
            case 0:
                j0.b bVar = (j0.b) obj;
                int iIntValue = ((Number) obj2).intValue();
                g0 g0Var = (l1.j) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
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
                    g0Var2.c0(2124539116);
                    boolean z = cVar.f;
                    u30.b bVarE = ze.d.E(this.E);
                    u00.k kVar = this.C;
                    boolean zG = g0Var2.g(kVar) | g0Var2.i(cVar);
                    Object objN = g0Var2.N();
                    if (zG || objN == l1.i.a) {
                        objN = new ev.q(kVar, cVar, 2);
                        g0Var2.n0(objN);
                    }
                    f50.k.d(cVar, (u00.a) objN, this.D, z, bVarE, null, null, g0Var, 8, 96);
                    g0Var2.r(false);
                } else {
                    g0Var2.V();
                }
                break;
            default:
                j0.b bVar2 = (j0.b) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                g0 g0Var3 = (l1.j) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
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
                    bx.c cVar2 = (bx.c) this.B.get(iIntValue3);
                    g0Var4.c0(-607595029);
                    u00.k kVar2 = this.C;
                    boolean zG2 = g0Var4.g(kVar2) | g0Var4.i(cVar2);
                    Object objN2 = g0Var4.N();
                    if (zG2 || objN2 == l1.i.a) {
                        objN2 = new ev.q(kVar2, cVar2, 4);
                        g0Var4.n0(objN2);
                    }
                    f50.k.d(cVar2, (u00.a) objN2, this.D, cVar2.f, this.E, null, null, g0Var3, 8, 96);
                    g0Var4.r(false);
                } else {
                    g0Var4.V();
                }
                break;
        }
        return b0.a;
    }
}
