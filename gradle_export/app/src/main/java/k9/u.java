package k9;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.PlaybackException;
import java.util.List;

public final class u implements androidx.media3.common.f1 {

    public final androidx.media3.common.j2 f9519b;

    public boolean f9520c;

    public final t f9521d;

    public final s f9522e;

    public final Handler f9523f;

    public final long f9524g;

    public boolean f9525h;

    public final v f9526i;

    public u(Context context, f4 f4Var, Bundle bundle, s sVar, Looper looper, v vVar, h1.l lVar) {
        u uVar;
        t t0Var;
        ta.c0.w(context, "context must not be null");
        ta.c0.w(f4Var, "token must not be null");
        e7.a.h("MediaController", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.9.0] [" + e7.i0.f5136a + "]");
        this.f9519b = new androidx.media3.common.j2();
        this.f9524g = -9223372036854775807L;
        this.f9522e = sVar;
        this.f9523f = new Handler(looper);
        this.f9526i = vVar;
        if (f4Var.f9293a.e()) {
            lVar.getClass();
            t0Var = new z0(context, this, f4Var, bundle, looper, lVar);
            uVar = this;
        } else {
            uVar = this;
            t0Var = new t0(context, uVar, f4Var, bundle, looper);
        }
        uVar.f9521d = t0Var;
        t0Var.d();
    }

    public final void a() {
        ta.c0.A(Looper.myLooper() == this.f9523f.getLooper());
        ta.c0.A(!this.f9525h);
        this.f9525h = true;
        v vVar = this.f9526i;
        vVar.J = true;
        u uVar = vVar.I;
        if (uVar != null) {
            vVar.l(uVar);
        }
    }

    @Override
    public final void addListener(androidx.media3.common.d1 d1Var) {
        ta.c0.w(d1Var, "listener must not be null");
        this.f9521d.addListener(d1Var);
    }

