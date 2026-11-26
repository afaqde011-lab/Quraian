package to;

import com.google.android.gms.internal.measurement.x5;

public final class a {
    public final float a;
    public final float b;
    public final float c;

    public a(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return y3.f.b(this.a, aVar.a) && y3.f.b(this.b, aVar.b) && y3.f.b(this.c, aVar.c);
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + w.c.c(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        String strC = y3.f.c(this.a);
        String strC2 = y3.f.c(this.b);
        return x5.n(a1.b.s("AudioStoryCardMetrics(width=", strC, ", coverSide=", strC2, ", skeletonHeight="), y3.f.c(this.c), ")");
    }
}
