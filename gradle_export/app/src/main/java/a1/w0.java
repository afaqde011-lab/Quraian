package a1;

public final class w0 extends b2.q implements c3.n2, b3.j, b3.p {
    public h O;
    public q0.j1 P;
    public e1.v0 Q;
    public final l1.i1 R = l1.q.z(null);

    public w0(h hVar, q0.j1 j1Var, e1.v0 v0Var) {
        this.O = hVar;
        this.P = j1Var;
        this.Q = v0Var;
    }

    @Override
    public final void W(b3.p1 p1Var) {
        this.R.setValue(p1Var);
    }

    @Override
    public final void t1() {
        h hVar = this.O;
        if (hVar.f49a != null) {
            g0.a.c("Expected textInputModifierNode to be null");
        }
        hVar.f49a = this;
    }

    @Override
    public final void u1() {
        this.O.k(this);
    }
}
