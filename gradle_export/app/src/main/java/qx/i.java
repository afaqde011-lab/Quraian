package qx;

public final class i implements j {
    public final float a;

    public i(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && y3.f.b(this.a, ((i) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return a1.b.p("OnTopContentHeightChanged(value=", y3.f.c(this.a), ")");
    }
}
