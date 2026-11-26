package os;

public final class q extends m00.c {
    public Object A;
    public final x B;
    public int C;

    public q(x xVar, m00.c cVar) {
        super(cVar);
        this.B = xVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.p(this);
    }
}
