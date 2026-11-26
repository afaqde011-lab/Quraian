package com.mchutov.quranify.home.presentation.screen.playlist;

import as.x;
import as.y;
import kotlin.Metadata;
import p40.o0;
import p40.x0;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\tJ'\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/mchutov/quranify/home/presentation/screen/playlist/PlaylistLauncher;", "", "", "playlistId", "<init>", "(I)V", "seen0", "Lp40/x0;", "serializationConstructorMarker", "(IILp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$app_release", "(Lcom/mchutov/quranify/home/presentation/screen/playlist/PlaylistLauncher;Lo40/b;Ln40/e;)V", "write$Self", "I", "getPlaylistId", "()I", "Companion", "as/x", "as/y", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PlaylistLauncher {
    public static final int $stable = 0;
    public static final y Companion = new y();
    private final int playlistId;

    public PlaylistLauncher(int i) {
        this.playlistId = i;
    }

    public PlaylistLauncher(int i, int i2, x0 x0Var) {
        if (1 == (i & 1)) {
            this.playlistId = i2;
        } else {
            o0.g(i, 1, x.a.getDescriptor());
            throw null;
        }
    }

    public final int getPlaylistId() {
        return this.playlistId;
    }
}
