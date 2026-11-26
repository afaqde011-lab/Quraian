package x;

import com.google.android.gms.internal.measurement.b5;

public final class r implements v {
    public final float A;
    public final float B;
    public final float C;
    public final float D;
    public final float E;
    public final float F;

    public r(float f3, float f10, float f11, float f12) {
        int iH;
        this.A = f3;
        this.B = f10;
        this.C = f11;
        this.D = f12;
        if (!((Float.isNaN(f3) || Float.isNaN(f10) || Float.isNaN(f11) || Float.isNaN(f12)) ? false : true)) {
            o0.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f3 + ", " + f10 + ", " + f11 + ", " + f12 + '.');
        }
        float[] fArr = new float[5];
        float f13 = (f10 - 0.0f) * 3.0f;
        float f14 = (f12 - f10) * 3.0f;
        float f15 = (1.0f - f12) * 3.0f;
        double d3 = f13;
        double d5 = f14;
        double d10 = f15;
        double d11 = d5 * 2.0d;
        double d12 = (d3 - d11) + d10;
        if (d12 == 0.0d) {
            iH = d5 == d10 ? 0 : i2.b0.H((float) ((d11 - d10) / (d11 - (d10 * 2.0d))), fArr, 0);
        } else {
            double d13 = -Math.sqrt((d5 * d5) - (d10 * d3));
            double d14 = (-d3) + d5;
            int iH2 = i2.b0.H((float) ((-(d13 + d14)) / d12), fArr, 0);
            int iH3 = i2.b0.H((float) ((d13 - d14) / d12), fArr, iH2) + iH2;
            if (iH3 > 1) {
                float f16 = fArr[0];
                float f17 = fArr[1];
                if (f16 > f17) {
                    fArr[0] = f17;
                    fArr[1] = f16;
                } else if (f16 == f17) {
                    iH = iH3 - 1;
                }
                iH = iH3;
            } else {
                iH = iH3;
            }
        }
        float f18 = (f14 - f13) * 2.0f;
        int iH4 = i2.b0.H((-f18) / (((f15 - f14) * 2.0f) - f18), fArr, iH) + iH;
        float fMin = Math.min(0.0f, 1.0f);
        float fMax = Math.max(0.0f, 1.0f);
        for (int i10 = 0; i10 < iH4; i10++) {
            float f19 = fArr[i10];
            float f20 = (((((((((f10 - f12) * 3.0f) + 1.0f) - 0.0f) * f19) + (((f12 - (f10 * 2.0f)) + 0.0f) * 3.0f)) * f19) + f13) * f19) + 0.0f;
            fMin = Math.min(fMin, f20);
            fMax = Math.max(fMax, f20);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMin)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
        this.E = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        this.F = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
    }

    @Override
    public final float b(float f3) {
        float f10;
        if (f3 <= 0.0f || f3 >= 1.0f) {
            return f3;
        }
        float fMax = Math.max(f3, 1.1920929E-7f);
        float f11 = 0.0f - fMax;
        float f12 = this.A;
        float f13 = f12 - fMax;
        float f14 = this.C;
        float f15 = f14 - fMax;
        double d3 = f11;
        float f16 = 0.0f;
        double d5 = ((d3 - (((double) f13) * 2.0d)) + ((double) f15)) * 3.0d;
        double d10 = ((double) (f13 - f11)) * 3.0d;
        double d11 = (((double) (f13 - f15)) * 3.0d) + ((double) (-f11)) + ((double) (1.0f - fMax));
        float f17 = Float.NaN;
        if (Math.abs(d11 - 0.0d) >= 1.0E-7d) {
            double d12 = d5 / d11;
            double d13 = d10 / d11;
            double d14 = d3 / d11;
            double d15 = ((d13 * 3.0d) - (d12 * d12)) / 9.0d;
            double d16 = ((d14 * 27.0d) + ((((2.0d * d12) * d12) * d12) - ((9.0d * d12) * d13))) / 54.0d;
            double d17 = d15 * d15 * d15;
            double d18 = (d16 * d16) + d17;
            double d19 = d12 / 3.0d;
            if (d18 < 0.0d) {
                double dSqrt = Math.sqrt(-d17);
                double d20 = (-d16) / dSqrt;
                if (d20 < -1.0d) {
                    d20 = -1.0d;
                }
                if (d20 > 1.0d) {
                    d20 = 1.0d;
                }
                double dAcos = Math.acos(d20);
                double dR = b5.r((float) dSqrt) * 2.0f;
                float fCos = (float) ((Math.cos(dAcos / 3.0d) * dR) - d19);
                float f18 = fCos < 0.0f ? 0.0f : fCos;
                if (f18 > 1.0f) {
                    f18 = 1.0f;
                }
                if (Math.abs(f18 - fCos) > 1.05E-6f) {
                    f18 = Float.NaN;
                }
                if (Float.isNaN(f18)) {
                    float fCos2 = (float) ((Math.cos((6.283185307179586d + dAcos) / 3.0d) * dR) - d19);
                    f18 = fCos2 < 0.0f ? 0.0f : fCos2;
                    if (f18 > 1.0f) {
                        f18 = 1.0f;
                    }
                    if (Math.abs(f18 - fCos2) > 1.05E-6f) {
                        f18 = Float.NaN;
                    }
                    if (Float.isNaN(f18)) {
                        float fCos3 = (float) ((Math.cos((dAcos + 12.566370614359172d) / 3.0d) * dR) - d19);
                        if (fCos3 >= 0.0f) {
                            f16 = fCos3;
                        }
                        f10 = f16 > 1.0f ? 1.0f : f16;
                        if (Math.abs(f10 - fCos3) <= 1.05E-6f) {
                            f17 = f10;
                        }
                    } else {
                        f17 = f18;
                    }
                } else {
                    f17 = f18;
                }
            } else if (d18 == 0.0d) {
                float f19 = -b5.r((float) d16);
                float f20 = (float) d19;
                float f21 = (f19 * 2.0f) - f20;
                float f22 = f21 < 0.0f ? 0.0f : f21;
                if (f22 > 1.0f) {
                    f22 = 1.0f;
                }
                if (Math.abs(f22 - f21) > 1.05E-6f) {
                    f22 = Float.NaN;
                }
                if (Float.isNaN(f22)) {
                    float f23 = (-f19) - f20;
                    if (f23 >= 0.0f) {
                        f16 = f23;
                    }
                    f10 = f16 > 1.0f ? 1.0f : f16;
                    if (Math.abs(f10 - f23) <= 1.05E-6f) {
                        f17 = f10;
                    }
                } else {
                    f17 = f22;
                }
            } else {
                double dSqrt2 = Math.sqrt(d18);
                float fR = (float) (((double) (b5.r((float) ((-d16) + dSqrt2)) - b5.r((float) (d16 + dSqrt2)))) - d19);
                if (fR >= 0.0f) {
                    f16 = fR;
                }
                f10 = f16 > 1.0f ? 1.0f : f16;
                if (Math.abs(f10 - fR) <= 1.05E-6f) {
                    f17 = f10;
                }
            }
        } else if (Math.abs(d5 - 0.0d) >= 1.0E-7d) {
            double dSqrt3 = Math.sqrt((d10 * d10) - ((4.0d * d5) * d3));
            double d21 = d5 * 2.0d;
            float f24 = (float) ((dSqrt3 - d10) / d21);
            float f25 = f24 < 0.0f ? 0.0f : f24;
            if (f25 > 1.0f) {
                f25 = 1.0f;
            }
            if (Math.abs(f25 - f24) > 1.05E-6f) {
                f25 = Float.NaN;
            }
            if (Float.isNaN(f25)) {
                float f26 = (float) (((-d10) - dSqrt3) / d21);
                if (f26 >= 0.0f) {
                    f16 = f26;
                }
                f10 = f16 > 1.0f ? 1.0f : f16;
                if (Math.abs(f10 - f26) <= 1.05E-6f) {
                    f17 = f10;
                }
            } else {
                f17 = f25;
            }
        } else if (Math.abs(d10 - 0.0d) >= 1.0E-7d) {
            float f27 = (float) ((-d3) / d10);
            if (f27 >= 0.0f) {
                f16 = f27;
            }
            f10 = f16 > 1.0f ? 1.0f : f16;
            if (Math.abs(f10 - f27) <= 1.05E-6f) {
                f17 = f10;
            }
        }
        boolean zIsNaN = Float.isNaN(f17);
        float f28 = this.D;
        float f29 = this.B;
        if (!zIsNaN) {
            float f30 = ((((((f29 - f28) + 0.33333334f) * f17) + (f28 - (2.0f * f29))) * f17) + f29) * 3.0f * f17;
            float f31 = this.E;
            if (f30 < f31) {
                f30 = f31;
            }
            float f32 = this.F;
            return f30 > f32 ? f32 : f30;
        }
        throw new IllegalArgumentException("The cubic curve with parameters (" + f12 + ", " + f29 + ", " + f14 + ", " + f28 + ") has no solution at " + f3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.A == rVar.A && this.B == rVar.B && this.C == rVar.C && this.D == rVar.D;
    }

    public final int hashCode() {
        return Float.hashCode(this.D) + w.c.c(this.C, w.c.c(this.B, Float.hashCode(this.A) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CubicBezierEasing(a=");
        sb2.append(this.A);
        sb2.append(", b=");
        sb2.append(this.B);
        sb2.append(", c=");
        sb2.append(this.C);
        sb2.append(", d=");
        return w.c.k(sb2, this.D, ')');
    }
}
