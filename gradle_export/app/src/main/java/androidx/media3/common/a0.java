package androidx.media3.common;

import android.os.Bundle;
import java.util.Objects;

public final class a0 extends g1 {

    public static final String f1061d;

    public static final String f1062e;

    public final boolean f1063b;

    public final boolean f1064c;

    static {
        String str = e7.i0.f5136a;
        f1061d = Integer.toString(1, 36);
        f1062e = Integer.toString(2, 36);
    }

    public a0() {
        this.f1063b = false;
        this.f1064c = false;
    }

    public a0(boolean z10) {
        this.f1063b = true;
        this.f1064c = z10;
    }

    @Override
    public final boolean b() {
        return this.f1063b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(g1.f1213a, 0);
        bundle.putBoolean(f1061d, this.f1063b);
        bundle.putBoolean(f1062e, this.f1064c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f1064c == a0Var.f1064c && this.f1063b == a0Var.f1063b;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f1063b), Boolean.valueOf(this.f1064c));
    }
}
