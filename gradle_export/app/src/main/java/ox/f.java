package ox;

import g00.b0;
import l1.j;
import l1.q;
import u00.n;
import wr.k;

public final class f implements n {
    public final int A;
    public final float B;

    public f(float f, int i, int i2) {
        this.A = i2;
        this.B = f;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        j jVar = (j) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                g.e(this.B, jVar, q.K(1));
                break;
            case 1:
                ro.f.k(this.B, jVar, q.K(7));
                break;
            case 2:
                k.n(this.B, jVar, q.K(1));
                break;
            default:
                k.C(this.B, jVar, q.K(1));
                break;
        }
        return b0.a;
    }
}
