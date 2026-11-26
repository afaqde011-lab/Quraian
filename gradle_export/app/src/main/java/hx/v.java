package hx;

public final class v implements u00.n {
    public final int A;
    public final x B;
    public final u00.k C;

    public v(x xVar, u00.k kVar, int i, int i2) {
        this.A = i2;
        this.B = xVar;
        this.C = kVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        l1.j jVar = (l1.j) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                p30.f.Q(this.B, this.C, jVar, l1.q.K(1));
                break;
            default:
                ix.o.a(this.B, this.C, jVar, l1.q.K(1));
                break;
        }
        return g00.b0.a;
    }
}
