package nx;

import com.mchutov.quranify.player.domain.model.PlayerItem;

public final class w implements x {
    public final PlayerItem a;

    public w(PlayerItem playerItem) {
        this.a = playerItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && kotlin.jvm.internal.m.a(this.a, ((w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnToggleFavoritesClicked(playerItem=" + this.a + ")";
    }
}
