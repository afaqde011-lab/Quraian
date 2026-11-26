package sg;

import android.graphics.RectF;
import java.util.Arrays;

public final class a implements d {

    public final float f14142a;

    public a(float f3) {
        this.f14142a = f3;
    }

    @Override
    public final float a(RectF rectF) {
        return this.f14142a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f14142a == ((a) obj).f14142a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f14142a)});
    }

    public final String toString() {
        return this.f14142a + "px";
    }
}
