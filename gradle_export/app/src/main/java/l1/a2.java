package l1;

public final class a2 extends k00.a implements a40.x {
    public final a2.e B;
    public final b2 C;

    public a2(a2.e eVar, b2 b2Var) {
        a40.w wVar = a40.w.A;
        this.B = eVar;
        this.C = b2Var;
        super(wVar);
    }

    public final void v(Throwable th2, k00.i iVar) throws Throwable {
        a2.e eVar = this.B;
        b2 b2Var = this.C;
        ab.a0.H0(th2, new a1.o1(eVar, b2Var, 3));
        a40.x xVar = b2Var.A.get(a40.w.A);
        if (xVar == null) {
            throw th2;
        }
        xVar.v(th2, iVar);
    }
}
