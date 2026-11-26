package qk;

import kotlin.jvm.internal.m;

public final class a {

    public final b f13034a;

    public final b f13035b;

    public final b f13036c;

    public final b f13037d;

    public a(b bVar, b bVar2, b bVar3, b bVar4) {
        this.f13034a = bVar;
        this.f13035b = bVar2;
        this.f13036c = bVar3;
        this.f13037d = bVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.f13034a, aVar.f13034a) && m.a(this.f13035b, aVar.f13035b) && m.a(this.f13036c, aVar.f13036c) && m.a(this.f13037d, aVar.f13037d);
    }

    public final int hashCode() {
        return this.f13037d.hashCode() + ((this.f13036c.hashCode() + ((this.f13035b.hashCode() + (this.f13034a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CubicBezier(p0=" + this.f13034a + ", p1=" + this.f13035b + ", p2=" + this.f13036c + ", p3=" + this.f13037d + ")";
    }
}
