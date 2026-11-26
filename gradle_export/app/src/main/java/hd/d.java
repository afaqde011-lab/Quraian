package hd;

import kotlin.jvm.internal.m;

public final class d {

    public final e f7040a;

    public final gd.a f7041b;

    public d(e eVar, gd.a aVar) {
        this.f7040a = eVar;
        this.f7041b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f7040a == dVar.f7040a && m.a(this.f7041b, dVar.f7041b);
    }

    public final int hashCode() {
        int iHashCode = this.f7040a.hashCode() * 31;
        gd.a aVar = this.f7041b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return "WriteQueueMessage(type=" + this.f7040a + ", event=" + this.f7041b + ')';
    }
}
