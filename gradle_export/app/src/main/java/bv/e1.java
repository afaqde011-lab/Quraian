package bv;

import com.mchutov.quranify.player.domain.model.PlayerItem;

public final class e1 implements g1 {
    public final PlayerItem a;

    public e1(PlayerItem playerItem) {
        kotlin.jvm.internal.m.e(playerItem, "playerItem");
        this.a = playerItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e1) && kotlin.jvm.internal.m.a(this.a, ((e1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnToggleTrackListItemFavorites(playerItem=" + this.a + ")";
    }
}
