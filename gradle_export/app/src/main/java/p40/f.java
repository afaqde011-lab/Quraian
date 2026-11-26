package p40;

public final class f implements l40.a {
    public static final f a = new f();
    public static final u0 b = new u0("kotlin.Boolean", n40.c.c);

    @Override
    public final Object deserialize(o40.c decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        return Boolean.valueOf(decoder.e());
    }

    @Override
    public final n40.e getDescriptor() {
        return b;
    }

    @Override
    public final void serialize(o40.d encoder, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        kotlin.jvm.internal.m.e(encoder, "encoder");
        encoder.h(zBooleanValue);
    }
}
