package wb;

public final class d {

    public final xb.h f15905a;

    public final xb.f f15906b;

    public final ac.e f15907c;

    public final xb.d f15908d;

    public final Boolean f15909e;

    public final b f15910f;

    public d(xb.h hVar, xb.f fVar, ac.e eVar, xb.d dVar, Boolean bool, b bVar) {
        this.f15905a = hVar;
        this.f15906b = fVar;
        this.f15907c = eVar;
        this.f15908d = dVar;
        this.f15909e = bool;
        this.f15910f = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.m.a(this.f15905a, dVar.f15905a) && this.f15906b == dVar.f15906b && kotlin.jvm.internal.m.a(this.f15907c, dVar.f15907c) && this.f15908d == dVar.f15908d && kotlin.jvm.internal.m.a(this.f15909e, dVar.f15909e) && this.f15910f == dVar.f15910f;
    }

    public final int hashCode() {
        xb.h hVar = this.f15905a;
        int iHashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        xb.f fVar = this.f15906b;
        int iHashCode2 = (iHashCode + (fVar != null ? fVar.hashCode() : 0)) * 28629151;
        ac.e eVar = this.f15907c;
        int iHashCode3 = (iHashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        xb.d dVar = this.f15908d;
        int iHashCode4 = (iHashCode3 + (dVar != null ? dVar.hashCode() : 0)) * 961;
        Boolean bool = this.f15909e;
        int iHashCode5 = (iHashCode4 + (bool != null ? bool.hashCode() : 0)) * 923521;
        b bVar = this.f15910f;
        return iHashCode5 + (bVar != null ? bVar.hashCode() : 0);
    }
}
