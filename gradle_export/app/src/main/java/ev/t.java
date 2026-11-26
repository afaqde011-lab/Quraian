package ev;

import com.google.android.gms.internal.measurement.x5;
import com.mchutov.quranify.player.domain.model.PlayerItem;

public final class t {
    public final u30.b a;
    public final boolean b;
    public final String c;
    public final int d;
    public final int e;
    public final PlayerItem f;
    public final u30.c g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final pu.e k;
    public final boolean l;

    public t(u30.b reciters, boolean z, String str, int i, int i2, PlayerItem playerItem, u30.c unavailableReciterIds, boolean z2, boolean z3, boolean z4, pu.e eVar, boolean z5) {
        kotlin.jvm.internal.m.e(reciters, "reciters");
        kotlin.jvm.internal.m.e(unavailableReciterIds, "unavailableReciterIds");
        this.a = reciters;
        this.b = z;
        this.c = str;
        this.d = i;
        this.e = i2;
        this.f = playerItem;
        this.g = unavailableReciterIds;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = eVar;
        this.l = z5;
    }

    public static t a(t tVar, u30.b bVar, boolean z, String str, int i, int i2, PlayerItem playerItem, u30.c cVar, boolean z2, boolean z3, boolean z4, pu.e eVar, boolean z5, int i3) {
        if ((i3 & 1) != 0) {
            bVar = tVar.a;
        }
        u30.b reciters = bVar;
        if ((i3 & 2) != 0) {
            z = tVar.b;
        }
        boolean z6 = z;
        String query = (i3 & 4) != 0 ? tVar.c : str;
        int i4 = (i3 & 8) != 0 ? tVar.d : i;
        int i5 = (i3 & 16) != 0 ? tVar.e : i2;
        PlayerItem playerItem2 = (i3 & 32) != 0 ? tVar.f : playerItem;
        u30.c unavailableReciterIds = (i3 & 64) != 0 ? tVar.g : cVar;
        boolean z7 = (i3 & 128) != 0 ? tVar.h : z2;
        boolean z8 = (i3 & 256) != 0 ? tVar.i : z3;
        boolean z9 = (i3 & 512) != 0 ? tVar.j : z4;
        pu.e eVar2 = (i3 & 1024) != 0 ? tVar.k : eVar;
        boolean z11 = (i3 & 2048) != 0 ? tVar.l : z5;
        tVar.getClass();
        kotlin.jvm.internal.m.e(reciters, "reciters");
        kotlin.jvm.internal.m.e(query, "query");
        kotlin.jvm.internal.m.e(unavailableReciterIds, "unavailableReciterIds");
        return new t(reciters, z6, query, i4, i5, playerItem2, unavailableReciterIds, z7, z8, z9, eVar2, z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return kotlin.jvm.internal.m.a(this.a, tVar.a) && this.b == tVar.b && kotlin.jvm.internal.m.a(this.c, tVar.c) && this.d == tVar.d && this.e == tVar.e && kotlin.jvm.internal.m.a(this.f, tVar.f) && kotlin.jvm.internal.m.a(this.g, tVar.g) && this.h == tVar.h && this.i == tVar.i && this.j == tVar.j && this.k == tVar.k && this.l == tVar.l;
    }

    public final int hashCode() {
        int iD = w.c.d(this.e, w.c.d(this.d, x5.e(w.c.e(this.a.hashCode() * 31, 31, this.b), this.c, 31), 31), 31);
        PlayerItem playerItem = this.f;
        int iE = w.c.e(w.c.e(w.c.e((this.g.hashCode() + ((iD + (playerItem == null ? 0 : playerItem.hashCode())) * 31)) * 31, 31, this.h), 31, this.i), 31, this.j);
        pu.e eVar = this.k;
        return Boolean.hashCode(this.l) + ((iE + (eVar != null ? eVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReciterPickerUiState(reciters=");
        sb.append(this.a);
        sb.append(", hasReciters=");
        sb.append(this.b);
        sb.append(", query=");
        sb.append(this.c);
        sb.append(", selectedReciterId=");
        sb.append(this.d);
        sb.append(", newSelectedReciterId=");
        sb.append(this.e);
        sb.append(", selectedPlayerItem=");
        sb.append(this.f);
        sb.append(", unavailableReciterIds=");
        sb.append(this.g);
        sb.append(", isLoading=");
        sb.append(this.h);
        sb.append(", hasLoadFailed=");
        oi.k.y(sb, this.i, ", isFallbackAlertVisible=", this.j, ", memorizationRefusal=");
        sb.append(this.k);
        sb.append(", isCheckingMemorizationReciter=");
        sb.append(this.l);
        sb.append(")");
        return sb.toString();
    }
}
