package su;

public final class i implements k {
    public final long a;

    public i(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.a == ((i) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return oi.k.i("Restart(positionMs=", this.a, ")");
    }
}
