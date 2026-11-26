package p40;

public final class k0 implements l40.a {
    public static final k0 a = new k0();
    public static final u0 b = new u0("kotlin.Long", n40.c.i);

    @Override
    public final Object deserialize(o40.c decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        return Long.valueOf(decoder.u());
    }

    @Override
    public final n40.e getDescriptor() {
        return b;
    }

    @Override
    public final void serialize(o40.d encoder, Object obj) {
        long jLongValue = ((Number) obj).longValue();
        kotlin.jvm.internal.m.e(encoder, "encoder");
        encoder.z(jLongValue);
    }
}
