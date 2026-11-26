package oo;

public final class l implements a0 {
    public final long a;

    public l(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && this.a == ((l) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return oi.k.i("OnParagraphClicked(startMs=", this.a, ")");
    }
}
