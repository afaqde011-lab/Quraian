package vp;

public final class v extends m00.c {
    public Object A;
    public final x B;
    public int C;

    public v(x xVar, m00.c cVar) {
        super(cVar);
        this.B = xVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        Object objZ = this.B.z(this);
        return objZ == l00.a.A ? objZ : new g00.n(objZ);
    }
}
