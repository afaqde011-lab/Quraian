package l1;

public final class u implements s2 {

    public final u00.k f9938a;

    public u(u00.k kVar) {
        this.f9938a = kVar;
    }

    @Override
    public final Object a(m1 m1Var) {
        return this.f9938a.invoke(m1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && kotlin.jvm.internal.m.a(this.f9938a, ((u) obj).f9938a);
    }

    public final int hashCode() {
        return this.f9938a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.f9938a + ')';
    }
}
