package dq;

import com.mchutov.quranify.player.domain.model.PlayerItem;

public final class c implements d {
    public final PlayerItem a;

    public c(PlayerItem playerItem) {
        this.a = playerItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && kotlin.jvm.internal.m.a(this.a, ((c) obj).a);
    }

    public final int hashCode() {
        PlayerItem playerItem = this.a;
        if (playerItem == null) {
            return 0;
        }
        return playerItem.hashCode();
    }

    public final String toString() {
        return "OnToggleFavorites(playerItem=" + this.a + ")";
    }
}
