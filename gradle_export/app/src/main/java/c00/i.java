package c00;

import g00.b0;

public final class i implements u00.n {
    public final int A;
    public final t B;
    public final u00.k C;
    public final int D;

    public i(t tVar, u00.k kVar, int i, int i2) {
        this.A = i2;
        this.B = tVar;
        this.C = kVar;
        this.D = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        l1.j jVar = (l1.j) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                a.h(this.B, this.C, jVar, l1.q.K(this.D | 1));
                break;
            default:
                a.a(this.B, this.C, jVar, l1.q.K(this.D | 1));
                break;
        }
        return b0.a;
    }
}
