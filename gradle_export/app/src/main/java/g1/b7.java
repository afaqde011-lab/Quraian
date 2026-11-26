package g1;

public final class b7 implements u00.n {
    public final int A;
    public final b8 B;
    public final a7 C;
    public final int D;

    public b7(b8 b8Var, a7 a7Var, int i10, int i11) {
        this.A = i11;
        this.B = b8Var;
        this.C = a7Var;
        this.D = i10;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.A;
        l1.j jVar = (l1.j) obj;
        ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                z7.b(this.B, this.C, jVar, l1.q.K(this.D | 1));
                break;
            case 1:
                z7.p(this.B, this.C, jVar, l1.q.K(this.D | 1));
                break;
            default:
                z7.f(this.B, this.C, jVar, l1.q.K(this.D | 1));
                break;
        }
        return g00.b0.a;
    }
}
