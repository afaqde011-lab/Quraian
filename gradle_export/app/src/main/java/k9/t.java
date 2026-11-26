package k9;

import android.os.Bundle;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.PlaybackException;
import java.util.List;

public interface t {
    a4 a();

    void addListener(androidx.media3.common.d1 d1Var);

    void addMediaItem(int i10, androidx.media3.common.q0 q0Var);

    void addMediaItem(androidx.media3.common.q0 q0Var);

    void addMediaItems(int i10, List list);

    void addMediaItems(List list);

    fh.t0 b();

    kh.v c(z3 z3Var);

    void clearMediaItems();

    void clearVideoSurface();

    void clearVideoSurface(Surface surface);

    void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder);

    void clearVideoSurfaceView(SurfaceView surfaceView);

    void clearVideoTextureView(TextureView textureView);

    void d();

    void decreaseDeviceVolume();

    void decreaseDeviceVolume(int i10);

    Bundle e();

    androidx.media3.common.d getAudioAttributes();

    int getAudioSessionId();

    androidx.media3.common.b1 getAvailableCommands();

    int getBufferedPercentage();

    long getBufferedPosition();

    long getContentBufferedPosition();

    long getContentDuration();

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    d7.c getCurrentCues();

    long getCurrentLiveOffset();

    int getCurrentMediaItemIndex();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    androidx.media3.common.k2 getCurrentTimeline();

    androidx.media3.common.s2 getCurrentTracks();

    androidx.media3.common.l getDeviceInfo();

    int getDeviceVolume();

    long getDuration();

    long getMaxSeekToPreviousPosition();

    androidx.media3.common.t0 getMediaMetadata();

    int getNextMediaItemIndex();

    boolean getPlayWhenReady();

    androidx.media3.common.z0 getPlaybackParameters();

    int getPlaybackState();

    int getPlaybackSuppressionReason();

    PlaybackException getPlayerError();

    androidx.media3.common.t0 getPlaylistMetadata();

    int getPreviousMediaItemIndex();

    int getRepeatMode();

    long getSeekBackIncrement();

    long getSeekForwardIncrement();

    boolean getShuffleModeEnabled();

    e7.v getSurfaceSize();

    long getTotalBufferedDuration();

    androidx.media3.common.q2 getTrackSelectionParameters();

    androidx.media3.common.w2 getVideoSize();

    float getVolume();

    boolean hasNextMediaItem();

    boolean hasPreviousMediaItem();

    void increaseDeviceVolume();

    void increaseDeviceVolume(int i10);

    boolean isConnected();

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

    void removeListener(androidx.media3.common.d1 d1Var);

    void removeMediaItem(int i10);

    void removeMediaItems(int i10, int i11);

    void replaceMediaItem(int i10, androidx.media3.common.q0 q0Var);

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

    void setAudioAttributes(androidx.media3.common.d dVar, boolean z10);

    void setDeviceMuted(boolean z10);

    void setDeviceMuted(boolean z10, int i10);

    void setDeviceVolume(int i10);

    void setDeviceVolume(int i10, int i11);

    void setMediaItem(androidx.media3.common.q0 q0Var);

    void setMediaItem(androidx.media3.common.q0 q0Var, long j9);

    void setMediaItem(androidx.media3.common.q0 q0Var, boolean z10);

    void setMediaItems(List list);

    void setMediaItems(List list, int i10, long j9);

    void setMediaItems(List list, boolean z10);

    void setPlayWhenReady(boolean z10);

    void setPlaybackParameters(androidx.media3.common.z0 z0Var);

    void setPlaybackSpeed(float f3);

    void setPlaylistMetadata(androidx.media3.common.t0 t0Var);

    void setRepeatMode(int i10);

    void setShuffleModeEnabled(boolean z10);

    void setTrackSelectionParameters(androidx.media3.common.q2 q2Var);

    void setVideoSurface(Surface surface);

    void setVideoSurfaceHolder(SurfaceHolder surfaceHolder);

    void setVideoSurfaceView(SurfaceView surfaceView);

    void setVideoTextureView(TextureView textureView);

    void setVolume(float f3);

    void stop();

    void unmute();
}
