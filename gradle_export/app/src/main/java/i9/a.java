package i9;

import a8.l0;
import a8.r;
import a8.s;
import androidx.media3.common.ParserException;
import androidx.media3.common.t;
import androidx.media3.common.x0;
import com.google.android.material.datepicker.n;
import e7.i0;
import e7.u;
import java.math.RoundingMode;

public final class a implements b {
    public static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    public static final int[] f7533n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    public final s f7534a;

    public final l0 f7535b;

    public final n f7536c;

    public final int f7537d;

    public final byte[] f7538e;

    public final u f7539f;

    public final int f7540g;

    public final t f7541h;

    public int f7542i;

    public long f7543j;

    public int f7544k;
    public long l;

    public a(s sVar, l0 l0Var, n nVar) throws ParserException {
        this.f7534a = sVar;
        this.f7535b = l0Var;
        this.f7536c = nVar;
        int i10 = nVar.C;
        int iMax = Math.max(1, i10 / 10);
        this.f7540g = iMax;
        u uVar = new u((byte[]) nVar.F);
        uVar.t();
        int iT = uVar.t();
        this.f7537d = iT;
        int i11 = nVar.B;
        int i12 = nVar.D;
        int i13 = (((i12 - (i11 * 4)) * 8) / (nVar.E * i11)) + 1;
        if (iT != i13) {
            throw ParserException.a(null, "Expected frames per block: " + i13 + "; got: " + iT);
        }
        int iF = i0.f(iMax, iT);
        this.f7538e = new byte[iF * i12];
        this.f7539f = new u(iT * 2 * i11 * iF);
        int i14 = ((i12 * i10) * 8) / iT;
        androidx.media3.common.s sVar2 = new androidx.media3.common.s();
        sVar2.m = x0.n("audio/raw");
        sVar2.f1498h = i14;
        sVar2.f1499i = i14;
        sVar2.f1502n = iMax * 2 * i11;
        sVar2.E = i11;
        sVar2.F = i10;
        sVar2.G = 2;
        this.f7541h = new t(sVar2);
    }

    @Override
    public final void a(long j9) {
        this.f7542i = 0;
        this.f7543j = j9;
        this.f7544k = 0;
        this.l = 0L;
    }

    @Override
    public final void b(int i10, long j9) {
        f fVar = new f(this.f7536c, this.f7537d, i10, j9);
        this.f7534a.b(fVar);
        t tVar = this.f7541h;
        l0 l0Var = this.f7535b;
        l0Var.f(tVar);
        l0Var.c(fVar.f7560e);
    }

