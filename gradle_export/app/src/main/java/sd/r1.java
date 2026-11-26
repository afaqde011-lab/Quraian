package sd;

public final class r1 {

    public final float f14076a;

    public final float f14077b;

    public float f14078c;

    public float f14079d;

    public boolean f14080e = false;

    public r1(float f3, float f10, float f11, float f12) {
        this.f14078c = 0.0f;
        this.f14079d = 0.0f;
        this.f14076a = f3;
        this.f14077b = f10;
        double dSqrt = Math.sqrt((f12 * f12) + (f11 * f11));
        if (dSqrt != 0.0d) {
            this.f14078c = (float) (((double) f11) / dSqrt);
            this.f14079d = (float) (((double) f12) / dSqrt);
        }
    }

    public final void a(float f3, float f10) {
        float f11 = f3 - this.f14076a;
        float f12 = f10 - this.f14077b;
        double dSqrt = Math.sqrt((f12 * f12) + (f11 * f11));
        if (dSqrt != 0.0d) {
            f11 = (float) (((double) f11) / dSqrt);
            f12 = (float) (((double) f12) / dSqrt);
        }
        float f13 = this.f14078c;
        if (f11 != (-f13) || f12 != (-this.f14079d)) {
            this.f14078c = f13 + f11;
            this.f14079d += f12;
        } else {
            this.f14080e = true;
            this.f14078c = -f12;
            this.f14079d = f11;
        }
    }

    public final void b(r1 r1Var) {
        float f3 = r1Var.f14078c;
        float f10 = this.f14078c;
        if (f3 == (-f10)) {
            float f11 = r1Var.f14079d;
            if (f11 == (-this.f14079d)) {
                this.f14080e = true;
                this.f14078c = -f11;
                this.f14079d = r1Var.f14078c;
                return;
            }
        }
        this.f14078c = f10 + f3;
        this.f14079d += r1Var.f14079d;
    }

    public final String toString() {
        return "(" + this.f14076a + "," + this.f14077b + " " + this.f14078c + "," + this.f14079d + ")";
    }
}
