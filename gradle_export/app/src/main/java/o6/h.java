package o6;

import android.content.Context;
import i2.b0;
import oi.k;

public final class h implements a {

    public final int f11666a;

    public h(int i10) {
        this.f11666a = i10;
    }

    @Override
    public final long a(Context context) {
        return b0.c(context.getColor(this.f11666a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f11666a == ((h) obj).f11666a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11666a);
    }

    public final String toString() {
        return k.l(new StringBuilder("ResourceColorProvider(resId="), this.f11666a, ')');
    }
}