    @Override
    public final void addMediaItem(int i10, androidx.media3.common.q0 q0Var) {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.addMediaItem(i10, q0Var);
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring addMediaItem().");
        }
    }

    @Override
    public final void addMediaItem(androidx.media3.common.q0 q0Var) {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.addMediaItem(q0Var);
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring addMediaItem().");
        }
    }

    @Override
    public final void addMediaItems(int i10, List list) {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.addMediaItems(i10, list);
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring addMediaItems().");
        }
    }

    @Override
    public final void addMediaItems(List list) {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.addMediaItems(list);
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring addMediaItems().");
        }
    }

    public final void b(Runnable runnable) {
        e7.i0.M(this.f9523f, runnable);
    }

    public final void c() {
        ta.c0.z("MediaController method is called from a wrong thread. See javadoc of MediaController for details.", Looper.myLooper() == this.f9523f.getLooper());
    }

    @Override
    public final boolean canAdvertiseSession() {
        return false;
    }

    @Override
    public final void clearMediaItems() {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.clearMediaItems();
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring clearMediaItems().");
        }
    }

    @Override
    public final void clearVideoSurface() {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.clearVideoSurface();
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring clearVideoSurface().");
        }
    }

    @Override
    public final void clearVideoSurface(Surface surface) {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.clearVideoSurface(surface);
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring clearVideoSurface().");
        }
    }

    @Override
    public final void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.clearVideoSurfaceHolder(surfaceHolder);
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring clearVideoSurfaceHolder().");
        }
    }

    @Override
    public final void clearVideoSurfaceView(SurfaceView surfaceView) {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.clearVideoSurfaceView(surfaceView);
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring clearVideoSurfaceView().");
        }
    }

    @Override
    public final void clearVideoTextureView(TextureView textureView) {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.clearVideoTextureView(textureView);
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring clearVideoTextureView().");
        }
    }

    @Override
    public final void decreaseDeviceVolume() {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.decreaseDeviceVolume();
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring decreaseDeviceVolume().");
        }
    }

    @Override
    public final void decreaseDeviceVolume(int i10) {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.decreaseDeviceVolume(i10);
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring decreaseDeviceVolume().");
        }
    }

    @Override
    public final Looper getApplicationLooper() {
        return this.f9523f.getLooper();
    }

    @Override
    public final androidx.media3.common.d getAudioAttributes() {
        c();
        t tVar = this.f9521d;
        return !tVar.isConnected() ? androidx.media3.common.d.f1142i : tVar.getAudioAttributes();
    }

    @Override
    public final int getAudioSessionId() {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            return tVar.getAudioSessionId();
        }
        return 0;
    }

    @Override
    public final androidx.media3.common.b1 getAvailableCommands() {
        c();
        t tVar = this.f9521d;
        return !tVar.isConnected() ? androidx.media3.common.b1.f1101b : tVar.getAvailableCommands();
    }

    @Override
    public final int getBufferedPercentage() {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            return tVar.getBufferedPercentage();
        }
        return 0;
    }

    @Override
    public final long getBufferedPosition() {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            return tVar.getBufferedPosition();
        }
        return 0L;
    }

    @Override
    public final long getContentBufferedPosition() {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            return tVar.getContentBufferedPosition();
        }
        return 0L;
    }

    @Override
    public final long getContentDuration() {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            return tVar.getContentDuration();
        }
        return -9223372036854775807L;
    }

    @Override
    public final long getContentPosition() {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            return tVar.getContentPosition();
        }
        return 0L;
    }

    @Override
    public final int getCurrentAdGroupIndex() {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            return tVar.getCurrentAdGroupIndex();
        }
        return -1;
    }

    @Override
    public final int getCurrentAdIndexInAdGroup() {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            return tVar.getCurrentAdIndexInAdGroup();
        }
        return -1;
    }

    @Override
    public final d7.c getCurrentCues() {
        c();
        t tVar = this.f9521d;
        return tVar.isConnected() ? tVar.getCurrentCues() : d7.c.f4764d;
    }

    @Override
    public final long getCurrentLiveOffset() {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            return tVar.getCurrentLiveOffset();
        }
        return -9223372036854775807L;
    }

    @Override
    public final Object getCurrentManifest() {
        return null;
    }

    @Override
    public final androidx.media3.common.q0 getCurrentMediaItem() {
        androidx.media3.common.k2 currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return null;
        }
        return currentTimeline.getWindow(getCurrentMediaItemIndex(), this.f9519b).f1285c;
    }

    @Override
    public final int getCurrentMediaItemIndex() {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            return tVar.getCurrentMediaItemIndex();
        }
        return -1;
    }

    @Override
    public final int getCurrentPeriodIndex() {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            return tVar.getCurrentPeriodIndex();
        }
        return -1;
    }

    @Override
    public final long getCurrentPosition() {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            return tVar.getCurrentPosition();
        }
        return 0L;
    }

    @Override
    public final androidx.media3.common.k2 getCurrentTimeline() {
        c();
        t tVar = this.f9521d;
        return tVar.isConnected() ? tVar.getCurrentTimeline() : androidx.media3.common.k2.EMPTY;
    }

    @Override
    public final androidx.media3.common.s2 getCurrentTracks() {
        c();
        t tVar = this.f9521d;
        return tVar.isConnected() ? tVar.getCurrentTracks() : androidx.media3.common.s2.f1554b;
    }

    @Override
    public final int getCurrentWindowIndex() {
        return getCurrentMediaItemIndex();
    }

    @Override
    public final androidx.media3.common.l getDeviceInfo() {
        c();
        t tVar = this.f9521d;
        return !tVar.isConnected() ? androidx.media3.common.l.f1313e : tVar.getDeviceInfo();
    }

    @Override
    public final int getDeviceVolume() {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            return tVar.getDeviceVolume();
        }
        return 0;
    }

    @Override
    public final long getDuration() {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            return tVar.getDuration();
        }
        return -9223372036854775807L;
    }

    @Override
    public final long getMaxSeekToPreviousPosition() {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            return tVar.getMaxSeekToPreviousPosition();
        }
        return 0L;
    }

    @Override
    public final androidx.media3.common.q0 getMediaItemAt(int i10) {
        return getCurrentTimeline().getWindow(i10, this.f9519b).f1285c;
    }

    @Override
    public final int getMediaItemCount() {
        return getCurrentTimeline().getWindowCount();
    }

    @Override
    public final androidx.media3.common.t0 getMediaMetadata() {
        c();
        t tVar = this.f9521d;
        return tVar.isConnected() ? tVar.getMediaMetadata() : androidx.media3.common.t0.K;
    }

    @Override
    public final int getNextMediaItemIndex() {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            return tVar.getNextMediaItemIndex();
        }
        return -1;
    }

    @Override
    public final int getNextWindowIndex() {
        return getNextMediaItemIndex();
    }

    @Override
    public final boolean getPlayWhenReady() {
        c();
        t tVar = this.f9521d;
        return tVar.isConnected() && tVar.getPlayWhenReady();
    }

    @Override
    public final androidx.media3.common.z0 getPlaybackParameters() {
        c();
        t tVar = this.f9521d;
        return tVar.isConnected() ? tVar.getPlaybackParameters() : androidx.media3.common.z0.f1685d;
    }

    @Override
    public final int getPlaybackState() {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            return tVar.getPlaybackState();
        }
        return 1;
    }

    @Override
    public final int getPlaybackSuppressionReason() {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            return tVar.getPlaybackSuppressionReason();
        }
        return 0;
    }

    @Override
    public final PlaybackException getPlayerError() {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            return tVar.getPlayerError();
        }
        return null;
    }

    @Override
    public final androidx.media3.common.t0 getPlaylistMetadata() {
        c();
        t tVar = this.f9521d;
        return tVar.isConnected() ? tVar.getPlaylistMetadata() : androidx.media3.common.t0.K;
    }

    @Override
    public final int getPreviousMediaItemIndex() {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            return tVar.getPreviousMediaItemIndex();
        }
        return -1;
    }

    @Override
    public final int getPreviousWindowIndex() {
        return getPreviousMediaItemIndex();
    }

    @Override
    public final int getRepeatMode() {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            return tVar.getRepeatMode();
        }
        return 0;
    }

    @Override
    public final long getSeekBackIncrement() {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            return tVar.getSeekBackIncrement();
        }
        return 0L;
    }

    @Override
    public final long getSeekForwardIncrement() {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            return tVar.getSeekForwardIncrement();
        }
        return 0L;
    }

    @Override
    public final boolean getShuffleModeEnabled() {
        c();
        t tVar = this.f9521d;
        return tVar.isConnected() && tVar.getShuffleModeEnabled();
    }

    @Override
    public final e7.v getSurfaceSize() {
        c();
        t tVar = this.f9521d;
        return tVar.isConnected() ? tVar.getSurfaceSize() : e7.v.f5185c;
    }

    @Override
    public final long getTotalBufferedDuration() {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            return tVar.getTotalBufferedDuration();
        }
        return 0L;
    }

    @Override
    public final androidx.media3.common.q2 getTrackSelectionParameters() {
        c();
        t tVar = this.f9521d;
        return !tVar.isConnected() ? androidx.media3.common.q2.J : tVar.getTrackSelectionParameters();
    }

    @Override
    public final androidx.media3.common.w2 getVideoSize() {
        c();
        t tVar = this.f9521d;
        return tVar.isConnected() ? tVar.getVideoSize() : androidx.media3.common.w2.f1669d;
    }

    @Override
    public final float getVolume() {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            return tVar.getVolume();
        }
        return 1.0f;
    }

    @Override
    public final boolean hasNextMediaItem() {
        c();
        t tVar = this.f9521d;
        return tVar.isConnected() && tVar.hasNextMediaItem();
    }

    @Override
    public final boolean hasPreviousMediaItem() {
        c();
        t tVar = this.f9521d;
        return tVar.isConnected() && tVar.hasPreviousMediaItem();
    }

    @Override
    public final void increaseDeviceVolume() {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.increaseDeviceVolume();
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring increaseDeviceVolume().");
        }
    }

    @Override
    public final void increaseDeviceVolume(int i10) {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.increaseDeviceVolume(i10);
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring increaseDeviceVolume().");
        }
    }

    @Override
    public final boolean isCommandAvailable(int i10) {
        return getAvailableCommands().a(i10);
    }

    @Override
    public final boolean isCurrentMediaItemDynamic() {
        c();
        androidx.media3.common.k2 currentTimeline = getCurrentTimeline();
        return !currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.f9519b).f1291i;
    }

    @Override
    public final boolean isCurrentMediaItemLive() {
        c();
        androidx.media3.common.k2 currentTimeline = getCurrentTimeline();
        return !currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.f9519b).a();
    }

    @Override
    public final boolean isCurrentMediaItemSeekable() {
        c();
        androidx.media3.common.k2 currentTimeline = getCurrentTimeline();
        return !currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.f9519b).f1290h;
    }

    @Override
    public final boolean isCurrentWindowDynamic() {
        return isCurrentMediaItemDynamic();
    }

    @Override
    public final boolean isCurrentWindowLive() {
        return isCurrentMediaItemLive();
    }

    @Override
    public final boolean isCurrentWindowSeekable() {
        return isCurrentMediaItemSeekable();
    }

    @Override
    public final boolean isDeviceMuted() {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            return tVar.isDeviceMuted();
        }
        return false;
    }

    @Override
    public final boolean isLoading() {
        c();
        t tVar = this.f9521d;
        return tVar.isConnected() && tVar.isLoading();
    }

    @Override
    public final boolean isPlaying() {
        c();
        t tVar = this.f9521d;
        return tVar.isConnected() && tVar.isPlaying();
    }

    @Override
    public final boolean isPlayingAd() {
        c();
        t tVar = this.f9521d;
        return tVar.isConnected() && tVar.isPlayingAd();
    }

    @Override
    public final void moveMediaItem(int i10, int i11) {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.moveMediaItem(i10, i11);
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring moveMediaItem().");
        }
    }

    @Override
    public final void moveMediaItems(int i10, int i11, int i12) {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.moveMediaItems(i10, i11, i12);
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring moveMediaItems().");
        }
    }

    @Override
    public final void mute() {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.mute();
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring mute().");
        }
    }

    @Override
    public final void pause() {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.pause();
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring pause().");
        }
    }

    @Override
    public final void play() {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.play();
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring play().");
        }
    }

    @Override
    public final void prepare() {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.prepare();
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring prepare().");
        }
    }

    @Override
    public final void release() {
        c();
        if (this.f9520c) {
            return;
        }
        e7.a.h("MediaController", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.9.0] [" + e7.i0.f5136a + "] [" + androidx.media3.common.r0.b() + "]");
        this.f9520c = true;
        Handler handler = this.f9523f;
        handler.removeCallbacksAndMessages(null);
        try {
            this.f9521d.release();
        } catch (Exception e3) {
            e7.a.c("MediaController", "Exception while releasing impl", e3);
        }
        if (this.f9525h) {
            ta.c0.A(Looper.myLooper() == handler.getLooper());
            this.f9522e.y(this);
        } else {
            this.f9525h = true;
            v vVar = this.f9526i;
            vVar.getClass();
            vVar.m(new SecurityException("Session rejected the connection request."));
        }
    }

    @Override
    public final void removeListener(androidx.media3.common.d1 d1Var) {
        c();
        ta.c0.w(d1Var, "listener must not be null");
        this.f9521d.removeListener(d1Var);
    }

    @Override
    public final void removeMediaItem(int i10) {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.removeMediaItem(i10);
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring removeMediaItem().");
        }
    }

    @Override
    public final void removeMediaItems(int i10, int i11) {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.removeMediaItems(i10, i11);
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring removeMediaItems().");
        }
    }

    @Override
    public final void replaceMediaItem(int i10, androidx.media3.common.q0 q0Var) {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.replaceMediaItem(i10, q0Var);
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring replaceMediaItem().");
        }
    }

    @Override
    public final void replaceMediaItems(int i10, int i11, List list) {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.replaceMediaItems(i10, i11, list);
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring replaceMediaItems().");
        }
    }

    @Override
    public final void seekBack() {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.seekBack();
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring seekBack().");
        }
    }

    @Override
    public final void seekForward() {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.seekForward();
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring seekForward().");
        }
    }

    @Override
    public final void seekTo(int i10, long j9) {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.seekTo(i10, j9);
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override
    public final void seekTo(long j9) {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.seekTo(j9);
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override
    public final void seekToDefaultPosition() {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.seekToDefaultPosition();
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override
    public final void seekToDefaultPosition(int i10) {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.seekToDefaultPosition(i10);
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override
    public final void seekToNext() {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.seekToNext();
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring seekToNext().");
        }
    }

    @Override
    public final void seekToNextMediaItem() {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.seekToNextMediaItem();
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring seekToNextMediaItem().");
        }
    }

    @Override
    public final void seekToPrevious() {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.seekToPrevious();
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring seekToPrevious().");
        }
    }

    @Override
    public final void seekToPreviousMediaItem() {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.seekToPreviousMediaItem();
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring seekToPreviousMediaItem().");
        }
    }

    @Override
    public final void setAudioAttributes(androidx.media3.common.d dVar, boolean z10) {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.setAudioAttributes(dVar, z10);
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring setAudioAttributes().");
        }
    }

    @Override
    public final void setDeviceMuted(boolean z10) {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.setDeviceMuted(z10);
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring setDeviceMuted().");
        }
    }

    @Override
    public final void setDeviceMuted(boolean z10, int i10) {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.setDeviceMuted(z10, i10);
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring setDeviceMuted().");
        }
    }

    @Override
    public final void setDeviceVolume(int i10) {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.setDeviceVolume(i10);
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring setDeviceVolume().");
        }
    }

    @Override
    public final void setDeviceVolume(int i10, int i11) {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.setDeviceVolume(i10, i11);
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring setDeviceVolume().");
        }
    }

    @Override
    public final void setMediaItem(androidx.media3.common.q0 q0Var) {
        c();
        ta.c0.w(q0Var, "mediaItems must not be null");
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.setMediaItem(q0Var);
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring setMediaItem().");
        }
    }

    @Override
    public final void setMediaItem(androidx.media3.common.q0 q0Var, long j9) {
        c();
        ta.c0.w(q0Var, "mediaItems must not be null");
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.setMediaItem(q0Var, j9);
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring setMediaItem().");
        }
    }

    @Override
    public final void setMediaItem(androidx.media3.common.q0 q0Var, boolean z10) {
        c();
        ta.c0.w(q0Var, "mediaItems must not be null");
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.setMediaItem(q0Var, z10);
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring setMediaItems().");
        }
    }

    @Override
    public final void setMediaItems(List list) {
        c();
        ta.c0.w(list, "mediaItems must not be null");
        for (int i10 = 0; i10 < list.size(); i10++) {
            ta.c0.q("items must not contain null, index=%s", i10, list.get(i10) != null);
        }
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.setMediaItems(list);
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring setMediaItems().");
        }
    }

    @Override
    public final void setMediaItems(List list, int i10, long j9) {
        c();
        ta.c0.w(list, "mediaItems must not be null");
        for (int i11 = 0; i11 < list.size(); i11++) {
            ta.c0.q("items must not contain null, index=%s", i11, list.get(i11) != null);
        }
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.setMediaItems(list, i10, j9);
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring setMediaItems().");
        }
    }

    @Override
    public final void setMediaItems(List list, boolean z10) {
        c();
        ta.c0.w(list, "mediaItems must not be null");
        for (int i10 = 0; i10 < list.size(); i10++) {
            ta.c0.q("items must not contain null, index=%s", i10, list.get(i10) != null);
        }
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.setMediaItems(list, z10);
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring setMediaItems().");
        }
    }

    @Override
    public final void setPlayWhenReady(boolean z10) {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.setPlayWhenReady(z10);
        }
    }

    @Override
    public final void setPlaybackParameters(androidx.media3.common.z0 z0Var) {
        c();
        ta.c0.w(z0Var, "playbackParameters must not be null");
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.setPlaybackParameters(z0Var);
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring setPlaybackParameters().");
        }
    }

    @Override
    public final void setPlaybackSpeed(float f3) {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.setPlaybackSpeed(f3);
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring setPlaybackSpeed().");
        }
    }

    @Override
    public final void setPlaylistMetadata(androidx.media3.common.t0 t0Var) {
        c();
        ta.c0.w(t0Var, "playlistMetadata must not be null");
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.setPlaylistMetadata(t0Var);
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring setPlaylistMetadata().");
        }
    }

    @Override
    public final void setRepeatMode(int i10) {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.setRepeatMode(i10);
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring setRepeatMode().");
        }
    }

    @Override
    public final void setShuffleModeEnabled(boolean z10) {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.setShuffleModeEnabled(z10);
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring setShuffleMode().");
        }
    }

    @Override
    public final void setTrackSelectionParameters(androidx.media3.common.q2 q2Var) {
        c();
        t tVar = this.f9521d;
        if (!tVar.isConnected()) {
            e7.a.m("MediaController", "The controller is not connected. Ignoring setTrackSelectionParameters().");
        }
        tVar.setTrackSelectionParameters(q2Var);
    }

    @Override
    public final void setVideoSurface(Surface surface) {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.setVideoSurface(surface);
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring setVideoSurface().");
        }
    }

    @Override
    public final void setVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.setVideoSurfaceHolder(surfaceHolder);
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring setVideoSurfaceHolder().");
        }
    }

    @Override
    public final void setVideoSurfaceView(SurfaceView surfaceView) {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.setVideoSurfaceView(surfaceView);
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring setVideoSurfaceView().");
        }
    }

    @Override
    public final void setVideoTextureView(TextureView textureView) {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.setVideoTextureView(textureView);
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring setVideoTextureView().");
        }
    }

    @Override
    public final void setVolume(float f3) {
        c();
        ta.c0.r("volume must be between 0 and 1", f3 >= 0.0f && f3 <= 1.0f);
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.setVolume(f3);
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring setVolume().");
        }
    }

    @Override
    public final void stop() {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.stop();
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring stop().");
        }
    }

    @Override
    public final void unmute() {
        c();
        t tVar = this.f9521d;
        if (tVar.isConnected()) {
            tVar.unmute();
        } else {
            e7.a.m("MediaController", "The controller is not connected. Ignoring unmute().");
        }
    }
}
