package os;

public final class r extends m00.c {
    public j40.a A;
    public int B;
    public int C;
    public Object D;
    public final x E;
    public int F;

    public r(x xVar, m00.c cVar) {
        super(cVar);
        this.E = xVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.q(this);
    }
}
