package os;

public final class e extends m00.c {
    public long A;
    public int B;
    public int C;
    public int D;
    public int E;
    public Object F;
    public final x G;
    public int H;

    public e(x xVar, m00.c cVar) {
        super(cVar);
        this.G = xVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return x.a(this.G, null, this);
    }
}
