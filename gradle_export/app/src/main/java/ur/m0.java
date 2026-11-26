package ur;

import com.mchutov.quranify.player.domain.model.PlayerItem;

public final class m0 implements p0 {
    public final PlayerItem a;

    public m0(PlayerItem playerItem) {
        kotlin.jvm.internal.m.e(playerItem, "playerItem");
        this.a = playerItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0) && kotlin.jvm.internal.m.a(this.a, ((m0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnToggleFavoritesClicked(playerItem=" + this.a + ")";
    }
}
