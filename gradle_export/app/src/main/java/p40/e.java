package p40;

public final class e extends t0 {
    public static final e c = new e(f.a);

    @Override
    public final int d(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        kotlin.jvm.internal.m.e(zArr, "<this>");
        return zArr.length;
    }

    @Override
    public final void f(o40.a aVar, int i, Object obj) {
        d builder = (d) obj;
        kotlin.jvm.internal.m.e(builder, "builder");
        boolean zR = aVar.r(this.b, i);
        builder.b(builder.d() + 1);
        boolean[] zArr = builder.a;
        int i2 = builder.b;
        builder.b = i2 + 1;
        zArr[i2] = zR;
    }

    @Override
    public final Object g(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        kotlin.jvm.internal.m.e(zArr, "<this>");
        d dVar = new d();
        dVar.a = zArr;
        dVar.b = zArr.length;
        dVar.b(10);
        return dVar;
    }

    @Override
    public final Object j() {
        return new boolean[0];
    }

    @Override
    public final void k(o40.b encoder, Object obj, int i) {
        boolean[] content = (boolean[]) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.u(this.b, i2, content[i2]);
        }
    }
}
