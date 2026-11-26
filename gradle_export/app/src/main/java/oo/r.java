package oo;

public final class r implements a0 {
    public final long a;

    public r(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && this.a == ((r) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return oi.k.i("OnSeek(positionMs=", this.a, ")");
    }
}
