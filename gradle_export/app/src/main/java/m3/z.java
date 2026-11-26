package m3;

public final class z {

    public final y f10552a;

    public final x f10553b;

    public z() {
        this(null, new x());
    }

    public z(y yVar, x xVar) {
        this.f10552a = yVar;
        this.f10553b = xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return kotlin.jvm.internal.m.a(this.f10553b, zVar.f10553b) && kotlin.jvm.internal.m.a(this.f10552a, zVar.f10552a);
    }

    public final int hashCode() {
        y yVar = this.f10552a;
        int iHashCode = (yVar != null ? yVar.hashCode() : 0) * 31;
        x xVar = this.f10553b;
        return iHashCode + (xVar != null ? xVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f10552a + ", paragraphSyle=" + this.f10553b + ')';
    }
}
