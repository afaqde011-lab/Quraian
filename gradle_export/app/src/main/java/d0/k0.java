package d0;

public final class k0 extends m00.c {
    public Object A;
    public final o0 B;
    public int C;

    public k0(o0 o0Var, m00.c cVar) {
        super(cVar);
        this.B = o0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return o0.E1(this.B, this);
    }
}
