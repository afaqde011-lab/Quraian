package fy;

public final class z extends m00.c {
    public Object A;
    public final c0 B;
    public int C;

    public z(c0 c0Var, m00.c cVar) {
        super(cVar);
        this.B = c0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.m(this);
    }
}
