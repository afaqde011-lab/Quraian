package hw;

import kotlin.jvm.internal.m;
import oi.k;

public final class f {
    public final u30.b a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public f(u30.b playlists, boolean z, boolean z2, boolean z3, boolean z4) {
        m.e(playlists, "playlists");
        this.a = playlists;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public static f a(f fVar, u30.b bVar, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            bVar = fVar.a;
        }
        u30.b playlists = bVar;
        boolean z4 = (i & 2) != 0 ? fVar.b : false;
        if ((i & 4) != 0) {
            z = fVar.c;
        }
        boolean z5 = z;
        if ((i & 8) != 0) {
            z2 = fVar.d;
        }
        boolean z6 = z2;
        if ((i & 16) != 0) {
            z3 = fVar.e;
        }
        fVar.getClass();
        m.e(playlists, "playlists");
        return new f(playlists, z4, z5, z6, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return m.a(this.a, fVar.a) && this.b == fVar.b && this.c == fVar.c && this.d == fVar.d && this.e == fVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + w.c.e(w.c.e(w.c.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistsUiState(playlists=");
        sb.append(this.a);
        sb.append(", isPlaylistsLoading=");
        sb.append(this.b);
        sb.append(", isRefreshing=");
        k.y(sb, this.c, ", isInternetConnected=", this.d, ", isOverallFavoritesEmpty=");
        return g4.c.l(sb, this.e, ")");
    }
}
