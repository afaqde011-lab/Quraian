package sv;

public final class q extends m00.c {
    public String A;
    public int B;
    public Object C;
    public final p10.a D;
    public int E;

    public q(p10.a aVar, m00.c cVar) {
        super(cVar);
        this.D = aVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.i(null, this);
    }
}
