package x;

public final class n extends o {

    public float f16317a;

    public float f16318b;

    public float f16319c;

    public float f16320d;

    public n(float f3, float f10, float f11, float f12) {
        this.f16317a = f3;
        this.f16318b = f10;
        this.f16319c = f11;
        this.f16320d = f12;
    }

    @Override
    public final float a(int i10) {
        if (i10 == 0) {
            return this.f16317a;
        }
        if (i10 == 1) {
            return this.f16318b;
        }
        if (i10 == 2) {
            return this.f16319c;
        }
        if (i10 != 3) {
            return 0.0f;
        }
        return this.f16320d;
    }

    @Override
    public final int b() {
        return 4;
    }

    @Override
    public final o c() {
        return new n(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override
    public final void d() {
        this.f16317a = 0.0f;
        this.f16318b = 0.0f;
        this.f16319c = 0.0f;
        this.f16320d = 0.0f;
    }

    @Override
    public final void e(float f3, int i10) {
        if (i10 == 0) {
            this.f16317a = f3;
            return;
        }
        if (i10 == 1) {
            this.f16318b = f3;
        } else if (i10 == 2) {
            this.f16319c = f3;
        } else {
            if (i10 != 3) {
                return;
            }
            this.f16320d = f3;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return nVar.f16317a == this.f16317a && nVar.f16318b == this.f16318b && nVar.f16319c == this.f16319c && nVar.f16320d == this.f16320d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16320d) + w.c.c(this.f16319c, w.c.c(this.f16318b, Float.hashCode(this.f16317a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f16317a + ", v2 = " + this.f16318b + ", v3 = " + this.f16319c + ", v4 = " + this.f16320d;
    }
}
