package rc;

public final class w extends m00.c {
    public a0 A;
    public gd.a B;
    public long C;
    public Object D;
    public final a0 E;
    public int F;

    public w(a0 a0Var, m00.c cVar) {
        super(cVar);
        this.E = a0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.f1(null, this);
    }
}
