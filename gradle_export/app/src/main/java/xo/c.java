package xo;

import android.app.Activity;

public final class c extends m00.c {
    public Activity A;
    public String B;
    public String C;
    public Object D;
    public final e E;
    public int F;

    public c(e eVar, m00.c cVar) {
        super(cVar);
        this.E = eVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.c(null, this);
    }
}
