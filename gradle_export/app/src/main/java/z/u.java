package z;

public final class u {

    public final float f16965a;

    public final i2.v0 f16966b;

    public u(float f3, i2.v0 v0Var) {
        this.f16965a = f3;
        this.f16966b = v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return y3.f.b(this.f16965a, uVar.f16965a) && this.f16966b.equals(uVar.f16966b);
    }

    public final int hashCode() {
        return this.f16966b.hashCode() + (Float.hashCode(this.f16965a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BorderStroke(width=");
        w.c.r(this.f16965a, sb2, ", brush=");
        sb2.append(this.f16966b);
        sb2.append(')');
        return sb2.toString();
    }
}
