package g1;

public final class a0 {

    public final float f5704a;

    public final float f5705b;

    public final float f5706c;

    public final float f5707d;

    public final float f5708e;

    public a0(float f3, float f10, float f11, float f12, float f13, float f14) {
        this.f5704a = f3;
        this.f5705b = f10;
        this.f5706c = f11;
        this.f5707d = f12;
        this.f5708e = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return y3.f.b(this.f5704a, a0Var.f5704a) && y3.f.b(this.f5705b, a0Var.f5705b) && y3.f.b(this.f5706c, a0Var.f5706c) && y3.f.b(this.f5707d, a0Var.f5707d) && y3.f.b(this.f5708e, a0Var.f5708e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f5708e) + w.c.c(this.f5707d, w.c.c(this.f5706c, w.c.c(this.f5705b, Float.hashCode(this.f5704a) * 31, 31), 31), 31);
    }
}
