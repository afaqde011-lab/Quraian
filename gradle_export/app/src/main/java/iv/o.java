package iv;

import g00.b0;

public final class o implements u00.n {
    public final int A;
    public final yu.a B;
    public final m C;
    public final b2.r D;
    public final int E;
    public final int F;

    public o(yu.a aVar, m mVar, b2.r rVar, int i, int i2, int i3) {
        this.A = i3;
        this.B = aVar;
        this.C = mVar;
        this.D = rVar;
        this.E = i;
        this.F = i2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                a.h(this.B, this.C, this.D, (l1.j) obj, l1.q.K(this.E | 1), this.F);
                break;
            default:
                ((Integer) obj2).getClass();
                a.f(this.B, this.C, this.D, (l1.j) obj, l1.q.K(this.E | 1), this.F);
                break;
        }
        return b0.a;
    }
}
