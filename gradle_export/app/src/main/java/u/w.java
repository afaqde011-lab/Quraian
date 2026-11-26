package u;

public final class w extends l {

    public int f14905f;

    public w() {
        this(6);
    }

    public w(int i10) {
        this.f14871a = q0.f14885a;
        this.f14872b = n.f14878a;
        this.f14873c = v.a.f15306c;
        if (i10 >= 0) {
            f(q0.d(i10));
        } else {
            v.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void c() {
        this.f14875e = 0;
        long[] jArr = this.f14871a;
        if (jArr != q0.f14885a) {
            h00.n.B0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f14871a;
            int i10 = this.f14874d;
            int i11 = i10 >> 3;
            long j9 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j9)) | j9;
        }
        h00.n.y0(0, this.f14874d, (Object) null, this.f14873c);
        this.f14905f = q0.a(this.f14874d) - this.f14875e;
    }

    public final int d(int i10) {
        long j9;
        long j10;
        int i11;
        long j11;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        int i12 = -862048943;
        int iHashCode = Integer.hashCode(i10) * (-862048943);
        int i13 = iHashCode ^ (iHashCode << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = this.f14874d;
        int i17 = i14 & i16;
        int i18 = 0;
        while (true) {
            long[] jArr2 = this.f14871a;
            int i19 = i17 >> 3;
            int i20 = (i17 & 7) << 3;
            int i21 = 1;
            long j12 = ((jArr2[i19 + 1] << (64 - i20)) & ((-i20) >> 63)) | (jArr2[i19] >>> i20);
            long j13 = i15;
            int i22 = i18;
            int i23 = 0;
            long j14 = j12 ^ (j13 * 72340172838076673L);
            long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L);
            while (j15 != 0) {
                int iNumberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j15) >> 3)) & i16;
                int i24 = i12;
                int i25 = i23;
                if (this.f14872b[iNumberOfTrailingZeros] == i10) {
                    return iNumberOfTrailingZeros;
                }
                j15 &= j15 - 1;
                i12 = i24;
                i23 = i25;
            }
            int i26 = i12;
            int i27 = i23;
            if ((((~j12) << 6) & j12 & (-9187201950435737472L)) != 0) {
                int iE = e(i14);
                long j16 = 255;
                if (this.f14905f != 0 || ((this.f14871a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j9 = 255;
                    j10 = j13;
                    i11 = 1;
                    j11 = 128;
                } else {
                    int i28 = this.f14874d;
                    if (i28 > 8) {
                        j11 = 128;
                        if (Long.compareUnsigned(((long) this.f14875e) * 32, ((long) i28) * 25) <= 0) {
                            long[] jArr3 = this.f14871a;
                            int i29 = this.f14874d;
                            int[] iArr2 = this.f14872b;
                            Object[] objArr2 = this.f14873c;
                            int i30 = (i29 + 7) >> 3;
                            int i31 = i27;
                            while (i31 < i30) {
                                long j17 = j16;
                                long j18 = jArr3[i31] & (-9187201950435737472L);
                                jArr3[i31] = (-72340172838076674L) & ((~j18) + (j18 >>> 7));
                                i31++;
                                j13 = j13;
                                j16 = j17;
                            }
                            j9 = j16;
                            j10 = j13;
                            int iG0 = h00.n.G0(jArr3);
                            int i32 = iG0 - 1;
                            long j19 = 72057594037927935L;
                            jArr3[i32] = (jArr3[i32] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iG0] = jArr3[i27];
                            int i33 = i27;
                            while (i33 != i29) {
                                int i34 = i33 >> 3;
                                int i35 = (i33 & 7) << 3;
                                long j20 = (jArr3[i34] >> i35) & j9;
                                if (j20 != 128 && j20 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr2[i33]) * i26;
                                    int i36 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i37 = i36 >>> 7;
                                    int iE2 = e(i37);
                                    int i38 = i37 & i29;
                                    if (((iE2 - i38) & i29) / 8 == ((i33 - i38) & i29) / 8) {
                                        long j21 = j19;
                                        jArr3[i34] = (((long) (i36 & 127)) << i35) | ((~(j9 << i35)) & jArr3[i34]);
                                        jArr3[jArr3.length - i21] = (jArr3[i27] & j21) | Long.MIN_VALUE;
                                        i33++;
                                        j19 = j21;
                                    } else {
                                        long j22 = j19;
                                        int i39 = iE2 >> 3;
                                        long j23 = jArr3[i39];
                                        int i40 = (iE2 & 7) << 3;
                                        if (((j23 >> i40) & j9) == 128) {
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            jArr3[i39] = ((~(j9 << i40)) & j23) | (((long) (i36 & 127)) << i40);
                                            jArr3[i34] = (jArr3[i34] & (~(j9 << i35))) | (128 << i35);
                                            iArr[iE2] = iArr[i33];
                                            iArr[i33] = i27;
                                            objArr[iE2] = objArr[i33];
                                            objArr[i33] = null;
                                        } else {
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            jArr3[i39] = (((long) (i36 & 127)) << i40) | ((~(j9 << i40)) & j23);
                                            int i41 = iArr[iE2];
                                            iArr[iE2] = iArr[i33];
                                            iArr[i33] = i41;
                                            Object obj = objArr[iE2];
                                            objArr[iE2] = objArr[i33];
                                            objArr[i33] = obj;
                                            i33--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[i27] & j22) | Long.MIN_VALUE;
                                        i33++;
                                        j19 = j22;
                                        i21 = i21;
                                        iArr2 = iArr;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i33++;
                                }
                            }
                            i11 = i21;
                            this.f14905f = q0.a(this.f14874d) - this.f14875e;
                        }
                        iE = e(i14);
                    } else {
                        j11 = 128;
                    }
                    j9 = 255;
                    j10 = j13;
                    i11 = 1;
                    int iB = q0.b(this.f14874d);
                    long[] jArr4 = this.f14871a;
                    int[] iArr3 = this.f14872b;
                    Object[] objArr3 = this.f14873c;
                    int i42 = this.f14874d;
                    f(iB);
                    long[] jArr5 = this.f14871a;
                    int[] iArr4 = this.f14872b;
                    Object[] objArr4 = this.f14873c;
                    int i43 = this.f14874d;
                    int i44 = i27;
                    while (i44 < i42) {
                        if (((jArr4[i44 >> 3] >> ((i44 & 7) << 3)) & 255) < j11) {
                            int i45 = iArr3[i44];
                            int iHashCode3 = Integer.hashCode(i45) * i26;
                            int i46 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i46 >>> 7);
                            long j24 = i46 & 127;
                            int i47 = iE3 >> 3;
                            int i48 = (iE3 & 7) << 3;
                            jArr = jArr5;
                            long j25 = (jArr5[i47] & (~(255 << i48))) | (j24 << i48);
                            jArr[i47] = j25;
                            jArr[(((iE3 - 7) & i43) + (i43 & 7)) >> 3] = j25;
                            iArr4[iE3] = i45;
                            objArr4[iE3] = objArr3[i44];
                        } else {
                            jArr = jArr5;
                        }
                        i44++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iE = e(i14);
                }
                this.f14875e++;
                int i49 = this.f14905f;
                long[] jArr6 = this.f14871a;
                int i50 = iE >> 3;
                long j26 = jArr6[i50];
                int i51 = (iE & 7) << 3;
                if (((j26 >> i51) & j9) != j11) {
                    i11 = i27;
                }
                this.f14905f = i49 - i11;
                int i52 = this.f14874d;
                long j27 = (j26 & (~(j9 << i51))) | (j10 << i51);
                jArr6[i50] = j27;
                jArr6[(((iE - 7) & i52) + (i52 & 7)) >> 3] = j27;
                return iE;
            }
            i18 = i22 + 8;
            i17 = (i17 + i18) & i16;
            i12 = i26;
        }
    }

    public final int e(int i10) {
        int i11 = this.f14874d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f14871a;
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

    public final void f(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, q0.c(i10)) : 0;
        this.f14874d = iMax;
        if (iMax == 0) {
            jArr = q0.f14885a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            h00.n.B0(jArr, -9187201950435737472L);
        }
        this.f14871a = jArr;
        int i11 = iMax >> 3;
        long j9 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j9)) | j9;
        this.f14905f = q0.a(this.f14874d) - this.f14875e;
        this.f14872b = new int[iMax];
        this.f14873c = new Object[iMax];
    }

    public final Object g(int i10) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i10) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f14874d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f14871a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j9 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = (((long) i12) * 72340172838076673L) ^ j9;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i14) & i13;
                if (this.f14872b[iNumberOfTrailingZeros] == i10) {
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
        if (iNumberOfTrailingZeros >= 0) {
            return h(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final Object h(int i10) {
        this.f14875e--;
        long[] jArr = this.f14871a;
        int i11 = this.f14874d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j9 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j9;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j9;
        Object[] objArr = this.f14873c;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    public final void i(int i10, Object obj) {
        int iD = d(i10);
        this.f14872b[iD] = i10;
        this.f14873c[iD] = obj;
    }
}
