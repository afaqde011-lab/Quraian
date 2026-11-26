package uu;

public final class l extends m00.c {
    public int A;
    public int B;
    public Object C;
    public final w D;
    public int E;

    public l(w wVar, m00.c cVar) {
        super(cVar);
        this.D = wVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.q(0, 0, this);
    }
}
