package sg;

import qd.s0;

public final class e extends s0 {
    @Override
    public final void f0(u uVar, float f3, float f10) {
        float f11 = f10 * f3;
        uVar.d(f11, 180.0f, 90.0f);
        double d3 = f11;
        uVar.c((float) (Math.sin(Math.toRadians(90.0f)) * d3), (float) (Math.sin(Math.toRadians(0.0f)) * d3));
    }
}
