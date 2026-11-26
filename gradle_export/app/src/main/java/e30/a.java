package e30;

public final class a extends m {
    public final a0 B;
    public final a0 C;

    public a(a0 delegate, a0 abbreviation) {
        kotlin.jvm.internal.m.e(delegate, "delegate");
        kotlin.jvm.internal.m.e(abbreviation, "abbreviation");
        this.B = delegate;
        this.C = abbreviation;
    }

    @Override
    public final a0 B0(h0 newAttributes) {
        kotlin.jvm.internal.m.e(newAttributes, "newAttributes");
        return new a(this.B.B0(newAttributes), this.C);
    }

    @Override
    public final a0 E0() {
        return this.B;
    }

    @Override
    public final m G0(a0 a0Var) {
        return new a(a0Var, this.C);
    }

    @Override
    public final a z0(boolean z) {
        return new a(this.B.z0(z), this.C.z0(z));
    }

    @Override
    public final a w0(f30.f kotlinTypeRefiner) {
        kotlin.jvm.internal.m.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        a0 type = this.B;
        kotlin.jvm.internal.m.e(type, "type");
        a0 type2 = this.C;
        kotlin.jvm.internal.m.e(type2, "type");
        return new a(type, type2);
    }
}
