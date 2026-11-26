package vn;

public final class q extends m00.c {
    public Object A;
    public final s B;
    public int C;

    public q(s sVar, m00.c cVar) {
        super(cVar);
        this.B = sVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.c(null, this);
    }
}
