package bv;

public final class k1 implements u00.k {
    public final int A;
    public final l1.p2 B;

    public k1(l1.p2 p2Var, int i) {
        this.A = i;
        this.B = p2Var;
    }

    @Override
    public final Object invoke(Object obj) {
        i2.c0 graphicsLayer = (i2.c0) obj;
        switch (this.A) {
            case 0:
                kotlin.jvm.internal.m.e(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.s0(((Number) this.B.getValue()).floatValue());
                break;
            case 1:
                kotlin.jvm.internal.m.e(graphicsLayer, "$this$graphicsLayer");
                l1.p2 p2Var = this.B;
                graphicsLayer.I0(((Number) p2Var.getValue()).floatValue());
                graphicsLayer.N(((Number) p2Var.getValue()).floatValue());
                break;
            case 2:
                graphicsLayer.s0(((Number) this.B.getValue()).floatValue());
                break;
            case 3:
                kotlin.jvm.internal.m.e(graphicsLayer, "$this$graphicsLayer");
                l1.p2 p2Var2 = this.B;
                graphicsLayer.s0(((Number) p2Var2.getValue()).floatValue());
                graphicsLayer.w(graphicsLayer.c() * 24 * (-(1.0f - ((Number) p2Var2.getValue()).floatValue())));
                break;
            case 4:
                kotlin.jvm.internal.m.e(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.s0(((Number) this.B.getValue()).floatValue());
                break;
            case 5:
                kotlin.jvm.internal.m.e(graphicsLayer, "$this$graphicsLayer");
                l1.p2 p2Var3 = this.B;
                graphicsLayer.s0(1.0f - ((Number) p2Var3.getValue()).floatValue());
                float fFloatValue = 1.0f - (((Number) p2Var3.getValue()).floatValue() * 0.100000024f);
                graphicsLayer.I0(fFloatValue);
                graphicsLayer.N(fFloatValue);
                break;
            case 6:
                kotlin.jvm.internal.m.e(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.s0(1.0f - ((Number) this.B.getValue()).floatValue());
                break;
            case 7:
                kotlin.jvm.internal.m.e(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.T0(((Number) this.B.getValue()).floatValue());
                break;
            default:
                kotlin.jvm.internal.m.e(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.T0(((Number) this.B.getValue()).floatValue());
                break;
        }
        return g00.b0.a;
    }
}
