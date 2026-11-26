package is;

public final class h extends m00.c {
    public Object A;
    public final j B;
    public int C;

    public h(j jVar, m00.c cVar) {
        super(cVar);
        this.B = jVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.b(0L, this);
    }
}
