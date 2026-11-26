package vp;

public final class g extends m00.c {
    public Object A;
    public final x B;
    public int C;

    public g(x xVar, m00.c cVar) {
        super(cVar);
        this.B = xVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        Object objH = this.B.h(this);
        return objH == l00.a.A ? objH : new g00.n(objH);
    }
}