    @Override
    public final boolean c(r rVar, long j9) {
        byte[] bArr;
        int i10;
        int i11;
        int i12;
        u uVar;
        int i13;
        int i14;
        int i15;
        byte[] bArr2;
        int i16;
        int i17;
        int iH;
        int iMin;
        int[] iArr;
        int i18;
        int i19;
        int i20;
        byte b7;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27 = this.f7544k;
        n nVar = this.f7536c;
        int i28 = i27 / (nVar.B * 2);
        int i29 = this.f7540g;
        int i30 = this.f7537d;
        int iF = i0.f(i29 - i28, i30);
        int i31 = nVar.D;
        int i32 = iF * i31;
        boolean z10 = j9 == 0;
        while (true) {
            bArr = this.f7538e;
            if (z10 && (i25 = this.f7542i) < i32) {
                i26 = rVar.read(bArr, this.f7542i, (int) Math.min(i32 - i25, j9));
                if (i26 == -1) {
                    break;
                }
                this.f7542i += i26;
                bArr = this.f7538e;
                if (z10) {
                }
            }
            i10 = this.f7542i / i31;
            if (i10 > 0) {
                i12 = 0;
                while (true) {
                    uVar = this.f7539f;
                    if (i12 < i10) {
                        break;
                    }
                    i14 = 0;
                    while (true) {
                        i15 = nVar.B;
                        if (i14 < i15) {
                            bArr2 = uVar.f5182a;
                            int i33 = (i14 * 4) + (i12 * i31);
                            i16 = (i15 * 4) + i33;
                            i17 = (i31 / i15) - 4;
                            iH = (short) ((bArr[i33] & 255) | ((bArr[i33 + 1] & 255) << 8));
                            int i34 = i10;
                            iMin = Math.min(bArr[i33 + 2] & 255, 88);
                            iArr = f7533n;
                            i18 = iArr[iMin];
                            i19 = ((i12 * i30 * i15) + i14) * 2;
                            bArr2[i19] = (byte) (iH & 255);
                            bArr2[i19 + 1] = (byte) (iH >> 8);
                            int i35 = i12;
                            i20 = 0;
                            while (i20 < i17 * 2) {
                                b7 = bArr[((i20 / 8) * i15 * 4) + i16 + ((i20 / 2) % 4)];
                                i21 = i20;
                                i22 = b7 & 255;
                                if (i21 % 2 == 0) {
                                    i23 = b7 & 15;
                                } else {
                                    i23 = i22 >> 4;
                                }
                                i24 = ((((i23 & 7) * 2) + 1) * i18) >> 3;
                                if ((i23 & 8) != 0) {
                                    i24 = -i24;
                                }
                                iH = i0.h(iH + i24, -32768, 32767);
                                i19 = (i15 * 2) + i19;
                                bArr2[i19] = (byte) (iH & 255);
                                bArr2[i19 + 1] = (byte) (iH >> 8);
                                iMin = i0.h(iMin + m[i23], 0, 88);
                                i18 = iArr[iMin];
                                i20 = i21 + 1;
                            }
                            i14++;
                            i10 = i34;
                            i12 = i35;
                        }
                    }
                    i12++;
                }
                int i36 = i10;
                int i37 = i30 * i36 * 2 * nVar.B;
                uVar.N(0);
                uVar.M(i37);
                this.f7542i -= i36 * i31;
                int i38 = uVar.f5184c;
                this.f7535b.g(i38, uVar);
                i13 = this.f7544k + i38;
                this.f7544k = i13;
                if (i13 / (nVar.B * 2) >= i29) {
                    d(i29);
                }
            }
            if (z10 && (i11 = this.f7544k / (nVar.B * 2)) > 0) {
                d(i11);
            }
            return z10;
        }
        while (true) {
            bArr = this.f7538e;
            if (z10) {
            }
            i10 = this.f7542i / i31;
            if (i10 > 0) {
                i12 = 0;
                while (true) {
                    uVar = this.f7539f;
                    if (i12 < i10) {
                        break;
                        break;
                    }
                    i14 = 0;
                    while (true) {
                        i15 = nVar.B;
                        if (i14 < i15) {
                            bArr2 = uVar.f5182a;
                            int i39 = (i14 * 4) + (i12 * i31);
                            i16 = (i15 * 4) + i39;
                            i17 = (i31 / i15) - 4;
                            iH = (short) ((bArr[i39] & 255) | ((bArr[i39 + 1] & 255) << 8));
                            int i310 = i10;
                            iMin = Math.min(bArr[i39 + 2] & 255, 88);
                            iArr = f7533n;
                            i18 = iArr[iMin];
                            i19 = ((i12 * i30 * i15) + i14) * 2;
                            bArr2[i19] = (byte) (iH & 255);
                            bArr2[i19 + 1] = (byte) (iH >> 8);
                            int i311 = i12;
                            i20 = 0;
                            while (i20 < i17 * 2) {
                                b7 = bArr[((i20 / 8) * i15 * 4) + i16 + ((i20 / 2) % 4)];
                                i21 = i20;
                                i22 = b7 & 255;
                                if (i21 % 2 == 0) {
                                    i23 = b7 & 15;
                                } else {
                                    i23 = i22 >> 4;
                                }
                                i24 = ((((i23 & 7) * 2) + 1) * i18) >> 3;
                                if ((i23 & 8) != 0) {
                                    i24 = -i24;
                                }
                                iH = i0.h(iH + i24, -32768, 32767);
                                i19 = (i15 * 2) + i19;
                                bArr2[i19] = (byte) (iH & 255);
                                bArr2[i19 + 1] = (byte) (iH >> 8);
                                iMin = i0.h(iMin + m[i23], 0, 88);
                                i18 = iArr[iMin];
                                i20 = i21 + 1;
                            }
                            i14++;
                            i10 = i310;
                            i12 = i311;
                        }
                    }
                    i12++;
                }
                int i312 = i10;
                int i313 = i30 * i312 * 2 * nVar.B;
                uVar.N(0);
                uVar.M(i313);
                this.f7542i -= i312 * i31;
                int i314 = uVar.f5184c;
                this.f7535b.g(i314, uVar);
                i13 = this.f7544k + i314;
                this.f7544k = i13;
                if (i13 / (nVar.B * 2) >= i29) {
                    d(i29);
                }
            }
            if (z10) {
                d(i11);
            }
            return z10;
            this.f7542i += i26;
        }
    }

    public final void d(int i10) {
        long j9 = this.f7543j;
        long j10 = this.l;
        n nVar = this.f7536c;
        long j11 = nVar.C;
        String str = i0.f5136a;
        long jQ = j9 + i0.Q(j10, 1000000L, j11, RoundingMode.DOWN);
        int i11 = i10 * 2 * nVar.B;
        this.f7535b.d(jQ, 1, i11, this.f7544k - i11, null);
        this.l += (long) i10;
        this.f7544k -= i11;
    }
}
