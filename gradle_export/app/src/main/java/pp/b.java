package pp;

import g1.d6;

public final class b implements d6 {
    public final long a;
    public final long b;
    public final int c;
    public final int d;

    public b(long j, int i, int i2, long j2) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = i2;
    }

    public final boolean a(long j) {
        return this.a <= j && j <= this.b;
    }

    public final boolean b(int i) {
        return this.c <= i && i <= this.d;
    }
}
