package sg;

import qd.s0;

public final class k extends s0 {
    @Override
    public final void f0(u uVar, float f3, float f10) {
        float f11 = f10 * f3;
        uVar.d(f11, 180.0f, 90.0f);
        float f12 = f11 * 2.0f;
        q qVar = new q(0.0f, 0.0f, f12, f12);
        qVar.f14201f = 180.0f;
        qVar.f14202g = 90.0f;
        uVar.f14211f.add(qVar);
        o oVar = new o(qVar);
        uVar.a(180.0f);
        uVar.f14212g.add(oVar);
        uVar.f14209d = 270.0f;
        float f13 = (0.0f + f12) * 0.5f;
        float f14 = (f12 - 0.0f) / 2.0f;
        double d3 = 270.0f;
        uVar.f14207b = (((float) Math.cos(Math.toRadians(d3))) * f14) + f13;
        uVar.f14208c = (f14 * ((float) Math.sin(Math.toRadians(d3)))) + f13;
    }
}
