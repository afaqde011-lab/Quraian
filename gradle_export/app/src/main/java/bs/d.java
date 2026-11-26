package bs;

import b2.r;
import g00.b0;
import l1.q;
import u00.n;

public final class d implements n {
    public final int A;
    public final dw.a B;
    public final r C;

    public d(dw.a aVar, r rVar, int i, int i2) {
        this.A = i2;
        this.B = aVar;
        this.C = rVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        l1.j jVar = (l1.j) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                a.e(this.B, this.C, jVar, q.K(9));
                break;
            default:
                a.h(this.B, this.C, jVar, q.K(9));
                break;
        }
        return b0.a;
    }
}
