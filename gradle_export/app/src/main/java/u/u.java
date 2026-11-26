package u;

public final class u {

    public long[] f14897a;

    public int[] f14898b;

    public int[] f14899c;

    public int f14900d;

    public int f14901e;

    public int f14902f;

    public u() {
        this(6);
    }

    public u(int i10) {
        this.f14897a = q0.f14885a;
        int[] iArr = n.f14878a;
        this.f14898b = iArr;
        this.f14899c = iArr;
        if (i10 >= 0) {
            e(q0.d(i10));
        } else {
            v.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f14901e = 0;
        long[] jArr = this.f14897a;
        if (jArr != q0.f14885a) {
            h00.n.B0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f14897a;
            int i10 = this.f14900d;
            int i11 = i10 >> 3;
            long j9 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j9)) | j9;
        }
        this.f14902f = q0.a(this.f14900d) - this.f14901e;
    }

    public final int b(int i10) {
        int i11 = this.f14900d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f14897a;
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

    public final int c(int i10) {
        int iHashCode = Integer.hashCode(i10) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f14900d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f14897a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j9 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = (((long) i12) * 72340172838076673L) ^ j9;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i14) & i13;
                if (this.f14898b[iNumberOfTrailingZeros] == i10) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j9 & ((~j9) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
    }

    public final int d(int i10, int i11) {
        int iC = c(i10);
        return iC >= 0 ? this.f14899c[iC] : i11;
    }

    public final void e(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, q0.c(i10)) : 0;
        this.f14900d = iMax;
        if (iMax == 0) {
            jArr = q0.f14885a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            h00.n.B0(jArr, -9187201950435737472L);
        }
        this.f14897a = jArr;
        int i11 = iMax >> 3;
        long j9 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j9)) | j9;
        this.f14902f = q0.a(this.f14900d) - this.f14901e;
        this.f14898b = new int[iMax];
        this.f14899c = new int[iMax];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (uVar.f14901e != this.f14901e) {
            return false;
        }
        int[] iArr = this.f14898b;
        int[] iArr2 = this.f14899c;
        long[] jArr = this.f14897a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            loop0: while (true) {
                long j9 = jArr[i10];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j9) < 128) {
                            int i13 = (i10 << 3) + i12;
                            int i14 = iArr[i13];
                            int i15 = iArr2[i13];
                            int iC = uVar.c(i14);
                            if (iC < 0 || i15 != uVar.f14899c[iC]) {
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

    public final void f(int i10, int i11) {
        long j9;
        long j10;
        int i12;
        int i13;
        long j11;
        int iNumberOfTrailingZeros;
        long[] jArr;
        int[] iArr;
        int[] iArr2;
        int i14 = i10;
        int i15 = -862048943;
        int iHashCode = Integer.hashCode(i14) * (-862048943);
        int i16 = iHashCode ^ (iHashCode << 16);
        int i17 = i16 >>> 7;
        int i18 = i16 & 127;
        int i19 = this.f14900d;
        int i20 = i17 & i19;
        int i21 = 0;
        loop0: while (true) {
            long[] jArr2 = this.f14897a;
            int i22 = i20 >> 3;
            int i23 = (i20 & 7) << 3;
            int i24 = 1;
            int i25 = i21;
            int i26 = 0;
            long j12 = (((-i23) >> 63) & (jArr2[i22 + 1] << (64 - i23))) | (jArr2[i22] >>> i23);
            long j13 = i18;
            long j14 = j12 ^ (j13 * 72340172838076673L);
            long j15 = (j14 - 72340172838076673L) & (~j14) & (-9187201950435737472L);
            while (j15 != 0) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i20) & i19;
                int i27 = i15;
                if (this.f14898b[iNumberOfTrailingZeros] == i14) {
                    break loop0;
                }
                j15 &= j15 - 1;
                i15 = i27;
            }
            int i28 = i15;
            if ((j12 & ((~j12) << 6) & (-9187201950435737472L)) != 0) {
                int iB = b(i17);
                long j16 = 255;
                if (this.f14902f != 0 || ((this.f14897a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    j9 = j13;
                    j10 = 255;
                    i12 = 1;
                    i13 = 0;
                    j11 = 128;
                } else {
                    int i29 = this.f14900d;
                    if (i29 > 8) {
                        j11 = 128;
                        if (Long.compareUnsigned(((long) this.f14901e) * 32, ((long) i29) * 25) <= 0) {
                            long[] jArr3 = this.f14897a;
                            int i30 = this.f14900d;
                            int[] iArr3 = this.f14898b;
                            int[] iArr4 = this.f14899c;
                            int i31 = (i30 + 7) >> 3;
                            int i32 = 0;
                            while (i32 < i31) {
                                long j17 = jArr3[i32] & (-9187201950435737472L);
                                jArr3[i32] = (-72340172838076674L) & ((~j17) + (j17 >>> 7));
                                i32++;
                                j16 = j16;
                                j13 = j13;
                            }
                            j9 = j13;
                            j10 = j16;
                            char c10 = 7;
                            int iG0 = h00.n.G0(jArr3);
                            int i33 = iG0 - 1;
                            jArr3[i33] = (jArr3[i33] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iG0] = jArr3[0];
                            int i34 = 0;
                            while (i34 != i30) {
                                int i35 = i34 >> 3;
                                int i36 = (i34 & 7) << 3;
                                long j18 = (jArr3[i35] >> i36) & j10;
                                if (j18 != 128 && j18 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr3[i34]) * i28;
                                    int i37 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i38 = i37 >>> 7;
                                    int iB2 = b(i38);
                                    int i39 = i38 & i30;
                                    char c11 = c10;
                                    if (((iB2 - i39) & i30) / 8 == ((i34 - i39) & i30) / 8) {
                                        int i40 = i26;
                                        jArr3[i35] = (((long) (i37 & 127)) << i36) | (jArr3[i35] & (~(j10 << i36)));
                                        jArr3[jArr3.length - 1] = (jArr3[i40] & 72057594037927935L) | Long.MIN_VALUE;
                                        i34++;
                                        i24 = i24;
                                        c10 = c11;
                                        i26 = i40;
                                    } else {
                                        int i41 = i24;
                                        int i42 = i26;
                                        int i43 = iB2 >> 3;
                                        long j19 = jArr3[i43];
                                        int i44 = (iB2 & 7) << 3;
                                        if (((j19 >> i44) & j10) == 128) {
                                            iArr = iArr3;
                                            iArr2 = iArr4;
                                            jArr3[i43] = ((~(j10 << i44)) & j19) | (((long) (i37 & 127)) << i44);
                                            jArr3[i35] = (jArr3[i35] & (~(j10 << i36))) | (128 << i36);
                                            iArr[iB2] = iArr[i34];
                                            iArr[i34] = i42;
                                            iArr2[iB2] = iArr2[i34];
                                            iArr2[i34] = i42;
                                        } else {
                                            iArr = iArr3;
                                            iArr2 = iArr4;
                                            jArr3[i43] = (((long) (i37 & 127)) << i44) | ((~(j10 << i44)) & j19);
                                            int i45 = iArr[iB2];
                                            iArr[iB2] = iArr[i34];
                                            iArr[i34] = i45;
                                            int i46 = iArr2[iB2];
                                            iArr2[iB2] = iArr2[i34];
                                            iArr2[i34] = i46;
                                            i34--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[i42] & 72057594037927935L) | Long.MIN_VALUE;
                                        i34++;
                                        i24 = i41;
                                        c10 = c11;
                                        i26 = i42;
                                        iArr3 = iArr;
                                        iArr4 = iArr2;
                                    }
                                } else {
                                    i34++;
                                }
                            }
                            i12 = i24;
                            i13 = i26;
                            this.f14902f = q0.a(this.f14900d) - this.f14901e;
                        }
                        iB = b(i17);
                    } else {
                        j11 = 128;
                    }
                    j9 = j13;
                    j10 = 255;
                    i12 = 1;
                    i13 = 0;
                    int iB3 = q0.b(this.f14900d);
                    long[] jArr4 = this.f14897a;
                    int[] iArr5 = this.f14898b;
                    int[] iArr6 = this.f14899c;
                    int i47 = this.f14900d;
                    e(iB3);
                    long[] jArr5 = this.f14897a;
                    int[] iArr7 = this.f14898b;
                    int[] iArr8 = this.f14899c;
                    int i48 = this.f14900d;
                    int i49 = 0;
                    while (i49 < i47) {
                        if (((jArr4[i49 >> 3] >> ((i49 & 7) << 3)) & 255) < j11) {
                            int i50 = iArr5[i49];
                            int iHashCode3 = Integer.hashCode(i50) * i28;
                            int i51 = iHashCode3 ^ (iHashCode3 << 16);
                            int iB4 = b(i51 >>> 7);
                            jArr = jArr5;
                            long j20 = i51 & 127;
                            int i52 = iB4 >> 3;
                            int i53 = (iB4 & 7) << 3;
                            long j21 = (jArr[i52] & (~(255 << i53))) | (j20 << i53);
                            jArr[i52] = j21;
                            jArr[(((iB4 - 7) & i48) + (i48 & 7)) >> 3] = j21;
                            iArr7[iB4] = i50;
                            iArr8[iB4] = iArr6[i49];
                        } else {
                            jArr = jArr5;
                        }
                        i49++;
                        jArr5 = jArr;
                    }
                    iB = b(i17);
                }
                this.f14901e++;
                int i54 = this.f14902f;
                long[] jArr6 = this.f14897a;
                int i55 = iB >> 3;
                long j22 = jArr6[i55];
                int i56 = (iB & 7) << 3;
                if (((j22 >> i56) & j10) == j11) {
                    i13 = i12;
                }
                this.f14902f = i54 - i13;
                int i57 = this.f14900d;
                long j23 = (j22 & (~(j10 << i56))) | (j9 << i56);
                jArr6[i55] = j23;
                jArr6[(((iB - 7) & i57) + (i57 & 7)) >> 3] = j23;
                iNumberOfTrailingZeros = ~iB;
                break;
            }
            i21 = i25 + 8;
            i20 = (i20 + i21) & i19;
            i14 = i10;
            i15 = i28;
        }
        if (iNumberOfTrailingZeros < 0) {
            iNumberOfTrailingZeros = ~iNumberOfTrailingZeros;
        }
        this.f14898b[iNumberOfTrailingZeros] = i10;
        this.f14899c[iNumberOfTrailingZeros] = i11;
    }

    public final int hashCode() {
        int[] iArr = this.f14898b;
        int[] iArr2 = this.f14899c;
        long[] jArr = this.f14897a;
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
                        int i13 = (i10 << 3) + i12;
                        int i14 = iArr[i13];
                        iHashCode += Integer.hashCode(iArr2[i13]) ^ Integer.hashCode(i14);
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
        if (this.f14901e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        int[] iArr = this.f14898b;
        int[] iArr2 = this.f14899c;
        long[] jArr = this.f14897a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
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
                            int i14 = (i10 << 3) + i13;
                            int i15 = iArr[i14];
                            int i16 = iArr2[i14];
                            sb2.append(i15);
                            sb2.append("=");
                            sb2.append(i16);
                            i11++;
                            if (i11 < this.f14901e) {
                                sb2.append(", ");
                            }
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
        sb2.append('}');
        String string = sb2.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }
}
