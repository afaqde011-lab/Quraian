package w;

import kotlin.NoWhenBranchMatchedException;

public final class o0 extends kotlin.jvm.internal.n implements u00.k {
    public final int A;
    public final x0 B;
    public final y0 C;

    public o0(x0 x0Var, y0 y0Var, int i10) {
        super(1);
        this.A = i10;
        this.B = x0Var;
        this.C = y0Var;
    }

    public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
        x.y yVar;
        x.y yVar2;
        x.y yVar3;
        x.y yVar4;
        switch (this.A) {
            case 0:
                x.k1 k1Var = (x.k1) obj;
                l0 l0Var = l0.A;
                l0 l0Var2 = l0.B;
                if (k1Var.b(l0Var, l0Var2)) {
                    z0 z0Var = this.B.f15820a.f15765a;
                    return (z0Var == null || (yVar2 = z0Var.f15826b) == null) ? s0.f15807b : yVar2;
                }
                if (!k1Var.b(l0Var2, l0.C)) {
                    return s0.f15807b;
                }
                z0 z0Var2 = this.C.f15824a.f15765a;
                return (z0Var2 == null || (yVar = z0Var2.f15826b) == null) ? s0.f15807b : yVar;
            case 1:
                int iOrdinal = ((l0) obj).ordinal();
                float f3 = 1.0f;
                if (iOrdinal == 0) {
                    z0 z0Var3 = this.B.f15820a.f15765a;
                    if (z0Var3 != null) {
                        f3 = z0Var3.f15825a;
                    }
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z0 z0Var4 = this.C.f15824a.f15765a;
                    if (z0Var4 != null) {
                        f3 = z0Var4.f15825a;
                    }
                }
                return Float.valueOf(f3);
            case 2:
                x.k1 k1Var2 = (x.k1) obj;
                l0 l0Var3 = l0.A;
                l0 l0Var4 = l0.B;
                if (k1Var2.b(l0Var3, l0Var4)) {
                    d1 d1Var = this.B.f15820a.f15768d;
                    return (d1Var == null || (yVar4 = d1Var.f15750c) == null) ? s0.f15807b : yVar4;
                }
                if (!k1Var2.b(l0Var4, l0.C)) {
                    return s0.f15807b;
                }
                d1 d1Var2 = this.C.f15824a.f15768d;
                return (d1Var2 == null || (yVar3 = d1Var2.f15750c) == null) ? s0.f15807b : yVar3;
            default:
                int iOrdinal2 = ((l0) obj).ordinal();
                float f10 = 1.0f;
                if (iOrdinal2 == 0) {
                    d1 d1Var3 = this.B.f15820a.f15768d;
                    if (d1Var3 != null) {
                        f10 = d1Var3.f15748a;
                    }
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    d1 d1Var4 = this.C.f15824a.f15768d;
                    if (d1Var4 != null) {
                        f10 = d1Var4.f15748a;
                    }
                }
                return Float.valueOf(f10);
        }
    }
}
