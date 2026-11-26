package yc;

import sd.p1;

public final class a extends m00.c {
    public p1 A;
    public Object B;
    public final p1 C;
    public int D;

    public a(p1 p1Var, m00.c cVar) {
        super(cVar);
        this.C = p1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.o(this);
    }
}
