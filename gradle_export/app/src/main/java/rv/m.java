package rv;

public final class m extends m00.c {
    public j40.a A;
    public int B;
    public int C;
    public Object D;
    public final p E;
    public int F;

    public m(p pVar, m00.c cVar) {
        super(cVar);
        this.E = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.f(this);
    }
}
