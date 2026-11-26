package zy;

public final class b implements e {
    public final String a;

    public b(String value) {
        kotlin.jvm.internal.m.e(value, "value");
        this.a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && kotlin.jvm.internal.m.a(this.a, ((b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a1.b.p("OnCodeChanged(value=", this.a, ")");
    }
}
