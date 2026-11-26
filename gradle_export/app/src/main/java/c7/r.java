package c7;

import com.google.android.gms.cast.MediaError;
import ta.c0;

public final class r {

    public final int f2949a;

    public final int f2950b;

    public final float f2951c;

    public final float f2952d;

    public final float f2953e;

    public final int f2954f;

    public final int f2955g;

    public final int f2956h;

    public final p f2957i;

    public int f2958j;

    public int f2959k;
    public int l;
    public int m;

    public int f2960n;

    public int f2961o;

    public int f2962p;

    public double f2963q;

    public r(int i10, int i11, float f3, float f10, int i12, boolean z10) {
        this.f2949a = i10;
        this.f2950b = i11;
        this.f2951c = f3;
        this.f2952d = f10;
        this.f2953e = i10 / i12;
        this.f2954f = i10 / MediaError.DetailedErrorCode.MANIFEST_UNKNOWN;
        int i13 = i10 / 65;
        this.f2955g = i13;
        this.f2956h = i13 * 2;
        this.f2957i = z10 ? new o(this) : new q(this);
    }

    public final void a(int i10, int i11) {
        p pVar = this.f2957i;
        pVar.j(i11);
        Object objH = pVar.h();
        int i12 = this.f2950b;
        System.arraycopy(objH, i10 * i12, pVar.i(), this.f2959k * i12, i12 * i11);
        this.f2959k += i11;
    }

