package bv;

public final class w1 extends m00.c {
    public Object A;
    public final e3 B;
    public int C;

    public w1(e3 e3Var, m00.c cVar) {
        super(cVar);
        this.B = e3Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.w(this);
    }
}
