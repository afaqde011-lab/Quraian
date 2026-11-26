package os;

public final class o extends m00.c {
    public int A;
    public boolean B;
    public Object C;
    public final x D;
    public int E;

    public o(x xVar, m00.c cVar) {
        super(cVar);
        this.D = xVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.n(0, false, this);
    }
}
