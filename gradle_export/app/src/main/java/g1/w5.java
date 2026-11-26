package g1;

public final class w5 {

    public final long f6023a = i2.t.f7167g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w5) {
            return i2.t.c(this.f6023a, ((w5) obj).f6023a);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = i2.t.f7168h;
        return Long.hashCode(this.f6023a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) i2.t.i(this.f6023a)) + ", rippleAlpha=null)";
    }
}
