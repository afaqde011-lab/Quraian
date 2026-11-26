package d40;

public final class q extends m00.c {
    public Object A;
    public int B;
    public final r C;
    public Object D;
    public j E;

    public q(r rVar, k00.c cVar) {
        super(cVar);
        this.C = rVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.B |= Integer.MIN_VALUE;
        return this.C.collect(null, this);
    }
}
