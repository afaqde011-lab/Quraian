package is;

public final class k0 extends m00.c {
    public String A;
    public byte[] B;
    public int C;
    public int D;
    public Object E;
    public final l0 F;
    public int G;

    public k0(l0 l0Var, m00.c cVar) {
        super(cVar);
        this.F = l0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.n(null, 0, null, null, this);
    }
}
