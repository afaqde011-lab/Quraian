package ab;

public final class k0 extends m00.c {
    public Object A;
    public final l0 B;
    public int C;

    public k0(l0 l0Var, m00.c cVar) {
        super(cVar);
        this.B = l0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return l0.a(this.B, this);
    }
}
