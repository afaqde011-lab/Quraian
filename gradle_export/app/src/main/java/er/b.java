package er;

public final class b extends m00.c {
    public Object A;
    public final d B;
    public int C;

    public b(d dVar, m00.c cVar) {
        super(cVar);
        this.B = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return d.b(this.B, this);
    }
}
