package p40;

public final class e0 implements l40.a {
    public static final e0 a = new e0();
    public static final u0 b = new u0("kotlin.Int", n40.c.h);

    @Override
    public final Object deserialize(o40.c decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        return Integer.valueOf(decoder.n());
    }

    @Override
    public final n40.e getDescriptor() {
        return b;
    }

    @Override
    public final void serialize(o40.d encoder, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        kotlin.jvm.internal.m.e(encoder, "encoder");
        encoder.v(iIntValue);
    }
}
