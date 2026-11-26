package w40;

public final class d {
    public final int a;
    public final float b;

    static {
        new d(4.0f, 6, 4);
        new d(0.0f, 8, 6);
        new d(6.0f, 10, 4);
    }

    public d(float f, int i, int i2) {
        f = (i2 & 2) != 0 ? 5.0f : f;
        this.a = i;
        this.b = f;
        if (f != 0.0f) {
            return;
        }
        throw new IllegalArgumentException(("mass=" + f + " must be != 0").toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a == dVar.a && Float.compare(this.b, dVar.b) == 0 && Float.compare(0.2f, 0.2f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(0.2f) + w.c.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "Size(sizeInDp=" + this.a + ", mass=" + this.b + ", massVariance=0.2)";
    }
}
