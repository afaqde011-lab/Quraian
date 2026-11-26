package bv;

public final class s implements g1 {
    public final int a;

    public s(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && this.a == ((s) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return g4.c.i("OnLyricsAyahSelected(ayah=", this.a, ")");
    }
}
