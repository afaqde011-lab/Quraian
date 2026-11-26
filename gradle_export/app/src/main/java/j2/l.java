package j2;

import com.google.android.gms.internal.measurement.b5;
import i2.b0;

public final class l extends c {

    public static final float[] f7900d;

    public static final float[] f7901e;

    public static final float[] f7902f;

    public static final float[] f7903g;

    static {
        float[] fArrG = j.g(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, j.c(a.f7853b.f7854a, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f7900d = fArrG;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f7901e = fArr;
        f7902f = j.f(fArrG);
        f7903g = j.f(fArr);
    }

    @Override
    public final float a(int i10) {
        return i10 == 0 ? 1.0f : 0.5f;
    }

    @Override
    public final float b(int i10) {
        return i10 == 0 ? 0.0f : -0.5f;
    }

    @Override
    public final long d(float f3, float f10, float f11) {
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (f10 < -0.5f) {
            f10 = -0.5f;
        }
        if (f10 > 0.5f) {
            f10 = 0.5f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        float f12 = f11 <= 0.5f ? f11 : 0.5f;
        float[] fArr = f7903g;
        float f13 = (fArr[6] * f12) + (fArr[3] * f10) + (fArr[0] * f3);
        float f14 = (fArr[7] * f12) + (fArr[4] * f10) + (fArr[1] * f3);
        float f15 = (fArr[8] * f12) + (fArr[5] * f10) + (fArr[2] * f3);
        float f16 = f13 * f13 * f13;
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float[] fArr2 = f7902f;
        return (((long) Float.floatToRawIntBits((fArr2[6] * f18) + ((fArr2[3] * f17) + (fArr2[0] * f16)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((fArr2[7] * f18) + (fArr2[4] * f17) + (fArr2[1] * f16))));
    }

    @Override
    public final float e(float f3, float f10, float f11) {
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (f10 < -0.5f) {
            f10 = -0.5f;
        }
        if (f10 > 0.5f) {
            f10 = 0.5f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        float f12 = f11 <= 0.5f ? f11 : 0.5f;
        float[] fArr = f7903g;
        float f13 = (fArr[6] * f12) + (fArr[3] * f10) + (fArr[0] * f3);
        float f14 = (fArr[7] * f12) + (fArr[4] * f10) + (fArr[1] * f3);
        float f15 = (fArr[8] * f12) + (fArr[5] * f10) + (fArr[2] * f3);
        float f16 = f13 * f13 * f13;
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float[] fArr2 = f7902f;
        return (fArr2[8] * f18) + (fArr2[5] * f17) + (fArr2[2] * f16);
    }

    @Override
    public final long f(float f3, float f10, float f11, float f12, c cVar) {
        float[] fArr = f7900d;
        float f13 = (fArr[6] * f11) + (fArr[3] * f10) + (fArr[0] * f3);
        float f14 = (fArr[7] * f11) + (fArr[4] * f10) + (fArr[1] * f3);
        float f15 = (fArr[8] * f11) + (fArr[5] * f10) + (fArr[2] * f3);
        float fR = b5.r(f13);
        float fR2 = b5.r(f14);
        float fR3 = b5.r(f15);
        float[] fArr2 = f7901e;
        return b0.b((fArr2[6] * fR3) + (fArr2[3] * fR2) + (fArr2[0] * fR), (fArr2[7] * fR3) + (fArr2[4] * fR2) + (fArr2[1] * fR), (fArr2[8] * fR3) + (fArr2[5] * fR2) + (fArr2[2] * fR), f12, cVar);
    }
}
