package p40;

public final class l extends t0 {
    public static final l c = new l(m.a);

    @Override
    public final int d(Object obj) {
        char[] cArr = (char[]) obj;
        kotlin.jvm.internal.m.e(cArr, "<this>");
        return cArr.length;
    }

    @Override
    public final void f(o40.a aVar, int i, Object obj) {
        k builder = (k) obj;
        kotlin.jvm.internal.m.e(builder, "builder");
        char cK = aVar.k(this.b, i);
        builder.b(builder.d() + 1);
        char[] cArr = builder.a;
        int i2 = builder.b;
        builder.b = i2 + 1;
        cArr[i2] = cK;
    }

    @Override
    public final Object g(Object obj) {
        char[] cArr = (char[]) obj;
        kotlin.jvm.internal.m.e(cArr, "<this>");
        k kVar = new k();
        kVar.a = cArr;
        kVar.b = cArr.length;
        kVar.b(10);
        return kVar;
    }

    @Override
    public final Object j() {
        return new char[0];
    }

    @Override
    public final void k(o40.b encoder, Object obj, int i) {
        char[] content = (char[]) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.n(this.b, i2, content[i2]);
        }
    }
}
