package rv;

public final class k extends m00.c {
    public int A;
    public bx.c B;
    public Object C;
    public Object D;
    public final p E;
    public int F;

    public k(p pVar, m00.c cVar) {
        super(cVar);
        this.E = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.c(0, this);
    }
}
