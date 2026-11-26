package g1;

public final class n8 extends c3.e2 implements z2.g0 {
    public static final int C = 0;
    public final boolean B;

    public n8(boolean z10) {
        this.B = z10;
    }

    @Override
    public final z2.x0 e(z2.y0 y0Var, z2.v0 v0Var, long j9) {
        z2.l1 l1VarO = v0Var.O(j9);
        boolean z10 = this.B;
        h00.y yVar = h00.y.A;
        return !z10 ? y0Var.o0(0, 0, yVar, new j7(4)) : y0Var.o0(l1VarO.A, l1VarO.B, yVar, new a1.q2(l1VarO, 4));
    }

    public final boolean equals(Object obj) {
        n8 n8Var = obj instanceof n8 ? (n8) obj : null;
        return n8Var != null && this.B == n8Var.B;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.B);
    }
}
