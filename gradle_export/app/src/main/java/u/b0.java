package u;

public final class b0 {

    public long[] f14825a = q0.f14885a;

    public Object[] f14826b = v.a.f15306c;

    public float[] f14827c = h.f14854a;

    public int f14828d;

    public int f14829e;

    public int f14830f;

    public b0(int i10) {
        if (i10 >= 0) {
            d(q0.d(i10));
        } else {
            v.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int a(int i10) {
        int i11 = this.f14828d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f14825a;
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
        int i13 = this.f14828d;
        int i14 = i11 >>> 7;
        while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f14825a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j9 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = (((long) i12) * 72340172838076673L) ^ j9;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i15) & i13;
                if (kotlin.jvm.internal.m.a(this.f14826b[iNumberOfTrailingZeros], obj)) {
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

    public final float c(Object obj) {
        int iB = b(obj);
        if (iB >= 0) {
            return this.f14827c[iB];
        }
        v.a.e("There is no key " + obj + " in the map");
        throw null;
    }

    public final void d(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, q0.c(i10)) : 0;
        this.f14828d = iMax;
        if (iMax == 0) {
            jArr = q0.f14885a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            h00.n.B0(jArr, -9187201950435737472L);
        }
        this.f14825a = jArr;
        int i11 = iMax >> 3;
        long j9 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j9)) | j9;
        this.f14830f = q0.a(this.f14828d) - this.f14829e;
        this.f14826b = new Object[iMax];
        this.f14827c = new float[iMax];
    }

