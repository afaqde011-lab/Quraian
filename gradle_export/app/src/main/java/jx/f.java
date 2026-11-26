package jx;

public final class f implements j {
    public final String a;

    public f(String value) {
        kotlin.jvm.internal.m.e(value, "value");
        this.a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && kotlin.jvm.internal.m.a(this.a, ((f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a1.b.p("OnSearchQueryChanged(value=", this.a, ")");
    }
}
