package androidx.media3.common;

import android.os.Bundle;
import java.util.Objects;

public final class y0 extends g1 {

    public static final String f1683c;

    public final float f1684b;

    static {
        String str = e7.i0.f5136a;
        f1683c = Integer.toString(1, 36);
    }

    public y0() {
        this.f1684b = -1.0f;
    }

    public y0(float f3) {
        ta.c0.r("percent must be in the range of [0, 100]", f3 >= 0.0f && f3 <= 100.0f);
        this.f1684b = f3;
    }

    @Override
    public final boolean b() {
        return this.f1684b != -1.0f;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(g1.f1213a, 1);
        bundle.putFloat(f1683c, this.f1684b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y0) {
            return this.f1684b == ((y0) obj).f1684b;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.f1684b));
    }
}
