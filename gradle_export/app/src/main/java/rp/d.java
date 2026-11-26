package rp;

public final class d implements f {
    public final String a;

    public d(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && kotlin.jvm.internal.m.a(this.a, ((d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a1.b.p("ShowError(message=", this.a, ")");
    }
}
