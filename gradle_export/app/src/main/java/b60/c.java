package b60;

import a10.d;
import kotlin.jvm.internal.m;

public final class c implements a {
    public final String a;

    public c(d type) {
        m.e(type, "type");
        this.a = g60.a.a(type);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && c.class == obj.getClass() && m.a(this.a, ((c) obj).a);
    }

    @Override
    public final String getValue() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
