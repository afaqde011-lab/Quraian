package b2;

public final class h {

    public final float f1981a;

    public h(float f3) {
        this.f1981a = f3;
    }

    public final int a(int i10, int i11) {
        return Math.round((1 + this.f1981a) * ((i11 - i10) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Float.compare(this.f1981a, ((h) obj).f1981a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1981a);
    }

    public final String toString() {
        return w.c.k(new StringBuilder("Vertical(bias="), this.f1981a, ')');
    }
}
