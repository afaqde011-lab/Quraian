package p0;

import c3.a2;

public final class c implements b, a2 {
    public final float A;

    public c(float f3) {
        this.A = f3;
    }

    @Override
    public final float a(long j9, y3.c cVar) {
        return cVar.A0(this.A);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && y3.f.b(this.A, ((c) obj).A);
    }

    public final int hashCode() {
        return Float.hashCode(this.A);
    }

    public final String toString() {
        return "CornerSize(size = " + this.A + ".dp)";
    }
}
