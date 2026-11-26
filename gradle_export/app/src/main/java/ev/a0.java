package ev;

import bt.m1;

public final class a0 extends m00.c {
    public Object A;
    public int B;
    public final m1 C;

    public a0(m1 m1Var, k00.c cVar) {
        super(cVar);
        this.C = m1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.B |= Integer.MIN_VALUE;
        return this.C.emit(null, this);
    }
}
