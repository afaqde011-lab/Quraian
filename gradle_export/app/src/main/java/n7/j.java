package n7;

import android.os.Looper;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;

public final class j implements l {
    @Override
    public final e a(h hVar, androidx.media3.common.t tVar) {
        if (tVar.f1598r == null) {
            return null;
        }
        return new m(new DrmSession$DrmSessionException(new UnsupportedDrmException(), 6001));
    }

    @Override
    public final void b(Looper looper, j7.j jVar) {
    }

    @Override
    public final int d(androidx.media3.common.t tVar) {
        return tVar.f1598r != null ? 1 : 0;
    }
}
