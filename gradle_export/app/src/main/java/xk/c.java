package xk;

import x.i;

public final class c extends m00.c {
    public i A;
    public int B;
    public int C;
    public int D;
    public int E;
    public Object F;
    public final d G;
    public int H;

    public c(d dVar, m00.c cVar) {
        super(cVar);
        this.G = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.b(null, this);
    }
}
