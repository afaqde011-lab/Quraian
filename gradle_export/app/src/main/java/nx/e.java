package nx;

import com.mchutov.quranify.player.domain.model.PlayerItem;

public final class e implements x {
    public final PlayerItem a;

    public e(PlayerItem playerItem) {
        this.a = playerItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && kotlin.jvm.internal.m.a(this.a, ((e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnDeleteClicked(playerItem=" + this.a + ")";
    }
}
