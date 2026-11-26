package ns;

public final class g extends m00.c {
    public Object A;
    public final j B;
    public int C;

    public g(j jVar, m00.c cVar) {
        super(cVar);
        this.B = jVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        j.b(this.B, this);
        return l00.a.A;
    }
}
