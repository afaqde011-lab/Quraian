package e00;

import h00.x;
import java.util.List;

public final class i {
    public static final i e = new i(i2.t.g, x.A, Float.NaN, -1.0f, l.a);
    public final long a;
    public final List b;
    public final float c;
    public final float d;

    public i(long j, List colorEffects, float f, float f2, m fallbackColorEffect) {
        kotlin.jvm.internal.m.e(colorEffects, "colorEffects");
        kotlin.jvm.internal.m.e(fallbackColorEffect, "fallbackColorEffect");
        this.a = j;
        this.b = colorEffects;
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!i2.t.c(this.a, iVar.a) || !kotlin.jvm.internal.m.a(this.b, iVar.b) || !y3.f.b(this.c, iVar.c) || Float.compare(this.d, iVar.d) != 0) {
            return false;
        }
        Object obj2 = l.a;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        int i = i2.t.h;
        return l.a.hashCode() + w.c.c(this.d, w.c.c(this.c, g4.c.a(Long.hashCode(this.a) * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        return "HazeBlurStyle(backgroundColor=" + i2.t.i(this.a) + ", colorEffects=" + this.b + ", blurRadius=" + y3.f.c(this.c) + ", noiseFactor=" + this.d + ", fallbackColorEffect=" + l.a + ")";
    }
}
