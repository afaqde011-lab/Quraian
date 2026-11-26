package p40;

public final class e1 implements l40.a {
    public static final e1 a = new e1();
    public static final a0 b = o0.a("kotlin.UByte", i.a);

    @Override
    public final Object deserialize(o40.c decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        return new g00.r(decoder.o(b).B());
    }

    @Override
    public final n40.e getDescriptor() {
        return b;
    }

    @Override
    public final void serialize(o40.d encoder, Object obj) {
        byte b2 = ((g00.r) obj).A;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        encoder.o(b).g(b2);
    }
}
