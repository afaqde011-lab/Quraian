package wo;

public final class s extends m00.c {
    public Object A;
    public final b0 B;
    public int C;

    public s(b0 b0Var, m00.c cVar) {
        super(cVar);
        this.B = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.t(null, null, this);
    }
}
