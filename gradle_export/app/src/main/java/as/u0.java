package as;

import com.google.android.gms.internal.measurement.x5;

public final class u0 {
    public final boolean a;
    public final dw.a b;
    public final u30.b c;
    public final u30.b d;
    public final u30.b e;
    public final int f;
    public final boolean g;
    public final String h;
    public final boolean i;
    public final qr.r j;
    public final boolean k;
    public final boolean l;
    public final u30.b m;
    public final boolean n;
    public final u30.b o;
    public final u30.b p;
    public final boolean q;
    public final boolean r;
    public final String s;
    public final boolean t;
    public final boolean u;

    public u0(boolean z, dw.a aVar, u30.b playerItems, u30.b visiblePlayerItems, u30.b downloadablePlayerItems, int i, boolean z2, String str, boolean z3, qr.r rVar, boolean z4, boolean z5, u30.b favorites, boolean z6, u30.b downloadedSurahs, u30.b downloadingProgress, boolean z7, boolean z8, String str2, boolean z9, boolean z11) {
        kotlin.jvm.internal.m.e(playerItems, "playerItems");
        kotlin.jvm.internal.m.e(visiblePlayerItems, "visiblePlayerItems");
        kotlin.jvm.internal.m.e(downloadablePlayerItems, "downloadablePlayerItems");
        kotlin.jvm.internal.m.e(favorites, "favorites");
        kotlin.jvm.internal.m.e(downloadedSurahs, "downloadedSurahs");
        kotlin.jvm.internal.m.e(downloadingProgress, "downloadingProgress");
        this.a = z;
        this.b = aVar;
        this.c = playerItems;
        this.d = visiblePlayerItems;
        this.e = downloadablePlayerItems;
        this.f = i;
        this.g = z2;
        this.h = str;
        this.i = z3;
        this.j = rVar;
        this.k = z4;
        this.l = z5;
        this.m = favorites;
        this.n = z6;
        this.o = downloadedSurahs;
        this.p = downloadingProgress;
        this.q = z7;
        this.r = z8;
        this.s = str2;
        this.t = z9;
        this.u = z11;
    }

