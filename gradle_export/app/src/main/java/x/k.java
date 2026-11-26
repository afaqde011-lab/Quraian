package x;

public final class k extends o {

    public float f16308a;

    public k(float f3) {
        this.f16308a = f3;
    }

    @Override
    public final float a(int i10) {
        if (i10 == 0) {
            return this.f16308a;
        }
        return 0.0f;
    }

    @Override
    public final int b() {
        return 1;
    }

    @Override
    public final o c() {
        return new k(0.0f);
    }

    @Override
    public final void d() {
        this.f16308a = 0.0f;
    }

    @Override
    public final void e(float f3, int i10) {
        if (i10 == 0) {
            this.f16308a = f3;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof k) && ((k) obj).f16308a == this.f16308a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16308a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f16308a;
    }
}
