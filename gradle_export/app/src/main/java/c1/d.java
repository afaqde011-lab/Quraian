package c1;

import m3.q0;

public final class d {

    public static final gj.e f2598i = new gj.e(6);

    public final int f2599a;

    public final String f2600b;

    public final String f2601c;

    public final long f2602d;

    public final long f2603e;

    public final long f2604f;

    public final boolean f2605g;

    public final b f2606h;

    public d(int i10, String str, String str2, long j9, long j10, long j11, boolean z10, int i11) {
        j11 = (i11 & 32) != 0 ? System.currentTimeMillis() : j11;
        z10 = (i11 & 64) != 0 ? true : z10;
        this.f2599a = i10;
        this.f2600b = str;
        this.f2601c = str2;
        this.f2602d = j9;
        this.f2603e = j10;
        this.f2604f = j11;
        this.f2605g = z10;
        if (str.length() == 0 && str2.length() == 0) {
            throw new IllegalArgumentException("Either pre or post text must not be empty");
        }
        this.f2606h = (str.length() != 0 || str2.length() <= 0) ? (str.length() <= 0 || str2.length() != 0) ? b.C : b.B : b.A;
    }

    public final a a() {
        if (this.f2606h != b.B) {
            return a.D;
        }
        long j9 = this.f2603e;
        if (!q0.d(j9)) {
            return a.D;
        }
        long j10 = this.f2602d;
        if (q0.d(j10)) {
            return ((int) (j10 >> 32)) > ((int) (j9 >> 32)) ? a.A : a.B;
        }
        return (((int) (j10 >> 32)) == ((int) (j9 >> 32)) && ((int) (j10 >> 32)) == this.f2599a) ? a.C : a.D;
    }
}
