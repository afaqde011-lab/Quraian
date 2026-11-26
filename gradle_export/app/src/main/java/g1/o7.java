package g1;

import kotlin.NoWhenBranchMatchedException;

public final class o7 implements u00.n {
    public final h A;
    public final boolean B;

    public o7(h hVar, boolean z10) {
        this.A = hVar;
        this.B = z10;
    }

    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        l1.j jVar = (l1.j) obj;
        int iIntValue = ((Number) obj2).intValue();
        l1.g0 g0Var = (l1.g0) jVar;
        if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
            int i10 = z7.l.f14904b;
            for (int i11 = 0; i11 < i10; i11++) {
                int iC = z7.l.c(i11);
                boolean zE = g0Var.e(i11);
                Object objN = g0Var.N();
                if (zE || objN == l1.i.f9868a) {
                    objN = new s1(i11, 2);
                    g0Var.n0(objN);
                }
                z7.d(j3.q.c(b2.o.A, false, (u00.k) objN), this.A, iC, this.B, jVar, 0);
            }
        } else {
            g0Var.V();
        }
        return g00.b0.a;
    }
}
