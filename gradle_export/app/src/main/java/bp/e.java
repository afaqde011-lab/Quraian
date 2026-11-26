package bp;

public final class e extends m00.c {
    public g A;
    public ep.e B;
    public String C;
    public String D;
    public Object E;
    public final g F;
    public int G;

    public e(g gVar, m00.c cVar) {
        super(cVar);
        this.F = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.c(null, this);
    }
}
