package ut;

public final class f extends m00.c {
    public Object A;
    public int B;
    public final no.b C;

    public f(no.b bVar, k00.c cVar) {
        super(cVar);
        this.C = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.B |= Integer.MIN_VALUE;
        return this.C.emit(null, this);
    }
}
