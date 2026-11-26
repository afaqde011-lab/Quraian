package w;

public abstract class e {

    public static final float[] f15753a;

    static {
        float f3;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float[] fArr = new float[101];
        f15753a = fArr;
        float[] fArr2 = new float[101];
        float f18 = 0.0f;
        int i10 = 0;
        float f19 = 0.0f;
        while (true) {
            float f20 = 1.0f;
            if (i10 >= 100) {
                fArr2[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
            float f21 = i10 / 100;
            float f22 = 1.0f;
            while (true) {
                f3 = ((f22 - f18) / 2.0f) + f18;
                f10 = f20 - f3;
                f11 = f3 * 3.0f * f10;
                f12 = f3 * f3 * f3;
                float f23 = (((f3 * 0.35000002f) + (f10 * 0.175f)) * f11) + f12;
                f13 = f20;
                if (Math.abs(f23 - f21) < 1.0E-5d) {
                    break;
                }
                if (f23 > f21) {
                    f22 = f3;
                } else {
                    f18 = f3;
                }
                f20 = f13;
            }
            float f24 = 0.5f;
            fArr[i10] = (((f10 * 0.5f) + f3) * f11) + f12;
            float f25 = f13;
            while (true) {
                f14 = ((f25 - f19) / 2.0f) + f19;
                f15 = f13 - f14;
                f16 = f14 * 3.0f * f15;
                f17 = f14 * f14 * f14;
                float f26 = (((f15 * f24) + f14) * f16) + f17;
                float f27 = f25;
                if (Math.abs(f26 - f21) >= 1.0E-5d) {
                    if (f26 > f21) {
                        f25 = f14;
                    } else {
                        f19 = f14;
                        f25 = f27;
                    }
                    f24 = 0.5f;
                }
            }
            fArr2[i10] = (((f14 * 0.35000002f) + (f15 * 0.175f)) * f16) + f17;
            i10++;
        }
    }

    public static d a(float f3) {
        float f10 = 0.0f;
        float f11 = 1.0f;
        float fX = ab.a0.x(f3, 0.0f, 1.0f);
        float f12 = 100;
        int i10 = (int) (f12 * fX);
        if (i10 < 100) {
            float f13 = i10 / f12;
            int i11 = i10 + 1;
            float f14 = i11 / f12;
            float[] fArr = f15753a;
            float f15 = fArr[i10];
            float f16 = (fArr[i11] - f15) / (f14 - f13);
            float fB = c.b(fX, f13, f16, f15);
            f10 = f16;
            f11 = fB;
        }
        return new d(f11, f10);
    }
}
