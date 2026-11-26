package wo;

public final class t extends m00.c {
    public ap.a A;
    public Object B;
    public final b0 C;
    public int D;

    public t(b0 b0Var, m00.c cVar) {
        super(cVar);
        this.C = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.u(null, null, null, null, null, null, this);
    }
}
