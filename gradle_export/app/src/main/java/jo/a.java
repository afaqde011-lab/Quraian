package jo;

public final class a extends m00.c {
    public Object A;
    public final b B;
    public int C;

    public a(b bVar, m00.c cVar) {
        super(cVar);
        this.B = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        Object objA = this.B.a(null, this);
        return objA == l00.a.A ? objA : new g00.n(objA);
    }
}
