package p0;

import c3.a2;

public final class d implements b, a2 {
    public final float A;

    public d(float f3) {
        this.A = f3;
        if (f3 < 0.0f || f3 > 100.0f) {
            g0.a.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override
    public final float a(long j9, y3.c cVar) {
        return (this.A / 100.0f) * h2.e.d(j9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Float.compare(this.A, ((d) obj).A) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.A);
    }

    public final String toString() {
        return "CornerSize(size = " + this.A + "%)";
    }
}
