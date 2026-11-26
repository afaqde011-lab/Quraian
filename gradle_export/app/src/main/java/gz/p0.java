package gz;

public final class p0 implements v0 {
    public final String a;

    public p0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0) && kotlin.jvm.internal.m.a(this.a, ((p0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a1.b.p("OpenWebUrl(url=", this.a, ")");
    }
}
