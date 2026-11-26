package sv;

public final class h extends m00.c {
    public Object A;
    public final th.o B;
    public int C;

    public h(th.o oVar, m00.c cVar) {
        super(cVar);
        this.B = oVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.u(this);
    }
}
