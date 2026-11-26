package bv;

public final class v2 extends m00.c {
    public cy.g A;
    public Object B;
    public final e3 C;
    public int D;

    public v2(e3 e3Var, m00.c cVar) {
        super(cVar);
        this.C = e3Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.F(null, this);
    }
}
