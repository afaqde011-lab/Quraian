package oo;

import l1.p2;

public final class s0 implements u00.k {
    public final int A;
    public final float B;
    public final p2 C;

    public s0(float f, p2 p2Var, int i) {
        this.A = i;
        this.B = f;
        this.C = p2Var;
    }

    @Override
    public final Object invoke(Object obj) {
        i2.c0 graphicsLayer = (i2.c0) obj;
        switch (this.A) {
            case 0:
                kotlin.jvm.internal.m.e(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.s0(((Number) this.C.getValue()).floatValue());
                float f = this.B;
                graphicsLayer.I0(f);
                graphicsLayer.N(f);
                break;
            default:
                kotlin.jvm.internal.m.e(graphicsLayer, "$this$graphicsLayer");
                p2 p2Var = this.C;
                graphicsLayer.s0(((Number) p2Var.getValue()).floatValue());
                graphicsLayer.T0(Float.intBitsToFloat((int) (graphicsLayer.b() >> 32)) * (1.0f - ((Number) p2Var.getValue()).floatValue()) * this.B);
                break;
        }
        return g00.b0.a;
    }
}
