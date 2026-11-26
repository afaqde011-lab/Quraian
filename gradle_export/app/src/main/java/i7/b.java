package i7;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class b {

    public static final b f7221b = new b(new HashMap());

    public final Map f7222a;

    public b(HashMap map) {
        this.f7222a = Collections.unmodifiableMap(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f7222a.equals(((b) obj).f7222a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7222a.hashCode();
    }
}
