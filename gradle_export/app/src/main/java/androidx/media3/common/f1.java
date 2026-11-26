package androidx.media3.common;

import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.List;

public interface f1 {
    void addListener(d1 d1Var);

    void addMediaItem(int i10, q0 q0Var);

    void addMediaItem(q0 q0Var);

    void addMediaItems(int i10, List list);

    void addMediaItems(List list);

    boolean canAdvertiseSession();

    void clearMediaItems();

    void clearVideoSurface();

    void clearVideoSurface(Surface surface);

    void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder);

    void clearVideoSurfaceView(SurfaceView surfaceView);

    void clearVideoTextureView(TextureView textureView);

    void decreaseDeviceVolume();

    void decreaseDeviceVolume(int i10);

    Looper getApplicationLooper();

    d getAudioAttributes();

    int getAudioSessionId();

    b1 getAvailableCommands();

    int getBufferedPercentage();

    long getBufferedPosition();

    long getContentBufferedPosition();

    long getContentDuration();

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    d7.c getCurrentCues();

    long getCurrentLiveOffset();

    Object getCurrentManifest();

    q0 getCurrentMediaItem();

    int getCurrentMediaItemIndex();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    k2 getCurrentTimeline();

    s2 getCurrentTracks();

    int getCurrentWindowIndex();

    l getDeviceInfo();

    int getDeviceVolume();

    long getDuration();

    long getMaxSeekToPreviousPosition();

    q0 getMediaItemAt(int i10);

    int getMediaItemCount();

    t0 getMediaMetadata();

    int getNextMediaItemIndex();

    int getNextWindowIndex();

    boolean getPlayWhenReady();

    z0 getPlaybackParameters();

    int getPlaybackState();

    int getPlaybackSuppressionReason();

    PlaybackException getPlayerError();

    t0 getPlaylistMetadata();

    int getPreviousMediaItemIndex();

    int getPreviousWindowIndex();

    int getRepeatMode();

    long getSeekBackIncrement();

    long getSeekForwardIncrement();

    boolean getShuffleModeEnabled();

    e7.v getSurfaceSize();

    long getTotalBufferedDuration();

    q2 getTrackSelectionParameters();

    w2 getVideoSize();

    float getVolume();

    boolean hasNextMediaItem();

    boolean hasPreviousMediaItem();

    void increaseDeviceVolume();

    void increaseDeviceVolume(int i10);

    boolean isCommandAvailable(int i10);

    boolean isCurrentMediaItemDynamic();

    boolean isCurrentMediaItemLive();

    boolean isCurrentMediaItemSeekable();

    boolean isCurrentWindowDynamic();

    boolean isCurrentWindowLive();

    boolean isCurrentWindowSeekable();

    boolean isDeviceMuted();

    boolean isLoading();

    boolean isPlaying();

    boolean isPlayingAd();

    void moveMediaItem(int i10, int i11);

    void moveMediaItems(int i10, int i11, int i12);

    void mute();

    void pause();

    void play();

    void prepare();

    void release();

    void removeListener(d1 d1Var);

    void removeMediaItem(int i10);

    void removeMediaItems(int i10, int i11);

    void replaceMediaItem(int i10, q0 q0Var);

    void replaceMediaItems(int i10, int i11, List list);

    void seekBack();

    void seekForward();

    void seekTo(int i10, long j9);

    void seekTo(long j9);

    void seekToDefaultPosition();

    void seekToDefaultPosition(int i10);

    void seekToNext();

    void seekToNextMediaItem();

    void seekToPrevious();

    void seekToPreviousMediaItem();

    void setAudioAttributes(d dVar, boolean z10);

    void setDeviceMuted(boolean z10);

    void setDeviceMuted(boolean z10, int i10);

    void setDeviceVolume(int i10);

    void setDeviceVolume(int i10, int i11);

    void setMediaItem(q0 q0Var);

    void setMediaItem(q0 q0Var, long j9);

    void setMediaItem(q0 q0Var, boolean z10);

    void setMediaItems(List list);

    void setMediaItems(List list, int i10, long j9);

    void setMediaItems(List list, boolean z10);

    void setPlayWhenReady(boolean z10);

    void setPlaybackParameters(z0 z0Var);

    void setPlaybackSpeed(float f3);

    void setPlaylistMetadata(t0 t0Var);

    void setRepeatMode(int i10);

    void setShuffleModeEnabled(boolean z10);

    void setTrackSelectionParameters(q2 q2Var);

    void setVideoSurface(Surface surface);

    void setVideoSurfaceHolder(SurfaceHolder surfaceHolder);

    void setVideoSurfaceView(SurfaceView surfaceView);

    void setVideoTextureView(TextureView textureView);

    void setVolume(float f3);

    void stop();

    void unmute();
}
