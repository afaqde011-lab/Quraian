package qx;

import com.google.android.gms.internal.measurement.x5;

public final class o {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final u30.b d;
    public final u30.b e;
    public final boolean f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final float j;
    public final float k;
    public final boolean l;
    public final u30.b m;

    public o(boolean z, boolean z2, String title, u30.b reciters, u30.b filteredReciters, boolean z3, String str, boolean z4, boolean z5, float f, float f2, boolean z6, u30.b downloadedReciters) {
        kotlin.jvm.internal.m.e(title, "title");
        kotlin.jvm.internal.m.e(reciters, "reciters");
        kotlin.jvm.internal.m.e(filteredReciters, "filteredReciters");
        kotlin.jvm.internal.m.e(downloadedReciters, "downloadedReciters");
        this.a = z;
        this.b = z2;
        this.c = title;
        this.d = reciters;
        this.e = filteredReciters;
        this.f = z3;
        this.g = str;
        this.h = z4;
        this.i = z5;
        this.j = f;
        this.k = f2;
        this.l = z6;
        this.m = downloadedReciters;
    }

    public static o a(o oVar, u30.b bVar, u30.b bVar2, String str, boolean z, boolean z2, float f, float f2, boolean z3, u30.b bVar3, int i) {
        boolean z4 = (i & 1) != 0 ? oVar.a : false;
        boolean z5 = oVar.b;
        String title = oVar.c;
        u30.b reciters = (i & 8) != 0 ? oVar.d : bVar;
        u30.b filteredReciters = (i & 16) != 0 ? oVar.e : bVar2;
        boolean z6 = oVar.f;
        String searchValue = (i & 64) != 0 ? oVar.g : str;
        boolean z7 = (i & 128) != 0 ? oVar.h : z;
        boolean z8 = (i & 256) != 0 ? oVar.i : z2;
        float f3 = (i & 512) != 0 ? oVar.j : f;
        float f4 = (i & 1024) != 0 ? oVar.k : f2;
        boolean z9 = (i & 2048) != 0 ? oVar.l : z3;
        u30.b downloadedReciters = (i & 4096) != 0 ? oVar.m : bVar3;
        oVar.getClass();
        kotlin.jvm.internal.m.e(title, "title");
        kotlin.jvm.internal.m.e(reciters, "reciters");
        kotlin.jvm.internal.m.e(filteredReciters, "filteredReciters");
        kotlin.jvm.internal.m.e(searchValue, "searchValue");
        kotlin.jvm.internal.m.e(downloadedReciters, "downloadedReciters");
        return new o(z4, z5, title, reciters, filteredReciters, z6, searchValue, z7, z8, f3, f4, z9, downloadedReciters);
    }

    public final boolean b() {
        return ((h00.b) this.d).size() >= 10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.a == oVar.a && this.b == oVar.b && kotlin.jvm.internal.m.a(this.c, oVar.c) && kotlin.jvm.internal.m.a(this.d, oVar.d) && kotlin.jvm.internal.m.a(this.e, oVar.e) && this.f == oVar.f && this.g.equals(oVar.g) && this.h == oVar.h && this.i == oVar.i && y3.f.b(this.j, oVar.j) && y3.f.b(this.k, oVar.k) && this.l == oVar.l && kotlin.jvm.internal.m.a(this.m, oVar.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + w.c.e(w.c.c(this.k, w.c.c(this.j, w.c.e(w.c.e(x5.e(w.c.e(g4.c.c(this.e, g4.c.c(this.d, x5.e(w.c.e(Boolean.hashCode(this.a) * 31, 31, this.b), this.c, 31), 31), 31), 31, this.f), this.g, 31), 31, this.h), 31, this.i), 31), 31), 31, this.l);
    }

    public final String toString() {
        return "SearchReciterUiState(isLoading=" + this.a + ", isSearchExpected=" + this.b + ", title=" + this.c + ", reciters=" + this.d + ", filteredReciters=" + this.e + ", showFavoriteIcon=" + this.f + ", searchValue=" + this.g + ", isSearchVisible=" + this.h + ", isSearchFocused=" + this.i + ", topContentHeight=" + y3.f.c(this.j) + ", titleTextHeight=" + y3.f.c(this.k) + ", isInternetConnected=" + this.l + ", downloadedReciters=" + this.m + ")";
    }
}
