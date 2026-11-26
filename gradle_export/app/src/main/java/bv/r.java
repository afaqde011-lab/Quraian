package bv;

import com.mchutov.quranify.player.domain.model.PlayerItem;

public final class r implements g1 {
    public final PlayerItem a;

    public r(PlayerItem playerItem) {
        kotlin.jvm.internal.m.e(playerItem, "playerItem");
        this.a = playerItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && kotlin.jvm.internal.m.a(this.a, ((r) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnDownloadTrackListItem(playerItem=" + this.a + ")";
    }
}
