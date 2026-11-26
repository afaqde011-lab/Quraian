package q40;

import kotlinx.serialization.json.internal.JsonDecodingException;
import ri.t1;

public final class v implements l40.a {
    public static final v a = new v();
    public static final n40.f b = t1.m("kotlinx.serialization.json.JsonNull", n40.h.c, new n40.e[0]);

    @Override
    public final Object deserialize(o40.c decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        ta.c0.j(decoder);
        if (decoder.w()) {
            throw new JsonDecodingException("Expected 'null' literal");
        }
        return u.INSTANCE;
    }

    @Override
    public final n40.e getDescriptor() {
        return b;
    }

    @Override
    public final void serialize(o40.d encoder, Object obj) {
        u value = (u) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        ta.c0.i(encoder);
        encoder.d();
    }
}
