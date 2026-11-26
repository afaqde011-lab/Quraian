package e30;

public final class s extends q implements y0 {
    public final q D;
    public final w E;

    public s(q origin, w enhancement) {
        super(origin.B, origin.C);
        kotlin.jvm.internal.m.e(origin, "origin");
        kotlin.jvm.internal.m.e(enhancement, "enhancement");
        this.D = origin;
        this.E = enhancement;
    }

    @Override
    public final z0 A0(f30.f kotlinTypeRefiner) {
        kotlin.jvm.internal.m.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        q type = this.D;
        kotlin.jvm.internal.m.e(type, "type");
        w type2 = this.E;
        kotlin.jvm.internal.m.e(type2, "type");
        return new s(type, type2);
    }

    @Override
    public final z0 B0(h0 newAttributes) {
        kotlin.jvm.internal.m.e(newAttributes, "newAttributes");
        return c.I(this.D.B0(newAttributes), this.E);
    }

    @Override
    public final a0 C0() {
        return this.D.C0();
    }

    @Override
    public final String D0(p20.h hVar, p20.h hVar2) {
        p20.l lVar = hVar2.a;
        return ((Boolean) lVar.m.a(p20.l.Y[11], lVar)).booleanValue() ? hVar.X(this.E) : this.D.D0(hVar, hVar2);
    }

    @Override
    public final z0 V() {
        return this.D;
    }

    @Override
    public final w t() {
        return this.E;
    }

    @Override
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.E + ")] " + this.D;
    }

    @Override
    public final w A0(f30.f kotlinTypeRefiner) {
        kotlin.jvm.internal.m.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        q type = this.D;
        kotlin.jvm.internal.m.e(type, "type");
        w type2 = this.E;
        kotlin.jvm.internal.m.e(type2, "type");
        return new s(type, type2);
    }

    @Override
    public final z0 z0(boolean z) {
        return c.I(this.D.z0(z), this.E.y0().z0(z));
    }
}
