package oo;

public final class i0 implements u00.a {
    public final int A;
    public final float B;

    public i0(float f, int i) {
        this.A = i;
        this.B = f;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                return Float.valueOf(this.B);
            case 1:
                return new mk.a(1, new mk.f(i2.t.b(this.B, i2.t.c), 14), 6);
            default:
                float f = this.B;
                return Float.valueOf(f < 0.0f ? ab.a0.x(0.35f - (8.7499997E-4f * (-f)), 0.0f, 0.35f) : 0.35f);
        }
    }
}
