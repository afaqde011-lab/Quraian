package rv;

public final class a extends m00.c {
    public p A;
    public int B;
    public int C;
    public Object D;
    public final i E;
    public int F;

    public a(i iVar, m00.c cVar) {
        super(cVar);
        this.E = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.c(null, this);
    }
}
