package d40;

public final class o1 extends m00.c {
    public p1 A;
    public j B;
    public q1 C;
    public a40.e1 D;
    public Object E;
    public Object F;
    public final p1 G;
    public int H;

    public o1(p1 p1Var, k00.c cVar) {
        super(cVar);
        this.G = p1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        this.G.collect(null, this);
        return l00.a.A;
    }
}
