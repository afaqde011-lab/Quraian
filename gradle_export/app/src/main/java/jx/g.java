package jx;

public final class g implements j {
    public final float a;

    public g(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && y3.f.b(this.a, ((g) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return a1.b.p("OnTitleTextHeightChanged(value=", y3.f.c(this.a), ")");
    }
}
