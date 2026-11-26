package sd;

import android.graphics.Path;

public final class s1 implements j0 {

    public final Path f14082a = new Path();

    public float f14083b;

    public float f14084c;

    public s1(com.google.android.gms.internal.play_billing.q1 q1Var) {
        if (q1Var == null) {
            return;
        }
        q1Var.z(this);
    }

    @Override
    public final void a(float f3, float f10, float f11, float f12) {
        this.f14082a.quadTo(f3, f10, f11, f12);
        this.f14083b = f11;
        this.f14084c = f12;
    }

    @Override
    public final void b(float f3, float f10) {
        this.f14082a.moveTo(f3, f10);
        this.f14083b = f3;
        this.f14084c = f10;
    }

    @Override
    public final void c(float f3, float f10, float f11, float f12, float f13, float f14) {
        this.f14082a.cubicTo(f3, f10, f11, f12, f13, f14);
        this.f14083b = f13;
        this.f14084c = f14;
    }

    @Override
    public final void close() {
        this.f14082a.close();
    }

    @Override
    public final void d(float f3, float f10, float f11, boolean z10, boolean z11, float f12, float f13) {
        y1.h(this.f14083b, this.f14084c, f3, f10, f11, z10, z11, f12, f13, this);
        this.f14083b = f12;
        this.f14084c = f13;
    }

    @Override
    public final void e(float f3, float f10) {
        this.f14082a.lineTo(f3, f10);
        this.f14083b = f3;
        this.f14084c = f10;
    }
}
