package w;

public final class z0 {

    public final float f15825a;

    public final x.y f15826b;

    public z0(float f3, x.y yVar) {
        this.f15825a = f3;
        this.f15826b = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return Float.compare(this.f15825a, z0Var.f15825a) == 0 && kotlin.jvm.internal.m.a(this.f15826b, z0Var.f15826b);
    }

    public final int hashCode() {
        return this.f15826b.hashCode() + (Float.hashCode(this.f15825a) * 31);
    }

    public final String toString() {
        return "Fade(alpha=" + this.f15825a + ", animationSpec=" + this.f15826b + ')';
    }
}
