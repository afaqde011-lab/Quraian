package d0;

import kotlin.NoWhenBranchMatchedException;

public final class h2 implements u00.a {
    public final int A;
    public final m2 B;

    public h2(m2 m2Var, int i10) {
        this.A = i10;
        this.B = m2Var;
    }

    public final Object invoke() throws NoWhenBranchMatchedException {
        int i10 = this.A;
        m2 m2Var = this.B;
        switch (i10) {
            case 0:
                return Boolean.valueOf(m2Var.N);
            default:
                g2.a0 a0Var = m2Var.f4456p0;
                if (!a0Var.A.N) {
                    return null;
                }
                g2.y yVarG1 = a0Var.G1();
                int iOrdinal = yVarG1.ordinal();
                if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        return null;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (yVarG1.a()) {
                    return a0Var.E1(null);
                }
                g2.a0 a0VarG = ((g2.n) ((c3.z) b3.m.z(a0Var)).getFocusOwner()).g();
                if (a0VarG != null) {
                    return a0VarG.E1(b3.m.x(a0Var));
                }
                return null;
        }
    }
}
