package w;

public final class d {

    public final float f15746a;

    public final float f15747b;

    public d(float f3, float f10) {
        this.f15746a = f3;
        this.f15747b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f15746a, dVar.f15746a) == 0 && Float.compare(this.f15747b, dVar.f15747b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15747b) + (Float.hashCode(this.f15746a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlingResult(distanceCoefficient=");
        sb2.append(this.f15746a);
        sb2.append(", velocityCoefficient=");
        return c.k(sb2, this.f15747b, ')');
    }
}
