package q0;

public final class h0 implements u00.a {
    public final int A;
    public final g2 B;

    public h0(g2 g2Var, int i10) {
        this.A = i10;
        this.B = g2Var;
    }

    public final Object invoke() {
        switch (this.A) {
            case 0:
                g2 g2Var = this.B;
                return Boolean.valueOf(g2Var != null ? ((Boolean) new h0(g2Var, 2).invoke()).booleanValue() : false);
            case 1:
                g2 g2Var2 = this.B;
                return Boolean.valueOf(g2Var2 != null ? ((Boolean) new h0(g2Var2, 2).invoke()).booleanValue() : false);
            default:
                g2 g2Var3 = this.B;
                m3.h hVar = g2Var3.f12617b;
                m3.n0 n0Var = (m3.n0) g2Var3.f12616a.getValue();
                return Boolean.valueOf(kotlin.jvm.internal.m.a(hVar, n0Var != null ? n0Var.f10496a.f10483a : null));
        }
    }
}
