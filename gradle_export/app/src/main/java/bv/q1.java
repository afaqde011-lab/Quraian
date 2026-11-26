package bv;

public final class q1 extends m00.c {
    public cy.g A;
    public f3 B;
    public Object C;
    public final e3 D;
    public int E;

    public q1(e3 e3Var, m00.c cVar) {
        super(cVar);
        this.D = e3Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return e3.j(this.D, null, this);
    }
}
