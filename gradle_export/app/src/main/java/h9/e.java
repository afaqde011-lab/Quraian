package h9;

import a8.l0;
import a8.n0;
import androidx.media3.common.ParserException;
import androidx.media3.common.x0;
import com.google.android.gms.cast.Cast;
import e7.i0;
import g1.c3;
import java.util.Arrays;
import java.util.Collections;

public final class e implements i {

    public static final byte[] f6690x = {73, 68, 51};

    public final boolean f6691a;

    public final String f6694d;

    public final int f6695e;

    public final String f6696f;

    public String f6697g;

    public l0 f6698h;

    public l0 f6699i;
    public boolean m;

    public boolean f6702n;

    public int f6705q;

    public boolean f6706r;

    public int f6708t;

    public l0 f6710v;

    public long f6711w;

    public final n0 f6692b = new n0(7, new byte[7]);

    public final e7.u f6693c = new e7.u(Arrays.copyOf(f6690x, 10));

    public int f6703o = -1;

    public int f6704p = -1;

    public long f6707s = -9223372036854775807L;

    public long f6709u = -9223372036854775807L;

    public int f6700j = 0;

    public int f6701k = 0;
    public int l = 256;

    public e(int i10, String str, String str2, boolean z10) {
        this.f6691a = z10;
        this.f6694d = str;
        this.f6695e = i10;
        this.f6696f = str2;
    }

    @Override
    public final void a() {
        this.f6709u = -9223372036854775807L;
        this.f6702n = false;
        this.f6700j = 0;
        this.f6701k = 0;
        this.l = 256;
    }

