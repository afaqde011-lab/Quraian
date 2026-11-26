package ea;

public final class a0 extends m00.c {
    public boolean A;
    public i B;
    public Object C;
    public final d0 D;
    public int E;

    public a0(d0 d0Var, m00.c cVar) {
        super(cVar);
        this.D = d0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.f(false, this);
    }
}
