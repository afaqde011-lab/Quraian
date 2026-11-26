package android.support.v4.media.session;

import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import java.lang.ref.WeakReference;

public abstract class m {
    k mCallbackHandler;
    private boolean mMediaPlayPausePendingOnHandler;
    final Object mLock = new Object();
    final MediaSession.Callback mCallbackFwk = new l(this);
    WeakReference<n> mSessionImpl = new WeakReference<>(null);

    public void handleMediaPlayPauseIfPendingOnHandler(n nVar, Handler handler) {
        if (this.mMediaPlayPausePendingOnHandler) {
            this.mMediaPlayPausePendingOnHandler = false;
            handler.removeMessages(1);
            PlaybackStateCompat playbackState = nVar.getPlaybackState();
            long j9 = playbackState == null ? 0L : playbackState.E;
            boolean z10 = playbackState != null && playbackState.A == 3;
            boolean z11 = (516 & j9) != 0;
            boolean z12 = (j9 & 514) != 0;
            if (z10 && z12) {
                onPause();
            } else {
                if (z10 || !z11) {
                    return;
                }
                onPlay();
            }
        }
    }

    public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
    }

    public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
    }

    public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
    }

    public void onCustomAction(String str, Bundle bundle) {
    }

    public void onFastForward() {
    }

    public boolean onMediaButtonEvent(Intent intent) {
        return false;
    }

    public void onPause() {
    }

    public void onPlay() {
    }

    public void onPlayFromMediaId(String str, Bundle bundle) {
    }

    public void onPlayFromSearch(String str, Bundle bundle) {
    }

    public void onPlayFromUri(Uri uri, Bundle bundle) {
    }

    public void onPrepare() {
    }

    public void onPrepareFromMediaId(String str, Bundle bundle) {
    }

    public void onPrepareFromSearch(String str, Bundle bundle) {
    }

    public void onPrepareFromUri(Uri uri, Bundle bundle) {
    }

    public void onRemoveQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
    }

    @Deprecated
    public void onRemoveQueueItemAt(int i10) {
    }

    public void onRewind() {
    }

    public void onSeekTo(long j9) {
    }

    public void onSetCaptioningEnabled(boolean z10) {
    }

    public void onSetPlaybackSpeed(float f3) {
    }

    public void onSetRating(RatingCompat ratingCompat) {
    }

    public void onSetRating(RatingCompat ratingCompat, Bundle bundle) {
    }

    public void onSetRepeatMode(int i10) {
    }

    public void onSetShuffleMode(int i10) {
    }

    public void onSkipToNext() {
    }

    public void onSkipToPrevious() {
    }

    public void onSkipToQueueItem(long j9) {
    }

    public void onStop() {
    }

    public void setSessionImpl(n nVar, Handler handler) {
        synchronized (this.mLock) {
            try {
                this.mSessionImpl = new WeakReference<>(nVar);
                k kVar = this.mCallbackHandler;
                k kVar2 = null;
                if (kVar != null) {
                    kVar.removeCallbacksAndMessages(null);
                }
                if (nVar != null && handler != null) {
                    kVar2 = new k(this, handler.getLooper());
                }
                this.mCallbackHandler = kVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
