package q40;

import java.util.Map;
import p40.b1;

public final class z implements l40.a {
    public static final z a = new z();
    public static final y b = y.b;

    @Override
    public final Object deserialize(o40.c decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        ta.c0.j(decoder);
        return new x((Map) ta.c0.c(b1.a, n.a).deserialize(decoder));
    }

    @Override
    public final n40.e getDescriptor() {
        return b;
    }

    @Override
    public final void serialize(o40.d encoder, Object obj) {
        x value = (x) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        ta.c0.i(encoder);
        ta.c0.c(b1.a, n.a).serialize(encoder, value);
    }
}
