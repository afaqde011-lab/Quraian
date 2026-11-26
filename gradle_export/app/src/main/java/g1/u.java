package g1;

public final class u {

    public final float f5993a;

    public final float f5994b;

    public final float f5995c;

    public final float f5996d;

    public final float f5997e;

    public u(float f3, float f10, float f11, float f12, float f13) {
        this.f5993a = f3;
        this.f5994b = f10;
        this.f5995c = f11;
        this.f5996d = f12;
        this.f5997e = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return y3.f.b(this.f5993a, uVar.f5993a) && y3.f.b(this.f5994b, uVar.f5994b) && y3.f.b(this.f5995c, uVar.f5995c) && y3.f.b(this.f5996d, uVar.f5996d) && y3.f.b(this.f5997e, uVar.f5997e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f5997e) + w.c.c(this.f5996d, w.c.c(this.f5995c, w.c.c(this.f5994b, Float.hashCode(this.f5993a) * 31, 31), 31), 31);
    }
}
