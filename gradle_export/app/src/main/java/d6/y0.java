package d6;

public final class y0 extends m00.c {
    public a1 A;
    public Object B;
    public final a1 C;
    public int D;

    public y0(a1 a1Var, m00.c cVar) {
        super(cVar);
        this.C = a1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.c(this);
    }
}