    public final void b() {
        float f3;
        int iQ;
        double d3;
        int i10;
        int i11;
        int i12;
        int iRound;
        int i13;
        int i14;
        long j9;
        long j10;
        int i15 = this.f2959k;
        float f10 = this.f2951c;
        float f11 = this.f2952d;
        double d5 = f10 / f11;
        float f12 = this.f2953e * f11;
        int i16 = this.f2949a;
        int i17 = 1;
        p pVar = this.f2957i;
        int i18 = this.f2950b;
        if (d5 > 1.0000100135803223d || d5 < 0.9999899864196777d) {
            int i19 = this.f2958j;
            int i20 = this.f2956h;
            if (i19 >= i20) {
                int i21 = 0;
                while (true) {
                    int i22 = this.f2961o;
                    if (i22 > 0) {
                        int iMin = Math.min(i20, i22);
                        a(i21, iMin);
                        this.f2961o -= iMin;
                        i21 += iMin;
                        f3 = f12;
                        d3 = d5;
                        i12 = i17;
                        i10 = i20;
                    } else {
                        int i23 = i16 > 4000 ? i16 / 4000 : i17;
                        int i24 = this.f2955g;
                        int i25 = this.f2954f;
                        if (i18 == i17 && i23 == i17) {
                            iQ = pVar.f(i21, i25, i24);
                            f3 = f12;
                        } else {
                            pVar.e(i21, i23);
                            f3 = f12;
                            int iQ2 = pVar.q(i25 / i23, i24 / i23);
                            if (i23 != i17) {
                                int i26 = iQ2 * i23;
                                int i27 = i23 * 4;
                                int i28 = i26 - i27;
                                int i29 = i26 + i27;
                                if (i28 >= i25) {
                                    i25 = i28;
                                }
                                if (i29 <= i24) {
                                    i24 = i29;
                                }
                                if (i18 == i17) {
                                    iQ = pVar.f(i21, i25, i24);
                                } else {
                                    pVar.e(i21, i17);
                                    iQ = pVar.q(i25, i24);
                                }
                            } else {
                                iQ = iQ2;
                            }
                        }
                        int i30 = pVar.k() ? this.f2962p : iQ;
                        pVar.g();
                        this.f2962p = iQ;
                        if (d5 > 1.0d) {
                            if (d5 >= 2.0d) {
                                double d10 = (((double) i30) / (d5 - 1.0d)) + this.f2963q;
                                iRound = (int) Math.round(d10);
                                d3 = d5;
                                this.f2963q = d10 - ((double) iRound);
                                pVar = pVar;
                            } else {
                                d3 = d5;
                                double d11 = (((2.0d - d3) * ((double) i30)) / (d3 - 1.0d)) + this.f2963q;
                                int iRound2 = (int) Math.round(d11);
                                this.f2961o = iRound2;
                                this.f2963q = d11 - ((double) iRound2);
                                iRound = i30;
                            }
                            pVar.j(iRound);
                            int i31 = i20;
                            int i32 = iRound;
                            pVar.m(i32, this.f2950b, this.f2959k, i21, i21 + i30);
                            this.f2959k += i32;
                            i21 = i30 + i32 + i21;
                            i10 = i31;
                            i12 = i17;
                        } else {
                            d3 = d5;
                            int i33 = i17;
                            i10 = i20;
                            if (d3 < 0.5d) {
                                double d12 = ((((double) i30) * d3) / (1.0d - d3)) + this.f2963q;
                                int iRound3 = (int) Math.round(d12);
                                this.f2963q = d12 - ((double) iRound3);
                                i11 = iRound3;
                            } else {
                                double d13 = ((((d3 * 2.0d) - 1.0d) * ((double) i30)) / (1.0d - d3)) + this.f2963q;
                                int iRound4 = (int) Math.round(d13);
                                this.f2961o = iRound4;
                                this.f2963q = d13 - ((double) iRound4);
                                i11 = i30;
                            }
                            int i34 = i30 + i11;
                            pVar.j(i34);
                            i12 = i33;
                            System.arraycopy(pVar.h(), i21 * i18, pVar.i(), this.f2959k * i18, i30 * i18);
                            int i35 = i21;
                            pVar.m(i11, this.f2950b, this.f2959k + i30, i30 + i21, i35);
                            this.f2959k += i34;
                            i21 = i35 + i11;
                        }
                    }
                    if (i21 + i10 > i19) {
                        break;
                    }
                    i20 = i10;
                    f12 = f3;
                    i17 = i12;
                    d5 = d3;
                }
                int i36 = this.f2958j - i21;
                System.arraycopy(pVar.h(), i21 * i18, pVar.h(), 0, i36 * i18);
                this.f2958j = i36;
            }
            if (f3 != 1.0f || this.f2959k == i15) {
            }
            long j11 = (long) (i16 / f3);
            long j12 = i16;
            while (j11 != 0 && j12 != 0 && j11 % 2 == 0 && j12 % 2 == 0) {
                j11 /= 2;
                j12 /= 2;
            }
            int i37 = this.f2959k - i15;
            pVar.n(i37);
            System.arraycopy(pVar.i(), i15 * i18, pVar.l(), this.l * i18, i37 * i18);
            this.f2959k = i15;
            this.l += i37;
            int i38 = 0;
            while (true) {
                i13 = this.l - 1;
                if (i38 >= i13) {
                    break;
                }
                while (true) {
                    i14 = this.m + 1;
                    j9 = i14;
                    long j13 = j9 * j11;
                    j10 = this.f2960n;
                    if (j13 <= j10 * j12) {
                        break;
                    }
                    int i39 = i12;
                    pVar.j(i39);
                    pVar.c(i38, j12, j11);
                    this.f2960n += i39;
                    this.f2959k += i39;
                }
                int i40 = i12;
                this.m = i14;
                if (j9 == j12) {
                    this.m = 0;
                    c0.A(j10 == j11 ? i40 : 0);
                    this.f2960n = 0;
                }
                i38++;
                i12 = i40;
            }
            if (i13 == 0) {
                return;
            }
            System.arraycopy(pVar.l(), i13 * i18, pVar.l(), 0, (this.l - i13) * i18);
            this.l -= i13;
            return;
        }
        a(0, this.f2958j);
        this.f2958j = 0;
        f3 = f12;
        i12 = 1;
        if (f3 != 1.0f) {
        }
    }
}
