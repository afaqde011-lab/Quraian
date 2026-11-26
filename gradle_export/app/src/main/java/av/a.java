package av;

import g00.b0;
import l1.g0;

public final class a implements u00.n {
    public final int A;
    public final i B;

    public a(i iVar, int i) {
        this.A = 2;
        this.B = iVar;
    }

    public a(i iVar, int i, byte b) {
        this.A = i;
        this.B = iVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        l1.j jVar = (l1.j) obj;
        Integer num = (Integer) obj2;
        switch (this.A) {
            case 0:
                int iIntValue = num.intValue();
                g0 g0Var = (g0) jVar;
                if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dl.e.a(false, v1.d.d(1986507460, new a(this.B, 1, (byte) 0), jVar), jVar, 48);
                } else {
                    g0Var.V();
                }
                break;
            case 1:
                int iIntValue2 = num.intValue();
                g0 g0Var2 = (g0) jVar;
                if (g0Var2.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    this.B.j(jVar, 0);
                } else {
                    g0Var2.V();
                }
                break;
            default:
                num.getClass();
                this.B.j(jVar, l1.q.K(1));
                break;
        }
        return b0.a;
    }
}
