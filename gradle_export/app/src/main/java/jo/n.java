package jo;

public final class n extends m00.c {
    public boolean A;
    public String B;
    public Object C;
    public Object D;
    public o E;
    public Object F;
    public final o G;
    public int H;

    public n(o oVar, m00.c cVar) {
        super(cVar);
        this.G = oVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        Object objA = this.G.a(false, this);
        return objA == l00.a.A ? objA : new g00.n(objA);
    }
}
