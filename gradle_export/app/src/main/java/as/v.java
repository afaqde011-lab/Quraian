package as;

public final class v implements w {
    public final oq.a a;

    public v(oq.a aVar) {
        this.a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && kotlin.jvm.internal.m.a(this.a, ((v) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Share(content=" + this.a + ")";
    }
}
