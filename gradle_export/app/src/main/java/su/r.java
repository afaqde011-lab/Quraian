package su;

public final class r {
    public final s a;
    public final k b;

    public r(s sVar, k kVar) {
        this.a = sVar;
        this.b = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return kotlin.jvm.internal.m.a(this.a, rVar.a) && kotlin.jvm.internal.m.a(this.b, rVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Transition(session=" + this.a + ", effect=" + this.b + ")";
    }
}
