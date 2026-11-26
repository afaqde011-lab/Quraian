package e30;

public final class d0 extends m implements y0 {
    public final a0 B;
    public final w C;

    public d0(a0 delegate, w enhancement) {
        kotlin.jvm.internal.m.e(delegate, "delegate");
        kotlin.jvm.internal.m.e(enhancement, "enhancement");
        this.B = delegate;
        this.C = enhancement;
    }

    @Override
    public final a0 z0(boolean z) {
        z0 z0VarI = c.I(this.B.z0(z), this.C.y0().z0(z));
        kotlin.jvm.internal.m.c(z0VarI, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (a0) z0VarI;
    }

    @Override
    public final a0 B0(h0 newAttributes) {
        kotlin.jvm.internal.m.e(newAttributes, "newAttributes");
        z0 z0VarI = c.I(this.B.B0(newAttributes), this.C);
        kotlin.jvm.internal.m.c(z0VarI, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (a0) z0VarI;
    }

    @Override
    public final a0 E0() {
        return this.B;
    }

    @Override
    public final m G0(a0 a0Var) {
        return new d0(a0Var, this.C);
    }

    @Override
    public final d0 A0(f30.f kotlinTypeRefiner) {
        kotlin.jvm.internal.m.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        a0 type = this.B;
        kotlin.jvm.internal.m.e(type, "type");
        w type2 = this.C;
        kotlin.jvm.internal.m.e(type2, "type");
        return new d0(type, type2);
    }

    @Override
    public final z0 V() {
        return this.B;
    }

    @Override
    public final w t() {
        return this.C;
    }

    @Override
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.C + ")] " + this.B;
    }
}
