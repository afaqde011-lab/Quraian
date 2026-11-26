package e30;

public final class l extends m implements j, h30.e {
    public final a0 B;
    public final boolean C;

    public l(a0 a0Var, boolean z) {
        this.B = a0Var;
        this.C = z;
    }

    @Override
    public final z0 C(w replacement) {
        kotlin.jvm.internal.m.e(replacement, "replacement");
        return c.n(replacement.y0(), this.C);
    }

    @Override
    public final a0 z0(boolean z) {
        return z ? this.B.z0(z) : this;
    }

    @Override
    public final a0 B0(h0 newAttributes) {
        kotlin.jvm.internal.m.e(newAttributes, "newAttributes");
        return new l(this.B.B0(newAttributes), this.C);
    }

    @Override
    public final a0 E0() {
        return this.B;
    }

    @Override
    public final m G0(a0 a0Var) {
        return new l(a0Var, this.C);
    }

    @Override
    public final boolean P() {
        a0 a0Var = this.B;
        a0Var.m0();
        return a0Var.m0().g() instanceof j10.r0;
    }

    @Override
    public final boolean t0() {
        return false;
    }

    @Override
    public final String toString() {
        return this.B + " & Any";
    }
}
