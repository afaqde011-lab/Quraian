package dz;

import as.d0;
import g00.b0;
import l1.g0;

public final class i implements u00.o {
    public final int A;
    public final n B;
    public final u00.k C;
    public final b2.r D;

    public i(n nVar, u00.k kVar, b2.r rVar, int i) {
        this.A = i;
        this.B = nVar;
        this.C = kVar;
        this.D = rVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.A;
        j0.b item = (j0.b) obj;
        g0 g0Var = (l1.j) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                kotlin.jvm.internal.m.e(item, "$this$item");
                g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    u30.b bVar = this.B.c;
                    u00.k kVar = this.C;
                    boolean zG = g0Var2.g(kVar);
                    Object objN = g0Var2.N();
                    if (zG || objN == l1.i.a) {
                        objN = new d0(11, kVar);
                        g0Var2.n0(objN);
                    }
                    bi.b.a(bVar, (u00.k) objN, this.D, g0Var, 0);
                } else {
                    g0Var2.V();
                }
                break;
            case 1:
                kotlin.jvm.internal.m.e(item, "$this$item");
                g0 g0Var3 = g0Var;
                if (g0Var3.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    u30.b bVar2 = this.B.a;
                    u00.k kVar2 = this.C;
                    boolean zG2 = g0Var3.g(kVar2);
                    Object objN2 = g0Var3.N();
                    if (zG2 || objN2 == l1.i.a) {
                        objN2 = new d0(13, kVar2);
                        g0Var3.n0(objN2);
                    }
                    w50.c.i(bVar2, (u00.k) objN2, this.D, g0Var, 0);
                } else {
                    g0Var3.V();
                }
                break;
            default:
                kotlin.jvm.internal.m.e(item, "$this$item");
                g0 g0Var4 = g0Var;
                if (g0Var4.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    u30.b bVar3 = this.B.b;
                    u00.k kVar3 = this.C;
                    boolean zG3 = g0Var4.g(kVar3);
                    Object objN3 = g0Var4.N();
                    if (zG3 || objN3 == l1.i.a) {
                        objN3 = new d0(12, kVar3);
                        g0Var4.n0(objN3);
                    }
                    kh.n.d(bVar3, (u00.k) objN3, this.D, g0Var, 0);
                } else {
                    g0Var4.V();
                }
                break;
        }
        return b0.a;
    }
}
