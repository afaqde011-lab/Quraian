package d6;

public final class g1 extends m00.c {
    public Object A;
    public final h1 B;
    public int C;

    public g1(h1 h1Var, m00.c cVar) {
        super(cVar);
        this.B = h1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return h1.a(this.B, null, this);
    }
}
