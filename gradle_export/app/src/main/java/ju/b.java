package ju;

import com.google.android.gms.internal.measurement.x5;
import y3.o;
import y3.p;

public final class b {
    public final float a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final float m;

    public b(float f, long j, long j2, float f2, float f3, float f4, float f5, long j3, long j4, long j5, long j6, long j7, float f6) {
        this.a = f;
        this.b = j;
        this.c = j2;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = j3;
        this.i = j4;
        this.j = j5;
        this.k = j6;
        this.l = j7;
        this.m = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return y3.f.b(this.a, bVar.a) && o.a(this.b, bVar.b) && o.a(this.c, bVar.c) && y3.f.b(this.d, bVar.d) && y3.f.b(this.e, bVar.e) && y3.f.b(this.f, bVar.f) && y3.f.b(this.g, bVar.g) && o.a(this.h, bVar.h) && o.a(this.i, bVar.i) && o.a(this.j, bVar.j) && o.a(this.k, bVar.k) && o.a(this.l, bVar.l) && y3.f.b(this.m, bVar.m);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.a) * 31;
        p[] pVarArr = o.b;
        return Float.hashCode(this.m) + w.c.f(w.c.f(w.c.f(w.c.f(w.c.f(w.c.c(this.g, w.c.c(this.f, w.c.c(this.e, w.c.c(this.d, w.c.d(3, w.c.f(w.c.f(iHashCode, this.b, 31), this.c, 31), 31), 31), 31), 31), 31), this.h, 31), this.i, 31), this.j, 31), this.k, 31), this.l, 31);
    }

    public final String toString() {
        String strC = y3.f.c(this.a);
        String strD = o.d(this.b);
        String strD2 = o.d(this.c);
        String strC2 = y3.f.c(this.d);
        String strC3 = y3.f.c(this.e);
        String strC4 = y3.f.c(this.f);
        String strC5 = y3.f.c(this.g);
        String strD3 = o.d(this.h);
        String strD4 = o.d(this.i);
        String strD5 = o.d(this.j);
        String strD6 = o.d(this.k);
        String strD7 = o.d(this.l);
        String strC6 = y3.f.c(this.m);
        StringBuilder sbS = a1.b.s("NotificationsMetrics(horizontalPadding=", strC, ", titleFontSize=", strD, ", titleLineHeight=");
        a1.b.z(sbS, strD2, ", titleMaxLines=3, listTopSpacing=", strC2, ", cardHeight=");
        a1.b.z(sbS, strC3, ", logoSize=", strC4, ", textHorizontalPadding=");
        a1.b.z(sbS, strC5, ", appNameFontSize=", strD3, ", appNameLineHeight=");
        a1.b.z(sbS, strD4, ", timeFontSize=", strD5, ", previewFontSize=");
        a1.b.z(sbS, strD6, ", previewLineHeight=", strD7, ", cardSpacing=");
        return x5.n(sbS, strC6, ")");
    }
}
