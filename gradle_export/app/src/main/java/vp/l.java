package vp;

public final class l extends m00.c {
    public Object A;
    public final x B;
    public int C;

    public l(x xVar, m00.c cVar) {
        super(cVar);
        this.B = xVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        Object objO = this.B.o(null, this);
        return objO == l00.a.A ? objO : new g00.n(objO);
    }
}
