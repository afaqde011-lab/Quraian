package gv;

public final class f0 implements u00.n {
    public final int A;
    public final boolean B;
    public final b2.r C;
    public final v1.c D;
    public final int E;

    public f0(boolean z, b2.r rVar, v1.c cVar, int i, int i2) {
        this.A = 0;
        this.B = z;
        this.C = rVar;
        this.D = cVar;
        this.E = i2;
    }

    public f0(boolean z, b2.r rVar, v1.c cVar, int i, int i2, byte b) {
        this.A = i2;
        this.B = z;
        this.C = rVar;
        this.D = cVar;
        this.E = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                int iK = l1.q.K(385);
                p.n(this.B, this.C, this.D, (l1.j) obj, iK, this.E);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iK2 = l1.q.K(this.E | 1);
                mu.m.c(this.B, this.C, this.D, (l1.j) obj, iK2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iK3 = l1.q.K(this.E | 1);
                mu.m.c(this.B, this.C, this.D, (l1.j) obj, iK3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iK4 = l1.q.K(this.E | 1);
                qz.f.a(this.B, this.C, this.D, (l1.j) obj, iK4);
                break;
        }
        return g00.b0.a;
    }
}
