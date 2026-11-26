package n7;

import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import java.util.UUID;

public final class m implements e {

    public final DrmSession$DrmSessionException f11173a;

    public m(DrmSession$DrmSessionException drmSession$DrmSessionException) {
        this.f11173a = drmSession$DrmSessionException;
    }

    @Override
    public final UUID a() {
        return androidx.media3.common.h.f1214a;
    }

    @Override
    public final void b(h hVar) {
    }

    @Override
    public final void c(h hVar) {
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final boolean e(String str) {
        return false;
    }

    @Override
    public final DrmSession$DrmSessionException f() {
        return this.f11173a;
    }

    @Override
    public final h7.a g() {
        return null;
    }

    @Override
    public final int getState() {
        return 1;
    }
}
