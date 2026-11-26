package sv;

import s10.w0;

public final class u extends m00.c {
    public Object A;
    public final w0 B;
    public int C;

    public u(w0 w0Var, m00.c cVar) {
        super(cVar);
        this.B = w0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.n(null, this);
    }
}
