package androidx.media3.common;

import android.os.Bundle;
import java.util.Objects;

public final class d2 extends g1 {

    public static final String f1167d;

    public static final String f1168e;

    public final int f1169b;

    public final float f1170c;

    static {
        String str = e7.i0.f5136a;
        f1167d = Integer.toString(1, 36);
        f1168e = Integer.toString(2, 36);
    }

    public d2(int i10) {
        ta.c0.r("maxStars must be a positive integer", i10 > 0);
        this.f1169b = i10;
        this.f1170c = -1.0f;
    }

    public d2(int i10, float f3) {
        boolean z10 = false;
        ta.c0.r("maxStars must be a positive integer", i10 > 0);
        if (f3 >= 0.0f && f3 <= i10) {
            z10 = true;
        }
        ta.c0.r("starRating is out of range [0, maxStars]", z10);
        this.f1169b = i10;
        this.f1170c = f3;
    }

    @Override
    public final boolean b() {
        return this.f1170c != -1.0f;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(g1.f1213a, 2);
        bundle.putInt(f1167d, this.f1169b);
        bundle.putFloat(f1168e, this.f1170c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return this.f1169b == d2Var.f1169b && this.f1170c == d2Var.f1170c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f1169b), Float.valueOf(this.f1170c));
    }
}
