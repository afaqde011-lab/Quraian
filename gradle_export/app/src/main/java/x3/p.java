package x3;

public final class p {

    public static final p f16423c = new p(1.0f, 0.0f);

    public final float f16424a;

    public final float f16425b;

    public p(float f3, float f10) {
        this.f16424a = f3;
        this.f16425b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f16424a == pVar.f16424a && this.f16425b == pVar.f16425b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16425b) + (Float.hashCode(this.f16424a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextGeometricTransform(scaleX=");
        sb2.append(this.f16424a);
        sb2.append(", skewX=");
        return w.c.k(sb2, this.f16425b, ')');
    }
}
