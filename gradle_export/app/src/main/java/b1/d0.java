package b1;

public final class d0 extends m00.c {
    public Object A;
    public final e0 B;
    public int C;

    public d0(e0 e0Var, m00.c cVar) {
        super(cVar);
        this.B = e0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.y(this);
    }
}
