package cy;

public final class b implements d {
    public final int a;
    public final String b;

    public b(int i) {
        this.a = i;
        this.b = g4.c.f(i, "reciter-");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.a == ((b) obj).a;
    }

    @Override
    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return g4.c.i("Reciter(reciterId=", this.a, ")");
    }
}
