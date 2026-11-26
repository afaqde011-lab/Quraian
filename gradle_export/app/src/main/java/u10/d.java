package u10;

import kotlin.jvm.internal.m;

public final class d {
    public final a10.d a;

    public d(a10.d klass) {
        m.e(klass, "klass");
        this.a = klass;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return m.a(this.a, ((d) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return k00.f.D(this.a).getName();
    }
}
