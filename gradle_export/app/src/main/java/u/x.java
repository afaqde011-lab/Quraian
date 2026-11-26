package u;

public final class x {

    public long[] f14906a;

    public int[] f14907b;

    public int f14908c;

    public int f14909d;

    public int f14910e;

    public x() {
        this(6);
    }

    public x(int i10) {
        this.f14906a = q0.f14885a;
        this.f14907b = n.f14878a;
        if (i10 >= 0) {
            f(q0.d(i10));
        } else {
            v.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(int i10) {
        int i11 = this.f14909d;
        this.f14907b[d(i10)] = i10;
        return this.f14909d != i11;
    }

    public final void b() {
        this.f14909d = 0;
        long[] jArr = this.f14906a;
        if (jArr != q0.f14885a) {
            h00.n.B0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f14906a;
            int i10 = this.f14908c;
            int i11 = i10 >> 3;
            long j9 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j9)) | j9;
        }
        this.f14910e = q0.a(this.f14908c) - this.f14909d;
    }

    public final boolean c(int i10) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i10) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f14908c;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f14906a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j9 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = (((long) i12) * 72340172838076673L) ^ j9;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i14) & i13;
                if (this.f14907b[iNumberOfTrailingZeros] == i10) {
                    break loop0;
                }
            }
            if ((j9 & ((~j9) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final int d(int i10) {
        long j9;
        long j10;
        int i11;
        long j11;
        long[] jArr;
        int[] iArr;
        int i12;
        int i13 = -862048943;
        int iHashCode = Integer.hashCode(i10) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 >>> 7;
        int i16 = i14 & 127;
        int i17 = this.f14908c;
        int i18 = i15 & i17;
        int i19 = 0;
        while (true) {
            long[] jArr2 = this.f14906a;
            int i20 = i18 >> 3;
            int i21 = (i18 & 7) << 3;
            int i22 = 1;
            long j12 = ((jArr2[i20 + 1] << (64 - i21)) & ((-i21) >> 63)) | (jArr2[i20] >>> i21);
            long j13 = i16;
            int i23 = i19;
            int i24 = 0;
            long j14 = j12 ^ (j13 * 72340172838076673L);
            long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L);
            while (j15 != 0) {
                int iNumberOfTrailingZeros = (i18 + (Long.numberOfTrailingZeros(j15) >> 3)) & i17;
                int i25 = i13;
                int i26 = i24;
                if (this.f14907b[iNumberOfTrailingZeros] == i10) {
                    return iNumberOfTrailingZeros;
                }
                j15 &= j15 - 1;
                i13 = i25;
                i24 = i26;
            }
            int i27 = i13;
            int i28 = i24;
            char c10 = '\b';
            if ((((~j12) << 6) & j12 & (-9187201950435737472L)) != 0) {
                int iE = e(i15);
                long j16 = 255;
                if (this.f14910e != 0 || ((this.f14906a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j9 = 255;
                    j10 = j13;
                    i11 = 1;
                    j11 = 128;
                } else {
                    int i29 = this.f14908c;
                    if (i29 > 8) {
                        j11 = 128;
                        if (Long.compareUnsigned(((long) this.f14909d) * 32, ((long) i29) * 25) <= 0) {
                            long[] jArr3 = this.f14906a;
                            int i30 = this.f14908c;
                            int[] iArr2 = this.f14907b;
                            int i31 = (i30 + 7) >> 3;
                            int i32 = i28;
                            while (i32 < i31) {
                                char c11 = c10;
                                long j17 = jArr3[i32] & (-9187201950435737472L);
                                jArr3[i32] = (-72340172838076674L) & ((~j17) + (j17 >>> 7));
                                i32++;
                                j13 = j13;
                                c10 = c11;
                                j16 = j16;
                            }
                            j9 = j16;
                            j10 = j13;
                            int iG0 = h00.n.G0(jArr3);
                            int i33 = iG0 - 1;
                            long j18 = 72057594037927935L;
                            jArr3[i33] = (jArr3[i33] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iG0] = jArr3[i28];
                            int i34 = i28;
                            while (i34 != i30) {
                                int i35 = i34 >> 3;
                                int i36 = (i34 & 7) << 3;
                                long j19 = (jArr3[i35] >> i36) & j9;
                                if (j19 != 128 && j19 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr2[i34]) * i27;
                                    int i37 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i38 = i37 >>> 7;
                                    int iE2 = e(i38);
                                    int i39 = i38 & i30;
                                    if (((iE2 - i39) & i30) / 8 == ((i34 - i39) & i30) / 8) {
                                        long j20 = j18;
                                        jArr3[i35] = (((long) (i37 & 127)) << i36) | ((~(j9 << i36)) & jArr3[i35]);
                                        jArr3[jArr3.length - i22] = (jArr3[i28] & j20) | Long.MIN_VALUE;
                                        i34++;
                                        j18 = j20;
                                    } else {
                                        long j21 = j18;
                                        int i40 = iE2 >> 3;
                                        long j22 = jArr3[i40];
                                        int i41 = (iE2 & 7) << 3;
                                        if (((j22 >> i41) & j9) == 128) {
                                            iArr = iArr2;
                                            int i42 = i34;
                                            jArr3[i40] = ((~(j9 << i41)) & j22) | (((long) (i37 & 127)) << i41);
                                            jArr3[i35] = (jArr3[i35] & (~(j9 << i36))) | (128 << i36);
                                            iArr[iE2] = iArr[i42];
                                            iArr[i42] = i28;
                                            i12 = i42;
                                        } else {
                                            iArr = iArr2;
                                            int i43 = i34;
                                            jArr3[i40] = (((long) (i37 & 127)) << i41) | ((~(j9 << i41)) & j22);
                                            int i44 = iArr[iE2];
                                            iArr[iE2] = iArr[i43];
                                            iArr[i43] = i44;
                                            i12 = i43 - 1;
                                        }
                                        jArr3[jArr3.length - i22] = (jArr3[i28] & j21) | Long.MIN_VALUE;
                                        i34 = i12 + i22;
                                        i22 = i22;
                                        j18 = j21;
                                        iArr2 = iArr;
                                    }
                                } else {
                                    i34++;
                                }
                            }
                            i11 = i22;
                            this.f14910e = q0.a(this.f14908c) - this.f14909d;
                        }
                        iE = e(i15);
                    } else {
                        j11 = 128;
                    }
                    j9 = 255;
                    j10 = j13;
                    i11 = 1;
                    int iB = q0.b(this.f14908c);
                    long[] jArr4 = this.f14906a;
                    int[] iArr3 = this.f14907b;
                    int i45 = this.f14908c;
                    f(iB);
                    long[] jArr5 = this.f14906a;
                    int[] iArr4 = this.f14907b;
                    int i46 = this.f14908c;
                    int i47 = i28;
                    while (i47 < i45) {
                        if (((jArr4[i47 >> 3] >> ((i47 & 7) << 3)) & 255) < j11) {
                            int i48 = iArr3[i47];
                            int iHashCode3 = Integer.hashCode(i48) * i27;
                            int i49 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i49 >>> 7);
                            long j23 = i49 & 127;
                            int i50 = iE3 >> 3;
                            int i51 = (iE3 & 7) << 3;
                            jArr = jArr5;
                            long j24 = (jArr5[i50] & (~(255 << i51))) | (j23 << i51);
                            jArr[i50] = j24;
                            jArr[(((iE3 - 7) & i46) + (i46 & 7)) >> 3] = j24;
                            iArr4[iE3] = i48;
                        } else {
                            jArr = jArr5;
                        }
                        i47++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iE = e(i15);
                }
                this.f14909d += i11;
                int i52 = this.f14910e;
                long[] jArr6 = this.f14906a;
                int i53 = iE >> 3;
                long j25 = jArr6[i53];
                int i54 = (iE & 7) << 3;
                if (((j25 >> i54) & j9) != j11) {
                    i11 = i28;
                }
                this.f14910e = i52 - i11;
                int i55 = this.f14908c;
                long j26 = (j25 & (~(j9 << i54))) | (j10 << i54);
                jArr6[i53] = j26;
                jArr6[(((iE - 7) & i55) + (i55 & 7)) >> 3] = j26;
                return iE;
            }
            i19 = i23 + 8;
            i18 = (i18 + i19) & i17;
            i13 = i27;
        }
    }

    public final int e(int i10) {
        int i11 = this.f14908c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f14906a;
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
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (xVar.f14909d != this.f14909d) {
            return false;
        }
        int[] iArr = this.f14907b;
        long[] jArr = this.f14906a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j9 = jArr[i10];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j9) < 128 && !xVar.c(iArr[(i10 << 3) + i12])) {
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
        this.f14908c = iMax;
        if (iMax == 0) {
            jArr = q0.f14885a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            h00.n.B0(jArr, -9187201950435737472L);
        }
        this.f14906a = jArr;
        int i11 = iMax >> 3;
        long j9 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j9)) | j9;
        this.f14910e = q0.a(this.f14908c) - this.f14909d;
        this.f14907b = new int[iMax];
    }

    public final boolean g(int i10) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i10) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f14908c;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f14906a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j9 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = (((long) i12) * 72340172838076673L) ^ j9;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i14) & i13;
                if (this.f14907b[iNumberOfTrailingZeros] == i10) {
                    break loop0;
                }
            }
            if ((j9 & ((~j9) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        boolean z10 = iNumberOfTrailingZeros >= 0;
        if (z10) {
            h(iNumberOfTrailingZeros);
        }
        return z10;
    }

    public final void h(int i10) {
        this.f14909d--;
        long[] jArr = this.f14906a;
        int i11 = this.f14908c;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j9 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j9;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j9;
    }

    public final int hashCode() {
        int[] iArr = this.f14907b;
        long[] jArr = this.f14906a;
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
                        iHashCode = Integer.hashCode(iArr[(i10 << 3) + i12]) + iHashCode;
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
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        int[] iArr = this.f14907b;
        long[] jArr = this.f14906a;
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
                            int i14 = iArr[(i10 << 3) + i13];
                            if (i11 != 0) {
                                sb2.append((CharSequence) ", ");
                            }
                            if (i11 == -1) {
                                sb2.append((CharSequence) "...");
                                break loop0;
                            }
                            sb2.append(i14);
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
