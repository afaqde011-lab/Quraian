package g1;

public final class p4 implements u00.k {
    public final int A;
    public final x.b B;

    public p4(x.b bVar, int i11) {
        this.A = i11;
        this.B = bVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                i2.c0 c0Var = (i2.c0) obj;
                float fFloatValue = ((Number) this.B.d()).floatValue();
                float fD = t4.d(c0Var, fFloatValue);
                float fE = t4.e(c0Var, fFloatValue);
                c0Var.N(fE == 0.0f ? 1.0f : fD / fE);
                c0Var.S0(t4.f8036c);
                break;
            case 1:
                y3.c offset = (y3.c) obj;
                kotlin.jvm.internal.m.e(offset, "$this$offset");
                return new y3.j((((long) w00.a.F(((Number) this.B.d()).floatValue())) << 32) | (((long) 0) & 4294967295L));
            default:
                i2.c0 graphicsLayer = (i2.c0) obj;
                kotlin.jvm.internal.m.e(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.v(((Number) this.B.d()).floatValue());
                break;
        }
        return g00.b0.f7770a;
    }
}
