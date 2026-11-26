package eu;

public final class j implements u00.n {
    public final int A;
    public final boolean B;
    public final b2.r C;
    public final int D;

    public j(boolean z11, b2.r rVar, int i11, int i12) {
        this.A = i12;
        this.B = z11;
        this.C = rVar;
        this.D = i11;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.A;
        l1.j jVar = (l1.j) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                a.g(l1.q.K(this.D | 1), this.C, jVar, this.B);
                break;
            default:
                bi.b.f(l1.q.K(this.D | 1), this.C, jVar, this.B);
                break;
        }
        return g00.b0.f7770a;
    }
}
