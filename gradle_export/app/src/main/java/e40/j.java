package e40;

import bt.p1;

public final class j extends m00.c {
    public Object A;
    public final p1 B;
    public int C;

    public j(p1 p1Var, k00.c cVar) {
        super(cVar);
        this.B = p1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.emit(null, this);
    }
}
