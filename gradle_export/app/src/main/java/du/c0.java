package du;

public final class c0 implements f0 {
    public final ah.a a;

    public c0(ah.a aVar) {
        this.a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && kotlin.jvm.internal.m.a(this.a, ((c0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LaunchReview(info=" + this.a + ")";
    }
}
