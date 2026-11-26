package gz;

public final class s0 implements v0 {
    public final String a;

    public s0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s0) && kotlin.jvm.internal.m.a(this.a, ((s0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a1.b.p("ShowToast(message=", this.a, ")");
    }
}
