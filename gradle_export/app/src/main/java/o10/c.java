package o10;

import kotlin.jvm.internal.m;
import r30.r;

public final class c {
    public final Class a;
    public final d50.g b;

    public c(Class cls, d50.g gVar) {
        this.a = cls;
        this.b = gVar;
    }

    public final String a() {
        return r.u0(this.a.getName(), '.', '/').concat(".class");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return m.a(this.a, ((c) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c.class.getName() + ": " + this.a;
    }
}
