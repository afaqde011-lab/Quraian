package ct;

import qd.s0;

public final class u implements u00.n {
    public final int A = 0;
    public final boolean B;
    public final int C;
    public final int D;
    public final Object E;

    public u(ys.f fVar, int i, boolean z, int i2) {
        this.E = fVar;
        this.C = i;
        this.B = z;
        this.D = i2;
    }

    public u(boolean z, u00.a aVar, int i, int i2) {
        this.B = z;
        this.E = aVar;
        this.C = i;
        this.D = i2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                int iK = l1.q.K(this.D | 1);
                ca.v.h((ys.f) this.E, this.C, this.B, (l1.j) obj, iK);
                break;
            default:
                ((Integer) obj2).getClass();
                int iK2 = l1.q.K(this.C | 1);
                s0.E(this.B, (u00.a) this.E, (l1.j) obj, iK2, this.D);
                break;
        }
        return g00.b0.a;
    }
}
