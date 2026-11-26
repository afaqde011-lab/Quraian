package wy;

public final class e implements f {
    public final String a;

    public e(String value) {
        kotlin.jvm.internal.m.e(value, "value");
        this.a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && kotlin.jvm.internal.m.a(this.a, ((e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a1.b.p("OnPasswordChanged(value=", this.a, ")");
    }
}
