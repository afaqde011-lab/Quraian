package is;

import java.util.Map;
import java.util.Set;

public final class j0 extends m00.c {
    public ss.j A;
    public Set B;
    public Object C;
    public Map D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public Object J;
    public final l0 K;
    public int L;

    public j0(l0 l0Var, m00.c cVar) {
        super(cVar);
        this.K = l0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.J = obj;
        this.L |= Integer.MIN_VALUE;
        return this.K.m(this);
    }
}
