package androidx.media3.common;

import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.IdentityHashMap;
import java.util.List;

public abstract class v implements f1 {
    private final IdentityHashMap<d1, u> listeners = new IdentityHashMap<>();
    private final f1 player;

    public v(f1 f1Var) {
        this.player = f1Var;
    }

    @Override
    public void addListener(d1 d1Var) {
        synchronized (this.listeners) {
            try {
                u uVar = this.listeners.get(d1Var);
                if (uVar == null) {
                    uVar = new u(this, d1Var);
                }
                this.player.addListener(uVar);
                this.listeners.put(d1Var, uVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public void addMediaItem(int i10, q0 q0Var) {
        this.player.addMediaItem(i10, q0Var);
    }

    @Override
    public void addMediaItem(q0 q0Var) {
        this.player.addMediaItem(q0Var);
    }

    @Override
    public void addMediaItems(int i10, List<q0> list) {
        this.player.addMediaItems(i10, list);
    }

    @Override
    public void addMediaItems(List<q0> list) {
        this.player.addMediaItems(list);
    }

    @Override
    public boolean canAdvertiseSession() {
        return this.player.canAdvertiseSession();
    }

    @Override
    public void clearMediaItems() {
        this.player.clearMediaItems();
    }

    @Override
    public void clearVideoSurface() {
        this.player.clearVideoSurface();
    }

    @Override
    public void clearVideoSurface(Surface surface) {
        this.player.clearVideoSurface(surface);
    }

    @Override
    public void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        this.player.clearVideoSurfaceHolder(surfaceHolder);
    }

    @Override
    public void clearVideoSurfaceView(SurfaceView surfaceView) {
        this.player.clearVideoSurfaceView(surfaceView);
    }

    @Override
    public void clearVideoTextureView(TextureView textureView) {
        this.player.clearVideoTextureView(textureView);
    }

    @Override
    @Deprecated
    public void decreaseDeviceVolume() {
        this.player.decreaseDeviceVolume();
    }

    @Override
    public void decreaseDeviceVolume(int i10) {
        this.player.decreaseDeviceVolume(i10);
    }

    @Override
    public Looper getApplicationLooper() {
        return this.player.getApplicationLooper();
    }

    @Override
    public d getAudioAttributes() {
        return this.player.getAudioAttributes();
    }

    @Override
    public int getAudioSessionId() {
        return this.player.getAudioSessionId();
    }

    @Override
    public b1 getAvailableCommands() {
        return this.player.getAvailableCommands();
    }

    @Override
    public int getBufferedPercentage() {
        return this.player.getBufferedPercentage();
    }

    @Override
    public long getBufferedPosition() {
        return this.player.getBufferedPosition();
    }

    @Override
    public long getContentBufferedPosition() {
        return this.player.getContentBufferedPosition();
    }

    @Override
    public long getContentDuration() {
        return this.player.getContentDuration();
    }

    @Override
    public long getContentPosition() {
        return this.player.getContentPosition();
    }

    @Override
    public int getCurrentAdGroupIndex() {
        return this.player.getCurrentAdGroupIndex();
    }

    @Override
    public int getCurrentAdIndexInAdGroup() {
        return this.player.getCurrentAdIndexInAdGroup();
    }

    @Override
    public d7.c getCurrentCues() {
        return this.player.getCurrentCues();
    }

    @Override
    public long getCurrentLiveOffset() {
        return this.player.getCurrentLiveOffset();
    }

    @Override
    public Object getCurrentManifest() {
        return this.player.getCurrentManifest();
    }

    @Override
    public q0 getCurrentMediaItem() {
        return this.player.getCurrentMediaItem();
    }

    @Override
    public int getCurrentMediaItemIndex() {
        return this.player.getCurrentMediaItemIndex();
    }

    @Override
    public int getCurrentPeriodIndex() {
        return this.player.getCurrentPeriodIndex();
    }

    @Override
    public long getCurrentPosition() {
        return this.player.getCurrentPosition();
    }

    @Override
    public k2 getCurrentTimeline() {
        return this.player.getCurrentTimeline();
    }

    @Override
    public s2 getCurrentTracks() {
        return this.player.getCurrentTracks();
    }

    @Override
    @Deprecated
    public int getCurrentWindowIndex() {
        return this.player.getCurrentWindowIndex();
    }

    @Override
    public l getDeviceInfo() {
        return this.player.getDeviceInfo();
    }

    @Override
    public int getDeviceVolume() {
        return this.player.getDeviceVolume();
    }

    @Override
    public long getDuration() {
        return this.player.getDuration();
    }

    @Override
    public long getMaxSeekToPreviousPosition() {
        return this.player.getMaxSeekToPreviousPosition();
    }

    @Override
    public q0 getMediaItemAt(int i10) {
        return this.player.getMediaItemAt(i10);
    }

    @Override
    public int getMediaItemCount() {
        return this.player.getMediaItemCount();
    }

    @Override
    public t0 getMediaMetadata() {
        return this.player.getMediaMetadata();
    }

    @Override
    public int getNextMediaItemIndex() {
        return this.player.getNextMediaItemIndex();
    }

    @Override
    @Deprecated
    public int getNextWindowIndex() {
        return this.player.getNextWindowIndex();
    }

    @Override
    public boolean getPlayWhenReady() {
        return this.player.getPlayWhenReady();
    }

    @Override
    public z0 getPlaybackParameters() {
        return this.player.getPlaybackParameters();
    }

    @Override
    public int getPlaybackState() {
        return this.player.getPlaybackState();
    }

    @Override
    public int getPlaybackSuppressionReason() {
        return this.player.getPlaybackSuppressionReason();
    }

    @Override
    public PlaybackException getPlayerError() {
        return this.player.getPlayerError();
    }

    @Override
    public t0 getPlaylistMetadata() {
        return this.player.getPlaylistMetadata();
    }

    @Override
    public int getPreviousMediaItemIndex() {
        return this.player.getPreviousMediaItemIndex();
    }

    @Override
    @Deprecated
    public int getPreviousWindowIndex() {
        return this.player.getPreviousWindowIndex();
    }

    @Override
    public int getRepeatMode() {
        return this.player.getRepeatMode();
    }

    @Override
    public long getSeekBackIncrement() {
        return this.player.getSeekBackIncrement();
    }

    @Override
    public long getSeekForwardIncrement() {
        return this.player.getSeekForwardIncrement();
    }

    @Override
    public boolean getShuffleModeEnabled() {
        return this.player.getShuffleModeEnabled();
    }

    @Override
    public e7.v getSurfaceSize() {
        return this.player.getSurfaceSize();
    }

    @Override
    public long getTotalBufferedDuration() {
        return this.player.getTotalBufferedDuration();
    }

    @Override
    public q2 getTrackSelectionParameters() {
        return this.player.getTrackSelectionParameters();
    }

    @Override
    public w2 getVideoSize() {
        return this.player.getVideoSize();
    }

    @Override
    public float getVolume() {
        return this.player.getVolume();
    }

    public f1 getWrappedPlayer() {
        return this.player;
    }

    @Override
    public boolean hasNextMediaItem() {
        return this.player.hasNextMediaItem();
    }

    @Override
    public boolean hasPreviousMediaItem() {
        return this.player.hasPreviousMediaItem();
    }

    @Override
    @Deprecated
    public void increaseDeviceVolume() {
        this.player.increaseDeviceVolume();
    }

    @Override
    public void increaseDeviceVolume(int i10) {
        this.player.increaseDeviceVolume(i10);
    }

    @Override
    public boolean isCommandAvailable(int i10) {
        return this.player.isCommandAvailable(i10);
    }

    @Override
    public boolean isCurrentMediaItemDynamic() {
        return this.player.isCurrentMediaItemDynamic();
    }

    @Override
    public boolean isCurrentMediaItemLive() {
        return this.player.isCurrentMediaItemLive();
    }

    @Override
    public boolean isCurrentMediaItemSeekable() {
        return this.player.isCurrentMediaItemSeekable();
    }

    @Override
    @Deprecated
    public boolean isCurrentWindowDynamic() {
        return this.player.isCurrentWindowDynamic();
    }

    @Override
    @Deprecated
    public boolean isCurrentWindowLive() {
        return this.player.isCurrentWindowLive();
    }

    @Override
    @Deprecated
    public boolean isCurrentWindowSeekable() {
        return this.player.isCurrentWindowSeekable();
    }

    @Override
    public boolean isDeviceMuted() {
        return this.player.isDeviceMuted();
    }

    @Override
    public boolean isLoading() {
        return this.player.isLoading();
    }

    @Override
    public boolean isPlaying() {
        return this.player.isPlaying();
    }

    @Override
    public boolean isPlayingAd() {
        return this.player.isPlayingAd();
    }

    @Override
    public void moveMediaItem(int i10, int i11) {
        this.player.moveMediaItem(i10, i11);
    }

    @Override
    public void moveMediaItems(int i10, int i11, int i12) {
        this.player.moveMediaItems(i10, i11, i12);
    }

    @Override
    public void mute() {
        this.player.mute();
    }

    @Override
    public void pause() {
        this.player.pause();
    }

    @Override
    public void play() {
        this.player.play();
    }

    @Override
    public void prepare() {
        this.player.prepare();
    }

    @Override
    public void release() {
        this.player.release();
    }

    @Override
    public void removeListener(d1 d1Var) {
        synchronized (this.listeners) {
            u uVarRemove = this.listeners.remove(d1Var);
            f1 f1Var = this.player;
            if (uVarRemove != null) {
                d1Var = uVarRemove;
            }
            f1Var.removeListener(d1Var);
        }
    }

    @Override
    public void removeMediaItem(int i10) {
        this.player.removeMediaItem(i10);
    }

    @Override
    public void removeMediaItems(int i10, int i11) {
        this.player.removeMediaItems(i10, i11);
    }

    @Override
    public void replaceMediaItem(int i10, q0 q0Var) {
        this.player.replaceMediaItem(i10, q0Var);
    }

    @Override
    public void replaceMediaItems(int i10, int i11, List<q0> list) {
        this.player.replaceMediaItems(i10, i11, list);
    }

    @Override
    public void seekBack() {
        this.player.seekBack();
    }

    @Override
    public void seekForward() {
        this.player.seekForward();
    }

    @Override
    public void seekTo(int i10, long j9) {
        this.player.seekTo(i10, j9);
    }

    @Override
    public void seekTo(long j9) {
        this.player.seekTo(j9);
    }

    @Override
    public void seekToDefaultPosition() {
        this.player.seekToDefaultPosition();
    }

    @Override
    public void seekToDefaultPosition(int i10) {
        this.player.seekToDefaultPosition(i10);
    }

    @Override
    public void seekToNext() {
        this.player.seekToNext();
    }

    @Override
    public void seekToNextMediaItem() {
        this.player.seekToNextMediaItem();
    }

    @Override
    public void seekToPrevious() {
        this.player.seekToPrevious();
    }

    @Override
    public void seekToPreviousMediaItem() {
        this.player.seekToPreviousMediaItem();
    }

    @Override
    public void setAudioAttributes(d dVar, boolean z10) {
        this.player.setAudioAttributes(dVar, z10);
    }

    @Override
    @Deprecated
    public void setDeviceMuted(boolean z10) {
        this.player.setDeviceMuted(z10);
    }

    @Override
    public void setDeviceMuted(boolean z10, int i10) {
        this.player.setDeviceMuted(z10, i10);
    }

    @Override
    @Deprecated
    public void setDeviceVolume(int i10) {
        this.player.setDeviceVolume(i10);
    }

    @Override
    public void setDeviceVolume(int i10, int i11) {
        this.player.setDeviceVolume(i10, i11);
    }

    @Override
    public void setMediaItem(q0 q0Var) {
        this.player.setMediaItem(q0Var);
    }

    @Override
    public void setMediaItem(q0 q0Var, long j9) {
        this.player.setMediaItem(q0Var, j9);
    }

    @Override
    public void setMediaItem(q0 q0Var, boolean z10) {
        this.player.setMediaItem(q0Var, z10);
    }

    @Override
    public void setMediaItems(List<q0> list) {
        this.player.setMediaItems(list);
    }

    @Override
    public void setMediaItems(List<q0> list, int i10, long j9) {
        this.player.setMediaItems(list, i10, j9);
    }

    @Override
    public void setMediaItems(List<q0> list, boolean z10) {
        this.player.setMediaItems(list, z10);
    }

    @Override
    public void setPlayWhenReady(boolean z10) {
        this.player.setPlayWhenReady(z10);
    }

    @Override
    public void setPlaybackParameters(z0 z0Var) {
        this.player.setPlaybackParameters(z0Var);
    }

    @Override
    public void setPlaybackSpeed(float f3) {
        this.player.setPlaybackSpeed(f3);
    }

    @Override
    public void setPlaylistMetadata(t0 t0Var) {
        this.player.setPlaylistMetadata(t0Var);
    }

    @Override
    public void setRepeatMode(int i10) {
        this.player.setRepeatMode(i10);
    }

    @Override
    public void setShuffleModeEnabled(boolean z10) {
        this.player.setShuffleModeEnabled(z10);
    }

    @Override
    public void setTrackSelectionParameters(q2 q2Var) {
        this.player.setTrackSelectionParameters(q2Var);
    }

    @Override
    public void setVideoSurface(Surface surface) {
        this.player.setVideoSurface(surface);
    }

    @Override
    public void setVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        this.player.setVideoSurfaceHolder(surfaceHolder);
    }

    @Override
    public void setVideoSurfaceView(SurfaceView surfaceView) {
        this.player.setVideoSurfaceView(surfaceView);
    }

    @Override
    public void setVideoTextureView(TextureView textureView) {
        this.player.setVideoTextureView(textureView);
    }

    @Override
    public void setVolume(float f3) {
        this.player.setVolume(f3);
    }

    @Override
    public void stop() {
        this.player.stop();
    }

    @Override
    public void unmute() {
        this.player.unmute();
    }
}
