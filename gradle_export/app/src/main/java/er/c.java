package er;

public final class c extends m00.c {
    public boolean A;
    public j40.a B;
    public int C;
    public Object D;
    public final d E;
    public int F;

    public c(d dVar, m00.c cVar) {
        super(cVar);
        this.E = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.f(false, this);
    }
}
