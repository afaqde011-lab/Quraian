package c40;

public final class f extends m00.c {
    public Object A;
    public final h B;
    public int C;

    public f(h hVar, m00.c cVar) {
        super(cVar);
        this.B = hVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        Object objD = h.D(this.B, this);
        return objD == l00.a.A ? objD : new o(objD);
    }
}
