package p40;

public final class i implements l40.a {
    public static final i a = new i();
    public static final u0 b = new u0("kotlin.Byte", n40.c.d);

    @Override
    public final Object deserialize(o40.c decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        return Byte.valueOf(decoder.B());
    }

    @Override
    public final n40.e getDescriptor() {
        return b;
    }

    @Override
    public final void serialize(o40.d encoder, Object obj) {
        byte bByteValue = ((Number) obj).byteValue();
        kotlin.jvm.internal.m.e(encoder, "encoder");
        encoder.g(bByteValue);
    }
}
