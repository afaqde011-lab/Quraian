package bt;

public final class k0 implements u00.n {
    public final int A;
    public final a2 B;
    public final u00.k C;

    public k0(a2 a2Var, u00.k kVar, int i, int i2) {
        this.A = i2;
        this.B = a2Var;
        this.C = kVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        l1.j jVar = (l1.j) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                a.d(this.B, this.C, jVar, l1.q.K(1));
                break;
            case 1:
                qd.s0.I(this.B, this.C, jVar, l1.q.K(1));
                break;
            default:
                ur.g1.b(this.B, this.C, jVar, l1.q.K(1));
                break;
        }
        return g00.b0.a;
    }
}
