package x;

public final class l extends o {

    public float f16309a;

    public float f16310b;

    public l(float f3, float f10) {
        this.f16309a = f3;
        this.f16310b = f10;
    }

    @Override
    public final float a(int i10) {
        if (i10 == 0) {
            return this.f16309a;
        }
        if (i10 != 1) {
            return 0.0f;
        }
        return this.f16310b;
    }

    @Override
    public final int b() {
        return 2;
    }

    @Override
    public final o c() {
        return new l(0.0f, 0.0f);
    }

    @Override
    public final void d() {
        this.f16309a = 0.0f;
        this.f16310b = 0.0f;
    }

    @Override
    public final void e(float f3, int i10) {
        if (i10 == 0) {
            this.f16309a = f3;
        } else {
            if (i10 != 1) {
                return;
            }
            this.f16310b = f3;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return lVar.f16309a == this.f16309a && lVar.f16310b == this.f16310b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16310b) + (Float.hashCode(this.f16309a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f16309a + ", v2 = " + this.f16310b;
    }
}
