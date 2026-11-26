package n20;

import kh.o;
import kotlin.jvm.internal.m;
import r30.r;

public final class a {
    public final c a;
    public final e b;

    static {
        e eVar = g.f;
        c cVar = c.c;
        o.R(eVar);
    }

    public a(c packageName, e eVar) {
        m.e(packageName, "packageName");
        this.a = packageName;
        this.b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.a, aVar.a) && this.b.equals(aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + 527) * 961);
    }

    public final String toString() {
        return r.u0(this.a.a.a, '.', '/') + "/" + this.b;
    }
}
