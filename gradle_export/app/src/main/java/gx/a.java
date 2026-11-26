package gx;

public final class a extends m00.c {
    public cq.a A;
    public cq.f B;
    public int C;
    public Object D;
    public final c E;
    public int F;

    public a(c cVar, m00.c cVar2) {
        super(cVar2);
        this.E = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.a(null, this);
    }
}
