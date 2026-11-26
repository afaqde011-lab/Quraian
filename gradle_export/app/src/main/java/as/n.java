package as;

import com.mchutov.quranify.player.domain.model.PlayerItem;

public final class n implements u {
    public final PlayerItem a;

    public n(PlayerItem playerItem) {
        kotlin.jvm.internal.m.e(playerItem, "playerItem");
        this.a = playerItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && kotlin.jvm.internal.m.a(this.a, ((n) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnPlayerItemDownloadClicked(playerItem=" + this.a + ")";
    }
}
