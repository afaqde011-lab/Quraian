package t10;

import kotlin.jvm.internal.p;
import s10.f1;

public final class g extends p {
    public static final int B = 0;

    static {
        new g(f1.class, "flags", "getFlags$kotlin_metadata()I", 0);
    }

    @Override
    public final Object get(Object obj) {
        return Integer.valueOf(((f1) obj).a);
    }

    @Override
    public final void p(Object obj, Object obj2) {
        ((f1) obj).a = ((Number) obj2).intValue();
    }
}
