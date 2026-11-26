package as;

import java.util.List;

public final class z {
    public final dw.a a;
    public final u30.b b;
    public final List c;
    public final boolean d;
    public final List e;

    public z(dw.a aVar, u30.b playerItems, List favorites, boolean z, List downloadedSurahs) {
        kotlin.jvm.internal.m.e(playerItems, "playerItems");
        kotlin.jvm.internal.m.e(favorites, "favorites");
        kotlin.jvm.internal.m.e(downloadedSurahs, "downloadedSurahs");
        this.a = aVar;
        this.b = playerItems;
        this.c = favorites;
        this.d = z;
        this.e = downloadedSurahs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return kotlin.jvm.internal.m.a(this.a, zVar.a) && kotlin.jvm.internal.m.a(this.b, zVar.b) && kotlin.jvm.internal.m.a(this.c, zVar.c) && this.d == zVar.d && kotlin.jvm.internal.m.a(this.e, zVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + w.c.e(g4.c.a(g4.c.c(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "PlaylistObservedData(playlist=" + this.a + ", playerItems=" + this.b + ", favorites=" + this.c + ", isInternetConnected=" + this.d + ", downloadedSurahs=" + this.e + ")";
    }
}
