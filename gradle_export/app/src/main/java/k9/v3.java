package k9;

import android.os.Looper;
import android.os.SystemClock;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.PlaybackException;
import java.util.List;

public final class v3 extends androidx.media3.common.v {
    public final androidx.media3.common.e1 a() {
        boolean zIsCommandAvailable = isCommandAvailable(16);
        boolean zIsCommandAvailable2 = isCommandAvailable(17);
        int currentMediaItemIndex = zIsCommandAvailable2 ? getCurrentMediaItemIndex() : 0;
        ta.c0.A(currentMediaItemIndex >= 0);
        int currentPeriodIndex = zIsCommandAvailable2 ? getCurrentPeriodIndex() : 0;
        ta.c0.A(currentPeriodIndex >= 0);
        if (zIsCommandAvailable2) {
            androidx.media3.common.k2 currentTimeline = getCurrentTimeline();
            if (!currentTimeline.isEmpty()) {
                ta.c0.A(currentMediaItemIndex < currentTimeline.getWindowCount());
                androidx.media3.common.j2 window = currentTimeline.getWindow(currentMediaItemIndex, new androidx.media3.common.j2());
                ta.c0.A(currentPeriodIndex == e7.i0.h(currentPeriodIndex, window.f1294n, window.f1295o));
            }
        }
        return new androidx.media3.common.e1(null, currentMediaItemIndex, zIsCommandAvailable ? getCurrentMediaItem() : null, null, currentPeriodIndex, zIsCommandAvailable ? getCurrentPosition() : 0L, zIsCommandAvailable ? getContentPosition() : 0L, zIsCommandAvailable ? getCurrentAdGroupIndex() : -1, zIsCommandAvailable ? getCurrentAdIndexInAdGroup() : -1);
    }

    @Override
    public final void addListener(androidx.media3.common.d1 d1Var) {
        g();
        super.addListener(d1Var);
    }

    @Override
    public final void addMediaItem(int i10, androidx.media3.common.q0 q0Var) {
        g();
        super.addMediaItem(i10, q0Var);
    }

    @Override
    public final void addMediaItem(androidx.media3.common.q0 q0Var) {
        g();
        super.addMediaItem(q0Var);
    }

    @Override
    public final void addMediaItems(int i10, List list) {
        g();
        super.addMediaItems(i10, list);
    }

    @Override
    public final void addMediaItems(List list) {
        g();
        super.addMediaItems(list);
    }

    public final c4 b() {
        boolean zIsCommandAvailable = isCommandAvailable(16);
        return new c4(a(), zIsCommandAvailable && isPlayingAd(), SystemClock.elapsedRealtime(), zIsCommandAvailable ? getDuration() : -9223372036854775807L, zIsCommandAvailable ? getBufferedPosition() : 0L, zIsCommandAvailable ? getBufferedPercentage() : 0, zIsCommandAvailable ? getTotalBufferedDuration() : 0L, zIsCommandAvailable ? getCurrentLiveOffset() : -9223372036854775807L, zIsCommandAvailable ? getContentDuration() : -9223372036854775807L, zIsCommandAvailable ? getContentBufferedPosition() : 0L);
    }

    public final androidx.media3.common.q0 c() {
        if (isCommandAvailable(16)) {
            return getCurrentMediaItem();
        }
        return null;
    }

    @Override
    public final void clearMediaItems() {
        g();
        super.clearMediaItems();
    }

    @Override
    public final void clearVideoSurface() {
        g();
        super.clearVideoSurface();
    }

    @Override
    public final void clearVideoSurface(Surface surface) {
        g();
        super.clearVideoSurface(surface);
    }

