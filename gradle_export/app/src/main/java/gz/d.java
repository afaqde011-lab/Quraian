package gz;

public final class d implements m0 {
    public final ep.e a;

    public d(ep.e method) {
        kotlin.jvm.internal.m.e(method, "method");
        this.a = method;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.a == ((d) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnAuthMethodClicked(method=" + this.a + ")";
    }
}
