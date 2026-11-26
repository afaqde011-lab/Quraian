package qb;

import nb.o;

public final class m extends e {

    public final o f12824a;

    public final String f12825b;

    public final nb.e f12826c;

    public m(o oVar, String str, nb.e eVar) {
        this.f12824a = oVar;
        this.f12825b = str;
        this.f12826c = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.m.a(this.f12824a, mVar.f12824a) && kotlin.jvm.internal.m.a(this.f12825b, mVar.f12825b) && this.f12826c == mVar.f12826c;
    }

    public final int hashCode() {
        int iHashCode = this.f12824a.hashCode() * 31;
        String str = this.f12825b;
        return this.f12826c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
