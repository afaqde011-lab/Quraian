package e1;

public final class u0 extends m00.c {
    public v0 A;
    public Object B;
    public final v0 C;
    public int D;

    public u0(v0 v0Var, m00.c cVar) {
        super(cVar);
        this.C = v0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.s(this);
    }
}
