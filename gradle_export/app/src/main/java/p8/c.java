package p8;

import androidx.media3.common.u0;

public final class c implements u0 {

    public final float f12450a;

    public final int f12451b;

    public c(float f3, int i10) {
        this.f12450a = f3;
        this.f12451b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f12450a == cVar.f12450a && this.f12451b == cVar.f12451b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f12450a).hashCode() + 527) * 31) + this.f12451b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f12450a + ", svcTemporalLayerCount=" + this.f12451b;
    }
}
