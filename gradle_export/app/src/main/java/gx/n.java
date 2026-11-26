package gx;

import com.mchutov.quranify.reciters.presentation.screen.collection.topreciters.TopRecitersLauncher;
import p40.o0;

public final class n implements o {
    public static final m Companion = new m();
    public final TopRecitersLauncher a;

    static {
        jx.m mVar = TopRecitersLauncher.Companion;
    }

    public n(int i, TopRecitersLauncher topRecitersLauncher) {
        if (1 == (i & 1)) {
            this.a = topRecitersLauncher;
        } else {
            o0.g(i, 1, l.a.getDescriptor());
            throw null;
        }
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
        return "TopReciters(launcher=" + this.a + ")";
    }
}
