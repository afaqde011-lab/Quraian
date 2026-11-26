package cs;

import c3.d2;
import ca.v;
import com.google.android.gms.internal.measurement.y3;
import i2.b0;
import i2.c0;
import i2.w0;

public final class i implements u00.k {
    public final int A;
    public final float B;

    public i(float f, int i) {
        this.A = i;
        this.B = f;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                c0 graphicsLayer = (c0) obj;
                kotlin.jvm.internal.m.e(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.I0(this.B);
                graphicsLayer.N(1.0f);
                graphicsLayer.S0(w0.b);
                graphicsLayer.L0(false);
                break;
            case 1:
                c0 graphicsLayer2 = (c0) obj;
                kotlin.jvm.internal.m.e(graphicsLayer2, "$this$graphicsLayer");
                graphicsLayer2.s0(this.B);
                break;
            case 2:
                d2 d2Var = (d2) obj;
                d2Var.a = "padding";
                new y3.f(this.B);
                d2Var.getClass();
                break;
            case 3:
                c0 graphicsLayer3 = (c0) obj;
                kotlin.jvm.internal.m.e(graphicsLayer3, "$this$graphicsLayer");
                float f = this.B;
                graphicsLayer3.I0(f);
                graphicsLayer3.N(f);
                break;
            case 4:
                jk.f drawBackdrop = (jk.f) obj;
                kotlin.jvm.internal.m.e(drawBackdrop, "$this$drawBackdrop");
                lk.a.a(drawBackdrop);
                v.p(drawBackdrop, drawBackdrop.A * this.B);
                float f2 = drawBackdrop.A;
                y3.O(drawBackdrop, 12.0f * f2, f2 * 24.0f, 12);
                break;
            case 5:
                c0 placeWithLayer = (c0) obj;
                kotlin.jvm.internal.m.e(placeWithLayer, "$this$placeWithLayer");
                float f3 = this.B;
                placeWithLayer.I0(f3);
                placeWithLayer.N(f3);
                placeWithLayer.S0(b0.h(0.0f, 0.0f));
                break;
            default:
                c0 graphicsLayer4 = (c0) obj;
                kotlin.jvm.internal.m.e(graphicsLayer4, "$this$graphicsLayer");
                graphicsLayer4.T0(this.B);
                break;
        }
        return g00.b0.a;
    }
}
