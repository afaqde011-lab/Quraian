package h1;

public final class h extends m00.c {
    public Object A;
    public final fc.n B;
    public int C;

    public h(fc.n nVar, m00.c cVar) {
        super(cVar);
        this.B = nVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.d(null, null, this);
    }
}
