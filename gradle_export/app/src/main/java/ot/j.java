package ot;

public final class j implements n {
    public final String a;

    public j(String str) {
        this.a = str;
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
        return a1.b.p("Failed(message=", this.a, ")");
    }
}
