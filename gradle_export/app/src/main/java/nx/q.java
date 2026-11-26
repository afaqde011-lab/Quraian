package nx;

import com.mchutov.quranify.player.domain.model.PlayerItem;

public final class q implements x {
    public final PlayerItem a;

    public q(PlayerItem playerItem) {
        this.a = playerItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && kotlin.jvm.internal.m.a(this.a, ((q) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnPlayerItemDownloadClicked(playerItem=" + this.a + ")";
    }
}
