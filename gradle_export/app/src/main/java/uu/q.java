package uu;

import java.util.List;

public final class q extends m00.c {
    public Integer A;
    public Long B;
    public List C;
    public Object D;
    public final w E;
    public int F;

    public q(w wVar, m00.c cVar) {
        super(cVar);
        this.E = wVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return w.c(this.E, null, this);
    }
}
