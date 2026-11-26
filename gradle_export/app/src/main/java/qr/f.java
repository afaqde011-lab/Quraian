package qr;

public final class f {
    public final q a;
    public final u30.b b;
    public final bx.c c;
    public final u30.b d;
    public final u30.b e;
    public final u30.b f;
    public final u30.b g;

    public f(q loadingState, u30.b playerItems, bx.c cVar, u30.b allReciters, u30.b downloadedSurahIds, u30.b downloadedReciters, u30.b downloadedSurahs) {
        kotlin.jvm.internal.m.e(loadingState, "loadingState");
        kotlin.jvm.internal.m.e(playerItems, "playerItems");
        kotlin.jvm.internal.m.e(allReciters, "allReciters");
        kotlin.jvm.internal.m.e(downloadedSurahIds, "downloadedSurahIds");
        kotlin.jvm.internal.m.e(downloadedReciters, "downloadedReciters");
        kotlin.jvm.internal.m.e(downloadedSurahs, "downloadedSurahs");
        this.a = loadingState;
        this.b = playerItems;
        this.c = cVar;
        this.d = allReciters;
        this.e = downloadedSurahIds;
        this.f = downloadedReciters;
        this.g = downloadedSurahs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.m.a(this.a, fVar.a) && kotlin.jvm.internal.m.a(this.b, fVar.b) && kotlin.jvm.internal.m.a(this.c, fVar.c) && kotlin.jvm.internal.m.a(this.d, fVar.d) && kotlin.jvm.internal.m.a(this.e, fVar.e) && kotlin.jvm.internal.m.a(this.f, fVar.f) && kotlin.jvm.internal.m.a(this.g, fVar.g);
    }

    public final int hashCode() {
        int iC = g4.c.c(this.b, this.a.hashCode() * 31, 31);
        bx.c cVar = this.c;
        return this.g.hashCode() + g4.c.c(this.f, g4.c.c(this.e, g4.c.c(this.d, (iC + (cVar == null ? 0 : cVar.hashCode())) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "HomeReciterDataDvo(loadingState=" + this.a + ", playerItems=" + this.b + ", selectedReciter=" + this.c + ", allReciters=" + this.d + ", downloadedSurahIds=" + this.e + ", downloadedReciters=" + this.f + ", downloadedSurahs=" + this.g + ")";
    }
}
