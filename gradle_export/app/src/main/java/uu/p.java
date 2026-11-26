package uu;

public final class p extends m00.c {
    public boolean A;
    public j40.a B;
    public int C;
    public int D;
    public Object E;
    public final w F;
    public int G;

    public p(w wVar, m00.c cVar) {
        super(cVar);
        this.F = wVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.u(false, this);
    }
}
