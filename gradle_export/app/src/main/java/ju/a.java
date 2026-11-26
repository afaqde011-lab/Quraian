package ju;

import y3.o;
import y3.p;

public final class a {
    public final float a;
    public final long b;
    public final long c;
    public final int d;
    public final long e;
    public final long f;
    public final float g;
    public final float h;

    public a(float f, long j, long j2, int i, long j3, long j4, float f2, float f3) {
        this.a = f;
        this.b = j;
        this.c = j2;
        this.d = i;
        this.e = j3;
        this.f = j4;
        this.g = f2;
        this.h = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return y3.f.b(this.a, aVar.a) && o.a(this.b, aVar.b) && o.a(this.c, aVar.c) && this.d == aVar.d && o.a(this.e, aVar.e) && o.a(this.f, aVar.f) && y3.f.b(this.g, aVar.g) && y3.f.b(this.h, aVar.h);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.a) * 31;
        p[] pVarArr = o.b;
        return Float.hashCode(this.h) + w.c.c(this.g, w.c.f(w.c.f(w.c.d(this.d, w.c.f(w.c.f(iHashCode, this.b, 31), this.c, 31), 31), this.e, 31), this.f, 31), 31);
    }

    public final String toString() {
        String strC = y3.f.c(this.a);
        String strD = o.d(this.b);
        String strD2 = o.d(this.c);
        String strD3 = o.d(this.e);
        String strD4 = o.d(this.f);
        String strC2 = y3.f.c(this.g);
        String strC3 = y3.f.c(this.h);
        StringBuilder sbS = a1.b.s("DailyMinimumMetrics(horizontalPadding=", strC, ", titleFontSize=", strD, ", titleLineHeight=");
        sbS.append(strD2);
        sbS.append(", titleMaxLines=");
        sbS.append(this.d);
        sbS.append(", timeFontSize=");
        a1.b.z(sbS, strD3, ", timeLineHeight=", strD4, ", stepButtonSize=");
        return oi.k.m(sbS, strC2, ", subtitleBottomPadding=", strC3, ")");
    }
}
