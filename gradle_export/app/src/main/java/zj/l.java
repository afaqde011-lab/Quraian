package zj;

public final class l extends m00.c {
    public Object A;
    public final m B;
    public int C;

    public l(m mVar, m00.c cVar) {
        super(cVar);
        this.B = mVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.c(null, this);
    }
}
