package as;

import com.mchutov.quranify.player.domain.model.PlayerItem;

public final class k implements u {
    public final PlayerItem a;

    public k(PlayerItem playerItem) {
        kotlin.jvm.internal.m.e(playerItem, "playerItem");
        this.a = playerItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && kotlin.jvm.internal.m.a(this.a, ((k) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnPlayerDeletePlayerItemClicked(playerItem=" + this.a + ")";
    }
}
