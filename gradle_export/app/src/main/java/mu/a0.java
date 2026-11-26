package mu;

import g00.b0;

public final class a0 implements u00.n {
    public final int A;
    public final ju.f B;
    public final float C;
    public final float D;

    public a0(ju.f fVar, float f, float f2, int i, int i2) {
        this.A = i2;
        this.B = fVar;
        this.C = f;
        this.D = f2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        l1.j jVar = (l1.j) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                d.b(this.B, this.C, this.D, jVar, l1.q.K(1));
                break;
            default:
                d.c(this.B, this.C, this.D, jVar, l1.q.K(1));
                break;
        }
        return b0.a;
    }
}
