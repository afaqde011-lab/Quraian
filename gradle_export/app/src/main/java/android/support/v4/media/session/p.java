package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.support.v4.media.MediaMetadataCompat;

public abstract class p implements n {

    public final MediaSession f505a;

    public final o f506b;

    public final MediaSessionCompat$Token f507c;

    public final Object f508d = new Object();

    public final RemoteCallbackList f509e = new RemoteCallbackList();

    public PlaybackStateCompat f510f;

    public MediaMetadataCompat f511g;

    public m f512h;

    public p(Context context) {
        MediaSession mediaSessionC = c(context);
        this.f505a = mediaSessionC;
        o oVar = new o((q) this);
        this.f506b = oVar;
        this.f507c = new MediaSessionCompat$Token(mediaSessionC.getSessionToken(), oVar);
        mediaSessionC.setFlags(3);
    }

    @Override
    public final m a() {
        m mVar;
        synchronized (this.f508d) {
            mVar = this.f512h;
        }
        return mVar;
    }

    public abstract MediaSession c(Context context);

    public final void d(m mVar, Handler handler) {
        synchronized (this.f508d) {
            try {
                this.f512h = mVar;
                this.f505a.setCallback(mVar == null ? null : mVar.mCallbackFwk, handler);
                if (mVar != null) {
                    mVar.setSessionImpl(this, handler);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final PlaybackStateCompat getPlaybackState() {
        return this.f510f;
    }
}
