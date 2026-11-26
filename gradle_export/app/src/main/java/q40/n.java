package q40;

import kotlin.NoWhenBranchMatchedException;
import ri.t1;

public final class n implements l40.a {
    public static final n a = new n();
    public static final n40.f b = t1.l("kotlinx.serialization.json.JsonElement", n40.b.c, new n40.e[0], new pp.d(18));

    @Override
    public final Object deserialize(o40.c decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        return ta.c0.j(decoder).m();
    }

    @Override
    public final n40.e getDescriptor() {
        return b;
    }

    @Override
    public final void serialize(o40.d encoder, Object obj) {
        l value = (l) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        ta.c0.i(encoder);
        if (value instanceof b0) {
            encoder.y(c0.a, value);
        } else if (value instanceof x) {
            encoder.y(z.a, value);
        } else {
            if (!(value instanceof e)) {
                throw new NoWhenBranchMatchedException();
            }
            encoder.y(g.a, value);
        }
    }
}
