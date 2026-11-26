package is;

public final class i0 extends m00.c {
    public ss.j A;
    public Object B;
    public final l0 C;
    public int D;

    public i0(l0 l0Var, m00.c cVar) {
        super(cVar);
        this.C = l0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.l(this);
    }
}
