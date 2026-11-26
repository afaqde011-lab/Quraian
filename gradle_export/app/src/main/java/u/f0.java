package u;

import java.util.Arrays;
import java.util.Collection;

public final class f0 {

    public long[] f14846a = q0.f14885a;

    public Object[] f14847b = v.a.f15306c;

    public long[] f14848c = r.f14888b;

    public int f14849d = Integer.MAX_VALUE;

    public int f14850e = Integer.MAX_VALUE;

    public int f14851f;

    public int f14852g;

    public int f14853h;

    public f0(int i10) {
        if (i10 >= 0) {
            f(q0.d(i10));
        } else {
            v.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i10 = this.f14852g;
        int iD = d(obj);
        this.f14847b[iD] = obj;
        long[] jArr = this.f14848c;
        int i11 = this.f14849d;
        jArr[iD] = (((long) i11) & 2147483647L) | 4611686016279904256L;
        if (i11 != Integer.MAX_VALUE) {
            jArr[i11] = ((((long) iD) & 2147483647L) << 31) | (jArr[i11] & (-4611686016279904257L));
        }
        this.f14849d = iD;
        if (this.f14850e == Integer.MAX_VALUE) {
            this.f14850e = iD;
        }
        return this.f14852g != i10;
    }

    public final void b() {
        this.f14852g = 0;
        long[] jArr = this.f14846a;
        if (jArr != q0.f14885a) {
            h00.n.B0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f14846a;
            int i10 = this.f14851f;
            int i11 = i10 >> 3;
            long j9 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j9)) | j9;
        }
        h00.n.y0(0, this.f14851f, (Object) null, this.f14847b);
        h00.n.B0(this.f14848c, 4611686018427387903L);
        this.f14849d = Integer.MAX_VALUE;
        this.f14850e = Integer.MAX_VALUE;
        this.f14853h = q0.a(this.f14851f) - this.f14852g;
    }

    public final boolean c(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f14851f;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f14846a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j9 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j10 = (((long) i11) * 72340172838076673L) ^ j9;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i13) & i12;
                if (kotlin.jvm.internal.m.a(this.f14847b[iNumberOfTrailingZeros], obj)) {
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
        int i10;
        long j9;
        long j10;
        long j11;
        char c10;
        long[] jArr;
        int i11 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i12 = iHashCode ^ (iHashCode << 16);
        int i13 = i12 >>> 7;
        int i14 = i12 & 127;
        int i15 = this.f14851f;
        int i16 = i13 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr2 = this.f14846a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j12 = ((jArr2[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr2[i18] >>> i19);
            long j13 = i14;
            long j14 = j12 ^ (j13 * 72340172838076673L);
            long j15 = (j14 - 72340172838076673L) & (~j14) & (-9187201950435737472L);
            while (j15 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i16) & i15;
                int i20 = i11;
                if (kotlin.jvm.internal.m.a(this.f14847b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j15 &= j15 - 1;
                i11 = i20;
            }
            int i21 = i11;
            if ((j12 & ((~j12) << 6) & (-9187201950435737472L)) != 0) {
                int iE = e(i13);
                long j16 = 255;
                if (this.f14853h != 0 || ((this.f14846a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    i10 = 0;
                    j9 = j13;
                    j10 = 255;
                    j11 = 128;
                } else {
                    int i22 = this.f14851f;
                    if (i22 > 8) {
                        c10 = 31;
                        j11 = 128;
                        if (Long.compareUnsigned(((long) this.f14852g) * 32, ((long) i22) * 25) <= 0) {
                            long[] jArr3 = this.f14846a;
                            if (jArr3 == null) {
                                i10 = 0;
                                j9 = j13;
                                j10 = 255;
                            } else {
                                int i23 = this.f14851f;
                                Object[] objArr = this.f14847b;
                                long[] jArr4 = this.f14848c;
                                long[] jArr5 = new long[i23];
                                Arrays.fill(jArr5, 0, i23, 9223372034707292159L);
                                i10 = 0;
                                int i24 = (i23 + 7) >> 3;
                                int i25 = 0;
                                while (i25 < i24) {
                                    long j17 = j16;
                                    long j18 = jArr3[i25] & (-9187201950435737472L);
                                    int i26 = i25;
                                    jArr3[i26] = ((~j18) + (j18 >>> 7)) & (-72340172838076674L);
                                    i25 = i26 + 1;
                                    j16 = j17;
                                }
                                j10 = j16;
                                int length = jArr3.length;
                                int i27 = length - 1;
                                int i28 = length - 2;
                                jArr3[i28] = (jArr3[i28] & 72057594037927935L) | (-72057594037927936L);
                                jArr3[i27] = jArr3[0];
                                int i29 = 0;
                                while (i29 != i23) {
                                    int i30 = i29 >> 3;
                                    int i31 = (i29 & 7) << 3;
                                    long j19 = (jArr3[i30] >> i31) & j10;
                                    if (j19 != 128 && j19 == 254) {
                                        Object obj2 = objArr[i29];
                                        int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i21;
                                        int i32 = iHashCode2 ^ (iHashCode2 << 16);
                                        int i33 = i32 >>> 7;
                                        int iE2 = e(i33);
                                        int i34 = i33 & i23;
                                        if (((iE2 - i34) & i23) / 8 == ((i29 - i34) & i23) / 8) {
                                            int i35 = i23;
                                            Object[] objArr2 = objArr;
                                            jArr3[i30] = (jArr3[i30] & (~(j10 << i31))) | (((long) (i32 & 127)) << i31);
                                            if (jArr5[i29] == 9223372034707292159L) {
                                                long j20 = i29;
                                                jArr5[i29] = j20 | (j20 << 32);
                                            }
                                            jArr3[jArr3.length - 1] = jArr3[0];
                                            i29++;
                                            i23 = i35;
                                            objArr = objArr2;
                                        } else {
                                            int i36 = i23;
                                            Object[] objArr3 = objArr;
                                            int i37 = iE2 >> 3;
                                            long j21 = jArr3[i37];
                                            int i38 = (iE2 & 7) << 3;
                                            if (((j21 >> i38) & j10) == 128) {
                                                jArr3[i37] = (j21 & (~(j10 << i38))) | (((long) (i32 & 127)) << i38);
                                                jArr3[i30] = (jArr3[i30] & (~(j10 << i31))) | (128 << i31);
                                                objArr3[iE2] = objArr3[i29];
                                                objArr3[i29] = null;
                                                jArr4[iE2] = jArr4[i29];
                                                jArr4[i29] = 4611686018427387903L;
                                                int i39 = (int) ((jArr5[i29] >> 32) & 4294967295L);
                                                int i40 = Integer.MAX_VALUE;
                                                if (i39 != Integer.MAX_VALUE) {
                                                    jArr5[i39] = ((long) iE2) | (jArr5[i39] & (-4294967296L));
                                                    jArr5[i29] = (jArr5[i29] & 4294967295L) | (-4294967296L);
                                                    i40 = Integer.MAX_VALUE;
                                                } else {
                                                    jArr5[i29] = (((long) Integer.MAX_VALUE) << 32) | ((long) iE2);
                                                }
                                                jArr5[iE2] = (((long) i29) << 32) | ((long) i40);
                                            } else {
                                                j13 = j13;
                                                jArr3[i37] = (((long) (i32 & 127)) << i38) | (j21 & (~(j10 << i38)));
                                                Object obj3 = objArr3[iE2];
                                                objArr3[iE2] = objArr3[i29];
                                                objArr3[i29] = obj3;
                                                long j22 = jArr4[iE2];
                                                jArr4[iE2] = jArr4[i29];
                                                jArr4[i29] = j22;
                                                int i41 = (int) ((jArr5[i29] >> 32) & 4294967295L);
                                                if (i41 != Integer.MAX_VALUE) {
                                                    long j23 = iE2;
                                                    jArr5[i41] = (jArr5[i41] & (-4294967296L)) | j23;
                                                    jArr5[i29] = (jArr5[i29] & 4294967295L) | (j23 << 32);
                                                } else {
                                                    long j24 = iE2;
                                                    jArr5[i29] = j24 | (j24 << 32);
                                                    i41 = i29;
                                                }
                                                jArr5[iE2] = (((long) i41) << 32) | ((long) i29);
                                                i29--;
                                            }
                                            jArr3[jArr3.length - 1] = jArr3[0];
                                            i29++;
                                            i23 = i36;
                                            objArr = objArr3;
                                            j13 = j13;
                                        }
                                    } else {
                                        i29++;
                                    }
                                }
                                j9 = j13;
                                this.f14853h = q0.a(this.f14851f) - this.f14852g;
                                long[] jArr6 = this.f14848c;
                                int length2 = jArr6.length;
                                for (int i42 = 0; i42 < length2; i42++) {
                                    long j25 = jArr6[i42];
                                    int i43 = (int) ((j25 >> 31) & 2147483647L);
                                    int i44 = (int) (j25 & 2147483647L);
                                    jArr6[i42] = (((j25 & (-4611686018427387904L)) | ((long) (i43 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr5[i43] & 4294967295L)))) << 31) | ((long) (i44 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr5[i44] & 4294967295L)));
                                }
                                int i45 = this.f14849d;
                                if (i45 != Integer.MAX_VALUE) {
                                    this.f14849d = (int) (jArr5[i45] & 4294967295L);
                                }
                                int i46 = this.f14850e;
                                if (i46 != Integer.MAX_VALUE) {
                                    this.f14850e = (int) (jArr5[i46] & 4294967295L);
                                }
                            }
                        }
                        iE = e(i13);
                    } else {
                        c10 = 31;
                        j11 = 128;
                    }
                    i10 = 0;
                    j9 = j13;
                    j10 = 255;
                    int iB = q0.b(this.f14851f);
                    long[] jArr7 = this.f14846a;
                    Object[] objArr4 = this.f14847b;
                    long[] jArr8 = this.f14848c;
                    int i47 = this.f14851f;
                    int[] iArr = new int[i47];
                    f(iB);
                    long[] jArr9 = this.f14846a;
                    Object[] objArr5 = this.f14847b;
                    long[] jArr10 = this.f14848c;
                    int i48 = this.f14851f;
                    int i49 = 0;
                    while (i49 < i47) {
                        if (((jArr7[i49 >> 3] >> ((i49 & 7) << 3)) & 255) < j11) {
                            Object obj4 = objArr4[i49];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i21;
                            int i50 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i50 >>> 7);
                            jArr = jArr9;
                            long j26 = i50 & 127;
                            int i51 = iE3 >> 3;
                            int i52 = (iE3 & 7) << 3;
                            long j27 = (jArr[i51] & (~(255 << i52))) | (j26 << i52);
                            jArr[i51] = j27;
                            jArr[(((iE3 - 7) & i48) + (i48 & 7)) >> 3] = j27;
                            objArr5[iE3] = obj4;
                            jArr10[iE3] = jArr8[i49];
                            iArr[i49] = iE3;
                        } else {
                            jArr = jArr9;
                        }
                        i49++;
                        jArr7 = jArr7;
                        jArr9 = jArr;
                    }
                    long[] jArr11 = this.f14848c;
                    int length3 = jArr11.length;
                    for (int i53 = 0; i53 < length3; i53++) {
                        long j28 = jArr11[i53];
                        int i54 = (int) ((j28 >> c10) & 2147483647L);
                        int i55 = (int) (j28 & 2147483647L);
                        jArr11[i53] = (((j28 & (-4611686018427387904L)) | ((long) (i54 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i54]))) << c10) | ((long) (i55 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i55]));
                    }
                    int i56 = this.f14849d;
                    if (i56 != Integer.MAX_VALUE) {
                        this.f14849d = iArr[i56];
                    }
                    int i57 = this.f14850e;
                    if (i57 != Integer.MAX_VALUE) {
                        this.f14850e = iArr[i57];
                    }
                    iE = e(i13);
                }
                this.f14852g++;
                int i58 = this.f14853h;
                long[] jArr12 = this.f14846a;
                int i59 = iE >> 3;
                long j29 = jArr12[i59];
                int i60 = (iE & 7) << 3;
                if (((j29 >> i60) & j10) == j11) {
                    i10 = 1;
                }
                this.f14853h = i58 - i10;
                int i61 = this.f14851f;
                long j30 = (j29 & (~(j10 << i60))) | (j9 << i60);
                jArr12[i59] = j30;
                jArr12[(((iE - 7) & i61) + (i61 & 7)) >> 3] = j30;
                return iE;
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
            i11 = i21;
        }
    }

    public final int e(int i10) {
        int i11 = this.f14851f;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f14846a;
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
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (f0Var.f14852g != this.f14852g) {
            return false;
        }
        Object[] objArr = this.f14847b;
        long[] jArr = this.f14846a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j9 = jArr[i10];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j9) < 128 && !f0Var.c(objArr[(i10 << 3) + i12])) {
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
        long[] jArr2;
        int iMax = i10 > 0 ? Math.max(7, q0.c(i10)) : 0;
        this.f14851f = iMax;
        if (iMax == 0) {
            jArr = q0.f14885a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            h00.n.B0(jArr, -9187201950435737472L);
        }
        this.f14846a = jArr;
        int i11 = iMax >> 3;
        long j9 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j9)) | j9;
        this.f14853h = q0.a(this.f14851f) - this.f14852g;
        this.f14847b = iMax == 0 ? v.a.f15306c : new Object[iMax];
        if (iMax == 0) {
            jArr2 = r.f14888b;
        } else {
            jArr2 = new long[iMax];
            h00.n.B0(jArr2, 4611686018427387903L);
        }
        this.f14848c = jArr2;
    }

    public final boolean g(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f14851f;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f14846a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j9 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j10 = (((long) i11) * 72340172838076673L) ^ j9;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i13) & i12;
                if (kotlin.jvm.internal.m.a(this.f14847b[iNumberOfTrailingZeros], obj)) {
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
            h(iNumberOfTrailingZeros);
        }
        return z10;
    }

    public final void h(int i10) {
        this.f14852g--;
        long[] jArr = this.f14846a;
        int i11 = this.f14851f;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j9 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j9;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j9;
        this.f14847b[i10] = null;
        long[] jArr2 = this.f14848c;
        long j10 = jArr2[i10];
        int i14 = (int) ((j10 >> 31) & 2147483647L);
        int i15 = (int) (j10 & 2147483647L);
        if (i14 != Integer.MAX_VALUE) {
            jArr2[i14] = (jArr2[i14] & (-2147483648L)) | (((long) i15) & 2147483647L);
        } else {
            this.f14849d = i15;
        }
        if (i15 != Integer.MAX_VALUE) {
            jArr2[i15] = ((((long) i14) & 2147483647L) << 31) | (jArr2[i15] & (-4611686016279904257L));
        } else {
            this.f14850e = i14;
        }
        jArr2[i10] = 4611686018427387903L;
    }

    public final int hashCode() {
        int iHashCode = (this.f14851f * 31) + this.f14852g;
        Object[] objArr = this.f14847b;
        long[] jArr = this.f14846a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j9 = jArr[i10];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j9) < 128) {
                            Object obj = objArr[(i10 << 3) + i12];
                            if (!kotlin.jvm.internal.m.a(obj, this)) {
                                iHashCode += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i11 != 8) {
                        return iHashCode;
                    }
                }
                if (i10 != length) {
                    i10++;
                }
            }
        }
        return iHashCode;
    }

    public final boolean i(Collection collection) {
        kotlin.jvm.internal.m.e(collection, "elements");
        Object[] objArr = this.f14847b;
        int i10 = this.f14852g;
        long[] jArr = this.f14846a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j9 = jArr[i11];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i11 != length) {
                        break;
                        break;
                    }
                    i11++;
                } else {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j9) < 128) {
                            int i14 = (i11 << 3) + i13;
                            if (!h00.q.F0(collection, objArr[i14])) {
                                h(i14);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                    if (i11 != length) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return i10 != this.f14852g;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        Object[] objArr = this.f14847b;
        long[] jArr = this.f14848c;
        int i10 = this.f14850e;
        int i11 = 0;
        while (i10 != Integer.MAX_VALUE) {
            int i12 = (int) ((jArr[i10] >> 31) & 2147483647L);
            Object obj = objArr[i10];
            if (i11 != 0) {
                sb2.append((CharSequence) ", ");
            }
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            sb2.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
            i11++;
            i10 = i12;
        }
        sb2.append((CharSequence) "]");
        return sb2.toString();
    }
}
