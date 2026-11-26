package d6;

import kotlin.NoWhenBranchMatchedException;

public final class c implements u00.n {
    public final int A = 0;
    public final long B;
    public final Object C;
    public final Object D;

    public c(p0 p0Var, long j9, u00.n nVar) {
        this.C = p0Var;
        this.B = j9;
        this.D = nVar;
    }

    public c(String str, b2.r rVar, long j9, int i10) {
        this.C = str;
        this.D = rVar;
        this.B = j9;
    }

    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        switch (this.A) {
            case 0:
                p0 p0Var = (p0) this.C;
                u00.n nVar = (u00.n) this.D;
                l1.j jVar = (l1.j) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    l1.g0 g0Var = (l1.g0) jVar;
                    if (g0Var.C()) {
                        g0Var.V();
                    } else {
                        p0Var.getClass();
                        w.a(0, this.B, e2.f4625a, jVar, nVar);
                    }
                } else {
                    p0Var.getClass();
                    w.a(0, this.B, e2.f4625a, jVar, nVar);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                int iK = l1.q.K(49);
                kx.a.f((String) this.C, (b2.r) this.D, this.B, (l1.j) obj, iK);
                break;
        }
        return g00.b0.a;
    }
}
