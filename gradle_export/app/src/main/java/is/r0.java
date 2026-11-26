package is;

import java.util.Iterator;
import java.util.List;

public final class r0 extends m00.c {
    public List A;
    public j40.a B;
    public Iterator C;
    public int D;
    public int E;
    public int F;
    public Object G;
    public final c1 H;
    public int I;

    public r0(c1 c1Var, m00.c cVar) {
        super(cVar);
        this.H = c1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.a(null, this);
    }
}
