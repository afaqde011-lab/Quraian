package x;

import java.util.Arrays;

public final class q {

    public final float f16336a;

    public final float f16337b;

    public final float f16338c;

    public final float f16339d;

    public final float f16340e;

    public final float f16341f;

    public final float f16342g;

    public float f16343h;

    public float f16344i;

    public final float[] f16345j;

    public final float f16346k;
    public final float l;
    public final float m;

    public final float f16347n;

    public final float f16348o;

    public final boolean f16349p;

    public final float f16350q;

    public final float f16351r;

    public q(int i10, float f3, float f10, float f11, float f12, float f13, float f14) {
        boolean z10;
        int i11;
        float f15;
        float f16;
        this.f16336a = f3;
        this.f16337b = f10;
        this.f16338c = f11;
        this.f16339d = f12;
        this.f16340e = f13;
        this.f16341f = f14;
        float f17 = f13 - f11;
        float f18 = f14 - f12;
        float f19 = 0.0f;
        int i12 = 1;
        boolean z11 = i10 == 1 || (i10 == 4 ? f18 > 0.0f : !(i10 != 5 || f18 >= 0.0f));
        float f20 = z11 ? -1.0f : 1.0f;
        this.m = f20;
        float f21 = 1 / (f10 - f3);
        this.f16346k = f21;
        float[] fArr = new float[101];
        this.f16345j = fArr;
        boolean z12 = i10 == 3;
        if (z12 || Math.abs(f17) < 0.001f || Math.abs(f18) < 0.001f) {
            float fHypot = (float) Math.hypot(f18, f17);
            this.f16342g = fHypot;
            this.l = fHypot * f21;
            this.f16350q = f17 * f21;
            this.f16351r = f18 * f21;
            this.f16347n = Float.NaN;
            this.f16348o = Float.NaN;
            z10 = true;
        } else {
            this.f16347n = f17 * f20;
            this.f16348o = f18 * (-f20);
            this.f16350q = z11 ? f13 : f11;
            this.f16351r = z11 ? f12 : f14;
            float f22 = f13 - f11;
            float f23 = f12 - f14;
            float[] fArr2 = c.f16256i;
            int i13 = 90;
            float f24 = 90;
            float f25 = f23;
            float fHypot2 = 0.0f;
            float f26 = 0.0f;
            int i14 = 1;
            while (true) {
                i11 = i12;
                f15 = f19;
                double d3 = (float) (((((double) i14) * 90.0d) / ((double) i13)) * 0.017453292519943295d);
                float fSin = ((float) Math.sin(d3)) * f22;
                float fCos = ((float) Math.cos(d3)) * f23;
                float f27 = fSin - f26;
                f16 = f24;
                fHypot2 += (float) Math.hypot(f27, fCos - f25);
                fArr2[i14] = fHypot2;
                i13 = 90;
                if (i14 == 90) {
                    break;
                }
                i14++;
                f25 = fCos;
                f24 = f16;
                f19 = f15;
                f26 = fSin;
                i12 = i11;
            }
            this.f16342g = fHypot2;
            int i15 = i11;
            while (true) {
                fArr2[i15] = fArr2[i15] / fHypot2;
                if (i15 == 90) {
                    break;
                } else {
                    i15++;
                }
            }
            int length = fArr.length;
            for (int i16 = 0; i16 < length; i16++) {
                float f28 = i16 / 100.0f;
                int iBinarySearch = Arrays.binarySearch(fArr2, 0, 91, f28);
                if (iBinarySearch >= 0) {
                    fArr[i16] = iBinarySearch / f16;
                } else if (iBinarySearch == -1) {
                    fArr[i16] = f15;
                } else {
                    int i17 = -iBinarySearch;
                    int i18 = i17 - 2;
                    float f29 = i18;
                    float f30 = fArr2[i18];
                    fArr[i16] = (((f28 - f30) / (fArr2[i17 - 1] - f30)) + f29) / f16;
                }
            }
            this.l = this.f16342g * this.f16346k;
            z10 = z12;
        }
        this.f16349p = z10;
    }

    public final float a() {
        float f3 = this.f16347n * this.f16344i;
        return f3 * this.m * (this.l / ((float) Math.hypot(f3, (-this.f16348o) * this.f16343h)));
    }

    public final float b() {
        float f3 = this.f16347n * this.f16344i;
        float f10 = (-this.f16348o) * this.f16343h;
        return f10 * this.m * (this.l / ((float) Math.hypot(f3, f10)));
    }

    public final void c(float f3) {
        float f10 = (this.m == -1.0f ? this.f16337b - f3 : f3 - this.f16336a) * this.f16346k;
        float fB = 0.0f;
        if (f10 > 0.0f) {
            fB = 1.0f;
            if (f10 < 1.0f) {
                float f11 = f10 * 100;
                int i10 = (int) f11;
                float[] fArr = this.f16345j;
                float f12 = fArr[i10];
                fB = w.c.b(fArr[i10 + 1], f12, f11 - i10, f12);
            }
        }
        double d3 = fB * 1.5707964f;
        this.f16343h = (float) Math.sin(d3);
        this.f16344i = (float) Math.cos(d3);
    }
}