    @Override
    public final void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        g();
        super.clearVideoSurfaceHolder(surfaceHolder);
    }

    @Override
    public final void clearVideoSurfaceView(SurfaceView surfaceView) {
        g();
        super.clearVideoSurfaceView(surfaceView);
    }

    @Override
    public final void clearVideoTextureView(TextureView textureView) {
        g();
        super.clearVideoTextureView(textureView);
    }

    public final androidx.media3.common.k2 d() {
        if (isCommandAvailable(17)) {
            return getCurrentTimeline();
        }
        return c() != null ? new u3(this) : androidx.media3.common.k2.EMPTY;
    }

    @Override
    public final void decreaseDeviceVolume() {
        g();
        super.decreaseDeviceVolume();
    }

    @Override
    public final void decreaseDeviceVolume(int i10) {
        g();
        super.decreaseDeviceVolume(i10);
    }

    public final androidx.media3.common.t0 e() {
        return isCommandAvailable(18) ? getMediaMetadata() : androidx.media3.common.t0.K;
    }

    public final boolean f() {
        return isCommandAvailable(23) && isDeviceMuted();
    }

    public final void g() {
        ta.c0.A(Looper.myLooper() == getApplicationLooper());
    }

    @Override
    public final androidx.media3.common.d getAudioAttributes() {
        g();
        return super.getAudioAttributes();
    }

    @Override
    public final androidx.media3.common.b1 getAvailableCommands() {
        g();
        return super.getAvailableCommands();
    }

    @Override
    public final int getBufferedPercentage() {
        g();
        return super.getBufferedPercentage();
    }

    @Override
    public final long getBufferedPosition() {
        g();
        return super.getBufferedPosition();
    }

    @Override
    public final long getContentBufferedPosition() {
        g();
        return super.getContentBufferedPosition();
    }

    @Override
    public final long getContentDuration() {
        g();
        return super.getContentDuration();
    }

    @Override
    public final long getContentPosition() {
        g();
        return super.getContentPosition();
    }

    @Override
    public final int getCurrentAdGroupIndex() {
        g();
        return super.getCurrentAdGroupIndex();
    }

    @Override
    public final int getCurrentAdIndexInAdGroup() {
        g();
        return super.getCurrentAdIndexInAdGroup();
    }

    @Override
    public final d7.c getCurrentCues() {
        g();
        return super.getCurrentCues();
    }

    @Override
    public final long getCurrentLiveOffset() {
        g();
        return super.getCurrentLiveOffset();
    }

    @Override
    public final Object getCurrentManifest() {
        g();
        return super.getCurrentManifest();
    }

    @Override
    public final androidx.media3.common.q0 getCurrentMediaItem() {
        g();
        return super.getCurrentMediaItem();
    }

    @Override
    public final int getCurrentMediaItemIndex() {
        g();
        return super.getCurrentMediaItemIndex();
    }

    @Override
    public final int getCurrentPeriodIndex() {
        g();
        return super.getCurrentPeriodIndex();
    }

    @Override
    public final long getCurrentPosition() {
        g();
        return super.getCurrentPosition();
    }

    @Override
    public final androidx.media3.common.k2 getCurrentTimeline() {
        g();
        return super.getCurrentTimeline();
    }

    @Override
    public final androidx.media3.common.s2 getCurrentTracks() {
        g();
        return super.getCurrentTracks();
    }

    @Override
    public final int getCurrentWindowIndex() {
        g();
        return super.getCurrentWindowIndex();
    }

    @Override
    public final androidx.media3.common.l getDeviceInfo() {
        g();
        return super.getDeviceInfo();
    }

    @Override
    public final int getDeviceVolume() {
        g();
        return super.getDeviceVolume();
    }

    @Override
    public final long getDuration() {
        g();
        return super.getDuration();
    }

    @Override
    public final long getMaxSeekToPreviousPosition() {
        g();
        return super.getMaxSeekToPreviousPosition();
    }

    @Override
    public final androidx.media3.common.q0 getMediaItemAt(int i10) {
        g();
        return super.getMediaItemAt(i10);
    }

    @Override
    public final int getMediaItemCount() {
        g();
        return super.getMediaItemCount();
    }

    @Override
    public final androidx.media3.common.t0 getMediaMetadata() {
        g();
        return super.getMediaMetadata();
    }

    @Override
    public final int getNextMediaItemIndex() {
        g();
        return super.getNextMediaItemIndex();
    }

    @Override
    public final int getNextWindowIndex() {
        g();
        return super.getNextWindowIndex();
    }

    @Override
    public final boolean getPlayWhenReady() {
        g();
        return super.getPlayWhenReady();
    }

    @Override
    public final androidx.media3.common.z0 getPlaybackParameters() {
        g();
        return super.getPlaybackParameters();
    }

    @Override
    public final int getPlaybackState() {
        g();
        return super.getPlaybackState();
    }

    @Override
    public final int getPlaybackSuppressionReason() {
        g();
        return super.getPlaybackSuppressionReason();
    }

    @Override
    public final PlaybackException getPlayerError() {
        g();
        return super.getPlayerError();
    }

    @Override
    public final androidx.media3.common.t0 getPlaylistMetadata() {
        g();
        return super.getPlaylistMetadata();
    }

    @Override
    public final int getPreviousMediaItemIndex() {
        g();
        return super.getPreviousMediaItemIndex();
    }

    @Override
    public final int getPreviousWindowIndex() {
        g();
        return super.getPreviousWindowIndex();
    }

    @Override
    public final int getRepeatMode() {
        g();
        return super.getRepeatMode();
    }

    @Override
    public final long getSeekBackIncrement() {
        g();
        return super.getSeekBackIncrement();
    }

    @Override
    public final long getSeekForwardIncrement() {
        g();
        return super.getSeekForwardIncrement();
    }

    @Override
    public final boolean getShuffleModeEnabled() {
        g();
        return super.getShuffleModeEnabled();
    }

    @Override
    public final e7.v getSurfaceSize() {
        g();
        return super.getSurfaceSize();
    }

    @Override
    public final long getTotalBufferedDuration() {
        g();
        return super.getTotalBufferedDuration();
    }

    @Override
    public final androidx.media3.common.q2 getTrackSelectionParameters() {
        g();
        return super.getTrackSelectionParameters();
    }

    @Override
    public final androidx.media3.common.w2 getVideoSize() {
        g();
        return super.getVideoSize();
    }

    @Override
    public final float getVolume() {
        g();
        return super.getVolume();
    }

    @Override
    public final boolean hasNextMediaItem() {
        g();
        return super.hasNextMediaItem();
    }

    @Override
    public final boolean hasPreviousMediaItem() {
        g();
        return super.hasPreviousMediaItem();
    }

    @Override
    public final void increaseDeviceVolume() {
        g();
        super.increaseDeviceVolume();
    }

    @Override
    public final void increaseDeviceVolume(int i10) {
        g();
        super.increaseDeviceVolume(i10);
    }

    @Override
    public final boolean isCommandAvailable(int i10) {
        g();
        return super.isCommandAvailable(i10);
    }

    @Override
    public final boolean isCurrentMediaItemDynamic() {
        g();
        return super.isCurrentMediaItemDynamic();
    }

    @Override
    public final boolean isCurrentMediaItemLive() {
        g();
        return super.isCurrentMediaItemLive();
    }

    @Override
    public final boolean isCurrentMediaItemSeekable() {
        g();
        return super.isCurrentMediaItemSeekable();
    }

    @Override
    public final boolean isDeviceMuted() {
        g();
        return super.isDeviceMuted();
    }

    @Override
    public final boolean isLoading() {
        g();
        return super.isLoading();
    }

    @Override
    public final boolean isPlaying() {
        g();
        return super.isPlaying();
    }

    @Override
    public final boolean isPlayingAd() {
        g();
        return super.isPlayingAd();
    }

    @Override
    public final void moveMediaItem(int i10, int i11) {
        g();
        super.moveMediaItem(i10, i11);
    }

    @Override
    public final void moveMediaItems(int i10, int i11, int i12) {
        g();
        super.moveMediaItems(i10, i11, i12);
    }

    @Override
    public final void mute() {
        g();
        super.mute();
    }

    @Override
    public final void pause() {
        g();
        super.pause();
    }

    @Override
    public final void play() {
        g();
        super.play();
    }

    @Override
    public final void prepare() {
        g();
        super.prepare();
    }

    @Override
    public final void release() {
        g();
        super.release();
    }

    @Override
    public final void removeListener(androidx.media3.common.d1 d1Var) {
        g();
        super.removeListener(d1Var);
    }

    @Override
    public final void removeMediaItem(int i10) {
        g();
        super.removeMediaItem(i10);
    }

    @Override
    public final void removeMediaItems(int i10, int i11) {
        g();
        super.removeMediaItems(i10, i11);
    }

    @Override
    public final void replaceMediaItem(int i10, androidx.media3.common.q0 q0Var) {
        g();
        super.replaceMediaItem(i10, q0Var);
    }

    @Override
    public final void replaceMediaItems(int i10, int i11, List list) {
        g();
        super.replaceMediaItems(i10, i11, list);
    }

    @Override
    public final void seekBack() {
        g();
        super.seekBack();
    }

    @Override
    public final void seekForward() {
        g();
        super.seekForward();
    }

    @Override
    public final void seekTo(int i10, long j9) {
        g();
        super.seekTo(i10, j9);
    }

    @Override
    public final void seekTo(long j9) {
        g();
        super.seekTo(j9);
    }

    @Override
    public final void seekToDefaultPosition() {
        g();
        super.seekToDefaultPosition();
    }

    @Override
    public final void seekToDefaultPosition(int i10) {
        g();
        super.seekToDefaultPosition(i10);
    }

    @Override
    public final void seekToNext() {
        g();
        super.seekToNext();
    }

    @Override
    public final void seekToNextMediaItem() {
        g();
        super.seekToNextMediaItem();
    }

    @Override
    public final void seekToPrevious() {
        g();
        super.seekToPrevious();
    }

    @Override
    public final void seekToPreviousMediaItem() {
        g();
        super.seekToPreviousMediaItem();
    }

    @Override
    public final void setDeviceMuted(boolean z10) {
        g();
        super.setDeviceMuted(z10);
    }

    @Override
    public final void setDeviceMuted(boolean z10, int i10) {
        g();
        super.setDeviceMuted(z10, i10);
    }

    @Override
    public final void setDeviceVolume(int i10) {
        g();
        super.setDeviceVolume(i10);
    }

    @Override
    public final void setDeviceVolume(int i10, int i11) {
        g();
        super.setDeviceVolume(i10, i11);
    }

    @Override
    public final void setMediaItem(androidx.media3.common.q0 q0Var) {
        g();
        super.setMediaItem(q0Var);
    }

    @Override
    public final void setMediaItem(androidx.media3.common.q0 q0Var, long j9) {
        g();
        super.setMediaItem(q0Var, j9);
    }

    @Override
    public final void setMediaItem(androidx.media3.common.q0 q0Var, boolean z10) {
        g();
        super.setMediaItem(q0Var, z10);
    }

    @Override
    public final void setMediaItems(List list) {
        g();
        super.setMediaItems(list);
    }

    @Override
    public final void setMediaItems(List list, int i10, long j9) {
        g();
        super.setMediaItems(list, i10, j9);
    }

    @Override
    public final void setMediaItems(List list, boolean z10) {
        g();
        super.setMediaItems(list, z10);
    }

    @Override
    public final void setPlayWhenReady(boolean z10) {
        g();
        super.setPlayWhenReady(z10);
    }

    @Override
    public final void setPlaybackParameters(androidx.media3.common.z0 z0Var) {
        g();
        super.setPlaybackParameters(z0Var);
    }

    @Override
    public final void setPlaybackSpeed(float f3) {
        g();
        super.setPlaybackSpeed(f3);
    }

    @Override
    public final void setPlaylistMetadata(androidx.media3.common.t0 t0Var) {
        g();
        super.setPlaylistMetadata(t0Var);
    }

    @Override
    public final void setRepeatMode(int i10) {
        g();
        super.setRepeatMode(i10);
    }

    @Override
    public final void setShuffleModeEnabled(boolean z10) {
        g();
        super.setShuffleModeEnabled(z10);
    }

    @Override
    public final void setTrackSelectionParameters(androidx.media3.common.q2 q2Var) {
        g();
        super.setTrackSelectionParameters(q2Var);
    }

    @Override
    public final void setVideoSurface(Surface surface) {
        g();
        super.setVideoSurface(surface);
    }

    @Override
    public final void setVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        g();
        super.setVideoSurfaceHolder(surfaceHolder);
    }

    @Override
    public final void setVideoSurfaceView(SurfaceView surfaceView) {
        g();
        super.setVideoSurfaceView(surfaceView);
    }

    @Override
    public final void setVideoTextureView(TextureView textureView) {
        g();
        super.setVideoTextureView(textureView);
    }

    @Override
    public final void setVolume(float f3) {
        g();
        super.setVolume(f3);
    }

    @Override
    public final void stop() {
        g();
        super.stop();
    }

    @Override
    public final void unmute() {
        g();
        super.unmute();
    }
}
