package bv;

public final class z1 extends m00.c {
    public long A;
    public int B;
    public Object C;
    public final e3 D;
    public int E;

    public z1(e3 e3Var, m00.c cVar) {
        super(cVar);
        this.D = e3Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return e3.l(this.D, 0L, 0, this);
    }
}
