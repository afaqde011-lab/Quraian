package sg;

import android.graphics.RectF;
import java.util.Arrays;

public final class j implements d {

    public final float f14169a;

    public j(float f3) {
        this.f14169a = f3;
    }

    @Override
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f14169a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f14169a == ((j) obj).f14169a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f14169a)});
    }

    public final String toString() {
        return g4.c.g((int) (this.f14169a * 100.0f), "%", new StringBuilder());
    }
}
