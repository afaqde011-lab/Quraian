package hx;

import com.mchutov.quranify.reciters.presentation.screen.collection.topreciters.TopRecitersLauncher;

public final class n implements o {
    public final TopRecitersLauncher a;

    static {
        jx.m mVar = TopRecitersLauncher.Companion;
    }

    public n(TopRecitersLauncher topRecitersLauncher) {
        this.a = topRecitersLauncher;
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
        return "OpenTopReciters(launcher=" + this.a + ")";
    }
}
