package p40;

public final class d1 extends t0 {
    public static final d1 c = new d1(e1.a);

    @Override
    public final int d(Object obj) {
        byte[] collectionSize = ((g00.t) obj).A;
        kotlin.jvm.internal.m.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override
    public final void f(o40.a aVar, int i, Object obj) {
        c1 builder = (c1) obj;
        kotlin.jvm.internal.m.e(builder, "builder");
        byte B = aVar.z(this.b, i).B();
        builder.b(builder.d() + 1);
        byte[] bArr = builder.a;
        int i2 = builder.b;
        builder.b = i2 + 1;
        bArr[i2] = B;
    }

    @Override
    public final Object g(Object obj) {
        byte[] toBuilder = ((g00.t) obj).A;
        kotlin.jvm.internal.m.e(toBuilder, "$this$toBuilder");
        c1 c1Var = new c1();
        c1Var.a = toBuilder;
        c1Var.b = toBuilder.length;
        c1Var.b(10);
        return c1Var;
    }

    @Override
    public final Object j() {
        return new g00.t(new byte[0]);
    }

    @Override
    public final void k(o40.b encoder, Object obj, int i) {
        byte[] bArr = ((g00.t) obj).A;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.m(this.b, i2).g(bArr[i2]);
        }
    }
}
