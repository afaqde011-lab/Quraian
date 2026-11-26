package nk;

import com.google.android.gms.internal.measurement.x5;
import i2.l;
import i2.t;

public final class f {

    public static final f f11375f = new f(0.0f, 0.0f, 31, 0);

    public final float f11376a;

    public final long f11377b;

    public final long f11378c;

    public final float f11379d;

    public final int f11380e;

    public f(float f3, float f10, int i10, long j9) {
        f3 = (i10 & 1) != 0 ? 24.0f : f3;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f3 / 6.0f)) & 4294967295L);
        j9 = (i10 & 4) != 0 ? t.b(0.1f, t.f7162b) : j9;
        f10 = (i10 & 8) != 0 ? 1.0f : f10;
        this.f11376a = f3;
        this.f11377b = jFloatToRawIntBits;
        this.f11378c = j9;
        this.f11379d = f10;
        this.f11380e = 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (y3.f.b(this.f11376a, fVar.f11376a) && this.f11377b == fVar.f11377b && t.c(this.f11378c, fVar.f11378c) && Float.compare(this.f11379d, fVar.f11379d) == 0 && this.f11380e == fVar.f11380e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iF = w.c.f(Float.hashCode(this.f11376a) * 31, this.f11377b, 31);
        int i10 = t.f7168h;
        return Integer.hashCode(this.f11380e) + w.c.c(this.f11379d, w.c.f(iF, this.f11378c, 31), 31);
    }

    public final String toString() {
        String strC = y3.f.c(this.f11376a);
        String strC2 = y3.g.c(this.f11377b);
        String strI = t.i(this.f11378c);
        String strA = l.a(this.f11380e);
        StringBuilder sbS = a1.b.s("Shadow(radius=", strC, ", offset=", strC2, ", color=");
        sbS.append(strI);
        sbS.append(", alpha=");
        sbS.append(this.f11379d);
        sbS.append(", blendMode=");
        return x5.n(sbS, strA, ")");
    }
}
