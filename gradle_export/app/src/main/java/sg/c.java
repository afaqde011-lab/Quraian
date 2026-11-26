package sg;

import android.graphics.RectF;
import java.util.Arrays;

public final class c implements d {

    public final float f14149a;

    public c(float f3) {
        this.f14149a = f3;
    }

    @Override
    public final float a(RectF rectF) {
        float fMin = Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
        float f3 = this.f14149a;
        if (f3 < 0.0f) {
            return 0.0f;
        }
        return f3 > fMin ? fMin : f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f14149a == ((c) obj).f14149a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f14149a)});
    }
}
