package com.mchutov.p000quranify.playlist.presentation.navigation;

import com.google.protobuf.RuntimeVersion;
import com.mchutov.p000quranify.home.presentation.screen.playlist.PlaylistLauncher;
import fw.e;
import fw.f;
import fw.g;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p40.o0;
import p40.x0;

@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0016¨\u0006("}, d2 = {"com/mchutov/quranify/playlist/presentation/navigation/PlaylistsRoute$PlaylistScreen", "Lfw/g;", "Lcom/mchutov/quranify/home/presentation/screen/playlist/PlaylistLauncher;", "launcher", "<init>", "(Lcom/mchutov/quranify/home/presentation/screen/playlist/PlaylistLauncher;)V", RuntimeVersion.SUFFIX, "seen0", "Lp40/x0;", "serializationConstructorMarker", "(ILcom/mchutov/quranify/home/presentation/screen/playlist/PlaylistLauncher;Lp40/x0;)V", "Lcom/mchutov/quranify/playlist/presentation/navigation/PlaylistsRoute$PlaylistScreen;", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$app_release", "(Lcom/mchutov/quranify/playlist/presentation/navigation/PlaylistsRoute$PlaylistScreen;Lo40/b;Ln40/e;)V", "write$Self", "component1", "()Lcom/mchutov/quranify/home/presentation/screen/playlist/PlaylistLauncher;", "copy", "(Lcom/mchutov/quranify/home/presentation/screen/playlist/PlaylistLauncher;)Lcom/mchutov/quranify/playlist/presentation/navigation/PlaylistsRoute$PlaylistScreen;", RuntimeVersion.SUFFIX, "toString", "()Ljava/lang/String;", "hashCode", "()I", RuntimeVersion.SUFFIX, "other", RuntimeVersion.SUFFIX, "equals", "(Ljava/lang/Object;)Z", "Lcom/mchutov/quranify/home/presentation/screen/playlist/PlaylistLauncher;", "getLauncher", "Companion", "fw/e", "fw/f", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PlaylistsRoute$PlaylistScreen implements g {
    public static final int $stable = 0;
    public static final f Companion = new f();
    private final PlaylistLauncher launcher;

    public PlaylistsRoute$PlaylistScreen(int i11, PlaylistLauncher playlistLauncher, x0 x0Var) {
        if (1 == (i11 & 1)) {
            this.launcher = playlistLauncher;
        } else {
            o0.g(i11, 1, e.f7715a.getDescriptor());
            throw null;
        }
    }

    public PlaylistsRoute$PlaylistScreen(PlaylistLauncher launcher) {
        m.e(launcher, "launcher");
        this.launcher = launcher;
    }

    public static PlaylistsRoute$PlaylistScreen copy$default(PlaylistsRoute$PlaylistScreen playlistsRoute$PlaylistScreen, PlaylistLauncher playlistLauncher, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            playlistLauncher = playlistsRoute$PlaylistScreen.launcher;
        }
        return playlistsRoute$PlaylistScreen.copy(playlistLauncher);
    }

    public final PlaylistLauncher getLauncher() {
        return this.launcher;
    }

    public final PlaylistsRoute$PlaylistScreen copy(PlaylistLauncher launcher) {
        m.e(launcher, "launcher");
        return new PlaylistsRoute$PlaylistScreen(launcher);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PlaylistsRoute$PlaylistScreen) && m.a(this.launcher, ((PlaylistsRoute$PlaylistScreen) other).launcher);
    }

    public final PlaylistLauncher getLauncher() {
        return this.launcher;
    }

    public int hashCode() {
        return this.launcher.hashCode();
    }

    public String toString() {
        return "PlaylistScreen(launcher=" + this.launcher + ")";
    }
}
