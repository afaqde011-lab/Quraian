package j2;

import i2.b0;

public final class k extends c {

    public final int f7899d;

    public k(long j9, int i10, int i11, String str) {
        super(str, j9, i10);
        this.f7899d = i11;
    }

    @Override
    public final float a(int i10) {
        switch (this.f7899d) {
            case 0:
                return i10 == 0 ? 100.0f : 128.0f;
            default:
                return 2.0f;
        }
    }

    @Override
    public final float b(int i10) {
        switch (this.f7899d) {
            case 0:
                return i10 == 0 ? 0.0f : -128.0f;
            default:
                return -2.0f;
        }
    }

    @Override
    public final long d(float f3, float f10, float f11) {
        long jFloatToRawIntBits;
        long jFloatToRawIntBits2;
        switch (this.f7899d) {
            case 0:
                if (f3 < 0.0f) {
                    f3 = 0.0f;
                }
                if (f3 > 100.0f) {
                    f3 = 100.0f;
                }
                if (f10 < -128.0f) {
                    f10 = -128.0f;
                }
                if (f10 > 128.0f) {
                    f10 = 128.0f;
                }
                float f12 = (f3 + 16.0f) / 116.0f;
                float f13 = (f10 * 0.002f) + f12;
                float f14 = f13 > 0.20689656f ? f13 * f13 * f13 : (f13 - 0.13793103f) * 0.12841855f;
                float f15 = f12 > 0.20689656f ? f12 * f12 * f12 : (f12 - 0.13793103f) * 0.12841855f;
                float[] fArr = j.f7898e;
                float f16 = f14 * fArr[0];
                float f17 = f15 * fArr[1];
                long jFloatToRawIntBits3 = Float.floatToRawIntBits(f16);
                long jFloatToRawIntBits4 = Float.floatToRawIntBits(f17);
                jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
                jFloatToRawIntBits2 = 4294967295L & jFloatToRawIntBits4;
                break;
            default:
                if (f3 < -2.0f) {
                    f3 = -2.0f;
                }
                if (f3 > 2.0f) {
                    f3 = 2.0f;
                }
                if (f10 < -2.0f) {
                    f10 = -2.0f;
                }
                float f18 = f10 <= 2.0f ? f10 : 2.0f;
                jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f3)) << 32;
                jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f18)) & 4294967295L;
                break;
        }
        return jFloatToRawIntBits | jFloatToRawIntBits2;
    }

    @Override
    public final float e(float f3, float f10, float f11) {
        switch (this.f7899d) {
            case 0:
                if (f3 < 0.0f) {
                    f3 = 0.0f;
                }
                if (f3 > 100.0f) {
                    f3 = 100.0f;
                }
                if (f11 < -128.0f) {
                    f11 = -128.0f;
                }
                if (f11 > 128.0f) {
                    f11 = 128.0f;
                }
                float f12 = ((f3 + 16.0f) / 116.0f) - (f11 * 0.005f);
                return (f12 > 0.20689656f ? f12 * f12 * f12 : 0.12841855f * (f12 - 0.13793103f)) * j.f7898e[2];
            default:
                if (f11 < -2.0f) {
                    f11 = -2.0f;
                }
                if (f11 > 2.0f) {
                    return 2.0f;
                }
                return f11;
        }
    }

    @Override
    public final long f(float f3, float f10, float f11, float f12, c cVar) {
        switch (this.f7899d) {
            case 0:
                float[] fArr = j.f7898e;
                float f13 = f3 / fArr[0];
                float f14 = f10 / fArr[1];
                float f15 = f11 / fArr[2];
                float fCbrt = f13 > 0.008856452f ? (float) Math.cbrt(f13) : (f13 * 7.787037f) + 0.13793103f;
                float fCbrt2 = f14 > 0.008856452f ? (float) Math.cbrt(f14) : (f14 * 7.787037f) + 0.13793103f;
                float fCbrt3 = f15 > 0.008856452f ? (float) Math.cbrt(f15) : (f15 * 7.787037f) + 0.13793103f;
                float f16 = (116.0f * fCbrt2) - 16.0f;
                float f17 = (fCbrt - fCbrt2) * 500.0f;
                float f18 = (fCbrt2 - fCbrt3) * 200.0f;
                if (f16 < 0.0f) {
                    f16 = 0.0f;
                }
                if (f16 > 100.0f) {
                    f16 = 100.0f;
                }
                if (f17 < -128.0f) {
                    f17 = -128.0f;
                }
                if (f17 > 128.0f) {
                    f17 = 128.0f;
                }
                if (f18 < -128.0f) {
                    f18 = -128.0f;
                }
                return b0.b(f16, f17, f18 <= 128.0f ? f18 : 128.0f, f12, cVar);
            default:
                if (f3 < -2.0f) {
                    f3 = -2.0f;
                }
                if (f3 > 2.0f) {
                    f3 = 2.0f;
                }
                if (f10 < -2.0f) {
                    f10 = -2.0f;
                }
                if (f10 > 2.0f) {
                    f10 = 2.0f;
                }
                if (f11 < -2.0f) {
                    f11 = -2.0f;
                }
                return b0.b(f3, f10, f11 <= 2.0f ? f11 : 2.0f, f12, cVar);
        }
    }
}
