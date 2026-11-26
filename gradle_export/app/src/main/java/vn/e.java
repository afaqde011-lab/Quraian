package vn;

public final class e extends m00.c {
    public String A;
    public j40.a B;
    public boolean C;
    public int D;
    public Object E;
    public final f F;
    public int G;

    public e(f fVar, m00.c cVar) {
        super(cVar);
        this.F = fVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        Object objG = this.F.g(null, this, false);
        return objG == l00.a.A ? objG : new g00.n(objG);
    }
}
