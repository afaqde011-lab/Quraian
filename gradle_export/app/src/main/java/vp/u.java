package vp;

public final class u extends m00.c {
    public Object A;
    public final x B;
    public int C;

    public u(x xVar, m00.c cVar) {
        super(cVar);
        this.B = xVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        Object objY = this.B.y(this);
        return objY == l00.a.A ? objY : new g00.n(objY);
    }
}
