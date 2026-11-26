package dn;

import g00.b0;
import l1.q;
import u00.n;

public final class g implements n {
    public final int A;
    public final float B;
    public final b6.m C;

    public g(float f3, b6.m mVar, int i11, int i12) {
        this.A = i12;
        this.B = f3;
        this.C = mVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.A;
        l1.j jVar = (l1.j) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                kh.n.p(this.B, this.C, jVar, q.K(7));
                break;
            default:
                f50.c.e(this.B, this.C, jVar, q.K(7));
                break;
        }
        return b0.f7770a;
    }
}
