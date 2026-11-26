package w;

public final class d1 {

    public final float f15748a;

    public final long f15749b;

    public final x.y f15750c;

    public d1(float f3, long j9, x.y yVar) {
        this.f15748a = f3;
        this.f15749b = j9;
        this.f15750c = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return Float.compare(this.f15748a, d1Var.f15748a) == 0 && i2.w0.a(this.f15749b, d1Var.f15749b) && kotlin.jvm.internal.m.a(this.f15750c, d1Var.f15750c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f15748a) * 31;
        int i10 = i2.w0.f7176c;
        return this.f15750c.hashCode() + c.f(iHashCode, this.f15749b, 31);
    }

    public final String toString() {
        return "Scale(scale=" + this.f15748a + ", transformOrigin=" + ((Object) i2.w0.d(this.f15749b)) + ", animationSpec=" + this.f15750c + ')';
    }
}
