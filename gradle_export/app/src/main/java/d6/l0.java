package d6;

import android.content.Context;

public final class l0 extends m00.c {
    public Context A;
    public h B;
    public Throwable C;
    public int D;
    public Object E;
    public final p0 F;
    public int G;

    public l0(p0 p0Var, m00.c cVar) {
        super(cVar);
        this.F = p0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.a(null, 0, this);
    }
}
