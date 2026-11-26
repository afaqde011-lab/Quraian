package ea;

public final class o extends m00.c {
    public String A;
    public u00.k B;
    public Object C;
    public final r D;
    public int E;

    public o(r rVar, m00.c cVar) {
        super(cVar);
        this.D = rVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.c(null, null, this);
    }
}
