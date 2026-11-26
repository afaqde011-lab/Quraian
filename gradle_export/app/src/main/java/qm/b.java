package qm;

import dl.e;
import g00.b0;
import l1.g0;
import l1.j;
import u00.n;
import v1.d;

public final class b implements n {
    public final int A;
    public final c B;

    public b(c cVar, int i) {
        this.A = i;
        this.B = cVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        j jVar = (j) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                g0 g0Var = (g0) jVar;
                if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e.a(false, d.d(1598363246, new b(this.B, 1), jVar), jVar, 48);
                } else {
                    g0Var.V();
                }
                break;
            default:
                g0 g0Var2 = (g0) jVar;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    this.B.j(jVar, 0);
                } else {
                    g0Var2.V();
                }
                break;
        }
        return b0.a;
    }
}
