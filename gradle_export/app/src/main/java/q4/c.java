package q4;

import android.graphics.Path;
import android.util.Log;
import com.google.android.gms.cast.MediaError;

public final class c {

    public char f12759a;

    public final float[] f12760b;

    public c(char c10, float[] fArr) {
        this.f12759a = c10;
        this.f12760b = fArr;
    }

    public c(c cVar) {
        this.f12759a = cVar.f12759a;
        float[] fArr = cVar.f12760b;
        this.f12760b = va.a.p(fArr, fArr.length);
    }

    public static void a(Path path, float f3, float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, boolean z11) {
        double d3;
        double d5;
        double radians = Math.toRadians(f15);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d10 = f3;
        double d11 = f10;
        double d12 = f13;
        double d13 = ((d11 * dSin) + (d10 * dCos)) / d12;
        double d14 = f14;
        double d15 = ((d11 * dCos) + (((double) (-f3)) * dSin)) / d14;
        double d16 = f12;
        double d17 = ((d16 * dSin) + (((double) f11) * dCos)) / d12;
        double d18 = ((d16 * dCos) + (((double) (-f11)) * dSin)) / d14;
        double d19 = d13 - d17;
        double d20 = d15 - d18;
        double d21 = (d13 + d17) / 2.0d;
        double d22 = (d15 + d18) / 2.0d;
        double d23 = (d20 * d20) + (d19 * d19);
        if (d23 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d24 = (1.0d / d23) - 0.25d;
        if (d24 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d23);
            float fSqrt = (float) (Math.sqrt(d23) / 1.99999d);
            a(path, f3, f10, f11, f12, f13 * fSqrt, fSqrt * f14, f15, z10, z11);
            return;
        }
        double dSqrt = Math.sqrt(d24);
        double d25 = dSqrt * d19;
        double d26 = dSqrt * d20;
        if (z10 == z11) {
            d3 = d21 - d26;
            d5 = d22 + d25;
        } else {
            d3 = d21 + d26;
            d5 = d22 - d25;
        }
        double dAtan2 = Math.atan2(d15 - d5, d13 - d3);
        double dAtan3 = Math.atan2(d18 - d5, d17 - d3) - dAtan2;
        if (z11 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d27 = d3 * d12;
        double d28 = d5 * d14;
        double d29 = (d27 * dCos) - (d28 * dSin);
        double d30 = (d28 * dCos) + (d27 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(radians);
        double dSin2 = Math.sin(radians);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d31 = -d12;
        double d32 = d31 * dCos2;
        double d33 = d14 * dSin2;
        double d34 = (d32 * dSin3) - (d33 * dCos3);
        double d35 = d31 * dSin2;
        double d36 = d14 * dCos2;
        double d37 = dAtan3 / ((double) iCeil);
        double d38 = (dCos3 * d36) + (dSin3 * d35);
        double d39 = d10;
        double d40 = d11;
        int i10 = 0;
        double d41 = dAtan2;
        while (i10 < iCeil) {
            double d42 = d41 + d37;
            double dSin4 = Math.sin(d42);
            double dCos4 = Math.cos(d42);
            int i11 = iCeil;
            double d43 = (((d12 * dCos2) * dCos4) + d29) - (d33 * dSin4);
            double d44 = (d36 * dSin4) + (d12 * dSin2 * dCos4) + d30;
            double d45 = (d32 * dSin4) - (d33 * dCos4);
            double d46 = (dCos4 * d36) + (dSin4 * d35);
            double d47 = d42 - d41;
            double dTan = Math.tan(d47 / 2.0d);
            double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d47)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d34 * dSqrt2) + d39), (float) ((d38 * dSqrt2) + d40), (float) (d43 - (dSqrt2 * d45)), (float) (d44 - (dSqrt2 * d46)), (float) d43, (float) d44);
            i10++;
            d40 = d44;
            dCos2 = dCos2;
            d35 = d35;
            d41 = d42;
            d38 = d46;
            d39 = d43;
            iCeil = i11;
            d34 = d45;
            d37 = d37;
        }
    }

    public static void b(c[] cVarArr, Path path) {
        int i10;
        float f3;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        c[] cVarArr2 = cVarArr;
        float[] fArr = new float[6];
        int length = cVarArr2.length;
        int i11 = 0;
        int i12 = 0;
        char c10 = 'm';
        while (i12 < length) {
            c cVar = cVarArr2[i12];
            char c11 = cVar.f12759a;
            float[] fArr2 = cVar.f12760b;
            float f19 = fArr[i11];
            float f20 = fArr[1];
            float f21 = fArr[2];
            float f22 = fArr[3];
            float f23 = fArr[4];
            int i13 = i11;
            float f24 = fArr[5];
            switch (c11) {
                case 'A':
                case 'a':
                    i10 = 7;
                    break;
                case 'C':
                case 'c':
                    i10 = 6;
                    break;
                case 'H':
                case 'V':
                case MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED:
                case 'v':
                    i10 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i10 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f23, f24);
                    f19 = f23;
                    f21 = f19;
                    f20 = f24;
                    f22 = f20;
                default:
                    i10 = 2;
                    break;
            }
            float f25 = f23;
            float f26 = f24;
            float f27 = f19;
            float f28 = f20;
            int i14 = i13;
            while (i14 < fArr2.length) {
                if (c11 == 'A') {
                    fArr2 = fArr2;
                    i14 = i14;
                    cVar = cVar;
                    float f29 = f28;
                    i12 = i12;
                    int i15 = i14 + 5;
                    int i16 = i14 + 6;
                    a(path, f27, f29, fArr2[i15], fArr2[i16], fArr2[i14], fArr2[i14 + 1], fArr2[i14 + 2], fArr2[i14 + 3] != 0.0f ? 1 : i13, fArr2[i14 + 4] != 0.0f ? 1 : i13);
                    f21 = fArr2[i15];
                    f3 = fArr2[i16];
                    f22 = f3;
                    f10 = f21;
                } else if (c11 == 'C') {
                    fArr2 = fArr2;
                    i14 = i14;
                    i12 = i12;
                    cVar = cVar;
                    int i17 = i14 + 2;
                    int i18 = i14 + 3;
                    int i19 = i14 + 4;
                    int i20 = i14 + 5;
                    path.cubicTo(fArr2[i14], fArr2[i14 + 1], fArr2[i17], fArr2[i18], fArr2[i19], fArr2[i20]);
                    float f30 = fArr2[i19];
                    float f31 = fArr2[i20];
                    f21 = fArr2[i17];
                    f22 = fArr2[i18];
                    f3 = f31;
                    f10 = f30;
                } else if (c11 == 'H') {
                    fArr2 = fArr2;
                    i14 = i14;
                    cVar = cVar;
                    f3 = f28;
                    i12 = i12;
                    path.lineTo(fArr2[i14], f3);
                    f10 = fArr2[i14];
                } else if (c11 == 'Q') {
                    fArr2 = fArr2;
                    i14 = i14;
                    i12 = i12;
                    cVar = cVar;
                    int i21 = i14 + 1;
                    int i22 = i14 + 2;
                    int i23 = i14 + 3;
                    path.quadTo(fArr2[i14], fArr2[i21], fArr2[i22], fArr2[i23]);
                    float f32 = fArr2[i14];
                    float f33 = fArr2[i21];
                    float f34 = fArr2[i22];
                    float f35 = fArr2[i23];
                    f21 = f32;
                    f22 = f33;
                    f10 = f34;
                    f3 = f35;
                } else if (c11 == 'V') {
                    fArr2 = fArr2;
                    i14 = i14;
                    i12 = i12;
                    cVar = cVar;
                    f10 = f27;
                    path.lineTo(f10, fArr2[i14]);
                    f3 = fArr2[i14];
                } else if (c11 != 'a') {
                    if (c11 == 'c') {
                        fArr2 = fArr2;
                        i14 = i14;
                        int i24 = i14 + 2;
                        int i25 = i14 + 3;
                        int i26 = i14 + 4;
                        int i27 = i14 + 5;
                        path.rCubicTo(fArr2[i14], fArr2[i14 + 1], fArr2[i24], fArr2[i25], fArr2[i26], fArr2[i27]);
                        float f36 = fArr2[i24] + f27;
                        float f37 = fArr2[i25] + f28;
                        f27 += fArr2[i26];
                        f28 += fArr2[i27];
                        f21 = f36;
                        f22 = f37;
                    } else if (c11 != 'h') {
                        if (c11 != 'q') {
                            if (c11 != 'v') {
                                if (c11 == 'L') {
                                    fArr2 = fArr2;
                                    i14 = i14;
                                    int i28 = i14 + 1;
                                    path.lineTo(fArr2[i14], fArr2[i28]);
                                    f10 = fArr2[i14];
                                    f3 = fArr2[i28];
                                } else if (c11 == 'M') {
                                    fArr2 = fArr2;
                                    i14 = i14;
                                    f10 = fArr2[i14];
                                    f3 = fArr2[i14 + 1];
                                    if (i14 > 0) {
                                        path.lineTo(f10, f3);
                                    } else {
                                        path.moveTo(f10, f3);
                                        f25 = f10;
                                        f26 = f3;
                                    }
                                } else if (c11 == 'S') {
                                    fArr2 = fArr2;
                                    i14 = i14;
                                    if (c10 == 'c' || c10 == 's' || c10 == 'C' || c10 == 'S') {
                                        f27 = (f27 * 2.0f) - f21;
                                        f28 = (f28 * 2.0f) - f22;
                                    }
                                    float f38 = f27;
                                    float f39 = f28;
                                    int i29 = i14 + 1;
                                    int i30 = i14 + 2;
                                    int i31 = i14 + 3;
                                    path.cubicTo(f38, f39, fArr2[i14], fArr2[i29], fArr2[i30], fArr2[i31]);
                                    f21 = fArr2[i14];
                                    f22 = fArr2[i29];
                                    f10 = fArr2[i30];
                                    f3 = fArr2[i31];
                                } else if (c11 == 'T') {
                                    fArr2 = fArr2;
                                    i14 = i14;
                                    if (c10 == 'q' || c10 == 't' || c10 == 'Q' || c10 == 'T') {
                                        f27 = (f27 * 2.0f) - f21;
                                        f28 = (f28 * 2.0f) - f22;
                                    }
                                    int i32 = i14 + 1;
                                    path.quadTo(f27, f28, fArr2[i14], fArr2[i32]);
                                    f10 = fArr2[i14];
                                    f3 = fArr2[i32];
                                    cVar = cVar;
                                    f21 = f27;
                                    f22 = f28;
                                } else if (c11 == 'l') {
                                    fArr2 = fArr2;
                                    i14 = i14;
                                    int i33 = i14 + 1;
                                    path.rLineTo(fArr2[i14], fArr2[i33]);
                                    f27 += fArr2[i14];
                                    f14 = fArr2[i33];
                                } else if (c11 == 'm') {
                                    fArr2 = fArr2;
                                    i14 = i14;
                                    float f40 = fArr2[i14];
                                    f27 += f40;
                                    float f41 = fArr2[i14 + 1];
                                    f28 += f41;
                                    if (i14 > 0) {
                                        path.rLineTo(f40, f41);
                                    } else {
                                        path.rMoveTo(f40, f41);
                                        cVar = cVar;
                                        f10 = f27;
                                        f25 = f10;
                                        f3 = f28;
                                        f26 = f3;
                                    }
                                } else if (c11 != 's') {
                                    if (c11 != 't') {
                                        f10 = f27;
                                    } else {
                                        if (c10 == 'q' || c10 == 't' || c10 == 'Q' || c10 == 'T') {
                                            f17 = f27 - f21;
                                            f18 = f28 - f22;
                                        } else {
                                            f18 = 0.0f;
                                            f17 = 0.0f;
                                        }
                                        int i34 = i14 + 1;
                                        path.rQuadTo(f17, f18, fArr2[i14], fArr2[i34]);
                                        float f42 = f17 + f27;
                                        float f43 = f18 + f28;
                                        float f44 = f27 + fArr2[i14];
                                        f28 += fArr2[i34];
                                        f22 = f43;
                                        f10 = f44;
                                        f21 = f42;
                                    }
                                    f3 = f28;
                                } else {
                                    if (c10 == 'c' || c10 == 's' || c10 == 'C' || c10 == 'S') {
                                        f15 = f28 - f22;
                                        f16 = f27 - f21;
                                    } else {
                                        f16 = 0.0f;
                                        f15 = 0.0f;
                                    }
                                    int i35 = i14;
                                    int i36 = i35 + 1;
                                    int i37 = i35 + 2;
                                    int i38 = i35 + 3;
                                    fArr2 = fArr2;
                                    i14 = i35;
                                    path.rCubicTo(f16, f15, fArr2[i35], fArr2[i36], fArr2[i37], fArr2[i38]);
                                    f11 = fArr2[i14] + f27;
                                    f12 = fArr2[i36] + f28;
                                    f27 += fArr2[i37];
                                    f13 = fArr2[i38];
                                }
                                cVar = cVar;
                            } else {
                                fArr2 = fArr2;
                                i14 = i14;
                                path.rLineTo(0.0f, fArr2[i14]);
                                f14 = fArr2[i14];
                            }
                            f28 += f14;
                        } else {
                            fArr2 = fArr2;
                            i14 = i14;
                            int i39 = i14 + 1;
                            int i40 = i14 + 2;
                            int i41 = i14 + 3;
                            path.rQuadTo(fArr2[i14], fArr2[i39], fArr2[i40], fArr2[i41]);
                            f11 = fArr2[i14] + f27;
                            f12 = fArr2[i39] + f28;
                            f27 += fArr2[i40];
                            f13 = fArr2[i41];
                        }
                        f28 += f13;
                        f21 = f11;
                        f22 = f12;
                    } else {
                        fArr2 = fArr2;
                        i14 = i14;
                        path.rLineTo(fArr2[i14], 0.0f);
                        f27 += fArr2[i14];
                    }
                    cVar = cVar;
                    f10 = f27;
                    f3 = f28;
                } else {
                    fArr2 = fArr2;
                    i14 = i14;
                    int i42 = i14 + 5;
                    float f45 = fArr2[i42] + f27;
                    int i43 = i14 + 6;
                    float f46 = fArr2[i43] + f28;
                    cVar = cVar;
                    float f47 = f27;
                    float f48 = f28;
                    i12 = i12;
                    a(path, f47, f48, f45, f46, fArr2[i14], fArr2[i14 + 1], fArr2[i14 + 2], fArr2[i14 + 3] != 0.0f ? 1 : i13, fArr2[i14 + 4] != 0.0f ? 1 : i13);
                    f10 = f47 + fArr2[i42];
                    f3 = f48 + fArr2[i43];
                    f21 = f10;
                    f22 = f3;
                }
                i14 += i10;
                path = path;
                cVar = cVar;
                c11 = c11;
                i12 = i12;
                f27 = f10;
                f28 = f3;
                c10 = c11;
                fArr2 = fArr2;
            }
            fArr[i13] = f27;
            fArr[1] = f28;
            fArr[2] = f21;
            fArr[3] = f22;
            fArr[4] = f25;
            fArr[5] = f26;
            c10 = cVar.f12759a;
            i12++;
            cVarArr2 = cVarArr;
            i11 = i13;
        }
    }
}
