package p40;

public final class d0 extends t0 {
    public static final d0 c = new d0(e0.a);

    @Override
    public final int d(Object obj) {
        int[] iArr = (int[]) obj;
        kotlin.jvm.internal.m.e(iArr, "<this>");
        return iArr.length;
    }

    @Override
    public final void f(o40.a aVar, int i, Object obj) {
        c0 builder = (c0) obj;
        kotlin.jvm.internal.m.e(builder, "builder");
        int iQ = aVar.q(this.b, i);
        builder.b(builder.d() + 1);
        int[] iArr = builder.a;
        int i2 = builder.b;
        builder.b = i2 + 1;
        iArr[i2] = iQ;
    }

    @Override
    public final Object g(Object obj) {
        int[] iArr = (int[]) obj;
        kotlin.jvm.internal.m.e(iArr, "<this>");
        c0 c0Var = new c0();
        c0Var.a = iArr;
        c0Var.b = iArr.length;
        c0Var.b(10);
        return c0Var;
    }

    @Override
    public final Object j() {
        return new int[0];
    }

    @Override
    public final void k(o40.b encoder, Object obj, int i) {
        int[] content = (int[]) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.w(i2, content[i2], this.b);
        }
    }
}