    public static u0 a(u0 u0Var, dw.a aVar, u30.b bVar, u30.b bVar2, u30.b bVar3, int i, boolean z, String str, boolean z2, qr.r rVar, boolean z3, boolean z4, u30.b bVar4, boolean z5, u30.b bVar5, u30.b bVar6, boolean z6, boolean z7, String str2, boolean z8, boolean z9, int i2) {
        boolean z11 = (i2 & 1) != 0 ? u0Var.a : false;
        dw.a aVar2 = (i2 & 2) != 0 ? u0Var.b : aVar;
        u30.b playerItems = (i2 & 4) != 0 ? u0Var.c : bVar;
        u30.b visiblePlayerItems = (i2 & 8) != 0 ? u0Var.d : bVar2;
        u30.b downloadablePlayerItems = (i2 & 16) != 0 ? u0Var.e : bVar3;
        int i3 = (i2 & 32) != 0 ? u0Var.f : i;
        boolean z12 = (i2 & 64) != 0 ? u0Var.g : z;
        String searchValue = (i2 & 128) != 0 ? u0Var.h : str;
        boolean z13 = (i2 & 256) != 0 ? u0Var.i : z2;
        qr.r selectedFilter = (i2 & 512) != 0 ? u0Var.j : rVar;
        boolean z14 = (i2 & 1024) != 0 ? u0Var.k : z3;
        boolean z15 = (i2 & 2048) != 0 ? u0Var.l : z4;
        u30.b favorites = (i2 & 4096) != 0 ? u0Var.m : bVar4;
        boolean z16 = (i2 & 8192) != 0 ? u0Var.n : z5;
        boolean z17 = z11;
        u30.b downloadedSurahs = (i2 & 16384) != 0 ? u0Var.o : bVar5;
        u30.b downloadingProgress = (i2 & 32768) != 0 ? u0Var.p : bVar6;
        dw.a aVar3 = aVar2;
        boolean z18 = (i2 & 65536) != 0 ? u0Var.q : z6;
        boolean z19 = (i2 & 131072) != 0 ? u0Var.r : z7;
        String str3 = (i2 & 262144) != 0 ? u0Var.s : str2;
        boolean z21 = (i2 & 524288) != 0 ? u0Var.t : z8;
        boolean z22 = (i2 & 1048576) != 0 ? u0Var.u : z9;
        u0Var.getClass();
        kotlin.jvm.internal.m.e(playerItems, "playerItems");
        kotlin.jvm.internal.m.e(visiblePlayerItems, "visiblePlayerItems");
        kotlin.jvm.internal.m.e(downloadablePlayerItems, "downloadablePlayerItems");
        kotlin.jvm.internal.m.e(searchValue, "searchValue");
        kotlin.jvm.internal.m.e(selectedFilter, "selectedFilter");
        kotlin.jvm.internal.m.e(favorites, "favorites");
        kotlin.jvm.internal.m.e(downloadedSurahs, "downloadedSurahs");
        kotlin.jvm.internal.m.e(downloadingProgress, "downloadingProgress");
        return new u0(z17, aVar3, playerItems, visiblePlayerItems, downloadablePlayerItems, i3, z12, searchValue, z13, selectedFilter, z14, z15, favorites, z16, downloadedSurahs, downloadingProgress, z18, z19, str3, z21, z22);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return this.a == u0Var.a && kotlin.jvm.internal.m.a(this.b, u0Var.b) && kotlin.jvm.internal.m.a(this.c, u0Var.c) && kotlin.jvm.internal.m.a(this.d, u0Var.d) && kotlin.jvm.internal.m.a(this.e, u0Var.e) && this.f == u0Var.f && this.g == u0Var.g && kotlin.jvm.internal.m.a(this.h, u0Var.h) && this.i == u0Var.i && this.j == u0Var.j && this.k == u0Var.k && this.l == u0Var.l && kotlin.jvm.internal.m.a(this.m, u0Var.m) && this.n == u0Var.n && kotlin.jvm.internal.m.a(this.o, u0Var.o) && kotlin.jvm.internal.m.a(this.p, u0Var.p) && this.q == u0Var.q && this.r == u0Var.r && kotlin.jvm.internal.m.a(this.s, u0Var.s) && this.t == u0Var.t && this.u == u0Var.u;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        dw.a aVar = this.b;
        int iE = w.c.e(w.c.e(g4.c.c(this.p, g4.c.c(this.o, w.c.e(g4.c.c(this.m, w.c.e(w.c.e((this.j.hashCode() + w.c.e(x5.e(w.c.e(w.c.d(this.f, g4.c.c(this.e, g4.c.c(this.d, g4.c.c(this.c, (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31), 31), 31), 31), 31, this.g), this.h, 31), 31, this.i)) * 31, 31, this.k), 31, this.l), 31), 31, this.n), 31), 31), 31, this.q), 31, this.r);
        String str = this.s;
        return Boolean.hashCode(this.u) + w.c.e((iE + (str != null ? str.hashCode() : 0)) * 31, 31, this.t);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistUiState(isLoading=");
        sb.append(this.a);
        sb.append(", playlist=");
        sb.append(this.b);
        sb.append(", playerItems=");
        sb.append(this.c);
        sb.append(", visiblePlayerItems=");
        sb.append(this.d);
        sb.append(", downloadablePlayerItems=");
        sb.append(this.e);
        sb.append(", downloadedDownloadableCount=");
        sb.append(this.f);
        sb.append(", showsDownloadSection=");
        sb.append(this.g);
        sb.append(", searchValue=");
        sb.append(this.h);
        sb.append(", isSearchFocused=");
        sb.append(this.i);
        sb.append(", selectedFilter=");
        sb.append(this.j);
        sb.append(", showsFilterChips=");
        oi.k.y(sb, this.k, ", showsSearchBar=", this.l, ", favorites=");
        sb.append(this.m);
        sb.append(", isInternetConnected=");
        sb.append(this.n);
        sb.append(", downloadedSurahs=");
        sb.append(this.o);
        sb.append(", downloadingProgress=");
        sb.append(this.p);
        sb.append(", showDownloadAllDialogVisible=");
        oi.k.y(sb, this.q, ", showDownloadingInProgressDialog=", this.r, ", otherDownloadingReciterName=");
        sb.append(this.s);
        sb.append(", showDownloadCompleteDialog=");
        sb.append(this.t);
        sb.append(", isShareAvailable=");
        return g4.c.l(sb, this.u, ")");
    }
}
