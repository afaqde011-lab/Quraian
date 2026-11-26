package y3;

public final class d implements c {
    public final float A;
    public final float B;

    public d(float f3, float f10) {
        this.A = f3;
        this.B = f10;
    }

    @Override
    public final float c() {
        return this.A;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.A, dVar.A) == 0 && Float.compare(this.B, dVar.B) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.B) + (Float.hashCode(this.A) * 31);
    }

    @Override
    public final float t0() {
        return this.B;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DensityImpl(density=");
        sb2.append(this.A);
        sb2.append(", fontScale=");
        return w.c.k(sb2, this.B, ')');
    }
}
