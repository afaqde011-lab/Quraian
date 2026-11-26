package bv;

public final class v implements g1 {
    public final boolean a;

    public v(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && this.a == ((v) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return g4.c.j("OnLyricsUserScrollChanged(isScrolling=", ")", this.a);
    }
}
