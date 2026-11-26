package is;

public final class h0 extends m00.c {
    public Object A;
    public final l0 B;
    public int C;

    public h0(l0 l0Var, m00.c cVar) {
        super(cVar);
        this.B = l0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.j(null, 0, this);
    }
}
