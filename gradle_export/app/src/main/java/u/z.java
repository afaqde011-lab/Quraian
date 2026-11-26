package u;

public final class z {

    public long[] f14913a = q0.f14885a;

    public long[] f14914b = p.f14883a;

    public Object[] f14915c = v.a.f15306c;

    public int f14916d;

    public int f14917e;

    public int f14918f;

    public z(int i10) {
        if (i10 >= 0) {
            e(q0.d(i10));
        } else {
            v.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f14917e = 0;
        long[] jArr = this.f14913a;
        if (jArr != q0.f14885a) {
            h00.n.B0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f14913a;
            int i10 = this.f14916d;
            int i11 = i10 >> 3;
            long j9 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j9)) | j9;
        }
        h00.n.y0(0, this.f14916d, (Object) null, this.f14915c);
        this.f14918f = q0.a(this.f14916d) - this.f14917e;
    }

    public final boolean b(long j9) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j9) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f14916d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f14913a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (this.f14914b[iNumberOfTrailingZeros] == j9) {
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

    public final int c(int i10) {
        int i11 = this.f14916d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f14913a;
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

    public final Object d(long j9) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j9) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f14916d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f14913a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (this.f14914b[iNumberOfTrailingZeros] == j9) {
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
        if (iNumberOfTrailingZeros >= 0) {
            return this.f14915c[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final void e(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, q0.c(i10)) : 0;
        this.f14916d = iMax;
        if (iMax == 0) {
            jArr = q0.f14885a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            h00.n.B0(jArr, -9187201950435737472L);
        }
        this.f14913a = jArr;
        int i11 = iMax >> 3;
        long j9 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j9)) | j9;
        this.f14918f = q0.a(this.f14916d) - this.f14917e;
        this.f14914b = new long[iMax];
        this.f14915c = new Object[iMax];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (zVar.f14917e != this.f14917e) {
            return false;
        }
        long[] jArr = this.f14914b;
        Object[] objArr = this.f14915c;
        long[] jArr2 = this.f14913a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j9 = jArr2[i10];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j9) < 128) {
                            int i13 = (i10 << 3) + i12;
                            long j10 = jArr[i13];
                            Object obj2 = objArr[i13];
                            if (obj2 == null) {
                                if (zVar.d(j10) != null || !zVar.b(j10)) {
                                    return false;
                                }
                            } else if (!obj2.equals(zVar.d(j10))) {
                                return false;
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return true;
    }

    public final Object f(long j9) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j9) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f14916d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f14913a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (this.f14914b[iNumberOfTrailingZeros] == j9) {
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
        if (iNumberOfTrailingZeros < 0) {
            return null;
        }
        this.f14917e--;
        long[] jArr2 = this.f14913a;
        int i17 = this.f14916d;
        int i18 = iNumberOfTrailingZeros >> 3;
        int i19 = (iNumberOfTrailingZeros & 7) << 3;
        long j13 = (jArr2[i18] & (~(255 << i19))) | (254 << i19);
        jArr2[i18] = j13;
        jArr2[(((iNumberOfTrailingZeros - 7) & i17) + (i17 & 7)) >> 3] = j13;
        Object[] objArr = this.f14915c;
        Object obj = objArr[iNumberOfTrailingZeros];
        objArr[iNumberOfTrailingZeros] = null;
        return obj;
    }

    public final void g(Object obj, long j9) {
        long j10;
        long j11;
        int i10;
        int i11;
        long j12;
        int iNumberOfTrailingZeros;
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        int i12 = -862048943;
        int iHashCode = Long.hashCode(j9) * (-862048943);
        int i13 = iHashCode ^ (iHashCode << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = this.f14916d;
        int i17 = i14 & i16;
        int i18 = 0;
        loop0: while (true) {
            long[] jArr3 = this.f14913a;
            int i19 = i17 >> 3;
            int i20 = (i17 & 7) << 3;
            int i21 = 1;
            long j13 = ((jArr3[i19 + 1] << (64 - i20)) & ((-i20) >> 63)) | (jArr3[i19] >>> i20);
            long j14 = i15;
            int i22 = i18;
            int i23 = 0;
            long j15 = j13 ^ (j14 * 72340172838076673L);
            long j16 = (~j15) & (j15 - 72340172838076673L) & (-9187201950435737472L);
            while (j16 != 0) {
                iNumberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j16) >> 3)) & i16;
                int i24 = i12;
                if (this.f14914b[iNumberOfTrailingZeros] == j9) {
                    break loop0;
                }
                j16 &= j16 - 1;
                i12 = i24;
            }
            int i25 = i12;
            if ((((~j13) << 6) & j13 & (-9187201950435737472L)) != 0) {
                int iC = c(i14);
                if (this.f14918f != 0 || ((this.f14913a[iC >> 3] >> ((iC & 7) << 3)) & 255) == 254) {
                    j10 = 255;
                    j11 = j14;
                    i10 = 0;
                    i11 = 1;
                    j12 = 128;
                } else {
                    int i26 = this.f14916d;
                    if (i26 > 8) {
                        j12 = 128;
                        if (Long.compareUnsigned(((long) this.f14917e) * 32, ((long) i26) * 25) <= 0) {
                            long[] jArr4 = this.f14913a;
                            int i27 = this.f14916d;
                            long[] jArr5 = this.f14914b;
                            Object[] objArr2 = this.f14915c;
                            int i28 = (i27 + 7) >> 3;
                            j10 = 255;
                            int i29 = 0;
                            while (i29 < i28) {
                                long j17 = jArr4[i29] & (-9187201950435737472L);
                                jArr4[i29] = (-72340172838076674L) & ((~j17) + (j17 >>> 7));
                                i29++;
                                i21 = i21;
                                i23 = i23;
                                j14 = j14;
                            }
                            j11 = j14;
                            i10 = i23;
                            int i30 = i21;
                            char c10 = 7;
                            int iG0 = h00.n.G0(jArr4);
                            int i31 = iG0 - 1;
                            long j18 = 72057594037927935L;
                            jArr4[i31] = (jArr4[i31] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iG0] = jArr4[i10];
                            int i32 = i10;
                            while (i32 != i27) {
                                int i33 = i32 >> 3;
                                int i34 = (i32 & 7) << 3;
                                long j19 = (jArr4[i33] >> i34) & 255;
                                if (j19 != 128 && j19 == 254) {
                                    int iHashCode2 = Long.hashCode(jArr5[i32]) * i25;
                                    int i35 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i36 = i35 >>> 7;
                                    int iC2 = c(i36);
                                    int i37 = i36 & i27;
                                    char c11 = c10;
                                    if (((iC2 - i37) & i27) / 8 == ((i32 - i37) & i27) / 8) {
                                        int i38 = i30;
                                        long j20 = j18;
                                        jArr4[i33] = (((long) (i35 & 127)) << i34) | (jArr4[i33] & (~(255 << i34)));
                                        jArr4[jArr4.length - i38] = (jArr4[i10] & j20) | Long.MIN_VALUE;
                                        i32++;
                                        i30 = i38;
                                        c10 = c11;
                                        j18 = j20;
                                    } else {
                                        int i39 = i30;
                                        long j21 = j18;
                                        int i40 = iC2 >> 3;
                                        long j22 = jArr4[i40];
                                        int i41 = (iC2 & 7) << 3;
                                        if (((j22 >> i41) & 255) == 128) {
                                            jArr2 = jArr5;
                                            objArr = objArr2;
                                            jArr4[i40] = (j22 & (~(255 << i41))) | (((long) (i35 & 127)) << i41);
                                            jArr4[i33] = (jArr4[i33] & (~(255 << i34))) | (128 << i34);
                                            jArr2[iC2] = jArr2[i32];
                                            jArr2[i32] = 0;
                                            objArr[iC2] = objArr[i32];
                                            objArr[i32] = null;
                                        } else {
                                            objArr = objArr2;
                                            jArr2 = jArr5;
                                            jArr4[i40] = (((long) (i35 & 127)) << i41) | (j22 & (~(255 << i41)));
                                            long j23 = jArr2[iC2];
                                            jArr2[iC2] = jArr2[i32];
                                            jArr2[i32] = j23;
                                            Object obj2 = objArr[iC2];
                                            objArr[iC2] = objArr[i32];
                                            objArr[i32] = obj2;
                                            i32--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[i10] & j21) | Long.MIN_VALUE;
                                        i32++;
                                        jArr5 = jArr2;
                                        i30 = i39;
                                        c10 = c11;
                                        j18 = j21;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i32++;
                                }
                            }
                            i11 = i30;
                            this.f14918f = q0.a(this.f14916d) - this.f14917e;
                        }
                        iC = c(i14);
                    } else {
                        j12 = 128;
                    }
                    j10 = 255;
                    j11 = j14;
                    i10 = 0;
                    i11 = 1;
                    int iB = q0.b(this.f14916d);
                    long[] jArr6 = this.f14913a;
                    long[] jArr7 = this.f14914b;
                    Object[] objArr3 = this.f14915c;
                    int i42 = this.f14916d;
                    e(iB);
                    long[] jArr8 = this.f14913a;
                    long[] jArr9 = this.f14914b;
                    Object[] objArr4 = this.f14915c;
                    int i43 = this.f14916d;
                    int i44 = 0;
                    while (i44 < i42) {
                        if (((jArr6[i44 >> 3] >> ((i44 & 7) << 3)) & 255) < j12) {
                            long j24 = jArr7[i44];
                            int iHashCode3 = Long.hashCode(j24) * i25;
                            int i45 = iHashCode3 ^ (iHashCode3 << 16);
                            int iC3 = c(i45 >>> 7);
                            jArr = jArr8;
                            long j25 = i45 & 127;
                            int i46 = iC3 >> 3;
                            int i47 = (iC3 & 7) << 3;
                            long j26 = (jArr[i46] & (~(255 << i47))) | (j25 << i47);
                            jArr[i46] = j26;
                            jArr[(((iC3 - 7) & i43) + (i43 & 7)) >> 3] = j26;
                            jArr9[iC3] = j24;
                            objArr4[iC3] = objArr3[i44];
                        } else {
                            jArr = jArr8;
                        }
                        i44++;
                        jArr6 = jArr6;
                        jArr8 = jArr;
                    }
                    iC = c(i14);
                }
                iNumberOfTrailingZeros = iC;
                this.f14917e++;
                int i48 = this.f14918f;
                long[] jArr10 = this.f14913a;
                int i49 = iNumberOfTrailingZeros >> 3;
                long j27 = jArr10[i49];
                int i50 = (iNumberOfTrailingZeros & 7) << 3;
                if (((j27 >> i50) & j10) != j12) {
                    i11 = i10;
                }
                this.f14918f = i48 - i11;
                int i51 = this.f14916d;
                long j28 = (j27 & (~(j10 << i50))) | (j11 << i50);
                jArr10[i49] = j28;
                jArr10[(((iNumberOfTrailingZeros - 7) & i51) + (i51 & 7)) >> 3] = j28;
                break;
            }
            i18 = i22 + 8;
            i17 = (i17 + i18) & i16;
            i12 = i25;
        }
        this.f14914b[iNumberOfTrailingZeros] = j9;
        this.f14915c[iNumberOfTrailingZeros] = obj;
    }

    public final int hashCode() {
        long[] jArr = this.f14914b;
        Object[] objArr = this.f14915c;
        long[] jArr2 = this.f14913a;
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
                        long j10 = jArr[i13];
                        Object obj = objArr[i13];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j10);
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
        if (this.f14917e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        long[] jArr = this.f14914b;
        Object[] objArr = this.f14915c;
        long[] jArr2 = this.f14913a;
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
                            i11 = i12;
                            long j10 = jArr[i16];
                            Object obj = objArr[i16];
                            sb2.append(j10);
                            sb2.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            i13++;
                            if (i13 < this.f14917e) {
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
