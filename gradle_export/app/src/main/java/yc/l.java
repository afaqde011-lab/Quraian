package yc;

import java.util.Iterator;
import q3.e0;

public final class l extends m00.c {
    public e0 A;
    public Iterator B;
    public Object C;
    public final e0 D;
    public int E;

    public l(e0 e0Var, m00.c cVar) {
        super(cVar);
        this.D = e0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.q(this);
    }
}
