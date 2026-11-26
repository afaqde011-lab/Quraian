package a1;

public final class u2 extends m00.c {
    public Object A;
    public final w2 B;
    public int C;

    public u2(w2 w2Var, m00.c cVar) {
        super(cVar);
        this.B = w2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        this.B.b(null, this);
        return l00.a.A;
    }
}
