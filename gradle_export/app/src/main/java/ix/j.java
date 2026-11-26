package ix;

import g00.b0;

public final class j implements u00.n {
    public final int A;
    public final b2.r B;
    public final float C;
    public final int D;
    public final int E;

    public j(float f, b2.r rVar, int i, int i2, int i3) {
        this.A = i3;
        this.C = f;
        this.B = rVar;
        this.D = i;
        this.E = i2;
    }

    public j(b2.r rVar, float f, int i, int i2) {
        this.A = 1;
        this.B = rVar;
        this.C = f;
        this.D = i;
        this.E = i2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        l1.j jVar = (l1.j) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                k.f(this.C, l1.q.K(this.D | 1), this.E, this.B, jVar);
                break;
            case 1:
                ox.g.d(this.C, l1.q.K(this.D | 1), this.E, this.B, jVar);
                break;
            default:
                wr.k.O(this.C, l1.q.K(this.D | 1), this.E, this.B, jVar);
                break;
        }
        return b0.a;
    }
}
