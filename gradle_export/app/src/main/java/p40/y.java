package p40;

public final class y implements l40.a {
    public static final y a = new y();
    public static final u0 b = new u0("kotlin.Float", n40.c.g);

    @Override
    public final Object deserialize(o40.c decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        return Float.valueOf(decoder.D());
    }

    @Override
    public final n40.e getDescriptor() {
        return b;
    }

    @Override
    public final void serialize(o40.d encoder, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        kotlin.jvm.internal.m.e(encoder, "encoder");
        encoder.l(fFloatValue);
    }
}
