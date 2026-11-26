package uu;

import java.util.List;

public final class v extends m00.c {
    public List A;
    public List B;
    public Object C;
    public final w D;
    public int E;

    public v(w wVar, m00.c cVar) {
        super(cVar);
        this.D = wVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.E(null, this);
    }
}
