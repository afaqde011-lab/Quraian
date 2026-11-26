package q40;

import com.google.android.gms.internal.measurement.x5;
import ri.t1;

public final class c0 implements l40.a {
    public static final c0 a = new c0();
    public static final n40.f b = t1.m("kotlinx.serialization.json.JsonPrimitive", n40.c.k, new n40.e[0]);

    @Override
    public final Object deserialize(o40.c decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        l lVarM = ta.c0.j(decoder).m();
        if (lVarM instanceof b0) {
            return (b0) lVarM;
        }
        StringBuilder sb = new StringBuilder("Unexpected JSON element, expected JsonPrimitive, had ");
        throw r40.j.d(x5.p(kotlin.jvm.internal.a0.a, lVarM.getClass(), sb), lVarM.toString(), -1);
    }

    @Override
    public final n40.e getDescriptor() {
        return b;
    }

    @Override
    public final void serialize(o40.d encoder, Object obj) {
        b0 value = (b0) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        ta.c0.i(encoder);
        if (value instanceof u) {
            encoder.y(v.a, u.INSTANCE);
        } else {
            encoder.y(s.a, (r) value);
        }
    }
}
