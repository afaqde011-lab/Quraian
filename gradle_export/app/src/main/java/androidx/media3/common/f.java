package androidx.media3.common;

import java.util.List;

public abstract class f implements f1 {
    protected final j2 window = new j2();

    public final void a(int i10) {
        seekTo(-1, -9223372036854775807L, i10, false);
    }

    @Override
    public final void addMediaItem(int i10, q0 q0Var) {
        addMediaItems(i10, fh.t0.s(q0Var));
    }

    @Override
    public final void addMediaItem(q0 q0Var) {
        addMediaItems(fh.t0.s(q0Var));
    }

    @Override
    public final void addMediaItems(List<q0> list) {
        addMediaItems(Integer.MAX_VALUE, list);
    }

    public final void b(int i10) {
        int previousMediaItemIndex = getPreviousMediaItemIndex();
        if (previousMediaItemIndex == -1) {
            a(i10);
        } else if (previousMediaItemIndex == getCurrentMediaItemIndex()) {
            seekTo(getCurrentMediaItemIndex(), -9223372036854775807L, i10, true);
        } else {
            seekTo(previousMediaItemIndex, -9223372036854775807L, i10, false);
        }
    }

    @Override
    public final boolean canAdvertiseSession() {
        return true;
    }

    @Override
    public final void clearMediaItems() {
        removeMediaItems(0, Integer.MAX_VALUE);
    }

