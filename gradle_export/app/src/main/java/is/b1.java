package is;

public final class b1 extends m00.c {
    public m00.i A;
    public j40.a B;
    public int C;
    public Object D;
    public final c1 E;
    public int F;

    public b1(c1 c1Var, m00.c cVar) {
        super(cVar);
        this.E = c1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.j(null, this);
    }
}
