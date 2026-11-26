package vp;

public final class i extends m00.c {
    public Object A;
    public final x B;
    public int C;

    public i(x xVar, m00.c cVar) {
        super(cVar);
        this.B = xVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        Object objJ = this.B.j(null, this);
        return objJ == l00.a.A ? objJ : new g00.n(objJ);
    }
}
