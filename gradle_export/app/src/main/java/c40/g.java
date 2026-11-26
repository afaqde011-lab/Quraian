package c40;

public final class g extends m00.c {
    public Object A;
    public final h B;
    public int C;

    public g(h hVar, m00.c cVar) {
        super(cVar);
        this.B = hVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        Object objE = this.B.E(null, 0, 0L, this);
        return objE == l00.a.A ? objE : new o(objE);
    }
}
