package p40;

public final class h extends t0 {
    public static final h c = new h(i.a);

    @Override
    public final int d(Object obj) {
        byte[] bArr = (byte[]) obj;
        kotlin.jvm.internal.m.e(bArr, "<this>");
        return bArr.length;
    }

    @Override
    public final void f(o40.a aVar, int i, Object obj) {
        g builder = (g) obj;
        kotlin.jvm.internal.m.e(builder, "builder");
        byte bI = aVar.i(this.b, i);
        builder.b(builder.d() + 1);
        byte[] bArr = builder.a;
        int i2 = builder.b;
        builder.b = i2 + 1;
        bArr[i2] = bI;
    }

    @Override
    public final Object g(Object obj) {
        byte[] bArr = (byte[]) obj;
        kotlin.jvm.internal.m.e(bArr, "<this>");
        g gVar = new g();
        gVar.a = bArr;
        gVar.b = bArr.length;
        gVar.b(10);
        return gVar;
    }

    @Override
    public final Object j() {
        return new byte[0];
    }

    @Override
    public final void k(o40.b encoder, Object obj, int i) {
        byte[] content = (byte[]) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.j(this.b, i2, content[i2]);
        }
    }
}
