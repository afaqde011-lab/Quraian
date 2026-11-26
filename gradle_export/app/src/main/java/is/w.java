package is;

public final class w extends m00.c {
    public int A;
    public int B;
    public String C;
    public rs.c D;
    public long E;
    public long F;
    public Object G;
    public final y H;
    public int I;

    public w(y yVar, m00.c cVar) {
        super(cVar);
        this.H = yVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.h(0, null, this);
    }
}
