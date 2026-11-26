package p40;

public final class h1 implements l40.a {
    public static final h1 a = new h1();
    public static final a0 b = o0.a("kotlin.UInt", e0.a);

    @Override
    public final Object deserialize(o40.c decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        return new g00.u(decoder.o(b).n());
    }

    @Override
    public final n40.e getDescriptor() {
        return b;
    }

    @Override
    public final void serialize(o40.d encoder, Object obj) {
        int i = ((g00.u) obj).A;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        encoder.o(b).v(i);
    }
}
