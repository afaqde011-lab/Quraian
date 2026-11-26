package t10;

import kotlin.jvm.internal.p;
import s10.z0;

public final class e extends p {
    public static final e B = new e(z0.class, "flags", "getFlags$kotlin_metadata()I", 0);

    @Override
    public final Object get(Object obj) {
        return Integer.valueOf(((z0) obj).a);
    }

    @Override
    public final void p(Object obj, Object obj2) {
        ((z0) obj).a = ((Number) obj2).intValue();
    }
}
