package bp;

public final class d extends m00.c {
    public Object A;
    public final g B;
    public int C;

    public d(g gVar, m00.c cVar) {
        super(cVar);
        this.B = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.a(null, null, null, null, null, this);
    }
}
