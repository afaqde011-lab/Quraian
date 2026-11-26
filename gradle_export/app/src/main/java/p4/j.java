package p4;

public final class j {

    public static final j f12338k;

    public final float f12339a;

    public final float f12340b;

    public final float f12341c;

    public final float f12342d;

    public final float f12343e;

    public final float f12344f;

    public final float[] f12345g;

    public final float f12346h;

    public final float f12347i;

    public final float f12348j;

    static {
        float fM = (float) ((((double) a.m()) * 63.66197723675813d) / 100.0d);
        float[] fArr = a.f12317c;
        float f3 = fArr[0];
        float[][] fArr2 = a.f12315a;
        float[] fArr3 = fArr2[0];
        float f10 = fArr3[0] * f3;
        float f11 = fArr[1];
        float f12 = (fArr3[1] * f11) + f10;
        float f13 = fArr[2];
        float f14 = (fArr3[2] * f13) + f12;
        float[] fArr4 = fArr2[1];
        float f15 = (fArr4[2] * f13) + (fArr4[1] * f11) + (fArr4[0] * f3);
        float[] fArr5 = fArr2[2];
        float f16 = (f13 * fArr5[2]) + (f11 * fArr5[1]) + (f3 * fArr5[0]);
        float f17 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float fExp = (1.0f - (((float) Math.exp(((-fM) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d3 = fExp;
        if (d3 > 1.0d) {
            fExp = 1.0f;
        } else if (d3 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f14) * fExp) + 1.0f) - fExp, (((100.0f / f15) * fExp) + 1.0f) - fExp, (((100.0f / f16) * fExp) + 1.0f) - fExp};
        float f18 = 1.0f / ((5.0f * fM) + 1.0f);
        float f19 = f18 * f18 * f18 * f18;
        float f20 = 1.0f - f19;
        float fCbrt = (0.1f * f20 * f20 * ((float) Math.cbrt(((double) fM) * 5.0d))) + (f19 * fM);
        float fM2 = a.m() / fArr[1];
        double d5 = fM2;
        float fSqrt = ((float) Math.sqrt(d5)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d5, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f14)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f15)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f16)) / 100.0d, 0.42d)};
        float f21 = fArr7[0];
        float f22 = (f21 * 400.0f) / (f21 + 27.13f);
        float f23 = fArr7[1];
        float f24 = (f23 * 400.0f) / (f23 + 27.13f);
        float f25 = fArr7[2];
        float[] fArr8 = {f22, f24, (400.0f * f25) / (f25 + 27.13f)};
        f12338k = new j(fM2, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * fPow, fPow, fPow, f17, 1.0f, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public j(float f3, float f10, float f11, float f12, float f13, float f14, float[] fArr, float f15, float f16, float f17) {
        this.f12344f = f3;
        this.f12339a = f10;
        this.f12340b = f11;
        this.f12341c = f12;
        this.f12342d = f13;
        this.f12343e = f14;
        this.f12345g = fArr;
        this.f12346h = f15;
        this.f12347i = f16;
        this.f12348j = f17;
    }
}
