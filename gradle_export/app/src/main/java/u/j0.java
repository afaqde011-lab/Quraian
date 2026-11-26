package u;

public final class j0 {

    public long[] f14864a;

    public Object[] f14865b;

    public int f14866c;

    public int f14867d;

    public l0 f14868e;

    public int f14869f;

    public j0() {
        this(6);
    }

    public j0(int i10) {
        this.f14864a = q0.f14885a;
        this.f14865b = v.a.f15306c;
        if (i10 >= 0) {
            f(q0.d(i10));
        } else {
            v.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i10 = this.f14867d;
        this.f14865b[d(obj)] = obj;
        return this.f14867d != i10;
    }

    public final void b() {
        this.f14867d = 0;
        long[] jArr = this.f14864a;
        if (jArr != q0.f14885a) {
            h00.n.B0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f14864a;
            int i10 = this.f14866c;
            int i11 = i10 >> 3;
            long j9 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j9)) | j9;
        }
        h00.n.y0(0, this.f14866c, (Object) null, this.f14865b);
        this.f14869f = q0.a(this.f14866c) - this.f14867d;
    }

    public final boolean c(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f14866c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f14864a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j9 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j10 = (((long) i11) * 72340172838076673L) ^ j9;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i13) & i12;
                if (kotlin.jvm.internal.m.a(this.f14865b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j9 & ((~j9) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final int d(Object obj) {
        long j9;
        long j10;
        long j11;
        long[] jArr;
        Object[] objArr;
        int i10 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = this.f14866c;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr2 = this.f14864a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j12 = ((jArr2[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr2[i17] >>> i18);
            long j13 = i13;
            int i19 = i13;
            long j14 = j12 ^ (j13 * 72340172838076673L);
            long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L);
            while (j15 != 0) {
                int iNumberOfTrailingZeros = (i15 + (Long.numberOfTrailingZeros(j15) >> 3)) & i14;
                int i20 = i10;
                if (kotlin.jvm.internal.m.a(this.f14865b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j15 &= j15 - 1;
                i10 = i20;
            }
            int i21 = i10;
            if ((((~j12) << 6) & j12 & (-9187201950435737472L)) != 0) {
                int iE = e(i12);
                long j16 = 255;
                if (this.f14869f != 0 || ((this.f14864a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j9 = 255;
                    j10 = j13;
                    j11 = 128;
                } else {
                    int i22 = this.f14866c;
                    if (i22 > 8) {
                        int i23 = 8;
                        if (Long.compareUnsigned(((long) this.f14867d) * 32, ((long) i22) * 25) <= 0) {
                            long[] jArr3 = this.f14864a;
                            int i24 = this.f14866c;
                            Object[] objArr2 = this.f14865b;
                            int i25 = (i24 + 7) >> 3;
                            int i26 = 0;
                            j11 = 128;
                            while (i26 < i25) {
                                long j17 = j16;
                                long j18 = jArr3[i26] & (-9187201950435737472L);
                                jArr3[i26] = (-72340172838076674L) & ((~j18) + (j18 >>> 7));
                                i26++;
                                i23 = i23;
                                j13 = j13;
                                j16 = j17;
                            }
                            j9 = j16;
                            j10 = j13;
                            int i27 = i23;
                            int iG0 = h00.n.G0(jArr3);
                            int i28 = iG0 - 1;
                            long j19 = 72057594037927935L;
                            jArr3[i28] = (jArr3[i28] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iG0] = jArr3[0];
                            int i29 = 0;
                            while (i29 != i24) {
                                int i30 = i29 >> 3;
                                int i31 = (i29 & 7) << 3;
                                long j20 = (jArr3[i30] >> i31) & j9;
                                if (j20 != 128 && j20 == 254) {
                                    Object obj2 = objArr2[i29];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i21;
                                    int i32 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i33 = i32 >>> 7;
                                    int iE2 = e(i33);
                                    int i34 = i33 & i24;
                                    if (((iE2 - i34) & i24) / i27 == ((i29 - i34) & i24) / i27) {
                                        long j21 = j19;
                                        jArr3[i30] = (((long) (i32 & 127)) << i31) | ((~(j9 << i31)) & jArr3[i30]);
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j21) | Long.MIN_VALUE;
                                        i29++;
                                        j19 = j21;
                                    } else {
                                        long j22 = j19;
                                        int i35 = iE2 >> 3;
                                        long j23 = jArr3[i35];
                                        int i36 = (iE2 & 7) << 3;
                                        if (((j23 >> i36) & j9) == 128) {
                                            objArr = objArr2;
                                            jArr3[i35] = ((~(j9 << i36)) & j23) | (((long) (i32 & 127)) << i36);
                                            jArr3[i30] = (jArr3[i30] & (~(j9 << i31))) | (128 << i31);
                                            objArr[iE2] = objArr[i29];
                                            objArr[i29] = null;
                                        } else {
                                            objArr = objArr2;
                                            jArr3[i35] = (((long) (i32 & 127)) << i36) | ((~(j9 << i36)) & j23);
                                            Object obj3 = objArr[iE2];
                                            objArr[iE2] = objArr[i29];
                                            objArr[i29] = obj3;
                                            i29--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j22) | Long.MIN_VALUE;
                                        i29++;
                                        j19 = j22;
                                        i27 = i27;
                                        i24 = i24;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i29++;
                                }
                            }
                            this.f14869f = q0.a(this.f14866c) - this.f14867d;
                        }
                        iE = e(i12);
                    }
                    j9 = 255;
                    j10 = j13;
                    j11 = 128;
                    int iB = q0.b(this.f14866c);
                    long[] jArr4 = this.f14864a;
                    Object[] objArr3 = this.f14865b;
                    int i37 = this.f14866c;
                    f(iB);
                    long[] jArr5 = this.f14864a;
                    Object[] objArr4 = this.f14865b;
                    int i38 = this.f14866c;
                    int i39 = 0;
                    while (i39 < i37) {
                        if (((jArr4[i39 >> 3] >> ((i39 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i39];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i21;
                            int i40 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i40 >>> 7);
                            long j24 = i40 & 127;
                            int i41 = iE3 >> 3;
                            int i42 = (iE3 & 7) << 3;
                            jArr = jArr5;
                            long j25 = (jArr5[i41] & (~(255 << i42))) | (j24 << i42);
                            jArr[i41] = j25;
                            jArr[(((iE3 - 7) & i38) + (i38 & 7)) >> 3] = j25;
                            objArr4[iE3] = obj4;
                        } else {
                            jArr = jArr5;
                        }
                        i39++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iE = e(i12);
                }
                this.f14867d++;
                int i43 = this.f14869f;
                long[] jArr6 = this.f14864a;
                int i44 = iE >> 3;
                long j26 = jArr6[i44];
                int i45 = (iE & 7) << 3;
                this.f14869f = i43 - (((j26 >> i45) & j9) == j11 ? 1 : 0);
                int i46 = this.f14866c;
                long j27 = (j26 & (~(j9 << i45))) | (j10 << i45);
                jArr6[i44] = j27;
                jArr6[(((iE - 7) & i46) + (i46 & 7)) >> 3] = j27;
                return iE;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
            i13 = i19;
            i10 = i21;
        }
    }

    public final int e(int i10) {
        int i11 = this.f14866c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f14864a;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (j0Var.f14867d != this.f14867d) {
            return false;
        }
        Object[] objArr = this.f14865b;
        long[] jArr = this.f14864a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j9 = jArr[i10];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j9) < 128 && !j0Var.c(objArr[(i10 << 3) + i12])) {
                            return false;
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
        }
        return true;
    }

    public final void f(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, q0.c(i10)) : 0;
        this.f14866c = iMax;
        if (iMax == 0) {
            jArr = q0.f14885a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            h00.n.B0(jArr, -9187201950435737472L);
        }
        this.f14864a = jArr;
        int i11 = iMax >> 3;
        long j9 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j9)) | j9;
        this.f14869f = q0.a(this.f14866c) - this.f14867d;
        this.f14865b = iMax == 0 ? v.a.f15306c : new Object[iMax];
    }

    public final boolean g() {
        return this.f14867d == 0;
    }

    public final boolean h() {
        return this.f14867d != 0;
    }

    public final int hashCode() {
        Object[] objArr = this.f14865b;
        long[] jArr = this.f14864a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int iHashCode = 0;
        while (true) {
            long j9 = jArr[i10];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j9) < 128) {
                        Object obj = objArr[(i10 << 3) + i12];
                        iHashCode += obj != null ? obj.hashCode() : 0;
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

    public final void i(Object obj) {
        int iNumberOfTrailingZeros;
        int i10 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f14866c;
        int i14 = i11 >>> 7;
        loop0: while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f14864a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j9 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = (((long) i12) * 72340172838076673L) ^ j9;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i15) & i13;
                if (kotlin.jvm.internal.m.a(this.f14865b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j9 & ((~j9) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            } else {
                i10 += 8;
                i14 = i15 + i10;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            m(iNumberOfTrailingZeros);
        }
    }

    public final void j(Object obj) {
        this.f14865b[d(obj)] = obj;
    }

    public final void k(j0 j0Var) {
        kotlin.jvm.internal.m.e(j0Var, "elements");
        Object[] objArr = j0Var.f14865b;
        long[] jArr = j0Var.f14864a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j9 = jArr[i10];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j9) < 128) {
                        j(objArr[(i10 << 3) + i12]);
                    }
                    j9 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final boolean l(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f14866c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f14864a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j9 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j10 = (((long) i11) * 72340172838076673L) ^ j9;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i13) & i12;
                if (kotlin.jvm.internal.m.a(this.f14865b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j9 & ((~j9) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        boolean z10 = iNumberOfTrailingZeros >= 0;
        if (z10) {
            m(iNumberOfTrailingZeros);
        }
        return z10;
    }

    public final void m(int i10) {
        this.f14867d--;
        long[] jArr = this.f14864a;
        int i11 = this.f14866c;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j9 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j9;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j9;
        this.f14865b[i10] = null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        Object[] objArr = this.f14865b;
        long[] jArr = this.f14864a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            int i11 = 0;
            loop0: while (true) {
                long j9 = jArr[i10];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j9) < 128) {
                            Object obj = objArr[(i10 << 3) + i13];
                            if (i11 != 0) {
                                sb2.append((CharSequence) ", ");
                            }
                            if (i11 == -1) {
                                sb2.append((CharSequence) "...");
                                break loop0;
                            }
                            sb2.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
                            i11++;
                        }
                        j9 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        sb2.append((CharSequence) "]");
        return sb2.toString();
    }
}
