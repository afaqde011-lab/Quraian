package zy;

import g00.b0;
import l1.g0;
import l1.p2;
import q0.f2;

public final class k implements u00.n {
    public final int A;
    public final p B;
    public final p2 C;

    public k(p pVar, p2 p2Var, int i) {
        this.A = i;
        this.B = pVar;
        this.C = p2Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                g0 g0Var = (l1.j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    float f = qz.d.a;
                    float f2 = qz.d.b;
                    p pVar = this.B;
                    boolean zG = g0Var2.g(pVar);
                    Object objN = g0Var2.N();
                    if (zG || objN == l1.i.a) {
                        objN = new f2(pVar, 27);
                        g0Var2.n0(objN);
                    }
                    qz.d.a(f, f2, (u00.a) objN, true, 0L, false, v1.d.d(354211021, new k(pVar, this.C, 1), g0Var), g0Var, 1575936, 48);
                } else {
                    g0Var2.V();
                }
                break;
            default:
                g0 g0Var3 = (l1.j) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                g0 g0Var4 = g0Var3;
                if (g0Var4.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l lVar = (l) this.C.getValue();
                    p pVar2 = this.B;
                    boolean zG2 = g0Var4.g(pVar2);
                    Object objN2 = g0Var4.N();
                    if (zG2 || objN2 == l1.i.a) {
                        z.c cVar = new z.c(1, pVar2, p.class, "action", "action(Lcom/mchutov/quranify/settings/presentation/screen/deletecode/DeleteAccountCodeAction;)V", 0, 1);
                        g0Var4.n0(cVar);
                        objN2 = cVar;
                    }
                    ze.d.a(lVar, (u00.k) ((a10.g) objN2), g0Var3, 0);
                } else {
                    g0Var4.V();
                }
                break;
        }
        return b0.a;
    }
}
