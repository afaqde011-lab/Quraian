package ix;

import g00.b0;

public final class c implements u00.n {
    public final int A;
    public final u30.b B;
    public final b2.r C;
    public final int D;

    public c(u30.b bVar, b2.r rVar, int i, int i2) {
        this.A = i2;
        this.B = bVar;
        this.C = rVar;
        this.D = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        l1.j jVar = (l1.j) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                a.d(this.B, this.C, jVar, l1.q.K(this.D | 1));
                break;
            default:
                a.e(this.B, this.C, jVar, l1.q.K(this.D | 1));
                break;
        }
        return b0.a;
    }
}
