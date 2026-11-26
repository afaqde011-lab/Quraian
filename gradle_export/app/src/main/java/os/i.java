package os;

public final class i extends m00.c {
    public Object A;
    public final x B;
    public int C;

    public i(x xVar, k00.c cVar) {
        super(cVar);
        this.B = xVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.j(this);
    }
}
