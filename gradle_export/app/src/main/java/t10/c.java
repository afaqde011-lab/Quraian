package t10;

import kotlin.jvm.internal.p;
import s10.y0;

public final class c extends p {
    public static final int B = 0;

    static {
        new c(y0.class, "flags", "getFlags$kotlin_metadata()I", 0);
    }

    @Override
    public final Object get(Object obj) {
        return Integer.valueOf(((y0) obj).a);
    }

    @Override
    public final void p(Object obj, Object obj2) {
        ((y0) obj).a = ((Number) obj2).intValue();
    }
}
