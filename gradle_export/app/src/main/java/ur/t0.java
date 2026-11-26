package ur;

public final class t0 implements x0 {
    public final oq.a a;

    public t0(oq.a aVar) {
        this.a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t0) && kotlin.jvm.internal.m.a(this.a, ((t0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Share(content=" + this.a + ")";
    }
}
