package t5;

import java.util.Map;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import u00.k;

public final class a extends n implements k {
    public static final a A = new a(1);

    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        m.e(entry, "entry");
        Object value = entry.getValue();
        return w.c.l(new StringBuilder("  "), ((d) entry.getKey()).f14357a, " = ", value instanceof byte[] ? h00.n.L0((byte[]) value, ", ", (k) null, 56) : String.valueOf(entry.getValue()));
    }
}
