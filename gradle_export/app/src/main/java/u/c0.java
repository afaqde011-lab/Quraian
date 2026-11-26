package u;

public final class c0 {

    public long[] f14831a;

    public Object[] f14832b;

    public int[] f14833c;

    public int f14834d;

    public int f14835e;

    public int f14836f;

    public c0() {
        this(6);
    }

    public c0(int i10) {
        this.f14831a = q0.f14885a;
        this.f14832b = v.a.f15306c;
        this.f14833c = n.f14878a;
        if (i10 >= 0) {
            e(q0.d(i10));
        } else {
            v.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f14835e = 0;
        long[] jArr = this.f14831a;
        if (jArr != q0.f14885a) {
            h00.n.B0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f14831a;
            int i10 = this.f14834d;
            int i11 = i10 >> 3;
            long j9 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j9)) | j9;
        }
        h00.n.y0(0, this.f14834d, (Object) null, this.f14832b);
        this.f14836f = q0.a(this.f14834d) - this.f14835e;
    }

    public final int b(int i10) {
        int i11 = this.f14834d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f14831a;
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

    public final int c(Object obj) {
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
        int i14 = this.f14834d;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr2 = this.f14831a;
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
                if (kotlin.jvm.internal.m.a(this.f14832b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j15 &= j15 - 1;
                i10 = i20;
            }
            int i21 = i10;
            if ((((~j12) << 6) & j12 & (-9187201950435737472L)) != 0) {
                int iB = b(i12);
                long j16 = 255;
                if (this.f14836f != 0 || ((this.f14831a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    j9 = 255;
                    j10 = j13;
                    j11 = 128;
                } else {
                    int i22 = this.f14834d;
                    if (i22 > 8) {
                        int i23 = 8;
                        if (Long.compareUnsigned(((long) this.f14835e) * 32, ((long) i22) * 25) <= 0) {
                            long[] jArr3 = this.f14831a;
                            int i24 = this.f14834d;
                            Object[] objArr2 = this.f14832b;
                            int[] iArr = this.f14833c;
                            j11 = 128;
                            int i25 = (i24 + 7) >> 3;
                            int i26 = 0;
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
                                    int iB2 = b(i33);
                                    int i34 = i33 & i24;
                                    long j21 = j19;
                                    if (((iB2 - i34) & i24) / 8 == ((i29 - i34) & i24) / i27) {
                                        jArr3[i30] = (((long) (i32 & 127)) << i31) | (jArr3[i30] & (~(j9 << i31)));
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j21) | Long.MIN_VALUE;
                                        i29++;
                                        i27 = i27;
                                        j19 = j21;
                                    } else {
                                        int i35 = i27;
                                        int i36 = iB2 >> 3;
                                        long j22 = jArr3[i36];
                                        int i37 = (iB2 & 7) << 3;
                                        if (((j22 >> i37) & j9) == 128) {
                                            objArr = objArr2;
                                            jArr3[i36] = ((~(j9 << i37)) & j22) | (((long) (i32 & 127)) << i37);
                                            jArr3[i30] = (jArr3[i30] & (~(j9 << i31))) | (128 << i31);
                                            objArr[iB2] = objArr[i29];
                                            objArr[i29] = null;
                                            iArr[iB2] = iArr[i29];
                                            iArr[i29] = 0;
                                        } else {
                                            objArr = objArr2;
                                            jArr3[i36] = (((long) (i32 & 127)) << i37) | ((~(j9 << i37)) & j22);
                                            Object obj3 = objArr[iB2];
                                            objArr[iB2] = objArr[i29];
                                            objArr[i29] = obj3;
                                            int i38 = iArr[iB2];
                                            iArr[iB2] = iArr[i29];
                                            iArr[i29] = i38;
                                            i29--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j21) | Long.MIN_VALUE;
                                        i29++;
                                        i24 = i24;
                                        i27 = i35;
                                        j19 = j21;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i29++;
                                }
                            }
                            this.f14836f = q0.a(this.f14834d) - this.f14835e;
                        }
                        iB = b(i12);
                    }
                    j9 = 255;
                    j10 = j13;
                    j11 = 128;
                    int iB3 = q0.b(this.f14834d);
                    long[] jArr4 = this.f14831a;
                    Object[] objArr3 = this.f14832b;
                    int[] iArr2 = this.f14833c;
                    int i39 = this.f14834d;
                    e(iB3);
                    long[] jArr5 = this.f14831a;
                    Object[] objArr4 = this.f14832b;
                    int[] iArr3 = this.f14833c;
                    int i40 = this.f14834d;
                    int i41 = 0;
                    while (i41 < i39) {
                        if (((jArr4[i41 >> 3] >> ((i41 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i41];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i21;
                            int i42 = iHashCode3 ^ (iHashCode3 << 16);
                            int iB4 = b(i42 >>> 7);
                            jArr = jArr5;
                            long j23 = i42 & 127;
                            int i43 = iB4 >> 3;
                            int i44 = (iB4 & 7) << 3;
                            long j24 = (jArr[i43] & (~(255 << i44))) | (j23 << i44);
                            jArr[i43] = j24;
                            jArr[(((iB4 - 7) & i40) + (i40 & 7)) >> 3] = j24;
                            objArr4[iB4] = obj4;
                            iArr3[iB4] = iArr2[i41];
                        } else {
                            jArr = jArr5;
                        }
                        i41++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iB = b(i12);
                }
                this.f14835e++;
                int i45 = this.f14836f;
                long[] jArr6 = this.f14831a;
                int i46 = iB >> 3;
                long j25 = jArr6[i46];
                int i47 = (iB & 7) << 3;
                this.f14836f = i45 - (((j25 >> i47) & j9) == j11 ? 1 : 0);
                int i48 = this.f14834d;
                long j26 = (j25 & (~(j9 << i47))) | (j10 << i47);
                jArr6[i46] = j26;
                jArr6[(((iB - 7) & i48) + (i48 & 7)) >> 3] = j26;
                return ~iB;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
            i13 = i19;
            i10 = i21;
        }
    }

    public final int d(Object obj) {
        int i10 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f14834d;
        int i14 = i11 >>> 7;
        while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f14831a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j9 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = (((long) i12) * 72340172838076673L) ^ j9;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i15) & i13;
                if (kotlin.jvm.internal.m.a(this.f14832b[iNumberOfTrailingZeros], obj)) {
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

    public final void e(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, q0.c(i10)) : 0;
        this.f14834d = iMax;
        if (iMax == 0) {
            jArr = q0.f14885a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            h00.n.B0(jArr, -9187201950435737472L);
        }
        this.f14831a = jArr;
        int i11 = iMax >> 3;
        long j9 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j9)) | j9;
        this.f14836f = q0.a(this.f14834d) - this.f14835e;
        this.f14832b = new Object[iMax];
        this.f14833c = new int[iMax];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (c0Var.f14835e != this.f14835e) {
            return false;
        }
        Object[] objArr = this.f14832b;
        int[] iArr = this.f14833c;
        long[] jArr = this.f14831a;
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
                            Object obj2 = objArr[i13];
                            int i14 = iArr[i13];
                            int iD = c0Var.d(obj2);
                            if (iD < 0 || i14 != c0Var.f14833c[iD]) {
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

    public final void f(int i10) {
        this.f14835e--;
        long[] jArr = this.f14831a;
        int i11 = this.f14834d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j9 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j9;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j9;
        this.f14832b[i10] = null;
    }

    public final void g(int i10, Object obj) {
        int iC = c(obj);
        if (iC < 0) {
            iC = ~iC;
        }
        this.f14832b[iC] = obj;
        this.f14833c[iC] = i10;
    }

    public final int hashCode() {
        Object[] objArr = this.f14832b;
        int[] iArr = this.f14833c;
        long[] jArr = this.f14831a;
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
                        Object obj = objArr[i13];
                        iHashCode += Integer.hashCode(iArr[i13]) ^ (obj != null ? obj.hashCode() : 0);
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
        if (this.f14835e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        Object[] objArr = this.f14832b;
        int[] iArr = this.f14833c;
        long[] jArr = this.f14831a;
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
                            Object obj = objArr[i14];
                            int i15 = iArr[i14];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append("=");
                            sb2.append(i15);
                            i11++;
                            if (i11 < this.f14835e) {
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
