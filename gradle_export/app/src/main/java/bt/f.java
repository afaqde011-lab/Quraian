package bt;

public final class f implements w {
    public final ep.e a;

    public f(ep.e method) {
        kotlin.jvm.internal.m.e(method, "method");
        this.a = method;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.a == ((f) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnAuthMethodClicked(method=" + this.a + ")";
    }
}
