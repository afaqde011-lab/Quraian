package n2;

import ab.a0;
import i2.l;
import i2.t;
import y3.f;
import y3.g;

public final class d {

    public final float f11017a;

    public final float f11018b;

    public final long f11019c;

    public final float f11020d;

    public d(float f3, float f10, float f11, long j9) {
        this.f11017a = f3;
        this.f11018b = f10;
        this.f11019c = j9;
        this.f11020d = a0.x(f11, 0.0f, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return f.b(this.f11017a, dVar.f11017a) && f.b(this.f11018b, dVar.f11018b) && this.f11020d == dVar.f11020d && t.c(this.f11019c, dVar.f11019c);
    }

    public final int hashCode() {
        int iD = w.c.d(3, w.c.c(this.f11020d, w.c.f(w.c.c(this.f11018b, Float.hashCode(this.f11017a) * 31, 31), 0L, 31), 31), 31);
        int i10 = t.f7168h;
        return w.c.f(iD, this.f11019c, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Shadow(radius=");
        w.c.r(this.f11017a, sb2, ", spread=");
        sb2.append((Object) f.c(this.f11018b));
        sb2.append(", offset=");
        sb2.append((Object) g.c(0L));
        sb2.append(", alpha=");
        sb2.append(this.f11020d);
        sb2.append(", blendMode=");
        sb2.append((Object) l.a(3));
        sb2.append(", color=");
        sb2.append((Object) t.i(this.f11019c));
        sb2.append(", brush=null)");
        return sb2.toString();
    }
}
