package du;

public final class b0 implements f0 {
    public final bu.b a;

    public b0(bu.b bVar) {
        this.a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && kotlin.jvm.internal.m.a(this.a, ((b0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LaunchPremiumPurchase(plan=" + this.a + ")";
    }
}
