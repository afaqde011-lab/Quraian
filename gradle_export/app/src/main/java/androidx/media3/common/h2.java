package androidx.media3.common;

import java.util.Objects;

public final class h2 {

    public static final String f1227h;

    public static final String f1228i;

    public static final String f1229j;

    public static final String f1230k;
    public static final String l;

    public Object f1231a;

    public Object f1232b;

    public int f1233c;

    public long f1234d;

    public long f1235e;

    public boolean f1236f;

    public c f1237g = c.f1128f;

    static {
        String str = e7.i0.f5136a;
        f1227h = Integer.toString(0, 36);
        f1228i = Integer.toString(1, 36);
        f1229j = Integer.toString(2, 36);
        f1230k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
    }

    public final long a(int i10, int i11) {
        a aVarA = this.f1237g.a(i10);
        if (aVarA.f1051b != -1) {
            return aVarA.f1056g[i11];
        }
        return -9223372036854775807L;
    }

    public final int b(long j9) {
        a aVarA;
        int i10;
        c cVar = this.f1237g;
        long j10 = this.f1234d;
        int i11 = cVar.f1134a;
        if (j9 != Long.MIN_VALUE && (j10 == -9223372036854775807L || j9 < j10)) {
            int i12 = cVar.f1137d;
            while (i12 < i11 && ((cVar.a(i12).f1050a != Long.MIN_VALUE && cVar.a(i12).f1050a <= j9) || ((i10 = (aVarA = cVar.a(i12)).f1051b) != -1 && aVarA.a(-1) >= i10))) {
                i12++;
            }
            if (i12 < i11 && (j10 == -9223372036854775807L || cVar.a(i12).f1050a <= j10)) {
                return i12;
            }
        }
        return -1;
    }

    public final int c(long j9) {
        int i10;
        c cVar = this.f1237g;
        long j10 = this.f1234d;
        int i11 = cVar.f1134a;
        int i12 = i11 - 1;
        if (i12 == i11 - 1) {
            a aVarA = cVar.a(i12);
            if (aVarA.l && aVarA.f1050a == Long.MIN_VALUE && aVarA.f1051b == -1) {
                i10 = 1;
            } else {
                i10 = 0;
            }
        } else {
            i10 = 0;
        }
        int i13 = i12 - i10;
        while (i13 >= 0 && j9 != Long.MIN_VALUE) {
            a aVarA2 = cVar.a(i13);
            long j11 = aVarA2.f1050a;
            if (j11 != Long.MIN_VALUE) {
                if (j9 >= j11) {
                    break;
                }
                i13--;
            } else {
                if (j10 != -9223372036854775807L && ((!aVarA2.l || j11 != Long.MIN_VALUE || aVarA2.f1051b != -1) && j9 >= j10)) {
                    break;
                }
                i13--;
            }
        }
        if (i13 >= 0) {
            a aVarA3 = cVar.a(i13);
            int i14 = aVarA3.f1051b;
            if (i14 != -1) {
                for (int i15 = 0; i15 < i14; i15++) {
                    int i16 = aVarA3.f1055f[i15];
                    if (i16 != 0 && i16 != 1) {
                    }
                }
            }
            return i13;
        }
        return -1;
    }

    public final long d(int i10) {
        return this.f1237g.a(i10).f1050a;
    }

    public final int e(int i10, int i11) {
        a aVarA = this.f1237g.a(i10);
        if (aVarA.f1051b != -1) {
            return aVarA.f1055f[i11];
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h2.class.equals(obj.getClass())) {
            h2 h2Var = (h2) obj;
            if (Objects.equals(this.f1231a, h2Var.f1231a) && Objects.equals(this.f1232b, h2Var.f1232b) && this.f1233c == h2Var.f1233c && this.f1234d == h2Var.f1234d && this.f1235e == h2Var.f1235e && this.f1236f == h2Var.f1236f && Objects.equals(this.f1237g, h2Var.f1237g)) {
                return true;
            }
        }
        return false;
    }

    public final int f(int i10) {
        return this.f1237g.a(i10).a(-1);
    }

    public final boolean g(int i10) {
        c cVar = this.f1237g;
        int i11 = cVar.f1134a;
        if (i10 != i11 - 1 || i10 != i11 - 1) {
            return false;
        }
        a aVarA = cVar.a(i10);
        return aVarA.l && aVarA.f1050a == Long.MIN_VALUE && aVarA.f1051b == -1;
    }

    public final boolean h(int i10) {
        return this.f1237g.a(i10).f1060k;
    }

    public final int hashCode() {
        Object obj = this.f1231a;
        int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f1232b;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f1233c) * 31;
        long j9 = this.f1234d;
        int i10 = (iHashCode2 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j10 = this.f1235e;
        return this.f1237g.hashCode() + ((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f1236f ? 1 : 0)) * 31);
    }

    public final void i(Object obj, Object obj2, int i10, long j9, long j10) {
        j(obj, obj2, i10, j9, j10, c.f1128f, false);
    }

    public final void j(Object obj, Object obj2, int i10, long j9, long j10, c cVar, boolean z10) {
        this.f1231a = obj;
        this.f1232b = obj2;
        this.f1233c = i10;
        this.f1234d = j9;
        this.f1235e = j10;
        this.f1237g = cVar;
        this.f1236f = z10;
    }
}
