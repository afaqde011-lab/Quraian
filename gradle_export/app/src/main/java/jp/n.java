package jp;

public final class n implements t {
    public final String a;

    public n(String value) {
        kotlin.jvm.internal.m.e(value, "value");
        this.a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && kotlin.jvm.internal.m.a(this.a, ((n) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a1.b.p("OnNewPasswordChanged(value=", this.a, ")");
    }
}
