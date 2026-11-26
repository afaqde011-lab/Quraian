package wh;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class a {

    public static final a f16082b = new a(Collections.unmodifiableMap(new HashMap()));

    public final Map f16083a;

    public a(Map map) {
        this.f16083a = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f16083a.equals(((a) obj).f16083a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16083a.hashCode();
    }

    public final String toString() {
        return this.f16083a.toString();
    }
}
