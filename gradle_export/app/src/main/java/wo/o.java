package wo;

public final class o extends m00.c {
    public uo.e A;
    public Object B;
    public final b0 C;
    public int D;

    public o(b0 b0Var, m00.c cVar) {
        super(cVar);
        this.C = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.p(null, this);
    }
}
