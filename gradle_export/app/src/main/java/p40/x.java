package p40;

public final class x extends t0 {
    public static final x c = new x(y.a);

    @Override
    public final int d(Object obj) {
        float[] fArr = (float[]) obj;
        kotlin.jvm.internal.m.e(fArr, "<this>");
        return fArr.length;
    }

    @Override
    public final void f(o40.a aVar, int i, Object obj) {
        w builder = (w) obj;
        kotlin.jvm.internal.m.e(builder, "builder");
        float fX = aVar.x(this.b, i);
        builder.b(builder.d() + 1);
        float[] fArr = builder.a;
        int i2 = builder.b;
        builder.b = i2 + 1;
        fArr[i2] = fX;
    }

    @Override
    public final Object g(Object obj) {
        float[] fArr = (float[]) obj;
        kotlin.jvm.internal.m.e(fArr, "<this>");
        w wVar = new w();
        wVar.a = fArr;
        wVar.b = fArr.length;
        wVar.b(10);
        return wVar;
    }

    @Override
    public final Object j() {
        return new float[0];
    }

    @Override
    public final void k(o40.b encoder, Object obj, int i) {
        float[] content = (float[]) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.s(this.b, i2, content[i2]);
        }
    }
}
