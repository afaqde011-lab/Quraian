package bv;

public final class l1 implements u00.n {
    public final int A;
    public final o1 B;
    public final u00.k C;
    public final int D;

    public l1(o1 o1Var, u00.k kVar, int i, int i2) {
        this.A = i2;
        this.B = o1Var;
        this.C = kVar;
        this.D = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        l1.j jVar = (l1.j) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                a.a(this.B, this.C, jVar, l1.q.K(this.D | 1));
                break;
            default:
                gv.p.k(this.B, this.C, jVar, l1.q.K(this.D | 1));
                break;
        }
        return g00.b0.a;
    }
}
