package p40;

public final class o1 implements l40.a {
    public static final o1 b = new o1();
    public final v a = new v("kotlin.Unit", g00.b0.a);

    @Override
    public final Object deserialize(o40.c decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        this.a.deserialize(decoder);
        return g00.b0.a;
    }

    @Override
    public final n40.e getDescriptor() {
        return this.a.getDescriptor();
    }

    @Override
    public final void serialize(o40.d encoder, Object obj) {
        g00.b0 value = (g00.b0) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        this.a.serialize(encoder, value);
    }
}
