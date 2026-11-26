package ko;

import a10.h0;
import java.util.Iterator;

public final class c extends h0 {
    public static lo.e X(ho.a from) {
        kotlin.jvm.internal.m.e(from, "from");
        int i = from.h;
        Integer num = (Integer) d.a.get(from.b);
        if (num != null && i <= 1) {
            return new lo.c(num.intValue());
        }
        String str = from.e;
        if (str == null) {
            Iterator it = from.g.iterator();
            while (it.hasNext()) {
                str = ((ho.g) it.next()).g;
                if (str != null) {
                }
            }
            str = null;
        }
        return new lo.d(str, i);
    }
}
