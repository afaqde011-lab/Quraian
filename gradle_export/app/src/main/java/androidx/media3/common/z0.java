package androidx.media3.common;

import java.util.Locale;

public final class z0 {

    public static final z0 f1685d = new z0(1.0f);

    public static final String f1686e;

    public static final String f1687f;

    public final float f1688a;

    public final float f1689b;

    public final int f1690c;

    static {
        String str = e7.i0.f5136a;
        f1686e = Integer.toString(0, 36);
        f1687f = Integer.toString(1, 36);
    }

    public z0(float f3) {
        this(f3, 1.0f);
    }

    public z0(float f3, float f10) {
        ta.c0.s(f3 > 0.0f);
        ta.c0.s(f10 > 0.0f);
        this.f1688a = f3;
        this.f1689b = f10;
        this.f1690c = Math.round(f3 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z0.class == obj.getClass()) {
            z0 z0Var = (z0) obj;
            if (this.f1688a == z0Var.f1688a && this.f1689b == z0Var.f1689b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f1689b) + ((Float.floatToRawIntBits(this.f1688a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f1688a), Float.valueOf(this.f1689b)};
        String str = e7.i0.f5136a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
