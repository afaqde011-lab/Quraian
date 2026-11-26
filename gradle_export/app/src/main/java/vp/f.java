package vp;

public final class f extends m00.c {
    public Object A;
    public final x B;
    public int C;

    public f(x xVar, m00.c cVar) {
        super(cVar);
        this.B = xVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        Object objG = this.B.g(this);
        return objG == l00.a.A ? objG : new g00.n(objG);
    }
}
