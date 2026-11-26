package d6;

import android.content.Context;

public final class k1 extends m00.c {
    public Context A;
    public int B;
    public Object C;
    public final a0 D;
    public int E;

    public k1(a0 a0Var, m00.c cVar) {
        super(cVar);
        this.D = a0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.c(null, 0, this);
    }
}
