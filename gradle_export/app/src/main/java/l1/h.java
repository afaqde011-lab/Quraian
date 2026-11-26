package l1;

import c3.y2;

public final class h extends RuntimeException {
    public final u.d0 A;
    public final u.d0 B;
    public final u.v C;
    public final int D;

    public h(u.d0 d0Var, u.d0 d0Var2, u.v vVar, int i10, Exception exc) {
        super(exc);
        this.A = d0Var;
        this.B = d0Var2;
        this.C = vVar;
        this.D = i10;
    }

    @Override
    public final String getMessage() {
        return r30.l.k0("\n            |Failed to execute op number " + this.D + ":\n            |" + h00.q.R0(h00.q.k1(50, q30.l.u0(new y2(new g(this, null)))), "\n", (String) null, (String) null, (u00.k) null, 62) + "\n            ");
    }
}
