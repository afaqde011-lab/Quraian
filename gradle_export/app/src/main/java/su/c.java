package su;

public final class c {
    public final b a;
    public final e b;

    public c(b bVar, e repeatCount) {
        kotlin.jvm.internal.m.e(repeatCount, "repeatCount");
        this.a = bVar;
        this.b = repeatCount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.m.a(this.a, cVar.a) && this.b == cVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MemorizationPlan(block=" + this.a + ", repeatCount=" + this.b + ")";
    }
}
