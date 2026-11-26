package h0;

import android.graphics.RenderEffect;
import android.graphics.Shader;
import c3.y2;

public final class g1 implements u00.k {
    public final int A;
    public final float B;
    public final float C;

    public g1(float f3, float f10, int i10) {
        this.A = i10;
        this.B = f3;
        this.C = f10;
    }

    public final Object invoke(Object obj) {
        i2.k kVar;
        switch (this.A) {
            case 0:
                c3.d2 d2Var = (c3.d2) obj;
                d2Var.f2644a = "offset";
                y2 y2Var = d2Var.f2646c;
                y2Var.c(new y3.f(this.B), "x");
                y2Var.c(new y3.f(this.C), "y");
                break;
            case 1:
                c3.d2 d2Var2 = (c3.d2) obj;
                d2Var2.f2644a = "absoluteOffset";
                y2 y2Var2 = d2Var2.f2646c;
                y2Var2.c(new y3.f(this.B), "x");
                y2Var2.c(new y3.f(this.C), "y");
                break;
            case 2:
                c3.d2 d2Var3 = (c3.d2) obj;
                d2Var3.f2644a = "padding";
                y2 y2Var3 = d2Var3.f2646c;
                y2Var3.c(new y3.f(this.B), "horizontal");
                y2Var3.c(new y3.f(this.C), "vertical");
                break;
            default:
                i2.c0 c0Var = (i2.c0) obj;
                kotlin.jvm.internal.m.e(c0Var, "$this$graphicsLayer");
                c0Var.s0(this.B);
                float f3 = this.C;
                if (f3 > 0.5f) {
                    RenderEffect renderEffectCreateBlurEffect = RenderEffect.createBlurEffect(f3, f3, Shader.TileMode.CLAMP);
                    kotlin.jvm.internal.m.d(renderEffectCreateBlurEffect, "createBlurEffect(...)");
                    kVar = new i2.k(renderEffectCreateBlurEffect);
                } else {
                    kVar = null;
                }
                c0Var.I(kVar);
                break;
        }
        return g00.b0.a;
    }
}
