package sv;

import sd.p1;

public final class f extends m00.c {
    public int A;
    public Object B;
    public final p1 C;
    public int D;

    public f(p1 p1Var, m00.c cVar) {
        super(cVar);
        this.C = p1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.K((String) null, this);
    }
}
