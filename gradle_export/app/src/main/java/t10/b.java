package t10;

import kotlin.jvm.internal.p;
import s10.r0;

public final class b extends p {
    public static final int B = 0;

    static {
        new b(r0.class, "flags", "getFlags$kotlin_metadata()I", 0);
    }

    @Override
    public final Object get(Object obj) {
        return Integer.valueOf(((r0) obj).a);
    }

    @Override
    public final void p(Object obj, Object obj2) {
        ((r0) obj).a = ((Number) obj2).intValue();
    }
}
