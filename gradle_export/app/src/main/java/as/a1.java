package as;

public final class a1 extends m00.c {
    public Object A;
    public final b1 B;
    public int C;

    public a1(b1 b1Var, m00.c cVar) {
        super(cVar);
        this.B = b1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return b1.k(this.B, this);
    }
}
