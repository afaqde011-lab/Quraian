package tq;

import bt.p1;

public final class e extends m00.c {
    public Object A;
    public int B;
    public final p1 C;

    public e(p1 p1Var, k00.c cVar) {
        super(cVar);
        this.C = p1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.B |= Integer.MIN_VALUE;
        return this.C.emit(null, this);
    }
}
