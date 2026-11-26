package oo;

public final class i implements a0 {
    public final String a;

    public i(String code) {
        kotlin.jvm.internal.m.e(code, "code");
        this.a = code;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && kotlin.jvm.internal.m.a(this.a, ((i) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a1.b.p("OnLanguageSelected(code=", this.a, ")");
    }
}
