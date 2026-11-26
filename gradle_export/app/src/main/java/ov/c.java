package ov;

import java.util.Collection;
import java.util.Iterator;

public final class c extends m00.c {
    public Collection A;
    public Iterator B;
    public int C;
    public int D;
    public int E;
    public Object F;
    public final g G;
    public int H;

    public c(g gVar, m00.c cVar) {
        super(cVar);
        this.G = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.e(null, this);
    }
}
