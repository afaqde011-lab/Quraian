package e0;

public final class f extends m00.c {
    public Object A;
    public final h B;
    public int C;

    public f(h hVar, m00.c cVar) {
        super(cVar);
        this.B = hVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.d(null, 0.0f, null, this);
    }
}
