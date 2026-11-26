package cq;

import g00.b0;
import l1.g0;
import l1.q;
import u00.n;

public final class k implements n {
    public final int A;
    public final p9.e B;

    public k(p9.e eVar, int i) {
        this.A = 1;
        this.B = eVar;
    }

    public k(p9.e eVar, int i, byte b) {
        this.A = i;
        this.B = eVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        g0 g0Var = (l1.j) obj;
        Integer num = (Integer) obj2;
        switch (this.A) {
            case 0:
                int iIntValue = num.intValue();
                g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    this.B.a(g0Var, 0);
                } else {
                    g0Var2.V();
                }
                break;
            case 1:
                num.getClass();
                this.B.a(g0Var, q.K(1));
                break;
            case 2:
                int iIntValue2 = num.intValue();
                g0 g0Var3 = g0Var;
                if (g0Var3.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    this.B.a(g0Var, 0);
                } else {
                    g0Var3.V();
                }
                break;
            case 3:
                int iIntValue3 = num.intValue();
                g0 g0Var4 = g0Var;
                if (g0Var4.S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    this.B.a(g0Var, 0);
                } else {
                    g0Var4.V();
                }
                break;
            case 4:
                int iIntValue4 = num.intValue();
                g0 g0Var5 = g0Var;
                if (g0Var5.S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    this.B.a(g0Var, 0);
                } else {
                    g0Var5.V();
                }
                break;
            default:
                int iIntValue5 = num.intValue();
                g0 g0Var6 = g0Var;
                if (g0Var6.S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    this.B.a(g0Var, 0);
                } else {
                    g0Var6.V();
                }
                break;
        }
        return b0.a;
    }
}
