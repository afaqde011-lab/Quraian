package ro;

import b2.r;
import g00.b0;
import l1.j;
import l1.q;
import u00.n;
import wr.g;

public final class c implements n {
    public final int A;
    public final kk.c B;
    public final u00.a C;
    public final r D;
    public final int E;

    public c(kk.c cVar, u00.a aVar, r rVar, int i, int i2) {
        this.A = i2;
        this.B = cVar;
        this.C = aVar;
        this.D = rVar;
        this.E = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        j jVar = (j) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                f.m(this.B, this.C, this.D, jVar, q.K(this.E | 1));
                break;
            default:
                g.d(this.B, this.C, this.D, jVar, q.K(this.E | 1));
                break;
        }
        return b0.a;
    }
}
