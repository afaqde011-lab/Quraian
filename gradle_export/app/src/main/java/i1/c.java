package i1;

public final class c {

    public static final c f7095k;

    public final float f7096a;

    public final float f7097b;

    public final float f7098c;

    public final float f7099d;

    public final float f7100e;

    public final float f7101f;

    public final float[] f7102g;

    public final float f7103h;

    public final float f7104i;

    public final float f7105j;

    static {
        float[] fArr = b.f7088c;
        float fPow = (float) (((Math.pow(0.5689655172413793d, 3.0d) * 100.0d) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.f7086a;
        float f3 = fArr[0];
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
        float f17 = ((double) 1.0f) >= 0.9d ? 0.69000006f : 0.6549999f;
        float fExp = (1.0f - (((float) Math.exp(((-fPow) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d3 = fExp;
        if (d3 > 1.0d) {
            fExp = 1.0f;
        } else if (d3 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f14) * fExp) + 1.0f) - fExp, (((100.0f / f15) * fExp) + 1.0f) - fExp, (((100.0f / f16) * fExp) + 1.0f) - fExp};
        float f18 = 1.0f / ((5.0f * fPow) + 1.0f);
        float f19 = f18 * f18 * f18 * f18;
        float f20 = 1.0f - f19;
        float fCbrt = (0.1f * f20 * f20 * ((float) Math.cbrt(((double) fPow) * 5.0d))) + (f19 * fPow);
        double d5 = 50.0f;
        float fPow2 = ((float) (d5 > 8.0d ? Math.pow((d5 + 16.0d) / 116.0d, 3.0d) * 100.0d : (d5 / 903.2962962962963d) * 100.0d)) / fArr[1];
        double d10 = fPow2;
        float fSqrt = ((float) Math.sqrt(d10)) + 1.48f;
        float fPow3 = 0.725f / ((float) Math.pow(d10, 0.2f));
        double d11 = 0.42f;
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * fCbrt) * f14) / 100.0f, d11), (float) Math.pow(((fArr6[1] * fCbrt) * f15) / 100.0f, d11), (float) Math.pow(((fArr6[2] * fCbrt) * f16) / 100.0f, d11)};
        float f21 = fArr7[0];
        float f22 = (f21 * 400.0f) / (f21 + 27.13f);
        float f23 = fArr7[1];
        float f24 = (f23 * 400.0f) / (f23 + 27.13f);
        float f25 = fArr7[2];
        float[] fArr8 = {f22, f24, (400.0f * f25) / (f25 + 27.13f)};
        f7095k = new c(fPow2, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * fPow3, fPow3, fPow3, f17, 1.0f, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25f), fSqrt);
    }

    public c(float f3, float f10, float f11, float f12, float f13, float f14, float[] fArr, float f15, float f16, float f17) {
        this.f7096a = f3;
        this.f7097b = f10;
        this.f7098c = f11;
        this.f7099d = f12;
        this.f7100e = f13;
        this.f7101f = f14;
        this.f7102g = fArr;
        this.f7103h = f15;
        this.f7104i = f16;
        this.f7105j = f17;
    }
}
