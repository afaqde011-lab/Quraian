package p40;

public final class g1 extends t0 {
    public static final g1 c = new g1(h1.a);

    @Override
    public final int d(Object obj) {
        int[] collectionSize = ((g00.v) obj).A;
        kotlin.jvm.internal.m.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override
    public final void f(o40.a aVar, int i, Object obj) {
        f1 builder = (f1) obj;
        kotlin.jvm.internal.m.e(builder, "builder");
        int iN = aVar.z(this.b, i).n();
        builder.b(builder.d() + 1);
        int[] iArr = builder.a;
        int i2 = builder.b;
        builder.b = i2 + 1;
        iArr[i2] = iN;
    }

    @Override
    public final Object g(Object obj) {
        int[] toBuilder = ((g00.v) obj).A;
        kotlin.jvm.internal.m.e(toBuilder, "$this$toBuilder");
        f1 f1Var = new f1();
        f1Var.a = toBuilder;
        f1Var.b = toBuilder.length;
        f1Var.b(10);
        return f1Var;
    }

    @Override
    public final Object j() {
        return new g00.v(new int[0]);
    }

    @Override
    public final void k(o40.b encoder, Object obj, int i) {
        int[] iArr = ((g00.v) obj).A;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.m(this.b, i2).v(iArr[i2]);
        }
    }
}
