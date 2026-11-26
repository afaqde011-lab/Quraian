package t10;

import kotlin.jvm.internal.p;
import s10.n0;

public final class a extends p {
    public static final a B = new a(n0.class, "flags", "getFlags$kotlin_metadata()I", 0);

    @Override
    public final Object get(Object obj) {
        return Integer.valueOf(((n0) obj).A);
    }

    @Override
    public final void p(Object obj, Object obj2) {
        ((n0) obj).A = ((Number) obj2).intValue();
    }
}
