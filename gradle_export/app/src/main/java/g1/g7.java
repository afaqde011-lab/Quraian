package g1;

public final class g7 implements u00.n {
    public final int A;
    public final b2.r B;
    public final a7 C;
    public final b8 D;
    public final int E;

    public g7(b2.r rVar, a7 a7Var, b8 b8Var, int i10) {
        this.A = 1;
        this.B = rVar;
        this.C = a7Var;
        this.D = b8Var;
        this.E = i10;
    }

    public g7(b2.r rVar, b8 b8Var, a7 a7Var, int i10, int i11) {
        this.A = i11;
        this.B = rVar;
        this.D = b8Var;
        this.C = a7Var;
        this.E = i10;
    }

    public g7(b8 b8Var, b2.r rVar, a7 a7Var, int i10, int i11) {
        this.A = 0;
        this.D = b8Var;
        this.B = rVar;
        this.C = a7Var;
        this.E = i10;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                int iK = l1.q.K(1);
                z7.l(this.D, this.B, this.C, this.E, (l1.j) obj, iK);
                break;
            case 1:
                ((Integer) obj2).intValue();
                z7.k(l1.q.K(this.E | 1), this.B, this.C, this.D, (l1.j) obj);
                break;
            case 2:
                ((Integer) obj2).intValue();
                z7.q(l1.q.K(this.E | 1), this.B, this.C, this.D, (l1.j) obj);
                break;
            default:
                ((Integer) obj2).intValue();
                z7.g(l1.q.K(this.E | 1), this.B, this.C, this.D, (l1.j) obj);
                break;
        }
        return g00.b0.a;
    }
}
