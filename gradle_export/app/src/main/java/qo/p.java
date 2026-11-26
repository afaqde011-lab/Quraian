package qo;

import g00.b0;

public final class p implements u00.n {
    public final int A;
    public final lo.k B;
    public final u00.k C;

    public p(lo.k kVar, u00.k kVar2, int i, int i2) {
        this.A = i2;
        this.B = kVar;
        this.C = kVar2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        l1.j jVar = (l1.j) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                z.g(this.B, this.C, jVar, l1.q.K(1));
                break;
            default:
                z.d(this.B, this.C, jVar, l1.q.K(1));
                break;
        }
        return b0.a;
    }
}
