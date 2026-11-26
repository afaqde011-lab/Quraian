package ur;

public final class n0 implements p0 {
    public final int a;

    public n0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && this.a == ((n0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return g4.c.i("OnToggleNewReciterFavorite(reciterId=", this.a, ")");
    }
}
