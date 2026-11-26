package vp;

public final class k extends m00.c {
    public String A;
    public Object B;
    public final x C;
    public int D;

    public k(x xVar, m00.c cVar) {
        super(cVar);
        this.C = xVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        Object objN = this.C.n(null, this);
        return objN == l00.a.A ? objN : new g00.n(objN);
    }
}
