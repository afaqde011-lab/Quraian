package q40;

import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.internal.measurement.x5;
import p40.k1;
import p40.u0;
import ri.t1;

public final class s implements l40.a {
    public static final s a = new s();
    public static final u0 b = t1.e("kotlinx.serialization.json.JsonLiteral", n40.c.k);

    @Override
    public final Object deserialize(o40.c decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        l lVarM = ta.c0.j(decoder).m();
        if (lVarM instanceof r) {
            return (r) lVarM;
        }
        StringBuilder sb = new StringBuilder("Unexpected JSON element, expected JsonLiteral, had ");
        throw r40.j.d(x5.p(kotlin.jvm.internal.a0.a, lVarM.getClass(), sb), lVarM.toString(), -1);
    }

    @Override
    public final n40.e getDescriptor() {
        return b;
    }

    @Override
    public final void serialize(o40.d encoder, Object obj) {
        Boolean bool;
        r value = (r) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        String str = value.C;
        ta.c0.i(encoder);
        if (value.A) {
            encoder.D(str);
            return;
        }
        n40.e eVar = value.B;
        if (eVar != null) {
            encoder.o(eVar).D(str);
            return;
        }
        Long lZ0 = r30.r.z0(str);
        if (lZ0 != null) {
            encoder.z(lZ0.longValue());
            return;
        }
        g00.w wVarQ = b5.Q(str);
        if (wVarQ != null) {
            encoder.o(k1.b).z(wVarQ.A);
            return;
        }
        Double dM0 = r30.q.m0(str);
        if (dM0 != null) {
            encoder.e(dM0.doubleValue());
            return;
        }
        if (str.equals("true")) {
            bool = Boolean.TRUE;
        } else {
            bool = str.equals("false") ? Boolean.FALSE : null;
        }
        if (bool != null) {
            encoder.h(bool.booleanValue());
        } else {
            encoder.D(str);
        }
    }
}
