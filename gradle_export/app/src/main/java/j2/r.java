package j2;

import i2.b0;
import java.util.Arrays;

public final class r extends c {

    public static final n f7904r = new n(0);

    public final t f7905d;

    public final float f7906e;

    public final float f7907f;

    public final s f7908g;

    public final float[] f7909h;

    public final float[] f7910i;

    public final float[] f7911j;

    public final i f7912k;
    public final q l;
    public final m m;

    public final i f7913n;

    public final q f7914o;

    public final m f7915p;

    public final boolean f7916q;

    public r(String str, float[] fArr, t tVar, final double d3, float f3, float f10, int i10) {
        i iVar;
        i iVar2 = f7904r;
        if (d3 == 1.0d) {
            iVar = iVar2;
        } else {
            final int i11 = 0;
            iVar = new i() {
                @Override
                public final double b(double d5) {
                    switch (i11) {
                        case 0:
                            if (d5 < 0.0d) {
                                d5 = 0.0d;
                            }
                            return Math.pow(d5, 1.0d / d3);
                        default:
                            if (d5 < 0.0d) {
                                d5 = 0.0d;
                            }
                            return Math.pow(d5, d3);
                    }
                }
            };
        }
        if (d3 != 1.0d) {
            final int i12 = 1;
            iVar2 = new i() {
                @Override
                public final double b(double d5) {
                    switch (i12) {
                        case 0:
                            if (d5 < 0.0d) {
                                d5 = 0.0d;
                            }
                            return Math.pow(d5, 1.0d / d3);
                        default:
                            if (d5 < 0.0d) {
                                d5 = 0.0d;
                            }
                            return Math.pow(d5, d3);
                    }
                }
            };
        }
        this(str, fArr, tVar, null, iVar, iVar2, f3, f10, new s(d3, 1.0d, 0.0d, 0.0d, 0.0d), i10);
    }

