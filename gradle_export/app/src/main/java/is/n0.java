package is;

public final class n0 extends m00.c {
    public fs.k A;
    public Object B;
    public final p0 C;
    public int D;

    public n0(p0 p0Var, m00.c cVar) {
        super(cVar);
        this.C = p0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.a(0, this);
    }
}
