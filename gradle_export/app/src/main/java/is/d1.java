package is;

public final class d1 extends m00.c {
    public int A;
    public Object B;
    public final g1 C;
    public int D;

    public d1(g1 g1Var, m00.c cVar) {
        super(cVar);
        this.C = g1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.b(0, this);
    }
}
