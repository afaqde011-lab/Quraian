package vn;

import java.util.Iterator;
import java.util.Set;

public final class m extends m00.c {
    public Set A;
    public Iterator B;
    public int C;
    public Object D;
    public final o E;
    public int F;

    public m(o oVar, m00.c cVar) {
        super(cVar);
        this.E = oVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.g(null, this);
    }
}
