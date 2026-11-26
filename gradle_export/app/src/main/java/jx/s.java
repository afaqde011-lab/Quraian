package jx;

import com.google.android.gms.internal.measurement.x5;

public final class s {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final u30.b d;
    public final u30.b e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final float i;
    public final float j;
    public final boolean k;
    public final u30.b l;

    public s(boolean z, boolean z2, String title, u30.b reciters, u30.b filteredReciters, String str, boolean z3, boolean z4, float f, float f2, boolean z5, u30.b downloadedReciters) {
        kotlin.jvm.internal.m.e(title, "title");
        kotlin.jvm.internal.m.e(reciters, "reciters");
        kotlin.jvm.internal.m.e(filteredReciters, "filteredReciters");
        kotlin.jvm.internal.m.e(downloadedReciters, "downloadedReciters");
        this.a = z;
        this.b = z2;
        this.c = title;
        this.d = reciters;
        this.e = filteredReciters;
        this.f = str;
        this.g = z3;
        this.h = z4;
        this.i = f;
        this.j = f2;
        this.k = z5;
        this.l = downloadedReciters;
    }

    public static s a(s sVar, u30.b bVar, u30.b bVar2, String str, boolean z, boolean z2, float f, float f2, boolean z3, u30.b bVar3, int i) {
        boolean z4 = (i & 1) != 0 ? sVar.a : false;
        boolean z5 = sVar.b;
        String title = sVar.c;
        u30.b reciters = (i & 8) != 0 ? sVar.d : bVar;
        u30.b filteredReciters = (i & 16) != 0 ? sVar.e : bVar2;
        String searchValue = (i & 32) != 0 ? sVar.f : str;
        boolean z6 = (i & 64) != 0 ? sVar.g : z;
        boolean z7 = (i & 128) != 0 ? sVar.h : z2;
        float f3 = (i & 256) != 0 ? sVar.i : f;
        float f4 = (i & 512) != 0 ? sVar.j : f2;
        boolean z8 = (i & 1024) != 0 ? sVar.k : z3;
        u30.b downloadedReciters = (i & 2048) != 0 ? sVar.l : bVar3;
        sVar.getClass();
        kotlin.jvm.internal.m.e(title, "title");
        kotlin.jvm.internal.m.e(reciters, "reciters");
        kotlin.jvm.internal.m.e(filteredReciters, "filteredReciters");
        kotlin.jvm.internal.m.e(searchValue, "searchValue");
        kotlin.jvm.internal.m.e(downloadedReciters, "downloadedReciters");
        return new s(z4, z5, title, reciters, filteredReciters, searchValue, z6, z7, f3, f4, z8, downloadedReciters);
    }

    public final boolean b() {
        return ((h00.b) this.d).size() >= 10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.a == sVar.a && this.b == sVar.b && kotlin.jvm.internal.m.a(this.c, sVar.c) && kotlin.jvm.internal.m.a(this.d, sVar.d) && kotlin.jvm.internal.m.a(this.e, sVar.e) && this.f.equals(sVar.f) && this.g == sVar.g && this.h == sVar.h && y3.f.b(this.i, sVar.i) && y3.f.b(this.j, sVar.j) && this.k == sVar.k && kotlin.jvm.internal.m.a(this.l, sVar.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + w.c.e(w.c.c(this.j, w.c.c(this.i, w.c.e(w.c.e(x5.e(g4.c.c(this.e, g4.c.c(this.d, x5.e(w.c.e(Boolean.hashCode(this.a) * 31, 31, this.b), this.c, 31), 31), 31), this.f, 31), 31, this.g), 31, this.h), 31), 31), 31, this.k);
    }

    public final String toString() {
        String strC = y3.f.c(this.i);
        String strC2 = y3.f.c(this.j);
        StringBuilder sb = new StringBuilder("TopRecitersUiState(isLoading=");
        sb.append(this.a);
        sb.append(", isSearchExpected=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", reciters=");
        sb.append(this.d);
        sb.append(", filteredReciters=");
        sb.append(this.e);
        sb.append(", searchValue=");
        sb.append(this.f);
        sb.append(", isSearchVisible=");
        oi.k.y(sb, this.g, ", isSearchFocused=", this.h, ", topContentHeight=");
        a1.b.z(sb, strC, ", titleTextHeight=", strC2, ", isInternetConnected=");
        sb.append(this.k);
        sb.append(", downloadedReciters=");
        sb.append(this.l);
        sb.append(")");
        return sb.toString();
    }
}
