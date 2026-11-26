package l1;

public final class a0 implements s2 {

    public final i1 f9824a;

    public a0(i1 i1Var) {
        this.f9824a = i1Var;
    }

    @Override
    public final Object a(m1 m1Var) {
        return this.f9824a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && this.f9824a.equals(((a0) obj).f9824a);
    }

    public final int hashCode() {
        return this.f9824a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f9824a + ')';
    }
}
