package p40;

public final class b0 implements z {
    public final l40.a a;

    public b0(l40.a aVar) {
        this.a = aVar;
    }

    @Override
    public final l40.a[] childSerializers() {
        return new l40.a[]{this.a};
    }

    @Override
    public final Object deserialize(o40.c decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        throw new IllegalStateException("unsupported");
    }

    @Override
    public final n40.e getDescriptor() {
        throw new IllegalStateException("unsupported");
    }

    @Override
    public final void serialize(o40.d encoder, Object obj) {
        kotlin.jvm.internal.m.e(encoder, "encoder");
        throw new IllegalStateException("unsupported");
    }

    @Override
    public final l40.a[] typeParametersSerializers() {
        return o0.b;
    }
}
