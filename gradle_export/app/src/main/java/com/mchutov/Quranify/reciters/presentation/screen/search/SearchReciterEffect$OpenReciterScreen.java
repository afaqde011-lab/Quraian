package com.mchutov.quranify.reciters.presentation.screen.search;

import com.mchutov.quranify.reciters.presentation.screen.detail.main.ReciterLauncher;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import qx.k;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"com/mchutov/quranify/reciters/presentation/screen/search/SearchReciterEffect$OpenReciterScreen", "Lqx/k;", "Lcom/mchutov/quranify/reciters/presentation/screen/detail/main/ReciterLauncher;", "launcher", "<init>", "(Lcom/mchutov/quranify/reciters/presentation/screen/detail/main/ReciterLauncher;)V", "component1", "()Lcom/mchutov/quranify/reciters/presentation/screen/detail/main/ReciterLauncher;", "Lcom/mchutov/quranify/reciters/presentation/screen/search/SearchReciterEffect$OpenReciterScreen;", "copy", "(Lcom/mchutov/quranify/reciters/presentation/screen/detail/main/ReciterLauncher;)Lcom/mchutov/quranify/reciters/presentation/screen/search/SearchReciterEffect$OpenReciterScreen;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/mchutov/quranify/reciters/presentation/screen/detail/main/ReciterLauncher;", "getLauncher", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SearchReciterEffect$OpenReciterScreen implements k {
    public static final int $stable = 0;
    private final ReciterLauncher launcher;

    public SearchReciterEffect$OpenReciterScreen(ReciterLauncher launcher) {
        m.e(launcher, "launcher");
        this.launcher = launcher;
    }

    public static SearchReciterEffect$OpenReciterScreen copy$default(SearchReciterEffect$OpenReciterScreen searchReciterEffect$OpenReciterScreen, ReciterLauncher reciterLauncher, int i, Object obj) {
        if ((i & 1) != 0) {
            reciterLauncher = searchReciterEffect$OpenReciterScreen.launcher;
        }
        return searchReciterEffect$OpenReciterScreen.copy(reciterLauncher);
    }

    public final ReciterLauncher getLauncher() {
        return this.launcher;
    }

    public final SearchReciterEffect$OpenReciterScreen copy(ReciterLauncher launcher) {
        m.e(launcher, "launcher");
        return new SearchReciterEffect$OpenReciterScreen(launcher);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SearchReciterEffect$OpenReciterScreen) && m.a(this.launcher, ((SearchReciterEffect$OpenReciterScreen) other).launcher);
    }

    @Override
    public long getDebounce() {
        return 300L;
    }

    public final ReciterLauncher getLauncher() {
        return this.launcher;
    }

    public int hashCode() {
        return this.launcher.hashCode();
    }

    public String toString() {
        return "OpenReciterScreen(launcher=" + this.launcher + ")";
    }
}
