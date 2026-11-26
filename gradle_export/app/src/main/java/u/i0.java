package u;

public final class i0 {

    public long[] f14856a;

    public Object[] f14857b;

    public Object[] f14858c;

    public int f14859d;

    public int f14860e;

    public t f14861f;

    public int f14862g;

    public i0() {
        this(6);
    }

    public i0(int i10) {
        this.f14856a = q0.f14885a;
        Object[] objArr = v.a.f15306c;
        this.f14857b = objArr;
        this.f14858c = objArr;
        if (i10 >= 0) {
            h(q0.d(i10));
        } else {
            v.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f14860e = 0;
        long[] jArr = this.f14856a;
        if (jArr != q0.f14885a) {
            h00.n.B0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f14856a;
            int i10 = this.f14859d;
            int i11 = i10 >> 3;
            long j9 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j9)) | j9;
        }
        h00.n.y0(0, this.f14859d, (Object) null, this.f14858c);
        h00.n.y0(0, this.f14859d, (Object) null, this.f14857b);
        this.f14862g = q0.a(this.f14859d) - this.f14860e;
    }

    public final boolean b(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f14859d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f14856a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j9 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j10 = (((long) i11) * 72340172838076673L) ^ j9;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i13) & i12;
                if (kotlin.jvm.internal.m.a(this.f14857b[iNumberOfTrailingZeros], obj)) {
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

    public final boolean c(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f14859d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f14856a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j9 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j10 = (((long) i11) * 72340172838076673L) ^ j9;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i13) & i12;
                if (kotlin.jvm.internal.m.a(this.f14857b[iNumberOfTrailingZeros], obj)) {
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

    public final boolean d(Object obj) {
        Object[] objArr = this.f14858c;
        long[] jArr = this.f14856a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j9 = jArr[i10];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j9) < 128 && kotlin.jvm.internal.m.a(obj, objArr[(i10 << 3) + i12])) {
                            return true;
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
        return false;
    }

    public final int e(int i10) {
        int i11 = this.f14859d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f14856a;
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
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (i0Var.f14860e != this.f14860e) {
            return false;
        }
        Object[] objArr = this.f14857b;
        Object[] objArr2 = this.f14858c;
        long[] jArr = this.f14856a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j9 = jArr[i10];
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
                            Object obj2 = objArr[i13];
                            Object obj3 = objArr2[i13];
                            if (obj3 == null) {
                                if (i0Var.g(obj2) != null || !i0Var.c(obj2)) {
                                    return false;
                                }
                            } else if (!obj3.equals(i0Var.g(obj2))) {
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

    public final int f(Object obj) {
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
        int i14 = this.f14859d;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr2 = this.f14856a;
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
                if (kotlin.jvm.internal.m.a(this.f14857b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j15 &= j15 - 1;
                i10 = i20;
            }
            int i21 = i10;
            if ((((~j12) << 6) & j12 & (-9187201950435737472L)) != 0) {
                int iE = e(i12);
                long j16 = 255;
                if (this.f14862g != 0 || ((this.f14856a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j9 = 255;
                    j10 = j13;
                    j11 = 128;
                } else {
                    int i22 = this.f14859d;
                    if (i22 > 8) {
                        int i23 = 8;
                        if (Long.compareUnsigned(((long) this.f14860e) * 32, ((long) i22) * 25) <= 0) {
                            long[] jArr3 = this.f14856a;
                            int i24 = this.f14859d;
                            Object[] objArr2 = this.f14857b;
                            Object[] objArr3 = this.f14858c;
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
                            jArr3[i28] = (jArr3[i28] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iG0] = jArr3[0];
                            int i29 = 0;
                            while (i29 != i24) {
                                int i30 = i29 >> 3;
                                int i31 = (i29 & 7) << 3;
                                long j19 = (jArr3[i30] >> i31) & j9;
                                if (j19 != 128 && j19 == 254) {
                                    Object obj2 = objArr2[i29];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i21;
                                    int i32 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i33 = i32 >>> 7;
                                    int iE2 = e(i33);
                                    int i34 = i33 & i24;
                                    if (((iE2 - i34) & i24) / i27 == ((i29 - i34) & i24) / i27) {
                                        jArr3[i30] = (((long) (i32 & 127)) << i31) | (jArr3[i30] & (~(j9 << i31)));
                                        jArr3[jArr3.length - 1] = jArr3[0];
                                        i29++;
                                        i27 = i27;
                                    } else {
                                        int i35 = i27;
                                        int i36 = iE2 >> 3;
                                        long j20 = jArr3[i36];
                                        int i37 = (iE2 & 7) << 3;
                                        if (((j20 >> i37) & j9) == 128) {
                                            objArr = objArr2;
                                            jArr3[i36] = ((~(j9 << i37)) & j20) | (((long) (i32 & 127)) << i37);
                                            jArr3[i30] = (jArr3[i30] & (~(j9 << i31))) | (128 << i31);
                                            objArr[iE2] = objArr[i29];
                                            objArr[i29] = null;
                                            objArr3[iE2] = objArr3[i29];
                                            objArr3[i29] = null;
                                        } else {
                                            objArr = objArr2;
                                            jArr3[i36] = (((long) (i32 & 127)) << i37) | ((~(j9 << i37)) & j20);
                                            Object obj3 = objArr[iE2];
                                            objArr[iE2] = objArr[i29];
                                            objArr[i29] = obj3;
                                            Object obj4 = objArr3[iE2];
                                            objArr3[iE2] = objArr3[i29];
                                            objArr3[i29] = obj4;
                                            i29--;
                                        }
                                        jArr3[jArr3.length - 1] = jArr3[0];
                                        i29++;
                                        i27 = i35;
                                        i24 = i24;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i29++;
                                }
                            }
                            this.f14862g = q0.a(this.f14859d) - this.f14860e;
                        }
                        iE = e(i12);
                    }
                    j9 = 255;
                    j10 = j13;
                    j11 = 128;
                    int iB = q0.b(this.f14859d);
                    long[] jArr4 = this.f14856a;
                    Object[] objArr4 = this.f14857b;
                    Object[] objArr5 = this.f14858c;
                    int i38 = this.f14859d;
                    h(iB);
                    long[] jArr5 = this.f14856a;
                    Object[] objArr6 = this.f14857b;
                    Object[] objArr7 = this.f14858c;
                    int i39 = this.f14859d;
                    int i40 = 0;
                    while (i40 < i38) {
                        if (((jArr4[i40 >> 3] >> ((i40 & 7) << 3)) & 255) < 128) {
                            Object obj5 = objArr4[i40];
                            int iHashCode3 = (obj5 != null ? obj5.hashCode() : 0) * i21;
                            int i41 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i41 >>> 7);
                            jArr = jArr5;
                            long j21 = i41 & 127;
                            int i42 = iE3 >> 3;
                            int i43 = (iE3 & 7) << 3;
                            long j22 = (jArr[i42] & (~(255 << i43))) | (j21 << i43);
                            jArr[i42] = j22;
                            jArr[(((iE3 - 7) & i39) + (i39 & 7)) >> 3] = j22;
                            objArr6[iE3] = obj5;
                            objArr7[iE3] = objArr5[i40];
                        } else {
                            jArr = jArr5;
                        }
                        i40++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iE = e(i12);
                }
                this.f14860e++;
                int i44 = this.f14862g;
                long[] jArr6 = this.f14856a;
                int i45 = iE >> 3;
                long j23 = jArr6[i45];
                int i46 = (iE & 7) << 3;
                this.f14862g = i44 - (((j23 >> i46) & j9) == j11 ? 1 : 0);
                int i47 = this.f14859d;
                long j24 = (j23 & (~(j9 << i46))) | (j10 << i46);
                jArr6[i45] = j24;
                jArr6[(((iE - 7) & i47) + (i47 & 7)) >> 3] = j24;
                return ~iE;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
            i13 = i19;
            i10 = i21;
        }
    }

    public final Object g(Object obj) {
        int iNumberOfTrailingZeros;
        int i10 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f14859d;
        int i14 = i11 >>> 7;
        loop0: while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f14856a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j9 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = (((long) i12) * 72340172838076673L) ^ j9;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i15) & i13;
                if (kotlin.jvm.internal.m.a(this.f14857b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j9 & ((~j9) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.f14858c[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final void h(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, q0.c(i10)) : 0;
        this.f14859d = iMax;
        if (iMax == 0) {
            jArr = q0.f14885a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            h00.n.B0(jArr, -9187201950435737472L);
            int i11 = iMax >> 3;
            long j9 = 255 << ((iMax & 7) << 3);
            jArr[i11] = (jArr[i11] & (~j9)) | j9;
        }
        this.f14856a = jArr;
        this.f14862g = q0.a(this.f14859d) - this.f14860e;
        Object[] objArr = v.a.f15306c;
        this.f14857b = iMax == 0 ? objArr : new Object[iMax];
        if (iMax != 0) {
            objArr = new Object[iMax];
        }
        this.f14858c = objArr;
    }

    public final int hashCode() {
        Object[] objArr = this.f14857b;
        Object[] objArr2 = this.f14858c;
        long[] jArr = this.f14856a;
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
                        Object obj2 = objArr2[i13];
                        iHashCode += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
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

    public final boolean i() {
        return this.f14860e == 0;
    }

    public final boolean j() {
        return this.f14860e != 0;
    }

    public final Object k(Object obj) {
        int iNumberOfTrailingZeros;
        int i10 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f14859d;
        int i14 = i11 >>> 7;
        loop0: while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f14856a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j9 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = (((long) i12) * 72340172838076673L) ^ j9;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i15) & i13;
                if (kotlin.jvm.internal.m.a(this.f14857b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j9 & ((~j9) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return l(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final Object l(int i10) {
        this.f14860e--;
        long[] jArr = this.f14856a;
        int i11 = this.f14859d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j9 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j9;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j9;
        this.f14857b[i10] = null;
        Object[] objArr = this.f14858c;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    public final void m(Object obj, Object obj2) {
        int iF = f(obj);
        if (iF < 0) {
            iF = ~iF;
        }
        this.f14857b[iF] = obj;
        this.f14858c[iF] = obj2;
    }

    public final String toString() {
        if (i()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        Object[] objArr = this.f14857b;
        Object[] objArr2 = this.f14858c;
        long[] jArr = this.f14856a;
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
                            Object obj2 = objArr2[i14];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb2.append(obj2);
                            i11++;
                            if (i11 < this.f14860e) {
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
