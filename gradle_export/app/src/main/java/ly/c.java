package ly;

public final class c extends m00.c {
    public Object A;
    public final d B;
    public int C;

    public c(d dVar, m00.c cVar) {
        super(cVar);
        this.B = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.b(null, this);
    }
}
