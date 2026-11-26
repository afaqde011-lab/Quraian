package p40;

public final class q implements l40.a {
    public static final q a = new q();
    public static final u0 b = new u0("kotlin.Double", n40.c.f);

    @Override
    public final Object deserialize(o40.c decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        return Double.valueOf(decoder.E());
    }

    @Override
    public final n40.e getDescriptor() {
        return b;
    }

    @Override
    public final void serialize(o40.d encoder, Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        kotlin.jvm.internal.m.e(encoder, "encoder");
        encoder.e(dDoubleValue);
    }
}
