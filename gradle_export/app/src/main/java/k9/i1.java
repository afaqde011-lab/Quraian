package k9;

public final class i1 implements kh.m {
    public final int A;
    public final m1 B;

    public i1(m1 m1Var, int i10) {
        this.A = i10;
        this.B = m1Var;
    }

    @Override
    public final kh.v apply(Object obj) {
        Object obj2;
        switch (this.A) {
            case 0:
                q qVar = (q) obj;
                ta.c0.w(qVar, "LibraryResult must not be null");
                kh.b0 b0Var = new kh.b0();
                if (qVar.f9394a != 0 || (obj2 = qVar.f9396c) == null) {
                    b0Var.l(null);
                } else {
                    androidx.media3.common.q0 q0Var = (androidx.media3.common.q0) obj2;
                    byte[] bArr = q0Var.f1416d.f1637k;
                    if (bArr == null) {
                        b0Var.l(p.a(q0Var, null));
                    } else {
                        kh.v vVarO0 = this.B.M.m.o0(bArr);
                        e7.g0 g0Var = new e7.g0(b0Var, vVarO0, 1);
                        kh.p pVar = kh.p.A;
                        b0Var.a(g0Var, pVar);
                        vVarO0.a(new ab.e(vVarO0, b0Var, q0Var, 12), pVar);
                    }
                }
                return b0Var;
            default:
                return m1.a(this.B, (q) obj);
        }
    }
}
