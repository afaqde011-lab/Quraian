package er;

public final class h extends m00.c {
    public j40.a A;
    public int B;
    public Object C;
    public final j D;
    public int E;

    public h(j jVar, m00.c cVar) {
        super(cVar);
        this.D = jVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.e(this);
    }
}
