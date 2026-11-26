package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaSession;

public final class q extends p {
    @Override
    public final void b(z6.a aVar) {
    }

    @Override
    public final MediaSession c(Context context) {
        return new MediaSession(context, "CastMediaSession", null);
    }
}
