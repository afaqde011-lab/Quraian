package lp;

import g00.b0;
import jp.x;
import l1.q;
import u00.n;

public final class b implements n {
    public final int A;
    public final x B;
    public final u00.k C;
    public final int D;

    public b(x xVar, u00.k kVar, int i, int i2) {
        this.A = i2;
        this.B = xVar;
        this.C = kVar;
        this.D = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        l1.j jVar = (l1.j) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                f.a(this.B, this.C, jVar, q.K(this.D | 1));
                break;
            case 1:
                f50.c.c(this.B, this.C, jVar, q.K(this.D | 1));
                break;
            default:
                l.a(this.B, this.C, jVar, q.K(this.D | 1));
                break;
        }
        return b0.a;
    }
}
