package w;

public final class v0 extends kotlin.jvm.internal.n implements u00.k {
    public final int A;
    public final w0 B;

    public v0(w0 w0Var, int i10) {
        super(1);
        this.A = i10;
        this.B = w0Var;
    }

    public final Object invoke(Object obj) {
        x.y yVar;
        x.y yVar2;
        switch (this.A) {
            case 0:
                x.k1 k1Var = (x.k1) obj;
                l0 l0Var = l0.A;
                l0 l0Var2 = l0.B;
                boolean zB = k1Var.b(l0Var, l0Var2);
                Object obj2 = null;
                w0 w0Var = this.B;
                if (zB) {
                    i0 i0Var = w0Var.T.f15820a.f15767c;
                    if (i0Var != null) {
                        obj2 = i0Var.f15775c;
                    }
                } else if (k1Var.b(l0Var2, l0.C)) {
                    i0 i0Var2 = w0Var.U.f15824a.f15767c;
                    if (i0Var2 != null) {
                        obj2 = i0Var2.f15775c;
                    }
                } else {
                    obj2 = s0.f15809d;
                }
                return obj2 == null ? s0.f15809d : obj2;
            default:
                x.k1 k1Var2 = (x.k1) obj;
                l0 l0Var3 = l0.A;
                l0 l0Var4 = l0.B;
                boolean zB2 = k1Var2.b(l0Var3, l0Var4);
                w0 w0Var2 = this.B;
                if (zB2) {
                    d2 d2Var = w0Var2.T.f15820a.f15766b;
                    return (d2Var == null || (yVar2 = d2Var.f15752b) == null) ? s0.f15808c : yVar2;
                }
                if (!k1Var2.b(l0Var4, l0.C)) {
                    return s0.f15808c;
                }
                d2 d2Var2 = w0Var2.U.f15824a.f15766b;
                return (d2Var2 == null || (yVar = d2Var2.f15752b) == null) ? s0.f15808c : yVar;
        }
    }
}
