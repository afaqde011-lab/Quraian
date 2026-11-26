package u40;

import kotlin.jvm.internal.m;
import oi.k;

public final class a {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;
    public final float f;
    public final float g;
    public final w40.c h;
    public final int i;

    public a(float f, float f2, float f3, float f4, int i, float f5, float f6, w40.c shape, int i2) {
        m.e(shape, "shape");
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = i;
        this.f = f5;
        this.g = f6;
        this.h = shape;
        this.i = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0 && Float.compare(this.c, aVar.c) == 0 && Float.compare(this.d, aVar.d) == 0 && this.e == aVar.e && Float.compare(this.f, aVar.f) == 0 && Float.compare(this.g, aVar.g) == 0 && m.a(this.h, aVar.h) && this.i == aVar.i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + ((this.h.hashCode() + w.c.c(this.g, w.c.c(this.f, w.c.d(this.e, w.c.c(this.d, w.c.c(this.c, w.c.c(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Particle(x=");
        sb.append(this.a);
        sb.append(", y=");
        sb.append(this.b);
        sb.append(", width=");
        sb.append(this.c);
        sb.append(", height=");
        sb.append(this.d);
        sb.append(", color=");
        sb.append(this.e);
        sb.append(", rotation=");
        sb.append(this.f);
        sb.append(", scaleX=");
        sb.append(this.g);
        sb.append(", shape=");
        sb.append(this.h);
        sb.append(", alpha=");
        return k.l(sb, this.i, ')');
    }
}
