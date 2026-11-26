package j2;

public final class s {

    public final double f7917a;

    public final double f7918b;

    public final double f7919c;

    public final double f7920d;

    public final double f7921e;

    public final double f7922f;

    public final double f7923g;

    public s(double d3, double d5, double d10, double d11, double d12) {
        this(d3, d5, d10, d11, d12, 0.0d, 0.0d);
    }

    public s(double d3, double d5, double d10, double d11, double d12, double d13, double d14) {
        this.f7917a = d3;
        this.f7918b = d5;
        this.f7919c = d10;
        this.f7920d = d11;
        this.f7921e = d12;
        this.f7922f = d13;
        this.f7923g = d14;
        if (Double.isNaN(d5) || Double.isNaN(d10) || Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d3)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d3 == -2.0d || d3 == -3.0d) {
            return;
        }
        if (d12 < 0.0d || d12 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d12);
        }
        if (d12 == 0.0d && (d5 == 0.0d || d3 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d12 >= 1.0d && d11 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d5 == 0.0d || d3 == 0.0d) && d11 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d11 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d5 < 0.0d || d3 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Double.compare(this.f7917a, sVar.f7917a) == 0 && Double.compare(this.f7918b, sVar.f7918b) == 0 && Double.compare(this.f7919c, sVar.f7919c) == 0 && Double.compare(this.f7920d, sVar.f7920d) == 0 && Double.compare(this.f7921e, sVar.f7921e) == 0 && Double.compare(this.f7922f, sVar.f7922f) == 0 && Double.compare(this.f7923g, sVar.f7923g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f7923g) + ((Double.hashCode(this.f7922f) + ((Double.hashCode(this.f7921e) + ((Double.hashCode(this.f7920d) + ((Double.hashCode(this.f7919c) + ((Double.hashCode(this.f7918b) + (Double.hashCode(this.f7917a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f7917a + ", a=" + this.f7918b + ", b=" + this.f7919c + ", c=" + this.f7920d + ", d=" + this.f7921e + ", e=" + this.f7922f + ", f=" + this.f7923g + ')';
    }
}
