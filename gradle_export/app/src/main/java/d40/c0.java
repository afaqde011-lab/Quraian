package d40;

import bt.a2;

public final class c0 extends m00.c {
    public Object A;
    public int B;
    public final a2 C;
    public Object D;

    public c0(a2 a2Var, k00.c cVar) {
        super(cVar);
        this.C = a2Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.B |= Integer.MIN_VALUE;
        return this.C.collect(null, this);
    }
}
