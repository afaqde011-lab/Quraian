package o2;

public final class f {

    public static int f11570k;
    public static final sg.f l = new sg.f();

    public final String f11571a;

    public final float f11572b;

    public final float f11573c;

    public final float f11574d;

    public final float f11575e;

    public final f0 f11576f;

    public final long f11577g;

    public final int f11578h;

    public final boolean f11579i;

    public final int f11580j;

    public f(String str, float f3, float f10, float f11, float f12, f0 f0Var, long j9, int i10, boolean z10) {
        int i11;
        synchronized (l) {
            i11 = f11570k;
            f11570k = i11 + 1;
        }
        this.f11571a = str;
        this.f11572b = f3;
        this.f11573c = f10;
        this.f11574d = f11;
        this.f11575e = f12;
        this.f11576f = f0Var;
        this.f11577g = j9;
        this.f11578h = i10;
        this.f11579i = z10;
        this.f11580j = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.m.a(this.f11571a, fVar.f11571a) && y3.f.b(this.f11572b, fVar.f11572b) && y3.f.b(this.f11573c, fVar.f11573c) && this.f11574d == fVar.f11574d && this.f11575e == fVar.f11575e && this.f11576f.equals(fVar.f11576f) && i2.t.c(this.f11577g, fVar.f11577g) && this.f11578h == fVar.f11578h && this.f11579i == fVar.f11579i;
    }

    public final int hashCode() {
        int iHashCode = (this.f11576f.hashCode() + w.c.c(this.f11575e, w.c.c(this.f11574d, w.c.c(this.f11573c, w.c.c(this.f11572b, this.f11571a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i10 = i2.t.f7168h;
        return Boolean.hashCode(this.f11579i) + w.c.d(this.f11578h, w.c.f(iHashCode, this.f11577g, 31), 31);
    }
}
