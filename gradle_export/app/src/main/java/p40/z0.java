package p40;

public final class z0 extends t0 {
    public static final z0 c = new z0(a1.a);

    @Override
    public final int d(Object obj) {
        short[] sArr = (short[]) obj;
        kotlin.jvm.internal.m.e(sArr, "<this>");
        return sArr.length;
    }

    @Override
    public final void f(o40.a aVar, int i, Object obj) {
        y0 builder = (y0) obj;
        kotlin.jvm.internal.m.e(builder, "builder");
        short sH = aVar.h(this.b, i);
        builder.b(builder.d() + 1);
        short[] sArr = builder.a;
        int i2 = builder.b;
        builder.b = i2 + 1;
        sArr[i2] = sH;
    }

    @Override
    public final Object g(Object obj) {
        short[] sArr = (short[]) obj;
        kotlin.jvm.internal.m.e(sArr, "<this>");
        y0 y0Var = new y0();
        y0Var.a = sArr;
        y0Var.b = sArr.length;
        y0Var.b(10);
        return y0Var;
    }

    @Override
    public final Object j() {
        return new short[0];
    }

    @Override
    public final void k(o40.b encoder, Object obj, int i) {
        short[] content = (short[]) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.r(this.b, i2, content[i2]);
        }
    }
}
