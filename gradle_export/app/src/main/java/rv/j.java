package rv;

public final class j extends m00.c {
    public p A;
    public int B;
    public Object C;
    public final p D;
    public int E;

    public j(p pVar, m00.c cVar) {
        super(cVar);
        this.D = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.a(null, this);
    }
}
