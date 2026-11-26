package p40;

public final class m implements l40.a {
    public static final m a = new m();
    public static final u0 b = new u0("kotlin.Char", n40.c.e);

    @Override
    public final Object deserialize(o40.c decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        return Character.valueOf(decoder.f());
    }

    @Override
    public final n40.e getDescriptor() {
        return b;
    }

    @Override
    public final void serialize(o40.d encoder, Object obj) {
        char cCharValue = ((Character) obj).charValue();
        kotlin.jvm.internal.m.e(encoder, "encoder");
        encoder.p(cCharValue);
    }
}
