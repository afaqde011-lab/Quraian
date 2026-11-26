package bv;

public final class w2 extends m00.c {
    public cy.g A;
    public int B;
    public Object C;
    public final e3 D;
    public int E;

    public w2(e3 e3Var, m00.c cVar) {
        super(cVar);
        this.D = e3Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.G(null, this);
    }
}
