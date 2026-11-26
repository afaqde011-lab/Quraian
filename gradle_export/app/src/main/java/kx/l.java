package kx;

import g00.b0;
import jx.s;
import l1.q;

public final class l implements u00.n {
    public final int A;
    public final s B;
    public final u00.k C;
    public final kk.c D;
    public final int E;

    public l(s sVar, kk.c cVar, u00.k kVar, int i) {
        this.A = 2;
        this.B = sVar;
        this.D = cVar;
        this.C = kVar;
        this.E = i;
    }

    public l(s sVar, u00.k kVar, kk.c cVar, int i, int i2) {
        this.A = i2;
        this.B = sVar;
        this.C = kVar;
        this.D = cVar;
        this.E = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        l1.j jVar = (l1.j) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                a.g(q.K(this.E | 1), this.B, this.D, jVar, this.C);
                break;
            case 1:
                a.k(q.K(this.E | 1), this.B, this.D, jVar, this.C);
                break;
            default:
                a.p(q.K(this.E | 1), this.B, this.D, jVar, this.C);
                break;
        }
        return b0.a;
    }
}
