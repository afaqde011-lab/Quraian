package qk;

public final class b {

    public static final b f13038c = new b(0.0d, 0.0d);

    public final double f13039a;

    public final double f13040b;

    public b(double d3, double d5) {
        this.f13039a = d3;
        this.f13040b = d5;
    }

    public final b a(double d3) {
        return new b(this.f13039a * d3, this.f13040b * d3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Double.compare(this.f13039a, bVar.f13039a) == 0 && Double.compare(this.f13040b, bVar.f13040b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f13040b) + (Double.hashCode(this.f13039a) * 31);
    }

    public final String toString() {
        return "Point(x=" + this.f13039a + ", y=" + this.f13040b + ")";
    }
}
