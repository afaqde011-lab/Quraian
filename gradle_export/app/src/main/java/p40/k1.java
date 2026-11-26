package p40;

public final class k1 implements l40.a {
    public static final k1 a = new k1();
    public static final a0 b = o0.a("kotlin.ULong", k0.a);

    @Override
    public final Object deserialize(o40.c decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        return new g00.w(decoder.o(b).u());
    }

    @Override
    public final n40.e getDescriptor() {
        return b;
    }

    @Override
    public final void serialize(o40.d encoder, Object obj) {
        long j = ((g00.w) obj).A;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        encoder.o(b).z(j);
    }
}
