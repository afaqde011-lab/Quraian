package ju;

import y3.o;
import y3.p;

public final class l {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final long k;
    public final long l;
    public final long m;
    public final long n;
    public final long o;
    public final long p;
    public final long q;
    public final long r;
    public final long s;
    public final float t;

    public l(float f, float f2, float f3, float f4, float f5, int i, float f6, float f7, float f8, float f9, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, float f11) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = i;
        this.g = f6;
        this.h = f7;
        this.i = f8;
        this.j = f9;
        this.k = j;
        this.l = j2;
        this.m = j3;
        this.n = j4;
        this.o = j5;
        this.p = j6;
        this.q = j7;
        this.r = j8;
        this.s = j9;
        this.t = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return y3.f.b(this.a, lVar.a) && y3.f.b(this.b, lVar.b) && y3.f.b(this.c, lVar.c) && y3.f.b(this.d, lVar.d) && y3.f.b(this.e, lVar.e) && this.f == lVar.f && y3.f.b(this.g, lVar.g) && y3.f.b(this.h, lVar.h) && y3.f.b(this.i, lVar.i) && y3.f.b(this.j, lVar.j) && o.a(this.k, lVar.k) && o.a(this.l, lVar.l) && o.a(this.m, lVar.m) && o.a(this.n, lVar.n) && o.a(this.o, lVar.o) && o.a(this.p, lVar.p) && o.a(this.q, lVar.q) && o.a(this.r, lVar.r) && o.a(this.s, lVar.s) && y3.f.b(this.t, lVar.t);
    }

    public final int hashCode() {
        int iC = w.c.c(this.j, w.c.c(this.i, w.c.c(this.h, w.c.c(this.g, w.c.d(this.f, w.c.c(this.e, w.c.c(this.d, w.c.c(this.c, w.c.c(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        p[] pVarArr = o.b;
        return Float.hashCode(this.t) + w.c.f(w.c.f(w.c.f(w.c.f(w.c.f(w.c.f(w.c.f(w.c.f(w.c.f(iC, this.k, 31), this.l, 31), this.m, 31), this.n, 31), this.o, 31), this.p, 31), this.q, 31), this.r, 31), this.s, 31);
    }

    public final String toString() {
        String strC = y3.f.c(this.a);
        String strC2 = y3.f.c(this.b);
        String strC3 = y3.f.c(this.c);
        String strC4 = y3.f.c(this.d);
        String strC5 = y3.f.c(this.e);
        String strC6 = y3.f.c(this.g);
        String strC7 = y3.f.c(this.h);
        String strC8 = y3.f.c(this.i);
        String strC9 = y3.f.c(this.j);
        String strD = o.d(this.k);
        String strD2 = o.d(this.l);
        String strD3 = o.d(this.m);
        String strD4 = o.d(this.n);
        String strD5 = o.d(this.o);
        String strD6 = o.d(this.p);
        String strD7 = o.d(this.q);
        String strD8 = o.d(this.r);
        String strD9 = o.d(this.s);
        String strC10 = y3.f.c(this.t);
        StringBuilder sbS = a1.b.s("SocialProofMetrics(horizontalPadding=", strC, ", headerTopSpacing=", strC2, ", reviewsTitleTopSpacing=");
        a1.b.z(sbS, strC3, ", cardsSpacing=", strC4, ", headerAvatarSize=");
        sbS.append(strC5);
        sbS.append(", cardAvatarSize=");
        sbS.append(this.f);
        sbS.append(", rateIconSize=");
        a1.b.z(sbS, strC6, ", cardCorner=", strC7, ", cardHorizontalPadding=");
        a1.b.z(sbS, strC8, ", cardVerticalPadding=", strC9, ", usersLabelFont=");
        a1.b.z(sbS, strD, ", ratingValueFont=", strD2, ", ratingSubtitleFont=");
        a1.b.z(sbS, strD3, ", reviewsTitleFont=", strD4, ", nameFont=");
        a1.b.z(sbS, strD5, ", countryFont=", strD6, ", starsFont=");
        a1.b.z(sbS, strD7, ", reviewFont=", strD8, ", reviewLineHeight=");
        return oi.k.m(sbS, strD9, ", listSectionTopPadding=", strC10, ")");
    }
}
