package lu;

import java.util.Iterator;

public final class d0 extends m00.c {
    public Iterator A;
    public int B;
    public Object C;
    public final e0 D;
    public int E;

    public d0(e0 e0Var, m00.c cVar) {
        super(cVar);
        this.D = e0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return e0.j(this.D, this);
    }
}
