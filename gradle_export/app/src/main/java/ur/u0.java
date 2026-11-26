package ur;

public final class u0 implements x0 {
    public final String a;

    public u0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u0) && kotlin.jvm.internal.m.a(this.a, ((u0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a1.b.p("ShowToast(message=", this.a, ")");
    }
}
