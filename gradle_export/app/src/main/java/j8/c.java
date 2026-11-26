package j8;

import androidx.media3.common.u0;
import c7.i;

public final class c implements u0 {

    public final long f8256a;

    public c(long j9) {
        this.f8256a = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && c.class == obj.getClass() && this.f8256a == ((c) obj).f8256a;
    }

    public final int hashCode() {
        return i.G(this.f8256a) + 527;
    }

    public final String toString() {
        return "ThumbnailMetadata: presentationTimeUs=" + this.f8256a;
    }
}
