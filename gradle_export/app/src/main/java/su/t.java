package su;

public final class t {
    public final long a;
    public final long b;

    public t(long j, long j2) {
        this.a = j;
        this.b = j2;
        if (j2 <= j) {
            throw new IllegalArgumentException("A window ends after it starts");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.a == tVar.a && this.b == tVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return a1.b.k(this.b, ")", w.c.n("PlaybackWindow(startMs=", this.a, ", endMs="));
    }
}
