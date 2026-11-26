package d0;

public final class s1 extends m00.c {
    public Object A;
    public final t1 B;
    public int C;

    public s1(t1 t1Var, m00.c cVar) {
        super(cVar);
        this.B = t1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.f(this);
    }
}
