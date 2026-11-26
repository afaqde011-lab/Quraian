package rb;

public final class e extends m00.c {
    public g A;
    public i B;
    public Object C;
    public final g D;
    public int E;

    public e(g gVar, m00.c cVar) {
        super(cVar);
        this.D = gVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.d(null, this);
    }
}
