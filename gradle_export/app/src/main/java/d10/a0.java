package d10;

public abstract class a0 extends y implements a10.p {
    public static final a10.w[] J = {kotlin.jvm.internal.a0.a.h(new kotlin.jvm.internal.s(a0.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", 0))};
    public final x1 H = va.a.Q((j10.c) null, new z(this, 0));
    public final Object I = rd.a.I(g00.i.B, new z(this, 1));

    @Override
    public final e10.g a() {
        return (e10.g) this.I.getValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a0) && kotlin.jvm.internal.m.a(A(), ((a0) obj).A());
    }

    @Override
    public final String getName() {
        return g4.c.k(new StringBuilder("<get-"), A().I, '>');
    }

    public final int hashCode() {
        return A().hashCode();
    }

    public final String toString() {
        return "getter of " + A();
    }

    @Override
    public final j10.c w() {
        a10.w wVar = J[0];
        Object objInvoke = this.H.invoke();
        kotlin.jvm.internal.m.d(objInvoke, "getValue(...)");
        return (m10.j0) objInvoke;
    }

    @Override
    public final j10.k0 z() {
        a10.w wVar = J[0];
        Object objInvoke = this.H.invoke();
        kotlin.jvm.internal.m.d(objInvoke, "getValue(...)");
        return (m10.j0) objInvoke;
    }
}
