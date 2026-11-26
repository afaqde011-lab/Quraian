package is;

public final class s0 extends m00.c {
    public j40.a A;
    public int B;
    public Object C;
    public final c1 D;
    public int E;

    public s0(c1 c1Var, m00.c cVar) {
        super(cVar);
        this.D = c1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.b(this);
    }
}
