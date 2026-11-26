package p40;

import kotlinx.serialization.SerializationException;

public final class m0 implements l40.a {
    public static final m0 a = new m0();
    public static final l0 b = l0.a;

    @Override
    public final Object deserialize(o40.c decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        throw new SerializationException("'kotlin.Nothing' does not have instances");
    }

    @Override
    public final n40.e getDescriptor() {
        return b;
    }

    @Override
    public final void serialize(o40.d encoder, Object obj) {
        Void value = (Void) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        throw new SerializationException("'kotlin.Nothing' cannot be serialized");
    }
}
