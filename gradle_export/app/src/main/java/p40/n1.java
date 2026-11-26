package p40;

public final class n1 implements l40.a {
    public static final n1 a = new n1();
    public static final a0 b = o0.a("kotlin.UShort", a1.a);

    @Override
    public final Object deserialize(o40.c decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        return new g00.z(decoder.o(b).C());
    }

    @Override
    public final n40.e getDescriptor() {
        return b;
    }

    @Override
    public final void serialize(o40.d encoder, Object obj) {
        short s = ((g00.z) obj).A;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        encoder.o(b).f(s);
    }
}
