package m6;

public final class d extends m00.c {
    public Object A;
    public final f B;
    public int C;

    public d(f fVar, m00.c cVar) {
        super(cVar);
        this.B = fVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.c(null, null, null, this);
    }
}
