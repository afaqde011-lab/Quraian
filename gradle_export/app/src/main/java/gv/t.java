package gv;

public final class t implements u00.n {
    public final int A;
    public final bv.o1 B;
    public final u00.k C;
    public final b2.r D;

    public t(bv.o1 o1Var, u00.k kVar, b2.r rVar, int i, int i2) {
        this.A = i2;
        this.B = o1Var;
        this.C = kVar;
        this.D = rVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        l1.j jVar = (l1.j) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                p.h(this.B, this.C, this.D, jVar, l1.q.K(1));
                break;
            default:
                jv.a.b(this.B, this.C, this.D, jVar, l1.q.K(385));
                break;
        }
        return g00.b0.a;
    }
}
