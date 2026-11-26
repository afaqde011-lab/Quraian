package xv;

public final class a extends m00.c {
    public boolean A;
    public j40.a B;
    public int C;
    public int D;
    public Object E;
    public final c F;
    public int G;

    public a(c cVar, m00.c cVar2) {
        super(cVar2);
        this.F = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.a(false, this);
    }
}
