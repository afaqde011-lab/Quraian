package is;

public final class v extends m00.c {
    public int A;
    public rs.e B;
    public String C;
    public rs.b D;
    public long E;
    public long F;
    public Object G;
    public final y H;
    public int I;

    public v(y yVar, m00.c cVar) {
        super(cVar);
        this.H = yVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.g(0, null, null, this);
    }
}
