package android.support.v4.media.session;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.util.Log;

public final class l extends MediaSession.Callback {

    public final m f502a;

    public l(m mVar) {
        this.f502a = mVar;
    }

    public final p a() {
        p pVar;
        synchronized (this.f502a.mLock) {
            pVar = (p) this.f502a.mSessionImpl.get();
        }
        if (pVar == null || this.f502a != pVar.a()) {
            return null;
        }
        return pVar;
    }

    @Override
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        va.d dVar;
        p pVarA = a();
        if (pVarA == null) {
            return;
        }
        t.a(bundle);
        try {
            if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                Bundle bundle2 = new Bundle();
                MediaSessionCompat$Token mediaSessionCompat$Token = pVarA.f507c;
                d dVarA = mediaSessionCompat$Token.a();
                bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", dVarA == null ? null : dVarA.asBinder());
                synchronized (mediaSessionCompat$Token.A) {
                    dVar = mediaSessionCompat$Token.D;
                }
                va.a.Y(bundle2, dVar);
                resultReceiver.send(0, bundle2);
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                this.f502a.onAddQueueItem((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                this.f502a.onAddQueueItem((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                this.f502a.onRemoveQueueItem((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
            } else if (!str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                this.f502a.onCommand(str, bundle, resultReceiver);
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
        }
        pVarA.b(null);
    }

    @Override
    public final void onCustomAction(String str, Bundle bundle) {
        p pVarA = a();
        if (pVarA == null) {
            return;
        }
        t.a(bundle);
        try {
            boolean zEquals = str.equals("android.support.v4.media.session.action.PLAY_FROM_URI");
            m mVar = this.f502a;
            if (zEquals) {
                Uri uri = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                t.a(bundle2);
                mVar.onPlayFromUri(uri, bundle2);
            } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                mVar.onPrepare();
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                t.a(bundle3);
                mVar.onPrepareFromMediaId(string, bundle3);
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                t.a(bundle4);
                mVar.onPrepareFromSearch(string2, bundle4);
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                Uri uri2 = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                t.a(bundle5);
                mVar.onPrepareFromUri(uri2, bundle5);
            } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                mVar.onSetCaptioningEnabled(bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"));
            } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                mVar.onSetRepeatMode(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
            } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                mVar.onSetShuffleMode(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
            } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                RatingCompat ratingCompat = (RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                Bundle bundle6 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                t.a(bundle6);
                mVar.onSetRating(ratingCompat, bundle6);
            } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                mVar.onSetPlaybackSpeed(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
            } else {
                mVar.onCustomAction(str, bundle);
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
        }
        pVarA.b(null);
    }

    @Override
    public final void onFastForward() {
        p pVarA = a();
        if (pVarA == null) {
            return;
        }
        this.f502a.onFastForward();
        pVarA.b(null);
    }

    @Override
    public final boolean onMediaButtonEvent(Intent intent) {
        p pVarA = a();
        if (pVarA == null) {
            return false;
        }
        boolean zOnMediaButtonEvent = this.f502a.onMediaButtonEvent(intent);
        pVarA.b(null);
        return zOnMediaButtonEvent || super.onMediaButtonEvent(intent);
    }

    @Override
    public final void onPause() {
        p pVarA = a();
        if (pVarA == null) {
            return;
        }
        this.f502a.onPause();
        pVarA.b(null);
    }

    @Override
    public final void onPlay() {
        p pVarA = a();
        if (pVarA == null) {
            return;
        }
        this.f502a.onPlay();
        pVarA.b(null);
    }

    @Override
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        p pVarA = a();
        if (pVarA == null) {
            return;
        }
        t.a(bundle);
        this.f502a.onPlayFromMediaId(str, bundle);
        pVarA.b(null);
    }

    @Override
    public final void onPlayFromSearch(String str, Bundle bundle) {
        p pVarA = a();
        if (pVarA == null) {
            return;
        }
        t.a(bundle);
        this.f502a.onPlayFromSearch(str, bundle);
        pVarA.b(null);
    }

    @Override
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        p pVarA = a();
        if (pVarA == null) {
            return;
        }
        t.a(bundle);
        this.f502a.onPlayFromUri(uri, bundle);
        pVarA.b(null);
    }

    @Override
    public final void onPrepare() {
        p pVarA = a();
        if (pVarA == null) {
            return;
        }
        this.f502a.onPrepare();
        pVarA.b(null);
    }

    @Override
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        p pVarA = a();
        if (pVarA == null) {
            return;
        }
        t.a(bundle);
        this.f502a.onPrepareFromMediaId(str, bundle);
        pVarA.b(null);
    }

    @Override
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        p pVarA = a();
        if (pVarA == null) {
            return;
        }
        t.a(bundle);
        this.f502a.onPrepareFromSearch(str, bundle);
        pVarA.b(null);
    }

    @Override
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        p pVarA = a();
        if (pVarA == null) {
            return;
        }
        t.a(bundle);
        this.f502a.onPrepareFromUri(uri, bundle);
        pVarA.b(null);
    }

