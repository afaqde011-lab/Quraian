package l1;

import java.util.Collection;

public final class k implements s1 {
    public final p A;
    public final t0 B;

    public k(p pVar, t0 t0Var) {
        this.A = pVar;
        this.B = t0Var;
    }

    @Override
    public final m0 a(r1 r1Var, Object obj) {
        m0 m0VarA;
        p pVar = this.A;
        p pVar2 = pVar instanceof s1 ? pVar : null;
        if (pVar2 == null || (m0VarA = pVar2.a(r1Var, obj)) == null) {
            m0VarA = m0.A;
        }
        if (m0VarA != m0.A) {
            return m0VarA;
        }
        t0 t0Var = this.B;
        t0Var.f9935f = h00.q.Z0(new g00.k(r1Var, obj), (Collection) t0Var.f9935f);
        return m0.B;
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c(Object obj) {
    }
}
