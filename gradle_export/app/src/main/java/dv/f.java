package dv;

import kotlin.jvm.internal.m;

public final class f {
    public final u30.b a;
    public final u30.b b;
    public final u30.b c;
    public final boolean d;

    public f(u30.b trackListFavorites, u30.b trackListDownloadedSurahs, u30.b trackListDownloadingProgress, boolean z) {
        m.e(trackListFavorites, "trackListFavorites");
        m.e(trackListDownloadedSurahs, "trackListDownloadedSurahs");
        m.e(trackListDownloadingProgress, "trackListDownloadingProgress");
        this.a = trackListFavorites;
        this.b = trackListDownloadedSurahs;
        this.c = trackListDownloadingProgress;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return m.a(this.a, fVar.a) && m.a(this.b, fVar.b) && m.a(this.c, fVar.c) && this.d == fVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + g4.c.c(this.c, g4.c.c(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "PlayerTrackListState(trackListFavorites=" + this.a + ", trackListDownloadedSurahs=" + this.b + ", trackListDownloadingProgress=" + this.c + ", isInternetConnected=" + this.d + ")";
    }
}
