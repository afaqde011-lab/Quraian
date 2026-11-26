package d0;

public final class f2 extends m00.c {
    public long A;
    public Object B;
    public final g2 C;
    public int D;

    public f2(g2 g2Var, m00.c cVar) {
        super(cVar);
        this.C = g2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.a0(0L, 0L, this);
    }
}
