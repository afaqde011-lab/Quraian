package g1;

public final class f3 implements u00.a {
    public final int A;
    public final h3 B;

    public f3(h3 h3Var, int i10) {
        this.A = i10;
        this.B = h3Var;
    }

    public final Object invoke() {
        int i10 = this.A;
        h3 h3Var = this.B;
        switch (i10) {
            case 0:
                if (((w5) b3.m.h(h3Var, y5.f6029a)) == null) {
                    f1.a aVar = h3Var.U;
                    if (aVar != null) {
                        h3Var.C1(aVar);
                    }
                    h3Var.U = null;
                } else if (h3Var.U == null) {
                    g3 g3Var = new g3(h3Var, 0);
                    f3 f3Var = new f3(h3Var, 1);
                    f0.i iVar = h3Var.Q;
                    boolean z10 = h3Var.R;
                    float f3 = h3Var.S;
                    x.q1 q1Var = f1.f.f5481a;
                    f1.a aVar2 = new f1.a(iVar, z10, f3, g3Var, f3Var);
                    h3Var.B1(aVar2);
                    h3Var.U = aVar2;
                }
                return g00.b0.a;
            default:
                return x5.f6026a;
        }
    }
}
