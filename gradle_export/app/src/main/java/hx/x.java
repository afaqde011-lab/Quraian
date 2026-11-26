package hx;

import com.google.android.gms.internal.measurement.x5;

public final class x {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final u30.b e;
    public final u30.b f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final u30.b j;
    public final u30.b k;
    public final boolean l;
    public final u30.b m;
    public final u30.b n;

    public x(boolean z, boolean z2, boolean z3, boolean z4, u30.b collections, u30.b favoriteReciters, boolean z5, boolean z6, String str, u30.b searchResults, u30.b recentSearchedReciters, boolean z7, u30.b downloadedReciters, u30.b downloadedReciterModels) {
        kotlin.jvm.internal.m.e(collections, "collections");
        kotlin.jvm.internal.m.e(favoriteReciters, "favoriteReciters");
        kotlin.jvm.internal.m.e(searchResults, "searchResults");
        kotlin.jvm.internal.m.e(recentSearchedReciters, "recentSearchedReciters");
        kotlin.jvm.internal.m.e(downloadedReciters, "downloadedReciters");
        kotlin.jvm.internal.m.e(downloadedReciterModels, "downloadedReciterModels");
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = collections;
        this.f = favoriteReciters;
        this.g = z5;
        this.h = z6;
        this.i = str;
        this.j = searchResults;
        this.k = recentSearchedReciters;
        this.l = z7;
        this.m = downloadedReciters;
        this.n = downloadedReciterModels;
    }

    public static x a(x xVar, boolean z, boolean z2, boolean z3, u30.b bVar, boolean z4, boolean z5, String str, u30.b bVar2, u30.b bVar3, boolean z6, u30.b bVar4, u30.b bVar5, int i) {
        boolean z7 = (i & 1) != 0 ? xVar.a : z;
        boolean z8 = (i & 2) != 0 ? xVar.b : z2;
        boolean z9 = (i & 4) != 0 ? xVar.c : true;
        boolean z11 = (i & 8) != 0 ? xVar.d : z3;
        u30.b collections = (i & 16) != 0 ? xVar.e : bVar;
        u30.b favoriteReciters = xVar.f;
        boolean z12 = (i & 64) != 0 ? xVar.g : z4;
        boolean z13 = (i & 128) != 0 ? xVar.h : z5;
        String searchValue = (i & 256) != 0 ? xVar.i : str;
        u30.b searchResults = (i & 512) != 0 ? xVar.j : bVar2;
        u30.b recentSearchedReciters = (i & 1024) != 0 ? xVar.k : bVar3;
        boolean z14 = (i & 2048) != 0 ? xVar.l : z6;
        u30.b downloadedReciters = (i & 4096) != 0 ? xVar.m : bVar4;
        u30.b downloadedReciterModels = (i & 8192) != 0 ? xVar.n : bVar5;
        xVar.getClass();
        kotlin.jvm.internal.m.e(collections, "collections");
        kotlin.jvm.internal.m.e(favoriteReciters, "favoriteReciters");
        kotlin.jvm.internal.m.e(searchValue, "searchValue");
        kotlin.jvm.internal.m.e(searchResults, "searchResults");
        kotlin.jvm.internal.m.e(recentSearchedReciters, "recentSearchedReciters");
        kotlin.jvm.internal.m.e(downloadedReciters, "downloadedReciters");
        kotlin.jvm.internal.m.e(downloadedReciterModels, "downloadedReciterModels");
        return new x(z7, z8, z9, z11, collections, favoriteReciters, z12, z13, searchValue, searchResults, recentSearchedReciters, z14, downloadedReciters, downloadedReciterModels);
    }

    public final boolean b() {
        if (this.n.isEmpty() || !((h00.b) this.e).isEmpty()) {
            return false;
        }
        return !this.l || this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.a == xVar.a && this.b == xVar.b && this.c == xVar.c && this.d == xVar.d && kotlin.jvm.internal.m.a(this.e, xVar.e) && kotlin.jvm.internal.m.a(this.f, xVar.f) && this.g == xVar.g && this.h == xVar.h && kotlin.jvm.internal.m.a(this.i, xVar.i) && kotlin.jvm.internal.m.a(this.j, xVar.j) && kotlin.jvm.internal.m.a(this.k, xVar.k) && this.l == xVar.l && kotlin.jvm.internal.m.a(this.m, xVar.m) && kotlin.jvm.internal.m.a(this.n, xVar.n);
    }

    public final int hashCode() {
        return this.n.hashCode() + g4.c.c(this.m, w.c.e(g4.c.c(this.k, g4.c.c(this.j, x5.e(w.c.e(w.c.e(g4.c.c(this.f, g4.c.c(this.e, w.c.e(w.c.e(w.c.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31), 31, this.g), 31, this.h), this.i, 31), 31), 31), 31, this.l), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReciterCollectionUiState(isRefreshing=");
        sb.append(this.a);
        sb.append(", isLoadingCollections=");
        sb.append(this.b);
        sb.append(", hasLoadedCollections=");
        oi.k.y(sb, this.c, ", collectionsLoadFailed=", this.d, ", collections=");
        sb.append(this.e);
        sb.append(", favoriteReciters=");
        sb.append(this.f);
        sb.append(", hasFavoriteReciters=");
        oi.k.y(sb, this.g, ", isSearchActive=", this.h, ", searchValue=");
        sb.append(this.i);
        sb.append(", searchResults=");
        sb.append(this.j);
        sb.append(", recentSearchedReciters=");
        sb.append(this.k);
        sb.append(", isInternetConnected=");
        sb.append(this.l);
        sb.append(", downloadedReciters=");
        sb.append(this.m);
        sb.append(", downloadedReciterModels=");
        sb.append(this.n);
        sb.append(")");
        return sb.toString();
    }
}
