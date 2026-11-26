package sv;

import sd.p1;

public final class c extends m00.c {
    public int A;
    public int B;
    public Object C;
    public final p1 D;
    public int E;

    public c(p1 p1Var, m00.c cVar) {
        super(cVar);
        this.D = p1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.D((String) null, this);
    }
}
