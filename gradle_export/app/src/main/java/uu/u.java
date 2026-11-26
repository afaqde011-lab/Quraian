package uu;

public final class u extends m00.c {
    public Long A;
    public u30.b B;
    public Object C;
    public final w D;
    public int E;

    public u(w wVar, m00.c cVar) {
        super(cVar);
        this.D = wVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.D(null, null, this);
    }
}
