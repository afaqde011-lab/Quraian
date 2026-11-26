package t10;

import kotlin.jvm.internal.p;
import s10.b1;

public final class f extends p {
    public static final f B = new f(b1.class, "flags", "getFlags$kotlin_metadata()I", 0);

    @Override
    public final Object get(Object obj) {
        return Integer.valueOf(((b1) obj).a);
    }

    @Override
    public final void p(Object obj, Object obj2) {
        ((b1) obj).a = ((Number) obj2).intValue();
    }
}
