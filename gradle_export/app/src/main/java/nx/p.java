package nx;

import com.mchutov.quranify.player.domain.model.PlayerItem;

public final class p implements x {
    public final PlayerItem a;

    public p(PlayerItem playerItem) {
        this.a = playerItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && kotlin.jvm.internal.m.a(this.a, ((p) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnPlayerItemClicked(playerItem=" + this.a + ")";
    }
}
