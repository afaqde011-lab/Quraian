package ld;

import qd.j0;

public final class i extends m00.c {
    public j0 A;
    public b3.a B;
    public Object C;
    public final j0 D;
    public int E;

    public i(j0 j0Var, m00.c cVar) {
        super(cVar);
        this.D = j0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.e(null, this);
    }
}
