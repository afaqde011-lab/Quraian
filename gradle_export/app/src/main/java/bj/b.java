package bj;

import java.util.Collections;
import java.util.Map;

public final class b {

    public final String f2548a;

    public final Map f2549b;

    public b(String str, Map map) {
        this.f2548a = str;
        this.f2549b = map;
    }

    public static b a(String str) {
        return new b(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2548a.equals(bVar.f2548a) && this.f2549b.equals(bVar.f2549b);
    }

    public final int hashCode() {
        return this.f2549b.hashCode() + (this.f2548a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f2548a + ", properties=" + this.f2549b.values() + "}";
    }
}
