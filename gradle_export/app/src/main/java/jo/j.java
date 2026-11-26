package jo;

public final class j extends m00.c {
    public String A;
    public Object B;
    public int C;
    public Object D;
    public final k E;
    public int F;

    public j(k kVar, m00.c cVar) {
        super(cVar);
        this.E = kVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        Object objA = this.E.a(null, 0, this);
        return objA == l00.a.A ? objA : new g00.n(objA);
    }
}
