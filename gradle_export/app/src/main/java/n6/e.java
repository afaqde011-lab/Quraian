package n6;

import kotlin.jvm.internal.m;
import y3.o;

public final class e {

    public final o6.a f11113a;

    public final o f11114b;

    public final b f11115c;

    public final c f11116d;

    public e(o6.a aVar, o oVar, b bVar, c cVar, int i10) {
        oVar = (i10 & 2) != 0 ? null : oVar;
        bVar = (i10 & 4) != 0 ? null : bVar;
        cVar = (i10 & 16) != 0 ? null : cVar;
        this.f11113a = aVar;
        this.f11114b = oVar;
        this.f11115c = bVar;
        this.f11116d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return m.a(this.f11113a, eVar.f11113a) && m.a(this.f11114b, eVar.f11114b) && m.a(this.f11115c, eVar.f11115c) && m.a(this.f11116d, eVar.f11116d);
    }

    public final int hashCode() {
        int iHashCode = this.f11113a.hashCode() * 31;
        o oVar = this.f11114b;
        int iHashCode2 = (iHashCode + (oVar != null ? Long.hashCode(oVar.f16600a) : 0)) * 31;
        b bVar = this.f11115c;
        return (((iHashCode2 + (bVar != null ? Integer.hashCode(bVar.f11112a) : 0)) * 29791) + (this.f11116d != null ? Integer.hashCode(3) : 0)) * 31;
    }

    public final String toString() {
        return "TextStyle(color=" + this.f11113a + ", fontSize=" + this.f11114b + ", fontWeight=" + this.f11115c + ", fontStyle=null, textDecoration=null, textAlign=" + this.f11116d + ", fontFamily=null)";
    }
}
