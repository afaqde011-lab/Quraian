package o2;

public final class u extends b0 {

    public final float f11643c;

    public final float f11644d;

    public u(float f3, float f10) {
        super(3);
        this.f11643c = f3;
        this.f11644d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Float.compare(this.f11643c, uVar.f11643c) == 0 && Float.compare(this.f11644d, uVar.f11644d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11644d) + (Float.hashCode(this.f11643c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeLineTo(dx=");
        sb2.append(this.f11643c);
        sb2.append(", dy=");
        return w.c.k(sb2, this.f11644d, ')');
    }
}
