package rv;

public final class g extends m00.c {
    public Object A;
    public final i B;
    public int C;

    public g(i iVar, m00.c cVar) {
        super(cVar);
        this.B = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.i(this);
    }
}
