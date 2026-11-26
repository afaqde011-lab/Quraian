package os;

public final class u extends m00.c {
    public int A;
    public int B;
    public int C;
    public ss.j D;
    public ss.v E;
    public Object F;
    public final x G;
    public int H;

    public u(x xVar, m00.c cVar) {
        super(cVar);
        this.G = xVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.v(this);
    }
}