    @Override
    public final void onRewind() {
        p pVarA = a();
        if (pVarA == null) {
            return;
        }
        this.f502a.onRewind();
        pVarA.b(null);
    }

    @Override
    public final void onSeekTo(long j9) {
        p pVarA = a();
        if (pVarA == null) {
            return;
        }
        this.f502a.onSeekTo(j9);
        pVarA.b(null);
    }

    @Override
    public final void onSetPlaybackSpeed(float f3) {
        p pVarA = a();
        if (pVarA == null) {
            return;
        }
        this.f502a.onSetPlaybackSpeed(f3);
        pVarA.b(null);
    }

    @Override
    public final void onSetRating(Rating rating) {
        float f3;
        p pVarA = a();
        if (pVarA == null) {
            return;
        }
        RatingCompat ratingCompat = null;
        if (rating != null) {
            int iB = android.support.v4.media.d.b(rating);
            if (android.support.v4.media.d.e(rating)) {
                switch (iB) {
                    case 1:
                        ratingCompat = new RatingCompat(1, android.support.v4.media.d.d(rating) ? 1.0f : 0.0f);
                        break;
                    case 2:
                        ratingCompat = new RatingCompat(2, android.support.v4.media.d.f(rating) ? 1.0f : 0.0f);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        float fC = android.support.v4.media.d.c(rating);
                        if (iB == 3) {
                            f3 = 3.0f;
                        } else if (iB == 4) {
                            f3 = 4.0f;
                        } else if (iB != 5) {
                            Log.e("Rating", "Invalid rating style (" + iB + ") for a star rating");
                        } else {
                            f3 = 5.0f;
                        }
                        if (fC >= 0.0f && fC <= f3) {
                            ratingCompat = new RatingCompat(iB, fC);
                        } else {
                            Log.e("Rating", "Trying to set out of range star-based rating");
                        }
                        break;
                    case 6:
                        float fA = android.support.v4.media.d.a(rating);
                        if (fA >= 0.0f && fA <= 100.0f) {
                            ratingCompat = new RatingCompat(6, fA);
                        } else {
                            Log.e("Rating", "Invalid percentage-based rating value");
                        }
                        break;
                }
            } else {
                switch (iB) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        ratingCompat = new RatingCompat(iB, -1.0f);
                        break;
                }
            }
            ratingCompat.getClass();
        }
        this.f502a.onSetRating(ratingCompat);
        pVarA.getClass();
    }

    @Override
    public final void onSkipToNext() {
        p pVarA = a();
        if (pVarA == null) {
            return;
        }
        this.f502a.onSkipToNext();
        pVarA.b(null);
    }

    @Override
    public final void onSkipToPrevious() {
        p pVarA = a();
        if (pVarA == null) {
            return;
        }
        this.f502a.onSkipToPrevious();
        pVarA.b(null);
    }

    @Override
    public final void onSkipToQueueItem(long j9) {
        p pVarA = a();
        if (pVarA == null) {
            return;
        }
        this.f502a.onSkipToQueueItem(j9);
        pVarA.b(null);
    }

    @Override
    public final void onStop() {
        p pVarA = a();
        if (pVarA == null) {
            return;
        }
        this.f502a.onStop();
        pVarA.b(null);
    }
}
