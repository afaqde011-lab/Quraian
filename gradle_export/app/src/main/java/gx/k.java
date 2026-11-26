package gx;

import com.mchutov.quranify.reciters.presentation.screen.search.SearchReciterLauncher;
import p40.o0;

public final class k implements o {
    public static final j Companion = new j();
    public final SearchReciterLauncher a;

    static {
        qx.m mVar = SearchReciterLauncher.Companion;
    }

    public k(int i, SearchReciterLauncher searchReciterLauncher) {
        if (1 == (i & 1)) {
            this.a = searchReciterLauncher;
        } else {
            o0.g(i, 1, i.a.getDescriptor());
            throw null;
        }
    }

    public k(SearchReciterLauncher launcher) {
        kotlin.jvm.internal.m.e(launcher, "launcher");
        this.a = launcher;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && kotlin.jvm.internal.m.a(this.a, ((k) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SearchReciters(launcher=" + this.a + ")";
    }
}
