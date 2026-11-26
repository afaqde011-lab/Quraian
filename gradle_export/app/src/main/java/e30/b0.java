package e30;

import java.util.List;

public final class b0 extends a0 {
    public final m0 B;
    public final List C;
    public final boolean D;
    public final x20.n E;
    public final u00.k F;

    public b0(m0 constructor, List arguments, boolean z, x20.n memberScope, u00.k kVar) {
        kotlin.jvm.internal.m.e(constructor, "constructor");
        kotlin.jvm.internal.m.e(arguments, "arguments");
        kotlin.jvm.internal.m.e(memberScope, "memberScope");
        this.B = constructor;
        this.C = arguments;
        this.D = z;
        this.E = memberScope;
        this.F = kVar;
        if (!(memberScope instanceof g30.g) || (memberScope instanceof g30.m)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + memberScope + '\n' + constructor);
    }

    @Override
    public final z0 A0(f30.f kotlinTypeRefiner) {
        kotlin.jvm.internal.m.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        a0 a0Var = (a0) this.F.invoke(kotlinTypeRefiner);
        return a0Var == null ? this : a0Var;
    }

    @Override
    public final a0 z0(boolean z) {
        if (z == this.D) {
            return this;
        }
        return z ? new z(this, 1) : new z(this, 0);
    }

    @Override
    public final a0 B0(h0 newAttributes) {
        kotlin.jvm.internal.m.e(newAttributes, "newAttributes");
        return newAttributes.isEmpty() ? this : new c0(this, newAttributes);
    }

    @Override
    public final x20.n N() {
        return this.E;
    }

    @Override
    public final List e0() {
        return this.C;
    }

    @Override
    public final h0 k0() {
        h0.B.getClass();
        return h0.C;
    }

    @Override
    public final m0 m0() {
        return this.B;
    }

    @Override
    public final boolean t0() {
        return this.D;
    }

    @Override
    public final w A0(f30.f kotlinTypeRefiner) {
        kotlin.jvm.internal.m.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        a0 a0Var = (a0) this.F.invoke(kotlinTypeRefiner);
        return a0Var == null ? this : a0Var;
    }
}