    public r(String str, float[] fArr, t tVar, final s sVar, int i10) {
        i iVar;
        i iVar2;
        double d3 = sVar.f7917a;
        boolean z10 = d3 == -3.0d;
        double d5 = sVar.f7923g;
        double d10 = sVar.f7922f;
        if (z10) {
            final int i11 = 4;
            iVar = new i() {
                @Override
                public final double b(double d11) {
                    int i12 = i11;
                    s sVar2 = sVar;
                    switch (i12) {
                        case 0:
                            float[] fArr2 = d.f7863a;
                            return d.a(sVar2, d11);
                        case 1:
                            float[] fArr3 = d.f7863a;
                            return d.c(sVar2, d11);
                        case 2:
                            double d12 = sVar2.f7918b;
                            return d11 >= sVar2.f7921e ? Math.pow((d12 * d11) + sVar2.f7919c, sVar2.f7917a) : sVar2.f7920d * d11;
                        case 3:
                            double d13 = sVar2.f7918b;
                            double d14 = sVar2.f7919c;
                            double d15 = sVar2.f7920d;
                            return d11 >= sVar2.f7921e ? Math.pow((d13 * d11) + d14, sVar2.f7917a) + sVar2.f7922f : (d15 * d11) + sVar2.f7923g;
                        case 4:
                            float[] fArr4 = d.f7863a;
                            return d.b(sVar2, d11);
                        case 5:
                            float[] fArr5 = d.f7863a;
                            return d.d(sVar2, d11);
                        case 6:
                            double d16 = sVar2.f7918b;
                            double d17 = sVar2.f7919c;
                            double d18 = sVar2.f7920d;
                            return d11 >= sVar2.f7921e * d18 ? (Math.pow(d11, 1.0d / sVar2.f7917a) - d17) / d16 : d11 / d18;
                        default:
                            double d19 = sVar2.f7918b;
                            double d20 = sVar2.f7919c;
                            double d21 = sVar2.f7920d;
                            return d11 >= sVar2.f7921e * d21 ? (Math.pow(d11 - sVar2.f7922f, 1.0d / sVar2.f7917a) - d20) / d19 : (d11 - sVar2.f7923g) / d21;
                    }
                }
            };
        } else if (d3 == -2.0d) {
            final int i12 = 5;
            iVar = new i() {
                @Override
                public final double b(double d11) {
                    int i13 = i12;
                    s sVar2 = sVar;
                    switch (i13) {
                        case 0:
                            float[] fArr2 = d.f7863a;
                            return d.a(sVar2, d11);
                        case 1:
                            float[] fArr3 = d.f7863a;
                            return d.c(sVar2, d11);
                        case 2:
                            double d12 = sVar2.f7918b;
                            return d11 >= sVar2.f7921e ? Math.pow((d12 * d11) + sVar2.f7919c, sVar2.f7917a) : sVar2.f7920d * d11;
                        case 3:
                            double d13 = sVar2.f7918b;
                            double d14 = sVar2.f7919c;
                            double d15 = sVar2.f7920d;
                            return d11 >= sVar2.f7921e ? Math.pow((d13 * d11) + d14, sVar2.f7917a) + sVar2.f7922f : (d15 * d11) + sVar2.f7923g;
                        case 4:
                            float[] fArr4 = d.f7863a;
                            return d.b(sVar2, d11);
                        case 5:
                            float[] fArr5 = d.f7863a;
                            return d.d(sVar2, d11);
                        case 6:
                            double d16 = sVar2.f7918b;
                            double d17 = sVar2.f7919c;
                            double d18 = sVar2.f7920d;
                            return d11 >= sVar2.f7921e * d18 ? (Math.pow(d11, 1.0d / sVar2.f7917a) - d17) / d16 : d11 / d18;
                        default:
                            double d19 = sVar2.f7918b;
                            double d20 = sVar2.f7919c;
                            double d21 = sVar2.f7920d;
                            return d11 >= sVar2.f7921e * d21 ? (Math.pow(d11 - sVar2.f7922f, 1.0d / sVar2.f7917a) - d20) / d19 : (d11 - sVar2.f7923g) / d21;
                    }
                }
            };
        } else if (d10 == 0.0d && d5 == 0.0d) {
            final int i13 = 6;
            iVar = new i() {
                @Override
                public final double b(double d11) {
                    int i14 = i13;
                    s sVar2 = sVar;
                    switch (i14) {
                        case 0:
                            float[] fArr2 = d.f7863a;
                            return d.a(sVar2, d11);
                        case 1:
                            float[] fArr3 = d.f7863a;
                            return d.c(sVar2, d11);
                        case 2:
                            double d12 = sVar2.f7918b;
                            return d11 >= sVar2.f7921e ? Math.pow((d12 * d11) + sVar2.f7919c, sVar2.f7917a) : sVar2.f7920d * d11;
                        case 3:
                            double d13 = sVar2.f7918b;
                            double d14 = sVar2.f7919c;
                            double d15 = sVar2.f7920d;
                            return d11 >= sVar2.f7921e ? Math.pow((d13 * d11) + d14, sVar2.f7917a) + sVar2.f7922f : (d15 * d11) + sVar2.f7923g;
                        case 4:
                            float[] fArr4 = d.f7863a;
                            return d.b(sVar2, d11);
                        case 5:
                            float[] fArr5 = d.f7863a;
                            return d.d(sVar2, d11);
                        case 6:
                            double d16 = sVar2.f7918b;
                            double d17 = sVar2.f7919c;
                            double d18 = sVar2.f7920d;
                            return d11 >= sVar2.f7921e * d18 ? (Math.pow(d11, 1.0d / sVar2.f7917a) - d17) / d16 : d11 / d18;
                        default:
                            double d19 = sVar2.f7918b;
                            double d20 = sVar2.f7919c;
                            double d21 = sVar2.f7920d;
                            return d11 >= sVar2.f7921e * d21 ? (Math.pow(d11 - sVar2.f7922f, 1.0d / sVar2.f7917a) - d20) / d19 : (d11 - sVar2.f7923g) / d21;
                    }
                }
            };
        } else {
            final int i14 = 7;
            iVar = new i() {
                @Override
                public final double b(double d11) {
                    int i15 = i14;
                    s sVar2 = sVar;
                    switch (i15) {
                        case 0:
                            float[] fArr2 = d.f7863a;
                            return d.a(sVar2, d11);
                        case 1:
                            float[] fArr3 = d.f7863a;
                            return d.c(sVar2, d11);
                        case 2:
                            double d12 = sVar2.f7918b;
                            return d11 >= sVar2.f7921e ? Math.pow((d12 * d11) + sVar2.f7919c, sVar2.f7917a) : sVar2.f7920d * d11;
                        case 3:
                            double d13 = sVar2.f7918b;
                            double d14 = sVar2.f7919c;
                            double d15 = sVar2.f7920d;
                            return d11 >= sVar2.f7921e ? Math.pow((d13 * d11) + d14, sVar2.f7917a) + sVar2.f7922f : (d15 * d11) + sVar2.f7923g;
                        case 4:
                            float[] fArr4 = d.f7863a;
                            return d.b(sVar2, d11);
                        case 5:
                            float[] fArr5 = d.f7863a;
                            return d.d(sVar2, d11);
                        case 6:
                            double d16 = sVar2.f7918b;
                            double d17 = sVar2.f7919c;
                            double d18 = sVar2.f7920d;
                            return d11 >= sVar2.f7921e * d18 ? (Math.pow(d11, 1.0d / sVar2.f7917a) - d17) / d16 : d11 / d18;
                        default:
                            double d19 = sVar2.f7918b;
                            double d20 = sVar2.f7919c;
                            double d21 = sVar2.f7920d;
                            return d11 >= sVar2.f7921e * d21 ? (Math.pow(d11 - sVar2.f7922f, 1.0d / sVar2.f7917a) - d20) / d19 : (d11 - sVar2.f7923g) / d21;
                    }
                }
            };
        }
        if (d3 == -3.0d) {
            final int i15 = 0;
            iVar2 = new i() {
                @Override
                public final double b(double d11) {
                    int i16 = i15;
                    s sVar2 = sVar;
                    switch (i16) {
                        case 0:
                            float[] fArr2 = d.f7863a;
                            return d.a(sVar2, d11);
                        case 1:
                            float[] fArr3 = d.f7863a;
                            return d.c(sVar2, d11);
                        case 2:
                            double d12 = sVar2.f7918b;
                            return d11 >= sVar2.f7921e ? Math.pow((d12 * d11) + sVar2.f7919c, sVar2.f7917a) : sVar2.f7920d * d11;
                        case 3:
                            double d13 = sVar2.f7918b;
                            double d14 = sVar2.f7919c;
                            double d15 = sVar2.f7920d;
                            return d11 >= sVar2.f7921e ? Math.pow((d13 * d11) + d14, sVar2.f7917a) + sVar2.f7922f : (d15 * d11) + sVar2.f7923g;
                        case 4:
                            float[] fArr4 = d.f7863a;
                            return d.b(sVar2, d11);
                        case 5:
                            float[] fArr5 = d.f7863a;
                            return d.d(sVar2, d11);
                        case 6:
                            double d16 = sVar2.f7918b;
                            double d17 = sVar2.f7919c;
                            double d18 = sVar2.f7920d;
                            return d11 >= sVar2.f7921e * d18 ? (Math.pow(d11, 1.0d / sVar2.f7917a) - d17) / d16 : d11 / d18;
                        default:
                            double d19 = sVar2.f7918b;
                            double d20 = sVar2.f7919c;
                            double d21 = sVar2.f7920d;
                            return d11 >= sVar2.f7921e * d21 ? (Math.pow(d11 - sVar2.f7922f, 1.0d / sVar2.f7917a) - d20) / d19 : (d11 - sVar2.f7923g) / d21;
                    }
                }
            };
        } else if (d3 == -2.0d) {
            final int i16 = 1;
            iVar2 = new i() {
                @Override
                public final double b(double d11) {
                    int i17 = i16;
                    s sVar2 = sVar;
                    switch (i17) {
                        case 0:
                            float[] fArr2 = d.f7863a;
                            return d.a(sVar2, d11);
                        case 1:
                            float[] fArr3 = d.f7863a;
                            return d.c(sVar2, d11);
                        case 2:
                            double d12 = sVar2.f7918b;
                            return d11 >= sVar2.f7921e ? Math.pow((d12 * d11) + sVar2.f7919c, sVar2.f7917a) : sVar2.f7920d * d11;
                        case 3:
                            double d13 = sVar2.f7918b;
                            double d14 = sVar2.f7919c;
                            double d15 = sVar2.f7920d;
                            return d11 >= sVar2.f7921e ? Math.pow((d13 * d11) + d14, sVar2.f7917a) + sVar2.f7922f : (d15 * d11) + sVar2.f7923g;
                        case 4:
                            float[] fArr4 = d.f7863a;
                            return d.b(sVar2, d11);
                        case 5:
                            float[] fArr5 = d.f7863a;
                            return d.d(sVar2, d11);
                        case 6:
                            double d16 = sVar2.f7918b;
                            double d17 = sVar2.f7919c;
                            double d18 = sVar2.f7920d;
                            return d11 >= sVar2.f7921e * d18 ? (Math.pow(d11, 1.0d / sVar2.f7917a) - d17) / d16 : d11 / d18;
                        default:
                            double d19 = sVar2.f7918b;
                            double d20 = sVar2.f7919c;
                            double d21 = sVar2.f7920d;
                            return d11 >= sVar2.f7921e * d21 ? (Math.pow(d11 - sVar2.f7922f, 1.0d / sVar2.f7917a) - d20) / d19 : (d11 - sVar2.f7923g) / d21;
                    }
                }
            };
        } else if (d10 == 0.0d && d5 == 0.0d) {
            final int i17 = 2;
            iVar2 = new i() {
                @Override
                public final double b(double d11) {
                    int i18 = i17;
                    s sVar2 = sVar;
                    switch (i18) {
                        case 0:
                            float[] fArr2 = d.f7863a;
                            return d.a(sVar2, d11);
                        case 1:
                            float[] fArr3 = d.f7863a;
                            return d.c(sVar2, d11);
                        case 2:
                            double d12 = sVar2.f7918b;
                            return d11 >= sVar2.f7921e ? Math.pow((d12 * d11) + sVar2.f7919c, sVar2.f7917a) : sVar2.f7920d * d11;
                        case 3:
                            double d13 = sVar2.f7918b;
                            double d14 = sVar2.f7919c;
                            double d15 = sVar2.f7920d;
                            return d11 >= sVar2.f7921e ? Math.pow((d13 * d11) + d14, sVar2.f7917a) + sVar2.f7922f : (d15 * d11) + sVar2.f7923g;
                        case 4:
                            float[] fArr4 = d.f7863a;
                            return d.b(sVar2, d11);
                        case 5:
                            float[] fArr5 = d.f7863a;
                            return d.d(sVar2, d11);
                        case 6:
                            double d16 = sVar2.f7918b;
                            double d17 = sVar2.f7919c;
                            double d18 = sVar2.f7920d;
                            return d11 >= sVar2.f7921e * d18 ? (Math.pow(d11, 1.0d / sVar2.f7917a) - d17) / d16 : d11 / d18;
                        default:
                            double d19 = sVar2.f7918b;
                            double d20 = sVar2.f7919c;
                            double d21 = sVar2.f7920d;
                            return d11 >= sVar2.f7921e * d21 ? (Math.pow(d11 - sVar2.f7922f, 1.0d / sVar2.f7917a) - d20) / d19 : (d11 - sVar2.f7923g) / d21;
                    }
                }
            };
        } else {
            final int i18 = 3;
            iVar2 = new i() {
                @Override
                public final double b(double d11) {
                    int i19 = i18;
                    s sVar2 = sVar;
                    switch (i19) {
                        case 0:
                            float[] fArr2 = d.f7863a;
                            return d.a(sVar2, d11);
                        case 1:
                            float[] fArr3 = d.f7863a;
                            return d.c(sVar2, d11);
                        case 2:
                            double d12 = sVar2.f7918b;
                            return d11 >= sVar2.f7921e ? Math.pow((d12 * d11) + sVar2.f7919c, sVar2.f7917a) : sVar2.f7920d * d11;
                        case 3:
                            double d13 = sVar2.f7918b;
                            double d14 = sVar2.f7919c;
                            double d15 = sVar2.f7920d;
                            return d11 >= sVar2.f7921e ? Math.pow((d13 * d11) + d14, sVar2.f7917a) + sVar2.f7922f : (d15 * d11) + sVar2.f7923g;
                        case 4:
                            float[] fArr4 = d.f7863a;
                            return d.b(sVar2, d11);
                        case 5:
                            float[] fArr5 = d.f7863a;
                            return d.d(sVar2, d11);
                        case 6:
                            double d16 = sVar2.f7918b;
                            double d17 = sVar2.f7919c;
                            double d18 = sVar2.f7920d;
                            return d11 >= sVar2.f7921e * d18 ? (Math.pow(d11, 1.0d / sVar2.f7917a) - d17) / d16 : d11 / d18;
                        default:
                            double d19 = sVar2.f7918b;
                            double d20 = sVar2.f7919c;
                            double d21 = sVar2.f7920d;
                            return d11 >= sVar2.f7921e * d21 ? (Math.pow(d11 - sVar2.f7922f, 1.0d / sVar2.f7917a) - d20) / d19 : (d11 - sVar2.f7923g) / d21;
                    }
                }
            };
        }
        this(str, fArr, tVar, null, iVar, iVar2, 0.0f, 1.0f, sVar, i10);
    }

