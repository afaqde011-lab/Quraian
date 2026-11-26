package su;

public final class f implements k {
    public final long a;

    public f(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.a == ((f) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return oi.k.i("HoldAtEnd(positionMs=", this.a, ")");
    }
}
