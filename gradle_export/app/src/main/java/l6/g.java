package l6;

import android.content.Context;

public final class g extends m00.c {
    public Context A;
    public u00.k B;
    public c40.c C;
    public Object D;
    public final d6.r E;
    public int F;

    public g(d6.r rVar, m00.c cVar) {
        super(cVar);
        this.E = rVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.d(null, null, this);
    }
}
