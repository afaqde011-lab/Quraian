package ur;

import com.mchutov.quranify.player.domain.model.PlayerItem;

public final class z implements p0 {
    public final PlayerItem a;

    public z(PlayerItem playerItem) {
        kotlin.jvm.internal.m.e(playerItem, "playerItem");
        this.a = playerItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && kotlin.jvm.internal.m.a(this.a, ((z) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnPlayerItemClicked(playerItem=" + this.a + ")";
    }
}
