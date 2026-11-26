package y3;

public final class a {

    public final long f16587a;

    public a(long j9) {
        this.f16587a = j9;
    }

    public static long a(long j9, int i10, int i11, int i12, int i13, int i14) {
        if ((i14 & 1) != 0) {
            i10 = j(j9);
        }
        if ((i14 & 2) != 0) {
            i11 = h(j9);
        }
        if ((i14 & 4) != 0) {
            i12 = i(j9);
        }
        if ((i14 & 8) != 0) {
            i13 = g(j9);
        }
        if (i11 < i10 || i13 < i12 || i10 < 0 || i12 < 0) {
            i.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return b.h(i10, i11, i12, i13);
    }

    public static final boolean b(long j9, long j10) {
        return j9 == j10;
    }

    public static final boolean c(long j9) {
        int i10 = (int) (3 & j9);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        return (((int) (j9 >> (i11 + 46))) & ((1 << (18 - i11)) - 1)) != 0;
    }

    public static final boolean d(long j9) {
        int i10 = (int) (3 & j9);
        return (((int) (j9 >> 33)) & ((1 << (((((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1)) + 13)) - 1)) != 0;
    }

    public static final boolean e(long j9) {
        int i10 = (int) (3 & j9);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        int i12 = (1 << (18 - i11)) - 1;
        int i13 = ((int) (j9 >> (i11 + 15))) & i12;
        int i14 = ((int) (j9 >> (i11 + 46))) & i12;
        return i13 == (i14 == 0 ? Integer.MAX_VALUE : i14 - 1);
    }

    public static final boolean f(long j9) {
        int i10 = (int) (3 & j9);
        int i11 = (1 << (((((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1)) + 13)) - 1;
        int i12 = ((int) (j9 >> 2)) & i11;
        int i13 = ((int) (j9 >> 33)) & i11;
        return i12 == (i13 == 0 ? Integer.MAX_VALUE : i13 - 1);
    }

    public static final int g(long j9) {
        int i10 = (int) (3 & j9);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        int i12 = ((int) (j9 >> (i11 + 46))) & ((1 << (18 - i11)) - 1);
        if (i12 == 0) {
            return Integer.MAX_VALUE;
        }
        return i12 - 1;
    }

    public static final int h(long j9) {
        int i10 = (int) (3 & j9);
        int i11 = (int) (j9 >> 33);
        int i12 = i11 & ((1 << (((((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1)) + 13)) - 1);
        if (i12 == 0) {
            return Integer.MAX_VALUE;
        }
        return i12 - 1;
    }

    public static final int i(long j9) {
        int i10 = (int) (3 & j9);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        return ((int) (j9 >> (i11 + 15))) & ((1 << (18 - i11)) - 1);
    }

    public static final int j(long j9) {
        int i10 = (int) (3 & j9);
        return ((int) (j9 >> 2)) & ((1 << (((((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1)) + 13)) - 1);
    }

    public static String k(long j9) {
        int iH = h(j9);
        String strValueOf = iH == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iH);
        int iG = g(j9);
        String strValueOf2 = iG != Integer.MAX_VALUE ? String.valueOf(iG) : "Infinity";
        StringBuilder sb2 = new StringBuilder("Constraints(minWidth = ");
        sb2.append(j(j9));
        sb2.append(", maxWidth = ");
        sb2.append(strValueOf);
        sb2.append(", minHeight = ");
        sb2.append(i(j9));
        sb2.append(", maxHeight = ");
        return g4.c.k(sb2, strValueOf2, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f16587a == ((a) obj).f16587a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f16587a);
    }

    public final String toString() {
        return k(this.f16587a);
    }
}
