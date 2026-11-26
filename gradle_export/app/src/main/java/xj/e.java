package xj;

import kotlin.jvm.internal.m;

public final class e {

    public final String f16580a;

    public e(String str) {
        m.e(str, "sessionId");
        this.f16580a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && m.a(this.f16580a, ((e) obj).f16580a);
    }

    public final int hashCode() {
        return this.f16580a.hashCode();
    }

    public final String toString() {
        return g4.c.k(new StringBuilder("SessionDetails(sessionId="), this.f16580a, ')');
    }
}
