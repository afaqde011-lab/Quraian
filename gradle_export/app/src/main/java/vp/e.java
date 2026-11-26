package vp;

public final class e extends m00.c {
    public Object A;
    public final x B;
    public int C;

    public e(x xVar, m00.c cVar) {
        super(cVar);
        this.B = xVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        Object objF = this.B.f(this);
        return objF == l00.a.A ? objF : new g00.n(objF);
    }
}
