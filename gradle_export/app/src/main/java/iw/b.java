package iw;

import b2.r;
import g00.b0;
import l1.j;
import l1.q;
import u00.n;
import wr.k;

public final class b implements n {
    public final int A;
    public final dw.a B;
    public final long C;
    public final long D;
    public final r E;
    public final int F;

    public b(dw.a aVar, long j, long j2, r rVar, int i, int i2) {
        this.A = i2;
        this.B = aVar;
        this.C = j;
        this.D = j2;
        this.E = rVar;
        this.F = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                a.h(this.B, this.C, this.D, this.E, (j) obj, q.K(this.F | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                k.R(this.B, this.C, this.D, this.E, (j) obj, q.K(this.F | 1));
                break;
        }
        return b0.a;
    }
}
