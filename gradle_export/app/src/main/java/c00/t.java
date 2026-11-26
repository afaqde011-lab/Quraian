package c00;

import com.google.android.gms.internal.measurement.x5;

public final class t {
    public final boolean a;
    public final u30.b b;
    public final u30.b c;
    public final u30.f d;
    public final String e;
    public final zz.a f;
    public final zz.a g;
    public final String h;

    public t(boolean z, u30.b items, u30.b filteredItems, u30.f fVar, String str, zz.a aVar, zz.a aVar2, String str2) {
        kotlin.jvm.internal.m.e(items, "items");
        kotlin.jvm.internal.m.e(filteredItems, "filteredItems");
        this.a = z;
        this.b = items;
        this.c = filteredItems;
        this.d = fVar;
        this.e = str;
        this.f = aVar;
        this.g = aVar2;
        this.h = str2;
    }

    public static t a(t tVar, boolean z, u30.b bVar, u30.b bVar2, u30.f fVar, String str, zz.a aVar, zz.a aVar2, int i) {
        if ((i & 1) != 0) {
            z = tVar.a;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            bVar = tVar.b;
        }
        u30.b items = bVar;
        if ((i & 4) != 0) {
            bVar2 = tVar.c;
        }
        u30.b filteredItems = bVar2;
        if ((i & 8) != 0) {
            fVar = tVar.d;
        }
        u30.f assetStates = fVar;
        if ((i & 16) != 0) {
            str = tVar.e;
        }
        String searchQuery = str;
        if ((i & 32) != 0) {
            aVar = tVar.f;
        }
        zz.a aVar3 = aVar;
        zz.a aVar4 = (i & 64) != 0 ? tVar.g : aVar2;
        String str2 = (i & 128) != 0 ? tVar.h : null;
        tVar.getClass();
        kotlin.jvm.internal.m.e(items, "items");
        kotlin.jvm.internal.m.e(filteredItems, "filteredItems");
        kotlin.jvm.internal.m.e(assetStates, "assetStates");
        kotlin.jvm.internal.m.e(searchQuery, "searchQuery");
        return new t(z2, items, filteredItems, assetStates, searchQuery, aVar3, aVar4, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.a == tVar.a && kotlin.jvm.internal.m.a(this.b, tVar.b) && kotlin.jvm.internal.m.a(this.c, tVar.c) && kotlin.jvm.internal.m.a(this.d, tVar.d) && kotlin.jvm.internal.m.a(this.e, tVar.e) && kotlin.jvm.internal.m.a(this.f, tVar.f) && kotlin.jvm.internal.m.a(this.g, tVar.g) && kotlin.jvm.internal.m.a(this.h, tVar.h);
    }

    public final int hashCode() {
        int iE = x5.e((this.d.hashCode() + g4.c.c(this.c, g4.c.c(this.b, Boolean.hashCode(this.a) * 31, 31), 31)) * 31, this.e, 31);
        zz.a aVar = this.f;
        int iHashCode = (iE + (aVar == null ? 0 : aVar.hashCode())) * 31;
        zz.a aVar2 = this.g;
        int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        String str = this.h;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "SoundEffectPickerUiState(isLoading=" + this.a + ", items=" + this.b + ", filteredItems=" + this.c + ", assetStates=" + this.d + ", searchQuery=" + this.e + ", pendingSelection=" + this.f + ", committedSelection=" + this.g + ", errorMessage=" + this.h + ")";
    }
}
