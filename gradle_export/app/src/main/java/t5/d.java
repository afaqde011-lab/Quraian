package t5;

import kotlin.jvm.internal.m;

public final class d {

    public final String f14357a;

    public d(String str) {
        m.e(str, "name");
        this.f14357a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        return m.a(this.f14357a, ((d) obj).f14357a);
    }

    public final int hashCode() {
        return this.f14357a.hashCode();
    }

    public final String toString() {
        return this.f14357a;
    }
}
