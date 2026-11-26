package p40;

public final class a1 implements l40.a {
    public static final a1 a = new a1();
    public static final u0 b = new u0("kotlin.Short", n40.c.j);

    @Override
    public final Object deserialize(o40.c decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        return Short.valueOf(decoder.C());
    }

    @Override
    public final n40.e getDescriptor() {
        return b;
    }

    @Override
    public final void serialize(o40.d encoder, Object obj) {
        short sShortValue = ((Number) obj).shortValue();
        kotlin.jvm.internal.m.e(encoder, "encoder");
        encoder.f(sShortValue);
    }
}
