package ov;

public final class f extends m00.c {
    public String A;
    public Integer B;
    public int C;
    public Object D;
    public final g E;
    public int F;

    public f(g gVar, m00.c cVar) {
        super(cVar);
        this.E = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.i(null, 0, this);
    }
}
