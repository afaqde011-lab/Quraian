package os;

public final class p extends m00.c {
    public boolean A;
    public int B;
    public Object C;
    public final x D;
    public int E;

    public p(x xVar, m00.c cVar) {
        super(cVar);
        this.D = xVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.o(false, this);
    }
}
