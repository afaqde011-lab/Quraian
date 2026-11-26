package xw;

public final class b extends m00.c {
    public boolean A;
    public j40.a B;
    public int C;
    public int D;
    public long E;
    public long F;
    public Object G;
    public final d H;
    public int I;

    public b(d dVar, m00.c cVar) {
        super(cVar);
        this.H = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.b(false, this);
    }
}
