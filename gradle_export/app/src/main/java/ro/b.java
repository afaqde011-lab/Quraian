package ro;

import g00.b0;
import l1.j;
import l1.q;
import lo.k;
import u00.n;

public final class b implements n {
    public final int A;
    public final k B;
    public final u00.a C;
    public final int D;

    public b(k kVar, u00.a aVar, int i, int i2) {
        this.A = i2;
        this.B = kVar;
        this.C = aVar;
        this.D = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        j jVar = (j) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                f.b(this.B, this.C, jVar, q.K(this.D | 1));
                break;
            default:
                f.d(this.B, this.C, jVar, q.K(this.D | 1));
                break;
        }
        return b0.a;
    }
}
