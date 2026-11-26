package vn;

import java.util.Iterator;

public final class k extends m00.c {
    public d40.j A;
    public Iterator B;
    public int C;
    public Object D;
    public final d40.w E;
    public int F;

    public k(d40.w wVar, k00.c cVar) {
        super(cVar);
        this.E = wVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.b(null, this);
    }
}
