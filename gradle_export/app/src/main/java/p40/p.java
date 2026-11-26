package p40;

public final class p extends t0 {
    public static final p c = new p(q.a);

    @Override
    public final int d(Object obj) {
        double[] dArr = (double[]) obj;
        kotlin.jvm.internal.m.e(dArr, "<this>");
        return dArr.length;
    }

    @Override
    public final void f(o40.a aVar, int i, Object obj) {
        o builder = (o) obj;
        kotlin.jvm.internal.m.e(builder, "builder");
        double dA = aVar.A(this.b, i);
        builder.b(builder.d() + 1);
        double[] dArr = builder.a;
        int i2 = builder.b;
        builder.b = i2 + 1;
        dArr[i2] = dA;
    }

    @Override
    public final Object g(Object obj) {
        double[] dArr = (double[]) obj;
        kotlin.jvm.internal.m.e(dArr, "<this>");
        o oVar = new o();
        oVar.a = dArr;
        oVar.b = dArr.length;
        oVar.b(10);
        return oVar;
    }

    @Override
    public final Object j() {
        return new double[0];
    }

    @Override
    public final void k(o40.b encoder, Object obj, int i) {
        double[] content = (double[]) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.B(this.b, i2, content[i2]);
        }
    }
}
