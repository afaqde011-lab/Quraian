package f7;

import androidx.media3.common.u0;
import ta.c0;

public final class f implements u0 {

    public final float f5494a;

    public final float f5495b;

    public f(float f3, float f10) {
        c0.r("Invalid latitude or longitude", f3 >= -90.0f && f3 <= 90.0f && f10 >= -180.0f && f10 <= 180.0f);
        this.f5494a = f3;
        this.f5495b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (this.f5494a == fVar.f5494a && this.f5495b == fVar.f5495b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.f5495b).hashCode() + ((Float.valueOf(this.f5494a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f5494a + ", longitude=" + this.f5495b;
    }
}
