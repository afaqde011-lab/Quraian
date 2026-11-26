package p40;

public final class b1 implements l40.a {
    public static final b1 a = new b1();
    public static final u0 b = new u0("kotlin.String", n40.c.k);

    @Override
    public final Object deserialize(o40.c decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        return decoder.p();
    }

    @Override
    public final n40.e getDescriptor() {
        return b;
    }

    @Override
    public final void serialize(o40.d encoder, Object obj) {
        String value = (String) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        encoder.D(value);
    }
}
