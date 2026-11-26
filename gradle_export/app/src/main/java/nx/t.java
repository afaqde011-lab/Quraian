package nx;

import com.mchutov.quranify.player.domain.model.PlayerItem;

public final class t implements x {
    public final PlayerItem a;

    public t(PlayerItem playerItem) {
        this.a = playerItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && kotlin.jvm.internal.m.a(this.a, ((t) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnShareSurahClicked(playerItem=" + this.a + ")";
    }
}
