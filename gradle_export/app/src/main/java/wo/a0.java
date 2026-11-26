package wo;

public final class a0 extends m00.c {
    public uo.h A;
    public Object B;
    public final b0 C;
    public int D;

    public a0(b0 b0Var, m00.c cVar) {
        super(cVar);
        this.C = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.B(null, null, this);
    }
}
