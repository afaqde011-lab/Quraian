package vn;

import l60.o0;

public final class x extends m00.c {
    public bo.c A;
    public o0 B;
    public int C;
    public Object D;
    public final b0 E;
    public int F;

    public x(b0 b0Var, m00.c cVar) {
        super(cVar);
        this.E = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return b0.b(this.E, null, this);
    }
}
