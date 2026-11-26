package sv;

public final class i extends m00.c {
    public rv.p A;
    public int B;
    public int C;
    public Object D;
    public final th.o E;
    public int F;

    public i(th.o oVar, m00.c cVar) {
        super(cVar);
        this.E = oVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.v((String) null, this);
    }
}