    public r(String str, float[] fArr, t tVar, float[] fArr2, i iVar, i iVar2, float f3, float f10, s sVar, int i10) {
        int i11;
        float f11;
        float f12;
        float[] fArr3;
        r rVar;
        double d3;
        int i12;
        super(str, b.f7855a, i10);
        this.f7905d = tVar;
        this.f7906e = f3;
        this.f7907f = f10;
        this.f7908g = sVar;
        this.f7912k = iVar;
        boolean z10 = 1;
        z10 = 1;
        this.l = new q(this, z10 ? 1 : 0);
        int i13 = 0;
        this.m = new m(this, i13);
        this.f7913n = iVar2;
        this.f7914o = new q(this, i13);
        this.f7915p = new m(this, z10 ? 1 : 0);
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f3 >= f10) {
            throw new IllegalArgumentException("Invalid range: min=" + f3 + ", max=" + f10 + "; min must be strictly < max");
        }
        float[] fArr4 = new float[6];
        if (fArr.length == 9) {
            float f13 = fArr[0];
            float f14 = fArr[1];
            float f15 = f13 + f14 + fArr[2];
            fArr4[0] = f13 / f15;
            fArr4[1] = f14 / f15;
            float f16 = fArr[3];
            float f17 = fArr[4];
            float f18 = f16 + f17 + fArr[5];
            fArr4[2] = f16 / f18;
            fArr4[3] = f17 / f18;
            float f19 = fArr[6];
            float f20 = fArr[7];
            float f21 = f19 + f20 + fArr[8];
            fArr4[4] = f19 / f21;
            fArr4[5] = f20 / f21;
        } else {
            System.arraycopy(fArr, 0, fArr4, 0, 6);
        }
        this.f7909h = fArr4;
        if (fArr2 == null) {
            float f22 = fArr4[0];
            float f23 = fArr4[1];
            float f24 = fArr4[2];
            float f25 = fArr4[3];
            float f26 = fArr4[4];
            float f27 = fArr4[5];
            f11 = 1.0f;
            float f28 = tVar.f7924a;
            i11 = 0;
            float f29 = tVar.f7925b;
            float f30 = 1;
            float f31 = (f30 - f22) / f23;
            float f32 = (f30 - f24) / f25;
            float f33 = (f30 - f26) / f27;
            float f34 = (f30 - f28) / f29;
            float f35 = f22 / f23;
            float f36 = (f24 / f25) - f35;
            float f37 = (f28 / f29) - f35;
            float f38 = f32 - f31;
            float f39 = (f26 / f27) - f35;
            float f40 = (((f34 - f31) * f36) - (f37 * f38)) / (((f33 - f31) * f36) - (f38 * f39));
            float f41 = (f37 - (f39 * f40)) / f36;
            float f42 = (1.0f - f41) - f40;
            float f43 = f42 / f23;
            float f44 = f41 / f25;
            float f45 = f40 / f27;
            this.f7910i = new float[]{f43 * f22, f42, ((1.0f - f22) - f23) * f43, f44 * f24, f41, ((1.0f - f24) - f25) * f44, f45 * f26, f40, ((1.0f - f26) - f27) * f45};
        } else {
            i11 = 0;
            f11 = 1.0f;
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.f7910i = fArr2;
        }
        this.f7911j = j.f(this.f7910i);
        float fB = j.b(fArr4);
        float[] fArr5 = d.f7863a;
        if (fB / j.b(d.f7864b) > 0.9f) {
            float[] fArr6 = d.f7863a;
            float f46 = fArr4[i11];
            float f47 = fArr6[i11];
            float f48 = fArr4[1];
            float f49 = fArr6[1];
            float f50 = fArr4[2];
            float f51 = fArr6[2];
            float f52 = fArr4[3];
            float f53 = fArr6[3];
            float f54 = fArr4[4];
            float f55 = fArr6[4];
            float f56 = fArr4[5];
            float f57 = fArr6[5];
            f12 = 0.0f;
            float[] fArr7 = new float[6];
            fArr7[i11] = f46 - f47;
            fArr7[1] = f48 - f49;
            fArr7[2] = f50 - f51;
            fArr7[3] = f52 - f53;
            fArr7[4] = f54 - f55;
            fArr7[5] = f56 - f57;
            float f58 = fArr7[i11];
            float f59 = fArr7[1];
            if (((f49 - f57) * f58) - ((f47 - f55) * f59) >= 0.0f && ((f47 - f51) * f59) - ((f49 - f53) * f58) >= 0.0f) {
                float f60 = fArr7[2];
                float f61 = fArr7[3];
                if (((f53 - f49) * f60) - ((f51 - f47) * f61) >= 0.0f && ((f51 - f55) * f61) - ((f53 - f57) * f60) >= 0.0f) {
                    float f62 = fArr7[4];
                    float f63 = fArr7[5];
                    if (((f57 - f53) * f62) - ((f55 - f51) * f63) < 0.0f || ((f55 - f47) * f63) - ((f57 - f49) * f62) < 0.0f) {
                    }
                }
            }
            if (i10 != 0) {
                fArr3 = d.f7863a;
                if (fArr4 == fArr3) {
                    i12 = i11;
                    while (true) {
                        if (i12 >= 6) {
                            if (j.d(tVar, j.f7897d)) {
                                break;
                            }
                            float[] fArr8 = d.f7863a;
                            rVar = d.f7867e;
                            while (d3 <= 1.0d) {
                                if (Math.abs(iVar.b(d3) - rVar.f7912k.b(d3)) <= 0.001d) {
                                }
                            }
                        } else if (Float.compare(fArr4[i12], fArr3[i12]) != 0 || Math.abs(fArr4[i12] - fArr3[i12]) <= 0.001f) {
                            i12++;
                        }
                        z10 = i11;
                        break;
                    }
                }
                if (j.d(tVar, j.f7897d) || f3 != f12 || f10 != f11) {
                    z10 = i11;
                    break;
                }
                float[] fArr9 = d.f7863a;
                rVar = d.f7867e;
                for (d3 = 0.0d; d3 <= 1.0d; d3 += 0.00392156862745098d) {
                    if (Math.abs(iVar.b(d3) - rVar.f7912k.b(d3)) <= 0.001d || Math.abs(iVar2.b(d3) - rVar.f7913n.b(d3)) > 0.001d) {
                        z10 = i11;
                        break;
                    }
                }
            }
            this.f7916q = z10;
        }
        f12 = 0.0f;
        int i14 = (f3 > f12 ? 1 : (f3 == f12 ? 0 : -1));
        if (i10 != 0) {
            fArr3 = d.f7863a;
            if (fArr4 == fArr3) {
                i12 = i11;
                while (true) {
                    if (i12 >= 6) {
                        if (Float.compare(fArr4[i12], fArr3[i12]) != 0) {
                        }
                        i12++;
                    } else {
                        if (j.d(tVar, j.f7897d)) {
                            break;
                        }
                        float[] fArr10 = d.f7863a;
                        rVar = d.f7867e;
                        while (d3 <= 1.0d) {
                            if (Math.abs(iVar.b(d3) - rVar.f7912k.b(d3)) <= 0.001d) {
                            }
                        }
                    }
                    z10 = i11;
                    break;
                }
            }
            if (j.d(tVar, j.f7897d)) {
                z10 = i11;
                break;
            }
            float[] fArr11 = d.f7863a;
            rVar = d.f7867e;
            while (d3 <= 1.0d) {
                if (Math.abs(iVar.b(d3) - rVar.f7912k.b(d3)) <= 0.001d) {
                }
                z10 = i11;
            }
        }
        this.f7916q = z10;
    }

    @Override
    public final float a(int i10) {
        return this.f7907f;
    }

    @Override
    public final float b(int i10) {
        return this.f7906e;
    }

    @Override
    public final boolean c() {
        return this.f7916q;
    }

    @Override
    public final long d(float f3, float f10, float f11) {
        double d3 = f3;
        m mVar = this.f7915p;
        float fB = (float) mVar.b(d3);
        float fB2 = (float) mVar.b(f10);
        float fB3 = (float) mVar.b(f11);
        float[] fArr = this.f7910i;
        if (fArr.length < 9) {
            return 0L;
        }
        return (((long) Float.floatToRawIntBits((fArr[6] * fB3) + ((fArr[3] * fB2) + (fArr[0] * fB)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((fArr[7] * fB3) + (fArr[4] * fB2) + (fArr[1] * fB))));
    }

    @Override
    public final float e(float f3, float f10, float f11) {
        double d3 = f3;
        m mVar = this.f7915p;
        float fB = (float) mVar.b(d3);
        float fB2 = (float) mVar.b(f10);
        float fB3 = (float) mVar.b(f11);
        float[] fArr = this.f7910i;
        return (fArr[8] * fB3) + (fArr[5] * fB2) + (fArr[2] * fB);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        r rVar = (r) obj;
        s sVar = rVar.f7908g;
        if (Float.compare(rVar.f7906e, this.f7906e) != 0 || Float.compare(rVar.f7907f, this.f7907f) != 0 || !kotlin.jvm.internal.m.a(this.f7905d, rVar.f7905d) || !Arrays.equals(this.f7909h, rVar.f7909h)) {
            return false;
        }
        s sVar2 = this.f7908g;
        if (sVar2 != null) {
            return kotlin.jvm.internal.m.a(sVar2, sVar);
        }
        if (sVar == null) {
            return true;
        }
        if (kotlin.jvm.internal.m.a(this.f7912k, rVar.f7912k)) {
            return kotlin.jvm.internal.m.a(this.f7913n, rVar.f7913n);
        }
        return false;
    }

    @Override
    public final long f(float f3, float f10, float f11, float f12, c cVar) {
        float[] fArr = this.f7911j;
        float f13 = (fArr[6] * f11) + (fArr[3] * f10) + (fArr[0] * f3);
        float f14 = (fArr[7] * f11) + (fArr[4] * f10) + (fArr[1] * f3);
        float f15 = (fArr[8] * f11) + (fArr[5] * f10) + (fArr[2] * f3);
        m mVar = this.m;
        return b0.b((float) mVar.b(f13), (float) mVar.b(f14), (float) mVar.b(f15), f12, cVar);
    }

    @Override
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f7909h) + ((this.f7905d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f3 = this.f7906e;
        int iFloatToIntBits = (iHashCode + (f3 == 0.0f ? 0 : Float.floatToIntBits(f3))) * 31;
        float f10 = this.f7907f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f10 == 0.0f ? 0 : Float.floatToIntBits(f10))) * 31;
        s sVar = this.f7908g;
        int iHashCode2 = iFloatToIntBits2 + (sVar != null ? sVar.hashCode() : 0);
        if (sVar != null) {
            return iHashCode2;
        }
        return this.f7913n.hashCode() + ((this.f7912k.hashCode() + (iHashCode2 * 31)) * 31);
    }
}
