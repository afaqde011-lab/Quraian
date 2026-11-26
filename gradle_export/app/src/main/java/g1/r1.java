package g1;

import java.util.LinkedHashMap;
import java.util.Locale;

public final class r1 {

    public final LinkedHashMap f5950a = new LinkedHashMap();

    public final String a(Long l, Locale locale, boolean z10) {
        if (l == null) {
            return null;
        }
        return h1.f.i(l.longValue(), z10 ? "yMMMMEEEEd" : "yMMMd", locale, this.f5950a);
    }

    public final boolean equals(Object obj) {
        return obj instanceof r1;
    }

    public final int hashCode() {
        return 436998964;
    }
}
