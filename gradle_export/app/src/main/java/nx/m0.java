package nx;

public final class m0 extends m00.c {
    public Object A;
    public int B;
    public final n0 C;

    public m0(n0 n0Var, k00.c cVar) {
        super(cVar);
        this.C = n0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.B |= Integer.MIN_VALUE;
        return this.C.emit(null, this);
    }
}
