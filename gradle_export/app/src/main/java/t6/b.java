package t6;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.m;

public abstract class b {

    public final LinkedHashMap f14360a = new LinkedHashMap();

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return m.a(this.f14360a, ((b) obj).f14360a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14360a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f14360a + ')';
    }
}
