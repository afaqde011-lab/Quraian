package is;

import java.util.Iterator;

public final class a1 extends m00.c {
    public int A;
    public int B;
    public int C;
    public int D;
    public String E;
    public j40.a F;
    public Iterator G;
    public Object H;
    public final c1 I;
    public int J;

    public a1(c1 c1Var, m00.c cVar) {
        super(cVar);
        this.I = c1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return this.I.i(0, this);
    }
}
