package rp;

import d40.p1;
import g00.b0;

public final class h implements u00.a {
    public final int A;
    public final hp.b B;

    public h(hp.b bVar, int i) {
        this.A = i;
        this.B = bVar;
    }

    @Override
    public final Object invoke() {
        int i = this.A;
        hp.b bVar = this.B;
        switch (i) {
            case 0:
                p1 p1Var = bVar.a;
                p1Var.getClass();
                p1Var.k(null, dp.c.a);
                break;
            case 1:
                bVar.a();
                break;
            case 2:
                p1 p1Var2 = bVar.a;
                p1Var2.getClass();
                p1Var2.k(null, dp.c.a);
                break;
            default:
                bVar.a();
                break;
        }
        return b0.a;
    }
}
