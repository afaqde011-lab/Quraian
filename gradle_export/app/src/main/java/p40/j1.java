package p40;

public final class j1 extends t0 {
    public static final j1 c = new j1(k1.a);

    @Override
    public final int d(Object obj) {
        long[] collectionSize = ((g00.x) obj).A;
        kotlin.jvm.internal.m.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override
    public final void f(o40.a aVar, int i, Object obj) {
        i1 builder = (i1) obj;
        kotlin.jvm.internal.m.e(builder, "builder");
        long jU = aVar.z(this.b, i).u();
        builder.b(builder.d() + 1);
        long[] jArr = builder.a;
        int i2 = builder.b;
        builder.b = i2 + 1;
        jArr[i2] = jU;
    }

    @Override
    public final Object g(Object obj) {
        long[] toBuilder = ((g00.x) obj).A;
        kotlin.jvm.internal.m.e(toBuilder, "$this$toBuilder");
        i1 i1Var = new i1();
        i1Var.a = toBuilder;
        i1Var.b = toBuilder.length;
        i1Var.b(10);
        return i1Var;
    }

    @Override
    public final Object j() {
        return new g00.x(new long[0]);
    }

    @Override
    public final void k(o40.b encoder, Object obj, int i) {
        long[] jArr = ((g00.x) obj).A;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.m(this.b, i2).z(jArr[i2]);
        }
    }
}
