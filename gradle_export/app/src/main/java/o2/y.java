package o2;

public final class y extends b0 {

    public final float f11655c;

    public final float f11656d;

    public y(float f3, float f10) {
        super(1);
        this.f11655c = f3;
        this.f11656d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Float.compare(this.f11655c, yVar.f11655c) == 0 && Float.compare(this.f11656d, yVar.f11656d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11656d) + (Float.hashCode(this.f11655c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb2.append(this.f11655c);
        sb2.append(", dy=");
        return w.c.k(sb2, this.f11656d, ')');
    }
}
