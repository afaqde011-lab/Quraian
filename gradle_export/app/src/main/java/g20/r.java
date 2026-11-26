package g20;

public final class r {
    public static final r i = new r(new r(null, 2047), 2012);
    public final boolean a;
    public final boolean b;
    public final r c;
    public final boolean d;
    public final r e;
    public final r f;
    public final boolean g;
    public final boolean h;

    public r(r rVar, int i2) {
        boolean z = (i2 & 1) != 0;
        boolean z2 = (i2 & 2) != 0;
        r rVar2 = (i2 & 32) != 0 ? null : rVar;
        this(z, z2, rVar2, true, rVar2, rVar2, (i2 & 512) == 0, (i2 & 1024) == 0);
    }

    public r(boolean z, boolean z2, r rVar, boolean z3, r rVar2, r rVar3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = rVar;
        this.d = z3;
        this.e = rVar2;
        this.f = rVar3;
        this.g = z4;
        this.h = z5;
    }
}
