package o6;

import android.content.Context;
import i2.t;

public final class g implements a {

    public final long f11665a;

    public g(long j9) {
        this.f11665a = j9;
    }

    @Override
    public final long a(Context context) {
        return this.f11665a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && t.c(this.f11665a, ((g) obj).f11665a);
    }

    public final int hashCode() {
        int i10 = t.f7168h;
        return Long.hashCode(this.f11665a);
    }

    public final String toString() {
        return "FixedColorProvider(color=" + ((Object) t.i(this.f11665a)) + ')';
    }
}
