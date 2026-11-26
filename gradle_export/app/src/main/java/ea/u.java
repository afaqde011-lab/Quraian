package ea;

public final class u extends m00.c {
    public Object A;
    public final w B;
    public int C;

    public u(w wVar, m00.c cVar) {
        super(cVar);
        this.B = wVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.a(this);
    }
}
