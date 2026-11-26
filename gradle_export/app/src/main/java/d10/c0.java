package d10;

public abstract class c0 extends y implements a10.h {
    public static final a10.w[] J = {kotlin.jvm.internal.a0.a.h(new kotlin.jvm.internal.s(c0.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", 0))};
    public final x1 H = va.a.Q((j10.c) null, new b0(this, 0));
    public final Object I = rd.a.I(g00.i.B, new b0(this, 1));

    @Override
    public final e10.g a() {
        return (e10.g) this.I.getValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c0) && kotlin.jvm.internal.m.a(A(), ((c0) obj).A());
    }

    @Override
    public final String getName() {
        return g4.c.k(new StringBuilder("<set-"), A().I, '>');
    }

    public final int hashCode() {
        return A().hashCode();
    }

    public final String toString() {
        return "setter of " + A();
    }

    @Override
    public final j10.c w() {
        a10.w wVar = J[0];
        Object objInvoke = this.H.invoke();
        kotlin.jvm.internal.m.d(objInvoke, "getValue(...)");
        return (m10.k0) objInvoke;
    }

    @Override
    public final j10.k0 z() {
        a10.w wVar = J[0];
        Object objInvoke = this.H.invoke();
        kotlin.jvm.internal.m.d(objInvoke, "getValue(...)");
        return (m10.k0) objInvoke;
    }
}
