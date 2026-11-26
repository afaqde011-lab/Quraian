package vp;

public final class d extends m00.c {
    public Object A;
    public final x B;
    public int C;

    public d(x xVar, m00.c cVar) {
        super(cVar);
        this.B = xVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        Object objE = this.B.e(this);
        return objE == l00.a.A ? objE : new g00.n(objE);
    }
}
