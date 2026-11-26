package ca;

public final class c0 extends m00.c {
    public Object A;
    public Object B;
    public final l0 C;
    public int D;

    public c0(l0 l0Var, m00.c cVar) {
        super(cVar);
        this.C = l0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return l0.a(this.C, null, this);
    }
}
