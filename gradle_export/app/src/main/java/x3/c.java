package x3;

import i2.t;

public final class c implements o {

    public final long f16402a;

    public c(long j9) {
        this.f16402a = j9;
        if (j9 != 16) {
            return;
        }
        s3.a.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override
    public final long a() {
        return this.f16402a;
    }

    @Override
    public final i2.q b() {
        return null;
    }

    @Override
    public final float c() {
        return t.d(this.f16402a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && t.c(this.f16402a, ((c) obj).f16402a);
    }

    public final int hashCode() {
        int i10 = t.f7168h;
        return Long.hashCode(this.f16402a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) t.i(this.f16402a)) + ')';
    }
}
