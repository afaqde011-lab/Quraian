package is;

public final class z0 extends m00.c {
    public int A;
    public Object B;
    public final c1 C;
    public int D;

    public z0(c1 c1Var, m00.c cVar) {
        super(cVar);
        this.C = c1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.h(0, this);
    }
}
