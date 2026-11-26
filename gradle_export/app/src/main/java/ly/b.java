package ly;

public final class b extends m00.c {
    public String A;
    public my.a B;
    public Object C;
    public final d D;
    public int E;

    public b(d dVar, m00.c cVar) {
        super(cVar);
        this.D = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.a(null, this);
    }
}
