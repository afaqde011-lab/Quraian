package qr;

import com.mchutov.quranify.player.domain.model.PlayerItem;

public final class m {
    public final boolean a;
    public final PlayerItem b;
    public final boolean c;

    public m(PlayerItem playerItem, boolean z, boolean z2) {
        this.a = z;
        this.b = playerItem;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.a == mVar.a && kotlin.jvm.internal.m.a(this.b, mVar.b) && this.c == mVar.c;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        PlayerItem playerItem = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (playerItem == null ? 0 : playerItem.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HomeSurahDataDvo(isRefreshing=");
        sb.append(this.a);
        sb.append(", selectedPlayerItem=");
        sb.append(this.b);
        sb.append(", isPlaying=");
        return g4.c.l(sb, this.c, ")");
    }
}
