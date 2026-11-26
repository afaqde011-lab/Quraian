package sv;

import s10.w0;

public final class w extends m00.c {
    public int A;
    public Object B;
    public final w0 C;
    public int D;

    public w(w0 w0Var, m00.c cVar) {
        super(cVar);
        this.C = w0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.w(0, this);
    }
}
