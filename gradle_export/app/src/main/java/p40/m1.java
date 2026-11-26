package p40;

public final class m1 extends t0 {
    public static final m1 c = new m1(n1.a);

    @Override
    public final int d(Object obj) {
        short[] collectionSize = ((g00.a0) obj).A;
        kotlin.jvm.internal.m.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override
    public final void f(o40.a aVar, int i, Object obj) {
        l1 builder = (l1) obj;
        kotlin.jvm.internal.m.e(builder, "builder");
        short sC = aVar.z(this.b, i).C();
        builder.b(builder.d() + 1);
        short[] sArr = builder.a;
        int i2 = builder.b;
        builder.b = i2 + 1;
        sArr[i2] = sC;
    }

    @Override
    public final Object g(Object obj) {
        short[] toBuilder = ((g00.a0) obj).A;
        kotlin.jvm.internal.m.e(toBuilder, "$this$toBuilder");
        l1 l1Var = new l1();
        l1Var.a = toBuilder;
        l1Var.b = toBuilder.length;
        l1Var.b(10);
        return l1Var;
    }

    @Override
    public final Object j() {
        return new g00.a0(new short[0]);
    }

    @Override
    public final void k(o40.b encoder, Object obj, int i) {
        short[] sArr = ((g00.a0) obj).A;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.m(this.b, i2).f(sArr[i2]);
        }
    }
}
