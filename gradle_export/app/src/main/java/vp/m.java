package vp;

public final class m extends m00.c {
    public Object A;
    public Object B;
    public final x C;
    public int D;

    public m(x xVar, m00.c cVar) {
        super(cVar);
        this.C = xVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        Object objP = this.C.p(this);
        return objP == l00.a.A ? objP : new g00.n(objP);
    }
}
