package vp;

public final class w extends m00.c {
    public Object A;
    public final x B;
    public int C;

    public w(x xVar, m00.c cVar) {
        super(cVar);
        this.B = xVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        Object objA = this.B.A(this);
        return objA == l00.a.A ? objA : new g00.n(objA);
    }
}
