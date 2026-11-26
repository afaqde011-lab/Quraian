package q40;

import java.util.List;

public final class g implements l40.a {
    public static final g a = new g();
    public static final f b = f.b;

    @Override
    public final Object deserialize(o40.c decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        ta.c0.j(decoder);
        return new e((List) ta.c0.b(n.a).deserialize(decoder));
    }

    @Override
    public final n40.e getDescriptor() {
        return b;
    }

    @Override
    public final void serialize(o40.d encoder, Object obj) {
        e value = (e) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        ta.c0.i(encoder);
        ta.c0.b(n.a).serialize(encoder, value);
    }
}
