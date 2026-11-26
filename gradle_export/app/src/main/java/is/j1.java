package is;

public final class j1 extends m00.c {
    public Object A;
    public int B;
    public final ca.e0 C;

    public j1(ca.e0 e0Var, k00.c cVar) {
        super(cVar);
        this.C = e0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.B |= Integer.MIN_VALUE;
        return this.C.emit((Object) null, this);
    }
}
