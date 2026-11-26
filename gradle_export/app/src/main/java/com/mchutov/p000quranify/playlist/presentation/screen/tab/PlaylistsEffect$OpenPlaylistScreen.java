package com.mchutov.p000quranify.playlist.presentation.screen.tab;

import com.google.protobuf.RuntimeVersion;
import com.mchutov.p000quranify.home.presentation.screen.playlist.PlaylistLauncher;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import pm.a;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0002\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0006¨\u0006\u0017"}, d2 = {"com/mchutov/quranify/playlist/presentation/screen/tab/PlaylistsEffect$OpenPlaylistScreen", "Lcom/mchutov/quranify/home/presentation/screen/playlist/PlaylistLauncher;", "launcher", "<init>", "(Lcom/mchutov/quranify/home/presentation/screen/playlist/PlaylistLauncher;)V", "component1", "()Lcom/mchutov/quranify/home/presentation/screen/playlist/PlaylistLauncher;", "Lcom/mchutov/quranify/playlist/presentation/screen/tab/PlaylistsEffect$OpenPlaylistScreen;", "copy", "(Lcom/mchutov/quranify/home/presentation/screen/playlist/PlaylistLauncher;)Lcom/mchutov/quranify/playlist/presentation/screen/tab/PlaylistsEffect$OpenPlaylistScreen;", RuntimeVersion.SUFFIX, "toString", "()Ljava/lang/String;", RuntimeVersion.SUFFIX, "hashCode", "()I", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "equals", "(Ljava/lang/Object;)Z", "Lcom/mchutov/quranify/home/presentation/screen/playlist/PlaylistLauncher;", "getLauncher", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PlaylistsEffect$OpenPlaylistScreen implements a {
    public static final int $stable = 0;
    private final PlaylistLauncher launcher;

    public PlaylistsEffect$OpenPlaylistScreen(PlaylistLauncher launcher) {
        m.e(launcher, "launcher");
        this.launcher = launcher;
    }

    public static PlaylistsEffect$OpenPlaylistScreen copy$default(PlaylistsEffect$OpenPlaylistScreen playlistsEffect$OpenPlaylistScreen, PlaylistLauncher playlistLauncher, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            playlistLauncher = playlistsEffect$OpenPlaylistScreen.launcher;
        }
        return playlistsEffect$OpenPlaylistScreen.copy(playlistLauncher);
    }

    public final PlaylistLauncher getLauncher() {
        return this.launcher;
    }

    public final PlaylistsEffect$OpenPlaylistScreen copy(PlaylistLauncher launcher) {
        m.e(launcher, "launcher");
        return new PlaylistsEffect$OpenPlaylistScreen(launcher);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PlaylistsEffect$OpenPlaylistScreen) && m.a(this.launcher, ((PlaylistsEffect$OpenPlaylistScreen) other).launcher);
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
