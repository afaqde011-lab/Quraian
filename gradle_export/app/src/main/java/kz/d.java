package kz;

import b2.r;
import g00.b0;
import l1.j;
import l1.q;
import u00.n;
import wr.k;

public final class d implements n {
    public final int A = 1;
    public final float B;
    public final r C;
    public final int D;

    public d(float f, r rVar, int i) {
        this.B = f;
        this.C = rVar;
        this.D = i;
    }

    public d(r rVar, float f, int i, int i2) {
        this.C = rVar;
        this.B = f;
        this.D = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        j jVar = (j) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                f.a(this.B, this.D, q.K(1), this.C, jVar);
                break;
            default:
                k.Q(this.B, q.K(this.D | 1), this.C, jVar);
                break;
        }
        return b0.a;
    }
}
