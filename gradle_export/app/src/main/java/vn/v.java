package vn;

import java.util.Iterator;
import java.util.List;

public final class v extends m00.c {
    public List A;
    public Iterator B;
    public Object C;
    public final b0 D;
    public int E;

    public v(b0 b0Var, m00.c cVar) {
        super(cVar);
        this.D = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.d(this);
    }
}
