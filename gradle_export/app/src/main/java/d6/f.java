package d6;

public final class f extends m00.c {
    public Object A;
    public final g B;
    public int C;

    public f(g gVar, m00.c cVar) {
        super(cVar);
        this.B = gVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        this.B.Z(null, this);
        return l00.a.A;
    }
}
