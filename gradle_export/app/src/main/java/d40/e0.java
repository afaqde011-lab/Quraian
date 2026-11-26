package d40;

import bt.y1;

public final class e0 extends m00.c {
    public Object A;
    public int B;
    public final y1 C;
    public b1.g D;

    public e0(y1 y1Var, k00.c cVar) {
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
