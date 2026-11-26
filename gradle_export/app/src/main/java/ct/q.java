package ct;

public final class q implements u00.n {
    public final int A = 0;
    public final boolean B;
    public final u00.a C;
    public final b2.r D;

    public q(u00.a aVar, boolean z, b2.r rVar, int i) {
        this.C = aVar;
        this.B = z;
        this.D = rVar;
    }

    public q(boolean z, u00.a aVar, b2.r rVar, int i) {
        this.B = z;
        this.C = aVar;
        this.D = rVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        l1.j jVar = (l1.j) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                bi.b.d(l1.q.K(1), this.D, jVar, this.C, this.B);
                break;
            default:
                yr.a.e(l1.q.K(385), this.D, jVar, this.C, this.B);
                break;
        }
        return g00.b0.a;
    }
}
