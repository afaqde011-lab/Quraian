package wj;

public final class a1 {
    public static final z0 Companion = new z0();

    public final long f16114a;

    public final long f16115b;

    public final long f16116c;

    public a1(int i10, long j9, long j10, long j11) {
        if (1 != (i10 & 1)) {
            p40.o0.g(i10, 1, y0.f16228a.getDescriptor());
            throw null;
        }
        this.f16114a = j9;
        this.f16115b = (i10 & 2) == 0 ? ((long) 1000) * j9 : j10;
        if ((i10 & 4) == 0) {
            this.f16116c = j9 / ((long) 1000);
        } else {
            this.f16116c = j11;
        }
    }

    public a1(long j9) {
        this.f16114a = j9;
        long j10 = 1000;
        this.f16115b = j9 * j10;
        this.f16116c = j9 / j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a1) && this.f16114a == ((a1) obj).f16114a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f16114a);
    }

    public final String toString() {
        return "Time(ms=" + this.f16114a + ')';
    }
}
