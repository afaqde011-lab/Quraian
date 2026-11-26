package bt;

public final class x {
    public final ys.b a;
    public final ys.f b;
    public final u30.b c;
    public final ys.m d;
    public final ys.a e;

    public x(ys.b bVar, ys.f fVar, u30.b topSurahs, ys.m mVar, ys.a aVar) {
        kotlin.jvm.internal.m.e(topSurahs, "topSurahs");
        this.a = bVar;
        this.b = fVar;
        this.c = topSurahs;
        this.d = mVar;
        this.e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return kotlin.jvm.internal.m.a(this.a, xVar.a) && kotlin.jvm.internal.m.a(this.b, xVar.b) && kotlin.jvm.internal.m.a(this.c, xVar.c) && kotlin.jvm.internal.m.a(this.d, xVar.d) && kotlin.jvm.internal.m.a(this.e, xVar.e);
    }

    public final int hashCode() {
        ys.b bVar = this.a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        ys.f fVar = this.b;
        int iC = g4.c.c(this.c, (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31, 31);
        ys.m mVar = this.d;
        int iHashCode2 = (iC + (mVar == null ? 0 : mVar.hashCode())) * 31;
        ys.a aVar = this.e;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "InsightsChartsUiState(headerDvo=" + this.a + ", topReciter=" + this.b + ", topSurahs=" + this.c + ", yearOverview=" + this.d + ", bestListeningTime=" + this.e + ")";
    }
}
