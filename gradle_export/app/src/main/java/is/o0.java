package is;

public final class o0 extends m00.c {
    public Object A;
    public final p0 B;
    public int C;

    public o0(p0 p0Var, m00.c cVar) {
        super(cVar);
        this.B = p0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.b(null, this);
    }
}
