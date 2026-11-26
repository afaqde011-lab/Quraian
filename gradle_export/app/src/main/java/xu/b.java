package xu;

public final class b extends m00.c {
    public Object A;
    public final f B;
    public int C;

    public b(f fVar, m00.c cVar) {
        super(cVar);
        this.B = fVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.f(0L, this);
    }
}
