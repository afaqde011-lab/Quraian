package vp;

public final class h extends m00.c {
    public Object A;
    public final x B;
    public int C;

    public h(x xVar, m00.c cVar) {
        super(cVar);
        this.B = xVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        Object objI = this.B.i(null, this);
        return objI == l00.a.A ? objI : new g00.n(objI);
    }
}
