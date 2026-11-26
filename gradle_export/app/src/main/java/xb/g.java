package xb;

import ab.a0;
import kotlin.jvm.internal.m;

public final class g {

    public static final g f16512c;

    public final a0 f16513a;

    public final a0 f16514b;

    static {
        b bVar = b.f16511a;
        f16512c = new g(bVar, bVar);
    }

    public g(a0 a0Var, a0 a0Var2) {
        this.f16513a = a0Var;
        this.f16514b = a0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return m.a(this.f16513a, gVar.f16513a) && m.a(this.f16514b, gVar.f16514b);
    }

    public final int hashCode() {
        return this.f16514b.hashCode() + (this.f16513a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f16513a + ", height=" + this.f16514b + ')';
    }
}
