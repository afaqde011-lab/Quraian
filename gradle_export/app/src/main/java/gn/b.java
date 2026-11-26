package gn;

import g00.b0;
import l1.j;
import l1.q;
import u00.n;

public final class b implements n {
    public final int A;
    public final hn.b B;
    public final float C;

    public b(hn.b bVar, float f, int i, int i2) {
        this.A = i2;
        this.B = bVar;
        this.C = f;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        j jVar = (j) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                a.b(this.B, this.C, jVar, q.K(1));
                break;
            default:
                a.d(this.B, this.C, jVar, q.K(1));
                break;
        }
        return b0.a;
    }
}
