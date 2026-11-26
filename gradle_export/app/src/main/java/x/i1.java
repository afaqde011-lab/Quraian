package x;

import l1.p2;

public final class i1 implements p2 {
    public final m1 A;
    public u00.k B;
    public kotlin.jvm.internal.n C;
    public final j1 D;

    public i1(j1 j1Var, m1 m1Var, u00.k kVar, u00.k kVar2) {
        this.D = j1Var;
        this.A = m1Var;
        this.B = kVar;
        this.C = (kotlin.jvm.internal.n) kVar2;
    }

    public final void a(k1 k1Var) {
        Object objInvoke = this.C.invoke(k1Var.c());
        boolean zG = this.D.f16307c.g();
        m1 m1Var = this.A;
        if (zG) {
            m1Var.g(this.C.invoke(k1Var.a()), objInvoke, (y) this.B.invoke(k1Var));
        } else {
            m1Var.h(objInvoke, (y) this.B.invoke(k1Var));
        }
    }

    @Override
    public final Object getValue() {
        a(this.D.f16307c.f());
        return this.A.J.getValue();
    }
}
