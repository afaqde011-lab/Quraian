package q0;

public final class k0 implements u00.n {
    public final int A;
    public final b1.e0 B;
    public final boolean C;
    public final v1.c D;
    public final int E;

    public k0(b1.e0 e0Var, boolean z10, v1.c cVar, int i10, int i11) {
        this.A = i11;
        this.B = e0Var;
        this.C = z10;
        this.D = cVar;
        this.E = i10;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.A;
        l1.j jVar = (l1.j) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                q.e(this.B, this.C, this.D, jVar, l1.q.K(this.E | 1));
                break;
            default:
                q.g(this.B, this.C, this.D, jVar, l1.q.K(this.E | 1));
                break;
        }
        return g00.b0.a;
    }
}
