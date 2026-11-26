package z;

public final class p {

    public i2.d f16946a = null;

    public i2.a f16947b = null;

    public k2.b f16948c = null;

    public i2.g f16949d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.m.a(this.f16946a, pVar.f16946a) && kotlin.jvm.internal.m.a(this.f16947b, pVar.f16947b) && kotlin.jvm.internal.m.a(this.f16948c, pVar.f16948c) && kotlin.jvm.internal.m.a(this.f16949d, pVar.f16949d);
    }

    public final int hashCode() {
        i2.d dVar = this.f16946a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        i2.a aVar = this.f16947b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        k2.b bVar = this.f16948c;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        i2.g gVar = this.f16949d;
        return iHashCode3 + (gVar != null ? gVar.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f16946a + ", canvas=" + this.f16947b + ", canvasDrawScope=" + this.f16948c + ", borderPath=" + this.f16949d + ')';
    }
}
