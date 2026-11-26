package is;

public final class b0 extends m00.c {
    public Object A;
    public int B;
    public final bt.m1 C;

    public b0(bt.m1 m1Var, k00.c cVar) {
        super(cVar);
        this.C = m1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.B |= Integer.MIN_VALUE;
        return this.C.emit(null, this);
    }
}
