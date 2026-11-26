package m0;

public final class a0 extends m00.c {
    public Object A;
    public final b0 B;
    public int C;

    public a0(b0 b0Var, m00.c cVar) {
        super(cVar);
        this.B = b0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.a(null, 0.0f, this);
    }
}
