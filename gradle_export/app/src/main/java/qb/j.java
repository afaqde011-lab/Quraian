package qb;

public final class j extends m00.c {
    public Object A;
    public final l B;
    public int C;

    public j(l lVar, m00.c cVar) {
        super(cVar);
        this.B = lVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.b(null, this);
    }
}
