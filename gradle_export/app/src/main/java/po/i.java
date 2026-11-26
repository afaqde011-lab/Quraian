package po;

import g00.b0;
import l1.q;

public final class i implements u00.n {
    public final int A;
    public final u00.a B;
    public final int C;

    public i(u00.a aVar, int i, int i2) {
        this.A = i2;
        this.B = aVar;
        this.C = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        l1.j jVar = (l1.j) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                m.b(this.B, jVar, q.K(this.C | 1));
                break;
            case 1:
                rd.a.c(this.B, jVar, q.K(this.C | 1));
                break;
            default:
                wr.k.f(this.B, jVar, q.K(this.C | 1));
                break;
        }
        return b0.a;
    }
}
