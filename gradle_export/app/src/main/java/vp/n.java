package vp;

public final class n extends m00.c {
    public Object A;
    public final x B;
    public int C;

    public n(x xVar, m00.c cVar) {
        super(cVar);
        this.B = xVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        Object objQ = this.B.q(this);
        return objQ == l00.a.A ? objQ : new g00.n(objQ);
    }
}
