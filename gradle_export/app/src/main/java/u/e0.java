package u;

public final class e0 {

    public long[] f14840a;

    public Object[] f14841b;

    public long[] f14842c;

    public int f14843d;

    public int f14844e;

    public int f14845f;

    public final int a(int i10) {
        int i11 = this.f14843d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f14840a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j9 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j10 = j9 & ((~j9) << 7) & (-9187201950435737472L);
            if (j10 != 0) {
                return (i12 + (Long.numberOfTrailingZeros(j10) >> 3)) & i11;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    public final int b(Object obj) {
        int i10 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f14843d;
        int i14 = i11 >>> 7;
        while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f14840a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j9 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = (((long) i12) * 72340172838076673L) ^ j9;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i15) & i13;
                if (kotlin.jvm.internal.m.a(this.f14841b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j9 & ((~j9) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
    }

    public final void c(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, q0.c(i10)) : 0;
        this.f14843d = iMax;
        if (iMax == 0) {
            jArr = q0.f14885a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            h00.n.B0(jArr, -9187201950435737472L);
        }
        this.f14840a = jArr;
        int i11 = iMax >> 3;
        long j9 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j9)) | j9;
        this.f14845f = q0.a(this.f14843d) - this.f14844e;
        this.f14841b = new Object[iMax];
        this.f14842c = new long[iMax];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (e0Var.f14844e != this.f14844e) {
            return false;
        }
        Object[] objArr = this.f14841b;
        long[] jArr = this.f14842c;
        long[] jArr2 = this.f14840a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i10 = 0;
            loop0: while (true) {
                long j9 = jArr2[i10];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j9) < 128) {
                            int i13 = (i10 << 3) + i12;
                            Object obj2 = objArr[i13];
                            long j10 = jArr[i13];
                            int iB = e0Var.b(obj2);
                            if (iB < 0 || j10 != e0Var.f14842c[iB]) {
                                break loop0;
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 != length) {
                            i10++;
                        }
                    }
                } else if (i10 != length) {
                    i10++;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = this.f14841b;
        long[] jArr = this.f14842c;
        long[] jArr2 = this.f14840a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int iHashCode = 0;
        while (true) {
            long j9 = jArr2[i10];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j9) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(jArr[i13]);
                    }
                    j9 >>= 8;
                }
                if (i11 != 8) {
                    return iHashCode;
                }
            }
            if (i10 == length) {
                return iHashCode;
            }
            i10++;
        }
    }

    public final String toString() {
        int i10;
        int i11;
        if (this.f14844e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        Object[] objArr = this.f14841b;
        long[] jArr = this.f14842c;
        long[] jArr2 = this.f14840a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i12];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((255 & j9) < 128) {
                            int i16 = (i12 << 3) + i15;
                            Object obj = objArr[i16];
                            i11 = i12;
                            long j10 = jArr[i16];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append("=");
                            sb2.append(j10);
                            i13++;
                            if (i13 < this.f14844e) {
                                sb2.append(", ");
                            }
                        } else {
                            i11 = i12;
                        }
                        j9 >>= 8;
                        i15++;
                        i12 = i11;
                    }
                    int i17 = i12;
                    if (i14 != 8) {
                        break;
                    }
                    i10 = i17;
                } else {
                    i10 = i12;
                }
                if (i10 == length) {
                    break;
                }
                i12 = i10 + 1;
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }
}
