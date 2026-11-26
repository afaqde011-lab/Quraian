package e30;

public abstract class n extends m {
    public final a0 B;

    public n(a0 a0Var) {
        this.B = a0Var;
    }

    @Override
    public final a0 z0(boolean z) {
        return z == t0() ? this : this.B.z0(z).B0(k0());
    }

    @Override
    public final a0 B0(h0 newAttributes) {
        kotlin.jvm.internal.m.e(newAttributes, "newAttributes");
        return newAttributes != k0() ? new c0(this, newAttributes) : this;
    }

    @Override
    public final a0 E0() {
        return this.B;
    }
}
