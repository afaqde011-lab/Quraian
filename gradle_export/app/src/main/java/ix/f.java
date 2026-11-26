package ix;

import g00.b0;

public final class f implements u00.n {
    public final int A;
    public final boolean B;
    public final b2.r C;

    public f(b2.r rVar, boolean z, int i) {
        this.A = 3;
        this.C = rVar;
        this.B = z;
    }

    public f(boolean z, b2.r rVar, int i, int i2) {
        this.A = i2;
        this.B = z;
        this.C = rVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        l1.j jVar = (l1.j) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                k.b(l1.q.K(1), this.C, jVar, this.B);
                break;
            case 1:
                k.d(l1.q.K(1), this.C, jVar, this.B);
                break;
            case 2:
                iz.j.a(l1.q.K(391), this.C, jVar, this.B);
                break;
            default:
                wr.k.t(l1.q.K(1), this.C, jVar, this.B);
                break;
        }
        return b0.a;
    }
}
