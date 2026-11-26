package tm;

public final class c extends m00.c {
    public Object A;
    public int B;
    public final iv.f C;

    public c(iv.f fVar, k00.c cVar) {
        super(cVar);
        this.C = fVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.B |= Integer.MIN_VALUE;
        return this.C.emit(null, this);
    }
}
