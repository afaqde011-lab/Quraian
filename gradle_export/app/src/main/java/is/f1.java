package is;

public final class f1 extends m00.c {
    public Object A;
    public final g1 B;
    public int C;

    public f1(g1 g1Var, m00.c cVar) {
        super(cVar);
        this.B = g1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.c(0, this);
    }
}
