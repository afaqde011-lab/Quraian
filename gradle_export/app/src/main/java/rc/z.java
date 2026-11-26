package rc;

public final class z extends m00.c {
    public Object A;
    public final a0 B;
    public int C;

    public z(a0 a0Var, m00.c cVar) {
        super(cVar);
        this.B = a0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.j1(0L, this);
    }
}