    @Override
    public final int getBufferedPercentage() {
        if (!isCommandAvailable(16)) {
            return 0;
        }
        long bufferedPosition = getBufferedPosition();
        long duration = getDuration();
        if (bufferedPosition == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return e7.i0.h(e7.i0.L(bufferedPosition, duration), 0, 100);
    }

    @Override
    public final long getContentDuration() {
        k2 currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return -9223372036854775807L;
        }
        return e7.i0.W(currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).m);
    }

    @Override
    public final long getCurrentLiveOffset() {
        k2 currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty() || currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).f1288f == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (e7.i0.v(this.window.f1289g) - this.window.f1288f) - getContentPosition();
    }

    @Override
    public final Object getCurrentManifest() {
        k2 currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return null;
        }
        return currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).f1286d;
    }

    @Override
    public final q0 getCurrentMediaItem() {
        k2 currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return null;
        }
        return currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).f1285c;
    }

    @Override
    @Deprecated
    public final int getCurrentWindowIndex() {
        return getCurrentMediaItemIndex();
    }

    @Override
    public final q0 getMediaItemAt(int i10) {
        return getCurrentTimeline().getWindow(i10, this.window).f1285c;
    }

    @Override
    public final int getMediaItemCount() {
        return getCurrentTimeline().getWindowCount();
    }

    @Override
    public final int getNextMediaItemIndex() {
        k2 currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return -1;
        }
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        int repeatMode = getRepeatMode();
        if (repeatMode == 1) {
            repeatMode = 0;
        }
        return currentTimeline.getNextWindowIndex(currentMediaItemIndex, repeatMode, getShuffleModeEnabled());
    }

    @Override
    @Deprecated
    public final int getNextWindowIndex() {
        return getNextMediaItemIndex();
    }

    @Override
    public final int getPreviousMediaItemIndex() {
        k2 currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return -1;
        }
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        int repeatMode = getRepeatMode();
        if (repeatMode == 1) {
            repeatMode = 0;
        }
        return currentTimeline.getPreviousWindowIndex(currentMediaItemIndex, repeatMode, getShuffleModeEnabled());
    }

    @Override
    @Deprecated
    public final int getPreviousWindowIndex() {
        return getPreviousMediaItemIndex();
    }

    @Override
    public final boolean hasNextMediaItem() {
        return getNextMediaItemIndex() != -1;
    }

    @Override
    public final boolean hasPreviousMediaItem() {
        return getPreviousMediaItemIndex() != -1;
    }

    @Override
    public final boolean isCommandAvailable(int i10) {
        return getAvailableCommands().a(i10);
    }

    @Override
    public final boolean isCurrentMediaItemDynamic() {
        k2 currentTimeline = getCurrentTimeline();
        return !currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).f1291i;
    }

    @Override
    public final boolean isCurrentMediaItemLive() {
        k2 currentTimeline = getCurrentTimeline();
        return !currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).a();
    }

    @Override
    public final boolean isCurrentMediaItemSeekable() {
        k2 currentTimeline = getCurrentTimeline();
        return !currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).f1290h;
    }

    @Override
    @Deprecated
    public final boolean isCurrentWindowDynamic() {
        return isCurrentMediaItemDynamic();
    }

    @Override
    @Deprecated
    public final boolean isCurrentWindowLive() {
        return isCurrentMediaItemLive();
    }

    @Override
    @Deprecated
    public final boolean isCurrentWindowSeekable() {
        return isCurrentMediaItemSeekable();
    }

    @Override
    public final boolean isPlaying() {
        return getPlaybackState() == 3 && getPlayWhenReady() && getPlaybackSuppressionReason() == 0;
    }

    @Override
    public final void moveMediaItem(int i10, int i11) {
        if (i10 != i11) {
            moveMediaItems(i10, i10 + 1, i11);
        }
    }

    @Override
    public final void pause() {
        setPlayWhenReady(false);
    }

    @Override
    public final void play() {
        setPlayWhenReady(true);
    }

    @Override
    public final void removeMediaItem(int i10) {
        removeMediaItems(i10, i10 + 1);
    }

    @Override
    public final void replaceMediaItem(int i10, q0 q0Var) {
        replaceMediaItems(i10, i10 + 1, fh.t0.s(q0Var));
    }

    @Override
    public final void seekBack() {
        long currentPosition = getCurrentPosition() + (-getSeekBackIncrement());
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        seekTo(getCurrentMediaItemIndex(), Math.max(currentPosition, 0L), 11, false);
    }

    @Override
    public final void seekForward() {
        long currentPosition = getCurrentPosition() + getSeekForwardIncrement();
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        seekTo(getCurrentMediaItemIndex(), Math.max(currentPosition, 0L), 12, false);
    }

    @Override
    public final void seekTo(int i10, long j9) {
        seekTo(i10, j9, 10, false);
    }

    public abstract void seekTo(int i10, long j9, int i11, boolean z10);

    @Override
    public final void seekTo(long j9) {
        seekTo(getCurrentMediaItemIndex(), j9, 5, false);
    }

    @Override
    public final void seekToDefaultPosition() {
        seekTo(getCurrentMediaItemIndex(), -9223372036854775807L, 4, false);
    }

    @Override
    public final void seekToDefaultPosition(int i10) {
        seekTo(i10, -9223372036854775807L, 10, false);
    }

    @Override
    public final void seekToNext() {
        if (getCurrentTimeline().isEmpty() || isPlayingAd()) {
            a(9);
            return;
        }
        if (!hasNextMediaItem()) {
            if (isCurrentMediaItemLive() && isCurrentMediaItemDynamic()) {
                seekTo(getCurrentMediaItemIndex(), -9223372036854775807L, 9, false);
                return;
            } else {
                a(9);
                return;
            }
        }
        int nextMediaItemIndex = getNextMediaItemIndex();
        if (nextMediaItemIndex == -1) {
            a(9);
        } else if (nextMediaItemIndex == getCurrentMediaItemIndex()) {
            seekTo(getCurrentMediaItemIndex(), -9223372036854775807L, 9, true);
        } else {
            seekTo(nextMediaItemIndex, -9223372036854775807L, 9, false);
        }
    }

    @Override
    public final void seekToNextMediaItem() {
        int nextMediaItemIndex = getNextMediaItemIndex();
        if (nextMediaItemIndex == -1) {
            a(8);
        } else if (nextMediaItemIndex == getCurrentMediaItemIndex()) {
            seekTo(getCurrentMediaItemIndex(), -9223372036854775807L, 8, true);
        } else {
            seekTo(nextMediaItemIndex, -9223372036854775807L, 8, false);
        }
    }

    @Override
    public final void seekToPrevious() {
        if (getCurrentTimeline().isEmpty() || isPlayingAd()) {
            a(7);
            return;
        }
        boolean zHasPreviousMediaItem = hasPreviousMediaItem();
        if (isCurrentMediaItemLive() && !isCurrentMediaItemSeekable()) {
            if (zHasPreviousMediaItem) {
                b(7);
                return;
            } else {
                a(7);
                return;
            }
        }
        if (!zHasPreviousMediaItem || getCurrentPosition() > getMaxSeekToPreviousPosition()) {
            seekTo(getCurrentMediaItemIndex(), 0L, 7, false);
        } else {
            b(7);
        }
    }

    @Override
    public final void seekToPreviousMediaItem() {
        b(6);
    }

    @Override
    public final void setMediaItem(q0 q0Var) {
        setMediaItems(fh.t0.s(q0Var));
    }

    @Override
    public final void setMediaItem(q0 q0Var, long j9) {
        setMediaItems(fh.t0.s(q0Var), 0, j9);
    }

    @Override
    public final void setMediaItem(q0 q0Var, boolean z10) {
        setMediaItems(fh.t0.s(q0Var), z10);
    }

    @Override
    public final void setMediaItems(List<q0> list) {
        setMediaItems(list, true);
    }

    @Override
    public final void setPlaybackSpeed(float f3) {
        setPlaybackParameters(new z0(f3, getPlaybackParameters().f1689b));
    }
}
