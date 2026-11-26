package nk;

import com.google.android.gms.internal.measurement.x5;
import i2.l;
import i2.t;

public final class a {

    public final float f11369a;

    public final long f11370b;

    public final long f11371c;

    public final float f11372d;

    public final int f11373e;

    static {
        new a(0.0f, 0.0f, 31);
    }

    public a(float f3, float f10, int i10) {
        f3 = (i10 & 1) != 0 ? 24.0f : f3;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
        long jB = t.b(0.15f, t.f7162b);
        f10 = (i10 & 8) != 0 ? 1.0f : f10;
        this.f11369a = f3;
        this.f11370b = jFloatToRawIntBits;
        this.f11371c = jB;
        this.f11372d = f10;
        this.f11373e = 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (y3.f.b(this.f11369a, aVar.f11369a) && this.f11370b == aVar.f11370b && t.c(this.f11371c, aVar.f11371c) && Float.compare(this.f11372d, aVar.f11372d) == 0 && this.f11373e == aVar.f11373e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iF = w.c.f(Float.hashCode(this.f11369a) * 31, this.f11370b, 31);
        int i10 = t.f7168h;
        return Integer.hashCode(this.f11373e) + w.c.c(this.f11372d, w.c.f(iF, this.f11371c, 31), 31);
    }

    public final String toString() {
        String strC = y3.f.c(this.f11369a);
        String strC2 = y3.g.c(this.f11370b);
        String strI = t.i(this.f11371c);
        String strA = l.a(this.f11373e);
        StringBuilder sbS = a1.b.s("InnerShadow(radius=", strC, ", offset=", strC2, ", color=");
        sbS.append(strI);
        sbS.append(", alpha=");
        sbS.append(this.f11372d);
        sbS.append(", blendMode=");
        return x5.n(sbS, strA, ")");
    }
}
