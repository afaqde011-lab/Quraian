package is;

import java.util.Map;

public final class u0 extends m00.c {
    public j40.a A;
    public Map B;
    public int C;
    public int D;
    public Object E;
    public final c1 F;
    public int G;

    public u0(c1 c1Var, m00.c cVar) {
        super(cVar);
        this.F = c1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.d(this);
    }
}
