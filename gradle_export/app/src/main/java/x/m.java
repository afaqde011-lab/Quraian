package x;

public final class m extends o {

    public float f16313a;

    public float f16314b;

    public float f16315c;

    public m(float f3, float f10, float f11) {
        this.f16313a = f3;
        this.f16314b = f10;
        this.f16315c = f11;
    }

    @Override
    public final float a(int i10) {
        if (i10 == 0) {
            return this.f16313a;
        }
        if (i10 == 1) {
            return this.f16314b;
        }
        if (i10 != 2) {
            return 0.0f;
        }
        return this.f16315c;
    }

    @Override
    public final int b() {
        return 3;
    }

    @Override
    public final o c() {
        return new m(0.0f, 0.0f, 0.0f);
    }

    @Override
    public final void d() {
        this.f16313a = 0.0f;
        this.f16314b = 0.0f;
        this.f16315c = 0.0f;
    }

    @Override
    public final void e(float f3, int i10) {
        if (i10 == 0) {
            this.f16313a = f3;
        } else if (i10 == 1) {
            this.f16314b = f3;
        } else {
            if (i10 != 2) {
                return;
            }
            this.f16315c = f3;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return mVar.f16313a == this.f16313a && mVar.f16314b == this.f16314b && mVar.f16315c == this.f16315c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16315c) + w.c.c(this.f16314b, Float.hashCode(this.f16313a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f16313a + ", v2 = " + this.f16314b + ", v3 = " + this.f16315c;
    }
}
