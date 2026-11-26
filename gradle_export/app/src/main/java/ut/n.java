package ut;

public final class n extends m00.c {
    public Object A;
    public final p B;
    public int C;

    public n(p pVar, m00.c cVar) {
        super(cVar);
        this.B = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.l(null, 0, 0L, null, 0L, this);
    }
}
