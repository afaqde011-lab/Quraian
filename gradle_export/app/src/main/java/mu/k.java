package mu;

import g00.b0;

public final class k implements u00.n {
    public final int A = 1;
    public final b2.r B;
    public final u00.a C;
    public final boolean D;
    public final boolean E;
    public final int F;
    public final Object G;

    public k(String str, b2.r rVar, u00.a aVar, boolean z, boolean z2, int i, int i2) {
        this.G = str;
        this.B = rVar;
        this.C = aVar;
        this.D = z;
        this.E = z2;
        this.F = i2;
    }

    public k(ju.f fVar, u00.a aVar, boolean z, b2.r rVar, boolean z2, int i, int i2) {
        this.G = fVar;
        this.C = aVar;
        this.D = z;
        this.B = rVar;
        this.E = z2;
        this.F = i2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                int iK = l1.q.K(3073);
                m.a((ju.f) this.G, this.C, this.D, this.B, this.E, (l1.j) obj, iK, this.F);
                break;
            default:
                ((Integer) obj2).getClass();
                int iK2 = l1.q.K(27649);
                wr.k.D((String) this.G, this.B, this.C, this.D, this.E, (l1.j) obj, iK2, this.F);
                break;
        }
        return b0.a;
    }
}
