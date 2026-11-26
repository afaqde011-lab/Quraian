package mu;

import g00.b0;

public final class z implements u00.n {
    public final int A;
    public final ju.f B;
    public final b2.r C;

    public z(ju.f fVar, b2.r rVar, int i, int i2) {
        this.A = i2;
        this.B = fVar;
        this.C = rVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        l1.j jVar = (l1.j) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                d.w(this.B, this.C, jVar, l1.q.K(49));
                break;
            default:
                d.A(this.B, this.C, jVar, l1.q.K(49));
                break;
        }
        return b0.a;
    }
}
