package i2;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.DisplayMetrics;
import com.google.android.gms.internal.measurement.b5;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.DoubleUnaryOperator;
import kotlin.NoWhenBranchMatchedException;

public abstract class b0 {

    public static q0 f7110a;

    public static final o0 f7111b = new o0();

    public static final RectF A(h2.c cVar) {
        return new RectF(cVar.f6546a, cVar.f6547b, cVar.f6548c, cVar.f6549d);
    }

    public static final Shader.TileMode B(int i10) {
        if (i10 == 0) {
            return Shader.TileMode.CLAMP;
        }
        if (i10 == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i10 == 2) {
            return Shader.TileMode.MIRROR;
        }
        return i10 == 3 ? Shader.TileMode.DECAL : Shader.TileMode.CLAMP;
    }

    public static final int C(long j9) {
        float[] fArr = j2.d.f7863a;
        return (int) (t.a(j9, j2.d.f7867e) >>> 32);
    }

    public static final Bitmap.Config D(int i10) {
        if (i10 == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i10 == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i10 == 2) {
            return Bitmap.Config.RGB_565;
        }
        if (i10 == 3) {
            return Bitmap.Config.RGBA_F16;
        }
        return i10 == 4 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final h2.c E(RectF rectF) {
        return new h2.c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static String F(int i10) {
        if (i10 == 0) {
            return "Clamp";
        }
        if (i10 == 1) {
            return "Repeated";
        }
        if (i10 == 2) {
            return "Mirror";
        }
        return i10 == 3 ? "Decal" : "Unknown";
    }

    public static final void G(List list, List list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }

    public static final int H(float f3, float[] fArr, int i10) {
        float f10 = f3 >= 0.0f ? f3 : 0.0f;
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (Math.abs(f10 - f3) > 1.05E-6f) {
            f10 = Float.NaN;
        }
        fArr[i10] = f10;
        return !Float.isNaN(f10) ? 1 : 0;
    }

    public static final a a(d dVar) {
        Canvas canvas = b.f7109a;
        a aVar = new a();
        aVar.f7106a = new Canvas(j(dVar));
        return aVar;
    }

    public static final long b(float f3, float f10, float f11, float f12, j2.c cVar) {
        int i10;
        int i11;
        int i12;
        float fB;
        float fA;
        int iFloatToRawIntBits;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        float fB2;
        float fA2;
        int iFloatToRawIntBits2;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        float f13;
        if (cVar.c()) {
            float f14 = f12 < 0.0f ? 0.0f : f12;
            if (f14 > 1.0f) {
                f14 = 1.0f;
            }
            int i29 = ((int) ((f14 * 255.0f) + 0.5f)) << 24;
            float f15 = f3 < 0.0f ? 0.0f : f3;
            if (f15 > 1.0f) {
                f15 = 1.0f;
            }
            int i30 = i29 | (((int) ((f15 * 255.0f) + 0.5f)) << 16);
            float f16 = f10 < 0.0f ? 0.0f : f10;
            if (f16 > 1.0f) {
                f16 = 1.0f;
            }
            int i31 = i30 | (((int) ((f16 * 255.0f) + 0.5f)) << 8);
            f13 = f11 >= 0.0f ? f11 : 0.0f;
            long j9 = ((long) (i31 | ((int) (((f13 <= 1.0f ? f13 : 1.0f) * 255.0f) + 0.5f)))) << 32;
            int i32 = t.f7168h;
            return j9;
        }
        long j10 = cVar.f7861b;
        int i33 = j2.b.f7859e;
        if (((int) (j10 >> 32)) != 3) {
            f0.a("Color only works with ColorSpaces with 3 components");
        }
        int i34 = cVar.f7862c;
        if (i34 == -1) {
            f0.a("Unknown color space, please use a color space in ColorSpaces");
        }
        int i35 = 0;
        float fB3 = cVar.b(0);
        float fA3 = cVar.a(0);
        if (f3 >= fB3) {
            fB3 = f3;
        }
        if (fB3 <= fA3) {
            fA3 = fB3;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(fA3);
        int i36 = iFloatToRawIntBits3 >>> 31;
        int i37 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i38 = iFloatToRawIntBits3 & 8388607;
        if (i37 == 255) {
            i11 = i38 != 0 ? 512 : 0;
            i10 = 31;
        } else {
            i10 = i37 - 112;
            if (i10 >= 31) {
                i11 = 0;
                i10 = 49;
            } else {
                if (i10 > 0) {
                    int i39 = i38 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i12 = (((i10 << 10) | i39) + 1) | (i36 << 15);
                    } else {
                        i11 = i39;
                    }
                    short s6 = (short) i12;
                    fB = cVar.b(1);
                    fA = cVar.a(1);
                    if (f10 >= fB) {
                        fB = f10;
                    }
                    if (fB <= fA) {
                        fA = fB;
                    }
                    iFloatToRawIntBits = Float.floatToRawIntBits(fA);
                    i13 = iFloatToRawIntBits >>> 31;
                    i14 = (iFloatToRawIntBits >>> 23) & 255;
                    i15 = iFloatToRawIntBits & 8388607;
                    if (i14 == 255) {
                        if (i15 != 0) {
                            i18 = 512;
                        } else {
                            i18 = 0;
                        }
                        i16 = 31;
                    } else {
                        i16 = i14 - 112;
                        if (i16 >= 31) {
                            i18 = 0;
                            i16 = 49;
                        } else {
                            if (i16 <= 0) {
                                i17 = i15 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                                } else {
                                    i18 = i17;
                                }
                                short s10 = (short) i19;
                                fB2 = cVar.b(2);
                                fA2 = cVar.a(2);
                                if (f11 >= fB2) {
                                    fB2 = f11;
                                }
                                if (fB2 <= fA2) {
                                    fA2 = fB2;
                                }
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                                i21 = iFloatToRawIntBits2 >>> 31;
                                i22 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i23 = 8388607 & iFloatToRawIntBits2;
                                if (i22 == 255) {
                                    i26 = i23 != 0 ? 512 : 0;
                                    i35 = 31;
                                } else {
                                    i24 = i22 - 112;
                                    if (i24 >= 31) {
                                        i26 = 0;
                                        i35 = 49;
                                    } else {
                                        if (i24 <= 0) {
                                            i25 = i23 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i27 = (((i24 << 10) | i25) + 1) | (i21 << 15);
                                            } else {
                                                i26 = i25;
                                                i35 = i24;
                                            }
                                            short s11 = (short) i27;
                                            f13 = f12 >= 0.0f ? f12 : 0.0f;
                                            long j11 = (((long) i34) & 63) | ((((long) s6) & 65535) << 48) | ((((long) s10) & 65535) << 32) | ((65535 & ((long) s11)) << 16) | ((((long) ((int) (((f13 <= 1.0f ? f13 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                            int i40 = t.f7168h;
                                            return j11;
                                        }
                                        if (i24 >= -10) {
                                            i28 = (i23 | 8388608) >> (1 - i24);
                                            if ((i28 & 4096) != 0) {
                                                i28 += 8192;
                                            }
                                            i26 = i28 >> 13;
                                        } else {
                                            i26 = 0;
                                        }
                                    }
                                }
                                i27 = i26 | (i21 << 15) | (i35 << 10);
                                short s12 = (short) i27;
                                if (f12 >= 0.0f) {
                                }
                                long j12 = (((long) i34) & 63) | ((((long) s6) & 65535) << 48) | ((((long) s10) & 65535) << 32) | ((65535 & ((long) s12)) << 16) | ((((long) ((int) (((f13 <= 1.0f ? f13 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i41 = t.f7168h;
                                return j12;
                            }
                            if (i16 >= -10) {
                                i20 = (i15 | 8388608) >> (1 - i16);
                                if ((i20 & 4096) != 0) {
                                    i20 += 8192;
                                }
                                i18 = i20 >> 13;
                                i16 = 0;
                            } else {
                                i18 = 0;
                                i16 = 0;
                            }
                        }
                    }
                    i19 = i18 | (i13 << 15) | (i16 << 10);
                    short s13 = (short) i19;
                    fB2 = cVar.b(2);
                    fA2 = cVar.a(2);
                    if (f11 >= fB2) {
                        fB2 = f11;
                    }
                    if (fB2 <= fA2) {
                        fA2 = fB2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                    i21 = iFloatToRawIntBits2 >>> 31;
                    i22 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i23 = 8388607 & iFloatToRawIntBits2;
                    if (i22 == 255) {
                        i26 = i23 != 0 ? 512 : 0;
                        i35 = 31;
                    } else {
                        i24 = i22 - 112;
                        if (i24 >= 31) {
                            i26 = 0;
                            i35 = 49;
                        } else {
                            if (i24 <= 0) {
                                i25 = i23 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i27 = (((i24 << 10) | i25) + 1) | (i21 << 15);
                                } else {
                                    i26 = i25;
                                    i35 = i24;
                                }
                                short s14 = (short) i27;
                                if (f12 >= 0.0f) {
                                }
                                long j13 = (((long) i34) & 63) | ((((long) s6) & 65535) << 48) | ((((long) s13) & 65535) << 32) | ((65535 & ((long) s14)) << 16) | ((((long) ((int) (((f13 <= 1.0f ? f13 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i42 = t.f7168h;
                                return j13;
                            }
                            if (i24 >= -10) {
                                i28 = (i23 | 8388608) >> (1 - i24);
                                if ((i28 & 4096) != 0) {
                                    i28 += 8192;
                                }
                                i26 = i28 >> 13;
                            } else {
                                i26 = 0;
                            }
                        }
                    }
                    i27 = i26 | (i21 << 15) | (i35 << 10);
                    short s15 = (short) i27;
                    if (f12 >= 0.0f) {
                    }
                    long j14 = (((long) i34) & 63) | ((((long) s6) & 65535) << 48) | ((((long) s13) & 65535) << 32) | ((65535 & ((long) s15)) << 16) | ((((long) ((int) (((f13 <= 1.0f ? f13 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i43 = t.f7168h;
                    return j14;
                }
                if (i10 >= -10) {
                    int i44 = (i38 | 8388608) >> (1 - i10);
                    if ((i44 & 4096) != 0) {
                        i44 += 8192;
                    }
                    i11 = i44 >> 13;
                    i10 = 0;
                } else {
                    i11 = 0;
                    i10 = 0;
                }
            }
        }
        i12 = i11 | (i36 << 15) | (i10 << 10);
        short s16 = (short) i12;
        fB = cVar.b(1);
        fA = cVar.a(1);
        if (f10 >= fB) {
            fB = f10;
        }
        if (fB <= fA) {
            fA = fB;
        }
        iFloatToRawIntBits = Float.floatToRawIntBits(fA);
        i13 = iFloatToRawIntBits >>> 31;
        i14 = (iFloatToRawIntBits >>> 23) & 255;
        i15 = iFloatToRawIntBits & 8388607;
        if (i14 == 255) {
            if (i15 != 0) {
                i18 = 512;
            } else {
                i18 = 0;
            }
            i16 = 31;
        } else {
            i16 = i14 - 112;
            if (i16 >= 31) {
                i18 = 0;
                i16 = 49;
            } else {
                if (i16 <= 0) {
                    i17 = i15 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                    } else {
                        i18 = i17;
                    }
                    short s17 = (short) i19;
                    fB2 = cVar.b(2);
                    fA2 = cVar.a(2);
                    if (f11 >= fB2) {
                        fB2 = f11;
                    }
                    if (fB2 <= fA2) {
                        fA2 = fB2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                    i21 = iFloatToRawIntBits2 >>> 31;
                    i22 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i23 = 8388607 & iFloatToRawIntBits2;
                    if (i22 == 255) {
                        i26 = i23 != 0 ? 512 : 0;
                        i35 = 31;
                    } else {
                        i24 = i22 - 112;
                        if (i24 >= 31) {
                            i26 = 0;
                            i35 = 49;
                        } else {
                            if (i24 <= 0) {
                                i25 = i23 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i27 = (((i24 << 10) | i25) + 1) | (i21 << 15);
                                } else {
                                    i26 = i25;
                                    i35 = i24;
                                }
                                short s18 = (short) i27;
                                if (f12 >= 0.0f) {
                                }
                                long j15 = (((long) i34) & 63) | ((((long) s16) & 65535) << 48) | ((((long) s17) & 65535) << 32) | ((65535 & ((long) s18)) << 16) | ((((long) ((int) (((f13 <= 1.0f ? f13 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i45 = t.f7168h;
                                return j15;
                            }
                            if (i24 >= -10) {
                                i28 = (i23 | 8388608) >> (1 - i24);
                                if ((i28 & 4096) != 0) {
                                    i28 += 8192;
                                }
                                i26 = i28 >> 13;
                            } else {
                                i26 = 0;
                            }
                        }
                    }
                    i27 = i26 | (i21 << 15) | (i35 << 10);
                    short s19 = (short) i27;
                    if (f12 >= 0.0f) {
                    }
                    long j16 = (((long) i34) & 63) | ((((long) s16) & 65535) << 48) | ((((long) s17) & 65535) << 32) | ((65535 & ((long) s19)) << 16) | ((((long) ((int) (((f13 <= 1.0f ? f13 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i46 = t.f7168h;
                    return j16;
                }
                if (i16 >= -10) {
                    i20 = (i15 | 8388608) >> (1 - i16);
                    if ((i20 & 4096) != 0) {
                        i20 += 8192;
                    }
                    i18 = i20 >> 13;
                    i16 = 0;
                } else {
                    i18 = 0;
                    i16 = 0;
                }
            }
        }
        i19 = i18 | (i13 << 15) | (i16 << 10);
        short s110 = (short) i19;
        fB2 = cVar.b(2);
        fA2 = cVar.a(2);
        if (f11 >= fB2) {
            fB2 = f11;
        }
        if (fB2 <= fA2) {
            fA2 = fB2;
        }
        iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
        i21 = iFloatToRawIntBits2 >>> 31;
        i22 = (iFloatToRawIntBits2 >>> 23) & 255;
        i23 = 8388607 & iFloatToRawIntBits2;
        if (i22 == 255) {
            i26 = i23 != 0 ? 512 : 0;
            i35 = 31;
        } else {
            i24 = i22 - 112;
            if (i24 >= 31) {
                i26 = 0;
                i35 = 49;
            } else {
                if (i24 <= 0) {
                    i25 = i23 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i27 = (((i24 << 10) | i25) + 1) | (i21 << 15);
                    } else {
                        i26 = i25;
                        i35 = i24;
                    }
                    short s111 = (short) i27;
                    if (f12 >= 0.0f) {
                    }
                    long j17 = (((long) i34) & 63) | ((((long) s16) & 65535) << 48) | ((((long) s110) & 65535) << 32) | ((65535 & ((long) s111)) << 16) | ((((long) ((int) (((f13 <= 1.0f ? f13 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i47 = t.f7168h;
                    return j17;
                }
                if (i24 >= -10) {
                    i28 = (i23 | 8388608) >> (1 - i24);
                    if ((i28 & 4096) != 0) {
                        i28 += 8192;
                    }
                    i26 = i28 >> 13;
                } else {
                    i26 = 0;
                }
            }
        }
        i27 = i26 | (i21 << 15) | (i35 << 10);
        short s112 = (short) i27;
        if (f12 >= 0.0f) {
        }
        long j18 = (((long) i34) & 63) | ((((long) s16) & 65535) << 48) | ((((long) s110) & 65535) << 32) | ((65535 & ((long) s112)) << 16) | ((((long) ((int) (((f13 <= 1.0f ? f13 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
        int i48 = t.f7168h;
        return j18;
    }

    public static final long c(int i10) {
        long j9 = ((long) i10) << 32;
        int i11 = t.f7168h;
        return j9;
    }

    public static final long d(long j9) {
        long j10 = j9 << 32;
        int i10 = t.f7168h;
        return j10;
    }

    public static long e(int i10, int i11, int i12) {
        return c(((i10 & 255) << 16) | (-16777216) | ((i11 & 255) << 8) | (i12 & 255));
    }

    public static d f(int i10, int i11, int i12) {
        ColorSpace rgb;
        String str;
        float[] fArrA;
        ColorSpace.Rgb.TransferParameters transferParameters;
        float[] fArr;
        ColorSpace rgb2;
        ColorSpace.Rgb rgb3;
        ColorSpace colorSpace;
        j2.r rVar = j2.d.f7867e;
        D(i12);
        int i13 = Build.VERSION.SDK_INT;
        Bitmap.Config configD = D(i12);
        if (kotlin.jvm.internal.m.a(rVar, rVar)) {
            rgb = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (kotlin.jvm.internal.m.a(rVar, j2.d.f7877q)) {
            rgb = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (kotlin.jvm.internal.m.a(rVar, j2.d.f7878r)) {
            rgb = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (kotlin.jvm.internal.m.a(rVar, j2.d.f7875o)) {
            rgb = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (kotlin.jvm.internal.m.a(rVar, j2.d.f7872j)) {
            rgb = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (kotlin.jvm.internal.m.a(rVar, j2.d.f7871i)) {
            rgb = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (kotlin.jvm.internal.m.a(rVar, j2.d.f7880t)) {
            rgb = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (kotlin.jvm.internal.m.a(rVar, j2.d.f7879s)) {
            rgb = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (kotlin.jvm.internal.m.a(rVar, j2.d.f7873k)) {
            rgb = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (kotlin.jvm.internal.m.a(rVar, j2.d.l)) {
            rgb = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (kotlin.jvm.internal.m.a(rVar, j2.d.f7869g)) {
            rgb = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (kotlin.jvm.internal.m.a(rVar, j2.d.f7870h)) {
            rgb = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (kotlin.jvm.internal.m.a(rVar, j2.d.f7868f)) {
            rgb = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (kotlin.jvm.internal.m.a(rVar, j2.d.m)) {
            rgb = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (kotlin.jvm.internal.m.a(rVar, j2.d.f7876p)) {
            rgb = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else {
            if (!kotlin.jvm.internal.m.a(rVar, j2.d.f7874n)) {
                if (i13 >= 34) {
                    if (kotlin.jvm.internal.m.a(rVar, j2.d.f7882v)) {
                        colorSpace = ColorSpace.get(ColorSpace.Named.BT2020_HLG);
                    } else {
                        colorSpace = kotlin.jvm.internal.m.a(rVar, j2.d.f7883w) ? ColorSpace.get(ColorSpace.Named.BT2020_PQ) : null;
                    }
                    if (colorSpace != null) {
                        rgb2 = colorSpace;
                    } else if (rVar != null) {
                        str = rVar.f7860a;
                        fArrA = rVar.f7905d.a();
                        j2.s sVar = rVar.f7908g;
                        if (sVar != null) {
                        }
                        fArr = rVar.f7910i;
                        if (transferParameters != null) {
                            rgb3 = new ColorSpace.Rgb(str, rVar.f7909h, fArrA, transferParameters);
                            if (Float.isNaN(fArr[0])) {
                                rgb = new ColorSpace.Rgb(str, fArr, transferParameters);
                            }
                            rgb2 = rgb3;
                        } else {
                            float[] fArr2 = rVar.f7909h;
                            final j2.q qVar = rVar.l;
                            final int i14 = 0;
                            DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() {
                                @Override
                                public final double applyAsDouble(double d3) {
                                    int i15 = i14;
                                    u00.k kVar = qVar;
                                    switch (i15) {
                                        case 0:
                                            break;
                                    }
                                    return ((Number) kVar.invoke(Double.valueOf(d3))).doubleValue();
                                }
                            };
                            final j2.q qVar2 = rVar.f7914o;
                            final int i15 = 1;
                            rgb2 = new ColorSpace.Rgb(str, fArr2, fArrA, doubleUnaryOperator, new DoubleUnaryOperator() {
                                @Override
                                public final double applyAsDouble(double d3) {
                                    int i16 = i15;
                                    u00.k kVar = qVar2;
                                    switch (i16) {
                                        case 0:
                                            break;
                                    }
                                    return ((Number) kVar.invoke(Double.valueOf(d3))).doubleValue();
                                }
                            }, rVar.f7906e, rVar.f7907f);
                        }
                    } else {
                        rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                    }
                } else if (rVar != null) {
                    str = rVar.f7860a;
                    fArrA = rVar.f7905d.a();
                    j2.s sVar2 = rVar.f7908g;
                    transferParameters = sVar2 != null ? new ColorSpace.Rgb.TransferParameters(sVar2.f7918b, sVar2.f7919c, sVar2.f7920d, sVar2.f7921e, sVar2.f7922f, sVar2.f7923g, sVar2.f7917a) : null;
                    fArr = rVar.f7910i;
                    if (transferParameters != null) {
                        rgb3 = new ColorSpace.Rgb(str, rVar.f7909h, fArrA, transferParameters);
                        if (Float.isNaN(fArr[0]) || Arrays.equals(rgb3.getTransform(), fArr)) {
                            rgb2 = rgb3;
                        } else {
                            rgb = new ColorSpace.Rgb(str, fArr, transferParameters);
                        }
                    } else {
                        float[] fArr3 = rVar.f7909h;
                        final u00.k qVar3 = rVar.l;
                        final int i16 = 0;
                        DoubleUnaryOperator doubleUnaryOperator2 = new DoubleUnaryOperator() {
                            @Override
                            public final double applyAsDouble(double d3) {
                                int i17 = i16;
                                u00.k kVar = qVar3;
                                switch (i17) {
                                    case 0:
                                        break;
                                }
                                return ((Number) kVar.invoke(Double.valueOf(d3))).doubleValue();
                            }
                        };
                        final u00.k qVar4 = rVar.f7914o;
                        final int i17 = 1;
                        rgb2 = new ColorSpace.Rgb(str, fArr3, fArrA, doubleUnaryOperator2, new DoubleUnaryOperator() {
                            @Override
                            public final double applyAsDouble(double d3) {
                                int i18 = i17;
                                u00.k kVar = qVar4;
                                switch (i18) {
                                    case 0:
                                        break;
                                }
                                return ((Number) kVar.invoke(Double.valueOf(d3))).doubleValue();
                            }
                        }, rVar.f7906e, rVar.f7907f);
                    }
                } else {
                    rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                }
                return new d(Bitmap.createBitmap((DisplayMetrics) null, i10, i11, configD, true, rgb2));
            }
            rgb = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        rgb2 = rgb;
        return new d(Bitmap.createBitmap((DisplayMetrics) null, i10, i11, configD, true, rgb2));
    }

    public static final e g() {
        return new e(new Paint(7));
    }

    public static final long h(float f3, float f10) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f10)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
        int i10 = w0.f7176c;
        return jFloatToRawIntBits;
    }

    public static final long i(float f3, float f10, float f11, float f12, j2.c cVar) {
        int i10;
        int i11;
        int i12;
        int iFloatToRawIntBits;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int iFloatToRawIntBits2;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        if (cVar.c()) {
            long j9 = ((long) ((((((int) ((f12 * 255.0f) + 0.5f)) << 24) | (((int) ((f3 * 255.0f) + 0.5f)) << 16)) | (((int) ((f10 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f11) + 0.5f)))) << 32;
            int i27 = t.f7168h;
            return j9;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(f3);
        int i28 = iFloatToRawIntBits3 >>> 31;
        int i29 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i30 = iFloatToRawIntBits3 & 8388607;
        int i31 = 49;
        int i32 = 0;
        if (i29 == 255) {
            i11 = i30 != 0 ? 512 : 0;
            i10 = 31;
        } else {
            i10 = i29 - 112;
            if (i10 >= 31) {
                i10 = 49;
                i11 = 0;
            } else {
                if (i10 > 0) {
                    int i33 = i30 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i12 = (((i10 << 10) | i33) + 1) | (i28 << 15);
                    } else {
                        i11 = i33;
                    }
                    short s6 = (short) i12;
                    iFloatToRawIntBits = Float.floatToRawIntBits(f10);
                    i13 = iFloatToRawIntBits >>> 31;
                    i14 = (iFloatToRawIntBits >>> 23) & 255;
                    i15 = iFloatToRawIntBits & 8388607;
                    if (i14 == 255) {
                        if (i15 != 0) {
                            i18 = 512;
                        } else {
                            i18 = 0;
                        }
                        i16 = 31;
                    } else {
                        i16 = i14 - 112;
                        if (i16 >= 31) {
                            i16 = 49;
                            i18 = 0;
                        } else {
                            if (i16 <= 0) {
                                i17 = i15 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                                } else {
                                    i18 = i17;
                                }
                                short s10 = (short) i19;
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f11);
                                i21 = iFloatToRawIntBits2 >>> 31;
                                i22 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i23 = 8388607 & iFloatToRawIntBits2;
                                if (i22 == 255) {
                                    i24 = i22 - 112;
                                    if (i24 < 31) {
                                        if (i24 <= 0) {
                                            i32 = i23 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i25 = (((i24 << 10) | i32) + 1) | (i21 << 15);
                                            } else {
                                                i31 = i24;
                                            }
                                        } else if (i24 >= -10) {
                                            i26 = (i23 | 8388608) >> (1 - i24);
                                            if ((i26 & 4096) != 0) {
                                                i26 += 8192;
                                            }
                                            i31 = 0;
                                            i32 = i26 >> 13;
                                        } else {
                                            i31 = 0;
                                        }
                                    }
                                    long jMax = ((((long) ((short) i25)) & 65535) << 16) | ((((long) s6) & 65535) << 48) | ((((long) s10) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f12, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f7862c) & 63);
                                    int i34 = t.f7168h;
                                    return jMax;
                                }
                                i32 = i23 == 0 ? 0 : 512;
                                i31 = 31;
                                i25 = (i21 << 15) | (i31 << 10) | i32;
                                long jMax2 = ((((long) ((short) i25)) & 65535) << 16) | ((((long) s6) & 65535) << 48) | ((((long) s10) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f12, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f7862c) & 63);
                                int i35 = t.f7168h;
                                return jMax2;
                            }
                            if (i16 >= -10) {
                                i20 = (i15 | 8388608) >> (1 - i16);
                                if ((i20 & 4096) != 0) {
                                    i20 += 8192;
                                }
                                i18 = i20 >> 13;
                                i16 = 0;
                            } else {
                                i18 = 0;
                                i16 = 0;
                            }
                        }
                    }
                    i19 = i18 | (i13 << 15) | (i16 << 10);
                    short s11 = (short) i19;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f11);
                    i21 = iFloatToRawIntBits2 >>> 31;
                    i22 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i23 = 8388607 & iFloatToRawIntBits2;
                    if (i22 == 255) {
                        i24 = i22 - 112;
                        if (i24 < 31) {
                            if (i24 <= 0) {
                                i32 = i23 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i25 = (((i24 << 10) | i32) + 1) | (i21 << 15);
                                } else {
                                    i31 = i24;
                                }
                            } else if (i24 >= -10) {
                                i26 = (i23 | 8388608) >> (1 - i24);
                                if ((i26 & 4096) != 0) {
                                    i26 += 8192;
                                }
                                i31 = 0;
                                i32 = i26 >> 13;
                            } else {
                                i31 = 0;
                            }
                        }
                        long jMax3 = ((((long) ((short) i25)) & 65535) << 16) | ((((long) s6) & 65535) << 48) | ((((long) s11) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f12, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f7862c) & 63);
                        int i36 = t.f7168h;
                        return jMax3;
                    }
                    i32 = i23 == 0 ? 0 : 512;
                    i31 = 31;
                    i25 = (i21 << 15) | (i31 << 10) | i32;
                    long jMax4 = ((((long) ((short) i25)) & 65535) << 16) | ((((long) s6) & 65535) << 48) | ((((long) s11) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f12, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f7862c) & 63);
                    int i37 = t.f7168h;
                    return jMax4;
                }
                if (i10 >= -10) {
                    int i38 = (i30 | 8388608) >> (1 - i10);
                    if ((i38 & 4096) != 0) {
                        i38 += 8192;
                    }
                    i11 = i38 >> 13;
                    i10 = 0;
                } else {
                    i11 = 0;
                    i10 = 0;
                }
            }
        }
        i12 = i11 | (i28 << 15) | (i10 << 10);
        short s12 = (short) i12;
        iFloatToRawIntBits = Float.floatToRawIntBits(f10);
        i13 = iFloatToRawIntBits >>> 31;
        i14 = (iFloatToRawIntBits >>> 23) & 255;
        i15 = iFloatToRawIntBits & 8388607;
        if (i14 == 255) {
            if (i15 != 0) {
                i18 = 512;
            } else {
                i18 = 0;
            }
            i16 = 31;
        } else {
            i16 = i14 - 112;
            if (i16 >= 31) {
                i16 = 49;
                i18 = 0;
            } else {
                if (i16 <= 0) {
                    i17 = i15 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                    } else {
                        i18 = i17;
                    }
                    short s13 = (short) i19;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f11);
                    i21 = iFloatToRawIntBits2 >>> 31;
                    i22 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i23 = 8388607 & iFloatToRawIntBits2;
                    if (i22 == 255) {
                        i24 = i22 - 112;
                        if (i24 < 31) {
                            if (i24 <= 0) {
                                i32 = i23 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i25 = (((i24 << 10) | i32) + 1) | (i21 << 15);
                                } else {
                                    i31 = i24;
                                }
                            } else if (i24 >= -10) {
                                i26 = (i23 | 8388608) >> (1 - i24);
                                if ((i26 & 4096) != 0) {
                                    i26 += 8192;
                                }
                                i31 = 0;
                                i32 = i26 >> 13;
                            } else {
                                i31 = 0;
                            }
                        }
                        long jMax5 = ((((long) ((short) i25)) & 65535) << 16) | ((((long) s12) & 65535) << 48) | ((((long) s13) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f12, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f7862c) & 63);
                        int i39 = t.f7168h;
                        return jMax5;
                    }
                    i32 = i23 == 0 ? 0 : 512;
                    i31 = 31;
                    i25 = (i21 << 15) | (i31 << 10) | i32;
                    long jMax6 = ((((long) ((short) i25)) & 65535) << 16) | ((((long) s12) & 65535) << 48) | ((((long) s13) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f12, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f7862c) & 63);
                    int i310 = t.f7168h;
                    return jMax6;
                }
                if (i16 >= -10) {
                    i20 = (i15 | 8388608) >> (1 - i16);
                    if ((i20 & 4096) != 0) {
                        i20 += 8192;
                    }
                    i18 = i20 >> 13;
                    i16 = 0;
                } else {
                    i18 = 0;
                    i16 = 0;
                }
            }
        }
        i19 = i18 | (i13 << 15) | (i16 << 10);
        short s14 = (short) i19;
        iFloatToRawIntBits2 = Float.floatToRawIntBits(f11);
        i21 = iFloatToRawIntBits2 >>> 31;
        i22 = (iFloatToRawIntBits2 >>> 23) & 255;
        i23 = 8388607 & iFloatToRawIntBits2;
        if (i22 == 255) {
            i24 = i22 - 112;
            if (i24 < 31) {
                if (i24 <= 0) {
                    i32 = i23 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i25 = (((i24 << 10) | i32) + 1) | (i21 << 15);
                    } else {
                        i31 = i24;
                    }
                } else if (i24 >= -10) {
                    i26 = (i23 | 8388608) >> (1 - i24);
                    if ((i26 & 4096) != 0) {
                        i26 += 8192;
                    }
                    i31 = 0;
                    i32 = i26 >> 13;
                } else {
                    i31 = 0;
                }
            }
            long jMax7 = ((((long) ((short) i25)) & 65535) << 16) | ((((long) s12) & 65535) << 48) | ((((long) s14) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f12, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f7862c) & 63);
            int i311 = t.f7168h;
            return jMax7;
        }
        i32 = i23 == 0 ? 0 : 512;
        i31 = 31;
        i25 = (i21 << 15) | (i31 << 10) | i32;
        long jMax8 = ((((long) ((short) i25)) & 65535) << 16) | ((((long) s12) & 65535) << 48) | ((((long) s14) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f12, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f7862c) & 63);
        int i312 = t.f7168h;
        return jMax8;
    }

    public static final Bitmap j(d dVar) {
        if (dVar instanceof d) {
            return dVar.f7117a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final long k(long j9, long j10) {
        float f3;
        float f10;
        long jA = t.a(j9, t.f(j10));
        float fD = t.d(j10);
        float fD2 = t.d(jA);
        float f11 = 1.0f - fD2;
        float f12 = (fD * f11) + fD2;
        float fH = t.h(jA);
        float fH2 = t.h(j10);
        float f13 = 0.0f;
        if (f12 == 0.0f) {
            f3 = 0.0f;
        } else {
            f3 = (((fH2 * fD) * f11) + (fH * fD2)) / f12;
        }
        float fG = t.g(jA);
        float fG2 = t.g(j10);
        if (f12 == 0.0f) {
            f10 = 0.0f;
        } else {
            f10 = (((fG2 * fD) * f11) + (fG * fD2)) / f12;
        }
        float fE = t.e(jA);
        float fE2 = t.e(j10);
        if (f12 != 0.0f) {
            f13 = (((fE2 * fD) * f11) + (fE * fD2)) / f12;
        }
        return i(f3, f10, f13, f12, t.f(j10));
    }

    public static final void l(s sVar, l0 l0Var, e eVar) throws NoWhenBranchMatchedException {
        if (l0Var instanceof j0) {
            h2.c cVar = ((j0) l0Var).f7140a;
            sVar.getClass();
            sVar.a(cVar.f6546a, cVar.f6547b, cVar.f6548c, cVar.f6549d, eVar);
        } else {
            if (!(l0Var instanceof k0)) {
                if (!(l0Var instanceof i0)) {
                    throw new NoWhenBranchMatchedException();
                }
                sVar.b(((i0) l0Var).f7139a, eVar);
                return;
            }
            k0 k0Var = (k0) l0Var;
            h2.d dVar = k0Var.f7142a;
            long j9 = dVar.f6557h;
            g gVar = k0Var.f7143b;
            if (gVar != null) {
                sVar.b(gVar, eVar);
            } else {
                sVar.k(dVar.f6550a, dVar.f6551b, dVar.f6552c, dVar.f6553d, Float.intBitsToFloat((int) (j9 >> 32)), Float.intBitsToFloat((int) (4294967295L & j9)), eVar);
            }
        }
    }

    public static void m(k2.d dVar, l0 l0Var, q qVar, float f3) throws NoWhenBranchMatchedException {
        boolean z10 = l0Var instanceof j0;
        k2.g gVar = k2.g.f8922a;
        if (z10) {
            h2.c cVar = ((j0) l0Var).f7140a;
            float f10 = cVar.f6546a;
            float f11 = cVar.f6547b;
            dVar.S(qVar, (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L), x(cVar), f3, gVar, 3);
            return;
        }
        if (!(l0Var instanceof k0)) {
            if (!(l0Var instanceof i0)) {
                throw new NoWhenBranchMatchedException();
            }
            dVar.g0(((i0) l0Var).f7139a, qVar, f3, gVar, 3);
            return;
        }
        k0 k0Var = (k0) l0Var;
        g gVar2 = k0Var.f7143b;
        if (gVar2 != null) {
            dVar.g0(gVar2, qVar, f3, gVar, 3);
            return;
        }
        h2.d dVar2 = k0Var.f7142a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar2.f6557h >> 32));
        float f12 = dVar2.f6550a;
        float f13 = dVar2.f6551b;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f12)) << 32) | (((long) Float.floatToRawIntBits(f13)) & 4294967295L);
        float fB = dVar2.b();
        float fA = dVar2.a();
        dVar.L(qVar, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fB)) << 32) | (((long) Float.floatToRawIntBits(fA)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), f3, gVar);
    }

    public static void n(k2.d dVar, l0 l0Var, long j9) throws NoWhenBranchMatchedException {
        boolean z10 = l0Var instanceof j0;
        k2.g gVar = k2.g.f8922a;
        if (z10) {
            h2.c cVar = ((j0) l0Var).f7140a;
            float f3 = cVar.f6546a;
            dVar.Q0(j9, (((long) Float.floatToRawIntBits(cVar.f6547b)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32), x(cVar), 1.0f, gVar, 3);
            return;
        }
        if (!(l0Var instanceof k0)) {
            if (!(l0Var instanceof i0)) {
                throw new NoWhenBranchMatchedException();
            }
            dVar.h1(((i0) l0Var).f7139a, j9, 1.0f, gVar);
            return;
        }
        k0 k0Var = (k0) l0Var;
        g gVar2 = k0Var.f7143b;
        if (gVar2 != null) {
            dVar.h1(gVar2, j9, 1.0f, gVar);
            return;
        }
        h2.d dVar2 = k0Var.f7142a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar2.f6557h >> 32));
        dVar.q(j9, (((long) Float.floatToRawIntBits(dVar2.f6550a)) << 32) | (((long) Float.floatToRawIntBits(dVar2.f6551b)) & 4294967295L), (((long) Float.floatToRawIntBits(dVar2.b())) << 32) | (((long) Float.floatToRawIntBits(dVar2.a())) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), gVar);
    }

    public static final Paint o(e eVar) {
        if (!(eVar instanceof e)) {
            f0.a("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + kotlin.jvm.internal.a0.a.b(eVar.getClass()).m());
        }
        return eVar.f7120a;
    }

    public static final b2.r p(b2.r rVar, u00.k kVar) {
        return rVar.V(new n(kVar));
    }

    public static b2.r q(b2.r rVar, float f3, float f10, float f11, float f12, t0 t0Var, int i10) {
        float f13 = (i10 & 1) != 0 ? 1.0f : f3;
        float f14 = (i10 & 2) != 0 ? 1.0f : f10;
        float f15 = (i10 & 4) != 0 ? 1.0f : f11;
        float f16 = (i10 & 32) != 0 ? 0.0f : f12;
        long j9 = w0.f7175b;
        t0 t0Var2 = (i10 & 2048) != 0 ? f7111b : t0Var;
        long j10 = d0.f7118a;
        return rVar.V(new a0(f13, f14, f15, f16, 0.0f, j9, t0Var2, false, j10, j10, null));
    }

    public static b2.r r(b2.r rVar, float f3, float f10, float f11, float f12, t0 t0Var, m mVar, int i10) {
        float f13 = (i10 & 1) != 0 ? 1.0f : f3;
        float f14 = (i10 & 2) != 0 ? 1.0f : f10;
        float f15 = (i10 & 4) != 0 ? 1.0f : f11;
        float f16 = (i10 & 256) != 0 ? 0.0f : f12;
        long j9 = w0.f7175b;
        t0 t0Var2 = (i10 & 2048) != 0 ? f7111b : t0Var;
        boolean z10 = (i10 & 4096) == 0;
        long j10 = d0.f7118a;
        return rVar.V(new a0(f13, f14, f15, 0.0f, f16, j9, t0Var2, z10, j10, j10, (i10 & 262144) != 0 ? null : mVar));
    }

    public static final boolean s(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static final s0 t(s0 s0Var, s0 s0Var2, float f3) {
        long jU = u(s0Var.f7159a, s0Var2.f7159a, f3);
        long j9 = s0Var.f7160b;
        long j10 = s0Var2.f7160b;
        float fA = b5.A(Float.intBitsToFloat((int) (j9 >> 32)), Float.intBitsToFloat((int) (j10 >> 32)), f3);
        float fA2 = b5.A(Float.intBitsToFloat((int) (j9 & 4294967295L)), Float.intBitsToFloat((int) (j10 & 4294967295L)), f3);
        return new s0(jU, (((long) Float.floatToRawIntBits(fA)) << 32) | (((long) Float.floatToRawIntBits(fA2)) & 4294967295L), b5.A(s0Var.f7161c, s0Var2.f7161c, f3));
    }

    public static final long u(long j9, long j10, float f3) {
        j2.l lVar = j2.d.f7884x;
        long jA = t.a(j9, lVar);
        long jA2 = t.a(j10, lVar);
        float fD = t.d(jA);
        float fH = t.h(jA);
        float fG = t.g(jA);
        float fE = t.e(jA);
        float fD2 = t.d(jA2);
        float fH2 = t.h(jA2);
        float fG2 = t.g(jA2);
        float fE2 = t.e(jA2);
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        return t.a(i(b5.A(fH, fH2, f3), b5.A(fG, fG2, f3), b5.A(fE, fE2, f3), b5.A(fD, fD2, f3), lVar), t.f(j10));
    }

    public static final float[] v(List list, List list2) {
        if (list == null) {
            return null;
        }
        float[] fArr = new float[list.size()];
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            fArr[i10] = ((Number) it.next()).floatValue();
            i10++;
        }
        return fArr;
    }

    public static final void w(Matrix matrix, float[] fArr) {
        float f3 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[6];
        float f16 = fArr[7];
        float f17 = fArr[8];
        float f18 = fArr[12];
        float f19 = fArr[13];
        float f20 = fArr[15];
        fArr[0] = f3;
        fArr[1] = f13;
        fArr[2] = f18;
        fArr[3] = f10;
        fArr[4] = f14;
        fArr[5] = f19;
        fArr[6] = f12;
        fArr[7] = f16;
        fArr[8] = f20;
        matrix.setValues(fArr);
        fArr[0] = f3;
        fArr[1] = f10;
        fArr[2] = f11;
        fArr[3] = f12;
        fArr[4] = f13;
        fArr[5] = f14;
        fArr[6] = f15;
        fArr[7] = f16;
        fArr[8] = f17;
    }

    public static final long x(h2.c cVar) {
        float f3 = cVar.f6548c - cVar.f6546a;
        return (((long) Float.floatToRawIntBits(cVar.f6549d - cVar.f6547b)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public static final BlendMode y(int i10) {
        if (i10 == 0) {
            return BlendMode.CLEAR;
        }
        if (i10 == 1) {
            return BlendMode.SRC;
        }
        if (i10 == 2) {
            return BlendMode.DST;
        }
        if (i10 == 3) {
            return BlendMode.SRC_OVER;
        }
        if (i10 == 4) {
            return BlendMode.DST_OVER;
        }
        if (i10 == 5) {
            return BlendMode.SRC_IN;
        }
        if (i10 == 6) {
            return BlendMode.DST_IN;
        }
        if (i10 == 7) {
            return BlendMode.SRC_OUT;
        }
        if (i10 == 8) {
            return BlendMode.DST_OUT;
        }
        if (i10 == 9) {
            return BlendMode.SRC_ATOP;
        }
        if (i10 == 10) {
            return BlendMode.DST_ATOP;
        }
        if (i10 == 11) {
            return BlendMode.XOR;
        }
        if (i10 == 12) {
            return BlendMode.PLUS;
        }
        if (i10 == 13) {
            return BlendMode.MODULATE;
        }
        if (i10 == 14) {
            return BlendMode.SCREEN;
        }
        if (i10 == 15) {
            return BlendMode.OVERLAY;
        }
        if (i10 == 16) {
            return BlendMode.DARKEN;
        }
        if (i10 == 17) {
            return BlendMode.LIGHTEN;
        }
        if (i10 == 18) {
            return BlendMode.COLOR_DODGE;
        }
        if (i10 == 19) {
            return BlendMode.COLOR_BURN;
        }
        if (i10 == 20) {
            return BlendMode.HARD_LIGHT;
        }
        if (i10 == 21) {
            return BlendMode.SOFT_LIGHT;
        }
        if (i10 == 22) {
            return BlendMode.DIFFERENCE;
        }
        if (i10 == 23) {
            return BlendMode.EXCLUSION;
        }
        if (i10 == 24) {
            return BlendMode.MULTIPLY;
        }
        if (i10 == 25) {
            return BlendMode.HUE;
        }
        if (i10 == 26) {
            return BlendMode.SATURATION;
        }
        if (i10 == 27) {
            return BlendMode.COLOR;
        }
        return i10 == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final Rect z(y3.k kVar) {
        return new Rect(kVar.f16592a, kVar.f16593b, kVar.f16594c, kVar.f16595d);
    }
}
