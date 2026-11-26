package hx;

import com.mchutov.quranify.reciters.presentation.screen.search.SearchReciterLauncher;

public final class m implements o {
    public final SearchReciterLauncher a;

    static {
        qx.m mVar = SearchReciterLauncher.Companion;
    }

    public m(SearchReciterLauncher searchReciterLauncher) {
        this.a = searchReciterLauncher;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && kotlin.jvm.internal.m.a(this.a, ((m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenSearchReciters(launcher=" + this.a + ")";
    }
}
