package com.mchutov.quranify.home.presentation.screen.home;

import com.mchutov.quranify.home.presentation.screen.playlist.PlaylistLauncher;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import ur.x0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"com/mchutov/quranify/home/presentation/screen/home/HomeEffect$OpenPlaylistScreen", "Lur/x0;", "Lcom/mchutov/quranify/home/presentation/screen/playlist/PlaylistLauncher;", "launcher", "<init>", "(Lcom/mchutov/quranify/home/presentation/screen/playlist/PlaylistLauncher;)V", "component1", "()Lcom/mchutov/quranify/home/presentation/screen/playlist/PlaylistLauncher;", "Lcom/mchutov/quranify/home/presentation/screen/home/HomeEffect$OpenPlaylistScreen;", "copy", "(Lcom/mchutov/quranify/home/presentation/screen/playlist/PlaylistLauncher;)Lcom/mchutov/quranify/home/presentation/screen/home/HomeEffect$OpenPlaylistScreen;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/mchutov/quranify/home/presentation/screen/playlist/PlaylistLauncher;", "getLauncher", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HomeEffect$OpenPlaylistScreen implements x0 {
    public static final int $stable = 0;
    private final PlaylistLauncher launcher;

    public HomeEffect$OpenPlaylistScreen(PlaylistLauncher launcher) {
        m.e(launcher, "launcher");
        this.launcher = launcher;
    }

    public static HomeEffect$OpenPlaylistScreen copy$default(HomeEffect$OpenPlaylistScreen homeEffect$OpenPlaylistScreen, PlaylistLauncher playlistLauncher, int i, Object obj) {
        if ((i & 1) != 0) {
            playlistLauncher = homeEffect$OpenPlaylistScreen.launcher;
        }
        return homeEffect$OpenPlaylistScreen.copy(playlistLauncher);
    }

    public final PlaylistLauncher getLauncher() {
        return this.launcher;
    }

    public final HomeEffect$OpenPlaylistScreen copy(PlaylistLauncher launcher) {
        m.e(launcher, "launcher");
        return new HomeEffect$OpenPlaylistScreen(launcher);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HomeEffect$OpenPlaylistScreen) && m.a(this.launcher, ((HomeEffect$OpenPlaylistScreen) other).launcher);
    }

    @Override
    public long getDebounce() {
        return 300L;
    }

    public final PlaylistLauncher getLauncher() {
        return this.launcher;
    }

    public int hashCode() {
        return this.launcher.hashCode();
    }

    public String toString() {
        return "OpenPlaylistScreen(launcher=" + this.launcher + ")";
    }
}
