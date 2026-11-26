package fy;

public final class u {
    public final String a;
    public final u30.b b;
    public final u30.b c;
    public final u30.b d;
    public final boolean e;
    public final boolean f;
    public final u30.b g;
    public final u30.b h;
    public final u30.b i;

    public u(String str, u30.b searchResults, u30.b recentItems, u30.b recentDisplayResults, boolean z, boolean z2, u30.b downloadedReciterIds, u30.b downloadedCollectionIds, u30.b downloadedSurahNumbers) {
        kotlin.jvm.internal.m.e(searchResults, "searchResults");
        kotlin.jvm.internal.m.e(recentItems, "recentItems");
        kotlin.jvm.internal.m.e(recentDisplayResults, "recentDisplayResults");
        kotlin.jvm.internal.m.e(downloadedReciterIds, "downloadedReciterIds");
        kotlin.jvm.internal.m.e(downloadedCollectionIds, "downloadedCollectionIds");
        kotlin.jvm.internal.m.e(downloadedSurahNumbers, "downloadedSurahNumbers");
        this.a = str;
        this.b = searchResults;
        this.c = recentItems;
        this.d = recentDisplayResults;
        this.e = z;
        this.f = z2;
        this.g = downloadedReciterIds;
        this.h = downloadedCollectionIds;
        this.i = downloadedSurahNumbers;
    }

    public static u a(u uVar, String str, u30.b bVar, u30.b bVar2, u30.b bVar3, boolean z, boolean z2, u30.b bVar4, u30.b bVar5, u30.b bVar6, int i) {
        if ((i & 1) != 0) {
            str = uVar.a;
        }
        String searchValue = str;
        if ((i & 2) != 0) {
            bVar = uVar.b;
        }
        u30.b searchResults = bVar;
        if ((i & 4) != 0) {
            bVar2 = uVar.c;
        }
        u30.b recentItems = bVar2;
        if ((i & 8) != 0) {
            bVar3 = uVar.d;
        }
        u30.b recentDisplayResults = bVar3;
        if ((i & 16) != 0) {
            z = uVar.e;
        }
        boolean z3 = z;
        boolean z4 = (i & 32) != 0 ? uVar.f : z2;
        u30.b downloadedReciterIds = (i & 64) != 0 ? uVar.g : bVar4;
        u30.b downloadedCollectionIds = (i & 128) != 0 ? uVar.h : bVar5;
        u30.b downloadedSurahNumbers = (i & 256) != 0 ? uVar.i : bVar6;
        uVar.getClass();
        kotlin.jvm.internal.m.e(searchValue, "searchValue");
        kotlin.jvm.internal.m.e(searchResults, "searchResults");
        kotlin.jvm.internal.m.e(recentItems, "recentItems");
        kotlin.jvm.internal.m.e(recentDisplayResults, "recentDisplayResults");
        kotlin.jvm.internal.m.e(downloadedReciterIds, "downloadedReciterIds");
        kotlin.jvm.internal.m.e(downloadedCollectionIds, "downloadedCollectionIds");
        kotlin.jvm.internal.m.e(downloadedSurahNumbers, "downloadedSurahNumbers");
        return new u(searchValue, searchResults, recentItems, recentDisplayResults, z3, z4, downloadedReciterIds, downloadedCollectionIds, downloadedSurahNumbers);
    }

    public final boolean b() {
        return (this.g.isEmpty() && this.h.isEmpty()) ? false : true;
    }

    public final String c() {
        return r30.k.j1(this.a).toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return kotlin.jvm.internal.m.a(this.a, uVar.a) && kotlin.jvm.internal.m.a(this.b, uVar.b) && kotlin.jvm.internal.m.a(this.c, uVar.c) && kotlin.jvm.internal.m.a(this.d, uVar.d) && this.e == uVar.e && this.f == uVar.f && kotlin.jvm.internal.m.a(this.g, uVar.g) && kotlin.jvm.internal.m.a(this.h, uVar.h) && kotlin.jvm.internal.m.a(this.i, uVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + g4.c.c(this.h, g4.c.c(this.g, w.c.e(w.c.e(g4.c.c(this.d, g4.c.c(this.c, g4.c.c(this.b, this.a.hashCode() * 31, 31), 31), 31), 31, this.e), 31, this.f), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchUiState(searchValue=");
        sb.append(this.a);
        sb.append(", searchResults=");
        sb.append(this.b);
        sb.append(", recentItems=");
        sb.append(this.c);
        sb.append(", recentDisplayResults=");
        sb.append(this.d);
        sb.append(", isInternetConnected=");
        oi.k.y(sb, this.e, ", isPremium=", this.f, ", downloadedReciterIds=");
        sb.append(this.g);
        sb.append(", downloadedCollectionIds=");
        sb.append(this.h);
        sb.append(", downloadedSurahNumbers=");
        sb.append(this.i);
        sb.append(")");
        return sb.toString();
    }
}
