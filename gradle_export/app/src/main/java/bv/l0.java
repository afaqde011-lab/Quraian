package bv;

import com.mchutov.quranify.player.domain.model.PlayerItem;

public final class l0 implements g1 {
    public final PlayerItem a;

    public l0(PlayerItem playerItem) {
        kotlin.jvm.internal.m.e(playerItem, "playerItem");
        this.a = playerItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0) && kotlin.jvm.internal.m.a(this.a, ((l0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnPlayPlayerItem(playerItem=" + this.a + ")";
    }
}
