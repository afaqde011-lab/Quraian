package tq;

public final class f extends m00.c {
    public Object A;
    public int B;
    public final g C;

    public f(g gVar, k00.c cVar) {
        super(cVar);
        this.C = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.B |= Integer.MIN_VALUE;
        return this.C.emit(null, this);
    }
}
