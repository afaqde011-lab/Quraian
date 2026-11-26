package xj;

import kotlin.jvm.internal.m;
import oi.j;

public final class a {

    public final j40.c f16576a;

    public j f16577b = null;

    public a(j40.c cVar) {
        this.f16576a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f16576a.equals(aVar.f16576a) && m.a(this.f16577b, aVar.f16577b);
    }

    public final int hashCode() {
        int iHashCode = this.f16576a.hashCode() * 31;
        j jVar = this.f16577b;
        return iHashCode + (jVar == null ? 0 : jVar.hashCode());
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f16576a + ", subscriber=" + this.f16577b + ')';
    }
}
