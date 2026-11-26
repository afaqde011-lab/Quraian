package d40;

import bt.a2;

public final class a extends m00.c {
    public e40.p A;
    public Object B;
    public final a2 C;
    public int D;

    public a(a2 a2Var, k00.c cVar) {
        super(cVar);
        this.C = a2Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.collect(null, this);
    }
}
