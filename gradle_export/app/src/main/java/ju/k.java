package ju;

import y3.o;
import y3.p;

public final class k {
    public final float a;
    public final float b;
    public final float c;
    public final long d;
    public final long e;
    public final int f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;
    public final float o;
    public final long p;

    public k(float f, float f2, float f3, long j, long j2, int i, float f4, float f5, float f6, float f7, float f8, float f9, float f11, float f12, float f13, long j3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = j;
        this.e = j2;
        this.f = i;
        this.g = f4;
        this.h = f5;
        this.i = f6;
        this.j = f7;
        this.k = f8;
        this.l = f9;
        this.m = f11;
        this.n = f12;
        this.o = f13;
        this.p = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return y3.f.b(this.a, kVar.a) && y3.f.b(this.b, kVar.b) && y3.f.b(this.c, kVar.c) && o.a(this.d, kVar.d) && o.a(this.e, kVar.e) && this.f == kVar.f && y3.f.b(this.g, kVar.g) && y3.f.b(this.h, kVar.h) && y3.f.b(this.i, kVar.i) && y3.f.b(this.j, kVar.j) && y3.f.b(this.k, kVar.k) && y3.f.b(this.l, kVar.l) && y3.f.b(this.m, kVar.m) && y3.f.b(this.n, kVar.n) && y3.f.b(this.o, kVar.o) && o.a(this.p, kVar.p);
    }

    public final int hashCode() {
        int iC = w.c.c(this.c, w.c.c(this.b, Float.hashCode(this.a) * 31, 31), 31);
        p[] pVarArr = o.b;
        return Long.hashCode(this.p) + w.c.c(this.o, w.c.c(this.n, w.c.c(this.m, w.c.c(this.l, w.c.c(this.k, w.c.c(this.j, w.c.c(this.i, w.c.c(this.h, w.c.c(this.g, w.c.d(this.f, w.c.f(w.c.f(iC, this.d, 31), this.e, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strC = y3.f.c(this.a);
        String strC2 = y3.f.c(this.b);
        String strC3 = y3.f.c(this.c);
        String strD = o.d(this.d);
        String strD2 = o.d(this.e);
        String strC4 = y3.f.c(this.g);
        String strC5 = y3.f.c(this.h);
        String strC6 = y3.f.c(this.i);
        String strC7 = y3.f.c(this.j);
        String strC8 = y3.f.c(this.k);
        String strC9 = y3.f.c(this.l);
        String strC10 = y3.f.c(this.m);
        String strC11 = y3.f.c(this.n);
        String strC12 = y3.f.c(this.o);
        String strD3 = o.d(this.p);
        StringBuilder sbS = a1.b.s("RecitersStepMetrics(topPadding=", strC, ", screenHorizontalPadding=", strC2, ", titleHorizontalPadding=");
        a1.b.z(sbS, strC3, ", titleFontSize=", strD, ", titleLineHeight=");
        sbS.append(strD2);
        sbS.append(", titleMaxLines=");
        sbS.append(this.f);
        sbS.append(", afterTitleSpacing=");
        a1.b.z(sbS, strC4, ", searchBarHeight=", strC5, ", selectedRowTopPadding=");
        a1.b.z(sbS, strC6, ", listSectionTopPadding=", strC7, ", listRowSpacing=");
        a1.b.z(sbS, strC8, ", footerHeight=", strC9, ", listContentBottomPadding=");
        a1.b.z(sbS, strC10, ", footerHorizontalPadding=", strC11, ", footerVerticalPadding=");
        return oi.k.m(sbS, strC12, ", reciterNameFontSize=", strD3, ")");
    }
}
