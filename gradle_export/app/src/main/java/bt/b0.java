package bt;

public final class b0 implements g0 {
    public final int a;

    public b0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && this.a == ((b0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return g4.c.i("OpenReciter(reciterId=", this.a, ")");
    }
}
