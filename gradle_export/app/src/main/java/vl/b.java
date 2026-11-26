package vl;

public final class b {
    public final r a;
    public final a b;

    public b(r rVar, a aVar) {
        this.a = rVar;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.m.a(this.a, bVar.a) && this.b == bVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ParsedSiteLink(link=" + this.a + ", entry=" + this.b + ")";
    }
}
