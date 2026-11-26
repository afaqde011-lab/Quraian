package mu;

import g00.b0;

public final class g implements u00.n {
    public final int A = 1;
    public final int B;
    public final long C;
    public final long D;
    public final float E;
    public final g00.e F;

    public g(int i, long j, long j2, float f, u00.a aVar, int i2) {
        this.B = i;
        this.C = j;
        this.D = j2;
        this.E = f;
        this.F = aVar;
    }

    public g(int i, u00.k kVar, long j, long j2, float f, int i2) {
        this.B = i;
        this.F = kVar;
        this.C = j;
        this.D = j2;
        this.E = f;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                int iK = l1.q.K(1);
                d.e(this.B, (u00.k) this.F, this.C, this.D, this.E, (l1.j) obj, iK);
                break;
            default:
                ((Integer) obj2).getClass();
                int iK2 = l1.q.K(1);
                d.t(this.B, this.C, this.D, this.E, (u00.a) this.F, (l1.j) obj, iK2);
                break;
        }
        return b0.a;
    }
}