    public final void e(g00.k kVar, float f3) {
        long j9;
        long j10;
        int i10;
        int i11;
        long j11;
        int iNumberOfTrailingZeros;
        long[] jArr;
        Object[] objArr;
        float[] fArr;
        g00.k kVar2 = kVar;
        int i12 = -862048943;
        int iHashCode = kVar2.hashCode() * (-862048943);
        int i13 = iHashCode ^ (iHashCode << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = this.f14828d;
        int i17 = i14 & i16;
        int i18 = 0;
        loop0: while (true) {
            long[] jArr2 = this.f14825a;
            int i19 = i17 >> 3;
            int i20 = (i17 & 7) << 3;
            int i21 = 1;
            int i22 = i18;
            int i23 = 0;
            long j12 = (((-i20) >> 63) & (jArr2[i19 + 1] << (64 - i20))) | (jArr2[i19] >>> i20);
            long j13 = i15;
            long j14 = j12 ^ (j13 * 72340172838076673L);
            long j15 = (j14 - 72340172838076673L) & (~j14) & (-9187201950435737472L);
            while (j15 != 0) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i17) & i16;
                int i24 = i12;
                if (kotlin.jvm.internal.m.a(this.f14826b[iNumberOfTrailingZeros], kVar2)) {
                    break loop0;
                }
                j15 &= j15 - 1;
                i12 = i24;
            }
            int i25 = i12;
            if ((j12 & ((~j12) << 6) & (-9187201950435737472L)) != 0) {
                int iA = a(i14);
                long j16 = 255;
                if (this.f14830f != 0 || ((this.f14825a[iA >> 3] >> ((iA & 7) << 3)) & 255) == 254) {
                    j9 = j13;
                    j10 = 255;
                    i10 = 1;
                    i11 = 0;
                    j11 = 128;
                } else {
                    int i26 = this.f14828d;
                    if (i26 > 8) {
                        j11 = 128;
                        if (Long.compareUnsigned(((long) this.f14829e) * 32, ((long) i26) * 25) <= 0) {
                            long[] jArr3 = this.f14825a;
                            int i27 = this.f14828d;
                            Object[] objArr2 = this.f14826b;
                            float[] fArr2 = this.f14827c;
                            int i28 = (i27 + 7) >> 3;
                            int i29 = 0;
                            while (i29 < i28) {
                                long j17 = jArr3[i29] & (-9187201950435737472L);
                                jArr3[i29] = (-72340172838076674L) & ((~j17) + (j17 >>> 7));
                                i29++;
                                j16 = j16;
                                j13 = j13;
                            }
                            j9 = j13;
                            j10 = j16;
                            char c10 = 7;
                            int iG0 = h00.n.G0(jArr3);
                            int i30 = iG0 - 1;
                            jArr3[i30] = (jArr3[i30] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iG0] = jArr3[0];
                            int i31 = 0;
                            while (i31 != i27) {
                                int i32 = i31 >> 3;
                                int i33 = (i31 & 7) << 3;
                                long j18 = (jArr3[i32] >> i33) & j10;
                                if (j18 != 128 && j18 == 254) {
                                    Object obj = objArr2[i31];
                                    int iHashCode2 = (obj != null ? obj.hashCode() : i23) * i25;
                                    int i34 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i35 = i34 >>> 7;
                                    int iA2 = a(i35);
                                    int i36 = i35 & i27;
                                    char c11 = c10;
                                    if (((iA2 - i36) & i27) / 8 == ((i31 - i36) & i27) / 8) {
                                        int i37 = i23;
                                        jArr3[i32] = (((long) (i34 & 127)) << i33) | (jArr3[i32] & (~(j10 << i33)));
                                        jArr3[jArr3.length - 1] = (jArr3[i37] & 72057594037927935L) | Long.MIN_VALUE;
                                        i31++;
                                        i21 = i21;
                                        c10 = c11;
                                        i23 = i37;
                                    } else {
                                        int i38 = i21;
                                        int i39 = i23;
                                        int i40 = iA2 >> 3;
                                        long j19 = jArr3[i40];
                                        int i41 = (iA2 & 7) << 3;
                                        if (((j19 >> i41) & j10) == 128) {
                                            objArr = objArr2;
                                            fArr = fArr2;
                                            jArr3[i40] = ((~(j10 << i41)) & j19) | (((long) (i34 & 127)) << i41);
                                            jArr3[i32] = (jArr3[i32] & (~(j10 << i33))) | (128 << i33);
                                            objArr[iA2] = objArr[i31];
                                            objArr[i31] = null;
                                            fArr[iA2] = fArr[i31];
                                            fArr[i31] = 0.0f;
                                        } else {
                                            objArr = objArr2;
                                            fArr = fArr2;
                                            jArr3[i40] = (((long) (i34 & 127)) << i41) | ((~(j10 << i41)) & j19);
                                            Object obj2 = objArr[iA2];
                                            objArr[iA2] = objArr[i31];
                                            objArr[i31] = obj2;
                                            float f10 = fArr[iA2];
                                            fArr[iA2] = fArr[i31];
                                            fArr[i31] = f10;
                                            i31--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[i39] & 72057594037927935L) | Long.MIN_VALUE;
                                        i31++;
                                        i21 = i38;
                                        c10 = c11;
                                        i23 = i39;
                                        objArr2 = objArr;
                                        fArr2 = fArr;
                                    }
                                } else {
                                    i31++;
                                }
                            }
                            i10 = i21;
                            i11 = i23;
                            this.f14830f = q0.a(this.f14828d) - this.f14829e;
                        }
                        iA = a(i14);
                    } else {
                        j11 = 128;
                    }
                    j9 = j13;
                    j10 = 255;
                    i10 = 1;
                    i11 = 0;
                    int iB = q0.b(this.f14828d);
                    long[] jArr4 = this.f14825a;
                    Object[] objArr3 = this.f14826b;
                    float[] fArr3 = this.f14827c;
                    int i42 = this.f14828d;
                    d(iB);
                    long[] jArr5 = this.f14825a;
                    Object[] objArr4 = this.f14826b;
                    float[] fArr4 = this.f14827c;
                    int i43 = this.f14828d;
                    int i44 = 0;
                    while (i44 < i42) {
                        if (((jArr4[i44 >> 3] >> ((i44 & 7) << 3)) & 255) < j11) {
                            Object obj3 = objArr3[i44];
                            int iHashCode3 = (obj3 != null ? obj3.hashCode() : 0) * i25;
                            int i45 = iHashCode3 ^ (iHashCode3 << 16);
                            int iA3 = a(i45 >>> 7);
                            jArr = jArr5;
                            long j20 = i45 & 127;
                            int i46 = iA3 >> 3;
                            int i47 = (iA3 & 7) << 3;
                            long j21 = (jArr[i46] & (~(255 << i47))) | (j20 << i47);
                            jArr[i46] = j21;
                            jArr[(((iA3 - 7) & i43) + (i43 & 7)) >> 3] = j21;
                            objArr4[iA3] = obj3;
                            fArr4[iA3] = fArr3[i44];
                        } else {
                            jArr = jArr5;
                        }
                        i44++;
                        jArr5 = jArr;
                    }
                    iA = a(i14);
                }
                this.f14829e++;
                int i48 = this.f14830f;
                long[] jArr6 = this.f14825a;
                int i49 = iA >> 3;
                long j22 = jArr6[i49];
                int i50 = (iA & 7) << 3;
                if (((j22 >> i50) & j10) == j11) {
                    i11 = i10;
                }
                this.f14830f = i48 - i11;
                int i51 = this.f14828d;
                long j23 = (j22 & (~(j10 << i50))) | (j9 << i50);
                jArr6[i49] = j23;
                jArr6[(((iA - 7) & i51) + (i51 & 7)) >> 3] = j23;
                iNumberOfTrailingZeros = ~iA;
                break;
            }
            i18 = i22 + 8;
            i17 = (i17 + i18) & i16;
            kVar2 = kVar;
            i12 = i25;
        }
        if (iNumberOfTrailingZeros < 0) {
            iNumberOfTrailingZeros = ~iNumberOfTrailingZeros;
        }
        this.f14826b[iNumberOfTrailingZeros] = kVar;
        this.f14827c[iNumberOfTrailingZeros] = f3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (b0Var.f14829e != this.f14829e) {
            return false;
        }
        Object[] objArr = this.f14826b;
        float[] fArr = this.f14827c;
        long[] jArr = this.f14825a;
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
                            float f3 = fArr[i13];
                            int iB = b0Var.b(obj2);
                            if (iB < 0 || f3 != b0Var.f14827c[iB]) {
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
        Object[] objArr = this.f14826b;
        float[] fArr = this.f14827c;
        long[] jArr = this.f14825a;
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
                        iHashCode += Float.hashCode(fArr[i13]) ^ (obj != null ? obj.hashCode() : 0);
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
        if (this.f14829e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        Object[] objArr = this.f14826b;
        float[] fArr = this.f14827c;
        long[] jArr = this.f14825a;
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
                            float f3 = fArr[i14];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append("=");
                            sb2.append(f3);
                            i11++;
                            if (i11 < this.f14829e) {
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
