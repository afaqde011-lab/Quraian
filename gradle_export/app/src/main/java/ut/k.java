package ut;

public final class k extends m00.c {
    public Object A;
    public final p B;
    public int C;

    public k(p pVar, m00.c cVar) {
        super(cVar);
        this.B = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.i(this);
    }
}
