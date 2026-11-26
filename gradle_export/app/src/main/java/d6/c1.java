package d6;

import android.content.Context;

public final class c1 extends m00.c {
    public Context A;
    public int[] B;
    public int C;
    public int D;
    public Object E;
    public final f1 F;
    public int G;

    public c1(f1 f1Var, m00.c cVar) {
        super(cVar);
        this.F = f1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.a(null, null, null, this);
    }
}
