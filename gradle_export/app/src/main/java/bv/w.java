package bv;

public final class w implements g1 {
    public final boolean a;

    public w(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && this.a == ((w) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return g4.c.j("OnLyricsUserSwipe(isUp=", ")", this.a);
    }
}
