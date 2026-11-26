package as;

import com.mchutov.quranify.player.domain.model.PlayerItem;

public final class m implements u {
    public final PlayerItem a;

    public m(PlayerItem playerItem) {
        kotlin.jvm.internal.m.e(playerItem, "playerItem");
        this.a = playerItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && kotlin.jvm.internal.m.a(this.a, ((m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnPlayerItemClicked(playerItem=" + this.a + ")";
    }
}
