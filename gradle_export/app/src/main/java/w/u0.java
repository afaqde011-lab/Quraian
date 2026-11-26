package w;

import kotlin.NoWhenBranchMatchedException;

public final class u0 extends kotlin.jvm.internal.n implements u00.k {
    public final int A;
    public final w0 B;
    public final long C;

    public u0(w0 w0Var, long j9, int i10) {
        super(1);
        this.A = i10;
        this.B = w0Var;
        this.C = j9;
    }

    public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
        u00.k kVar;
        u00.k kVar2;
        long jC;
        int iOrdinal;
        switch (this.A) {
            case 0:
                int iOrdinal2 = ((l0) obj).ordinal();
                w0 w0Var = this.B;
                long j9 = this.C;
                if (iOrdinal2 == 0) {
                    i0 i0Var = w0Var.T.f15820a.f15767c;
                    if (i0Var != null && (kVar = i0Var.f15774b) != null) {
                        j9 = ((y3.l) kVar.invoke(new y3.l(j9))).f16596a;
                    }
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i0 i0Var2 = w0Var.U.f15824a.f15767c;
                    if (i0Var2 != null && (kVar2 = i0Var2.f15774b) != null) {
                        j9 = ((y3.l) kVar2.invoke(new y3.l(j9))).f16596a;
                    }
                }
                return new y3.l(j9);
            case 1:
                l0 l0Var = (l0) obj;
                w0 w0Var2 = this.B;
                if (w0Var2.Y == null || w0Var2.D1() == null || kotlin.jvm.internal.m.a(w0Var2.Y, w0Var2.D1()) || (iOrdinal = l0Var.ordinal()) == 0 || iOrdinal == 1) {
                    jC = 0;
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i0 i0Var3 = w0Var2.U.f15824a.f15767c;
                    if (i0Var3 != null) {
                        u00.k kVar3 = i0Var3.f15774b;
                        long j10 = this.C;
                        long j11 = ((y3.l) kVar3.invoke(new y3.l(j10))).f16596a;
                        b2.d dVarD1 = w0Var2.D1();
                        kotlin.jvm.internal.m.b(dVarD1);
                        y3.m mVar = y3.m.A;
                        long jA = dVarD1.a(j10, j11, mVar);
                        b2.d dVar = w0Var2.Y;
                        kotlin.jvm.internal.m.b(dVar);
                        jC = y3.j.c(jA, dVar.a(j10, j11, mVar));
                    } else {
                        jC = 0;
                    }
                }
                return new y3.j(jC);
            default:
                l0 l0Var2 = (l0) obj;
                w0 w0Var3 = this.B;
                d2 d2Var = w0Var3.T.f15820a.f15766b;
                long j12 = this.C;
                long j13 = 0;
                long j14 = d2Var != null ? ((y3.j) d2Var.f15751a.invoke(new y3.l(j12))).f16590a : 0L;
                d2 d2Var2 = w0Var3.U.f15824a.f15766b;
                long j15 = d2Var2 != null ? ((y3.j) d2Var2.f15751a.invoke(new y3.l(j12))).f16590a : 0L;
                int iOrdinal3 = l0Var2.ordinal();
                if (iOrdinal3 == 0) {
                    j13 = j14;
                } else if (iOrdinal3 != 1) {
                    if (iOrdinal3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j13 = j15;
                }
                return new y3.j(j13);
        }
    }
}
