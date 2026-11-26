package b3;

public final class s0 extends kotlin.jvm.internal.n implements u00.a {
    public final u0 A;
    public final long B;
    public final long C;
    public final d2 D;

    public s0(u0 u0Var, long j9, long j10, d2 d2Var) {
        super(0);
        this.A = u0Var;
        this.B = j9;
        this.C = j10;
        this.D = d2Var;
    }

    public final Object invoke() {
        u0 u0Var = this.A;
        u0Var.i1().A = false;
        u0Var.i1().B = this.B;
        u0Var.i1().C = this.C;
        u00.k kVarE = this.D.A.e();
        if (kVarE != null) {
            kVarE.invoke(u0Var.i1());
        }
        return g00.b0.a;
    }
}
