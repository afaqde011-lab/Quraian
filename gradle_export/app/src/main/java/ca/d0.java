package ca;

public final class d0 extends m00.c {
    public int[] A;
    public Object B;
    public final e0 C;
    public int D;

    public d0(e0 e0Var, k00.c cVar) {
        super(cVar);
        this.C = e0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.b(null, this);
    }
}
