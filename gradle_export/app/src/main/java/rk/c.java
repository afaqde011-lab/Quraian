package rk;

import i2.g;
import kotlin.jvm.internal.m;

public final class c implements d {

    public final qk.b f13616a;

    public final qk.b f13617b;

    public c(qk.b bVar, qk.b bVar2) {
        this.f13616a = bVar;
        this.f13617b = bVar2;
    }

    @Override
    public final qk.b a() {
        return this.f13616a;
    }

    @Override
    public final void b(g gVar) {
        qk.b bVar = this.f13617b;
        gVar.e((float) bVar.f13039a, (float) bVar.f13040b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return m.a(this.f13616a, cVar.f13616a) && m.a(this.f13617b, cVar.f13617b);
    }

    public final int hashCode() {
        return this.f13617b.hashCode() + (this.f13616a.hashCode() * 31);
    }

    public final String toString() {
        return "Line(from=" + this.f13616a + ", to=" + this.f13617b + ")";
    }
}
