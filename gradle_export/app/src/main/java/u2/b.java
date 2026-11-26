package u2;

public final class b extends m00.c {
    public Object A;
    public final d B;
    public int C;

    public b(d dVar, m00.c cVar) {
        super(cVar);
        this.B = dVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.a(0L, 0L, this);
    }
}
