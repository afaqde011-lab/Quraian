package w;

public final class a1 {

    public final float f15736a;

    public final float f15737b;

    public final long f15738c;

    public a1(float f3, float f10, long j9) {
        this.f15736a = f3;
        this.f15737b = f10;
        this.f15738c = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return Float.compare(this.f15736a, a1Var.f15736a) == 0 && Float.compare(this.f15737b, a1Var.f15737b) == 0 && this.f15738c == a1Var.f15738c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15738c) + c.c(this.f15737b, Float.hashCode(this.f15736a) * 31, 31);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.f15736a + ", distance=" + this.f15737b + ", duration=" + this.f15738c + ')';
    }
}
