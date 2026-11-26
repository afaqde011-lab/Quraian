package hx;

public final class z extends m00.c {
    public boolean A;
    public boolean B;
    public Throwable C;
    public Object D;
    public final e0 E;
    public int F;

    public z(e0 e0Var, m00.c cVar) {
        super(cVar);
        this.E = e0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return e0.j(this.E, false, this);
    }
}
