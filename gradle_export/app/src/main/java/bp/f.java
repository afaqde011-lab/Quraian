package bp;

public final class f extends m00.c {
    public ep.e A;
    public String B;
    public String C;
    public String D;
    public Object E;
    public final g F;
    public int G;

    public f(g gVar, m00.c cVar) {
        super(cVar);
        this.F = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.b(null, this);
    }
}
