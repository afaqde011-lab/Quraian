package sv;

import sd.p1;

public final class e extends m00.c {
    public Object A;
    public final p1 B;
    public int C;

    public e(p1 p1Var, m00.c cVar) {
        super(cVar);
        this.B = p1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.J(this);
    }
}
