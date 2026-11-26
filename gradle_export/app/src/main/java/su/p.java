package su;

public final class p implements q {
    public final long a;

    public p(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && this.a == ((p) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return oi.k.i("SeekRequested(positionMs=", this.a, ")");
    }
}
