package v2;

public final class h0 extends m00.c {
    public Object A;
    public final i0 B;
    public int C;

    public h0(i0 i0Var, m00.a aVar) {
        super(aVar);
        this.B = i0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.j(0L, null, this);
    }
}
