package a40;

public final class i1 extends k {
    public final m1 I;

    public i1(k00.c cVar, m1 m1Var) {
        super(1, cVar);
        this.I = m1Var;
    }

    @Override
    public final String A() {
        return "AwaitContinuation";
    }

    @Override
    public final Throwable p(m1 m1Var) {
        Throwable thD;
        m1 m1Var2 = this.I;
        m1Var2.getClass();
        Object obj = m1.A.get(m1Var2);
        if (!(obj instanceof k1) || (thD = ((k1) obj).d()) == null) {
            return obj instanceof s ? ((s) obj).a : m1Var.x();
        }
        return thD;
    }
}
