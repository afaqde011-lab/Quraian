package p40;

public final class n0 implements l40.a {
    public final l40.a a;
    public final w0 b;

    public n0(l40.a serializer) {
        kotlin.jvm.internal.m.e(serializer, "serializer");
        this.a = serializer;
        this.b = new w0(serializer.getDescriptor());
    }

    @Override
    public final Object deserialize(o40.c decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        if (decoder.w()) {
            return decoder.j(this.a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && n0.class == obj.getClass() && kotlin.jvm.internal.m.a(this.a, ((n0) obj).a);
    }

    @Override
    public final n40.e getDescriptor() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final void serialize(o40.d encoder, Object obj) {
        kotlin.jvm.internal.m.e(encoder, "encoder");
        if (obj != null) {
            encoder.y(this.a, obj);
        } else {
            encoder.d();
        }
    }
}
