package e0;

public final class g extends m00.c {
    public Object A;
    public final h B;
    public int C;

    public g(h hVar, m00.c cVar) {
        super(cVar);
        this.B = hVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return h.b(this.B, null, 0.0f, 0.0f, null, this);
    }
}
