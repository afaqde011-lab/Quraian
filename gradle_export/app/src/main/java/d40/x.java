package d40;

import bt.y1;

public final class x extends m00.c {
    public Object A;
    public int B;
    public final y1 C;
    public y1 D;
    public j E;
    public Throwable F;
    public long G;

    public x(y1 y1Var, k00.c cVar) {
        super(cVar);
        this.C = y1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.B |= Integer.MIN_VALUE;
        return this.C.collect(null, this);
    }
}
