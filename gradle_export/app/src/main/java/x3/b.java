package x3;

import i2.r0;
import i2.t;

public final class b implements o {

    public final r0 f16400a;

    public final float f16401b;

    public b(r0 r0Var, float f3) {
        this.f16400a = r0Var;
        this.f16401b = f3;
    }

    @Override
    public final long a() {
        int i10 = t.f7168h;
        return t.f7167g;
    }

    @Override
    public final i2.q b() {
        return this.f16400a;
    }

    @Override
    public final float c() {
        return this.f16401b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.m.a(this.f16400a, bVar.f16400a) && Float.compare(this.f16401b, bVar.f16401b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16401b) + (this.f16400a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BrushStyle(value=");
        sb2.append(this.f16400a);
        sb2.append(", alpha=");
        return w.c.k(sb2, this.f16401b, ')');
    }
}