    @Override
    public final void b(e7.u uVar) throws ParserException {
        byte b7;
        int i10;
        int i11;
        char c10;
        int i12;
        char c11;
        int i13;
        int i14;
        int i15;
        this.f6698h.getClass();
        String str = i0.f5136a;
        while (uVar.a() > 0) {
            int i16 = this.f6700j;
            byte b10 = -1;
            e7.u uVar2 = this.f6693c;
            int i17 = 3;
            n0 n0Var = this.f6692b;
            int i18 = 0;
            int i19 = 4;
            int i20 = 1;
            if (i16 == 0) {
                byte[] bArr = uVar.f5182a;
                int i21 = uVar.f5183b;
                int i22 = uVar.f5184c;
                while (true) {
                    if (i21 < i22) {
                        int i23 = i21 + 1;
                        int i24 = i17;
                        byte b11 = bArr[i21];
                        int i25 = b11 & 255;
                        if (this.l == 512 && ((65280 | (((byte) i25) & 255 ? 1 : 0) ? 1 : 0) & 65526) == 65520) {
                            if (!this.f6702n) {
                                int i26 = i21 - 1;
                                uVar.N(i21);
                                byte[] bArr2 = n0Var.f300b;
                                if (uVar.a() < i20) {
                                    b7 = -1;
                                } else {
                                    uVar.k(i18, i20, bArr2);
                                    n0Var.q(i19);
                                    int i27 = n0Var.i(i20);
                                    int i28 = this.f6703o;
                                    if (i28 == -1 || i27 == i28) {
                                        if (this.f6704p != -1) {
                                            byte[] bArr3 = n0Var.f300b;
                                            if (uVar.a() >= i20) {
                                                uVar.k(i18, i20, bArr3);
                                                n0Var.q(2);
                                                i13 = 4;
                                                if (n0Var.i(4) != this.f6704p) {
                                                    b7 = -1;
                                                } else {
                                                    uVar.N(i23);
                                                }
                                            }
                                        } else {
                                            i13 = 4;
                                        }
                                        byte[] bArr4 = n0Var.f300b;
                                        if (uVar.a() >= i13) {
                                            uVar.k(i18, i13, bArr4);
                                            n0Var.q(14);
                                            int i29 = n0Var.i(13);
                                            if (i29 < 7) {
                                                b7 = -1;
                                            } else {
                                                byte[] bArr5 = uVar.f5182a;
                                                int i30 = uVar.f5184c;
                                                int i31 = i26 + i29;
                                                if (i31 < i30) {
                                                    byte b12 = bArr5[i31];
                                                    b7 = -1;
                                                    if (b12 == -1) {
                                                        int i32 = i31 + 1;
                                                        if (i32 != i30) {
                                                            byte b13 = bArr5[i32];
                                                            if (((65280 | (b13 & 255 ? 1 : 0) ? 1 : 0) & 65526) == 65520 && ((b13 & 8) >> 3) == i27) {
                                                            }
                                                        }
                                                    } else if (b12 == 73 && ((i14 = i31 + 1) == i30 || (bArr5[i14] == 68 && ((i15 = i31 + 2) == i30 || bArr5[i15] == 51)))) {
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        b7 = -1;
                                    }
                                }
                                i10 = 1;
                            }
                            this.f6705q = (b11 & 8) >> 3;
                            this.m = (b11 & 1) == 0;
                            if (this.f6702n) {
                                this.f6700j = i24;
                                this.f6701k = 0;
                            } else {
                                this.f6700j = 1;
                                this.f6701k = 0;
                            }
                            uVar.N(i23);
                        } else {
                            b7 = b10;
                            i10 = i20;
                        }
                        int i33 = this.l;
                        int i34 = i25 | i33;
                        if (i34 == 329) {
                            i11 = 3;
                            c10 = 256;
                            i12 = 0;
                            c11 = 2;
                            this.l = 768;
                        } else if (i34 == 511) {
                            i11 = 3;
                            c10 = 256;
                            i12 = 0;
                            c11 = 2;
                            this.l = 512;
                        } else if (i34 == 836) {
                            i11 = 3;
                            c10 = 256;
                            i12 = 0;
                            c11 = 2;
                            this.l = 1024;
                        } else if (i34 != 1075) {
                            c10 = 256;
                            if (i33 != 256) {
                                this.l = 256;
                                i11 = 3;
                                i12 = 0;
                                c11 = 2;
                            } else {
                                i11 = 3;
                                i12 = 0;
                                c11 = 2;
                            }
                            i20 = i10;
                            b10 = b7;
                            i19 = 4;
                            i18 = i12;
                            i17 = i11;
                        } else {
                            this.f6700j = 2;
                            this.f6701k = 3;
                            this.f6708t = 0;
                            uVar2.N(0);
                            uVar.N(i23);
                        }
                        i21 = i23;
                        i20 = i10;
                        b10 = b7;
                        i19 = 4;
                        i18 = i12;
                        i17 = i11;
                    } else {
                        uVar.N(i21);
                    }
                }
            } else if (i16 != 1) {
                if (i16 == 2) {
                    byte[] bArr6 = uVar2.f5182a;
                    int iMin = Math.min(uVar.a(), 10 - this.f6701k);
                    uVar.k(this.f6701k, iMin, bArr6);
                    int i35 = this.f6701k + iMin;
                    this.f6701k = i35;
                    if (i35 == 10) {
                        this.f6699i.g(10, uVar2);
                        uVar2.N(6);
                        l0 l0Var = this.f6699i;
                        int iZ = uVar2.z() + 10;
                        this.f6700j = 4;
                        this.f6701k = 10;
                        this.f6710v = l0Var;
                        this.f6711w = 0L;
                        this.f6708t = iZ;
                    }
                } else if (i16 == 3) {
                    int i36 = this.m ? 7 : 5;
                    byte[] bArr7 = n0Var.f300b;
                    int iMin2 = Math.min(uVar.a(), i36 - this.f6701k);
                    uVar.k(this.f6701k, iMin2, bArr7);
                    int i37 = this.f6701k + iMin2;
                    this.f6701k = i37;
                    if (i37 == i36) {
                        n0Var.q(0);
                        if (this.f6706r) {
                            n0Var.t(10);
                        } else {
                            int i38 = n0Var.i(2) + 1;
                            if (i38 != 2) {
                                e7.a.m("AdtsReader", "Detected audio object type: " + i38 + ", but assuming AAC LC.");
                                i38 = 2;
                            }
                            n0Var.t(5);
                            int i39 = n0Var.i(3);
                            int i40 = this.f6704p;
                            byte[] bArr8 = {(byte) (((i38 << 3) & 248) | ((i40 >> 1) & 7)), (byte) (((i39 << 3) & 120) | ((i40 << 7) & Cast.MAX_NAMESPACE_LENGTH))};
                            a8.a aVarP = a8.b.p(new n0(2, bArr8), false);
                            androidx.media3.common.s sVar = new androidx.media3.common.s();
                            sVar.f1491a = this.f6697g;
                            sVar.l = x0.n(this.f6696f);
                            sVar.m = x0.n("audio/mp4a-latm");
                            sVar.f1500j = aVarP.f193a;
                            sVar.E = aVarP.f195c;
                            sVar.F = aVarP.f194b;
                            sVar.f1504p = Collections.singletonList(bArr8);
                            sVar.f1494d = this.f6694d;
                            sVar.f1496f = this.f6695e;
                            androidx.media3.common.t tVar = new androidx.media3.common.t(sVar);
                            this.f6707s = 1024000000 / ((long) tVar.G);
                            this.f6698h.f(tVar);
                            this.f6706r = true;
                        }
                        n0Var.t(4);
                        int i41 = n0Var.i(13);
                        int i42 = i41 - 7;
                        if (this.m) {
                            i42 = i41 - 9;
                        }
                        l0 l0Var2 = this.f6698h;
                        long j9 = this.f6707s;
                        this.f6700j = 4;
                        this.f6701k = 0;
                        this.f6710v = l0Var2;
                        this.f6711w = j9;
                        this.f6708t = i42;
                    }
                } else {
                    if (i16 != 4) {
                        throw new IllegalStateException();
                    }
                    int iMin3 = Math.min(uVar.a(), this.f6708t - this.f6701k);
                    this.f6710v.g(iMin3, uVar);
                    int i43 = this.f6701k + iMin3;
                    this.f6701k = i43;
                    if (i43 == this.f6708t) {
                        ta.c0.A(this.f6709u != -9223372036854775807L);
                        this.f6710v.d(this.f6709u, 1, this.f6708t, 0, null);
                        this.f6709u += this.f6711w;
                        this.f6700j = 0;
                        this.f6701k = 0;
                        this.l = 256;
                    }
                }
            } else if (uVar.a() != 0) {
                n0Var.f300b[0] = uVar.f5182a[uVar.f5183b];
                n0Var.q(2);
                int i44 = n0Var.i(4);
                int i45 = this.f6704p;
                if (i45 == -1 || i44 == i45) {
                    if (!this.f6702n) {
                        this.f6702n = true;
                        this.f6703o = this.f6705q;
                        this.f6704p = i44;
                    }
                    this.f6700j = 3;
                    this.f6701k = 0;
                } else {
                    this.f6702n = false;
                    this.f6700j = 0;
                    this.f6701k = 0;
                    this.l = 256;
                }
            }
        }
    }

    @Override
    public final void c(a8.s sVar, c3 c3Var) {
        c3Var.a();
        c3Var.b();
        this.f6697g = (String) c3Var.E;
        c3Var.b();
        l0 l0VarW = sVar.w(c3Var.C, 1);
        this.f6698h = l0VarW;
        this.f6710v = l0VarW;
        if (!this.f6691a) {
            this.f6699i = new a8.p();
            return;
        }
        c3Var.a();
        c3Var.b();
        l0 l0VarW2 = sVar.w(c3Var.C, 5);
        this.f6699i = l0VarW2;
        androidx.media3.common.s sVar2 = new androidx.media3.common.s();
        c3Var.b();
        sVar2.f1491a = (String) c3Var.E;
        sVar2.l = x0.n(this.f6696f);
        sVar2.m = x0.n("application/id3");
        oi.k.w(sVar2, l0VarW2);
    }

    @Override
    public final void d(boolean z10) {
    }

    @Override
    public final void e(int i10, long j9) {
        this.f6709u = j9;
    }
}
