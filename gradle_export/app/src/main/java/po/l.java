package po;

import h0.p1;
import i2.b0;
import i2.c0;
import l1.p2;

public final class l implements u00.k {
    public final float A;
    public final p2 B;

    public l(float f, p2 p2Var) {
        this.A = f;
        this.B = p2Var;
    }

    @Override
    public final Object invoke(Object obj) {
        c0 graphicsLayer = (c0) obj;
        kotlin.jvm.internal.m.e(graphicsLayer, "$this$graphicsLayer");
        p1 p1Var = m.a;
        p2 p2Var = this.B;
        graphicsLayer.I0(((Number) p2Var.getValue()).floatValue());
        graphicsLayer.N(((Number) p2Var.getValue()).floatValue());
        graphicsLayer.S0(b0.h(this.A, 0.5f));
        return g00.b0.a;
    }
}
