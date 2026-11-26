package h1;

public final class i extends m00.c {
    public Object A;
    public final fc.n B;
    public int C;

    public i(fc.n nVar, k00.c cVar) {
        super(cVar);
        this.B = nVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.c(null, null, null, this);
    }
}
