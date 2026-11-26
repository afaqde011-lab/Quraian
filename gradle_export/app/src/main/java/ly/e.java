package ly;

public final class e extends m00.c {
    public Object A;
    public final f B;
    public int C;

    public e(f fVar, m00.c cVar) {
        super(cVar);
        this.B = fVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.a(null, null, this);
    }
}
