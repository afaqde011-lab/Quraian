package d0;

public final class o1 extends m00.c {
    public Object A;
    public final p1 B;
    public int C;

    public o1(p1 p1Var, m00.c cVar) {
        super(cVar);
        this.B = p1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.b(null, this);
    }
}
