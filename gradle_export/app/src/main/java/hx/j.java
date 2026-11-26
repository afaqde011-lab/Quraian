package hx;

public final class j implements l {
    public final String a;

    public j(String value) {
        kotlin.jvm.internal.m.e(value, "value");
        this.a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && kotlin.jvm.internal.m.a(this.a, ((j) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a1.b.p("OnSearchQueryChanged(value=", this.a, ")");
    }
}
