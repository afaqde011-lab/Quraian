package xv;

public final class b extends m00.c {
    public long A;
    public long B;
    public String C;
    public String D;
    public Object E;
    public final c F;
    public int G;

    public b(c cVar, m00.c cVar2) {
        super(cVar2);
        this.F = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.d(this);
    }
}
