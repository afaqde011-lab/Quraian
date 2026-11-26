package androidx.media3.exoplayer.drm;

import android.net.Uri;
import g7.j;
import java.io.IOException;
import java.util.Map;

public final class MediaDrmCallbackException extends IOException {
    public final j A;
    public final Uri B;
    public final Map C;
    public final long D;

    public MediaDrmCallbackException(j jVar, Uri uri, Map map, long j9, Exception exc) {
        super(exc);
        this.A = jVar;
        this.B = uri;
        this.C = map;
        this.D = j9;
    }
}
