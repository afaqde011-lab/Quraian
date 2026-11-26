package p40;

public final class j0 extends t0 {
    public static final j0 c = new j0(k0.a);

    @Override
    public final int d(Object obj) {
        long[] jArr = (long[]) obj;
        kotlin.jvm.internal.m.e(jArr, "<this>");
        return jArr.length;
    }

    @Override
    public final void f(o40.a aVar, int i, Object obj) {
        i0 builder = (i0) obj;
        kotlin.jvm.internal.m.e(builder, "builder");
        long jG = aVar.g(this.b, i);
        builder.b(builder.d() + 1);
        long[] jArr = builder.a;
        int i2 = builder.b;
        builder.b = i2 + 1;
        jArr[i2] = jG;
    }

    @Override
    public final Object g(Object obj) {
        long[] jArr = (long[]) obj;
        kotlin.jvm.internal.m.e(jArr, "<this>");
        i0 i0Var = new i0();
        i0Var.a = jArr;
        i0Var.b = jArr.length;
        i0Var.b(10);
        return i0Var;
    }

    @Override
    public final Object j() {
        return new long[0];
    }

    @Override
    public final void k(o40.b encoder, Object obj, int i) {
        long[] content = (long[]) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.t(this.b, i2, content[i2]);
        }
    }
}
