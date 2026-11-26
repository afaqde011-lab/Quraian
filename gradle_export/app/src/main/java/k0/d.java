package k0;

public final class d {

    public final long f8459a;

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f8459a == ((d) obj).f8459a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8459a);
    }

    public final String toString() {
        return "GridItemSpan(packedValue=" + this.f8459a + ')';
    }
}
