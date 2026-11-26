package vp;

public final class j extends m00.c {
    public Object A;
    public final x B;
    public int C;

    public j(x xVar, m00.c cVar) {
        super(cVar);
        this.B = xVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return x.a(this.B, this);
    }
}
