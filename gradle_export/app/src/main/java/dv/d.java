package dv;

import com.mchutov.quranify.player.domain.model.PlayerItem;
import kotlin.jvm.internal.m;

public final class d {
    public final PlayerItem a;
    public final boolean b;
    public final boolean c;

    public d(PlayerItem playerItem, boolean z, boolean z2) {
        this.a = playerItem;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return m.a(this.a, dVar.a) && this.b == dVar.b && this.c == dVar.c;
    }

    public final int hashCode() {
        PlayerItem playerItem = this.a;
        return Boolean.hashCode(this.c) + w.c.e((playerItem == null ? 0 : playerItem.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerReciterState(selectedPlayerItem=");
        sb.append(this.a);
        sb.append(", isPlaying=");
        sb.append(this.b);
        sb.append(", isShuffling=");
        return g4.c.l(sb, this.c, ")");
    }
}
