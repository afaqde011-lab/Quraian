package bv;

public final class u implements g1 {
    public final int a;

    public u(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && this.a == ((u) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return g4.c.i("OnLyricsTextSizeStepChanged(step=", this.a, ")");
    }
}
