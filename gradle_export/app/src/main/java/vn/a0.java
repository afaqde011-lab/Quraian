package vn;

import java.util.Iterator;

public final class a0 extends m00.c {
    public j40.a A;
    public Iterator B;
    public int C;
    public int D;
    public Object E;
    public final b0 F;
    public int G;

    public a0(b0 b0Var, m00.c cVar) {
        super(cVar);
        this.F = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.g(this);
    }
}
