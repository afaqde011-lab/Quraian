package ov;

public final class b extends m00.c {
    public p10.a A;
    public String B;
    public Object C;
    public final g D;
    public int E;

    public b(g gVar, m00.c cVar) {
        super(cVar);
        this.D = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.b(null, null, this);
    }
}
