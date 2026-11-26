package is;

import java.util.List;

public final class a0 extends m00.c {
    public int A;
    public List B;
    public List C;
    public Object D;
    public final c0 E;
    public int F;

    public a0(c0 c0Var, m00.c cVar) {
        super(cVar);
        this.E = c0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.b(0, this);
    }
}
