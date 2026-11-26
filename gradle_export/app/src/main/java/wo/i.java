package wo;

public final class i extends m00.c {
    public ep.g A;
    public Object B;
    public final b0 C;
    public int D;

    public i(b0 b0Var, m00.c cVar) {
        super(cVar);
        this.C = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.j(null, this);
    }
}
