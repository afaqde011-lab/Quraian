package is;

public final class x0 extends m00.c {
    public ss.v A;
    public int B;
    public long C;
    public Object D;
    public final c1 E;
    public int F;

    public x0(c1 c1Var, m00.c cVar) {
        super(cVar);
        this.E = c1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.f(null, 0, 0L, this);
    }
}
