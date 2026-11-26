package nx;

import com.google.android.gms.internal.measurement.x5;

public final class i0 {
    public final boolean a;
    public final bx.c b;
    public final u30.b c;
    public final u30.b d;
    public final String e;
    public final u30.b f;
    public final u30.b g;
    public final boolean h;
    public final u30.b i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final String m;
    public final boolean n;
    public final boolean o;
    public final Integer p;

    public i0(bx.c cVar, u30.b bVar, u30.b bVar2, boolean z, boolean z2, Integer num, int i) {
        bx.c cVar2 = (i & 2) != 0 ? null : cVar;
        int i2 = i & 4;
        h00.x xVar = h00.x.A;
        this(true, cVar2, i2 != 0 ? ze.d.E(xVar) : bVar, ze.d.E(xVar), "", ze.d.E(xVar), (i & 64) != 0 ? ze.d.E(xVar) : bVar2, (i & 128) != 0 ? false : z, ze.d.E(xVar), (i & 512) != 0 ? true : z2, false, false, null, false, false, (i & 32768) != 0 ? null : num);
    }

    public i0(boolean z, bx.c cVar, u30.b playerItems, u30.b filteredPlayerItems, String str, u30.b downloadedSurahIds, u30.b favoritesSurahIds, boolean z2, u30.b downloadingProgress, boolean z3, boolean z4, boolean z5, String str2, boolean z6, boolean z7, Integer num) {
        kotlin.jvm.internal.m.e(playerItems, "playerItems");
        kotlin.jvm.internal.m.e(filteredPlayerItems, "filteredPlayerItems");
        kotlin.jvm.internal.m.e(downloadedSurahIds, "downloadedSurahIds");
        kotlin.jvm.internal.m.e(favoritesSurahIds, "favoritesSurahIds");
        kotlin.jvm.internal.m.e(downloadingProgress, "downloadingProgress");
        this.a = z;
        this.b = cVar;
        this.c = playerItems;
        this.d = filteredPlayerItems;
        this.e = str;
        this.f = downloadedSurahIds;
        this.g = favoritesSurahIds;
        this.h = z2;
        this.i = downloadingProgress;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = str2;
        this.n = z6;
        this.o = z7;
        this.p = num;
    }

    public static i0 a(i0 i0Var, bx.c cVar, u30.b bVar, u30.b bVar2, String str, u30.b bVar3, u30.b bVar4, boolean z, u30.b bVar5, boolean z2, boolean z3, boolean z4, String str2, boolean z5, boolean z6, int i) {
        boolean z7 = (i & 1) != 0 ? i0Var.a : false;
        bx.c cVar2 = (i & 2) != 0 ? i0Var.b : cVar;
        u30.b playerItems = (i & 4) != 0 ? i0Var.c : bVar;
        u30.b filteredPlayerItems = (i & 8) != 0 ? i0Var.d : bVar2;
        String searchValue = (i & 16) != 0 ? i0Var.e : str;
        u30.b downloadedSurahIds = (i & 32) != 0 ? i0Var.f : bVar3;
        u30.b favoritesSurahIds = (i & 64) != 0 ? i0Var.g : bVar4;
        boolean z8 = (i & 128) != 0 ? i0Var.h : z;
        u30.b downloadingProgress = (i & 256) != 0 ? i0Var.i : bVar5;
        boolean z9 = (i & 512) != 0 ? i0Var.j : z2;
        boolean z11 = (i & 1024) != 0 ? i0Var.k : z3;
        boolean z12 = (i & 2048) != 0 ? i0Var.l : z4;
        String str3 = (i & 4096) != 0 ? i0Var.m : str2;
        boolean z13 = (i & 8192) != 0 ? i0Var.n : z5;
        boolean z14 = (i & 16384) != 0 ? i0Var.o : z6;
        Integer num = (i & 32768) != 0 ? i0Var.p : null;
        i0Var.getClass();
        kotlin.jvm.internal.m.e(playerItems, "playerItems");
        kotlin.jvm.internal.m.e(filteredPlayerItems, "filteredPlayerItems");
        kotlin.jvm.internal.m.e(searchValue, "searchValue");
        kotlin.jvm.internal.m.e(downloadedSurahIds, "downloadedSurahIds");
        kotlin.jvm.internal.m.e(favoritesSurahIds, "favoritesSurahIds");
        kotlin.jvm.internal.m.e(downloadingProgress, "downloadingProgress");
        return new i0(z7, cVar2, playerItems, filteredPlayerItems, searchValue, downloadedSurahIds, favoritesSurahIds, z8, downloadingProgress, z9, z11, z12, str3, z13, z14, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.a == i0Var.a && kotlin.jvm.internal.m.a(this.b, i0Var.b) && kotlin.jvm.internal.m.a(this.c, i0Var.c) && kotlin.jvm.internal.m.a(this.d, i0Var.d) && kotlin.jvm.internal.m.a(this.e, i0Var.e) && kotlin.jvm.internal.m.a(this.f, i0Var.f) && kotlin.jvm.internal.m.a(this.g, i0Var.g) && this.h == i0Var.h && kotlin.jvm.internal.m.a(this.i, i0Var.i) && this.j == i0Var.j && this.k == i0Var.k && this.l == i0Var.l && kotlin.jvm.internal.m.a(this.m, i0Var.m) && this.n == i0Var.n && this.o == i0Var.o && kotlin.jvm.internal.m.a(this.p, i0Var.p);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        bx.c cVar = this.b;
        int iE = w.c.e(w.c.e(w.c.e(g4.c.c(this.i, w.c.e(g4.c.c(this.g, g4.c.c(this.f, x5.e(g4.c.c(this.d, g4.c.c(this.c, (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31, 31), 31), this.e, 31), 31), 31), 31, this.h), 31), 31, this.j), 31, this.k), 31, this.l);
        String str = this.m;
        int iE2 = w.c.e(w.c.e((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.n), 31, this.o);
        Integer num = this.p;
        return iE2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReciterUiState(isLoading=");
        sb.append(this.a);
        sb.append(", reciter=");
        sb.append(this.b);
        sb.append(", playerItems=");
        sb.append(this.c);
        sb.append(", filteredPlayerItems=");
        sb.append(this.d);
        sb.append(", searchValue=");
        sb.append(this.e);
        sb.append(", downloadedSurahIds=");
        sb.append(this.f);
        sb.append(", favoritesSurahIds=");
        sb.append(this.g);
        sb.append(", isFavoriteReciter=");
        sb.append(this.h);
        sb.append(", downloadingProgress=");
        sb.append(this.i);
        sb.append(", isInternetConnected=");
        sb.append(this.j);
        sb.append(", showDownloadAllDialogVisible=");
        oi.k.y(sb, this.k, ", showDownloadingInProgressDialog=", this.l, ", otherDownloadingReciterName=");
        sb.append(this.m);
        sb.append(", showDownloadCompleteDialog=");
        sb.append(this.n);
        sb.append(", isReciterInfoDialogVisible=");
        sb.append(this.o);
        sb.append(", sharedSurahNumber=");
        sb.append(this.p);
        sb.append(")");
        return sb.toString();
    }
}
