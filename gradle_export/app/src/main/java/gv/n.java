package gv;

public final class n implements u00.n {
    public final int A = 1;
    public final boolean B;
    public final boolean C;
    public final Object D;
    public final Object E;

    public n(lo.v vVar, boolean z, boolean z2, u00.a aVar, int i) {
        this.D = vVar;
        this.B = z;
        this.C = z2;
        this.E = aVar;
    }

    public n(zz.a aVar, boolean z, b2.r rVar, boolean z2, int i) {
        this.D = aVar;
        this.B = z;
        this.E = rVar;
        this.C = z2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                int iK = l1.q.K(1);
                p.f((zz.a) this.D, this.B, (b2.r) this.E, this.C, (l1.j) obj, iK);
                break;
            default:
                ((Integer) obj2).getClass();
                int iK2 = l1.q.K(3073);
                po.m.c((lo.v) this.D, this.B, this.C, (u00.a) this.E, (l1.j) obj, iK2);
                break;
        }
        return g00.b0.a;
    }
}
