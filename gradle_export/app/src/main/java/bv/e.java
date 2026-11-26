package bv;

import com.mchutov.quranify.player.presentation.screen.bottomsheet.FullScreenLauncher;

public final class e implements g1 {
    public final FullScreenLauncher a;

    public e(FullScreenLauncher fullScreenLauncher) {
        this.a = fullScreenLauncher;
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
        return "OnBottomSheetVisible(launcher=" + this.a + ")";
    }
}
