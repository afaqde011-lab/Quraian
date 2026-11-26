package u;

public final class a0 {

    public long[] f14820a = q0.f14885a;

    public long[] f14821b = p.f14883a;

    public int f14822c;

    public int f14823d;

    public int f14824e;

    public a0(int i10) {
        if (i10 >= 0) {
            c(q0.d(i10));
        } else {
            v.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(long j9) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j9) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f14822c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f14820a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (this.f14821b[iNumberOfTrailingZeros] == j9) {
                    break loop0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final int b(int i10) {
        int i11 = this.f14822c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f14820a;
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

    public final void c(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, q0.c(i10)) : 0;
        this.f14822c = iMax;
        if (iMax == 0) {
            jArr = q0.f14885a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            h00.n.B0(jArr, -9187201950435737472L);
        }
        this.f14820a = jArr;
        int i11 = iMax >> 3;
        long j9 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j9)) | j9;
        this.f14824e = q0.a(this.f14822c) - this.f14823d;
        this.f14821b = new long[iMax];
    }

    public final void d(long j9) {
        long j10;
        long j11;
        int i10;
        int i11;
        long j12;
        int iNumberOfTrailingZeros;
        long[] jArr;
        int i12;
        int i13 = -862048943;
        int iHashCode = Long.hashCode(j9) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 >>> 7;
        int i16 = i14 & 127;
        int i17 = this.f14822c;
        int i18 = i15 & i17;
        int i19 = 0;
        loop0: while (true) {
            long[] jArr2 = this.f14820a;
            int i20 = i18 >> 3;
            int i21 = (i18 & 7) << 3;
            int i22 = 1;
            long j13 = ((jArr2[i20 + 1] << (64 - i21)) & ((-i21) >> 63)) | (jArr2[i20] >>> i21);
            long j14 = i16;
            int i23 = i19;
            int i24 = 0;
            long j15 = j13 ^ (j14 * 72340172838076673L);
            long j16 = (~j15) & (j15 - 72340172838076673L) & (-9187201950435737472L);
            while (j16 != 0) {
                iNumberOfTrailingZeros = (i18 + (Long.numberOfTrailingZeros(j16) >> 3)) & i17;
                int i25 = i13;
                if (this.f14821b[iNumberOfTrailingZeros] == j9) {
                    break loop0;
                }
                j16 &= j16 - 1;
                i13 = i25;
            }
            int i26 = i13;
            if ((((~j13) << 6) & j13 & (-9187201950435737472L)) != 0) {
                int iB = b(i15);
                long j17 = 255;
                if (this.f14824e != 0 || ((this.f14820a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    j10 = 255;
                    j11 = j14;
                    i10 = 0;
                    i11 = 1;
                    j12 = 128;
                } else {
                    int i27 = this.f14822c;
                    if (i27 > 8) {
                        j12 = 128;
                        if (Long.compareUnsigned(((long) this.f14823d) * 32, ((long) i27) * 25) <= 0) {
                            long[] jArr3 = this.f14820a;
                            int i28 = this.f14822c;
                            long[] jArr4 = this.f14821b;
                            int i29 = (i28 + 7) >> 3;
                            int i30 = 0;
                            while (i30 < i29) {
                                long j18 = j17;
                                long j19 = jArr3[i30] & (-9187201950435737472L);
                                jArr3[i30] = (-72340172838076674L) & ((~j19) + (j19 >>> 7));
                                i30++;
                                j14 = j14;
                                j17 = j18;
                            }
                            j10 = j17;
                            j11 = j14;
                            char c10 = 7;
                            int iG0 = h00.n.G0(jArr3);
                            int i31 = iG0 - 1;
                            long j20 = 72057594037927935L;
                            jArr3[i31] = (jArr3[i31] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iG0] = jArr3[0];
                            int i32 = 0;
                            while (i32 != i28) {
                                int i33 = i32 >> 3;
                                int i34 = (i32 & 7) << 3;
                                long j21 = (jArr3[i33] >> i34) & j10;
                                if (j21 != 128 && j21 == 254) {
                                    int iHashCode2 = Long.hashCode(jArr4[i32]) * i26;
                                    int i35 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i36 = i35 >>> 7;
                                    int iB2 = b(i36);
                                    int i37 = i36 & i28;
                                    long j22 = j20;
                                    if (((iB2 - i37) & i28) / 8 == ((i32 - i37) & i28) / 8) {
                                        int i38 = i24;
                                        jArr3[i33] = (((long) (i35 & 127)) << i34) | (jArr3[i33] & (~(j10 << i34)));
                                        jArr3[jArr3.length - i22] = (jArr3[i38] & j22) | Long.MIN_VALUE;
                                        i32++;
                                        c10 = c10;
                                        j20 = j22;
                                        i24 = i38;
                                    } else {
                                        char c11 = c10;
                                        int i39 = i24;
                                        int i40 = iB2 >> 3;
                                        long j23 = jArr3[i40];
                                        int i41 = (iB2 & 7) << 3;
                                        if (((j23 >> i41) & j10) == 128) {
                                            i12 = i22;
                                            jArr3[i40] = (j23 & (~(j10 << i41))) | (((long) (i35 & 127)) << i41);
                                            jArr3[i33] = (jArr3[i33] & (~(j10 << i34))) | (128 << i34);
                                            jArr4[iB2] = jArr4[i32];
                                            jArr4[i32] = 0;
                                        } else {
                                            i12 = i22;
                                            jArr3[i40] = (((long) (i35 & 127)) << i41) | (j23 & (~(j10 << i41)));
                                            long j24 = jArr4[iB2];
                                            jArr4[iB2] = jArr4[i32];
                                            jArr4[i32] = j24;
                                            i32--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[i39] & j22) | Long.MIN_VALUE;
                                        i32++;
                                        c10 = c11;
                                        j20 = j22;
                                        i24 = i39;
                                        i22 = i12;
                                    }
                                } else {
                                    i32++;
                                }
                            }
                            i10 = i24;
                            i11 = i22;
                            this.f14824e = q0.a(this.f14822c) - this.f14823d;
                        }
                        iB = b(i15);
                    } else {
                        j12 = 128;
                    }
                    j10 = 255;
                    j11 = j14;
                    i10 = 0;
                    i11 = 1;
                    int iB3 = q0.b(this.f14822c);
                    long[] jArr5 = this.f14820a;
                    long[] jArr6 = this.f14821b;
                    int i42 = this.f14822c;
                    c(iB3);
                    long[] jArr7 = this.f14820a;
                    long[] jArr8 = this.f14821b;
                    int i43 = this.f14822c;
                    int i44 = 0;
                    while (i44 < i42) {
                        if (((jArr5[i44 >> 3] >> ((i44 & 7) << 3)) & 255) < j12) {
                            long j25 = jArr6[i44];
                            int iHashCode3 = Long.hashCode(j25) * i26;
                            int i45 = iHashCode3 ^ (iHashCode3 << 16);
                            int iB4 = b(i45 >>> 7);
                            long j26 = i45 & 127;
                            int i46 = iB4 >> 3;
                            int i47 = (iB4 & 7) << 3;
                            jArr = jArr7;
                            long j27 = (jArr7[i46] & (~(255 << i47))) | (j26 << i47);
                            jArr[i46] = j27;
                            jArr[(((iB4 - 7) & i43) + (i43 & 7)) >> 3] = j27;
                            jArr8[iB4] = j25;
                        } else {
                            jArr = jArr7;
                        }
                        i44++;
                        jArr5 = jArr5;
                        jArr7 = jArr;
                    }
                    iB = b(i15);
                }
                iNumberOfTrailingZeros = iB;
                this.f14823d++;
                int i48 = this.f14824e;
                long[] jArr9 = this.f14820a;
                int i49 = iNumberOfTrailingZeros >> 3;
                long j28 = jArr9[i49];
                int i50 = (iNumberOfTrailingZeros & 7) << 3;
                if (((j28 >> i50) & j10) == j12) {
                    i10 = i11;
                }
                this.f14824e = i48 - i10;
                int i51 = this.f14822c;
                long j29 = (j28 & (~(j10 << i50))) | (j11 << i50);
                jArr9[i49] = j29;
                jArr9[(((iNumberOfTrailingZeros - 7) & i51) + (i51 & 7)) >> 3] = j29;
                break;
            }
            i19 = i23 + 8;
            i18 = (i18 + i19) & i17;
            i13 = i26;
        }
        this.f14821b[iNumberOfTrailingZeros] = j9;
    }

    public final void e(long j9) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j9) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f14822c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f14820a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (this.f14821b[iNumberOfTrailingZeros] == j9) {
                    break loop0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            } else {
                i14 += 8;
                i13 = (i13 + i14) & i12;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            this.f14823d--;
            long[] jArr2 = this.f14820a;
            int i17 = this.f14822c;
            int i18 = iNumberOfTrailingZeros >> 3;
            int i19 = (iNumberOfTrailingZeros & 7) << 3;
            long j13 = (jArr2[i18] & (~(255 << i19))) | (254 << i19);
            jArr2[i18] = j13;
            jArr2[(((iNumberOfTrailingZeros - 7) & i17) + (i17 & 7)) >> 3] = j13;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (a0Var.f14823d != this.f14823d) {
            return false;
        }
        long[] jArr = this.f14821b;
        long[] jArr2 = this.f14820a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j9 = jArr2[i10];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j9) < 128 && !a0Var.a(jArr[(i10 << 3) + i12])) {
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

    public final int hashCode() {
        long[] jArr = this.f14821b;
        long[] jArr2 = this.f14820a;
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
                        iHashCode = Long.hashCode(jArr[(i10 << 3) + i12]) + iHashCode;
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
        long[] jArr = this.f14821b;
        long[] jArr2 = this.f14820a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i10 = 0;
            int i11 = 0;
            loop0: while (true) {
                long j9 = jArr2[i10];
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
                            long j10 = jArr[(i10 << 3) + i13];
                            if (i11 != 0) {
                                sb2.append((CharSequence) ", ");
                            }
                            if (i11 == -1) {
                                sb2.append((CharSequence) "...");
                                break loop0;
                            }
                            sb2.append(j10);
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
